package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import l.C19370;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    public static final Encoder encoder = new Base64Encoder();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static int decode(byte[] bArr, int i, int i2, OutputStream outputStream) {
        try {
            return encoder.decode(bArr, i, i2, outputStream);
        } catch (Exception e) {
            throw new DecoderException(C19370.m44629(e, new StringBuilder("unable to decode base64 data: ")), e);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(C19370.m44629(e, new StringBuilder("unable to decode base64 string: ")), e);
        }
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length);
    }

    public static byte[] decode(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((i2 / 4) * 3);
        try {
            encoder.decode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(C19370.m44629(e, new StringBuilder("unable to decode base64 data: ")), e);
        }
    }

    public static int encode(byte[] bArr, int i, int i2, OutputStream outputStream) {
        return encoder.encode(bArr, i, i2, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static byte[] encode(byte[] bArr, int i, int i2) {
        Encoder encoder2 = encoder;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(encoder2.getEncodedLength(i2));
        try {
            encoder2.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException(C19370.m44629(e, new StringBuilder("exception encoding base64 string: ")), e);
        }
    }

    public static String toBase64String(byte[] bArr) {
        return toBase64String(bArr, 0, bArr.length);
    }

    public static String toBase64String(byte[] bArr, int i, int i2) {
        return Strings.fromByteArray(encode(bArr, i, i2));
    }
}
