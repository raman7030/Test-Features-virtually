package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4676 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23116 f10537;

    /* JADX INFO: renamed from: ۢ */
    public int f10539;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC10375 f10540;

    /* JADX INFO: renamed from: ܳ */
    public C20770 f10541;

    /* JADX INFO: renamed from: ܽ */
    public int f10542;

    /* JADX INFO: renamed from: ܿ */
    public C15227 f10543;

    /* JADX INFO: renamed from: ᩳ */
    public C4871 f10544;

    /* JADX INFO: renamed from: ᩷ */
    public int f10545;

    /* JADX INFO: renamed from: ۜ */
    public final C19203 f10538 = new C19203(2);

    /* JADX INFO: renamed from: ᩻ */
    public long f10546 = -1;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) throws EOFException, InterruptedIOException {
        C17750 c17750 = (C17750) interfaceC10375;
        if (m9911(c17750) == 65496) {
            int iM9911 = m9911(c17750);
            this.f10542 = iM9911;
            if (iM9911 == 65504) {
                C19203 c19203 = this.f10538;
                c19203.m43727(2);
                c17750.mo24038(false, 0, 2, c19203.m43728());
                c17750.mo24037(c19203.m43710() - 2, false);
                this.f10542 = m9911(c17750);
            }
            if (this.f10542 == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f10537 = interfaceC23116;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        String strM43734;
        C4871 c4871;
        C20099 c20099M5814;
        long j;
        int i = this.f10539;
        C19203 c19203 = this.f10538;
        if (i == 0) {
            c19203.m43727(2);
            interfaceC10375.readFully(c19203.m43728(), 0, 2);
            int iM43710 = c19203.m43710();
            this.f10542 = iM43710;
            if (iM43710 == 65498) {
                if (this.f10546 != -1) {
                    this.f10539 = 4;
                    return 0;
                }
                m9912();
                return 0;
            }
            if ((iM43710 >= 65488 && iM43710 <= 65497) || iM43710 == 65281) {
                return 0;
            }
            this.f10539 = 1;
            return 0;
        }
        if (i == 1) {
            c19203.m43727(2);
            interfaceC10375.readFully(c19203.m43728(), 0, 2);
            this.f10545 = c19203.m43710() - 2;
            this.f10539 = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f10541 == null || interfaceC10375 != this.f10540) {
                    this.f10540 = interfaceC10375;
                    this.f10541 = new C20770(interfaceC10375, this.f10546);
                }
                C15227 c15227 = this.f10543;
                c15227.getClass();
                int iMo7075 = c15227.mo7075(this.f10541, c24812);
                if (iMo7075 == 1) {
                    c24812.f79276 += this.f10546;
                }
                return iMo7075;
            }
            long position = interfaceC10375.getPosition();
            long j2 = this.f10546;
            if (position != j2) {
                c24812.f79276 = j2;
                return 1;
            }
            if (!interfaceC10375.mo24038(true, 0, 1, c19203.m43728())) {
                m9912();
                return 0;
            }
            interfaceC10375.mo24036();
            if (this.f10543 == null) {
                this.f10543 = new C15227(InterfaceC8974.f24307, 8);
            }
            C20770 c20770 = new C20770(interfaceC10375, this.f10546);
            this.f10541 = c20770;
            if (!this.f10543.mo7079(c20770)) {
                m9912();
                return 0;
            }
            C15227 c15228 = this.f10543;
            long j3 = this.f10546;
            InterfaceC23116 interfaceC23116 = this.f10537;
            interfaceC23116.getClass();
            c15228.mo7078(new C7358(j3, interfaceC23116));
            C4871 c4872 = this.f10544;
            c4872.getClass();
            InterfaceC23116 interfaceC23117 = this.f10537;
            interfaceC23117.getClass();
            InterfaceC20790 interfaceC20790Mo5732 = interfaceC23117.mo5732(1024, 4);
            C3601 c3601 = new C3601();
            c3601.m6694("image/jpeg");
            c3601.m6681(new C25079(c4872));
            interfaceC20790Mo5732.mo10503(c3601.m6672());
            this.f10539 = 5;
            return 0;
        }
        if (this.f10542 == 65505) {
            C19203 c19204 = new C19203(this.f10545);
            interfaceC10375.readFully(c19204.m43728(), 0, this.f10545);
            if (this.f10544 == null && "http://ns.adobe.com/xap/1.0/".equals(c19204.m43734()) && (strM43734 = c19204.m43734()) != null) {
                long length = interfaceC10375.getLength();
                if (length == -1 || (c20099M5814 = C3334.m5814(strM43734)) == null) {
                    c4871 = null;
                } else {
                    List list = c20099M5814.f62192;
                    if (list.size() < 2) {
                        c4871 = null;
                    } else {
                        int size = list.size() - 1;
                        boolean zEquals = false;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        while (size >= 0) {
                            C6017 c6017 = (C6017) list.get(size);
                            zEquals |= "video/mp4".equals(c6017.f15073);
                            if (size == 0) {
                                length -= c6017.f15074;
                                j = 0;
                            } else {
                                j = length - c6017.f15072;
                            }
                            if (zEquals && j != length) {
                                j7 = length - j;
                                zEquals = false;
                                j6 = j;
                            }
                            if (size == 0) {
                                j5 = length;
                                j4 = j;
                            }
                            size--;
                            length = j;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            c4871 = null;
                        } else {
                            c4871 = new C4871(j4, j5, c20099M5814.f62193, j6, j7);
                        }
                    }
                }
                this.f10544 = c4871;
                if (c4871 != null) {
                    this.f10546 = c4871.f11107;
                }
            }
        } else {
            interfaceC10375.mo24040(this.f10545);
        }
        this.f10539 = 0;
        return 0;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        if (j == 0) {
            this.f10539 = 0;
            this.f10543 = null;
        } else if (this.f10539 == 5) {
            C15227 c15227 = this.f10543;
            c15227.getClass();
            c15227.mo7077(j, j2);
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
        C15227 c15227 = this.f10543;
        if (c15227 != null) {
            c15227.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m9911(C17750 c17750) {
        C19203 c19203 = this.f10538;
        c19203.m43727(2);
        c17750.mo24038(false, 0, 2, c19203.m43728());
        return c19203.m43710();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m9912() {
        InterfaceC23116 interfaceC23116 = this.f10537;
        interfaceC23116.getClass();
        interfaceC23116.mo5734();
        this.f10537.mo5733(new C22131(-9223372036854775807L));
        this.f10539 = 6;
    }
}
