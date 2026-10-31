package l;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0061 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final float[] f959 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18407 f960;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f961;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0913 f962;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f963;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f964;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f965 = new boolean[4];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f966;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f967;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f968;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5707 f969;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19113 f970;

    public C0061(C0913 c0913) {
        this.f962 = c0913;
        C18407 c18407 = new C18407();
        c18407.f57148 = new byte[128];
        this.f960 = c18407;
        this.f967 = -9223372036854775807L;
        this.f969 = new C5707(178);
        this.f963 = new C17714();
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1000() {
        C16509.m38887(this.f965);
        this.f960.m42832();
        C19113 c19113 = this.f970;
        if (c19113 != null) {
            c19113.m44060();
        }
        C5707 c5707 = this.f969;
        if (c5707 != null) {
            c5707.m16117();
        }
        this.f961 = 0L;
        this.f967 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f964 = c19259.m44444();
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 2);
        this.f968 = interfaceC19383Mo3429;
        this.f970 = new C19113(interfaceC19383Mo3429);
        this.f962.m3268(interfaceC21830, c19259);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1001(int i, long j) {
        this.f967 = j;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1002(C17714 c17714) {
        C18407 c18407;
        C5707 c5707;
        int i;
        float f;
        C22632.m50632(this.f970);
        C22632.m50632(this.f968);
        int iM41485 = c17714.m41485();
        int iM41483 = c17714.m41483();
        byte[] bArrM41482 = c17714.m41482();
        this.f961 += (long) c17714.m41457();
        this.f968.mo8453(c17714.m41457(), c17714);
        while (true) {
            int iM38879 = C16509.m38879(iM41485, iM41483, bArrM41482, this.f965);
            c18407 = this.f960;
            c5707 = this.f969;
            if (iM38879 == iM41483) {
                break;
            }
            int i2 = iM38879 + 3;
            int i3 = c17714.m41482()[i2] & 255;
            int i4 = iM38879 - iM41485;
            if (!this.f966) {
                if (i4 > 0) {
                    c18407.m42833(iM41485, iM38879, bArrM41482);
                }
                if (c18407.m42834(i3, i4 < 0 ? -i4 : 0)) {
                    InterfaceC19383 interfaceC19383 = this.f968;
                    int i5 = c18407.f57151;
                    String str = this.f964;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c18407.f57148, c18407.f57150);
                    C16302 c16302 = new C16302(bArrCopyOf, bArrCopyOf.length);
                    c16302.m38347(i5);
                    c16302.m38347(4);
                    c16302.m38346();
                    c16302.m38351(8);
                    if (c16302.m38352()) {
                        c16302.m38351(4);
                        c16302.m38351(3);
                    }
                    int iM38343 = c16302.m38343(4);
                    if (iM38343 == 15) {
                        int iM38344 = c16302.m38343(8);
                        int iM38345 = c16302.m38343(8);
                        if (iM38345 == 0) {
                            C19956.m46037("Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iM38344 / iM38345;
                        }
                    } else if (iM38343 < 7) {
                        f = f959[iM38343];
                    } else {
                        C19956.m46037("Invalid aspect ratio");
                        f = 1.0f;
                    }
                    int i6 = 2;
                    if (c16302.m38352()) {
                        c16302.m38351(2);
                        c16302.m38351(1);
                        if (c16302.m38352()) {
                            c16302.m38351(15);
                            c16302.m38346();
                            c16302.m38351(15);
                            c16302.m38346();
                            c16302.m38351(15);
                            c16302.m38346();
                            c16302.m38351(3);
                            c16302.m38351(11);
                            c16302.m38346();
                            c16302.m38351(15);
                            c16302.m38346();
                            i6 = 2;
                        }
                    }
                    if (c16302.m38343(i6) != 0) {
                        C19956.m46037("Unhandled video object layer shape");
                    }
                    c16302.m38346();
                    int iM38346 = c16302.m38343(16);
                    c16302.m38346();
                    if (c16302.m38352()) {
                        if (iM38346 == 0) {
                            C19956.m46037("Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = iM38346 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            c16302.m38351(i7);
                        }
                    }
                    c16302.m38346();
                    int iM38347 = c16302.m38343(13);
                    c16302.m38346();
                    int iM38348 = c16302.m38343(13);
                    c16302.m38346();
                    c16302.m38346();
                    C1297 c1297 = new C1297();
                    c1297.m4469(str);
                    c1297.m4462("video/mp2t");
                    c1297.m4465("video/mp4v-es");
                    c1297.m4453(iM38347);
                    c1297.m4457(iM38348);
                    c1297.m4460(f);
                    c1297.m4446(Collections.singletonList(bArrCopyOf));
                    interfaceC19383.mo8456(c1297.m4440());
                    this.f966 = true;
                }
            }
            this.f970.m44061(iM41485, iM38879, bArrM41482);
            if (c5707 != null) {
                if (i4 > 0) {
                    c5707.m16114(iM41485, iM38879, bArrM41482);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (c5707.m16116(i)) {
                    int iM38880 = C16509.m38880(c5707.f17588, c5707.f17586);
                    String str2 = C3603.f11424;
                    byte[] bArr = c5707.f17586;
                    C17714 c17715 = this.f963;
                    c17715.m41462(iM38880, bArr);
                    this.f962.m3267(this.f967, c17715);
                }
                if (i3 == 178 && c17714.m41482()[iM38879 + 2] == 1) {
                    c5707.m16118(i3);
                }
            }
            int i9 = iM41483 - iM38879;
            this.f970.m44063(this.f961 - ((long) i9), i9, this.f966);
            this.f970.m44062(i3, this.f967);
            iM41485 = i2;
        }
        if (!this.f966) {
            c18407.m42833(iM41485, iM41483, bArrM41482);
        }
        this.f970.m44061(iM41485, iM41483, bArrM41482);
        if (c5707 != null) {
            c5707.m16114(iM41485, iM41483, bArrM41482);
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1004(boolean z) {
        C22632.m50632(this.f970);
        if (z) {
            this.f970.m44063(this.f961, 0, this.f966);
            this.f970.m44060();
        }
    }
}
