package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes2.dex */
public final class C3649 {

    /* JADX INFO: renamed from: ֫ */
    public final C16587 f7662;

    /* JADX INFO: renamed from: ܳ */
    public C1419 f7664 = new C1419(30);

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f7667 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f7666 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public int f7663 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final C11224 f7665 = new C11224(this);

    public C3649(C16587 c16587) {
        this.f7662 = c16587;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m6945() {
        m6936(this.f7667);
        m6936(this.f7666);
        this.f7663 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0176  */
    /* JADX WARN: Code duplicated, block: B:104:0x0184  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:199:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0155  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX INFO: renamed from: ᩳ */
    public final void m6946() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        byte b;
        C7673 c7673M6934;
        int i4;
        int i5;
        int i6;
        C7673 c7673M6935;
        boolean z2;
        boolean z3;
        Object obj;
        C7673 c7673M6936;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C11224 c11224 = this.f7665;
        c11224.getClass();
        while (true) {
            arrayList = this.f7667;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C7673) arrayList.get(size)).f20122 != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            i2 = 2;
            i3 = 4;
            if (size == -1) {
                break;
            }
            int i15 = size + 1;
            C3649 c3649 = c11224.f31217;
            C1419 c1419 = c3649.f7664;
            C7673 c7673 = (C7673) arrayList.get(size);
            C7673 c7674 = (C7673) arrayList.get(i15);
            int i16 = c7674.f20122;
            if (i16 == 1) {
                int i17 = c7673.f20123;
                int i18 = c7674.f20125;
                int i19 = i17 < i18 ? -1 : 0;
                int i20 = c7673.f20125;
                if (i20 < i18) {
                    i19++;
                }
                if (i18 <= i20) {
                    c7673.f20125 = i20 + c7674.f20123;
                }
                int i21 = c7674.f20125;
                if (i21 <= i17) {
                    c7673.f20123 = i17 + c7674.f20123;
                }
                c7674.f20125 = i21 + i19;
                arrayList.set(size, c7674);
                arrayList.set(i15, c7673);
            } else if (i16 == 2) {
                int i22 = c7673.f20125;
                int i23 = c7673.f20123;
                if (i22 < i23) {
                    z2 = c7674.f20125 == i22 && c7674.f20123 == i23 - i22;
                    z3 = false;
                } else {
                    z2 = c7674.f20125 == i23 + 1 && c7674.f20123 == i22 - i23;
                    z3 = true;
                }
                int i24 = c7674.f20125;
                if (i23 < i24) {
                    c7674.f20125 = i24 - 1;
                } else {
                    int i25 = c7674.f20123;
                    if (i23 < i24 + i25) {
                        c7674.f20123 = i25 - 1;
                        c7673.f20122 = 2;
                        c7673.f20123 = 1;
                        if (c7674.f20123 == 0) {
                            arrayList.remove(i15);
                            c7674.f20124 = null;
                            c1419.mo18733(c7674);
                        }
                    }
                }
                int i26 = c7673.f20125;
                int i27 = c7674.f20125;
                if (i26 <= i27) {
                    c7674.f20125 = i27 + 1;
                } else {
                    int i28 = i27 + c7674.f20123;
                    if (i26 < i28) {
                        obj = null;
                        c7673M6936 = c3649.m6934(null, 2, i26 + 1, i28 - i26);
                        c7674.f20123 = c7673.f20125 - c7674.f20125;
                    }
                    if (z2) {
                        arrayList.set(size, c7674);
                        arrayList.remove(i15);
                        c7673.f20124 = obj;
                        c1419.mo18733(c7673);
                    } else {
                        if (z3) {
                            if (c7673M6936 != null) {
                                i13 = c7673.f20125;
                                if (i13 > c7673M6936.f20125) {
                                    c7673.f20125 = i13 - c7673M6936.f20123;
                                }
                                i14 = c7673.f20123;
                                if (i14 > c7673M6936.f20125) {
                                    c7673.f20123 = i14 - c7673M6936.f20123;
                                }
                            }
                            i11 = c7673.f20125;
                            if (i11 > c7674.f20125) {
                                c7673.f20125 = i11 - c7674.f20123;
                            }
                            i12 = c7673.f20123;
                            if (i12 > c7674.f20125) {
                                c7673.f20123 = i12 - c7674.f20123;
                            }
                        } else {
                            if (c7673M6936 != null) {
                                i9 = c7673.f20125;
                                if (i9 >= c7673M6936.f20125) {
                                    c7673.f20125 = i9 - c7673M6936.f20123;
                                }
                                i10 = c7673.f20123;
                                if (i10 >= c7673M6936.f20125) {
                                    c7673.f20123 = i10 - c7673M6936.f20123;
                                }
                            }
                            i7 = c7673.f20125;
                            if (i7 >= c7674.f20125) {
                                c7673.f20125 = i7 - c7674.f20123;
                            }
                            i8 = c7673.f20123;
                            if (i8 >= c7674.f20125) {
                                c7673.f20123 = i8 - c7674.f20123;
                            }
                        }
                        arrayList.set(size, c7674);
                        if (c7673.f20125 != c7673.f20123) {
                            arrayList.set(i15, c7673);
                        } else {
                            arrayList.remove(i15);
                        }
                        if (c7673M6936 != null) {
                            arrayList.add(size, c7673M6936);
                        }
                    }
                }
                obj = null;
                c7673M6936 = null;
                if (z2) {
                    arrayList.set(size, c7674);
                    arrayList.remove(i15);
                    c7673.f20124 = obj;
                    c1419.mo18733(c7673);
                } else {
                    if (z3) {
                        if (c7673M6936 != null) {
                            i13 = c7673.f20125;
                            if (i13 > c7673M6936.f20125) {
                                c7673.f20125 = i13 - c7673M6936.f20123;
                            }
                            i14 = c7673.f20123;
                            if (i14 > c7673M6936.f20125) {
                                c7673.f20123 = i14 - c7673M6936.f20123;
                            }
                        }
                        i11 = c7673.f20125;
                        if (i11 > c7674.f20125) {
                            c7673.f20125 = i11 - c7674.f20123;
                        }
                        i12 = c7673.f20123;
                        if (i12 > c7674.f20125) {
                            c7673.f20123 = i12 - c7674.f20123;
                        }
                    } else {
                        if (c7673M6936 != null) {
                            i9 = c7673.f20125;
                            if (i9 >= c7673M6936.f20125) {
                                c7673.f20125 = i9 - c7673M6936.f20123;
                            }
                            i10 = c7673.f20123;
                            if (i10 >= c7673M6936.f20125) {
                                c7673.f20123 = i10 - c7673M6936.f20123;
                            }
                        }
                        i7 = c7673.f20125;
                        if (i7 >= c7674.f20125) {
                            c7673.f20125 = i7 - c7674.f20123;
                        }
                        i8 = c7673.f20123;
                        if (i8 >= c7674.f20125) {
                            c7673.f20123 = i8 - c7674.f20123;
                        }
                    }
                    arrayList.set(size, c7674);
                    if (c7673.f20125 != c7673.f20123) {
                        arrayList.set(i15, c7673);
                    } else {
                        arrayList.remove(i15);
                    }
                    if (c7673M6936 != null) {
                        arrayList.add(size, c7673M6936);
                    }
                }
            } else if (i16 == 4) {
                int i29 = c7673.f20123;
                int i30 = c7674.f20125;
                if (i29 < i30) {
                    c7674.f20125 = i30 - 1;
                } else {
                    int i31 = c7674.f20123;
                    if (i29 < i30 + i31) {
                        c7674.f20123 = i31 - 1;
                        c7673M6934 = c3649.m6934(c7674.f20124, 4, c7673.f20125, 1);
                    }
                    i4 = c7673.f20125;
                    i5 = c7674.f20125;
                    if (i4 <= i5) {
                        c7674.f20125 = i5 + 1;
                    } else {
                        i6 = i5 + c7674.f20123;
                        if (i4 < i6) {
                            int i32 = i6 - i4;
                            c7673M6935 = c3649.m6934(c7674.f20124, 4, i4 + 1, i32);
                            c7674.f20123 -= i32;
                        }
                        arrayList.set(i15, c7673);
                        if (c7674.f20123 > 0) {
                            arrayList.set(size, c7674);
                        } else {
                            arrayList.remove(size);
                            c7674.f20124 = null;
                            c1419.mo18733(c7674);
                        }
                        if (c7673M6934 != null) {
                            arrayList.add(size, c7673M6934);
                        }
                        if (c7673M6935 != null) {
                            arrayList.add(size, c7673M6935);
                        }
                    }
                    c7673M6935 = null;
                    arrayList.set(i15, c7673);
                    if (c7674.f20123 > 0) {
                        arrayList.set(size, c7674);
                    } else {
                        arrayList.remove(size);
                        c7674.f20124 = null;
                        c1419.mo18733(c7674);
                    }
                    if (c7673M6934 != null) {
                        arrayList.add(size, c7673M6934);
                    }
                    if (c7673M6935 != null) {
                        arrayList.add(size, c7673M6935);
                    }
                }
                c7673M6934 = null;
                i4 = c7673.f20125;
                i5 = c7674.f20125;
                if (i4 <= i5) {
                    c7674.f20125 = i5 + 1;
                } else {
                    i6 = i5 + c7674.f20123;
                    if (i4 < i6) {
                        int i33 = i6 - i4;
                        c7673M6935 = c3649.m6934(c7674.f20124, 4, i4 + 1, i33);
                        c7674.f20123 -= i33;
                    }
                    arrayList.set(i15, c7673);
                    if (c7674.f20123 > 0) {
                        arrayList.set(size, c7674);
                    } else {
                        arrayList.remove(size);
                        c7674.f20124 = null;
                        c1419.mo18733(c7674);
                    }
                    if (c7673M6934 != null) {
                        arrayList.add(size, c7673M6934);
                    }
                    if (c7673M6935 != null) {
                        arrayList.add(size, c7673M6935);
                    }
                }
                c7673M6935 = null;
                arrayList.set(i15, c7673);
                if (c7674.f20123 > 0) {
                    arrayList.set(size, c7674);
                } else {
                    arrayList.remove(size);
                    c7674.f20124 = null;
                    c1419.mo18733(c7674);
                }
                if (c7673M6934 != null) {
                    arrayList.add(size, c7673M6934);
                }
                if (c7673M6935 != null) {
                    arrayList.add(size, c7673M6935);
                }
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C7673 c7673M6937 = (C7673) arrayList.get(i34);
            int i35 = c7673M6937.f20122;
            if (i35 != 1) {
                C1419 c14110 = this.f7664;
                C16587 c16587 = this.f7662;
                if (i35 == i2) {
                    int i36 = c7673M6937.f20125;
                    int i37 = c7673M6937.f20123 + i36;
                    int i38 = 0;
                    byte b2 = -1;
                    int i39 = i36;
                    while (i39 < i37) {
                        C14849 c14849 = c16587.f48726;
                        AbstractC5462 abstractC5462FindViewHolderForPosition = c14849.findViewHolderForPosition(i39, true);
                        if (abstractC5462FindViewHolderForPosition == null) {
                            abstractC5462FindViewHolderForPosition = null;
                        } else {
                            if (c14849.mChildHelper.f75584.contains(abstractC5462FindViewHolderForPosition.itemView)) {
                                int i40 = C14849.HORIZONTAL;
                                abstractC5462FindViewHolderForPosition = null;
                            }
                        }
                        if (abstractC5462FindViewHolderForPosition != null || m6931(i39)) {
                            if (b2 == 0) {
                                m6929(m6934(null, 2, i36, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                m6930(m6934(null, 2, i36, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 0;
                        }
                        if (z) {
                            i39 -= i38;
                            i37 -= i38;
                            i38 = 1;
                        } else {
                            i38++;
                        }
                        i39++;
                        b2 = b;
                    }
                    if (i38 != c7673M6937.f20123) {
                        c7673M6937.f20124 = null;
                        c14110.mo18733(c7673M6937);
                        c7673M6937 = m6934(null, 2, i36, i38);
                    }
                    if (b2 == 0) {
                        m6929(c7673M6937);
                    } else {
                        m6930(c7673M6937);
                    }
                } else if (i35 == i3) {
                    int i41 = c7673M6937.f20125;
                    int i42 = c7673M6937.f20123 + i41;
                    int i43 = i41;
                    byte b3 = -1;
                    int i44 = 0;
                    while (i41 < i42) {
                        C14849 c148410 = c16587.f48726;
                        AbstractC5462 abstractC5462FindViewHolderForPosition2 = c148410.findViewHolderForPosition(i41, true);
                        if (abstractC5462FindViewHolderForPosition2 == null) {
                            abstractC5462FindViewHolderForPosition2 = null;
                        } else {
                            if (c148410.mChildHelper.f75584.contains(abstractC5462FindViewHolderForPosition2.itemView)) {
                                int i45 = C14849.HORIZONTAL;
                                abstractC5462FindViewHolderForPosition2 = null;
                            }
                        }
                        if (abstractC5462FindViewHolderForPosition2 != null || m6931(i41)) {
                            if (b3 == 0) {
                                m6929(m6934(c7673M6937.f20124, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                m6930(m6934(c7673M6937.f20124, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 0;
                        }
                        i44++;
                        i41++;
                    }
                    if (i44 != c7673M6937.f20123) {
                        Object obj2 = c7673M6937.f20124;
                        c7673M6937.f20124 = null;
                        c14110.mo18733(c7673M6937);
                        c7673M6937 = m6934(obj2, 4, i43, i44);
                    }
                    if (b3 == 0) {
                        m6929(c7673M6937);
                    } else {
                        m6930(c7673M6937);
                    }
                } else if (i35 == i) {
                    m6930(c7673M6937);
                }
            } else {
                m6930(c7673M6937);
            }
            i34++;
            i = 8;
            i2 = 2;
            i3 = 4;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6935() {
        ArrayList arrayList = this.f7666;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f7662.m37589((C7673) arrayList.get(i));
        }
        m6936(arrayList);
        this.f7663 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6929(C7673 c7673) {
        int i;
        C1419 c1419;
        int i2 = c7673.f20122;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM6932 = m6932(c7673.f20125, i2);
        int i3 = c7673.f20125;
        int i4 = c7673.f20122;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c7673);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c7673.f20123;
            c1419 = this.f7664;
            if (i5 >= i7) {
                break;
            }
            int iM6933 = m6932((i * i5) + c7673.f20125, c7673.f20122);
            int i8 = c7673.f20122;
            if (i8 == 2 ? iM6933 != iM6932 : !(i8 == 4 && iM6933 == iM6932 + 1)) {
                C7673 c7673M6934 = m6934(c7673.f20124, i8, iM6932, i6);
                m6937(c7673M6934, i3);
                c7673M6934.f20124 = null;
                c1419.mo18733(c7673M6934);
                if (c7673.f20122 == 4) {
                    i3 += i6;
                }
                iM6932 = iM6933;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c7673.f20124;
        c7673.f20124 = null;
        c1419.mo18733(c7673);
        if (i6 > 0) {
            C7673 c7673M6935 = m6934(obj, c7673.f20122, iM6932, i6);
            m6937(c7673M6935, i3);
            c7673M6935.f20124 = null;
            c1419.mo18733(c7673M6935);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m6932(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f7666;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C7673 c7673 = (C7673) arrayList.get(size);
            int i5 = c7673.f20122;
            if (i5 == 8) {
                int i6 = c7673.f20125;
                int i7 = c7673.f20123;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c7673.f20125 = i6 + 1;
                            c7673.f20123 = i7 + 1;
                        } else if (i2 == 2) {
                            c7673.f20125 = i6 - 1;
                            c7673.f20123 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c7673.f20123 = i7 + 1;
                    } else if (i2 == 2) {
                        c7673.f20123 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c7673.f20125 = i6 + 1;
                    } else if (i2 == 2) {
                        c7673.f20125 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c7673.f20125;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c7673.f20123;
                    } else if (i5 == 2) {
                        i += c7673.f20123;
                    }
                } else if (i2 == 1) {
                    c7673.f20125 = i8 + 1;
                } else if (i2 == 2) {
                    c7673.f20125 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C7673 c7674 = (C7673) arrayList.get(size2);
            int i9 = c7674.f20122;
            C1419 c1419 = this.f7664;
            if (i9 == 8) {
                int i10 = c7674.f20123;
                if (i10 == c7674.f20125 || i10 < 0) {
                    arrayList.remove(size2);
                    c7674.f20124 = null;
                    c1419.mo18733(c7674);
                }
            } else if (c7674.f20123 <= 0) {
                arrayList.remove(size2);
                c7674.f20124 = null;
                c1419.mo18733(c7674);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m6931(int i) {
        ArrayList arrayList = this.f7666;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7673 c7673 = (C7673) arrayList.get(i2);
            int i3 = c7673.f20122;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c7673.f20125;
                    int i5 = c7673.f20123 + i4;
                    while (i4 < i5) {
                        if (m6933(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m6933(c7673.f20123, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m6930(C7673 c7673) {
        this.f7666.add(c7673);
        int i = c7673.f20122;
        C16587 c16587 = this.f7662;
        if (i == 1) {
            int i2 = c7673.f20125;
            int i3 = c7673.f20123;
            C14849 c14849 = c16587.f48726;
            c14849.offsetPositionRecordsForInsert(i2, i3);
            c14849.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c7673.f20125;
            int i5 = c7673.f20123;
            C14849 c148410 = c16587.f48726;
            c148410.offsetPositionRecordsForRemove(i4, i5, false);
            c148410.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c7673.f20125;
            int i7 = c7673.f20123;
            Object obj = c7673.f20124;
            C14849 c148411 = c16587.f48726;
            c148411.viewRangeUpdate(i6, i7, obj);
            c148411.mItemsChanged = true;
            return;
        }
        if (i == 8) {
            int i8 = c7673.f20125;
            int i9 = c7673.f20123;
            C14849 c148412 = c16587.f48726;
            c148412.offsetPositionRecordsForMove(i8, i9);
            c148412.mItemsAddedOrRemoved = true;
            return;
        }
        throw new IllegalArgumentException("Unknown update op type for " + c7673);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m6943() {
        return this.f7667.size() > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6938(int i) {
        return (i & this.f7663) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m6933(int i, int i2) {
        ArrayList arrayList = this.f7666;
        int size = arrayList.size();
        while (i2 < size) {
            C7673 c7673 = (C7673) arrayList.get(i2);
            int i3 = c7673.f20122;
            if (i3 == 8) {
                int i4 = c7673.f20125;
                if (i4 == i) {
                    i = c7673.f20123;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c7673.f20123 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c7673.f20125;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c7673.f20123;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c7673.f20123;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6940(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        C7673 c7673M6934 = m6934(obj, 4, i, i2);
        ArrayList arrayList = this.f7667;
        arrayList.add(c7673M6934);
        this.f7663 |= 4;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m6942(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C7673 c7673M6934 = m6934(null, 1, i, i2);
        ArrayList arrayList = this.f7667;
        arrayList.add(c7673M6934);
        this.f7663 |= 1;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m6944(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C7673 c7673M6934 = m6934(null, 2, i, i2);
        ArrayList arrayList = this.f7667;
        arrayList.add(c7673M6934);
        this.f7663 |= 2;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6939(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        C7673 c7673M6934 = m6934(null, 8, i, i2);
        ArrayList arrayList = this.f7667;
        arrayList.add(c7673M6934);
        this.f7663 |= 8;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6941() {
        m6935();
        ArrayList arrayList = this.f7667;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7673 c7673 = (C7673) arrayList.get(i);
            int i2 = c7673.f20122;
            C16587 c16587 = this.f7662;
            if (i2 == 1) {
                c16587.m37589(c7673);
                int i3 = c7673.f20125;
                int i4 = c7673.f20123;
                C14849 c14849 = c16587.f48726;
                c14849.offsetPositionRecordsForInsert(i3, i4);
                c14849.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                c16587.m37589(c7673);
                int i5 = c7673.f20125;
                int i6 = c7673.f20123;
                C14849 c148410 = c16587.f48726;
                c148410.offsetPositionRecordsForRemove(i5, i6, true);
                c148410.mItemsAddedOrRemoved = true;
                c148410.mState.f72053 += i6;
            } else if (i2 == 4) {
                c16587.m37589(c7673);
                int i7 = c7673.f20125;
                int i8 = c7673.f20123;
                Object obj = c7673.f20124;
                C14849 c148411 = c16587.f48726;
                c148411.viewRangeUpdate(i7, i8, obj);
                c148411.mItemsChanged = true;
            } else if (i2 == 8) {
                c16587.m37589(c7673);
                int i9 = c7673.f20125;
                int i10 = c7673.f20123;
                C14849 c148412 = c16587.f48726;
                c148412.offsetPositionRecordsForMove(i9, i10);
                c148412.mItemsAddedOrRemoved = true;
            }
        }
        m6936(arrayList);
        this.f7663 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7673 m6934(Object obj, int i, int i2, int i3) {
        C7673 c7673 = (C7673) this.f7664.mo18732();
        if (c7673 == null) {
            C7673 c7674 = new C7673();
            c7674.f20122 = i;
            c7674.f20125 = i2;
            c7674.f20123 = i3;
            c7674.f20124 = obj;
            return c7674;
        }
        c7673.f20122 = i;
        c7673.f20125 = i2;
        c7673.f20123 = i3;
        c7673.f20124 = obj;
        return c7673;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6936(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7673 c7673 = (C7673) arrayList.get(i);
            c7673.f20124 = null;
            this.f7664.mo18733(c7673);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6937(C7673 c7673, int i) {
        C16587 c16587 = this.f7662;
        c16587.m37589(c7673);
        int i2 = c7673.f20122;
        if (i2 == 2) {
            int i3 = c7673.f20123;
            C14849 c14849 = c16587.f48726;
            c14849.offsetPositionRecordsForRemove(i, i3, true);
            c14849.mItemsAddedOrRemoved = true;
            c14849.mState.f72053 += i3;
            return;
        }
        if (i2 == 4) {
            int i4 = c7673.f20123;
            Object obj = c7673.f20124;
            C14849 c148410 = c16587.f48726;
            c148410.viewRangeUpdate(i, i4, obj);
            c148410.mItemsChanged = true;
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
}
