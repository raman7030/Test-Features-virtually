package l;

import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۛ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08IU */
/* JADX INFO: loaded from: classes2.dex */
public final class C6307 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19527;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f19528;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10541 f19529;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f19530;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f19531;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23896 f19532;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f19533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f19534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f19535;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f19536;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f19537;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f19538;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17433(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m17434(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public C6307(byte[] bArr, int i) {
        C16302 c16302 = new C16302(bArr, bArr.length);
        c16302.m38354(i * 8);
        this.f19538 = c16302.m38343(16);
        this.f19536 = c16302.m38343(16);
        this.f19528 = c16302.m38343(24);
        this.f19535 = c16302.m38343(24);
        int iM38343 = c16302.m38343(20);
        this.f19537 = iM38343;
        this.f19530 = m17434(iM38343);
        this.f19534 = c16302.m38343(3) + 1;
        int iM38344 = c16302.m38343(5) + 1;
        this.f19527 = iM38344;
        this.f19531 = m17433(iM38344);
        this.f19533 = c16302.m38349(36);
        this.f19529 = null;
        this.f19532 = null;
    }

    public C6307(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C10541 c10541, C23896 c23896) {
        this.f19538 = i;
        this.f19536 = i2;
        this.f19528 = i3;
        this.f19535 = i4;
        this.f19537 = i5;
        this.f19530 = m17434(i5);
        this.f19534 = i6;
        this.f19527 = i7;
        this.f19531 = m17433(i7);
        this.f19533 = j;
        this.f19529 = c10541;
        this.f19532 = c23896;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m17435() {
        long j = this.f19533;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f19537);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m17438(byte[] bArr, C23896 c23896) {
        bArr[4] = GCMSIVBlockCipher.MASK;
        int i = this.f19535;
        if (i <= 0) {
            i = -1;
        }
        C23896 c23897 = this.f19532;
        if (c23897 != null) {
            c23896 = c23897.m52642(c23896);
        }
        C1297 c1297 = new C1297();
        c1297.m4465("audio/flac");
        c1297.m4451(i);
        c1297.m4472(this.f19534);
        c1297.m4456(this.f19537);
        String str = C3603.f11424;
        c1297.m4475(C3603.m11003(this.f19527, ByteOrder.LITTLE_ENDIAN));
        c1297.m4446(Collections.singletonList(bArr));
        c1297.m4449(c23896);
        return c1297.m4440();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6307 m17437(C10541 c10541) {
        return new C6307(this.f19538, this.f19536, this.f19528, this.f19535, this.f19537, this.f19534, this.f19527, this.f19533, c10541, this.f19532);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6307 m17439(List list) {
        C23896 c23896M48667 = C21499.m48667(list);
        C23896 c23896 = this.f19532;
        if (c23896 != null) {
            c23896M48667 = c23896.m52642(c23896M48667);
        }
        C23896 c23897 = c23896M48667;
        return new C6307(this.f19538, this.f19536, this.f19528, this.f19535, this.f19537, this.f19534, this.f19527, this.f19533, this.f19529, c23897);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6307 m17436(List list) {
        C23896 c23896 = new C23896(list);
        C23896 c23897 = this.f19532;
        if (c23897 != null) {
            c23896 = c23897.m52642(c23896);
        }
        C23896 c23898 = c23896;
        return new C6307(this.f19538, this.f19536, this.f19528, this.f19535, this.f19537, this.f19534, this.f19527, this.f19533, this.f19529, c23898);
    }
}
