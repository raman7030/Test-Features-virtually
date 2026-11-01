package p067l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import bin.p000mt.plus.R;
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
public abstract class AbstractC18422 {

    /* JADX INFO: renamed from: ֫ */
    public C15838 f55046;

    /* JADX INFO: renamed from: ۖ */
    public int f55047;

    /* JADX INFO: renamed from: ۜ */
    public final C13059 f55048;

    /* JADX INFO: renamed from: ۡ */
    public boolean f55049;

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC17043 f55050;

    /* JADX INFO: renamed from: ۧ */
    public boolean f55051;

    /* JADX INFO: renamed from: ܳ */
    public final int f55052;

    /* JADX INFO: renamed from: ܺ */
    public boolean f55053;

    /* JADX INFO: renamed from: ܽ */
    public String f55054;

    /* JADX INFO: renamed from: ܿ */
    public List f55055;

    /* JADX INFO: renamed from: ᩳ */
    public final int f55056;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f55057;

    /* JADX INFO: renamed from: ᩻ */
    public String f55058;

    /* JADX INFO: renamed from: ֡᩹֡, reason: not valid java name and contains not printable characters */
    private static final short[] f82273 = {349, 11054, 11045, 11042, 11106, 11041, 11064, 11106, 11068, 11040, 11065, 11071};

    /* JADX INFO: renamed from: ۚ */
    public static final int[] f55041 = {0, 1, 4, 3, 2, 5, 6, 7, 8, 9};

    /* JADX INFO: renamed from: ܶ */
    public static volatile int f55043 = (int) (System.currentTimeMillis() % 10000000);

    /* JADX INFO: renamed from: ֨ */
    public static final AtomicLong f55039 = new AtomicLong();

