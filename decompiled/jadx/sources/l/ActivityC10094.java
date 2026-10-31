package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A97T */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10094 extends ActivityC2124 {

    /* JADX INFO: renamed from: ۙܿۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f30396 = {4563, -24313, -24312, -24318, -24300, -24311, -24305, -24318, -24248, -24305, -24312, -24302, -24317, -24312, -24302, -24248, -24313, -24315, -24302, -24305, -24311, -24312, -24248, -24272, -24273, -24285, -24271, -24320, -24300, -24311, -24309, -24285, -24290, -24302, -24317, -24300, -24312, -24313, -24310, -24281, -24298, -24298};

    /* JADX WARN: Code duplicated, block: B:105:0x038e A[PHI: r11 r17
      0x038e: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:104:0x038c, B:88:0x0309, B:19:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r17v36 int) = (r17v12 int), (r17v17 int), (r17v37 int) binds: [B:104:0x038c, B:88:0x0309, B:19:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x03c0 A[PHI: r17
      0x03c0: PHI (r17v43 int) = (r17v11 int), (r17v39 int), (r17v44 int) binds: [B:108:0x03be, B:16:0x007a, B:9:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x03f2 A[PHI: r12 r17
      0x03f2: PHI (r12v3 short) = (r12v1 short), (r12v2 short), (r12v1 short) binds: [B:112:0x03f0, B:84:0x02e8, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x03f2: PHI (r17v40 int) = (r17v10 int), (r17v18 int), (r17v45 int) binds: [B:112:0x03f0, B:84:0x02e8, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0421 A[PHI: r8 r17
      0x0421: PHI (r8v3 char) = (r8v1 char), (r8v1 char), (r8v2 char), (r8v1 char), (r8v1 char) binds: [B:168:0x0421, B:116:0x041f, B:96:0x034c, B:19:0x0085, B:16:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0421: PHI (r17v38 int) = (r17v6 int), (r17v9 int), (r17v14 int), (r17v37 int), (r17v39 int) binds: [B:168:0x0421, B:116:0x041f, B:96:0x034c, B:19:0x0085, B:16:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0453 A[PHI: r7 r9 r10 r17
      0x0453: PHI (r7v3 short[]) = (r7v1 short[]), (r7v2 short[]), (r7v1 short[]) binds: [B:120:0x0451, B:100:0x036d, B:92:0x032c] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r9v2 short) = (r9v1 short), (r9v1 short), (r9v3 short) binds: [B:120:0x0451, B:100:0x036d, B:92:0x032c] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:120:0x0451, B:100:0x036d, B:92:0x032c] A[DONT_GENERATE, DONT_INLINE]
      0x0453: PHI (r17v15 int) = (r17v8 int), (r17v13 int), (r17v16 int) binds: [B:120:0x0451, B:100:0x036d, B:92:0x032c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[PHI: r17
      0x00d3: PHI (r17v52 int) = (r17v49 int), (r17v56 int) binds: [B:30:0x00d0, B:22:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7 A[PHI: r17
      0x00f7: PHI (r17v50 int) = (r17v6 int), (r17v48 int), (r17v49 int), (r17v51 int) binds: [B:140:0x00f7, B:36:0x00ef, B:30:0x00d0, B:26:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        Uri uriM36522;
        ActivityC10094 activityC10094 = this;
        boolean zM36507 = false;
        Uri uri = null;
        SecurityException securityException = null;
        int flags = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 1845732516;
        int i9 = C3537.f11231;
        int i10 = C0483.f2088;
        int iM6981 = (i10 - C2105.m6981("ᩴۛ")) * 39;
        int i11 = ((iM6981 ^ i9) * (-8033)) ^ 1489488493;
        int i12 = iM6981 ^ 943824146;
        Intent intent = null;
        AbstractC15440 abstractC15440M39867 = null;
        while (true) {
            int i13 = i12 ^ (i11 & (((i8 ^ i9) * 24753) >> 31));
            switch (i13) {
                case -2130129413:
                case 703699090:
                    i13 = i13;
                    if (C11340.f33930 >= 0) {
                        iM2567 = (C0630.m2566("ܰۗ") ^ i9) * 79;
                        i3 = ((iM2567 ^ i10) * (-18629)) ^ 544819421;
                        i4 = -1497250593;
                    } else {
                        iM2567 = C0630.m2566("ܽܰ") ^ i9;
                        i3 = ((iM2567 ^ i10) * (-11805)) ^ 203867790;
                        i4 = -524243411;
                    }
                    int i14 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i14;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1941572624:
                case 125340272:
                    uriM36522 = abstractC15440M39867.mo31567();
                    uri = uriM36522;
                    iM2567 = C2105.m6981("۠۬") ^ i10;
                    i3 = ((iM2567 ^ i9) * 1421) ^ 1670434163;
                    i4 = -837097561;
                    int i15 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i15;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1929892419:
                case -109888820:
                    i13 = i13;
                    if (C1047.m3599() >= 0) {
                        iM2567 = (i9 - C2105.m6981("ܺ۫")) * 27;
                        i3 = ((iM2567 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM2567 = (C2105.m6981("֡ܽ") ^ i10) * (-103);
                        i3 = ((iM2567 ^ i9) * 31371) ^ (-1689785004);
                        i4 = 1567469560;
                    }
                    int i16 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i16;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1904972040:
                case 609966318:
                    C2272.m7505(this);
                    return;
                case -1838255501:
                case 1716211974:
                    i13 = i13;
                    c = 0;
                    if (C1294.f4556 >= 0) {
                        iM2567 = (i9 - C2105.m6981("ܺ۫")) * 27;
                        i3 = ((iM2567 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۘ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2567 ^ i9) * 18557) ^ (-514922079);
                        i4 = 522279167;
                    }
                    int i17 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i17;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1828989345:
                case -744647933:
                    i13 = i13;
                    throw securityException;
                case -1674672902:
                case 892902565:
                    i7 = 18267;
                    iM2567 = C0630.m2566("ۧۤ") ^ i10;
                    i3 = ((iM2567 ^ i9) * (-12071)) ^ (-2043282401);
                    i4 = -741483983;
                    int i18 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i18;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1537244383:
                case -544745438:
                    i13 = i13;
                    C0964.m3413();
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("۫ܶ") ^ i10) * (-61);
                        i = ((iM2566 ^ i9) * 391) ^ (-226188255);
                        i2 = -979676733;
                    } else {
                        iM2566 = C2105.m6981("ܶۤ") ^ i9;
                        i = ((iM2566 ^ i10) * (-29973)) ^ (-93051364);
                        i2 = -823242455;
                    }
                    int i19 = i13;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    i8 = i19;
                    break;
                case -1522247024:
                case -460899614:
                    C4117.m12364();
                    if (C1294.m4372() > 0) {
                        i13 = i13;
                        iM2567 = (C0630.m2566("ܰۗ") ^ i9) * 79;
                        i3 = ((iM2567 ^ i10) * (-18629)) ^ 544819421;
                        i4 = -1497250593;
                        int i110 = iM2567 ^ i4;
                        i8 = i13;
                        i12 = i110;
                        i11 = i3;
                        activityC10094 = this;
                    }
                    i13 = i13;
                    iM2567 = (C2105.m6981("֡ܽ") ^ i10) * (-103);
                    i3 = ((iM2567 ^ i9) * 31371) ^ (-1689785004);
                    i4 = 1567469560;
                    int i111 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i111;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1377104316:
                case 299479032:
                    i13 = i13;
                    if (C1773.f6144 <= 0) {
                        iM2567 = (i10 - C2105.m6981("ۘۨ")) * (-47);
                        i3 = ((iM2567 ^ i9) * 19469) ^ (-191298515);
                        i4 = 1854079844;
                    } else {
                        iM2567 = C0630.m2566("ۨ᩺") ^ i10;
                        i3 = ((iM2567 ^ i9) * (-20413)) ^ 16439045;
                        i4 = -789426468;
                    }
                    int i112 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i112;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1224421068:
                case 830031348:
                    i13 = i13;
                    if (C2167.f7158 >= 0) {
                        iM2567 = (C2105.m6981("֡ܽ") ^ i10) * (-103);
                        i3 = ((iM2567 ^ i9) * 31371) ^ (-1689785004);
                        i4 = 1567469560;
                    } else {
                        iM2567 = C0630.m2566("ۙۜ") ^ i10;
                        i3 = ((iM2567 ^ i9) * (-17665)) ^ (-256815830);
                        i4 = -822467880;
                    }
                    int i113 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i113;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -1118643683:
                case 1028828839:
                    i13 = i13;
                    try {
                        C21923.m49344(activityC10094, intent);
                        iM2567 = (C2105.m6981("۫᩻") + i10) * 93;
                        i3 = ((iM2567 ^ i9) * (-27119)) ^ (-1793638709);
                        i4 = 880189097;
                        int i114 = iM2567 ^ i4;
                        i8 = i13;
                        i12 = i114;
                        i11 = i3;
                        activityC10094 = this;
                    } catch (SecurityException e) {
                        int iM2568 = (C0630.m2566("ۧ᩵") + i10) * (-59);
                        int i20 = ((iM2568 ^ i9) * 19745) ^ (-325451605);
                        int i21 = iM2568 ^ (-9624083);
                        securityException = e;
                        i11 = i20;
                        i8 = i13;
                        i12 = i21;
                    }
                    break;
                case -1093434633:
                case 572802894:
                    i13 = i13;
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("۫ܶ") ^ i10) * (-61);
                        i = ((iM2566 ^ i9) * 391) ^ (-226188255);
                        i2 = -979676733;
                    } else {
                        iM2566 = C0630.m2566("ܺܳ") ^ i10;
                        i = ((iM2566 ^ i9) * 1425) ^ 813705075;
                        i2 = 2071736859;
                    }
                    int i115 = i13;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    i8 = i115;
                    break;
                case -1017563794:
                case 1626413305:
                    i13 = i13;
                    abstractC15440M39867 = C16999.m39867(this);
                    zM36507 = abstractC15440M39867.m36507();
                    iM2567 = (i9 - C2105.m6981("ۨۗ")) * 91;
                    i3 = ((iM2567 ^ i10) * 14415) ^ (-1490770315);
                    i4 = 1077453026;
                    int i116 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i116;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -978994090:
                case 1969180041:
                    i13 = i13;
                    if (C0630.m2564()) {
                        iM2567 = C2105.m6981("ۘܽ") ^ i10;
                        i3 = ((iM2567 ^ i9) * 9805) ^ 308675150;
                        i4 = 1000650628;
                    } else {
                        iM2567 = C0630.m2566("ۛ֡") ^ i9;
                        i3 = ((iM2567 ^ i10) * (-9539)) ^ (-1081457698);
                        i4 = -1005816241;
                    }
                    int i117 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i117;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -868190789:
                case -694293752:
                    i13 = i13;
                    if (zM36507) {
                        iM2567 = C2105.m6981("᩶۬") ^ i9;
                        i3 = ((iM2567 ^ i10) * 16275) ^ (-1439939219);
                        i4 = 1577043084;
                    } else {
                        iM2567 = (C2105.m6981("᩵᩺") + i10) * (-117);
                        i3 = ((iM2567 ^ i9) * 20735) ^ 14198966;
                        i4 = 702873885;
                    }
                    int i118 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i118;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -758661733:
                case 1512246622:
                    i13 = i13;
                    s2 = 35380;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = (C0630.m2566("ܰۗ") ^ i9) * 79;
                        i3 = ((iM2567 ^ i10) * (-18629)) ^ 544819421;
                        i4 = -1497250593;
                    } else {
                        iM2567 = C0630.m2566("ۤۖ") ^ i9;
                        i3 = ((iM2567 ^ i10) * (-27593)) ^ 980525380;
                        i4 = -274094100;
                    }
                    int i119 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i119;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -396862864:
                case 90405953:
                    i13 = i13;
                    if ((flags & 1) != 0) {
                        iM2566 = C2105.m6981("֡᩻") ^ i9;
                        i = ((iM2566 ^ i10) * (-16847)) ^ (-527411451);
                        i2 = -216863831;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩶") ^ i10;
                        i = ((iM2566 ^ i9) * (-25007)) ^ 618573659;
                        i2 = 213789598;
                    }
                    int i1110 = i13;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    i8 = i1110;
                    break;
                case -394890945:
                case 1713925639:
                    i13 = i13;
                    C3537.m10746();
                    if (C0798.m2998() == 0) {
                        iM2566 = C2105.m6981("ܶۤ") ^ i9;
                        i = ((iM2566 ^ i10) * (-29973)) ^ (-93051364);
                        i2 = -823242455;
                    } else {
                        iM2566 = (C0630.m2566("ۛۚ") ^ i9) * (-39);
                        i = ((iM2566 ^ i10) * (-26985)) ^ 1552530747;
                        i2 = -1302087366;
                    }
                    int i1111 = i13;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    i8 = i1111;
                    break;
                case -316932220:
                case 216944879:
                    i13 = i13;
                    super.onCreate(bundle);
                    iM2567 = C2105.m6981("᩻᩵") ^ i9;
                    i3 = ((iM2567 ^ i10) * 18983) ^ (-624845198);
                    i4 = 316896894;
                    int i1112 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i1112;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -260890404:
                case 525843213:
                    i13 = i13;
                    if (C2105.f7037 == 0) {
                        iM2567 = (i9 - C2105.m6981("ܺ۫")) * 27;
                        i3 = ((iM2567 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                        int i1113 = iM2567 ^ i4;
                        i8 = i13;
                        i12 = i1113;
                        i11 = i3;
                        activityC10094 = this;
                    } else {
                        iM2566 = (C0630.m2566("۫ܶ") ^ i10) * (-61);
                        i = ((iM2566 ^ i9) * 391) ^ (-226188255);
                        i2 = -979676733;
                        int i1114 = i13;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i1114;
                    }
                    break;
                case -253596756:
                case 1548238763:
                    i13 = i13;
                    s = sArr[c];
                    i5 = s * s;
                    if (C2126.f7087) {
                        iM2567 = C2105.m6981("ۘܽ") ^ i10;
                        i3 = ((iM2567 ^ i9) * 9805) ^ 308675150;
                        i4 = 1000650628;
                    } else {
                        iM2567 = (i9 - C2105.m6981("۫᩵")) * 119;
                        i3 = ((iM2567 ^ i10) * 15373) ^ 626942427;
                        i4 = 1772639926;
                    }
                    int i1115 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i1115;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case -152034243:
                case 1041266644:
                    i13 = i13;
                    if ((s * s2) - i6 <= 0) {
                        iM2567 = C2105.m6981("ۚ֨") ^ i10;
                        i3 = ((iM2567 ^ i9) * 3465) ^ (-1619374381);
                        i4 = -1006309049;
                    } else {
                        iM2567 = C0630.m2566("۫۠") ^ i9;
                        i3 = ((iM2567 ^ i10) * (-65)) ^ (-472536645);
                        i4 = 1301763557;
                    }
                    int i1116 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i1116;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 265414733:
                case 1916631065:
                    i13 = i13;
                    sArr = f30396;
                    if (C0714.f2697 >= 0) {
                        iM2567 = C2105.m6981("ۘܽ") ^ i10;
                        i3 = ((iM2567 ^ i9) * 9805) ^ 308675150;
                        i4 = 1000650628;
                    } else {
                        iM2567 = (i9 - C0630.m2566("᩸۠")) * 93;
                        i3 = ((iM2567 ^ i10) * 29669) ^ (-1128892888);
                        i4 = -1117613975;
                    }
                    int i1117 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i1117;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 288976296:
                case 2098392538:
                    i13 = i13;
                    try {
                        int i22 = C19568.f63245;
                        intent = new Intent(activityC10094, (Class<?>) ActivityC16315.class);
                        C1711.m5738(intent, 268435456);
                        C1711.m5738(intent, 67108864);
                        C2837.m8731(intent, uri);
                        intent.setAction(C11340.m28025(f30396, 1, 26, i7));
                        intent.setData(uri);
                        intent.putExtra(C7811.m20837(f30396, 27, 15, i7), true);
                        iM2567 = C2105.m6981("ۡۘ") ^ i9;
                        i3 = ((iM2567 ^ i10) * 5999) ^ (-1223507848);
                        i4 = -320110854;
                    } catch (Exception unused) {
                        intent = null;
                        iM2567 = (C2105.m6981("۫᩻") + i10) * 93;
                        i3 = ((iM2567 ^ i9) * (-27119)) ^ (-1793638709);
                        i4 = 880189097;
                    }
                    int i1118 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i1118;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 356314902:
                case 1558434186:
                    i13 = i13;
                    i6 = i5 + 312936100;
                    if (C3683.f11629 >= 0) {
                        iM2567 = (i10 - C2105.m6981("ۘۨ")) * (-47);
                        i3 = ((iM2567 ^ i9) * 19469) ^ (-191298515);
                        i4 = 1854079844;
                    } else {
                        iM2567 = (C2105.m6981("᩷᩹") ^ i10) * 55;
                        i3 = ((iM2567 ^ i9) * (-22877)) ^ (-1210848078);
                        i4 = -1245293303;
                    }
                    int i1119 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i1119;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 364224547:
                case 1933554702:
                    i13 = i13;
                    if (C4117.f13076 <= 0) {
                        iM2567 = (i9 - C2105.m6981("ܺ۫")) * 27;
                        i3 = ((iM2567 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM2567 = C0630.m2566("ۘܶ") ^ i10;
                        i3 = ((iM2567 ^ i9) * 21589) ^ 592526794;
                        i4 = -154004017;
                    }
                    int i11110 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i11110;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 455572810:
                case 762278758:
                    i7 = 41318;
                    iM2567 = C0630.m2566("ۧۤ") ^ i10;
                    i3 = ((iM2567 ^ i9) * (-12071)) ^ (-2043282401);
                    i4 = -741483983;
                    int i11111 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i11111;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 513733884:
                case 1584125249:
                    RunnableC0588.m2441();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (i9 - C0630.m2566("ܰۚ")) * 69;
                        i13 = i13;
                        i = ((iM2566 ^ i10) * (-685)) ^ (-190769112);
                        i2 = 173687965;
                        int i11112 = i13;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i11112;
                    } else {
                        i13 = i13;
                        iM2567 = (C2105.m6981("֡ܽ") ^ i10) * (-103);
                        i3 = ((iM2567 ^ i9) * 31371) ^ (-1689785004);
                        i4 = 1567469560;
                        int i11113 = iM2567 ^ i4;
                        i8 = i13;
                        i12 = i11113;
                        i11 = i3;
                        activityC10094 = this;
                    }
                    break;
                case 581644057:
                case 871929439:
                    i13 = i13;
                    try {
                        intent.setFlags(flags & (-4));
                        C21923.m49344(activityC10094, intent);
                    } catch (Exception unused2) {
                    }
                    iM2567 = (C2105.m6981("۫᩻") + i10) * 93;
                    i3 = ((iM2567 ^ i9) * (-27119)) ^ (-1793638709);
                    i4 = 880189097;
                    int i11114 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i11114;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 716422693:
                case 784091165:
                    uriM36522 = abstractC15440M39867.m36522();
                    uri = uriM36522;
                    iM2567 = C2105.m6981("۠۬") ^ i10;
                    i3 = ((iM2567 ^ i9) * 1421) ^ 1670434163;
                    i4 = -837097561;
                    int i11115 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i11115;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                case 933616684:
                case 1842275864:
                    i13 = i13;
                    flags = intent.getFlags();
                    iM2566 = C2105.m6981("۠۟") ^ i9;
                    i = ((iM2566 ^ i10) * 8791) ^ (-1769511189);
                    i2 = -723866636;
                    int i11116 = i13;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    i8 = i11116;
                    break;
                case 1369058370:
                case 1826802004:
                    i13 = i13;
                    C4159.m12565();
                    C0630.m2564();
                    iM2566 = (C0630.m2566("۫ܶ") ^ i10) * (-61);
                    i = ((iM2566 ^ i9) * 391) ^ (-226188255);
                    i2 = -979676733;
                    int i11117 = i13;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    i8 = i11117;
                    break;
                case 1709371871:
                case 2103685028:
                    i13 = i13;
                    C1773.m5908();
                    if (C2958.f9394 < 0) {
                        iM2567 = (i9 - C2105.m6981("ܺ۫")) * 27;
                        i3 = ((iM2567 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۘۨ")) * (-47);
                        i3 = ((iM2567 ^ i9) * 19469) ^ (-191298515);
                        i4 = 1854079844;
                    }
                    int i11118 = iM2567 ^ i4;
                    i8 = i13;
                    i12 = i11118;
                    i11 = i3;
                    activityC10094 = this;
                    break;
                default:
                    C0964.m3413();
                    C1916.m6308();
                    return;
            }
        }
    }
}
