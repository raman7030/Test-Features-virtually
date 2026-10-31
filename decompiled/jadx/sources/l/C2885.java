package l;

import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۗ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8M7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2885 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9194;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f9195;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f9197;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f9202;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f9203;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f9204;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f9205;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f9207;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9208;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9192 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f9201 = new C17714(new byte[15], 2);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16302 f9211 = new C16302();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f9206 = new C17714();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12762 f9212 = new C12762();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f9209 = SecP160R1Field.PInv;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f9210 = -1;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f9200 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f9196 = true;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9198 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f9193 = -9.223372036854776E18d;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public double f9199 = -9.223372036854776E18d;

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f9192 = 0;
        this.f9197 = 0;
        this.f9201.m41481(2);
        this.f9195 = 0;
        this.f9203 = 0;
        this.f9209 = SecP160R1Field.PInv;
        this.f9210 = -1;
        this.f9204 = 0;
        this.f9200 = -1L;
        this.f9194 = false;
        this.f9202 = false;
        this.f9198 = true;
        this.f9196 = true;
        this.f9193 = -9.223372036854776E18d;
        this.f9199 = -9.223372036854776E18d;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f9207 = c19259.m44444();
        this.f9205 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f9208 = i;
        if (!this.f9196 && (this.f9203 != 0 || !this.f9198)) {
            this.f9202 = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f9202) {
                this.f9199 = j;
            } else {
                this.f9193 = j;
            }
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) throws C9080 {
        int i;
        C22632.m50632(this.f9205);
        while (c17714.m41457() > 0) {
            int i2 = this.f9192;
            int iM38343 = 0;
            if (i2 == 0) {
                int i3 = this.f9208;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (c17714.m41457() > 0) {
                            int i4 = this.f9197 << 8;
                            this.f9197 = i4;
                            int iM41456 = i4 | c17714.m41456();
                            this.f9197 = iM41456;
                            if ((iM41456 & 16777215) == 12583333) {
                                c17714.m41484(c17714.m41485() - 3);
                                this.f9197 = 0;
                            }
                        }
                    }
                    this.f9192 = 1;
                    break;
                }
                c17714.m41484(c17714.m41483());
            } else {
                C17714 c17715 = this.f9206;
                C12762 c12762 = this.f9212;
                if (i2 == 1) {
                    C17714 c17716 = this.f9201;
                    m8819(c17714, c17716, false);
                    if (c17716.m41457() != 0) {
                        this.f9198 = false;
                    } else {
                        int iM41483 = c17716.m41483();
                        byte[] bArrM41482 = c17716.m41482();
                        C16302 c16302 = this.f9211;
                        c16302.m38350(iM41483, bArrM41482);
                        boolean zM25058 = C9941.m25058(c16302, c12762);
                        if (zM25058) {
                            this.f9195 = 0;
                            this.f9203 = c12762.f38358 + iM41483 + this.f9203;
                        }
                        if (zM25058) {
                            c17716.m41484(0);
                            this.f9205.mo8453(c17716.m41483(), c17716);
                            c17716.m41481(2);
                            c17715.m41481(c12762.f38358);
                            this.f9198 = true;
                            this.f9192 = 2;
                        } else if (c17716.m41483() < 15) {
                            c17716.m41486(c17716.m41483() + 1);
                            this.f9198 = false;
                        }
                    }
                } else if (i2 == 2) {
                    int i5 = c12762.f38359;
                    if (i5 == 1 || i5 == 17) {
                        m8819(c17714, c17715, true);
                    }
                    int iMin = Math.min(c17714.m41457(), c12762.f38358 - this.f9195);
                    this.f9205.mo8453(iMin, c17714);
                    int i6 = this.f9195 + iMin;
                    this.f9195 = i6;
                    if (i6 == c12762.f38358) {
                        int i7 = c12762.f38359;
                        if (i7 == 1) {
                            byte[] bArrM41483 = c17715.m41482();
                            C12057 c12057M25057 = C9941.m25057(new C16302(bArrM41483, bArrM41483.length));
                            this.f9209 = c12057M25057.f36064;
                            this.f9210 = c12057M25057.f36065;
                            long j = this.f9200;
                            long j2 = c12762.f38357;
                            if (j != j2) {
                                this.f9200 = j2;
                                int i8 = c12057M25057.f36063;
                                String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                                byte[] bArr = c12057M25057.f36062;
                                AbstractC14545 abstractC14545Of = (bArr == null || bArr.length <= 0) ? null : AbstractC14545.of((Object) C3603.f11423, (Object) bArr);
                                C1297 c1297 = new C1297();
                                c1297.m4469(this.f9207);
                                c1297.m4462("video/mp2t");
                                c1297.m4465("audio/mhm1");
                                c1297.m4456(this.f9209);
                                c1297.m4445(strConcat);
                                c1297.m4446((List) abstractC14545Of);
                                this.f9205.mo8456(c1297.m4440());
                            }
                            this.f9194 = true;
                        } else if (i7 == 17) {
                            byte[] bArrM41484 = c17715.m41482();
                            C16302 c16303 = new C16302(bArrM41484, bArrM41484.length);
                            if (c16303.m38352()) {
                                c16303.m38351(2);
                                iM38343 = c16303.m38343(13);
                            }
                            this.f9204 = iM38343;
                        } else if (i7 == 2) {
                            if (this.f9194) {
                                this.f9196 = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            double d = (((double) (this.f9210 - this.f9204)) * 1000000.0d) / ((double) this.f9209);
                            long jRound = Math.round(this.f9193);
                            if (this.f9202) {
                                this.f9202 = false;
                                this.f9193 = this.f9199;
                            } else {
                                this.f9193 += d;
                            }
                            this.f9205.mo8455(jRound, i, this.f9203, 0, null);
                            this.f9194 = false;
                            this.f9204 = 0;
                            this.f9203 = 0;
                        }
                        this.f9192 = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8819(C17714 c17714, C17714 c17715, boolean z) {
        int iM41485 = c17714.m41485();
        int iMin = Math.min(c17714.m41457(), c17715.m41457());
        c17714.m41461(c17715.m41485(), iMin, c17715.m41482());
        c17715.m41478(iMin);
        if (z) {
            c17714.m41484(iM41485);
        }
    }
}
