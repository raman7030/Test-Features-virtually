package l;

/* JADX INFO: renamed from: l.ܿ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17019 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char f52190;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52191;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f52192;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f52193;

    public C17019(char c, int i) {
        this.f52192 = i;
        this.f52191 = true;
        this.f52190 = c;
        this.f52193 = null;
    }

    public C17019(int i, InterfaceC10795 interfaceC10795) {
        this.f52192 = i;
        this.f52191 = false;
        this.f52190 = (char) 0;
        this.f52193 = interfaceC10795;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17019 m39979(C5855 c5855, InterfaceC10795 interfaceC10795, int i) {
        while (true) {
            C17019 c17019 = null;
            if (c5855 == null) {
                break;
            }
            int i2 = 0;
            if (c5855 instanceof C9259) {
                C9259 c9259 = (C9259) c5855;
                int[] iArr = c9259.f7231;
                while (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return null;
                    }
                    if (!interfaceC10795.mo2465(i3)) {
                        return new C17019((char) i3, i + i2);
                    }
                    i2++;
                }
                i += iArr.length;
                c5855 = c9259.f17958;
            } else {
                if (!(c5855 instanceof C19822)) {
                    break;
                }
                C19822 c19822 = (C19822) c5855;
                InterfaceC10795 interfaceC10796 = c19822.f75432;
                int iM39980 = m39980(interfaceC10796);
                if (iM39980 >= 0 && !interfaceC10795.mo2465(iM39980)) {
                    return new C17019((char) iM39980, i);
                }
                int i4 = 0;
                while (true) {
                    if (i2 >= 128) {
                        if (i4 == 0) {
                            break;
                        }
                        c17019 = new C17019(i, interfaceC10796);
                        break;
                    }
                    if (interfaceC10796.mo2465(i2) && (interfaceC10795.mo2465(i2) || (i4 = i4 + 1) > 16)) {
                        break;
                    }
                    i2++;
                }
                if (c17019 != null) {
                    return c17019;
                }
                i++;
                c5855 = c19822.f17958;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17019 m39981(C5855 c5855) {
        C20673 c20673;
        int i;
        C17019 c17019 = null;
        int length = 0;
        while (c5855 != null) {
            if (c5855.getClass() == C9259.class) {
                C9259 c9259 = (C9259) c5855;
                int[] iArr = c9259.f7231;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c17019;
                    }
                    c17019 = new C17019((char) i3, length + i2);
                }
                length += iArr.length;
                c5855 = c9259.f17958;
            } else if (!(c5855 instanceof C19822)) {
                if (!(c5855 instanceof C20673) || (i = (c20673 = (C20673) c5855).f66618) <= 0 || i != c20673.f66616) {
                    break;
                }
                C5855 c5856 = c20673.f66615;
                if (!(c5856 instanceof C19822)) {
                    break;
                }
                int iM39980 = m39980(((C19822) c5856).f75432);
                if (iM39980 >= 0) {
                    c17019 = new C17019((char) iM39980, (length + i) - 1);
                }
                length += i;
                c5855 = c20673.f17958;
            } else {
                C19822 c19822 = (C19822) c5855;
                int iM39981 = m39980(c19822.f75432);
                if (iM39981 >= 0) {
                    c17019 = new C17019((char) iM39981, length);
                }
                length++;
                c5855 = c19822.f17958;
            }
        }
        return c17019;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17019 m39978(C5855 c5855) {
        int length;
        C17019 c17019M39977;
        int i;
        C17019 c17019 = null;
        int length2 = 0;
        boolean z = false;
        while (c5855 != null) {
            if (c5855.getClass() == C9259.class) {
                C9259 c9259 = (C9259) c5855;
                int[] iArr = c9259.f7231;
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 65535) {
                        return c17019;
                    }
                    if (z) {
                        c17019 = new C17019((char) i3, length2 + i2);
                    }
                }
                length2 += iArr.length;
                c5855 = c9259.f17958;
            } else {
                if (!(c5855 instanceof C19822)) {
                    if (c5855 instanceof C20673) {
                        C20673 c20673 = (C20673) c5855;
                        int i4 = c20673.f66618;
                        C5855 c5856 = c20673.f66615;
                        if (i4 > 0 && i4 == c20673.f66616) {
                            boolean z2 = true;
                            if (c5856.getClass() == C9259.class) {
                                length = ((C9259) c5856).f7231.length;
                            } else {
                                length = c5856 instanceof C19822 ? 1 : -1;
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
                                if (c5856 instanceof C19822) {
                                    C19822 c19822 = (C19822) c5856;
                                    if (i4 <= 1 || m39977(0, c19822.f75432) != null) {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                int i5 = length2 - length;
                                if (c5856.getClass() == C9259.class) {
                                    int[] iArr2 = ((C9259) c5856).f7231;
                                    for (int i6 = 0; i6 < iArr2.length && (i = iArr2[i6]) <= 65535; i6++) {
                                        c17019 = new C17019((char) i, i5 + i6);
                                    }
                                } else if ((c5856 instanceof C19822) && (c17019M39977 = m39977(i5, ((C19822) c5856).f75432)) != null) {
                                    c17019 = c17019M39977;
                                }
                            }
                            z |= z2;
                            c5855 = c20673.f17958;
                        }
                    }
                    if (!(c5855 instanceof C4299)) {
                        break;
                    }
                    C4299 c4299 = (C4299) c5855;
                    if (c4299.f20242 <= 0) {
                        break;
                    }
                    C17019 c17019M39978 = m39977(length2, c4299.f20243);
                    if (!z || c17019M39978 == null) {
                        break;
                    }
                    return c17019M39978;
                }
                C19822 c19823 = (C19822) c5855;
                C17019 c17019M39979 = m39977(length2, c19823.f75432);
                if (z && c17019M39979 != null) {
                    c17019 = c17019M39979;
                }
                length2++;
                c5855 = c19823.f17958;
            }
        }
        return c17019;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17019 m39977(int i, InterfaceC10795 interfaceC10795) {
        int iM39980 = m39980(interfaceC10795);
        if (iM39980 >= 0) {
            return new C17019((char) iM39980, i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            if (interfaceC10795.mo2465(i3) && (i2 = i2 + 1) > 16) {
                return null;
            }
        }
        if (i2 == 0) {
            return null;
        }
        return new C17019(i, interfaceC10795);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39976(C19822 c19822) {
        return m39980(c19822.f75432);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m39980(InterfaceC10795 interfaceC10795) {
        if (interfaceC10795 instanceof C20548) {
            return ((C20548) interfaceC10795).f66198;
        }
        return -1;
    }
}
