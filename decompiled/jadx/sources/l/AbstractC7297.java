package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7297 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f22399;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22400 = 100;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22401 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2067 f22402;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m19546(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m19549(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public abstract int mo19550();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public abstract String mo19551();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC8522 mo19552(InterfaceC12050 interfaceC12050, C17798 c17798);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19554(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19555(int i, InterfaceC9228 interfaceC9228, C17798 c17798);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19556(InterfaceC9228 interfaceC9228, C17798 c17798);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract long mo19557();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public abstract int mo19558();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract long mo19559();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract int mo19560();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public abstract String mo19561();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public abstract float mo19562();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public abstract long mo19563();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo19564();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo19565(int i);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5886 mo19566();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract int mo19567();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public abstract int mo19568();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo19569();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract int mo19570(int i);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19571();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19572();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19573(int i);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract int mo19574();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public abstract long mo19575();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo19576();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract int mo19577();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract long mo19578();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract double mo19579();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC7297 m19547(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = C13997.f41722;
            return m19548(false, 0, bArr.length, bArr);
        }
        return new C22819(inputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC7297 m19548(boolean z, int i, int i2, byte[] bArr) {
        C11531 c11531 = new C11531(z, i, i2, bArr);
        try {
            c11531.mo19570(i2);
            return c11531;
        } catch (C2025 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19553() throws C2025 {
        if (this.f22399 >= this.f22400) {
            throw new C2025("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public AbstractC7297(int i) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19545(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw C2025.m6584();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw C2025.m6584();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw C2025.m6580();
    }
}
