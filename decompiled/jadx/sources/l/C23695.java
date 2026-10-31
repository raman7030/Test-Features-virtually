package l;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23695 extends C17878 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f76731;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f76732;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f76733;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76734;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f76735;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9585 f76736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f76737;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5883[] f76738;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76740;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f76741 = new IdentityHashMap();

    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5 A[LOOP:2: B:95:0x0183->B:117:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    public C23695(C21631 c21631) {
        int i;
        int i2;
        int size = c21631.f69442.size();
        this.f76738 = new C5883[size];
        this.f76731 = new boolean[size];
        int i3 = 0;
        while (true) {
            C5883[] c5883Arr = this.f76738;
            if (i3 >= c5883Arr.length) {
                break;
            }
            c5883Arr[i3] = new C5883(c21631.m48892(i3), i3);
            i3++;
        }
        int i4 = -1;
        if (c21631 == C4665.f14830) {
            Iterator it = c21631.f69442.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC7086 abstractC7086 = (AbstractC7086) it.next();
                if (abstractC7086.f74154 == 45 && (abstractC7086 instanceof C22111) && !abstractC7086.f21788 && abstractC7086.m51210() == 2) {
                    AbstractC23041 abstractC23041 = abstractC7086.m51211(0).f38806;
                    AbstractC23041 abstractC23042 = abstractC7086.m51211(1).f38806;
                    if ((abstractC23041 instanceof C21406) && abstractC23041.m51210() == 1 && (abstractC23042 instanceof C13435) && abstractC23042.m51210() == 1 && abstractC23042.m51211(0).f38806 == c21631.f69450[45]) {
                        AbstractC23041 abstractC23043 = abstractC23041.m51211(0).f38806;
                        if (abstractC23043.m51210() == 1) {
                            AbstractC12938 abstractC12938M51211 = abstractC23043.m51211(0);
                            if ((abstractC12938M51211 instanceof C8706) && ((C8706) abstractC12938M51211).f26507 == 46) {
                                i = abstractC7086.f21787;
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
        this.f76732 = i;
        C21631 c21632 = C4665.f14830;
        if (c21631 != c21632) {
            i2 = -1;
        } else {
            AbstractC23041 abstractC23041M24504 = C9585.m24504(c21631.f69445[42]);
            if (abstractC23041M24504.m51210() == 1) {
                AbstractC12938 abstractC12938M51212 = abstractC23041M24504.m51211(0);
                if (abstractC12938M51212 instanceof C8706) {
                    C8706 c8706 = (C8706) abstractC12938M51212;
                    if (c8706.f26507 != 44) {
                        i2 = -1;
                    } else {
                        AbstractC23041 abstractC23041M24505 = C9585.m24504(c8706.f26506);
                        if (abstractC23041M24505 instanceof C22111) {
                            C22111 c22111 = (C22111) abstractC23041M24505;
                            if (c22111.f21788 || c22111.m51210() != 2) {
                                i2 = -1;
                            } else {
                                AbstractC23041 abstractC23044 = c22111.m51211(1).f38806;
                                AbstractC23041 abstractC23045 = c22111.m51211(0).f38806;
                                if (abstractC23045 instanceof C21406) {
                                    C21406 c21406 = (C21406) abstractC23045;
                                    if (c21406.m51210() == 2 && (abstractC23044 instanceof C13435) && abstractC23044.m51210() == 1 && abstractC23044.m51211(0).f38806 == c21631.f69450[42]) {
                                        AbstractC23041 abstractC23041M24506 = C9585.m24504(c21406.m51211(0).f38806);
                                        if (abstractC23041M24506.m51210() == 1) {
                                            AbstractC12938 abstractC12938M51213 = abstractC23041M24506.m51211(0);
                                            if (abstractC12938M51213 instanceof C8706) {
                                                C8706 c8707 = (C8706) abstractC12938M51213;
                                                if (c8707.f26507 != 43) {
                                                    i2 = -1;
                                                } else {
                                                    AbstractC23041 abstractC23041M24507 = C9585.m24504(c8707.f26506);
                                                    if (abstractC23041M24507.m51210() == 1) {
                                                        AbstractC12938 abstractC12938M51214 = abstractC23041M24507.m51211(0);
                                                        if (abstractC12938M51214 instanceof C8706) {
                                                            C8706 c8708 = (C8706) abstractC12938M51214;
                                                            if (c8708.f26507 == 44 && C9585.m24504(c8708.f26506) == c21406.f77840) {
                                                                i2 = c22111.f21787;
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
        this.f76737 = i2;
        if (c21631 == c21632) {
            AbstractC23041 abstractC23041M24508 = C9585.m24504(c21631.f69445[72]);
            if (abstractC23041M24508 instanceof C18375) {
                C18375 c18375 = (C18375) abstractC23041M24508;
                if (c18375.m51210() == 3) {
                    int i5 = 0;
                    while (i5 < 3) {
                        AbstractC23041 abstractC23041M24509 = C9585.m24504(c18375.m51211(i5).f38806);
                        if (abstractC23041M24509.m51210() == 1) {
                            AbstractC12938 abstractC12938M51215 = abstractC23041M24509.m51211(0);
                            if (i5 < 2) {
                                if (abstractC12938M51215 instanceof C16963) {
                                    if (((C16963) abstractC12938M51215).f52045 == (i5 == 0 ? 93 : -1)) {
                                        if (C9585.m24504(abstractC12938M51215.f38806) != c18375.f77840) {
                                            i5++;
                                        }
                                    }
                                }
                            } else if ((abstractC12938M51215 instanceof C10823) && ((C10823) abstractC12938M51215).f32554 == 72) {
                                if (C9585.m24504(abstractC12938M51215.f38806) != c18375.f77840) {
                                    i5++;
                                }
                            }
                        }
                    }
                    i4 = c18375.f21787;
                }
            }
        }
        this.f76735 = i4;
        this.f76740 = m52238(c21631, 13, 2, false, 72, true);
        this.f76733 = m52238(c21631, 26, 37, true, -1, false);
        this.f76736 = C9585.m24502(c21631);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52238(C21631 c21631, int i, int i2, boolean z, int i3, boolean z2) {
        if (c21631 == C4665.f14830) {
            int i4 = -1;
            for (AbstractC7086 abstractC7086 : c21631.f69442) {
                if (abstractC7086.f74154 == i && (abstractC7086 instanceof C18375)) {
                    C18375 c18375 = (C18375) abstractC7086;
                    if (c18375.m51210() == 2 && m52239(c18375, 0, i2, z) && m52239(c18375, 1, i3, z2)) {
                        if (i4 == -1) {
                            i4 = c18375.f21787;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52239(C18375 c18375, int i, int i2, boolean z) {
        AbstractC12938 abstractC12938M51211;
        C8706 c8706;
        AbstractC23041 abstractC23041M24504 = C9585.m24504(c18375.m51211(i).f38806);
        if (z) {
            if (abstractC23041M24504.m51210() == 1) {
                AbstractC12938 abstractC12938M51212 = abstractC23041M24504.m51211(0);
                if (abstractC12938M51212 instanceof C10823) {
                    C10823 c10823 = (C10823) abstractC12938M51212;
                    if (c10823.f32554 == c18375.f74154) {
                        abstractC23041M24504 = C9585.m24504(c10823.f38806);
                        if (i2 < 0) {
                            if (abstractC23041M24504 == c18375.f77840) {
                                return true;
                            }
                        } else if (abstractC23041M24504.m51210() == 1) {
                            abstractC12938M51211 = abstractC23041M24504.m51211(0);
                            if (abstractC12938M51211 instanceof C8706) {
                                c8706 = (C8706) abstractC12938M51211;
                                if (c8706.f26507 != i2) {
                                }
                            }
                        }
                    }
                }
            }
        } else if (i2 < 0) {
            if (abstractC23041M24504 == c18375.f77840) {
                return true;
            }
        } else if (abstractC23041M24504.m51210() == 1) {
            abstractC12938M51211 = abstractC23041M24504.m51211(0);
            if (abstractC12938M51211 instanceof C8706) {
                c8706 = (C8706) abstractC12938M51211;
                if (c8706.f26507 != i2 && C9585.m24504(c8706.f26506) == c18375.f77840) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52240() {
        int i = 0;
        while (true) {
            C5883[] c5883Arr = this.f76738;
            if (i >= c5883Arr.length) {
                this.f54599.clear();
                this.f76741.clear();
                this.f76739 = 0;
                return;
            }
            c5883Arr[i] = new C5883(c5883Arr[i].f18062, i);
            i++;
        }
    }
}
