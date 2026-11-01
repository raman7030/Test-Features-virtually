package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۘܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6257 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC2903 m14195(InterfaceC2903 interfaceC2903) {
        int size = (int) (interfaceC2903.size() % ((long) 4096));
        if (size == 0) {
            return interfaceC2903;
        }
        int i = 4096 - size;
        return new C17655(interfaceC2903, new C10951(new byte[i], 0, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14197(InterfaceC2903 interfaceC2903, MessageDigest messageDigest, long j) {
        interfaceC2903.mo4682(new C20339(messageDigest), j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14198(InterfaceC2903 interfaceC2903, C24618 c24618, long j) {
        interfaceC2903.mo4682(new C21010(c24618), j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10951 m14196(C3574 c3574) throws IOException {
        long jMo4684 = c3574.mo4684();
        if (jMo4684 > 2147483647L) {
            throw new IOException("Data too large");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo4684);
        c3574.mo4682(byteArrayOutputStream, jMo4684);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C10951(byteArray, 0, byteArray.length);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC2903 m14199(C3574 c3574) {
        long jMo4684 = c3574.mo4684();
        if (jMo4684 > 52428800) {
            return c3574;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo4684);
        c3574.mo4682(byteArrayOutputStream, jMo4684);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C10951(byteArray, 0, byteArray.length);
    }
}
