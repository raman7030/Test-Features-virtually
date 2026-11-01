package p067l;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24888 extends C19359 {

    /* JADX INFO: renamed from: ۜ */
    public final boolean[] f79481;

    /* JADX INFO: renamed from: ۡ */
    public final int f79482;

    /* JADX INFO: renamed from: ۢ */
    public final int f79483;

    /* JADX INFO: renamed from: ۧ */
    public int f79484;

    /* JADX INFO: renamed from: ܳ */
    public final int f79485;

    /* JADX INFO: renamed from: ܺ */
    public final C11478 f79486;

    /* JADX INFO: renamed from: ܽ */
    public final int f79487;

    /* JADX INFO: renamed from: ܿ */
    public final C7959[] f79488;

    /* JADX INFO: renamed from: ᩳ */
    public int f79489;

    /* JADX INFO: renamed from: ᩷ */
    public final int f79490;

    /* JADX INFO: renamed from: ᩻ */
    public final IdentityHashMap f79491 = new IdentityHashMap();

    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5 A[LOOP:2: B:95:0x0183->B:117:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    public C24888(C22926 c22926) {
        int i;
        int i2;
        int size = c22926.f72145.size();
        this.f79488 = new C7959[size];
        this.f79481 = new boolean[size];
        int i3 = 0;
        while (true) {
            C7959[] c7959Arr = this.f79488;
            if (i3 >= c7959Arr.length) {
                break;
            }
            c7959Arr[i3] = new C7959(c22926.m51240(i3), i3);
            i3++;
        }
        int i4 = -1;
        if (c22926 == C6802.f17660) {
            Iterator it = c22926.f72145.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC9103 abstractC9103 = (AbstractC9103) it.next();
                if (abstractC9103.f76896 == 45 && (abstractC9103 instanceof C23382) && !abstractC9103.f24669 && abstractC9103.m53603() == 2) {
                    AbstractC24266 abstractC24266 = abstractC9103.m53604(0).f41850;
                    AbstractC24266 abstractC24267 = abstractC9103.m53604(1).f41850;
                    if ((abstractC24266 instanceof C22712) && abstractC24266.m53603() == 1 && (abstractC24267 instanceof C15137) && abstractC24267.m53603() == 1 && abstractC24267.m53604(0).f41850 == c22926.f72153[45]) {
                        AbstractC24266 abstractC24268 = abstractC24266.m53604(0).f41850;
                        if (abstractC24268.m53603() == 1) {
                            AbstractC14664 abstractC14664M53604 = abstractC24268.m53604(0);
                            if ((abstractC14664M53604 instanceof C10642) && ((C10642) abstractC14664M53604).f29432 == 46) {
                                i = abstractC9103.f24668;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } else {
            i = -1;
            break;
        }
        this.f79482 = i;
        C22926 c22927 = C6802.f17660;
        if (c22926 != c22927) {
            i2 = -1;
        } else {
            AbstractC24266 abstractC24266M26516 = C11478.m26516(c22926.f72148[42]);
            if (abstractC24266M26516.m53603() == 1) {
                AbstractC14664 abstractC14664M53605 = abstractC24266M26516.m53604(0);
                if (abstractC14664M53605 instanceof C10642) {
                    C10642 c10642 = (C10642) abstractC14664M53605;
                    if (c10642.f29432 != 44) {
                        i2 = -1;
                    } else {
                        AbstractC24266 abstractC24266M26517 = C11478.m26516(c10642.f29431);
                        if (abstractC24266M26517 instanceof C23382) {
                            C23382 c23382 = (C23382) abstractC24266M26517;
                            if (c23382.f24669 || c23382.m53603() != 2) {
                                i2 = -1;
                            } else {
                                AbstractC24266 abstractC24269 = c23382.m53604(1).f41850;
                                AbstractC24266 abstractC242610 = c23382.m53604(0).f41850;
                                if (abstractC242610 instanceof C22712) {
                                    C22712 c22712 = (C22712) abstractC242610;
                                    if (c22712.m53603() == 2 && (abstractC24269 instanceof C15137) && abstractC24269.m53603() == 1 && abstractC24269.m53604(0).f41850 == c22926.f72153[42]) {
                                        AbstractC24266 abstractC24266M26518 = C11478.m26516(c22712.m53604(0).f41850);
                                        if (abstractC24266M26518.m53603() == 1) {
                                            AbstractC14664 abstractC14664M53606 = abstractC24266M26518.m53604(0);
                                            if (abstractC14664M53606 instanceof C10642) {
                                                C10642 c10643 = (C10642) abstractC14664M53606;
                                                if (c10643.f29432 != 43) {
                                                    i2 = -1;
                                                } else {
                                                    AbstractC24266 abstractC24266M26519 = C11478.m26516(c10643.f29431);
                                                    if (abstractC24266M26519.m53603() == 1) {
                                                        AbstractC14664 abstractC14664M53607 = abstractC24266M26519.m53604(0);
                                                        if (abstractC14664M53607 instanceof C10642) {
                                                            C10642 c10644 = (C10642) abstractC14664M53607;
                                                            if (c10644.f29432 == 44 && C11478.m26516(c10644.f29431) == c22712.f80592) {
                                                                i2 = c23382.f24668;
                                                            } else {
                                                                i2 = -1;
                                                            }
                                                        } else {
                                                            i2 = -1;
                                                        }
                                                    } else {
                                                        i2 = -1;
                                                    }
                                                }
                                            } else {
                                                i2 = -1;
                                            }
                                        } else {
                                            i2 = -1;
                                        }
                                    } else {
                                        i2 = -1;
                                    }
                                } else {
                                    i2 = -1;
                                }
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
        }
        this.f79487 = i2;
        if (c22926 == c22927) {
            AbstractC24266 abstractC24266M265110 = C11478.m26516(c22926.f72148[72]);
            if (abstractC24266M265110 instanceof C19832) {
                C19832 c19832 = (C19832) abstractC24266M265110;
                if (c19832.m53603() == 3) {
                    int i5 = 0;
                    while (i5 < 3) {
                        AbstractC24266 abstractC24266M265111 = C11478.m26516(c19832.m53604(i5).f41850);
                        if (abstractC24266M265111.m53603() == 1) {
                            AbstractC14664 abstractC14664M53608 = abstractC24266M265111.m53604(0);
                            if (i5 < 2) {
                                if (abstractC14664M53608 instanceof C18490) {
                                    if (((C18490) abstractC14664M53608).f55225 == (i5 == 0 ? 93 : -1)) {
                                        if (C11478.m26516(abstractC14664M53608.f41850) != c19832.f80592) {
                                            i5++;
                                        }
                                    }
                                }
                            } else if ((abstractC14664M53608 instanceof C12654) && ((C12654) abstractC14664M53608).f35530 == 72) {
                                if (C11478.m26516(abstractC14664M53608.f41850) != c19832.f80592) {
                                    i5++;
                                }
                            }
                        }
                    }
                    i4 = c19832.f24668;
                }
            }
        }
        this.f79485 = i4;
        this.f79490 = m54641(c22926, 13, 2, false, 72, true);
        this.f79483 = m54641(c22926, 26, 37, true, -1, false);
        this.f79486 = C11478.m26514(c22926);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m54641(C22926 c22926, int i, int i2, boolean z, int i3, boolean z2) {
        if (c22926 == C6802.f17660) {
            int i4 = -1;
            for (AbstractC9103 abstractC9103 : c22926.f72145) {
                if (abstractC9103.f76896 == i && (abstractC9103 instanceof C19832)) {
                    C19832 c19832 = (C19832) abstractC9103;
                    if (c19832.m53603() == 2 && m54642(c19832, 0, i2, z) && m54642(c19832, 1, i3, z2)) {
                        if (i4 == -1) {
                            i4 = c19832.f24668;
                        }
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m54642(C19832 c19832, int i, int i2, boolean z) {
        AbstractC14664 abstractC14664M53604;
        C10642 c10642;
        AbstractC24266 abstractC24266M26516 = C11478.m26516(c19832.m53604(i).f41850);
        if (z) {
            if (abstractC24266M26516.m53603() == 1) {
                AbstractC14664 abstractC14664M53605 = abstractC24266M26516.m53604(0);
                if (abstractC14664M53605 instanceof C12654) {
                    C12654 c12654 = (C12654) abstractC14664M53605;
                    if (c12654.f35530 == c19832.f76896) {
                        abstractC24266M26516 = C11478.m26516(c12654.f41850);
                        if (i2 < 0) {
                            if (abstractC24266M26516 == c19832.f80592) {
                                return true;
                            }
                        } else if (abstractC24266M26516.m53603() == 1) {
                            abstractC14664M53604 = abstractC24266M26516.m53604(0);
                            if (abstractC14664M53604 instanceof C10642) {
                                c10642 = (C10642) abstractC14664M53604;
                                if (c10642.f29432 != i2) {
                                }
                            }
                        }
                    }
                }
            }
        } else if (i2 < 0) {
            if (abstractC24266M26516 == c19832.f80592) {
                return true;
            }
        } else if (abstractC24266M26516.m53603() == 1) {
            abstractC14664M53604 = abstractC24266M26516.m53604(0);
            if (abstractC14664M53604 instanceof C10642) {
                c10642 = (C10642) abstractC14664M53604;
                if (c10642.f29432 != i2 && C11478.m26516(c10642.f29431) == c19832.f80592) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54643() {
        int i = 0;
        while (true) {
            C7959[] c7959Arr = this.f79488;
            if (i >= c7959Arr.length) {
                this.f57796.clear();
                this.f79491.clear();
                this.f79489 = 0;
                return;
            }
            c7959Arr[i] = new C7959(c7959Arr[i].f20917, i);
            i++;
        }
    }
}
