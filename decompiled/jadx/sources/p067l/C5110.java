package p067l;

import java.util.List;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۗ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8M7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5110 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f11992;

    /* JADX INFO: renamed from: ۖ */
    public int f11993;

    /* JADX INFO: renamed from: ۚ */
    public int f11995;

    /* JADX INFO: renamed from: ۧ */
    public boolean f12000;

    /* JADX INFO: renamed from: ܳ */
    public int f12001;

    /* JADX INFO: renamed from: ܶ */
    public int f12002;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC20790 f12003;

    /* JADX INFO: renamed from: ܿ */
    public String f12005;

    /* JADX INFO: renamed from: ᩳ */
    public int f12006;

    /* JADX INFO: renamed from: ֡ */
    public int f11990 = 0;

    /* JADX INFO: renamed from: ۢ */
    public final C19203 f11999 = new C19203(new byte[15], 2);

    /* JADX INFO: renamed from: ᩷ */
    public final C17861 f12009 = new C17861();

    /* JADX INFO: renamed from: ܽ */
    public final C19203 f12004 = new C19203();

    /* JADX INFO: renamed from: ᩻ */
    public C14497 f12010 = new C14497();

    /* JADX INFO: renamed from: ᩴ */
    public int f12007 = SecP160R1Field.PInv;

    /* JADX INFO: renamed from: ᩵ */
    public int f12008 = -1;

    /* JADX INFO: renamed from: ۡ */
    public long f11998 = -1;

    /* JADX INFO: renamed from: ۘ */
    public boolean f11994 = true;

    /* JADX INFO: renamed from: ۜ */
    public boolean f11996 = true;

    /* JADX INFO: renamed from: ֨ */
    public double f11991 = -9.223372036854776E18d;

    /* JADX INFO: renamed from: ۠ */
    public double f11997 = -9.223372036854776E18d;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f11990 = 0;
        this.f11995 = 0;
        this.f11999.m43727(2);
        this.f11993 = 0;
        this.f12001 = 0;
        this.f12007 = SecP160R1Field.PInv;
        this.f12008 = -1;
        this.f12002 = 0;
        this.f11998 = -1L;
        this.f11992 = false;
        this.f12000 = false;
        this.f11996 = true;
        this.f11994 = true;
        this.f11991 = -9.223372036854776E18d;
        this.f11997 = -9.223372036854776E18d;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f12005 = c20672.m46738();
        this.f12003 = interfaceC23116.mo5732(c20672.m46739(), 1);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f12006 = i;
        if (!this.f11994 && (this.f12001 != 0 || !this.f11996)) {
            this.f12000 = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f12000) {
                this.f11997 = j;
            } else {
                this.f11991 = j;
            }
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) throws C10998 {
        int i;
        C23877.m52958(this.f12003);
        while (c19203.m43703() > 0) {
            int i2 = this.f11990;
            int iM40558 = 0;
            if (i2 == 0) {
                int i3 = this.f12006;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (c19203.m43703() > 0) {
                            int i4 = this.f11995 << 8;
                            this.f11995 = i4;
                            int iM43702 = i4 | c19203.m43702();
                            this.f11995 = iM43702;
                            if ((iM43702 & 16777215) == 12583333) {
                                c19203.m43730(c19203.m43731() - 3);
                                this.f11995 = 0;
                            }
                        }
                    }
                    this.f11990 = 1;
                    break;
                }
                c19203.m43730(c19203.m43729());
            } else {
                C19203 c19204 = this.f12004;
                C14497 c14497 = this.f12010;
                if (i2 == 1) {
                    C19203 c19205 = this.f11999;
                    m10886(c19203, c19205, false);
                    if (c19205.m43703() != 0) {
                        this.f11996 = false;
                    } else {
                        int iM43729 = c19205.m43729();
                        byte[] bArrM43728 = c19205.m43728();
                        C17861 c17861 = this.f12009;
                        c17861.m40565(iM43729, bArrM43728);
                        boolean zM27075 = C11816.m27075(c17861, c14497);
                        if (zM27075) {
                            this.f11993 = 0;
                            this.f12001 = c14497.f41398 + iM43729 + this.f12001;
                        }
                        if (zM27075) {
                            c19205.m43730(0);
                            this.f12003.mo10500(c19205.m43729(), c19205);
                            c19205.m43727(2);
                            c19204.m43727(c14497.f41398);
                            this.f11996 = true;
                            this.f11990 = 2;
                        } else if (c19205.m43729() < 15) {
                            c19205.m43732(c19205.m43729() + 1);
                            this.f11996 = false;
                        }
                    }
                } else if (i2 == 2) {
                    int i5 = c14497.f41399;
                    if (i5 == 1 || i5 == 17) {
                        m10886(c19203, c19204, true);
                    }
                    int iMin = Math.min(c19203.m43703(), c14497.f41398 - this.f11993);
                    this.f12003.mo10500(iMin, c19203);
                    int i6 = this.f11993 + iMin;
                    this.f11993 = i6;
                    if (i6 == c14497.f41398) {
                        int i7 = c14497.f41399;
                        if (i7 == 1) {
                            byte[] bArrM43729 = c19204.m43728();
                            C13827 c13827M27074 = C11816.m27074(new C17861(bArrM43729, bArrM43729.length));
                            this.f12007 = c13827M27074.f39075;
                            this.f12008 = c13827M27074.f39076;
                            long j = this.f11998;
                            long j2 = c14497.f41397;
                            if (j != j2) {
                                this.f11998 = j2;
                                int i8 = c13827M27074.f39074;
                                String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                                byte[] bArr = c13827M27074.f39073;
                                AbstractC16192 abstractC16192M36874of = (bArr == null || bArr.length <= 0) ? null : AbstractC16192.m36874of((Object) C5792.f14227, (Object) bArr);
                                C3601 c3601 = new C3601();
                                c3601.m6701(this.f12005);
                                c3601.m6694("video/mp2t");
                                c3601.m6697("audio/mhm1");
                                c3601.m6688(this.f12007);
                                c3601.m6677(strConcat);
                                c3601.m6678((List) abstractC16192M36874of);
                                this.f12003.mo10503(c3601.m6672());
                            }
                            this.f11992 = true;
                        } else if (i7 == 17) {
                            byte[] bArrM437210 = c19204.m43728();
                            C17861 c17862 = new C17861(bArrM437210, bArrM437210.length);
                            if (c17862.m40567()) {
                                c17862.m40566(2);
                                iM40558 = c17862.m40558(13);
                            }
                            this.f12002 = iM40558;
                        } else if (i7 == 2) {
                            if (this.f11992) {
                                this.f11994 = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            double d = (((double) (this.f12008 - this.f12002)) * 1000000.0d) / ((double) this.f12007);
                            long jRound = Math.round(this.f11991);
                            if (this.f12000) {
                                this.f12000 = false;
                                this.f11991 = this.f11997;
                            } else {
                                this.f11991 += d;
                            }
                            this.f12003.mo10502(jRound, i, this.f12001, 0, null);
                            this.f11992 = false;
                            this.f12002 = 0;
                            this.f12001 = 0;
                        }
                        this.f11990 = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10886(C19203 c19203, C19203 c19204, boolean z) {
        int iM43731 = c19203.m43731();
        int iMin = Math.min(c19203.m43703(), c19204.m43703());
        c19203.m43707(c19204.m43731(), iMin, c19204.m43728());
        c19204.m43724(iMin);
        if (z) {
            c19203.m43730(iM43731);
        }
    }
}
