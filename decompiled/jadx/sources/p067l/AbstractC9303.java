package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9303 {

    /* JADX INFO: renamed from: ֫ */
    public int f25290;

    /* JADX INFO: renamed from: ۧ */
    public int f25291 = 100;

    /* JADX INFO: renamed from: ܽ */
    public int f25292 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩳ */
    public C4333 f25293;

    /* JADX INFO: renamed from: ֫ */
    public static long m21514(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m21517(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: ֡ */
    public abstract int mo21518();

    /* JADX INFO: renamed from: ֨ */
    public abstract String mo21519();

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC10467 mo21520(InterfaceC13820 interfaceC13820, C19283 c19283);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21522(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21523(int i, InterfaceC11138 interfaceC11138, C19283 c19283);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21524(InterfaceC11138 interfaceC11138, C19283 c19283);

    /* JADX INFO: renamed from: ۖ */
    public abstract long mo21525();

    /* JADX INFO: renamed from: ۘ */
    public abstract int mo21526();

    /* JADX INFO: renamed from: ۚ */
    public abstract long mo21527();

    /* JADX INFO: renamed from: ۜ */
    public abstract int mo21528();

    /* JADX INFO: renamed from: ۠ */
    public abstract String mo21529();

    /* JADX INFO: renamed from: ۡ */
    public abstract float mo21530();

    /* JADX INFO: renamed from: ۢ */
    public abstract long mo21531();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo21532();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo21533(int i);

    /* JADX INFO: renamed from: ܳ */
    public abstract AbstractC7962 mo21534();

    /* JADX INFO: renamed from: ܶ */
    public abstract int mo21535();

    /* JADX INFO: renamed from: ܺ */
    public abstract int mo21536();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo21537();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo21538(int i);

    /* JADX INFO: renamed from: ܿ */
    public abstract boolean mo21539();

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo21540();

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo21541(int i);

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo21542();

    /* JADX INFO: renamed from: ᩵ */
    public abstract long mo21543();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo21544();

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo21545();

    /* JADX INFO: renamed from: ᩹ */
    public abstract long mo21546();

    /* JADX INFO: renamed from: ᩻ */
    public abstract double mo21547();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC9303 m21515(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = C15671.f44805;
            return m21516(false, 0, bArr.length, bArr);
        }
        return new C24055(inputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC9303 m21516(boolean z, int i, int i2, byte[] bArr) {
        C13327 c13327 = new C13327(z, i, i2, bArr);
        try {
            c13327.mo21538(i2);
            return c13327;
        } catch (C4293 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21521() throws C4293 {
        if (this.f25290 >= this.f25291) {
            throw new C4293("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public AbstractC9303(int i) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m21513(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw C4293.m8710();
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
                throw C4293.m8710();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw C4293.m8706();
    }
}
