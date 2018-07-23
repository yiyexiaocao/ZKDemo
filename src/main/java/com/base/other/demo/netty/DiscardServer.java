package com.base.other.demo.netty;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Discarder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @DESC 描述
 * @Author by rrrr on 2018/7/23.
 * @Date 2018/7/23 17:41
 */
public class DiscardServer {

    private  int port;

    public DiscardServer(int port) {
        super();
        this.port = port;
    }

    public void  run() throws InterruptedException {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        System.out.println("准备运行 端口："+port);

        try {
            ServerBootstrap b = new ServerBootstrap();
            b = b.group(bossGroup,workerGroup);
            b = b.channel(NioServerSocketChannel.class);

            b = b.childHandler(new ChannelInitializer<SocketChannel>() {
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new DiscardServerHandler());
                }
            });

            b = b.option(ChannelOption.SO_BACKLOG,128);
            b = b.childOption(ChannelOption.SO_KEEPALIVE,true);

            ChannelFuture f = b.bind(port).sync();
            f.channel().closeFuture().sync();
        }finally {

            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int port;
        if(args.length>0){
            port = Integer.parseInt(args[0]);
        }else{
            port = 8080;
        }
        new DiscardServer(port).run();
        System.out.println("server:run()");
    }
}
