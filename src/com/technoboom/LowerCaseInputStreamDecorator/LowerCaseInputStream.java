package com.technoboom.LowerCaseInputStreamDecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 6:38 PM
 * Project: patterns-learn
 * Package: com.technoboom.LowerCaseInputStreamDecorator
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < len; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
