package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3420 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩻ۚ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f10796 = {4523, -31928, -31918};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10797;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f10798;

    public /* synthetic */ ViewOnClickListenerC3420(KeyEvent.Callback callback, int i) {
        int i2 = -551867371;
        int i3 = C3432.f10845;
        int i4 = C2520.f8000;
        this.f10797 = i;
        this.f10798 = callback;
        int iM6981 = C2105.m6981("۠ܿ") ^ i3;
        int i5 = ((iM6981 ^ i4) * 10463) ^ (-1749550010);
        int i6 = 1078938208;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i4) * 19775) >> 31));
            switch (i2) {
                case -1964287163:
                case -201270281:
                    C1711.m5736();
                    throw new RuntimeException();
                case -1472438522:
                case 503989964:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ܰۡ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 21079) ^ 653522240;
                        i6 = 1539097812;
                    } else {
                        iM6981 = C0630.m2566("᩵ۨ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-4857)) ^ 528670395;
                        i6 = 1073494910;
                    }
                    break;
                case -1107731183:
                case 1158726572:
                    C4616.m13552();
                    if (C3432.f10845 < 0) {
                        iM6981 = C2105.m6981("᩺ۡ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 9065) ^ (-235918567);
                        i6 = 489373577;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۧ֡")) * (-31);
                        i5 = ((iM6981 ^ i3) * (-30371)) ^ (-509968394);
                        i6 = 806196947;
                    }
                    break;
                case -803673807:
                case 585962970:
                    C21923.m49329();
                    C2167.m7155();
                    iM6981 = C0630.m2566("᩵ۨ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-4857)) ^ 528670395;
                    i6 = 1073494910;
                    break;
                case -178533097:
                case 1159616044:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ܽ᩷") + i3) * 93;
                        i5 = ((iM6981 ^ i4) * 3089) ^ (-844229773);
                        i6 = 1966695339;
                    } else {
                        iM6981 = C2105.m6981("᩵ᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-29325)) ^ (-747923702);
                        i6 = 1748320347;
                    }
                    break;
                case 657179561:
                case 1630972309:
                    C0630.m2564();
                    if (!C1504.f5354) {
                        iM6981 = C2105.m6981("᩺ۡ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 9065) ^ (-235918567);
                        i6 = 489373577;
                    } else {
                        iM6981 = C2105.m6981("ܰۡ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 21079) ^ 653522240;
                        i6 = 1539097812;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[PHI: r11
      0x00bf: PHI (r11v5 android.widget.TextView) = (r11v4 android.widget.TextView), (r11v2 android.widget.TextView) binds: [B:24:0x00bd, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0120  */
    /* JADX WARN: Code duplicated, block: B:81:0x0337 A[PHI: r9 r14 r15 r16 r17 r22
      0x0337: PHI (r9v5 android.widget.TextView) = 
      (r9v2 android.widget.TextView)
      (r9v2 android.widget.TextView)
      (r9v2 android.widget.TextView)
      (r9v4 android.widget.TextView)
      (r9v2 android.widget.TextView)
     binds: [B:80:0x0335, B:76:0x0319, B:72:0x02f9, B:36:0x0157, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0337: PHI (r14v4 short) = (r14v2 short), (r14v3 short), (r14v2 short), (r14v2 short), (r14v2 short) binds: [B:80:0x0335, B:76:0x0319, B:72:0x02f9, B:36:0x0157, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0337: PHI (r15v4 short) = (r15v2 short), (r15v3 short), (r15v2 short), (r15v2 short), (r15v2 short) binds: [B:80:0x0335, B:76:0x0319, B:72:0x02f9, B:36:0x0157, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0337: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:80:0x0335, B:76:0x0319, B:72:0x02f9, B:36:0x0157, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0337: PHI (r17v4 short) = (r17v2 short), (r17v2 short), (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:80:0x0335, B:76:0x0319, B:72:0x02f9, B:36:0x0157, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0337: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char), (r22v3 char), (r22v3 char) binds: [B:80:0x0335, B:76:0x0319, B:72:0x02f9, B:36:0x0157, B:16:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM6981;
        int i;
        int i2;
        short[] sArr;
        ViewOnClickListenerC3420 viewOnClickListenerC3420 = this;
        int i3 = 422468002;
        int i4 = C3911.f12484;
        int i5 = C0714.f2697;
        int iM6982 = (C2105.m6981("ۡۙ") ^ i4) * 119;
        int i6 = ((iM6982 ^ i5) * 21381) ^ 34975599;
        int i7 = iM6982 ^ (-114138306);
        View view2 = null;
        StringBuilder sb = null;
        short[] sArr2 = null;
        KeyEvent.Callback callback = null;
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        char c = 0;
        int[] iArr = null;
        TextView textView = null;
        int[] iArr2 = null;
        String strM5177 = null;
        int i10 = 0;
        TextView textView2 = null;
        int i11 = 0;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i5) * 28033) >> 31));
            switch (i3) {
                case -1977982169:
                case 240413136:
                    C2126.m7040();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("֫ܰ") ^ i5;
                        i = ((iM6981 ^ i4) * (-16545)) ^ (-1286944969);
                        i2 = 732946051;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩻ۖ")) * (-77);
                        i = ((iM6981 ^ i5) * 25363) ^ (-1298598228);
                        i2 = -1587999547;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1869326277:
                case -1621648848:
                    C4925.m14314((CharSequence) C0422.m1959(sb));
                    break;
                case -1854136700:
                case -1129264905:
                    c = 0;
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ۖۗ") ^ i5;
                        i = ((iM6981 ^ i4) * (-8533)) ^ 572445402;
                        i2 = 1927885684;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩻ۖ")) * (-77);
                        i = ((iM6981 ^ i5) * 25363) ^ (-1298598228);
                        i2 = -1587999547;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1853960585:
                case -720061970:
                    i8 = 33650;
                    iM6981 = (i4 - C0630.m2566("ܽᩴ")) * (-115);
                    i = ((iM6981 ^ i5) * 12033) ^ 1909973399;
                    i2 = 1318085825;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1792795852:
                case -1429512395:
                    sArr = f10796;
                    if (RunnableC3474.f10992 > 0) {
                        int iM6983 = C2105.m6981("ۖۤ") ^ i4;
                        i = ((iM6983 ^ i5) * 29919) ^ (-1428002807);
                        i7 = iM6983 ^ 1515402284;
                        viewOnClickListenerC3420 = this;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM2566 = C0630.m2566("᩷ۖ") ^ i4;
                        i7 = iM2566 ^ (-832183430);
                        sArr2 = sArr;
                        i6 = ((iM2566 ^ i5) * 15681) ^ 466357237;
                        viewOnClickListenerC3420 = this;
                    }
                    break;
                case -1524123185:
                case -756870848:
                    C3245.m9923(sb, strM5177);
                    textView = (TextView) C1005.m3507(view2, iArr[i11]);
                    if (C7106.m19120() <= 0) {
                        iM6981 = (i5 - C0630.m2566("ۧ۟")) * (-109);
                        i = ((iM6981 ^ i4) * 24993) ^ 226607969;
                        i2 = -1660543967;
                    } else {
                        iM6981 = C0630.m2566("ܺܳ") ^ i4;
                        i = ((iM6981 ^ i5) * 12531) ^ (-390039598);
                        i2 = -177708314;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1512017285:
                case 510383551:
                    C0483.m2121();
                    C0714.m2805();
                    break;
                case -1506013765:
                case -210545461:
                    i8 = 54918;
                    iM6981 = (i4 - C0630.m2566("ܽᩴ")) * (-115);
                    i = ((iM6981 ^ i5) * 12033) ^ 1909973399;
                    i2 = 1318085825;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1406024524:
                case 447757895:
                    strM5177 = C1504.m5177(f10796, 1, 2, i8);
                    if (C1294.f4556 < 0) {
                        iM6981 = (i5 - C0630.m2566("ۛ᩺")) * 21;
                        i = ((iM6981 ^ i4) * (-26283)) ^ (-2067804592);
                        i2 = 156119225;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM2567 = C0630.m2566("᩷ۖ") ^ i4;
                        i7 = iM2567 ^ (-832183430);
                        sArr2 = sArr;
                        i6 = ((iM2567 ^ i5) * 15681) ^ 466357237;
                        viewOnClickListenerC3420 = this;
                    }
                    break;
                case -1304297739:
                case 646763781:
                    ActivityC6242.m17196((ActivityC6242) callback);
                    break;
                case -1295297805:
                case 148297110:
                    int i12 = s + s2;
                    i9 = i12 * i12;
                    s3 = 33336;
                    if (C0798.f2919) {
                        iM6981 = (i4 - C0630.m2566("᩻ۖ")) * (-77);
                        i = ((iM6981 ^ i5) * 25363) ^ (-1298598228);
                        i2 = -1587999547;
                    } else {
                        iM6981 = C0630.m2566("֡ۨ") ^ i5;
                        i = ((iM6981 ^ i4) * (-15397)) ^ (-1416006188);
                        i2 = 853952243;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1290242469:
                case -1252293456:
                    sb.append(RunnableC0588.m2442(textView2));
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("֫ܰ") ^ i5;
                        i = ((iM6981 ^ i4) * (-16545)) ^ (-1286944969);
                        i2 = 732946051;
                    } else {
                        iM6981 = C0630.m2566("ۢᩳ") ^ i5;
                        i = ((iM6981 ^ i4) * 1051) ^ 185090320;
                        i2 = -1795175541;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1246000167:
                case 1863727270:
                    if (C0237.m1493(sb) > 0) {
                        iM6981 = C0630.m2566("ۜۨ") ^ i4;
                        i = ((iM6981 ^ i5) * (-1091)) ^ (-582665997);
                        i2 = 87431930;
                    } else {
                        iM6981 = (C0630.m2566("֨ܺ") ^ i4) * 27;
                        i = ((iM6981 ^ i5) * (-7475)) ^ 1479980137;
                        i2 = -1144041171;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1129715319:
                case 2045412008:
                    if ((s * s3) - i9 > 0) {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i5;
                        i = ((iM6981 ^ i4) * (-29461)) ^ (-1676437793);
                        i2 = 2101310867;
                    } else {
                        iM6981 = C2105.m6981("ۜᩴ") ^ i4;
                        i = ((iM6981 ^ i5) * 2219) ^ 375589929;
                        i2 = 2006779770;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -693823868:
                case 362985917:
                    // fill-array-data instruction
                    iArr[0] = 2131363264;
                    iArr[1] = 2131363265;
                    iArr[2] = 2131363266;
                    iArr[3] = 2131363267;
                    iArr[4] = 2131363268;
                    iArr[5] = 2131363269;
                    iArr[6] = 2131363270;
                    sb = new StringBuilder();
                    i11 = 0;
                    iM6981 = (C2105.m6981("᩸ۤ") ^ i5) * 115;
                    i = ((iM6981 ^ i4) * 30675) ^ (-677185688);
                    i2 = -130598498;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -642676764:
                case -472520861:
                    C0630.m2567(sb, '\n');
                    iM6981 = (C0630.m2566("֨ܺ") ^ i4) * 27;
                    i = ((iM6981 ^ i5) * (-7475)) ^ 1479980137;
                    i2 = -1144041171;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -506499312:
                case 81655513:
                    textView2 = (TextView) C1005.m3507(view2, iArr2[i11]);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩻ۖ")) * (-77);
                        i = ((iM6981 ^ i5) * 25363) ^ (-1298598228);
                        i2 = -1587999547;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩶") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i5) * 29745) ^ (-2144708501);
                        i2 = 113945645;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -379245165:
                case -330731129:
                    view2 = (View) callback;
                    i10 = 7;
                    iArr2 = new int[7];
                    if (!C3683.m11222()) {
                        iM6981 = (i5 - C2105.m6981("۫ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6981 ^ i4) * 15317) ^ 648585606;
                        i2 = 1002949960;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM2568 = C0630.m2566("᩷ۖ") ^ i4;
                        i7 = iM2568 ^ (-832183430);
                        sArr2 = sArr;
                        i6 = ((iM2568 ^ i5) * 15681) ^ 466357237;
                        viewOnClickListenerC3420 = this;
                    }
                    break;
                case -173410882:
                case 1624897813:
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("֫ܰ") ^ i5;
                        i = ((iM6981 ^ i4) * (-16545)) ^ (-1286944969);
                        i2 = 732946051;
                    } else {
                        iM6981 = C0630.m2566("ۡ֨") ^ i5;
                        i = ((iM6981 ^ i4) * 3807) ^ 661665478;
                        i2 = 72721373;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -127547061:
                case 309041727:
                    int i13 = ActivityC16683.f51209;
                    C2272.m7505((ActivityC16683) callback);
                    break;
                case -98882674:
                case 805277227:
                    C21923.m49329();
                    iM6981 = C2105.m6981("֫ܰ") ^ i5;
                    i = ((iM6981 ^ i4) * (-16545)) ^ (-1286944969);
                    i2 = 732946051;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -56167512:
                case 711939889:
                    s = sArr2[c];
                    s2 = 8334;
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("ᩳᩴ") ^ i4;
                        i = ((iM6981 ^ i5) * (-13495)) ^ 1028285844;
                        i2 = 1412119175;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩻ۖ")) * (-77);
                        i = ((iM6981 ^ i5) * 25363) ^ (-1298598228);
                        i2 = -1587999547;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 116848615:
                case 293226571:
                    int i14 = viewOnClickListenerC3420.f10797;
                    callback = viewOnClickListenerC3420.f10798;
                    switch (i14) {
                        case 0:
                            iM6981 = (C0630.m2566("᩶֫") + i5) * (-19);
                            i = ((iM6981 ^ i4) * (-7711)) ^ (-623328977);
                            i2 = 1232017327;
                            break;
                        case 1:
                            iM6981 = (C2105.m6981("᩸ۨ") + i5) * 75;
                            i = ((iM6981 ^ i4) * 25903) ^ (-240046094);
                            i2 = -1602975120;
                            break;
                        default:
                            iM6981 = C0630.m2566("ܿۜ") ^ i4;
                            i = ((iM6981 ^ i5) * 24137) ^ 1425266249;
                            i2 = 178958575;
                            break;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 327918538:
                case 1046932379:
                    sb.append(C3683.m11212(textView));
                    i11++;
                    iM6981 = (C2105.m6981("᩸ۤ") ^ i5) * 115;
                    i = ((iM6981 ^ i4) * 30675) ^ (-677185688);
                    i2 = -130598498;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 335821917:
                case 1771096151:
                    if (i11 < i10) {
                        iM6981 = (i5 - C2105.m6981("᩵᩵")) * (-65);
                        i = ((iM6981 ^ i4) * 31121) ^ (-827634999);
                        i2 = 1803214490;
                    } else {
                        iM6981 = C0630.m2566("ۡ᩻") ^ i4;
                        i = ((iM6981 ^ i5) * (-32617)) ^ 1540628469;
                        i2 = 2041861023;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 679870032:
                case 2053184082:
                    C2272.m7503();
                    if (C1773.m5908() > 0) {
                        iM6981 = C2105.m6981("֫ܰ") ^ i5;
                        i = ((iM6981 ^ i4) * (-16545)) ^ (-1286944969);
                        i2 = 732946051;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۧ۟")) * (-109);
                        i = ((iM6981 ^ i4) * 24993) ^ 226607969;
                        i2 = -1660543967;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                default:
                    // fill-array-data instruction
                    iArr2[0] = 2131362370;
                    iArr2[1] = 2131362371;
                    iArr2[2] = 2131362372;
                    iArr2[3] = 2131362373;
                    iArr2[4] = 2131362374;
                    iArr2[5] = 2131362375;
                    iArr2[6] = 2131362376;
                    iArr = new int[i10];
                    if (!RunnableC1108.f4040) {
                        sArr = sArr2;
                        int iM2569 = C0630.m2566("᩷ۖ") ^ i4;
                        i7 = iM2569 ^ (-832183430);
                        sArr2 = sArr;
                        i6 = ((iM2569 ^ i5) * 15681) ^ 466357237;
                        viewOnClickListenerC3420 = this;
                    } else {
                        iM6981 = C0630.m2566("ۚ֡") ^ i4;
                        i = ((iM6981 ^ i5) * (-20685)) ^ (-425674044);
                        i2 = 809953942;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
            }
            return;
        }
    }
}
