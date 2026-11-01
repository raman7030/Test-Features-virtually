package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܶ */
/* JADX INFO: compiled from: B19P */
/* JADX INFO: loaded from: classes4.dex */
public final class C1671 {

    /* JADX INFO: renamed from: ֫ */
    public C1906 f54506;

    /* JADX INFO: renamed from: ۧ */
    public C1906 f54508;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f54510;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC1521 f54511;

    /* JADX INFO: renamed from: ᩳ */
    public C1976 f54512;

    /* JADX INFO: renamed from: ܳ */
    public boolean f54509 = true;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f54513 = true;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f54507 = new ArrayList();

    public C1671(C1906 c1906) {
        new ArrayList();
        this.f54511 = null;
        this.f54512 = new C1976();
        this.f54510 = new ArrayList();
        this.f54506 = c1906;
        this.f54508 = c1906;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41568(InterfaceC1521 interfaceC1521) {
        this.f54511 = interfaceC1521;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m41562(C1906 c1906, int i) {
        ArrayList arrayList = this.f54510;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((C0971) arrayList.get(i2)).m10269(c1906, i));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41570(boolean z) {
        boolean z2;
        boolean z3 = this.f54509;
        boolean z4 = false;
        C1906 c1906 = this.f54506;
        if (z3 || this.f54513) {
            for (C1591 c1591 : c1906.f21023) {
                c1591.m37900();
                c1591.f49237 = false;
                c1591.f49276.m40003();
                c1591.f49260.m45772();
            }
            c1906.m37900();
            c1906.f49237 = false;
            c1906.f49276.m40003();
            c1906.f49260.m45772();
            this.f54513 = false;
        }
        m41566(this.f54508);
        c1906.m37864(0);
        c1906.m37889(0);
        EnumC1241 enumC1241M37899 = c1906.m37899(0);
        EnumC1241 enumC1241M378910 = c1906.m37899(1);
        if (this.f54509) {
            m41567();
        }
        int iM37932 = c1906.m37932();
        int iM37933 = c1906.m37933();
        c1906.f49276.f28292.mo37000(iM37932);
        c1906.f49260.f28292.mo37000(iM37933);
        m41573();
        EnumC1241 enumC1241 = EnumC1241.WRAP_CONTENT;
        ArrayList<AbstractC1251> arrayList = this.f54507;
        if (enumC1241M37899 == enumC1241 || enumC1241M378910 == enumC1241) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC1251) it.next()).mo8445()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && enumC1241M37899 == EnumC1241.WRAP_CONTENT) {
                c1906.m37875(EnumC1241.FIXED);
                c1906.m37928(m41562(c1906, 0));
                c1906.f49276.f28284.mo37000(c1906.m37911());
            }
            if (z && enumC1241M378910 == EnumC1241.WRAP_CONTENT) {
                c1906.m37904(EnumC1241.FIXED);
                c1906.m37891(m41562(c1906, 1));
                c1906.f49260.f28284.mo37000(c1906.m37890());
            }
        }
        EnumC1241 enumC1242 = c1906.f49244[0];
        EnumC1241 enumC1243 = EnumC1241.FIXED;
        if (enumC1242 == enumC1243 || enumC1242 == EnumC1241.MATCH_PARENT) {
            int iM37911 = c1906.m37911() + iM37932;
            c1906.f49276.f28289.mo37000(iM37911);
            c1906.f49276.f28284.mo37000(iM37911 - iM37932);
            m41573();
            EnumC1241 enumC1244 = c1906.f49244[1];
            if (enumC1244 == enumC1243 || enumC1244 == EnumC1241.MATCH_PARENT) {
                int iM37890 = c1906.m37890() + iM37933;
                c1906.f49260.f28289.mo37000(iM37890);
                c1906.f49260.f28284.mo37000(iM37890 - iM37933);
            }
            m41573();
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC1251 abstractC1251 : arrayList) {
            if (abstractC1251.f28286 != c1906 || abstractC1251.f28293) {
                abstractC1251.mo8444();
            }
        }
        for (AbstractC1251 abstractC1252 : arrayList) {
            if (z2 || abstractC1252.f28286 != c1906) {
                if (!abstractC1252.f28292.f56464 || ((!abstractC1252.f28289.f56464 && !(abstractC1252 instanceof C1881)) || (!abstractC1252.f28284.f56464 && !(abstractC1252 instanceof C0936) && !(abstractC1252 instanceof C1881)))) {
                    c1906.m37875(enumC1241M37899);
                    c1906.m37904(enumC1241M378910);
                    return z4;
                }
            }
        }
        z4 = true;
        c1906.m37875(enumC1241M37899);
        c1906.m37904(enumC1241M378910);
        return z4;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41571() {
        boolean z = this.f54509;
        C1906 c1906 = this.f54506;
        if (z) {
            for (C1591 c1591 : c1906.f21023) {
                c1591.m37900();
                c1591.f49237 = false;
                C1636 c1636 = c1591.f49276;
                c1636.f28284.f56464 = false;
                c1636.f28293 = false;
                c1636.m40003();
                C1776 c1776 = c1591.f49260;
                c1776.f28284.f56464 = false;
                c1776.f28293 = false;
                c1776.m45772();
            }
            c1906.m37900();
            c1906.f49237 = false;
            C1636 c1637 = c1906.f49276;
            c1637.f28284.f56464 = false;
            c1637.f28293 = false;
            c1637.m40003();
            C1776 c1777 = c1906.f49260;
            c1777.f28284.f56464 = false;
            c1777.f28293 = false;
            c1777.m45772();
            m41567();
        }
        m41566(this.f54508);
        c1906.m37864(0);
        c1906.m37889(0);
        c1906.f49276.f28292.mo37000(0);
        c1906.f49260.f28292.mo37000(0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m41569(int i, boolean z) {
        boolean z2;
        EnumC1241 enumC1241;
        C1906 c1906 = this.f54506;
        boolean z3 = false;
        EnumC1241 enumC1241M37899 = c1906.m37899(0);
        EnumC1241 enumC1241M378910 = c1906.m37899(1);
        int iM37932 = c1906.m37932();
        int iM37933 = c1906.m37933();
        ArrayList<AbstractC1251> arrayList = this.f54507;
        if (z && (enumC1241M37899 == (enumC1241 = EnumC1241.WRAP_CONTENT) || enumC1241M378910 == enumC1241)) {
            for (AbstractC1251 abstractC1251 : arrayList) {
                if (abstractC1251.f28288 == i && !abstractC1251.mo8445()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && enumC1241M37899 == EnumC1241.WRAP_CONTENT) {
                    c1906.m37875(EnumC1241.FIXED);
                    c1906.m37928(m41562(c1906, 0));
                    c1906.f49276.f28284.mo37000(c1906.m37911());
                }
            } else if (z && enumC1241M378910 == EnumC1241.WRAP_CONTENT) {
                c1906.m37904(EnumC1241.FIXED);
                c1906.m37891(m41562(c1906, 1));
                c1906.f49260.f28284.mo37000(c1906.m37890());
            }
        }
        if (i == 0) {
            EnumC1241 enumC1242 = c1906.f49244[0];
            if (enumC1242 == EnumC1241.FIXED || enumC1242 == EnumC1241.MATCH_PARENT) {
                int iM37911 = c1906.m37911() + iM37932;
                c1906.f49276.f28289.mo37000(iM37911);
                c1906.f49276.f28284.mo37000(iM37911 - iM37932);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            EnumC1241 enumC1243 = c1906.f49244[1];
            if (enumC1243 == EnumC1241.FIXED || enumC1243 == EnumC1241.MATCH_PARENT) {
                int iM37890 = c1906.m37890() + iM37933;
                c1906.f49260.f28289.mo37000(iM37890);
                c1906.f49260.f28284.mo37000(iM37890 - iM37933);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m41573();
        for (AbstractC1251 abstractC1252 : arrayList) {
            if (abstractC1252.f28288 == i && (abstractC1252.f28286 != c1906 || abstractC1252.f28293)) {
                abstractC1252.mo8444();
            }
        }
        for (AbstractC1251 abstractC1253 : arrayList) {
            if (abstractC1253.f28288 == i && (z2 || abstractC1253.f28286 != c1906)) {
                if (!abstractC1253.f28292.f56464 || !abstractC1253.f28289.f56464 || (!(abstractC1253 instanceof C0936) && !abstractC1253.f28284.f56464)) {
                    c1906.m37875(enumC1241M37899);
                    c1906.m37904(enumC1241M378910);
                    return z3;
                }
            }
        }
        z3 = true;
        c1906.m37875(enumC1241M37899);
        c1906.m37904(enumC1241M378910);
        return z3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41564(C1591 c1591, EnumC1241 enumC1241, int i, EnumC1241 enumC1242, int i2) {
        C1976 c1976 = this.f54512;
        c1976.f76476 = enumC1241;
        c1976.f76484 = enumC1242;
        c1976.f76479 = i;
        c1976.f76478 = i2;
        this.f54511.mo35045(c1591, c1976);
        c1591.m37928(c1976.f76477);
        c1591.m37891(c1976.f76480);
        c1591.m37879(c1976.f76482);
        c1591.m37910(c1976.f76483);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    /* JADX INFO: renamed from: ֫ */
    private void m41566(C1906 c1906) {
        char c;
        EnumC1241 enumC1241;
        int iM37890;
        EnumC1241 enumC1242;
        EnumC1241[] enumC1241Arr;
        EnumC1241 enumC1243;
        EnumC1241 enumC1244;
        EnumC1241 enumC1245;
        EnumC1241 enumC1246;
        EnumC1241 enumC1247;
        Iterator it = c1906.f21023.iterator();
        while (it.hasNext()) {
            C1591 c1591 = (C1591) it.next();
            EnumC1241[] enumC1241Arr2 = c1591.f49244;
            C1101[] c1101Arr = c1591.f49255;
            C1101 c1101 = c1591.f49253;
            C1101 c1102 = c1591.f49281;
            C1101 c1103 = c1591.f49279;
            C1101 c1104 = c1591.f49261;
            EnumC1241 enumC1248 = enumC1241Arr2[0];
            EnumC1241 enumC1249 = enumC1241Arr2[1];
            if (c1591.m37893() == 8) {
                c1591.f49237 = true;
            } else {
                float f = c1591.f49275;
                if (f < 1.0f && enumC1248 == EnumC1241.MATCH_CONSTRAINT) {
                    c1591.f49265 = 2;
                }
                float f2 = c1591.f49277;
                if (f2 < 1.0f) {
                    c = 0;
                    if (enumC1249 == EnumC1241.MATCH_CONSTRAINT) {
                        c1591.f49290 = 2;
                    }
                } else {
                    c = 0;
                }
                if (c1591.f49228 > 0.0f) {
                    EnumC1241 enumC12410 = EnumC1241.MATCH_CONSTRAINT;
                    if (enumC1248 == enumC12410 && (enumC1249 == EnumC1241.WRAP_CONTENT || enumC1249 == EnumC1241.FIXED)) {
                        c1591.f49265 = 3;
                    } else if (enumC1249 == enumC12410 && (enumC1248 == EnumC1241.WRAP_CONTENT || enumC1248 == EnumC1241.FIXED)) {
                        c1591.f49290 = 3;
                    } else if (enumC1248 == enumC12410 && enumC1249 == enumC12410) {
                        if (c1591.f49265 == 0) {
                            c1591.f49265 = 3;
                        }
                        if (c1591.f49290 == 0) {
                            c1591.f49290 = 3;
                        }
                    }
                }
                EnumC1241 enumC12411 = EnumC1241.MATCH_CONSTRAINT;
                if (enumC1248 == enumC12411 && c1591.f49265 == 1 && (c1104.f19179 == null || c1103.f19179 == null)) {
                    enumC1248 = EnumC1241.WRAP_CONTENT;
                }
                if (enumC1249 == enumC12411 && c1591.f49290 == 1 && (c1102.f19179 == null || c1101.f19179 == null)) {
                    enumC1249 = EnumC1241.WRAP_CONTENT;
                }
                EnumC1241 enumC12412 = enumC1249;
                C1636 c1636 = c1591.f49276;
                c1636.f28287 = enumC1248;
                int i = c1591.f49265;
                c1636.f28290 = i;
                C1776 c1776 = c1591.f49260;
                c1776.f28287 = enumC12412;
                Iterator it2 = it;
                int i2 = c1591.f49290;
                c1776.f28290 = i2;
                EnumC1241 enumC12413 = EnumC1241.MATCH_PARENT;
                if ((enumC1248 == enumC12413 || enumC1248 == EnumC1241.FIXED || enumC1248 == EnumC1241.WRAP_CONTENT) && (enumC12412 == enumC12413 || enumC12412 == EnumC1241.FIXED || enumC12412 == EnumC1241.WRAP_CONTENT)) {
                    int iM37911 = c1591.m37911();
                    if (enumC1248 == enumC12413) {
                        iM37911 = (c1906.m37911() - c1104.f19183) - c1103.f19183;
                        enumC1241 = EnumC1241.FIXED;
                    } else {
                        enumC1241 = enumC1248;
                    }
                    int iM37891 = c1591.m37890();
                    if (enumC12412 == enumC12413) {
                        iM37890 = (c1906.m37890() - c1102.f19183) - c1101.f19183;
                        enumC1242 = EnumC1241.FIXED;
                    } else {
                        iM37890 = iM37891;
                        enumC1242 = enumC12412;
                    }
                    m41564(c1591, enumC1241, iM37911, enumC1242, iM37890);
                    c1591.f49276.f28284.mo37000(c1591.m37911());
                    c1591.f49260.f28284.mo37000(c1591.m37890());
                    c1591.f49237 = true;
                } else if (enumC1248 == enumC12411 && (enumC12412 == (enumC1247 = EnumC1241.WRAP_CONTENT) || enumC12412 == EnumC1241.FIXED)) {
                    if (i == 3) {
                        if (enumC12412 == enumC1247) {
                            m41564(c1591, enumC1247, 0, enumC1247, 0);
                        }
                        int iM37892 = c1591.m37890();
                        int i3 = (int) ((iM37892 * c1591.f49228) + 0.5f);
                        EnumC1241 enumC12414 = EnumC1241.FIXED;
                        m41564(c1591, enumC12414, i3, enumC12414, iM37892);
                        c1591.f49276.f28284.mo37000(c1591.m37911());
                        c1591.f49260.f28284.mo37000(c1591.m37890());
                        c1591.f49237 = true;
                    } else if (i == 1) {
                        m41564(c1591, enumC1247, 0, enumC12412, 0);
                        c1591.f49276.f28284.f47790 = c1591.m37911();
                    } else if (i == 2) {
                        EnumC1241 enumC12415 = c1906.f49244[c];
                        EnumC1241 enumC12416 = EnumC1241.FIXED;
                        if (enumC12415 == enumC12416 || enumC12415 == enumC12413) {
                            m41564(c1591, enumC12416, (int) ((f * c1906.m37911()) + 0.5f), enumC12412, c1591.m37890());
                            c1591.f49276.f28284.mo37000(c1591.m37911());
                            c1591.f49260.f28284.mo37000(c1591.m37890());
                            c1591.f49237 = true;
                        } else if (enumC12412 == enumC12411) {
                            if (enumC1248 == enumC12411) {
                                if (i != 1) {
                                    EnumC1241 enumC12417 = EnumC1241.WRAP_CONTENT;
                                    m41564(c1591, enumC12417, 0, enumC12417, 0);
                                    c1591.f49276.f28284.f47790 = c1591.m37911();
                                    c1591.f49260.f28284.f47790 = c1591.m37890();
                                } else {
                                    EnumC1241 enumC12418 = EnumC1241.WRAP_CONTENT;
                                    m41564(c1591, enumC12418, 0, enumC12418, 0);
                                    c1591.f49276.f28284.f47790 = c1591.m37911();
                                    c1591.f49260.f28284.f47790 = c1591.m37890();
                                }
                            }
                        } else if (enumC1248 == enumC12411) {
                            if (i != 1) {
                                EnumC1241 enumC12419 = EnumC1241.WRAP_CONTENT;
                                m41564(c1591, enumC12419, 0, enumC12419, 0);
                                c1591.f49276.f28284.f47790 = c1591.m37911();
                                c1591.f49260.f28284.f47790 = c1591.m37890();
                            } else {
                                EnumC1241 enumC124110 = EnumC1241.WRAP_CONTENT;
                                m41564(c1591, enumC124110, 0, enumC124110, 0);
                                c1591.f49276.f28284.f47790 = c1591.m37911();
                                c1591.f49260.f28284.f47790 = c1591.m37890();
                            }
                        }
                    } else if (c1101Arr[c].f19179 == null || c1101Arr[1].f19179 == null) {
                        m41564(c1591, enumC1247, 0, enumC12412, 0);
                        c1591.f49276.f28284.mo37000(c1591.m37911());
                        c1591.f49260.f28284.mo37000(c1591.m37890());
                        c1591.f49237 = true;
                    } else if (enumC12412 == enumC12411) {
                        if (enumC1248 == enumC12411) {
                            if (i != 1) {
                                EnumC1241 enumC124111 = EnumC1241.WRAP_CONTENT;
                                m41564(c1591, enumC124111, 0, enumC124111, 0);
                                c1591.f49276.f28284.f47790 = c1591.m37911();
                                c1591.f49260.f28284.f47790 = c1591.m37890();
                            } else {
                                EnumC1241 enumC124112 = EnumC1241.WRAP_CONTENT;
                                m41564(c1591, enumC124112, 0, enumC124112, 0);
                                c1591.f49276.f28284.f47790 = c1591.m37911();
                                c1591.f49260.f28284.f47790 = c1591.m37890();
                            }
                        }
                    } else if (enumC1248 == enumC12411) {
                        if (i != 1) {
                            EnumC1241 enumC124113 = EnumC1241.WRAP_CONTENT;
                            m41564(c1591, enumC124113, 0, enumC124113, 0);
                            c1591.f49276.f28284.f47790 = c1591.m37911();
                            c1591.f49260.f28284.f47790 = c1591.m37890();
                        } else {
                            EnumC1241 enumC124114 = EnumC1241.WRAP_CONTENT;
                            m41564(c1591, enumC124114, 0, enumC124114, 0);
                            c1591.f49276.f28284.f47790 = c1591.m37911();
                            c1591.f49260.f28284.f47790 = c1591.m37890();
                        }
                    }
                } else if (enumC12412 == enumC12411 || !(enumC1248 == (enumC1246 = EnumC1241.WRAP_CONTENT) || enumC1248 == EnumC1241.FIXED)) {
                    if (enumC1248 == enumC12411 && enumC12412 == enumC12411) {
                        if (i != 1 || i2 == 1) {
                            EnumC1241 enumC124115 = EnumC1241.WRAP_CONTENT;
                            m41564(c1591, enumC124115, 0, enumC124115, 0);
                            c1591.f49276.f28284.f47790 = c1591.m37911();
                            c1591.f49260.f28284.f47790 = c1591.m37890();
                        } else if (i2 == 2 && i == 2 && (((enumC1243 = (enumC1241Arr = c1906.f49244)[c]) == (enumC1244 = EnumC1241.FIXED) || enumC1243 == enumC1244) && ((enumC1245 = enumC1241Arr[1]) == enumC1244 || enumC1245 == enumC1244))) {
                            m41564(c1591, enumC1244, (int) ((f * c1906.m37911()) + 0.5f), enumC1244, (int) ((f2 * c1906.m37890()) + 0.5f));
                            c1591.f49276.f28284.mo37000(c1591.m37911());
                            c1591.f49260.f28284.mo37000(c1591.m37890());
                            c1591.f49237 = true;
                        }
                    }
                } else if (i2 == 3) {
                    if (enumC1248 == enumC1246) {
                        m41564(c1591, enumC1246, 0, enumC1246, 0);
                    }
                    int iM37912 = c1591.m37911();
                    float f3 = c1591.f49228;
                    if (c1591.m37934() == -1) {
                        f3 = 1.0f / f3;
                    }
                    EnumC1241 enumC12420 = EnumC1241.FIXED;
                    m41564(c1591, enumC12420, iM37912, enumC12420, (int) ((iM37912 * f3) + 0.5f));
                    c1591.f49276.f28284.mo37000(c1591.m37911());
                    c1591.f49260.f28284.mo37000(c1591.m37890());
                    c1591.f49237 = true;
                } else if (i2 == 1) {
                    m41564(c1591, enumC1248, 0, enumC1246, 0);
                    c1591.f49260.f28284.f47790 = c1591.m37890();
                } else if (i2 == 2) {
                    EnumC1241 enumC12421 = c1906.f49244[1];
                    EnumC1241 enumC12422 = EnumC1241.FIXED;
                    if (enumC12421 == enumC12422 || enumC12421 == enumC12413) {
                        m41564(c1591, enumC1248, c1591.m37911(), enumC12422, (int) ((f2 * c1906.m37890()) + 0.5f));
                        c1591.f49276.f28284.mo37000(c1591.m37911());
                        c1591.f49260.f28284.mo37000(c1591.m37890());
                        c1591.f49237 = true;
                    } else if (enumC1248 == enumC12411) {
                        if (i != 1) {
                            EnumC1241 enumC124116 = EnumC1241.WRAP_CONTENT;
                            m41564(c1591, enumC124116, 0, enumC124116, 0);
                            c1591.f49276.f28284.f47790 = c1591.m37911();
                            c1591.f49260.f28284.f47790 = c1591.m37890();
                        } else {
                            EnumC1241 enumC124117 = EnumC1241.WRAP_CONTENT;
                            m41564(c1591, enumC124117, 0, enumC124117, 0);
                            c1591.f49276.f28284.f47790 = c1591.m37911();
                            c1591.f49260.f28284.f47790 = c1591.m37890();
                        }
                    }
                } else if (c1101Arr[2].f19179 == null || c1101Arr[3].f19179 == null) {
                    m41564(c1591, enumC1246, 0, enumC12412, 0);
                    c1591.f49276.f28284.mo37000(c1591.m37911());
                    c1591.f49260.f28284.mo37000(c1591.m37890());
                    c1591.f49237 = true;
                } else if (enumC1248 == enumC12411) {
                    if (i != 1) {
                        EnumC1241 enumC124118 = EnumC1241.WRAP_CONTENT;
                        m41564(c1591, enumC124118, 0, enumC124118, 0);
                        c1591.f49276.f28284.f47790 = c1591.m37911();
                        c1591.f49260.f28284.f47790 = c1591.m37890();
                    } else {
                        EnumC1241 enumC124119 = EnumC1241.WRAP_CONTENT;
                        m41564(c1591, enumC124119, 0, enumC124119, 0);
                        c1591.f49276.f28284.f47790 = c1591.m37911();
                        c1591.f49260.f28284.f47790 = c1591.m37890();
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41573() {
        C1416 c1416;
        for (C1591 c1591 : this.f54506.f21023) {
            if (!c1591.f49237) {
                EnumC1241[] enumC1241Arr = c1591.f49244;
                boolean z = false;
                EnumC1241 enumC1241 = enumC1241Arr[0];
                EnumC1241 enumC1242 = enumC1241Arr[1];
                int i = c1591.f49265;
                int i2 = c1591.f49290;
                EnumC1241 enumC1243 = EnumC1241.WRAP_CONTENT;
                boolean z2 = enumC1241 == enumC1243 || (enumC1241 == EnumC1241.MATCH_CONSTRAINT && i == 1);
                if (enumC1242 == enumC1243 || (enumC1242 == EnumC1241.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C1566 c1566 = c1591.f49276.f28284;
                boolean z3 = c1566.f56464;
                C1566 c1567 = c1591.f49260.f28284;
                boolean z4 = c1567.f56464;
                if (z3 && z4) {
                    EnumC1241 enumC1244 = EnumC1241.FIXED;
                    m41564(c1591, enumC1244, c1566.f56459, enumC1244, c1567.f56459);
                    c1591.f49237 = true;
                } else if (z3 && z) {
                    m41564(c1591, EnumC1241.FIXED, c1566.f56459, enumC1243, c1567.f56459);
                    if (enumC1242 == EnumC1241.MATCH_CONSTRAINT) {
                        c1591.f49260.f28284.f47790 = c1591.m37890();
                    } else {
                        c1591.f49260.f28284.mo37000(c1591.m37890());
                        c1591.f49237 = true;
                    }
                } else if (z4 && z2) {
                    m41564(c1591, enumC1243, c1566.f56459, EnumC1241.FIXED, c1567.f56459);
                    if (enumC1241 == EnumC1241.MATCH_CONSTRAINT) {
                        c1591.f49276.f28284.f47790 = c1591.m37911();
                    } else {
                        c1591.f49276.f28284.mo37000(c1591.m37911());
                        c1591.f49237 = true;
                    }
                }
                if (c1591.f49237 && (c1416 = c1591.f49260.f62631) != null) {
                    c1416.mo37000(c1591.m37914());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41572() {
        this.f54509 = true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m41574() {
        this.f54513 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41567() {
        ArrayList<AbstractC1251> arrayList = this.f54507;
        arrayList.clear();
        C1906 c1906 = this.f54508;
        c1906.f49276.mo8446();
        c1906.f49260.mo8446();
        arrayList.add(c1906.f49276);
        arrayList.add(c1906.f49260);
        HashSet hashSet = null;
        for (C1591 c1591 : c1906.f21023) {
            if (c1591 instanceof C0996) {
                C1881 c1881 = new C1881(c1591);
                c1591.f49276.mo8446();
                c1591.f49260.mo8446();
                c1881.f28288 = ((C0996) c1591).m11506();
                arrayList.add(c1881);
            } else {
                if (c1591.m37887()) {
                    if (c1591.f49257 == null) {
                        c1591.f49257 = new C0936(c1591, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1591.f49257);
                } else {
                    arrayList.add(c1591.f49276);
                }
                if (c1591.m37907()) {
                    if (c1591.f49256 == null) {
                        c1591.f49256 = new C0936(c1591, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1591.f49256);
                } else {
                    arrayList.add(c1591.f49260);
                }
                if (c1591 instanceof C1486) {
                    arrayList.add(new C1321(c1591));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1251) it.next()).mo8446();
        }
        for (AbstractC1251 abstractC1251 : arrayList) {
            if (abstractC1251.f28286 != c1906) {
                abstractC1251.mo8442();
            }
        }
        ArrayList arrayList2 = this.f54510;
        arrayList2.clear();
        C1906 c1907 = this.f54506;
        m41563(c1907.f49276, 0, arrayList2);
        m41563(c1907.f49260, 1, arrayList2);
        this.f54509 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41565(C1706 c1706, int i, ArrayList arrayList, C0971 c0971) {
        AbstractC1251 abstractC1251 = c1706.f56454;
        C0971 c0972 = abstractC1251.f28285;
        C1706 c1707 = abstractC1251.f28289;
        C1706 c1708 = abstractC1251.f28292;
        if (c0972 == null) {
            C1906 c1906 = this.f54506;
            if (abstractC1251 == c1906.f49276 || abstractC1251 == c1906.f49260) {
                return;
            }
            if (c0971 == null) {
                c0971 = new C0971();
                c0971.f11014 = null;
                c0971.f11015 = new ArrayList();
                c0971.f11014 = abstractC1251;
                arrayList.add(c0971);
            }
            abstractC1251.f28285 = c0971;
            c0971.f11015.add(abstractC1251);
            for (InterfaceC1391 interfaceC1391 : c1708.f56457) {
                if (interfaceC1391 instanceof C1706) {
                    m41565((C1706) interfaceC1391, i, arrayList, c0971);
                }
            }
            for (InterfaceC1391 interfaceC1392 : c1707.f56457) {
                if (interfaceC1392 instanceof C1706) {
                    m41565((C1706) interfaceC1392, i, arrayList, c0971);
                }
            }
            if (i == 1 && (abstractC1251 instanceof C1776)) {
                for (InterfaceC1391 interfaceC1393 : ((C1776) abstractC1251).f62630.f56457) {
                    if (interfaceC1393 instanceof C1706) {
                        m41565((C1706) interfaceC1393, i, arrayList, c0971);
                    }
                }
            }
            Iterator it = c1708.f56463.iterator();
            while (it.hasNext()) {
                m41565((C1706) it.next(), i, arrayList, c0971);
            }
            Iterator it2 = c1707.f56463.iterator();
            while (it2.hasNext()) {
                m41565((C1706) it2.next(), i, arrayList, c0971);
            }
            if (i == 1 && (abstractC1251 instanceof C1776)) {
                Iterator it3 = ((C1776) abstractC1251).f62630.f56463.iterator();
                while (it3.hasNext()) {
                    m41565((C1706) it3.next(), i, arrayList, c0971);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41563(AbstractC1251 abstractC1251, int i, ArrayList arrayList) {
        C1706 c1706 = abstractC1251.f28292;
        C1706 c1707 = abstractC1251.f28289;
        for (InterfaceC1391 interfaceC1391 : c1706.f56457) {
            if (interfaceC1391 instanceof C1706) {
                m41565((C1706) interfaceC1391, i, arrayList, null);
            } else if (interfaceC1391 instanceof AbstractC1251) {
                m41565(((AbstractC1251) interfaceC1391).f28292, i, arrayList, null);
            }
        }
        for (InterfaceC1391 interfaceC1392 : c1707.f56457) {
            if (interfaceC1392 instanceof C1706) {
                m41565((C1706) interfaceC1392, i, arrayList, null);
            } else if (interfaceC1392 instanceof AbstractC1251) {
                m41565(((AbstractC1251) interfaceC1392).f28289, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC1391 interfaceC1393 : ((C1776) abstractC1251).f62630.f56457) {
                if (interfaceC1393 instanceof C1706) {
                    m41565((C1706) interfaceC1393, i, arrayList, null);
                }
            }
        }
    }
}
