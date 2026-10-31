package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C19Y */
/* JADX INFO: loaded from: classes.dex */
public final class C19784 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f63888;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C2727 f63889;

    /* JADX INFO: renamed from: ᩵ܰ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f63890;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static native C5191 m45475(byte[] bArr);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static native byte[] m45476(String str, byte[] bArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m45470(String str) {
        f63889.remove(str);
    }

    static {
        ApplicationC12518.m30701(145);
        f63890 = new short[]{9695, 5846, 2898, -3365, 591, 10993, 9670, 30157, 30198, 30195, 30198, 30199, 30191, 30198, 30136, 30205, 30186, 30186, 30199, 30186, 5180, -8058, 8526, 11103};
        C2727 c2727 = null;
        int i = 95820958;
        int i2 = C4263.f13799;
        int i3 = C7811.f24123;
        int iM6981 = (i2 - C2105.m6981("᩷۠")) * 109;
        int i4 = ((iM6981 ^ i3) * 31733) ^ 331369776;
        int i5 = 995725521;
        while (true) {
            i = ((((i ^ i3) * (-29511)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2011378802:
                case 981267677:
                    if (C1711.m5736() <= 0) {
                        iM6981 = C2105.m6981("᩻ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11843)) ^ (-761106349);
                        i5 = 1747450184;
                    } else {
                        iM6981 = (C0630.m2566("ۛܰ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 1909) ^ (-1270147586);
                        i5 = 2114315648;
                    }
                    break;
                case -1962000375:
                case -69777197:
                    C1916.m6308();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * (-16741)) ^ (-177816577);
                        i5 = -1309504590;
                    } else {
                        iM6981 = C2105.m6981("᩶ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27719) ^ 1321687901;
                        i5 = -873296316;
                    }
                    break;
                case -1902088806:
                case -470983952:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * (-16741)) ^ (-177816577);
                        i5 = -1309504590;
                    } else {
                        iM6981 = (C2105.m6981("ᩳ۬") + i2) * (-13);
                        i4 = ((iM6981 ^ i3) * (-3965)) ^ 314940283;
                        i5 = 418886494;
                    }
                    break;
                case -1660128590:
                case -5379631:
                    C4075.m12263();
                    C22628.m50615();
                    throw new RuntimeException();
                case -1630663420:
                case -80496499:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * (-16741)) ^ (-177816577);
                        i5 = -1309504590;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܰۨ")) * 5;
                        i4 = ((iM6981 ^ i2) * 6363) ^ 825374563;
                        i5 = -1291835378;
                    }
                    break;
                case -894470715:
                case 2040988823:
                    f63889 = c2727;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * (-16741)) ^ (-177816577);
                        i5 = -1309504590;
                    } else {
                        iM6981 = (C0630.m2566("ۘᩳ") ^ i3) * (-37);
                        i4 = ((iM6981 ^ i2) * 11083) ^ 1642567367;
                        i5 = -776147300;
                    }
                    break;
                case -821663242:
                case -488725627:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("ۛܰ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 1909) ^ (-1270147586);
                        i5 = 2114315648;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ᩳ᩵")) * (-19);
                        i4 = ((iM6981 ^ i2) * (-26551)) ^ 186757339;
                        i5 = 1170227355;
                    }
                    break;
                case -447373752:
                case 1551428676:
                    if (C3432.m10477() <= 0) {
                        iM6981 = (C0630.m2566("ۛܰ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 1909) ^ (-1270147586);
                        i5 = 2114315648;
                    } else {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * (-16741)) ^ (-177816577);
                        i5 = -1309504590;
                    }
                    break;
                case -410473243:
                case 152127106:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("᩻ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11843)) ^ (-761106349);
                        i5 = 1747450184;
                    } else {
                        iM6981 = C2105.m6981("ۚ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 223) ^ 1747480032;
                        i5 = 1973118028;
                    }
                    break;
                case -344886240:
                case 1916584257:
                    C11340.m28031();
                    iM6981 = C2105.m6981("᩶ᩳ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 27719) ^ 1321687901;
                    i5 = -873296316;
                    break;
                case -266050102:
                case 1339054253:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩵ۨ")) * (-71);
                        i4 = ((iM6981 ^ i2) * (-20123)) ^ 545632127;
                        i5 = -1654497463;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩹ۗ")) * (-105);
                        i4 = ((iM6981 ^ i3) * (-26783)) ^ 1198547688;
                        i5 = 424183874;
                    }
                    break;
                case 1968214:
                case 1921308450:
                    c2727 = new C2727();
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("ۛܰ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 1909) ^ (-1270147586);
                        i5 = 2114315648;
                    } else {
                        iM6981 = (C0630.m2566("ۙۙ") + i3) * 99;
                        i4 = ((iM6981 ^ i2) * (-1067)) ^ (-701362811);
                        i5 = -2129386639;
                    }
                    break;
                case 1103599137:
                case 1491859031:
                    if (C1504.f5354) {
                        iM6981 = (C2105.m6981("ᩳۖ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * (-16741)) ^ (-177816577);
                        i5 = -1309504590;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۘۛ")) * 53;
                        i4 = ((iM6981 ^ i2) * (-2963)) ^ 710735103;
                        i5 = 430828002;
                    }
                    break;
                case 1365583012:
                case 1895435936:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("ۛܰ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 1909) ^ (-1270147586);
                        i5 = 2114315648;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩺۠")) * 43;
                        i4 = ((iM6981 ^ i3) * (-24891)) ^ 981645554;
                        i5 = 761743411;
                    }
                    break;
                default:
                    if (C7811.f24123 < 0) {
                        f63888 = new C4261(1048576);
                        return;
                    }
                    iM6981 = (i3 - C0630.m2566("᩵ۨ")) * (-71);
                    i4 = ((iM6981 ^ i2) * (-20123)) ^ 545632127;
                    i5 = -1654497463;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m45471(byte[] bArr) {
        m45474(C14460.m34525(bArr), bArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized Future m45474(final String str, final byte[] bArr) {
        if (!C0798.m3001()) {
            return null;
        }
        byte[] bArr2 = (byte[]) f63888.m4553(str);
        if (bArr2 != null) {
            return new FutureC19078(bArr2);
        }
        C2727 c2727 = f63889;
        Future future = (Future) c2727.getOrDefault(str, null);
        if (future != null) {
            return future;
        }
        Future futureSubmit = C1802.f6209.submit(new Callable() { // from class: l.ۖ᩺᩷
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C19784.m45476(str, bArr);
            }
        });
        c2727.put(str, futureSubmit);
        return futureSubmit;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01e3 A[PHI: r1 r4 r5
      0x01e3: PHI (r1v26 int) = (r1v22 int), (r1v23 int), (r1v27 int) binds: [B:58:0x01cb, B:53:0x01a3, B:41:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r4v5 int) = (r4v4 int), (r4v2 int), (r4v2 int) binds: [B:58:0x01cb, B:53:0x01a3, B:41:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r5v22 int) = (r5v18 int), (r5v19 int), (r5v23 int) binds: [B:58:0x01cb, B:53:0x01a3, B:41:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (l.C2105.f7037 != 0) goto L23;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m45473(byte[] bArr) throws IOException {
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2566;
        int i7;
        int i8;
        int i9;
        int i10;
        int length;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM6982;
        int i21;
        int i22;
        int i23;
        int i24;
        int iM6983;
        int i25;
        int i26;
        int i27;
        byte[] bArr2 = bArr;
        int i28 = C3911.f12484;
        int i29 = RunnableC1937.f6483;
        int iM6984 = (i28 - C2105.m6981("ܶ᩺")) * (-93);
        int i30 = ((iM6984 ^ i29) * 6323) ^ (-1745143123);
        long j = 0;
        long j2 = 0;
        int i31 = iM6984 ^ (-14607717);
        int i32 = 0;
        int iM37760 = 0;
        int iM5911 = 0;
        int iM5912 = 0;
        int i33 = 0;
        int iM37761 = 0;
        int i34 = 0;
        int i35 = 0;
        int iM5913 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = -112242880;
        int i40 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            i39 = i31 ^ (i30 & (((i39 ^ i29) * (-3929)) >> 31));
            switch (i39) {
                case -2128425546:
                case -1732507086:
                    throw new IOException();
                case -2025452970:
                case -1672162318:
                    i4 = i34;
                    i5 = i35;
                    if (j2 <= iM5912) {
                        iM2566 = C0630.m2566("ۡܿ") ^ i29;
                        i6 = ((iM2566 ^ i28) * 1573) ^ 44983527;
                        i7 = 1526775288;
                    } else {
                        iM2566 = C2105.m6981("֫ܿ") ^ i28;
                        i6 = ((iM2566 ^ i29) * 30415) ^ 1201066145;
                        i7 = 2120194771;
                    }
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case -1931855740:
                case 1981443458:
                    C1711.m5736();
                    if (!C0422.m1963()) {
                        i9 = i32;
                        i10 = i35;
                        length = i36;
                        i11 = i37;
                        i12 = i40;
                        int i43 = i42;
                        i13 = i34;
                        i14 = i43;
                        int iM6985 = (C2105.m6981("᩺ᩳ") ^ i29) * (-35);
                        i37 = i11;
                        i40 = i12;
                        i36 = length;
                        i35 = i10;
                        i30 = ((iM6985 ^ i28) * 1947) ^ 721077855;
                        bArr2 = bArr;
                        i15 = i9;
                        i31 = iM6985 ^ (-661076414);
                        i32 = i15;
                        int i44 = i13;
                        i42 = i14;
                        i34 = i44;
                    } else {
                        i4 = i34;
                        i5 = i35;
                        iM2566 = (C2105.m6981("᩻ᩴ") ^ i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2566 ^ i29) * 24243) ^ 1977325390;
                        i7 = -372736605;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case -1911992040:
                case 118096069:
                    int i45 = i32;
                    i4 = i34;
                    i35 = i33 + i4;
                    if (C4263.f13799 > 0) {
                        int iM2567 = C0630.m2566("ۜۘ") ^ i28;
                        i34 = i4;
                        i30 = ((iM2567 ^ i29) * (-27191)) ^ 649345076;
                        i27 = i45;
                        i31 = iM2567 ^ (-1284627577);
                        i32 = i27;
                    } else {
                        i32 = i45;
                        int iM2568 = C0630.m2566("ۡᩳ") ^ i28;
                        i8 = ((iM2568 ^ i29) * (-11091)) ^ 93684365;
                        i31 = iM2568 ^ 1525823452;
                        int i46 = i8;
                        i34 = i4;
                        i30 = i46;
                    }
                    break;
                case -1852151492:
                case 1871547748:
                    throw new IOException();
                case -1607120891:
                case -511009159:
                    i4 = i34;
                    i5 = i35;
                    iM5911 = C1773.m5911(i41 + i38, bArr2);
                    if (iM37760 >= 284) {
                        iM2566 = C0630.m2566("ᩳۡ") ^ i29;
                        i6 = ((iM2566 ^ i28) * 31003) ^ 1590063577;
                        i7 = 1271636438;
                    } else {
                        iM2566 = C2105.m6981("֫ܿ") ^ i28;
                        i6 = ((iM2566 ^ i29) * 30415) ^ 1201066145;
                        i7 = 2120194771;
                    }
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case -1599295186:
                case 823371595:
                    if (C4263.f13799 > 0) {
                        i4 = i34;
                        i5 = i35;
                        iM2566 = C0630.m2566("ۚ᩷") ^ i28;
                        i6 = ((iM2566 ^ i29) * (-12799)) ^ (-2003458332);
                        i7 = 1782181964;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    i4 = i34;
                    i5 = i35;
                    iM2566 = C2105.m6981("ۧ᩹") ^ i29;
                    i6 = ((iM2566 ^ i28) * 19713) ^ 1931416734;
                    i7 = -259787760;
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case -1542370399:
                case 1470628666:
                    break;
                case -1433841364:
                case -550861434:
                    i3 = i32;
                    i4 = i34;
                    i5 = i35;
                    i41 = -1;
                    iM6982 = C0630.m2566("ۜ᩶") ^ i28;
                    i21 = ((iM6982 ^ i29) * 283) ^ 91442981;
                    i22 = 700234958;
                    int i47 = iM6982 ^ i22;
                    i35 = i5;
                    int i48 = i21;
                    i34 = i4;
                    i30 = i48;
                    int i49 = i3;
                    i31 = i47;
                    i32 = i49;
                    break;
                case -1416773532:
                case 1592848682:
                    i4 = i34;
                    i5 = i35;
                    if (C15972.m37760(i41, bArr2) != 512) {
                        i3 = i32;
                        iM6982 = C2105.m6981("ܳۙ") ^ i28;
                        i21 = ((iM6982 ^ i29) * (-23339)) ^ 167156277;
                        i22 = 2004461871;
                        int i410 = iM6982 ^ i22;
                        i35 = i5;
                        int i411 = i21;
                        i34 = i4;
                        i30 = i411;
                        int i412 = i3;
                        i31 = i410;
                        i32 = i412;
                    } else {
                        iM2566 = C2105.m6981("ۖܰ") ^ i28;
                        i6 = ((iM2566 ^ i29) * (-29821)) ^ 2100153492;
                        i7 = 25392584;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case -1407318067:
                case -849275055:
                    i3 = i32;
                    i4 = i34;
                    i5 = i35;
                    if (i33 <= iM5912 - 8) {
                        iM6982 = (i29 - C2105.m6981("ܽۨ")) * (-11);
                        i21 = ((iM6982 ^ i28) * 4153) ^ 884534019;
                        i22 = -425179251;
                    } else {
                        iM6982 = (i28 - C2105.m6981("ۙ֫")) * (-89);
                        i21 = ((iM6982 ^ i29) * 4083) ^ (-1355235417);
                        i22 = 299554553;
                    }
                    int i413 = iM6982 ^ i22;
                    i35 = i5;
                    int i414 = i21;
                    i34 = i4;
                    i30 = i414;
                    int i415 = i3;
                    i31 = i413;
                    i32 = i415;
                    break;
                case -1383693113:
                case 947827760:
                    if (!C1711.f5919) {
                        i23 = i32;
                        i24 = i35;
                        iM6983 = C0630.m2566("ᩴᩳ") ^ i28;
                        i25 = ((iM6983 ^ i29) * (-18017)) ^ 281368667;
                        i26 = 1123099595;
                        int i50 = iM6983 ^ i26;
                        i35 = i24;
                        i27 = i23;
                        i31 = i50;
                        i30 = i25;
                        i32 = i27;
                    } else {
                        i4 = i34;
                        i5 = i35;
                        iM2566 = (C0630.m2566("᩶ܽ") + i29) * 9;
                        i6 = ((iM2566 ^ i28) * 5269) ^ 185927413;
                        i7 = 526852567;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case -1379815705:
                case -292196290:
                    i4 = i34;
                    i5 = i35;
                    j5 = i33;
                    long j7 = iM5913;
                    if (C4616.f14690 <= 0) {
                        j3 = j7;
                        iM2566 = C0630.m2566("ۚ᩷") ^ i28;
                        i6 = ((iM2566 ^ i29) * (-12799)) ^ (-2003458332);
                        i7 = 1782181964;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    } else {
                        int iM6986 = (C2105.m6981("ۙ᩶") ^ i28) * (-105);
                        i34 = i4;
                        i30 = ((iM6986 ^ i29) * 2955) ^ (-1298870376);
                        i35 = i5;
                        i32 = i32;
                        i31 = iM6986 ^ (-40350098);
                        j3 = j7;
                    }
                    break;
                case -1324679818:
                case 530962376:
                    i4 = i34;
                    i5 = i35;
                    j = j5 + j3;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ۧ᩹") ^ i29;
                        i6 = ((iM2566 ^ i28) * 19713) ^ 1931416734;
                        i7 = -259787760;
                    } else {
                        iM2566 = C0630.m2566("ۢܽ") ^ i29;
                        i6 = ((iM2566 ^ i28) * 11731) ^ 708673135;
                        i7 = -2002656832;
                    }
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case -1261735645:
                case -204607942:
                    C3663.m11168();
                    C1294.m4372();
                    return 0;
                case -1251883163:
                case 1531172079:
                    i4 = i34;
                    i5 = i35;
                    iM37760 = C15972.m37760(i32, bArr2);
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("᩻ᩴ") ^ i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2566 ^ i29) * 24243) ^ 1977325390;
                        i7 = -372736605;
                    } else {
                        iM2566 = (i28 - C0630.m2566("᩶ܿ")) * 83;
                        i6 = ((iM2566 ^ i29) * (-7453)) ^ 533844685;
                        i7 = -2035559880;
                    }
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case -1216105679:
                case 1884782320:
                    i4 = i34;
                    i5 = i35;
                    int i51 = i33 + iM5913;
                    i3 = i32;
                    if (iM37761 != 1) {
                        i33 = i51;
                        iM6982 = (C0630.m2566("ܶۡ") ^ i28) * 123;
                        i21 = ((iM6982 ^ i29) * (-3837)) ^ 1097505404;
                        i22 = 1131641671;
                        int i416 = iM6982 ^ i22;
                        i35 = i5;
                        int i417 = i21;
                        i34 = i4;
                        i30 = i417;
                        int i418 = i3;
                        i31 = i416;
                        i32 = i418;
                    } else {
                        i41 = i51;
                        iM6982 = C0630.m2566("ۜ᩶") ^ i28;
                        i21 = ((iM6982 ^ i29) * 283) ^ 91442981;
                        i22 = 700234958;
                        int i419 = iM6982 ^ i22;
                        i35 = i5;
                        int i4110 = i21;
                        i34 = i4;
                        i30 = i4110;
                        int i4111 = i3;
                        i31 = i419;
                        i32 = i4111;
                    }
                    break;
                case -1166870548:
                case -446200761:
                    throw new IOException();
                case -1105198658:
                case 360014992:
                    throw new IOException();
                case -952125717:
                case 1570184934:
                    i23 = i32;
                    i24 = i35;
                    iM37761 = C15972.m37760(i33, bArr2);
                    i34 = 4;
                    if (C1294.f4556 >= 0) {
                        iM6983 = C0630.m2566("ᩴᩳ") ^ i28;
                        i25 = ((iM6983 ^ i29) * (-18017)) ^ 281368667;
                        i26 = 1123099595;
                    } else {
                        iM6983 = C2105.m6981("ۤ᩷") ^ i29;
                        i25 = ((iM6983 ^ i28) * (-7301)) ^ (-1560723975);
                        i26 = 535461409;
                    }
                    int i52 = iM6983 ^ i26;
                    i35 = i24;
                    i27 = i23;
                    i31 = i52;
                    i30 = i25;
                    i32 = i27;
                    break;
                case -908478129:
                case -293719693:
                    C3245.m9925();
                    C4616.m13552();
                    iM6981 = (i28 - C0630.m2566("ۙۧ")) * 85;
                    i = ((iM6981 ^ i29) * 14237) ^ 45303500;
                    i2 = 1525624969;
                    i31 = iM6981 ^ i2;
                    i30 = i;
                    break;
                case -891044180:
                case -72797650:
                    return i41;
                case -890628421:
                case 1546836316:
                    i4 = i34;
                    i5 = i35;
                    i38 = 4;
                    if (C4075.f12947 < 0) {
                        iM2566 = (C0630.m2566("ܶۖ") ^ i29) * 45;
                        i6 = ((iM2566 ^ i28) * (-10263)) ^ 2038853523;
                        i7 = 1165724795;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    } else {
                        i35 = i5;
                        int iM2569 = C0630.m2566("ۡᩳ") ^ i28;
                        i8 = ((iM2569 ^ i29) * (-11091)) ^ 93684365;
                        i31 = iM2569 ^ 1525823452;
                        int i420 = i8;
                        i34 = i4;
                        i30 = i420;
                    }
                    break;
                case -815827519:
                case 1194606595:
                    i3 = i32;
                    i4 = i34;
                    i5 = i35;
                    if (i41 >= 0) {
                        iM6982 = (C0630.m2566("ۤ᩺") ^ i28) * (-15);
                        i21 = ((iM6982 ^ i29) * (-23529)) ^ (-1224178141);
                        i22 = 640426973;
                    } else {
                        iM6982 = C2105.m6981("ܳۙ") ^ i28;
                        i21 = ((iM6982 ^ i29) * (-23339)) ^ 167156277;
                        i22 = 2004461871;
                    }
                    int i4112 = iM6982 ^ i22;
                    i35 = i5;
                    int i4113 = i21;
                    i34 = i4;
                    i30 = i4113;
                    int i4114 = i3;
                    i31 = i4112;
                    i32 = i4114;
                    break;
                case -772823424:
                case -634698702:
                    i4 = i34;
                    i5 = i35;
                    if (iM5911 >= iM37760) {
                        iM2566 = C2105.m6981("ۡۡ") ^ i28;
                        i6 = ((iM2566 ^ i29) * (-31821)) ^ 1073691211;
                        i7 = -1762645920;
                    } else {
                        iM2566 = C2105.m6981("֫ܿ") ^ i28;
                        i6 = ((iM2566 ^ i29) * 30415) ^ 1201066145;
                        i7 = 2120194771;
                    }
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case -690713819:
                case 1376280956:
                    C2126.m7040();
                    if (RunnableC3474.f10992 > 0) {
                        i23 = i32;
                        i24 = i35;
                        iM6983 = C0630.m2566("ᩴᩳ") ^ i28;
                        i25 = ((iM6983 ^ i29) * (-18017)) ^ 281368667;
                        i26 = 1123099595;
                        int i53 = iM6983 ^ i26;
                        i35 = i24;
                        i27 = i23;
                        i31 = i53;
                        i30 = i25;
                        i32 = i27;
                    } else {
                        i4 = i34;
                        i5 = i35;
                        iM2566 = (C2105.m6981("᩻ᩴ") ^ i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2566 ^ i29) * 24243) ^ 1977325390;
                        i7 = -372736605;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case -520820920:
                case -198307330:
                    i9 = i32;
                    i10 = i35;
                    i11 = i37;
                    i12 = i40;
                    int i54 = i42;
                    i13 = i34;
                    i14 = i54;
                    length = bArr2.length;
                    if (C2105.f7037 == 0) {
                        int iM25610 = C0630.m2566("ۡۚ") ^ i28;
                        i37 = i11;
                        i40 = i12;
                        i36 = length;
                        i30 = ((iM25610 ^ i29) * (-24653)) ^ (-1058658372);
                        i35 = i10;
                        i32 = i9;
                        i31 = iM25610 ^ 323105897;
                        bArr2 = bArr;
                        int i55 = i13;
                        i42 = i14;
                        i34 = i55;
                    } else {
                        int iM6987 = (C2105.m6981("᩺ᩳ") ^ i29) * (-35);
                        i37 = i11;
                        i40 = i12;
                        i36 = length;
                        i35 = i10;
                        i30 = ((iM6987 ^ i28) * 1947) ^ 721077855;
                        bArr2 = bArr;
                        i15 = i9;
                        i31 = iM6987 ^ (-661076414);
                        i32 = i15;
                        int i421 = i13;
                        i42 = i14;
                        i34 = i421;
                    }
                    break;
                case -460441721:
                case 2075079515:
                    i3 = i32;
                    int i56 = i34;
                    i5 = i35;
                    i14 = i42;
                    int iM37762 = C15972.m37760(i14, bArr2);
                    iM5912 = C1773.m5911(4, bArr2);
                    i20 = i37;
                    if (iM37762 < i20) {
                        i13 = i56;
                        i40 = iM37762;
                        int iM25611 = C0630.m2566("۠ᩳ") ^ i28;
                        i18 = ((iM25611 ^ i29) * (-16879)) ^ (-1103340857);
                        i19 = iM25611 ^ 1553022570;
                        i37 = i20;
                        i35 = i5;
                        i15 = i3;
                        i31 = i19;
                        i30 = i18;
                        i32 = i15;
                        int i422 = i13;
                        i42 = i14;
                        i34 = i422;
                    } else {
                        int iM6988 = (C2105.m6981("ܿ᩻") + i29) * 45;
                        i13 = i56;
                        i30 = ((iM6988 ^ i28) * 27403) ^ (-687529361);
                        i40 = iM37762;
                        i32 = i3;
                        i31 = iM6988 ^ (-38234760);
                        i37 = i20;
                        i35 = i5;
                        int i57 = i13;
                        i42 = i14;
                        i34 = i57;
                    }
                    break;
                case -413103929:
                case 1329318844:
                    i4 = i34;
                    i5 = i35;
                    i32 = i41 + 2;
                    if (C1420.f5096 > 0) {
                        iM2566 = (i29 - C0630.m2566("֨ۧ")) * 33;
                        i6 = ((iM2566 ^ i28) * 5459) ^ (-799676432);
                        i7 = -1794403676;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    } else {
                        i35 = i5;
                        int iM25612 = C0630.m2566("ۡᩳ") ^ i28;
                        i8 = ((iM25612 ^ i29) * (-11091)) ^ 93684365;
                        i31 = iM25612 ^ 1525823452;
                        int i423 = i8;
                        i34 = i4;
                        i30 = i423;
                    }
                    break;
                case -345850430:
                case -157256278:
                    i3 = i32;
                    i4 = i34;
                    i5 = i35;
                    if (iM5912 > bArr2.length) {
                        i20 = i37;
                        i14 = i42;
                        i13 = i4;
                        int iM25613 = C0630.m2566("۠ᩳ") ^ i28;
                        i18 = ((iM25613 ^ i29) * (-16879)) ^ (-1103340857);
                        i19 = iM25613 ^ 1553022570;
                        i37 = i20;
                        i35 = i5;
                        i15 = i3;
                        i31 = i19;
                        i30 = i18;
                        i32 = i15;
                        int i424 = i13;
                        i42 = i14;
                        i34 = i424;
                    } else {
                        i33 = i40;
                        iM6982 = (C0630.m2566("ܶۡ") ^ i28) * 123;
                        i21 = ((iM6982 ^ i29) * (-3837)) ^ 1097505404;
                        i22 = 1131641671;
                        int i4115 = iM6982 ^ i22;
                        i35 = i5;
                        int i4116 = i21;
                        i34 = i4;
                        i30 = i4116;
                        int i4117 = i3;
                        i31 = i4115;
                        i32 = i4117;
                    }
                    break;
                case -173945243:
                case 306281035:
                    i3 = i32;
                    i5 = i35;
                    i16 = i40;
                    int i58 = i42;
                    i13 = i34;
                    i14 = i58;
                    i17 = i36;
                    if (i17 < 12) {
                        i37 = 12;
                        int iM6989 = (C2105.m6981("ᩳۧ") + i29) * (-51);
                        int i59 = i16;
                        i18 = ((iM6989 ^ i28) * 22669) ^ (-579892240);
                        i19 = iM6989 ^ 346284470;
                        i40 = i59;
                        i36 = i17;
                        i35 = i5;
                        i15 = i3;
                        i31 = i19;
                        i30 = i18;
                        i32 = i15;
                        int i425 = i13;
                        i42 = i14;
                        i34 = i425;
                    } else {
                        int iM25614 = (C0630.m2566("ܿ᩹") + i29) * 43;
                        i30 = ((iM25614 ^ i28) * 24921) ^ (-1691806549);
                        i40 = i16;
                        i32 = i3;
                        i37 = 12;
                        i31 = iM25614 ^ (-2063286596);
                        i36 = i17;
                        i35 = i5;
                        int i510 = i13;
                        i42 = i14;
                        i34 = i510;
                    }
                    break;
                case -95013936:
                case 2140509047:
                    throw new IOException();
                case 38940786:
                case 1586124302:
                    i4 = i34;
                    i5 = i35;
                    if (i41 > iM5912 - 284) {
                        i3 = i32;
                        iM6982 = C2105.m6981("ܳۙ") ^ i28;
                        i21 = ((iM6982 ^ i29) * (-23339)) ^ 167156277;
                        i22 = 2004461871;
                        int i4118 = iM6982 ^ i22;
                        i35 = i5;
                        int i4119 = i21;
                        i34 = i4;
                        i30 = i4119;
                        int i41110 = i3;
                        i31 = i4118;
                        i32 = i41110;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩷") ^ i29) * (-125);
                        i6 = ((iM2566 ^ i28) * (-15163)) ^ 968503164;
                        i7 = -1696576587;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case 74717136:
                case 1962195306:
                    i3 = i32;
                    i13 = i34;
                    i5 = i35;
                    int i60 = i37;
                    i16 = i40;
                    if (C15972.m37760(0, bArr2) == 2) {
                        int iM25615 = (C0630.m2566("ۢ᩹") ^ i28) * (-13);
                        i40 = i16;
                        i37 = i60;
                        i32 = i3;
                        i31 = iM25615 ^ 1036120701;
                        i35 = i5;
                        i30 = ((iM25615 ^ i29) * 13007) ^ 1171826536;
                        i34 = i13;
                        i42 = 2;
                    } else {
                        i37 = i60;
                        i17 = i36;
                        i14 = 2;
                        int iM69810 = (C2105.m6981("ᩳۧ") + i29) * (-51);
                        int i511 = i16;
                        i18 = ((iM69810 ^ i28) * 22669) ^ (-579892240);
                        i19 = iM69810 ^ 346284470;
                        i40 = i511;
                        i36 = i17;
                        i35 = i5;
                        i15 = i3;
                        i31 = i19;
                        i30 = i18;
                        i32 = i15;
                        int i426 = i13;
                        i42 = i14;
                        i34 = i426;
                    }
                    break;
                case 327794823:
                case 1048105454:
                    if (!C1711.f5919) {
                        i23 = i32;
                        i24 = i35;
                        iM6983 = C0630.m2566("ᩴᩳ") ^ i28;
                        i25 = ((iM6983 ^ i29) * (-18017)) ^ 281368667;
                        i26 = 1123099595;
                        int i512 = iM6983 ^ i26;
                        i35 = i24;
                        i27 = i23;
                        i31 = i512;
                        i30 = i25;
                        i32 = i27;
                    } else {
                        iM6981 = C0630.m2566("᩸᩺") ^ i29;
                        i = ((iM6981 ^ i28) * 25511) ^ (-2091225426);
                        i2 = -1594673309;
                        i31 = iM6981 ^ i2;
                        i30 = i;
                    }
                    break;
                case 334562113:
                case 1435361006:
                    i3 = i32;
                    i4 = i34;
                    i5 = i35;
                    iM5913 = C1773.m5911(i5, bArr2);
                    if (iM5913 >= 8) {
                        iM6982 = (i29 - C0630.m2566("᩸᩻")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i21 = ((iM6982 ^ i28) * 25651) ^ 306589511;
                        i22 = 999190465;
                    } else {
                        iM6982 = C2105.m6981("᩸۟") ^ i29;
                        i21 = ((iM6982 ^ i28) * (-11185)) ^ (-1080771578);
                        i22 = -2070576931;
                    }
                    int i41111 = iM6982 ^ i22;
                    i35 = i5;
                    int i41112 = i21;
                    i34 = i4;
                    i30 = i41112;
                    int i41113 = i3;
                    i31 = i41111;
                    i32 = i41113;
                    break;
                case 423813745:
                case 683886130:
                    i4 = i34;
                    i5 = i35;
                    if (j > iM5912) {
                        i3 = i32;
                        iM6982 = C2105.m6981("᩸۟") ^ i29;
                        i21 = ((iM6982 ^ i28) * (-11185)) ^ (-1080771578);
                        i22 = -2070576931;
                        int i41114 = iM6982 ^ i22;
                        i35 = i5;
                        int i41115 = i21;
                        i34 = i4;
                        i30 = i41115;
                        int i41116 = i3;
                        i31 = i41114;
                        i32 = i41116;
                    } else {
                        iM2566 = C2105.m6981("᩹֨") ^ i29;
                        i6 = ((iM2566 ^ i28) * (-31105)) ^ (-126985903);
                        i7 = 644044372;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case 1031353299:
                case 1901504587:
                    i4 = i34;
                    i5 = i35;
                    j2 = j6 + j4;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("᩶ܽ") + i29) * 9;
                        i6 = ((iM2566 ^ i28) * 5269) ^ 185927413;
                        i7 = 526852567;
                    } else {
                        iM2566 = C2105.m6981("֫ۜ") ^ i28;
                        i6 = ((iM2566 ^ i29) * 32609) ^ 632773450;
                        i7 = 2058830710;
                    }
                    i31 = iM2566 ^ i7;
                    i34 = i4;
                    i30 = i6;
                    i35 = i5;
                    break;
                case 1075961264:
                case 1484966710:
                    i3 = i32;
                    i4 = i34;
                    i5 = i35;
                    int i61 = i40;
                    if (iM5912 < i61) {
                        i40 = i61;
                        i20 = i37;
                        i14 = i42;
                        i13 = i4;
                        int iM25616 = C0630.m2566("۠ᩳ") ^ i28;
                        i18 = ((iM25616 ^ i29) * (-16879)) ^ (-1103340857);
                        i19 = iM25616 ^ 1553022570;
                        i37 = i20;
                        i35 = i5;
                        i15 = i3;
                        i31 = i19;
                        i30 = i18;
                        i32 = i15;
                        int i427 = i13;
                        i42 = i14;
                        i34 = i427;
                    } else {
                        int iM25617 = C0630.m2566("ܿ᩵") ^ i29;
                        i6 = ((iM25617 ^ i28) * 317) ^ 1187013805;
                        i40 = i61;
                        i32 = i3;
                        i31 = iM25617 ^ 1732465046;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                case 1633737544:
                case 1806957979:
                    C3019.m9255();
                    if (!C1504.f5354) {
                        i4 = i34;
                        i5 = i35;
                        iM2566 = (C2105.m6981("᩻ᩴ") ^ i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2566 ^ i29) * 24243) ^ 1977325390;
                        i7 = -372736605;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    } else {
                        iM6981 = (i28 - C0630.m2566("ۙۧ")) * 85;
                        i = ((iM6981 ^ i29) * 14237) ^ 45303500;
                        i2 = 1525624969;
                        i31 = iM6981 ^ i2;
                        i30 = i;
                    }
                    break;
                case 1830107571:
                case 1880347221:
                    i4 = i34;
                    i5 = i35;
                    j6 = i41;
                    long j8 = iM5911;
                    if (!C2520.m8026()) {
                        int iM25618 = (i29 - C0630.m2566("ۛۜ")) * 47;
                        i8 = ((iM25618 ^ i28) * 27457) ^ (-682024470);
                        i31 = iM25618 ^ (-1174726228);
                        i35 = i5;
                        j4 = j8;
                        int i428 = i8;
                        i34 = i4;
                        i30 = i428;
                    } else {
                        j4 = j8;
                        iM2566 = (C2105.m6981("᩻ᩴ") ^ i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2566 ^ i29) * 24243) ^ 1977325390;
                        i7 = -372736605;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
                default:
                    if (!C0630.m2564()) {
                        iM6981 = C2105.m6981("۬ۢ") ^ i28;
                        i = ((iM6981 ^ i29) * 14443) ^ 1359417972;
                        i2 = -560115885;
                        i31 = iM6981 ^ i2;
                        i30 = i;
                    } else {
                        i4 = i34;
                        i5 = i35;
                        iM2566 = C2105.m6981("ۧ᩹") ^ i29;
                        i6 = ((iM2566 ^ i28) * 19713) ^ 1931416734;
                        i7 = -259787760;
                        i31 = iM2566 ^ i7;
                        i34 = i4;
                        i30 = i6;
                        i35 = i5;
                    }
                    break;
            }
        }
    }
}
