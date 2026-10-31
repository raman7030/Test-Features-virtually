package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B19P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16711 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21446 f51322;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21446 f51324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f51326;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC13683 f51327;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22856 f51328;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51325 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51329 = true;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f51323 = new ArrayList();

    public C16711(C21446 c21446) {
        new ArrayList();
        this.f51327 = null;
        this.f51328 = new C22856();
        this.f51326 = new ArrayList();
        this.f51322 = c21446;
        this.f51324 = c21446;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39332(InterfaceC13683 interfaceC13683) {
        this.f51327 = interfaceC13683;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m39326(C21446 c21446, int i) {
        ArrayList arrayList = this.f51326;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((C2601) arrayList.get(i2)).m8228(c21446, i));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39334(boolean z) {
        boolean z2;
        boolean z3 = this.f51325;
        boolean z4 = false;
        C21446 c21446 = this.f51322;
        if (z3 || this.f51329) {
            for (C15094 c15094 : c21446.f18169) {
                c15094.m35742();
                c15094.f46117 = false;
                c15094.f46156.m37817();
                c15094.f46140.m43506();
            }
            c21446.m35742();
            c21446.f46117 = false;
            c21446.f46156.m37817();
            c21446.f46140.m43506();
            this.f51329 = false;
        }
        m39330(this.f51324);
        c21446.m35706(0);
        c21446.m35731(0);
        EnumC8040 enumC8040M35741 = c21446.m35741(0);
        EnumC8040 enumC8040M35742 = c21446.m35741(1);
        if (this.f51325) {
            m39331();
        }
        int iM35774 = c21446.m35774();
        int iM35775 = c21446.m35775();
        c21446.f46156.f25382.mo34849(iM35774);
        c21446.f46140.f25382.mo34849(iM35775);
        m39337();
        EnumC8040 enumC8040 = EnumC8040.WRAP_CONTENT;
        ArrayList<AbstractC8245> arrayList = this.f51323;
        if (enumC8040M35741 == enumC8040 || enumC8040M35742 == enumC8040) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC8245) it.next()).mo6243()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && enumC8040M35741 == EnumC8040.WRAP_CONTENT) {
                c21446.m35717(EnumC8040.FIXED);
                c21446.m35770(m39326(c21446, 0));
                c21446.f46156.f25374.mo34849(c21446.m35753());
            }
            if (z && enumC8040M35742 == EnumC8040.WRAP_CONTENT) {
                c21446.m35746(EnumC8040.FIXED);
                c21446.m35733(m39326(c21446, 1));
                c21446.f46140.f25374.mo34849(c21446.m35732());
            }
        }
        EnumC8040 enumC8041 = c21446.f46124[0];
        EnumC8040 enumC8042 = EnumC8040.FIXED;
        if (enumC8041 == enumC8042 || enumC8041 == EnumC8040.MATCH_PARENT) {
            int iM35753 = c21446.m35753() + iM35774;
            c21446.f46156.f25379.mo34849(iM35753);
            c21446.f46156.f25374.mo34849(iM35753 - iM35774);
            m39337();
            EnumC8040 enumC8043 = c21446.f46124[1];
            if (enumC8043 == enumC8042 || enumC8043 == EnumC8040.MATCH_PARENT) {
                int iM35732 = c21446.m35732() + iM35775;
                c21446.f46140.f25379.mo34849(iM35732);
                c21446.f46140.f25374.mo34849(iM35732 - iM35775);
            }
            m39337();
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC8245 abstractC8245 : arrayList) {
            if (abstractC8245.f25376 != c21446 || abstractC8245.f25383) {
                abstractC8245.mo6242();
            }
        }
        for (AbstractC8245 abstractC8246 : arrayList) {
            if (z2 || abstractC8246.f25376 != c21446) {
                if (!abstractC8246.f25382.f53276 || ((!abstractC8246.f25379.f53276 && !(abstractC8246 instanceof C20946)) || (!abstractC8246.f25374.f53276 && !(abstractC8246 instanceof C1895) && !(abstractC8246 instanceof C20946)))) {
                    c21446.m35717(enumC8040M35741);
                    c21446.m35746(enumC8040M35742);
                    return z4;
                }
            }
        }
        z4 = true;
        c21446.m35717(enumC8040M35741);
        c21446.m35746(enumC8040M35742);
        return z4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39335() {
        boolean z = this.f51325;
        C21446 c21446 = this.f51322;
        if (z) {
            for (C15094 c15094 : c21446.f18169) {
                c15094.m35742();
                c15094.f46117 = false;
                C16005 c16005 = c15094.f46156;
                c16005.f25374.f53276 = false;
                c16005.f25383 = false;
                c16005.m37817();
                C18829 c18829 = c15094.f46140;
                c18829.f25374.f53276 = false;
                c18829.f25383 = false;
                c18829.m43506();
            }
            c21446.m35742();
            c21446.f46117 = false;
            C16005 c16006 = c21446.f46156;
            c16006.f25374.f53276 = false;
            c16006.f25383 = false;
            c16006.m37817();
            C18829 c188210 = c21446.f46140;
            c188210.f25374.f53276 = false;
            c188210.f25383 = false;
            c188210.m43506();
            m39331();
        }
        m39330(this.f51324);
        c21446.m35706(0);
        c21446.m35731(0);
        c21446.f46156.f25382.mo34849(0);
        c21446.f46140.f25382.mo34849(0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39333(int i, boolean z) {
        boolean z2;
        EnumC8040 enumC8040;
        C21446 c21446 = this.f51322;
        boolean z3 = false;
        EnumC8040 enumC8040M35741 = c21446.m35741(0);
        EnumC8040 enumC8040M35742 = c21446.m35741(1);
        int iM35774 = c21446.m35774();
        int iM35775 = c21446.m35775();
        ArrayList<AbstractC8245> arrayList = this.f51323;
        if (z && (enumC8040M35741 == (enumC8040 = EnumC8040.WRAP_CONTENT) || enumC8040M35742 == enumC8040)) {
            for (AbstractC8245 abstractC8245 : arrayList) {
                if (abstractC8245.f25378 == i && !abstractC8245.mo6243()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && enumC8040M35741 == EnumC8040.WRAP_CONTENT) {
                    c21446.m35717(EnumC8040.FIXED);
                    c21446.m35770(m39326(c21446, 0));
                    c21446.f46156.f25374.mo34849(c21446.m35753());
                }
            } else if (z && enumC8040M35742 == EnumC8040.WRAP_CONTENT) {
                c21446.m35746(EnumC8040.FIXED);
                c21446.m35733(m39326(c21446, 1));
                c21446.f46140.f25374.mo34849(c21446.m35732());
            }
        }
        if (i == 0) {
            EnumC8040 enumC8041 = c21446.f46124[0];
            if (enumC8041 == EnumC8040.FIXED || enumC8041 == EnumC8040.MATCH_PARENT) {
                int iM35753 = c21446.m35753() + iM35774;
                c21446.f46156.f25379.mo34849(iM35753);
                c21446.f46156.f25374.mo34849(iM35753 - iM35774);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            EnumC8040 enumC8042 = c21446.f46124[1];
            if (enumC8042 == EnumC8040.FIXED || enumC8042 == EnumC8040.MATCH_PARENT) {
                int iM35732 = c21446.m35732() + iM35775;
                c21446.f46140.f25379.mo34849(iM35732);
                c21446.f46140.f25374.mo34849(iM35732 - iM35775);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m39337();
        for (AbstractC8245 abstractC8246 : arrayList) {
            if (abstractC8246.f25378 == i && (abstractC8246.f25376 != c21446 || abstractC8246.f25383)) {
                abstractC8246.mo6242();
            }
        }
        for (AbstractC8245 abstractC8247 : arrayList) {
            if (abstractC8247.f25378 == i && (z2 || abstractC8247.f25376 != c21446)) {
                if (!abstractC8247.f25382.f53276 || !abstractC8247.f25379.f53276 || (!(abstractC8247 instanceof C1895) && !abstractC8247.f25374.f53276)) {
                    c21446.m35717(enumC8040M35741);
                    c21446.m35746(enumC8040M35742);
                    return z3;
                }
            }
        }
        z3 = true;
        c21446.m35717(enumC8040M35741);
        c21446.m35746(enumC8040M35742);
        return z3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39328(C15094 c15094, EnumC8040 enumC8040, int i, EnumC8040 enumC8041, int i2) {
        C22856 c22856 = this.f51328;
        c22856.f73745 = enumC8040;
        c22856.f73753 = enumC8041;
        c22856.f73748 = i;
        c22856.f73747 = i2;
        this.f51327.mo32930(c15094, c22856);
        c15094.m35770(c22856.f73746);
        c15094.m35733(c22856.f73749);
        c15094.m35721(c22856.f73751);
        c15094.m35752(c22856.f73752);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39330(C21446 c21446) {
        char c;
        EnumC8040 enumC8040;
        int iM35732;
        EnumC8040 enumC8041;
        EnumC8040[] enumC8040Arr;
        EnumC8040 enumC8042;
        EnumC8040 enumC8043;
        EnumC8040 enumC8044;
        EnumC8040 enumC8045;
        EnumC8040 enumC8046;
        Iterator it = c21446.f18169.iterator();
        while (it.hasNext()) {
            C15094 c15094 = (C15094) it.next();
            EnumC8040[] enumC8040Arr2 = c15094.f46124;
            C5218[] c5218Arr = c15094.f46135;
            C5218 c5218 = c15094.f46133;
            C5218 c5219 = c15094.f46161;
            C5218 c52110 = c15094.f46159;
            C5218 c52111 = c15094.f46141;
            EnumC8040 enumC8047 = enumC8040Arr2[0];
            EnumC8040 enumC8048 = enumC8040Arr2[1];
            if (c15094.m35735() == 8) {
                c15094.f46117 = true;
            } else {
                float f = c15094.f46155;
                if (f < 1.0f && enumC8047 == EnumC8040.MATCH_CONSTRAINT) {
                    c15094.f46145 = 2;
                }
                float f2 = c15094.f46157;
                if (f2 < 1.0f) {
                    c = 0;
                    if (enumC8048 == EnumC8040.MATCH_CONSTRAINT) {
                        c15094.f46170 = 2;
                    }
                } else {
                    c = 0;
                }
                if (c15094.f46108 > 0.0f) {
                    EnumC8040 enumC8049 = EnumC8040.MATCH_CONSTRAINT;
                    if (enumC8047 == enumC8049 && (enumC8048 == EnumC8040.WRAP_CONTENT || enumC8048 == EnumC8040.FIXED)) {
                        c15094.f46145 = 3;
                    } else if (enumC8048 == enumC8049 && (enumC8047 == EnumC8040.WRAP_CONTENT || enumC8047 == EnumC8040.FIXED)) {
                        c15094.f46170 = 3;
                    } else if (enumC8047 == enumC8049 && enumC8048 == enumC8049) {
                        if (c15094.f46145 == 0) {
                            c15094.f46145 = 3;
                        }
                        if (c15094.f46170 == 0) {
                            c15094.f46170 = 3;
                        }
                    }
                }
                EnumC8040 enumC80410 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8047 == enumC80410 && c15094.f46145 == 1 && (c52111.f16339 == null || c52110.f16339 == null)) {
                    enumC8047 = EnumC8040.WRAP_CONTENT;
                }
                if (enumC8048 == enumC80410 && c15094.f46170 == 1 && (c5219.f16339 == null || c5218.f16339 == null)) {
                    enumC8048 = EnumC8040.WRAP_CONTENT;
                }
                EnumC8040 enumC80411 = enumC8048;
                C16005 c16005 = c15094.f46156;
                c16005.f25377 = enumC8047;
                int i = c15094.f46145;
                c16005.f25380 = i;
                C18829 c18829 = c15094.f46140;
                c18829.f25377 = enumC80411;
                Iterator it2 = it;
                int i2 = c15094.f46170;
                c18829.f25380 = i2;
                EnumC8040 enumC80412 = EnumC8040.MATCH_PARENT;
                if ((enumC8047 == enumC80412 || enumC8047 == EnumC8040.FIXED || enumC8047 == EnumC8040.WRAP_CONTENT) && (enumC80411 == enumC80412 || enumC80411 == EnumC8040.FIXED || enumC80411 == EnumC8040.WRAP_CONTENT)) {
                    int iM35753 = c15094.m35753();
                    if (enumC8047 == enumC80412) {
                        iM35753 = (c21446.m35753() - c52111.f16343) - c52110.f16343;
                        enumC8040 = EnumC8040.FIXED;
                    } else {
                        enumC8040 = enumC8047;
                    }
                    int iM35733 = c15094.m35732();
                    if (enumC80411 == enumC80412) {
                        iM35732 = (c21446.m35732() - c5219.f16343) - c5218.f16343;
                        enumC8041 = EnumC8040.FIXED;
                    } else {
                        iM35732 = iM35733;
                        enumC8041 = enumC80411;
                    }
                    m39328(c15094, enumC8040, iM35753, enumC8041, iM35732);
                    c15094.f46156.f25374.mo34849(c15094.m35753());
                    c15094.f46140.f25374.mo34849(c15094.m35732());
                    c15094.f46117 = true;
                } else if (enumC8047 == enumC80410 && (enumC80411 == (enumC8046 = EnumC8040.WRAP_CONTENT) || enumC80411 == EnumC8040.FIXED)) {
                    if (i == 3) {
                        if (enumC80411 == enumC8046) {
                            m39328(c15094, enumC8046, 0, enumC8046, 0);
                        }
                        int iM35734 = c15094.m35732();
                        int i3 = (int) ((iM35734 * c15094.f46108) + 0.5f);
                        EnumC8040 enumC80413 = EnumC8040.FIXED;
                        m39328(c15094, enumC80413, i3, enumC80413, iM35734);
                        c15094.f46156.f25374.mo34849(c15094.m35753());
                        c15094.f46140.f25374.mo34849(c15094.m35732());
                        c15094.f46117 = true;
                    } else if (i == 1) {
                        m39328(c15094, enumC8046, 0, enumC80411, 0);
                        c15094.f46156.f25374.f44683 = c15094.m35753();
                    } else if (i == 2) {
                        EnumC8040 enumC80414 = c21446.f46124[c];
                        EnumC8040 enumC80415 = EnumC8040.FIXED;
                        if (enumC80414 == enumC80415 || enumC80414 == enumC80412) {
                            m39328(c15094, enumC80415, (int) ((f * c21446.m35753()) + 0.5f), enumC80411, c15094.m35732());
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        } else if (enumC80411 == enumC80410) {
                            if (enumC8047 == enumC80410) {
                                if (i != 1) {
                                    EnumC8040 enumC80416 = EnumC8040.WRAP_CONTENT;
                                    m39328(c15094, enumC80416, 0, enumC80416, 0);
                                    c15094.f46156.f25374.f44683 = c15094.m35753();
                                    c15094.f46140.f25374.f44683 = c15094.m35732();
                                } else {
                                    EnumC8040 enumC80417 = EnumC8040.WRAP_CONTENT;
                                    m39328(c15094, enumC80417, 0, enumC80417, 0);
                                    c15094.f46156.f25374.f44683 = c15094.m35753();
                                    c15094.f46140.f25374.f44683 = c15094.m35732();
                                }
                            }
                        } else if (enumC8047 == enumC80410) {
                            if (i != 1) {
                                EnumC8040 enumC80418 = EnumC8040.WRAP_CONTENT;
                                m39328(c15094, enumC80418, 0, enumC80418, 0);
                                c15094.f46156.f25374.f44683 = c15094.m35753();
                                c15094.f46140.f25374.f44683 = c15094.m35732();
                            } else {
                                EnumC8040 enumC80419 = EnumC8040.WRAP_CONTENT;
                                m39328(c15094, enumC80419, 0, enumC80419, 0);
                                c15094.f46156.f25374.f44683 = c15094.m35753();
                                c15094.f46140.f25374.f44683 = c15094.m35732();
                            }
                        }
                    } else if (c5218Arr[c].f16339 == null || c5218Arr[1].f16339 == null) {
                        m39328(c15094, enumC8046, 0, enumC80411, 0);
                        c15094.f46156.f25374.mo34849(c15094.m35753());
                        c15094.f46140.f25374.mo34849(c15094.m35732());
                        c15094.f46117 = true;
                    } else if (enumC80411 == enumC80410) {
                        if (enumC8047 == enumC80410) {
                            if (i != 1) {
                                EnumC8040 enumC804110 = EnumC8040.WRAP_CONTENT;
                                m39328(c15094, enumC804110, 0, enumC804110, 0);
                                c15094.f46156.f25374.f44683 = c15094.m35753();
                                c15094.f46140.f25374.f44683 = c15094.m35732();
                            } else {
                                EnumC8040 enumC804111 = EnumC8040.WRAP_CONTENT;
                                m39328(c15094, enumC804111, 0, enumC804111, 0);
                                c15094.f46156.f25374.f44683 = c15094.m35753();
                                c15094.f46140.f25374.f44683 = c15094.m35732();
                            }
                        }
                    } else if (enumC8047 == enumC80410) {
                        if (i != 1) {
                            EnumC8040 enumC804112 = EnumC8040.WRAP_CONTENT;
                            m39328(c15094, enumC804112, 0, enumC804112, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        } else {
                            EnumC8040 enumC804113 = EnumC8040.WRAP_CONTENT;
                            m39328(c15094, enumC804113, 0, enumC804113, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        }
                    }
                } else if (enumC80411 == enumC80410 || !(enumC8047 == (enumC8045 = EnumC8040.WRAP_CONTENT) || enumC8047 == EnumC8040.FIXED)) {
                    if (enumC8047 == enumC80410 && enumC80411 == enumC80410) {
                        if (i != 1 || i2 == 1) {
                            EnumC8040 enumC804114 = EnumC8040.WRAP_CONTENT;
                            m39328(c15094, enumC804114, 0, enumC804114, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        } else if (i2 == 2 && i == 2 && (((enumC8042 = (enumC8040Arr = c21446.f46124)[c]) == (enumC8043 = EnumC8040.FIXED) || enumC8042 == enumC8043) && ((enumC8044 = enumC8040Arr[1]) == enumC8043 || enumC8044 == enumC8043))) {
                            m39328(c15094, enumC8043, (int) ((f * c21446.m35753()) + 0.5f), enumC8043, (int) ((f2 * c21446.m35732()) + 0.5f));
                            c15094.f46156.f25374.mo34849(c15094.m35753());
                            c15094.f46140.f25374.mo34849(c15094.m35732());
                            c15094.f46117 = true;
                        }
                    }
                } else if (i2 == 3) {
                    if (enumC8047 == enumC8045) {
                        m39328(c15094, enumC8045, 0, enumC8045, 0);
                    }
                    int iM35754 = c15094.m35753();
                    float f3 = c15094.f46108;
                    if (c15094.m35776() == -1) {
                        f3 = 1.0f / f3;
                    }
                    EnumC8040 enumC80420 = EnumC8040.FIXED;
                    m39328(c15094, enumC80420, iM35754, enumC80420, (int) ((iM35754 * f3) + 0.5f));
                    c15094.f46156.f25374.mo34849(c15094.m35753());
                    c15094.f46140.f25374.mo34849(c15094.m35732());
                    c15094.f46117 = true;
                } else if (i2 == 1) {
                    m39328(c15094, enumC8047, 0, enumC8045, 0);
                    c15094.f46140.f25374.f44683 = c15094.m35732();
                } else if (i2 == 2) {
                    EnumC8040 enumC80421 = c21446.f46124[1];
                    EnumC8040 enumC80422 = EnumC8040.FIXED;
                    if (enumC80421 == enumC80422 || enumC80421 == enumC80412) {
                        m39328(c15094, enumC8047, c15094.m35753(), enumC80422, (int) ((f2 * c21446.m35732()) + 0.5f));
                        c15094.f46156.f25374.mo34849(c15094.m35753());
                        c15094.f46140.f25374.mo34849(c15094.m35732());
                        c15094.f46117 = true;
                    } else if (enumC8047 == enumC80410) {
                        if (i != 1) {
                            EnumC8040 enumC804115 = EnumC8040.WRAP_CONTENT;
                            m39328(c15094, enumC804115, 0, enumC804115, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        } else {
                            EnumC8040 enumC804116 = EnumC8040.WRAP_CONTENT;
                            m39328(c15094, enumC804116, 0, enumC804116, 0);
                            c15094.f46156.f25374.f44683 = c15094.m35753();
                            c15094.f46140.f25374.f44683 = c15094.m35732();
                        }
                    }
                } else if (c5218Arr[2].f16339 == null || c5218Arr[3].f16339 == null) {
                    m39328(c15094, enumC8045, 0, enumC80411, 0);
                    c15094.f46156.f25374.mo34849(c15094.m35753());
                    c15094.f46140.f25374.mo34849(c15094.m35732());
                    c15094.f46117 = true;
                } else if (enumC8047 == enumC80410) {
                    if (i != 1) {
                        EnumC8040 enumC804117 = EnumC8040.WRAP_CONTENT;
                        m39328(c15094, enumC804117, 0, enumC804117, 0);
                        c15094.f46156.f25374.f44683 = c15094.m35753();
                        c15094.f46140.f25374.f44683 = c15094.m35732();
                    } else {
                        EnumC8040 enumC804118 = EnumC8040.WRAP_CONTENT;
                        m39328(c15094, enumC804118, 0, enumC804118, 0);
                        c15094.f46156.f25374.f44683 = c15094.m35753();
                        c15094.f46140.f25374.f44683 = c15094.m35732();
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39337() {
        C11568 c11568;
        for (C15094 c15094 : this.f51322.f18169) {
            if (!c15094.f46117) {
                EnumC8040[] enumC8040Arr = c15094.f46124;
                boolean z = false;
                EnumC8040 enumC8040 = enumC8040Arr[0];
                EnumC8040 enumC8041 = enumC8040Arr[1];
                int i = c15094.f46145;
                int i2 = c15094.f46170;
                EnumC8040 enumC8042 = EnumC8040.WRAP_CONTENT;
                boolean z2 = enumC8040 == enumC8042 || (enumC8040 == EnumC8040.MATCH_CONSTRAINT && i == 1);
                if (enumC8041 == enumC8042 || (enumC8041 == EnumC8040.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C14594 c14594 = c15094.f46156.f25374;
                boolean z3 = c14594.f53276;
                C14594 c14595 = c15094.f46140.f25374;
                boolean z4 = c14595.f53276;
                if (z3 && z4) {
                    EnumC8040 enumC8043 = EnumC8040.FIXED;
                    m39328(c15094, enumC8043, c14594.f53271, enumC8043, c14595.f53271);
                    c15094.f46117 = true;
                } else if (z3 && z) {
                    m39328(c15094, EnumC8040.FIXED, c14594.f53271, enumC8042, c14595.f53271);
                    if (enumC8041 == EnumC8040.MATCH_CONSTRAINT) {
                        c15094.f46140.f25374.f44683 = c15094.m35732();
                    } else {
                        c15094.f46140.f25374.mo34849(c15094.m35732());
                        c15094.f46117 = true;
                    }
                } else if (z4 && z2) {
                    m39328(c15094, enumC8042, c14594.f53271, EnumC8040.FIXED, c14595.f53271);
                    if (enumC8040 == EnumC8040.MATCH_CONSTRAINT) {
                        c15094.f46156.f25374.f44683 = c15094.m35753();
                    } else {
                        c15094.f46156.f25374.mo34849(c15094.m35753());
                        c15094.f46117 = true;
                    }
                }
                if (c15094.f46117 && (c11568 = c15094.f46140.f59403) != null) {
                    c11568.mo34849(c15094.m35756());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39336() {
        this.f51325 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39338() {
        this.f51329 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39331() {
        ArrayList<AbstractC8245> arrayList = this.f51323;
        arrayList.clear();
        C21446 c21446 = this.f51324;
        c21446.f46156.mo6244();
        c21446.f46140.mo6244();
        arrayList.add(c21446.f46156);
        arrayList.add(c21446.f46140);
        HashSet hashSet = null;
        for (C15094 c15094 : c21446.f18169) {
            if (c15094 instanceof C3101) {
                C20946 c20946 = new C20946(c15094);
                c15094.f46156.mo6244();
                c15094.f46140.mo6244();
                c20946.f25378 = ((C3101) c15094).m9463();
                arrayList.add(c20946);
            } else {
                if (c15094.m35729()) {
                    if (c15094.f46137 == null) {
                        c15094.f46137 = new C1895(c15094, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c15094.f46137);
                } else {
                    arrayList.add(c15094.f46156);
                }
                if (c15094.m35749()) {
                    if (c15094.f46136 == null) {
                        c15094.f46136 = new C1895(c15094, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c15094.f46136);
                } else {
                    arrayList.add(c15094.f46140);
                }
                if (c15094 instanceof C12978) {
                    arrayList.add(new C9657(c15094));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC8245) it.next()).mo6244();
        }
        for (AbstractC8245 abstractC8245 : arrayList) {
            if (abstractC8245.f25376 != c21446) {
                abstractC8245.mo6240();
            }
        }
        ArrayList arrayList2 = this.f51326;
        arrayList2.clear();
        C21446 c21447 = this.f51322;
        m39327(c21447.f46156, 0, arrayList2);
        m39327(c21447.f46140, 1, arrayList2);
        this.f51325 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39329(C17417 c17417, int i, ArrayList arrayList, C2601 c2601) {
        AbstractC8245 abstractC8245 = c17417.f53266;
        C2601 c2602 = abstractC8245.f25375;
        C17417 c17418 = abstractC8245.f25379;
        C17417 c17419 = abstractC8245.f25382;
        if (c2602 == null) {
            C21446 c21446 = this.f51322;
            if (abstractC8245 == c21446.f46156 || abstractC8245 == c21446.f46140) {
                return;
            }
            if (c2601 == null) {
                c2601 = new C2601();
                c2601.f8220 = null;
                c2601.f8221 = new ArrayList();
                c2601.f8220 = abstractC8245;
                arrayList.add(c2601);
            }
            abstractC8245.f25375 = c2601;
            c2601.f8221.add(abstractC8245);
            for (InterfaceC11068 interfaceC11068 : c17419.f53269) {
                if (interfaceC11068 instanceof C17417) {
                    m39329((C17417) interfaceC11068, i, arrayList, c2601);
                }
            }
            for (InterfaceC11068 interfaceC11069 : c17418.f53269) {
                if (interfaceC11069 instanceof C17417) {
                    m39329((C17417) interfaceC11069, i, arrayList, c2601);
                }
            }
            if (i == 1 && (abstractC8245 instanceof C18829)) {
                for (InterfaceC11068 interfaceC110610 : ((C18829) abstractC8245).f59402.f53269) {
                    if (interfaceC110610 instanceof C17417) {
                        m39329((C17417) interfaceC110610, i, arrayList, c2601);
                    }
                }
            }
            Iterator it = c17419.f53275.iterator();
            while (it.hasNext()) {
                m39329((C17417) it.next(), i, arrayList, c2601);
            }
            Iterator it2 = c17418.f53275.iterator();
            while (it2.hasNext()) {
                m39329((C17417) it2.next(), i, arrayList, c2601);
            }
            if (i == 1 && (abstractC8245 instanceof C18829)) {
                Iterator it3 = ((C18829) abstractC8245).f59402.f53275.iterator();
                while (it3.hasNext()) {
                    m39329((C17417) it3.next(), i, arrayList, c2601);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39327(AbstractC8245 abstractC8245, int i, ArrayList arrayList) {
        C17417 c17417 = abstractC8245.f25382;
        C17417 c17418 = abstractC8245.f25379;
        for (InterfaceC11068 interfaceC11068 : c17417.f53269) {
            if (interfaceC11068 instanceof C17417) {
                m39329((C17417) interfaceC11068, i, arrayList, null);
            } else if (interfaceC11068 instanceof AbstractC8245) {
                m39329(((AbstractC8245) interfaceC11068).f25382, i, arrayList, null);
            }
        }
        for (InterfaceC11068 interfaceC11069 : c17418.f53269) {
            if (interfaceC11069 instanceof C17417) {
                m39329((C17417) interfaceC11069, i, arrayList, null);
            } else if (interfaceC11069 instanceof AbstractC8245) {
                m39329(((AbstractC8245) interfaceC11069).f25379, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC11068 interfaceC110610 : ((C18829) abstractC8245).f59402.f53269) {
                if (interfaceC110610 instanceof C17417) {
                    m39329((C17417) interfaceC110610, i, arrayList, null);
                }
            }
        }
    }
}
