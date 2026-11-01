package p067l;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14753 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public C14083 f42050;

    /* JADX INFO: renamed from: ۖ */
    public final C19203 f42051;

    /* JADX INFO: renamed from: ۘ */
    public boolean f42052;

    /* JADX INFO: renamed from: ۜ */
    public int f42053;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f42054;

    /* JADX INFO: renamed from: ۢ */
    public long f42055;

    /* JADX INFO: renamed from: ۧ */
    public final C5366 f42056;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC23116 f42057;

    /* JADX INFO: renamed from: ܺ */
    public long f42058;

    /* JADX INFO: renamed from: ܽ */
    public C8048[] f42059;

    /* JADX INFO: renamed from: ܿ */
    public long f42060;

    /* JADX INFO: renamed from: ᩳ */
    public C8048 f42061;

    /* JADX INFO: renamed from: ᩴ */
    public int f42062;

    /* JADX INFO: renamed from: ᩵ */
    public final C11915 f42063;

    /* JADX INFO: renamed from: ᩷ */
    public long f42064;

    /* JADX INFO: renamed from: ᩻ */
    public int f42065;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

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

    public C14753(int i, C11915 c11915) {
        this.f42063 = c11915;
        this.f42054 = (i & 1) == 0;
        this.f42051 = new C19203(12);
        this.f42056 = new C5366();
        this.f42057 = new C23669();
        this.f42059 = new C8048[0];
        this.f42055 = -1L;
        this.f42064 = -1L;
        this.f42065 = -1;
        this.f42060 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f42062 = 0;
        if (this.f42054) {
            interfaceC23116 = new C10986(interfaceC23116, this.f42063);
        }
        this.f42057 = interfaceC23116;
        this.f42058 = -1L;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        C19203 c19203 = this.f42051;
        interfaceC10375.mo24031(0, 12, c19203.m43728());
        c19203.m43730(0);
        if (c19203.m43736() == 1179011410) {
            c19203.m43724(4);
            if (c19203.m43736() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f42058 = -1L;
        this.f42061 = null;
        for (C8048 c8048 : this.f42059) {
            c8048.m18693(j);
        }
        if (j == 0) {
            if (this.f42059.length == 0) {
                this.f42062 = 0;
                return;
            } else {
                this.f42062 = 3;
                return;
            }
        }
        this.f42062 = 6;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0313  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        boolean z;
        C8048 c8048;
        int i;
        long j;
        C8048 c8049;
        if (this.f42058 != -1) {
            long position = interfaceC10375.getPosition();
            long j2 = this.f42058;
            if (j2 < position || j2 > 262144 + position) {
                c24812.f79276 = j2;
                z = true;
            } else {
                interfaceC10375.mo24040((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f42058 = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f42062;
        C8048 c80410 = null;
        C5366 c5366 = this.f42056;
        C19203 c19203 = this.f42051;
        switch (i2) {
            case 0:
                if (mo7079(interfaceC10375)) {
                    interfaceC10375.mo24040(12);
                    this.f42062 = 1;
                    return 0;
                }
                throw C10998.m25387("AVI Header List not found", (Throwable) null);
            case 1:
                interfaceC10375.readFully(c19203.m43728(), 0, 12);
                c19203.m43730(0);
                c5366.getClass();
                c5366.f12653 = c19203.m43736();
                c5366.f12655 = c19203.m43736();
                c5366.f12654 = 0;
                if (c5366.f12653 != 1414744396) {
                    throw C10998.m25387("LIST expected, found: " + c5366.f12653, (Throwable) null);
                }
                int iM43736 = c19203.m43736();
                c5366.f12654 = iM43736;
                if (iM43736 != 1819436136) {
                    throw C10998.m25387("hdrl expected, found: " + c5366.f12654, (Throwable) null);
                }
                this.f42065 = c5366.f12655;
                this.f42062 = 2;
                return 0;
            case 2:
                int i3 = this.f42065 - 4;
                C19203 c19204 = new C19203(i3);
                interfaceC10375.readFully(c19204.m43728(), 0, i3);
                C13413 c13413M30559 = C13413.m30559(1819436136, c19204);
                if (c13413M30559.getType() != 1819436136) {
                    throw C10998.m25387("Unexpected header list type " + c13413M30559.getType(), (Throwable) null);
                }
                C14083 c14083 = (C14083) c13413M30559.m30560(C14083.class);
                if (c14083 == null) {
                    throw C10998.m25387("AviHeader not found", (Throwable) null);
                }
                this.f42050 = c14083;
                this.f42060 = ((long) c14083.f39908) * ((long) c14083.f39907);
                ArrayList arrayList = new ArrayList();
                AbstractC6767 abstractC6767ListIterator = c13413M30559.f37630.listIterator(0);
                int i4 = 0;
                while (abstractC6767ListIterator.hasNext()) {
                    InterfaceC21460 interfaceC21460 = (InterfaceC21460) abstractC6767ListIterator.next();
                    if (interfaceC21460.getType() == 1819440243) {
                        C13413 c13413 = (C13413) interfaceC21460;
                        int i5 = i4 + 1;
                        C12072 c12072 = (C12072) c13413.m30560(C12072.class);
                        C24141 c24141 = (C24141) c13413.m30560(C24141.class);
                        if (c12072 == null) {
                            C21334.m48351("Missing Stream Header");
                        } else if (c24141 != null) {
                            long j3 = c12072.f33629;
                            long j4 = ((long) c12072.f33634) * 1000000;
                            long j5 = c12072.f33630;
                            String str = C5792.f14228;
                            long jM12993 = C5792.m12993(j3, j4, j5, RoundingMode.DOWN);
                            C10307 c10307 = c24141.f76575;
                            C3601 c3601M23918 = c10307.m23918();
                            c3601M23918.m6699(i4);
                            int i6 = c12072.f33631;
                            if (i6 != 0) {
                                c3601M23918.m6683(i6);
                            }
                            C15423 c15423 = (C15423) c13413.m30560(C15423.class);
                            if (c15423 != null) {
                                c3601M23918.m6705(c15423.f44092);
                            }
                            int iM26822 = C11669.m26822(c10307.f28528);
                            if (iM26822 == 1 || iM26822 == 2) {
                                InterfaceC20790 interfaceC20790Mo5732 = this.f42057.mo5732(i4, iM26822);
                                interfaceC20790Mo5732.mo10503(c3601M23918.m6672());
                                interfaceC20790Mo5732.mo10501(jM12993);
                                this.f42060 = Math.max(this.f42060, jM12993);
                                c8048 = new C8048(i4, c12072, interfaceC20790Mo5732);
                            }
                            if (c8048 != null) {
                                arrayList.add(c8048);
                            }
                            i4 = i5;
                        } else {
                            C21334.m48351("Missing Stream Format");
                        }
                        c8048 = null;
                        if (c8048 != null) {
                            arrayList.add(c8048);
                        }
                        i4 = i5;
                    }
                }
                this.f42059 = (C8048[]) arrayList.toArray(new C8048[0]);
                this.f42057.mo5734();
                this.f42062 = 3;
                return 0;
            case 3:
                if (this.f42055 != -1) {
                    long position2 = interfaceC10375.getPosition();
                    i = 16;
                    long j6 = this.f42055;
                    if (position2 != j6) {
                        this.f42058 = j6;
                        return 0;
                    }
                } else {
                    i = 16;
                }
                interfaceC10375.mo24031(0, 12, c19203.m43728());
                interfaceC10375.mo24036();
                c19203.m43730(0);
                c5366.getClass();
                c5366.f12653 = c19203.m43736();
                c5366.f12655 = c19203.m43736();
                c5366.f12654 = 0;
                int iM43737 = c19203.m43736();
                int i7 = c5366.f12653;
                if (i7 == 1179011410) {
                    interfaceC10375.mo24040(12);
                    return 0;
                }
                if (i7 != 1414744396 || iM43737 != 1769369453) {
                    this.f42058 = interfaceC10375.getPosition() + ((long) c5366.f12655) + 8;
                    return 0;
                }
                long position3 = interfaceC10375.getPosition();
                this.f42055 = position3;
                this.f42064 = position3 + ((long) c5366.f12655) + 8;
                if (!this.f42052) {
                    C14083 c14084 = this.f42050;
                    c14084.getClass();
                    if ((c14084.f39906 & i) == i) {
                        this.f42062 = 4;
                        this.f42058 = this.f42064;
                        return 0;
                    }
                    this.f42057.mo5733(new C22131(this.f42060));
                    this.f42052 = true;
                }
                this.f42058 = interfaceC10375.getPosition() + 12;
                this.f42062 = 6;
                return 0;
            case 4:
                interfaceC10375.readFully(c19203.m43728(), 0, 8);
                c19203.m43730(0);
                int iM43738 = c19203.m43736();
                int iM43739 = c19203.m43736();
                if (iM43738 == 829973609) {
                    this.f42062 = 5;
                    this.f42053 = iM43739;
                    return 0;
                }
                this.f42058 = interfaceC10375.getPosition() + ((long) iM43739);
                return 0;
            case 5:
                C19203 c19205 = new C19203(this.f42053);
                interfaceC10375.readFully(c19205.m43728(), 0, this.f42053);
                if (c19205.m43703() < 16) {
                    j = 0;
                } else {
                    int iM43731 = c19205.m43731();
                    c19205.m43724(8);
                    long jM43736 = c19205.m43736();
                    long j7 = this.f42055;
                    j = jM43736 > j7 ? 0L : j7 + 8;
                    c19205.m43730(iM43731);
                }
                while (c19205.m43703() >= 16) {
                    int iM437310 = c19205.m43736();
                    int iM437311 = c19205.m43736();
                    long jM43737 = ((long) c19205.m43736()) + j;
                    c19205.m43724(4);
                    C8048[] c8048Arr = this.f42059;
                    int length = c8048Arr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            c8049 = c8048Arr[i8];
                            if (!c8049.m18690(iM437310)) {
                                i8++;
                            }
                        } else {
                            c8049 = null;
                        }
                    }
                    if (c8049 != null) {
                        c8049.m18689(jM43737, (iM437311 & 16) == 16);
                    }
                }
                for (C8048 c80411 : this.f42059) {
                    c80411.m18688();
                }
                this.f42052 = true;
                if (this.f42059.length == 0) {
                    this.f42057.mo5733(new C22131(this.f42060));
                } else {
                    this.f42057.mo5733(new C6707(this, this.f42060));
                }
                this.f42062 = 6;
                this.f42058 = this.f42055;
                return 0;
            case 6:
                if (interfaceC10375.getPosition() >= this.f42064) {
                    return -1;
                }
                C8048 c80412 = this.f42061;
                if (c80412 != null) {
                    if (c80412.m18691(interfaceC10375)) {
                        this.f42061 = null;
                    }
                    return 0;
                }
                if ((interfaceC10375.getPosition() & 1) == 1) {
                    interfaceC10375.mo24040(1);
                }
                interfaceC10375.mo24031(0, 12, c19203.m43728());
                c19203.m43730(0);
                int iM437312 = c19203.m43736();
                if (iM437312 == 1414744396) {
                    c19203.m43730(8);
                    interfaceC10375.mo24040(c19203.m43736() == 1769369453 ? 12 : 8);
                    interfaceC10375.mo24036();
                    return 0;
                }
                int iM437313 = c19203.m43736();
                if (iM437312 == 1263424842) {
                    this.f42058 = interfaceC10375.getPosition() + ((long) iM437313) + 8;
                    return 0;
                }
                interfaceC10375.mo24040(8);
                interfaceC10375.mo24036();
                for (C8048 c80413 : this.f42059) {
                    if (c80413.m18690(iM437312)) {
                        c80410 = c80413;
                        if (c80410 == null) {
                            this.f42058 = interfaceC10375.getPosition() + ((long) iM437313);
                            return 0;
                        }
                        c80410.m18692(iM437313);
                        this.f42061 = c80410;
                        return 0;
                    }
                }
                if (c80410 == null) {
                    this.f42058 = interfaceC10375.getPosition() + ((long) iM437313);
                    return 0;
                }
                c80410.m18692(iM437313);
                this.f42061 = c80410;
                return 0;
            default:
                throw new AssertionError();
        }
    }
}
