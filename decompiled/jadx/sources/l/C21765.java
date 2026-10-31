package l;

import com.tencent.mm.opensdk.openapi.IWXAPI;

/* JADX INFO: renamed from: l.᩸ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C21765 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۤ᩹ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f69734 = {5603, 30473, 30488, 30464, 30512, 30487, 30495, 30486, 30536, 30518, 30514, 30536, 30541, 30528, 30538, 30528, 30543, 30538, 30528, 30543, 30539, 30539, 30538, 30541, 30540, 30543};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f69735;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69736;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69737;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f69738;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69739;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IWXAPI f69740;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    public C21765(AbstractActivityC3346 abstractActivityC3346, String str, long j, int i, String str2, IWXAPI iwxapi) {
        int i2 = -30505652;
        int i3 = C2167.f7158;
        int i4 = C4263.f13799;
        this.f69738 = abstractActivityC3346;
        this.f69737 = str;
        this.f69735 = j;
        this.f69739 = i;
        this.f69736 = str2;
        this.f69740 = iwxapi;
        int iM6981 = C2105.m6981("۫ۚ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-31089)) ^ 451209151;
        int i6 = 1538291401;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * 14135) >> 31));
            switch (i2) {
                case -2079045280:
                case 316136985:
                    C0237.m1481();
                    C3911.m11924();
                    iM6981 = C2105.m6981("ۘ۠") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-8605)) ^ (-860954175);
                    i6 = 521490740;
                    break;
                case -1581862265:
                case 726246164:
                    RunnableC0588.m2441();
                    RunnableC0588.m2441();
                    throw new RuntimeException();
                case -1393434136:
                case 360946519:
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("ۨ۫") ^ i4) * (-39);
                        i5 = ((iM6981 ^ i3) * (-15591)) ^ (-1083310440);
                        i6 = 450425713;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܽۙ")) * 43;
                        i5 = ((iM6981 ^ i4) * 12363) ^ 1082772635;
                        i6 = -1816826537;
                    }
                    break;
                case -809958540:
                case -716839913:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (i3 - C2105.m6981("ܽۙ")) * 43;
                        i5 = ((iM6981 ^ i4) * 12363) ^ 1082772635;
                        i6 = -1816826537;
                    } else {
                        iM6981 = C0630.m2566("ܺ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-29913)) ^ (-730545441);
                        i6 = 568285137;
                    }
                    break;
                case 511858526:
                case 1877770926:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 16503) ^ (-1327634272);
                        i6 = 384614473;
                    } else {
                        iM6981 = (C0630.m2566("ۚۧ") ^ i3) * 95;
                        i5 = ((iM6981 ^ i4) * (-13333)) ^ 1071578492;
                        i6 = 599770449;
                    }
                    break;
                case 521027074:
                case 1486282967:
                    C22628.m50615();
                    if (!C2126.m7040()) {
                        iM6981 = (i3 - C2105.m6981("ܽۙ")) * 43;
                        i5 = ((iM6981 ^ i4) * 12363) ^ 1082772635;
                        i6 = -1816826537;
                    } else {
                        iM6981 = C2105.m6981("ۘ۠") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-8605)) ^ (-860954175);
                        i6 = 521490740;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f69738);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        /*
            Method dump skipped, instruction units count: 1710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21765.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C3911.m11927(this);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        int i = -1247916560;
        int i2 = C2520.f8000;
        int i3 = C1773.f6144;
        int iM6981 = (C2105.m6981("۫ۨ") + i2) * 17;
        int i4 = ((iM6981 ^ i3) * 20359) ^ (-1553144602);
        int i5 = 2136798701;
        while (true) {
            i = ((((i ^ i3) * 22823) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1972773051:
                case 307053889:
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                        i4 = ((iM6981 ^ i2) * 21559) ^ 925164782;
                        i5 = 1808295476;
                    } else {
                        iM6981 = C0630.m2566("ܳᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14125) ^ (-1978549939);
                        i5 = -74481756;
                    }
                    break;
                case -1885763257:
                case 1881886288:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩷᩻")) * 81;
                        i4 = ((iM6981 ^ i2) * 9239) ^ 2026858339;
                        i5 = 361132013;
                    }
                    break;
                case -1320648009:
                case -518994559:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                        i4 = ((iM6981 ^ i2) * 21559) ^ 925164782;
                        i5 = 1808295476;
                    } else {
                        iM6981 = C2105.m6981("ۤۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19329)) ^ 229159139;
                        i5 = -2009956133;
                    }
                    break;
                case -1265427907:
                case 346904395:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("᩸ܰ") + i3) * (-29);
                        i4 = ((iM6981 ^ i2) * 17315) ^ 489140442;
                        i5 = -1595732739;
                    } else {
                        iM6981 = C2105.m6981("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30665)) ^ 513901707;
                        i5 = 55464593;
                    }
                    break;
                case -1185257182:
                case 770961127:
                    if (AbstractC2021.m6574()) {
                        iM6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        iM6981 = C0630.m2566("۟ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5041)) ^ (-1514914848);
                        i5 = -810713185;
                    }
                    break;
                case -1041112416:
                case 1439759393:
                    C7106.m19120();
                    C3663.m11168();
                    iM6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                    i4 = ((iM6981 ^ i2) * 21559) ^ 925164782;
                    i5 = 1808295476;
                    break;
                case -986806824:
                case 413231013:
                    if (C22628.f73083 > 0) {
                        iM6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((iM6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    }
                    break;
                case -883867227:
                case -408876647:
                    ServiceConnectionC3453.m10561(abstractActivityC3346, exc, null);
                    break;
                case -792238334:
                case 171975174:
                    C5695.m16023();
                    C2105.m6982();
                    break;
                case -759367530:
                case 494833757:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("᩸ܰ") + i3) * (-29);
                        i4 = ((iM6981 ^ i2) * 17315) ^ 489140442;
                        i5 = -1595732739;
                    } else {
                        iM6981 = (C2105.m6981("ܳۢ") ^ i2) * (-101);
                        i4 = ((iM6981 ^ i3) * (-339)) ^ (-1104657419);
                        i5 = 1554689060;
                    }
                    break;
                case -652865161:
                case 348991415:
                    C0237.m1481();
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        iM6981 = (C2105.m6981("ܶۡ") + i3) * 71;
                        i4 = ((iM6981 ^ i2) * (-7571)) ^ 284804682;
                        i5 = 870881087;
                    }
                    break;
                case -580491425:
                case 333753494:
                    abstractActivityC3346 = this.f69738;
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C2105.m6981("᩸ܰ") + i3) * (-29);
                        i4 = ((iM6981 ^ i2) * 17315) ^ 489140442;
                        i5 = -1595732739;
                    } else {
                        iM6981 = (C0630.m2566("۟ۨ") + i2) * 47;
                        i4 = ((iM6981 ^ i3) * (-15627)) ^ 2146716853;
                        i5 = 1748526742;
                    }
                    break;
                case -391234712:
                case -60919231:
                    C0630.m2564();
                    if (C0964.f3626 == 0) {
                        iM6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((iM6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    } else {
                        iM6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                        i4 = ((iM6981 ^ i2) * 21559) ^ 925164782;
                        i5 = 1808295476;
                    }
                    break;
                case 60199947:
                case 1458041138:
                    if (C0050.f910 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((iM6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    } else {
                        iM6981 = C2105.m6981("ۢۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17695)) ^ (-1122155248);
                        i5 = -1529585019;
                    }
                    break;
                case 921578699:
                case 962393388:
                    if (AbstractC2021.m6574()) {
                        iM6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        iM6981 = (C2105.m6981("ۜ᩹") + i2) * 85;
                        i4 = ((iM6981 ^ i3) * (-28151)) ^ 1335967849;
                        i5 = 1716052182;
                    }
                    break;
                default:
                    if (C4159.f13567) {
                        iM6981 = C0630.m2566("۠᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11019)) ^ 1725715785;
                        i5 = -67012872;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((iM6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    }
                    break;
            }
            return;
        }
    }
}
