package l;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13031 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12326 f39004;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f39005;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f39006;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f39007;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f39008;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f39009;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3154 f39010;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f39011;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f39012;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5976[] f39013;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f39014;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5976 f39015;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39016;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C10045 f39017;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f39018;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f39019;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

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

    public C13031(int i, C10045 c10045) {
        this.f39017 = c10045;
        this.f39008 = (i & 1) == 0;
        this.f39005 = new C17714(12);
        this.f39010 = new C3154();
        this.f39011 = new C22412();
        this.f39013 = new C5976[0];
        this.f39009 = -1L;
        this.f39018 = -1L;
        this.f39019 = -1;
        this.f39014 = -9223372036854775807L;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f39016 = 0;
        if (this.f39008) {
            interfaceC21830 = new C9067(interfaceC21830, this.f39017);
        }
        this.f39011 = interfaceC21830;
        this.f39012 = -1L;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C17714 c17714 = this.f39005;
        interfaceC8424.mo22061(0, 12, c17714.m41482());
        c17714.m41484(0);
        if (c17714.m41490() == 1179011410) {
            c17714.m41478(4);
            if (c17714.m41490() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f39012 = -1L;
        this.f39015 = null;
        for (C5976 c5976 : this.f39013) {
            c5976.m16767(j);
        }
        if (j == 0) {
            if (this.f39013.length == 0) {
                this.f39016 = 0;
                return;
            } else {
                this.f39016 = 3;
                return;
            }
        }
        this.f39016 = 6;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0313  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        boolean z;
        C5976 c5976;
        int i;
        long j;
        C5976 c5977;
        if (this.f39012 != -1) {
            long position = interfaceC8424.getPosition();
            long j2 = this.f39012;
            if (j2 < position || j2 > 262144 + position) {
                c23615.f76532 = j2;
                z = true;
            } else {
                interfaceC8424.mo22070((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f39012 = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f39016;
        C5976 c5978 = null;
        C3154 c3154 = this.f39010;
        C17714 c17714 = this.f39005;
        switch (i2) {
            case 0:
                if (mo4841(interfaceC8424)) {
                    interfaceC8424.mo22070(12);
                    this.f39016 = 1;
                    return 0;
                }
                throw C9080.m23440("AVI Header List not found", (Throwable) null);
            case 1:
                interfaceC8424.readFully(c17714.m41482(), 0, 12);
                c17714.m41484(0);
                c3154.getClass();
                c3154.f9850 = c17714.m41490();
                c3154.f9852 = c17714.m41490();
                c3154.f9851 = 0;
                if (c3154.f9850 != 1414744396) {
                    throw C9080.m23440("LIST expected, found: " + c3154.f9850, (Throwable) null);
                }
                int iM41490 = c17714.m41490();
                c3154.f9851 = iM41490;
                if (iM41490 != 1819436136) {
                    throw C9080.m23440("hdrl expected, found: " + c3154.f9851, (Throwable) null);
                }
                this.f39019 = c3154.f9852;
                this.f39016 = 2;
                return 0;
            case 2:
                int i3 = this.f39019 - 4;
                C17714 c17715 = new C17714(i3);
                interfaceC8424.readFully(c17715.m41482(), 0, i3);
                C11621 c11621M28513 = C11621.m28513(1819436136, c17715);
                if (c11621M28513.getType() != 1819436136) {
                    throw C9080.m23440("Unexpected header list type " + c11621M28513.getType(), (Throwable) null);
                }
                C12326 c12326 = (C12326) c11621M28513.m28514(C12326.class);
                if (c12326 == null) {
                    throw C9080.m23440("AviHeader not found", (Throwable) null);
                }
                this.f39004 = c12326;
                this.f39014 = ((long) c12326.f36894) * ((long) c12326.f36893);
                ArrayList arrayList = new ArrayList();
                AbstractC4628 abstractC4628ListIterator = c11621M28513.f34633.listIterator(0);
                int i4 = 0;
                while (abstractC4628ListIterator.hasNext()) {
                    InterfaceC20088 interfaceC20088 = (InterfaceC20088) abstractC4628ListIterator.next();
                    if (interfaceC20088.getType() == 1819440243) {
                        C11621 c11621 = (C11621) interfaceC20088;
                        int i5 = i4 + 1;
                        C10210 c10210 = (C10210) c11621.m28514(C10210.class);
                        C22909 c22909 = (C22909) c11621.m28514(C22909.class);
                        if (c10210 == null) {
                            C19956.m46037("Missing Stream Header");
                        } else if (c22909 != null) {
                            long j3 = c10210.f30668;
                            long j4 = ((long) c10210.f30673) * 1000000;
                            long j5 = c10210.f30669;
                            String str = C3603.f11424;
                            long jM11017 = C3603.m11017(j3, j4, j5, RoundingMode.DOWN);
                            C8353 c8353 = c22909.f73845;
                            C1297 c1297M21948 = c8353.m21948();
                            c1297M21948.m4467(i4);
                            int i6 = c10210.f30670;
                            if (i6 != 0) {
                                c1297M21948.m4451(i6);
                            }
                            C13736 c13736 = (C13736) c11621.m28514(C13736.class);
                            if (c13736 != null) {
                                c1297M21948.m4473(c13736.f41013);
                            }
                            int iM24807 = C9786.m24807(c8353.f25614);
                            if (iM24807 == 1 || iM24807 == 2) {
                                InterfaceC19383 interfaceC19383Mo3429 = this.f39011.mo3429(i4, iM24807);
                                interfaceC19383Mo3429.mo8456(c1297M21948.m4440());
                                interfaceC19383Mo3429.mo8454(jM11017);
                                this.f39014 = Math.max(this.f39014, jM11017);
                                c5976 = new C5976(i4, c10210, interfaceC19383Mo3429);
                            }
                            if (c5976 != null) {
                                arrayList.add(c5976);
                            }
                            i4 = i5;
                        } else {
                            C19956.m46037("Missing Stream Format");
                        }
                        c5976 = null;
                        if (c5976 != null) {
                            arrayList.add(c5976);
                        }
                        i4 = i5;
                    }
                }
                this.f39013 = (C5976[]) arrayList.toArray(new C5976[0]);
                this.f39011.mo3431();
                this.f39016 = 3;
                return 0;
            case 3:
                if (this.f39009 != -1) {
                    long position2 = interfaceC8424.getPosition();
                    i = 16;
                    long j6 = this.f39009;
                    if (position2 != j6) {
                        this.f39012 = j6;
                        return 0;
                    }
                } else {
                    i = 16;
                }
                interfaceC8424.mo22061(0, 12, c17714.m41482());
                interfaceC8424.mo22066();
                c17714.m41484(0);
                c3154.getClass();
                c3154.f9850 = c17714.m41490();
                c3154.f9852 = c17714.m41490();
                c3154.f9851 = 0;
                int iM41491 = c17714.m41490();
                int i7 = c3154.f9850;
                if (i7 == 1179011410) {
                    interfaceC8424.mo22070(12);
                    return 0;
                }
                if (i7 != 1414744396 || iM41491 != 1769369453) {
                    this.f39012 = interfaceC8424.getPosition() + ((long) c3154.f9852) + 8;
                    return 0;
                }
                long position3 = interfaceC8424.getPosition();
                this.f39009 = position3;
                this.f39018 = position3 + ((long) c3154.f9852) + 8;
                if (!this.f39006) {
                    C12326 c12327 = this.f39004;
                    c12327.getClass();
                    if ((c12327.f36892 & i) == i) {
                        this.f39016 = 4;
                        this.f39012 = this.f39018;
                        return 0;
                    }
                    this.f39011.mo3430(new C20794(this.f39014));
                    this.f39006 = true;
                }
                this.f39012 = interfaceC8424.getPosition() + 12;
                this.f39016 = 6;
                return 0;
            case 4:
                interfaceC8424.readFully(c17714.m41482(), 0, 8);
                c17714.m41484(0);
                int iM41492 = c17714.m41490();
                int iM41493 = c17714.m41490();
                if (iM41492 == 829973609) {
                    this.f39016 = 5;
                    this.f39007 = iM41493;
                    return 0;
                }
                this.f39012 = interfaceC8424.getPosition() + ((long) iM41493);
                return 0;
            case 5:
                C17714 c17716 = new C17714(this.f39007);
                interfaceC8424.readFully(c17716.m41482(), 0, this.f39007);
                if (c17716.m41457() < 16) {
                    j = 0;
                } else {
                    int iM41485 = c17716.m41485();
                    c17716.m41478(8);
                    long jM41490 = c17716.m41490();
                    long j7 = this.f39009;
                    j = jM41490 > j7 ? 0L : j7 + 8;
                    c17716.m41484(iM41485);
                }
                while (c17716.m41457() >= 16) {
                    int iM41494 = c17716.m41490();
                    int iM41495 = c17716.m41490();
                    long jM41491 = ((long) c17716.m41490()) + j;
                    c17716.m41478(4);
                    C5976[] c5976Arr = this.f39013;
                    int length = c5976Arr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            c5977 = c5976Arr[i8];
                            if (!c5977.m16764(iM41494)) {
                                i8++;
                            }
                        } else {
                            c5977 = null;
                        }
                    }
                    if (c5977 != null) {
                        c5977.m16763(jM41491, (iM41495 & 16) == 16);
                    }
                }
                for (C5976 c5979 : this.f39013) {
                    c5979.m16762();
                }
                this.f39006 = true;
                if (this.f39013.length == 0) {
                    this.f39011.mo3430(new C20794(this.f39014));
                } else {
                    this.f39011.mo3430(new C4565(this, this.f39014));
                }
                this.f39016 = 6;
                this.f39012 = this.f39009;
                return 0;
            case 6:
                if (interfaceC8424.getPosition() >= this.f39018) {
                    return -1;
                }
                C5976 c59710 = this.f39015;
                if (c59710 != null) {
                    if (c59710.m16765(interfaceC8424)) {
                        this.f39015 = null;
                    }
                    return 0;
                }
                if ((interfaceC8424.getPosition() & 1) == 1) {
                    interfaceC8424.mo22070(1);
                }
                interfaceC8424.mo22061(0, 12, c17714.m41482());
                c17714.m41484(0);
                int iM41496 = c17714.m41490();
                if (iM41496 == 1414744396) {
                    c17714.m41484(8);
                    interfaceC8424.mo22070(c17714.m41490() == 1769369453 ? 12 : 8);
                    interfaceC8424.mo22066();
                    return 0;
                }
                int iM41497 = c17714.m41490();
                if (iM41496 == 1263424842) {
                    this.f39012 = interfaceC8424.getPosition() + ((long) iM41497) + 8;
                    return 0;
                }
                interfaceC8424.mo22070(8);
                interfaceC8424.mo22066();
                for (C5976 c59711 : this.f39013) {
                    if (c59711.m16764(iM41496)) {
                        c5978 = c59711;
                        if (c5978 == null) {
                            this.f39012 = interfaceC8424.getPosition() + ((long) iM41497);
                            return 0;
                        }
                        c5978.m16766(iM41497);
                        this.f39015 = c5978;
                        return 0;
                    }
                }
                if (c5978 == null) {
                    this.f39012 = interfaceC8424.getPosition() + ((long) iM41497);
                    return 0;
                }
                c5978.m16766(iM41497);
                this.f39015 = c5978;
                return 0;
            default:
                throw new AssertionError();
        }
    }
}
