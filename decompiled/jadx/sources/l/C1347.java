package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1347 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14961 f4892;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11631 f4894 = new C11631(30);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4897 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4896 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4893 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9318 f4895 = new C9318(this);

    public C1347(C14961 c14961) {
        this.f4892 = c14961;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m4713() {
        m4704(this.f4897);
        m4704(this.f4896);
        this.f4893 = 0;
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4714() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        byte b;
        C5581 c5581M4702;
        int i4;
        int i5;
        int i6;
        C5581 c5581M4703;
        boolean z2;
        boolean z3;
        Object obj;
        C5581 c5581M4704;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C9318 c9318 = this.f4895;
        c9318.getClass();
        while (true) {
            arrayList = this.f4897;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C5581) arrayList.get(size)).f17282 != 8) {
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
            C1347 c1347 = c9318.f28268;
            C11631 c11631 = c1347.f4894;
            C5581 c5581 = (C5581) arrayList.get(size);
            C5581 c5582 = (C5581) arrayList.get(i15);
            int i16 = c5582.f17282;
            if (i16 == 1) {
                int i17 = c5581.f17283;
                int i18 = c5582.f17285;
                int i19 = i17 < i18 ? -1 : 0;
                int i20 = c5581.f17285;
                if (i20 < i18) {
                    i19++;
                }
                if (i18 <= i20) {
                    c5581.f17285 = i20 + c5582.f17283;
                }
                int i21 = c5582.f17285;
                if (i21 <= i17) {
                    c5581.f17283 = i17 + c5582.f17283;
                }
                c5582.f17285 = i21 + i19;
                arrayList.set(size, c5582);
                arrayList.set(i15, c5581);
            } else if (i16 == 2) {
                int i22 = c5581.f17285;
                int i23 = c5581.f17283;
                if (i22 < i23) {
                    z2 = c5582.f17285 == i22 && c5582.f17283 == i23 - i22;
                    z3 = false;
                } else {
                    z2 = c5582.f17285 == i23 + 1 && c5582.f17283 == i22 - i23;
                    z3 = true;
                }
                int i24 = c5582.f17285;
                if (i23 < i24) {
                    c5582.f17285 = i24 - 1;
                } else {
                    int i25 = c5582.f17283;
                    if (i23 < i24 + i25) {
                        c5582.f17283 = i25 - 1;
                        c5581.f17282 = 2;
                        c5581.f17283 = 1;
                        if (c5582.f17283 == 0) {
                            arrayList.remove(i15);
                            c5582.f17284 = null;
                            c11631.mo16807(c5582);
                        }
                    }
                }
                int i26 = c5581.f17285;
                int i27 = c5582.f17285;
                if (i26 <= i27) {
                    c5582.f17285 = i27 + 1;
                } else {
                    int i28 = i27 + c5582.f17283;
                    if (i26 < i28) {
                        obj = null;
                        c5581M4704 = c1347.m4702(null, 2, i26 + 1, i28 - i26);
                        c5582.f17283 = c5581.f17285 - c5582.f17285;
                    }
                    if (z2) {
                        arrayList.set(size, c5582);
                        arrayList.remove(i15);
                        c5581.f17284 = obj;
                        c11631.mo16807(c5581);
                    } else {
                        if (z3) {
                            if (c5581M4704 != null) {
                                i13 = c5581.f17285;
                                if (i13 > c5581M4704.f17285) {
                                    c5581.f17285 = i13 - c5581M4704.f17283;
                                }
                                i14 = c5581.f17283;
                                if (i14 > c5581M4704.f17285) {
                                    c5581.f17283 = i14 - c5581M4704.f17283;
                                }
                            }
                            i11 = c5581.f17285;
                            if (i11 > c5582.f17285) {
                                c5581.f17285 = i11 - c5582.f17283;
                            }
                            i12 = c5581.f17283;
                            if (i12 > c5582.f17285) {
                                c5581.f17283 = i12 - c5582.f17283;
                            }
                        } else {
                            if (c5581M4704 != null) {
                                i9 = c5581.f17285;
                                if (i9 >= c5581M4704.f17285) {
                                    c5581.f17285 = i9 - c5581M4704.f17283;
                                }
                                i10 = c5581.f17283;
                                if (i10 >= c5581M4704.f17285) {
                                    c5581.f17283 = i10 - c5581M4704.f17283;
                                }
                            }
                            i7 = c5581.f17285;
                            if (i7 >= c5582.f17285) {
                                c5581.f17285 = i7 - c5582.f17283;
                            }
                            i8 = c5581.f17283;
                            if (i8 >= c5582.f17285) {
                                c5581.f17283 = i8 - c5582.f17283;
                            }
                        }
                        arrayList.set(size, c5582);
                        if (c5581.f17285 != c5581.f17283) {
                            arrayList.set(i15, c5581);
                        } else {
                            arrayList.remove(i15);
                        }
                        if (c5581M4704 != null) {
                            arrayList.add(size, c5581M4704);
                        }
                    }
                }
                obj = null;
                c5581M4704 = null;
                if (z2) {
                    arrayList.set(size, c5582);
                    arrayList.remove(i15);
                    c5581.f17284 = obj;
                    c11631.mo16807(c5581);
                } else {
                    if (z3) {
                        if (c5581M4704 != null) {
                            i13 = c5581.f17285;
                            if (i13 > c5581M4704.f17285) {
                                c5581.f17285 = i13 - c5581M4704.f17283;
                            }
                            i14 = c5581.f17283;
                            if (i14 > c5581M4704.f17285) {
                                c5581.f17283 = i14 - c5581M4704.f17283;
                            }
                        }
                        i11 = c5581.f17285;
                        if (i11 > c5582.f17285) {
                            c5581.f17285 = i11 - c5582.f17283;
                        }
                        i12 = c5581.f17283;
                        if (i12 > c5582.f17285) {
                            c5581.f17283 = i12 - c5582.f17283;
                        }
                    } else {
                        if (c5581M4704 != null) {
                            i9 = c5581.f17285;
                            if (i9 >= c5581M4704.f17285) {
                                c5581.f17285 = i9 - c5581M4704.f17283;
                            }
                            i10 = c5581.f17283;
                            if (i10 >= c5581M4704.f17285) {
                                c5581.f17283 = i10 - c5581M4704.f17283;
                            }
                        }
                        i7 = c5581.f17285;
                        if (i7 >= c5582.f17285) {
                            c5581.f17285 = i7 - c5582.f17283;
                        }
                        i8 = c5581.f17283;
                        if (i8 >= c5582.f17285) {
                            c5581.f17283 = i8 - c5582.f17283;
                        }
                    }
                    arrayList.set(size, c5582);
                    if (c5581.f17285 != c5581.f17283) {
                        arrayList.set(i15, c5581);
                    } else {
                        arrayList.remove(i15);
                    }
                    if (c5581M4704 != null) {
                        arrayList.add(size, c5581M4704);
                    }
                }
            } else if (i16 == 4) {
                int i29 = c5581.f17283;
                int i30 = c5582.f17285;
                if (i29 < i30) {
                    c5582.f17285 = i30 - 1;
                } else {
                    int i31 = c5582.f17283;
                    if (i29 < i30 + i31) {
                        c5582.f17283 = i31 - 1;
                        c5581M4702 = c1347.m4702(c5582.f17284, 4, c5581.f17285, 1);
                    }
                    i4 = c5581.f17285;
                    i5 = c5582.f17285;
                    if (i4 <= i5) {
                        c5582.f17285 = i5 + 1;
                    } else {
                        i6 = i5 + c5582.f17283;
                        if (i4 < i6) {
                            int i32 = i6 - i4;
                            c5581M4703 = c1347.m4702(c5582.f17284, 4, i4 + 1, i32);
                            c5582.f17283 -= i32;
                        }
                        arrayList.set(i15, c5581);
                        if (c5582.f17283 > 0) {
                            arrayList.set(size, c5582);
                        } else {
                            arrayList.remove(size);
                            c5582.f17284 = null;
                            c11631.mo16807(c5582);
                        }
                        if (c5581M4702 != null) {
                            arrayList.add(size, c5581M4702);
                        }
                        if (c5581M4703 != null) {
                            arrayList.add(size, c5581M4703);
                        }
                    }
                    c5581M4703 = null;
                    arrayList.set(i15, c5581);
                    if (c5582.f17283 > 0) {
                        arrayList.set(size, c5582);
                    } else {
                        arrayList.remove(size);
                        c5582.f17284 = null;
                        c11631.mo16807(c5582);
                    }
                    if (c5581M4702 != null) {
                        arrayList.add(size, c5581M4702);
                    }
                    if (c5581M4703 != null) {
                        arrayList.add(size, c5581M4703);
                    }
                }
                c5581M4702 = null;
                i4 = c5581.f17285;
                i5 = c5582.f17285;
                if (i4 <= i5) {
                    c5582.f17285 = i5 + 1;
                } else {
                    i6 = i5 + c5582.f17283;
                    if (i4 < i6) {
                        int i33 = i6 - i4;
                        c5581M4703 = c1347.m4702(c5582.f17284, 4, i4 + 1, i33);
                        c5582.f17283 -= i33;
                    }
                    arrayList.set(i15, c5581);
                    if (c5582.f17283 > 0) {
                        arrayList.set(size, c5582);
                    } else {
                        arrayList.remove(size);
                        c5582.f17284 = null;
                        c11631.mo16807(c5582);
                    }
                    if (c5581M4702 != null) {
                        arrayList.add(size, c5581M4702);
                    }
                    if (c5581M4703 != null) {
                        arrayList.add(size, c5581M4703);
                    }
                }
                c5581M4703 = null;
                arrayList.set(i15, c5581);
                if (c5582.f17283 > 0) {
                    arrayList.set(size, c5582);
                } else {
                    arrayList.remove(size);
                    c5582.f17284 = null;
                    c11631.mo16807(c5582);
                }
                if (c5581M4702 != null) {
                    arrayList.add(size, c5581M4702);
                }
                if (c5581M4703 != null) {
                    arrayList.add(size, c5581M4703);
                }
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C5581 c5581M4705 = (C5581) arrayList.get(i34);
            int i35 = c5581M4705.f17282;
            if (i35 != 1) {
                C11631 c11632 = this.f4894;
                C14961 c14961 = this.f4892;
                if (i35 == i2) {
                    int i36 = c5581M4705.f17285;
                    int i37 = c5581M4705.f17283 + i36;
                    int i38 = 0;
                    byte b2 = -1;
                    int i39 = i36;
                    while (i39 < i37) {
                        C13132 c13132 = c14961.f45614;
                        AbstractC3255 abstractC3255FindViewHolderForPosition = c13132.findViewHolderForPosition(i39, true);
                        if (abstractC3255FindViewHolderForPosition == null) {
                            abstractC3255FindViewHolderForPosition = null;
                        } else {
                            if (c13132.mChildHelper.f72858.contains(abstractC3255FindViewHolderForPosition.itemView)) {
                                int i40 = C13132.HORIZONTAL;
                                abstractC3255FindViewHolderForPosition = null;
                            }
                        }
                        if (abstractC3255FindViewHolderForPosition != null || m4699(i39)) {
                            if (b2 == 0) {
                                m4697(m4702(null, 2, i36, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                m4698(m4702(null, 2, i36, i38));
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
                    if (i38 != c5581M4705.f17283) {
                        c5581M4705.f17284 = null;
                        c11632.mo16807(c5581M4705);
                        c5581M4705 = m4702(null, 2, i36, i38);
                    }
                    if (b2 == 0) {
                        m4697(c5581M4705);
                    } else {
                        m4698(c5581M4705);
                    }
                } else if (i35 == i3) {
                    int i41 = c5581M4705.f17285;
                    int i42 = c5581M4705.f17283 + i41;
                    int i43 = i41;
                    byte b3 = -1;
                    int i44 = 0;
                    while (i41 < i42) {
                        C13132 c13133 = c14961.f45614;
                        AbstractC3255 abstractC3255FindViewHolderForPosition2 = c13133.findViewHolderForPosition(i41, true);
                        if (abstractC3255FindViewHolderForPosition2 == null) {
                            abstractC3255FindViewHolderForPosition2 = null;
                        } else {
                            if (c13133.mChildHelper.f72858.contains(abstractC3255FindViewHolderForPosition2.itemView)) {
                                int i45 = C13132.HORIZONTAL;
                                abstractC3255FindViewHolderForPosition2 = null;
                            }
                        }
                        if (abstractC3255FindViewHolderForPosition2 != null || m4699(i41)) {
                            if (b3 == 0) {
                                m4697(m4702(c5581M4705.f17284, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                m4698(m4702(c5581M4705.f17284, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 0;
                        }
                        i44++;
                        i41++;
                    }
                    if (i44 != c5581M4705.f17283) {
                        Object obj2 = c5581M4705.f17284;
                        c5581M4705.f17284 = null;
                        c11632.mo16807(c5581M4705);
                        c5581M4705 = m4702(obj2, 4, i43, i44);
                    }
                    if (b3 == 0) {
                        m4697(c5581M4705);
                    } else {
                        m4698(c5581M4705);
                    }
                } else if (i35 == i) {
                    m4698(c5581M4705);
                }
            } else {
                m4698(c5581M4705);
            }
            i34++;
            i = 8;
            i2 = 2;
            i3 = 4;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4703() {
        ArrayList arrayList = this.f4896;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f4892.m35437((C5581) arrayList.get(i));
        }
        m4704(arrayList);
        this.f4893 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4697(C5581 c5581) {
        int i;
        C11631 c11631;
        int i2 = c5581.f17282;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM4700 = m4700(c5581.f17285, i2);
        int i3 = c5581.f17285;
        int i4 = c5581.f17282;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c5581);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c5581.f17283;
            c11631 = this.f4894;
            if (i5 >= i7) {
                break;
            }
            int iM4701 = m4700((i * i5) + c5581.f17285, c5581.f17282);
            int i8 = c5581.f17282;
            if (i8 == 2 ? iM4701 != iM4700 : !(i8 == 4 && iM4701 == iM4700 + 1)) {
                C5581 c5581M4702 = m4702(c5581.f17284, i8, iM4700, i6);
                m4705(c5581M4702, i3);
                c5581M4702.f17284 = null;
                c11631.mo16807(c5581M4702);
                if (c5581.f17282 == 4) {
                    i3 += i6;
                }
                iM4700 = iM4701;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c5581.f17284;
        c5581.f17284 = null;
        c11631.mo16807(c5581);
        if (i6 > 0) {
            C5581 c5581M4703 = m4702(obj, c5581.f17282, iM4700, i6);
            m4705(c5581M4703, i3);
            c5581M4703.f17284 = null;
            c11631.mo16807(c5581M4703);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m4700(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f4896;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5581 c5581 = (C5581) arrayList.get(size);
            int i5 = c5581.f17282;
            if (i5 == 8) {
                int i6 = c5581.f17285;
                int i7 = c5581.f17283;
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
                            c5581.f17285 = i6 + 1;
                            c5581.f17283 = i7 + 1;
                        } else if (i2 == 2) {
                            c5581.f17285 = i6 - 1;
                            c5581.f17283 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c5581.f17283 = i7 + 1;
                    } else if (i2 == 2) {
                        c5581.f17283 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c5581.f17285 = i6 + 1;
                    } else if (i2 == 2) {
                        c5581.f17285 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c5581.f17285;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c5581.f17283;
                    } else if (i5 == 2) {
                        i += c5581.f17283;
                    }
                } else if (i2 == 1) {
                    c5581.f17285 = i8 + 1;
                } else if (i2 == 2) {
                    c5581.f17285 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C5581 c5582 = (C5581) arrayList.get(size2);
            int i9 = c5582.f17282;
            C11631 c11631 = this.f4894;
            if (i9 == 8) {
                int i10 = c5582.f17283;
                if (i10 == c5582.f17285 || i10 < 0) {
                    arrayList.remove(size2);
                    c5582.f17284 = null;
                    c11631.mo16807(c5582);
                }
            } else if (c5582.f17283 <= 0) {
                arrayList.remove(size2);
                c5582.f17284 = null;
                c11631.mo16807(c5582);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m4699(int i) {
        ArrayList arrayList = this.f4896;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5581 c5581 = (C5581) arrayList.get(i2);
            int i3 = c5581.f17282;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c5581.f17285;
                    int i5 = c5581.f17283 + i4;
                    while (i4 < i5) {
                        if (m4701(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m4701(c5581.f17283, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m4698(C5581 c5581) {
        this.f4896.add(c5581);
        int i = c5581.f17282;
        C14961 c14961 = this.f4892;
        if (i == 1) {
            int i2 = c5581.f17285;
            int i3 = c5581.f17283;
            C13132 c13132 = c14961.f45614;
            c13132.offsetPositionRecordsForInsert(i2, i3);
            c13132.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c5581.f17285;
            int i5 = c5581.f17283;
            C13132 c13133 = c14961.f45614;
            c13133.offsetPositionRecordsForRemove(i4, i5, false);
            c13133.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c5581.f17285;
            int i7 = c5581.f17283;
            Object obj = c5581.f17284;
            C13132 c13134 = c14961.f45614;
            c13134.viewRangeUpdate(i6, i7, obj);
            c13134.mItemsChanged = true;
            return;
        }
        if (i == 8) {
            int i8 = c5581.f17285;
            int i9 = c5581.f17283;
            C13132 c13135 = c14961.f45614;
            c13135.offsetPositionRecordsForMove(i8, i9);
            c13135.mItemsAddedOrRemoved = true;
            return;
        }
        throw new IllegalArgumentException("Unknown update op type for " + c5581);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4711() {
        return this.f4897.size() > 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4706(int i) {
        return (i & this.f4893) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4701(int i, int i2) {
        ArrayList arrayList = this.f4896;
        int size = arrayList.size();
        while (i2 < size) {
            C5581 c5581 = (C5581) arrayList.get(i2);
            int i3 = c5581.f17282;
            if (i3 == 8) {
                int i4 = c5581.f17285;
                if (i4 == i) {
                    i = c5581.f17283;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c5581.f17283 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c5581.f17285;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c5581.f17283;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c5581.f17283;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4708(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        C5581 c5581M4702 = m4702(obj, 4, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(c5581M4702);
        this.f4893 |= 4;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m4710(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C5581 c5581M4702 = m4702(null, 1, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(c5581M4702);
        this.f4893 |= 1;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4712(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C5581 c5581M4702 = m4702(null, 2, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(c5581M4702);
        this.f4893 |= 2;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4707(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        C5581 c5581M4702 = m4702(null, 8, i, i2);
        ArrayList arrayList = this.f4897;
        arrayList.add(c5581M4702);
        this.f4893 |= 8;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4709() {
        m4703();
        ArrayList arrayList = this.f4897;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5581 c5581 = (C5581) arrayList.get(i);
            int i2 = c5581.f17282;
            C14961 c14961 = this.f4892;
            if (i2 == 1) {
                c14961.m35437(c5581);
                int i3 = c5581.f17285;
                int i4 = c5581.f17283;
                C13132 c13132 = c14961.f45614;
                c13132.offsetPositionRecordsForInsert(i3, i4);
                c13132.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                c14961.m35437(c5581);
                int i5 = c5581.f17285;
                int i6 = c5581.f17283;
                C13132 c13133 = c14961.f45614;
                c13133.offsetPositionRecordsForRemove(i5, i6, true);
                c13133.mItemsAddedOrRemoved = true;
                c13133.mState.f69349 += i6;
            } else if (i2 == 4) {
                c14961.m35437(c5581);
                int i7 = c5581.f17285;
                int i8 = c5581.f17283;
                Object obj = c5581.f17284;
                C13132 c13134 = c14961.f45614;
                c13134.viewRangeUpdate(i7, i8, obj);
                c13134.mItemsChanged = true;
            } else if (i2 == 8) {
                c14961.m35437(c5581);
                int i9 = c5581.f17285;
                int i10 = c5581.f17283;
                C13132 c13135 = c14961.f45614;
                c13135.offsetPositionRecordsForMove(i9, i10);
                c13135.mItemsAddedOrRemoved = true;
            }
        }
        m4704(arrayList);
        this.f4893 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5581 m4702(Object obj, int i, int i2, int i3) {
        C5581 c5581 = (C5581) this.f4894.mo16806();
        if (c5581 == null) {
            C5581 c5582 = new C5581();
            c5582.f17282 = i;
            c5582.f17285 = i2;
            c5582.f17283 = i3;
            c5582.f17284 = obj;
            return c5582;
        }
        c5581.f17282 = i;
        c5581.f17285 = i2;
        c5581.f17283 = i3;
        c5581.f17284 = obj;
        return c5581;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4704(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5581 c5581 = (C5581) arrayList.get(i);
            c5581.f17284 = null;
            this.f4894.mo16807(c5581);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4705(C5581 c5581, int i) {
        C14961 c14961 = this.f4892;
        c14961.m35437(c5581);
        int i2 = c5581.f17282;
        if (i2 == 2) {
            int i3 = c5581.f17283;
            C13132 c13132 = c14961.f45614;
            c13132.offsetPositionRecordsForRemove(i, i3, true);
            c13132.mItemsAddedOrRemoved = true;
            c13132.mState.f69349 += i3;
            return;
        }
        if (i2 == 4) {
            int i4 = c5581.f17283;
            Object obj = c5581.f17284;
            C13132 c13133 = c14961.f45614;
            c13133.viewRangeUpdate(i, i4, obj);
            c13133.mItemsChanged = true;
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
}
