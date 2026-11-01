package p067l;

import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܳۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC15934 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺۢᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f82216 = {8120, -14168, -14156, -14156, -14160, -14157, -14086, -14097, -14097, -14163, -14156, -14098, -14173, -14173, -14134};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f46100;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f46101;

    public /* synthetic */ ViewOnClickListenerC15934(int i, Object obj) {
        int i2 = 1013552772;
        int i3 = RunnableC1014.f81941;
        int i4 = C1044.f81959;
        this.f46100 = i;
        this.f46101 = obj;
        int iM55979 = (i4 - C0946.m55979("֨᩹")) * (-113);
        int i5 = ((iM55979 ^ i3) * (-18079)) ^ 2108217777;
        int i6 = 17286773;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * 29393) >> 31));
            switch (i2) {
                case -1957095622:
                case -1331269400:
                    C0949.m56012();
                    C1929.m56553();
                    throw new RuntimeException();
                case -1809925100:
                case -113349836:
                    if (!C0863.m55643()) {
                        iM55979 = C0873.m55680("ۨۘ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-10461)) ^ (-2000862327);
                        i6 = 1170935341;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-10171)) ^ (-637997480);
                        i6 = 2041649074;
                    }
                    break;
                case -786304356:
                case 687980009:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("ᩳۧ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-3833)) ^ (-112601418);
                        i6 = 1503075457;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۙ᩺")) * (-35);
                        i5 = ((iM55979 ^ i3) * 24863) ^ 1125863095;
                        i6 = -1492751425;
                    }
                    break;
                case -376270695:
                case -55879580:
                    return;
                case -236259609:
                case 1705526887:
                    C1025.m56230();
                    iM55979 = C0946.m55979("ۨۜ") ^ i3;
                    i5 = ((iM55979 ^ i4) * 26641) ^ 1460279107;
                    i6 = -783523407;
                    break;
                case 606150512:
                case 914463190:
                    C0912.m55833();
                    if (!C1929.m56553()) {
                        iM55979 = C0946.m55979("ۨۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26641) ^ 1460279107;
                        i6 = -783523407;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-10171)) ^ (-637997480);
                        i6 = 2041649074;
                    }
                    break;
                default:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ۨۘ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-10461)) ^ (-2000862327);
                        i6 = 1170935341;
                    } else {
                        iM55979 = (C0946.m55979("᩹۠") + i3) * 19;
                        i5 = ((iM55979 ^ i4) * (-28465)) ^ (-1631100132);
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
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        short[] sArr;
        ViewOnClickListenerC15934 viewOnClickListenerC15934 = this;
        int i4 = 1479264504;
        int i5 = C0989.f81920;
        int i6 = C0863.f81833;
        int iM559710 = (i5 - C0946.m55979("۠᩶")) * (-15);
        int i7 = ((iM559710 ^ i6) * 17477) ^ 334173167;
        int i8 = iM559710 ^ (-2066011861);
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
        String strM55591 = null;
        Iterator itM56090 = null;
        StringBuilder sb = null;
        AbstractActivityC5549 abstractActivityC5549 = null;
        Object obj = null;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * (-3837)) >> 31));
            switch (i4) {
                case -2133962823:
                case 1723775020:
                    C9823.m22921((C9823) obj);
                    break;
                case -2102618043:
                case 297330675:
                    int i14 = ActivityC24364.f77143;
                    RunnableC0897.m55775((ActivityC24364) obj);
                    break;
                case -1868936474:
                case 907573709:
                    C0930.m55885();
                    C1124.m56367();
                    iM55680 = (i5 - C0873.m55680("ۛܿ")) * (-89);
                    i = ((iM55680 ^ i6) * 26305) ^ (-1505406575);
                    i2 = -1161720055;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1797998280:
                case 1908397710:
                    int i15 = viewOnClickListenerC15934.f46100;
                    obj = viewOnClickListenerC15934.f46101;
                    switch (i15) {
                        case 0:
                            iM55680 = (C0873.m55680("᩺֫") + i6) * 95;
                            i = ((iM55680 ^ i5) * 4083) ^ 871690099;
                            i2 = -234917875;
                            break;
                        case 1:
                            iM55680 = (C0946.m55979("۠ᩳ") ^ i5) * 73;
                            i = ((iM55680 ^ i6) * (-16381)) ^ (-2059067142);
                            i2 = 1712279965;
                            break;
                        case 2:
                            iM55680 = C0873.m55680("ᩳۘ") ^ i6;
                            i = ((iM55680 ^ i5) * 7157) ^ 1592371249;
                            i2 = -717381082;
                            break;
                        case 3:
                            iM55680 = C0873.m55680("ܿܺ") ^ i5;
                            i = ((iM55680 ^ i6) * 529) ^ 2037827492;
                            i2 = 705334217;
                            break;
                        case 4:
                            iM55680 = C0873.m55680("᩺ۢ") ^ i6;
                            i = ((iM55680 ^ i5) * 5505) ^ 183021383;
                            i2 = 1604055751;
                            break;
                        default:
                            iM55680 = C0873.m55680("ۘܺ") ^ i5;
                            i = ((iM55680 ^ i6) * 28887) ^ 1380287834;
                            i2 = 2005834160;
                            break;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1778984086:
                case 1704778678:
                    if (C0873.f81841 > 0) {
                        sArr = sArr2;
                        int iM559711 = C0946.m55979("ۛۧ") ^ i6;
                        i8 = iM559711 ^ (-282967308);
                        sArr2 = sArr;
                        i7 = ((iM559711 ^ i5) * (-19109)) ^ (-651966986);
                        viewOnClickListenerC15934 = this;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ۛܿ")) * (-89);
                        i = ((iM55680 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1734113127:
                case 2112874412:
                    RunnableC1014.m56177();
                    C0894.m55769();
                    break;
                case -1663563780:
                case 1614258413:
                    i12 = 30792;
                    iM55680 = C0873.m55680("ܳ᩷") ^ i6;
                    i = ((iM55680 ^ i5) * (-9091)) ^ 749182940;
                    i2 = 1767140395;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1593733199:
                case -137766247:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (i5 - C0873.m55680("ۛܿ")) * (-89);
                        i = ((iM55680 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۡۖ")) * 55;
                        i = ((iM55680 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1317012157:
                case 1857293259:
                    abstractActivityC5549 = (AbstractActivityC5549) obj;
                    sArr3 = f82216;
                    i9 = 1;
                    if (C0927.f81875) {
                        iM55680 = (i5 - C0946.m55979("ۡۖ")) * 55;
                        i = ((iM55680 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    } else {
                        iM55680 = (C0946.m55979("᩷۠") ^ i5) * (-21);
                        i = ((iM55680 ^ i6) * (-6077)) ^ 923736986;
                        i2 = -1804253676;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1180012825:
                case 1024563686:
                    c = 0;
                    if (C1036.f81953 < 0) {
                        iM55680 = (i5 - C0873.m55680("ۖۡ")) * (-55);
                        i = ((iM55680 ^ i6) * (-4021)) ^ 856302206;
                        i2 = 494788854;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۡܿ")) * 27;
                        i7 = ((iM55979 ^ i6) * (-6103)) ^ (-1196961746);
                        i3 = 1331894217;
                        i8 = iM55979 ^ i3;
                        viewOnClickListenerC15934 = this;
                    }
                    break;
                case -1126953263:
                case 191204494:
                    sArr = f82216;
                    if (C0894.f81854 < 0) {
                        int iM55681 = (C0873.m55680("۫ۗ") ^ i6) * (-73);
                        i = ((iM55681 ^ i5) * 19171) ^ (-307362987);
                        i8 = iM55681 ^ 1566946028;
                        viewOnClickListenerC15934 = this;
                        sArr2 = sArr;
                        i7 = i;
                    } else {
                        int iM559712 = C0946.m55979("ۛۧ") ^ i6;
                        i8 = iM559712 ^ (-282967308);
                        sArr2 = sArr;
                        i7 = ((iM559712 ^ i5) * (-19109)) ^ (-651966986);
                        viewOnClickListenerC15934 = this;
                    }
                    break;
                case -1087380072:
                case 1665336433:
                    i12 = 51392;
                    iM55680 = C0873.m55680("ܳ᩷") ^ i6;
                    i = ((iM55680 ^ i5) * (-9091)) ^ 749182940;
                    i2 = 1767140395;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1056801618:
                case -377932710:
                    strM55591 = C0845.m55591((Spanned) C0955.m56035(itM56090));
                    if (C0912.f81867 <= 0) {
                        iM55680 = (i5 - C0946.m55979("ۡۖ")) * 55;
                        i = ((iM55680 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    } else {
                        iM55680 = (C0946.m55979("ܰۧ") ^ i5) * 15;
                        i = ((iM55680 ^ i6) * 28811) ^ (-1240338534);
                        i2 = 237720064;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -841622558:
                case 1628732604:
                    AbstractC7875.m18185((AbstractC7875) obj);
                    break;
                case -625388701:
                case 1947290128:
                    if (C0949.m56012()) {
                        iM55680 = (i5 - C0873.m55680("ۛܿ")) * (-89);
                        i = ((iM55680 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                    } else {
                        iM55680 = C0873.m55680("᩵ۘ") ^ i6;
                        i = ((iM55680 ^ i5) * (-11809)) ^ 1227388896;
                        i2 = -2005781788;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -550979963:
                case -83653572:
                    ((AbstractC18933) obj).f40549.m12181();
                    break;
                case -288520197:
                case -61544884:
                    C0912.m55825(sb, C0882.m55717(sArr4, 14, 1, i12));
                    iM55680 = (C0946.m55979("᩵᩹") + i6) * (-3);
                    i = ((iM55680 ^ i5) * (-3003)) ^ (-1707177371);
                    i2 = 1400640975;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 111204387:
                case 456958893:
                    if ((i11 + 1) - i10 <= 0) {
                        iM55680 = C0946.m55979("ۖ᩷") ^ i5;
                        i = ((iM55680 ^ i6) * (-2693)) ^ 1271523140;
                        i2 = 1242419566;
                    } else {
                        iM55680 = (C0946.m55979("ۧۚ") + i5) * 21;
                        i = ((iM55680 ^ i6) * 1777) ^ 188876178;
                        i2 = -2026501042;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 451918693:
                case 1884110558:
                    C1929.m56559(abstractActivityC5549, C0854.m55597(sArr3, i9, 13, i12));
                    break;
                case 572078963:
                case 748578252:
                    C7050.m16211((CharSequence) C0863.m55639(sb));
                    break;
                case 626575953:
                case 1395319008:
                    C1003.m56121(sb, strM55591);
                    sArr4 = f82216;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (i5 - C0946.m55979("ۡۖ")) * 55;
                        i = ((iM55680 ^ i6) * (-20015)) ^ (-131774100);
                        i2 = -564336642;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۗ") + i6) * (-15);
                        i = ((iM55680 ^ i5) * SecP521R1Field.P16) ^ (-615896663);
                        i2 = 1985103673;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 668472282:
                case 1379900805:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (i5 - C0873.m55680("ۡܿ")) * 27;
                        i7 = ((iM55979 ^ i6) * (-6103)) ^ (-1196961746);
                        i3 = 1331894217;
                    } else {
                        iM55979 = (i5 - C0946.m55979("۬ۡ")) * (-119);
                        i7 = ((iM55979 ^ i6) * (-11579)) ^ 1291479392;
                        i3 = -1310237725;
                    }
                    i8 = iM55979 ^ i3;
                    viewOnClickListenerC15934 = this;
                    break;
                case 1072820759:
                case 1198754414:
                    sb = new StringBuilder();
                    itM56090 = C0989.m56090((ArrayList) obj);
                    iM55680 = (C0946.m55979("᩵᩹") + i6) * (-3);
                    i = ((iM55680 ^ i5) * (-3003)) ^ (-1707177371);
                    i2 = 1400640975;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 1091132526:
                case 1595828048:
                    i13 = s + s3;
                    if (C0898.f81858 > 0) {
                        iM55680 = (C0873.m55680("᩹۟") + i6) * 39;
                        i = ((iM55680 ^ i5) * (-6015)) ^ (-1235560196);
                        i2 = -1416748149;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۡܿ")) * 27;
                        i7 = ((iM55979 ^ i6) * (-6103)) ^ (-1196961746);
                        i3 = 1331894217;
                        i8 = iM55979 ^ i3;
                        viewOnClickListenerC15934 = this;
                    }
                    break;
                case 1221585882:
                case 1868602507:
                    s = sArr2[c];
                    s3 = 1;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("᩵ۘ") ^ i6;
                        i = ((iM55680 ^ i5) * (-11809)) ^ 1227388896;
                        i2 = -2005781788;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۧ") + i6) * (-75);
                        i = ((iM55680 ^ i5) * (-14175)) ^ (-822173997);
                        i2 = -314613750;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 1581760983:
                case 1696220005:
                    i11 = s * s2;
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i5 - C0873.m55680("ۛܿ")) * (-89);
                        i = ((iM55680 ^ i6) * 26305) ^ (-1505406575);
                        i2 = -1161720055;
                    } else {
                        iM55680 = (i6 - C0873.m55680("᩶ۛ")) * (-21);
                        i = ((iM55680 ^ i5) * 28625) ^ 207930973;
                        i2 = -229145897;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 1742431514:
                case 1864676064:
                    i10 = i13 * i13;
                    s2 = 2;
                    if (C1229.f82066 < 0) {
                        iM55680 = (C0946.m55979("᩺᩻") + i5) * (-111);
                        i = ((iM55680 ^ i6) * (-615)) ^ 1714913411;
                        i2 = -781608899;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        sArr = sArr2;
                        int iM559713 = C0946.m55979("ۛۧ") ^ i6;
                        i8 = iM559713 ^ (-282967308);
                        sArr2 = sArr;
                        i7 = ((iM559713 ^ i5) * (-19109)) ^ (-651966986);
                        viewOnClickListenerC15934 = this;
                    }
                    break;
                default:
                    if (C0866.m55647(itM56090)) {
                        iM55680 = C0946.m55979("ۜۙ") ^ i6;
                        i = ((iM55680 ^ i5) * (-635)) ^ 96226275;
                        i2 = -638982958;
                    } else {
                        iM55680 = (C0873.m55680("֡ۜ") + i5) * (-33);
                        i = ((iM55680 ^ i6) * 19155) ^ (-1817450462);
                        i2 = 1257509890;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
