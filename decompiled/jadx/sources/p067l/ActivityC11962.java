package p067l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A97T */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11962 extends ActivityC4388 {

    /* JADX INFO: renamed from: ۙܿۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f82121 = {4563, -24313, -24312, -24318, -24300, -24311, -24305, -24318, -24248, -24305, -24312, -24302, -24317, -24312, -24302, -24248, -24313, -24315, -24302, -24305, -24311, -24312, -24248, -24272, -24273, -24285, -24271, -24320, -24300, -24311, -24309, -24285, -24290, -24302, -24317, -24300, -24312, -24313, -24310, -24281, -24298, -24298};

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
    @Override // p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        Uri uriM38680;
        ActivityC11962 activityC11962 = this;
        boolean zM38665 = false;
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
        int i9 = C1017.f81942;
        int i10 = C0866.f81837;
        int iM55979 = (i10 - C0946.m55979("ᩴۛ")) * 39;
        int i11 = ((iM55979 ^ i9) * (-8033)) ^ 1489488493;
        int i12 = iM55979 ^ 943824146;
        Intent intent = null;
        AbstractC17043 abstractC17043M42110 = null;
        while (true) {
            int i13 = i12 ^ (i11 & (((i8 ^ i9) * 24753) >> 31));
            switch (i13) {
                case -2130129413:
                case 703699090:
                    i13 = i13;
                    if (C1404.f82149 >= 0) {
                        iM55681 = (C0873.m55680("ܰۗ") ^ i9) * 79;
                        i3 = ((iM55681 ^ i10) * (-18629)) ^ 544819421;
                        i4 = -1497250593;
                    } else {
                        iM55681 = C0873.m55680("ܽܰ") ^ i9;
                        i3 = ((iM55681 ^ i10) * (-11805)) ^ 203867790;
                        i4 = -524243411;
                    }
                    int i14 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i14;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1941572624:
                case 125340272:
                    uriM38680 = abstractC17043M42110.mo33652();
                    uri = uriM38680;
                    iM55681 = C0946.m55979("۠۬") ^ i10;
                    i3 = ((iM55681 ^ i9) * 1421) ^ 1670434163;
                    i4 = -837097561;
                    int i15 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i15;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1929892419:
                case -109888820:
                    i13 = i13;
                    if (C0894.m55769() >= 0) {
                        iM55681 = (i9 - C0946.m55979("ܺ۫")) * 27;
                        i3 = ((iM55681 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM55681 = (C0946.m55979("֡ܽ") ^ i10) * (-103);
                        i3 = ((iM55681 ^ i9) * 31371) ^ (-1689785004);
                        i4 = 1567469560;
                    }
                    int i16 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i16;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1904972040:
                case 609966318:
                    C0955.m56027(this);
                    return;
                case -1838255501:
                case 1716211974:
                    i13 = i13;
                    c = 0;
                    if (C0906.f81862 >= 0) {
                        iM55681 = (i9 - C0946.m55979("ܺ۫")) * 27;
                        i3 = ((iM55681 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۘ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM55681 ^ i9) * 18557) ^ (-514922079);
                        i4 = 522279167;
                    }
                    int i17 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i17;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1828989345:
                case -744647933:
                    i13 = i13;
                    throw securityException;
                case -1674672902:
                case 892902565:
                    i7 = 18267;
                    iM55681 = C0873.m55680("ۧۤ") ^ i10;
                    i3 = ((iM55681 ^ i9) * (-12071)) ^ (-2043282401);
                    i4 = -741483983;
                    int i18 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i18;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1537244383:
                case -544745438:
                    i13 = i13;
                    C0890.m55740();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("۫ܶ") ^ i10) * (-61);
                        i = ((iM55680 ^ i9) * 391) ^ (-226188255);
                        i2 = -979676733;
                    } else {
                        iM55680 = C0946.m55979("ܶۤ") ^ i9;
                        i = ((iM55680 ^ i10) * (-29973)) ^ (-93051364);
                        i2 = -823242455;
                    }
                    int i19 = i13;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    i8 = i19;
                    break;
                case -1522247024:
                case -460899614:
                    C1046.m56302();
                    if (C0906.m55809() > 0) {
                        i13 = i13;
                        iM55681 = (C0873.m55680("ܰۗ") ^ i9) * 79;
                        i3 = ((iM55681 ^ i10) * (-18629)) ^ 544819421;
                        i4 = -1497250593;
                        int i110 = iM55681 ^ i4;
                        i8 = i13;
                        i12 = i110;
                        i11 = i3;
                        activityC11962 = this;
                    }
                    i13 = i13;
                    iM55681 = (C0946.m55979("֡ܽ") ^ i10) * (-103);
                    i3 = ((iM55681 ^ i9) * 31371) ^ (-1689785004);
                    i4 = 1567469560;
                    int i111 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i111;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1377104316:
                case 299479032:
                    i13 = i13;
                    if (C0930.f81879 <= 0) {
                        iM55681 = (i10 - C0946.m55979("ۘۨ")) * (-47);
                        i3 = ((iM55681 ^ i9) * 19469) ^ (-191298515);
                        i4 = 1854079844;
                    } else {
                        iM55681 = C0873.m55680("ۨ᩺") ^ i10;
                        i3 = ((iM55681 ^ i9) * (-20413)) ^ 16439045;
                        i4 = -789426468;
                    }
                    int i112 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i112;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1224421068:
                case 830031348:
                    i13 = i13;
                    if (C0949.f81897 >= 0) {
                        iM55681 = (C0946.m55979("֡ܽ") ^ i10) * (-103);
                        i3 = ((iM55681 ^ i9) * 31371) ^ (-1689785004);
                        i4 = 1567469560;
                    } else {
                        iM55681 = C0873.m55680("ۙۜ") ^ i10;
                        i3 = ((iM55681 ^ i9) * (-17665)) ^ (-256815830);
                        i4 = -822467880;
                    }
                    int i113 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i113;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -1118643683:
                case 1028828839:
                    i13 = i13;
                    try {
                        C1929.m56568(activityC11962, intent);
                        iM55681 = (C0946.m55979("۫᩻") + i10) * 93;
                        i3 = ((iM55681 ^ i9) * (-27119)) ^ (-1793638709);
                        i4 = 880189097;
                        int i114 = iM55681 ^ i4;
                        i8 = i13;
                        i12 = i114;
                        i11 = i3;
                        activityC11962 = this;
                    } catch (SecurityException e) {
                        int iM55682 = (C0873.m55680("ۧ᩵") + i10) * (-59);
                        int i20 = ((iM55682 ^ i9) * 19745) ^ (-325451605);
                        int i21 = iM55682 ^ (-9624083);
                        securityException = e;
                        i11 = i20;
                        i8 = i13;
                        i12 = i21;
                    }
                    break;
                case -1093434633:
                case 572802894:
                    i13 = i13;
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("۫ܶ") ^ i10) * (-61);
                        i = ((iM55680 ^ i9) * 391) ^ (-226188255);
                        i2 = -979676733;
                    } else {
                        iM55680 = C0873.m55680("ܺܳ") ^ i10;
                        i = ((iM55680 ^ i9) * 1425) ^ 813705075;
                        i2 = 2071736859;
                    }
                    int i115 = i13;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    i8 = i115;
                    break;
                case -1017563794:
                case 1626413305:
                    i13 = i13;
                    abstractC17043M42110 = C18524.m42110(this);
                    zM38665 = abstractC17043M42110.m38665();
                    iM55681 = (i9 - C0946.m55979("ۨۗ")) * 91;
                    i3 = ((iM55681 ^ i10) * 14415) ^ (-1490770315);
                    i4 = 1077453026;
                    int i116 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i116;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -978994090:
                case 1969180041:
                    i13 = i13;
                    if (C0873.m55678()) {
                        iM55681 = C0946.m55979("ۘܽ") ^ i10;
                        i3 = ((iM55681 ^ i9) * 9805) ^ 308675150;
                        i4 = 1000650628;
                    } else {
                        iM55681 = C0873.m55680("ۛ֡") ^ i9;
                        i3 = ((iM55681 ^ i10) * (-9539)) ^ (-1081457698);
                        i4 = -1005816241;
                    }
                    int i117 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i117;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -868190789:
                case -694293752:
                    i13 = i13;
                    if (zM38665) {
                        iM55681 = C0946.m55979("᩶۬") ^ i9;
                        i3 = ((iM55681 ^ i10) * 16275) ^ (-1439939219);
                        i4 = 1577043084;
                    } else {
                        iM55681 = (C0946.m55979("᩵᩺") + i10) * (-117);
                        i3 = ((iM55681 ^ i9) * 20735) ^ 14198966;
                        i4 = 702873885;
                    }
                    int i118 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i118;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -758661733:
                case 1512246622:
                    i13 = i13;
                    s2 = 35380;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55681 = (C0873.m55680("ܰۗ") ^ i9) * 79;
                        i3 = ((iM55681 ^ i10) * (-18629)) ^ 544819421;
                        i4 = -1497250593;
                    } else {
                        iM55681 = C0873.m55680("ۤۖ") ^ i9;
                        i3 = ((iM55681 ^ i10) * (-27593)) ^ 980525380;
                        i4 = -274094100;
                    }
                    int i119 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i119;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -396862864:
                case 90405953:
                    i13 = i13;
                    if ((flags & 1) != 0) {
                        iM55680 = C0946.m55979("֡᩻") ^ i9;
                        i = ((iM55680 ^ i10) * (-16847)) ^ (-527411451);
                        i2 = -216863831;
                    } else {
                        iM55680 = C0873.m55680("ۘ᩶") ^ i10;
                        i = ((iM55680 ^ i9) * (-25007)) ^ 618573659;
                        i2 = 213789598;
                    }
                    int i1110 = i13;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    i8 = i1110;
                    break;
                case -394890945:
                case 1713925639:
                    i13 = i13;
                    C1017.m56187();
                    if (C0882.m55710() == 0) {
                        iM55680 = C0946.m55979("ܶۤ") ^ i9;
                        i = ((iM55680 ^ i10) * (-29973)) ^ (-93051364);
                        i2 = -823242455;
                    } else {
                        iM55680 = (C0873.m55680("ۛۚ") ^ i9) * (-39);
                        i = ((iM55680 ^ i10) * (-26985)) ^ 1552530747;
                        i2 = -1302087366;
                    }
                    int i1111 = i13;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    i8 = i1111;
                    break;
                case -316932220:
                case 216944879:
                    i13 = i13;
                    super.onCreate(bundle);
                    iM55681 = C0946.m55979("᩻᩵") ^ i9;
                    i3 = ((iM55681 ^ i10) * 18983) ^ (-624845198);
                    i4 = 316896894;
                    int i1112 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i1112;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -260890404:
                case 525843213:
                    i13 = i13;
                    if (C0946.f81894 == 0) {
                        iM55681 = (i9 - C0946.m55979("ܺ۫")) * 27;
                        i3 = ((iM55681 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                        int i1113 = iM55681 ^ i4;
                        i8 = i13;
                        i12 = i1113;
                        i11 = i3;
                        activityC11962 = this;
                    } else {
                        iM55680 = (C0873.m55680("۫ܶ") ^ i10) * (-61);
                        i = ((iM55680 ^ i9) * 391) ^ (-226188255);
                        i2 = -979676733;
                        int i1114 = i13;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i1114;
                    }
                    break;
                case -253596756:
                case 1548238763:
                    i13 = i13;
                    s = sArr[c];
                    i5 = s * s;
                    if (C0947.f81895) {
                        iM55681 = C0946.m55979("ۘܽ") ^ i10;
                        i3 = ((iM55681 ^ i9) * 9805) ^ 308675150;
                        i4 = 1000650628;
                    } else {
                        iM55681 = (i9 - C0946.m55979("۫᩵")) * 119;
                        i3 = ((iM55681 ^ i10) * 15373) ^ 626942427;
                        i4 = 1772639926;
                    }
                    int i1115 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i1115;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case -152034243:
                case 1041266644:
                    i13 = i13;
                    if ((s * s2) - i6 <= 0) {
                        iM55681 = C0946.m55979("ۚ֨") ^ i10;
                        i3 = ((iM55681 ^ i9) * 3465) ^ (-1619374381);
                        i4 = -1006309049;
                    } else {
                        iM55681 = C0873.m55680("۫۠") ^ i9;
                        i3 = ((iM55681 ^ i10) * (-65)) ^ (-472536645);
                        i4 = 1301763557;
                    }
                    int i1116 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i1116;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 265414733:
                case 1916631065:
                    i13 = i13;
                    sArr = f82121;
                    if (C0877.f81843 >= 0) {
                        iM55681 = C0946.m55979("ۘܽ") ^ i10;
                        i3 = ((iM55681 ^ i9) * 9805) ^ 308675150;
                        i4 = 1000650628;
                    } else {
                        iM55681 = (i9 - C0873.m55680("᩸۠")) * 93;
                        i3 = ((iM55681 ^ i10) * 29669) ^ (-1128892888);
                        i4 = -1117613975;
                    }
                    int i1117 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i1117;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 288976296:
                case 2098392538:
                    i13 = i13;
                    try {
                        int i22 = C20966.f65864;
                        intent = new Intent(activityC11962, (Class<?>) ActivityC17874.class);
                        C0927.m55875(intent, 268435456);
                        C0927.m55875(intent, 67108864);
                        C5065.m10798(intent, uri);
                        intent.setAction(C1404.m56462(f82121, 1, 26, i7));
                        intent.setData(uri);
                        intent.putExtra(C1229.m56403(f82121, 27, 15, i7), true);
                        iM55681 = C0946.m55979("ۡۘ") ^ i9;
                        i3 = ((iM55681 ^ i10) * 5999) ^ (-1223507848);
                        i4 = -320110854;
                    } catch (Exception unused) {
                        intent = null;
                        iM55681 = (C0946.m55979("۫᩻") + i10) * 93;
                        i3 = ((iM55681 ^ i9) * (-27119)) ^ (-1793638709);
                        i4 = 880189097;
                    }
                    int i1118 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i1118;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 356314902:
                case 1558434186:
                    i13 = i13;
                    i6 = i5 + 312936100;
                    if (C1025.f81947 >= 0) {
                        iM55681 = (i10 - C0946.m55979("ۘۨ")) * (-47);
                        i3 = ((iM55681 ^ i9) * 19469) ^ (-191298515);
                        i4 = 1854079844;
                    } else {
                        iM55681 = (C0946.m55979("᩷᩹") ^ i10) * 55;
                        i3 = ((iM55681 ^ i9) * (-22877)) ^ (-1210848078);
                        i4 = -1245293303;
                    }
                    int i1119 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i1119;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 364224547:
                case 1933554702:
                    i13 = i13;
                    if (C1046.f81962 <= 0) {
                        iM55681 = (i9 - C0946.m55979("ܺ۫")) * 27;
                        i3 = ((iM55681 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM55681 = C0873.m55680("ۘܶ") ^ i10;
                        i3 = ((iM55681 ^ i9) * 21589) ^ 592526794;
                        i4 = -154004017;
                    }
                    int i11110 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i11110;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 455572810:
                case 762278758:
                    i7 = 41318;
                    iM55681 = C0873.m55680("ۧۤ") ^ i10;
                    i3 = ((iM55681 ^ i9) * (-12071)) ^ (-2043282401);
                    i4 = -741483983;
                    int i11111 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i11111;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 513733884:
                case 1584125249:
                    RunnableC0871.m55672();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i9 - C0873.m55680("ܰۚ")) * 69;
                        i13 = i13;
                        i = ((iM55680 ^ i10) * (-685)) ^ (-190769112);
                        i2 = 173687965;
                        int i11112 = i13;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i11112;
                    } else {
                        i13 = i13;
                        iM55681 = (C0946.m55979("֡ܽ") ^ i10) * (-103);
                        i3 = ((iM55681 ^ i9) * 31371) ^ (-1689785004);
                        i4 = 1567469560;
                        int i11113 = iM55681 ^ i4;
                        i8 = i13;
                        i12 = i11113;
                        i11 = i3;
                        activityC11962 = this;
                    }
                    break;
                case 581644057:
                case 871929439:
                    i13 = i13;
                    try {
                        intent.setFlags(flags & (-4));
                        C1929.m56568(activityC11962, intent);
                    } catch (Exception unused2) {
                    }
                    iM55681 = (C0946.m55979("۫᩻") + i10) * 93;
                    i3 = ((iM55681 ^ i9) * (-27119)) ^ (-1793638709);
                    i4 = 880189097;
                    int i11114 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i11114;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 716422693:
                case 784091165:
                    uriM38680 = abstractC17043M42110.m38680();
                    uri = uriM38680;
                    iM55681 = C0946.m55979("۠۬") ^ i10;
                    i3 = ((iM55681 ^ i9) * 1421) ^ 1670434163;
                    i4 = -837097561;
                    int i11115 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i11115;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                case 933616684:
                case 1842275864:
                    i13 = i13;
                    flags = intent.getFlags();
                    iM55680 = C0946.m55979("۠۟") ^ i9;
                    i = ((iM55680 ^ i10) * 8791) ^ (-1769511189);
                    i2 = -723866636;
                    int i11116 = i13;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    i8 = i11116;
                    break;
                case 1369058370:
                case 1826802004:
                    i13 = i13;
                    C1048.m56305();
                    C0873.m55678();
                    iM55680 = (C0873.m55680("۫ܶ") ^ i10) * (-61);
                    i = ((iM55680 ^ i9) * 391) ^ (-226188255);
                    i2 = -979676733;
                    int i11117 = i13;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    i8 = i11117;
                    break;
                case 1709371871:
                case 2103685028:
                    i13 = i13;
                    C0930.m55885();
                    if (C0989.f81920 < 0) {
                        iM55681 = (i9 - C0946.m55979("ܺ۫")) * 27;
                        i3 = ((iM55681 ^ i10) * (-28117)) ^ 47077174;
                        i4 = 1341250593;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۘۨ")) * (-47);
                        i3 = ((iM55681 ^ i9) * 19469) ^ (-191298515);
                        i4 = 1854079844;
                    }
                    int i11118 = iM55681 ^ i4;
                    i8 = i13;
                    i12 = i11118;
                    i11 = i3;
                    activityC11962 = this;
                    break;
                default:
                    C0890.m55740();
                    C0937.m55918();
                    return;
            }
        }
    }
}
