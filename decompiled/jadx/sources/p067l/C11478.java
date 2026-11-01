package p067l;

/* JADX INFO: renamed from: l.ۢ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11478 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f32029;

    /* JADX INFO: renamed from: ۧ */
    public final int f32030;

    public C11478(int i, int[] iArr) {
        this.f32030 = i;
        this.f32029 = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C11478 m26514(C22926 c22926) {
        if (c22926 != C6802.f17660) {
            return null;
        }
        AbstractC24266 abstractC24266M26516 = m26516(c22926.f72148[1]);
        if (!(abstractC24266M26516 instanceof C19832)) {
            return null;
        }
        C19832 c19832 = (C19832) abstractC24266M26516;
        int[] iArr = new int[c22926.f72148.length];
        for (int i = 0; i < c19832.m53603(); i++) {
            AbstractC24266 abstractC24266M26517 = m26516(c19832.m53604(i).f41850);
            if (abstractC24266M26517.m53603() == 1) {
                AbstractC14664 abstractC14664M53604 = abstractC24266M26517.m53604(0);
                if (abstractC14664M53604 instanceof C10642) {
                    C10642 c10642 = (C10642) abstractC14664M53604;
                    int i2 = c10642.f29432;
                    AbstractC24266 abstractC24266M26518 = m26516(c10642.f29431);
                    if (i2 == 70) {
                        if (abstractC24266M26518.m53603() == 1) {
                            AbstractC14664 abstractC14664M53605 = abstractC24266M26518.m53604(0);
                            if (abstractC14664M53605 instanceof C18490) {
                                C18490 c18490 = (C18490) abstractC14664M53605;
                                if (c18490.f55225 != 95) {
                                    continue;
                                } else {
                                    AbstractC24266 abstractC24266M26519 = m26516(c18490.f41850);
                                    if (abstractC24266M26519.m53603() == 1) {
                                        AbstractC14664 abstractC14664M53606 = abstractC24266M26519.m53604(0);
                                        if (abstractC14664M53606 instanceof C10642) {
                                            C10642 c10643 = (C10642) abstractC14664M53606;
                                            if (c10643.f29432 != 1) {
                                                continue;
                                            } else {
                                                abstractC24266M26518 = m26516(c10643.f29431);
                                                if (abstractC24266M26518 == c19832.f80592) {
                                                    continue;
                                                } else {
                                                    if (iArr[i2] != 0) {
                                                        return null;
                                                    }
                                                    iArr[i2] = i + 1;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (abstractC24266M26518 == c19832.f80592) {
                        continue;
                    } else {
                        if (iArr[i2] != 0) {
                            return null;
                        }
                        iArr[i2] = i + 1;
                    }
                } else {
                    continue;
                }
            }
        }
        return new C11478(c19832.f24668, iArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC24266 m26516(AbstractC24266 abstractC24266) {
        while (!(abstractC24266 instanceof C16478) && abstractC24266.m53603() == 1 && (abstractC24266.m53604(0) instanceof C11786)) {
            abstractC24266 = abstractC24266.m53604(0).f41850;
        }
        return abstractC24266;
    }
}
