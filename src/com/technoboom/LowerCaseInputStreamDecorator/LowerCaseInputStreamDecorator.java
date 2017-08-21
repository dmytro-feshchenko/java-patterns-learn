package com.technoboom.LowerCaseInputStreamDecorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 6:37 PM
 * Project: patterns-learn
 * Package: com.technoboom
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class LowerCaseInputStreamDecorator {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new FileInputStream("src/com/technoboom/LowerCaseInputStreamDecorator/test.txt"));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
