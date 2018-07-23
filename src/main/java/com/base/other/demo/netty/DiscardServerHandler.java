package com.base.other.demo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

/**
 * @DESC 描述
 * @Author by rrrr on 2018/7/23.
 * @Date 2018/7/23 17:33
 */
public class DiscardServerHandler  extends ChannelHandlerAdapter {

    public void  channelRead(ChannelHandlerContext ctx,Object msg){
        try {
            ByteBuf in = (ByteBuf) msg;
            System.out.println(in.toString(CharsetUtil.UTF_8));
        }finally {

            ReferenceCountUtil.release(msg);

        }
    }

    public  void  exceptionCaught(ChannelHandlerContext ctx,Throwable cause){
        cause.printStackTrace();
        ctx.close();
    }
}
