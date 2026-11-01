package p067l;

import android.content.Intent;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 42S7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4743 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۤۙۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f81908 = {1463, 32579, 32607, 32582, 32596, 32602, 32605, 32634, 32599, 32606, 32604, 32599, 32598, 32581, 32598, 32577, 32576, 32602, 32604, 32605, 32637, 32594, 32606, 32598, 32609, 32598, 32579, 32607, 32594, 32592, 32598, 32606, 32598, 32605, 32583, 32582, 32579, 32599, 32594, 32583, 32598, 32624, 32604, 32605, 32583, 32598, 32605, 32583, 733, 29076, 29131, 29143, 29134, 29148, 29138, 29141, 29076, 29151, 29150, 29133, 29076, 29144, 29139, 29150, 29144, 29136, 29076, 29134, 29131, 29151, 29146, 29135, 29150, 29065, 29134, 29131, 29151, 29146, 29135, 29150, 29176, 29140, 29141, 29135, 29150, 29141, 29135, 29131, 29143, 29134, 29148, 29138, 29141, 29170, 29151, 29131, 29146, 29144, 29136, 29146, 29148, 29150, 29160, 29138, 29121, 29150, 29133, 29150, 29129, 29128, 29138, 29140, 29141, 29176, 29140, 29151, 29150};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C18249 f10745;

    /* JADX INFO: renamed from: ܳ */
    public JSONObject f10746;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f10747;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f10748;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (p067l.C1017.f81942 >= 0) goto L7;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3402() {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        short s;
        int i4;
        int iM559711;
        C4743 c4743 = this;
        int i5 = C1229.f82066;
        int i6 = ViewOnClickListenerC0939.f81888;
        int iM55680 = C0873.m55680("ۘܳ") ^ i5;
        int i7 = ((iM55680 ^ i6) * 13763) ^ (-673220194);
        String strM55635 = null;
        JSONObject jSONObject = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM55680 ^ 711320980;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -949149904;
        int i14 = 0;
        String strM56558 = null;
        String strM56293 = null;
        int i15 = 0;
        String strM55658 = null;
        AbstractActivityC5549 abstractActivityC5549 = null;
        Intent intent = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * (-16539)) >> 31));
            switch (i13) {
                case -1684669560:
                case -1449445417:
                    i9 = i9;
                    s2 = f81908[0];
                    if (C1929.f83011 != 0) {
                        iM559711 = (C0946.m55979("ۘ۟") ^ i6) * 67;
                        i7 = ((iM559711 ^ i5) * (-10779)) ^ (-1042552746);
                        i4 = 1433482541;
                    } else {
                        iM559711 = (i6 - C0946.m55979("᩹ᩳ")) * (-57);
                        i7 = ((iM559711 ^ i5) * (-27157)) ^ (-1546224694);
                        i4 = -1661181900;
                    }
                    i9 = i9;
                    i8 = iM559711 ^ i4;
                    c4743 = this;
                    break;
                case -1568377498:
                case -1407572633:
                    i9 = i9;
                    abstractActivityC5549 = c4743.f10748;
                    intent = new Intent(abstractActivityC5549, (Class<?>) ViewOnClickListenerC2730.class);
                    if (C1046.f81962 > 0) {
                        iM55979 = (C0946.m55979("ܶ᩹") ^ i5) * (-77);
                        i = ((iM55979 ^ i6) * (-23045)) ^ 1160225209;
                        i2 = 689077119;
                        int i16 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i16;
                        i7 = i;
                    } else {
                        iM559711 = (C0946.m55979("ۘ۟") ^ i6) * 67;
                        i7 = ((iM559711 ^ i5) * (-10779)) ^ (-1042552746);
                        i4 = 1433482541;
                        i9 = i9;
                        i8 = iM559711 ^ i4;
                        c4743 = this;
                    }
                    break;
                case -1383712359:
                case 680910382:
                    C1044.m56284(abstractActivityC5549, intent);
                    break;
                case -1241629980:
                case 301538980:
                    i9 = i9;
                    C0917.m55843(intent, strM56558, strM55658);
                    sArr2 = f81908;
                    if (C0894.f81854 < 0) {
                        iM55979 = C0873.m55680("ۧ֡") ^ i6;
                        i = ((iM55979 ^ i5) * (-31115)) ^ 965785145;
                        i2 = 155203268;
                        int i17 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i17;
                        i7 = i;
                    }
                    i9 = i9;
                    iM559710 = (C0873.m55680("᩶ۡ") ^ i5) * (-69);
                    i = ((iM559710 ^ i6) * 22411) ^ (-710828383);
                    i3 = 1197942997;
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -1176003726:
                case 1230836969:
                    i9 = i9;
                    intent.putExtra(strM55635, i15);
                    sArr3 = f81908;
                    if (C1012.f81938 < 0) {
                        iM55979 = (C0873.m55680("ۖ֨") + i6) * (-45);
                        i = ((iM55979 ^ i5) * 26611) ^ (-415146929);
                        i2 = 1298572970;
                        int i18 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i18;
                        i7 = i;
                    } else {
                        iM559711 = (C0946.m55979("ۘ۟") ^ i6) * 67;
                        i7 = ((iM559711 ^ i5) * (-10779)) ^ (-1042552746);
                        i4 = 1433482541;
                        i9 = i9;
                        i8 = iM559711 ^ i4;
                        c4743 = this;
                    }
                    break;
                case -1156795714:
                case 1691474821:
                    i9 = i9;
                    int i19 = i14 + i9;
                    if (i12 - (i19 + i19) > 0) {
                        iM55979 = (i5 - C0873.m55680("᩹ܶ")) * 51;
                        i = ((iM55979 ^ i6) * (-18855)) ^ (-154940514);
                        i2 = 763597573;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩷") ^ i5) * (-45);
                        i = ((iM55979 ^ i6) * (-5895)) ^ 1663485433;
                        i2 = -237802462;
                    }
                    int i110 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i110;
                    i7 = i;
                    break;
                case -1091018487:
                case -1029043597:
                    i9 = i9;
                    C1024.m56213(intent, C1404.m56462(f81908, 35, 13, i10), C0845.m55591(jSONObject));
                    iM55979 = (C0946.m55979("۟ۖ") + i5) * 127;
                    i = ((iM55979 ^ i6) * 12251) ^ 976200576;
                    i2 = 1850422220;
                    int i111 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i111;
                    i7 = i;
                    break;
                case -1054933174:
                case 2029208833:
                    i9 = i9;
                    strM56293 = C1046.m56293(sArr3, 13, 22, i10);
                    if (!C0947.f81895) {
                        iM55979 = (C0946.m55979("ܿ۠") ^ i6) * (-27);
                        i = ((iM55979 ^ i5) * (-13513)) ^ 1898308645;
                        i2 = 1331537550;
                        int i112 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i112;
                        i7 = i;
                    }
                    i9 = i9;
                    iM559710 = (C0873.m55680("᩶ۡ") ^ i5) * (-69);
                    i = ((iM559710 ^ i6) * 22411) ^ (-710828383);
                    i3 = 1197942997;
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -992523336:
                case 1346075837:
                    break;
                case -972891751:
                case -703974930:
                    C0863.m55643();
                    i9 = i9;
                    iM55979 = C0946.m55979("۠᩷") ^ i6;
                    i = ((iM55979 ^ i5) * 6919) ^ 400630935;
                    i2 = 817406089;
                    int i113 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i113;
                    i7 = i;
                    break;
                case -964991743:
                case 1314604081:
                    if (C1003.f81929 > 0) {
                        i9 = i9;
                        s = s2;
                        int iM559712 = (i6 - C0946.m55979("ۧۨ")) * 71;
                        s2 = s;
                        i7 = ((iM559712 ^ i5) * (-10017)) ^ (-251078471);
                        i9 = i9;
                        i8 = iM559712 ^ 87616304;
                    } else {
                        iM559710 = C0873.m55680("᩷ۘ") ^ i5;
                        i = ((iM559710 ^ i6) * (-15601)) ^ (-1044417624);
                        i3 = 1744424936;
                        i8 = iM559710 ^ i3;
                        i7 = i;
                    }
                    break;
                case -948865764:
                case -391423535:
                    i12 = i11 * i11;
                    i14 = s2 * s2;
                    i9 = 64368529;
                    if (C0917.m55854()) {
                        iM559710 = (i6 - C0946.m55979("۫֨")) * 27;
                        i = ((iM559710 ^ i5) * (-7355)) ^ (-1984348122);
                        i3 = -1149583045;
                    } else {
                        iM559710 = (C0873.m55680("᩶ۡ") ^ i5) * (-69);
                        i = ((iM559710 ^ i6) * 22411) ^ (-710828383);
                        i3 = 1197942997;
                    }
                    i8 = iM559710 ^ i3;
                    i7 = i;
                    break;
                case -741646140:
                case 1607594779:
                    i10 = 19451;
                    iM55979 = C0873.m55680("ܰ᩶") ^ i6;
                    i = ((iM55979 ^ i5) * (-25549)) ^ 791440067;
                    i2 = -130451434;
                    int i114 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i114;
                    i7 = i;
                    break;
                case -667849537:
                case 934866225:
                    i9 = i9;
                    s = s2;
                    int i20 = s + 8023;
                    if (C0890.f81849 != 0) {
                        i11 = i20;
                        int iM559713 = (i6 - C0946.m55979("ۧۨ")) * 71;
                        s2 = s;
                        i7 = ((iM559713 ^ i5) * (-10017)) ^ (-251078471);
                        i9 = i9;
                        i8 = iM559713 ^ 87616304;
                    } else {
                        int iM559714 = C0946.m55979("ۛۗ") ^ i5;
                        s2 = s;
                        i11 = i20;
                        i7 = ((iM559714 ^ i6) * 9313) ^ (-188901791);
                        c4743 = this;
                        i8 = iM559714 ^ 1499154378;
                        i9 = i9;
                    }
                    break;
                case -341734673:
                case 1687939881:
                    C1046.m56302();
                    C1003.m56123();
                    break;
                case 113266707:
                case 1403945971:
                    i9 = i9;
                    strM55658 = C0866.m55658(c4743.f10745);
                    sArr = f81908;
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("ۖܶ") ^ i6;
                        i = ((iM55979 ^ i5) * (-3419)) ^ (-1309588152);
                        i2 = 1240198031;
                        int i115 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i115;
                        i7 = i;
                    } else {
                        iM559711 = (C0946.m55979("ۘ۟") ^ i6) * 67;
                        i7 = ((iM559711 ^ i5) * (-10779)) ^ (-1042552746);
                        i4 = 1433482541;
                        i9 = i9;
                        i8 = iM559711 ^ i4;
                        c4743 = this;
                    }
                    break;
                case 499684504:
                case 561996864:
                    i9 = i9;
                    strM56558 = C1929.m56558(sArr, 1, 8, i10);
                    if (C0967.f81910 < 0) {
                        iM55979 = (i5 - C0873.m55680("۠֡")) * (-7);
                        i = ((iM55979 ^ i6) * 30241) ^ 1039470785;
                        i2 = -1752257358;
                        int i116 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i116;
                        i7 = i;
                    } else {
                        s = s2;
                        int iM559715 = (i6 - C0946.m55979("ۧۨ")) * 71;
                        s2 = s;
                        i7 = ((iM559715 ^ i5) * (-10017)) ^ (-251078471);
                        i9 = i9;
                        i8 = iM559715 ^ 87616304;
                    }
                    break;
                case 1178802082:
                case 1566787945:
                    i9 = i9;
                    strM55635 = C0863.m55635(sArr2, 9, 4, i10);
                    i15 = 1;
                    if (C1003.m56123() != 0) {
                        iM55979 = C0946.m55979("۠᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 6919) ^ 400630935;
                        i2 = 817406089;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩸") ^ i5;
                        i = ((iM55979 ^ i6) * (-1495)) ^ 691626309;
                        i2 = 135770347;
                    }
                    int i117 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i117;
                    i7 = i;
                    break;
                case 1226516266:
                case 2033200788:
                    i10 = 32563;
                    iM55979 = C0873.m55680("ܰ᩶") ^ i6;
                    i = ((iM55979 ^ i5) * (-25549)) ^ 791440067;
                    i2 = -130451434;
                    int i118 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i118;
                    i7 = i;
                    break;
                case 1864006976:
                case 2067442442:
                    i9 = i9;
                    C1024.m56213(intent, strM56293, c4743.f10747);
                    jSONObject = c4743.f10746;
                    if (jSONObject != null) {
                        iM55979 = (i5 - C0873.m55680("ܰᩴ")) * (-41);
                        i = ((iM55979 ^ i6) * (-27871)) ^ 529942664;
                        i2 = 1110596086;
                    } else {
                        iM55979 = (C0946.m55979("۟ۖ") + i5) * 127;
                        i = ((iM55979 ^ i6) * 12251) ^ 976200576;
                        i2 = 1850422220;
                    }
                    int i119 = iM55979 ^ i2;
                    i9 = i9;
                    i8 = i119;
                    i7 = i;
                    break;
                default:
                    if (C1194.m56396() > 0) {
                        i9 = i9;
                        iM559711 = (C0946.m55979("ۘ۟") ^ i6) * 67;
                        i7 = ((iM559711 ^ i5) * (-10779)) ^ (-1042552746);
                        i4 = 1433482541;
                        i9 = i9;
                        i8 = iM559711 ^ i4;
                        c4743 = this;
                    } else {
                        i9 = i9;
                        iM55979 = C0946.m55979("۠᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 6919) ^ 400630935;
                        i2 = 817406089;
                        int i1110 = iM55979 ^ i2;
                        i9 = i9;
                        i8 = i1110;
                        i7 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x049c A[PHI: r4 r7 r8 r15 r18 r20 r21 r22
      0x049c: PHI (r4v9 short[]) = (r4v4 short[]), (r4v10 short[]) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r7v2 short) = (r7v1 short), (r7v3 short) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r8v2 short) = (r8v1 short), (r8v3 short) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r15v19 int) = (r15v14 int), (r15v20 int) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r18v16 int) = (r18v11 int), (r18v17 int) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r20v13 l.ܳ᩻᩷) = (r20v8 l.ܳ᩻᩷), (r20v14 l.ܳ᩻᩷) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r21v7 org.json.JSONObject) = (r21v2 org.json.JSONObject), (r21v8 org.json.JSONObject) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x049c: PHI (r22v7 java.lang.String) = (r22v2 java.lang.String), (r22v8 java.lang.String) binds: [B:108:0x049a, B:91:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x04d6 A[PHI: r4 r5 r9 r10 r11 r15 r18 r20 r21 r22
      0x04d6: PHI (r4v24 short[]) = (r4v3 short[]), (r4v11 short[]), (r4v12 short[]), (r4v25 short[]) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r15v34 int) = (r15v13 int), (r15v21 int), (r15v22 int), (r15v35 int) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r18v27 int) = (r18v10 int), (r18v18 int), (r18v19 int), (r18v28 int) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r20v26 l.ܳ᩻᩷) = (r20v7 l.ܳ᩻᩷), (r20v15 l.ܳ᩻᩷), (r20v16 l.ܳ᩻᩷), (r20v27 l.ܳ᩻᩷) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r21v20 org.json.JSONObject) = (r21v1 org.json.JSONObject), (r21v9 org.json.JSONObject), (r21v10 org.json.JSONObject), (r21v21 org.json.JSONObject) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r22v19 java.lang.String) = (r22v1 java.lang.String), (r22v9 java.lang.String), (r22v10 java.lang.String), (r22v20 java.lang.String) binds: [B:112:0x04d4, B:87:0x038f, B:83:0x0364, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0190 A[PHI: r14 r18
      0x0190: PHI (r14v9 int) = (r14v8 int), (r14v1 int) binds: [B:48:0x018e, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r18v47 int) = (r18v42 int), (r18v48 int) binds: [B:48:0x018e, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        if (p067l.ViewOnClickListenerC0939.f81888 > 0) goto L14;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3405() throws C3924 {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int i5;
        C16496 c16496M43674 = null;
        JSONObject jSONObjectM37420 = null;
        String strM56336 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = -1939848266;
        int i12 = C1025.f81947;
        int i13 = ViewOnClickListenerC0939.f81888;
        int iM559711 = C0946.m55979("ܶۨ") ^ i13;
        int i14 = ((iM559711 ^ i12) * (-20983)) ^ (-1762632461);
        int i15 = iM559711 ^ 1031180900;
        C18249 c18249 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i12) * 20167) >> 31));
            switch (i16) {
                case -1965268233:
                case 193777524:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    if (C0967.f81910 >= 0) {
                        iM559710 = C0946.m55979("ܳܿ") ^ i12;
                        i3 = ((iM559710 ^ i13) * (-6597)) ^ 1369160984;
                        i4 = 1664531226;
                    } else {
                        iM559710 = (C0946.m55979("ܰܿ") + i13) * (-103);
                        i3 = ((iM559710 ^ i12) * 23185) ^ (-1196345964);
                        i4 = 894203731;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case -1808161955:
                case -663971580:
                    i16 = i16;
                    C0877.m55696();
                    break;
                case -1767637135:
                case -1749967717:
                    i16 = i16;
                    C1124.m56367();
                    if (C1194.f82045 == 0) {
                        iM55979 = (C0946.m55979("۫ۧ") ^ i12) * C0254q.f1218h;
                        i = ((iM55979 ^ i13) * (-309)) ^ 808802772;
                        i2 = -19648715;
                    } else {
                        iM55979 = (C0946.m55979("۬ܿ") ^ i13) * (-75);
                        i = ((iM55979 ^ i12) * (-26781)) ^ (-840311306);
                        i2 = -389804696;
                    }
                    int i17 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i17;
                    break;
                case -1711691624:
                case 146720260:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    i6 = s * s2;
                    i7 = s * s;
                    if (C1929.f83011 != 0) {
                        iM559710 = (C0946.m55979("֨۠") ^ i13) * (-57);
                        i3 = ((iM559710 ^ i12) * 6331) ^ (-2120666030);
                        i4 = 946619546;
                    } else {
                        iM559710 = C0946.m55979("֫ܿ") ^ i12;
                        i3 = ((iM559710 ^ i13) * (-7687)) ^ 49625320;
                        i4 = 1565606558;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case -1691538088:
                case 2014134738:
                    i16 = i16;
                    ViewOnClickListenerC0939.m55941();
                    C0930.m55885();
                    c16496M43674 = c16496M43674;
                    strM56336 = strM56336;
                    i10 = i10;
                    int iM559712 = C0946.m55979("ۨۨ") ^ i13;
                    i3 = ((iM559712 ^ i12) * 19307) ^ 1017847940;
                    i5 = iM559712 ^ 1081535710;
                    i10 = i10;
                    i11 = i16;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case -1684520675:
                case 1933792454:
                    i16 = i16;
                    if (c16496M43674.m37422()) {
                        iM55979 = C0946.m55979("ۖۙ") ^ i13;
                        i = ((iM55979 ^ i12) * 19079) ^ (-276609403);
                        i2 = 820784737;
                    } else {
                        iM55979 = (C0946.m55979("᩶֫") ^ i12) * 13;
                        i = ((iM55979 ^ i13) * 4297) ^ 864514286;
                        i2 = 1864572813;
                    }
                    int i18 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i18;
                    break;
                case -1570826596:
                case 98797237:
                    throw new C3924(c16496M43674.m37418());
                case -1568371756:
                case 1846361331:
                    i16 = i16;
                    this.f10746 = jSONObjectM37420.getJSONObject(strM56336);
                    iM55979 = (i13 - C0873.m55680("ۢ᩶")) * 59;
                    i = ((iM55979 ^ i12) * (-20351)) ^ 1511295242;
                    i2 = 1242249615;
                    int i19 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i19;
                    break;
                case -1445579385:
                case -509749039:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    i8 = 79477225;
                    if (C1194.f82045 != 0) {
                        iM559710 = (C0946.m55979("֨۠") ^ i13) * (-57);
                        i3 = ((iM559710 ^ i12) * 6331) ^ (-2120666030);
                        i4 = 946619546;
                    } else {
                        iM559710 = (i13 - C0946.m55979("ۢۢ")) * (-93);
                        i3 = ((iM559710 ^ i12) * (-31007)) ^ (-276528387);
                        i4 = 617163422;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case -1319155876:
                case 1075349825:
                    i16 = i16;
                    C0892.m55749();
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("۫ۧ") ^ i12) * C0254q.f1218h;
                        i = ((iM55979 ^ i13) * (-309)) ^ 808802772;
                        i2 = -19648715;
                        int i110 = i16;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                        i11 = i110;
                    } else {
                        c16496M43674 = c16496M43674;
                        strM56336 = strM56336;
                        i10 = i10;
                        int iM559713 = C0946.m55979("ۨۨ") ^ i13;
                        i3 = ((iM559713 ^ i12) * 19307) ^ 1017847940;
                        i5 = iM559713 ^ 1081535710;
                        i10 = i10;
                        i11 = i16;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    }
                    break;
                case -1276906926:
                case -1160403070:
                    i16 = i16;
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("ۘᩳ") + i12) * 87;
                        i = ((iM55979 ^ i13) * 2639) ^ 33905400;
                        i2 = -1907729051;
                        int i111 = i16;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                        i11 = i111;
                    } else {
                        c16496M43674 = c16496M43674;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        sArr2 = sArr2;
                        i10 = i10;
                        iM559710 = (C0946.m55979("֨۠") ^ i13) * (-57);
                        i3 = ((iM559710 ^ i12) * 6331) ^ (-2120666030);
                        i4 = 946619546;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i10 = i10;
                        i11 = i16;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    }
                    break;
                case -1096605491:
                case 2086452787:
                    i16 = i16;
                    C0873.m55678();
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i12 - C0873.m55680("֫ۧ")) * 79;
                        i = ((iM55979 ^ i13) * 6609) ^ (-79530345);
                        i2 = 142264971;
                        int i112 = i16;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                        i11 = i112;
                    } else {
                        c16496M43674 = c16496M43674;
                        strM56336 = strM56336;
                        i10 = i10;
                        int iM559714 = C0946.m55979("ۨۨ") ^ i13;
                        i3 = ((iM559714 ^ i12) * 19307) ^ 1017847940;
                        i5 = iM559714 ^ 1081535710;
                        i10 = i10;
                        i11 = i16;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    }
                    break;
                case -1041161094:
                case 268446341:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    c = '0';
                    if (C1044.f81959 < 0) {
                        iM559710 = (C0873.m55680("ۜۧ") ^ i13) * 49;
                        i3 = ((iM559710 ^ i12) * (-18005)) ^ (-1172935559);
                        i4 = 1201351294;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i10 = i10;
                        i11 = i16;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    } else {
                        sArr2 = sArr2;
                        jSONObjectM37420 = jSONObjectM37420;
                        int iM559715 = C0946.m55979("ۨۨ") ^ i13;
                        i3 = ((iM559715 ^ i12) * 19307) ^ 1017847940;
                        i5 = iM559715 ^ 1081535710;
                        i10 = i10;
                        i11 = i16;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    }
                    break;
                case -897641624:
                case 703900510:
                    return;
                case -867964891:
                case 1730917861:
                    i16 = i16;
                    c16496M43674 = new C16496(2);
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i10 = i10;
                    int iM55680 = C0873.m55680("ܳۙ") ^ i12;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    strM56336 = strM56336;
                    i15 = iM55680 ^ (-2017168595);
                    i14 = ((iM55680 ^ i13) * 17263) ^ 1561122239;
                    jSONObjectM37420 = jSONObjectM37420;
                    break;
                case -581822913:
                case 1691308181:
                    i16 = i16;
                    jSONObjectM37420 = c16496M43674.m37420();
                    sArr2 = f81908;
                    if (!C0917.f81868) {
                        iM55979 = (C0946.m55979("᩸֨") + i13) * (-67);
                        i = ((iM55979 ^ i12) * 12085) ^ (-1958757160);
                        i2 = 292821223;
                        int i113 = i16;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                        i11 = i113;
                    } else {
                        c16496M43674 = c16496M43674;
                        strM56336 = strM56336;
                        i10 = i10;
                        int iM559716 = C0946.m55979("ۨۨ") ^ i13;
                        i3 = ((iM559716 ^ i12) * 19307) ^ 1017847940;
                        i5 = iM559716 ^ 1081535710;
                        i10 = i10;
                        i11 = i16;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    }
                    break;
                case -419139052:
                case 1932465046:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    if (C0898.m55800() <= 0) {
                        iM559710 = (C0873.m55680("ۗܳ") + i13) * 17;
                        i3 = ((iM559710 ^ i12) * 31777) ^ (-468042530);
                        i4 = 630162673;
                    } else {
                        iM559710 = (i12 - C0873.m55680("᩹ܽ")) * (-23);
                        i3 = ((iM559710 ^ i13) * 8525) ^ (-75593395);
                        i4 = -2100586554;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case -391654420:
                case 1409160362:
                    i16 = i16;
                    i10 = 74;
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("۬ܿ") ^ i13) * (-75);
                        i = ((iM55979 ^ i12) * (-26781)) ^ (-840311306);
                        i2 = -389804696;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ۤ۬")) * 71;
                        i = ((iM55979 ^ i13) * 13057) ^ (-1653176264);
                        i2 = -209205910;
                    }
                    int i114 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i114;
                    break;
                case -384496294:
                case -132132778:
                    if (C0917.f81868) {
                        iM55979 = (i13 - C0873.m55680("ۛۖ")) * (-103);
                        i16 = i16;
                        i = ((iM55979 ^ i12) * (-31639)) ^ (-127358867);
                        i2 = 247252118;
                    } else {
                        i16 = i16;
                        iM55979 = (i12 - C0873.m55680("֫ۧ")) * 79;
                        i = ((iM55979 ^ i13) * 6609) ^ (-79530345);
                        i2 = 142264971;
                    }
                    int i115 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i115;
                    break;
                case -259177115:
                case 586046057:
                    i16 = i16;
                    strM56336 = C1071.m56336(sArr2, i10, 13, i9);
                    if (jSONObjectM37420.has(strM56336)) {
                        iM55979 = (i12 - C0873.m55680("۬֡")) * 91;
                        i = ((iM55979 ^ i13) * 20989) ^ (-1475346492);
                        i2 = 1232544700;
                    } else {
                        iM55979 = (i13 - C0873.m55680("ۢ᩶")) * 59;
                        i = ((iM55979 ^ i12) * (-20351)) ^ 1511295242;
                        i2 = 1242249615;
                    }
                    int i116 = i16;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    i11 = i116;
                    break;
                case -199125589:
                case 2111223668:
                    i16 = i16;
                    if (C1017.m56187() > 0) {
                        c16496M43674 = c16496M43674;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        sArr2 = sArr2;
                        i10 = i10;
                        iM559710 = C0946.m55979("ܳܿ") ^ i12;
                        i3 = ((iM559710 ^ i13) * (-6597)) ^ 1369160984;
                        i4 = 1664531226;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i10 = i10;
                        i11 = i16;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    } else {
                        iM55979 = (C0946.m55979("۫ۧ") ^ i12) * C0254q.f1218h;
                        i = ((iM55979 ^ i13) * (-309)) ^ 808802772;
                        i2 = -19648715;
                        int i117 = i16;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                        i11 = i117;
                    }
                    break;
                case 7787170:
                case 460676057:
                    i16 = i16;
                    try {
                        C11133 c11133M40500 = C17837.m40500(c18249);
                        c16496M43674 = c16496M43674;
                        jSONObjectM37420 = jSONObjectM37420;
                        try {
                            C19179 c19179M43668 = C19179.m43668(C1036.m56252(f81908, 49, 25, i9));
                            c19179M43668.m43676();
                            strM56336 = strM56336;
                            try {
                                C1044.m56278(c19179M43668, C1194.m56386(f81908, 87, 8, i9), C0866.m55658(c18249));
                                sArr2 = sArr2;
                                i10 = i10;
                                try {
                                    ServiceConnectionC1013.m56150(c19179M43668, C1036.m56252(f81908, 95, 11, i9), String.valueOf(c11133M40500.f30857));
                                    C1044.m56278(c19179M43668, C1044.m56276(f81908, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 11, i9), C0863.m55642(c18249.m41556()));
                                    c16496M43674 = c19179M43668.m43674();
                                    int iM55681 = C0873.m55680("ܳۙ") ^ i12;
                                    sArr2 = sArr2;
                                    i10 = i10;
                                    i11 = i16;
                                    strM56336 = strM56336;
                                    i15 = iM55681 ^ (-2017168595);
                                    i14 = ((iM55681 ^ i13) * 17263) ^ 1561122239;
                                    jSONObjectM37420 = jSONObjectM37420;
                                } catch (Exception unused) {
                                    iM559710 = C0873.m55680("۠ܳ") ^ i13;
                                    i3 = ((iM559710 ^ i12) * (-30733)) ^ 197263819;
                                    i4 = -1738502079;
                                    i5 = iM559710 ^ i4;
                                    sArr2 = sArr2;
                                    i10 = i10;
                                    i11 = i16;
                                    jSONObjectM37420 = jSONObjectM37420;
                                    strM56336 = strM56336;
                                    i15 = i5;
                                    i14 = i3;
                                    c16496M43674 = c16496M43674;
                                }
                            } catch (Exception unused2) {
                                sArr2 = sArr2;
                                i10 = i10;
                                iM559710 = C0873.m55680("۠ܳ") ^ i13;
                                i3 = ((iM559710 ^ i12) * (-30733)) ^ 197263819;
                                i4 = -1738502079;
                                i5 = iM559710 ^ i4;
                                sArr2 = sArr2;
                                i10 = i10;
                                i11 = i16;
                                jSONObjectM37420 = jSONObjectM37420;
                                strM56336 = strM56336;
                                i15 = i5;
                                i14 = i3;
                                c16496M43674 = c16496M43674;
                                break;
                            }
                        } catch (Exception unused3) {
                            strM56336 = strM56336;
                            sArr2 = sArr2;
                            i10 = i10;
                            iM559710 = C0873.m55680("۠ܳ") ^ i13;
                            i3 = ((iM559710 ^ i12) * (-30733)) ^ 197263819;
                            i4 = -1738502079;
                            i5 = iM559710 ^ i4;
                            sArr2 = sArr2;
                            i10 = i10;
                            i11 = i16;
                            jSONObjectM37420 = jSONObjectM37420;
                            strM56336 = strM56336;
                            i15 = i5;
                            i14 = i3;
                            c16496M43674 = c16496M43674;
                            break;
                        }
                    } catch (Exception unused4) {
                        c16496M43674 = c16496M43674;
                        jSONObjectM37420 = jSONObjectM37420;
                    }
                    break;
                case 14143904:
                case 1565546626:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    s = sArr[c];
                    s2 = 17830;
                    if (RunnableC0938.f81886 >= 0) {
                        iM559710 = C0946.m55979("ۙܽ") ^ i12;
                        i3 = ((iM559710 ^ i13) * 4275) ^ (-1910757706);
                        i4 = 496113459;
                    } else {
                        iM559710 = C0946.m55979("ۚ᩻") ^ i12;
                        i3 = ((iM559710 ^ i13) * (-14241)) ^ 266185849;
                        i4 = -63313656;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case 205085754:
                case 1767231521:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    sArr = f81908;
                    if (C1036.f81953 >= 0) {
                        iM559710 = (C0946.m55979("֨۠") ^ i13) * (-57);
                        i3 = ((iM559710 ^ i12) * 6331) ^ (-2120666030);
                        i4 = 946619546;
                    } else {
                        iM559710 = C0946.m55979("ۘ֫") ^ i12;
                        i3 = ((iM559710 ^ i13) * 8791) ^ 1798076935;
                        i4 = -797926359;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case 341153257:
                case 1342149747:
                    C0845.m55584();
                    C0906.m55809();
                    return;
                case 620200983:
                case 925820703:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    if (C0863.m55643()) {
                        iM559710 = (i13 - C0873.m55680("ۜ֫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM559710 ^ i12) * 21935) ^ 1611984681;
                        i4 = -244595778;
                    } else {
                        iM559710 = C0946.m55979("ۙܽ") ^ i12;
                        i3 = ((iM559710 ^ i13) * 4275) ^ (-1910757706);
                        i4 = 496113459;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case 683535338:
                case 756866814:
                    i16 = i16;
                    if (AbstractC0942.m55971()) {
                        c16496M43674 = c16496M43674;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        sArr2 = sArr2;
                        i10 = i10;
                        iM559710 = (C0873.m55680("ۗܳ") + i13) * 17;
                        i3 = ((iM559710 ^ i12) * 31777) ^ (-468042530);
                        i4 = 630162673;
                        i5 = iM559710 ^ i4;
                        sArr2 = sArr2;
                        i10 = i10;
                        i11 = i16;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM56336 = strM56336;
                        i15 = i5;
                        i14 = i3;
                        c16496M43674 = c16496M43674;
                    }
                    c16496M43674 = c16496M43674;
                    strM56336 = strM56336;
                    i10 = i10;
                    int iM559717 = C0946.m55979("ۨۨ") ^ i13;
                    i3 = ((iM559717 ^ i12) * 19307) ^ 1017847940;
                    i5 = iM559717 ^ 1081535710;
                    i10 = i10;
                    i11 = i16;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case 1032000816:
                case 1382072971:
                    i9 = 47713;
                    iM559710 = (i13 - C0946.m55979("ۙ۟")) * 43;
                    i3 = ((iM559710 ^ i12) * (-8877)) ^ 518435691;
                    i4 = 1436238417;
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                case 1391972195:
                case 1951172490:
                    c16496M43674 = c16496M43674;
                    JSONObject jSONObject = jSONObjectM37420;
                    C18249 c182410 = this.f10745;
                    int iM559718 = (i12 - C0946.m55979("ܳ֨")) * (-107);
                    c18249 = c182410;
                    i14 = ((iM559718 ^ i13) * (-25121)) ^ (-2084062166);
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObject;
                    strM56336 = strM56336;
                    i15 = iM559718 ^ (-875084710);
                    c16496M43674 = c16496M43674;
                    break;
                case 1619530219:
                case 2113546049:
                    i9 = 29115;
                    iM559710 = (i13 - C0946.m55979("ۙ۟")) * 43;
                    i3 = ((iM559710 ^ i12) * (-8877)) ^ 518435691;
                    i4 = 1436238417;
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
                default:
                    c16496M43674 = c16496M43674;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    sArr2 = sArr2;
                    i16 = i16;
                    i10 = i10;
                    if ((i7 + i8) - i6 >= 0) {
                        iM559710 = C0873.m55680("ᩳܳ") ^ i13;
                        i3 = ((iM559710 ^ i12) * (-23887)) ^ (-2085951376);
                        i4 = 702199894;
                    } else {
                        iM559710 = (C0873.m55680("ܰ᩵") + i12) * 33;
                        i3 = ((iM559710 ^ i13) * 4147) ^ (-1704719612);
                        i4 = -1205652414;
                    }
                    i5 = iM559710 ^ i4;
                    sArr2 = sArr2;
                    i10 = i10;
                    i11 = i16;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM56336 = strM56336;
                    i15 = i5;
                    i14 = i3;
                    c16496M43674 = c16496M43674;
                    break;
            }
        }
    }

    public C4743(AbstractActivityC5549 abstractActivityC5549, C18249 c18249, String str) {
        int i = -575015410;
        int i2 = C0863.f81833;
        int i3 = C0949.f81897;
        this.f10748 = abstractActivityC5549;
        this.f10745 = c18249;
        this.f10747 = str;
        int iM55680 = C0873.m55680("ۨܺ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-30531)) ^ 1072690049;
        int i5 = -244528235;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * (-13049)) >> 31));
            switch (i) {
                case -1466397348:
                case -1352457124:
                    C1044.m56286();
                    throw new RuntimeException();
                case -1415390787:
                case -896916035:
                    if (C0930.f81879 > 0) {
                        iM55680 = C0873.m55680("ۢۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28907)) ^ (-1174030163);
                        i5 = -189904058;
                    }
                    break;
                case -1316524506:
                case -377006650:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("ۗᩳ") + i2) * (-11);
                        i4 = ((iM55680 ^ i3) * 3567) ^ (-1292922070);
                        i5 = 585064253;
                    } else {
                        iM55680 = C0873.m55680("۠ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18729) ^ (-274361258);
                        i5 = 1293455290;
                        continue;
                    }
                    break;
                case -821657444:
                case 619038143:
                    C0955.m56025();
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ܿۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7847) ^ (-334984199);
                        i5 = 333205219;
                    }
                    break;
                case -330967939:
                case 961718449:
                    C0946.m55980();
                    if (!C0947.m55997()) {
                        iM55680 = (C0946.m55979("᩵ܰ") + i3) * (-81);
                        i4 = ((iM55680 ^ i2) * (-24913)) ^ (-1380965110);
                        i5 = 1212124117;
                    }
                    break;
                case 61062786:
                case 1923640314:
                    RunnableC0871.m55672();
                    C1025.m56230();
                    break;
                default:
                    return;
            }
            iM55680 = (C0873.m55680("֨۠") + i3) * 47;
            i4 = ((iM55680 ^ i2) * (-31953)) ^ (-1777172403);
            i5 = 1214647070;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C0992.m56112(this, this.f10748);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        int i = 1074862836;
        int i2 = AbstractC0942.f81890;
        int i3 = C0877.f81843;
        int iM55979 = C0946.m55979("۬ۙ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-69)) ^ 460259845;
        int i5 = 1486484790;
        while (true) {
            i = ((((i ^ i3) * (-28075)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2090626996:
                case -1426157802:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0873.m55680("۠ܳ") ^ i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 3067) ^ 744077660;
                        i5 = -1469216374;
                    } else {
                        iM55979 = (C0873.m55680("ܶ֡") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * 25821) ^ 1992324132;
                        i5 = 2087074406;
                    }
                    break;
                case -1987148543:
                case -1138619819:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("ۚ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7845)) ^ 654642841;
                        i5 = -1400805720;
                    } else {
                        iM55979 = C0946.m55979("ۖܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11713) ^ (-462502276);
                        i5 = -1234338195;
                    }
                    break;
                case -1836328168:
                case -97843209:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("۠ܳ") ^ i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 3067) ^ 744077660;
                        i5 = -1469216374;
                    } else {
                        iM55979 = C0873.m55680("᩸۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19501)) ^ (-1591765187);
                        i5 = -858515939;
                    }
                    break;
                case -1776393675:
                case 1600682476:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("ۤۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29047)) ^ (-1845823798);
                        i5 = -1426243918;
                    } else {
                        iM55979 = C0946.m55979("᩺᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10665)) ^ 617812935;
                        i5 = -482799047;
                    }
                    break;
                case -1620053156:
                case 238266328:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0946.m55979("ۤۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29047)) ^ (-1845823798);
                        i5 = -1426243918;
                    } else {
                        iM55979 = C0946.m55979("֨ܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1435)) ^ (-504006967);
                        i5 = -103366711;
                    }
                    break;
                case -1510412749:
                case 2006520646:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("۠ܳ") ^ i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 3067) ^ 744077660;
                        i5 = -1469216374;
                    } else {
                        iM55979 = (C0873.m55680("ܶ۫") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * 14699) ^ (-941269931);
                        i5 = -228132001;
                    }
                    break;
                case -1473372823:
                case 9055017:
                    ServiceConnectionC1013.m56155(this.f10748, exc, null);
                    break;
                case -1455895649:
                case 621171025:
                    C0906.m55809();
                    C1025.m56230();
                    iM55979 = C0873.m55680("᩸۬") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-19501)) ^ (-1591765187);
                    i5 = -858515939;
                    break;
                case -1389781840:
                case 252709621:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ۚ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7845)) ^ 654642841;
                        i5 = -1400805720;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2699)) ^ (-75822305);
                        i5 = 395032303;
                    }
                    break;
                case -1274003079:
                case -867551110:
                    C1024.m56209();
                    if (!C0955.f81898) {
                        iM55979 = C0946.m55979("ۤۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29047)) ^ (-1845823798);
                        i5 = -1426243918;
                    } else {
                        iM55979 = C0873.m55680("᩸۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19501)) ^ (-1591765187);
                        i5 = -858515939;
                    }
                    break;
                case -1273359755:
                case 223887937:
                    C22682.m50800(C1071.m56350(exc));
                    break;
                case -1248800121:
                case 1205227045:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۚ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7845)) ^ 654642841;
                        i5 = -1400805720;
                    } else {
                        iM55979 = C0873.m55680("ܳܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-859)) ^ (-2056724831);
                        i5 = 1951252685;
                    }
                    break;
                case -685887604:
                case -523818290:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17021) ^ (-1977902209);
                        i5 = -7168057;
                    } else {
                        iM55979 = C0873.m55680("ۖۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-15509)) ^ (-897300260);
                        i5 = 408003321;
                    }
                    break;
                case -469673954:
                case 1984445769:
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("ۢۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14773) ^ 1310632487;
                        i5 = -61547358;
                    } else {
                        iM55979 = C0946.m55979("ۤۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29047)) ^ (-1845823798);
                        i5 = -1426243918;
                    }
                    break;
                case -100516688:
                case 1232677031:
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("֡ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14313)) ^ (-820634872);
                        i5 = -133721549;
                    } else {
                        iM55979 = C0873.m55680("᩸۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19501)) ^ (-1591765187);
                        i5 = -858515939;
                    }
                    break;
                case -11033531:
                case 1092731664:
                    if (exc instanceof C3924) {
                        iM55979 = (C0946.m55979("ۚۡ") ^ i3) * (-57);
                        i4 = ((iM55979 ^ i2) * 16409) ^ 1030410329;
                        i5 = 1566945463;
                    } else {
                        iM55979 = C0873.m55680("۟ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-715)) ^ (-1623292234);
                        i5 = 1444968682;
                    }
                    break;
                case 615708890:
                case 1115809491:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17021) ^ (-1977902209);
                        i5 = -7168057;
                    } else {
                        iM55979 = C0873.m55680("᩸۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19501)) ^ (-1591765187);
                        i5 = -858515939;
                    }
                    break;
                default:
                    C0949.m56012();
                    break;
            }
            return;
        }
    }
}
