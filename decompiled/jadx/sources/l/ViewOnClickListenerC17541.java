package l;

import android.view.View;
import android.widget.CheckedTextView;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC17541 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩻ۘ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f53585 = {2494, -402, -397, -385, -391, -406, -408, -385, -428, -406, -389, -416, -428, -392, -412, -391, -385, -428, -407, -398, -402, -397, -385, -391, -406, -408, -385, -428, -406, -389, -416, -428, -392, -412, -391, -385, -428, -391, -402, -387, -402, -391, -392, -402};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f53586;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC2040 f53587;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckedTextView f53588;

    /* JADX WARN: Code duplicated, block: B:26:0x00c8 A[PHI: r7 r8
      0x00c8: PHI (r7v4 l.᩶ᩴ᩷) = (r7v3 l.᩶ᩴ᩷), (r7v2 l.᩶ᩴ᩷), (r7v2 l.᩶ᩴ᩷), (r7v2 l.᩶ᩴ᩷), (r7v2 l.᩶ᩴ᩷) binds: [B:25:0x00c6, B:21:0x00a5, B:15:0x0089, B:6:0x005f, B:90:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r8v4 l.᩶ᩴ᩷) = (r8v2 l.᩶ᩴ᩷), (r8v3 l.᩶ᩴ᩷), (r8v2 l.᩶ᩴ᩷), (r8v2 l.᩶ᩴ᩷), (r8v2 l.᩶ᩴ᩷) binds: [B:25:0x00c6, B:21:0x00a5, B:15:0x0089, B:6:0x005f, B:90:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0218 A[PHI: r2 r3 r4 r5 r6 r19 r24
      0x0218: PHI (r2v4 l.۬ۤۡ) = (r2v2 l.۬ۤۡ), (r2v3 l.۬ۤۡ), (r2v2 l.۬ۤۡ), (r2v2 l.۬ۤۡ), (r2v2 l.۬ۤۡ) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r3v4 l.֫᩵᩷) = (r3v2 l.֫᩵᩷), (r3v3 l.֫᩵᩷), (r3v2 l.֫᩵᩷), (r3v2 l.֫᩵᩷), (r3v2 l.֫᩵᩷) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r5v4 l.۬ۤۡ) = (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v3 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r6v4 boolean) = (r6v2 boolean), (r6v2 boolean), (r6v3 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r24v5 int) = (r24v4 int), (r24v3 int), (r24v3 int), (r24v3 int), (r24v3 int) binds: [B:56:0x0216, B:45:0x01a0, B:37:0x0153, B:29:0x0107, B:6:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x024a A[PHI: r9 r10 r11 r12 r13 r17 r18
      0x024a: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:60:0x0248, B:41:0x0176, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        ViewOnClickListenerC17541 viewOnClickListenerC17541 = this;
        int i3 = -1230642888;
        int i4 = C2958.f9394;
        int i5 = C4075.f12947;
        int iM6981 = C2105.m6981("ۡ۫") ^ i5;
        int i6 = ((iM6981 ^ i4) * (-13665)) ^ 304990211;
        int i7 = iM6981 ^ 841713840;
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        InterfaceC13049 interfaceC13049Mo25853 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        InterfaceC13049 interfaceC13049M4377 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        C20364 c20364 = null;
        C20364 c20365 = null;
        boolean zIsChecked = false;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i4) * 11157) >> 31));
            switch (i3) {
                case -2070972533:
                case 224454702:
                    C1916.m6302(C4616.m13549(interfaceC13049Mo25853, ServiceConnectionC3453.m10568(sArr4, i11, 24, i12), zIsChecked));
                    if (C1773.m5908() <= 0) {
                        iM2566 = C2105.m6981("ۙܶ") ^ i4;
                        i = ((iM2566 ^ i5) * (-26267)) ^ (-155768716);
                        i2 = 1708779508;
                    } else {
                        iM2566 = C2105.m6981("ۗۘ") ^ i5;
                        i = ((iM2566 ^ i4) * (-16219)) ^ (-1414402715);
                        i2 = 309293760;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1895062033:
                case 1273017345:
                    i12 = 42642;
                    iM2566 = C0630.m2566("֨ۛ") ^ i4;
                    i = ((iM2566 ^ i5) * (-7399)) ^ (-744865180);
                    i2 = 275229290;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1881801192:
                case 695500457:
                    i14 = i13 * i13;
                    i15 = s * 2;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("ۙܶ") ^ i4;
                        i = ((iM2566 ^ i5) * (-26267)) ^ (-155768716);
                        i2 = 1708779508;
                    } else {
                        iM2566 = C0630.m2566("᩷ۗ") ^ i4;
                        i = ((iM2566 ^ i5) * (-3565)) ^ (-321575802);
                        i2 = -779790984;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1862539746:
                case -1384936496:
                    if (!C2272.m7503()) {
                        iM2566 = C0630.m2566("֨᩷") ^ i4;
                        i = ((iM2566 ^ i5) * 25317) ^ 1751648910;
                        i2 = 1716503712;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM6982 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = iM6982 ^ (-1888185071);
                        sArr2 = sArr;
                        i6 = ((iM6982 ^ i4) * (-2471)) ^ (-689072682);
                        viewOnClickListenerC17541 = this;
                    }
                    break;
                case -1821517832:
                case 1798431222:
                    C3432.m10477();
                    break;
                case -1714306733:
                case -1641697492:
                    i12 = 65035;
                    iM2566 = C0630.m2566("֨ۛ") ^ i4;
                    i = ((iM2566 ^ i5) * (-7399)) ^ (-744865180);
                    i2 = 275229290;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1707820551:
                case -1424379462:
                    c20365 = viewOnClickListenerC2040.f6822.f10837;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("֨᩷") ^ i4;
                        i = ((iM2566 ^ i5) * 25317) ^ 1751648910;
                        i2 = 1716503712;
                    } else {
                        iM2566 = (C0630.m2566("֨ۚ") ^ i4) * 63;
                        i = ((iM2566 ^ i5) * 11967) ^ (-491617121);
                        i2 = 1971135488;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1602828238:
                case 935485330:
                    interfaceC13049Mo25853 = interfaceC13049M4377.mo25853(i8, C0798.m3005(sArr3, i9, i10, i12));
                    zIsChecked = viewOnClickListenerC17541.f53588.isChecked();
                    if (C1005.f3721) {
                        iM2566 = (C0630.m2566("ۙ᩷") ^ i5) * (-91);
                        i = ((iM2566 ^ i4) * (-3735)) ^ (-895231362);
                        i2 = -2037219323;
                    } else {
                        iM2566 = C2105.m6981("ۙܶ") ^ i4;
                        i = ((iM2566 ^ i5) * (-26267)) ^ (-155768716);
                        i2 = 1708779508;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1529538284:
                case 31372987:
                    sArr4 = f53585;
                    i11 = 20;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܺۧ") ^ i5;
                        i = ((iM2566 ^ i4) * (-4083)) ^ (-692325836);
                        i2 = -2135901874;
                    } else {
                        iM2566 = (C0630.m2566("ܰ۟") ^ i4) * 75;
                        i = ((iM2566 ^ i5) * 22527) ^ (-400067339);
                        i2 = -597136058;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1167047358:
                case -887376646:
                    sArr = f53585;
                    c = 0;
                    if (C21923.f70183 == 0) {
                        int iM6983 = C2105.m6981("ۗ᩵") ^ i5;
                        i = ((iM6983 ^ i4) * (-12693)) ^ (-1045881415);
                        i7 = iM6983 ^ 1926379765;
                        viewOnClickListenerC17541 = this;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM6984 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = iM6984 ^ (-1888185071);
                        sArr2 = sArr;
                        i6 = ((iM6984 ^ i4) * (-2471)) ^ (-689072682);
                        viewOnClickListenerC17541 = this;
                    }
                    break;
                case -1107547816:
                case 228019343:
                    sArr3 = f53585;
                    i9 = 1;
                    i10 = 19;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("۠֡") ^ i4;
                        i = ((iM2566 ^ i5) * 20599) ^ (-1082712414);
                        i2 = -1025482812;
                    } else {
                        iM2566 = C0630.m2566("ܺۧ") ^ i5;
                        i = ((iM2566 ^ i4) * (-4083)) ^ (-692325836);
                        i2 = -2135901874;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1079598743:
                case 2087240341:
                    c20364.m46684();
                    C3663.m11167(viewOnClickListenerC17541.f53586);
                    break;
                case -448411954:
                case 1266266550:
                    interfaceC13049M4377 = C1294.m4377(ApplicationC20075.f65008);
                    viewOnClickListenerC2040 = viewOnClickListenerC17541.f53587;
                    i8 = viewOnClickListenerC2040.f6834;
                    if (C4263.m12819() >= 0) {
                        iM2566 = C2105.m6981("ۙܶ") ^ i4;
                        i = ((iM2566 ^ i5) * (-26267)) ^ (-155768716);
                        i2 = 1708779508;
                    } else {
                        iM2566 = C2105.m6981("᩵ᩳ") ^ i5;
                        i = ((iM2566 ^ i4) * 1617) ^ 579623158;
                        i2 = -2050026551;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -209837167:
                case -91633837:
                    s = sArr2[c];
                    i13 = s + 1;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ܺۧ") ^ i5;
                        i = ((iM2566 ^ i4) * (-4083)) ^ (-692325836);
                        i2 = -2135901874;
                    } else {
                        iM2566 = (C0630.m2566("ۘܿ") ^ i4) * (-11);
                        i = ((iM2566 ^ i5) * (-7619)) ^ (-1653721223);
                        i2 = 1593676825;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 120543586:
                case 905363952:
                    C0964.m3413();
                    iM2566 = C0630.m2566("֨᩷") ^ i4;
                    i = ((iM2566 ^ i5) * 25317) ^ 1751648910;
                    i2 = 1716503712;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 149638779:
                case 303926645:
                    if (!C1005.m3501()) {
                        iM2566 = C2105.m6981("᩺᩺") ^ i4;
                        i = ((iM2566 ^ i5) * 27377) ^ (-1450966637);
                        i2 = 1857252697;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM6985 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = iM6985 ^ (-1888185071);
                        sArr2 = sArr;
                        i6 = ((iM6985 ^ i4) * (-2471)) ^ (-689072682);
                        viewOnClickListenerC17541 = this;
                    }
                    break;
                case 614773935:
                case 1586458420:
                    if ((i15 + 1) - i14 > 0) {
                        iM2566 = (C2105.m6981("ܳ᩹") ^ i5) * (-53);
                        i = ((iM2566 ^ i4) * (-10967)) ^ (-1740495381);
                        i2 = 1274247173;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩶") ^ i5;
                        i = ((iM2566 ^ i4) * 12443) ^ (-1464062687);
                        i2 = 294272830;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 637900955:
                case 746017529:
                    c20365.m46684();
                    c20364 = viewOnClickListenerC2040.f6815.f10837;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("֨᩷") ^ i4;
                        i = ((iM2566 ^ i5) * 25317) ^ 1751648910;
                        i2 = 1716503712;
                    } else {
                        iM2566 = C0630.m2566("۠ۢ") ^ i5;
                        i = ((iM2566 ^ i4) * 8761) ^ (-960493095);
                        i2 = -197980337;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                default:
                    if (C1773.m5908() <= 0) {
                        iM2566 = C0630.m2566("֨᩷") ^ i4;
                        i = ((iM2566 ^ i5) * 25317) ^ 1751648910;
                        i2 = 1716503712;
                    } else {
                        iM2566 = C2105.m6981("ۙܶ") ^ i4;
                        i = ((iM2566 ^ i5) * (-26267)) ^ (-155768716);
                        i2 = 1708779508;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC17541(ViewOnClickListenerC2040 viewOnClickListenerC2040, CheckedTextView checkedTextView, DialogInterfaceC0206 dialogInterfaceC0206) {
        int i = 1170848397;
        int i2 = C4075.f12947;
        int i3 = C1294.f4556;
        int iM6981 = C2105.m6981("۟᩷") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-19907)) ^ (-1253854884);
        int i5 = 1233780679;
        while (true) {
            i = ((((i ^ i2) * 1979) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1994298758:
                case 562657687:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("᩸۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3113)) ^ (-259298280);
                        i5 = 1974858131;
                    } else {
                        iM6981 = C0630.m2566("۫ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32745) ^ 383969389;
                        i5 = 1091394565;
                    }
                    break;
                case -1964193465:
                case 904336668:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("ܺ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-32711)) ^ (-571470581);
                        i5 = 44739886;
                    } else {
                        iM6981 = C0630.m2566("ۡۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9071) ^ (-1795993845);
                        i5 = 602022343;
                    }
                    break;
                case -1963899251:
                case 1170905294:
                    if (C0422.f1886 > 0) {
                        iM6981 = C0630.m2566("ܳܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1185)) ^ 776187415;
                        i5 = -1422777836;
                    } else {
                        iM6981 = C2105.m6981("᩸۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3113)) ^ (-259298280);
                        i5 = 1974858131;
                    }
                    break;
                case -1702446502:
                case 1749567341:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ܺ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-32711)) ^ (-571470581);
                        i5 = 44739886;
                    } else {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18519)) ^ 1005559910;
                        i5 = 1151621686;
                    }
                    break;
                case -1550648377:
                case 389907237:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("ܳܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1185)) ^ 776187415;
                        i5 = -1422777836;
                    } else {
                        iM6981 = C0630.m2566("ۤۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18085) ^ 1507256420;
                        i5 = -1631390930;
                    }
                    break;
                case -1413878724:
                case 1214954503:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18519)) ^ 1005559910;
                        i5 = 1151621686;
                    } else {
                        iM6981 = (C0630.m2566("ܺۜ") + i2) * 63;
                        i4 = ((iM6981 ^ i3) * 4843) ^ 1348648045;
                        i5 = -1717586205;
                    }
                    break;
                case -1384122153:
                case -427710828:
                    this.f53587 = viewOnClickListenerC2040;
                    this.f53588 = checkedTextView;
                    if (C3245.m9925() != 0) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18519)) ^ 1005559910;
                        i5 = 1151621686;
                    } else {
                        iM6981 = C2105.m6981("ۡۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25235)) ^ (-894773869);
                        i5 = -1695580372;
                    }
                    break;
                case -983480291:
                case 434164396:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18519)) ^ 1005559910;
                        i5 = 1151621686;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-24153)) ^ (-1056157116);
                        i5 = -1418148577;
                    }
                    break;
                case -945519025:
                case 1858342971:
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("ۖ᩸") ^ i2) * 27;
                        i4 = ((iM6981 ^ i3) * (-30429)) ^ (-293337842);
                        i5 = 2018716210;
                    } else {
                        iM6981 = C0630.m2566("ܳܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1185)) ^ 776187415;
                        i5 = -1422777836;
                    }
                    break;
                case -604512768:
                case -301655353:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (C0630.m2566("۫ܽ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i2) * 18625) ^ (-1903573776);
                        i5 = 1095273010;
                    } else {
                        iM6981 = (C0630.m2566("ۨۖ") ^ i2) * 123;
                        i4 = ((iM6981 ^ i3) * (-18383)) ^ (-2071519492);
                        i5 = -940598360;
                    }
                    break;
                case -509192032:
                case -34743496:
                    C0422.m1963();
                    throw new RuntimeException();
                case -340799482:
                case 662811720:
                    C3746.m11369();
                    iM6981 = C2105.m6981("᩸۫") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-3113)) ^ (-259298280);
                    i5 = 1974858131;
                    break;
                case 74664428:
                case 2117896613:
                    if (C0483.m2121()) {
                        iM6981 = (i2 - C0630.m2566("ܺᩴ")) * 41;
                        i4 = ((iM6981 ^ i3) * (-12817)) ^ (-1675941786);
                        i5 = -136001639;
                    } else {
                        iM6981 = C0630.m2566("ܺ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-32711)) ^ (-571470581);
                        i5 = 44739886;
                    }
                    break;
                case 504230447:
                case 1140065114:
                    this.f53586 = dialogInterfaceC0206;
                    return;
                case 835361137:
                case 1149892886:
                    if (C3746.m11369() >= 0) {
                        iM6981 = C2105.m6981("᩸۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3113)) ^ (-259298280);
                        i5 = 1974858131;
                    } else {
                        iM6981 = (C2105.m6981("ۖ᩵") + i3) * 27;
                        i4 = ((iM6981 ^ i2) * 20015) ^ 353607358;
                        i5 = 415255221;
                    }
                    break;
                default:
                    if (!C1005.f3721) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18519)) ^ 1005559910;
                        i5 = 1151621686;
                    } else {
                        iM6981 = C2105.m6981("᩸۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3113)) ^ (-259298280);
                        i5 = 1974858131;
                    }
                    break;
            }
        }
    }
}
