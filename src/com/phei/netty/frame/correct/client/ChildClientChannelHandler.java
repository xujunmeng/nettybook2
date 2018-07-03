package com.phei.netty.frame.correct.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

/**
 * Created by jgsoft on 2018/7/3.
 */
public class ChildClientChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    public void initChannel(SocketChannel ch)
            throws Exception {
        ch.pipeline().addLast(
                new LineBasedFrameDecoder(1024));
        ch.pipeline().addLast(new StringDecoder());
        ch.pipeline().addLast(new TimeClientHandler());
    }

}
