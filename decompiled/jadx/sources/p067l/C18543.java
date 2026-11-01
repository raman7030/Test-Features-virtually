package p067l;

/* JADX INFO: renamed from: l.ܿ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18543 {

    /* JADX INFO: renamed from: ֫ */
    public final char f55370;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f55371;

    /* JADX INFO: renamed from: ܽ */
    public final int f55372;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC12628 f55373;

    public C18543(char c, int i) {
        this.f55372 = i;
        this.f55371 = true;
        this.f55370 = c;
        this.f55373 = null;
    }

    public C18543(int i, InterfaceC12628 interfaceC12628) {
        this.f55372 = i;
        this.f55371 = false;
        this.f55370 = (char) 0;
        this.f55373 = interfaceC12628;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18543 m42222(C7933 c7933, InterfaceC12628 interfaceC12628, int i) {
        while (true) {
            C18543 c18543 = null;
            if (c7933 == null) {
                break;
            }
            int i2 = 0;
            if (c7933 instanceof C11168) {
                C11168 c11168 = (C11168) c7933;
                int[] iArr = c11168.f10016;
                while (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return null;
                    }
                    if (!interfaceC12628.mo4821(i3)) {
                        return new C18543((char) i3, i + i2);
                    }
                    i2++;
                }
                i += iArr.length;
                c7933 = c11168.f20809;
            } else {
                if (!(c7933 instanceof C21207)) {
                    break;
                }
                C21207 c21207 = (C21207) c7933;
                InterfaceC12628 interfaceC12629 = c21207.f78179;
                int iM42223 = m42223(interfaceC12629);
                if (iM42223 >= 0 && !interfaceC12628.mo4821(iM42223)) {
                    return new C18543((char) iM42223, i);
                }
                int i4 = 0;
                while (true) {
                    if (i2 >= 128) {
                        if (i4 == 0) {
                            break;
                        }
                        c18543 = new C18543(i, interfaceC12629);
                        break;
                    }
                    if (interfaceC12629.mo4821(i2) && (interfaceC12628.mo4821(i2) || (i4 = i4 + 1) > 16)) {
                        break;
                    }
                    i2++;
                }
                if (c18543 != null) {
                    return c18543;
                }
                i++;
                c7933 = c21207.f20809;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C18543 m42224(C7933 c7933) {
        C22016 c22016;
        int i;
        C18543 c18543 = null;
        int length = 0;
        while (c7933 != null) {
            if (c7933.getClass() == C11168.class) {
                C11168 c11168 = (C11168) c7933;
                int[] iArr = c11168.f10016;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c18543;
                    }
                    c18543 = new C18543((char) i3, length + i2);
                }
                length += iArr.length;
                c7933 = c11168.f20809;
            } else if (!(c7933 instanceof C21207)) {
                if (!(c7933 instanceof C22016) || (i = (c22016 = (C22016) c7933).f69300) <= 0 || i != c22016.f69298) {
                    break;
                }
                C7933 c7934 = c22016.f69297;
                if (!(c7934 instanceof C21207)) {
                    break;
                }
                int iM42223 = m42223(((C21207) c7934).f78179);
                if (iM42223 >= 0) {
                    c18543 = new C18543((char) iM42223, (length + i) - 1);
                }
                length += i;
                c7933 = c22016.f20809;
            } else {
                C21207 c21207 = (C21207) c7933;
                int iM42224 = m42223(c21207.f78179);
                if (iM42224 >= 0) {
                    c18543 = new C18543((char) iM42224, length);
                }
                length++;
                c7933 = c21207.f20809;
            }
        }
        return c18543;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX INFO: renamed from: ֫ */
    public static C18543 m42221(C7933 c7933) {
        int length;
        C18543 c18543M42220;
        int i;
        C18543 c18543 = null;
        int length2 = 0;
        boolean z = false;
        while (c7933 != null) {
            if (c7933.getClass() == C11168.class) {
                C11168 c11168 = (C11168) c7933;
                int[] iArr = c11168.f10016;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c18543;
                    }
                    if (z) {
                        c18543 = new C18543((char) i3, length2 + i2);
                    }
                }
                length2 += iArr.length;
                c7933 = c11168.f20809;
            } else {
                if (!(c7933 instanceof C21207)) {
                    if (c7933 instanceof C22016) {
                        C22016 c22016 = (C22016) c7933;
                        int i4 = c22016.f69300;
                        C7933 c7934 = c22016.f69297;
                        if (i4 > 0 && i4 == c22016.f69298) {
                            boolean z2 = true;
                            if (c7934.getClass() == C11168.class) {
                                length = ((C11168) c7934).f10016.length;
                            } else {
                                length = c7934 instanceof C21207 ? 1 : -1;
                            }
                            if (length < 0) {
                                break;
                            }
                            long j = (((long) length) * ((long) i4)) + ((long) length2);
                            length2 = j > 2147483647L ? -1 : (int) j;
                            if (length2 < 0) {
                                break;
                            }
                            if (!z) {
                                if (c7934 instanceof C21207) {
                                    C21207 c21207 = (C21207) c7934;
                                    if (i4 <= 1 || m42220(0, c21207.f78179) != null) {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                int i5 = length2 - length;
                                if (c7934.getClass() == C11168.class) {
                                    int[] iArr2 = ((C11168) c7934).f10016;
                                    for (int i6 = 0; i6 < iArr2.length && (i = iArr2[i6]) <= 65535; i6++) {
                                        c18543 = new C18543((char) i, i5 + i6);
                                    }
                                } else if ((c7934 instanceof C21207) && (c18543M42220 = m42220(i5, ((C21207) c7934).f78179)) != null) {
                                    c18543 = c18543M42220;
                                }
                            }
                            z |= z2;
                            c7933 = c22016.f20809;
                        }
                    }
                    if (!(c7933 instanceof C6454)) {
                        break;
                    }
                    C6454 c6454 = (C6454) c7933;
                    if (c6454.f23120 <= 0) {
                        break;
                    }
                    C18543 c18543M42221 = m42220(length2, c6454.f23121);
                    if (!z || c18543M42221 == null) {
                        break;
                    }
                    return c18543M42221;
                }
                C21207 c21208 = (C21207) c7933;
                C18543 c18543M42222 = m42220(length2, c21208.f78179);
                if (z && c18543M42222 != null) {
                    c18543 = c18543M42222;
                }
                length2++;
                c7933 = c21208.f20809;
            }
        }
        return c18543;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18543 m42220(int i, InterfaceC12628 interfaceC12628) {
        int iM42223 = m42223(interfaceC12628);
        if (iM42223 >= 0) {
            return new C18543((char) iM42223, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            if (interfaceC12628.mo4821(i3) && (i2 = i2 + 1) > 16) {
                return null;
            }
        }
        if (i2 == 0) {
            return null;
        }
        return new C18543(i, interfaceC12628);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42219(C21207 c21207) {
        return m42223(c21207.f78179);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m42223(InterfaceC12628 interfaceC12628) {
        if (interfaceC12628 instanceof C21897) {
            return ((C21897) interfaceC12628).f68875;
        }
        return -1;
    }
}
