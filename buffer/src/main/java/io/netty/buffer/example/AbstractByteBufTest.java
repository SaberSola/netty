package io.netty.buffer.example;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledDirectByteBuf;

import java.nio.ByteBuffer;

import static io.netty.util.internal.EmptyArrays.EMPTY_BYTES;

/**
 * @Author zl
 * @Date 2019-11-30
 * @Des ${todo}
 */
public class AbstractByteBufTest {


    public static void main(String[] args) {
        ByteBuf byteBuf = ByteBufAllocator.DEFAULT.directBuffer();
        byteBuf.writerIndex(0);
        byteBuf.readerIndex(0);
        byteBuf.writeBytes("zhanglei".getBytes());
    }
}
