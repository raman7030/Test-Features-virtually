package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10028 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ܶܰۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f82074 = {6899, -23441, -23456, -23446, -23428, -23455, -23449, -23446, -23520, -23449, -23456, -23430, -23445, -23456, -23430, -23520, -23441, -23443, -23430, -23449, -23455, -23456, -23520, -23485, -23477, -23478, -23481, -23473, -23471, -23485, -23487, -23461, -23488, -23462, -23477, -23478, -23441, -23456, -23446, -23428, -23455, -23449, -23446, -23520, -23449, -23456, -23430, -23445, -23456, -23430, -23520, -23441, -23443, -23430, -23449, -23455, -23456, -23520, -23485, -23477, -23478, -23481, -23473, -23471, -23477, -23484, -23477, -23475, -23462};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Main f27776;

    /* JADX WARN: Code duplicated, block: B:68:0x0281 A[PHI: r1 r3 r8 r9 r19
      0x0281: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v2 java.lang.String) binds: [B:67:0x027f, B:59:0x022f, B:41:0x0174, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:67:0x027f, B:59:0x022f, B:41:0x0174, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:67:0x027f, B:59:0x022f, B:41:0x0174, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:67:0x027f, B:59:0x022f, B:41:0x0174, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r19v21 bin.mt.plus.Main) = (r19v4 bin.mt.plus.Main), (r19v6 bin.mt.plus.Main), (r19v12 bin.mt.plus.Main), (r19v24 bin.mt.plus.Main) binds: [B:67:0x027f, B:59:0x022f, B:41:0x0174, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b4 A[PHI: r5 r6 r19
      0x02b4: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:71:0x02b2, B:51:0x01ed, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:71:0x02b2, B:51:0x01ed, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r19v22 bin.mt.plus.Main) = (r19v3 bin.mt.plus.Main), (r19v9 bin.mt.plus.Main), (r19v23 bin.mt.plus.Main) binds: [B:71:0x02b2, B:51:0x01ed, B:8:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02e3 A[PHI: r10 r11 r12 r19
      0x02e3: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:75:0x02e1, B:33:0x0111, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:75:0x02e1, B:33:0x0111, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:75:0x02e1, B:33:0x0111, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r19v18 bin.mt.plus.Main) = (r19v2 bin.mt.plus.Main), (r19v14 bin.mt.plus.Main), (r19v19 bin.mt.plus.Main) binds: [B:75:0x02e1, B:33:0x0111, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0311 A[PHI: r4 r19
      0x0311: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:79:0x030f, B:55:0x0210] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r19v7 bin.mt.plus.Main) = (r19v1 bin.mt.plus.Main), (r19v8 bin.mt.plus.Main) binds: [B:79:0x030f, B:55:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (p067l.C0906.f81862 < 0) goto L8;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) throws Throwable {
        int iM55979;
        int i;
        int i2;
        int i3 = C0992.f81922;
        int i4 = RunnableC0938.f81886;
        int iM559710 = (i3 - C0946.m55979("۟ܽ")) * 115;
        int i5 = ((iM559710 ^ i4) * 17943) ^ 1035198386;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM559710 ^ (-1054245105);
        short s = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 59416826;
        Main main = null;
        String action = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-20441)) >> 31));
            switch (i12) {
                case -2119683300:
                case -1916496450:
                    main = main;
                    int i13 = s + s2;
                    if ((i13 * i13) - i7 >= 0) {
                        iM55979 = (C0873.m55680("ۛ۟") ^ i3) * 69;
                        i = ((iM55979 ^ i4) * (-2445)) ^ 1428635086;
                        i2 = -42807319;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۙۘ")) * 37;
                        i = ((iM55979 ^ i3) * (-22073)) ^ (-134672580);
                        i2 = 1957416981;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -2053766686:
                case -1658921449:
                    main = this.f27776;
                    if (main.f57 != null) {
                        int iM559711 = C0946.m55979("ᩳ۫") ^ i3;
                        i5 = ((iM559711 ^ i4) * (-1531)) ^ 1778238996;
                        i6 = iM559711 ^ (-678253339);
                    } else {
                        iM55979 = C0946.m55979("ۙᩳ") ^ i3;
                        main = main;
                        i = ((iM55979 ^ i4) * (-22529)) ^ 275723239;
                        i2 = 273626660;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        main = main;
                    }
                    break;
                case -1963974972:
                case -812302798:
                    main = main;
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ۙۡ") ^ i4;
                        i = ((iM55979 ^ i3) * (-31309)) ^ (-1916379951);
                        i2 = 444093488;
                    } else {
                        iM55979 = C0946.m55979("ܳۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28697)) ^ 1788143612;
                        i2 = 2084328838;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1952755662:
                case -301402411:
                    main = main;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("֫ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-24083)) ^ 1039545069;
                        i2 = 1886397542;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩻") ^ i4;
                        i = ((iM55979 ^ i3) * EnumC8055.f21261) ^ (-1219560941);
                        i2 = -2129314353;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1857422914:
                case -1725616473:
                    main = main;
                    if (C0906.m55806(C1053.m56325(sArr2, i9, 35, i8), action)) {
                        iM55979 = (C0946.m55979("ܶܺ") ^ i3) * (-7);
                        i = ((iM55979 ^ i4) * 25713) ^ 1905122824;
                        i2 = -1154224346;
                    } else {
                        iM55979 = (i4 - C0873.m55680("֡ܰ")) * (-43);
                        i = ((iM55979 ^ i3) * (-335)) ^ 193775909;
                        i2 = 1743918854;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1745825436:
                case 1000741554:
                    C21129.m47756(null);
                    main = main;
                    iM55979 = (i4 - C0946.m55979("ۚᩴ")) * (-91);
                    i = ((iM55979 ^ i3) * 25971) ^ 1946838741;
                    i2 = -1186312825;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1545219015:
                case -46090211:
                    if (C1404.f82149 >= 0) {
                        main = main;
                        iM55979 = (C0946.m55979("֫᩵") ^ i3) * 35;
                        i = ((iM55979 ^ i4) * (-21753)) ^ 1585971647;
                        i2 = -1614253027;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        main = main;
                    }
                    main = main;
                    iM55979 = C0946.m55979("ܳۨ") ^ i4;
                    i = ((iM55979 ^ i3) * (-28697)) ^ 1788143612;
                    i2 = 2084328838;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1513389972:
                case 38162035:
                    main = main;
                    sArr = f82074;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (i4 - C0946.m55979("᩻ᩳ")) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 16317) ^ (-71418826);
                        i2 = -941194857;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۛ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i3) * 3267) ^ 1140210364;
                        i2 = -371170270;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1255508797:
                case -153626237:
                    main = main;
                    action = intent.getAction();
                    sArr2 = f82074;
                    i9 = 1;
                    if (C1964.m56597() != 0) {
                        iM55979 = (i4 - C0946.m55979("᩻ᩳ")) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 16317) ^ (-71418826);
                        i2 = -941194857;
                    } else {
                        iM55979 = C0873.m55680("ۜܺ") ^ i4;
                        i = ((iM55979 ^ i3) * (-4979)) ^ 902794285;
                        i2 = 11205962;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1217213997:
                case 976232397:
                    main.f57.m26062();
                    iM55979 = C0946.m55979("ۙᩳ") ^ i3;
                    main = main;
                    i = ((iM55979 ^ i4) * (-22529)) ^ 275723239;
                    i2 = 273626660;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1091281452:
                case -461997681:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        main = main;
                        iM55979 = (i4 - C0946.m55979("᩻ᩳ")) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 16317) ^ (-71418826);
                        i2 = -941194857;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        main = main;
                    }
                    main = main;
                    iM55979 = C0946.m55979("֫ܰ") ^ i4;
                    i = ((iM55979 ^ i3) * (-24083)) ^ 1039545069;
                    i2 = 1886397542;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -1001234730:
                case 942146650:
                    main = main;
                    i7 = s * 73576;
                    s2 = 18394;
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("֫ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-24083)) ^ 1039545069;
                        i2 = 1886397542;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۢ֡")) * (-53);
                        i = ((iM55979 ^ i4) * (-20651)) ^ (-981101337);
                        i2 = 1082088869;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -510440023:
                case -455653865:
                    RunnableC0871.m55672();
                    C0927.m55873();
                    break;
                case -490458413:
                case 1345892944:
                    break;
                case -304124743:
                case 929669260:
                    C1044.m56286();
                    main = main;
                    iM55979 = C0946.m55979("֫ܰ") ^ i4;
                    i = ((iM55979 ^ i3) * (-24083)) ^ 1039545069;
                    i2 = 1886397542;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case -34713234:
                case 2044536105:
                    break;
                case 16269030:
                case 1511776022:
                    main = main;
                    s = sArr[0];
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0873.m55680("۬ᩳ") ^ i3) * 57;
                        i = ((iM55979 ^ i4) * (-32045)) ^ (-1789912876);
                        i2 = 1443345195;
                    } else {
                        iM55979 = C0946.m55979("ܰۙ") ^ i4;
                        i = ((iM55979 ^ i3) * 24601) ^ (-642450249);
                        i2 = 1437688917;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 186556757:
                case 2085002925:
                    C21129.m47756(intent.getData().getPath());
                    main = main;
                    iM55979 = (i4 - C0946.m55979("ۚᩴ")) * (-91);
                    i = ((iM55979 ^ i3) * 25971) ^ 1946838741;
                    i2 = -1186312825;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 284560890:
                case 1193750994:
                    main = main;
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i4 - C0946.m55979("᩻ᩳ")) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 16317) ^ (-71418826);
                        i2 = -941194857;
                    } else {
                        iM55979 = C0946.m55979("۬ܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-11379)) ^ (-1209682064);
                        i2 = -1763930767;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 291078147:
                case 422190929:
                    main = main;
                    sArr3 = f82074;
                    i10 = 36;
                    i11 = 33;
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("ܳۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28697)) ^ 1788143612;
                        i2 = 2084328838;
                    } else {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-20035)) ^ (-1169070610);
                        i2 = -1359802368;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 661412271:
                case 1633961346:
                    i8 = 7230;
                    iM55979 = (C0873.m55680("ۡۨ") + i3) * 25;
                    i = ((iM55979 ^ i4) * 3307) ^ 261976327;
                    i2 = -2114876164;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 1034165391:
                case 2114419193:
                    main = main;
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("۬ᩳ") ^ i3) * 57;
                        i = ((iM55979 ^ i4) * (-32045)) ^ (-1789912876);
                        i2 = 1443345195;
                    } else {
                        iM55979 = C0946.m55979("᩶ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * (-14609)) ^ 1799978554;
                        i2 = 1733471258;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 1129423619:
                case 1928132008:
                    if (C0906.m55806(C0955.m56029(sArr3, i10, i11, i8), action)) {
                        iM55979 = C0873.m55680("ܺ۫") ^ i4;
                        main = main;
                        i = ((iM55979 ^ i3) * (-27789)) ^ 464186281;
                        i2 = -1694656370;
                    } else {
                        main = main;
                        iM55979 = (i4 - C0946.m55979("ۚᩴ")) * (-91);
                        i = ((iM55979 ^ i3) * 25971) ^ 1946838741;
                        i2 = -1186312825;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                case 1923905595:
                case 2071845199:
                    main = main;
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("᩺ܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 22769) ^ (-795795751);
                        i2 = 1214853728;
                    } else {
                        iM55979 = (C0946.m55979("֫᩵") ^ i3) * 35;
                        i = ((iM55979 ^ i4) * (-21753)) ^ 1585971647;
                        i2 = -1614253027;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
                default:
                    i8 = 41998;
                    iM55979 = (C0873.m55680("ۡۨ") + i3) * 25;
                    i = ((iM55979 ^ i4) * 3307) ^ 261976327;
                    i2 = -2114876164;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    main = main;
                    break;
            }
            return;
        }
    }

    public C10028(Main main) {
        this.f27776 = main;
    }
}
