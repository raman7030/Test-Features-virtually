package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8UK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2428 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f7746;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f7748;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8424 f7749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19362 f7750;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7751;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13530 f7752;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2633 f7753;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f7754;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f7747 = new C17714(2);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f7755 = -1;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) throws EOFException, InterruptedIOException {
        C16184 c16184 = (C16184) interfaceC8424;
        if (m7863(c16184) == 65496) {
            int iM7863 = m7863(c16184);
            this.f7751 = iM7863;
            if (iM7863 == 65504) {
                C17714 c17714 = this.f7747;
                c17714.m41481(2);
                c16184.mo22068(false, 0, 2, c17714.m41482());
                c16184.mo22067(c17714.m41464() - 2, false);
                this.f7751 = m7863(c16184);
            }
            if (this.f7751 == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f7746 = interfaceC21830;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        String strM41488;
        C2633 c2633;
        C18656 c18656M3527;
        long j;
        int i = this.f7748;
        C17714 c17714 = this.f7747;
        if (i == 0) {
            c17714.m41481(2);
            interfaceC8424.readFully(c17714.m41482(), 0, 2);
            int iM41464 = c17714.m41464();
            this.f7751 = iM41464;
            if (iM41464 == 65498) {
                if (this.f7755 != -1) {
                    this.f7748 = 4;
                    return 0;
                }
                m7864();
                return 0;
            }
            if ((iM41464 >= 65488 && iM41464 <= 65497) || iM41464 == 65281) {
                return 0;
            }
            this.f7748 = 1;
            return 0;
        }
        if (i == 1) {
            c17714.m41481(2);
            interfaceC8424.readFully(c17714.m41482(), 0, 2);
            this.f7754 = c17714.m41464() - 2;
            this.f7748 = 2;
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
                if (this.f7750 == null || interfaceC8424 != this.f7749) {
                    this.f7749 = interfaceC8424;
                    this.f7750 = new C19362(interfaceC8424, this.f7755);
                }
                C13530 c13530 = this.f7752;
                c13530.getClass();
                int iMo4837 = c13530.mo4837(this.f7750, c23615);
                if (iMo4837 == 1) {
                    c23615.f76532 += this.f7755;
                }
                return iMo4837;
            }
            long position = interfaceC8424.getPosition();
            long j2 = this.f7755;
            if (position != j2) {
                c23615.f76532 = j2;
                return 1;
            }
            if (!interfaceC8424.mo22068(true, 0, 1, c17714.m41482())) {
                m7864();
                return 0;
            }
            interfaceC8424.mo22066();
            if (this.f7752 == null) {
                this.f7752 = new C13530(InterfaceC6950.f21425, 8);
            }
            C19362 c19362 = new C19362(interfaceC8424, this.f7755);
            this.f7750 = c19362;
            if (!this.f7752.mo4841(c19362)) {
                m7864();
                return 0;
            }
            C13530 c13531 = this.f7752;
            long j3 = this.f7755;
            InterfaceC21830 interfaceC21830 = this.f7746;
            interfaceC21830.getClass();
            c13531.mo4840(new C5250(j3, interfaceC21830));
            C2633 c2634 = this.f7753;
            c2634.getClass();
            InterfaceC21830 interfaceC21831 = this.f7746;
            interfaceC21831.getClass();
            InterfaceC19383 interfaceC19383Mo3429 = interfaceC21831.mo3429(1024, 4);
            C1297 c1297 = new C1297();
            c1297.m4462("image/jpeg");
            c1297.m4449(new C23896(c2634));
            interfaceC19383Mo3429.mo8456(c1297.m4440());
            this.f7748 = 5;
            return 0;
        }
        if (this.f7751 == 65505) {
            C17714 c17715 = new C17714(this.f7754);
            interfaceC8424.readFully(c17715.m41482(), 0, this.f7754);
            if (this.f7753 == null && "http://ns.adobe.com/xap/1.0/".equals(c17715.m41488()) && (strM41488 = c17715.m41488()) != null) {
                long length = interfaceC8424.getLength();
                if (length == -1 || (c18656M3527 = C1016.m3527(strM41488)) == null) {
                    c2633 = null;
                } else {
                    List list = c18656M3527.f58969;
                    if (list.size() < 2) {
                        c2633 = null;
                    } else {
                        int size = list.size() - 1;
                        boolean zEquals = false;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        while (size >= 0) {
                            C3839 c3839 = (C3839) list.get(size);
                            zEquals |= "video/mp4".equals(c3839.f12265);
                            if (size == 0) {
                                length -= c3839.f12266;
                                j = 0;
                            } else {
                                j = length - c3839.f12264;
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
                            c2633 = null;
                        } else {
                            c2633 = new C2633(j4, j5, c18656M3527.f58970, j6, j7);
                        }
                    }
                }
                this.f7753 = c2633;
                if (c2633 != null) {
                    this.f7755 = c2633.f8312;
                }
            }
        } else {
            interfaceC8424.mo22070(this.f7754);
        }
        this.f7748 = 0;
        return 0;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0) {
            this.f7748 = 0;
            this.f7752 = null;
        } else if (this.f7748 == 5) {
            C13530 c13530 = this.f7752;
            c13530.getClass();
            c13530.mo4839(j, j2);
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
        C13530 c13530 = this.f7752;
        if (c13530 != null) {
            c13530.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m7863(C16184 c16184) {
        C17714 c17714 = this.f7747;
        c17714.m41481(2);
        c16184.mo22068(false, 0, 2, c17714.m41482());
        return c17714.m41464();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m7864() {
        InterfaceC21830 interfaceC21830 = this.f7746;
        interfaceC21830.getClass();
        interfaceC21830.mo3431();
        this.f7746.mo3430(new C20794(-9223372036854775807L));
        this.f7748 = 6;
    }
}
