package l;

/* JADX INFO: renamed from: l.ۢ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9585 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f29082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f29083;

    public C9585(int i, int[] iArr) {
        this.f29083 = i;
        this.f29082 = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9585 m24502(C21631 c21631) {
        if (c21631 != C4665.f14830) {
            return null;
        }
        AbstractC23041 abstractC23041M24504 = m24504(c21631.f69445[1]);
        if (!(abstractC23041M24504 instanceof C18375)) {
            return null;
        }
        C18375 c18375 = (C18375) abstractC23041M24504;
        int[] iArr = new int[c21631.f69445.length];
        for (int i = 0; i < c18375.m51210(); i++) {
            AbstractC23041 abstractC23041M24505 = m24504(c18375.m51211(i).f38806);
            if (abstractC23041M24505.m51210() == 1) {
                AbstractC12938 abstractC12938M51211 = abstractC23041M24505.m51211(0);
                if (abstractC12938M51211 instanceof C8706) {
                    C8706 c8706 = (C8706) abstractC12938M51211;
                    int i2 = c8706.f26507;
                    AbstractC23041 abstractC23041M24506 = m24504(c8706.f26506);
                    if (i2 == 70) {
                        if (abstractC23041M24506.m51210() == 1) {
                            AbstractC12938 abstractC12938M51212 = abstractC23041M24506.m51211(0);
                            if (abstractC12938M51212 instanceof C16963) {
                                C16963 c16963 = (C16963) abstractC12938M51212;
                                if (c16963.f52045 != 95) {
                                    continue;
                                } else {
                                    AbstractC23041 abstractC23041M24507 = m24504(c16963.f38806);
                                    if (abstractC23041M24507.m51210() == 1) {
                                        AbstractC12938 abstractC12938M51213 = abstractC23041M24507.m51211(0);
                                        if (abstractC12938M51213 instanceof C8706) {
                                            C8706 c8707 = (C8706) abstractC12938M51213;
                                            if (c8707.f26507 != 1) {
                                                continue;
                                            } else {
                                                abstractC23041M24506 = m24504(c8707.f26506);
                                                if (abstractC23041M24506 == c18375.f77840) {
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
                    } else if (abstractC23041M24506 == c18375.f77840) {
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
        return new C9585(c18375.f21787, iArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC23041 m24504(AbstractC23041 abstractC23041) {
        while (!(abstractC23041 instanceof C14846) && abstractC23041.m51210() == 1 && (abstractC23041.m51211(0) instanceof C9909)) {
            abstractC23041 = abstractC23041.m51211(0).f38806;
        }
        return abstractC23041;
    }
}
