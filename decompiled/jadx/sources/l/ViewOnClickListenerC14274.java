package l;

import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܳۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14274 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺۢᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f43007 = {8120, -14168, -14156, -14156, -14160, -14157, -14086, -14097, -14097, -14163, -14156, -14098, -14173, -14173, -14134};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43008;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43009;

    public /* synthetic */ ViewOnClickListenerC14274(int i, Object obj) {
        int i2 = 1013552772;
        int i3 = RunnableC3474.f10992;
        int i4 = C4075.f12947;
        this.f43008 = i;
        this.f43009 = obj;
        int iM6981 = (i4 - C2105.m6981("֨᩹")) * (-113);
        int i5 = ((iM6981 ^ i3) * (-18079)) ^ 2108217777;
        int i6 = 17286773;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * 29393) >> 31));
            switch (i2) {
                case -1957095622:
                case -1331269400:
                    C2167.m7155();
                    C21923.m49329();
                    throw new RuntimeException();
                case -1809925100:
                case -113349836:
                    if (!C0422.m1963()) {
                        iM6981 = C0630.m2566("ۨۘ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-10461)) ^ (-2000862327);
                        i6 = 1170935341;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-10171)) ^ (-637997480);
                        i6 = 2041649074;
                    }
                    break;
                case -786304356:
                case 687980009:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ᩳۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-3833)) ^ (-112601418);
                        i6 = 1503075457;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۙ᩺")) * (-35);
                        i5 = ((iM6981 ^ i3) * 24863) ^ 1125863095;
                        i6 = -1492751425;
                    }
                    break;
                case -376270695:
                case -55879580:
                    return;
                case -236259609:
                case 1705526887:
                    C3683.m11222();
                    iM6981 = C2105.m6981("ۨۜ") ^ i3;
                    i5 = ((iM6981 ^ i4) * 26641) ^ 1460279107;
                    i6 = -783523407;
                    break;
                case 606150512:
                case 914463190:
                    C1420.m4913();
                    if (!C21923.m49329()) {
                        iM6981 = C2105.m6981("ۨۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 26641) ^ 1460279107;
                        i6 = -783523407;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-10171)) ^ (-637997480);
                        i6 = 2041649074;
                    }
                    break;
                default:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۨۘ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-10461)) ^ (-2000862327);
                        i6 = 1170935341;
                    } else {
                        iM6981 = (C2105.m6981("᩹۠") + i3) * 19;
                        i5 = ((iM6981 ^ i4) * (-28465)) ^ (-1631100132);
                        i6 = -793505080;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0164 A[PHI: r3 r6 r7 r8 r10
      0x0164: PHI (r3v5 l.ۗܺ᩷) = (r3v4 l.ۗܺ᩷), (r3v2 l.ۗܺ᩷), (r3v2 l.ۗܺ᩷), (r3v2 l.ۗܺ᩷) binds: [B:46:0x0162, B:27:0x00d3, B:23:0x00ab, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:46:0x0162, B:27:0x00d3, B:23:0x00ab, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r7v4 short[]) = (r7v3 short[]), (r7v2 short[]), (r7v2 short[]), (r7v2 short[]) binds: [B:46:0x0162, B:27:0x00d3, B:23:0x00ab, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:46:0x0162, B:27:0x00d3, B:23:0x00ab, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:46:0x0162, B:27:0x00d3, B:23:0x00ab, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x027d A[PHI: r14
      0x027d: PHI (r14v6 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:65:0x027b, B:18:0x0089, B:16:0x0085, B:13:0x007d, B:126:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02f4 A[PHI: r9 r17
      0x02f4: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:77:0x02f2, B:16:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r17v4 short) = (r17v3 short), (r17v2 short) binds: [B:77:0x02f2, B:16:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        short[] sArr;
        ViewOnClickListenerC14274 viewOnClickListenerC14274 = this;
        int i4 = 1479264504;
        int i5 = C2958.f9394;
        int i6 = C0422.f1886;
        int iM6982 = (i5 - C2105.m6981("۠᩶")) * (-15);
        int i7 = ((iM6982 ^ i6) * 17477) ^ 334173167;
        int i8 = iM6982 ^ (-2066011861);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s3 = 0;
        int i13 = 0;
        String strM947 = null;
        Iterator itM9029 = null;
        StringBuilder sb = null;
        AbstractActivityC3346 abstractActivityC3346 = null;
        Object obj = null;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * (-3837)) >> 31));
            switch (i4) {
                case -2133962823:
                case 1723775020:
                    C7844.m20956((C7844) obj);
                    break;
                case -2102618043:
                case 297330675:
                    int i14 = ActivityC23143.f74396;
                    RunnableC1108.m3781((ActivityC23143) obj);
                    break;
                case -1868936474:
                case 907573709:
                    C1773.m5908();
                    C5695.m16023();
                    iM2566 = (i5 - C0630.m2566("ۛܿ")) * (-89);
                    i = ((iM2566 ^ i6) * 26305) ^ (-1505406575);
                    i2 = -1161720055;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1797998280:
                case 1908397710:
                    int i15 = viewOnClickListenerC14274.f43008;
                    obj = viewOnClickListenerC14274.f43009;
                    switch (i15) {
                        case 0:
                            iM2566 = (C0630.m2566("᩺֫") + i6) * 95;
                            i = ((iM2566 ^ i5) * 4083) ^ 871690099;
                            i2 = -234917875;
                            break;
                        case 1:
                            iM2566 = (C2105.m6981("۠ᩳ") ^ i5) * 73;
                            i = ((iM2566 ^ i6) * (-16381)) ^ (-2059067142);
                            i2 = 1712279965;
                            break;
                        case 2:
                            iM2566 = C0630.m2566("ᩳۘ") ^ i6;
                            i = ((iM2566 ^ i5) * 7157) ^ 1592371249;
                            i2 = -717381082;
                            break;
                        case 3:
                            iM2566 = C0630.m2566("ܿܺ") ^ i5;
                            i = ((iM2566 ^ i6) * 529) ^ 2037827492;
                            i2 = 705334217;
                            break;
                        case 4:
                            iM2566 = C0630.m2566("᩺ۢ") ^ i6;
                            i = ((iM2566 ^ i5) * 5505) ^ 183021383;
                            i2 = 1604055751;
                            break;
                        default:
                            iM2566 = C0630.m2566("ۘܺ") ^ i5;
                            i = ((iM2566 ^ i6) * 28887) ^ 1380287834;
                            i2 = 2005834160;
                            break;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1778984086:
                case 1704778678:
                    if (C0630.f2410 > 0) {
                        sArr = sArr2;
                        int iM6983 = C2105.m6981("ۛۧ") ^ i6;
                        i8 = iM6983 ^ (-282967308);
                        sArr2 = sArr;
                        i7 = ((iM6983 ^ i5) * (-19109)) ^ (-651966986);
                        viewOnClickListenerC14274 = this;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ۛܿ")) * (-89);
                        i = ((iM2566 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1734113127:
                case 2112874412:
                    RunnableC3474.m10630();
                    C1047.m3599();
                    break;
                case -1663563780:
                case 1614258413:
                    i12 = 30792;
                    iM2566 = C0630.m2566("ܳ᩷") ^ i6;
                    i = ((iM2566 ^ i5) * (-9091)) ^ 749182940;
                    i2 = 1767140395;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1593733199:
                case -137766247:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i5 - C0630.m2566("ۛܿ")) * (-89);
                        i = ((iM2566 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۡۖ")) * 55;
                        i = ((iM2566 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1317012157:
                case 1857293259:
                    abstractActivityC3346 = (AbstractActivityC3346) obj;
                    sArr3 = f43007;
                    i9 = 1;
                    if (C1711.f5919) {
                        iM2566 = (i5 - C2105.m6981("ۡۖ")) * 55;
                        i = ((iM2566 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    } else {
                        iM2566 = (C2105.m6981("᩷۠") ^ i5) * (-21);
                        i = ((iM2566 ^ i6) * (-6077)) ^ 923736986;
                        i2 = -1804253676;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1180012825:
                case 1024563686:
                    c = 0;
                    if (C3911.f12484 < 0) {
                        iM2566 = (i5 - C0630.m2566("ۖۡ")) * (-55);
                        i = ((iM2566 ^ i6) * (-4021)) ^ 856302206;
                        i2 = 494788854;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۡܿ")) * 27;
                        i7 = ((iM6981 ^ i6) * (-6103)) ^ (-1196961746);
                        i3 = 1331894217;
                        i8 = iM6981 ^ i3;
                        viewOnClickListenerC14274 = this;
                    }
                    break;
                case -1126953263:
                case 191204494:
                    sArr = f43007;
                    if (C1047.f3863 < 0) {
                        int iM2567 = (C0630.m2566("۫ۗ") ^ i6) * (-73);
                        i = ((iM2567 ^ i5) * 19171) ^ (-307362987);
                        i8 = iM2567 ^ 1566946028;
                        viewOnClickListenerC14274 = this;
                        sArr2 = sArr;
                        i7 = i;
                    } else {
                        int iM6984 = C2105.m6981("ۛۧ") ^ i6;
                        i8 = iM6984 ^ (-282967308);
                        sArr2 = sArr;
                        i7 = ((iM6984 ^ i5) * (-19109)) ^ (-651966986);
                        viewOnClickListenerC14274 = this;
                    }
                    break;
                case -1087380072:
                case 1665336433:
                    i12 = 51392;
                    iM2566 = C0630.m2566("ܳ᩷") ^ i6;
                    i = ((iM2566 ^ i5) * (-9091)) ^ 749182940;
                    i2 = 1767140395;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1056801618:
                case -377932710:
                    strM947 = C0050.m947((Spanned) C2272.m7513(itM9029));
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i5 - C2105.m6981("ۡۖ")) * 55;
                        i = ((iM2566 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    } else {
                        iM2566 = (C2105.m6981("ܰۧ") ^ i5) * 15;
                        i = ((iM2566 ^ i6) * 28811) ^ (-1240338534);
                        i2 = 237720064;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -841622558:
                case 1628732604:
                    AbstractC5794.m16265((AbstractC5794) obj);
                    break;
                case -625388701:
                case 1947290128:
                    if (C2167.m7155()) {
                        iM2566 = (i5 - C0630.m2566("ۛܿ")) * (-89);
                        i = ((iM2566 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                    } else {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i6;
                        i = ((iM2566 ^ i5) * (-11809)) ^ 1227388896;
                        i2 = -2005781788;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -550979963:
                case -83653572:
                    ((AbstractC17429) obj).f37526.m10145();
                    break;
                case -288520197:
                case -61544884:
                    C1420.m4905(sb, C0798.m3005(sArr4, 14, 1, i12));
                    iM2566 = (C2105.m6981("᩵᩹") + i6) * (-3);
                    i = ((iM2566 ^ i5) * (-3003)) ^ (-1707177371);
                    i2 = 1400640975;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 111204387:
                case 456958893:
                    if ((i11 + 1) - i10 <= 0) {
                        iM2566 = C2105.m6981("ۖ᩷") ^ i5;
                        i = ((iM2566 ^ i6) * (-2693)) ^ 1271523140;
                        i2 = 1242419566;
                    } else {
                        iM2566 = (C2105.m6981("ۧۚ") + i5) * 21;
                        i = ((iM2566 ^ i6) * 1777) ^ 188876178;
                        i2 = -2026501042;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 451918693:
                case 1884110558:
                    C21923.m49335(abstractActivityC3346, C0237.m1483(sArr3, i9, 13, i12));
                    break;
                case 572078963:
                case 748578252:
                    C4925.m14314((CharSequence) C0422.m1959(sb));
                    break;
                case 626575953:
                case 1395319008:
                    C3245.m9923(sb, strM947);
                    sArr4 = f43007;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (i5 - C2105.m6981("ۡۖ")) * 55;
                        i = ((iM2566 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۗ") + i6) * (-15);
                        i = ((iM2566 ^ i5) * SecP521R1Field.P16) ^ (-615896663);
                        i2 = 1985103673;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 668472282:
                case 1379900805:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (i5 - C0630.m2566("ۡܿ")) * 27;
                        i7 = ((iM6981 ^ i6) * (-6103)) ^ (-1196961746);
                        i3 = 1331894217;
                    } else {
                        iM6981 = (i5 - C2105.m6981("۬ۡ")) * (-119);
                        i7 = ((iM6981 ^ i6) * (-11579)) ^ 1291479392;
                        i3 = -1310237725;
                    }
                    i8 = iM6981 ^ i3;
                    viewOnClickListenerC14274 = this;
                    break;
                case 1072820759:
                case 1198754414:
                    sb = new StringBuilder();
                    itM9029 = C2958.m9029((ArrayList) obj);
                    iM2566 = (C2105.m6981("᩵᩹") + i6) * (-3);
                    i = ((iM2566 ^ i5) * (-3003)) ^ (-1707177371);
                    i2 = 1400640975;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 1091132526:
                case 1595828048:
                    i13 = s + s3;
                    if (C1128.f4106 > 0) {
                        iM2566 = (C0630.m2566("᩹۟") + i6) * 39;
                        i = ((iM2566 ^ i5) * (-6015)) ^ (-1235560196);
                        i2 = -1416748149;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۡܿ")) * 27;
                        i7 = ((iM6981 ^ i6) * (-6103)) ^ (-1196961746);
                        i3 = 1331894217;
                        i8 = iM6981 ^ i3;
                        viewOnClickListenerC14274 = this;
                    }
                    break;
                case 1221585882:
                case 1868602507:
                    s = sArr2[c];
                    s3 = 1;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i6;
                        i = ((iM2566 ^ i5) * (-11809)) ^ 1227388896;
                        i2 = -2005781788;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۧ") + i6) * (-75);
                        i = ((iM2566 ^ i5) * (-14175)) ^ (-822173997);
                        i2 = -314613750;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 1581760983:
                case 1696220005:
                    i11 = s * s2;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (i5 - C0630.m2566("ۛܿ")) * (-89);
                        i = ((iM2566 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                    } else {
                        iM2566 = (i6 - C0630.m2566("᩶ۛ")) * (-21);
                        i = ((iM2566 ^ i5) * 28625) ^ 207930973;
                        i2 = -229145897;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 1742431514:
                case 1864676064:
                    i10 = i13 * i13;
                    s2 = 2;
                    if (C7811.f24123 < 0) {
                        iM2566 = (C2105.m6981("᩺᩻") + i5) * (-111);
                        i = ((iM2566 ^ i6) * (-615)) ^ 1714913411;
                        i2 = -781608899;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        sArr = sArr2;
                        int iM6985 = C2105.m6981("ۛۧ") ^ i6;
                        i8 = iM6985 ^ (-282967308);
                        sArr2 = sArr;
                        i7 = ((iM6985 ^ i5) * (-19109)) ^ (-651966986);
                        viewOnClickListenerC14274 = this;
                    }
                    break;
                default:
                    if (C0483.m2123(itM9029)) {
                        iM2566 = C2105.m6981("ۜۙ") ^ i6;
                        i = ((iM2566 ^ i5) * (-635)) ^ 96226275;
                        i2 = -638982958;
                    } else {
                        iM2566 = (C0630.m2566("֡ۜ") + i5) * (-33);
                        i = ((iM2566 ^ i6) * 19155) ^ (-1817450462);
                        i2 = 1257509890;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
