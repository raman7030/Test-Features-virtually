package p067l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.function.IntConsumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۤۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11952 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۘۗܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f82120 = {2999, 7596, -1499, -14003, 1950, 244, 7621, -13910, -15449, 7196, -4887, -16135, -12995, 4656, -16678, -31819, -31087, 6399, 11100, 13397, -11145, -15805, -11949, 13266};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ViewOnClickListenerC7928 f33333;

    /* JADX INFO: renamed from: ܳ */
    public Object f33334;

    /* JADX INFO: renamed from: ᩻ */
    public int f33335;

    public C11952(ViewOnClickListenerC7928 viewOnClickListenerC7928) {
        C10893 c10893 = null;
        int i = -1969688798;
        int i2 = AbstractC0942.f81890;
        int i3 = C1404.f82149;
        this.f33333 = viewOnClickListenerC7928;
        int iM55680 = C0873.m55680("ᩴܺ") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-15081)) ^ (-595892087);
        int i5 = -49162471;
        while (true) {
            i = ((((i ^ i2) * 15963) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1916595607:
                case -752250540:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("ܳܰ") ^ i3) * (-105);
                        i4 = ((iM55680 ^ i2) * 4889) ^ 450655809;
                        i5 = 1120295501;
                    } else {
                        iM55680 = (C0873.m55680("۟ܰ") + i2) * (-85);
                        i4 = ((iM55680 ^ i3) * Scalar25519.f81541L4) ^ 2066743296;
                        i5 = -1057456299;
                    }
                    break;
                case -1812706379:
                case 691587939:
                    c10893 = C10893.f30179;
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i2 - C0946.m55979("֨ۘ")) * (-87);
                        i4 = ((iM55680 ^ i3) * (-24587)) ^ (-901757724);
                        i5 = 1558534280;
                    } else {
                        iM55680 = C0873.m55680("֨۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7815)) ^ (-880676480);
                        i5 = -638181528;
                    }
                    break;
                case -1786769745:
                case -1196362374:
                    C0946.m55980();
                    if (C0967.f81910 < 0) {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27391)) ^ 635389762;
                        i5 = -622080171;
                    } else {
                        iM55680 = (i2 - C0946.m55979("֨ۘ")) * (-87);
                        i4 = ((iM55680 ^ i3) * (-24587)) ^ (-901757724);
                        i5 = 1558534280;
                    }
                    break;
                case -1562175895:
                case 667220434:
                    this.f33334 = c10893;
                    return;
                case -1133906254:
                case 1693791412:
                    if (C0955.m56025()) {
                        iM55680 = (C0946.m55979("᩷۟") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 1711) ^ 331608894;
                        i5 = -1460287739;
                    } else {
                        iM55680 = C0946.m55979("ۗܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2457) ^ 134152042;
                        i5 = 1992944147;
                    }
                    break;
                case -880292972:
                case 247534026:
                    C0890.m55740();
                    RunnableC0938.m55938();
                    iM55680 = (i2 - C0946.m55979("֨ۘ")) * (-87);
                    i4 = ((iM55680 ^ i3) * (-24587)) ^ (-901757724);
                    i5 = 1558534280;
                    break;
                case -802375031:
                case 1998147752:
                    C1017.m56187();
                    if (C0866.f81837 < 0) {
                        iM55680 = (C0873.m55680("ۛ᩸") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-3625)) ^ 231808464;
                        i5 = -1160177338;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27391)) ^ 635389762;
                        i5 = -622080171;
                    }
                    break;
                case -794657725:
                case 1261833412:
                    C0949.m56012();
                    C0873.m55678();
                    throw new RuntimeException();
                case -326727253:
                case 232558179:
                    if (C0992.m56107() <= 0) {
                        iM55680 = (C0873.m55680("ۛ᩸") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-3625)) ^ 231808464;
                        i5 = -1160177338;
                    } else {
                        iM55680 = C0946.m55979("ۙܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27579) ^ (-888305302);
                        i5 = -1353445132;
                    }
                    break;
                case -105692141:
                case 670445140:
                    if (C0930.m55885() <= 0) {
                        iM55680 = (C0946.m55979("᩷۟") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 1711) ^ 331608894;
                        i5 = -1460287739;
                    } else {
                        iM55680 = C0946.m55979("᩻ۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 711) ^ 629411719;
                        i5 = 117476769;
                    }
                    break;
                case -101891479:
                case 354608233:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("ܳܰ") ^ i3) * (-105);
                        i4 = ((iM55680 ^ i2) * 4889) ^ 450655809;
                        i5 = 1120295501;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩺ܳ")) * 25;
                        i4 = ((iM55680 ^ i2) * (-18597)) ^ (-187845106);
                        i5 = -1535511921;
                    }
                    break;
                case -100776947:
                case 918825600:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ۛ᩸") + i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-3625)) ^ 231808464;
                        i5 = -1160177338;
                    } else {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31931)) ^ (-1951353628);
                        i5 = -1885120729;
                    }
                    break;
                case 12259794:
                case 330631940:
                    if (C1194.m56396() <= 0) {
                        iM55680 = (C0873.m55680("ܳܰ") ^ i3) * (-105);
                        i4 = ((iM55680 ^ i2) * 4889) ^ 450655809;
                        i5 = 1120295501;
                    } else {
                        iM55680 = C0873.m55680("۫ᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29459)) ^ (-80504555);
                        i5 = -1273142212;
                    }
                    break;
                case 1041214492:
                case 1535789919:
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("ܳܰ") ^ i3) * (-105);
                        i4 = ((iM55680 ^ i2) * 4889) ^ 450655809;
                        i5 = 1120295501;
                    } else {
                        iM55680 = C0873.m55680("ۡۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13131) ^ 211464900;
                        i5 = -1357310074;
                    }
                    break;
                case 1049162438:
                case 1704985330:
                    if (C1124.f82007 < 0) {
                        iM55680 = (C0873.m55680("ܳܰ") ^ i3) * (-105);
                        i4 = ((iM55680 ^ i2) * 4889) ^ 450655809;
                        i5 = 1120295501;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27391)) ^ 635389762;
                        i5 = -622080171;
                    }
                    break;
                default:
                    if (C1024.f81946) {
                        iM55680 = (i2 - C0946.m55979("֨ۘ")) * (-87);
                        i4 = ((iM55680 ^ i3) * (-24587)) ^ (-901757724);
                        i5 = 1558534280;
                    } else {
                        iM55680 = C0946.m55979("֫ܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28227)) ^ 334707202;
                        i5 = 845090268;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0452 A[PHI: r2 r9 r12 r13 r20 r21 r22 r23 r27 r29
      0x0452: PHI (r2v5 l.ۛۚۡ) = (r2v3 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r9v46 java.lang.Object) = (r9v32 java.lang.Object), (r9v33 java.lang.Object), (r9v34 java.lang.Object), (r9v49 java.lang.Object) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r12v57 int) = (r12v31 int), (r12v32 int), (r12v33 int), (r12v58 int) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r13v45 int) = (r13v24 int), (r13v25 int), (r13v26 int), (r13v46 int) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r20v27 l.᩵ۚۢ) = (r20v19 l.᩵ۚۢ), (r20v20 l.᩵ۚۢ), (r20v21 l.᩵ۚۢ), (r20v28 l.᩵ۚۢ) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r21v28 int) = (r21v20 int), (r21v21 int), (r21v22 int), (r21v29 int) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r22v26 short[]) = (r22v18 short[]), (r22v19 short[]), (r22v20 short[]), (r22v27 short[]) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r23v34 short[]) = (r23v20 short[]), (r23v21 short[]), (r23v22 short[]), (r23v35 short[]) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r27v40 android.view.ViewGroup) = 
      (r27v30 android.view.ViewGroup)
      (r27v31 android.view.ViewGroup)
      (r27v32 android.view.ViewGroup)
      (r27v41 android.view.ViewGroup)
     binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x0452: PHI (r29v33 int) = (r29v24 int), (r29v25 int), (r29v26 int), (r29v34 int) binds: [B:84:0x0438, B:79:0x0401, B:77:0x03e5, B:26:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ViewGroup viewGroup;
        int i;
        Object obj;
        C20671 c20671;
        int i2;
        int i3;
        C20671 c20672;
        short[] sArr;
        C20671 c20673;
        int iM55979;
        int i4;
        C20671 c20674;
        int i5;
        int iM559710;
        int i6;
        int i7;
        ViewGroup viewGroup2;
        int iM559711;
        int i8;
        int i9;
        Object obj2;
        short[] sArr2;
        int i10;
        int i11;
        int i12;
        int iM55680;
        int iM55681;
        int i13;
        int i14;
        int i15 = 963467907;
        int i16 = C0912.f81867;
        int i17 = C0949.f81897;
        int iM559712 = (C0946.m55979("֨ܺ") ^ i16) * (-61);
        int i18 = ((iM559712 ^ i17) * (-18049)) ^ (-458263558);
        int i19 = iM559712 ^ (-288428052);
        ViewGroup viewGroup3 = null;
        Object[] objArr = null;
        String strM56325 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        final ViewOnClickListenerC7928 viewOnClickListenerC7928 = null;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int iM559713 = 0;
        int i23 = 0;
        short s = 0;
        short s2 = 0;
        int i24 = 0;
        int i25 = 0;
        int iM55682 = 0;
        C20671 c20675 = null;
        final DialogInterfaceC2564 dialogInterfaceC2564M55669 = null;
        short[] sArr5 = null;
        Object obj3 = null;
        final C13963 c13963 = null;
        final ?? r4 = 0;
        int i26 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * 9743) >> 31));
            switch (i15) {
                case -1959582615:
                case 1368148307:
                    viewGroup = viewGroup3;
                    i = i22;
                    obj = obj3;
                    c20671 = c20675;
                    C0967.m56076(c20671, iM55682 ^ i, obj);
                    dialogInterfaceC2564M55669 = RunnableC0871.m55669(c20671);
                    sArr4 = f82120;
                    if (C0937.f81884) {
                        iM55680 = (C0946.m55979("ܽᩳ") + i16) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i12 = ((iM55680 ^ i17) * 13051) ^ 1207077243;
                        i11 = -1452356818;
                    } else {
                        iM55680 = (C0873.m55680("ۡۤ") + i17) * (-59);
                        i12 = ((iM55680 ^ i16) * 17383) ^ 1935949444;
                        i11 = 1104546462;
                    }
                    i10 = iM55680 ^ i11;
                    c20675 = c20671;
                    obj3 = obj;
                    i18 = i12;
                    viewGroup3 = viewGroup;
                    i22 = i;
                    r4 = r4;
                    i19 = i10;
                    break;
                case -1900430250:
                case 14752702:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i24 = i24;
                    i25 = i25;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    c20675 = c20675;
                    if (viewOnClickListenerC7928.isDestroyed()) {
                        iM559711 = C0873.m55680("ᩳܺ") ^ i16;
                        i8 = ((iM559711 ^ i17) * 26713) ^ 1466176751;
                        i9 = -736501290;
                    } else {
                        iM559711 = (C0946.m55979("ܿۖ") ^ i16) * (-83);
                        i8 = ((iM559711 ^ i17) * (-26265)) ^ 1008298649;
                        i9 = -1267842319;
                    }
                    int i27 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i27;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case -1878500140:
                case -630932399:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    obj2 = obj3;
                    sArr2 = sArr4;
                    i26 = this.f33335;
                    r4 = this.f33334;
                    c13963 = new C13963(viewOnClickListenerC7928);
                    int i28 = DialogInterfaceC2564.f4230;
                    if (C0912.f81867 > 0) {
                        C20671 c20676 = new C20671(viewOnClickListenerC7928);
                        sArr3 = f82120;
                        i24 = 1;
                        i25 = 3;
                        if (C0890.f81849 == 0) {
                            int iM559714 = (C0946.m55979("ۛ۬") ^ i16) * 89;
                            int i29 = ((iM559714 ^ i17) * 21973) ^ 2101026048;
                            i10 = iM559714 ^ (-2078043407);
                            c20675 = c20676;
                            i18 = i29;
                            sArr4 = sArr2;
                            i22 = i22;
                            obj3 = obj2;
                            viewGroup3 = viewGroup3;
                            r4 = r4;
                            i19 = i10;
                        } else {
                            c20675 = c20676;
                            r4 = r4;
                            int iM559715 = C0946.m55979("᩶֨") ^ i16;
                            sArr4 = sArr2;
                            i22 = i22;
                            obj3 = obj2;
                            viewGroup3 = viewGroup3;
                            i19 = iM559715 ^ (-213703335);
                            i18 = ((iM559715 ^ i17) * (-4159)) ^ 1467742765;
                        }
                    } else {
                        int iM55683 = C0873.m55680("ۘۖ") ^ i16;
                        i24 = i24;
                        sArr4 = sArr2;
                        c20675 = null;
                        obj3 = obj2;
                        viewGroup3 = viewGroup3;
                        i19 = iM55683 ^ (-177445379);
                        i18 = ((iM55683 ^ i17) * 15215) ^ 1105569309;
                        i26 = i26;
                        sArr3 = sArr3;
                        i25 = i25;
                        r4 = r4;
                        i22 = i22;
                    }
                    break;
                case -1864071238:
                case 808780449:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    strM56325 = C1053.m56325(sArr5, 10, 3, i20);
                    if (C0866.f81837 < 0) {
                        iM559710 = (C0946.m55979("۫ᩳ") ^ i17) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM559710 ^ i16) * 21853) ^ 2084783994;
                        i7 = -1346391634;
                        i22 = i22;
                        viewGroup2 = viewGroup3;
                        i19 = iM559710 ^ i7;
                        i18 = i6;
                        viewGroup3 = viewGroup2;
                    } else {
                        obj2 = obj3;
                        sArr2 = sArr4;
                        r4 = r4;
                        int iM559716 = C0946.m55979("᩶֨") ^ i16;
                        sArr4 = sArr2;
                        i22 = i22;
                        obj3 = obj2;
                        viewGroup3 = viewGroup3;
                        i19 = iM559716 ^ (-213703335);
                        i18 = ((iM559716 ^ i17) * (-4159)) ^ 1467742765;
                    }
                    break;
                case -1841092139:
                case 1720878492:
                    i22 = i22;
                    viewGroup3 = (ViewGroup) dialogInterfaceC2564M55669.m3846(iM559713 ^ i23);
                    i21 = 0;
                    if (viewGroup3 != null) {
                        iM55681 = (C0873.m55680("ۤۛ") ^ i16) * (-43);
                        i13 = ((iM55681 ^ i17) * 16753) ^ (-958827363);
                        i14 = 22336584;
                    } else {
                        iM55681 = C0946.m55979("ۧ֡") ^ i17;
                        i13 = ((iM55681 ^ i16) * (-4473)) ^ (-471358941);
                        i14 = 1878272200;
                    }
                    i19 = iM55681 ^ i14;
                    i18 = i13;
                    r4 = r4;
                    i22 = i22;
                    break;
                case -1747975835:
                case 1161646663:
                    break;
                case -1673234281:
                case -1412511005:
                    View viewM56299 = C1046.m56299(viewGroup3, i21);
                    i22 = i22;
                    viewM56299.setPadding(viewM56299.getPaddingLeft(), i21, viewM56299.getPaddingRight(), viewM56299.getPaddingBottom());
                    viewGroup3 = viewGroup3;
                    iM55681 = C0946.m55979("ۧ֡") ^ i17;
                    i13 = ((iM55681 ^ i16) * (-4473)) ^ (-471358941);
                    i14 = 1878272200;
                    i19 = iM55681 ^ i14;
                    i18 = i13;
                    r4 = r4;
                    i22 = i22;
                    break;
                case -1627858469:
                case 69652255:
                    sArr4 = sArr4;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    c20674 = c20675;
                    obj3 = null;
                    c20674.m46716(new C11675(r4), (DialogInterfaceOnClickListenerC3650) null);
                    if (C1024.m56209() < 0) {
                        int iM55684 = C0873.m55680("ᩴ֫") ^ i17;
                        int i30 = ((iM55684 ^ i16) * 13817) ^ (-1063277307);
                        i5 = iM55684 ^ 900085583;
                        c20675 = c20674;
                        i18 = i30;
                        i22 = i22;
                        viewGroup2 = viewGroup3;
                        i19 = i5;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        viewGroup3 = viewGroup2;
                    } else {
                        i26 = i26;
                        sArr3 = sArr3;
                        c20675 = c20674;
                        iM559711 = (C0946.m55979("ᩳ᩹") + i16) * (-53);
                        i8 = ((iM559711 ^ i17) * (-8873)) ^ (-1999598172);
                        i9 = -888571769;
                        int i210 = iM559711 ^ i9;
                        c20675 = c20675;
                        sArr3 = sArr3;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        i25 = i25;
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        i19 = i210;
                        i18 = i8;
                        i26 = i26;
                        i24 = i24;
                    }
                    break;
                case -1545172126:
                case 454247195:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i24 = i24;
                    i25 = i25;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    c20675 = c20675;
                    viewOnClickListenerC7928 = this.f33333;
                    if (C1046.m56287(viewOnClickListenerC7928)) {
                        iM559711 = C0873.m55680("ᩳܺ") ^ i16;
                        i8 = ((iM559711 ^ i17) * 26713) ^ 1466176751;
                        i9 = -736501290;
                    } else {
                        iM559711 = (i17 - C0873.m55680("ۖ۟")) * 89;
                        i8 = ((iM559711 ^ i16) * (-30029)) ^ (-1405886181);
                        i9 = 7542019;
                    }
                    int i211 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i211;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case -1458766413:
                case 1294206680:
                    C1404.m56468();
                    if (C1124.f82007 >= 0) {
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        obj2 = obj3;
                        sArr2 = sArr4;
                        int iM55685 = C0873.m55680("ۘۖ") ^ i16;
                        i24 = i24;
                        sArr4 = sArr2;
                        c20675 = null;
                        obj3 = obj2;
                        viewGroup3 = viewGroup3;
                        i19 = iM55685 ^ (-177445379);
                        i18 = ((iM55685 ^ i17) * 15215) ^ 1105569309;
                        i26 = i26;
                        sArr3 = sArr3;
                        i25 = i25;
                        r4 = r4;
                        i22 = i22;
                    } else {
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        obj2 = obj3;
                        sArr2 = sArr4;
                        r4 = r4;
                        int iM559717 = C0946.m55979("᩶֨") ^ i16;
                        sArr4 = sArr2;
                        i22 = i22;
                        obj3 = obj2;
                        viewGroup3 = viewGroup3;
                        i19 = iM559717 ^ (-213703335);
                        i18 = ((iM559717 ^ i17) * (-4159)) ^ 1467742765;
                    }
                    break;
                case -1333082305:
                case 472834898:
                    C1044.m56286();
                    C0937.m55918();
                    break;
                case -1326471432:
                case 1046143374:
                    i20 = 40488;
                    iM559711 = C0946.m55979("ۜ۠") ^ i16;
                    i8 = ((iM559711 ^ i17) * 14333) ^ (-702291161);
                    i9 = -533951630;
                    int i212 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i212;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case -1325399914:
                case 851951400:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i24 = i24;
                    i25 = i25;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    sArr3 = sArr3;
                    c20675 = c20675;
                    if (RunnableC0938.m55924()) {
                        iM559711 = C0946.m55979("ۘۙ") ^ i17;
                        i26 = i26;
                        i8 = ((iM559711 ^ i16) * 28957) ^ (-675671102);
                        i9 = 1230900211;
                    } else {
                        i26 = i26;
                        iM559711 = C0873.m55680("ᩳܺ") ^ i16;
                        i8 = ((iM559711 ^ i17) * 26713) ^ 1466176751;
                        i9 = -736501290;
                    }
                    int i213 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i213;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case -1230864524:
                case -738802609:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    objArr = new Object[1];
                    objArr[i21] = C0912.m55836(i26);
                    sArr5 = f82120;
                    if (!C1024.f81946) {
                        iM559710 = (C0946.m55979("ۚ۟") + i16) * 127;
                        i6 = ((iM559710 ^ i17) * (-30223)) ^ 93695594;
                        i7 = -1841645818;
                        i22 = i22;
                        viewGroup2 = viewGroup3;
                        i19 = iM559710 ^ i7;
                        i18 = i6;
                        viewGroup3 = viewGroup2;
                    } else {
                        obj2 = obj3;
                        sArr2 = sArr4;
                        int iM55686 = C0873.m55680("ۘۖ") ^ i16;
                        i24 = i24;
                        sArr4 = sArr2;
                        c20675 = null;
                        obj3 = obj2;
                        viewGroup3 = viewGroup3;
                        i19 = iM55686 ^ (-177445379);
                        i18 = ((iM55686 ^ i17) * 15215) ^ 1105569309;
                        i26 = i26;
                        sArr3 = sArr3;
                        i25 = i25;
                        r4 = r4;
                        i22 = i22;
                    }
                    break;
                case -1230609257:
                case -382597762:
                    if (C0898.m55800() > 0) {
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        i2 = i24;
                        i3 = i25;
                        obj3 = obj3;
                        c20672 = c20675;
                        sArr4 = sArr4;
                        sArr = sArr3;
                        iM55979 = (i17 - C0873.m55680("ܽ۟")) * (-69);
                        c20673 = c20672;
                        i18 = ((iM55979 ^ i16) * (-8421)) ^ 733060065;
                        i4 = -1637569030;
                        i5 = iM55979 ^ i4;
                        i24 = i2;
                        c20675 = c20673;
                        sArr3 = sArr;
                        i25 = i3;
                        i22 = i22;
                        viewGroup2 = viewGroup3;
                        i19 = i5;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        viewGroup3 = viewGroup2;
                    } else {
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        obj2 = obj3;
                        sArr2 = sArr4;
                        r4 = r4;
                        int iM559718 = C0946.m55979("᩶֨") ^ i16;
                        sArr4 = sArr2;
                        i22 = i22;
                        obj3 = obj2;
                        viewGroup3 = viewGroup3;
                        i19 = iM559718 ^ (-213703335);
                        i18 = ((iM559718 ^ i17) * (-4159)) ^ 1467742765;
                    }
                    break;
                case -895567016:
                case -80168056:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    C4969.m10531(dialogInterfaceC2564M55669, C1044.m56285(viewOnClickListenerC7928, C0946.m55979(strM56325) ^ 2124979673, objArr), new IntConsumer() { // from class: l.ۡ᩵ۡ
                        {
                            int i31 = -1563207634;
                            int i32 = C1003.f81929;
                            int i33 = C0930.f81879;
                            int iM55687 = C0873.m55680("ۡ᩺") ^ i33;
                            int i34 = ((iM55687 ^ i32) * 30069) ^ (-538507341);
                            int i35 = 398560113;
                            while (true) {
                                i31 = ((((i31 ^ i32) * 205) >> 31) & i34) ^ (iM55687 ^ i35);
                                switch (i31) {
                                    case -1979867758:
                                    case -1443915639:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM55687 = (C0873.m55680("ܽۙ") ^ i33) * 45;
                                            i34 = ((iM55687 ^ i32) * (-6647)) ^ (-693076489);
                                            i35 = 1296896708;
                                        } else {
                                            iM55687 = C0873.m55680("ۗۧ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * (-30549)) ^ 1082943494;
                                            i35 = 1792235781;
                                        }
                                        break;
                                    case -1742838019:
                                    case 613730249:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55687 = C0873.m55680("ۨ᩹") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 30359) ^ 481133762;
                                            i35 = -1953091472;
                                        } else {
                                            iM55687 = C0946.m55979("ܽۖ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 13739) ^ (-1498707435);
                                            i35 = -882817958;
                                        }
                                        break;
                                    case -1641033321:
                                    case 1837102255:
                                        C0854.m55595();
                                        RunnableC1014.m56177();
                                        throw new RuntimeException();
                                    case -1578467506:
                                    case 1398036570:
                                        if (C0992.f81922 < 0) {
                                            iM55687 = C0873.m55680("ۨ᩹") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 30359) ^ 481133762;
                                            i35 = -1953091472;
                                        } else {
                                            iM55687 = (C0873.m55680("ܽۙ") ^ i33) * 45;
                                            i34 = ((iM55687 ^ i32) * (-6647)) ^ (-693076489);
                                            i35 = 1296896708;
                                        }
                                        break;
                                    case -1563665896:
                                    case -1122528488:
                                        return;
                                    case -1139359379:
                                    case 678057749:
                                        if (RunnableC0938.m55938() != 0) {
                                            iM55687 = C0873.m55680("ۨ᩹") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 30359) ^ 481133762;
                                            i35 = -1953091472;
                                        } else {
                                            iM55687 = C0946.m55979("ۙ۠") ^ i33;
                                            i34 = ((iM55687 ^ i32) * 14223) ^ 236219585;
                                            i35 = -1337056773;
                                        }
                                        break;
                                    case -803558517:
                                    case 2048762694:
                                        if (C0946.m55980() != 0) {
                                            iM55687 = C0873.m55680("ۗۧ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * (-30549)) ^ 1082943494;
                                            i35 = 1792235781;
                                        } else {
                                            iM55687 = (C0946.m55979("ܶ᩻") ^ i33) * (-85);
                                            i34 = ((iM55687 ^ i32) * 23681) ^ (-563683967);
                                            i35 = 376753406;
                                        }
                                        break;
                                    case -641864719:
                                    case 1010816314:
                                        if (C1964.f83032 <= 0) {
                                            iM55687 = C0873.m55680("ۨ᩹") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 30359) ^ 481133762;
                                            i35 = -1953091472;
                                        } else {
                                            iM55687 = (C0873.m55680("֫ܺ") + i33) * (-83);
                                            i34 = ((iM55687 ^ i32) * (-24183)) ^ (-2102320827);
                                            i35 = -53925368;
                                        }
                                        break;
                                    case -384238837:
                                    case 103431571:
                                        if (C1012.f81938 >= 0) {
                                            iM55687 = C0873.m55680("ۗۧ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * (-30549)) ^ 1082943494;
                                            i35 = 1792235781;
                                        } else {
                                            iM55687 = (C0873.m55680("۠ܽ") + i33) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i34 = ((iM55687 ^ i32) * 8009) ^ (-282739614);
                                            i35 = 287313203;
                                        }
                                        break;
                                    case 113997832:
                                    case 331693505:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM55687 = (C0873.m55680("ܽۙ") ^ i33) * 45;
                                            i34 = ((iM55687 ^ i32) * (-6647)) ^ (-693076489);
                                            i35 = 1296896708;
                                        } else {
                                            iM55687 = C0946.m55979("ۨۙ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 27105) ^ (-549873786);
                                            i35 = 1101225273;
                                        }
                                        break;
                                    case 360978263:
                                    case 1204821001:
                                        if (C1046.f81962 <= 0) {
                                            iM55687 = C0873.m55680("ۗۧ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * (-30549)) ^ 1082943494;
                                            i35 = 1792235781;
                                        } else {
                                            iM55687 = C0946.m55979("᩺᩺") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 23189) ^ (-1720497145);
                                            i35 = 2001096987;
                                        }
                                        break;
                                    case 760131678:
                                    case 964429118:
                                        if (C0898.f81858 <= 0) {
                                            iM55687 = (C0946.m55979("ܶ᩻") ^ i33) * (-85);
                                            i34 = ((iM55687 ^ i32) * 23681) ^ (-563683967);
                                            i35 = 376753406;
                                        } else {
                                            iM55687 = (C0873.m55680("ۢۙ") + i32) * 39;
                                            i34 = ((iM55687 ^ i33) * 15507) ^ 1873659670;
                                            i35 = 2090979587;
                                        }
                                        break;
                                    case 885975521:
                                    case 1219156893:
                                        RunnableC0871.m55672();
                                        iM55687 = (C0946.m55979("ܶ᩻") ^ i33) * (-85);
                                        i34 = ((iM55687 ^ i32) * 23681) ^ (-563683967);
                                        i35 = 376753406;
                                        break;
                                    case 1135423746:
                                    case 1430013491:
                                        if (C1929.f83011 != 0) {
                                            iM55687 = (C0946.m55979("ܰܽ") + i33) * 27;
                                            i34 = ((iM55687 ^ i32) * (-9925)) ^ (-731530953);
                                            i35 = 1341908767;
                                        } else {
                                            iM55687 = C0946.m55979("ܶ᩹") ^ i33;
                                            i34 = ((iM55687 ^ i32) * 1209) ^ (-649902579);
                                            i35 = 114805984;
                                        }
                                        break;
                                    case 1204511657:
                                    case 1675286944:
                                        if (C1053.f81965 <= 0) {
                                            iM55687 = (C0873.m55680("ܽۙ") ^ i33) * 45;
                                            i34 = ((iM55687 ^ i32) * (-6647)) ^ (-693076489);
                                            i35 = 1296896708;
                                        } else {
                                            iM55687 = C0946.m55979("᩺۫") ^ i33;
                                            i34 = ((iM55687 ^ i32) * 1035) ^ (-87957669);
                                            i35 = 1768834638;
                                        }
                                        break;
                                    default:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55687 = (C0946.m55979("ܰܽ") + i33) * 27;
                                            i34 = ((iM55687 ^ i32) * (-9925)) ^ (-731530953);
                                            i35 = 1341908767;
                                        } else {
                                            iM55687 = C0873.m55680("ᩴܿ") ^ i32;
                                            i34 = ((iM55687 ^ i33) * 31937) ^ 414418837;
                                            i35 = -2135541445;
                                        }
                                        break;
                                }
                            }
                        }

                        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                            return C11309.$default$andThen(this, intConsumer);
                        }

                        @Override // java.util.function.IntConsumer
                        public final void accept(int i31) {
                            List list = null;
                            C22404 c22404 = null;
                            int i32 = 1232139211;
                            int i33 = RunnableC0938.f81886;
                            int i34 = C1003.f81929;
                            int iM55687 = C0873.m55680("᩷᩵") ^ i33;
                            int i35 = ((iM55687 ^ i34) * (-5997)) ^ 1403527149;
                            int i36 = 1628884971;
                            while (true) {
                                i32 = ((((i32 ^ i34) * (-15275)) >> 31) & i35) ^ (iM55687 ^ i36);
                                switch (i32) {
                                    case -2141577768:
                                    case 1623032263:
                                        C0845.m55584();
                                        if (C1124.f82007 >= 0) {
                                            iM55687 = C0873.m55680("ۗܶ") ^ i33;
                                            i35 = ((iM55687 ^ i34) * 11281) ^ 1133721524;
                                            i36 = 834372579;
                                        } else {
                                            iM55687 = C0873.m55680("ۜܽ") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-1931)) ^ 2002798823;
                                            i36 = 1984743616;
                                        }
                                        break;
                                    case -1803771506:
                                    case 500886942:
                                        if (!C0917.m55854()) {
                                            iM55687 = (C0946.m55979("ᩳ۫") + i34) * (-105);
                                            i35 = ((iM55687 ^ i33) * 30671) ^ 1142149673;
                                            i36 = 1522370328;
                                        } else {
                                            DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M55669;
                                            if (C0906.f81862 < 0) {
                                                C13963 c13964 = c13963;
                                                if (!C0927.f81875) {
                                                    C4969.m10530(viewOnClickListenerC7928, c22404, new RunnableC10343(dialogInterfaceC2564, c13964, c22404, 1));
                                                }
                                            }
                                            iM55687 = C0873.m55680("ۢ᩸") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-19651)) ^ (-1008384614);
                                            i36 = -1918246797;
                                        }
                                        break;
                                    case -1762783217:
                                    case -1604810762:
                                        C1229.m56410();
                                        C1404.m56468();
                                        iM55687 = C0873.m55680("ۜܽ") ^ i33;
                                        i35 = ((iM55687 ^ i34) * (-1931)) ^ 2002798823;
                                        i36 = 1984743616;
                                        break;
                                    case -1720304833:
                                    case -1531436591:
                                        break;
                                    case -1618608135:
                                    case -1352312624:
                                        c22404 = (C22404) C1964.m56587(list, i31);
                                        if (c22404.f70672) {
                                            iM55687 = C0946.m55979("ۡ᩶") ^ i34;
                                            i35 = ((iM55687 ^ i33) * (-8063)) ^ 243146393;
                                            i36 = -1156608798;
                                        } else {
                                            iM55687 = (i33 - C0946.m55979("۟ۚ")) * 15;
                                            i35 = ((iM55687 ^ i34) * 7091) ^ (-597137765);
                                            i36 = -1852318657;
                                        }
                                        break;
                                    case -1577754964:
                                    case -110453675:
                                        if (C0917.m55854()) {
                                            iM55687 = C0946.m55979("֫᩺") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-8683)) ^ (-1312239503);
                                            i36 = 1059954445;
                                        } else {
                                            iM55687 = (C0946.m55979("ᩳ۫") + i34) * (-105);
                                            i35 = ((iM55687 ^ i33) * 30671) ^ 1142149673;
                                            i36 = 1522370328;
                                        }
                                        break;
                                    case -1362195960:
                                    case 576292232:
                                        if (C1012.m56134() <= 0) {
                                            iM55687 = (C0946.m55979("ᩳ۫") + i34) * (-105);
                                            i35 = ((iM55687 ^ i33) * 30671) ^ 1142149673;
                                            i36 = 1522370328;
                                        } else {
                                            iM55687 = (C0873.m55680("ܰ֨") + i33) * (-81);
                                            i35 = ((iM55687 ^ i34) * 23809) ^ (-8894828);
                                            i36 = -981101748;
                                        }
                                        break;
                                    case -880014296:
                                    case 1267277324:
                                        if (C1124.f82007 >= 0) {
                                            iM55687 = C0946.m55979("֡ۢ") ^ i34;
                                            i35 = ((iM55687 ^ i33) * (-317)) ^ (-755121835);
                                            i36 = 1850440352;
                                        } else {
                                            iM55687 = (C0946.m55979("ۢۜ") + i34) * 11;
                                            i35 = ((iM55687 ^ i33) * (-27917)) ^ 2033246052;
                                            i36 = -1639455697;
                                        }
                                        break;
                                    case -764888429:
                                    case -407909365:
                                        C1124.m56367();
                                        C1229.m56410();
                                        break;
                                    case -683560515:
                                    case 737555737:
                                        list = r4;
                                        if (C1044.f81959 >= 0) {
                                            iM55687 = C0873.m55680("ۢ᩸") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-19651)) ^ (-1008384614);
                                            i36 = -1918246797;
                                        } else {
                                            iM55687 = C0946.m55979("֡ۧ") ^ i34;
                                            i35 = ((iM55687 ^ i33) * (-30495)) ^ (-1545234803);
                                            i36 = -1107553545;
                                        }
                                        break;
                                    case -452483367:
                                    case -145934743:
                                        if (C1194.f82045 != 0) {
                                            iM55687 = C0873.m55680("ۜܽ") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-1931)) ^ 2002798823;
                                            i36 = 1984743616;
                                        } else {
                                            iM55687 = C0873.m55680("᩶ܶ") ^ i34;
                                            i35 = ((iM55687 ^ i33) * 20907) ^ (-990530193);
                                            i36 = -619642947;
                                        }
                                        break;
                                    case -252289505:
                                    case 355886438:
                                        if (C0890.f81849 != 0) {
                                            iM55687 = C0873.m55680("ۜܽ") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-1931)) ^ 2002798823;
                                            i36 = 1984743616;
                                        } else {
                                            iM55687 = C0946.m55979("᩸֨") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-11085)) ^ (-1477784430);
                                            i36 = 1517087026;
                                        }
                                        break;
                                    case 79739989:
                                    case 1278384041:
                                        C0890.m55740();
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            iM55687 = (C0946.m55979("ᩳ۫") + i34) * (-105);
                                            i35 = ((iM55687 ^ i33) * 30671) ^ 1142149673;
                                            i36 = 1522370328;
                                        } else {
                                            iM55687 = C0873.m55680("ۜܽ") ^ i33;
                                            i35 = ((iM55687 ^ i34) * (-1931)) ^ 2002798823;
                                            i36 = 1984743616;
                                        }
                                        break;
                                    case 320572146:
                                    case 464663472:
                                        if (C0892.f81851) {
                                            iM55687 = C0873.m55680("ᩳ֨") ^ i34;
                                            i35 = ((iM55687 ^ i33) * 26645) ^ (-845907193);
                                            i36 = 160191716;
                                        } else {
                                            iM55687 = C0873.m55680("ۗܶ") ^ i33;
                                            i35 = ((iM55687 ^ i34) * 11281) ^ 1133721524;
                                            i36 = 834372579;
                                        }
                                        break;
                                    default:
                                        ViewOnClickListenerC0939.m55941();
                                        if (RunnableC0938.f81886 < 0) {
                                            iM55687 = C0946.m55979("֡ۢ") ^ i34;
                                            i35 = ((iM55687 ^ i33) * (-317)) ^ (-755121835);
                                            i36 = 1850440352;
                                        } else {
                                            iM55687 = (C0946.m55979("ᩳ۫") + i34) * (-105);
                                            i35 = ((iM55687 ^ i33) * 30671) ^ 1142149673;
                                            i36 = 1522370328;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    i24 = i24;
                    i25 = i25;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    c20675 = c20675;
                    iM559711 = C0873.m55680("ᩳܺ") ^ i16;
                    i8 = ((iM559711 ^ i17) * 26713) ^ 1466176751;
                    i9 = -736501290;
                    int i214 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i214;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case -833660641:
                case -175234186:
                    C0892.m55749();
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    obj2 = obj3;
                    sArr2 = sArr4;
                    r4 = r4;
                    int iM559719 = C0946.m55979("᩶֨") ^ i16;
                    sArr4 = sArr2;
                    i22 = i22;
                    obj3 = obj2;
                    viewGroup3 = viewGroup3;
                    i19 = iM559719 ^ (-213703335);
                    i18 = ((iM559719 ^ i17) * (-4159)) ^ 1467742765;
                    break;
                case -546438356:
                case -514393308:
                    i20 = 20058;
                    iM559711 = C0946.m55979("ۜ۠") ^ i16;
                    i8 = ((iM559711 ^ i17) * 14333) ^ (-702291161);
                    i9 = -533951630;
                    int i215 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i215;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case -319585570:
                case 1253385222:
                    viewGroup3 = viewGroup3;
                    obj3 = obj3;
                    c20674 = c20675;
                    sArr4 = sArr4;
                    iM55682 = C0873.m55680(C1044.m56276(f82120, 4, 3, i20));
                    i22 = 2101790030;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        int iM559720 = (C0946.m55979("۟֫") + i16) * 63;
                        int i31 = ((iM559720 ^ i17) * 21307) ^ 619000632;
                        i5 = iM559720 ^ (-22179693);
                        c20675 = c20674;
                        i18 = i31;
                        viewGroup2 = viewGroup3;
                        i19 = i5;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        viewGroup3 = viewGroup2;
                    } else {
                        i22 = 2101790030;
                        i26 = i26;
                        sArr3 = sArr3;
                        c20675 = c20674;
                        iM559711 = (C0946.m55979("ᩳ᩹") + i16) * (-53);
                        i8 = ((iM559711 ^ i17) * (-8873)) ^ (-1999598172);
                        i9 = -888571769;
                        int i216 = iM559711 ^ i9;
                        c20675 = c20675;
                        sArr3 = sArr3;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        i25 = i25;
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        i19 = i216;
                        i18 = i8;
                        i26 = i26;
                        i24 = i24;
                    }
                    break;
                case -249233976:
                case 906685054:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i24 = i24;
                    i25 = i25;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    c20675 = c20675;
                    s = f82120[0];
                    s2 = 25616;
                    if (C1046.m56302() != 0) {
                        iM559711 = (C0946.m55979("ᩳ᩹") + i16) * (-53);
                        i8 = ((iM559711 ^ i17) * (-8873)) ^ (-1999598172);
                        i9 = -888571769;
                    } else {
                        iM559711 = (i16 - C0873.m55680("ۙۙ")) * (-35);
                        i8 = ((iM559711 ^ i17) * (-14339)) ^ (-1614460733);
                        i9 = -1511405522;
                    }
                    int i217 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i217;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case 354016620:
                case 928592379:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i2 = i24;
                    i3 = i25;
                    obj3 = obj3;
                    c20672 = c20675;
                    sArr4 = sArr4;
                    short[] sArr6 = sArr3;
                    sArr = sArr6;
                    C1012.m56146(c20672, C0946.m55979(C0947.m55993(sArr6, i2, i3, i20)) ^ 2129145409);
                    if (C0845.m55584() <= 0) {
                        iM55979 = (i17 - C0873.m55680("ܽ۟")) * (-69);
                        c20673 = c20672;
                        i18 = ((iM55979 ^ i16) * (-8421)) ^ 733060065;
                        i4 = -1637569030;
                    } else {
                        c20673 = c20672;
                        iM55979 = C0946.m55979("ܽۧ") ^ i17;
                        i18 = ((iM55979 ^ i16) * (-18483)) ^ (-1143150500);
                        i4 = 1202631351;
                    }
                    i5 = iM55979 ^ i4;
                    i24 = i2;
                    c20675 = c20673;
                    sArr3 = sArr;
                    i25 = i3;
                    i22 = i22;
                    viewGroup2 = viewGroup3;
                    i19 = i5;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    viewGroup3 = viewGroup2;
                    break;
                case 512243722:
                case 930376499:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i24 = i24;
                    i25 = i25;
                    obj3 = obj3;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    c20675 = c20675;
                    if (((s * s) + 164044864) - (s * s2) < 0) {
                        iM559711 = C0873.m55680("ۛ֨") ^ i17;
                        i8 = ((iM559711 ^ i16) * 32277) ^ (-2102192125);
                        i9 = 939568431;
                    } else {
                        iM559711 = C0873.m55680("ۚ۫") ^ i17;
                        i8 = ((iM559711 ^ i16) * (-5953)) ^ 589468203;
                        i9 = -418597127;
                    }
                    int i218 = iM559711 ^ i9;
                    c20675 = c20675;
                    sArr3 = sArr3;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    i25 = i25;
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    i19 = i218;
                    i18 = i8;
                    i26 = i26;
                    i24 = i24;
                    break;
                case 1029191609:
                case 1585430325:
                    RunnableC0871.m55672();
                    if (C1194.f82045 == 0) {
                        viewGroup = viewGroup3;
                        i = i22;
                        obj = obj3;
                        c20671 = c20675;
                        iM55680 = (C0873.m55680("ۡۤ") + i17) * (-59);
                        i12 = ((iM55680 ^ i16) * 17383) ^ 1935949444;
                        i11 = 1104546462;
                        i10 = iM55680 ^ i11;
                        c20675 = c20671;
                        obj3 = obj;
                        i18 = i12;
                        viewGroup3 = viewGroup;
                        i22 = i;
                        r4 = r4;
                        i19 = i10;
                    } else {
                        viewGroup3 = viewGroup3;
                        i22 = i22;
                        i2 = i24;
                        i3 = i25;
                        obj3 = obj3;
                        c20672 = c20675;
                        sArr4 = sArr4;
                        sArr = sArr3;
                        iM55979 = (i17 - C0873.m55680("ܽ۟")) * (-69);
                        c20673 = c20672;
                        i18 = ((iM55979 ^ i16) * (-8421)) ^ 733060065;
                        i4 = -1637569030;
                        i5 = iM55979 ^ i4;
                        i24 = i2;
                        c20675 = c20673;
                        sArr3 = sArr;
                        i25 = i3;
                        i22 = i22;
                        viewGroup2 = viewGroup3;
                        i19 = i5;
                        sArr4 = sArr4;
                        obj3 = obj3;
                        viewGroup3 = viewGroup2;
                    }
                    break;
                default:
                    viewGroup3 = viewGroup3;
                    i22 = i22;
                    iM559713 = C0946.m55979(C0898.m55792(sArr4, 7, 3, i20));
                    i23 = 2120111420;
                    if (!C1024.f81946) {
                        iM559710 = (i17 - C0873.m55680("֡ܰ")) * (-25);
                        i6 = ((iM559710 ^ i16) * (-12687)) ^ (-1132905620);
                        i7 = 1423779764;
                        i22 = i22;
                        viewGroup2 = viewGroup3;
                        i19 = iM559710 ^ i7;
                        i18 = i6;
                        viewGroup3 = viewGroup2;
                    }
                    i2 = i24;
                    i3 = i25;
                    obj3 = obj3;
                    c20672 = c20675;
                    sArr4 = sArr4;
                    sArr = sArr3;
                    iM55979 = (i17 - C0873.m55680("ܽ۟")) * (-69);
                    c20673 = c20672;
                    i18 = ((iM55979 ^ i16) * (-8421)) ^ 733060065;
                    i4 = -1637569030;
                    i5 = iM55979 ^ i4;
                    i24 = i2;
                    c20675 = c20673;
                    sArr3 = sArr;
                    i25 = i3;
                    i22 = i22;
                    viewGroup2 = viewGroup3;
                    i19 = i5;
                    sArr4 = sArr4;
                    obj3 = obj3;
                    viewGroup3 = viewGroup2;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ViewOnClickListenerC7928 viewOnClickListenerC7928 = null;
        int i = 1226677478;
        int i2 = AbstractC0942.f81890;
        int i3 = C0949.f81897;
        int iM55979 = (i3 - C0946.m55979("ۨۨ")) * (-55);
        int i4 = ((iM55979 ^ i2) * (-26353)) ^ 1072034976;
        int i5 = 750054095;
        while (true) {
            i = ((((i ^ i2) * 19227) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2143103651:
                case 200915837:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0873.m55680("ܽ᩵") ^ i3) * 7;
                        i4 = ((iM55979 ^ i2) * (-3603)) ^ 1724265980;
                        i5 = -969353424;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۗ᩸")) * (-125);
                        i4 = ((iM55979 ^ i2) * 3141) ^ 1808531253;
                        i5 = 2116750764;
                    }
                    break;
                case -1978576559:
                case -1256339714:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۗܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30217)) ^ 1305792555;
                        i5 = -1798899412;
                    } else {
                        iM55979 = C0873.m55680("֫۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-669)) ^ (-241071811);
                        i5 = 1503223201;
                    }
                    break;
                case -1775050056:
                case -383953599:
                    RunnableC0897.m55775(viewOnClickListenerC7928);
                    iM55979 = C0946.m55979("ۨ۠") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-13495)) ^ (-263051328);
                    i5 = 1614396765;
                    break;
                case -1714496947:
                case -853194120:
                    if (viewOnClickListenerC7928.isDestroyed()) {
                        iM55979 = C0946.m55979("ۨ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13495)) ^ (-263051328);
                        i5 = 1614396765;
                    } else {
                        iM55979 = (C0873.m55680("۠ۙ") ^ i3) * 55;
                        i4 = ((iM55979 ^ i2) * 17825) ^ (-1166346444);
                        i5 = -1971300666;
                    }
                    break;
                case -1625748541:
                case 1447479402:
                    C0937.m55918();
                    C1229.m56410();
                    break;
                case -1428107613:
                case 929404866:
                    C1964.m56597();
                    if (C0906.f81862 < 0) {
                        iM55979 = C0873.m55680("֫۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-669)) ^ (-241071811);
                        i5 = 1503223201;
                    } else {
                        iM55979 = (C0873.m55680("ܰ֨") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-32485)) ^ 1974479628;
                        i5 = -1247687612;
                    }
                    break;
                case -1257719987:
                case -962051076:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("ܽ᩵") ^ i3) * 7;
                        i4 = ((iM55979 ^ i2) * (-3603)) ^ 1724265980;
                        i5 = -969353424;
                    } else {
                        iM55979 = C0946.m55979("۬᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30007) ^ 1798515221;
                        i5 = -1835603655;
                    }
                    break;
                case -1033064983:
                case -342113337:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("֡ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15599) ^ 745825328;
                        i5 = -760249842;
                    } else {
                        iM55979 = C0946.m55979("۟ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6965)) ^ 468038771;
                        i5 = 390818957;
                    }
                    break;
                case -1002661963:
                case 623929638:
                    if (C1071.m56343() != 0) {
                        iM55979 = (i3 - C0873.m55680("ۗ᩸")) * (-125);
                        i4 = ((iM55979 ^ i2) * 3141) ^ 1808531253;
                        i5 = 2116750764;
                    } else {
                        iM55979 = C0873.m55680("֫ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22067) ^ 1418935312;
                        i5 = -1888822712;
                    }
                    break;
                case -839424229:
                case 613727233:
                    viewOnClickListenerC7928 = this.f33333;
                    if (C0989.m56094(viewOnClickListenerC7928)) {
                        iM55979 = C0946.m55979("ۨ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13495)) ^ (-263051328);
                        i5 = 1614396765;
                    } else {
                        iM55979 = C0946.m55979("۫ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1425) ^ 712939158;
                        i5 = 1083738941;
                    }
                    break;
                case -836945034:
                case 1344931885:
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ܶ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26683) ^ 135225109;
                        i5 = -1997139419;
                    } else {
                        iM55979 = (C0873.m55680("ܰ֨") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-32485)) ^ 1974479628;
                        i5 = -1247687612;
                    }
                    break;
                case -778022846:
                case 1646507033:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("֡ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15599) ^ 745825328;
                        i5 = -760249842;
                    } else {
                        iM55979 = C0873.m55680("ۤۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18943)) ^ 1212427896;
                        i5 = 1397162245;
                    }
                    break;
                case -641670364:
                case 426583690:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("֡ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15599) ^ 745825328;
                        i5 = -760249842;
                    } else {
                        iM55979 = C0873.m55680("۟᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6035)) ^ 1897856624;
                        i5 = -37560496;
                    }
                    break;
                case -564369497:
                case 585830526:
                    if (C0845.m55584() <= 0) {
                        iM55979 = (i3 - C0873.m55680("ۗ᩸")) * (-125);
                        i4 = ((iM55979 ^ i2) * 3141) ^ 1808531253;
                        i5 = 2116750764;
                    } else {
                        iM55979 = C0873.m55680("᩻ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2675)) ^ 493140784;
                        i5 = -1974228607;
                    }
                    break;
                case -355296708:
                case 565320145:
                    C0866.m55645();
                    iM55979 = (i3 - C0873.m55680("ۗ᩸")) * (-125);
                    i4 = ((iM55979 ^ i2) * 3141) ^ 1808531253;
                    i5 = 2116750764;
                    break;
                case 255026307:
                case 1174935858:
                    C1012.m56134();
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55979 = (C0873.m55680("ܰ֨") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-32485)) ^ 1974479628;
                        i5 = -1247687612;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۗ᩸")) * (-125);
                        i4 = ((iM55979 ^ i2) * 3141) ^ 1808531253;
                        i5 = 2116750764;
                    }
                    break;
                case 915664422:
                case 1914485091:
                    break;
                case 977658545:
                case 990688815:
                    ServiceConnectionC1013.m56155(viewOnClickListenerC7928, exc, null);
                    if (C0894.m55772()) {
                        iM55979 = C0946.m55979("ۨ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13495)) ^ (-263051328);
                        i5 = 1614396765;
                    } else {
                        iM55979 = C0873.m55680("ܽܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22381) ^ 1058154101;
                        i5 = -1078510245;
                    }
                    break;
                case 1219238578:
                case 2093572888:
                    if (C0882.m55710() != 0) {
                        iM55979 = (C0873.m55680("ܰ֨") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-32485)) ^ 1974479628;
                        i5 = -1247687612;
                    } else {
                        iM55979 = C0873.m55680("ۧۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22487) ^ (-1365284179);
                        i5 = 1818158986;
                    }
                    break;
                default:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("֫۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-669)) ^ (-241071811);
                        i5 = 1503223201;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܰܺ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * 24259) ^ 1519365847;
                        i5 = -978132956;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x022d A[PHI: r4 r6 r7 r8 r16 r17
      0x022d: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:64:0x022b, B:56:0x01d4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:64:0x022b, B:56:0x01d4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:64:0x022b, B:56:0x01d4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:64:0x022b, B:56:0x01d4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r16v14 int) = (r16v0 int), (r16v2 int), (r16v15 int) binds: [B:64:0x022b, B:56:0x01d4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r17v13 short[]) = (r17v0 short[]), (r17v2 short[]), (r17v14 short[]) binds: [B:64:0x022b, B:56:0x01d4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (p067l.C1012.m56134() > 0) goto L14;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3405() throws C3924 {
        int iM55680;
        int i;
        int iM55681;
        int i2;
        C25065 c25065M56232 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 727317540;
        int i9 = RunnableC1014.f81941;
        int i10 = C1964.f83032;
        int iM55682 = C0873.m55680("ۚ᩺") ^ i9;
        int i11 = ((iM55682 ^ i10) * (-31789)) ^ (-662377790);
        int i12 = iM55682 ^ 1731575284;
        while (true) {
            int i13 = ((((i8 ^ i10) * (-25423)) >> 31) & i11) ^ i12;
            switch (i13) {
                case -2134259707:
                case -722156595:
                    C0955.m56025();
                    if (C0894.f81854 < 0) {
                        sArr = sArr;
                        i13 = i13;
                        iM55680 = (C0873.m55680("֨ۤ") ^ i9) * 119;
                        i11 = ((iM55680 ^ i10) * 16169) ^ (-922137523);
                        i = -568825099;
                        i12 = iM55680 ^ i;
                        i8 = i13;
                        sArr = sArr;
                    } else {
                        i13 = i13;
                        iM55681 = C0873.m55680("ۘܳ") ^ i10;
                        i11 = (-1255189363) ^ ((iM55681 ^ i9) * (-3507));
                        i2 = -2042683179;
                        i12 = i2 ^ iM55681;
                        i8 = i13;
                    }
                    break;
                case -2096652194:
                case 1050083110:
                    sArr = sArr;
                    i13 = i13;
                    try {
                        int iM55021 = c25065M56232.m55021();
                        this.f33335 = iM55021;
                        this.f33334 = C22404.m50310(c25065M56232, iM55021);
                        iM55680 = (C0946.m55979("᩺ۛ") ^ i9) * (-105);
                        i11 = ((iM55680 ^ i10) * 7259) ^ (-1774274484);
                        i = 673619208;
                    } catch (IOException unused) {
                        iM55680 = C0873.m55680("᩸ۜ") ^ i9;
                        i11 = ((iM55680 ^ i10) * 1625) ^ 1236982674;
                        i = -1773129989;
                    }
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case -1554475739:
                case 254610726:
                    i7 = 25707;
                    iM55680 = (C0873.m55680("ۙ۟") ^ i9) * 31;
                    i11 = ((iM55680 ^ i10) * 17055) ^ (-132170569);
                    i = -2091445100;
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case -1277362835:
                case -1054139983:
                    C1194.m56396();
                    return;
                case -1084808709:
                case 1575426706:
                    C1929.m56553();
                    i13 = i13;
                    iM55681 = C0873.m55680("ۘܳ") ^ i10;
                    i11 = (-1255189363) ^ ((iM55681 ^ i9) * (-3507));
                    i2 = -2042683179;
                    i12 = i2 ^ iM55681;
                    i8 = i13;
                    break;
                case -963135640:
                case 1500354448:
                    sArr = sArr;
                    i13 = i13;
                    s = sArr[c];
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("֨ۤ") ^ i9) * 119;
                        i11 = ((iM55680 ^ i10) * 16169) ^ (-922137523);
                        i = -568825099;
                    } else {
                        iM55680 = C0873.m55680("᩺ܳ") ^ i9;
                        i11 = ((iM55680 ^ i10) * (-20007)) ^ (-1279207320);
                        i = 2009348758;
                    }
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case -949126854:
                case -138815438:
                    ViewOnClickListenerC7928 viewOnClickListenerC7928 = this.f33333;
                    short[] sArr2 = f82120;
                    if (C0845.f81821 < 0) {
                        i13 = i13;
                        if (C1044.f81959 < 0) {
                            sArr = sArr;
                            String strM55993 = C0947.m55993(sArr2, 21, 3, i7);
                            if (C1003.f81929 > 0) {
                                throw new C3924(C0845.m55590(viewOnClickListenerC7928, C0873.m55680(strM55993) ^ 2097430452));
                            }
                            iM55680 = (C0946.m55979("᩶ۖ") + i10) * 127;
                            i11 = ((iM55680 ^ i9) * 16143) ^ 1612687212;
                            i = -292074296;
                            i12 = iM55680 ^ i;
                            i8 = i13;
                            sArr = sArr;
                        } else {
                            iM55681 = C0946.m55979("᩵᩻") ^ i9;
                            i11 = (-672549388) ^ ((iM55681 ^ i10) * 24051);
                            i2 = 1470379484;
                            i12 = i2 ^ iM55681;
                            i8 = i13;
                        }
                    } else {
                        sArr = sArr;
                        i13 = i13;
                        iM55680 = (C0946.m55979("ܿۨ") ^ i10) * 99;
                        i11 = ((iM55680 ^ i9) * (-3831)) ^ (-576835549);
                        i = 64284723;
                        i12 = iM55680 ^ i;
                        i8 = i13;
                        sArr = sArr;
                    }
                    break;
                case -393853075:
                case 1893883219:
                    i7 = 19317;
                    iM55680 = (C0873.m55680("ۙ۟") ^ i9) * 31;
                    i11 = ((iM55680 ^ i10) * 17055) ^ (-132170569);
                    i = -2091445100;
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case -13858788:
                case 1310403741:
                    return;
                case 115318457:
                case 310340625:
                    i13 = i13;
                    sArr = f82120;
                    c = 17;
                    if (C1046.f81962 <= 0) {
                        iM55681 = C0873.m55680("ۘܳ") ^ i10;
                        i11 = (-1255189363) ^ ((iM55681 ^ i9) * (-3507));
                        i2 = -2042683179;
                    } else {
                        iM55681 = C0873.m55680("ܳ֡") ^ i10;
                        i11 = (-1778332040) ^ ((iM55681 ^ i9) * 14659);
                        i2 = -210479803;
                    }
                    i12 = i2 ^ iM55681;
                    i8 = i13;
                    break;
                case 219104124:
                case 1477422657:
                    sArr = sArr;
                    i13 = i13;
                    c25065M56232 = C1025.m56232(C0955.m56033(C0719o.a.f2910p));
                    if (C0930.m55892(c25065M56232)) {
                        iM55680 = (C0946.m55979("۬ܺ") + i10) * (-127);
                        i11 = ((iM55680 ^ i9) * 25131) ^ (-1809784244);
                        i = 2103931671;
                    } else {
                        iM55680 = (C0946.m55979("᩷ᩳ") ^ i10) * (-73);
                        i11 = ((iM55680 ^ i9) * (-19695)) ^ 1606715934;
                        i = -2059280201;
                    }
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case 264617705:
                case 1403909045:
                    if (C0890.f81849 != 0) {
                        i13 = i13;
                        iM55681 = C0946.m55979("᩵᩻") ^ i9;
                        i11 = (-672549388) ^ ((iM55681 ^ i10) * 24051);
                        i2 = 1470379484;
                        i12 = i2 ^ iM55681;
                        i8 = i13;
                    } else {
                        sArr = sArr;
                        i13 = i13;
                        iM55680 = (C0946.m55979("ܿۨ") ^ i10) * 99;
                        i11 = ((iM55680 ^ i9) * (-3831)) ^ (-576835549);
                        i = 64284723;
                        i12 = iM55680 ^ i;
                        i8 = i13;
                        sArr = sArr;
                    }
                    break;
                case 372100290:
                case 2031126197:
                    sArr = sArr;
                    i13 = i13;
                    i3 = s + 629;
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("ܶۡ") + i10) * 47;
                        i11 = ((iM55680 ^ i9) * (-8141)) ^ 640511391;
                        i = -1072881270;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۖ") + i10) * 127;
                        i11 = ((iM55680 ^ i9) * 16143) ^ 1612687212;
                        i = -292074296;
                    }
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case 617984216:
                case 1066433418:
                    sArr = sArr;
                    i13 = i13;
                    i4 = i3 * i3;
                    i5 = s * s;
                    i6 = 395641;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("֨ۤ") ^ i9) * 119;
                        i11 = ((iM55680 ^ i10) * 16169) ^ (-922137523);
                        i = -568825099;
                    } else {
                        iM55680 = (C0946.m55979("᩺֡") ^ i9) * 17;
                        i11 = ((iM55680 ^ i10) * (-27523)) ^ (-121762819);
                        i = -315198257;
                    }
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case 642418366:
                case 1775377732:
                    sArr = sArr;
                    i13 = i13;
                    short[] sArr3 = f82120;
                    if (C0912.f81867 > 0) {
                        String strM56386 = C1194.m56386(sArr3, 18, 3, i7);
                        if (C1028.m56247() < 0) {
                            int iM55979 = C0946.m55979(strM56386) ^ 2120939755;
                            if (C0906.f81862 < 0) {
                                throw new C3924(AbstractC0942.m55960(c25065M56232, iM55979));
                            }
                            iM55680 = (C0946.m55979("ܿۨ") ^ i10) * 99;
                            i11 = ((iM55680 ^ i9) * (-3831)) ^ (-576835549);
                            i = 64284723;
                        }
                        i12 = iM55680 ^ i;
                        i8 = i13;
                        sArr = sArr;
                    }
                    iM55680 = (C0946.m55979("᩶ۖ") + i10) * 127;
                    i11 = ((iM55680 ^ i9) * 16143) ^ 1612687212;
                    i = -292074296;
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
                case 911062743:
                case 2030460955:
                    break;
                default:
                    sArr = sArr;
                    i13 = i13;
                    int i14 = i5 + i6;
                    if (i4 - (i14 + i14) > 0) {
                        iM55680 = (C0873.m55680("ۚܿ") + i10) * (-75);
                        i11 = ((iM55680 ^ i9) * (-8347)) ^ (-1353956742);
                        i = 957460238;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ۨ᩸")) * 9;
                        i11 = ((iM55680 ^ i10) * 12505) ^ 169195720;
                        i = 31103830;
                    }
                    i12 = iM55680 ^ i;
                    i8 = i13;
                    sArr = sArr;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[PHI: r2 r3 r4 r5 r14 r15
      0x00e5: PHI (r2v4 l.ۛۚۡ) = (r2v3 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ) binds: [B:32:0x00e3, B:28:0x00c2, B:24:0x00a3, B:20:0x0083, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:32:0x00e3, B:28:0x00c2, B:24:0x00a3, B:20:0x0083, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:32:0x00e3, B:28:0x00c2, B:24:0x00a3, B:20:0x0083, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:32:0x00e3, B:28:0x00c2, B:24:0x00a3, B:20:0x0083, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:32:0x00e3, B:28:0x00c2, B:24:0x00a3, B:20:0x0083, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:32:0x00e3, B:28:0x00c2, B:24:0x00a3, B:20:0x0083, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0190 A[PHI: r10 r11 r12
      0x0190: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:47:0x018e, B:43:0x016f, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:47:0x018e, B:43:0x016f, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:47:0x018e, B:43:0x016f, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01e4 A[PHI: r7
      0x01e4: PHI (r7v5 char) = (r7v3 char), (r7v2 char) binds: [B:55:0x01e2, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0213 A[PHI: r8 r9
      0x0213: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:59:0x0211, B:51:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x0213: PHI (r9v3 short) = (r9v2 short), (r9v4 short) binds: [B:59:0x0211, B:51:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0247 A[PHI: r20
      0x0247: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0245, B:16:0x006b, B:14:0x0067, B:11:0x005e, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55680;
        int i;
        int i2;
        int i3 = C0894.f81854;
        int i4 = C0873.f81841;
        int iM55979 = (C0946.m55979("ۘᩴ") + i4) * (-101);
        int i5 = ((iM55979 ^ i3) * 3857) ^ 370081211;
        String strM55893 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-1136657229);
        ViewOnClickListenerC7928 viewOnClickListenerC7928 = null;
        int iM559710 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1109435669;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 30265) >> 31));
            switch (i13) {
                case -2129048367:
                case 1713074864:
                    if (i8 - (i9 + i10) <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۧ۫")) * 7;
                        i = ((iM55680 ^ i3) * (-21961)) ^ 1035817517;
                        i2 = 2115492856;
                    } else {
                        iM55680 = C0873.m55680("۬᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-9005)) ^ 858594608;
                        i2 = -651116371;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1998855606:
                case -1161205967:
                    s = sArr[c];
                    s2 = 38878;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (i3 - C0946.m55979("۫ܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i4) * 12687) ^ 1632875665;
                        i2 = -1713111426;
                    } else {
                        iM55680 = C0873.m55680("᩵ܳ") ^ i4;
                        i = ((iM55680 ^ i3) * 22429) ^ 205443264;
                        i2 = 867963008;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1947432603:
                case -316679823:
                    sArr = f82120;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("۬ۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-7529)) ^ (-1641539020);
                        i2 = -494544832;
                    } else {
                        iM55680 = C0873.m55680("ۡܺ") ^ i4;
                        i = ((iM55680 ^ i3) * 17911) ^ 1901245340;
                        i2 = 1105505733;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1604262067:
                case 630548256:
                    c = '\r';
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i4;
                        i = ((iM55680 ^ i3) * 22633) ^ 1915114262;
                        i2 = -1433037797;
                    } else {
                        iM55680 = C0873.m55680("ܶۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-15959)) ^ 169315701;
                        i2 = 94568786;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1590039878:
                case 80173910:
                    i11 = 55525;
                    iM55680 = C0946.m55979("۬᩸") ^ i3;
                    i = ((iM55680 ^ i4) * (-24347)) ^ 132436618;
                    i2 = -1938332597;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1421082774:
                case 1350835546:
                    strM55893 = C0930.m55893(sArr2, i12, 3, i11);
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i4) * (-59);
                        i = ((iM55680 ^ i3) * 9075) ^ (-594020745);
                        i2 = 876717034;
                    } else {
                        iM55680 = (C0946.m55979("᩹ۙ") ^ i4) * (-55);
                        i = ((iM55680 ^ i3) * 24323) ^ 2091421720;
                        i2 = -1792585969;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1284161624:
                case -322131022:
                    i12 = 14;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i4) * (-59);
                        i = ((iM55680 ^ i3) * 9075) ^ (-594020745);
                        i2 = 876717034;
                    } else {
                        iM55680 = C0873.m55680("ᩴᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 30307) ^ (-1436107875);
                        i2 = 640726147;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1204426134:
                case -159166757:
                    C0949.m56012();
                    C0866.m55645();
                    break;
                case -1030596124:
                case 1816673608:
                    C0863.m55643();
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("۬ۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-7529)) ^ (-1641539020);
                        i2 = -494544832;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i4) * (-59);
                        i = ((iM55680 ^ i3) * 9075) ^ (-594020745);
                        i2 = 876717034;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -999791764:
                case -265969943:
                    if (C0882.m55710() == 0) {
                        iM55680 = C0873.m55680("۬ۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-7529)) ^ (-1641539020);
                        i2 = -494544832;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۫ܺ")) * 71;
                        i = ((iM55680 ^ i4) * (-20115)) ^ (-546221252);
                        i2 = -23175822;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -780664191:
                case 1414018254:
                    i11 = 44390;
                    iM55680 = C0946.m55979("۬᩸") ^ i3;
                    i = ((iM55680 ^ i4) * (-24347)) ^ 132436618;
                    i2 = -1938332597;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -394562400:
                case 1579816921:
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = C0873.m55680("۬ۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-7529)) ^ (-1641539020);
                        i2 = -494544832;
                    } else {
                        iM55680 = C0946.m55979("ܰۤ") ^ i4;
                        i = ((iM55680 ^ i3) * 22633) ^ 1915114262;
                        i2 = -1433037797;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -240894656:
                case 751810405:
                    C1048.m56305();
                    RunnableC0938.m55938();
                    iM55680 = C0873.m55680("۬ۘ") ^ i4;
                    i = ((iM55680 ^ i3) * (-7529)) ^ (-1641539020);
                    i2 = -494544832;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -115487467:
                case 1762641048:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (i3 - C0873.m55680("۫ܺ")) * 71;
                        i = ((iM55680 ^ i4) * (-20115)) ^ (-546221252);
                        i2 = -23175822;
                    } else {
                        iM55680 = C0873.m55680("۟ۚ") ^ i4;
                        i = ((iM55680 ^ i3) * (-20567)) ^ 419952077;
                        i2 = 2024136381;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -46635797:
                case 17797166:
                    viewOnClickListenerC7928 = this.f33333;
                    sArr2 = f82120;
                    if (C0890.m55740()) {
                        iM55680 = C0946.m55979("ۘ֫") ^ i4;
                        i = ((iM55680 ^ i3) * (-13869)) ^ (-1989271378);
                        i2 = -1233347289;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i4) * (-59);
                        i = ((iM55680 ^ i3) * 9075) ^ (-594020745);
                        i2 = 876717034;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 377095801:
                case 1803416380:
                    iM559710 = C0946.m55979(strM55893);
                    i7 = 2123971211;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i4) * (-59);
                        i = ((iM55680 ^ i3) * 9075) ^ (-594020745);
                        i2 = 876717034;
                    } else {
                        iM55680 = C0946.m55979("᩷᩻") ^ i3;
                        i = ((iM55680 ^ i4) * (-10597)) ^ (-801923873);
                        i2 = -301490047;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 458530554:
                case 1121433500:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۫ܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i4) * 12687) ^ 1632875665;
                        i2 = -1713111426;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۚ۫")) * 91;
                        i = ((iM55680 ^ i4) * (-22945)) ^ 953788191;
                        i2 = 1825477032;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 541645305:
                case 571861536:
                    i10 = 377874721;
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i3 - C0873.m55680("۫ܺ")) * 71;
                        i = ((iM55680 ^ i4) * (-20115)) ^ (-546221252);
                        i2 = -23175822;
                    } else {
                        iM55680 = C0946.m55979("۠ܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-20675)) ^ (-159659392);
                        i2 = 207721954;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    m22243(viewOnClickListenerC7928, iM559710 ^ i7);
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C1036.m56260(this);
    }
}
