package com.phei.netty.frame.correct.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

/**
 * Created by jgsoft on 2018/7/3.
 */
public class ChildServerChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel arg0) throws Exception {
        arg0.pipeline().addLast(new LineBasedFrameDecoder(1024));
        arg0.pipeline().addLast(new StringDecoder());
        arg0.pipeline().addLast(new TimeServerHandler());
    }

}