package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plugin.api.PluginContext;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.֡ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D2S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2886 extends AbstractC5462 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ۖܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f81838 = {6008, 19885, -21501, 32212, -17254, -17205, -22678, 17016, -18594, 23468, 24393, -18050, 18414, 19410, 19363, -22832, 827, 4569, 15207, 7043, 6519, 4573, 13397, -2302, -579, 5166, 6986, 2929, 4073, -2394, -2759, -6796, -2026, 6911, -1759, -7286, -2523, -3423, 14913, 7808, -6650, -7474, -6851, 4276, -6280, 5518, 7114, 606, 3351, 32401, 28452, -18386, -29120, 32728, -31580, -4114, -4127, -4124, -4115, -4101, 26028, -25507, -24070, 27218, -18509, 29250, 1307, 1250, 1904, 7131, 14707, 8492, -6205, 4801, -934, -7416};

    /* JADX INFO: renamed from: ۗ */
    public C0990 f4986;

    /* JADX INFO: renamed from: ۙ */
    public C18249 f4987;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7581 f4988;

    /* JADX INFO: renamed from: ۬ */
    public TextView f4989;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f4990;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f4991;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f4992;

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m4655(ViewOnClickListenerC2886 viewOnClickListenerC2886) {
        C18249 c18249 = null;
        PluginContext pluginContextM41540 = null;
        int i = -954931315;
        int i2 = C0967.f81910;
        int i3 = C1046.f81962;
        int iM55979 = (C0946.m55979("ۢܰ") ^ i3) * (-99);
        int i4 = ((iM55979 ^ i2) * (-23499)) ^ 938783135;
        int i5 = 1427750092;
        while (true) {
            i = ((((i ^ i2) * 5521) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -731860832:
                case 1535494865:
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0873.m55680("ܳ᩷") + i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩺ᩳ")) * 43;
                        i4 = ((iM55979 ^ i2) * 19431) ^ 655159799;
                        i5 = -697135318;
                    }
                    break;
                case -719227538:
                case -3534252:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0873.m55680("ܳ᩷") + i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        iM55979 = C0946.m55979("᩻᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28997)) ^ 970803307;
                        i5 = 223289131;
                    }
                    break;
                case -538577965:
                case 1924828874:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (i3 - C0946.m55979("᩶ۨ")) * (-107);
                        i4 = ((iM55979 ^ i2) * (-22935)) ^ (-1277624976);
                        i5 = 1428466667;
                    } else {
                        iM55979 = (C0873.m55680("ܶܿ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    }
                    break;
                case -298667534:
                case 1183015703:
                    C0898.m55800();
                    iM55979 = (C0873.m55680("ܶܿ") ^ i2) * 31;
                    i4 = ((iM55979 ^ i3) * (-13543)) ^ 1134981851;
                    i5 = 1147597463;
                    break;
                case -166916763:
                case 1223845273:
                    C0912.m55833();
                    if (!C0892.f81851) {
                        iM55979 = (C0946.m55979("۫ۗ") + i3) * 81;
                        i4 = ((iM55979 ^ i2) * (-28255)) ^ (-460109810);
                        i5 = 79002921;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩶ۨ")) * (-107);
                        i4 = ((iM55979 ^ i2) * (-22935)) ^ (-1277624976);
                        i5 = 1428466667;
                    }
                    break;
                case 2841526:
                case 694512962:
                    C1017.m56187();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (C0873.m55680("ܶܿ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        iM55979 = (C0946.m55979("۫ۨ") + i2) * (-99);
                        i4 = ((iM55979 ^ i3) * 8127) ^ (-959359062);
                        i5 = 150856168;
                    }
                    break;
                case 249153820:
                case 1899699928:
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ܳۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26941) ^ (-263635762);
                        i5 = -601918066;
                    } else {
                        iM55979 = (C0946.m55979("۫ۗ") + i3) * 81;
                        i4 = ((iM55979 ^ i2) * (-28255)) ^ (-460109810);
                        i5 = 79002921;
                    }
                    break;
                case 352526194:
                case 600124638:
                    if (C0917.f81868) {
                        iM55979 = (i3 - C0946.m55979("᩶ۨ")) * (-107);
                        i4 = ((iM55979 ^ i2) * (-22935)) ^ (-1277624976);
                        i5 = 1428466667;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25361) ^ 2059594000;
                        i5 = -1595873645;
                    }
                    break;
                case 467075407:
                case 690514797:
                    pluginContextM41540 = c18249.m41540();
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("ܳ᩷") + i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        iM55979 = (C0946.m55979("ۨۖ") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-24561)) ^ 356782039;
                        i5 = -239978039;
                    }
                    break;
                case 547834095:
                case 675425207:
                    ((C12474) pluginContextM41540).openPreference(null);
                    break;
                case 623928041:
                case 1927404051:
                    c18249 = viewOnClickListenerC2886.f4987;
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("۫ۗ") + i3) * 81;
                        i4 = ((iM55979 ^ i2) * (-28255)) ^ (-460109810);
                        i5 = 79002921;
                    } else {
                        iM55979 = (i2 - C0873.m55680("֫֨")) * 21;
                        i4 = ((iM55979 ^ i3) * 9305) ^ (-1397214082);
                        i5 = -1588266195;
                    }
                    break;
                case 725925956:
                case 1974401572:
                    if (C0877.m55696()) {
                        iM55979 = (C0946.m55979("ۨۡ") + i3) * 45;
                        i4 = ((iM55979 ^ i2) * (-16463)) ^ (-641258256);
                        i5 = 1330564668;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩷") + i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    }
                    break;
                case 1097198794:
                case 1915444186:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ܶܿ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        iM55979 = (C0873.m55680("۠ۚ") + i3) * 97;
                        i4 = ((iM55979 ^ i2) * 18285) ^ (-104285165);
                        i5 = -878798740;
                    }
                    break;
                case 1153248549:
                case 1161569360:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0873.m55680("ܳ᩷") + i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        iM55979 = C0873.m55680("ۚۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 993) ^ (-752539426);
                        i5 = -1633219481;
                    }
                    break;
                case 1471896542:
                case 1705970379:
                    if (RunnableC0897.m55784()) {
                        iM55979 = (C0873.m55680("ܶܿ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩺") ^ i3) * (-27);
                        i4 = ((iM55979 ^ i2) * (-23167)) ^ 1178473917;
                        i5 = -1427400541;
                    }
                    break;
                default:
                    C0894.m55769();
                    C0912.m55833();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x040c A[PHI: r2 r7 r8 r24 r25 r26 r27 r32 r35
      0x040c: PHI (r2v33 int) = (r2v32 int), (r2v34 int) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r7v4 int) = (r7v3 int), (r7v1 int) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r8v2 int) = (r8v1 int), (r8v4 int) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r24v17 int) = (r24v16 int), (r24v18 int) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r25v17 l.ۗܺ᩷) = (r25v16 l.ۗܺ᩷), (r25v18 l.ۗܺ᩷) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r26v17 l.ۗܺ᩷) = (r26v16 l.ۗܺ᩷), (r26v18 l.ۗܺ᩷) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r27v17 short[]) = (r27v16 short[]), (r27v18 short[]) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r32v26 java.lang.Object[]) = (r32v25 java.lang.Object[]), (r32v27 java.lang.Object[]) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r35v21 java.lang.Object[]) = (r35v20 java.lang.Object[]), (r35v22 java.lang.Object[]) binds: [B:66:0x040a, B:62:0x03cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: ֫ */
    public static void m4652(ViewOnClickListenerC2886 viewOnClickListenerC2886, final DialogInterfaceC2564 dialogInterfaceC2564, MenuItem menuItem) {
        Object[] objArr;
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        Object[] objArr2;
        int i5;
        Object[] objArr3;
        char c;
        AbstractActivityC5549 abstractActivityC5549;
        int i6;
        short[] sArr;
        AbstractActivityC5549 abstractActivityC55410;
        ?? r3;
        int iM559710;
        int i7;
        int i8;
        int i9;
        int iM55681;
        int i10;
        Object[] objArr4;
        AbstractActivityC5549 abstractActivityC55411;
        AbstractActivityC5549 abstractActivityC55412;
        Object[] objArr5;
        int iM55682;
        short[] sArr2;
        int i11;
        final ViewOnClickListenerC2886 viewOnClickListenerC2887 = viewOnClickListenerC2886;
        int i12 = 0;
        String str = null;
        char c2 = 0;
        int iM55683 = 0;
        int iM55684 = 0;
        int iM55685 = 0;
        C20671 c20671 = null;
        C18249 c18249 = null;
        String strM55921 = null;
        int iM559711 = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 2091285074;
        int i14 = C1404.f82149;
        int i15 = C0906.f81862;
        int iM559712 = C0946.m55979("᩷ۙ") ^ i14;
        int i16 = ((iM559712 ^ i15) * (-30367)) ^ 1046726114;
        int i17 = iM559712 ^ (-2108990220);
        C20671 c20672 = null;
        AbstractActivityC5549 abstractActivityC55413 = null;
        String strM56159 = null;
        AbstractActivityC5549 abstractActivityC55414 = null;
        Object[] objArr6 = null;
        short[] sArr3 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iM55998 = 0;
        C7581 c7581 = null;
        Object[] objArr7 = null;
        short[] sArr4 = null;
        int i21 = 0;
        C18249 c182410 = null;
        String strM56285 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 29107) >> 31));
            switch (i13) {
                case -2104603620:
                case -878705168:
                    strM56285 = C1044.m56285(abstractActivityC55414, C0873.m55680(C1024.m56203(sArr4, i18, 3, i19)) ^ 2127430547, objArr6);
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("᩵֡") ^ i14;
                        i = ((iM55680 ^ i15) * (-2933)) ^ 176372303;
                        i2 = 54543293;
                    } else {
                        iM55680 = C0873.m55680("᩸᩹") ^ i14;
                        i = ((iM55680 ^ i15) * 6097) ^ (-1841155076);
                        i2 = 1617582502;
                    }
                    objArr = objArr6;
                    i17 = iM55680 ^ i2;
                    i16 = i;
                    objArr6 = objArr;
                    break;
                case -2005482086:
                case 1364615833:
                    i19 = 31727;
                    iM55979 = (i15 - C0946.m55979("֫᩻")) * 57;
                    i16 = ((iM55979 ^ i14) * 15289) ^ (-1753099467);
                    i3 = 540518840;
                    i4 = iM55979 ^ i3;
                    c2 = c2;
                    abstractActivityC55414 = abstractActivityC55414;
                    sArr3 = sArr3;
                    iM55998 = iM55998;
                    i21 = i21;
                    abstractActivityC55413 = abstractActivityC55413;
                    objArr6 = objArr6;
                    objArr7 = objArr7;
                    i17 = i4;
                    viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    break;
                case -1865635131:
                case 1594406893:
                    objArr4 = objArr6;
                    abstractActivityC55411 = abstractActivityC55414;
                    abstractActivityC55412 = abstractActivityC55413;
                    strM56159 = strM56159;
                    objArr5 = new Object[i12];
                    objArr5[c2] = c182410.m41538();
                    sArr3 = f81838;
                    i21 = 42;
                    if (C0892.f81851) {
                        iM55682 = (i14 - C0873.m55680("᩻ܽ")) * (-7);
                        sArr2 = sArr3;
                        i16 = ((iM55682 ^ i15) * (-24953)) ^ (-597079737);
                        i11 = -1992789352;
                    } else {
                        iM55682 = C0873.m55680("᩸ᩴ") ^ i15;
                        sArr2 = sArr3;
                        i16 = ((iM55682 ^ i14) * 16659) ^ (-14779445);
                        i11 = -2051688170;
                    }
                    short[] sArr5 = sArr2;
                    strM56159 = strM56159;
                    objArr6 = objArr4;
                    i17 = iM55682 ^ i11;
                    abstractActivityC55413 = abstractActivityC55412;
                    objArr7 = objArr5;
                    abstractActivityC55414 = abstractActivityC55411;
                    sArr3 = sArr5;
                    break;
                case -1699344917:
                case -680960691:
                    C0927.m55873();
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    iM55681 = (C0946.m55979("ܿܳ") ^ i15) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i7 = ((iM55681 ^ i14) * 24823) ^ (-373766492);
                    i10 = -1537378995;
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1679177485:
                case 1519389894:
                    C1229.m56410();
                    break;
                case -1667272590:
                case 1869349403:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    iM55685 = C0873.m55680(C1964.m56584(f81838, 36, 3, i19)) ^ 2101398751;
                    int i22 = i20;
                    if (i5 == i22) {
                        iM55681 = (i15 - C0873.m55680("ܺ᩵")) * 73;
                        i20 = i22;
                        i7 = ((iM55681 ^ i14) * 26841) ^ 656933799;
                        i10 = -3080009;
                    } else {
                        i20 = i22;
                        iM55681 = (C0873.m55680("ܽܿ") + i14) * (-103);
                        i7 = ((iM55681 ^ i15) * 11379) ^ 178976280;
                        i10 = -1619635773;
                    }
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1663714963:
                case 1547844544:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    c = c2;
                    iM559711 = C0946.m55979(C0854.m55597(f81838, 27, 3, i19));
                    iM559710 = (C0873.m55680("ܽ֫") ^ i15) * (-51);
                    i7 = ((iM559710 ^ i14) * 26351) ^ (-1369288559);
                    i8 = 341923151;
                    r3 = i12;
                    i9 = iM559710 ^ i8;
                    c2 = c;
                    i12 = r3;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1624270688:
                case 1546896725:
                    objArr6 = objArr6;
                    AbstractActivityC5549 abstractActivityC55415 = c7581.f19861;
                    int i23 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(abstractActivityC55415);
                    C0861.m55627(c20671, iM55685);
                    abstractActivityC55414 = c7581.f19861;
                    C18249 c182411 = viewOnClickListenerC2887.f4987;
                    if (!C1929.m56553()) {
                        int iM559713 = C0946.m55979("᩺֨") ^ i15;
                        c18249 = c182411;
                        i16 = ((iM559713 ^ i14) * 20035) ^ 655510802;
                        objArr = objArr6;
                        i17 = iM559713 ^ (-85321637);
                        objArr6 = objArr;
                    } else {
                        c18249 = c182411;
                        iM55998 = iM55998;
                        objArr7 = objArr7;
                        c2 = c2;
                        abstractActivityC55413 = abstractActivityC55413;
                        i21 = i21;
                        sArr3 = sArr3;
                        int iM55686 = C0873.m55680("ۢ᩵") ^ i14;
                        i16 = ((iM55686 ^ i15) * (-22621)) ^ 677615532;
                        i4 = iM55686 ^ (-953279519);
                        c2 = c2;
                        sArr3 = sArr3;
                        iM55998 = iM55998;
                        i21 = i21;
                        abstractActivityC55413 = abstractActivityC55413;
                        objArr6 = objArr6;
                        objArr7 = objArr7;
                        i17 = i4;
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    }
                    break;
                case -1490553791:
                case 1336848353:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    c = c2;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    if (i5 == (C0873.m55680(RunnableC0897.m55783(f81838, 24, 3, i19)) ^ 2099553483)) {
                        iM559710 = (C0873.m55680("ᩳ۟") ^ i15) * 87;
                        i7 = ((iM559710 ^ i14) * (-27919)) ^ 1280479995;
                        i8 = 119965272;
                        r3 = i12;
                    } else {
                        iM559710 = C0946.m55979("ᩳܰ") ^ i14;
                        i7 = ((iM559710 ^ i15) * 7825) ^ 1869216007;
                        i8 = 1224516940;
                        r3 = i12;
                    }
                    i9 = iM559710 ^ i8;
                    c2 = c;
                    i12 = r3;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1435364199:
                case 725785935:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    c = c2;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    r3 = 1;
                    r3 = 1;
                    str = null;
                    if (i5 == (C0873.m55680(strM55921) ^ 2130012169)) {
                        iM559710 = C0946.m55979("᩹᩹") ^ i15;
                        i7 = ((iM559710 ^ i14) * (-7825)) ^ (-1871714307);
                        i8 = -1233042114;
                    } else {
                        iM559710 = C0946.m55979("ۨ֨") ^ i15;
                        i7 = ((iM559710 ^ i14) * (-23639)) ^ 1023022927;
                        i8 = 137337258;
                    }
                    i9 = iM559710 ^ i8;
                    c2 = c;
                    i12 = r3;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1418744118:
                case 1037784429:
                    objArr2 = objArr6;
                    short[] sArr6 = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    Object[] objArr8 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr6;
                    objArr3 = objArr8;
                    i5 = iM55998;
                    if (i5 == (C0873.m55680(C1024.m56203(f81838, 39, 3, i19)) ^ 2125374567)) {
                        iM55681 = C0946.m55979("ۢܽ") ^ i14;
                        i7 = ((iM55681 ^ i15) * 28021) ^ 581849353;
                        i10 = 1258644231;
                    } else {
                        iM55681 = (C0946.m55979("᩻֫") + i15) * 39;
                        i7 = ((iM55681 ^ i14) * (-31579)) ^ (-1617045356);
                        i10 = 1589773916;
                    }
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1354128206:
                case -1143480110:
                    objArr2 = objArr6;
                    short[] sArr7 = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    int i24 = i21;
                    int iM55687 = C0873.m55680(C1124.m56373(sArr7, i24, 3, i19)) ^ 2097506111;
                    sArr = sArr7;
                    AbstractActivityC5549 abstractActivityC55416 = abstractActivityC55413;
                    i6 = i24;
                    Object[] objArr9 = objArr7;
                    strM56159 = ServiceConnectionC1013.m56159(abstractActivityC55416, iM55687, objArr9);
                    if (C0989.f81920 >= 0) {
                        abstractActivityC5549 = abstractActivityC55416;
                        objArr3 = objArr9;
                        i5 = iM55998;
                        iM55681 = (C0946.m55979("ܿܳ") ^ i15) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM55681 ^ i14) * 24823) ^ (-373766492);
                        i10 = -1537378995;
                        i9 = iM55681 ^ i10;
                        i12 = i12;
                        iM55998 = i5;
                        objArr6 = objArr2;
                        i17 = i9;
                        i16 = i7;
                        abstractActivityC55414 = abstractActivityC55410;
                        sArr3 = sArr;
                        i21 = i6;
                        abstractActivityC55413 = abstractActivityC5549;
                        objArr7 = objArr3;
                    } else {
                        int iM55688 = C0873.m55680("֫᩹") ^ i15;
                        i16 = ((iM55688 ^ i14) * (-28855)) ^ (-332914021);
                        i17 = iM55688 ^ (-551756599);
                        objArr6 = objArr2;
                        objArr7 = objArr9;
                        abstractActivityC55414 = abstractActivityC55410;
                        sArr3 = sArr;
                        i21 = i6;
                        abstractActivityC55413 = abstractActivityC55416;
                    }
                    break;
                case -1270664805:
                case -1214559343:
                    C1017.m56182(c20671, strM56285);
                    C0906.m55817(c20671, iM55684, new DialogInterface.OnClickListener(viewOnClickListenerC2887) { // from class: l.ᩴܽ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ ViewOnClickListenerC2886 f62769;

                        {
                            int i25 = -1511053334;
                            int i26 = C1404.f82149;
                            int i27 = C1229.f82066;
                            int iM55689 = (i27 - C0873.m55680("ۖܽ")) * 19;
                            int i28 = ((iM55689 ^ i26) * 19547) ^ 1649635030;
                            int i29 = -1367826901;
                            while (true) {
                                i25 = ((((i25 ^ i26) * 3789) >> 31) & i28) ^ (iM55689 ^ i29);
                                switch (i25) {
                                    case -1721444963:
                                    case 1357326388:
                                        C0861.m55626();
                                        iM55689 = (C0946.m55979("ۨܿ") + i26) * (-105);
                                        i28 = ((iM55689 ^ i27) * (-24007)) ^ (-939097278);
                                        i29 = 1411613703;
                                        break;
                                    case -1699283381:
                                    case 1320238377:
                                        this.f62769 = viewOnClickListenerC2887;
                                        if (C0906.f81862 >= 0) {
                                            iM55689 = C0873.m55680("ܺ۟") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 31567) ^ (-835786110);
                                            i29 = -1982214353;
                                        } else {
                                            iM55689 = (C0946.m55979("᩸֨") ^ i27) * 93;
                                            i28 = ((iM55689 ^ i26) * 10247) ^ (-458160697);
                                            i29 = -480782333;
                                        }
                                        break;
                                    case -1633510749:
                                    case 1033159346:
                                        if (C1048.f81963) {
                                            iM55689 = (i27 - C0873.m55680("᩹ۘ")) * (-113);
                                            i28 = ((iM55689 ^ i26) * 3025) ^ 373959967;
                                            i29 = 1221985748;
                                        } else {
                                            iM55689 = C0946.m55979("֡ۖ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 26703) ^ 2124217874;
                                            i29 = 984203349;
                                        }
                                        break;
                                    case -1476642659:
                                    case 1942594099:
                                        if (C1003.m56123() != 0) {
                                            iM55689 = (C0946.m55979("ۨܿ") + i26) * (-105);
                                            i28 = ((iM55689 ^ i27) * (-24007)) ^ (-939097278);
                                            i29 = 1411613703;
                                        } else {
                                            iM55689 = (C0946.m55979("ܺܺ") ^ i26) * 25;
                                            i28 = ((iM55689 ^ i27) * 22917) ^ 1232007049;
                                            i29 = 1245908854;
                                        }
                                        break;
                                    case -1367827534:
                                    case -660538606:
                                        C0946.m55980();
                                        C1003.m56123();
                                        throw new RuntimeException();
                                    case -1311491300:
                                    case -293383620:
                                        C1003.m56123();
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55689 = C0873.m55680("ܺ۟") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 31567) ^ (-835786110);
                                            i29 = -1982214353;
                                        } else {
                                            iM55689 = C0873.m55680("ۗ۫") ^ i27;
                                            i28 = ((iM55689 ^ i26) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 1757048710;
                                            i29 = 1133753063;
                                        }
                                        break;
                                    case -1299167837:
                                    case -228348588:
                                        if (C1028.m56247() < 0) {
                                            iM55689 = (C0946.m55979("ᩳۛ") ^ i27) * (-43);
                                            i28 = ((iM55689 ^ i26) * 12647) ^ (-1419688008);
                                            i29 = 1289960143;
                                        } else {
                                            iM55689 = (C0946.m55979("ۨܿ") + i26) * (-105);
                                            i28 = ((iM55689 ^ i27) * (-24007)) ^ (-939097278);
                                            i29 = 1411613703;
                                        }
                                        break;
                                    case -1297042564:
                                    case 1774973277:
                                        if (C0955.m56025()) {
                                            iM55689 = C0946.m55979("֡ۖ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 26703) ^ 2124217874;
                                            i29 = 984203349;
                                        } else {
                                            iM55689 = C0873.m55680("᩹ۖ") ^ i27;
                                            i28 = ((iM55689 ^ i26) * 13771) ^ (-1707116896);
                                            i29 = -427395214;
                                        }
                                        break;
                                    case -227556502:
                                    case 630215588:
                                        if (C0917.f81868) {
                                            iM55689 = C0873.m55680("ۗ۫") ^ i27;
                                            i28 = ((iM55689 ^ i26) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 1757048710;
                                            i29 = 1133753063;
                                        } else {
                                            iM55689 = (i26 - C0873.m55680("ۗ֡")) * (-9);
                                            i28 = ((iM55689 ^ i27) * 5201) ^ 1460397640;
                                            i29 = -481839997;
                                        }
                                        break;
                                    case -196129866:
                                    case 980892543:
                                        if (C1194.f82045 != 0) {
                                            iM55689 = C0946.m55979("֡ۖ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 26703) ^ 2124217874;
                                            i29 = 984203349;
                                        } else {
                                            iM55689 = (i27 - C0873.m55680("ۧۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i28 = ((iM55689 ^ i26) * (-18481)) ^ (-1735863833);
                                            i29 = 1772977256;
                                        }
                                        break;
                                    case -125405513:
                                    case 1055927148:
                                        if (C1404.f82149 >= 0) {
                                            iM55689 = C0946.m55979("֡ۖ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 26703) ^ 2124217874;
                                            i29 = 984203349;
                                        } else {
                                            iM55689 = C0873.m55680("ۤۖ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * (-2271)) ^ 1493988916;
                                            i29 = -649317013;
                                        }
                                        break;
                                    case 90924238:
                                    case 1190401592:
                                        if (C0882.m55710() != 0) {
                                            iM55689 = (C0946.m55979("ᩳۛ") ^ i27) * (-43);
                                            i28 = ((iM55689 ^ i26) * 12647) ^ (-1419688008);
                                            i29 = 1289960143;
                                        } else {
                                            iM55689 = C0946.m55979("ۚܿ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 16327) ^ 785968475;
                                            i29 = 543536943;
                                        }
                                        break;
                                    case 224841253:
                                    case 546903608:
                                        return;
                                    case 283617834:
                                    case 1467320648:
                                        if (C1028.m56247() >= 0) {
                                            iM55689 = (C0946.m55979("ᩳۛ") ^ i27) * (-43);
                                            i28 = ((iM55689 ^ i26) * 12647) ^ (-1419688008);
                                            i29 = 1289960143;
                                        } else {
                                            iM55689 = C0873.m55680("ۢۜ") ^ i27;
                                            i28 = ((iM55689 ^ i26) * 14933) ^ 1448270474;
                                            i29 = -535773078;
                                        }
                                        break;
                                    case 1143170568:
                                    case 1373690135:
                                        if (C1012.f81938 >= 0) {
                                            iM55689 = C0946.m55979("֡ۖ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * 26703) ^ 2124217874;
                                            i29 = 984203349;
                                        } else {
                                            iM55689 = C0946.m55979("ۧܺ") ^ i26;
                                            i28 = ((iM55689 ^ i27) * (-10613)) ^ (-601304055);
                                            i29 = 1250451628;
                                        }
                                        break;
                                    default:
                                        C0861.m55626();
                                        if (C0877.f81843 >= 0) {
                                            iM55689 = C0873.m55680("ۗ۫") ^ i27;
                                            i28 = ((iM55689 ^ i26) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 1757048710;
                                            i29 = 1133753063;
                                        } else {
                                            iM55689 = (C0946.m55979("ᩳۛ") ^ i27) * (-43);
                                            i28 = ((iM55689 ^ i26) * 12647) ^ (-1419688008);
                                            i29 = 1289960143;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i25) {
                            int i26 = 1798368320;
                            int i27 = RunnableC1014.f81941;
                            int i28 = AbstractC0942.f81890;
                            int iM559714 = (i28 - C0946.m55979("۠᩶")) * 13;
                            int i29 = ((iM559714 ^ i27) * 30805) ^ 1309169736;
                            int i30 = 1655834218;
                            while (true) {
                                i26 = ((((i26 ^ i27) * 11271) >> 31) & i29) ^ (iM559714 ^ i30);
                                switch (i26) {
                                    case -2021630700:
                                    case -559420630:
                                        if (C0906.f81862 >= 0) {
                                            iM559714 = C0873.m55680("۫۫") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 30665) ^ 1065592178;
                                            i30 = 1030701322;
                                        } else {
                                            iM559714 = C0873.m55680("᩺ۜ") ^ i27;
                                            i29 = ((iM559714 ^ i28) * (-16295)) ^ 351676696;
                                            i30 = -1309495178;
                                        }
                                        break;
                                    case -1997714070:
                                    case -840233404:
                                        C0898.m55800();
                                        break;
                                    case -1939226134:
                                    case -1603964914:
                                        if (C1012.f81938 >= 0) {
                                            iM559714 = C0873.m55680("۫۫") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 30665) ^ 1065592178;
                                            i30 = 1030701322;
                                        } else {
                                            iM559714 = (i27 - C0946.m55979("ܳۛ")) * (-31);
                                            i29 = ((iM559714 ^ i28) * (-29101)) ^ 1300301132;
                                            i30 = -99936209;
                                        }
                                        break;
                                    case -1844537968:
                                    case 1202861987:
                                        if (C1124.f82007 >= 0) {
                                            iM559714 = C0946.m55979("᩹᩻") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 8677) ^ (-1976226357);
                                            i30 = -2064397877;
                                        } else {
                                            iM559714 = (C0873.m55680("ۢ᩷") ^ i28) * 73;
                                            i29 = ((iM559714 ^ i27) * 6345) ^ 1555662714;
                                            i30 = -955537682;
                                        }
                                        break;
                                    case -1701507443:
                                    case -261247944:
                                        if (!C0882.f81846) {
                                            iM559714 = (i27 - C0946.m55979("ᩴ֨")) * (-5);
                                            i29 = ((iM559714 ^ i28) * (-15137)) ^ 1212825003;
                                            i30 = -1037393232;
                                        } else {
                                            iM559714 = C0946.m55979("᩹᩻") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 8677) ^ (-1976226357);
                                            i30 = -2064397877;
                                        }
                                        break;
                                    case -1692808590:
                                    case 809877633:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM559714 = C0873.m55680("۫۫") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 30665) ^ 1065592178;
                                            i30 = 1030701322;
                                        } else {
                                            iM559714 = (i27 - C0946.m55979("᩹ۡ")) * (-63);
                                            i29 = ((iM559714 ^ i28) * 759) ^ 352810363;
                                            i30 = -1199875716;
                                        }
                                        break;
                                    case -1660997939:
                                    case -803518855:
                                        if (C0854.f81826 != 0) {
                                            iM559714 = C0873.m55680("۫۫") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 30665) ^ 1065592178;
                                            i30 = 1030701322;
                                        } else {
                                            iM559714 = (C0946.m55979("۠ܿ") + i28) * 51;
                                            i29 = ((iM559714 ^ i27) * 23821) ^ (-277754656);
                                            i30 = 574815489;
                                        }
                                        break;
                                    case -1044418232:
                                    case 1717863175:
                                        ViewOnClickListenerC2886.m4651(this.f62769, dialogInterfaceC2564);
                                        break;
                                    case -1030544338:
                                    case 290321413:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM559714 = C0946.m55979("᩹᩻") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 8677) ^ (-1976226357);
                                            i30 = -2064397877;
                                        } else {
                                            iM559714 = (i27 - C0946.m55979("۬᩷")) * (-53);
                                            i29 = ((iM559714 ^ i28) * 495) ^ 448958088;
                                            i30 = 681297894;
                                        }
                                        break;
                                    case -873936908:
                                    case -861585057:
                                        if (C0845.f81821 >= 0) {
                                            iM559714 = C0946.m55979("᩹᩻") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 8677) ^ (-1976226357);
                                            i30 = -2064397877;
                                        } else {
                                            iM559714 = C0873.m55680("ۗۚ") ^ i28;
                                            i29 = ((iM559714 ^ i27) * 22979) ^ 1485666572;
                                            i30 = 1206362469;
                                        }
                                        break;
                                    case -732905837:
                                    case 252549976:
                                        C0894.m55769();
                                        C0861.m55626();
                                        iM559714 = C0946.m55979("᩹ܽ") ^ i28;
                                        i29 = ((iM559714 ^ i27) * 10035) ^ 217664016;
                                        i30 = -1690125789;
                                        break;
                                    case -451261628:
                                    case 2089177395:
                                        C1017.m56187();
                                        if (!C0861.f81831) {
                                            iM559714 = C0946.m55979("᩹ܽ") ^ i28;
                                            i29 = ((iM559714 ^ i27) * 10035) ^ 217664016;
                                            i30 = -1690125789;
                                        } else {
                                            iM559714 = (i27 - C0946.m55979("ᩴ֨")) * (-5);
                                            i29 = ((iM559714 ^ i28) * (-15137)) ^ 1212825003;
                                            i30 = -1037393232;
                                        }
                                        break;
                                    case 23470033:
                                    case 1906237032:
                                        if (C0947.m55997()) {
                                            iM559714 = C0946.m55979("᩹ܽ") ^ i28;
                                            i29 = ((iM559714 ^ i27) * 10035) ^ 217664016;
                                            i30 = -1690125789;
                                        } else {
                                            iM559714 = (C0946.m55979("ܿ᩺") ^ i28) * 5;
                                            i29 = ((iM559714 ^ i27) * 22723) ^ (-1392121765);
                                            i30 = 288438006;
                                        }
                                        break;
                                    case 147628683:
                                    case 1552241095:
                                        C0890.m55740();
                                        if (C1028.f81950 > 0) {
                                            iM559714 = (C0873.m55680("۫᩺") + i28) * (-41);
                                            i29 = ((iM559714 ^ i27) * 15931) ^ 1418190036;
                                            i30 = -286932602;
                                        } else {
                                            iM559714 = C0946.m55979("᩹᩻") ^ i27;
                                            i29 = ((iM559714 ^ i28) * 8677) ^ (-1976226357);
                                            i30 = -2064397877;
                                        }
                                        break;
                                    case 232737672:
                                    case 1350062489:
                                        if (C0877.f81843 >= 0) {
                                            iM559714 = (C0873.m55680("۫᩺") + i28) * (-41);
                                            i29 = ((iM559714 ^ i27) * 15931) ^ 1418190036;
                                            i30 = -286932602;
                                        } else {
                                            iM559714 = C0946.m55979("۬۬") ^ i27;
                                            i29 = ((iM559714 ^ i28) * (-1671)) ^ 1583362453;
                                            i30 = -1442654247;
                                        }
                                        break;
                                    default:
                                        if (C0882.m55710() != 0) {
                                            iM559714 = C0946.m55979("᩹ܽ") ^ i28;
                                            i29 = ((iM559714 ^ i27) * 10035) ^ 217664016;
                                            i30 = -1690125789;
                                        } else {
                                            iM559714 = (C0946.m55979("᩺ۧ") ^ i28) * (-57);
                                            i29 = ((iM559714 ^ i27) * (-1469)) ^ 1690897918;
                                            i30 = -2072829629;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C1124.m56374(c20671, iM55683, str);
                    C1025.m56221(c20671);
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    iM55681 = (C0946.m55979("᩻֫") + i15) * 39;
                    i7 = ((iM55681 ^ i14) * (-31579)) ^ (-1617045356);
                    i10 = 1589773916;
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1263377108:
                case -676383910:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    iM55683 = C0873.m55680(C0882.m55717(f81838, 30, 3, i19)) ^ 2101785860;
                    if (C0882.f81846) {
                        iM55681 = C0946.m55979("᩶ܿ") ^ i15;
                        i7 = ((iM55681 ^ i14) * (-12337)) ^ 2033667054;
                        i10 = -360044930;
                    } else {
                        iM55681 = (C0873.m55680("֡ۛ") ^ i15) * 123;
                        i7 = ((iM55681 ^ i14) * (-22945)) ^ (-598706511);
                        i10 = -722955895;
                    }
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -1071387887:
                case 428522549:
                    ActivityC14326.m32899(c7581.f19861, C0866.m55658(viewOnClickListenerC2887.f4987), viewOnClickListenerC2887.f4991.getDrawable(), i12, str);
                    break;
                case -869189950:
                case 1666422362:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    iM55684 = C0873.m55680(C1024.m56203(f81838, 33, 3, i19)) ^ 2128495555;
                    if (C0937.m55918() >= 0) {
                        iM55681 = C0946.m55979("᩶ܿ") ^ i15;
                        i7 = ((iM55681 ^ i14) * (-12337)) ^ 2033667054;
                        i10 = -360044930;
                    } else {
                        iM55681 = (C0873.m55680("ۧۤ") ^ i14) * 101;
                        i7 = ((iM55681 ^ i15) * (-2501)) ^ 2073227187;
                        i10 = -610705954;
                    }
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case -794290946:
                case 1553281677:
                    i19 = 28513;
                    iM55979 = (i15 - C0946.m55979("֫᩻")) * 57;
                    i16 = ((iM55979 ^ i14) * 15289) ^ (-1753099467);
                    i3 = 540518840;
                    i4 = iM55979 ^ i3;
                    c2 = c2;
                    abstractActivityC55414 = abstractActivityC55414;
                    sArr3 = sArr3;
                    iM55998 = iM55998;
                    i21 = i21;
                    abstractActivityC55413 = abstractActivityC55413;
                    objArr6 = objArr6;
                    objArr7 = objArr7;
                    i17 = i4;
                    viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    break;
                case -655088805:
                case 8715081:
                    objArr6 = objArr6;
                    c2 = c2;
                    objArr7 = objArr7;
                    abstractActivityC55413 = abstractActivityC55413;
                    i21 = i21;
                    sArr3 = sArr3;
                    abstractActivityC55414 = abstractActivityC55414;
                    C7581 c7582 = viewOnClickListenerC2887.f4988;
                    iM55998 = C0947.m55998(menuItem);
                    strM55921 = C0937.m55921(f81838, 21, 3, i19);
                    int iM559714 = (C0946.m55979("۠᩶") + i14) * (-15);
                    int i25 = ((iM559714 ^ i15) * 12857) ^ 2120966855;
                    i4 = iM559714 ^ (-1170524931);
                    c7581 = c7582;
                    i16 = i25;
                    c2 = c2;
                    abstractActivityC55414 = abstractActivityC55414;
                    sArr3 = sArr3;
                    iM55998 = iM55998;
                    i21 = i21;
                    abstractActivityC55413 = abstractActivityC55413;
                    objArr6 = objArr6;
                    objArr7 = objArr7;
                    i17 = i4;
                    viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    break;
                case -225564400:
                case 677362747:
                    objArr6 = objArr6;
                    iM55998 = iM55998;
                    objArr7 = objArr7;
                    c2 = c2;
                    abstractActivityC55413 = abstractActivityC55413;
                    i21 = i21;
                    sArr3 = sArr3;
                    abstractActivityC55414 = abstractActivityC55414;
                    int i26 = s + s2;
                    if ((i26 * i26) - ((s * 2) + 1) < 0) {
                        iM55979 = C0873.m55680("᩶ۚ") ^ i14;
                        i16 = ((iM55979 ^ i15) * (-15421)) ^ 473357018;
                        i3 = 1549785474;
                    } else {
                        iM55979 = (C0873.m55680("ۙۚ") + i15) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i16 = ((iM55979 ^ i14) * 16555) ^ (-753987509);
                        i3 = -1133420182;
                    }
                    i4 = iM55979 ^ i3;
                    c2 = c2;
                    abstractActivityC55414 = abstractActivityC55414;
                    sArr3 = sArr3;
                    iM55998 = iM55998;
                    i21 = i21;
                    abstractActivityC55413 = abstractActivityC55413;
                    objArr6 = objArr6;
                    objArr7 = objArr7;
                    i17 = i4;
                    viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    break;
                case -200037855:
                case 1797469776:
                    break;
                case 251488167:
                case 1440846878:
                    objArr6 = new Object[i12];
                    objArr6[c2] = c18249.m41538();
                    sArr4 = f81838;
                    if (C0861.f81831) {
                        int iM559715 = (i14 - C0946.m55979("ۙۛ")) * (-99);
                        i17 = iM559715 ^ 1988746734;
                        i16 = ((iM559715 ^ i15) * 18483) ^ 773304791;
                        i18 = 45;
                    } else {
                        objArr4 = objArr6;
                        i18 = 45;
                        abstractActivityC55411 = abstractActivityC55414;
                        objArr5 = objArr7;
                        abstractActivityC55412 = abstractActivityC55413;
                        iM55682 = C0873.m55680("᩸ᩴ") ^ i15;
                        sArr2 = sArr3;
                        i16 = ((iM55682 ^ i14) * 16659) ^ (-14779445);
                        i11 = -2051688170;
                        short[] sArr8 = sArr2;
                        strM56159 = strM56159;
                        objArr6 = objArr4;
                        i17 = iM55682 ^ i11;
                        abstractActivityC55413 = abstractActivityC55412;
                        objArr7 = objArr5;
                        abstractActivityC55414 = abstractActivityC55411;
                        sArr3 = sArr8;
                    }
                    break;
                case 384140679:
                case 1895938572:
                    objArr6 = objArr6;
                    i21 = i21;
                    sArr3 = sArr3;
                    AbstractActivityC5549 abstractActivityC55417 = abstractActivityC55414;
                    Object[] objArr10 = objArr7;
                    AbstractActivityC5549 abstractActivityC55418 = c7581.f19861;
                    int i27 = DialogInterfaceC2564.f4230;
                    C20671 c20673 = new C20671(abstractActivityC55418);
                    C1012.m56146(c20673, iM55685);
                    AbstractActivityC5549 abstractActivityC55419 = c7581.f19861;
                    C18249 c182412 = viewOnClickListenerC2887.f4987;
                    if (C0866.f81837 >= 0) {
                        c20672 = c20673;
                        objArr7 = objArr10;
                        iM55998 = iM55998;
                        abstractActivityC55413 = abstractActivityC55419;
                        abstractActivityC55414 = abstractActivityC55417;
                        c182410 = c182412;
                        c2 = c2;
                        int iM55689 = C0873.m55680("ۢ᩵") ^ i14;
                        i16 = ((iM55689 ^ i15) * (-22621)) ^ 677615532;
                        i4 = iM55689 ^ (-953279519);
                        c2 = c2;
                        sArr3 = sArr3;
                        iM55998 = iM55998;
                        i21 = i21;
                        abstractActivityC55413 = abstractActivityC55413;
                        objArr6 = objArr6;
                        objArr7 = objArr7;
                        i17 = i4;
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    } else {
                        int iM559716 = (i14 - C0946.m55979("ᩴۛ")) * 5;
                        i16 = ((iM559716 ^ i15) * 11275) ^ 250489790;
                        c20672 = c20673;
                        objArr6 = objArr6;
                        i17 = iM559716 ^ (-1274136724);
                        objArr7 = objArr10;
                        abstractActivityC55414 = abstractActivityC55417;
                        sArr3 = sArr3;
                        i21 = i21;
                        abstractActivityC55413 = abstractActivityC55419;
                        c182410 = c182412;
                    }
                    break;
                case 572938224:
                case 1166126044:
                    C0927.m55873();
                    if (C0930.f81879 <= 0) {
                        objArr6 = objArr6;
                        iM55998 = iM55998;
                        objArr7 = objArr7;
                        c2 = c2;
                        abstractActivityC55413 = abstractActivityC55413;
                        i21 = i21;
                        sArr3 = sArr3;
                        int iM556810 = C0873.m55680("ۢ᩵") ^ i14;
                        i16 = ((iM556810 ^ i15) * (-22621)) ^ 677615532;
                        i4 = iM556810 ^ (-953279519);
                        c2 = c2;
                        sArr3 = sArr3;
                        iM55998 = iM55998;
                        i21 = i21;
                        abstractActivityC55413 = abstractActivityC55413;
                        objArr6 = objArr6;
                        objArr7 = objArr7;
                        i17 = i4;
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    } else {
                        objArr4 = objArr6;
                        abstractActivityC55411 = abstractActivityC55414;
                        objArr5 = objArr7;
                        abstractActivityC55412 = abstractActivityC55413;
                        iM55682 = C0873.m55680("᩸ᩴ") ^ i15;
                        sArr2 = sArr3;
                        i16 = ((iM55682 ^ i14) * 16659) ^ (-14779445);
                        i11 = -2051688170;
                        short[] sArr9 = sArr2;
                        strM56159 = strM56159;
                        objArr6 = objArr4;
                        i17 = iM55682 ^ i11;
                        abstractActivityC55413 = abstractActivityC55412;
                        objArr7 = objArr5;
                        abstractActivityC55414 = abstractActivityC55411;
                        sArr3 = sArr9;
                    }
                    break;
                case 717111745:
                case 1761506171:
                    C1025.m56230();
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("᩵֡") ^ i14;
                        i = ((iM55680 ^ i15) * (-2933)) ^ 176372303;
                        i2 = 54543293;
                        objArr = objArr6;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                        objArr6 = objArr;
                    } else {
                        objArr2 = objArr6;
                        i5 = iM55998;
                        objArr3 = objArr7;
                        abstractActivityC5549 = abstractActivityC55413;
                        i6 = i21;
                        sArr = sArr3;
                        abstractActivityC55410 = abstractActivityC55414;
                        iM55681 = (C0946.m55979("ܿܳ") ^ i15) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM55681 ^ i14) * 24823) ^ (-373766492);
                        i10 = -1537378995;
                        i9 = iM55681 ^ i10;
                        i12 = i12;
                        iM55998 = i5;
                        objArr6 = objArr2;
                        i17 = i9;
                        i16 = i7;
                        abstractActivityC55414 = abstractActivityC55410;
                        sArr3 = sArr;
                        i21 = i6;
                        abstractActivityC55413 = abstractActivityC5549;
                        objArr7 = objArr3;
                    }
                    break;
                case 892952046:
                case 1070075116:
                    objArr2 = objArr6;
                    i5 = iM55998;
                    objArr3 = objArr7;
                    abstractActivityC5549 = abstractActivityC55413;
                    i6 = i21;
                    sArr = sArr3;
                    abstractActivityC55410 = abstractActivityC55414;
                    i20 = iM559711 ^ 2123492145;
                    c2 = 0;
                    if (C1028.f81950 <= 0) {
                        iM55681 = (C0946.m55979("ܿܳ") ^ i15) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM55681 ^ i14) * 24823) ^ (-373766492);
                        i10 = -1537378995;
                    } else {
                        iM55681 = C0873.m55680("۟᩸") ^ i14;
                        i7 = ((iM55681 ^ i15) * (-26413)) ^ 420270812;
                        i10 = 59112223;
                    }
                    i9 = iM55681 ^ i10;
                    i12 = i12;
                    iM55998 = i5;
                    objArr6 = objArr2;
                    i17 = i9;
                    i16 = i7;
                    abstractActivityC55414 = abstractActivityC55410;
                    sArr3 = sArr;
                    i21 = i6;
                    abstractActivityC55413 = abstractActivityC5549;
                    objArr7 = objArr3;
                    break;
                case 1303381711:
                case 2076861657:
                    new C16772(c7581.f19861, viewOnClickListenerC2887.f4987);
                    break;
                case 1449279626:
                case 1771405917:
                    objArr6 = objArr6;
                    iM55998 = iM55998;
                    objArr7 = objArr7;
                    c2 = c2;
                    abstractActivityC55413 = abstractActivityC55413;
                    i21 = i21;
                    sArr3 = sArr3;
                    abstractActivityC55414 = abstractActivityC55414;
                    s = f81838[20];
                    s2 = 1;
                    if (!C1048.f81963) {
                        abstractActivityC55414 = abstractActivityC55414;
                        int iM556811 = C0873.m55680("ۢ᩵") ^ i14;
                        i16 = ((iM556811 ^ i15) * (-22621)) ^ 677615532;
                        i4 = iM556811 ^ (-953279519);
                        c2 = c2;
                        sArr3 = sArr3;
                        iM55998 = iM55998;
                        i21 = i21;
                        abstractActivityC55413 = abstractActivityC55413;
                        objArr6 = objArr6;
                        objArr7 = objArr7;
                        i17 = i4;
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    } else {
                        iM55979 = C0946.m55979("ۚ۬") ^ i14;
                        i16 = ((iM55979 ^ i15) * 5855) ^ (-275696336);
                        i3 = -59424683;
                        i4 = iM55979 ^ i3;
                        c2 = c2;
                        abstractActivityC55414 = abstractActivityC55414;
                        sArr3 = sArr3;
                        iM55998 = iM55998;
                        i21 = i21;
                        abstractActivityC55413 = abstractActivityC55413;
                        objArr6 = objArr6;
                        objArr7 = objArr7;
                        i17 = i4;
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    }
                    break;
                case 1857771542:
                case 1880400076:
                    C20671 c20674 = c20672;
                    C1017.m56182(c20674, strM56159);
                    ViewOnClickListenerC0939.m55953(c20674, iM55684, new DialogInterface.OnClickListener() { // from class: l.ۘܽ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            int i29 = 187348916;
                            int i30 = C1003.f81929;
                            int i31 = RunnableC0938.f81886;
                            int iM559717 = (C0946.m55979("ۧۢ") + i30) * 109;
                            int i32 = ((iM559717 ^ i31) * (-23407)) ^ 1546455970;
                            int i33 = 2018677650;
                            while (true) {
                                i29 = ((((i29 ^ i31) * 29783) >> 31) & i32) ^ (iM559717 ^ i33);
                                switch (i29) {
                                    case -2115471347:
                                    case -784415860:
                                        C0873.m55678();
                                        if (C1012.f81938 < 0) {
                                            iM559717 = C0946.m55979("᩺ۜ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 2563) ^ 468228626;
                                            i33 = -1977398661;
                                        } else {
                                            iM559717 = (i30 - C0946.m55979("ۤۜ")) * (-115);
                                            i32 = ((iM559717 ^ i31) * 15057) ^ 1379692214;
                                            i33 = 1561240548;
                                        }
                                        break;
                                    case -2020152792:
                                    case -466381891:
                                        C1046.m56302();
                                        break;
                                    case -1585607742:
                                    case 1082033614:
                                        if (C1053.f81965 <= 0) {
                                            iM559717 = C0873.m55680("֨֨") ^ i30;
                                            i32 = ((iM559717 ^ i31) * 1301) ^ (-516479886);
                                            i33 = -760190611;
                                        } else {
                                            iM559717 = C0946.m55979("۟ۖ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * (-8279)) ^ 877682521;
                                            i33 = -990309256;
                                        }
                                        break;
                                    case -1352677091:
                                    case -255228923:
                                        C0882.m55710();
                                        if (C1964.m56597() != 0) {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        } else {
                                            iM559717 = C0946.m55979("᩺ۜ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 2563) ^ 468228626;
                                            i33 = -1977398661;
                                        }
                                        break;
                                    case -912521062:
                                    case 1731806604:
                                        if (C0845.m55584() <= 0) {
                                            iM559717 = C0873.m55680("֨֨") ^ i30;
                                            i32 = ((iM559717 ^ i31) * 1301) ^ (-516479886);
                                            i33 = -760190611;
                                        } else {
                                            iM559717 = C0946.m55979("ۖ۬") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 1961) ^ 935404624;
                                            i33 = 2006871140;
                                        }
                                        break;
                                    case -876763519:
                                    case 1427771525:
                                        if (C1404.m56468()) {
                                            iM559717 = C0873.m55680("᩶ܿ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * (-23209)) ^ (-175698692);
                                            i33 = -327418622;
                                        } else {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        }
                                        break;
                                    case -698728939:
                                    case 491975242:
                                        if (C0890.m55740()) {
                                            iM559717 = (i30 - C0873.m55680("᩺᩷")) * 49;
                                            i32 = ((iM559717 ^ i31) * (-31645)) ^ 98672879;
                                            i33 = -856959232;
                                        } else {
                                            iM559717 = C0873.m55680("֨֨") ^ i30;
                                            i32 = ((iM559717 ^ i31) * 1301) ^ (-516479886);
                                            i33 = -760190611;
                                        }
                                        break;
                                    case -636728582:
                                    case -552266142:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        } else {
                                            iM559717 = (i30 - C0946.m55979("֫ۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i32 = ((iM559717 ^ i31) * (-30509)) ^ 837033564;
                                            i33 = -1787335704;
                                        }
                                        break;
                                    case -554766124:
                                    case 242342744:
                                        C1028.m56247();
                                        if (!C1024.f81946) {
                                            iM559717 = C0946.m55979("᩺ۜ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 2563) ^ 468228626;
                                            i33 = -1977398661;
                                        } else {
                                            iM559717 = (C0873.m55680("۠ܺ") + i30) * 7;
                                            i32 = ((iM559717 ^ i31) * 4879) ^ 1881332297;
                                            i33 = 1992399718;
                                        }
                                        break;
                                    case -427988584:
                                    case 415932284:
                                        C14976.m34306(C0866.m55658(this.f15750.f4987));
                                        break;
                                    case -348198240:
                                    case 2107316641:
                                        if (C0992.m56107() <= 0) {
                                            iM559717 = C0946.m55979("᩺ۜ") ^ i31;
                                            i32 = ((iM559717 ^ i30) * 2563) ^ 468228626;
                                            i33 = -1977398661;
                                        } else {
                                            iM559717 = (C0873.m55680("᩹᩻") + i30) * (-17);
                                            i32 = ((iM559717 ^ i31) * (-31573)) ^ 32861186;
                                            i33 = -1021627719;
                                        }
                                        break;
                                    case -320039771:
                                    case 940565506:
                                        if (C1053.f81965 <= 0) {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        } else {
                                            iM559717 = (C0946.m55979("᩶ۤ") + i31) * (-47);
                                            i32 = ((iM559717 ^ i30) * (-16483)) ^ 161371240;
                                            i33 = -325164254;
                                        }
                                        break;
                                    case 465809139:
                                    case 470204993:
                                        C0877.m55696();
                                        iM559717 = (C0873.m55680("۠ܺ") + i30) * 7;
                                        i32 = ((iM559717 ^ i31) * 4879) ^ 1881332297;
                                        i33 = 1992399718;
                                        break;
                                    case 631917054:
                                    case 886096144:
                                        if (C0890.f81849 != 0) {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        } else {
                                            iM559717 = C0946.m55979("ۤ֫") ^ i30;
                                            i32 = ((iM559717 ^ i31) * (-29119)) ^ 1010052425;
                                            i33 = -2096887571;
                                        }
                                        break;
                                    case 1125718329:
                                    case 1990454639:
                                        if (C0912.f81867 <= 0) {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        } else {
                                            iM559717 = (i30 - C0946.m55979("֫ۙ")) * (-41);
                                            i32 = ((iM559717 ^ i31) * (-3959)) ^ (-619875397);
                                            i33 = 1117909012;
                                        }
                                        break;
                                    default:
                                        if (C1003.f81929 <= 0) {
                                            iM559717 = (C0946.m55979("᩸ۗ") ^ i31) * (-63);
                                            i32 = ((iM559717 ^ i30) * (-13279)) ^ 797252988;
                                            i33 = -929495879;
                                        } else {
                                            iM559717 = (i31 - C0946.m55979("ۨ֨")) * 15;
                                            i32 = ((iM559717 ^ i30) * 15271) ^ (-1450558276);
                                            i33 = -1197608410;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C0967.m56076(c20674, iM55683, str);
                    RunnableC0871.m55669(c20674);
                    break;
                default:
                    if (C1044.f81959 < 0) {
                        objArr4 = objArr6;
                        abstractActivityC55411 = abstractActivityC55414;
                        objArr5 = objArr7;
                        abstractActivityC55412 = abstractActivityC55413;
                        iM55682 = C0873.m55680("᩸ᩴ") ^ i15;
                        sArr2 = sArr3;
                        i16 = ((iM55682 ^ i14) * 16659) ^ (-14779445);
                        i11 = -2051688170;
                        short[] sArr10 = sArr2;
                        strM56159 = strM56159;
                        objArr6 = objArr4;
                        i17 = iM55682 ^ i11;
                        abstractActivityC55413 = abstractActivityC55412;
                        objArr7 = objArr5;
                        abstractActivityC55414 = abstractActivityC55411;
                        sArr3 = sArr10;
                    } else {
                        iM55680 = C0946.m55979("᩵֡") ^ i14;
                        i = ((iM55680 ^ i15) * (-2933)) ^ 176372303;
                        i2 = 54543293;
                        objArr = objArr6;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                        objArr6 = objArr;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        short s;
        View view2;
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int iM55682;
        int i5;
        int i6;
        short[] sArr;
        int i7;
        C16317 c16317;
        short[] sArr2;
        int i8;
        short[] sArr3;
        AbstractC17043 abstractC17043M41546;
        C16317 c16318;
        int iM55683;
        int i9;
        final ViewOnClickListenerC2886 viewOnClickListenerC2886 = this;
        int i10 = 0;
        int i11 = 290539291;
        int i12 = C1046.f81962;
        int i13 = C0863.f81833;
        int iM55684 = C0873.m55680("ۖᩴ") ^ i12;
        int i14 = ((iM55684 ^ i13) * 711) ^ (-1101447693);
        int i15 = iM55684 ^ (-311015042);
        C7581 c7581 = null;
        C18249 c18249 = null;
        AbstractC17043 abstractC17043 = null;
        DialogInterface.OnClickListener onClickListener = null;
        Button buttonM3859 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i16 = 0;
        int i17 = 0;
        boolean z = false;
        int i18 = 0;
        int i19 = 0;
        int iM55979 = 0;
        int i20 = 0;
        char c = 0;
        C16317 c16319 = null;
        int i21 = 0;
        short s2 = 0;
        View view3 = null;
        final DialogInterfaceC2564 dialogInterfaceC2564M18268 = null;
        int i22 = 0;
        C20671 c20671 = null;
        boolean z2 = false;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 3713) >> 31));
            switch (i11) {
                case -2143573009:
                case 1520901674:
                    i16 = i16;
                    sArr5 = sArr5;
                    sArr = sArr6;
                    C7581 c7582 = viewOnClickListenerC2886.f4988;
                    c16319 = new C16317(c7582.f19861);
                    if (C0866.f81837 < 0) {
                        int iM55685 = C0873.m55680("ۨ֡") ^ i12;
                        i7 = ((iM55685 ^ i13) * 22967) ^ 1546921338;
                        i15 = iM55685 ^ 476796155;
                        viewOnClickListenerC2886 = this;
                        c7581 = c7582;
                        i16 = i16;
                        c16319 = c16319;
                        i14 = i7;
                        sArr6 = sArr;
                        sArr5 = sArr5;
                    } else {
                        c7581 = c7582;
                        i16 = i16;
                        sArr6 = sArr;
                        c16319 = c16319;
                        int iM55686 = C0873.m55680("ۤ֨") ^ i12;
                        i15 = iM55686 ^ (-926441637);
                        i14 = ((iM55686 ^ i13) * 18343) ^ 1743965535;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    }
                    break;
                case -2035205662:
                case 629145228:
                    iM55979 = C0946.m55979(C0946.m55986(sArr6, 70, 3, i17));
                    i20 = 2120194920;
                    if (C0989.f81920 < 0) {
                        iM55680 = (C0946.m55979("᩺᩺") + i13) * (-85);
                        i = ((iM55680 ^ i12) * (-8091)) ^ 884924227;
                        i2 = -81028752;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        sArr5 = sArr5;
                        int iM55687 = C0873.m55680("ۤ֨") ^ i12;
                        i15 = iM55687 ^ (-926441637);
                        i14 = ((iM55687 ^ i13) * 18343) ^ 1743965535;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    }
                    break;
                case -1878678910:
                case -1092829647:
                    z = true;
                    int iM559710 = C0946.m55979("ۡۛ") ^ i13;
                    sArr = sArr6;
                    i7 = ((iM559710 ^ i12) * (-16153)) ^ 2097190848;
                    i15 = iM559710 ^ (-1303517435);
                    i16 = i16;
                    c16319 = c16319;
                    i14 = i7;
                    sArr6 = sArr;
                    sArr5 = sArr5;
                    break;
                case -1717825067:
                case 1390158162:
                    c16319 = c16319;
                    sArr5 = sArr5;
                    int i23 = i16;
                    sArr = sArr6;
                    onClickListener = null;
                    C18249 c182410 = c18249;
                    c16319.m37121(c182410, abstractC17043.mo25101(), null);
                    if (viewOnClickListenerC2886.f4987.m41561() != null) {
                        iM55683 = (C0873.m55680("ܶ᩹") ^ i12) * 55;
                        i7 = ((iM55683 ^ i13) * 23151) ^ 1476137152;
                        i9 = 893804990;
                    } else {
                        iM55683 = (C0873.m55680("᩶۠") ^ i12) * (-25);
                        i7 = ((iM55683 ^ i13) * (-4189)) ^ 1869871590;
                        i9 = 1914726159;
                    }
                    i15 = iM55683 ^ i9;
                    c18249 = c182410;
                    i16 = i23;
                    z2 = false;
                    c16319 = c16319;
                    i14 = i7;
                    sArr6 = sArr;
                    sArr5 = sArr5;
                    break;
                case -1643192648:
                case -1627349879:
                    if (C0912.f81867 > 0) {
                        c16319 = c16319;
                        sArr5 = sArr5;
                        s = s2;
                        i16 = i16;
                        sArr6 = sArr6;
                        iM55681 = (C0873.m55680("ܿᩳ") ^ i13) * (-11);
                        i3 = ((iM55681 ^ i12) * (-23657)) ^ 784558331;
                        i4 = 578504964;
                        i6 = iM55681 ^ i4;
                        s2 = s;
                        i14 = i3;
                        i16 = i16;
                        sArr6 = sArr6;
                        c16319 = c16319;
                        i15 = i6;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    } else {
                        view2 = view3;
                        int iM55688 = C0873.m55680("᩸ۜ") ^ i13;
                        view3 = view2;
                        i14 = ((iM55688 ^ i12) * 32217) ^ 86159462;
                        i15 = iM55688 ^ 1722757952;
                    }
                    break;
                case -1431930850:
                case 685949818:
                    sArr5 = sArr5;
                    AbstractActivityC5549 abstractActivityC5549 = c7581.f19861;
                    int i24 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(abstractActivityC5549);
                    c16319 = c16319;
                    int i25 = i16;
                    View view4 = c16319.f47952;
                    if (C1194.f82045 != 0) {
                        view3 = view4;
                        i16 = i25;
                        c16319 = c16319;
                        int iM55689 = C0873.m55680("ۤ֨") ^ i12;
                        i15 = iM55689 ^ (-926441637);
                        i14 = ((iM55689 ^ i13) * 18343) ^ 1743965535;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    } else {
                        int iM556810 = C0873.m55680("۟֨") ^ i13;
                        int i26 = ((iM556810 ^ i12) * 7977) ^ 1216888914;
                        i15 = iM556810 ^ (-1591186219);
                        view3 = view4;
                        sArr5 = sArr5;
                        c16319 = c16319;
                        i14 = i26;
                        i16 = i25;
                    }
                    break;
                case -1180796786:
                case 1514581810:
                    dialogInterfaceC2564M18268 = C7913.m18268(c20671, i22, onClickListener, C0946.m55979(C0955.m56029(sArr7, i16, 3, i17)) ^ 2130413408, onClickListener);
                    buttonM3859 = dialogInterfaceC2564M18268.m3859();
                    if (z) {
                        iM55680 = (C0946.m55979("ۜۜ") ^ i13) * (-11);
                        i = ((iM55680 ^ i12) * (-8235)) ^ 138459205;
                        i2 = -1334661079;
                    } else {
                        iM55680 = C0946.m55979("᩷ܺ") ^ i12;
                        i = ((iM55680 ^ i13) * 4083) ^ 364921535;
                        i2 = 834595020;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -1178339971:
                case 1352334152:
                    view2 = view3;
                    C0882.m55725(c20671, view2);
                    sArr5 = f81838;
                    i21 = 67;
                    if (RunnableC1014.f81941 > 0) {
                        view3 = view2;
                        iM55680 = C0873.m55680("ܶܳ") ^ i12;
                        i = ((iM55680 ^ i13) * (-27737)) ^ (-626830729);
                        i2 = -304615188;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        int iM556811 = C0873.m55680("᩸ۜ") ^ i13;
                        view3 = view2;
                        i14 = ((iM556811 ^ i12) * 32217) ^ 86159462;
                        i15 = iM556811 ^ 1722757952;
                    }
                    break;
                case -1169055078:
                case -171041541:
                    C1964.m56595(buttonM3859, z2);
                    iM55680 = C0946.m55979("ᩳܳ") ^ i13;
                    i = ((iM55680 ^ i12) * (-5631)) ^ 1757605627;
                    i2 = 1529459588;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -1155625738:
                case 46495004:
                    int i27 = i21;
                    sArr5 = sArr5;
                    int iM556812 = C0873.m55680(AbstractC0942.m55970(sArr5, i27, 3, i17));
                    if (RunnableC0871.m55672() >= 0) {
                        sArr6 = sArr6;
                        i21 = i27;
                        c16319 = c16319;
                        i19 = 2125667247;
                        i18 = iM556812;
                        i16 = i16;
                        iM55682 = (C0873.m55680("۬᩸") ^ i13) * (-13);
                        i14 = ((iM55682 ^ i12) * 27829) ^ 321479278;
                        i5 = 1157066707;
                        i6 = iM55682 ^ i5;
                        i16 = i16;
                        sArr6 = sArr6;
                        c16319 = c16319;
                        i15 = i6;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    } else {
                        int iM559711 = (C0946.m55979("ܿ֡") + i13) * (-57);
                        int i28 = ((iM559711 ^ i12) * 30617) ^ (-73625891);
                        i15 = iM559711 ^ 785987335;
                        sArr5 = sArr5;
                        i21 = i27;
                        i18 = iM556812;
                        i14 = i28;
                        i19 = 2125667247;
                    }
                    break;
                case -1147503690:
                case 1252136421:
                    c16317 = c16319;
                    sArr2 = sArr5;
                    i8 = i16;
                    sArr3 = sArr6;
                    C18249 c182411 = viewOnClickListenerC2886.f4987;
                    abstractC17043M41546 = c182411.m41546();
                    if (C1053.m56327() >= 0) {
                        c18249 = c182411;
                        int iM559712 = C0946.m55979("ۚ֨") ^ i12;
                        C16317 c163110 = c16317;
                        i14 = ((iM559712 ^ i13) * 24267) ^ (-1258051849);
                        abstractC17043 = abstractC17043M41546;
                        sArr6 = sArr3;
                        sArr5 = sArr2;
                        c16318 = c163110;
                        i15 = iM559712 ^ 1015895040;
                    } else {
                        int iM556813 = (C0873.m55680("᩸ᩴ") + i13) * 61;
                        c18249 = c182411;
                        abstractC17043 = abstractC17043M41546;
                        sArr6 = sArr3;
                        sArr5 = sArr2;
                        c16318 = c16317;
                        i15 = iM556813 ^ 1766119580;
                        i14 = ((iM556813 ^ i12) * (-29529)) ^ (-1341794107);
                    }
                    i16 = i8;
                    c16319 = c16318;
                    break;
                case -1145094777:
                case 82801084:
                    c16319 = c16319;
                    sArr5 = sArr5;
                    s = s2;
                    i16 = i16;
                    sArr6 = sArr6;
                    sArr4 = f81838;
                    c = 'B';
                    if (C1025.f81947 >= 0) {
                        iM55681 = (C0873.m55680("ܿᩳ") ^ i13) * (-11);
                        i3 = ((iM55681 ^ i12) * (-23657)) ^ 784558331;
                        i4 = 578504964;
                    } else {
                        iM55681 = (C0946.m55979("ܿۘ") ^ i13) * (-39);
                        i3 = ((iM55681 ^ i12) * (-28431)) ^ 1570901396;
                        i4 = 1519445615;
                    }
                    i6 = iM55681 ^ i4;
                    s2 = s;
                    i14 = i3;
                    i16 = i16;
                    sArr6 = sArr6;
                    c16319 = c16319;
                    i15 = i6;
                    sArr5 = sArr5;
                    viewOnClickListenerC2886 = this;
                    break;
                case -1122759887:
                case 2118601509:
                    C0955.m56025();
                    C0863.m55643();
                    c16319 = c16319;
                    sArr5 = sArr5;
                    i16 = i16;
                    sArr6 = sArr6;
                    iM55682 = (C0873.m55680("۬᩸") ^ i13) * (-13);
                    i14 = ((iM55682 ^ i12) * 27829) ^ 321479278;
                    i5 = 1157066707;
                    i6 = iM55682 ^ i5;
                    i16 = i16;
                    sArr6 = sArr6;
                    c16319 = c16319;
                    i15 = i6;
                    sArr5 = sArr5;
                    viewOnClickListenerC2886 = this;
                    break;
                case -1101065180:
                case 1138944283:
                    i22 = iM55979 ^ i20;
                    sArr7 = f81838;
                    i16 = 73;
                    if (C1003.f81929 > 0) {
                        iM55680 = C0873.m55680("ۡ᩶") ^ i12;
                        i = ((iM55680 ^ i13) * 32077) ^ (-680960757);
                        i2 = -279507556;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        sArr5 = sArr5;
                        int iM556814 = C0873.m55680("ۤ֨") ^ i12;
                        i15 = iM556814 ^ (-926441637);
                        i14 = ((iM556814 ^ i13) * 18343) ^ 1743965535;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    }
                    break;
                case -1065415763:
                case 1572071186:
                    C0906.m55817(c20671, i18 ^ i19, onClickListener);
                    sArr6 = f81838;
                    if (C0992.m56107() > 0) {
                        iM55680 = C0873.m55680("᩹᩷") ^ i12;
                        i = ((iM55680 ^ i13) * 721) ^ (-1353204906);
                        i2 = 1941252917;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        sArr5 = sArr5;
                        int iM556815 = C0873.m55680("ۤ֨") ^ i12;
                        i15 = iM556815 ^ (-926441637);
                        i14 = ((iM556815 ^ i13) * 18343) ^ 1743965535;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    }
                    break;
                case -1046221045:
                case 2082617737:
                    c16319 = c16319;
                    sArr5 = sArr5;
                    i16 = i16;
                    sArr6 = sArr6;
                    s = s2;
                    if ((s * 6666) - (i10 + 11108889) <= 0) {
                        iM55681 = (i13 - C0946.m55979("ܳ֨")) * (-99);
                        i3 = ((iM55681 ^ i12) * (-12927)) ^ (-1531456761);
                        i4 = -2011359374;
                    } else {
                        iM55681 = C0873.m55680("֡᩷") ^ i12;
                        i3 = ((iM55681 ^ i13) * (-8179)) ^ (-1360763532);
                        i4 = -1844914803;
                    }
                    i6 = iM55681 ^ i4;
                    s2 = s;
                    i14 = i3;
                    i16 = i16;
                    sArr6 = sArr6;
                    c16319 = c16319;
                    i15 = i6;
                    sArr5 = sArr5;
                    viewOnClickListenerC2886 = this;
                    break;
                case -993949732:
                case -541785160:
                    i17 = 263;
                    iM55682 = C0946.m55979("ۛۤ") ^ i13;
                    i14 = ((iM55682 ^ i12) * 21315) ^ (-1554813720);
                    i5 = -1731185785;
                    i6 = iM55682 ^ i5;
                    i16 = i16;
                    sArr6 = sArr6;
                    c16319 = c16319;
                    i15 = i6;
                    sArr5 = sArr5;
                    viewOnClickListenerC2886 = this;
                    break;
                case -934873394:
                case -839537211:
                    C0947.m55996(buttonM3859, new View.OnClickListener() { // from class: l.ۡܽ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            ViewOnClickListenerC2886.m4655(this.f30306);
                        }
                    });
                    iM55680 = C0946.m55979("ᩳܳ") ^ i13;
                    i = ((iM55680 ^ i12) * (-5631)) ^ 1757605627;
                    i2 = 1529459588;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -911694860:
                case -811311587:
                    C0912.m55833();
                    if (!C0892.f81851) {
                        c16317 = c16319;
                        sArr2 = sArr5;
                        i8 = i16;
                        sArr3 = sArr6;
                        abstractC17043M41546 = abstractC17043;
                        int iM559713 = C0946.m55979("ۚ֨") ^ i12;
                        C16317 c163111 = c16317;
                        i14 = ((iM559713 ^ i13) * 24267) ^ (-1258051849);
                        abstractC17043 = abstractC17043M41546;
                        sArr6 = sArr3;
                        sArr5 = sArr2;
                        c16318 = c163111;
                        i15 = iM559713 ^ 1015895040;
                        i16 = i8;
                        c16319 = c16318;
                    } else {
                        c16319 = c16319;
                        sArr5 = sArr5;
                        i16 = i16;
                        sArr6 = sArr6;
                        iM55682 = (C0873.m55680("۬᩸") ^ i13) * (-13);
                        i14 = ((iM55682 ^ i12) * 27829) ^ 321479278;
                        i5 = 1157066707;
                        i6 = iM55682 ^ i5;
                        i16 = i16;
                        sArr6 = sArr6;
                        c16319 = c16319;
                        i15 = i6;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    }
                    break;
                case -717192306:
                case 659049042:
                    i17 = 28483;
                    iM55682 = C0946.m55979("ۛۤ") ^ i13;
                    i14 = ((iM55682 ^ i12) * 21315) ^ (-1554813720);
                    i5 = -1731185785;
                    i6 = iM55682 ^ i5;
                    i16 = i16;
                    sArr6 = sArr6;
                    c16319 = c16319;
                    i15 = i6;
                    sArr5 = sArr5;
                    viewOnClickListenerC2886 = this;
                    break;
                case -461614484:
                case 1854478295:
                    c16319 = c16319;
                    sArr5 = sArr5;
                    i16 = i16;
                    sArr6 = sArr6;
                    s2 = sArr4[c];
                    i10 = s2 * s2;
                    if (C0861.f81831) {
                        iM55682 = (C0873.m55680("ۨۗ") + i12) * (-111);
                        i14 = ((iM55682 ^ i13) * 22575) ^ (-1551164965);
                        i5 = -1617573123;
                    } else {
                        iM55682 = (C0873.m55680("۬᩸") ^ i13) * (-13);
                        i14 = ((iM55682 ^ i12) * 27829) ^ 321479278;
                        i5 = 1157066707;
                    }
                    i6 = iM55682 ^ i5;
                    i16 = i16;
                    sArr6 = sArr6;
                    c16319 = c16319;
                    i15 = i6;
                    sArr5 = sArr5;
                    viewOnClickListenerC2886 = this;
                    break;
                case -360489156:
                case -199860684:
                    z = false;
                    int iM559714 = C0946.m55979("ۡۛ") ^ i13;
                    sArr = sArr6;
                    i7 = ((iM559714 ^ i12) * (-16153)) ^ 2097190848;
                    i15 = iM559714 ^ (-1303517435);
                    i16 = i16;
                    c16319 = c16319;
                    i14 = i7;
                    sArr6 = sArr;
                    sArr5 = sArr5;
                    break;
                case -252208038:
                case -118449532:
                    C0894.m55769();
                    break;
                case 118087331:
                case 1569899100:
                    if (viewOnClickListenerC2886.f4987.m41537()) {
                        iM55680 = C0873.m55680("ܶܿ") ^ i12;
                        i = ((iM55680 ^ i13) * (-10607)) ^ (-1487999788);
                        i2 = -1634760032;
                    } else {
                        iM55680 = C0946.m55979("ۖ֫") ^ i12;
                        i = ((iM55680 ^ i13) * (-941)) ^ (-2103772440);
                        i2 = -325525080;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case 1136774053:
                case 1336507352:
                    C1048.m56304(C1071.m56337(dialogInterfaceC2564M18268), new View.OnClickListener(viewOnClickListenerC2886) { // from class: l.ܺܽ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ ViewOnClickListenerC2886 f52696;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            ViewOnClickListenerC2886 viewOnClickListenerC2887 = null;
                            int i29 = 1562718385;
                            int i30 = C1025.f81947;
                            int i31 = C1404.f82149;
                            int iM556816 = (C0873.m55680("᩵۠") ^ i30) * 33;
                            int i32 = ((iM556816 ^ i31) * 22067) ^ 2090023323;
                            int i33 = -640989152;
                            while (true) {
                                i29 = ((((i29 ^ i31) * (-13317)) >> 31) & i32) ^ (iM556816 ^ i33);
                                switch (i29) {
                                    case -1984267564:
                                    case -274571682:
                                        if (C1003.f81929 <= 0) {
                                            iM556816 = (C0873.m55680("ܿ۠") ^ i30) * 67;
                                            i32 = ((iM556816 ^ i31) * 23061) ^ 1993835315;
                                            i33 = -1872063409;
                                        } else {
                                            iM556816 = C0873.m55680("ۡᩳ") ^ i30;
                                            i32 = ((iM556816 ^ i31) * (-8721)) ^ 907429173;
                                            i33 = -904137735;
                                        }
                                        break;
                                    case -1728896467:
                                    case 1483517704:
                                        ViewOnClickListenerC2886.m4653(viewOnClickListenerC2887, dialogInterfaceC2564M18268, view5);
                                        break;
                                    case -1686495922:
                                    case -1035206865:
                                        C1036.m56257();
                                        C0894.m55769();
                                        iM556816 = (C0946.m55979("ᩳᩳ") + i30) * 73;
                                        i32 = ((iM556816 ^ i31) * 29517) ^ (-1018340966);
                                        i33 = -1449742472;
                                        break;
                                    case -1624072028:
                                    case -696757826:
                                        if (C0947.m55997()) {
                                            iM556816 = (C0873.m55680("ܿ۠") ^ i30) * 67;
                                            i32 = ((iM556816 ^ i31) * 23061) ^ 1993835315;
                                            i33 = -1872063409;
                                        } else {
                                            iM556816 = C0873.m55680("ܳۧ") ^ i30;
                                            i32 = ((iM556816 ^ i31) * (-9919)) ^ 40234814;
                                            i33 = 431073016;
                                        }
                                        break;
                                    case -1141204481:
                                    case -412806222:
                                        if (C0927.f81875) {
                                            iM556816 = C0946.m55979("ܽᩴ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-28879)) ^ (-1896721081);
                                            i33 = 375464644;
                                        } else {
                                            iM556816 = (C0946.m55979("ۖۛ") ^ i30) * (-93);
                                            i32 = ((iM556816 ^ i31) * (-7159)) ^ (-2023221673);
                                            i33 = 1006589593;
                                        }
                                        break;
                                    case -867966078:
                                    case 1670060713:
                                        viewOnClickListenerC2887 = this.f52696;
                                        if (C0894.f81854 >= 0) {
                                            iM556816 = (C0873.m55680("ۙۚ") + i31) * (-29);
                                            i32 = ((iM556816 ^ i30) * (-20917)) ^ 1467505758;
                                            i33 = 641465795;
                                        } else {
                                            iM556816 = C0946.m55979("ۤ᩺") ^ i31;
                                            i32 = ((iM556816 ^ i30) * 13609) ^ (-772778502);
                                            i33 = -1941538782;
                                        }
                                        break;
                                    case -835915166:
                                    case 305203853:
                                        C1028.m56247();
                                        C0989.m56095();
                                        break;
                                    case -775314690:
                                    case 1050467750:
                                        if (C1048.f81963) {
                                            iM556816 = (C0946.m55979("۬᩷") + i30) * (-109);
                                            i32 = ((iM556816 ^ i31) * (-7423)) ^ 837918335;
                                            i33 = 763899882;
                                        } else {
                                            iM556816 = (C0873.m55680("ܿ۠") ^ i30) * 67;
                                            i32 = ((iM556816 ^ i31) * 23061) ^ 1993835315;
                                            i33 = -1872063409;
                                        }
                                        break;
                                    case -657289248:
                                    case 1865783819:
                                        C0912.m55833();
                                        if (C0877.f81843 >= 0) {
                                            iM556816 = C0946.m55979("ۡۘ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-14419)) ^ (-550455499);
                                            i33 = -1225999566;
                                        } else {
                                            iM556816 = (C0946.m55979("ᩳᩳ") + i30) * 73;
                                            i32 = ((iM556816 ^ i31) * 29517) ^ (-1018340966);
                                            i33 = -1449742472;
                                        }
                                        break;
                                    case -540537677:
                                    case 1559175046:
                                        if (C0861.f81831) {
                                            iM556816 = C0946.m55979("ۢۜ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-1107)) ^ 201703829;
                                            i33 = 582551603;
                                        } else {
                                            iM556816 = (C0946.m55979("ᩳᩳ") + i30) * 73;
                                            i32 = ((iM556816 ^ i31) * 29517) ^ (-1018340966);
                                            i33 = -1449742472;
                                        }
                                        break;
                                    case -315195135:
                                    case 530334010:
                                        if (C1229.f82066 >= 0) {
                                            iM556816 = (C0873.m55680("ܿ۠") ^ i30) * 67;
                                            i32 = ((iM556816 ^ i31) * 23061) ^ 1993835315;
                                            i33 = -1872063409;
                                        } else {
                                            iM556816 = (i31 - C0946.m55979("ۜ֨")) * (-97);
                                            i32 = ((iM556816 ^ i30) * (-12385)) ^ (-114213719);
                                            i33 = 367240132;
                                        }
                                        break;
                                    case -158076107:
                                    case 1216088943:
                                        if (C0955.f81898) {
                                            iM556816 = C0946.m55979("ۡۘ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-14419)) ^ (-550455499);
                                            i33 = -1225999566;
                                        } else {
                                            iM556816 = C0946.m55979("۟ᩳ") ^ i30;
                                            i32 = ((iM556816 ^ i31) * (-21567)) ^ 605909163;
                                            i33 = -1418059625;
                                        }
                                        break;
                                    case 286553313:
                                    case 1313463762:
                                        if (C0906.f81862 >= 0) {
                                            iM556816 = (C0946.m55979("ᩳᩳ") + i30) * 73;
                                            i32 = ((iM556816 ^ i31) * 29517) ^ (-1018340966);
                                            i33 = -1449742472;
                                        } else {
                                            iM556816 = (C0946.m55979("ܽۘ") + i31) * (-37);
                                            i32 = ((iM556816 ^ i30) * 20529) ^ 1930964538;
                                            i33 = -889960343;
                                        }
                                        break;
                                    case 1057773282:
                                    case 1657159705:
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            iM556816 = C0946.m55979("ܽᩴ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-28879)) ^ (-1896721081);
                                            i33 = 375464644;
                                        } else {
                                            iM556816 = (C0946.m55979("ᩳᩳ") + i30) * 73;
                                            i32 = ((iM556816 ^ i31) * 29517) ^ (-1018340966);
                                            i33 = -1449742472;
                                        }
                                        break;
                                    case 1436549824:
                                    case 1610419726:
                                        if (C0882.f81846) {
                                            iM556816 = C0946.m55979("ۡۘ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-14419)) ^ (-550455499);
                                            i33 = -1225999566;
                                        } else {
                                            iM556816 = C0946.m55979("ܳۤ") ^ i31;
                                            i32 = ((iM556816 ^ i30) * (-2513)) ^ 1629759757;
                                            i33 = 1875925202;
                                        }
                                        break;
                                    default:
                                        if (C1929.f83011 != 0) {
                                            iM556816 = (C0873.m55680("ܿ۠") ^ i30) * 67;
                                            i32 = ((iM556816 ^ i31) * 23061) ^ 1993835315;
                                            i33 = -1872063409;
                                        } else {
                                            iM556816 = (C0946.m55979("ᩳᩳ") + i30) * 73;
                                            i32 = ((iM556816 ^ i31) * 29517) ^ (-1018340966);
                                            i33 = -1449742472;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i29 = -2146907737;
                            int i30 = AbstractC0942.f81890;
                            int i31 = C1017.f81942;
                            int iM559715 = C0946.m55979("᩹ۨ") ^ i31;
                            int i32 = ((iM559715 ^ i30) * 6347) ^ 1189303141;
                            int i33 = 1176472503;
                            while (true) {
                                i29 = ((((i29 ^ i30) * 19387) >> 31) & i32) ^ (iM559715 ^ i33);
                                switch (i29) {
                                    case -1931867803:
                                    case 1539103707:
                                        if (C1964.f83032 <= 0) {
                                            iM559715 = (C0946.m55979("ܺ᩺") + i31) * 73;
                                            i32 = ((iM559715 ^ i30) * 23657) ^ (-1677169050);
                                            i33 = 231042930;
                                        } else {
                                            iM559715 = C0873.m55680("ۨ᩻") ^ i31;
                                            i32 = ((iM559715 ^ i30) * 4377) ^ (-904916382);
                                            i33 = 1659812174;
                                        }
                                        break;
                                    case -1918469562:
                                    case 1701693210:
                                        if (C1036.m56257() <= 0) {
                                            iM559715 = (i30 - C0873.m55680("᩷ۧ")) * (-121);
                                            i32 = ((iM559715 ^ i31) * (-30263)) ^ (-367264222);
                                            i33 = -644498205;
                                        } else {
                                            iM559715 = (C0873.m55680("֨᩸") ^ i30) * 97;
                                            i32 = ((iM559715 ^ i31) * 3089) ^ (-49458871);
                                            i33 = -1688564614;
                                        }
                                        break;
                                    case -1750745998:
                                    case 2060337301:
                                        this.f52696 = viewOnClickListenerC2886;
                                        if (C0946.f81894 != 0) {
                                            iM559715 = (C0873.m55680("ۛܳ") + i30) * 61;
                                            i32 = ((iM559715 ^ i31) * (-30823)) ^ (-1732711492);
                                            i33 = 981534328;
                                        } else {
                                            iM559715 = (i31 - C0873.m55680("ᩴܿ")) * (-97);
                                            i32 = ((iM559715 ^ i30) * (-6455)) ^ (-1369489362);
                                            i33 = 129873191;
                                        }
                                        break;
                                    case -1724681771:
                                    case 1193770303:
                                        if (C0882.m55710() != 0) {
                                            iM559715 = (i30 - C0873.m55680("ۡۖ")) * 3;
                                            i32 = ((iM559715 ^ i31) * (-32693)) ^ 1483020363;
                                            i33 = 474749039;
                                        } else {
                                            iM559715 = C0946.m55979("᩻ܿ") ^ i30;
                                            i32 = ((iM559715 ^ i31) * 4295) ^ (-580725883);
                                            i33 = -629949758;
                                        }
                                        break;
                                    case -1671853193:
                                    case 1204667894:
                                        C0946.m55980();
                                        throw new RuntimeException();
                                    case -1419106838:
                                    case -726324328:
                                        return;
                                    case -1362021097:
                                    case 1205036154:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM559715 = (i30 - C0873.m55680("ۡۖ")) * 3;
                                            i32 = ((iM559715 ^ i31) * (-32693)) ^ 1483020363;
                                            i33 = 474749039;
                                        } else {
                                            iM559715 = C0946.m55979("۬ᩴ") ^ i31;
                                            i32 = ((iM559715 ^ i30) * (-17249)) ^ 263134756;
                                            i33 = 1776756870;
                                        }
                                        break;
                                    case -1286126185:
                                    case 46688831:
                                        if (C1036.f81953 >= 0) {
                                            iM559715 = (i30 - C0873.m55680("ۡۖ")) * 3;
                                            i32 = ((iM559715 ^ i31) * (-32693)) ^ 1483020363;
                                            i33 = 474749039;
                                        } else {
                                            iM559715 = (i30 - C0946.m55979("ۤ᩻")) * (-37);
                                            i32 = ((iM559715 ^ i31) * 16419) ^ (-1709328236);
                                            i33 = 1007915013;
                                        }
                                        break;
                                    case -1201744444:
                                    case 224971327:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559715 = (i30 - C0873.m55680("ۡۖ")) * 3;
                                            i32 = ((iM559715 ^ i31) * (-32693)) ^ 1483020363;
                                            i33 = 474749039;
                                        } else {
                                            iM559715 = (C0873.m55680("᩷ܽ") + i30) * 25;
                                            i32 = ((iM559715 ^ i31) * (-9041)) ^ 1827754551;
                                            i33 = -1571947367;
                                        }
                                        break;
                                    case -1009876760:
                                    case -947943217:
                                        if (C0949.f81897 < 0) {
                                            iM559715 = (i30 - C0873.m55680("᩷ۧ")) * (-121);
                                            i32 = ((iM559715 ^ i31) * (-30263)) ^ (-367264222);
                                            i33 = -644498205;
                                        } else {
                                            iM559715 = (C0873.m55680("ۤ۬") ^ i31) * 75;
                                            i32 = ((iM559715 ^ i30) * 21123) ^ 425684948;
                                            i33 = 2105720203;
                                        }
                                        break;
                                    case -920229778:
                                    case 531694117:
                                        if (!C0927.f81875) {
                                            iM559715 = (C0946.m55979("ܺ᩺") + i31) * 73;
                                            i32 = ((iM559715 ^ i30) * 23657) ^ (-1677169050);
                                            i33 = 231042930;
                                        } else {
                                            iM559715 = (C0873.m55680("ۛܳ") + i30) * 61;
                                            i32 = ((iM559715 ^ i31) * (-30823)) ^ (-1732711492);
                                            i33 = 981534328;
                                        }
                                        break;
                                    case -746811642:
                                    case -587147709:
                                        C0898.m55800();
                                        if (!C0882.f81846) {
                                            iM559715 = (C0873.m55680("ۤ۬") ^ i31) * 75;
                                            i32 = ((iM559715 ^ i30) * 21123) ^ 425684948;
                                            i33 = 2105720203;
                                        } else {
                                            iM559715 = (C0873.m55680("ۛܳ") + i30) * 61;
                                            i32 = ((iM559715 ^ i31) * (-30823)) ^ (-1732711492);
                                            i33 = 981534328;
                                        }
                                        break;
                                    case -615325077:
                                    case 2034873475:
                                        if (C1964.m56597() != 0) {
                                            iM559715 = (C0946.m55979("ܺ᩺") + i31) * 73;
                                            i32 = ((iM559715 ^ i30) * 23657) ^ (-1677169050);
                                            i33 = 231042930;
                                        } else {
                                            iM559715 = C0873.m55680("ܶۡ") ^ i31;
                                            i32 = ((iM559715 ^ i30) * (-12973)) ^ 118029547;
                                            i33 = 2137579318;
                                        }
                                        break;
                                    case -271216503:
                                    case 1306405129:
                                        if (C1028.f81950 <= 0) {
                                            iM559715 = (C0873.m55680("ۤ۬") ^ i31) * 75;
                                            i32 = ((iM559715 ^ i30) * 21123) ^ 425684948;
                                            i33 = 2105720203;
                                        } else {
                                            iM559715 = (i31 - C0873.m55680("ۘܶ")) * (-107);
                                            i32 = ((iM559715 ^ i30) * 10815) ^ (-2012985845);
                                            i33 = -1053754231;
                                        }
                                        break;
                                    case 260459711:
                                    case 1164469601:
                                        if (C0917.m55854()) {
                                            iM559715 = C0946.m55979("᩵۫") ^ i30;
                                            i32 = ((iM559715 ^ i31) * 21027) ^ 1889264277;
                                            i33 = -1912908034;
                                        } else {
                                            iM559715 = (C0946.m55979("ܺ᩺") + i31) * 73;
                                            i32 = ((iM559715 ^ i30) * 23657) ^ (-1677169050);
                                            i33 = 231042930;
                                        }
                                        break;
                                    default:
                                        C0947.m55997();
                                        iM559715 = (C0873.m55680("ۛܳ") + i30) * 61;
                                        i32 = ((iM559715 ^ i31) * (-30823)) ^ (-1732711492);
                                        i33 = 981534328;
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case 1423171272:
                case 1735674312:
                    C0898.m55802(buttonM3859, 8);
                    iM55680 = C0946.m55979("ᩳܳ") ^ i13;
                    i = ((iM55680 ^ i12) * (-5631)) ^ 1757605627;
                    i2 = 1529459588;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                default:
                    C0955.m56025();
                    if (C0863.f81833 <= 0) {
                        view2 = view3;
                        int iM556816 = C0873.m55680("᩸ۜ") ^ i13;
                        view3 = view2;
                        i14 = ((iM556816 ^ i12) * 32217) ^ 86159462;
                        i15 = iM556816 ^ 1722757952;
                    } else {
                        c16319 = c16319;
                        sArr5 = sArr5;
                        i16 = i16;
                        sArr6 = sArr6;
                        iM55682 = (C0873.m55680("۬᩸") ^ i13) * (-13);
                        i14 = ((iM55682 ^ i12) * 27829) ^ 321479278;
                        i5 = 1157066707;
                        i6 = iM55682 ^ i5;
                        i16 = i16;
                        sArr6 = sArr6;
                        c16319 = c16319;
                        i15 = i6;
                        sArr5 = sArr5;
                        viewOnClickListenerC2886 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:51:0x01c7 A[PHI: r19
      0x01c7: PHI (r19v4 android.view.View) = (r19v3 android.view.View), (r19v2 android.view.View) binds: [B:50:0x01c5, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0202 A[PHI: r6 r7 r11 r12 r14 r15 r20
      0x0202: PHI (r6v6 android.widget.TextView) = 
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v4 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
     binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r14v5 short[]) = 
      (r14v2 short[])
      (r14v3 short[])
      (r14v2 short[])
      (r14v2 short[])
      (r14v2 short[])
      (r14v2 short[])
      (r14v2 short[])
      (r14v2 short[])
     binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r20v6 java.lang.String) = 
      (r20v4 java.lang.String)
      (r20v3 java.lang.String)
      (r20v3 java.lang.String)
      (r20v3 java.lang.String)
      (r20v3 java.lang.String)
      (r20v3 java.lang.String)
      (r20v3 java.lang.String)
      (r20v3 java.lang.String)
     binds: [B:54:0x0200, B:34:0x0126, B:30:0x0106, B:26:0x00d6, B:20:0x00a0, B:17:0x0085, B:10:0x0072, B:84:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0239 A[PHI: r5 r9 r10 r13 r21
      0x0239: PHI (r5v5 l.ۗۘ) = (r5v2 l.ۗۘ), (r5v4 l.ۗۘ), (r5v2 l.ۗۘ) binds: [B:58:0x0237, B:46:0x019c, B:42:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:58:0x0237, B:46:0x019c, B:42:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:58:0x0237, B:46:0x019c, B:42:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:58:0x0237, B:46:0x019c, B:42:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r21v3 android.view.View) = (r21v2 android.view.View), (r21v1 android.view.View), (r21v1 android.view.View) binds: [B:58:0x0237, B:46:0x019c, B:42:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC2886(C7581 c7581, View view) {
        int iM55979;
        int i;
        int iM55680;
        int iM559710;
        int i2;
        int i3;
        super(view);
        int i4 = 1515537284;
        int i5 = C1025.f81947;
        int i6 = C0845.f81821;
        short s = f81838[0];
        int i7 = s + 12937;
        int i8 = (s * s) + 167365969;
        int i9 = (i8 + i8) - (i7 * i7) >= 0 ? 9730 : 28887;
        this.f4988 = c7581;
        int iM55681 = (i6 - C0873.m55680("۬ۨ")) * (-97);
        int i10 = ((iM55681 ^ i5) * (-10629)) ^ (-250157278);
        int i11 = iM55681 ^ 701408827;
        TextView textView = null;
        String strM56180 = null;
        short[] sArr = null;
        int i12 = 0;
        C0990 c0990 = null;
        int i13 = 0;
        int iM55682 = 0;
        int i14 = 0;
        int iM559711 = 0;
        int i15 = 0;
        View viewM55755 = null;
        View viewM56465 = null;
        short[] sArr2 = null;
        int i16 = 0;
        while (true) {
            i4 = i11 ^ (i10 & (((i4 ^ i5) * (-10323)) >> 31));
            switch (i4) {
                case -2121808019:
                case -1733653676:
                    sArr = f81838;
                    i15 = 10;
                    i13 = 3;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                    } else {
                        iM55979 = C0873.m55680("ۘۚ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 10909) ^ (-1935005012);
                        i = -436593681;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case -2115309789:
                case 1093715857:
                    viewM56465 = C1404.m56465(view, i12 ^ 2125418396);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("۟۬") ^ i6) * 7;
                        i10 = ((iM55979 ^ i5) * 29267) ^ 375856645;
                        i = -203481062;
                    } else {
                        iM55979 = C0946.m55979("۟᩹") ^ i6;
                        i10 = ((iM55979 ^ i5) * (-32751)) ^ 710349746;
                        i = -1153350084;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case -1942251676:
                case -163252516:
                    c0990 = (C0990) viewM55755;
                    this.f4986 = c0990;
                    sArr2 = f81838;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("۟۬") ^ i6) * 7;
                        i10 = ((iM55979 ^ i5) * 29267) ^ 375856645;
                        i = -203481062;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩺") ^ i6;
                        i10 = ((iM55979 ^ i5) * 17485) ^ 2135222738;
                        i = -1564908218;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case -1650944228:
                case 1812821162:
                    iM55680 = C0873.m55680(C0894.m55773(f81838, 1, 3, i9));
                    if (C1194.f82045 != 0) {
                        iM559710 = (i5 - C0873.m55680("ۛᩳ")) * (-109);
                        i2 = ((iM559710 ^ i6) * (-22419)) ^ (-516399638);
                        i3 = -873149401;
                    } else {
                        iM559710 = (C0946.m55979("ᩳۖ") ^ i5) * 9;
                        i2 = ((iM559710 ^ i6) * (-23509)) ^ (-1983483275);
                        i3 = 424033213;
                    }
                    i12 = iM55680;
                    i11 = iM559710 ^ i3;
                    i10 = i2;
                    break;
                case -1522533839:
                case 1578926733:
                    iM55682 = C0873.m55680(C0992.m56102(sArr2, 7, 3, i9));
                    i14 = 2122400243;
                    if (C0890.m55740()) {
                        iM55979 = (C0946.m55979("ۨۙ") ^ i5) * (-19);
                        i10 = ((iM55979 ^ i6) * (-21847)) ^ 766673802;
                        i = -281064013;
                    } else {
                        iM55979 = (C0946.m55979("۟۬") ^ i6) * 7;
                        i10 = ((iM55979 ^ i5) * 29267) ^ 375856645;
                        i = -203481062;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case -1055113917:
                case -955315733:
                    C0906.m55809();
                    iM55979 = C0873.m55680("ۡܰ") ^ i6;
                    i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                    i = -110530083;
                    i11 = iM55979 ^ i;
                    break;
                case -385638429:
                case 618707870:
                    viewM55755 = C0892.m55755(view, C0946.m55979(strM56180) ^ 2103283734);
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("᩷᩵") ^ i5;
                        i10 = ((iM55979 ^ i6) * 27429) ^ 855730160;
                        i = 864782040;
                    } else {
                        iM55979 = C0946.m55979("ܳۧ") ^ i5;
                        i10 = ((iM55979 ^ i6) * 10369) ^ 135528970;
                        i = 46387493;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case 97300729:
                case 1683640645:
                    C0917.m55854();
                    C0912.m55833();
                    throw new RuntimeException();
                case 132800670:
                case 425713062:
                    textView = (TextView) C0892.m55755(view, C0873.m55680(C1044.m56276(sArr, i15, i13, i9)) ^ 2127626755);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                    } else {
                        iM55979 = C0873.m55680("۬ۜ") ^ i5;
                        i10 = ((iM55979 ^ i6) * (-14321)) ^ 792878819;
                        i = -1538103989;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case 402779376:
                case 458706576:
                    if (C1036.f81953 < 0) {
                        iM55680 = i12;
                        iM559710 = (i5 - C0873.m55680("ۛᩳ")) * (-109);
                        i2 = ((iM559710 ^ i6) * (-22419)) ^ (-516399638);
                        i3 = -873149401;
                        i12 = iM55680;
                        i11 = iM559710 ^ i3;
                        i10 = i2;
                    } else {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                        i11 = iM55979 ^ i;
                    }
                    break;
                case 433588748:
                case 2133554011:
                    this.f4992 = (TextView) C0892.m55755(view, iM559711 ^ i16);
                    C1024.m56214(c0990, this);
                    C1048.m56304(view, this);
                    return;
                case 501536291:
                case 1206170637:
                    this.f4991 = (ImageView) viewM56465;
                    strM56180 = RunnableC1014.m56180(f81838, 4, 3, i9);
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                    } else {
                        iM55979 = (C0873.m55680("ۛ᩷") + i6) * 43;
                        i10 = ((iM55979 ^ i5) * (-10851)) ^ 1165521533;
                        i = 1258599539;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case 527158646:
                case 695001480:
                    C0873.m55678();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                    } else {
                        iM55979 = (C0873.m55680("ܿ֫") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i10 = ((iM55979 ^ i5) * 17071) ^ (-1099687073);
                        i = -1195839075;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case 871649258:
                case 919051103:
                    this.f4990 = (TextView) C1404.m56465(view, iM55682 ^ i14);
                    if (!C0892.f81851) {
                        iM55680 = i12;
                        iM559710 = (i5 - C0873.m55680("ۛᩳ")) * (-109);
                        i2 = ((iM559710 ^ i6) * (-22419)) ^ (-516399638);
                        i3 = -873149401;
                        i12 = iM55680;
                        i11 = iM559710 ^ i3;
                        i10 = i2;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۡ֫")) * 13;
                        i10 = ((iM55979 ^ i6) * (-13895)) ^ (-511812555);
                        i = -346129334;
                        i11 = iM55979 ^ i;
                    }
                    break;
                case 1356167638:
                case 1979739327:
                    this.f4989 = textView;
                    iM559711 = C0946.m55979(C0892.m55750(f81838, 13, 3, i9));
                    i16 = 2124415004;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩷") ^ i6) * (-71);
                        i10 = ((iM55979 ^ i5) * 12889) ^ (-916825906);
                        i = -198849888;
                    }
                    i11 = iM55979 ^ i;
                    break;
                default:
                    C0955.m56025();
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ۡܰ") ^ i6;
                        i10 = ((iM55979 ^ i5) * 5855) ^ 1614353579;
                        i = -110530083;
                    } else {
                        iM55979 = C0946.m55979("᩷᩵") ^ i5;
                        i10 = ((iM55979 ^ i6) * 27429) ^ 855730160;
                        i = 864782040;
                    }
                    i11 = iM55979 ^ i;
                    break;
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 1580690462;
        int i2 = C1046.f81962;
        int i3 = C1404.f82149;
        int iM55680 = C0873.m55680("ۨ֨") ^ i2;
        int i4 = ((iM55680 ^ i3) * 7267) ^ (-162130970);
        int i5 = 1143006973;
        while (true) {
            i = ((((i ^ i3) * 32453) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2118219242:
                case 872411674:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۟᩵")) * (-29);
                        i4 = ((iM55680 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    } else {
                        iM55680 = (C0946.m55979("᩺ᩳ") ^ i3) * 3;
                        i4 = ((iM55680 ^ i2) * (-1767)) ^ (-144685718);
                        i5 = -1971055411;
                    }
                    break;
                case -1746392488:
                case -1309321466:
                    break;
                case -1717748403:
                case 317302682:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("֫ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩹ۤ")) * 57;
                        i4 = ((iM55680 ^ i3) * 23585) ^ 1775612272;
                        i5 = 1378012355;
                    }
                    break;
                case -1654650611:
                case -953711533:
                    C0892.m55749();
                    break;
                case -1491820090:
                case 386650700:
                    this.f4987.m41529(z);
                    C14976.m34323();
                    iM55680 = (C0946.m55979("ۗ֫") ^ i3) * 27;
                    i4 = ((iM55680 ^ i2) * (-31107)) ^ 1173179869;
                    i5 = -144641536;
                    break;
                case -937371854:
                case 1792974378:
                    C1048.m56305();
                    if (C1046.f81962 > 0) {
                        iM55680 = C0946.m55979("۫ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14801)) ^ 1331829414;
                        i5 = -2029101705;
                    } else {
                        iM55680 = C0946.m55979("֫ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    }
                    break;
                case -865723761:
                case 647679:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i3 - C0946.m55979("۟᩵")) * (-29);
                        i4 = ((iM55680 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۡ") + i3) * (-67);
                        i4 = ((iM55680 ^ i2) * (-6677)) ^ (-631846980);
                        i5 = 213547840;
                    }
                    break;
                case -821120948:
                case 1988304066:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("֫ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        iM55680 = (C0873.m55680("᩹ۧ") + i3) * 17;
                        i4 = ((iM55680 ^ i2) * 16951) ^ 2095422;
                        i5 = 604365774;
                    }
                    break;
                case -731381875:
                case 615648568:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۟᩵")) * (-29);
                        i4 = ((iM55680 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    } else {
                        iM55680 = C0946.m55979("ۚ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4605)) ^ 1227469016;
                        i5 = -1171860859;
                    }
                    break;
                case -376286067:
                case 1785702002:
                    RunnableC0871.m55672();
                    if (C1017.f81942 < 0) {
                        iM55680 = C0873.m55680("ۗ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-18385)) ^ (-1336505223);
                        i5 = -1628858527;
                    } else {
                        iM55680 = C0946.m55979("۫ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14801)) ^ 1331829414;
                        i5 = -2029101705;
                    }
                    break;
                case -319843803:
                case 782703657:
                    if (this.f4987.m41537() != z) {
                        iM55680 = (C0873.m55680("ۧۧ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * (-14979)) ^ (-626613773);
                        i5 = -34564899;
                    } else {
                        iM55680 = (C0946.m55979("ۗ֫") ^ i3) * 27;
                        i4 = ((iM55680 ^ i2) * (-31107)) ^ 1173179869;
                        i5 = -144641536;
                    }
                    break;
                case -270523664:
                case 297970264:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("֫ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۧ᩶")) * 73;
                        i4 = ((iM55680 ^ i3) * 17765) ^ 1909963899;
                        i5 = -569979071;
                    }
                    break;
                case -253471399:
                case 1956998458:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("ۗ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-18385)) ^ (-1336505223);
                        i5 = -1628858527;
                    } else {
                        iM55680 = C0946.m55979("۟۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 32599) ^ (-225217469);
                        i5 = -1714949877;
                    }
                    break;
                case -151507774:
                case 902964160:
                    if (C0890.m55740()) {
                        iM55680 = (C0946.m55979("᩹ۛ") + i3) * 51;
                        i4 = ((iM55680 ^ i2) * (-9875)) ^ 1564997004;
                        i5 = -1855105961;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۟᩵")) * (-29);
                        i4 = ((iM55680 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    }
                    break;
                case 252714129:
                case 856059044:
                    if (C1046.m56302() != 0) {
                        iM55680 = C0946.m55979("۫ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14801)) ^ 1331829414;
                        i5 = -2029101705;
                    } else {
                        iM55680 = C0873.m55680("ۚۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12637)) ^ 312269508;
                        i5 = -974629285;
                    }
                    break;
                case 310723415:
                case 1239810207:
                    C0892.m55749();
                    C1964.m56597();
                    iM55680 = C0946.m55979("ۙۛ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-15075)) ^ 827486891;
                    i5 = -878098296;
                    break;
                case 1469070742:
                case 1631471289:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۙۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15075)) ^ 827486891;
                        i5 = -878098296;
                    } else {
                        iM55680 = (C0946.m55979("۬ܽ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55680 ^ i3) * 18391) ^ (-927010880);
                        i5 = -954281922;
                    }
                    break;
                default:
                    RunnableC1014.m56177();
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("֫ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        iM55680 = C0946.m55979("ۙۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15075)) ^ 827486891;
                        i5 = -878098296;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0285 A[PHI: r6 r13 r17 r19
      0x0285: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:67:0x0283, B:42:0x013e, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r13v2 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v3 short[]) binds: [B:67:0x0283, B:42:0x013e, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r17v18 int) = (r17v10 int), (r17v17 int), (r17v19 int) binds: [B:67:0x0283, B:42:0x013e, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r19v13 java.lang.String) = (r19v5 java.lang.String), (r19v12 java.lang.String), (r19v14 java.lang.String) binds: [B:67:0x0283, B:42:0x013e, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v44, types: [l.᩵ܽ᩷] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4651(ViewOnClickListenerC2886 viewOnClickListenerC2886, DialogInterfaceC2564 dialogInterfaceC2564) {
        int iM55979;
        int i;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        final ViewOnClickListenerC2886 viewOnClickListenerC2887 = viewOnClickListenerC2886;
        C7581 c7581 = null;
        String strM55707 = null;
        int iM55680 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 597142303;
        int i11 = C0845.f81821;
        int i12 = C0877.f81843;
        int iM559711 = C0946.m55979("۟ۛ") ^ i12;
        int i13 = ((iM559711 ^ i11) * (-22953)) ^ 660226736;
        int i14 = iM559711 ^ (-593976214);
        String strM55658 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 12375) >> 31));
            switch (i10) {
                case -2076290155:
                case -1751777681:
                    break;
                case -1952608320:
                case 1613565617:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    sArr2 = f81838;
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0873.m55680("ܽۧ") ^ i12;
                        i = ((iM55979 ^ i11) * 15541) ^ 83016578;
                        i2 = 1666693092;
                    } else {
                        iM55979 = C0873.m55680("᩻᩷") ^ i12;
                        i = ((iM55979 ^ i11) * (-32417)) ^ 236869848;
                        i2 = 1109204168;
                    }
                    int i15 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i15;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case -1631438310:
                case 1057359559:
                    i9 = 30056;
                    iM55979 = C0873.m55680("ܶۜ") ^ i12;
                    i = ((iM55979 ^ i11) * (-31135)) ^ 1431404695;
                    i2 = 695578369;
                    int i16 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i16;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case -1518472451:
                case -317175117:
                    C0898.m55800();
                    if (C0894.f81854 < 0) {
                        strM55707 = strM55707;
                        iM55680 = iM55680;
                        iM55979 = C0873.m55680("۬᩵") ^ i11;
                        i = ((iM55979 ^ i12) * 20931) ^ (-1351906742);
                        i2 = -110565385;
                        int i17 = iM55979 ^ i2;
                        iM55680 = iM55680;
                        i14 = i17;
                        i13 = i;
                        strM55707 = strM55707;
                    } else {
                        int iM55681 = (C0873.m55680("֫᩷") ^ i12) * (-79);
                        i14 = iM55681 ^ (-655351045);
                        i13 = ((iM55681 ^ i11) * 23803) ^ (-1981058185);
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    }
                    break;
                case -1489349766:
                case 1774559453:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    C1024.m56208(dialogInterfaceC2564);
                    strM55658 = C0866.m55658(viewOnClickListenerC2887.f4987);
                    if (C1229.f82066 < 0) {
                        iM55979 = C0946.m55979("֫ܿ") ^ i11;
                        i = ((iM55979 ^ i12) * (-1203)) ^ (-847317092);
                        i2 = -1263985500;
                        int i18 = iM55979 ^ i2;
                        iM55680 = iM55680;
                        i14 = i18;
                        i13 = i;
                        strM55707 = strM55707;
                    } else {
                        iM55680 = iM55680;
                        strM55707 = strM55707;
                        int iM55682 = (C0873.m55680("֫᩷") ^ i12) * (-79);
                        i14 = iM55682 ^ (-655351045);
                        i13 = ((iM55682 ^ i11) * 23803) ^ (-1981058185);
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    }
                    break;
                case -1445004093:
                case -844176870:
                    if (C0912.f81867 <= 0) {
                        strM55707 = strM55707;
                        iM55680 = iM55680;
                        iM55979 = C0946.m55979("֨ۢ") ^ i11;
                        i = ((iM55979 ^ i12) * (-8479)) ^ (-426368710);
                        i2 = -212884642;
                        int i19 = iM55979 ^ i2;
                        iM55680 = iM55680;
                        i14 = i19;
                        i13 = i;
                        strM55707 = strM55707;
                    }
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    iM55979 = (C0873.m55680("ۗۚ") + i12) * (-21);
                    i = ((iM55979 ^ i11) * (-1505)) ^ 1004415817;
                    i2 = -1688568980;
                    int i110 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i110;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case -1263392477:
                case -187400289:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    C7581.m17495(c7581, (RunnableC20993) new Runnable() { // from class: l.᩵ܽ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC2886 viewOnClickListenerC2888 = null;
                            C7581 c7582 = null;
                            List listM34312 = null;
                            int i20 = -1474982851;
                            int i21 = C1053.f81965;
                            int i22 = C0992.f81922;
                            int iM559712 = (C0946.m55979("᩻᩹") ^ i22) * (-45);
                            int i23 = ((iM559712 ^ i21) * (-17051)) ^ (-253481043);
                            int i24 = -783388049;
                            while (true) {
                                i20 = ((((i20 ^ i21) * 20767) >> 31) & i23) ^ (iM559712 ^ i24);
                                switch (i20) {
                                    case -2098439012:
                                    case 1698458885:
                                        C1194.m56396();
                                        iM559712 = C0946.m55979("ۘۙ") ^ i21;
                                        i23 = ((iM559712 ^ i22) * 20221) ^ (-1217844973);
                                        i24 = -1674813537;
                                        break;
                                    case -2012435648:
                                    case -407021337:
                                        c7582.f19867 = listM34312;
                                        c7582.f19866 = C14976.m34317();
                                        break;
                                    case -1761707957:
                                    case -314012076:
                                        if (C0863.f81833 <= 0) {
                                            iM559712 = (i22 - C0946.m55979("ᩴ᩵")) * (-75);
                                            i23 = ((iM559712 ^ i21) * (-1125)) ^ (-228040012);
                                            i24 = 135942372;
                                        } else {
                                            iM559712 = C0946.m55979("ܳᩴ") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-10433)) ^ (-797671021);
                                            i24 = -1836180195;
                                        }
                                        break;
                                    case -1654916357:
                                    case 1566297532:
                                        c7582 = viewOnClickListenerC2888.f4988;
                                        if (C1053.f81965 <= 0) {
                                            iM559712 = C0873.m55680("ܽ۫") ^ i22;
                                            i23 = ((iM559712 ^ i21) * (-20479)) ^ 1414419983;
                                            i24 = 1867330082;
                                        } else {
                                            iM559712 = C0946.m55979("ᩴۢ") ^ i22;
                                            i23 = ((iM559712 ^ i21) * 27415) ^ (-1935582498);
                                            i24 = 1179616807;
                                        }
                                        break;
                                    case -1602396177:
                                    case 1386413647:
                                        if (C0947.m55997()) {
                                            iM559712 = (i22 - C0946.m55979("ᩴ᩵")) * (-75);
                                            i23 = ((iM559712 ^ i21) * (-1125)) ^ (-228040012);
                                            i24 = 135942372;
                                        } else {
                                            iM559712 = (i22 - C0946.m55979("ۡۙ")) * 45;
                                            i23 = ((iM559712 ^ i21) * (-235)) ^ (-1542721829);
                                            i24 = 2054349926;
                                        }
                                        break;
                                    case -1546783150:
                                    case -753830361:
                                        if (C0866.f81837 >= 0) {
                                            iM559712 = C0873.m55680("ᩳ᩵") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-5129)) ^ 1427863987;
                                            i24 = -1495656834;
                                        } else {
                                            iM559712 = (i22 - C0946.m55979("۬᩶")) * (-95);
                                            i23 = ((iM559712 ^ i21) * 30201) ^ 2002124401;
                                            i24 = -1955199480;
                                        }
                                        break;
                                    case -1496134252:
                                    case 1688399808:
                                        if (C0917.f81868) {
                                            iM559712 = (i22 - C0946.m55979("ᩴ᩵")) * (-75);
                                            i23 = ((iM559712 ^ i21) * (-1125)) ^ (-228040012);
                                            i24 = 135942372;
                                        } else {
                                            iM559712 = (C0946.m55979("᩹֫") + i22) * 27;
                                            i23 = ((iM559712 ^ i21) * (-14697)) ^ 1685034165;
                                            i24 = -1925494771;
                                        }
                                        break;
                                    case -1469010506:
                                    case -1272576048:
                                        C0890.m55740();
                                        C0892.m55749();
                                        break;
                                    case -1410517703:
                                    case 655885117:
                                        listM34312 = C14976.m34312();
                                        if (RunnableC0897.f81856) {
                                            iM559712 = (C0946.m55979("᩶ܺ") ^ i21) * (-19);
                                            i23 = ((iM559712 ^ i22) * (-11587)) ^ (-1412218565);
                                            i24 = -1795344772;
                                        } else {
                                            iM559712 = (i22 - C0946.m55979("ᩴ᩵")) * (-75);
                                            i23 = ((iM559712 ^ i21) * (-1125)) ^ (-228040012);
                                            i24 = 135942372;
                                        }
                                        break;
                                    case -1378142595:
                                    case 1246577895:
                                        if (C0992.m56107() <= 0) {
                                            iM559712 = C0873.m55680("ܽ۫") ^ i22;
                                            i23 = ((iM559712 ^ i21) * (-20479)) ^ 1414419983;
                                            i24 = 1867330082;
                                        } else {
                                            iM559712 = C0946.m55979("ۘۙ") ^ i21;
                                            i23 = ((iM559712 ^ i22) * 20221) ^ (-1217844973);
                                            i24 = -1674813537;
                                        }
                                        break;
                                    case -1308937009:
                                    case -618082532:
                                        if (RunnableC1014.m56177()) {
                                            iM559712 = C0873.m55680("ۙ۫") ^ i21;
                                            i23 = ((iM559712 ^ i22) * 1433) ^ (-919273094);
                                            i24 = 1727925333;
                                        } else {
                                            iM559712 = (i22 - C0946.m55979("ᩴ᩵")) * (-75);
                                            i23 = ((iM559712 ^ i21) * (-1125)) ^ (-228040012);
                                            i24 = 135942372;
                                        }
                                        break;
                                    case -1085511010:
                                    case 1898475605:
                                        if (C1071.f81975 <= 0) {
                                            iM559712 = C0873.m55680("ᩳ᩵") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-5129)) ^ 1427863987;
                                            i24 = -1495656834;
                                        } else {
                                            iM559712 = C0946.m55979("۟ۡ") ^ i21;
                                            i23 = ((iM559712 ^ i22) * 2125) ^ 231432199;
                                            i24 = -1752103784;
                                        }
                                        break;
                                    case -349347579:
                                    case 159119522:
                                        viewOnClickListenerC2888 = this.f65903;
                                        if (RunnableC1014.m56177()) {
                                            iM559712 = (i22 - C0946.m55979("᩶ۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i23 = ((iM559712 ^ i21) * (-1633)) ^ (-1097916360);
                                            i24 = -1795427327;
                                        } else {
                                            iM559712 = C0873.m55680("ᩳ᩵") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-5129)) ^ 1427863987;
                                            i24 = -1495656834;
                                        }
                                        break;
                                    case 867645889:
                                    case 1511081134:
                                        if (C0894.f81854 >= 0) {
                                            iM559712 = C0873.m55680("ܽ۫") ^ i22;
                                            i23 = ((iM559712 ^ i21) * (-20479)) ^ 1414419983;
                                            i24 = 1867330082;
                                        } else {
                                            iM559712 = C0873.m55680("ۖ۫") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-6381)) ^ 391266280;
                                            i24 = -652968535;
                                        }
                                        break;
                                    case 1409916010:
                                    case 1790887583:
                                        if (RunnableC0938.m55938() != 0) {
                                            iM559712 = C0873.m55680("ᩳ᩵") ^ i21;
                                            i23 = ((iM559712 ^ i22) * (-5129)) ^ 1427863987;
                                            i24 = -1495656834;
                                        } else {
                                            iM559712 = (i22 - C0873.m55680("ۗۨ")) * (-65);
                                            i23 = ((iM559712 ^ i21) * 11595) ^ (-374142631);
                                            i24 = 132687676;
                                        }
                                        break;
                                    default:
                                        if (!C0949.m56012()) {
                                            iM559712 = C0873.m55680("ܽ۫") ^ i22;
                                            i23 = ((iM559712 ^ i21) * (-20479)) ^ 1414419983;
                                            i24 = 1867330082;
                                        } else {
                                            iM559712 = (i22 - C0873.m55680("ۗۨ")) * (-65);
                                            i23 = ((iM559712 ^ i21) * 11595) ^ (-374142631);
                                            i24 = 132687676;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("ۙᩴ") ^ i12;
                        i = ((iM55979 ^ i11) * (-24481)) ^ 1724084098;
                        i2 = 97680230;
                    } else {
                        iM55979 = C0873.m55680("ܽۧ") ^ i12;
                        i = ((iM55979 ^ i11) * 15541) ^ 83016578;
                        i2 = 1666693092;
                    }
                    int i111 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i111;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case -1258341840:
                case -936731540:
                    C1028.m56247();
                    break;
                case -867087991:
                case 731632871:
                    i3 = iM55680;
                    strM55707 = C0877.m55707(sArr2, 17, 3, i9);
                    if (C0912.f81867 > 0) {
                        iM559710 = C0946.m55979("ۛۧ") ^ i11;
                        i4 = ((iM559710 ^ i12) * 7561) ^ 1983075996;
                        i5 = -343988379;
                        int i20 = i3;
                        i14 = iM559710 ^ i5;
                        i13 = i4;
                        iM55680 = i20;
                    } else {
                        iM55680 = i3;
                        int iM55683 = (C0873.m55680("֫᩷") ^ i12) * (-79);
                        i14 = iM55683 ^ (-655351045);
                        i13 = ((iM55683 ^ i11) * 23803) ^ (-1981058185);
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    }
                    break;
                case -769795645:
                case 228030194:
                    ((RunnableC14306) c7581.f19868).run();
                    i3 = iM55680;
                    iM559710 = C0873.m55680("ۚۜ") ^ i11;
                    i4 = ((iM559710 ^ i12) * 15853) ^ 1249193854;
                    i5 = 2023462300;
                    int i21 = i3;
                    i14 = iM559710 ^ i5;
                    i13 = i4;
                    iM55680 = i21;
                    break;
                case -661383289:
                case -51437577:
                    i9 = 42782;
                    iM55979 = C0873.m55680("ܶۜ") ^ i12;
                    i = ((iM55979 ^ i11) * (-31135)) ^ 1431404695;
                    i2 = 695578369;
                    int i112 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i112;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case -302369133:
                case 1190249393:
                    C0917.m55842(2123486623 ^ iM55680);
                    if (c7581.f19868 != null) {
                        iM559710 = C0873.m55680("᩷ܰ") ^ i11;
                        i3 = iM55680;
                        i4 = ((iM559710 ^ i12) * (-28705)) ^ (-86100384);
                        i5 = -248426464;
                    } else {
                        i3 = iM55680;
                        iM559710 = C0873.m55680("ۚۜ") ^ i11;
                        i4 = ((iM559710 ^ i12) * 15853) ^ 1249193854;
                        i5 = 2023462300;
                    }
                    int i22 = i3;
                    i14 = iM559710 ^ i5;
                    i13 = i4;
                    iM55680 = i22;
                    break;
                case -272489702:
                case 781598812:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    s = sArr[c];
                    i6 = s * s;
                    i7 = 32410249;
                    if (C1044.m56286() <= 0) {
                        iM55979 = (C0873.m55680("ۗۚ") + i12) * (-21);
                        i = ((iM55979 ^ i11) * (-1505)) ^ 1004415817;
                        i2 = -1688568980;
                    } else {
                        iM55979 = C0873.m55680("᩵ܽ") ^ i12;
                        i = ((iM55979 ^ i11) * 1267) ^ 344336140;
                        i2 = 1033548438;
                    }
                    int i113 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i113;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case -206700067:
                case 103998155:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    int i23 = s + s2;
                    if ((i23 * i23) - i8 > 0) {
                        iM55979 = C0946.m55979("ۨ᩶") ^ i11;
                        i = ((iM55979 ^ i12) * 17011) ^ 386403960;
                        i2 = 4911666;
                    } else {
                        iM55979 = (C0873.m55680("֫ܶ") ^ i12) * (-93);
                        i = ((iM55979 ^ i11) * 22207) ^ (-1304248310);
                        i2 = -741601096;
                    }
                    int i114 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i114;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case 97323957:
                case 1246443682:
                    if (!C0882.f81846) {
                        int iM55684 = (C0873.m55680("֫᩷") ^ i12) * (-79);
                        i14 = iM55684 ^ (-655351045);
                        i13 = ((iM55684 ^ i11) * 23803) ^ (-1981058185);
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    } else {
                        strM55707 = strM55707;
                        iM55680 = iM55680;
                        iM55979 = (C0873.m55680("ۗۚ") + i12) * (-21);
                        i = ((iM55979 ^ i11) * (-1505)) ^ 1004415817;
                        i2 = -1688568980;
                        int i115 = iM55979 ^ i2;
                        iM55680 = iM55680;
                        i14 = i115;
                        i13 = i;
                        strM55707 = strM55707;
                    }
                    break;
                case 163924477:
                case 1389847979:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    sArr = f81838;
                    if (C0989.f81920 >= 0) {
                        iM55680 = iM55680;
                        strM55707 = strM55707;
                        int iM55685 = (C0873.m55680("֫᩷") ^ i12) * (-79);
                        i14 = iM55685 ^ (-655351045);
                        i13 = ((iM55685 ^ i11) * 23803) ^ (-1981058185);
                    } else {
                        int iM55686 = C0873.m55680("۬ۧ") ^ i12;
                        i13 = ((iM55686 ^ i11) * (-12515)) ^ 1395551295;
                        iM55680 = iM55680;
                        strM55707 = strM55707;
                        i14 = iM55686 ^ (-1114610932);
                    }
                    viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    break;
                case 266995759:
                case 1036631801:
                    C0955.m56025();
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    iM55979 = (C0873.m55680("ۗۚ") + i12) * (-21);
                    i = ((iM55979 ^ i11) * (-1505)) ^ 1004415817;
                    i2 = -1688568980;
                    int i116 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i116;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case 400220482:
                case 2068568788:
                    iM55680 = C0873.m55680(strM55707);
                    if (C0898.f81858 > 0) {
                        int iM55687 = C0873.m55680("᩶ܶ") ^ i12;
                        strM55707 = strM55707;
                        i = ((iM55687 ^ i11) * 1547) ^ (-864463856);
                        i14 = iM55687 ^ 1672877838;
                        i13 = i;
                        strM55707 = strM55707;
                    } else {
                        int iM55688 = (C0873.m55680("֫᩷") ^ i12) * (-79);
                        i14 = iM55688 ^ (-655351045);
                        i13 = ((iM55688 ^ i11) * 23803) ^ (-1981058185);
                        viewOnClickListenerC2887 = viewOnClickListenerC2886;
                    }
                    break;
                case 870294634:
                case 1881789004:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    c = 16;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("ܽۧ") ^ i12;
                        i = ((iM55979 ^ i11) * 15541) ^ 83016578;
                        i2 = 1666693092;
                    } else {
                        iM55979 = C0873.m55680("ܳۤ") ^ i11;
                        i = ((iM55979 ^ i12) * (-16619)) ^ 189075605;
                        i2 = -768361722;
                    }
                    int i117 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i117;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                case 1208792859:
                case 2121073469:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    C14976.m34316(strM55658);
                    c7581 = viewOnClickListenerC2887.f4988;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("֨ۢ") ^ i11;
                        i = ((iM55979 ^ i12) * (-8479)) ^ (-426368710);
                        i2 = -212884642;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۗ") ^ i11) * 99;
                        i = ((iM55979 ^ i12) * 6587) ^ (-1323190904);
                        i2 = 1083492830;
                    }
                    int i118 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i118;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
                default:
                    strM55707 = strM55707;
                    iM55680 = iM55680;
                    int i24 = i6 + i7;
                    i8 = i24 + i24;
                    s2 = 5693;
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("۬᩵") ^ i11;
                        i = ((iM55979 ^ i12) * 20931) ^ (-1351906742);
                        i2 = -110565385;
                    } else {
                        iM55979 = (C0873.m55680("ܶۛ") + i11) * (-41);
                        i = ((iM55979 ^ i12) * (-32221)) ^ (-128176367);
                        i2 = 2059888909;
                    }
                    int i119 = iM55979 ^ i2;
                    iM55680 = iM55680;
                    i14 = i119;
                    i13 = i;
                    strM55707 = strM55707;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    public static void m4653(p067l.ViewOnClickListenerC2886 r35, p067l.DialogInterfaceC2564 r36, android.view.View r37) {
        /*
            Method dump skipped, instruction units count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ViewOnClickListenerC2886.m4653(l.֡ܽ᩷, l.֡ۚۢ, android.view.View):void");
    }
}
