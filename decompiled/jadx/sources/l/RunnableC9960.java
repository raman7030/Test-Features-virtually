package l;

import android.app.Activity;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9960 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30074;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30075;

    public /* synthetic */ RunnableC9960(int i, Object obj, Object obj2) {
        int i2 = -314414345;
        int i3 = C1128.f4106;
        int i4 = C3911.f12484;
        this.f30074 = i;
        this.f30075 = obj;
        this.f30073 = obj2;
        int iM2566 = (C0630.m2566("۟ۧ") ^ i3) * 9;
        int i5 = ((iM2566 ^ i4) * 7695) ^ (-547847805);
        int i6 = -315342254;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i4) * 14919) >> 31));
            switch (i2) {
                case -1583349902:
                case 45494506:
                    if (C1005.f3721) {
                        iM2566 = (C0630.m2566("ܽ᩺") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM2566 ^ i3) * 25303) ^ (-17042821);
                        i6 = 757342737;
                        continue;
                    } else {
                        iM2566 = C2105.m6981("ۧۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-4415)) ^ 1040397955;
                        i6 = 483722684;
                    }
                    break;
                case -1081540301:
                case -582153425:
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("۟ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-12251)) ^ (-1126431553);
                        i6 = -486990900;
                    }
                    break;
                case -684457467:
                case 568233453:
                    C7811.m20844();
                    RunnableC3474.m10630();
                    throw new RuntimeException();
                case -205488436:
                case 348903911:
                    C1047.m3599();
                    C3911.m11924();
                    break;
                case 68871680:
                case 1323335723:
                    C22628.m50615();
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("ۗܰ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2566 ^ i4) * (-29695)) ^ (-940904473);
                        i6 = -1916870635;
                    }
                    break;
                case 340909734:
                case 1187533418:
                    if (C1005.f3721) {
                        iM2566 = (i4 - C2105.m6981("᩺۬")) * (-71);
                        i5 = ((iM2566 ^ i3) * 20503) ^ (-311009511);
                        i6 = 715716004;
                    }
                    break;
                default:
                    return;
            }
            iM2566 = C2105.m6981("᩹֨") ^ i3;
            i5 = ((iM2566 ^ i4) * 31603) ^ (-958593154);
            i6 = -541900926;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x035a A[PHI: r18
      0x035a: PHI (r18v17 int) = (r18v13 int), (r18v18 int) binds: [B:105:0x0358, B:78:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x038c A[PHI: r18
      0x038c: PHI (r18v37 int) = (r18v12 int), (r18v38 int) binds: [B:109:0x038a, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x040e A[PHI: r18
      0x040e: PHI (r18v30 int) = (r18v9 int), (r18v29 int), (r18v31 int) binds: [B:121:0x040c, B:26:0x00ab, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x0440 A[PHI: r18
      0x0440: PHI (r18v34 int) = (r18v8 int), (r18v10 int), (r18v27 int), (r18v35 int) binds: [B:125:0x043e, B:117:0x03ee, B:29:0x00b3, B:16:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:83:0x022c A[PHI: r6 r7 r18
      0x022c: PHI (r6v4 java.io.InputStream) = (r6v3 java.io.InputStream), (r6v1 java.io.InputStream), (r6v1 java.io.InputStream), (r6v1 java.io.InputStream) binds: [B:82:0x022a, B:34:0x00bf, B:32:0x00bb, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r7v4 android.os.ParcelFileDescriptor$AutoCloseOutputStream) = 
      (r7v3 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
      (r7v1 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
      (r7v1 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
      (r7v1 android.os.ParcelFileDescriptor$AutoCloseOutputStream)
     binds: [B:82:0x022a, B:34:0x00bf, B:32:0x00bb, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r18v28 int) = (r18v16 int), (r18v25 int), (r18v26 int), (r18v29 int) binds: [B:82:0x022a, B:34:0x00bf, B:32:0x00bb, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x026b A[PHI: r4 r5 r18
      0x026b: PHI (r4v4 l.ܶۛ֫) = (r4v3 l.ܶۛ֫), (r4v1 l.ܶۛ֫), (r4v1 l.ܶۛ֫), (r4v1 l.ܶۛ֫), (r4v1 l.ܶۛ֫) binds: [B:88:0x0269, B:32:0x00bb, B:29:0x00b3, B:19:0x007f, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:88:0x0269, B:32:0x00bb, B:29:0x00b3, B:19:0x007f, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r18v36 int) = (r18v15 int), (r18v26 int), (r18v27 int), (r18v33 int), (r18v38 int) binds: [B:88:0x0269, B:32:0x00bb, B:29:0x00b3, B:19:0x007f, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.᩸ۛ֫] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r2;
        ?? r3 = 0;
        Object obj = null;
        C15036 c15036 = null;
        int i7 = 0;
        InputStream inputStream = null;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = null;
        long j = 0;
        InterfaceC5627 interfaceC5627 = null;
        Throwable th = null;
        Throwable th2 = null;
        Object obj2 = null;
        Object obj3 = null;
        int i8 = 1218538407;
        int i9 = C0422.f1886;
        int i10 = C3537.f11231;
        int iM2567 = (C0630.m2566("ۜۧ") ^ i10) * 25;
        int i11 = ((iM2567 ^ i9) * (-11177)) ^ 2070201920;
        int i12 = iM2567 ^ (-263410889);
        int i13 = 0;
        while (true) {
            int i14 = i12 ^ (i11 & (((i8 ^ i9) * (-12913)) >> 31));
            switch (i14) {
                case -2106371629:
                case -1686142102:
                    ((InterfaceC7305) obj).mo10987((C10211) r3);
                    return;
                case -2070495512:
                case -690878887:
                    i = i14;
                    if (inputStream != null) {
                        iM2566 = C0630.m2566("֡֫") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-14607)) ^ (-383886464);
                        i4 = 857321936;
                        r2 = r3;
                    } else {
                        iM2566 = (C2105.m6981("ۗۧ") + i9) * 33;
                        i3 = ((iM2566 ^ i10) * 32433) ^ (-1713585556);
                        i4 = -1970049724;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1955939602:
                case 1350859718:
                    i = i14;
                    int i15 = this.f30074;
                    if (C5695.f17556 >= 0) {
                        i13 = i15;
                        iM2566 = (i9 - C2105.m6981("᩹ۨ")) * 123;
                        i3 = ((iM2566 ^ i10) * 17273) ^ (-316579311);
                        i4 = -927108266;
                        r2 = r3;
                        i2 = i;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        r3 = r2;
                    } else {
                        int iM2568 = C0630.m2566("ۛ۫") ^ i9;
                        i13 = i15;
                        i11 = ((iM2568 ^ i10) * (-12175)) ^ (-1577792027);
                        i2 = i;
                        i12 = iM2568 ^ 850554580;
                        r3 = r3;
                    }
                    i8 = i2;
                    break;
                case -1911062334:
                case 1252104391:
                    i = i14;
                    C0714.m2805();
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-30417)) ^ (-1532212673);
                        i4 = 1866090778;
                        r2 = r3;
                    } else {
                        iM2566 = C0630.m2566("ۗܶ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-14235)) ^ 804004954;
                        i4 = 36096295;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1822912595:
                case 1069998224:
                    i = i14;
                    C11340.m28031();
                    if (C3683.f11629 < 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-14235)) ^ 804004954;
                        i4 = 36096295;
                        r2 = r3;
                    } else {
                        iM2566 = C0630.m2566("۟᩵") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-6973)) ^ (-1797293454);
                        i4 = 1605264382;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1740161122:
                case -1626264442:
                    i = i14;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("֡ۚ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-22947)) ^ 327679620;
                        i4 = 1845676907;
                        r2 = r3;
                    } else {
                        iM2566 = C2105.m6981("ۛᩳ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-15947)) ^ 934665075;
                        i4 = 1321969344;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1645196360:
                case 1252779215:
                    C2405.m7786((Activity) obj, (C4294) r3);
                    return;
                case -1619901326:
                case -1452877426:
                    i = i14;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ۘۛ") ^ i9;
                        i3 = ((iM2566 ^ i10) * 29179) ^ (-472538679);
                        i4 = -680034842;
                        r2 = r3;
                    } else {
                        iM2566 = C0630.m2566("ۜܿ") ^ i9;
                        i3 = ((iM2566 ^ i10) * 31891) ^ (-2075400134);
                        i4 = 1453430076;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1537839731:
                case 1051484326:
                    C2171.m7182((Context) obj, (C14310) r3);
                    return;
                case -1494952785:
                case 600818445:
                    i = i14;
                    C3432.m10477();
                    iM2566 = C0630.m2566("ۤۖ") ^ i9;
                    i3 = ((iM2566 ^ i10) * (-30417)) ^ (-1532212673);
                    i4 = 1866090778;
                    r2 = r3;
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1484092806:
                case 1947861877:
                    i = i14;
                    inputStream = (InputStream) obj;
                    autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) r3;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-30417)) ^ (-1532212673);
                        i4 = 1866090778;
                        r2 = r3;
                    } else {
                        iM2566 = (i9 - C0630.m2566("۟ܺ")) * (-7);
                        i3 = ((iM2566 ^ i10) * 25611) ^ (-25992335);
                        i4 = 873167944;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1315635615:
                case -492828240:
                    i = i14;
                    try {
                        C2272.m7512(inputStream);
                        iM2566 = (C2105.m6981("ۗۧ") + i9) * 33;
                        i3 = ((iM2566 ^ i10) * 32433) ^ (-1713585556);
                        i4 = -1970049724;
                        r2 = r3;
                        i2 = i;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        r3 = r2;
                        i8 = i2;
                    } catch (Throwable th3) {
                        int iM2569 = C0630.m2566("ۘܰ") ^ i10;
                        i5 = ((iM2569 ^ i9) * 30527) ^ (-384429882);
                        i6 = iM2569 ^ (-1225448444);
                        obj3 = th3;
                        i11 = i5;
                        i8 = i;
                        i12 = i6;
                    }
                    break;
                case -1244255838:
                case 119310008:
                    i = i14;
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-14235)) ^ 804004954;
                        i4 = 36096295;
                        r2 = r3;
                    } else {
                        iM2566 = (C0630.m2566("ۨᩴ") + i9) * 51;
                        i3 = ((iM2566 ^ i10) * 3197) ^ 670499777;
                        i4 = -1726645852;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -1078234504:
                case 1527122038:
                    if (C2272.f7362) {
                        i = i14;
                        iM2566 = C0630.m2566("ۡܰ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 20563) ^ (-1949599297);
                        i4 = -1414218130;
                        r2 = r3;
                    } else {
                        iM2566 = (C2105.m6981("۫᩸") ^ i9) * (-35);
                        i = i14;
                        i3 = ((iM2566 ^ i10) * 4657) ^ 2058146144;
                        i4 = -408382968;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -996849018:
                case -158496326:
                    i = i14;
                    throw th;
                case -811801116:
                case -81629515:
                    C3663.m11168();
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("۫᩸") ^ i9) * (-35);
                        i = i14;
                        i3 = ((iM2566 ^ i10) * 4657) ^ 2058146144;
                        i4 = -408382968;
                        r2 = r3;
                    } else {
                        i = i14;
                        iM2566 = C0630.m2566("᩵ۨ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 19) ^ (-135406410);
                        i4 = -1542918933;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -719008288:
                case 539695509:
                    i = i14;
                    try {
                        C3019.m9251(autoCloseOutputStream);
                        iM2566 = (C0630.m2566("֫ۗ") + i10) * (-97);
                        i3 = ((iM2566 ^ i9) * (-16889)) ^ 1484438097;
                        i4 = 1275618924;
                        r2 = r3;
                        i2 = i;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        r3 = r2;
                        i8 = i2;
                    } catch (Throwable th4) {
                        int iM6981 = (C2105.m6981("ܽ֨") + i9) * (-101);
                        i5 = ((iM6981 ^ i10) * 817) ^ (-839706710);
                        i6 = iM6981 ^ 1521678665;
                        obj2 = th4;
                        i11 = i5;
                        i8 = i;
                        i12 = i6;
                    }
                    break;
                case -601471199:
                case 306511117:
                    i = i14;
                    j = -1;
                    interfaceC5627 = null;
                    iM2566 = (C0630.m2566("᩷ۧ") ^ i9) * 45;
                    i3 = ((iM2566 ^ i10) * (-22685)) ^ (-1550699746);
                    i4 = 1736345752;
                    r2 = r3;
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -519181419:
                case 770464167:
                    ((C20317) obj).m46623((String) r3);
                    return;
                case -502865064:
                case 2047700555:
                    i = i14;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ۤۖ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-30417)) ^ (-1532212673);
                        i4 = 1866090778;
                        r2 = r3;
                    } else {
                        iM2566 = C2105.m6981("ۙۜ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-25991)) ^ (-976379254);
                        i4 = -227142556;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -500732407:
                case 1885419277:
                    i = i14;
                    try {
                        C0714.m2815(th, obj2);
                        iM2566 = (C0630.m2566("֫ۗ") + i10) * (-97);
                        i3 = ((iM2566 ^ i9) * (-16889)) ^ 1484438097;
                        i4 = 1275618924;
                        r2 = r3;
                    } catch (Throwable th5) {
                        th2 = th5;
                        iM2566 = C0630.m2566("᩻᩻") ^ i9;
                        i3 = ((iM2566 ^ i10) * 14545) ^ 1097741226;
                        i4 = -835057096;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -368745141:
                case 710538917:
                    i = i14;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ۡܰ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 20563) ^ (-1949599297);
                        i4 = -1414218130;
                        r2 = r3;
                    } else {
                        iM2566 = (C0630.m2566("ۧۗ") ^ i10) * 101;
                        i3 = ((iM2566 ^ i9) * (-13783)) ^ (-1506161887);
                        i4 = 194602336;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -270693710:
                case 1647833810:
                    i = i14;
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("᩵ۨ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 19) ^ (-135406410);
                        i4 = -1542918933;
                        r2 = r3;
                    } else {
                        iM2566 = C2105.m6981("֡ۡ") ^ i9;
                        i3 = ((iM2566 ^ i10) * (-6267)) ^ 2063324751;
                        i4 = -2013603097;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case -235058232:
                case 993914506:
                    C5292.m15218((C5292) obj, (String[]) r3);
                    return;
                case 128103515:
                case 2105126915:
                    return;
                case 128167589:
                case 1657311422:
                    i = i14;
                    try {
                        C14176.m33825(inputStream, autoCloseOutputStream, j, interfaceC5627);
                        C3537.m10752(autoCloseOutputStream);
                        C2272.m7512(inputStream);
                        iM2566 = (i9 - C2105.m6981("ܽܺ")) * (-75);
                        i3 = ((iM2566 ^ i10) * 7807) ^ (-2074375846);
                        i4 = -1258975761;
                        r2 = r3;
                        i2 = i;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        r3 = r2;
                        i8 = i2;
                    } catch (Throwable th6) {
                        int iM6982 = C2105.m6981("᩹ܳ") ^ i10;
                        i5 = ((iM6982 ^ i9) * (-20093)) ^ 347747142;
                        i6 = iM6982 ^ 77527664;
                        th = th6;
                        i11 = i5;
                        i8 = i;
                        i12 = i6;
                    }
                    break;
                case 170762971:
                case 1704742110:
                    i = i14;
                    String str = C11914.f35616;
                    if (C3746.m11369() >= 0) {
                        iM2566 = C0630.m2566("ۘۛ") ^ i9;
                        i3 = ((iM2566 ^ i10) * 29179) ^ (-472538679);
                        i4 = -680034842;
                        r2 = r3;
                    } else {
                        iM2566 = (C0630.m2566("֡ۢ") ^ i10) * (-125);
                        i3 = ((iM2566 ^ i9) * (-30703)) ^ 1321443116;
                        i4 = -1978373364;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 287231292:
                case 1999161365:
                    i = i14;
                    c15036 = (C15036) obj;
                    i7 = c15036.f45822;
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ۙۜ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-25991)) ^ (-976379254);
                        i4 = -227142556;
                        r2 = r3;
                    } else {
                        iM2566 = (i9 - C2105.m6981("ۧ᩶")) * 81;
                        i3 = ((iM2566 ^ i10) * (-6145)) ^ 1397536345;
                        i4 = -750354025;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 449663257:
                case 1748649095:
                    i = i14;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۙۜ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-25991)) ^ (-976379254);
                        i4 = -227142556;
                        r2 = r3;
                    } else {
                        iM2566 = C0630.m2566("ۡܰ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 20563) ^ (-1949599297);
                        i4 = -1414218130;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 828547493:
                case 1914274932:
                    r3.mo21138(i7, c15036.f45821);
                    return;
                case 922947867:
                case 1847278771:
                    i = i14;
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ۡܰ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 20563) ^ (-1949599297);
                        i4 = -1414218130;
                        r2 = r3;
                    } else {
                        iM2566 = (C0630.m2566("ۨ᩷") + i10) * (-127);
                        i3 = ((iM2566 ^ i9) * 28043) ^ 875905192;
                        i4 = 459676395;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 1086592033:
                case 2010240617:
                    C3432.m10477();
                    C3663.m11168();
                    return;
                case 1313476062:
                case 1349343644:
                    i = i14;
                    Object obj4 = this.f30073;
                    obj = this.f30075;
                    switch (i13) {
                        case 0:
                            iM2566 = C2105.m6981("ۘ᩻") ^ i10;
                            i3 = ((iM2566 ^ i9) * (-30091)) ^ 997761151;
                            i4 = 1279895889;
                            r2 = obj4;
                            break;
                        case 1:
                            iM2566 = (i10 - C0630.m2566("ܽ۠")) * 71;
                            i3 = ((iM2566 ^ i9) * 11177) ^ (-532578213);
                            i4 = 348005463;
                            r2 = obj4;
                            break;
                        case 2:
                            iM2566 = (i9 - C0630.m2566("ᩴܳ")) * 53;
                            i3 = ((iM2566 ^ i10) * (-11411)) ^ 597857993;
                            i4 = 1596019519;
                            r2 = obj4;
                            break;
                        case 3:
                            iM2566 = (i10 - C2105.m6981("ۘ᩶")) * (-3);
                            i3 = ((iM2566 ^ i9) * (-28675)) ^ 2000295686;
                            i4 = 761080966;
                            r2 = obj4;
                            break;
                        case 4:
                            iM2566 = C2105.m6981("᩶ۜ") ^ i10;
                            i3 = ((iM2566 ^ i9) * 14153) ^ (-248427348);
                            i4 = 1405707967;
                            r2 = obj4;
                            break;
                        case 5:
                            iM2566 = (i9 - C0630.m2566("᩵ۙ")) * 37;
                            i3 = ((iM2566 ^ i10) * (-545)) ^ (-1682831481);
                            i4 = 1752460377;
                            r2 = obj4;
                            break;
                        default:
                            iM2566 = C0630.m2566("ۛۤ") ^ i10;
                            i3 = ((iM2566 ^ i9) * 21619) ^ 1146225012;
                            i4 = 817118390;
                            r2 = obj4;
                            break;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 1618847357:
                case 1733096214:
                    i = i14;
                    try {
                        C0714.m2815(th2, obj3);
                        iM2566 = (C2105.m6981("ۗۧ") + i9) * 33;
                        i3 = ((iM2566 ^ i10) * 32433) ^ (-1713585556);
                        i4 = -1970049724;
                        r2 = r3;
                    } catch (IOException unused) {
                        iM2566 = (i9 - C2105.m6981("ܽܺ")) * (-75);
                        i3 = ((iM2566 ^ i10) * 7807) ^ (-2074375846);
                        i4 = -1258975761;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 1886319796:
                case 2032853186:
                    i = i14;
                    C11340.m28031();
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ۙۜ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-25991)) ^ (-976379254);
                        i4 = -227142556;
                        r2 = r3;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩹ۨ")) * 123;
                        i3 = ((iM2566 ^ i10) * 17273) ^ (-316579311);
                        i4 = -927108266;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                case 1934927244:
                case 1974655922:
                    C1128.m3851();
                    i = i14;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C2105.m6981("ۙۜ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-25991)) ^ (-976379254);
                        i4 = -227142556;
                        r2 = r3;
                    } else {
                        iM2566 = C2105.m6981("֡ۚ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-22947)) ^ 327679620;
                        i4 = 1845676907;
                        r2 = r3;
                    }
                    i2 = i;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    r3 = r2;
                    i8 = i2;
                    break;
                default:
                    i = i14;
                    throw th2;
            }
        }
    }
}
