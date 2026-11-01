package p067l;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import bin.p000mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21428 extends AbstractC21491 {

    /* JADX INFO: renamed from: ۘۙ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f82968 = {4592, 4092, -2534, 5875, 6761, 6134, -3051, -3021, 5298, 27723, 30561, -17588, 29860, -29846, -26976};

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C11400 f67610;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Main f67611;

    /* JADX INFO: renamed from: ᩸ */
    public AccelerateInterpolator f67612;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f67613;

    /* JADX WARN: Code duplicated, block: B:101:0x0471 A[PHI: r2 r4 r19 r20 r22 r23 r24 r25
      0x0471: PHI (r2v100 int) = (r2v73 int), (r2v77 int), (r2v87 int), (r2v102 int) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r4v73 int) = (r4v53 int), (r4v57 int), (r4v65 int), (r4v74 int) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r19v6 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r20v6 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r22v25 int) = (r22v4 int), (r22v9 int), (r22v17 int), (r22v26 int) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r23v17 int) = (r23v2 int), (r23v2 int), (r23v13 int), (r23v2 int) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r24v26 short[]) = (r24v4 short[]), (r24v9 short[]), (r24v19 short[]), (r24v27 short[]) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0471: PHI (r25v7 int) = (r25v2 int), (r25v2 int), (r25v3 int), (r25v2 int) binds: [B:100:0x046f, B:88:0x03d4, B:72:0x02f2, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0216  */
    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerSlide(View view, float f) {
        int i;
        int i2;
        int iM55979;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        C21428 c21428 = this;
        View view2 = view;
        int i8 = C0930.f81879;
        int i9 = RunnableC0871.f81839;
        int iM559711 = (i9 - C0946.m55979("᩹ۖ")) * (-45);
        int i10 = ((iM559711 ^ i8) * (-2709)) ^ (-1552285130);
        Main main = null;
        C1326 c1326 = null;
        C11400 c11400 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM559711 ^ (-1882982983);
        int i12 = 0;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        int iM55874 = 0;
        float interpolation = 0.0f;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 0;
        int iM55681 = 0;
        int iM55718 = 0;
        int i19 = -1035440894;
        int i20 = 0;
        short[] sArr3 = null;
        int i21 = 0;
        while (true) {
            i19 = i11 ^ (i10 & (((i19 ^ i8) * (-5075)) >> 31));
            switch (i19) {
                case -2128466881:
                case 2089771588:
                    C0989.m56095();
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("ۨ۟") + i9) * (-87);
                        i2 = ((iM55979 ^ i8) * 20619) ^ 902727926;
                        i3 = 38504459;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i18 = i18;
                        i20 = i20;
                        sArr = sArr;
                        iM55718 = iM55718;
                        iM55680 = (C0873.m55680("ۤۨ") ^ i8) * (-43);
                        i4 = ((iM55680 ^ i9) * 5705) ^ (-1375839311);
                        i5 = -1469442934;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    }
                    break;
                case -2096232510:
                case 1991440246:
                    C1028.m56238(c11400, z2 ? 1 : 0);
                    c21428.f67613 = z;
                    break;
                case -1957961745:
                case -473125886:
                    if (f == 0.0f) {
                        iM55979 = C0873.m55680("ᩴ۠") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-2173)) ^ (-945557328);
                        i3 = 524246891;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩸") + i8) * (-31);
                        i2 = ((iM55979 ^ i9) * (-19653)) ^ (-824816197);
                        i3 = -8477936;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1907672752:
                case -1597410372:
                    C1012.m56134();
                    break;
                case -1876703138:
                case -1450410008:
                    break;
                case -1734795303:
                case -1517868665:
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    sArr3 = f82968;
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0946.m55979("᩸᩷") ^ i9;
                        i4 = ((iM55680 ^ i8) * (-14419)) ^ (-884863944);
                        i5 = -899854006;
                    } else {
                        iM55680 = (C0873.m55680("ܽۢ") + i8) * 17;
                        i4 = ((iM55680 ^ i9) * 10789) ^ (-1264311305);
                        i5 = 283294637;
                    }
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case -1615778237:
                case 2018712688:
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    i16 = 65536;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("᩸᩷") ^ i9;
                        i4 = ((iM55680 ^ i8) * (-14419)) ^ (-884863944);
                        i5 = -899854006;
                    } else {
                        iM55680 = (i8 - C0946.m55979("۬ۗ")) * (-31);
                        i4 = ((iM55680 ^ i9) * (-23347)) ^ (-1736340718);
                        i5 = 181841802;
                    }
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case -1565199623:
                case 1619424911:
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    if (C0930.f81879 > 0) {
                        iM55680 = C0873.m55680("ۜ᩹") ^ i9;
                        i4 = ((iM55680 ^ i8) * (-23011)) ^ (-1036592406);
                        i5 = 1014774069;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    } else {
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        iM559710 = C0946.m55979("ۖۜ") ^ i9;
                        i10 = 1432776465 ^ ((iM559710 ^ i8) * (-3635));
                        i6 = 812520887;
                        i11 = iM559710 ^ i6;
                        c21428 = this;
                        view2 = view;
                        i20 = i20;
                    }
                    break;
                case -1543889058:
                case 830538865:
                    main.f40.m33745(z ? 1 : 0, view2);
                    iM55979 = (C0873.m55680("ܶ᩸") + i8) * (-31);
                    i2 = ((iM55979 ^ i9) * (-19653)) ^ (-824816197);
                    i3 = -8477936;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1526728051:
                case 2128729681:
                    short[] sArr4 = sArr;
                    int i22 = i17;
                    i18 = i18;
                    iM55718 = iM55718;
                    i20 = i20;
                    iM55681 = C0873.m55680(C0949.m56016(sArr4, i22, i18, i13));
                    if (C0992.f81922 < 0) {
                        int iM55682 = C0873.m55680("ۚۚ") ^ i8;
                        i7 = ((iM55682 ^ i9) * 15783) ^ 1908698502;
                        i11 = iM55682 ^ 520327613;
                        i17 = i22;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr4;
                        view2 = view;
                        i18 = i18;
                        i10 = i7;
                        c21428 = this;
                    } else {
                        sArr = sArr4;
                        i17 = i22;
                        iM55680 = C0946.m55979("᩸᩷") ^ i9;
                        i4 = ((iM55680 ^ i8) * (-14419)) ^ (-884863944);
                        i5 = -899854006;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    }
                    break;
                case -1471102940:
                case 854535002:
                    C0949.m56012();
                    if (AbstractC0942.f81890 > 0) {
                        i18 = i18;
                        i20 = i20;
                        sArr = sArr;
                        iM55718 = iM55718;
                        iM55680 = C0946.m55979("᩸᩷") ^ i9;
                        i4 = ((iM55680 ^ i8) * (-14419)) ^ (-884863944);
                        i5 = -899854006;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    } else {
                        i = iM55718;
                        int iM55683 = C0873.m55680("۠ᩴ") ^ i8;
                        i7 = ((iM55683 ^ i9) * (-14117)) ^ (-1644966876);
                        i11 = iM55683 ^ (-1348492707);
                        iM55718 = i;
                        i10 = i7;
                        c21428 = this;
                    }
                    break;
                case -1453683811:
                case -272406197:
                    C0898.m55800();
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    iM55680 = (C0873.m55680("ۤۨ") ^ i8) * (-43);
                    i4 = ((iM55680 ^ i9) * 5705) ^ (-1375839311);
                    i5 = -1469442934;
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case -1449840418:
                case 1506606492:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("ۜۢ") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-20305)) ^ (-913573873);
                        i3 = -2031257004;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i18 = i18;
                        i20 = i20;
                        sArr = sArr;
                        iM55718 = iM55718;
                        iM55680 = (C0873.m55680("ۤۨ") ^ i8) * (-43);
                        i4 = ((iM55680 ^ i9) * 5705) ^ (-1375839311);
                        i5 = -1469442934;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    }
                    break;
                case -1447811559:
                case -1103796498:
                    if (c21428.f67613) {
                        iM55979 = (i9 - C0946.m55979("᩹ۢ")) * 75;
                        i2 = ((iM55979 ^ i8) * (-3525)) ^ (-115096345);
                        i3 = 1350352463;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩸") + i8) * (-31);
                        i2 = ((iM55979 ^ i9) * (-19653)) ^ (-824816197);
                        i3 = -8477936;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1423903590:
                case -1390288075:
                    main = c21428.f67611;
                    int i23 = iM55718;
                    int i24 = i20;
                    if (i23 == i24) {
                        int iM55684 = C0873.m55680("ᩳ᩷") ^ i8;
                        int i25 = ((iM55684 ^ i9) * (-3249)) ^ (-51043137);
                        i20 = i24;
                        i11 = iM55684 ^ 276274463;
                        z2 = false;
                        iM55718 = i23;
                        i10 = i25;
                        f2 = 1.0f;
                    } else {
                        int iM55685 = (C0873.m55680("ۧᩳ") ^ i8) * (-19);
                        iM55718 = i23;
                        i20 = i24;
                        i11 = iM55685 ^ 1923162675;
                        i10 = ((iM55685 ^ i9) * 20809) ^ (-1345335230);
                        f2 = 1.0f;
                        z2 = false;
                    }
                    break;
                case -1360100011:
                case 527873292:
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    int i26 = s2 + s;
                    i14 = i26 * i26;
                    i15 = s2 * s2;
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("ۤۨ") ^ i8) * (-43);
                        i4 = ((iM55680 ^ i9) * 5705) ^ (-1375839311);
                        i5 = -1469442934;
                    } else {
                        iM55680 = C0873.m55680("᩻ܰ") ^ i8;
                        i4 = ((iM55680 ^ i9) * (-17869)) ^ (-1617117417);
                        i5 = -1324387424;
                    }
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case -1116348093:
                case 365196824:
                    i13 = 39646;
                    iM55680 = C0873.m55680("᩺ۨ") ^ i9;
                    i17 = i17;
                    i4 = ((iM55680 ^ i8) * 27509) ^ 32035958;
                    i5 = 1313305755;
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case -1060847647:
                case 1053405837:
                    c1326 = main.f13392;
                    interpolation = c21428.f67612.getInterpolation(f2 - f);
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("ۜۢ") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-20305)) ^ (-913573873);
                        i3 = -2031257004;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۜ") + i9) * 61;
                        i2 = ((iM55979 ^ i8) * (-24061)) ^ 695911616;
                        i3 = -254545286;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1030510228:
                case 282982721:
                    main.f40.m33745(z2 ? 1 : 0, view2);
                    break;
                case -698423796:
                case 1403379738:
                    if (C1003.m56123() != 0) {
                        i = iM55718;
                        int iM55686 = C0873.m55680("۠ᩴ") ^ i8;
                        i7 = ((iM55686 ^ i9) * (-14117)) ^ (-1644966876);
                        i11 = iM55686 ^ (-1348492707);
                        iM55718 = i;
                        i10 = i7;
                        c21428 = this;
                    } else {
                        iM55979 = (C0946.m55979("ۨ۟") + i9) * (-87);
                        i2 = ((iM55979 ^ i8) * 20619) ^ 902727926;
                        i3 = 38504459;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    }
                    break;
                case -675303270:
                case 157577743:
                    i20 = i20;
                    iM55718 = C0882.m55718(view);
                    sArr = f82968;
                    i17 = 9;
                    i18 = 3;
                    if (C1229.f82066 >= 0) {
                        iM559710 = C0946.m55979("ۖۜ") ^ i9;
                        i10 = 1432776465 ^ ((iM559710 ^ i8) * (-3635));
                        i6 = 812520887;
                    } else {
                        iM559710 = C0873.m55680("ᩳ᩵") ^ i9;
                        i10 = 2056970855 ^ ((iM559710 ^ i8) * (-27775));
                        i6 = 1023888192;
                    }
                    i11 = iM559710 ^ i6;
                    c21428 = this;
                    view2 = view;
                    i20 = i20;
                    break;
                case -401516621:
                case 809236125:
                    if (iM55874 == (C0946.m55979(C0949.m56016(sArr2, i21, i12, i13)) ^ 2104018953)) {
                        iM55979 = (C0946.m55979("ᩳۘ") + i9) * (-99);
                        i2 = ((iM55979 ^ i8) * (-6239)) ^ 1738609633;
                        i3 = 366119738;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩸") + i8) * (-31);
                        i2 = ((iM55979 ^ i9) * (-19653)) ^ (-824816197);
                        i3 = -8477936;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -366707731:
                case 1738468894:
                    if (f == f2) {
                        iM55979 = (i9 - C0946.m55979("ܰ֡")) * (-87);
                        i2 = ((iM55979 ^ i8) * 24043) ^ 1817481765;
                        i3 = 1765414018;
                    } else {
                        iM55979 = C0873.m55680("᩷ᩳ") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-27783)) ^ (-1900962256);
                        i3 = 313749148;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -263739562:
                case 1268631917:
                    C0898.m55802(c11400, 4);
                    c21428.f67613 = z2;
                    break;
                case -179367007:
                case 553246598:
                    iM55874 = C0927.m55874(view);
                    sArr2 = f82968;
                    i21 = 12;
                    i12 = 3;
                    if (C0946.f81894 == 0) {
                        iM55979 = (C0946.m55979("۟۫") + i9) * 127;
                        i2 = ((iM55979 ^ i8) * (-28927)) ^ 1444908093;
                        i3 = -1939757482;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i18 = i18;
                        i20 = i20;
                        sArr = sArr;
                        iM55718 = iM55718;
                        iM55680 = (C0873.m55680("ۤۨ") ^ i8) * (-43);
                        i4 = ((iM55680 ^ i9) * 5705) ^ (-1375839311);
                        i5 = -1469442934;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    }
                    break;
                case -18698457:
                case 403880158:
                    if (c21428.f67613) {
                        iM55979 = (C0873.m55680("ܶ᩸") + i8) * (-31);
                        i2 = ((iM55979 ^ i9) * (-19653)) ^ (-824816197);
                        i3 = -8477936;
                    } else {
                        iM55979 = (C0946.m55979("۫ܶ") + i8) * (-13);
                        i2 = ((iM55979 ^ i9) * 1627) ^ 2051407264;
                        i3 = -689687643;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case 171992902:
                case 625935461:
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    s2 = sArr3[8];
                    s = 256;
                    if (C0854.f81826 == 0) {
                        iM55680 = (C0873.m55680("۫֨") ^ i9) * 87;
                        i4 = ((iM55680 ^ i8) * (-10209)) ^ (-2045337567);
                        i5 = -88628181;
                        i11 = iM55680 ^ i5;
                        c21428 = this;
                        i20 = i20;
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        i10 = i4;
                        view2 = view;
                    } else {
                        iM55718 = iM55718;
                        sArr = sArr;
                        i18 = i18;
                        iM559710 = C0946.m55979("ۖۜ") ^ i9;
                        i10 = 1432776465 ^ ((iM559710 ^ i8) * (-3635));
                        i6 = 812520887;
                        i11 = iM559710 ^ i6;
                        c21428 = this;
                        view2 = view;
                        i20 = i20;
                    }
                    break;
                case 493240839:
                case 1576885409:
                    i18 = i18;
                    i20 = i20;
                    sArr = sArr;
                    iM55718 = iM55718;
                    int i27 = i15 + i16;
                    if (i14 - (i27 + i27) <= 0) {
                        iM55680 = (C0946.m55979("ۢ֫") ^ i9) * (-9);
                        i4 = ((iM55680 ^ i8) * (-17063)) ^ (-964489383);
                        i5 = -670098876;
                    } else {
                        iM55680 = (C0946.m55979("ܰܺ") ^ i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i9) * 22177) ^ 1857387720;
                        i5 = 38875140;
                    }
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case 961926219:
                case 1311026286:
                    i13 = 60370;
                    iM55680 = C0873.m55680("᩺ۨ") ^ i9;
                    i17 = i17;
                    i4 = ((iM55680 ^ i8) * 27509) ^ 32035958;
                    i5 = 1313305755;
                    i11 = iM55680 ^ i5;
                    c21428 = this;
                    i20 = i20;
                    iM55718 = iM55718;
                    sArr = sArr;
                    i18 = i18;
                    i10 = i4;
                    view2 = view;
                    break;
                case 1090709648:
                case 1634272516:
                    ViewOnClickListenerC0939.m55945(c1326, interpolation);
                    c11400 = c21428.f67610;
                    if (f > 0.7f) {
                        iM55979 = C0873.m55680("᩻ۖ") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-28357)) ^ 497122785;
                        i3 = -2029355948;
                    } else {
                        iM55979 = C0946.m55979("ۘ֨") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-16913)) ^ 1393818142;
                        i3 = -799074559;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                default:
                    i = iM55718;
                    i20 = iM55681 ^ 2098876110;
                    z = true;
                    z = true;
                    if (C0890.f81849 == 0) {
                        int iM55687 = (i9 - C0873.m55680("۬۟")) * 69;
                        i2 = ((iM55687 ^ i8) * (-15273)) ^ 50464953;
                        i11 = iM55687 ^ 730910390;
                        c21428 = this;
                        iM55718 = i;
                        i10 = i2;
                    } else {
                        int iM55688 = C0873.m55680("۠ᩴ") ^ i8;
                        i7 = ((iM55688 ^ i9) * (-14117)) ^ (-1644966876);
                        i11 = iM55688 ^ (-1348492707);
                        iM55718 = i;
                        i10 = i7;
                        c21428 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d2 A[PHI: r1 r3 r10 r12 r13
      0x01d2: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:52:0x01d0, B:41:0x0161, B:37:0x013f, B:29:0x0103, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:52:0x01d0, B:41:0x0161, B:37:0x013f, B:29:0x0103, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01d0, B:41:0x0161, B:37:0x013f, B:29:0x0103, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:52:0x01d0, B:41:0x0161, B:37:0x013f, B:29:0x0103, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:52:0x01d0, B:41:0x0161, B:37:0x013f, B:29:0x0103, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0263 A[PHI: r6 r7 r8 r9 r19
      0x0263: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:68:0x0261, B:60:0x0228, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:68:0x0261, B:60:0x0228, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:68:0x0261, B:60:0x0228, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v4 short) binds: [B:68:0x0261, B:60:0x0228, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:68:0x0261, B:60:0x0228, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0295 A[PHI: r5 r14
      0x0295: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:72:0x0293, B:64:0x0243, B:33:0x0121, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:72:0x0293, B:64:0x0243, B:33:0x0121, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerClosed(View view) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0949.f81897;
        int i4 = RunnableC1014.f81941;
        int iM55681 = C0873.m55680("۬ۢ") ^ i4;
        int i5 = ((iM55681 ^ i3) * 25725) ^ 181496672;
        Main main = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ 1848483513;
        int iM55874 = 0;
        int iM55682 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1883270304;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-20171)) >> 31));
            switch (i12) {
                case -2120817758:
                case -146640855:
                    break;
                case -1770375992:
                case 1564478765:
                    s = sArr[c];
                    s2 = 65892;
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ܺᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * (-637)) ^ (-655909196);
                        i2 = 2130271977;
                    } else {
                        iM55680 = (C0946.m55979("ۗۧ") + i4) * 41;
                        i = ((iM55680 ^ i3) * (-4561)) ^ (-51426916);
                        i2 = 1731441358;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1751680959:
                case -158045275:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("ۡ᩷") ^ i4;
                        i = ((iM55680 ^ i3) * (-15745)) ^ (-960315762);
                        i2 = -1269956669;
                    } else {
                        iM55680 = C0946.m55979("ۢܶ") ^ i3;
                        i = ((iM55680 ^ i4) * (-18415)) ^ (-1670178158);
                        i2 = 404652692;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1723628570:
                case 832566521:
                    c = 0;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ۢܶ") ^ i3;
                        i = ((iM55680 ^ i4) * (-18415)) ^ (-1670178158);
                        i2 = 404652692;
                    } else {
                        iM55680 = (C0946.m55979("֨ܰ") ^ i4) * 21;
                        i = ((iM55680 ^ i3) * 8989) ^ (-2136913482);
                        i2 = 1434195748;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1723325883:
                case 539170085:
                    sArr = f82968;
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ۚ᩶") + i4) * 99;
                        i = ((iM55680 ^ i3) * (-25517)) ^ 37431480;
                        i2 = -273277950;
                    } else {
                        iM55680 = (C0946.m55979("ۗۧ") + i4) * 41;
                        i = ((iM55680 ^ i3) * (-4561)) ^ (-51426916);
                        i2 = 1731441358;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1712102321:
                case 1722587532:
                    i9 = 30607;
                    iM55680 = C0873.m55680("ۧ۫") ^ i3;
                    i = ((iM55680 ^ i4) * (-5867)) ^ 1148342915;
                    i2 = 1900814752;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1682321112:
                case -78413324:
                    i11 = 3;
                    if (C0861.m55626()) {
                        iM55680 = C0946.m55979("ۢܶ") ^ i3;
                        i = ((iM55680 ^ i4) * (-18415)) ^ (-1670178158);
                        i2 = 404652692;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۧ") ^ i3) * (-81);
                        i = ((iM55680 ^ i4) * 13279) ^ 1290435715;
                        i2 = -710737138;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1533438260:
                case -1484452359:
                    C1964.m56597();
                    RunnableC0938.m55938();
                    iM55680 = C0946.m55979("ۡ᩷") ^ i4;
                    i = ((iM55680 ^ i3) * (-15745)) ^ (-960315762);
                    i2 = -1269956669;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1481693003:
                case 757657426:
                    i7 = s * s2;
                    s3 = 16473;
                    if (C0955.f81898) {
                        iM55680 = (C0946.m55979("ۗۧ") + i4) * 41;
                        i = ((iM55680 ^ i3) * (-4561)) ^ (-51426916);
                        i2 = 1731441358;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۟ۡ")) * (-125);
                        i = ((iM55680 ^ i4) * (-26117)) ^ 797948188;
                        i2 = 579566179;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1474662046:
                case -650390790:
                    iM55874 = C0927.m55874(view);
                    sArr2 = f82968;
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("᩵۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-10555)) ^ (-1606888984);
                        i2 = -159478021;
                    } else {
                        iM55680 = C0873.m55680("ܰܶ") ^ i4;
                        i = ((iM55680 ^ i3) * (-2229)) ^ (-68759894);
                        i2 = 1356213456;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1212421986:
                case 826017659:
                    i10 = 1;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("᩵۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-10555)) ^ (-1606888984);
                        i2 = -159478021;
                    } else {
                        iM55680 = C0946.m55979("ۙ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-11417)) ^ 1308473353;
                        i2 = -1699113551;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1052192218:
                case 1701740475:
                    if (C1053.f81965 > 0) {
                        iM55680 = C0946.m55979("ۡ᩷") ^ i4;
                        i = ((iM55680 ^ i3) * (-15745)) ^ (-960315762);
                        i2 = -1269956669;
                    } else {
                        iM55680 = C0873.m55680("᩺ܰ") ^ i3;
                        i = ((iM55680 ^ i4) * 10035) ^ (-86840622);
                        i2 = 2127608361;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1012689745:
                case -835681112:
                    i8 = s + s3;
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("᩵۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-10555)) ^ (-1606888984);
                        i2 = -159478021;
                    } else {
                        iM55680 = (C0946.m55979("᩹۬") ^ i4) * (-67);
                        i = ((iM55680 ^ i3) * 2159) ^ (-842559630);
                        i2 = -1337853005;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -984947857:
                case -16235662:
                    if (iM55874 == (2128493392 ^ iM55682)) {
                        iM55680 = (C0873.m55680("ۤ۫") ^ i4) * 63;
                        i = ((iM55680 ^ i3) * 3735) ^ (-42927481);
                        i2 = 1061454724;
                    } else {
                        iM55680 = (i4 - C0946.m55979("֨᩻")) * (-113);
                        i = ((iM55680 ^ i3) * 14213) ^ (-1242904597);
                        i2 = 821443823;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -887150297:
                case -276466059:
                    if ((i8 * i8) - i7 < 0) {
                        iM55680 = C0873.m55680("֡۠") ^ i4;
                        i = ((iM55680 ^ i3) * 9695) ^ 500994776;
                        i2 = 2109946498;
                    } else {
                        iM55680 = (C0873.m55680("ܽۢ") ^ i3) * 87;
                        i = ((iM55680 ^ i4) * (-24063)) ^ (-1666695477);
                        i2 = 1168972522;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -710418984:
                case -536688363:
                    C1194.m56396();
                    C0890.m55740();
                    break;
                case -461529461:
                case 264736354:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("֨᩺") ^ i3;
                        i = ((iM55680 ^ i4) * 4563) ^ 1897495867;
                        i2 = -109752111;
                    } else {
                        iM55680 = C0946.m55979("ۢܶ") ^ i3;
                        i = ((iM55680 ^ i4) * (-18415)) ^ (-1670178158);
                        i2 = 404652692;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -297656736:
                case 1749667902:
                    iM55682 = C0873.m55680(RunnableC1014.m56180(sArr2, i10, i11, i9));
                    if (C0863.m55643()) {
                        iM55680 = C0873.m55680("ۜۖ") ^ i3;
                        i = ((iM55680 ^ i4) * (-8799)) ^ 1596776076;
                        i2 = 471643187;
                    } else {
                        iM55680 = C0946.m55979("᩵۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-10555)) ^ (-1606888984);
                        i2 = -159478021;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 472466032:
                case 974010372:
                    i9 = 49573;
                    iM55680 = C0873.m55680("ۧ۫") ^ i3;
                    i = ((iM55680 ^ i4) * (-5867)) ^ 1148342915;
                    i2 = 1900814752;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 668908242:
                case 1527080261:
                    main = this.f67611;
                    if (main.f61 != null) {
                        int iM55683 = (C0873.m55680("ᩳۢ") ^ i3) * (-85);
                        i5 = ((iM55683 ^ i4) * 9969) ^ (-732401143);
                        i6 = iM55683 ^ (-1111538919);
                    } else {
                        iM55680 = (i4 - C0946.m55979("֨᩻")) * (-113);
                        i = ((iM55680 ^ i3) * 14213) ^ (-1242904597);
                        i2 = 821443823;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1230270365:
                case 1798637498:
                    main.f61.m12186(false);
                    iM55680 = (i4 - C0946.m55979("֨᩻")) * (-113);
                    i = ((iM55680 ^ i3) * 14213) ^ (-1242904597);
                    i2 = 821443823;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0955.m56025();
                    if (C1017.f81942 < 0) {
                        iM55680 = C0873.m55680("᩺ܰ") ^ i3;
                        i = ((iM55680 ^ i4) * 10035) ^ (-86840622);
                        i2 = 2127608361;
                    } else {
                        iM55680 = C0946.m55979("᩵۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-10555)) ^ (-1606888984);
                        i2 = -159478021;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0201 A[PHI: r8 r11 r12 r16 r17
      0x0201: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:56:0x01ff, B:41:0x015b, B:37:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:56:0x01ff, B:41:0x015b, B:37:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:56:0x01ff, B:41:0x015b, B:37:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r16v19 int) = (r16v8 int), (r16v14 int), (r16v15 int), (r16v20 int) binds: [B:56:0x01ff, B:41:0x015b, B:37:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r17v19 bin.mt.plus.Main) = (r17v8 bin.mt.plus.Main), (r17v14 bin.mt.plus.Main), (r17v15 bin.mt.plus.Main), (r17v20 bin.mt.plus.Main) binds: [B:56:0x01ff, B:41:0x015b, B:37:0x013a, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0238 A[PHI: r1 r7 r10 r16 r17
      0x0238: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int), (r1v2 int) binds: [B:60:0x0236, B:45:0x0181, B:5:0x0043, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:60:0x0236, B:45:0x0181, B:5:0x0043, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:60:0x0236, B:45:0x0181, B:5:0x0043, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r16v26 int) = (r16v7 int), (r16v13 int), (r16v21 int), (r16v27 int) binds: [B:60:0x0236, B:45:0x0181, B:5:0x0043, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r17v26 bin.mt.plus.Main) = (r17v7 bin.mt.plus.Main), (r17v13 bin.mt.plus.Main), (r17v21 bin.mt.plus.Main), (r17v27 bin.mt.plus.Main) binds: [B:60:0x0236, B:45:0x0181, B:5:0x0043, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b1 A[PHI: r3 r16 r17
      0x02b1: PHI (r3v5 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:72:0x02af, B:22:0x00a0, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r16v30 int) = (r16v3 int), (r16v18 int), (r16v36 int) binds: [B:72:0x02af, B:22:0x00a0, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r17v29 bin.mt.plus.Main) = (r17v3 bin.mt.plus.Main), (r17v18 bin.mt.plus.Main), (r17v33 bin.mt.plus.Main) binds: [B:72:0x02af, B:22:0x00a0, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02df A[PHI: r4 r5 r6 r16 r17
      0x02df: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char) binds: [B:76:0x02dd, B:68:0x028f, B:64:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:76:0x02dd, B:68:0x028f, B:64:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:76:0x02dd, B:68:0x028f, B:64:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r16v5 int) = (r16v2 int), (r16v4 int), (r16v6 int) binds: [B:76:0x02dd, B:68:0x028f, B:64:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r17v5 bin.mt.plus.Main) = (r17v2 bin.mt.plus.Main), (r17v4 bin.mt.plus.Main), (r17v6 bin.mt.plus.Main) binds: [B:76:0x02dd, B:68:0x028f, B:64:0x026c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerOpened(View view) {
        int iM55979;
        int i;
        int i2;
        int i3;
        int i4;
        int iM55680;
        int i5;
        int i6;
        int i7 = C0930.f81879;
        int i8 = C1964.f83032;
        int iM559710 = C0946.m55979("۫ۜ") ^ i7;
        int i9 = ((iM559710 ^ i8) * 12911) ^ 326432972;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM559710 ^ 447757759;
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1618358071;
        Main main = null;
        int iM55718 = 0;
        while (true) {
            int i17 = i10 ^ (i9 & (((i16 ^ i8) * 15049) >> 31));
            switch (i17) {
                case -2121486699:
                case -259471464:
                    main = main;
                    i17 = i17;
                    sArr = f82968;
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("ۙۧ") ^ i7;
                        i = ((iM55979 ^ i8) * (-23699)) ^ (-1260034892);
                        i2 = 570563059;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩶") ^ i8;
                        i = ((iM55979 ^ i7) * (-16181)) ^ 1659568462;
                        i2 = 1871240753;
                    }
                    int i18 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i18;
                    i9 = i;
                    main = main;
                    break;
                case -2068942464:
                case 213885739:
                    if (C1028.f81950 <= 0) {
                        main = main;
                        i17 = i17;
                        iM55979 = (C0873.m55680("ۘܽ") ^ i8) * 79;
                        i = ((iM55979 ^ i7) * (-10919)) ^ 1964075344;
                        i2 = -1472926814;
                        int i19 = iM55979 ^ i2;
                        i16 = i17;
                        i10 = i19;
                        i9 = i;
                        main = main;
                    }
                    main = main;
                    i17 = i17;
                    iM55979 = (C0946.m55979("֡ۘ") + i8) * 55;
                    i = ((iM55979 ^ i7) * 23509) ^ (-809039209);
                    i2 = 956486263;
                    int i110 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i110;
                    i9 = i;
                    main = main;
                    break;
                case -1922011196:
                case 1315192215:
                    if (!C0955.f81898) {
                        main = main;
                        i17 = i17;
                        iM55979 = C0873.m55680("ۙۧ") ^ i7;
                        i = ((iM55979 ^ i8) * (-23699)) ^ (-1260034892);
                        i2 = 570563059;
                        int i111 = iM55979 ^ i2;
                        i16 = i17;
                        i10 = i111;
                        i9 = i;
                        main = main;
                    } else {
                        iM55680 = C0873.m55680("۟ܳ") ^ i7;
                        i3 = i17;
                        i5 = ((iM55680 ^ i8) * (-26433)) ^ 794838345;
                        i6 = -824637416;
                        i4 = i3;
                        i10 = iM55680 ^ i6;
                        i9 = i5;
                        i16 = i4;
                    }
                    break;
                case -1868325949:
                case 285868304:
                    main = main;
                    i17 = i17;
                    s = sArr[c];
                    i11 = s * s;
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("֫ۚ") ^ i8;
                        i = ((iM55979 ^ i7) * 20575) ^ 180075125;
                        i2 = 2072481275;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۖ") + i8) * 85;
                        i = ((iM55979 ^ i7) * (-13923)) ^ 699660565;
                        i2 = -311828524;
                    }
                    int i112 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i112;
                    i9 = i;
                    main = main;
                    break;
                case -1866225680:
                case 396007918:
                    main = main;
                    i17 = i17;
                    if ((s * s2) - i12 > 0) {
                        iM55979 = C0946.m55979("ۜ֡") ^ i8;
                        i = ((iM55979 ^ i7) * 2221) ^ 575655568;
                        i2 = -82744654;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۗ") + i7) * (-5);
                        i = ((iM55979 ^ i8) * 31141) ^ (-1884066993);
                        i2 = -1201505281;
                    }
                    int i113 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i113;
                    i9 = i;
                    main = main;
                    break;
                case -1803144097:
                case 136173108:
                    main = main;
                    i17 = i17;
                    i12 = i11 + 325694209;
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ܶܺ") ^ i8;
                        i = ((iM55979 ^ i7) * 22839) ^ 2041179993;
                        i2 = -512061417;
                    } else {
                        iM55979 = (C0946.m55979("֡ۘ") + i8) * 55;
                        i = ((iM55979 ^ i7) * 23509) ^ (-809039209);
                        i2 = 956486263;
                    }
                    int i114 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i114;
                    i9 = i;
                    main = main;
                    break;
                case -1767564283:
                case 522543940:
                    i3 = i17;
                    ViewOnClickListenerC0939.m55946(main.f61);
                    iM55680 = C0873.m55680("᩻ᩳ") ^ i8;
                    i5 = ((iM55680 ^ i7) * 6361) ^ (-292897050);
                    i6 = 1283784509;
                    i4 = i3;
                    i10 = iM55680 ^ i6;
                    i9 = i5;
                    i16 = i4;
                    break;
                case -1739778156:
                case -822954476:
                    i13 = 6364;
                    iM55979 = C0946.m55979("ۤۗ") ^ i8;
                    i = ((iM55979 ^ i7) * (-22897)) ^ (-2084793685);
                    i2 = 1704739729;
                    int i115 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i115;
                    i9 = i;
                    main = main;
                    break;
                case -1660967146:
                case -1427135999:
                    RunnableC0938.m55938();
                    break;
                case -1374663180:
                case 2093486026:
                    main = main;
                    i17 = i17;
                    i14 = 5;
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ۘܽ") ^ i8) * 79;
                        i = ((iM55979 ^ i7) * (-10919)) ^ 1964075344;
                        i2 = -1472926814;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩷") ^ i7;
                        i = ((iM55979 ^ i8) * (-30017)) ^ (-1659235235);
                        i2 = -2124847948;
                    }
                    int i116 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i116;
                    i9 = i;
                    main = main;
                    break;
                case -1369532605:
                case -722138569:
                    i13 = 33018;
                    iM55979 = C0946.m55979("ۤۗ") ^ i8;
                    i = ((iM55979 ^ i7) * (-22897)) ^ (-2084793685);
                    i2 = 1704739729;
                    int i117 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i117;
                    i9 = i;
                    main = main;
                    break;
                case -1343952295:
                case -365957002:
                    main = main;
                    i17 = i17;
                    i15 = 3;
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ۘܽ") ^ i8) * 79;
                        i = ((iM55979 ^ i7) * (-10919)) ^ 1964075344;
                        i2 = -1472926814;
                    } else {
                        iM55979 = (C0946.m55979("ܰ᩵") ^ i8) * 51;
                        i = ((iM55979 ^ i7) * 20147) ^ (-678902376);
                        i2 = 1582074310;
                    }
                    int i118 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i118;
                    i9 = i;
                    main = main;
                    break;
                case -728141776:
                case 291443598:
                    main = main;
                    i17 = i17;
                    s2 = 36094;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۘܽ") ^ i8) * 79;
                        i = ((iM55979 ^ i7) * (-10919)) ^ 1964075344;
                        i2 = -1472926814;
                    } else {
                        iM55979 = C0873.m55680("ۨۚ") ^ i7;
                        i = ((iM55979 ^ i8) * (-14135)) ^ 1126055489;
                        i2 = -1099031820;
                    }
                    int i119 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i119;
                    i9 = i;
                    main = main;
                    break;
                case -500733996:
                case 1047639584:
                    main = main;
                    i17 = i17;
                    if (iM55718 == (C0946.m55979(C1036.m56252(sArr2, i14, i15, i13)) ^ 2102370476)) {
                        iM55979 = (C0946.m55979("ۨ֫") + i8) * (-117);
                        i = ((iM55979 ^ i7) * (-15761)) ^ (-695110536);
                        i2 = 2111069494;
                    } else {
                        iM55979 = (i7 - C0946.m55979("۠ܺ")) * 13;
                        i = ((iM55979 ^ i8) * 6537) ^ 1324335420;
                        i2 = 63431803;
                    }
                    int i1110 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i1110;
                    i9 = i;
                    main = main;
                    break;
                case 113004716:
                case 1549085847:
                    break;
                case 157661176:
                case 649155172:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0873.m55680("۟ܳ") ^ i7;
                        i3 = i17;
                        i5 = ((iM55680 ^ i8) * (-26433)) ^ 794838345;
                        i6 = -824637416;
                        i4 = i3;
                        i10 = iM55680 ^ i6;
                        i9 = i5;
                        i16 = i4;
                    } else {
                        main = main;
                        i17 = i17;
                        iM55979 = (C0946.m55979("֡ۘ") + i8) * 55;
                        i = ((iM55979 ^ i7) * 23509) ^ (-809039209);
                        i2 = 956486263;
                        int i1111 = iM55979 ^ i2;
                        i16 = i17;
                        i10 = i1111;
                        i9 = i;
                        main = main;
                    }
                    break;
                case 588068628:
                case 1965001600:
                    i3 = i17;
                    main = this.f67611;
                    if (main.f61 != null) {
                        int iM55681 = (i7 - C0873.m55680("ۡ᩵")) * 79;
                        i9 = ((iM55681 ^ i8) * 26691) ^ (-1278559690);
                        i4 = i3;
                        i10 = iM55681 ^ (-92119461);
                    } else {
                        iM55680 = C0873.m55680("᩻ᩳ") ^ i8;
                        i5 = ((iM55680 ^ i7) * 6361) ^ (-292897050);
                        i6 = 1283784509;
                        i4 = i3;
                        i10 = iM55680 ^ i6;
                        i9 = i5;
                    }
                    i16 = i4;
                    break;
                case 801888848:
                case 1350539521:
                    main = main;
                    i17 = i17;
                    iM55718 = C0882.m55718(view);
                    sArr2 = f82968;
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0946.m55979("֡ۘ") + i8) * 55;
                        i = ((iM55979 ^ i7) * 23509) ^ (-809039209);
                        i2 = 956486263;
                    } else {
                        iM55979 = (i7 - C0946.m55979("᩻ܳ")) * (-43);
                        i = ((iM55979 ^ i8) * 11643) ^ 847192809;
                        i2 = 1517530236;
                    }
                    int i1112 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i1112;
                    i9 = i;
                    main = main;
                    break;
                case 873300248:
                case 2030924456:
                    main = main;
                    i17 = i17;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("֫ۚ") ^ i8;
                        i = ((iM55979 ^ i7) * 20575) ^ 180075125;
                        i2 = 2072481275;
                    } else {
                        iM55979 = (C0946.m55979("֡᩸") + i7) * (-93);
                        i = ((iM55979 ^ i8) * (-4997)) ^ (-1561778719);
                        i2 = -2056861326;
                    }
                    int i1113 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i1113;
                    i9 = i;
                    main = main;
                    break;
                case 886733421:
                case 1516970353:
                    main = main;
                    i17 = i17;
                    c = 4;
                    if (C1194.m56396() <= 0) {
                        iM55979 = C0946.m55979("֫ۚ") ^ i8;
                        i = ((iM55979 ^ i7) * 20575) ^ 180075125;
                        i2 = 2072481275;
                    } else {
                        iM55979 = C0946.m55979("۫᩹") ^ i7;
                        i = ((iM55979 ^ i8) * 1969) ^ 52915032;
                        i2 = -1105327397;
                    }
                    int i1114 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i1114;
                    i9 = i;
                    main = main;
                    break;
                case 2036643462:
                case 2052090149:
                    i17 = i17;
                    ExecutorService executorService = C4081.f8987;
                    main = main;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ۙۧ") ^ i7;
                        i = ((iM55979 ^ i8) * (-23699)) ^ (-1260034892);
                        i2 = 570563059;
                    } else {
                        C0946.m55973(executorService, new RunnableC20107(2));
                        iM55979 = (i7 - C0946.m55979("۠ܺ")) * 13;
                        i = ((iM55979 ^ i8) * 6537) ^ 1324335420;
                        i2 = 63431803;
                    }
                    int i1115 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i1115;
                    i9 = i;
                    main = main;
                    break;
                default:
                    i17 = i17;
                    RunnableC0897.m55784();
                    C1046.m56302();
                    main = main;
                    iM55979 = (C0946.m55979("֡ۘ") + i8) * 55;
                    i = ((iM55979 ^ i7) * 23509) ^ (-809039209);
                    i2 = 956486263;
                    int i1116 = iM55979 ^ i2;
                    i16 = i17;
                    i10 = i1116;
                    i9 = i;
                    main = main;
                    break;
            }
            return;
        }
    }

    public C21428(Main main, C11400 c11400) {
        int iM55979;
        int i;
        int i2 = -1751368520;
        int i3 = C1404.f82149;
        int i4 = C0906.f81862;
        this.f67611 = main;
        this.f67610 = c11400;
        int iM559710 = C0946.m55979("ۤ᩵") ^ i3;
        int i5 = ((iM559710 ^ i4) * 4331) ^ (-432758038);
        int i6 = -393901449;
        while (true) {
            int i7 = iM559710 ^ i6;
            AccelerateInterpolator accelerateInterpolator = null;
            while (true) {
                i2 = i7 ^ (i5 & (((i2 ^ i4) * (-22007)) >> 31));
                switch (i2) {
                    case -1856050571:
                    case 1130654747:
                        if (AbstractC0942.f81890 <= 0) {
                            iM559710 = (C0873.m55680("᩵ۗ") + i3) * (-5);
                            i5 = ((iM559710 ^ i4) * 2695) ^ 838056396;
                            i6 = -312727399;
                        } else {
                            iM559710 = C0946.m55979("ۙۤ") ^ i3;
                            i5 = ((iM559710 ^ i4) * 4009) ^ (-635468223);
                            i6 = 103200776;
                        }
                        break;
                    case -1613588226:
                    case -1788990:
                        C1048.m56305();
                        if (C1025.f81947 >= 0) {
                            iM559710 = C0946.m55979("۬ۛ") ^ i4;
                            i5 = ((iM559710 ^ i3) * 9031) ^ 598178617;
                            i6 = 1110317859;
                        }
                        iM55979 = (i4 - C0946.m55979("ۚܺ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55979 ^ i3) * 30869) ^ (-50460987);
                        i = -1990406376;
                        i7 = iM55979 ^ i;
                        break;
                    case -1160816744:
                    case 972767170:
                        this.f67612 = accelerateInterpolator;
                        this.f67613 = true;
                        return;
                    case -770948065:
                    case 1139754946:
                        C0949.m56012();
                        throw new RuntimeException();
                    case -316247961:
                    case 410424854:
                        if (C0877.f81843 >= 0) {
                            iM559710 = (C0873.m55680("᩵ۗ") + i3) * (-5);
                            i5 = ((iM559710 ^ i4) * 2695) ^ 838056396;
                            i6 = -312727399;
                        }
                        iM55979 = (i4 - C0946.m55979("ۚܺ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55979 ^ i3) * 30869) ^ (-50460987);
                        i = -1990406376;
                        i7 = iM55979 ^ i;
                        break;
                    case 142027576:
                    case 910244947:
                        C1194.m56396();
                        C0882.m55710();
                        iM559710 = C0946.m55979("ۙۤ") ^ i3;
                        i5 = ((iM559710 ^ i4) * 4009) ^ (-635468223);
                        i6 = 103200776;
                        break;
                    default:
                        if (C0877.f81843 < 0 && ViewOnClickListenerC0939.f81888 > 0) {
                            if (C0892.m55749()) {
                                if (C0898.f81858 > 0 && C0946.f81894 == 0) {
                                    if (C1036.f81953 >= 0 || C1071.f81975 <= 0) {
                                        iM559710 = (C0873.m55680("᩵ۗ") + i3) * (-5);
                                        i5 = ((iM559710 ^ i4) * 2695) ^ 838056396;
                                        i6 = -312727399;
                                        break;
                                    } else if (!RunnableC0897.m55784() && C1012.m56134() > 0) {
                                        accelerateInterpolator = new AccelerateInterpolator(0.4f);
                                        if (C1929.m56553()) {
                                            iM55979 = C0873.m55680("ۢ۫") ^ i3;
                                            i5 = ((iM55979 ^ i4) * 6515) ^ (-910113786);
                                            i = 734939319;
                                        } else {
                                            iM55979 = (C0946.m55979("ۜۢ") ^ i4) * (-103);
                                            i5 = ((iM55979 ^ i3) * (-30597)) ^ (-2060651879);
                                            i = -1436491609;
                                        }
                                        i7 = iM55979 ^ i;
                                        break;
                                    }
                                }
                            }
                            iM559710 = C0946.m55979("ۙۤ") ^ i3;
                            i5 = ((iM559710 ^ i4) * 4009) ^ (-635468223);
                            i6 = 103200776;
                            break;
                        }
                        iM559710 = C0946.m55979("۬ۛ") ^ i4;
                        i5 = ((iM559710 ^ i3) * 9031) ^ 598178617;
                        i6 = 1110317859;
                        break;
                }
            }
        }
    }
}
