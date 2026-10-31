package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16891 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14173 f51866;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51867;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11248 f51868;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f51869;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f51870;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f51871;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f51872;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51873;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f51874;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f51875;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f51876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51877;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f51878;

    /* JADX INFO: renamed from: ֡᩹֡, reason: not valid java name and contains not printable characters */
    private static final short[] f51858 = {349, 11054, 11045, 11042, 11106, 11041, 11064, 11106, 11068, 11040, 11065, 11071};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f51861 = {0, 1, 4, 3, 2, 5, 6, 7, 8, 9};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static volatile int f51863 = (int) (System.currentTimeMillis() % 10000000);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f51859 = new AtomicLong();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f51862 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51864 = new C15065(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51865 = new C21417(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51860 = new C22122(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51857 = new C20006(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Runnable mo39734(boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15160(String str, boolean z) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6005(C16560 c16560, List list, Runnable runnable);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6006(C16560 c16560, C16560 c16561);

    /* JADX INFO: renamed from: ֫ */
    public void mo15162(InterfaceC17889 interfaceC17889) {
    }

    /* JADX INFO: renamed from: ֫֫ */
    public boolean mo15163() {
        return false;
    }

    /* JADX INFO: renamed from: ۗ */
    public abstract String mo6007();

    /* JADX INFO: renamed from: ۛ */
    public abstract List mo6010();

    /* JADX INFO: renamed from: ۟ */
    public abstract boolean mo6011();

    /* JADX INFO: renamed from: ۤ */
    public abstract List mo6012();

    /* JADX INFO: renamed from: ۧ */
    public String mo35228(C16560 c16560) {
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC15440 mo6013(InterfaceC17889 interfaceC17889);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo35229() {
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo6014(String str);

    /* JADX INFO: renamed from: ۧ֫ */
    public abstract boolean mo6015();

    /* JADX INFO: renamed from: ۨ */
    public int mo15166() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۫ */
    public abstract boolean mo6016();

    /* JADX INFO: renamed from: ۬ */
    public boolean mo39505() {
        return false;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo15167() {
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract C12244 mo6017();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo6018(C16560 c16560);

    /* JADX INFO: renamed from: ܽ */
    public boolean mo15170(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ᩶ */
    public abstract AbstractC13921 mo6020();

    /* JADX INFO: renamed from: ᩺ */
    public abstract void mo6021();

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC1661 mo35231() {
        return new C0208(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0113 A[PHI: r1 r16
      0x0113: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v1 java.lang.String), (r1v1 java.lang.String) binds: [B:36:0x0111, B:14:0x006c, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r16v30 int) = (r16v16 int), (r16v24 int), (r16v31 int) binds: [B:36:0x0111, B:14:0x006c, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0222 A[PHI: r4 r6 r7 r8 r16
      0x0222: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:63:0x0220, B:55:0x01df, B:51:0x01bd, B:16:0x0070, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:63:0x0220, B:55:0x01df, B:51:0x01bd, B:16:0x0070, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:63:0x0220, B:55:0x01df, B:51:0x01bd, B:16:0x0070, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:63:0x0220, B:55:0x01df, B:51:0x01bd, B:16:0x0070, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r16v23 int) = (r16v7 int), (r16v9 int), (r16v10 int), (r16v22 int), (r16v24 int) binds: [B:63:0x0220, B:55:0x01df, B:51:0x01bd, B:16:0x0070, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0255 A[PHI: r3 r5 r10 r11 r12 r16 r17
      0x0255: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r10v3 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r16v18 int) = (r16v6 int), (r16v8 int), (r16v15 int), (r16v17 int), (r16v19 int) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r17v3 l.ܶ᩵ܿ) = (r17v1 l.ܶ᩵ܿ), (r17v1 l.ܶ᩵ܿ), (r17v2 l.ܶ᩵ܿ), (r17v1 l.ܶ᩵ܿ), (r17v1 l.ܶ᩵ܿ) binds: [B:67:0x0253, B:59:0x0200, B:40:0x0147, B:32:0x00f0, B:28:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List m39739() {
        int iM6981;
        int i;
        int i2;
        int i3;
        String strM28023 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1271705227;
        int i11 = C0630.f2410;
        int i12 = C4075.f12947;
        int iM2566 = C0630.m2566("ۙ۫") ^ i11;
        int i13 = ((iM2566 ^ i12) * 5897) ^ 1110862878;
        int i14 = iM2566 ^ 1498875500;
        AbstractC15440 abstractC15440M36514 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * 7333) >> 31));
            switch (i15) {
                case -2074496422:
                case -887553795:
                    i15 = i15;
                    s = sArr[c];
                    if (C2167.m7155()) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i11;
                        i = ((iM6981 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM6981 = (i11 - C2105.m6981("᩸᩶")) * (-31);
                        i = ((iM6981 ^ i12) * (-19299)) ^ (-1256015465);
                        i2 = 1177948690;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -2039102541:
                case 1125455728:
                    i15 = i15;
                    i8 = 1;
                    i9 = 11;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("۠᩹") ^ i11;
                        i = ((iM6981 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    } else {
                        iM6981 = C0630.m2566("ܳܽ") ^ i11;
                        i = ((iM6981 ^ i12) * 25433) ^ (-1483877863);
                        i2 = -1534353159;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1944002633:
                case -1001744629:
                    i7 = 29988;
                    iM6981 = C2105.m6981("ᩳܽ") ^ i11;
                    i = ((iM6981 ^ i12) * (-5965)) ^ (-1675079424);
                    i2 = 1844655699;
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1800284919:
                case -876142401:
                    i15 = i15;
                    if (i5 - (i6 + 1) < 0) {
                        iM6981 = C0630.m2566("ۧܿ") ^ i12;
                        i = ((iM6981 ^ i11) * (-11415)) ^ 1699166634;
                        i2 = 75174743;
                    } else {
                        iM6981 = C2105.m6981("ۗ۟") ^ i11;
                        i = ((iM6981 ^ i12) * (-24191)) ^ (-1598311606);
                        i2 = 676030860;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1711750816:
                case -536033488:
                    i15 = i15;
                    i6 = s * s2;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i11;
                        i = ((iM6981 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM6981 = (i12 - C0630.m2566("ܺۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i11) * (-22415)) ^ 801247730;
                        i2 = 1224118475;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1573962902:
                case -43267777:
                    i15 = i15;
                    c = 0;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("۠᩹") ^ i11;
                        i = ((iM6981 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ۙۙ")) * (-49);
                        i = ((iM6981 ^ i12) * (-3367)) ^ 1434474165;
                        i2 = 1867850823;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1432502457:
                case 880504924:
                    i15 = i15;
                    i5 = i4 * i4;
                    s2 = 2;
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i11;
                        i = ((iM6981 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM6981 = (i11 - C0630.m2566("᩹ܺ")) * 19;
                        i = ((iM6981 ^ i12) * 11311) ^ 1234290681;
                        i2 = 1525192527;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1299440882:
                case 792846554:
                    i15 = i15;
                    C7106.m19120();
                    if (C11340.f33930 < 0) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i11;
                        i = ((iM6981 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM6981 = C2105.m6981("ۜ֨") ^ i12;
                        i = ((iM6981 ^ i11) * (-16429)) ^ 1275007252;
                        i2 = -395487846;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1279211122:
                case 1757138813:
                    C0798.m2998();
                    if (C1128.f4106 <= 0) {
                        i15 = i15;
                        iM6981 = C2105.m6981("ۜ֨") ^ i12;
                        i = ((iM6981 ^ i11) * (-16429)) ^ 1275007252;
                        i2 = -395487846;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩵") ^ i11) * (-97);
                        i15 = i15;
                        i = ((iM6981 ^ i12) * (-22547)) ^ 1285708434;
                        i2 = 298015560;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1255929049:
                case 1279969194:
                    C1504.m5179();
                    return null;
                case -924432159:
                case -18806600:
                    i15 = i15;
                    strM28023 = C11340.m28023(abstractC15440M36514);
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("ۜ֨") ^ i12;
                        i = ((iM6981 ^ i11) * (-16429)) ^ 1275007252;
                        i2 = -395487846;
                    } else {
                        iM6981 = C0630.m2566("֨᩸") ^ i11;
                        i = ((iM6981 ^ i12) * 30183) ^ (-1488783997);
                        i2 = 610511735;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -881354486:
                case 65483288:
                    i15 = i15;
                    sArr = f51858;
                    if (C1420.m4913()) {
                        iM6981 = C0630.m2566("ܽ۬") ^ i12;
                        i = ((iM6981 ^ i11) * 31509) ^ (-1714712618);
                        i2 = 1000029977;
                    } else {
                        iM6981 = C2105.m6981("ۤ۫") ^ i12;
                        i = ((iM6981 ^ i11) * 21969) ^ 453890364;
                        i2 = 712308277;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -675972578:
                case 1929075746:
                    i7 = 11084;
                    iM6981 = C2105.m6981("ᩳܽ") ^ i11;
                    i = ((iM6981 ^ i12) * (-5965)) ^ (-1675079424);
                    i2 = 1844655699;
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -511485439:
                case 1343025907:
                    return C17853.f54530;
                case -29644331:
                case 1741976344:
                    i15 = i15;
                    if (ViewOnClickListenerC1958.m6437(strM28023, C3746.m11357(sArr2, i8, i9, i7))) {
                        iM6981 = (C2105.m6981("۠ۢ") ^ i12) * (-59);
                        i = ((iM6981 ^ i11) * 7219) ^ 1151361353;
                        i2 = -62507973;
                        i3 = i15;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    } else {
                        int iM2567 = (i12 - C0630.m2566("᩶᩷")) * 127;
                        i13 = ((iM2567 ^ i11) * (-11515)) ^ 1672816665;
                        i3 = i15;
                        i14 = iM2567 ^ 1107989096;
                    }
                    i10 = i3;
                    break;
                case 139786909:
                case 1120896346:
                    i15 = i15;
                    i4 = s + 1;
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("۠᩹") ^ i11;
                        i = ((iM6981 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    } else {
                        iM6981 = C2105.m6981("᩷ۜ") ^ i12;
                        i = ((iM6981 ^ i11) * (-5925)) ^ 74609986;
                        i2 = -1138533695;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 146769932:
                case 1614192142:
                    i15 = i15;
                    C0630.m2564();
                    C0422.m1963();
                    iM6981 = C0630.m2566("᩻ۚ") ^ i11;
                    i = ((iM6981 ^ i12) * 31993) ^ 445478292;
                    i2 = -275259426;
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 185922816:
                case 2127793633:
                    i15 = i15;
                    sArr2 = f51858;
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ᩴ᩹") ^ i12;
                        i = ((iM6981 ^ i11) * 10501) ^ (-1478551740);
                        i2 = 237870318;
                    } else {
                        iM6981 = C0630.m2566("۠᩹") ^ i11;
                        i = ((iM6981 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 223473635:
                case 926999103:
                    i15 = i15;
                    abstractC15440M36514 = C16293.f50118.m36514();
                    if (RunnableC1108.f4040) {
                        iM6981 = (i12 - C2105.m6981("֡ᩳ")) * (-49);
                        i = ((iM6981 ^ i11) * 21551) ^ 1185476317;
                        i2 = 408486722;
                    } else {
                        iM6981 = C0630.m2566("۠᩹") ^ i11;
                        i = ((iM6981 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    }
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 292751100:
                case 1855044345:
                    return this.f51875;
                default:
                    if (C11340.m28031()) {
                        i15 = i15;
                        iM6981 = C0630.m2566("ܽ۬") ^ i12;
                        i = ((iM6981 ^ i11) * 31509) ^ (-1714712618);
                        i2 = 1000029977;
                        i3 = i15;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        i10 = i3;
                    }
                    i15 = i15;
                    iM6981 = C2105.m6981("ۜ֨") ^ i12;
                    i = ((iM6981 ^ i11) * (-16429)) ^ 1275007252;
                    i2 = -395487846;
                    i3 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
            }
        }
    }

    public AbstractC16891(int i, String str) {
        this.f51871 = true;
        this.f51875 = Collections.EMPTY_LIST;
        this.f51868 = new C11248();
        synchronized (AbstractC16891.class) {
            int i2 = f51863;
            f51863 = i2 + 1;
            this.f51876 = i2;
        }
        this.f51872 = i;
        this.f51870 = mo39506();
        mo35230(str);
    }

    public AbstractC16891(C12951 c12951) {
        this.f51871 = true;
        this.f51875 = Collections.EMPTY_LIST;
        C11248 c11248 = new C11248();
        this.f51868 = c11248;
        this.f51876 = c12951.readInt();
        this.f51872 = c12951.readInt();
        mo35230(c12951.m31506());
        String strM31503 = c12951.m31503();
        this.f51870 = strM31503 == null ? null : C16999.m39866(strM31503, new String[0]);
        this.f51874 = c12951.m31503();
        this.f51871 = c12951.m31498();
        c11248.m27820(c12951);
        int iM31494 = c12951.m31494();
        ArrayList arrayList = new ArrayList(iM31494);
        for (int i = 0; i < iM31494; i++) {
            arrayList.add(new C5977(c12951));
        }
        m39736((List) arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6004(C10130 c10130) {
        c10130.writeInt(this.f51876);
        c10130.writeInt(this.f51872);
        c10130.m25439(this.f51878);
        AbstractC15440 abstractC15440 = this.f51870;
        c10130.m25424(abstractC15440 == null ? null : abstractC15440.mo23554());
        c10130.m25424(this.f51874);
        c10130.m25425(this.f51871);
        this.f51868.m27819(c10130);
        List listM39739 = m39739();
        c10130.mo13231(listM39739.size());
        Iterator it = listM39739.iterator();
        while (it.hasNext()) {
            ((C5977) it.next()).m16769(c10130);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39746() {
        return this.f51876;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m39732() {
        return this.f51872;
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15440 mo39506() {
        return C16293.f50113.m36535("_" + mo6007().toLowerCase());
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo35230(String str) {
        this.f51878 = m39731(str);
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo6009() {
        return m39728(this.f51878);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m39741() {
        return this.f51878;
    }

    /* JADX INFO: renamed from: ᩹ */
    public String mo39508() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m39742() {
        return mo39505() ? mo39508() : this.f51878;
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo39507() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo14824(boolean z) {
        mo6020().mo7646(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26935(C2450 c2450, ArrayList arrayList) {
        if (c2450.m7923()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        C14173 c14173 = this.f51866;
        if (c14173 != null) {
            if (c14173.m33824("arsc")) {
                arrayList2.add(new C15584());
            } else if (this.f51866.m33824("dex")) {
                arrayList2.add(new C19114());
            } else if (this.f51866.m33824("folder")) {
                arrayList2.add(new C9942());
            } else if (this.f51866.m33824("zip") || this.f51866.m33823()) {
                arrayList2.add(new C15730());
            } else if (this.f51866.m33824("apk")) {
                arrayList2.add(new C19114());
                arrayList2.add(new C15730(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C15584());
                arrayList2.add(new C9236());
            } else {
                arrayList2.add(new C16436());
            }
            if (!this.f51866.m33824("folder")) {
                C14173 c14174 = this.f51866;
                if (c14174.f42801 == c14174.f42803) {
                    arrayList2.add(new C7119());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM39730 = m39730();
        if (arrayList2.size() % 2 != 0 && !C2326.m7584().mo1456(c2450)) {
            arrayList.set(iM39730, (AbstractC1661) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static int m39730() {
        int[] iArrM35543 = DialogInterfaceOnDismissListenerC15010.m35543();
        int length = iArrM35543.length;
        for (int i = 0; i < length; i++) {
            if (iArrM35543[i] == 8) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unknown item command id: 8");
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC1661 mo39503(C2450 c2450) {
        return C9214.m23655(c2450);
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC1661 mo15165(C2450 c2450) {
        return C4442.m13193();
    }

    /* JADX INFO: renamed from: ֡ */
    public AbstractC1661 mo15159() {
        return C5853.m16412();
    }

    /* JADX INFO: renamed from: ᩴ */
    public AbstractC1661 mo15172() {
        return C12203.m29684();
    }

    /* JADX INFO: renamed from: ܺ */
    public AbstractC1661 mo15169() {
        return C19965.m46041();
    }

    /* JADX INFO: renamed from: ۡ */
    public AbstractC1661 mo39504() {
        return C21376.m48469();
    }

    /* JADX INFO: renamed from: ۘ */
    public AbstractC1661 mo6008() {
        return C12908.m31356();
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC1661 mo35227() {
        return C2326.m7584();
    }

    /* JADX INFO: renamed from: ۢ */
    public AbstractC1661 mo15164() {
        return C15024.m35555();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo35226(C16560 c16560, InterfaceC17889 interfaceC17889) {
        C19568.m45012(c16560, interfaceC17889);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39736(List list) {
        this.f51875 = (List) C11003.requireNonNullElse(list, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39735(ArrayList arrayList) {
        if (this.f51875.isEmpty()) {
            m39736((List) arrayList);
            return;
        }
        Set set = (Set) C5378.stream(arrayList).map(new C8011(0)).collect(C22976.toSet());
        ArrayList arrayList2 = new ArrayList();
        for (C5977 c5977 : this.f51875) {
            if (!set.contains(c5977.m16770().toLowerCase())) {
                arrayList2.add(c5977);
            }
        }
        arrayList2.addAll(arrayList);
        m39736((List) arrayList2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m39740() {
        return this.f51874;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39745(String str) {
        this.f51874 = C19568.m44997(str);
    }

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC10834 mo14827() {
        return C3695.f11656;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15161(C16560 c16560, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39737(final C16560 c16560) {
        List<C5977> listM39739 = m39739();
        if (listM39739.isEmpty()) {
            return;
        }
        long jM16772 = 0;
        boolean z = false;
        final AbstractC15440 abstractC15440M16768 = null;
        for (C5977 c5977 : listM39739) {
            if (c5977.m16773()) {
                c5977.m16771();
                if (abstractC15440M16768 == null || c5977.m16772() > jM16772) {
                    abstractC15440M16768 = c5977.m16768();
                    jM16772 = c5977.m16772();
                }
                z = true;
            }
        }
        if (z) {
            c16560.m39042();
            SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(C4925.m14327(R.string.MT_Protector));
            spannableString2.setSpan(new ForegroundColorSpan(C21943.f70269), 0, spannableString2.length(), 17);
            C19258 c19258BuildDialog = c16560.m39056().buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44428(false);
            c19258BuildDialog.m44441(spannableString, new DialogInterface.OnClickListener() { // from class: l.֨ۜܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC16891.m39727(this.f3597, c16560, abstractC15440M16768);
                }
            });
            c19258BuildDialog.m44425(spannableString2, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39727(AbstractC16891 abstractC16891, C16560 c16560, AbstractC15440 abstractC15440) {
        C16560 c16560M39026 = c16560.m39026();
        c16560M39026.m39042();
        c16560M39026.m39053(abstractC15440.getName());
        c16560M39026.m39033(abstractC15440.m36511(), true);
        synchronized (abstractC16891) {
            abstractC16891.f51871 = false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39744() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            this.f51869 = true;
            AbstractC15440 abstractC15440 = this.f51870;
            z = false;
            if (abstractC15440 != null && this.f51871) {
                if (this.f51867 != 0) {
                    this.f51873 = true;
                } else {
                    if (abstractC15440 == null || !abstractC15440.mo23120()) {
                        z2 = false;
                    } else {
                        abstractC15440.mo23552();
                    }
                    z = z2;
                }
            }
        }
        if (z) {
            C15528.m36596();
        }
        Object objMo6020 = mo6020();
        if (objMo6020 instanceof AutoCloseable) {
            C0349.m1793((AutoCloseable) objMo6020);
        }
        mo6021();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m39733(String str) {
        synchronized (this) {
            AbstractC15440 abstractC15440 = this.f51870;
            if (abstractC15440 != null && !this.f51869) {
                AbstractC15440 abstractC15440Mo23559 = abstractC15440.mo23559();
                for (AbstractC15440 abstractC15440Mo235510 = C16999.m39866(str, new String[0]).mo23559(); abstractC15440Mo235510 != null; abstractC15440Mo235510 = abstractC15440Mo235510.m36536()) {
                    if (abstractC15440Mo23559.equals(abstractC15440Mo235510)) {
                        long jIncrementAndGet = f51859.incrementAndGet();
                        f51862.put(Long.valueOf(jIncrementAndGet), this);
                        this.f51867++;
                        return jIncrementAndGet;
                    }
                }
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39726(long j) {
        AbstractC16891 abstractC16891;
        if (j == 0 || (abstractC16891 = (AbstractC16891) f51862.remove(Long.valueOf(j))) == null) {
            return;
        }
        synchronized (abstractC16891) {
            int i = abstractC16891.f51867;
            if (i <= 0) {
                return;
            }
            boolean z = true;
            int i2 = i - 1;
            abstractC16891.f51867 = i2;
            boolean z2 = false;
            if (i2 == 0 && abstractC16891.f51873) {
                abstractC16891.f51873 = false;
                AbstractC15440 abstractC15440 = abstractC16891.f51870;
                if (abstractC15440 == null || !abstractC15440.mo23120()) {
                    z = false;
                } else {
                    abstractC15440.mo23552();
                }
                z2 = z;
            }
            if (z2) {
                C4925.m14315(new RunnableC15608(0));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 m39743() {
        return new C4483(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10128 m39725(int i, boolean z) {
        return new C3072(i, z);
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10128 m39729() {
        return new C12949(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39738(C16560 c16560, InterfaceC17889 interfaceC17889, InterfaceC7305 interfaceC7305) {
        C10211 c10211 = new C10211(interfaceC17889);
        mo6005(c16560, Collections.singletonList(c10211), new RunnableC9960(4, interfaceC7305, c10211));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m39731(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m39728(String str) {
        if (str.length() <= 2000) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        StringBuilder sb = new StringBuilder("/");
        for (String strSubstring : strArrSplit) {
            if (!strSubstring.isEmpty()) {
                if (strSubstring.length() > 500) {
                    strSubstring = strSubstring.substring(0, 500);
                }
                sb.append(strSubstring);
                sb.append('/');
            }
        }
        return sb.toString();
    }
}
