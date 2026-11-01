package p067l;

import android.view.View;
import com.google.android.material.slider.BaseSlider;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: IAQP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13756 {

    /* JADX INFO: renamed from: ܳܺۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f82164 = {8593, 13083, 12624, 4212};

    /* JADX INFO: renamed from: ֫ */
    public final boolean f38879;

    /* JADX INFO: renamed from: ۧ */
    public final C14849 f38880;

    /* JADX INFO: renamed from: ܽ */
    public List f38881;

    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f A[PHI: r7 r11 r16
      0x015f: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:47:0x015d, B:43:0x0140, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:47:0x015d, B:43:0x0140, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r16v24 int) = (r16v11 int), (r16v12 int), (r16v25 int) binds: [B:47:0x015d, B:43:0x0140, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8 A[PHI: r6 r16
      0x01c8: PHI (r6v5 l.۬۬ۧ) = (r6v2 l.۬۬ۧ), (r6v4 l.۬۬ۧ), (r6v2 l.۬۬ۧ) binds: [B:55:0x01c6, B:31:0x00d6, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r16v21 int) = (r16v9 int), (r16v15 int), (r16v26 int) binds: [B:55:0x01c6, B:31:0x00d6, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x021e A[PHI: r5 r8 r9 r16
      0x021e: PHI (r5v4 android.view.View) = 
      (r5v2 android.view.View)
      (r5v2 android.view.View)
      (r5v2 android.view.View)
      (r5v3 android.view.View)
      (r5v2 android.view.View)
     binds: [B:63:0x021c, B:59:0x01f9, B:39:0x0119, B:35:0x00f9, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:63:0x021c, B:59:0x01f9, B:39:0x0119, B:35:0x00f9, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:63:0x021c, B:59:0x01f9, B:39:0x0119, B:35:0x00f9, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r16v16 int) = (r16v7 int), (r16v8 int), (r16v13 int), (r16v14 int), (r16v17 int) binds: [B:63:0x021c, B:59:0x01f9, B:39:0x0119, B:35:0x00f9, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    public C13756(ActivityC24484 activityC24484, boolean z) {
        int iM55979;
        int i;
        int i2;
        List listM20937;
        int i3 = C1025.f81947;
        int i4 = ServiceConnectionC1013.f81940;
        short s = f82164[0];
        int i5 = s + 14251;
        int i6 = (s * s) + 203091001;
        int i7 = (i6 + i6) - (i5 * i5) < 0 ? 32849 : 19669;
        int iM55680 = C0873.m55680("۟ܶ") ^ i4;
        int i8 = ((iM55680 ^ i3) * (-22977)) ^ (-1536639533);
        C14849 c14849 = null;
        short[] sArr = null;
        int i9 = iM55680 ^ 18597814;
        int iM55681 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1610158308;
        View viewM56181 = null;
        List list = null;
        while (true) {
            int i14 = i9 ^ (i8 & (((i13 ^ i3) * 17597) >> 31));
            switch (i14) {
                case -2050518774:
                case 69710697:
                    RunnableC0871.m55672();
                    iM55979 = (C0873.m55680("۟ܽ") ^ i4) * 97;
                    i14 = i14;
                    i = ((iM55979 ^ i3) * 6471) ^ (-88820549);
                    i2 = 376300302;
                    int i15 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i15;
                    break;
                case -1934953920:
                case 138826126:
                    i14 = i14;
                    viewM56181 = C1017.m56181(activityC24484, iM55681 ^ i10);
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ܶۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-14167)) ^ (-387391463);
                        i2 = 1560001188;
                    } else {
                        iM55979 = C0946.m55979("ܿᩳ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24129)) ^ (-1689862587);
                        i2 = 36979009;
                    }
                    int i16 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i16;
                    break;
                case -1779440148:
                case -684505771:
                    listM20937 = C11721.m26923();
                    list = listM20937;
                    iM55979 = (C0873.m55680("ܿᩴ") + i3) * (-39);
                    i = ((iM55979 ^ i4) * (-30237)) ^ 62276597;
                    i2 = 1463908322;
                    int i17 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i17;
                    break;
                case -1510033595:
                case 2110175128:
                    i14 = i14;
                    this.f38880 = c14849;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܶۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-14167)) ^ (-387391463);
                        i2 = 1560001188;
                    } else {
                        iM55979 = C0873.m55680("᩵ܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 19809) ^ (-1527783583);
                        i2 = -298855617;
                    }
                    int i18 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i18;
                    break;
                case -1341347407:
                case 749816848:
                    C0927.m55873();
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55979 = (C0873.m55680("۟ܽ") ^ i4) * 97;
                        i14 = i14;
                        i = ((iM55979 ^ i3) * 6471) ^ (-88820549);
                        i2 = 376300302;
                    } else {
                        i14 = i14;
                        iM55979 = C0946.m55979("᩵ۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-21117)) ^ (-767359326);
                        i2 = 2139243171;
                    }
                    int i19 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i19;
                    break;
                case -907129369:
                case 182041097:
                    i14 = i14;
                    i12 = 3;
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("۬ۤ") + i3) * (-71);
                        i = ((iM55979 ^ i4) * (-1593)) ^ (-1912034824);
                        i2 = 708606356;
                    } else {
                        iM55979 = (C0873.m55680("ۘ᩷") ^ i4) * (-17);
                        i = ((iM55979 ^ i3) * 22639) ^ 747403042;
                        i2 = 1501089278;
                    }
                    int i110 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i110;
                    break;
                case -906268701:
                case 1386855249:
                    i14 = i14;
                    if (C0873.m55678()) {
                        iM55979 = C0946.m55979("ۗܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-20167)) ^ (-1672951915);
                        i2 = -2045703502;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܺܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55979 ^ i4) * 25813) ^ (-1285528211);
                        i2 = -589782179;
                    }
                    int i111 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i111;
                    break;
                case -731695377:
                case 1418927214:
                    i14 = i14;
                    i10 = 2128762344;
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ܶۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-14167)) ^ (-387391463);
                        i2 = 1560001188;
                    } else {
                        iM55979 = (C0873.m55680("ۚ۫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i3) * 30431) ^ (-1855816652);
                        i2 = 62460197;
                    }
                    int i112 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i112;
                    break;
                case -540326528:
                case 304326222:
                    C0854.m55595();
                    throw new RuntimeException();
                case -395689136:
                case 1433575843:
                    i14 = i14;
                    this.f38881 = list;
                    sArr = f82164;
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("ܶۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-14167)) ^ (-387391463);
                        i2 = 1560001188;
                    } else {
                        iM55979 = C0873.m55680("ۗ۠") ^ i4;
                        i = ((iM55979 ^ i3) * 20021) ^ 96796884;
                        i2 = -597952387;
                    }
                    int i113 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i113;
                    break;
                case -303239439:
                case 410595060:
                    i14 = i14;
                    this.f38879 = z;
                    if (z) {
                        iM55979 = (C0946.m55979("᩸۫") ^ i3) * (-31);
                        i = ((iM55979 ^ i4) * (-2415)) ^ 281033015;
                        i2 = -1260985461;
                    } else {
                        iM55979 = C0946.m55979("ۨ۬") ^ i4;
                        i = ((iM55979 ^ i3) * 28121) ^ 95763119;
                        i2 = -741814360;
                    }
                    int i114 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i114;
                    break;
                case -240715070:
                case 1061152732:
                    listM20937 = C9038.m20937();
                    list = listM20937;
                    iM55979 = (C0873.m55680("ܿᩴ") + i3) * (-39);
                    i = ((iM55979 ^ i4) * (-30237)) ^ 62276597;
                    i2 = 1463908322;
                    int i115 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i115;
                    break;
                case -156009544:
                case 852673994:
                    i14 = i14;
                    c14849 = (C14849) viewM56181;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("ۗܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-20167)) ^ (-1672951915);
                        i2 = -2045703502;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩹") ^ i4;
                        i = ((iM55979 ^ i3) * 11951) ^ 609876814;
                        i2 = -1859015640;
                    }
                    int i116 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i116;
                    break;
                case -17291236:
                case 494491390:
                    i14 = i14;
                    i11 = 1;
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = C0946.m55979("᩵ۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-21117)) ^ (-767359326);
                        i2 = 2139243171;
                    } else {
                        iM55979 = C0946.m55979("ۜ۫") ^ i3;
                        i = ((iM55979 ^ i4) * 14891) ^ 1914031080;
                        i2 = 1030313861;
                    }
                    int i117 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i117;
                    break;
                case 412797833:
                case 451930335:
                    i14 = i14;
                    iM55681 = C0873.m55680(C0882.m55717(sArr, i11, i12, i7));
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("۬ۤ") + i3) * (-71);
                        i = ((iM55979 ^ i4) * (-1593)) ^ (-1912034824);
                        i2 = 708606356;
                    } else {
                        iM55979 = C0946.m55979("ܰ۠") ^ i3;
                        i = ((iM55979 ^ i4) * (-13285)) ^ 697876798;
                        i2 = 551817906;
                    }
                    int i118 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i118;
                    break;
                case 447424947:
                case 1629695150:
                    C0906.m55818(c14849, new C14426(activityC24484, this));
                    return;
                case 816633828:
                case 1298227508:
                    i14 = i14;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ܶۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-14167)) ^ (-387391463);
                        i2 = 1560001188;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩶ۚ")) * (-41);
                        i = ((iM55979 ^ i3) * 7003) ^ (-1768858639);
                        i2 = 1583846021;
                    }
                    int i119 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i119;
                    break;
                case 1636583538:
                case 1793467530:
                    C0937.m55918();
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0873.m55680("۟ܽ") ^ i4) * 97;
                        i14 = i14;
                        i = ((iM55979 ^ i3) * 6471) ^ (-88820549);
                        i2 = 376300302;
                    } else {
                        i14 = i14;
                        iM55979 = (C0873.m55680("۬ۤ") + i3) * (-71);
                        i = ((iM55979 ^ i4) * (-1593)) ^ (-1912034824);
                        i2 = 708606356;
                    }
                    int i1110 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i1110;
                    break;
                default:
                    if (C1024.f81946) {
                        i14 = i14;
                        iM55979 = C0946.m55979("ۗܿ") ^ i4;
                        i = ((iM55979 ^ i3) * (-20167)) ^ (-1672951915);
                        i2 = -2045703502;
                        int i1111 = i14;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                        i13 = i1111;
                    }
                    i14 = i14;
                    iM55979 = (C0873.m55680("۬ۤ") + i3) * (-71);
                    i = ((iM55979 ^ i4) * (-1593)) ^ (-1912034824);
                    i2 = 708606356;
                    int i1112 = i14;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    i13 = i1112;
                    break;
            }
        }
    }
}
