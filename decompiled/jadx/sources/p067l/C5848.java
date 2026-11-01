package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5848 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩻ۨۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f81945 = {5693, 26301, -28903, -26532, 28105, -18037, -17702, -27558, -19013, 27357, -25263, -16829, 25074, 5591, 25311, 23745, 23030};

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC23283 f14354;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f14355;

    /* JADX WARN: Code duplicated, block: B:26:0x00b9 A[PHI: r3
      0x00b9: PHI (r3v5 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:25:0x00b7, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed A[PHI: r4 r5 r14
      0x00ed: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:29:0x00eb, B:21:0x0093, B:17:0x007d, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:29:0x00eb, B:21:0x0093, B:17:0x007d, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:29:0x00eb, B:21:0x0093, B:17:0x007d, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0210 A[PHI: r8 r9 r10
      0x0210: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:60:0x020e, B:52:0x01d2, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:60:0x020e, B:52:0x01d2, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:60:0x020e, B:52:0x01d2, B:48:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0242 A[PHI: r2 r7 r11 r13 r19
      0x0242: PHI (r2v4 l.᩹ۖ᩷) = (r2v2 l.᩹ۖ᩷), (r2v2 l.᩹ۖ᩷), (r2v2 l.᩹ۖ᩷), (r2v3 l.᩹ۖ᩷), (r2v2 l.᩹ۖ᩷), (r2v2 l.᩹ۖ᩷), (r2v2 l.᩹ۖ᩷) binds: [B:64:0x0240, B:56:0x01f1, B:44:0x0193, B:33:0x0121, B:15:0x007a, B:11:0x005e, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:64:0x0240, B:56:0x01f1, B:44:0x0193, B:33:0x0121, B:15:0x007a, B:11:0x005e, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:64:0x0240, B:56:0x01f1, B:44:0x0193, B:33:0x0121, B:15:0x007a, B:11:0x005e, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:64:0x0240, B:56:0x01f1, B:44:0x0193, B:33:0x0121, B:15:0x007a, B:11:0x005e, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0240, B:56:0x01f1, B:44:0x0193, B:33:0x0121, B:15:0x007a, B:11:0x005e, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55680;
        int i;
        int i2;
        int i3 = C0845.f81821;
        int i4 = C1404.f82149;
        int iM55681 = C0873.m55680("ۛ֨") ^ i4;
        int i5 = ((iM55681 ^ i3) * 7029) ^ 372979532;
        String strM55936 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ 228857124;
        ActivityC23283 activityC23283 = null;
        int iM55682 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1858619205;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-29397)) >> 31));
            switch (i12) {
                case -2053264034:
                case -373529463:
                    if (i9 - (s * s2) >= 0) {
                        iM55680 = C0946.m55979("۬ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 29527) ^ 449801620;
                        i2 = 1284656265;
                    } else {
                        iM55680 = C0946.m55979("۬ۜ") ^ i4;
                        i = ((iM55680 ^ i3) * 24483) ^ (-666218904);
                        i2 = -439627867;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1847259506:
                case 1370715639:
                    if (C1071.m56343() != 0) {
                        iM55680 = (C0873.m55680("ܿۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * (-1321)) ^ 491443420;
                        i2 = -2027068835;
                    } else {
                        iM55680 = (C0873.m55680("۠۫") + i3) * (-35);
                        i = ((iM55680 ^ i4) * (-27875)) ^ 76551163;
                        i2 = -1818173664;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1771720437:
                case -1033683412:
                    iM55682 = C0873.m55680(strM55936);
                    i7 = 2123551467;
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ܰۖ") + i3) * (-121);
                        i = ((iM55680 ^ i4) * 24223) ^ 496898735;
                        i2 = 822024496;
                    } else {
                        iM55680 = (i4 - C0946.m55979("᩵ۗ")) * 9;
                        i = ((iM55680 ^ i3) * (-30485)) ^ (-1359318208);
                        i2 = 1214501322;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1654547318:
                case 828135654:
                    s2 = 21814;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    } else {
                        iM55680 = C0946.m55979("ܳ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-22481)) ^ (-1845788128);
                        i2 = 1033283451;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1544604651:
                case -636401806:
                    i11 = 14;
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("ܰۖ") + i3) * (-121);
                        i = ((iM55680 ^ i4) * 24223) ^ 496898735;
                        i2 = 822024496;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۨ") + i3) * 63;
                        i = ((iM55680 ^ i4) * 14493) ^ (-1563230231);
                        i2 = 1389452673;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1525677951:
                case 2052954945:
                    activityC23283 = this.f14354;
                    sArr2 = f81945;
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩶᩻")) * (-111);
                        i = ((iM55680 ^ i4) * (-27069)) ^ (-103513495);
                        i2 = -700954637;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1363230919:
                case -1263046371:
                    C1003.m56123();
                    C1044.m56286();
                    iM55680 = (C0946.m55979("ܰۖ") + i3) * (-121);
                    i = ((iM55680 ^ i4) * 24223) ^ 496898735;
                    i2 = 822024496;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1338531638:
                case -877594505:
                    i10 = 437;
                    iM55680 = (C0873.m55680("ۖܺ") ^ i4) * (-17);
                    i = ((iM55680 ^ i3) * 24199) ^ (-1494442315);
                    i2 = 1278558953;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1101000442:
                case -790736870:
                    C1025.m56230();
                    if (C0917.m55854()) {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    } else {
                        iM55680 = C0946.m55979("ܰۨ") ^ i4;
                        i = ((iM55680 ^ i3) * 28061) ^ 142396274;
                        i2 = -624043115;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1094034977:
                case -420596194:
                    c = '\r';
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    } else {
                        iM55680 = (C0873.m55680("ۗۜ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i4) * 31683) ^ (-2033834847);
                        i2 = -1787447003;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1024285710:
                case 1662793771:
                    i9 = i8 + 118962649;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("ܿۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * (-1321)) ^ 491443420;
                        i2 = -2027068835;
                    } else {
                        iM55680 = C0946.m55979("ܿۤ") ^ i3;
                        i = ((iM55680 ^ i4) * 6283) ^ 785511946;
                        i2 = -839278040;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -739194380:
                case 836842985:
                    i10 = 8563;
                    iM55680 = (C0873.m55680("ۖܺ") ^ i4) * (-17);
                    i = ((iM55680 ^ i3) * 24199) ^ (-1494442315);
                    i2 = 1278558953;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -644945867:
                case 2044647515:
                    sArr = f81945;
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    } else {
                        iM55680 = C0873.m55680("۟۟") ^ i4;
                        i = ((iM55680 ^ i3) * 6375) ^ (-693318600);
                        i2 = -2053535445;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -16255083:
                case 30374544:
                    s = sArr[c];
                    i8 = s * s;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("ܿۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * (-1321)) ^ 491443420;
                        i2 = -2027068835;
                    } else {
                        iM55680 = (C0946.m55979("ۡ۠") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i3) * 8187) ^ 157277249;
                        i2 = 726183464;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 250026257:
                case 605861520:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0946.m55979("ܰۖ") + i3) * (-121);
                        i = ((iM55680 ^ i4) * 24223) ^ 496898735;
                        i2 = 822024496;
                    } else {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 658422735:
                case 2059976497:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۨܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 3047) ^ (-759113397);
                        i2 = 1377533756;
                    } else {
                        iM55680 = C0946.m55979("ۚۗ") ^ i4;
                        i = ((iM55680 ^ i3) * (-15113)) ^ 79382394;
                        i2 = 83143707;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1027448768:
                case 1231624235:
                    m22243(activityC23283, iM55682 ^ i7);
                    break;
                case 1440943616:
                case 2143087104:
                    strM55936 = RunnableC0938.m55936(sArr2, i11, 3, i10);
                    if (C0917.m55854()) {
                        iM55680 = (C0946.m55979("֨ܿ") + i4) * (-19);
                        i = ((iM55680 ^ i3) * (-26705)) ^ 1459047427;
                        i2 = -2102216837;
                    } else {
                        iM55680 = C0946.m55979("ۚۗ") ^ i4;
                        i = ((iM55680 ^ i3) * (-15113)) ^ 79382394;
                        i2 = 83143707;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1003.m56123();
                    RunnableC0938.m55938();
                    break;
            }
            return;
        }
    }

    public C5848(ActivityC23283 activityC23283, String str) {
        int i = 155197047;
        int i2 = C0906.f81862;
        int i3 = C1017.f81942;
        this.f14354 = activityC23283;
        this.f14355 = str;
        int iM55680 = C0873.m55680("ܶ᩵") ^ i2;
        int i4 = ((iM55680 ^ i3) * 19083) ^ (-1716569269);
        int i5 = -604252357;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * 14543) >> 31));
            switch (i) {
                case -878186629:
                case -522435018:
                    C1024.m56209();
                    C0930.m55885();
                    throw new RuntimeException();
                case -871483894:
                case -111325785:
                    C0854.m55595();
                    if (!C0967.m56074()) {
                        iM55680 = C0873.m55680("᩸ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8543)) ^ (-692929704);
                        i5 = -921056027;
                    } else {
                        iM55680 = C0946.m55979("ۚ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25841)) ^ 1158215371;
                        i5 = 2054205038;
                    }
                    break;
                case -713506238:
                case -517188749:
                    C0894.m55769();
                    C0882.m55710();
                    iM55680 = C0946.m55979("ᩴ۟") ^ i3;
                    i4 = ((iM55680 ^ i2) * 26905) ^ (-1118007753);
                    i5 = 438163930;
                    break;
                case -457117308:
                case -450375892:
                    return;
                case -359153298:
                case 1962121455:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i2 - C0873.m55680("֨֫")) * (-67);
                        i4 = ((iM55680 ^ i3) * (-16399)) ^ (-1721937866);
                        i5 = -1212890531;
                    } else {
                        iM55680 = C0946.m55979("ۗܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17029)) ^ 1935180768;
                        i5 = 1244635710;
                    }
                    break;
                case 413399831:
                case 924161846:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = C0946.m55979("ۚ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25841)) ^ 1158215371;
                        i5 = 2054205038;
                    } else {
                        iM55680 = C0946.m55979("ᩴ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26905) ^ (-1118007753);
                        i5 = 438163930;
                    }
                    break;
                default:
                    C0892.m55749();
                    if (C0890.m55740()) {
                        iM55680 = (i3 - C0946.m55979("᩻ܳ")) * (-91);
                        i4 = ((iM55680 ^ i2) * 6477) ^ 1353592240;
                        i5 = -1929137251;
                    } else {
                        iM55680 = C0873.m55680("᩸ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8543)) ^ (-692929704);
                        i5 = -921056027;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0178 A[PHI: r11 r12
      0x0178: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:39:0x0176, B:27:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x0178: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:39:0x0176, B:27:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        int i2;
        ActivityC23283 activityC23283;
        short[] sArr;
        int iM559710;
        int i3;
        int iM55680;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int i7;
        final C5848 c5848 = this;
        int i8 = C0877.f81843;
        int i9 = AbstractC0942.f81890;
        int iM55681 = C0873.m55680("֡ܿ") ^ i8;
        int i10 = ((iM55681 ^ i9) * 6819) ^ 1351670450;
        final String str = null;
        Object[] objArr = null;
        DialogInterface.OnClickListener onClickListener = null;
        String strM56584 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM55681 ^ (-2145226975);
        int iM559711 = 0;
        int i12 = 0;
        int iM55682 = 0;
        int i13 = 0;
        short s = 0;
        short s2 = 0;
        int i14 = 0;
        ActivityC23283 activityC23284 = null;
        int i15 = 1991683010;
        C20671 c20671 = null;
        String strM55792 = null;
        int i16 = 0;
        String strM56159 = null;
        while (true) {
            i15 = i11 ^ (i10 & (((i15 ^ i9) * (-3103)) >> 31));
            switch (i15) {
                case -2120706317:
                case -2080042963:
                    int i17 = i14;
                    activityC23283 = activityC23284;
                    sArr = sArr4;
                    Object[] objArr2 = new Object[i17];
                    objArr2[0] = str;
                    if (C0898.f81858 > 0) {
                        int iM559712 = C0946.m55979("ܰᩴ") ^ i9;
                        i10 = ((iM559712 ^ i8) * (-25785)) ^ (-131062170);
                        i7 = iM559712 ^ (-1645538838);
                        objArr = objArr2;
                        sArr4 = sArr;
                        i14 = i17;
                        i11 = i7;
                        activityC23284 = activityC23283;
                    } else {
                        i14 = i17;
                        objArr = objArr2;
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                        i5 = iM559710 ^ i3;
                        activityC23284 = activityC23283;
                        sArr4 = sArr;
                        i14 = i14;
                        i11 = i5;
                        c5848 = this;
                    }
                    break;
                case -2071437338:
                case 482218891:
                    if (C0930.f81879 <= 0) {
                        int i18 = i14;
                        sArr2 = sArr4;
                        i6 = i18;
                        int iM559713 = (C0946.m55979("᩸۟") ^ i9) * 7;
                        i11 = iM559713 ^ (-1141658149);
                        i10 = ((iM559713 ^ i8) * (-2185)) ^ (-334705702);
                        short[] sArr5 = sArr2;
                        i14 = i6;
                        sArr4 = sArr5;
                    } else {
                        iM55979 = (C0946.m55979("ۙۙ") ^ i8) * (-103);
                        i = ((iM55979 ^ i9) * (-3467)) ^ 616969878;
                        i2 = -872683351;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1864470723:
                case -884906195:
                    activityC23283 = activityC23284;
                    iM559711 = C0946.m55979(C0898.m55792(f81945, 1, 3, i13));
                    if (C1229.f82066 >= 0) {
                        i12 = 2097905165;
                        sArr = sArr4;
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                        i5 = iM559710 ^ i3;
                        activityC23284 = activityC23283;
                        sArr4 = sArr;
                        i14 = i14;
                        i11 = i5;
                        c5848 = this;
                    } else {
                        int iM55683 = C0873.m55680("ۧܰ") ^ i9;
                        i11 = iM55683 ^ 1594658084;
                        activityC23284 = activityC23283;
                        i10 = ((iM55683 ^ i8) * (-24063)) ^ (-1847182019);
                        i12 = 2097905165;
                    }
                    break;
                case -1863967566:
                case 1449822887:
                    iM55682 = C0873.m55680(C1036.m56252(sArr3, 4, 3, i13));
                    i16 = 2130656528;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ۛᩳ")) * 77;
                        i = ((iM55979 ^ i9) * 25183) ^ (-1992431757);
                        i2 = -784537174;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩺") ^ i9;
                        i = ((iM55979 ^ i8) * 27229) ^ 859585478;
                        i2 = 1233023121;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1828343095:
                case -543527251:
                    i14 = i14;
                    activityC23283 = activityC23284;
                    sArr = sArr4;
                    short s3 = s2;
                    int i19 = s3 + 7959;
                    if ((s2 * s) - (i19 * i19) > 0) {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 30017) ^ 1550258089;
                        i4 = -23321606;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩵") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-28525)) ^ 1675837678;
                        i4 = -1456856778;
                    }
                    i5 = iM55680 ^ i4;
                    s2 = s3;
                    activityC23284 = activityC23283;
                    sArr4 = sArr;
                    i14 = i14;
                    i11 = i5;
                    c5848 = this;
                    break;
                case -1472882940:
                case 1959968270:
                    i13 = 46682;
                    int iM559714 = C0946.m55979("᩵ܽ") ^ i8;
                    activityC23284 = activityC23284;
                    i11 = iM559714 ^ (-1577192421);
                    i10 = ((iM559714 ^ i9) * 9587) ^ (-1279406128);
                    sArr4 = sArr4;
                    i14 = i14;
                    break;
                case -1381831407:
                case 2101117528:
                    C0906.m55817(c20671, C0946.m55979(strM55792) ^ 2126745260, null);
                    if (C0949.m56012()) {
                        iM55979 = (i8 - C0946.m55979("ۛᩳ")) * 77;
                        i = ((iM55979 ^ i9) * 25183) ^ (-1992431757);
                        i2 = -784537174;
                    } else {
                        iM55979 = C0873.m55680("֡ᩳ") ^ i8;
                        i = ((iM55979 ^ i9) * (-30143)) ^ 242221429;
                        i2 = -1984926042;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -1195851267:
                case 1226319155:
                    C0861.m55626();
                    C1046.m56302();
                    activityC23283 = activityC23284;
                    sArr = sArr4;
                    iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                    i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                    i3 = 1436709847;
                    i5 = iM559710 ^ i3;
                    activityC23284 = activityC23283;
                    sArr4 = sArr;
                    i14 = i14;
                    i11 = i5;
                    c5848 = this;
                    break;
                case -1062589846:
                case -447717401:
                    C1028.m56247();
                    if (C1124.m56367() < 0) {
                        iM55979 = (C0946.m55979("ۙۙ") ^ i8) * (-103);
                        i = ((iM55979 ^ i9) * (-3467)) ^ 616969878;
                        i2 = -872683351;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC23283 = activityC23284;
                        sArr = sArr4;
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                        i5 = iM559710 ^ i3;
                        activityC23284 = activityC23283;
                        sArr4 = sArr;
                        i14 = i14;
                        i11 = i5;
                        c5848 = this;
                    }
                    break;
                case -753081173:
                case 703325996:
                    C1929.m56553();
                    C0894.m55769();
                    break;
                case -484856506:
                case 533991595:
                    C0861.m55627(c20671, iM55682 ^ i16);
                    C0992.m56104(c20671, strM56159);
                    sArr4 = f81945;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0946.m55979("ۙۙ") ^ i8) * (-103);
                        i = ((iM55979 ^ i9) * (-3467)) ^ 616969878;
                        i2 = -872683351;
                    } else {
                        iM55979 = C0873.m55680("᩹ۙ") ^ i8;
                        i = ((iM55979 ^ i9) * 25297) ^ (-1700677187);
                        i2 = -1976059727;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    break;
                case -135054114:
                case 1669345607:
                    C1124.m56363(c20671, C0873.m55680(strM56584) ^ 2126327785, onClickListener);
                    C1025.m56221(c20671);
                    break;
                case -64912657:
                case 75209004:
                    strM55792 = C0898.m55792(sArr4, 7, 3, i13);
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = (C0946.m55979("۬ܳ") ^ i9) * 7;
                        i = ((iM55979 ^ i8) * (-29063)) ^ 518949232;
                        i2 = -217394483;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC23283 = activityC23284;
                        sArr = sArr4;
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                        i5 = iM559710 ^ i3;
                        activityC23284 = activityC23283;
                        sArr4 = sArr;
                        i14 = i14;
                        i11 = i5;
                        c5848 = this;
                    }
                    break;
                case 31174224:
                case 242073730:
                    i14 = i14;
                    activityC23283 = activityC23284;
                    sArr = sArr4;
                    s2 = f81945[0];
                    s = 31836;
                    if (RunnableC1014.f81941 <= 0) {
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                    } else {
                        iM559710 = (i9 - C0946.m55979("ܰۡ")) * 63;
                        i10 = ((iM559710 ^ i8) * (-18225)) ^ (-133647143);
                        i3 = -1060800409;
                    }
                    i5 = iM559710 ^ i3;
                    activityC23284 = activityC23283;
                    sArr4 = sArr;
                    i14 = i14;
                    i11 = i5;
                    c5848 = this;
                    break;
                case 134200393:
                case 1352879440:
                    onClickListener = new DialogInterface.OnClickListener(c5848) { // from class: l.ۖۖ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C5848 f10111;

                        {
                            int i20 = -256530739;
                            int i21 = C0877.f81843;
                            int i22 = C1017.f81942;
                            int iM559715 = (i21 - C0946.m55979("ۧ֨")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            int i23 = ((iM559715 ^ i22) * (-29827)) ^ (-1242735597);
                            int i24 = 1617768592;
                            while (true) {
                                i20 = ((((i20 ^ i22) * 32025) >> 31) & i23) ^ (iM559715 ^ i24);
                                switch (i20) {
                                    case -2111803411:
                                    case 347364119:
                                        if (C1048.f81963) {
                                            iM559715 = C0946.m55979("ۢ۟") ^ i21;
                                            i23 = ((iM559715 ^ i22) * 26623) ^ (-1054494979);
                                            i24 = -1749172988;
                                        } else {
                                            iM559715 = (C0873.m55680("᩻۬") ^ i22) * (-41);
                                            i23 = ((iM559715 ^ i21) * 28849) ^ (-521338512);
                                            i24 = 954615642;
                                        }
                                        break;
                                    case -1943523777:
                                    case 1102095119:
                                        if (C1124.m56367() >= 0) {
                                            iM559715 = (C0946.m55979("۬ܳ") ^ i22) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i23 = ((iM559715 ^ i21) * 14451) ^ (-258860107);
                                            i24 = -1647154306;
                                        } else {
                                            iM559715 = (C0946.m55979("֫᩻") + i21) * 81;
                                            i23 = ((iM559715 ^ i22) * 24487) ^ (-1864967629);
                                            i24 = 248305779;
                                        }
                                        break;
                                    case -1939394436:
                                    case 1198053484:
                                        if (C0912.f81867 <= 0) {
                                            iM559715 = (i22 - C0873.m55680("ۢۛ")) * 25;
                                            i23 = ((iM559715 ^ i21) * 28797) ^ (-616490028);
                                            i24 = -153837674;
                                        } else {
                                            iM559715 = (i21 - C0946.m55979("᩵֫")) * (-87);
                                            i23 = ((iM559715 ^ i22) * (-26123)) ^ (-1636215797);
                                            i24 = 1896618374;
                                        }
                                        break;
                                    case -1896005213:
                                    case -892897011:
                                        if (C1036.f81953 >= 0) {
                                            iM559715 = (i22 - C0873.m55680("ۢۛ")) * 25;
                                            i23 = ((iM559715 ^ i21) * 28797) ^ (-616490028);
                                            i24 = -153837674;
                                        } else {
                                            iM559715 = (C0873.m55680("ۨ᩵") ^ i21) * (-43);
                                            i23 = ((iM559715 ^ i22) * 13983) ^ 546147534;
                                            i24 = -1985126146;
                                        }
                                        break;
                                    case -1858143954:
                                    case 1555174214:
                                        if (C1028.f81950 <= 0) {
                                            iM559715 = (C0873.m55680("ۖۨ") + i21) * 73;
                                            i23 = ((iM559715 ^ i22) * (-3595)) ^ 1646871434;
                                            i24 = 1853325099;
                                        } else {
                                            iM559715 = (C0946.m55979("ܰۤ") + i21) * 93;
                                            i23 = ((iM559715 ^ i22) * (-1183)) ^ 1216469152;
                                            i24 = 743554676;
                                        }
                                        break;
                                    case -1621208935:
                                    case 50402942:
                                        if (C0917.f81868) {
                                            iM559715 = (i22 - C0873.m55680("ۢۛ")) * 25;
                                            i23 = ((iM559715 ^ i21) * 28797) ^ (-616490028);
                                            i24 = -153837674;
                                        } else {
                                            iM559715 = C0946.m55979("ۜۢ") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-31275)) ^ (-706615521);
                                            i24 = 1402583073;
                                        }
                                        break;
                                    case -1171414954:
                                    case 312273595:
                                        return;
                                    case -746576044:
                                    case -199953135:
                                        this.f10111 = c5848;
                                        if (C1048.m56305() >= 0) {
                                            iM559715 = (C0946.m55979("۬ܳ") ^ i22) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i23 = ((iM559715 ^ i21) * 14451) ^ (-258860107);
                                            i24 = -1647154306;
                                        } else {
                                            iM559715 = C0873.m55680("֡ۙ") ^ i22;
                                            i23 = ((iM559715 ^ i21) * (-20791)) ^ 475070569;
                                            i24 = 461291551;
                                        }
                                        break;
                                    case -734455677:
                                    case 2020621610:
                                        if (C0937.m55918() >= 0) {
                                            iM559715 = (C0946.m55979("۬ܳ") ^ i22) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i23 = ((iM559715 ^ i21) * 14451) ^ (-258860107);
                                            i24 = -1647154306;
                                        } else {
                                            iM559715 = (i22 - C0873.m55680("֡ᩴ")) * 69;
                                            i23 = ((iM559715 ^ i21) * (-28863)) ^ (-645389826);
                                            i24 = 181212687;
                                        }
                                        break;
                                    case -717562279:
                                    case -319330101:
                                        if (C1053.f81965 <= 0) {
                                            iM559715 = (C0873.m55680("᩻۬") ^ i22) * (-41);
                                            i23 = ((iM559715 ^ i21) * 28849) ^ (-521338512);
                                            i24 = 954615642;
                                        } else {
                                            iM559715 = C0946.m55979("᩶֨") ^ i22;
                                            i23 = ((iM559715 ^ i21) * 27503) ^ (-1098328730);
                                            i24 = 1805096430;
                                        }
                                        break;
                                    case -88365300:
                                    case 180555223:
                                        C1025.m56230();
                                        iM559715 = (C0946.m55979("۬ܳ") ^ i22) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                        i23 = ((iM559715 ^ i21) * 14451) ^ (-258860107);
                                        i24 = -1647154306;
                                        break;
                                    case 160162862:
                                    case 183817756:
                                        C0946.m55980();
                                        if (C1046.f81962 > 0) {
                                            iM559715 = (C0873.m55680("ۖۨ") + i21) * 73;
                                            i23 = ((iM559715 ^ i22) * (-3595)) ^ 1646871434;
                                            i24 = 1853325099;
                                        } else {
                                            iM559715 = (C0946.m55979("۬ܳ") ^ i22) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i23 = ((iM559715 ^ i21) * 14451) ^ (-258860107);
                                            i24 = -1647154306;
                                        }
                                        break;
                                    case 435321636:
                                    case 982749263:
                                        if (C1053.m56327() >= 0) {
                                            iM559715 = (C0873.m55680("ۖۨ") + i21) * 73;
                                            i23 = ((iM559715 ^ i22) * (-3595)) ^ 1646871434;
                                            i24 = 1853325099;
                                        } else {
                                            iM559715 = C0873.m55680("ܽۘ") ^ i22;
                                            i23 = ((iM559715 ^ i21) * 23347) ^ (-1199498953);
                                            i24 = -2051549045;
                                        }
                                        break;
                                    case 815870258:
                                    case 1917040477:
                                        C0845.m55584();
                                        throw new RuntimeException();
                                    case 1372282743:
                                    case 1788796215:
                                        C1929.m56553();
                                        if (C0877.f81843 >= 0) {
                                            iM559715 = (i22 - C0873.m55680("ۢۛ")) * 25;
                                            i23 = ((iM559715 ^ i21) * 28797) ^ (-616490028);
                                            i24 = -153837674;
                                        } else {
                                            iM559715 = (C0873.m55680("ۖۨ") + i21) * 73;
                                            i23 = ((iM559715 ^ i22) * (-3595)) ^ 1646871434;
                                            i24 = 1853325099;
                                        }
                                        break;
                                    default:
                                        if (C1024.f81946) {
                                            iM559715 = (C0873.m55680("ۖۨ") + i21) * 73;
                                            i23 = ((iM559715 ^ i22) * (-3595)) ^ 1646871434;
                                            i24 = 1853325099;
                                        } else {
                                            iM559715 = C0873.m55680("᩵ᩳ") ^ i21;
                                            i23 = ((iM559715 ^ i22) * (-7451)) ^ (-1168508828);
                                            i24 = 1517636608;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i20) {
                            String str2 = null;
                            int i21 = -1166433130;
                            int i22 = C0863.f81833;
                            int i23 = C1229.f82066;
                            int iM55684 = (C0873.m55680("۟ܺ") ^ i23) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            int i24 = ((iM55684 ^ i22) * (-7849)) ^ (-1125451724);
                            int i25 = -1619912006;
                            while (true) {
                                i21 = ((((i21 ^ i22) * 25827) >> 31) & i24) ^ (iM55684 ^ i25);
                                switch (i21) {
                                    case -2082197485:
                                    case -798139595:
                                        ServiceConnectionC1013.m56157();
                                        if (!C0927.f81875) {
                                            iM55684 = C0873.m55680("۫ۨ") ^ i23;
                                            i24 = ((iM55684 ^ i22) * (-13395)) ^ (-1244149080);
                                            i25 = -212966202;
                                        } else {
                                            iM55684 = C0873.m55680("ᩴ֫") ^ i22;
                                            i24 = ((iM55684 ^ i23) * 17729) ^ (-1923332461);
                                            i25 = -744732489;
                                        }
                                        break;
                                    case -2062675674:
                                    case -1233501367:
                                        if (C0894.f81854 >= 0) {
                                            iM55684 = (i22 - C0873.m55680("᩶ۚ")) * (-55);
                                            i24 = ((iM55684 ^ i23) * 19601) ^ 491550952;
                                            i25 = 1720250343;
                                        } else {
                                            iM55684 = C0946.m55979("ۘ֨") ^ i23;
                                            i24 = ((iM55684 ^ i22) * (-23517)) ^ 194207989;
                                            i25 = -801930157;
                                        }
                                        break;
                                    case -1831695675:
                                    case 117201369:
                                        if (C0892.f81851) {
                                            iM55684 = C0946.m55979("֡ܳ") ^ i22;
                                            i24 = ((iM55684 ^ i23) * (-9929)) ^ (-114940051);
                                            i25 = 667206122;
                                        } else {
                                            iM55684 = C0873.m55680("ᩴ֫") ^ i22;
                                            i24 = ((iM55684 ^ i23) * 17729) ^ (-1923332461);
                                            i25 = -744732489;
                                        }
                                        break;
                                    case -1499101305:
                                    case 1007245379:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55684 = (C0873.m55680("᩻᩶") ^ i23) * 65;
                                            i24 = ((iM55684 ^ i22) * 29409) ^ (-1442873765);
                                            i25 = -21280215;
                                        } else {
                                            iM55684 = (C0946.m55979("۟ᩳ") ^ i22) * (-29);
                                            i24 = ((iM55684 ^ i23) * 10999) ^ 775225170;
                                            i25 = -458704455;
                                        }
                                        break;
                                    case -1117887460:
                                    case -907686138:
                                        str2 = str;
                                        if (C0906.m55809() <= 0) {
                                            iM55684 = (i22 - C0873.m55680("᩶ۚ")) * (-55);
                                            i24 = ((iM55684 ^ i23) * 19601) ^ 491550952;
                                            i25 = 1720250343;
                                        } else {
                                            iM55684 = (C0873.m55680("ܿܰ") + i23) * (-75);
                                            i24 = ((iM55684 ^ i22) * 3313) ^ 1919531767;
                                            i25 = 825360295;
                                        }
                                        break;
                                    case -1062297502:
                                    case -329975960:
                                        if (C1053.f81965 > 0) {
                                            iM55684 = C0873.m55680("ᩴ֫") ^ i22;
                                            i24 = ((iM55684 ^ i23) * 17729) ^ (-1923332461);
                                            i25 = -744732489;
                                        } else {
                                            iM55684 = (i22 - C0946.m55979("ܿᩳ")) * (-119);
                                            i24 = ((iM55684 ^ i23) * 25803) ^ 1233768690;
                                            i25 = -2078342667;
                                        }
                                        break;
                                    case -1011020607:
                                    case -284969377:
                                        Main.m61(this.f10111.f14354, str2);
                                        break;
                                    case -881577471:
                                    case -584268381:
                                        C0927.m55873();
                                        break;
                                    case -506609122:
                                    case -63342453:
                                        if (C1229.m56410() != 0) {
                                            iM55684 = (C0873.m55680("᩻᩶") ^ i23) * 65;
                                            i24 = ((iM55684 ^ i22) * 29409) ^ (-1442873765);
                                            i25 = -21280215;
                                        } else {
                                            iM55684 = (i23 - C0946.m55979("ۙ᩺")) * 59;
                                            i24 = ((iM55684 ^ i22) * 3345) ^ 193865431;
                                            i25 = -1528563867;
                                        }
                                        break;
                                    case -479705942:
                                    case 1884362991:
                                        if (C0863.f81833 <= 0) {
                                            iM55684 = (i22 - C0873.m55680("᩶ۚ")) * (-55);
                                            i24 = ((iM55684 ^ i23) * 19601) ^ 491550952;
                                            i25 = 1720250343;
                                        } else {
                                            iM55684 = (i23 - C0946.m55979("ᩴܿ")) * 77;
                                            i24 = ((iM55684 ^ i22) * (-22733)) ^ (-500905973);
                                            i25 = -1007556395;
                                        }
                                        break;
                                    case -370873000:
                                    case 1060058969:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55684 = C0873.m55680("ᩴ֫") ^ i22;
                                            i24 = ((iM55684 ^ i23) * 17729) ^ (-1923332461);
                                            i25 = -744732489;
                                        } else {
                                            iM55684 = C0873.m55680("۬ۘ") ^ i22;
                                            i24 = ((iM55684 ^ i23) * (-14789)) ^ (-615332805);
                                            i25 = -455940378;
                                        }
                                        break;
                                    case 30133260:
                                    case 328214211:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55684 = (i22 - C0873.m55680("᩶ۚ")) * (-55);
                                            i24 = ((iM55684 ^ i23) * 19601) ^ 491550952;
                                            i25 = 1720250343;
                                        } else {
                                            iM55684 = C0946.m55979("ۖۚ") ^ i23;
                                            i24 = ((iM55684 ^ i22) * (-3349)) ^ 689970250;
                                            i25 = 589468998;
                                        }
                                        break;
                                    case 405281989:
                                    case 1199794201:
                                        if (C0882.m55710() != 0) {
                                            iM55684 = C0873.m55680("۫ۨ") ^ i23;
                                            i24 = ((iM55684 ^ i22) * (-13395)) ^ (-1244149080);
                                            i25 = -212966202;
                                        } else {
                                            iM55684 = (i22 - C0873.m55680("ܶۢ")) * (-89);
                                            i24 = ((iM55684 ^ i23) * 20825) ^ (-1859796069);
                                            i25 = 1159067376;
                                        }
                                        break;
                                    case 573886899:
                                    case 1640208580:
                                        if (C0946.f81894 != 0) {
                                            iM55684 = (C0873.m55680("᩻᩶") ^ i23) * 65;
                                            i24 = ((iM55684 ^ i22) * 29409) ^ (-1442873765);
                                            i25 = -21280215;
                                        } else {
                                            iM55684 = (C0946.m55979("ܳܽ") + i22) * 91;
                                            i24 = ((iM55684 ^ i23) * 12315) ^ 917037183;
                                            i25 = -1415339546;
                                        }
                                        break;
                                    case 1119780060:
                                    case 1794526283:
                                        C1194.m56396();
                                        iM55684 = C0873.m55680("ᩴ֫") ^ i22;
                                        i24 = ((iM55684 ^ i23) * 17729) ^ (-1923332461);
                                        i25 = -744732489;
                                        break;
                                    default:
                                        if (C1003.m56123() != 0) {
                                            iM55684 = (C0873.m55680("᩻᩶") ^ i23) * 65;
                                            i24 = ((iM55684 ^ i22) * 29409) ^ (-1442873765);
                                            i25 = -21280215;
                                        } else {
                                            iM55684 = C0873.m55680("ᩴ֫") ^ i22;
                                            i24 = ((iM55684 ^ i23) * 17729) ^ (-1923332461);
                                            i25 = -744732489;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    strM56584 = C1964.m56584(f81945, 10, 3, i13);
                    if (!C0861.f81831) {
                        activityC23283 = activityC23284;
                        sArr = sArr4;
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                        i5 = iM559710 ^ i3;
                        activityC23284 = activityC23283;
                        sArr4 = sArr;
                        i14 = i14;
                        i11 = i5;
                        c5848 = this;
                    } else {
                        iM55979 = C0873.m55680("ۨۧ") ^ i8;
                        i = ((iM55979 ^ i9) * 21637) ^ 2135031548;
                        i2 = 2042427964;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    }
                    break;
                case 161931150:
                case 812839940:
                    activityC23283 = activityC23284;
                    Object[] objArr3 = objArr;
                    strM56159 = ServiceConnectionC1013.m56159(activityC23283, iM559711 ^ i12, objArr3);
                    int i20 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(activityC23283);
                    short[] sArr6 = f81945;
                    if (!C0863.m55643()) {
                        objArr = objArr3;
                        activityC23284 = activityC23283;
                        sArr3 = sArr6;
                        int i110 = i14;
                        sArr2 = sArr4;
                        i6 = i110;
                        int iM559715 = (C0946.m55979("᩸۟") ^ i9) * 7;
                        i11 = iM559715 ^ (-1141658149);
                        i10 = ((iM559715 ^ i8) * (-2185)) ^ (-334705702);
                        short[] sArr7 = sArr2;
                        i14 = i6;
                        sArr4 = sArr7;
                    } else {
                        int iM559716 = (i8 - C0946.m55979("֨۠")) * (-73);
                        i10 = ((iM559716 ^ i9) * 7279) ^ (-665379131);
                        i7 = iM559716 ^ (-79454463);
                        objArr = objArr3;
                        sArr3 = sArr6;
                        i11 = i7;
                        activityC23284 = activityC23283;
                    }
                    break;
                case 660979773:
                case 1877244107:
                    i13 = 60761;
                    int iM559717 = C0946.m55979("᩵ܽ") ^ i8;
                    activityC23284 = activityC23284;
                    i11 = iM559717 ^ (-1577192421);
                    i10 = ((iM559717 ^ i9) * 9587) ^ (-1279406128);
                    sArr4 = sArr4;
                    i14 = i14;
                    break;
                case 800183662:
                case 1525038140:
                    sArr2 = sArr4;
                    ActivityC23283 activityC23285 = c5848.f14354;
                    str = c5848.f14355;
                    activityC23285.f73257 = str;
                    if (C1025.f81947 >= 0) {
                        activityC23284 = activityC23285;
                        i6 = 1;
                        int iM559718 = (C0946.m55979("᩸۟") ^ i9) * 7;
                        i11 = iM559718 ^ (-1141658149);
                        i10 = ((iM559718 ^ i8) * (-2185)) ^ (-334705702);
                        short[] sArr8 = sArr2;
                        i14 = i6;
                        sArr4 = sArr8;
                    } else {
                        int iM55684 = C0873.m55680("ۨ۫") ^ i8;
                        i11 = iM55684 ^ 265769453;
                        activityC23284 = activityC23285;
                        i10 = ((iM55684 ^ i9) * 18265) ^ (-79409333);
                        sArr4 = sArr2;
                        i14 = 1;
                    }
                    break;
                default:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("֨ۚ") ^ i9) * 49;
                        i = ((iM55979 ^ i8) * (-17217)) ^ 1871665354;
                        i2 = -544395310;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                    } else {
                        activityC23283 = activityC23284;
                        sArr = sArr4;
                        iM559710 = (C0946.m55979("ܰۤ") + i9) * 93;
                        i10 = ((iM559710 ^ i8) * (-9151)) ^ 2103899105;
                        i3 = 1436709847;
                        i5 = iM559710 ^ i3;
                        activityC23284 = activityC23283;
                        sArr4 = sArr;
                        i14 = i14;
                        i11 = i5;
                        c5848 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        ActivityC23283 activityC23283 = null;
        AbstractC17043 abstractC17043 = null;
        String[] strArr = null;
        AbstractC17043 abstractC17043M55623 = null;
        int i = 891884323;
        int i2 = RunnableC1014.f81941;
        int i3 = C0949.f81897;
        int iM55979 = C0946.m55979("ܺ᩶") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-14333)) ^ 1757244712;
        int i5 = 1658875736;
        while (true) {
            i = ((((i ^ i3) * (-13825)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2009554625:
                case 1278676263:
                    strArr = new String[0];
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("᩹ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9321) ^ 1143715785;
                        i5 = -2045547342;
                    } else {
                        iM55979 = C0873.m55680("ܶܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7453) ^ (-673276977);
                        i5 = 379917689;
                    }
                    break;
                case -1968234940:
                case 51009673:
                    activityC23283 = this.f14354;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16997)) ^ (-130392077);
                        i5 = 1223143584;
                    } else {
                        iM55979 = (C0873.m55680("ܶۨ") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-29235)) ^ 641777268;
                        i5 = -901624986;
                    }
                    break;
                case -1702774687:
                case -344101904:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("᩹ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9321) ^ 1143715785;
                        i5 = -2045547342;
                    } else {
                        iM55979 = (C0946.m55979("᩶ܶ") ^ i3) * (-103);
                        i4 = ((iM55979 ^ i2) * 9915) ^ (-439890851);
                        i5 = 1312442070;
                    }
                    break;
                case -1482775109:
                case -869553540:
                    C0898.m55800();
                    break;
                case -1436490939:
                case -1285463310:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i2) * 39;
                        i4 = ((iM55979 ^ i3) * (-27017)) ^ (-1289027289);
                        i5 = -1230233560;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨۛ")) * (-99);
                        i4 = ((iM55979 ^ i2) * (-26165)) ^ (-546443726);
                        i5 = 379044916;
                    }
                    break;
                case -1307080572:
                case -1061594400:
                    if (C0892.m55749()) {
                        iM55979 = C0873.m55680("ۜۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31291)) ^ (-852949183);
                        i5 = 200373629;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i2) * 39;
                        i4 = ((iM55979 ^ i3) * (-27017)) ^ (-1289027289);
                        i5 = -1230233560;
                    }
                    break;
                case -1078536472:
                case -569918296:
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("᩵ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26977) ^ (-496642869);
                        i5 = -965258479;
                    } else {
                        iM55979 = (C0873.m55680("ۖ۫") ^ i2) * (-23);
                        i4 = ((iM55979 ^ i3) * 14815) ^ 590656435;
                        i5 = -1451860903;
                    }
                    break;
                case -806125598:
                case 1417538355:
                    abstractC17043M55623 = C0861.m55623(this.f14355, strArr);
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("᩵ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26977) ^ (-496642869);
                        i5 = -965258479;
                    } else {
                        iM55979 = C0873.m55680("ܽ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7083) ^ 2117391544;
                        i5 = 570191193;
                    }
                    break;
                case -448070797:
                case 1434873039:
                    abstractC17043 = activityC23283.f73253;
                    if (C0882.m55710() != 0) {
                        iM55979 = C0873.m55680("᩹ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9321) ^ 1143715785;
                        i5 = -2045547342;
                    } else {
                        iM55979 = (C0873.m55680("۫ۡ") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * 4271) ^ (-1333786363);
                        i5 = -1604006678;
                    }
                    break;
                case -403006818:
                case 274946893:
                    ServiceConnectionC1013.m56157();
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16997)) ^ (-130392077);
                        i5 = 1223143584;
                    } else {
                        iM55979 = C0873.m55680("ܺۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11589)) ^ 1945006213;
                        i5 = -1165325026;
                    }
                    break;
                case -349458598:
                case 1882666803:
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ۘ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20299) ^ 860033348;
                        i5 = -564346814;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i2) * 39;
                        i4 = ((iM55979 ^ i3) * (-27017)) ^ (-1289027289);
                        i5 = -1230233560;
                    }
                    break;
                case -62591511:
                case 1543622062:
                    if (!C0967.m56074()) {
                        iM55979 = C0873.m55680("ܺۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11589)) ^ 1945006213;
                        i5 = -1165325026;
                    } else {
                        iM55979 = C0873.m55680("᩵ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26977) ^ (-496642869);
                        i5 = -965258479;
                    }
                    break;
                case 462294508:
                case 1675421668:
                    C0917.m55854();
                    iM55979 = C0873.m55680("᩵ۜ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 26977) ^ (-496642869);
                    i5 = -965258479;
                    break;
                case 739462782:
                case 1780179804:
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("᩹ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9321) ^ 1143715785;
                        i5 = -2045547342;
                    } else {
                        iM55979 = C0946.m55979("ܰۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21725) ^ 2042623956;
                        i5 = 1781992288;
                    }
                    break;
                case 1075201979:
                case 1975026671:
                    abstractC17043.m38657(abstractC17043M55623, (C19056) null);
                    break;
                default:
                    if (C0845.m55584() <= 0) {
                        iM55979 = (C0873.m55680("ܳ᩺") ^ i2) * 39;
                        i4 = ((iM55979 ^ i3) * (-27017)) ^ (-1289027289);
                        i5 = -1230233560;
                    } else {
                        iM55979 = C0873.m55680("ܺۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11589)) ^ 1945006213;
                        i5 = -1165325026;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC23283 activityC23283 = null;
        int i = 884802336;
        int i2 = C1124.f82007;
        int i3 = C1025.f81947;
        int iM55979 = (C0946.m55979("ܽۨ") ^ i3) * (-99);
        int i4 = ((iM55979 ^ i2) * (-23707)) ^ 354963194;
        int i5 = 744635511;
        while (true) {
            i = ((((i ^ i2) * 2773) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2122765547:
                case -262167567:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۘܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i3) * 1191) ^ (-1760534640);
                        i5 = 635312465;
                    } else {
                        iM55979 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11009)) ^ 1139265244;
                        i5 = -919282275;
                    }
                    break;
                case -2031879277:
                case -219953717:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ܽܽ") ^ i2) * (-21);
                        i4 = ((iM55979 ^ i3) * (-13379)) ^ (-475045194);
                        i5 = 1773655304;
                    } else {
                        iM55979 = C0873.m55680("֡ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 1305) ^ 1246191575;
                        i5 = 673847348;
                    }
                    break;
                case -1982512716:
                case -1447054782:
                    C0845.m55584();
                    iM55979 = (C0873.m55680("ܽܽ") ^ i2) * (-21);
                    i4 = ((iM55979 ^ i3) * (-13379)) ^ (-475045194);
                    i5 = 1773655304;
                    break;
                case -1854764434:
                case -1783027251:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("۠ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16671) ^ (-334383155);
                        i5 = -848318434;
                    } else {
                        iM55979 = (C0873.m55680("ܽ᩸") ^ i3) * (-127);
                        i4 = ((iM55979 ^ i2) * 2989) ^ (-1882823575);
                        i5 = 1085670343;
                    }
                    break;
                case -1637896692:
                case 1613978653:
                    activityC23283 = this.f14354;
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ܽ᩸") ^ i3) * (-127);
                        i4 = ((iM55979 ^ i2) * 2989) ^ (-1882823575);
                        i5 = 1085670343;
                    } else {
                        iM55979 = C0873.m55680("ᩴ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29101)) ^ 1782161664;
                        i5 = -921832009;
                    }
                    break;
                case -1481763042:
                case 1138635193:
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11009)) ^ 1139265244;
                        i5 = -919282275;
                    } else {
                        iM55979 = C0946.m55979("ᩳܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29315) ^ 1660957983;
                        i5 = -606009671;
                    }
                    break;
                case -987919100:
                case 2092582982:
                    if (C0955.m56025()) {
                        iM55979 = C0873.m55680("ۘܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2357)) ^ 1545278877;
                        i5 = 2102549250;
                    } else {
                        iM55979 = C0873.m55680("֫᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23785)) ^ (-686710325);
                        i5 = 599439279;
                    }
                    break;
                case -683819922:
                case 1322414559:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11009)) ^ 1139265244;
                        i5 = -919282275;
                    } else {
                        iM55979 = (C0946.m55979("ۤۛ") ^ i2) * (-99);
                        i4 = ((iM55979 ^ i3) * 3001) ^ 1995405062;
                        i5 = -768870962;
                    }
                    break;
                case 167293112:
                case 971550203:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11009)) ^ 1139265244;
                        i5 = -919282275;
                    } else {
                        iM55979 = (C0873.m55680("ۖۤ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 23333) ^ 1537952475;
                        i5 = -1657484088;
                    }
                    break;
                case 282045858:
                case 612785493:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("ۘܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2357)) ^ 1545278877;
                        i5 = 2102549250;
                    } else {
                        iM55979 = C0873.m55680("᩹֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32575)) ^ 767725927;
                        i5 = -1114243054;
                    }
                    break;
                case 376742690:
                case 1225980845:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۘܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2357)) ^ 1545278877;
                        i5 = 2102549250;
                    } else {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i2) * 123;
                        i4 = ((iM55979 ^ i3) * (-26465)) ^ (-374052261);
                        i5 = 184922683;
                    }
                    break;
                case 607775821:
                case 1897176120:
                    ServiceConnectionC1013.m56155(activityC23283, exc, null);
                    break;
                case 852831720:
                case 1035192233:
                    C0863.m55643();
                    if (C0906.f81862 < 0) {
                        iM55979 = C0873.m55680("ۘܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2357)) ^ 1545278877;
                        i5 = 2102549250;
                    } else {
                        iM55979 = (C0873.m55680("ܽܽ") ^ i2) * (-21);
                        i4 = ((iM55979 ^ i3) * (-13379)) ^ (-475045194);
                        i5 = 1773655304;
                    }
                    break;
                case 919936462:
                case 1806981151:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i2 - C0873.m55680("ۘܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i3) * 1191) ^ (-1760534640);
                        i5 = 635312465;
                    } else {
                        iM55979 = (C0873.m55680("ۛ᩵") + i3) * (-109);
                        i4 = ((iM55979 ^ i2) * 497) ^ 1532453;
                        i5 = -251461625;
                    }
                    break;
                case 1426840520:
                case 1536529652:
                    C0967.m56074();
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11009)) ^ 1139265244;
                        i5 = -919282275;
                    } else {
                        iM55979 = (C0873.m55680("ܽܽ") ^ i2) * (-21);
                        i4 = ((iM55979 ^ i3) * (-13379)) ^ (-475045194);
                        i5 = 1773655304;
                    }
                    break;
                default:
                    C0894.m55769();
                    break;
            }
            return;
        }
    }
}