    /* JADX INFO: renamed from: ۠ */
    public static final ConcurrentMapC12768 f55042 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩴ */
    public static final AbstractC11994 f55044 = new C16686(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ᩵ */
    public static final AbstractC11994 f55045 = new C22723(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ۘ */
    public static final AbstractC11994 f55040 = new C23393(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֡ */
    public static final AbstractC11994 f55038 = new C21382(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֫ */
    public Runnable mo41975(boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo17063(String str, boolean z) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8202(C18107 c18107, List list, Runnable runnable);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8203(C18107 c18107, C18107 c18108);

    /* JADX INFO: renamed from: ֫ */
    public void mo17065(InterfaceC19370 interfaceC19370) {
    }

    /* JADX INFO: renamed from: ֫֫ */
    public boolean mo17066() {
        return false;
    }

    /* JADX INFO: renamed from: ۗ */
    public abstract String mo8204();

    /* JADX INFO: renamed from: ۛ */
    public abstract List mo8207();

    /* JADX INFO: renamed from: ۟ */
    public abstract boolean mo8208();

    /* JADX INFO: renamed from: ۤ */
    public abstract List mo8209();

    /* JADX INFO: renamed from: ۧ */
    public String mo37383(C18107 c18107) {
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC17043 mo8210(InterfaceC19370 interfaceC19370);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo37384() {
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo8211(String str);

    /* JADX INFO: renamed from: ۧ֫ */
    public abstract boolean mo8212();

    /* JADX INFO: renamed from: ۨ */
    public int mo17069() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۫ */
    public abstract boolean mo8213();

    /* JADX INFO: renamed from: ۬ */
    public boolean mo41741() {
        return false;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo17070() {
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract C14005 mo8214();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo8215(C18107 c18107);

    /* JADX INFO: renamed from: ܽ */
    public boolean mo17073(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ᩶ */
    public abstract AbstractC15599 mo8217();

    /* JADX INFO: renamed from: ᩺ */
    public abstract void mo8218();

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC3947 mo37386() {
        return new C2566(R.string.MT_Protector, R.drawable.MT_Protector);
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
    /* JADX INFO: renamed from: ۚ */
    public List m41980() {
        int iM55979;
        int i;
        int i2;
        int i3;
        String strM56460 = null;
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
        int i11 = C0873.f81841;
        int i12 = C1044.f81959;
        int iM55680 = C0873.m55680("ۙ۫") ^ i11;
        int i13 = ((iM55680 ^ i12) * 5897) ^ 1110862878;
        int i14 = iM55680 ^ 1498875500;
        AbstractC17043 abstractC17043M38672 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * 7333) >> 31));
            switch (i15) {
                case -2074496422:
                case -887553795:
                    i15 = i15;
                    s = sArr[c];
                    if (C0949.m56012()) {
                        iM55979 = C0873.m55680("᩻ۚ") ^ i11;
                        i = ((iM55979 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM55979 = (i11 - C0946.m55979("᩸᩶")) * (-31);
                        i = ((iM55979 ^ i12) * (-19299)) ^ (-1256015465);
                        i2 = 1177948690;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -2039102541:
                case 1125455728:
                    i15 = i15;
                    i8 = 1;
                    i9 = 11;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("۠᩹") ^ i11;
                        i = ((iM55979 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    } else {
                        iM55979 = C0873.m55680("ܳܽ") ^ i11;
                        i = ((iM55979 ^ i12) * 25433) ^ (-1483877863);
                        i2 = -1534353159;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1944002633:
                case -1001744629:
                    i7 = 29988;
                    iM55979 = C0946.m55979("ᩳܽ") ^ i11;
                    i = ((iM55979 ^ i12) * (-5965)) ^ (-1675079424);
                    i2 = 1844655699;
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1800284919:
                case -876142401:
                    i15 = i15;
                    if (i5 - (i6 + 1) < 0) {
                        iM55979 = C0873.m55680("ۧܿ") ^ i12;
                        i = ((iM55979 ^ i11) * (-11415)) ^ 1699166634;
                        i2 = 75174743;
                    } else {
                        iM55979 = C0946.m55979("ۗ۟") ^ i11;
                        i = ((iM55979 ^ i12) * (-24191)) ^ (-1598311606);
                        i2 = 676030860;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1711750816:
                case -536033488:
                    i15 = i15;
                    i6 = s * s2;
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("᩻ۚ") ^ i11;
                        i = ((iM55979 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM55979 = (i12 - C0873.m55680("ܺۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i11) * (-22415)) ^ 801247730;
                        i2 = 1224118475;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1573962902:
                case -43267777:
                    i15 = i15;
                    c = 0;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("۠᩹") ^ i11;
                        i = ((iM55979 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    } else {
                        iM55979 = (i11 - C0946.m55979("ۙۙ")) * (-49);
                        i = ((iM55979 ^ i12) * (-3367)) ^ 1434474165;
                        i2 = 1867850823;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1432502457:
                case 880504924:
                    i15 = i15;
                    i5 = i4 * i4;
                    s2 = 2;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("᩻ۚ") ^ i11;
                        i = ((iM55979 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM55979 = (i11 - C0873.m55680("᩹ܺ")) * 19;
                        i = ((iM55979 ^ i12) * 11311) ^ 1234290681;
                        i2 = 1525192527;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1299440882:
                case 792846554:
                    i15 = i15;
                    C1194.m56396();
                    if (C1404.f82149 < 0) {
                        iM55979 = C0873.m55680("᩻ۚ") ^ i11;
                        i = ((iM55979 ^ i12) * 31993) ^ 445478292;
                        i2 = -275259426;
                    } else {
                        iM55979 = C0946.m55979("ۜ֨") ^ i12;
                        i = ((iM55979 ^ i11) * (-16429)) ^ 1275007252;
                        i2 = -395487846;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1279211122:
                case 1757138813:
                    C0882.m55710();
                    if (C0898.f81858 <= 0) {
                        i15 = i15;
                        iM55979 = C0946.m55979("ۜ֨") ^ i12;
                        i = ((iM55979 ^ i11) * (-16429)) ^ 1275007252;
                        i2 = -395487846;
                    } else {
                        iM55979 = (C0946.m55979("ۙ᩵") ^ i11) * (-97);
                        i15 = i15;
                        i = ((iM55979 ^ i12) * (-22547)) ^ 1285708434;
                        i2 = 298015560;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -1255929049:
                case 1279969194:
                    C0917.m55854();
                    return null;
                case -924432159:
                case -18806600:
                    i15 = i15;
                    strM56460 = C1404.m56460(abstractC17043M38672);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ۜ֨") ^ i12;
                        i = ((iM55979 ^ i11) * (-16429)) ^ 1275007252;
                        i2 = -395487846;
                    } else {
                        iM55979 = C0873.m55680("֨᩸") ^ i11;
                        i = ((iM55979 ^ i12) * 30183) ^ (-1488783997);
                        i2 = 610511735;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -881354486:
                case 65483288:
                    i15 = i15;
                    sArr = f82273;
                    if (C0912.m55833()) {
                        iM55979 = C0873.m55680("ܽ۬") ^ i12;
                        i = ((iM55979 ^ i11) * 31509) ^ (-1714712618);
                        i2 = 1000029977;
                    } else {
                        iM55979 = C0946.m55979("ۤ۫") ^ i12;
                        i = ((iM55979 ^ i11) * 21969) ^ 453890364;
                        i2 = 712308277;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -675972578:
                case 1929075746:
                    i7 = 11084;
                    iM55979 = C0946.m55979("ᩳܽ") ^ i11;
                    i = ((iM55979 ^ i12) * (-5965)) ^ (-1675079424);
                    i2 = 1844655699;
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case -511485439:
                case 1343025907:
                    return C19336.f57728;
                case -29644331:
                case 1741976344:
                    i15 = i15;
                    if (ViewOnClickListenerC0939.m55949(strM56460, C1028.m56235(sArr2, i8, i9, i7))) {
                        iM55979 = (C0946.m55979("۠ۢ") ^ i12) * (-59);
                        i = ((iM55979 ^ i11) * 7219) ^ 1151361353;
                        i2 = -62507973;
                        i3 = i15;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                    } else {
                        int iM55681 = (i12 - C0873.m55680("᩶᩷")) * 127;
                        i13 = ((iM55681 ^ i11) * (-11515)) ^ 1672816665;
                        i3 = i15;
                        i14 = iM55681 ^ 1107989096;
                    }
                    i10 = i3;
                    break;
                case 139786909:
                case 1120896346:
                    i15 = i15;
                    i4 = s + 1;
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("۠᩹") ^ i11;
                        i = ((iM55979 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    } else {
                        iM55979 = C0946.m55979("᩷ۜ") ^ i12;
                        i = ((iM55979 ^ i11) * (-5925)) ^ 74609986;
                        i2 = -1138533695;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 146769932:
                case 1614192142:
                    i15 = i15;
                    C0873.m55678();
                    C0863.m55643();
                    iM55979 = C0873.m55680("᩻ۚ") ^ i11;
                    i = ((iM55979 ^ i12) * 31993) ^ 445478292;
                    i2 = -275259426;
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 185922816:
                case 2127793633:
                    i15 = i15;
                    sArr2 = f82273;
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ᩴ᩹") ^ i12;
                        i = ((iM55979 ^ i11) * 10501) ^ (-1478551740);
                        i2 = 237870318;
                    } else {
                        iM55979 = C0873.m55680("۠᩹") ^ i11;
                        i = ((iM55979 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 223473635:
                case 926999103:
                    i15 = i15;
                    abstractC17043M38672 = C17853.f53285.m38672();
                    if (RunnableC0897.f81856) {
                        iM55979 = (i12 - C0946.m55979("֡ᩳ")) * (-49);
                        i = ((iM55979 ^ i11) * 21551) ^ 1185476317;
                        i2 = 408486722;
                    } else {
                        iM55979 = C0873.m55680("۠᩹") ^ i11;
                        i = ((iM55979 ^ i12) * 7637) ^ 563832942;
                        i2 = 296743406;
                    }
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
                case 292751100:
                case 1855044345:
                    return this.f55055;
                default:
                    if (C1404.m56468()) {
                        i15 = i15;
                        iM55979 = C0873.m55680("ܽ۬") ^ i12;
                        i = ((iM55979 ^ i11) * 31509) ^ (-1714712618);
                        i2 = 1000029977;
                        i3 = i15;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        i10 = i3;
                    }
                    i15 = i15;
                    iM55979 = C0946.m55979("ۜ֨") ^ i12;
                    i = ((iM55979 ^ i11) * (-16429)) ^ 1275007252;
                    i2 = -395487846;
                    i3 = i15;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i10 = i3;
                    break;
            }
        }
    }

    public AbstractC18422(int i, String str) {
        this.f55051 = true;
        this.f55055 = Collections.EMPTY_LIST;
        this.f55048 = new C13059();
        synchronized (AbstractC18422.class) {
            int i2 = f55043;
            f55043 = i2 + 1;
            this.f55056 = i2;
        }
        this.f55052 = i;
        this.f55050 = mo41742();
        mo37385(str);
    }

    public AbstractC18422(C14677 c14677) {
        this.f55051 = true;
        this.f55055 = Collections.EMPTY_LIST;
        C13059 c13059 = new C13059();
        this.f55048 = c13059;
        this.f55056 = c14677.readInt();
        this.f55052 = c14677.readInt();
        mo37385(c14677.m33593());
        String strM33590 = c14677.m33590();
        this.f55050 = strM33590 == null ? null : C18524.m42109(strM33590, new String[0]);
        this.f55054 = c14677.m33590();
        this.f55051 = c14677.m33585();
        c13059.m29882(c14677);
        int iM33581 = c14677.m33581();
        ArrayList arrayList = new ArrayList(iM33581);
        for (int i = 0; i < iM33581; i++) {
            arrayList.add(new C8049(c14677));
        }
        m41977((List) arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8201(C11996 c11996) {
        c11996.writeInt(this.f55056);
        c11996.writeInt(this.f55052);
        c11996.m27459(this.f55058);
        AbstractC17043 abstractC17043 = this.f55050;
        c11996.m27444(abstractC17043 == null ? null : abstractC17043.mo25505());
        c11996.m27444(this.f55054);
        c11996.m27445(this.f55051);
        this.f55048.m29881(c11996);
        List listM41980 = m41980();
        c11996.mo15113(listM41980.size());
        Iterator it = listM41980.iterator();
        while (it.hasNext()) {
            ((C8049) it.next()).m18695(c11996);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m41987() {
        return this.f55056;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m41973() {
        return this.f55052;
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC17043 mo41742() {
        return C17853.f53280.m38693("_" + mo8204().toLowerCase());
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo37385(String str) {
        this.f55058 = m41972(str);
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo8206() {
        return m41969(this.f55058);
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m41982() {
        return this.f55058;
    }

    /* JADX INFO: renamed from: ᩹ */
    public String mo41744() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܶ */
    public final String m41983() {
        return mo41741() ? mo41744() : this.f55058;
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo41743() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo16732(boolean z) {
        mo8217().mo9717(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28979(C4697 c4697, ArrayList arrayList) {
        if (c4697.m9971()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        C15838 c15838 = this.f55046;
        if (c15838 != null) {
            if (c15838.m35956("arsc")) {
                arrayList2.add(new C17179());
            } else if (this.f55046.m35956("dex")) {
                arrayList2.add(new C20534());
            } else if (this.f55046.m35956("folder")) {
                arrayList2.add(new C11817());
            } else if (this.f55046.m35956("zip") || this.f55046.m35955()) {
                arrayList2.add(new C17318());
            } else if (this.f55046.m35956("apk")) {
                arrayList2.add(new C20534());
                arrayList2.add(new C17318(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C17179());
                arrayList2.add(new C11146());
            } else {
                arrayList2.add(new C17989());
            }
            if (!this.f55046.m35956("folder")) {
                C15838 c15839 = this.f55046;
                if (c15839.f45888 == c15839.f45890) {
                    arrayList2.add(new C9134());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM41971 = m41971();
        if (arrayList2.size() % 2 != 0 && !C4579.m9654().mo3869(c4697)) {
            arrayList.set(iM41971, (AbstractC3947) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public static int m41971() {
        int[] iArrM37699 = DialogInterfaceOnDismissListenerC16634.m37699();
        int length = iArrM37699.length;
        for (int i = 0; i < length; i++) {
            if (iArrM37699[i] == 8) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unknown item command id: 8");
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC3947 mo41739(C4697 c4697) {
        return C11126.m25654(c4697);
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC3947 mo17068(C4697 c4697) {
        return C6590.m15074();
    }

    /* JADX INFO: renamed from: ֡ */
    public AbstractC3947 mo17062() {
        return C7931.m18337();
    }

    /* JADX INFO: renamed from: ᩴ */
    public AbstractC3947 mo17075() {
        return C13966.m31746();
    }

    /* JADX INFO: renamed from: ܺ */
    public AbstractC3947 mo17072() {
        return C21343.m48355();
    }

    /* JADX INFO: renamed from: ۡ */
    public AbstractC3947 mo41740() {
        return C22684.m50805();
    }

    /* JADX INFO: renamed from: ۘ */
    public AbstractC3947 mo8205() {
        return C14636.m33442();
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC3947 mo37382() {
        return C4579.m9654();
    }

    /* JADX INFO: renamed from: ۢ */
    public AbstractC3947 mo17067() {
        return C16647.m37711();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo37381(C18107 c18107, InterfaceC19370 interfaceC19370) {
        C20966.m47307(c18107, interfaceC19370);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41977(List list) {
        this.f55055 = (List) C12826.requireNonNullElse(list, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41976(ArrayList arrayList) {
        if (this.f55055.isEmpty()) {
            m41977((List) arrayList);
            return;
        }
        Set set = (Set) C7480.stream(arrayList).map(new C9982(0)).collect(C24205.toSet());
        ArrayList arrayList2 = new ArrayList();
        for (C8049 c8049 : this.f55055) {
            if (!set.contains(c8049.m18696().toLowerCase())) {
                arrayList2.add(c8049);
            }
        }
        arrayList2.addAll(arrayList);
        m41977((List) arrayList2);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m41981() {
        return this.f55054;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m41986(String str) {
        this.f55054 = C20966.m47292(str);
    }

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC12665 mo16735() {
        return C5880.f14458;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo17064(C18107 c18107, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41978(final C18107 c18107) {
        List<C8049> listM41980 = m41980();
        if (listM41980.isEmpty()) {
            return;
        }
        long jM18698 = 0;
        boolean z = false;
        final AbstractC17043 abstractC17043M18694 = null;
        for (C8049 c8049 : listM41980) {
            if (c8049.m18699()) {
                c8049.m18697();
                if (abstractC17043M18694 == null || c8049.m18698() > jM18698) {
                    abstractC17043M18694 = c8049.m18694();
                    jM18698 = c8049.m18698();
                }
                z = true;
            }
        }
        if (z) {
            c18107.m41268();
            SpannableString spannableString = new SpannableString(C7050.m16224(R.string.MT_Protector));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(C7050.m16224(R.string.MT_Protector));
            spannableString2.setSpan(new ForegroundColorSpan(C23223.f72980), 0, spannableString2.length(), 17);
            C20671 c20671BuildDialog = c18107.m41282().buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46722(false);
            c20671BuildDialog.m46735(spannableString, new DialogInterface.OnClickListener() { // from class: l.֨ۜܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC18422.m41968(this.f6374, c18107, abstractC17043M18694);
                }
            });
            c20671BuildDialog.m46719(spannableString2, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41968(AbstractC18422 abstractC18422, C18107 c18107, AbstractC17043 abstractC17043) {
        C18107 c18107M41252 = c18107.m41252();
        c18107M41252.m41268();
        c18107M41252.m41279(abstractC17043.getName());
        c18107M41252.m41259(abstractC17043.m38669(), true);
        synchronized (abstractC18422) {
            abstractC18422.f55051 = false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41985() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            this.f55049 = true;
            AbstractC17043 abstractC17043 = this.f55050;
            z = false;
            if (abstractC17043 != null && this.f55051) {
                if (this.f55047 != 0) {
                    this.f55053 = true;
                } else {
                    if (abstractC17043 == null || !abstractC17043.mo25094()) {
                        z2 = false;
                    } else {
                        abstractC17043.mo25503();
                    }
                    z = z2;
                }
            }
        }
        if (z) {
            C17127.m38756();
        }
        Object objMo8217 = mo8217();
        if (objMo8217 instanceof AutoCloseable) {
            C2700.m4192((AutoCloseable) objMo8217);
        }
        mo8218();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m41974(String str) {
        synchronized (this) {
            AbstractC17043 abstractC17043 = this.f55050;
            if (abstractC17043 != null && !this.f55049) {
                AbstractC17043 abstractC17043Mo25510 = abstractC17043.mo25510();
                for (AbstractC17043 abstractC17043Mo25511 = C18524.m42109(str, new String[0]).mo25510(); abstractC17043Mo25511 != null; abstractC17043Mo25511 = abstractC17043Mo25511.m38694()) {
                    if (abstractC17043Mo25510.equals(abstractC17043Mo25511)) {
                        long jIncrementAndGet = f55039.incrementAndGet();
                        f55042.put(Long.valueOf(jIncrementAndGet), this);
                        this.f55047++;
                        return jIncrementAndGet;
                    }
                }
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41967(long j) {
        AbstractC18422 abstractC18422;
        if (j == 0 || (abstractC18422 = (AbstractC18422) f55042.remove(Long.valueOf(j))) == null) {
            return;
        }
        synchronized (abstractC18422) {
            int i = abstractC18422.f55047;
            if (i <= 0) {
                return;
            }
            boolean z = true;
            int i2 = i - 1;
            abstractC18422.f55047 = i2;
            boolean z2 = false;
            if (i2 == 0 && abstractC18422.f55053) {
                abstractC18422.f55053 = false;
                AbstractC17043 abstractC17043 = abstractC18422.f55050;
                if (abstractC17043 == null || !abstractC17043.mo25094()) {
                    z = false;
                } else {
                    abstractC17043.mo25503();
                }
                z2 = z;
            }
            if (z2) {
                C7050.m16212(new RunnableC17202(0));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC11994 m41984() {
        return new C6629(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC11994 m41966(int i, boolean z) {
        return new C5288(i, z);
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public static AbstractC11994 m41970() {
        return new C14675(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41979(C18107 c18107, InterfaceC19370 interfaceC19370, InterfaceC9311 interfaceC9311) {
        C12073 c12073 = new C12073(interfaceC19370);
        mo8202(c18107, Collections.singletonList(c12073), new RunnableC11834(4, interfaceC9311, c12073));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m41972(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m41969(String str) {
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
