package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7621 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۨ᩵ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f82004 = {588, 16838, 30240, 21218, -19238, 17586, 29905, 19997, 28942, -19453, 9843, 22623, 18274, 20324, -8380, -18002, -19043, 23841, -24283, -31857, -17820, 18219, -16727, -29866, 1081, -7988, 5141, -7884, 6610, -1244, -5405, -14620, -13377, 7634, 7307, 1292, -4948, 1975, -3660, 2410, -7349, 1207, -15332, -14927, 8933, -12053, 12151, -8954, 11877, 9397, -14243};

    /* JADX INFO: renamed from: ۗ */
    public TextView f19938;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ActivityC3597 f19939;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f19940;

    /* JADX INFO: renamed from: ᩸ */
    public C20521 f19941;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f19942;

    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[PHI: r2
      0x0086: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:20:0x0084, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01c8 A[PHI: r3 r4 r10 r11
      0x01c8: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:47:0x01c6, B:32:0x011e, B:24:0x00c5, B:16:0x006a, B:14:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:47:0x01c6, B:32:0x011e, B:24:0x00c5, B:16:0x006a, B:14:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:47:0x01c6, B:32:0x011e, B:24:0x00c5, B:16:0x006a, B:14:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:47:0x01c6, B:32:0x011e, B:24:0x00c5, B:16:0x006a, B:14:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023c A[PHI: r6 r7
      0x023c: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:59:0x023a, B:55:0x021e, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:59:0x023a, B:55:0x021e, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026e A[PHI: r1 r8 r9 r20
      0x026e: PHI (r1v4 l.֨ᩳ᩷) = (r1v2 l.֨ᩳ᩷), (r1v2 l.֨ᩳ᩷), (r1v2 l.֨ᩳ᩷), (r1v2 l.֨ᩳ᩷), (r1v2 l.֨ᩳ᩷), (r1v6 l.֨ᩳ᩷) binds: [B:63:0x026c, B:51:0x01fd, B:14:0x0066, B:11:0x005d, B:8:0x0054, B:70:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:63:0x026c, B:51:0x01fd, B:14:0x0066, B:11:0x005d, B:8:0x0054, B:70:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:63:0x026c, B:51:0x01fd, B:14:0x0066, B:11:0x005d, B:8:0x0054, B:70:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r20v6 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x026c, B:51:0x01fd, B:14:0x0066, B:11:0x005d, B:8:0x0054, B:70:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m17580(ViewOnClickListenerC7621 viewOnClickListenerC7621) {
        int iM55680;
        int i;
        int i2;
        int i3 = C1964.f83032;
        int i4 = C0949.f81897;
        int iM55979 = (C0946.m55979("ۡᩴ") + i4) * (-67);
        int i5 = ((iM55979 ^ i3) * 14179) ^ 660433332;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-1275488100);
        ActivityC3597 activityC3597 = null;
        int i7 = 0;
        int iM559710 = 0;
        int i8 = 0;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -885325330;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 27647) >> 31));
            switch (i15) {
                case -2014664769:
                case 1764016811:
                    C0992.m56107();
                    C0854.m55595();
                    iM55680 = (C0946.m55979("֨᩸") ^ i3) * (-113);
                    i = ((iM55680 ^ i4) * 9621) ^ (-406058258);
                    i2 = -278206523;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1847718928:
                case 2050210363:
                    activityC3597 = viewOnClickListenerC7621.f19939;
                    C14976.m34316(activityC3597.f7315);
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0946.m55979("ܳ֫") + i4) * (-25);
                        i = ((iM55680 ^ i3) * 15167) ^ 1429129339;
                        i2 = 1100959885;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = (C0873.m55680("ۘ֡") ^ i4) * (-109);
                        i5 = ((iM55681 ^ i3) * 11535) ^ (-279748347);
                        i6 = iM55681 ^ (-1203969195);
                    }
                    break;
                case -1562966817:
                case -817667093:
                    s = sArr[c];
                    if (C1929.m56553()) {
                        iM55680 = C0946.m55979("᩷ᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-4005)) ^ (-732294504);
                        i2 = 739226337;
                    } else {
                        iM55680 = C0873.m55680("ᩳ۟") ^ i3;
                        i = ((iM55680 ^ i4) * (-7009)) ^ (-1791745195);
                        i2 = -633287155;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1487749752:
                case 1847391012:
                    iM559710 = C0946.m55979(C1017.m56189(sArr2, i13, i14, i12));
                    i8 = 2128490030;
                    if (C1124.m56367() >= 0) {
                        iM55680 = (C0946.m55979("֨᩸") ^ i3) * (-113);
                        i = ((iM55680 ^ i4) * 9621) ^ (-406058258);
                        i2 = -278206523;
                    } else {
                        iM55680 = C0946.m55979("ۤۡ") ^ i3;
                        i = ((iM55680 ^ i4) * (-18319)) ^ (-627169277);
                        i2 = 1718319077;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1377628503:
                case 354327519:
                    sArr = f82004;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0946.m55979("ܳ֫") + i4) * (-25);
                        i = ((iM55680 ^ i3) * 15167) ^ 1429129339;
                        i2 = 1100959885;
                    } else {
                        iM55680 = C0873.m55680("ۜۘ") ^ i3;
                        i = ((iM55680 ^ i4) * (-29767)) ^ (-576541946);
                        i2 = -465630309;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -984709353:
                case -281284464:
                    if (C0949.f81897 < 0) {
                        iM55680 = (C0946.m55979("ܳ֫") + i4) * (-25);
                        i = ((iM55680 ^ i3) * 15167) ^ 1429129339;
                        i2 = 1100959885;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩸᩹")) * 41;
                        i = ((iM55680 ^ i3) * 13895) ^ (-2082618489);
                        i2 = 811652516;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -857646503:
                case 52512894:
                    int i16 = s + s2;
                    if (i11 - (i16 * i16) < 0) {
                        iM55680 = (C0946.m55979("᩷ۡ") ^ i3) * 69;
                        i = ((iM55680 ^ i4) * 19813) ^ 2127983488;
                        i2 = 1671106607;
                    } else {
                        iM55680 = C0873.m55680("᩸ܳ") ^ i4;
                        i = ((iM55680 ^ i3) * 22139) ^ (-1266922296);
                        i2 = -1488711872;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -838759832:
                case 853573487:
                    activityC3597.f7316 = null;
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0946.m55979("֨᩸") ^ i3) * (-113);
                        i = ((iM55680 ^ i4) * 9621) ^ (-406058258);
                        i2 = -278206523;
                    } else {
                        iM55680 = (C0946.m55979("ۤۨ") + i3) * (-97);
                        i = ((iM55680 ^ i4) * (-14707)) ^ (-781736869);
                        i2 = -356788363;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -787845217:
                case 2115090653:
                    i12 = 38647;
                    iM55680 = (C0946.m55979("֡ۡ") ^ i4) * (-75);
                    i = ((iM55680 ^ i3) * (-25713)) ^ 337426808;
                    i2 = -1033686130;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -774056444:
                case 1020329139:
                    c = 24;
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0946.m55979("᩷ᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-4005)) ^ (-732294504);
                        i2 = 739226337;
                    } else {
                        iM55680 = (i4 - C0946.m55979("֡ܿ")) * (-113);
                        i = ((iM55680 ^ i3) * (-18267)) ^ 1802202355;
                        i2 = -564183053;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -696361212:
                case 2115830412:
                    sArr2 = f82004;
                    i13 = 25;
                    i14 = 3;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("۟۫") ^ i3) * (-71);
                        i = ((iM55680 ^ i4) * 417) ^ 2058040086;
                        i2 = -930924608;
                    } else {
                        iM55680 = (i4 - C0946.m55979("֫ᩴ")) * (-51);
                        i = ((iM55680 ^ i3) * 24637) ^ (-1146714178);
                        i2 = -571037251;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -420770142:
                case 1453273429:
                    i12 = 9257;
                    iM55680 = (C0946.m55979("֡ۡ") ^ i4) * (-75);
                    i = ((iM55680 ^ i3) * (-25713)) ^ 337426808;
                    i2 = -1033686130;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -387098836:
                case -30138551:
                    C1194.m56396();
                    if (C0917.f81868) {
                        iM55680 = (C0946.m55979("ܳ֫") + i4) * (-25);
                        i = ((iM55680 ^ i3) * 15167) ^ 1429129339;
                        i2 = 1100959885;
                    } else {
                        iM55680 = C0946.m55979("᩷ᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-4005)) ^ (-732294504);
                        i2 = 739226337;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -274664926:
                case 1889700064:
                    i9 = s * s;
                    i10 = 255488256;
                    if (C1048.f81963) {
                        iM55680 = (C0946.m55979("ۛۚ") + i4) * (-11);
                        i = ((iM55680 ^ i3) * 28335) ^ 229015951;
                        i2 = -1935450956;
                    } else {
                        iM55680 = (C0946.m55979("ܳ֫") + i4) * (-25);
                        i = ((iM55680 ^ i3) * 15167) ^ 1429129339;
                        i2 = 1100959885;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -223280576:
                case 1401466235:
                    i7 = iM559710 ^ i8;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i4 - C0873.m55680("᩸᩹")) * 41;
                        i = ((iM55680 ^ i3) * 13895) ^ (-2082618489);
                        i2 = 811652516;
                    } else {
                        iM55680 = (C0873.m55680("᩻ܶ") ^ i4) * (-37);
                        i = ((iM55680 ^ i3) * 8807) ^ (-1862352088);
                        i2 = -1946337185;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 415061324:
                case 492881776:
                    C0917.m55842(i7);
                    C0906.m55813(activityC3597.f7314);
                    viewOnClickListenerC7621.m17579();
                    break;
                case 435157726:
                case 1963183269:
                    C0866.m55645();
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("֨᩸") ^ i3) * (-113);
                        i = ((iM55680 ^ i4) * 9621) ^ (-406058258);
                        i2 = -278206523;
                    } else {
                        iM55680 = (C0946.m55979("ܳ֫") + i4) * (-25);
                        i = ((iM55680 ^ i3) * 15167) ^ 1429129339;
                        i2 = 1100959885;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 631099901:
                case 1162794308:
                    int i17 = i9 + i10;
                    i11 = i17 + i17;
                    s2 = 15984;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("֨᩸") ^ i3) * (-113);
                        i = ((iM55680 ^ i4) * 9621) ^ (-406058258);
                        i2 = -278206523;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩷") ^ i3;
                        i = ((iM55680 ^ i4) * 11291) ^ (-340926613);
                        i2 = -117263653;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1194.m56396();
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public ViewOnClickListenerC7621(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Code duplicated, block: B:58:0x0289 A[PHI: r2 r3 r18 r19 r20
      0x0289: PHI (r2v48 l.֨ᩳ᩷) = (r2v2 l.֨ᩳ᩷), (r2v2 l.֨ᩳ᩷), (r2v40 l.֨ᩳ᩷), (r2v2 l.֨ᩳ᩷), (r2v2 l.֨ᩳ᩷) binds: [B:84:0x0289, B:82:0x0289, B:57:0x0287, B:30:0x0120, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r3v6 l.᩵ۚۢ) = (r3v2 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ), (r3v3 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ) binds: [B:84:0x0289, B:82:0x0289, B:57:0x0287, B:30:0x0120, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r18v16 int) = (r18v2 int), (r18v2 int), (r18v8 int), (r18v2 int), (r18v2 int) binds: [B:84:0x0289, B:82:0x0289, B:57:0x0287, B:30:0x0120, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r19v19 int) = (r19v2 int), (r19v2 int), (r19v14 int), (r19v2 int), (r19v2 int) binds: [B:84:0x0289, B:82:0x0289, B:57:0x0287, B:30:0x0120, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r20v24 short[]) = (r20v2 short[]), (r20v2 short[]), (r20v18 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:84:0x0289, B:82:0x0289, B:57:0x0287, B:30:0x0120, B:16:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    private void m17579() {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int i5;
        int i6;
        short[] sArr;
        int iM55680;
        int i7;
        int i8 = C0877.f81843;
        int i9 = C1025.f81947;
        int iM55681 = (C0873.m55680("֨۟") + i8) * 5;
        int i10 = ((iM55681 ^ i9) * 32611) ^ 327700480;
        DialogInterface.OnClickListener onClickListener = null;
        String strM55726 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM55681 ^ (-874239747);
        int i12 = 0;
        int iM559711 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int iM559712 = 0;
        int i19 = -276182406;
        int i20 = 0;
        Object[] objArr = null;
        StringBuilder sb = null;
        C20671 c20671M55654 = null;
        ActivityC3597 activityC3597 = null;
        while (true) {
            i19 = i11 ^ (i10 & (((i19 ^ i9) * (-23251)) >> 31));
            switch (i19) {
                case -1881820857:
                case 1986079144:
                    activityC3597 = activityC3597;
                    i6 = i17;
                    i18 = i18;
                    sArr = sArr2;
                    iM559712 = C0946.m55979(C0861.m55618(sArr, i6, i18, i14));
                    i20 = 2099026340;
                    if (C1124.f82007 < 0) {
                        sArr2 = sArr;
                        iM559710 = C0873.m55680("ۧܰ") ^ i9;
                        i17 = i6;
                        i3 = ((iM559710 ^ i8) * (-21759)) ^ (-1927661020);
                        i4 = -48589322;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i18 = i18;
                        ActivityC3597 activityC3598 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC3598;
                    } else {
                        int iM559713 = C0946.m55979("ܺ۬") ^ i8;
                        short[] sArr5 = sArr;
                        i10 = ((iM559713 ^ i9) * 7109) ^ 808960343;
                        int i21 = iM559713 ^ 857337145;
                        sArr2 = sArr5;
                        i18 = i18;
                        i17 = i6;
                        activityC3597 = activityC3597;
                        i11 = i21;
                    }
                    break;
                case -1859610006:
                case -870293405:
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩵ᩳ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            int i23 = 8614211;
                            int i24 = C0949.f81897;
                            int i25 = C1025.f81947;
                            int iM559714 = (i25 - C0946.m55979("֡ۢ")) * 15;
                            int i26 = ((iM559714 ^ i24) * 11337) ^ 1445153558;
                            int i27 = 575923290;
                            while (true) {
                                i23 = ((((i23 ^ i24) * 9761) >> 31) & i26) ^ (iM559714 ^ i27);
                                switch (i23) {
                                    case -1983493965:
                                    case -380371987:
                                        ViewOnClickListenerC7621.m17577(this.f66003);
                                        break;
                                    case -1950961919:
                                    case -1786636270:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM559714 = (i25 - C0873.m55680("᩸ᩴ")) * 13;
                                            i26 = ((iM559714 ^ i24) * (-2747)) ^ 1312004077;
                                            i27 = -1953354874;
                                        } else {
                                            iM559714 = (i24 - C0946.m55979("ۛᩴ")) * (-107);
                                            i26 = ((iM559714 ^ i25) * (-28949)) ^ 158692621;
                                            i27 = 188648454;
                                        }
                                        break;
                                    case -1834771415:
                                    case -1625265124:
                                        if (C0946.f81894 != 0) {
                                            iM559714 = C0873.m55680("ܶۗ") ^ i24;
                                            i26 = ((iM559714 ^ i25) * (-5335)) ^ (-391345974);
                                            i27 = -450527484;
                                        } else {
                                            iM559714 = C0873.m55680("ܶ᩷") ^ i24;
                                            i26 = ((iM559714 ^ i25) * 27859) ^ 1875756647;
                                            i27 = -238150361;
                                        }
                                        break;
                                    case -1715713519:
                                    case -517210693:
                                        C0898.m55800();
                                        iM559714 = (C0946.m55979("᩻ۨ") + i24) * 11;
                                        i26 = ((iM559714 ^ i25) * (-21731)) ^ (-1090565654);
                                        i27 = -628963654;
                                        break;
                                    case -1613099152:
                                    case 1940129663:
                                        if (C1929.f83011 != 0) {
                                            iM559714 = C0873.m55680("ܶۗ") ^ i24;
                                            i26 = ((iM559714 ^ i25) * (-5335)) ^ (-391345974);
                                            i27 = -450527484;
                                        } else {
                                            iM559714 = C0946.m55979("ۗܶ") ^ i25;
                                            i26 = ((iM559714 ^ i24) * (-7829)) ^ (-280936979);
                                            i27 = 184347781;
                                        }
                                        break;
                                    case -898063922:
                                    case 571064887:
                                        if (C0877.f81843 >= 0) {
                                            iM559714 = (i25 - C0873.m55680("۬֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i26 = ((iM559714 ^ i24) * 27889) ^ (-2084316551);
                                            i27 = -1758318823;
                                        } else {
                                            iM559714 = (C0873.m55680("ۛܺ") ^ i25) * 27;
                                            i26 = ((iM559714 ^ i24) * 24401) ^ 997581493;
                                            i27 = 1486641807;
                                        }
                                        break;
                                    case -896702978:
                                    case 1137955335:
                                        if (C1044.f81959 >= 0) {
                                            iM559714 = (C0946.m55979("᩻ۨ") + i24) * 11;
                                            i26 = ((iM559714 ^ i25) * (-21731)) ^ (-1090565654);
                                            i27 = -628963654;
                                        } else {
                                            iM559714 = C0946.m55979("ᩴۧ") ^ i24;
                                            i26 = ((iM559714 ^ i25) * 21837) ^ 1402650537;
                                            i27 = 712893291;
                                        }
                                        break;
                                    case -731365306:
                                    case -25430441:
                                        if (C0947.f81895) {
                                            iM559714 = C0873.m55680("ܶۗ") ^ i24;
                                            i26 = ((iM559714 ^ i25) * (-5335)) ^ (-391345974);
                                            i27 = -450527484;
                                        } else {
                                            iM559714 = (i24 - C0873.m55680("᩺᩸")) * (-111);
                                            i26 = ((iM559714 ^ i25) * 18859) ^ 2057241737;
                                            i27 = 767257733;
                                        }
                                        break;
                                    case -503181333:
                                    case -360580025:
                                        if (C0866.f81837 < 0) {
                                            iM559714 = (i25 - C0873.m55680("۬֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i26 = ((iM559714 ^ i24) * 27889) ^ (-2084316551);
                                            i27 = -1758318823;
                                        } else {
                                            iM559714 = (C0946.m55979("᩻ۨ") + i24) * 11;
                                            i26 = ((iM559714 ^ i25) * (-21731)) ^ (-1090565654);
                                            i27 = -628963654;
                                        }
                                        break;
                                    case -385178920:
                                    case -356103207:
                                        if (C0863.m55643()) {
                                            iM559714 = C0946.m55979("᩵ᩴ") ^ i25;
                                            i26 = ((iM559714 ^ i24) * (-18117)) ^ 1313787727;
                                            i27 = 2133991539;
                                        } else {
                                            iM559714 = (i25 - C0873.m55680("᩸ᩴ")) * 13;
                                            i26 = ((iM559714 ^ i24) * (-2747)) ^ 1312004077;
                                            i27 = -1953354874;
                                        }
                                        break;
                                    case -215460418:
                                    case 156342735:
                                        if (C1044.m56286() <= 0) {
                                            iM559714 = (C0873.m55680("ܽۖ") + i24) * 95;
                                            i26 = ((iM559714 ^ i25) * 18275) ^ 550140456;
                                            i27 = 1307716614;
                                        } else {
                                            iM559714 = C0873.m55680("᩸᩵") ^ i24;
                                            i26 = ((iM559714 ^ i25) * 19) ^ 1700451331;
                                            i27 = 811556867;
                                        }
                                        break;
                                    case -140504653:
                                    case 1014175043:
                                        C1048.m56305();
                                        if (!C0955.f81898) {
                                            iM559714 = (i25 - C0873.m55680("᩸ᩴ")) * 13;
                                            i26 = ((iM559714 ^ i24) * (-2747)) ^ 1312004077;
                                            i27 = -1953354874;
                                        } else {
                                            iM559714 = (C0873.m55680("ܽۖ") + i24) * 95;
                                            i26 = ((iM559714 ^ i25) * 18275) ^ 550140456;
                                            i27 = 1307716614;
                                        }
                                        break;
                                    case 681077504:
                                    case 2050367001:
                                        if (C1017.f81942 >= 0) {
                                            iM559714 = C0873.m55680("ܶۗ") ^ i24;
                                            i26 = ((iM559714 ^ i25) * (-5335)) ^ (-391345974);
                                            i27 = -450527484;
                                        } else {
                                            iM559714 = C0946.m55979("ܺ۫") ^ i25;
                                            i26 = ((iM559714 ^ i24) * (-27793)) ^ 1954513961;
                                            i27 = -2027741085;
                                        }
                                        break;
                                    case 962210838:
                                    case 1452594940:
                                        C0967.m56074();
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559714 = (i25 - C0873.m55680("᩸ᩴ")) * 13;
                                            i26 = ((iM559714 ^ i24) * (-2747)) ^ 1312004077;
                                            i27 = -1953354874;
                                        } else {
                                            iM559714 = (C0946.m55979("᩻ۨ") + i24) * 11;
                                            i26 = ((iM559714 ^ i25) * (-21731)) ^ (-1090565654);
                                            i27 = -628963654;
                                        }
                                        break;
                                    case 1264508506:
                                    case 1908037742:
                                        if (C1194.m56396() <= 0) {
                                            iM559714 = (C0946.m55979("᩻ۨ") + i24) * 11;
                                            i26 = ((iM559714 ^ i25) * (-21731)) ^ (-1090565654);
                                            i27 = -628963654;
                                        } else {
                                            iM559714 = C0873.m55680("ܺ᩻") ^ i25;
                                            i26 = ((iM559714 ^ i24) * 8275) ^ (-1732699385);
                                            i27 = -1219171989;
                                        }
                                        break;
                                    default:
                                        C0906.m55809();
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    strM55726 = C0890.m55726(f82004, 18, 3, i14);
                    if (!C1024.f81946) {
                        iM55979 = C0873.m55680("۠ۘ") ^ i9;
                        i = ((iM55979 ^ i8) * 11023) ^ 447913508;
                        i2 = -1251778421;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC3597 = activityC3597;
                        i18 = i18;
                        sArr2 = sArr2;
                        iM559710 = C0946.m55979("᩶֫") ^ i8;
                        i3 = ((iM559710 ^ i9) * 25147) ^ 790993458;
                        i4 = -1901130752;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i18 = i18;
                        ActivityC3597 activityC3599 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC3599;
                    }
                    break;
                case -1829782334:
                case 1105492638:
                    C0906.m55817(c20671M55654, C0946.m55979(strM55726) ^ 2130153596, onClickListener);
                    sArr4 = f82004;
                    i15 = 21;
                    i12 = 3;
                    if (C1028.f81950 > 0) {
                        iM55979 = (C0873.m55680("ۜܿ") ^ i8) * 13;
                        i = ((iM55979 ^ i9) * (-23165)) ^ 231038626;
                        i2 = -12877601;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC3597 = activityC3597;
                        i6 = i17;
                        i18 = i18;
                        sArr = sArr2;
                        int iM559714 = C0946.m55979("ܺ۬") ^ i8;
                        short[] sArr6 = sArr;
                        i10 = ((iM559714 ^ i9) * 7109) ^ 808960343;
                        int i22 = iM559714 ^ 857337145;
                        sArr2 = sArr6;
                        i18 = i18;
                        i17 = i6;
                        activityC3597 = activityC3597;
                        i11 = i22;
                    }
                    break;
                case -1811526961:
                case 161319218:
                    activityC3597 = activityC3597;
                    C1012.m56146(c20671M55654, iM559712 ^ i20);
                    sb = new StringBuilder();
                    C1003.m56121(sb, this.f19941.m46298());
                    if (!C0882.f81846) {
                        iM55680 = C0873.m55680("ᩴ۟") ^ i8;
                        i3 = ((iM55680 ^ i9) * 12375) ^ 1478267995;
                        i7 = -304569638;
                        i5 = iM55680 ^ i7;
                        ActivityC3597 activityC35910 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC35910;
                    } else {
                        i6 = i17;
                        i18 = i18;
                        sArr = sArr2;
                        int iM559715 = C0946.m55979("ܺ۬") ^ i8;
                        short[] sArr7 = sArr;
                        i10 = ((iM559715 ^ i9) * 7109) ^ 808960343;
                        int i23 = iM559715 ^ 857337145;
                        sArr2 = sArr7;
                        i18 = i18;
                        i17 = i6;
                        activityC3597 = activityC3597;
                        i11 = i23;
                    }
                    break;
                case -1774588057:
                case -566416280:
                    C0912.m55825(sb, this.f19941.m46280());
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = C0946.m55979("ܽۡ") ^ i9;
                        i = ((iM55979 ^ i8) * 20323) ^ (-2127397013);
                        i2 = 1777189618;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC3597 = activityC3597;
                        i18 = i18;
                        sArr2 = sArr2;
                        iM559710 = C0946.m55979("᩶֫") ^ i8;
                        i3 = ((iM559710 ^ i9) * 25147) ^ 790993458;
                        i4 = -1901130752;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i18 = i18;
                        ActivityC3597 activityC35911 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC35911;
                    }
                    break;
                case -1653939109:
                case 1517526700:
                    objArr = new Object[]{C0863.m55639(sb)};
                    sArr3 = f82004;
                    if (C1003.f81929 > 0) {
                        iM55979 = C0946.m55979("֡ۛ") ^ i8;
                        i = ((iM55979 ^ i9) * 549) ^ 1872454773;
                        i2 = -1804849602;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC3597 = activityC3597;
                        i6 = i17;
                        i18 = i18;
                        sArr = sArr2;
                        int iM559716 = C0946.m55979("ܺ۬") ^ i8;
                        short[] sArr8 = sArr;
                        i10 = ((iM559716 ^ i9) * 7109) ^ 808960343;
                        int i24 = iM559716 ^ 857337145;
                        sArr2 = sArr8;
                        i18 = i18;
                        i17 = i6;
                        activityC3597 = activityC3597;
                        i11 = i24;
                    }
                    break;
                case -1308295351:
                case 19365044:
                    C1017.m56182(c20671M55654, ServiceConnectionC1013.m56159(activityC3597, iM559711 ^ i13, objArr));
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0873.m55680("ᩳܳ") + i9) * 65;
                        i = ((iM55979 ^ i8) * (-23049)) ^ 1727630394;
                        i2 = -69282332;
                    } else {
                        iM55979 = C0873.m55680("᩸ܶ") ^ i8;
                        i = ((iM55979 ^ i9) * 8203) ^ (-1614505645);
                        i2 = 526695369;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1118432810:
                case 401078283:
                    if (C0992.f81922 < 0) {
                        iM55979 = (C0946.m55979("᩺ۘ") ^ i9) * (-73);
                        i = ((iM55979 ^ i8) * (-11553)) ^ (-466993138);
                        i2 = 1885300361;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC3597 = activityC3597;
                        i18 = i18;
                        sArr2 = sArr2;
                        iM559710 = C0946.m55979("᩶֫") ^ i8;
                        i3 = ((iM559710 ^ i9) * 25147) ^ 790993458;
                        i4 = -1901130752;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i18 = i18;
                        ActivityC3597 activityC35912 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC35912;
                    }
                    break;
                case -986228423:
                case -145530054:
                    C1124.m56374(c20671M55654, C0873.m55680(C0930.m55893(sArr4, i15, i12, i14)) ^ 2102783434, null);
                    C1025.m56221(c20671M55654);
                    break;
                case -966184854:
                case 910947260:
                    if (RunnableC0871.m55672() < 0) {
                        activityC3597 = activityC3597;
                        i18 = i18;
                        sArr2 = sArr2;
                        iM559710 = C0946.m55979("᩶֫") ^ i8;
                        i3 = ((iM559710 ^ i9) * 25147) ^ 790993458;
                        i4 = -1901130752;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i18 = i18;
                        ActivityC3597 activityC35913 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC35913;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܳ") + i9) * 65;
                        i = ((iM55979 ^ i8) * (-23049)) ^ 1727630394;
                        i2 = -69282332;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
                case -822704550:
                case 1670677036:
                    activityC3597 = activityC3597;
                    C1003.m56121(sb, C0947.m55993(f82004, 14, 1, i14));
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0873.m55680("ܺ᩺") ^ i8) * (-123);
                        i3 = ((iM55680 ^ i9) * (-19489)) ^ (-301999505);
                        i7 = 1324116350;
                    } else {
                        iM55680 = C0946.m55979("᩶᩹") ^ i9;
                        i3 = ((iM55680 ^ i8) * 20007) ^ (-193099830);
                        i7 = 716809030;
                    }
                    i5 = iM55680 ^ i7;
                    ActivityC3597 activityC35914 = activityC3597;
                    i11 = i5;
                    i10 = i3;
                    activityC3597 = activityC35914;
                    break;
                case -780960273:
                case -286847868:
                    C0947.m55997();
                    iM55979 = (C0873.m55680("ᩳܳ") + i9) * 65;
                    i = ((iM55979 ^ i8) * (-23049)) ^ 1727630394;
                    i2 = -69282332;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -680370070:
                case -137901582:
                    i14 = 56977;
                    iM559710 = C0873.m55680("۠ۜ") ^ i9;
                    i3 = ((iM559710 ^ i8) * (-17893)) ^ 803672252;
                    i4 = -92499822;
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i18 = i18;
                    ActivityC3597 activityC35915 = activityC3597;
                    i11 = i5;
                    i10 = i3;
                    activityC3597 = activityC35915;
                    break;
                case -325806679:
                case 929213091:
                    C0861.m55626();
                    C1964.m56597();
                    break;
                case -236877672:
                case 2117141205:
                    activityC3597 = activityC3597;
                    i18 = i18;
                    sArr2 = sArr2;
                    if ((38874 * s) - (i16 + 377796969) > 0) {
                        iM559710 = C0946.m55979("᩸ܰ") ^ i8;
                        i3 = ((iM559710 ^ i9) * 24413) ^ 1694407600;
                        i4 = 2039212119;
                    } else {
                        iM559710 = C0873.m55680("ۘۨ") ^ i8;
                        i3 = ((iM559710 ^ i9) * 19325) ^ (-1754742533);
                        i4 = -1936147195;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i18 = i18;
                    ActivityC3597 activityC35916 = activityC3597;
                    i11 = i5;
                    i10 = i3;
                    activityC3597 = activityC35916;
                    break;
                case 47676424:
                case 508932499:
                    i14 = 57188;
                    iM559710 = C0873.m55680("۠ۜ") ^ i9;
                    i3 = ((iM559710 ^ i8) * (-17893)) ^ 803672252;
                    i4 = -92499822;
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i18 = i18;
                    ActivityC3597 activityC35917 = activityC3597;
                    i11 = i5;
                    i10 = i3;
                    activityC3597 = activityC35917;
                    break;
                case 73378402:
                case 208353625:
                    activityC3597 = activityC3597;
                    i18 = i18;
                    sArr2 = sArr2;
                    s = f82004[10];
                    i16 = s * s;
                    if (C0892.f81851) {
                        iM559710 = (C0873.m55680("ܳۨ") ^ i9) * (-73);
                        i3 = ((iM559710 ^ i8) * 8449) ^ (-636092648);
                        i4 = 994351261;
                    } else {
                        iM559710 = C0946.m55979("᩶֫") ^ i8;
                        i3 = ((iM559710 ^ i9) * 25147) ^ 790993458;
                        i4 = -1901130752;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i18 = i18;
                    ActivityC3597 activityC35918 = activityC3597;
                    i11 = i5;
                    i10 = i3;
                    activityC3597 = activityC35918;
                    break;
                case 251366019:
                case 1644700539:
                    activityC3597 = this.f19939;
                    c20671M55654 = C0866.m55654(activityC3597);
                    sArr2 = f82004;
                    i17 = 11;
                    i18 = 3;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("ᩳܳ") + i9) * 65;
                        i = ((iM55979 ^ i8) * (-23049)) ^ 1727630394;
                        i2 = -69282332;
                    } else {
                        iM55979 = (C0946.m55979("᩶ۡ") + i8) * (-77);
                        i = ((iM55979 ^ i9) * 23167) ^ (-227214556);
                        i2 = 1197306096;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case 438534521:
                case 980268958:
                    iM559711 = C0946.m55979(C0898.m55792(sArr3, 15, 3, i14));
                    i13 = 2124240389;
                    iM55979 = C0873.m55680("ܶۢ") ^ i9;
                    i = ((iM55979 ^ i8) * (-17219)) ^ (-967077935);
                    i2 = 1183045832;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                default:
                    if (C1053.f81965 > 0) {
                        activityC3597 = activityC3597;
                        iM55680 = (C0873.m55680("ܺ᩺") ^ i8) * (-123);
                        i3 = ((iM55680 ^ i9) * (-19489)) ^ (-301999505);
                        i7 = 1324116350;
                        i5 = iM55680 ^ i7;
                        ActivityC3597 activityC35919 = activityC3597;
                        i11 = i5;
                        i10 = i3;
                        activityC3597 = activityC35919;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܳ") + i9) * 65;
                        i = ((iM55979 ^ i8) * (-23049)) ^ 1727630394;
                        i2 = -69282332;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0232 A[PHI: r5 r10 r11 r14
      0x0232: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:111:0x0232, B:58:0x0230, B:27:0x00da, B:23:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:111:0x0232, B:58:0x0230, B:27:0x00da, B:23:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:111:0x0232, B:58:0x0230, B:27:0x00da, B:23:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:111:0x0232, B:58:0x0230, B:27:0x00da, B:23:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x025d A[PHI: r2
      0x025d: PHI (r2v3 l.֨ᩳ᩷) = (r2v2 l.֨ᩳ᩷), (r2v5 l.֨ᩳ᩷) binds: [B:51:0x01fb, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (p067l.C0890.f81849 != 0) goto L77;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int iM55979;
        int i;
        int i2;
        short s;
        short[] sArr;
        int iM559710;
        int i3;
        int i4;
        int iM55680;
        int i5;
        int iM55681;
        int i6;
        final ViewOnClickListenerC7621 viewOnClickListenerC7621 = this;
        int i7 = 1598792549;
        int i8 = C0949.f81897;
        int i9 = C0877.f81843;
        int iM559711 = C0946.m55979("ۧۗ") ^ i9;
        int i10 = ((iM559711 ^ i8) * (-26465)) ^ 1781323022;
        int i11 = iM559711 ^ (-1124405744);
        String strM55717 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int iM559712 = 0;
        int iM55682 = 0;
        int i12 = 0;
        int iM559713 = 0;
        int iM55683 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        DialogInterface.OnClickListener onClickListener = null;
        C20671 c20671M55888 = null;
        ActivityC3597 activityC3597 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * 19429) >> 31));
            switch (i7) {
                case -2087945584:
                case 1994248158:
                    C1229.m56410();
                    iM55680 = (i9 - C0873.m55680("᩹ۗ")) * (-105);
                    i10 = ((iM55680 ^ i8) * (-20237)) ^ 130256433;
                    i5 = 1088418574;
                    i11 = iM55680 ^ i5;
                    viewOnClickListenerC7621 = this;
                    break;
                case -2008493240:
                case -779358892:
                    C1194.m56390(c20671M55888, iM55682 ^ i12);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۘᩳ᩷

                        /* JADX INFO: renamed from: ܶۛۗ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81961 = {5448, 9064, 12648, 15050, -16894, 15231, -15530, 10731, -15950, -14084, 9202, -13981, 15088, 15400};

                        /* JADX WARN: Code duplicated, block: B:37:0x0174 A[PHI: r5 r8 r9 r11 r15
                          0x0174: PHI (r5v5 int) = (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:36:0x0172, B:26:0x00df, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
                          0x0174: PHI (r8v4 java.lang.Object[]) = (r8v3 java.lang.Object[]), (r8v2 java.lang.Object[]), (r8v2 java.lang.Object[]) binds: [B:36:0x0172, B:26:0x00df, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
                          0x0174: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:36:0x0172, B:26:0x00df, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
                          0x0174: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:36:0x0172, B:26:0x00df, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
                          0x0174: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:36:0x0172, B:26:0x00df, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            int iM559714;
                            int i16;
                            int i17;
                            ActivityC3597 activityC3598;
                            int i18;
                            ActivityC3597 activityC3599;
                            short s4;
                            int iM55684;
                            int iM559715;
                            int i19;
                            int i20;
                            ViewOnClickListenerC7621 viewOnClickListenerC7622;
                            int i21;
                            int i22;
                            int iM55685;
                            int i23;
                            int iM55686;
                            int i24;
                            int i25 = 1907100283;
                            int i26 = C0930.f81879;
                            int i27 = C1046.f81962;
                            int iM55687 = C0873.m55680("᩺᩶") ^ i27;
                            int i28 = ((iM55687 ^ i26) * 1153) ^ 983518372;
                            int i29 = iM55687 ^ 313810837;
                            String strM41538 = null;
                            String strM56092 = null;
                            DialogInterface.OnClickListener onClickListener2 = null;
                            String strM55689 = null;
                            short[] sArr5 = null;
                            short[] sArr6 = null;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            int iM559716 = 0;
                            int i34 = 0;
                            short s5 = 0;
                            int i35 = 0;
                            StringBuilder sb = null;
                            String strM56285 = null;
                            C20671 c20671M55889 = null;
                            Object[] objArr = null;
                            ActivityC3597 activityC35910 = null;
                            String strM41522 = null;
                            final ViewOnClickListenerC7621 viewOnClickListenerC7623 = null;
                            while (true) {
                                i25 = i29 ^ (i28 & (((i25 ^ i26) * 1683) >> 31));
                                switch (i25) {
                                    case -2065082206:
                                    case 1449426834:
                                        ViewOnClickListenerC7621 viewOnClickListenerC7624 = viewOnClickListenerC7623;
                                        int i36 = i35;
                                        int i37 = i30 + 246961225;
                                        short s6 = s5;
                                        ActivityC3597 activityC35911 = activityC35910;
                                        int i38 = s6 + 15715;
                                        if ((i38 * i38) - (i37 + i37) <= 0) {
                                            iM559715 = C0946.m55979("ܽۛ") ^ i27;
                                            i19 = ((iM559715 ^ i26) * 1675) ^ (-377746192);
                                            i20 = 135388939;
                                        } else {
                                            iM559715 = (C0946.m55979("ܶۧ") ^ i26) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i19 = ((iM559715 ^ i27) * 26613) ^ 40408472;
                                            i20 = 1342383563;
                                        }
                                        int i39 = iM559715 ^ i20;
                                        i35 = i36;
                                        viewOnClickListenerC7622 = viewOnClickListenerC7624;
                                        i29 = i39;
                                        i28 = i19;
                                        activityC35910 = activityC35911;
                                        s5 = s6;
                                        viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        break;
                                    case -1961417142:
                                    case 1594431001:
                                        C1017.m56182(c20671M55889, strM56285);
                                        onClickListener2 = new DialogInterface.OnClickListener() { // from class: l.ᩴᩳ᩷
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface2, int i40) {
                                                int i41 = 1047631460;
                                                int i42 = C0967.f81910;
                                                int i43 = C1012.f81938;
                                                int iM55688 = C0873.m55680("ۖ᩹") ^ i43;
                                                int i44 = ((iM55688 ^ i42) * 25245) ^ (-1169903846);
                                                int i45 = 716348868;
                                                while (true) {
                                                    i41 = ((((i41 ^ i42) * 6341) >> 31) & i44) ^ (iM55688 ^ i45);
                                                    switch (i41) {
                                                        case -2127072398:
                                                        case 1056606884:
                                                            if (C1012.f81938 >= 0) {
                                                                iM55688 = C0946.m55979("ۤܽ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-11039)) ^ 1910984347;
                                                                i45 = 39208351;
                                                            } else {
                                                                iM55688 = (C0873.m55680("ᩳ۫") + i43) * 95;
                                                                i44 = ((iM55688 ^ i42) * 9309) ^ (-1528575848);
                                                                i45 = -1113901528;
                                                            }
                                                            break;
                                                        case -2012241827:
                                                        case -932351104:
                                                            if (C0927.f81875) {
                                                                iM55688 = C0946.m55979("ۤܽ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-11039)) ^ 1910984347;
                                                                i45 = 39208351;
                                                            } else {
                                                                iM55688 = C0946.m55979("ܳۛ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * 4551) ^ (-299642324);
                                                                i45 = 959768209;
                                                            }
                                                            break;
                                                        case -1906598872:
                                                        case 821287988:
                                                            if (C0989.m56095() <= 0) {
                                                                iM55688 = C0946.m55979("ۤܽ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-11039)) ^ 1910984347;
                                                                i45 = 39208351;
                                                            } else {
                                                                iM55688 = (i42 - C0873.m55680("֨ܺ")) * (-81);
                                                                i44 = ((iM55688 ^ i43) * (-28291)) ^ (-416077162);
                                                                i45 = -316547979;
                                                            }
                                                            break;
                                                        case -1868757297:
                                                        case 1227400041:
                                                            if (C1929.f83011 != 0) {
                                                                iM55688 = (i42 - C0873.m55680("ۢᩴ")) * (-27);
                                                                i44 = ((iM55688 ^ i43) * (-29851)) ^ 1393818127;
                                                                i45 = 609994145;
                                                            } else {
                                                                iM55688 = C0873.m55680("᩻ۢ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-31307)) ^ (-759146606);
                                                                i45 = 2089028585;
                                                            }
                                                            break;
                                                        case -1824202550:
                                                        case 973978157:
                                                            if (!C0861.m55626()) {
                                                                iM55688 = C0946.m55979("۠ܽ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * 6779) ^ 494092221;
                                                                i45 = 2144952914;
                                                            } else {
                                                                iM55688 = C0946.m55979("ۤܽ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-11039)) ^ 1910984347;
                                                                i45 = 39208351;
                                                            }
                                                            break;
                                                        case -1616500593:
                                                        case 666901910:
                                                            if (C0877.f81843 >= 0) {
                                                                iM55688 = C0946.m55979("᩹ۘ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * 1819) ^ (-214660333);
                                                                i45 = -1328235548;
                                                            } else {
                                                                iM55688 = (i42 - C0946.m55979("֨֡")) * 41;
                                                                i44 = ((iM55688 ^ i43) * (-10315)) ^ 1079665711;
                                                                i45 = 1330093121;
                                                            }
                                                            break;
                                                        case -1220361618:
                                                        case 232794352:
                                                            ServiceConnectionC1013.m56157();
                                                            C1229.m56410();
                                                            iM55688 = C0946.m55979("۠ܽ") ^ i42;
                                                            i44 = ((iM55688 ^ i43) * 6779) ^ 494092221;
                                                            i45 = 2144952914;
                                                            break;
                                                        case -1097053238:
                                                        case 1549738239:
                                                            if (C0863.f81833 <= 0) {
                                                                iM55688 = (i42 - C0873.m55680("ۢᩴ")) * (-27);
                                                                i44 = ((iM55688 ^ i43) * (-29851)) ^ 1393818127;
                                                                i45 = 609994145;
                                                            } else {
                                                                iM55688 = C0873.m55680("᩶ܰ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * (-22747)) ^ (-551816468);
                                                                i45 = -2109668657;
                                                            }
                                                            break;
                                                        case -1082860854:
                                                        case 302024146:
                                                            if (C0992.f81922 >= 0) {
                                                                iM55688 = C0946.m55979("ۨ᩷") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-19005)) ^ (-1168462850);
                                                                i45 = -1894182518;
                                                            } else {
                                                                iM55688 = C0946.m55979("᩹ۙ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-1949)) ^ (-498029911);
                                                                i45 = 1025032437;
                                                            }
                                                            break;
                                                        case -913085690:
                                                        case 430395299:
                                                            ViewOnClickListenerC7621.m17580(viewOnClickListenerC7623);
                                                            break;
                                                        case -273606851:
                                                        case -193104293:
                                                            C0930.m55885();
                                                            break;
                                                        case 111499171:
                                                        case 1010286059:
                                                            if (C0863.f81833 <= 0) {
                                                                iM55688 = C0946.m55979("ۤܽ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-11039)) ^ 1910984347;
                                                                i45 = 39208351;
                                                            } else {
                                                                iM55688 = C0946.m55979("ܳܶ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-5527)) ^ 1854682242;
                                                                i45 = -380920396;
                                                            }
                                                            break;
                                                        case 166130145:
                                                        case 1282421203:
                                                            if (C0992.m56107() <= 0) {
                                                                iM55688 = C0946.m55979("᩹ۘ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * 1819) ^ (-214660333);
                                                                i45 = -1328235548;
                                                            } else {
                                                                iM55688 = (C0873.m55680("ܳ᩷") + i42) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                                i44 = ((iM55688 ^ i43) * 24587) ^ 312641686;
                                                                i45 = -698251145;
                                                            }
                                                            break;
                                                        case 382133326:
                                                        case 1642328043:
                                                            if (AbstractC0942.f81890 <= 0) {
                                                                iM55688 = C0946.m55979("᩹ۘ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * 1819) ^ (-214660333);
                                                                i45 = -1328235548;
                                                            } else {
                                                                iM55688 = C0946.m55979("ۨ᩷") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-19005)) ^ (-1168462850);
                                                                i45 = -1894182518;
                                                            }
                                                            break;
                                                        case 997411023:
                                                        case 1322061453:
                                                            C0930.m55885();
                                                            if (C0946.f81894 != 0) {
                                                                iM55688 = C0946.m55979("ۨ᩷") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-19005)) ^ (-1168462850);
                                                                i45 = -1894182518;
                                                            } else {
                                                                iM55688 = C0946.m55979("ۤܽ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * (-11039)) ^ 1910984347;
                                                                i45 = 39208351;
                                                            }
                                                            break;
                                                        default:
                                                            if (C1071.m56343() != 0) {
                                                                iM55688 = C0946.m55979("۠ܽ") ^ i42;
                                                                i44 = ((iM55688 ^ i43) * 6779) ^ 494092221;
                                                                i45 = 2144952914;
                                                            } else {
                                                                iM55688 = C0873.m55680("ۖۧ") ^ i43;
                                                                i44 = ((iM55688 ^ i42) * 27333) ^ (-2081968649);
                                                                i45 = -1947333795;
                                                            }
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        };
                                        strM55689 = C0873.m55689(f81961, 8, 3, i34);
                                        if (C0845.f81821 < 0) {
                                            iM559714 = (C0873.m55680("۠ۤ") + i27) * 77;
                                            i16 = ((iM559714 ^ i26) * (-26601)) ^ 67112092;
                                            i17 = -1460267966;
                                            i29 = iM559714 ^ i17;
                                            i28 = i16;
                                        } else {
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            iM55685 = C0946.m55979("ۢᩴ") ^ i26;
                                            i21 = ((iM55685 ^ i27) * 19423) ^ 550233031;
                                            i23 = -2070082015;
                                            i22 = iM55685 ^ i23;
                                            viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                            i29 = i22;
                                            i28 = i21;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        }
                                        break;
                                    case -1866482886:
                                    case -907461659:
                                        iM559716 = C0946.m55979(C1048.m56318(f81961, 5, 3, i34));
                                        iM559714 = C0873.m55680("᩸ۤ") ^ i26;
                                        i16 = ((iM559714 ^ i27) * 8203) ^ (-899273173);
                                        i17 = -1890040721;
                                        i29 = iM559714 ^ i17;
                                        i28 = i16;
                                        break;
                                    case -1647462337:
                                    case 308296316:
                                        C1124.m56374(c20671M55889, C0873.m55680(C0877.m55707(sArr6, i33, i32, i34)) ^ 2126660391, null);
                                        C1025.m56221(c20671M55889);
                                        break;
                                    case -1583341208:
                                    case -77870520:
                                        viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                        C0861.m55627(c20671M55889, i31 ^ 2104646355);
                                        sb = new StringBuilder();
                                        strM41538 = activityC35910.f7316.m41538();
                                        if (C0877.f81843 >= 0) {
                                            iM55685 = C0946.m55979("ۢᩴ") ^ i26;
                                            i21 = ((iM55685 ^ i27) * 19423) ^ 550233031;
                                            i23 = -2070082015;
                                        } else {
                                            iM55685 = (C0873.m55680("ۚܿ") ^ i27) * (-93);
                                            i21 = ((iM55685 ^ i26) * (-17897)) ^ (-1274544005);
                                            i23 = 364614194;
                                        }
                                        i22 = iM55685 ^ i23;
                                        viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                        i29 = i22;
                                        i28 = i21;
                                        viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        break;
                                    case -1475173337:
                                    case 1591255698:
                                        i34 = 48674;
                                        int iM559717 = C0946.m55979("ۛۤ") ^ i27;
                                        sArr5 = sArr5;
                                        i21 = ((iM559717 ^ i26) * 26877) ^ 563774946;
                                        i22 = iM559717 ^ 2050741703;
                                        i35 = i35;
                                        viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                        i29 = i22;
                                        i28 = i21;
                                        viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        break;
                                    case -1440710651:
                                    case 1707826399:
                                        ViewOnClickListenerC0939.m55941();
                                        iM55684 = i31;
                                        viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                        i18 = i35;
                                        short s7 = s5;
                                        activityC3598 = activityC35910;
                                        s4 = s7;
                                        int iM55688 = C0873.m55680("ܿ᩻") ^ i27;
                                        int i40 = iM55684;
                                        i28 = ((iM55688 ^ i26) * (-18487)) ^ 1232776663;
                                        i31 = i40;
                                        i30 = i30;
                                        viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                        i29 = iM55688 ^ 419253931;
                                        i35 = i18;
                                        activityC3599 = activityC3598;
                                        s5 = s4;
                                        activityC35910 = activityC3599;
                                        break;
                                    case -1307335379:
                                    case 690961422:
                                        C0906.m55817(c20671M55889, C0946.m55979(strM55689) ^ 2130696520, onClickListener2);
                                        sArr6 = f81961;
                                        i33 = 11;
                                        i32 = 3;
                                        if (C1003.f81929 <= 0) {
                                            iM559714 = (C0873.m55680("ܰۛ") ^ i27) * (-59);
                                            i16 = ((iM559714 ^ i26) * 27069) ^ 1251583293;
                                            i17 = 1133108402;
                                        } else {
                                            iM559714 = (C0946.m55979("᩹᩻") + i26) * (-17);
                                            i16 = ((iM559714 ^ i27) * (-26495)) ^ 688452876;
                                            i17 = 2029618519;
                                        }
                                        i29 = iM559714 ^ i17;
                                        i28 = i16;
                                        break;
                                    case -1153342063:
                                    case -1140431730:
                                        C1028.m56247();
                                        if (C1929.f83011 != 0) {
                                            iM559714 = C0946.m55979("ᩳܰ") ^ i26;
                                            i16 = ((iM559714 ^ i27) * (-6971)) ^ (-1155392981);
                                            i17 = -830172085;
                                            i29 = iM559714 ^ i17;
                                            i28 = i16;
                                        } else {
                                            iM55686 = (C0946.m55979("ܿۛ") + i27) * 63;
                                            i28 = ((iM55686 ^ i26) * (-18683)) ^ 1102243477;
                                            i24 = 1367886904;
                                            i29 = iM55686 ^ i24;
                                        }
                                        break;
                                    case -1073715493:
                                    case -924355392:
                                        String str = strM56092;
                                        C1003.m56121(sb, str);
                                        strM41522 = activityC35910.f7316.m41522();
                                        if (C0989.f81920 >= 0) {
                                            strM56092 = str;
                                            iM55686 = (C0946.m55979("ܿۛ") + i27) * 63;
                                            i28 = ((iM55686 ^ i26) * (-18683)) ^ 1102243477;
                                            i24 = 1367886904;
                                        } else {
                                            iM55686 = C0873.m55680("ۛۨ") ^ i27;
                                            strM56092 = str;
                                            i28 = ((iM55686 ^ i26) * (-1025)) ^ (-1611328312);
                                            i24 = -1791391109;
                                        }
                                        i29 = iM55686 ^ i24;
                                        break;
                                    case -1073316105:
                                    case -533016928:
                                        if (!C0967.m56074()) {
                                            iM55686 = (C0946.m55979("ܿۛ") + i27) * 63;
                                            i28 = ((iM55686 ^ i26) * (-18683)) ^ 1102243477;
                                            i24 = 1367886904;
                                            i29 = iM55686 ^ i24;
                                        } else {
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            iM55685 = C0946.m55979("ۢᩴ") ^ i26;
                                            i21 = ((iM55685 ^ i27) * 19423) ^ 550233031;
                                            i23 = -2070082015;
                                            i22 = iM55685 ^ i23;
                                            viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                            i29 = i22;
                                            i28 = i21;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        }
                                        break;
                                    case -1007629391:
                                    case -351326019:
                                        C1003.m56121(sb, strM41522);
                                        objArr = new Object[]{C0845.m55591(sb)};
                                        if (C1071.m56343() != 0) {
                                            iM559714 = (C0873.m55680("ܰۛ") ^ i27) * (-59);
                                            i16 = ((iM559714 ^ i26) * 27069) ^ 1251583293;
                                            i17 = 1133108402;
                                        } else {
                                            iM559714 = (C0873.m55680("᩵ܽ") ^ i26) * 123;
                                            i16 = ((iM559714 ^ i27) * (-17257)) ^ 1201172148;
                                            i17 = -1130581489;
                                        }
                                        i29 = iM559714 ^ i17;
                                        i28 = i16;
                                        break;
                                    case -736049953:
                                    case 1834545268:
                                        C0912.m55825(sb, strM41538);
                                        viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                        strM56092 = C0989.m56092(f81961, 4, 1, i34);
                                        if (!C0861.f81831) {
                                            iM55684 = i31;
                                            i18 = i35;
                                            short s8 = s5;
                                            activityC3598 = activityC35910;
                                            s4 = s8;
                                            int iM55689 = C0873.m55680("ܿ᩻") ^ i27;
                                            int i41 = iM55684;
                                            i28 = ((iM55689 ^ i26) * (-18487)) ^ 1232776663;
                                            i31 = i41;
                                            i30 = i30;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i29 = iM55689 ^ 419253931;
                                            i35 = i18;
                                            activityC3599 = activityC3598;
                                            s5 = s4;
                                            activityC35910 = activityC3599;
                                        } else {
                                            iM55685 = (i26 - C0873.m55680("֫ܿ")) * 89;
                                            i21 = ((iM55685 ^ i27) * (-5221)) ^ 197096620;
                                            i23 = -6875799;
                                            i22 = iM55685 ^ i23;
                                            viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                            i29 = i22;
                                            i28 = i21;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        }
                                        break;
                                    case -512283097:
                                    case 173951653:
                                        C1017.m56187();
                                        if (C0906.f81862 < 0) {
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            iM55685 = C0946.m55979("ۢᩴ") ^ i26;
                                            i21 = ((iM55685 ^ i27) * 19423) ^ 550233031;
                                            i23 = -2070082015;
                                            i22 = iM55685 ^ i23;
                                            viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                            i29 = i22;
                                            i28 = i21;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        } else {
                                            iM55684 = i31;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i18 = i35;
                                            short s9 = s5;
                                            activityC3598 = activityC35910;
                                            s4 = s9;
                                            int iM556810 = C0873.m55680("ܿ᩻") ^ i27;
                                            int i42 = iM55684;
                                            i28 = ((iM556810 ^ i26) * (-18487)) ^ 1232776663;
                                            i31 = i42;
                                            i30 = i30;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i29 = iM556810 ^ 419253931;
                                            i35 = i18;
                                            activityC3599 = activityC3598;
                                            s5 = s4;
                                            activityC35910 = activityC3599;
                                        }
                                        break;
                                    case -500389668:
                                    case 338617922:
                                        i34 = 26450;
                                        int iM559718 = C0946.m55979("ۛۤ") ^ i27;
                                        sArr5 = sArr5;
                                        i21 = ((iM559718 ^ i26) * 26877) ^ 563774946;
                                        i22 = iM559718 ^ 2050741703;
                                        i35 = i35;
                                        viewOnClickListenerC7622 = viewOnClickListenerC7623;
                                        i29 = i22;
                                        i28 = i21;
                                        viewOnClickListenerC7623 = viewOnClickListenerC7622;
                                        break;
                                    case -306030521:
                                    case 1149143566:
                                        viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                        activityC3598 = activityC35910;
                                        i18 = i35;
                                        short s10 = f81961[0];
                                        i30 = s10 * s10;
                                        if (C0854.f81826 != 0) {
                                            s4 = s10;
                                            iM55684 = i31;
                                            int iM556811 = C0873.m55680("ܿ᩻") ^ i27;
                                            int i43 = iM55684;
                                            i28 = ((iM556811 ^ i26) * (-18487)) ^ 1232776663;
                                            i31 = i43;
                                            i30 = i30;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i29 = iM556811 ^ 419253931;
                                            i35 = i18;
                                            activityC3599 = activityC3598;
                                            s5 = s4;
                                        } else {
                                            int iM556812 = (i26 - C0873.m55680("ܽۗ")) * 71;
                                            i28 = ((iM556812 ^ i27) * 29817) ^ 601591515;
                                            i35 = i18;
                                            activityC3599 = activityC3598;
                                            s5 = s10;
                                            i30 = i30;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i29 = iM556812 ^ 1924092550;
                                        }
                                        activityC35910 = activityC3599;
                                        break;
                                    case 754095113:
                                    case 984778419:
                                        viewOnClickListenerC7623 = this.f15883;
                                        activityC35910 = viewOnClickListenerC7623.f19939;
                                        c20671M55889 = C0930.m55888(activityC35910);
                                        sArr5 = f81961;
                                        i35 = 1;
                                        if (ViewOnClickListenerC0939.m55941() < 0) {
                                            iM559714 = C0946.m55979("ܺܰ") ^ i26;
                                            i16 = ((iM559714 ^ i27) * (-20119)) ^ (-1142562967);
                                            i17 = 1231558419;
                                            i29 = iM559714 ^ i17;
                                            i28 = i16;
                                        } else {
                                            iM55686 = (C0946.m55979("ܿۛ") + i27) * 63;
                                            i28 = ((iM55686 ^ i26) * (-18683)) ^ 1102243477;
                                            i24 = 1367886904;
                                            i29 = iM55686 ^ i24;
                                        }
                                        break;
                                    case 1312042768:
                                    case 2041628082:
                                        C0937.m55918();
                                        break;
                                    case 1324061573:
                                    case 1742049747:
                                        viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                        short[] sArr7 = sArr5;
                                        i18 = i35;
                                        iM55684 = C0873.m55680(RunnableC0871.m55667(sArr7, i18, 3, i34));
                                        if (C0949.m56012()) {
                                            sArr5 = sArr7;
                                            short s11 = s5;
                                            activityC3598 = activityC35910;
                                            s4 = s11;
                                            int iM556813 = C0873.m55680("ܿ᩻") ^ i27;
                                            int i44 = iM55684;
                                            i28 = ((iM556813 ^ i26) * (-18487)) ^ 1232776663;
                                            i31 = i44;
                                            i30 = i30;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i29 = iM556813 ^ 419253931;
                                            i35 = i18;
                                            activityC3599 = activityC3598;
                                            s5 = s4;
                                            activityC35910 = activityC3599;
                                        } else {
                                            int iM556814 = (C0873.m55680("ܿۙ") + i27) * (-65);
                                            i31 = iM55684;
                                            i28 = ((iM556814 ^ i26) * (-27837)) ^ (-2075473573);
                                            int i45 = iM556814 ^ 231686103;
                                            i35 = i18;
                                            sArr5 = sArr7;
                                            viewOnClickListenerC7623 = viewOnClickListenerC7623;
                                            i29 = i45;
                                        }
                                        break;
                                    default:
                                        strM56285 = C1044.m56285(activityC35910, 2098618434 ^ iM559716, objArr);
                                        if (C1124.m56367() >= 0) {
                                            iM559714 = (C0873.m55680("ܰۛ") ^ i27) * (-59);
                                            i16 = ((iM559714 ^ i26) * 27069) ^ 1251583293;
                                            i17 = 1133108402;
                                        } else {
                                            iM559714 = C0873.m55680("۫۬") ^ i27;
                                            i16 = ((iM559714 ^ i26) * (-10953)) ^ (-1970007037);
                                            i17 = 163598815;
                                        }
                                        i29 = iM559714 ^ i17;
                                        i28 = i16;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("᩹ᩴ") ^ i9;
                        i = ((iM55979 ^ i8) * 20373) ^ 273346096;
                        i2 = -844936051;
                    } else {
                        iM55979 = C0946.m55979("ۙᩳ") ^ i8;
                        i = ((iM55979 ^ i9) * 16329) ^ 1260761471;
                        i2 = -1968312461;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1965034970:
                case 850733277:
                    s = s2;
                    sArr = f82004;
                    c = 28;
                    if (C0861.f81831) {
                        iM559710 = (C0946.m55979("᩹ۘ") ^ i9) * (-93);
                        sArr2 = sArr;
                        i3 = ((iM559710 ^ i8) * (-13457)) ^ (-2142857534);
                        i4 = 638470841;
                    } else {
                        iM559710 = (C0873.m55680("ܰ֫") ^ i8) * 69;
                        sArr2 = sArr;
                        i3 = ((iM559710 ^ i9) * 9719) ^ 700776922;
                        i4 = -493359409;
                    }
                    i11 = iM559710 ^ i4;
                    i10 = i3;
                    s2 = s;
                    viewOnClickListenerC7621 = this;
                    break;
                case -1939824333:
                case 1248808493:
                    i14 = 39500;
                    iM55979 = (C0873.m55680("᩺᩵") ^ i8) * (-53);
                    i = ((iM55979 ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ 788418545;
                    i2 = 68903885;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1885951959:
                case -1859625471:
                    if (!C0917.f81868) {
                        iM55680 = (i9 - C0873.m55680("᩹ۗ")) * (-105);
                        i10 = ((iM55680 ^ i8) * (-20237)) ^ 130256433;
                        i5 = 1088418574;
                        i11 = iM55680 ^ i5;
                        viewOnClickListenerC7621 = this;
                    } else {
                        iM55979 = C0946.m55979("ۡ۠") ^ i8;
                        i = ((iM55979 ^ i9) * (-21415)) ^ 1503594623;
                        i2 = 1970644650;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1764136264:
                case 603530450:
                    iM55683 = C0873.m55680(C1964.m56584(sArr4, 41, 3, i14));
                    i13 = 2104661686;
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("ۡ۠") ^ i8;
                        i = ((iM55979 ^ i9) * (-21415)) ^ 1503594623;
                        i2 = 1970644650;
                    } else {
                        iM55979 = C0873.m55680("ᩴ۠") ^ i8;
                        i = ((iM55979 ^ i9) * 6319) ^ (-1361318687);
                        i2 = -1314334711;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1694191278:
                case -637467789:
                    C0906.m55817(c20671M55888, 2125832083 ^ iM559713, onClickListener);
                    sArr4 = f82004;
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0946.m55979("ۡ۠") ^ i8;
                        i = ((iM55979 ^ i9) * (-21415)) ^ 1503594623;
                        i2 = 1970644650;
                    } else {
                        iM55979 = (C0946.m55979("ۙۖ") + i9) * (-53);
                        i = ((iM55979 ^ i8) * 16657) ^ 301773362;
                        i2 = 531320902;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1689918652:
                case -1149473328:
                    iM55682 = C0873.m55680(ServiceConnectionC1013.m56161(sArr3, 35, 3, i14));
                    i12 = 2104939782;
                    if (C0845.f81821 < 0) {
                        iM55979 = C0946.m55979("۫ۡ") ^ i8;
                        i = ((iM55979 ^ i9) * (-14207)) ^ 50075633;
                        i2 = 1360953912;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        iM55680 = (i9 - C0873.m55680("᩹ۗ")) * (-105);
                        i10 = ((iM55680 ^ i8) * (-20237)) ^ 130256433;
                        i5 = 1088418574;
                        i11 = iM55680 ^ i5;
                        viewOnClickListenerC7621 = this;
                    }
                    break;
                case -1653511123:
                case 86374706:
                    if (viewOnClickListenerC7621.f19941.m46293() > 3) {
                        iM55979 = C0873.m55680("᩸ۚ") ^ i9;
                        i = ((iM55979 ^ i8) * (-5303)) ^ (-1304800970);
                        i2 = 739245116;
                    } else {
                        iM55979 = C0946.m55979("ܰᩳ") ^ i9;
                        i = ((iM55979 ^ i8) * 24859) ^ (-1688354924);
                        i2 = -1199919168;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1572610749:
                case -1239765740:
                    strM55717 = C0882.m55717(f82004, 29, 3, i14);
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ۡ۠") ^ i8;
                        i = ((iM55979 ^ i9) * (-21415)) ^ 1503594623;
                        i2 = 1970644650;
                    } else {
                        iM55979 = C0873.m55680("ۡܿ") ^ i8;
                        i = ((iM55979 ^ i9) * 20003) ^ (-1504285238);
                        i2 = -925592887;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1476081637:
                case 1139743115:
                    if (!RunnableC0897.m55784()) {
                        sArr = sArr2;
                        s = s2;
                        iM559710 = (C0873.m55680("ܰ֫") ^ i8) * 69;
                        sArr2 = sArr;
                        i3 = ((iM559710 ^ i9) * 9719) ^ 700776922;
                        i4 = -493359409;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        s2 = s;
                        viewOnClickListenerC7621 = this;
                    } else {
                        iM55979 = C0873.m55680("۫ᩳ") ^ i9;
                        i = ((iM55979 ^ i8) * (-3601)) ^ (-854698027);
                        i2 = 31015644;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1406929261:
                case 248121448:
                    C0989.m56095();
                    break;
                case -1169867670:
                case -850864420:
                    i14 = 57756;
                    iM55979 = (C0873.m55680("᩺᩵") ^ i8) * (-53);
                    i = ((iM55979 ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ 788418545;
                    i2 = 68903885;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1085887966:
                case 236111999:
                    m17579();
                    break;
                case -1082564391:
                case 1408994799:
                    iM559713 = C0946.m55979(C0866.m55652(f82004, 38, 3, i14));
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0873.m55680("۫ᩳ") ^ i9;
                        i = ((iM55979 ^ i8) * (-3601)) ^ (-854698027);
                        i2 = 31015644;
                    } else {
                        iM55979 = C0873.m55680("᩺ܶ") ^ i9;
                        i = ((iM55979 ^ i8) * (-22181)) ^ (-1536649572);
                        i2 = 1414341266;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -900997839:
                case -658019636:
                    C0861.m55627(c20671M55888, 2119606119 ^ iM559712);
                    sArr3 = f82004;
                    if (C0854.f81826 == 0) {
                        iM55979 = C0946.m55979("ۤۨ") ^ i9;
                        i = ((iM55979 ^ i8) * 28219) ^ (-791952751);
                        i2 = 892578633;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        iM559710 = (C0873.m55680("ܰ֫") ^ i8) * 69;
                        sArr2 = sArr;
                        i3 = ((iM559710 ^ i9) * 9719) ^ 700776922;
                        i4 = -493359409;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        s2 = s;
                        viewOnClickListenerC7621 = this;
                    }
                    break;
                case -849949477:
                case 1761439427:
                    C1124.m56374(c20671M55888, iM55683 ^ i13, null);
                    RunnableC0871.m55669(c20671M55888);
                    break;
                case -837162197:
                case -499235897:
                    RunnableC0871.m55672();
                    C0866.m55645();
                    break;
                case -643989223:
                case 709976942:
                    if (activityC3597.f7316.m41556() > viewOnClickListenerC7621.f19941.m46311()) {
                        iM55979 = (i8 - C0873.m55680("ܳۗ")) * (-45);
                        i = ((iM55979 ^ i9) * (-4551)) ^ 2081415988;
                        i2 = -1752965399;
                    } else {
                        iM55979 = C0873.m55680("ۢۙ") ^ i8;
                        i = ((iM55979 ^ i9) * (-6303)) ^ 957186257;
                        i2 = 1712388659;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -615916579:
                case 1750701535:
                    s2 = sArr2[c];
                    s3 = 59860;
                    if (C0927.m55873() <= 0) {
                        iM55680 = (i9 - C0873.m55680("᩹ۗ")) * (-105);
                        i10 = ((iM55680 ^ i8) * (-20237)) ^ 130256433;
                        i5 = 1088418574;
                    } else {
                        iM55680 = (C0873.m55680("ۧۜ") ^ i8) * 77;
                        i10 = ((iM55680 ^ i9) * 24965) ^ (-1225060205);
                        i5 = 851083268;
                    }
                    i11 = iM55680 ^ i5;
                    viewOnClickListenerC7621 = this;
                    break;
                case 293782161:
                case 717390388:
                    C1024.m56202(C0873.m55680(strM55717) ^ 2120855079);
                    break;
                case 1007826904:
                case 1550979823:
                    c20671M55888 = C0930.m55888(activityC3597);
                    iM559712 = C0946.m55979(C0861.m55618(f82004, 32, 3, i14));
                    if (!C0861.f81831) {
                        iM55680 = (i9 - C0873.m55680("᩹ۗ")) * (-105);
                        i10 = ((iM55680 ^ i8) * (-20237)) ^ 130256433;
                        i5 = 1088418574;
                        i11 = iM55680 ^ i5;
                        viewOnClickListenerC7621 = this;
                    } else {
                        iM55979 = (C0946.m55979("ۨ᩸") ^ i9) * 9;
                        i = ((iM55979 ^ i8) * 3471) ^ 1214459168;
                        i2 = -897260604;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1816975635:
                case 2014402482:
                    short s4 = s2;
                    int i15 = s4 + 14965;
                    if ((s2 * s3) - (i15 * i15) > 0) {
                        iM55681 = C0946.m55979("ۧܽ") ^ i8;
                        i10 = ((iM55681 ^ i9) * (-627)) ^ (-637483617);
                        i6 = 337545164;
                    } else {
                        iM55681 = (C0873.m55680("ۙ᩹") ^ i9) * (-13);
                        i10 = ((iM55681 ^ i8) * (-29567)) ^ (-326011265);
                        i6 = -1885348118;
                    }
                    i11 = iM55681 ^ i6;
                    viewOnClickListenerC7621 = this;
                    s2 = s4;
                    break;
                default:
                    activityC3597 = viewOnClickListenerC7621.f19939;
                    if (activityC3597.f7316 != null) {
                        iM55979 = C0873.m55680("ܽ᩷") ^ i9;
                        i = ((iM55979 ^ i8) * 22721) ^ (-1806397482);
                        i2 = 1473405406;
                    } else {
                        iM55979 = C0873.m55680("ۢۙ") ^ i8;
                        i = ((iM55979 ^ i9) * (-6303)) ^ 957186257;
                        i2 = 1712388659;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17577(final ViewOnClickListenerC7621 viewOnClickListenerC7621) {
        ActivityC3597 activityC3597 = null;
        C20521 c20521 = null;
        int i = 485419013;
        int i2 = C0866.f81837;
        int i3 = C0877.f81843;
        int iM55680 = C0873.m55680("ۜܽ") ^ i2;
        int i4 = ((iM55680 ^ i3) * 27377) ^ 1002106288;
        int i5 = 906712867;
        while (true) {
            i = ((((i ^ i3) * 12585) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1920201579:
                case -309407484:
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0946.m55979("ܽ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31621) ^ 753360752;
                        i5 = 1639084437;
                    } else {
                        iM55680 = (C0873.m55680("ۡᩴ") + i3) * (-11);
                        i4 = ((iM55680 ^ i2) * (-25959)) ^ (-1388964283);
                        i5 = 763820777;
                    }
                    break;
                case -1900540356:
                case 608113413:
                    c20521 = viewOnClickListenerC7621.f19941;
                    if (C0927.m55873() <= 0) {
                        iM55680 = C0946.m55979("ܽ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31621) ^ 753360752;
                        i5 = 1639084437;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۚۗ")) * (-119);
                        i4 = ((iM55680 ^ i3) * 13635) ^ (-187933934);
                        i5 = 1284597069;
                    }
                    break;
                case -1864488699:
                case 1048610881:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ܽ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31621) ^ 753360752;
                        i5 = 1639084437;
                    } else {
                        iM55680 = (C0946.m55979("ۧ᩷") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55680 ^ i2) * 2413) ^ (-1080227872);
                        i5 = -1071669988;
                    }
                    break;
                case -1711975410:
                case -399108602:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24593)) ^ 530484166;
                        i5 = 182139573;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۠ܳ")) * (-127);
                        i4 = ((iM55680 ^ i2) * (-28191)) ^ 581487248;
                        i5 = 1125141455;
                    }
                    break;
                case -1049762901:
                case 1724904297:
                    C0937.m55918();
                    if (C0949.f81897 < 0) {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24593)) ^ 530484166;
                        i5 = 182139573;
                    } else {
                        iM55680 = C0946.m55979("ۜ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-665)) ^ 1582446032;
                        i5 = -2146424977;
                    }
                    break;
                case -1042542060:
                case 482877991:
                    C0861.m55626();
                    break;
                case -821465351:
                case 1691554791:
                    if (C0917.f81868) {
                        iM55680 = (C0873.m55680("ۜ᩸") ^ i3) * 83;
                        i4 = ((iM55680 ^ i2) * 19599) ^ 1641083779;
                        i5 = 1059343732;
                    } else {
                        iM55680 = C0946.m55979("ܺ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 457) ^ 1056027543;
                        i5 = -445614632;
                    }
                    break;
                case -704948282:
                case 11144626:
                    C1024.m56209();
                    iM55680 = (C0873.m55680("ۜ᩸") ^ i3) * 83;
                    i4 = ((iM55680 ^ i2) * 19599) ^ 1641083779;
                    i5 = 1059343732;
                    break;
                case -383198527:
                case 1287166590:
                    activityC3597 = viewOnClickListenerC7621.f19939;
                    if (C0866.m55645()) {
                        iM55680 = (i3 - C0946.m55979("ܿ᩷")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-3837)) ^ (-471953642);
                        i5 = 1541441895;
                    } else {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24593)) ^ 530484166;
                        i5 = 182139573;
                    }
                    break;
                case -289732737:
                case 1957367359:
                    if (C0927.f81875) {
                        iM55680 = (C0873.m55680("ۜ᩸") ^ i3) * 83;
                        i4 = ((iM55680 ^ i2) * 19599) ^ 1641083779;
                        i5 = 1059343732;
                    } else {
                        iM55680 = C0946.m55979("ۜܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8251) ^ 2073728727;
                        i5 = -2046401031;
                    }
                    break;
                case -268594863:
                case 1247173698:
                    if (C0937.m55918() >= 0) {
                        iM55680 = (i2 - C0873.m55680("ᩴ᩶")) * 31;
                        i4 = ((iM55680 ^ i3) * (-9531)) ^ 1019495112;
                        i5 = -980612300;
                    } else {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24593)) ^ 530484166;
                        i5 = 182139573;
                    }
                    break;
                case 174688443:
                case 1625053736:
                    ActivityC14326.m32900(activityC3597, c20521, new Runnable() { // from class: l.֡ᩳ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC7621 viewOnClickListenerC7622 = null;
                            ActivityC3597 activityC3598 = null;
                            String str = null;
                            int i6 = 1368957192;
                            int i7 = C0877.f81843;
                            int i8 = C1017.f81942;
                            int iM55979 = C0946.m55979("᩷۬") ^ i8;
                            int i9 = ((iM55979 ^ i7) * 26069) ^ (-1396949809);
                            int i10 = -265424958;
                            while (true) {
                                i6 = ((((i6 ^ i7) * (-15109)) >> 31) & i9) ^ (iM55979 ^ i10);
                                switch (i6) {
                                    case -1946129253:
                                    case -328609639:
                                        ViewOnClickListenerC0939.m55946(activityC3598.f7314);
                                        break;
                                    case -1905289116:
                                    case 1615738165:
                                        activityC3598 = viewOnClickListenerC7622.f19939;
                                        if (C0955.m56025()) {
                                            iM55979 = (i7 - C0873.m55680("᩺ۙ")) * (-9);
                                            i9 = ((iM55979 ^ i8) * (-31637)) ^ (-666954443);
                                            i10 = 1653038218;
                                        } else {
                                            iM55979 = (i7 - C0873.m55680("ۖ֨")) * (-17);
                                            i9 = ((iM55979 ^ i8) * (-15037)) ^ (-1971391568);
                                            i10 = 1340069586;
                                        }
                                        break;
                                    case -1682089354:
                                    case -791870379:
                                        if (C0967.m56074()) {
                                            iM55979 = (C0873.m55680("ۚ᩺") + i7) * (-107);
                                            i9 = ((iM55979 ^ i8) * (-32727)) ^ 2102723244;
                                            i10 = -802699614;
                                        } else {
                                            iM55979 = (C0873.m55680("ۜ᩺") ^ i8) * 49;
                                            i9 = ((iM55979 ^ i7) * 29717) ^ 1301579104;
                                            i10 = 1956597483;
                                        }
                                        break;
                                    case -1662789034:
                                    case -477809725:
                                        if (C0967.f81910 >= 0) {
                                            iM55979 = (C0873.m55680("ۚ᩺") + i7) * (-107);
                                            i9 = ((iM55979 ^ i8) * (-32727)) ^ 2102723244;
                                            i10 = -802699614;
                                        } else {
                                            iM55979 = C0873.m55680("֨᩵") ^ i8;
                                            i9 = ((iM55979 ^ i7) * (-13841)) ^ 1666254743;
                                            i10 = 1607884259;
                                        }
                                        break;
                                    case -1647152872:
                                    case 2040586597:
                                        RunnableC0871.m55672();
                                        if (C1025.f81947 < 0) {
                                            iM55979 = (C0873.m55680("ۜᩳ") + i8) * 91;
                                            i9 = ((iM55979 ^ i7) * 19873) ^ 1114733293;
                                            i10 = -529967648;
                                        } else {
                                            iM55979 = C0946.m55979("۟ܳ") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 22391) ^ 1781753944;
                                            i10 = -40390773;
                                        }
                                        break;
                                    case -1343650040:
                                    case 787333897:
                                        if (C0873.m55678()) {
                                            iM55979 = (C0873.m55680("᩸ۖ") + i7) * 119;
                                            i9 = ((iM55979 ^ i8) * 11879) ^ 335016609;
                                            i10 = 362933400;
                                        } else {
                                            iM55979 = C0946.m55979("ۜۜ") ^ i8;
                                            i9 = ((iM55979 ^ i7) * (-24891)) ^ (-517755115);
                                            i10 = -1258475122;
                                        }
                                        break;
                                    case -1124775184:
                                    case -341260516:
                                        if (C0877.m55696()) {
                                            iM55979 = C0873.m55680("۟֡") ^ i8;
                                            i9 = ((iM55979 ^ i7) * (-27711)) ^ 146566550;
                                            i10 = 24433341;
                                        } else {
                                            iM55979 = (i7 - C0873.m55680("᩺ۙ")) * (-9);
                                            i9 = ((iM55979 ^ i8) * (-31637)) ^ (-666954443);
                                            i10 = 1653038218;
                                        }
                                        break;
                                    case -1022205929:
                                    case -941535798:
                                        str = activityC3598.f7315;
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55979 = (C0873.m55680("ۚ᩺") + i7) * (-107);
                                            i9 = ((iM55979 ^ i8) * (-32727)) ^ 2102723244;
                                            i10 = -802699614;
                                        } else {
                                            iM55979 = C0946.m55979("ۨۢ") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 8091) ^ (-1160599826);
                                            i10 = -345774568;
                                        }
                                        break;
                                    case -766584475:
                                    case 1038373045:
                                        C0946.m55980();
                                        break;
                                    case -632860382:
                                    case 1699014212:
                                        if (C0967.f81910 >= 0) {
                                            iM55979 = (C0873.m55680("ۚ᩺") + i7) * (-107);
                                            i9 = ((iM55979 ^ i8) * (-32727)) ^ 2102723244;
                                            i10 = -802699614;
                                        } else {
                                            iM55979 = C0946.m55979("۠۫") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-11793)) ^ 522029576;
                                            i10 = 851086566;
                                        }
                                        break;
                                    case 218348368:
                                    case 1836387995:
                                        if (RunnableC1014.f81941 > 0) {
                                            iM55979 = C0946.m55979("۟ܳ") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 22391) ^ 1781753944;
                                            i10 = -40390773;
                                        } else {
                                            iM55979 = (C0873.m55680("᩸ۖ") + i7) * 119;
                                            i9 = ((iM55979 ^ i8) * 11879) ^ 335016609;
                                            i10 = 362933400;
                                        }
                                        break;
                                    case 485218488:
                                    case 563599581:
                                        viewOnClickListenerC7622 = this.f5083;
                                        if (C0892.m55749()) {
                                            iM55979 = C0873.m55680("ۛۚ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-17179)) ^ (-934605783);
                                            i10 = -1599995317;
                                        } else {
                                            iM55979 = (C0873.m55680("᩸ۖ") + i7) * 119;
                                            i9 = ((iM55979 ^ i8) * 11879) ^ 335016609;
                                            i10 = 362933400;
                                        }
                                        break;
                                    case 629242252:
                                    case 1420556515:
                                        AbstractC0942.m55971();
                                        if (C0949.f81897 < 0) {
                                            iM55979 = (i7 - C0873.m55680("᩺ۙ")) * (-9);
                                            i9 = ((iM55979 ^ i8) * (-31637)) ^ (-666954443);
                                            i10 = 1653038218;
                                        } else {
                                            iM55979 = (C0873.m55680("ۜᩳ") + i8) * 91;
                                            i9 = ((iM55979 ^ i7) * 19873) ^ 1114733293;
                                            i10 = -529967648;
                                        }
                                        break;
                                    case 741244917:
                                    case 1013100200:
                                        RunnableC0897.m55784();
                                        C0845.m55584();
                                        iM55979 = (C0873.m55680("᩸ۖ") + i7) * 119;
                                        i9 = ((iM55979 ^ i8) * 11879) ^ 335016609;
                                        i10 = 362933400;
                                        break;
                                    case 987379368:
                                    case 2097101305:
                                        activityC3598.f7316 = C14976.m34318(str);
                                        if (C1046.f81962 <= 0) {
                                            iM55979 = (C0873.m55680("ۚ᩺") + i7) * (-107);
                                            i9 = ((iM55979 ^ i8) * (-32727)) ^ 2102723244;
                                            i10 = -802699614;
                                        } else {
                                            iM55979 = (C0873.m55680("᩶֫") ^ i7) * (-47);
                                            i9 = ((iM55979 ^ i8) * (-4235)) ^ 1478114696;
                                            i10 = 208451825;
                                        }
                                        break;
                                    default:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55979 = (C0873.m55680("ۚ᩺") + i7) * (-107);
                                            i9 = ((iM55979 ^ i8) * (-32727)) ^ 2102723244;
                                            i10 = -802699614;
                                        } else {
                                            iM55979 = C0873.m55680("ۡ᩺") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 4435) ^ (-53657665);
                                            i10 = 313274354;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case 241166065:
                case 753400330:
                    C0873.m55678();
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24593)) ^ 530484166;
                        i5 = 182139573;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩸") ^ i3) * 83;
                        i4 = ((iM55680 ^ i2) * 19599) ^ 1641083779;
                        i5 = 1059343732;
                    }
                    break;
                case 978568828:
                case 1582861994:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i2 - C0873.m55680("ᩴ᩶")) * 31;
                        i4 = ((iM55680 ^ i3) * (-9531)) ^ 1019495112;
                        i5 = -980612300;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۙ۠")) * (-41);
                        i4 = ((iM55680 ^ i2) * (-4885)) ^ 214855291;
                        i5 = -1400717676;
                    }
                    break;
                case 1495656493:
                case 1975477673:
                    if (C1929.m56553()) {
                        iM55680 = (C0873.m55680("ۜ᩸") ^ i3) * 83;
                        i4 = ((iM55680 ^ i2) * 19599) ^ 1641083779;
                        i5 = 1059343732;
                    } else {
                        iM55680 = (C0873.m55680("᩵۠") ^ i2) * 85;
                        i4 = ((iM55680 ^ i3) * (-19201)) ^ (-12709158);
                        i5 = -1740095683;
                    }
                    break;
                default:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("ܽ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31621) ^ 753360752;
                        i5 = 1639084437;
                    } else {
                        iM55680 = (C0946.m55979("ܳۖ") + i2) * 57;
                        i4 = ((iM55680 ^ i3) * (-2027)) ^ 1692344419;
                        i5 = 1070560339;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x018f A[PHI: r7 r8 r9 r10 r12 r13
      0x018f: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:47:0x018d, B:43:0x016a, B:39:0x0148, B:31:0x00f9, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:47:0x018d, B:43:0x016a, B:39:0x0148, B:31:0x00f9, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:47:0x018d, B:43:0x016a, B:39:0x0148, B:31:0x00f9, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:47:0x018d, B:43:0x016a, B:39:0x0148, B:31:0x00f9, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:47:0x018d, B:43:0x016a, B:39:0x0148, B:31:0x00f9, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:47:0x018d, B:43:0x016a, B:39:0x0148, B:31:0x00f9, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01db A[PHI: r5 r6
      0x01db: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:51:0x01c3, B:35:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r6v4 l.֨ᩳ᩷) = (r6v3 l.֨ᩳ᩷), (r6v2 l.֨ᩳ᩷) binds: [B:51:0x01c3, B:35:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x027b A[PHI: r2 r4 r17 r19 r24
      0x027b: PHI (r2v4 android.widget.TextView) = 
      (r2v2 android.widget.TextView)
      (r2v3 android.widget.TextView)
      (r2v2 android.widget.TextView)
      (r2v2 android.widget.TextView)
     binds: [B:66:0x0279, B:55:0x0200, B:11:0x006f, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:66:0x0279, B:55:0x0200, B:11:0x006f, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:66:0x0279, B:55:0x0200, B:11:0x006f, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:66:0x0279, B:55:0x0200, B:11:0x006f, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r24v5 int) = (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:66:0x0279, B:55:0x0200, B:11:0x006f, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02ae A[PHI: r11 r14 r16
      0x02ae: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:70:0x02ac, B:27:0x00d5, B:17:0x0090, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:70:0x02ac, B:27:0x00d5, B:17:0x0090, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:70:0x02ac, B:27:0x00d5, B:17:0x0090, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e4 A[PHI: r18
      0x02e4: PHI (r18v5 short) = (r18v3 short), (r18v2 short) binds: [B:74:0x02e2, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final void m17583() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1404.f82149;
        int i4 = C0906.f81862;
        int iM55979 = C0946.m55979("ۧۙ") ^ i3;
        int i5 = ((iM55979 ^ i4) * (-22189)) ^ (-303071167);
        ActivityC3597 activityC3597 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 819994945;
        TextView textView = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iM559710 = 0;
        int iM559711 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = -145619060;
        int defaultColor = 0;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i4) * (-24855)) >> 31));
            switch (i16) {
                case -2080084641:
                case -688085849:
                    C1071.m56343();
                    C0866.m55645();
                    iM55680 = C0946.m55979("ܶۧ") ^ i4;
                    i = ((iM55680 ^ i3) * 10367) ^ 1813999574;
                    i2 = 2119101441;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2036131481:
                case -577884872:
                    C0892.m55749();
                    if (C0927.f81875) {
                        iM55680 = (C0946.m55979("ۗ۟") + i3) * 101;
                        i = ((iM55680 ^ i4) * 5989) ^ (-1403784509);
                        i2 = 821278059;
                    } else {
                        iM55680 = C0873.m55680("ۚܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-12067)) ^ (-1466077393);
                        i2 = 2046891672;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1881233005:
                case -1420985744:
                    textView.setEnabled(false);
                    i10 = i8 | (-872415232);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i4;
                        i = ((iM55680 ^ i3) * 2981) ^ (-124120387);
                        i2 = -1203668484;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * 14575) ^ 46100102;
                        i2 = 1773017862;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1532700233:
                case 1402557795:
                    i15 = i14 + 1;
                    s2 = 1;
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("ۚܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-12067)) ^ (-1466077393);
                        i2 = 2046891672;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۨۘ")) * 27;
                        i = ((iM55680 ^ i3) * 9851) ^ (-1511306880);
                        i2 = -1655675969;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1426949791:
                case -394032506:
                    int i17 = s + s2;
                    if ((i17 * i17) - i15 >= 0) {
                        iM55680 = C0946.m55979("ᩴ۠") ^ i3;
                        i = ((iM55680 ^ i4) * (-32597)) ^ 1093480300;
                        i2 = -1315038047;
                    } else {
                        iM55680 = C0946.m55979("ۢܳ") ^ i3;
                        i = ((iM55680 ^ i4) * 31491) ^ 1119941265;
                        i2 = -1683541610;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1372853753:
                case -668059572:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55680 = C0946.m55979("ܶۧ") ^ i4;
                        i = ((iM55680 ^ i3) * 10367) ^ 1813999574;
                        i2 = 2119101441;
                    } else {
                        iM55680 = (C0946.m55979("ۗ۟") + i3) * 101;
                        i = ((iM55680 ^ i4) * 5989) ^ (-1403784509);
                        i2 = 821278059;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1310987311:
                case 903322137:
                    C0873.m55684(textView, 2122602780 ^ iM559711);
                    break;
                case -1240330753:
                case 235333751:
                    i14 = s * 2;
                    if (C1048.f81963) {
                        iM55680 = (C0873.m55680("ܰܰ") + i4) * 19;
                        i = ((iM55680 ^ i3) * (-13145)) ^ (-1505118033);
                        i2 = -1372601774;
                    } else {
                        iM55680 = C0946.m55979("ܶۧ") ^ i4;
                        i = ((iM55680 ^ i3) * 10367) ^ 1813999574;
                        i2 = 2119101441;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -979830761:
                case -783893413:
                    C1194.m56396();
                    C0927.m55873();
                    break;
                case -962182259:
                case 1161588434:
                    C0912.m55828(textView, i10);
                    sArr2 = f82004;
                    i12 = 48;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ܶۧ") ^ i4;
                        i = ((iM55680 ^ i3) * 10367) ^ 1813999574;
                        i2 = 2119101441;
                    } else {
                        iM55680 = C0873.m55680("᩷۟") ^ i4;
                        i = ((iM55680 ^ i3) * (-22755)) ^ 162942063;
                        i2 = -855213917;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -881439728:
                case 1111197145:
                    if (activityC3597.f7316.m41556() != this.f19941.m46311()) {
                        iM55680 = C0873.m55680("ۛ۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-9773)) ^ 325711277;
                        i2 = -1224462347;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֫ܺ")) * 123;
                        i = ((iM55680 ^ i4) * (-24665)) ^ 2087360431;
                        i2 = 1151700623;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -504663496:
                case 1334692411:
                    i13 = 38380;
                    iM55680 = (C0873.m55680("᩵ۛ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM55680 ^ i3) * 4361) ^ 1595661062;
                    i2 = -1637654581;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -456467793:
                case 1251219761:
                    s = f82004[44];
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۗܰ")) * 7;
                        i = ((iM55680 ^ i3) * (-813)) ^ (-797488423);
                        i2 = 347656614;
                    } else {
                        iM55680 = C0873.m55680("۫ᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-3223)) ^ 2050284319;
                        i2 = -634634333;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 366344233:
                case 1440725182:
                    textView = this.f19940;
                    defaultColor = textView.getTextColors().getDefaultColor();
                    i7 = 16777215;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ۚܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-12067)) ^ (-1466077393);
                        i2 = 2046891672;
                    } else {
                        iM55680 = (C0946.m55979("֫֨") + i3) * (-99);
                        i = ((iM55680 ^ i4) * 25111) ^ (-1718308764);
                        i2 = -1907826628;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 390691163:
                case 996426753:
                    if (C0989.f81920 < 0) {
                        iM55680 = C0873.m55680("ۚܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-12067)) ^ (-1466077393);
                        i2 = 2046891672;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۗܰ")) * 7;
                        i = ((iM55680 ^ i3) * (-813)) ^ (-797488423);
                        i2 = 347656614;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 403456687:
                case 1216904976:
                    textView.setEnabled(true);
                    i9 = i8 | (-16777216);
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i4;
                        i = ((iM55680 ^ i3) * 2981) ^ (-124120387);
                        i2 = -1203668484;
                    } else {
                        iM55680 = C0946.m55979("ۛۨ") ^ i4;
                        i = ((iM55680 ^ i3) * (-21031)) ^ 1177577807;
                        i2 = -1780944400;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 986750134:
                case 1024157331:
                    C0912.m55828(textView, i9);
                    sArr = f82004;
                    i11 = 45;
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i4;
                        i = ((iM55680 ^ i3) * 2981) ^ (-124120387);
                        i2 = -1203668484;
                    } else {
                        iM55680 = C0946.m55979("ᩳۨ") ^ i3;
                        i = ((iM55680 ^ i4) * 31751) ^ (-2111431496);
                        i2 = -1614364760;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1273995841:
                case 1691620535:
                    iM559710 = C0946.m55979(C0912.m55822(sArr, i11, 3, i13));
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i4;
                        i = ((iM55680 ^ i3) * 2981) ^ (-124120387);
                        i2 = -1203668484;
                    } else {
                        iM55680 = C0946.m55979("ᩴ᩺") ^ i3;
                        i = ((iM55680 ^ i4) * (-13851)) ^ (-441059359);
                        i2 = -406087650;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1293569716:
                case 1706492273:
                    i13 = 18058;
                    iM55680 = (C0873.m55680("᩵ۛ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM55680 ^ i3) * 4361) ^ 1595661062;
                    i2 = -1637654581;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1429142636:
                case 1645082048:
                    iM559711 = C0946.m55979(C0955.m56029(sArr2, i12, 3, i13));
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i4;
                        i = ((iM55680 ^ i3) * 2981) ^ (-124120387);
                        i2 = -1203668484;
                    } else {
                        iM55680 = C0946.m55979("᩸ܰ") ^ i3;
                        i = ((iM55680 ^ i4) * (-11211)) ^ 816722931;
                        i2 = -503413091;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1931033695:
                case 2099532009:
                    i8 = defaultColor & i7;
                    activityC3597 = this.f19939;
                    if (activityC3597.f7316 != null) {
                        iM55680 = C0873.m55680("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * (-9129)) ^ (-1998968431);
                        i2 = -315373171;
                    } else {
                        iM55680 = C0873.m55680("ۛ۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-9773)) ^ 325711277;
                        i2 = -1224462347;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0946.m55976(textView, 2102654946 ^ iM559710);
                    break;
            }
            return;
        }
    }
}
