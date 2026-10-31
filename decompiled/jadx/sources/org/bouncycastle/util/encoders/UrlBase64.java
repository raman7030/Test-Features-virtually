package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import l.C19370;

/* JADX INFO: loaded from: classes2.dex */
public class UrlBase64 {
    public static final Encoder encoder = new UrlBase64Encoder();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static int decode(byte[] bArr, OutputStream outputStream) {
        return encoder.decode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(C19370.m44629(e, new StringBuilder("exception decoding URL safe base64 string: ")), e);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(C19370.m44629(e, new StringBuilder("exception decoding URL safe base64 string: ")), e);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException(C19370.m44629(e, new StringBuilder("exception encoding URL safe base64 data: ")), e);
        }
    }
}
