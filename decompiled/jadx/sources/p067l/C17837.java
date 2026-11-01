package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܺ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 42TB */
/* JADX INFO: loaded from: classes.dex */
public final class C17837 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f53209 = 0;

    /* JADX INFO: renamed from: ۜ֫᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f82254;

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f53210;

    /* JADX INFO: renamed from: ܽ */
    public static String f53211;

    /* JADX INFO: renamed from: ᩳ */
    public static long f53212;

    /* JADX INFO: renamed from: ֫ */
    public static native C16496 m40503(C18249 c18249, JSONObject jSONObject, JSONObject jSONObject2, boolean z);

    /* JADX WARN: Code duplicated, block: B:100:0x03e1 A[PHI: r5 r6 r7 r13 r14 r16 r17 r25 r27 r28
      0x03e1: PHI (r5v5 java.security.MessageDigest) = 
      (r5v3 java.security.MessageDigest)
      (r5v2 java.security.MessageDigest)
      (r5v2 java.security.MessageDigest)
      (r5v2 java.security.MessageDigest)
      (r5v2 java.security.MessageDigest)
     binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r7v4 java.nio.charset.Charset) = 
      (r7v2 java.nio.charset.Charset)
      (r7v2 java.nio.charset.Charset)
      (r7v2 java.nio.charset.Charset)
      (r7v3 java.nio.charset.Charset)
      (r7v2 java.nio.charset.Charset)
     binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r14v5 java.lang.StringBuilder) = 
      (r14v3 java.lang.StringBuilder)
      (r14v2 java.lang.StringBuilder)
      (r14v2 java.lang.StringBuilder)
      (r14v2 java.lang.StringBuilder)
      (r14v2 java.lang.StringBuilder)
     binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r16v3 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v4 int) binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r17v3 int) = (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v4 int) binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r25v28 java.lang.String) = 
      (r25v14 java.lang.String)
      (r25v15 java.lang.String)
      (r25v16 java.lang.String)
      (r25v17 java.lang.String)
      (r25v29 java.lang.String)
     binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r27v2 short) = (r27v1 short), (r27v1 short), (r27v1 short), (r27v1 short), (r27v3 short) binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r28v19 java.lang.String) = 
      (r28v6 java.lang.String)
      (r28v7 java.lang.String)
      (r28v8 java.lang.String)
      (r28v9 java.lang.String)
      (r28v20 java.lang.String)
     binds: [B:81:0x02ef, B:74:0x029e, B:70:0x027a, B:66:0x0251, B:6:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if (p067l.C0927.f81875 != false) goto L29;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m40508(int i, String str) {
        int iM55680;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        String str2;
        int iM55682;
        int i8;
        int i9;
        int i10 = C0967.f81910;
        int i11 = C0863.f81833;
        int iM55683 = (C0873.m55680("ۧۗ") + i10) * 127;
        int i12 = ((iM55683 ^ i11) * 30365) ^ 1933962757;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = iM55683 ^ 220953120;
        int i14 = 0;
        StringBuilder sb = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = 842369003;
        char c = 0;
        short s2 = 0;
        Bitmap bitmapM40498 = null;
        C20066 c20066M43670 = null;
        Bitmap bitmapM40499 = null;
        String strM55913 = null;
        byte[] bArrDigest = null;
        Charset charset = null;
        String strM55639 = null;
        MessageDigest messageDigestM36660 = null;
        String strM55970 = null;
        while (true) {
            i18 = i13 ^ (i12 & (((i18 ^ i11) * 24565) >> 31));
            switch (i18) {
                case -1985194325:
                case 120481835:
                    C1404.m56468();
                    if (!C1024.f81946) {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        iM55979 = C0873.m55680("᩸ۖ") ^ i11;
                        i4 = ((iM55979 ^ i10) * (-1701)) ^ (-977282298);
                        i5 = -1839271474;
                        i7 = iM55979 ^ i5;
                        strM55913 = strM55913;
                        String str3 = strM55970;
                        i13 = i7;
                        i12 = i4;
                        strM55970 = str3;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ۙ۬")) * 39;
                        i2 = ((iM55680 ^ i11) * (-12279)) ^ 1736932525;
                        i3 = -1937383724;
                        i13 = iM55680 ^ i3;
                        i12 = i2;
                    }
                    break;
                case -1967748719:
                case 209392766:
                    C0989.m56095();
                    C0917.m55854();
                    return null;
                case -1802790390:
                case -694692520:
                    str2 = strM55913;
                    strM55970 = AbstractC0942.m55970(f82254, 347, 8, i14);
                    if (C0946.f81894 != 0) {
                        iM55682 = C0946.m55979("ܶ᩺") ^ i11;
                        i8 = ((iM55682 ^ i10) * (-11831)) ^ 339767440;
                        i9 = -1389691301;
                    } else {
                        iM55682 = (i11 - C0873.m55680("᩷۠")) * 77;
                        i8 = ((iM55682 ^ i10) * (-8245)) ^ (-1781233209);
                        i9 = 1441564856;
                    }
                    i13 = iM55682 ^ i9;
                    i12 = i8;
                    strM55913 = str2;
                    break;
                case -1715667593:
                case -1319005186:
                    C14828.m33866(strM55913, bitmapM40498);
                    return bitmapM40498;
                case -1708472157:
                case 673635040:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    messageDigestM36660 = C16111.m36660();
                    short[] sArr3 = f82254;
                    if (C1194.f82045 != 0) {
                        int iM559710 = (C0946.m55979("ᩴۖ") ^ i11) * (-103);
                        i4 = ((iM559710 ^ i10) * (-3183)) ^ (-382754468);
                        i7 = iM559710 ^ (-1114157779);
                        strM55913 = strM55913;
                        sb = null;
                    } else {
                        sb = new StringBuilder(C1044.m56276(sArr3, 355, 11, i14));
                        if (C0992.f81922 >= 0) {
                            iM55979 = C0946.m55979("ᩴۡ") ^ i10;
                            i4 = ((iM55979 ^ i11) * (-26489)) ^ 1806720406;
                            i5 = -1780493216;
                        } else {
                            iM55979 = (C0873.m55680("ۧۘ") + i10) * (-111);
                            i4 = ((iM55979 ^ i11) * 31933) ^ 278701403;
                            i5 = 249409150;
                        }
                        i7 = iM55979 ^ i5;
                        strM55913 = strM55913;
                    }
                    String str4 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str4;
                    break;
                case -1680406979:
                case 1091689822:
                    bitmapM40498 = m40498(BitmapFactory.decodeStream(c20066M43670.m45436().m4011()));
                    if (bitmapM40498 == null) {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        iM55979 = (i11 - C0873.m55680("ۨۡ")) * 17;
                        i4 = ((iM55979 ^ i10) * 23095) ^ 1246662932;
                        i5 = -872920809;
                        i7 = iM55979 ^ i5;
                        strM55913 = strM55913;
                        String str5 = strM55970;
                        i13 = i7;
                        i12 = i4;
                        strM55970 = str5;
                    } else {
                        iM55680 = C0873.m55680("ۘۜ") ^ i10;
                        i2 = ((iM55680 ^ i11) * 19337) ^ 958716112;
                        i3 = 986022062;
                        i13 = iM55680 ^ i3;
                        i12 = i2;
                    }
                    break;
                case -1410645219:
                case -1160450379:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    C1003.m56121(sb, C0877.m55707(sArr2, 366, 1, i14));
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ᩴۡ") ^ i10;
                        i4 = ((iM55979 ^ i11) * (-26489)) ^ 1806720406;
                        i5 = -1780493216;
                    } else {
                        iM55979 = C0873.m55680("ۚ֡") ^ i10;
                        i4 = ((iM55979 ^ i11) * (-27163)) ^ 1118924319;
                        i5 = 1567411615;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str6 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str6;
                    break;
                case -1395413182:
                case 1472180183:
                    i14 = 16564;
                    iM55979 = C0873.m55680("᩺᩺") ^ i11;
                    i4 = ((iM55979 ^ i10) * 3289) ^ 929005215;
                    i5 = -830482151;
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str7 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str7;
                    break;
                case -1307365801:
                case -1245624482:
                    C1404.m56468();
                    if (C0890.m55740()) {
                        iM55680 = (C0873.m55680("ۨ֨") + i10) * (-21);
                        i2 = ((iM55680 ^ i11) * (-22905)) ^ 943579413;
                        i3 = -2066761604;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܶ") ^ i11) * (-39);
                        i2 = ((iM55680 ^ i10) * 5157) ^ (-233516705);
                        i3 = -1120285620;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1299888041:
                case -417448684:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    int i19 = s2 + s;
                    if (i17 - (i19 * i19) >= 0) {
                        iM55979 = (C0873.m55680("ۡ۠") ^ i10) * 91;
                        i4 = ((iM55979 ^ i11) * (-1733)) ^ 1083891882;
                        i5 = -1721157382;
                    } else {
                        iM55979 = (C0873.m55680("֫᩻") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i11) * (-19905)) ^ 943768494;
                        i5 = 301683923;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str8 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str8;
                    break;
                case -1166258582:
                case -393468541:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    messageDigestM36660.update(C0866.m55657(strM55639, charset));
                    bArrDigest = messageDigestM36660.digest();
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("᩸ۖ") ^ i11;
                        i4 = ((iM55979 ^ i10) * (-1701)) ^ (-977282298);
                        i5 = -1839271474;
                    } else {
                        iM55979 = C0873.m55680("᩵ܶ") ^ i10;
                        i4 = ((iM55979 ^ i11) * (-4737)) ^ 2136695017;
                        i5 = -1665729686;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str9 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str9;
                    break;
                case -914555181:
                case 2112870728:
                    C0863.m55643();
                    break;
                case -691478580:
                case 177195401:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    C0863.m55629(sb, i);
                    strM55639 = C0863.m55639(sb);
                    charset = StandardCharsets.UTF_8;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ᩴۡ") ^ i10;
                        i4 = ((iM55979 ^ i11) * (-26489)) ^ 1806720406;
                        i5 = -1780493216;
                    } else {
                        iM55979 = C0946.m55979("ۖۡ") ^ i11;
                        i4 = ((iM55979 ^ i10) * (-24001)) ^ 1920825867;
                        i5 = -261637047;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str10 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str10;
                    break;
                case -636924980:
                case -344642698:
                    if (C0927.m55873() > 0) {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        iM55979 = C0946.m55979("֡ᩳ") ^ i11;
                        i4 = ((iM55979 ^ i10) * 7285) ^ 2051151213;
                        i5 = -454079911;
                        i7 = iM55979 ^ i5;
                        strM55913 = strM55913;
                        String str11 = strM55970;
                        i13 = i7;
                        i12 = i4;
                        strM55970 = str11;
                    } else {
                        iM55680 = (C0873.m55680("ۨ֨") + i10) * (-21);
                        i2 = ((iM55680 ^ i11) * (-22905)) ^ 943579413;
                        i3 = -2066761604;
                        i13 = iM55680 ^ i3;
                        i12 = i2;
                    }
                    break;
                case -506871564:
                case 2112932491:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    C1003.m56121(sb, str);
                    sArr2 = f82254;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("ᩴۡ") ^ i10;
                        i4 = ((iM55979 ^ i11) * (-26489)) ^ 1806720406;
                        i5 = -1780493216;
                    } else {
                        iM55979 = C0873.m55680("ۡۜ") ^ i11;
                        i4 = ((iM55979 ^ i10) * (-6199)) ^ (-117750890);
                        i5 = -1291789305;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str12 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str12;
                    break;
                case -363948081:
                case 1818791839:
                    return null;
                case -351490544:
                case 892939134:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    int i20 = i15 + i16;
                    i17 = i20 + i20;
                    s = 3751;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i11;
                        i4 = ((iM55979 ^ i10) * 7285) ^ 2051151213;
                        i5 = -454079911;
                    } else {
                        iM55979 = C0946.m55979("֡ۢ") ^ i11;
                        i4 = ((iM55979 ^ i10) * (-15979)) ^ 1766530311;
                        i5 = -668812;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str13 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str13;
                    break;
                case -252279993:
                case 511190745:
                    if (C1036.f81953 >= 0) {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        iM55979 = (i10 - C0946.m55979("᩷᩸")) * (-25);
                        i4 = ((iM55979 ^ i11) * (-17115)) ^ (-1128869650);
                        i5 = -1236399949;
                        i7 = iM55979 ^ i5;
                        strM55913 = strM55913;
                        String str14 = strM55970;
                        i13 = i7;
                        i12 = i4;
                        strM55970 = str14;
                    }
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    iM55979 = C0946.m55979("֡ᩳ") ^ i11;
                    i4 = ((iM55979 ^ i10) * 7285) ^ 2051151213;
                    i5 = -454079911;
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str15 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str15;
                    break;
                case -238763920:
                case 1242011388:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    sArr = f82254;
                    c = 346;
                    if (C0906.f81862 >= 0) {
                        iM55979 = (i10 - C0946.m55979("᩷᩸")) * (-25);
                        i4 = ((iM55979 ^ i11) * (-17115)) ^ (-1128869650);
                        i5 = -1236399949;
                    } else {
                        iM55979 = (C0946.m55979("ܳۛ") + i10) * (-107);
                        i4 = ((iM55979 ^ i11) * (-28355)) ^ 89038631;
                        i5 = 1007685379;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str16 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str16;
                    break;
                case -122245826:
                case 262550048:
                    C1229.m56410();
                    if (!RunnableC0897.m55784()) {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        int iM559711 = (C0946.m55979("ᩴۖ") ^ i11) * (-103);
                        i4 = ((iM559711 ^ i10) * (-3183)) ^ (-382754468);
                        i7 = iM559711 ^ (-1114157779);
                        strM55913 = strM55913;
                        sb = null;
                        String str17 = strM55970;
                        i13 = i7;
                        i12 = i4;
                        strM55970 = str17;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܶ") ^ i11) * (-39);
                        i2 = ((iM55680 ^ i10) * 5157) ^ (-233516705);
                        i3 = -1120285620;
                        i13 = iM55680 ^ i3;
                        i12 = i2;
                    }
                    break;
                case -66797142:
                case 2028403604:
                    if (C1053.m56327() >= 0) {
                        str2 = strM55913;
                        iM55682 = C0946.m55979("ܶ᩺") ^ i11;
                        i8 = ((iM55682 ^ i10) * (-11831)) ^ 339767440;
                        i9 = -1389691301;
                        i13 = iM55682 ^ i9;
                        i12 = i8;
                        strM55913 = str2;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܶ") ^ i11) * (-39);
                        i2 = ((iM55680 ^ i10) * 5157) ^ (-233516705);
                        i3 = -1120285620;
                        i13 = iM55680 ^ i3;
                        i12 = i2;
                    }
                    break;
                case 2586238:
                case 879770805:
                    try {
                        StringBuilder sb2 = new StringBuilder(strM55970);
                        C0912.m55825(sb2, str);
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        try {
                            C0912.m55825(sb2, C1003.m56132(f82254, 367, 1, i14));
                            C0863.m55629(sb2, i);
                            C1003.m56121(sb2, C1044.m56276(f82254, 368, 9, i14));
                            c20066M43670 = C19179.m43668(C0845.m55591(sb2)).m43670();
                            iM55979 = C0946.m55979("֨ܽ") ^ i10;
                            i4 = ((iM55979 ^ i11) * 10839) ^ (-892754141);
                            i5 = 276003068;
                        } catch (IOException unused) {
                            iM55979 = (i11 - C0873.m55680("ۨۡ")) * 17;
                            i4 = ((iM55979 ^ i10) * 23095) ^ 1246662932;
                            i5 = -872920809;
                        }
                    } catch (IOException unused2) {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str18 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str18;
                    break;
                case 163439994:
                case 386992223:
                    strM55970 = strM55970;
                    strM55913 = C0937.m55913(bArrDigest);
                    bitmapM40499 = m40498(C14828.m33864(strM55913));
                    if (bitmapM40499 != null) {
                        iM55681 = C0946.m55979("۫ۗ") ^ i10;
                        i4 = ((iM55681 ^ i11) * (-7921)) ^ 1998223479;
                        i6 = -1490805923;
                    } else {
                        iM55681 = (C0873.m55680("᩶ܺ") ^ i11) * 69;
                        i4 = ((iM55681 ^ i10) * 24875) ^ 629006180;
                        i6 = -1232138841;
                    }
                    i7 = iM55681 ^ i6;
                    String str19 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str19;
                    break;
                case 440413402:
                case 1591281018:
                    C1964.m56597();
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    iM55979 = C0873.m55680("᩸ۖ") ^ i11;
                    i4 = ((iM55979 ^ i10) * (-1701)) ^ (-977282298);
                    i5 = -1839271474;
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str110 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str110;
                    break;
                case 746589765:
                case 1570992709:
                    return bitmapM40499;
                case 976883283:
                case 1122724673:
                    i14 = 15748;
                    iM55979 = C0873.m55680("᩺᩺") ^ i11;
                    i4 = ((iM55979 ^ i10) * 3289) ^ 929005215;
                    i5 = -830482151;
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str111 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str111;
                    break;
                case 1205975174:
                case 1679897525:
                    if (!C0882.f81846) {
                        iM55680 = C0946.m55979("᩻ۗ") ^ i10;
                        i2 = ((iM55680 ^ i11) * (-20989)) ^ 1839356187;
                        i3 = -713099630;
                        i13 = iM55680 ^ i3;
                        i12 = i2;
                    } else {
                        strM55970 = strM55970;
                        strM55913 = strM55913;
                        iM55979 = C0873.m55680("᩸ۖ") ^ i11;
                        i4 = ((iM55979 ^ i10) * (-1701)) ^ (-977282298);
                        i5 = -1839271474;
                        i7 = iM55979 ^ i5;
                        strM55913 = strM55913;
                        String str112 = strM55970;
                        i13 = i7;
                        i12 = i4;
                        strM55970 = str112;
                    }
                    break;
                default:
                    strM55970 = strM55970;
                    strM55913 = strM55913;
                    s2 = sArr[c];
                    i15 = s2 * s2;
                    i16 = 14070001;
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ᩴۡ") ^ i10;
                        i4 = ((iM55979 ^ i11) * (-26489)) ^ 1806720406;
                        i5 = -1780493216;
                    } else {
                        iM55979 = C0946.m55979("᩶۫") ^ i11;
                        i4 = ((iM55979 ^ i10) * 8061) ^ (-336053362);
                        i5 = 768693066;
                    }
                    i7 = iM55979 ^ i5;
                    strM55913 = strM55913;
                    String str113 = strM55970;
                    i13 = i7;
                    i12 = i4;
                    strM55970 = str113;
                    break;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x03c4 */
    /* JADX WARN: Code duplicated, block: B:62:0x0191 A[Catch: all -> 0x0299, TryCatch #20 {all -> 0x0299, blocks: (B:33:0x00e9, B:34:0x00f8, B:36:0x00fe, B:39:0x010b, B:41:0x011e, B:44:0x0133, B:46:0x0142, B:49:0x0156, B:51:0x015a, B:53:0x016a, B:55:0x017a, B:62:0x0191, B:64:0x01a1, B:65:0x01d7, B:66:0x01dc, B:68:0x01e0, B:69:0x01ea), top: B:258:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a1 A[Catch: all -> 0x0299, TryCatch #20 {all -> 0x0299, blocks: (B:33:0x00e9, B:34:0x00f8, B:36:0x00fe, B:39:0x010b, B:41:0x011e, B:44:0x0133, B:46:0x0142, B:49:0x0156, B:51:0x015a, B:53:0x016a, B:55:0x017a, B:62:0x0191, B:64:0x01a1, B:65:0x01d7, B:66:0x01dc, B:68:0x01e0, B:69:0x01ea), top: B:258:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7 A[Catch: all -> 0x0299, TryCatch #20 {all -> 0x0299, blocks: (B:33:0x00e9, B:34:0x00f8, B:36:0x00fe, B:39:0x010b, B:41:0x011e, B:44:0x0133, B:46:0x0142, B:49:0x0156, B:51:0x015a, B:53:0x016a, B:55:0x017a, B:62:0x0191, B:64:0x01a1, B:65:0x01d7, B:66:0x01dc, B:68:0x01e0, B:69:0x01ea), top: B:258:0x00e9 }] */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized C11133 m40500(C18249 c18249) {
        AbstractC17043 abstractC17043;
        AbstractC17043 abstractC17043M55985;
        Throwable th;
        Throwable th2;
        Throwable th3;
        short s = f82254[4];
        int i = s + 16450;
        int i2 = (s * 65800) - (i * i) > 0 ? 36420 : 42935;
        String strM56373 = C1124.m56373(f82254, 5, 21, i2);
        synchronized (C17837.class) {
            if (c18249.m41560()) {
                throw new C20807(C0946.m55979(C0873.m55689(f82254, 26, 3, i2)) ^ 2100668776);
            }
            String strM41536 = c18249.m41536();
            if (strM41536 == null || C1194.m56397(strM41536)) {
                AbstractC17043 abstractC17043M41546 = c18249.m41546();
                MessageDigest messageDigestM36660 = C16111.m36660();
                C16111.m36661(messageDigestM36660, C1003.m56128(abstractC17043M41546));
                strM41536 = C0937.m55913(messageDigestM36660.digest());
            }
            StringBuilder sb = new StringBuilder();
            C0912.m55825(sb, C0866.m55658(c18249));
            C0912.m55825(sb, C0861.m55618(f82254, 29, 1, i2));
            C0912.m55825(sb, strM41536);
            String strM55591 = C0845.m55591(sb);
            HashMap map = f53210;
            C11133 c11133 = (C11133) C0890.m55737(map, strM55591);
            if (c11133 != null) {
                if (C0912.m55837(c11133.f30855)) {
                    return c11133;
                }
                map.remove(strM55591);
            }
            StringBuilder sb2 = new StringBuilder(strM56373);
            C1003.m56121(sb2, C16111.m36664(strM55591));
            C1003.m56121(sb2, AbstractC0942.m55970(f82254, 30, 4, i2));
            String strM55592 = C0845.m55591(sb2);
            AbstractC17043 abstractC17043M55691 = C17853.f53280;
            AbstractC17043 abstractC17043M55846 = C0917.m55846(abstractC17043M55691, strM55592);
            if (C1003.m56124(abstractC17043M55846)) {
                long jMo25101 = abstractC17043M55846.mo25101();
                MessageDigest messageDigestM36661 = C16111.m36660();
                C16111.m36661(messageDigestM36661, C1003.m56128(abstractC17043M55846));
                C11133 c11134 = new C11133(jMo25101, abstractC17043M55846, C1194.m56389(messageDigestM36661.digest()));
                C1028.m56246(map, strM55591, c11134);
                return c11134;
            }
            AbstractC17043 abstractC17044 = null;
            try {
                AbstractC17043 abstractC17043M41547 = c18249.m41546();
                boolean z = true;
                try {
                    try {
                        if (c18249.m41523()) {
                            C19561 c19561 = new C19561(abstractC17043M41547);
                            try {
                                C11804 c11804M40501 = m40501(c19561);
                                if (c11804M40501.f32960) {
                                    abstractC17043M41547 = C0873.m55691(abstractC17043M55691);
                                    try {
                                        C10844 c10844 = new C10844(abstractC17043M41547);
                                        try {
                                            C0845.m55588(c10844, 0);
                                            Iterator itM56561 = C1929.m56561(C1229.m56411(c19561));
                                            while (C0866.m55647(itM56561)) {
                                                C5738 c5738 = (C5738) RunnableC0897.m55785(itM56561);
                                                if (!RunnableC0897.m55788(c5738)) {
                                                    String strM56241 = C1028.m56241(c5738);
                                                    if (!(C0906.m55806(C0917.m55852(f82254, 42, 9, i2), strM56241) || ViewOnClickListenerC0939.m55949(C0912.m55822(f82254, 74, 8, i2), strM56241) || C0906.m55806(C0890.m55726(f82254, 86, 8, i2), strM56241))) {
                                                        C1124.m56362(c10844, c5738, c19561);
                                                    }
                                                }
                                            }
                                            C0863.m55641(c10844, c11804M40501.f32959);
                                            C0898.m55804(c10844, c11804M40501.f32958);
                                            AbstractC0942.m55958(c10844);
                                            abstractC17043M55691 = abstractC17043M41547;
                                        } catch (Throwable th4) {
                                            try {
                                                AbstractC0942.m55958(c10844);
                                                throw th4;
                                            } catch (Throwable th5) {
                                                C0949.m56011(th4, th5);
                                                throw th4;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        try {
                                            C1124.m56366(c19561);
                                            throw th;
                                        } catch (Throwable th7) {
                                            C0949.m56011(th, th7);
                                            throw th;
                                        }
                                    }
                                } else {
                                    abstractC17043M55691 = null;
                                }
                                C0967.m56075(c19561);
                                abstractC17043M55985 = null;
                            } catch (Throwable th8) {
                                th = th8;
                                abstractC17043M41547 = null;
                            }
                        } else {
                            abstractC17043M55691 = C0873.m55691(abstractC17043M55691);
                            try {
                                try {
                                    C19561 c19562 = new C19561(abstractC17043M41547);
                                    try {
                                        try {
                                            C10844 c10845 = new C10844(abstractC17043M55691);
                                            try {
                                                C11804 c11804M40502 = m40501(c19562);
                                                C0845.m55588(c10845, 0);
                                                Iterator itM56562 = C1929.m56561(C1229.m56411(c19562));
                                                while (C0866.m55647(itM56562)) {
                                                    C5738 c5739 = (C5738) C0955.m56035(itM56562);
                                                    if (!RunnableC0897.m55788(c5739)) {
                                                        String strM56242 = C1028.m56241(c5739);
                                                        if ((!C1229.m56404(strM56242, C1025.m56233(f82254, 38, 4, i2)) || !C1028.m56248(C0894.m55765(strM56242), C0967.m56077(f82254, 69, 5, i2))) && (!C1229.m56404(strM56242, C1404.m56462(f82254, 51, 5, i2)) || !C0898.m55799(RunnableC0938.m55929(strM56242), C0898.m55792(f82254, 82, 4, i2)))) {
                                                            if (c11804M40502.f32960) {
                                                                if (!(C0906.m55806(C0873.m55689(f82254, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 9, i2), strM56242) || ViewOnClickListenerC0939.m55949(C0917.m55852(f82254, 116, 8, i2), strM56242) || C0906.m55806(C0861.m55618(f82254, 124, 8, i2), strM56242))) {
                                                                    if (C0906.m55806(strM56242, C1024.m56203(f82254, 94, 13, i2))) {
                                                                        byte[] bArrM55823 = C0912.m55823(c19562, c5739, null);
                                                                        Charset charset = StandardCharsets.UTF_8;
                                                                        JSONObject jSONObject = new JSONObject(new String(bArrM55823, charset));
                                                                        jSONObject.put(C0845.m55592(f82254, 143, 7, i2), true);
                                                                        C0863.m55641(c10845, C1003.m56132(f82254, 150, 13, i2));
                                                                        C1028.m56237(c10845, C0866.m55657(C0845.m55591(jSONObject), charset));
                                                                    } else {
                                                                        C1124.m56362(c10845, c5739, c19562);
                                                                    }
                                                                }
                                                            } else if (C0906.m55806(strM56242, C1024.m56203(f82254, 94, 13, i2))) {
                                                                byte[] bArrM55824 = C0912.m55823(c19562, c5739, null);
                                                                Charset charset2 = StandardCharsets.UTF_8;
                                                                JSONObject jSONObject2 = new JSONObject(new String(bArrM55824, charset2));
                                                                jSONObject2.put(C0845.m55592(f82254, 143, 7, i2), true);
                                                                C0863.m55641(c10845, C1003.m56132(f82254, 150, 13, i2));
                                                                C1028.m56237(c10845, C0866.m55657(C0845.m55591(jSONObject2), charset2));
                                                            } else {
                                                                C1124.m56362(c10845, c5739, c19562);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (c11804M40502.f32960) {
                                                    C0863.m55641(c10845, c11804M40502.f32959);
                                                    C1028.m56237(c10845, c11804M40502.f32958);
                                                }
                                                AbstractC17043 abstractC17043M34322 = C14976.m34322(C0866.m55658(c18249));
                                                abstractC17043M55985 = C0946.m55985(C17853.f53280);
                                                try {
                                                    if (!c18249.m41530(abstractC17043M34322, abstractC17043M55985)) {
                                                        throw new IOException(C1964.m56584(f82254, 56, 13, i2));
                                                    }
                                                    BufferedInputStream bufferedInputStreamM38676 = abstractC17043M55985.m38676();
                                                    try {
                                                        bufferedInputStreamM38676.mark(12);
                                                        if (bufferedInputStreamM38676.read() == 100 && bufferedInputStreamM38676.read() == 101 && bufferedInputStreamM38676.read() == 120 && bufferedInputStreamM38676.read() == 10) {
                                                            bufferedInputStreamM38676.reset();
                                                            C0845.m55577(c10845, C0937.m55921(f82254, 132, 11, i2));
                                                            c10845.m24985(bufferedInputStreamM38676);
                                                        } else {
                                                            z = false;
                                                        }
                                                        bufferedInputStreamM38676.close();
                                                        if (!z) {
                                                            C19561 c19563 = new C19561(abstractC17043M55985);
                                                            try {
                                                                Iterator itM55766 = C0894.m55766(c19563.m44449(false));
                                                                while (C0930.m55886(itM55766)) {
                                                                    C0967.m56073(c10845, (C5738) RunnableC0897.m55785(itM55766), c19563);
                                                                }
                                                                C0967.m56075(c19563);
                                                            } catch (Throwable th9) {
                                                                try {
                                                                    C0967.m56075(c19563);
                                                                    throw th9;
                                                                } catch (Throwable th10) {
                                                                    C0949.m56011(th9, th10);
                                                                    throw th9;
                                                                }
                                                            }
                                                        }
                                                        AbstractC0942.m55958(c10845);
                                                        C1124.m56366(c19562);
                                                        abstractC17043M41547 = abstractC17043M55691;
                                                    } catch (Throwable th11) {
                                                        try {
                                                            bufferedInputStreamM38676.close();
                                                            throw th11;
                                                        } catch (Throwable th12) {
                                                            C0877.m55706(th11, th12);
                                                            throw th11;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th3 = th13;
                                                    try {
                                                        RunnableC1014.m56176(c10845);
                                                        throw th3;
                                                    } catch (Throwable th14) {
                                                        C0949.m56011(th3, th14);
                                                        throw th3;
                                                    }
                                                }
                                            } catch (Throwable th15) {
                                                th3 = th15;
                                            }
                                        } catch (Throwable th16) {
                                            th2 = th16;
                                            try {
                                                C0967.m56075(c19562);
                                                throw th2;
                                            } catch (Throwable th17) {
                                                C0949.m56011(th2, th17);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th18) {
                                        th2 = th18;
                                        C0967.m56075(c19562);
                                        throw th2;
                                    }
                                } catch (JSONException e) {
                                    e = e;
                                    throw new IOException(e);
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                throw new IOException(e);
                            }
                        }
                        AbstractC17043 abstractC17043M38693 = C17853.f53280.m38693(C0898.m55792(f82254, 34, 4, i2));
                        try {
                            new C7079().m16301(abstractC17043M41547, abstractC17043M38693);
                            RunnableC1014.m56173(abstractC17043M55846);
                            if (!abstractC17043M38693.mo25502(abstractC17043M55846)) {
                                abstractC17043M55846.m38658(abstractC17043M38693, (C19056) null, (InterfaceC7717) null);
                            }
                            long jMo25102 = abstractC17043M55846.mo25101();
                            MessageDigest messageDigestM36662 = C16111.m36660();
                            C16111.m36661(messageDigestM36662, C1003.m56128(abstractC17043M55846));
                            C11133 c11135 = new C11133(jMo25102, abstractC17043M55846, C1194.m56389(messageDigestM36662.digest()));
                            C1028.m56246(f53210, strM55591, c11135);
                            if (abstractC17043M55691 != null) {
                                RunnableC1014.m56173(abstractC17043M55691);
                            }
                            if (abstractC17043M55985 != null) {
                                AbstractC0942.m55966(abstractC17043M55985);
                            }
                            RunnableC1014.m56173(abstractC17043M38693);
                            return c11135;
                        } catch (Throwable th19) {
                            th = th19;
                            abstractC17044 = abstractC17043M38693;
                            abstractC17043 = abstractC17044;
                            abstractC17044 = abstractC17043M55691;
                            if (abstractC17044 != null) {
                                AbstractC0942.m55966(abstractC17044);
                            }
                            if (abstractC17043M55985 != null) {
                                RunnableC1014.m56173(abstractC17043M55985);
                            }
                            if (abstractC17043 != null) {
                                RunnableC1014.m56173(abstractC17043);
                            }
                            throw th;
                        }
                    } catch (Throwable th20) {
                        th = th20;
                    }
                } catch (Throwable th21) {
                    th = th21;
                    abstractC17043M55985 = null;
                }
            } catch (Throwable th22) {
                th = th22;
                abstractC17043 = null;
                abstractC17043M55985 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40507(EnumC15303 enumC15303) {
        int i = 579436332;
        int i2 = C0930.f81879;
        int i3 = C0992.f81922;
        int iM55979 = C0946.m55979("᩹֫") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-16285)) ^ 1117556133;
        int i5 = 624174638;
        while (true) {
            i = ((((i ^ i3) * (-31169)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1627212001:
                case 1325863343:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("ۗ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28511) ^ (-722628368);
                        i5 = 350874076;
                    } else {
                        iM55979 = (C0873.m55680("۟ᩳ") ^ i2) * 33;
                        i4 = ((iM55979 ^ i3) * (-27769)) ^ 1988433956;
                        i5 = 590764928;
                    }
                    break;
                case -1591977785:
                case -300069044:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 9141) ^ (-898721806);
                        i5 = 326783423;
                    } else {
                        iM55979 = C0873.m55680("᩶ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15063)) ^ (-569671257);
                        i5 = -697891039;
                    }
                    break;
                case -1571820716:
                case -1340206866:
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 9141) ^ (-898721806);
                        i5 = 326783423;
                    } else {
                        iM55979 = (C0873.m55680("֨ۘ") + i2) * 119;
                        i4 = ((iM55979 ^ i3) * 4157) ^ (-6676639);
                        i5 = -328660084;
                    }
                    break;
                case -1549820954:
                case -112685396:
                    C0927.m55873();
                    iM55979 = C0873.m55680("֫ܺ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 8771) ^ 187125451;
                    i5 = -504658232;
                    break;
                case -1268501212:
                case 1801505504:
                    if (C0845.m55584() <= 0) {
                        iM55979 = C0873.m55680("ۗ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28511) ^ (-722628368);
                        i5 = 350874076;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۢ") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-17727)) ^ (-1218171427);
                        i5 = 356227946;
                    }
                    break;
                case -1163886672:
                case 1407244154:
                    break;
                case -911235501:
                case 193625482:
                    if (C1012.m56134() <= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 9141) ^ (-898721806);
                        i5 = 326783423;
                    } else {
                        iM55979 = C0946.m55979("۟ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31379)) ^ 1525656604;
                        i5 = -2034131154;
                    }
                    break;
                case -860019162:
                case -119972365:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 9141) ^ (-898721806);
                        i5 = 326783423;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ᩳ۠")) * (-117);
                        i4 = ((iM55979 ^ i2) * (-21989)) ^ 70734594;
                        i5 = 1304365507;
                    }
                    break;
                case -600151491:
                case -525265670:
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("ۘ᩺") ^ i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-25309)) ^ 451909685;
                        i5 = -750504817;
                    } else {
                        iM55979 = C0946.m55979("ۡۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6457) ^ 537883412;
                        i5 = -1930275142;
                    }
                    break;
                case -597349183:
                case 1536958681:
                    f53211 = null;
                    iM55979 = C0946.m55979("ۡ᩶") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-10251)) ^ (-707323003);
                    i5 = 1459689973;
                    break;
                case -98929041:
                case 1774796158:
                    C0873.m55678();
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0873.m55680("ۘ᩺") ^ i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-25309)) ^ 451909685;
                        i5 = -750504817;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28511) ^ (-722628368);
                        i5 = 350874076;
                    }
                    break;
                case -30066829:
                case 1408931042:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۗ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28511) ^ (-722628368);
                        i5 = 350874076;
                    } else {
                        iM55979 = C0873.m55680("֫ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8771) ^ 187125451;
                        i5 = -504658232;
                    }
                    break;
                case 28654376:
                case 689451433:
                    if (enumC15303.m34840()) {
                        iM55979 = C0946.m55979("ۡ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10251)) ^ (-707323003);
                        i5 = 1459689973;
                    } else {
                        iM55979 = C0873.m55680("ۨۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25243) ^ 1772207774;
                        i5 = 1965137371;
                    }
                    break;
                case 464464952:
                case 626591042:
                    if (C1229.m56410() != 0) {
                        iM55979 = (C0873.m55680("֨ۜ") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * 3521) ^ (-1631673372);
                        i5 = -1589017316;
                    } else {
                        iM55979 = (C0946.m55979("᩺᩺") + i3) * 15;
                        i4 = ((iM55979 ^ i2) * 1377) ^ (-873145695);
                        i5 = 814928877;
                    }
                    break;
                case 634331022:
                case 1011265080:
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 9141) ^ (-898721806);
                        i5 = 326783423;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28511) ^ (-722628368);
                        i5 = 350874076;
                    }
                    break;
                case 723180738:
                case 1660785613:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 9141) ^ (-898721806);
                        i5 = 326783423;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩵") ^ i3) * (-3);
                        i4 = ((iM55979 ^ i2) * 12245) ^ 546966416;
                        i5 = 2015156473;
                    }
                    break;
                case 1446261286:
                case 1804961845:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("֨ۜ") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * 3521) ^ (-1631673372);
                        i5 = -1589017316;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۘܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i2) * 4975) ^ (-1503346503);
                        i5 = -1710028906;
                    }
                    break;
                default:
                    ViewOnClickListenerC0939.m55941();
                    C0967.m56074();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x018c A[PHI: r10 r11 r12 r13 r14 r15 r21 r23
      0x018c: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r21v15 short[]) = (r21v13 short[]), (r21v16 short[]) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r23v10 java.lang.String) = (r23v8 java.lang.String), (r23v11 java.lang.String) binds: [B:45:0x018a, B:37:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ff A[PHI: r2 r7 r16 r21 r23
      0x02ff: PHI (r2v4 l.ܿ᩻᩷) = (r2v2 l.ܿ᩻᩷), (r2v2 l.ܿ᩻᩷), (r2v3 l.ܿ᩻᩷), (r2v2 l.ܿ᩻᩷) binds: [B:75:0x02fd, B:65:0x028b, B:41:0x0161, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:75:0x02fd, B:65:0x028b, B:41:0x0161, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x02fd, B:65:0x028b, B:41:0x0161, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r21v19 short[]) = (r21v5 short[]), (r21v7 short[]), (r21v14 short[]), (r21v20 short[]) binds: [B:75:0x02fd, B:65:0x028b, B:41:0x0161, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r23v13 java.lang.String) = (r23v0 java.lang.String), (r23v2 java.lang.String), (r23v9 java.lang.String), (r23v14 java.lang.String) binds: [B:75:0x02fd, B:65:0x028b, B:41:0x0161, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (p067l.C1404.m56468() == false) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C16496 m40502(String str) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        short[] sArr;
        int iM55681;
        int i4;
        int i5;
        int i6 = AbstractC0942.f81890;
        int i7 = C0866.f81837;
        int iM559710 = (C0946.m55979("᩷ܺ") + i6) * 7;
        int i8 = ((iM559710 ^ i7) * (-18459)) ^ 528485124;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i9 = iM559710 ^ (-753459980);
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        int i17 = 2008711583;
        int i18 = 0;
        C19179 c19179M43668 = null;
        String strM40499 = null;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * 4521) >> 31));
            switch (i17) {
                case -2137951933:
                case 368202323:
                    sArr = sArr5;
                    strM40499 = m40499();
                    if (strM40499 == null) {
                        iM55681 = C0873.m55680("ۧۡ") ^ i7;
                        i4 = ((iM55681 ^ i6) * 5105) ^ 955436146;
                        i5 = -2108693432;
                    } else {
                        iM55681 = C0873.m55680("ۤ֫") ^ i7;
                        i4 = ((iM55681 ^ i6) * (-31851)) ^ 1314918544;
                        i5 = -1788247159;
                    }
                    short[] sArr6 = sArr;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    sArr5 = sArr6;
                    break;
                case -2028915692:
                case 32680056:
                    C0854.m55595();
                    if (RunnableC1014.m56177()) {
                        int iM559711 = C0946.m55979("ܺۢ") ^ i6;
                        i9 = iM559711 ^ (-1238164038);
                        i8 = ((iM559711 ^ i7) * (-14561)) ^ (-423488576);
                    } else {
                        strM40499 = strM40499;
                        sArr5 = sArr5;
                        iM55680 = (i6 - C0946.m55979("ۖۧ")) * 9;
                        i = ((iM55680 ^ i7) * (-22833)) ^ 1652625217;
                        i2 = 12997038;
                        int i19 = iM55680 ^ i2;
                        sArr5 = sArr5;
                        i9 = i19;
                        i8 = i;
                        strM40499 = strM40499;
                    }
                    break;
                case -1978687267:
                case 2088974606:
                    ServiceConnectionC1013.m56150(c19179M43668, C0863.m55635(sArr4, i15, i16, i12), strM40499);
                    sArr5 = f82254;
                    if (C1929.m56553()) {
                        strM40499 = strM40499;
                        iM55979 = C0946.m55979("֫ܰ") ^ i7;
                        i = ((iM55979 ^ i6) * (-16819)) ^ (-1045658742);
                        i3 = 964630693;
                    } else {
                        iM55979 = C0946.m55979("᩷ۗ") ^ i6;
                        strM40499 = strM40499;
                        i = ((iM55979 ^ i7) * 9807) ^ 212362602;
                        i3 = -311821784;
                    }
                    i9 = iM55979 ^ i3;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -1915251970:
                case -1436403977:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    sArr2 = f82254;
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("֨ۨ") + i7) * 79;
                        i = ((iM55680 ^ i6) * 21009) ^ (-1031976526);
                        i2 = -1272789212;
                    } else {
                        iM55680 = (i6 - C0946.m55979("ۖۧ")) * 9;
                        i = ((iM55680 ^ i7) * (-22833)) ^ 1652625217;
                        i2 = 12997038;
                    }
                    int i110 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i110;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -1687366025:
                case -810424089:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    i11 = i18 + 105534529;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i6 - C0946.m55979("ۖۧ")) * 9;
                        i = ((iM55680 ^ i7) * (-22833)) ^ 1652625217;
                        i2 = 12997038;
                    } else {
                        iM55680 = C0873.m55680("ܶۛ") ^ i6;
                        i = ((iM55680 ^ i7) * (-16937)) ^ (-2128329153);
                        i2 = -1875857976;
                    }
                    int i111 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i111;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -1604050633:
                case -529728979:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    c19179M43668 = C19179.m43668(C0992.m56102(sArr3, i13, i14, i12));
                    if (C0854.f81826 != 0) {
                        iM55680 = (i6 - C0946.m55979("ۖۧ")) * 9;
                        i = ((iM55680 ^ i7) * (-22833)) ^ 1652625217;
                        i2 = 12997038;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ܺ۠")) * 123;
                        i = ((iM55680 ^ i6) * 30733) ^ 1197553542;
                        i2 = 1125873162;
                    }
                    int i112 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i112;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -1314106516:
                case 620236584:
                    i12 = 57609;
                    iM55680 = C0946.m55979("᩸᩷") ^ i6;
                    i = ((iM55680 ^ i7) * 5569) ^ (-1702198609);
                    i2 = -700927937;
                    int i113 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i113;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -1226668091:
                case 1070195966:
                    break;
                case -1192471871:
                case -1145024789:
                    i10 = 203;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55681 = C0946.m55979("ۜۘ") ^ i6;
                        sArr = sArr5;
                        i4 = ((iM55681 ^ i7) * (-4079)) ^ 415371655;
                        i5 = 1768140801;
                    } else {
                        sArr = sArr5;
                        iM55681 = C0873.m55680("۬ۜ") ^ i7;
                        i4 = ((iM55681 ^ i6) * (-15031)) ^ 604327629;
                        i5 = 173530701;
                    }
                    short[] sArr7 = sArr;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    sArr5 = sArr7;
                    break;
                case -1150620817:
                case -396186169:
                    i12 = 53161;
                    iM55680 = C0946.m55979("᩸᩷") ^ i6;
                    i = ((iM55680 ^ i7) * 5569) ^ (-1702198609);
                    i2 = -700927937;
                    int i114 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i114;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -1057155751:
                case 1567387281:
                    return new C16496(2);
                case -1041068769:
                case 1989154021:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    sArr4 = f82254;
                    i15 = 199;
                    i16 = 4;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ᩳ᩶") ^ i7;
                        i = ((iM55680 ^ i6) * (-24839)) ^ 1061898663;
                        i2 = 1479617652;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܰ") ^ i6) * (-49);
                        i = ((iM55680 ^ i7) * 16527) ^ 651065403;
                        i2 = 352799893;
                    }
                    int i115 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i115;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -962935762:
                case -785041342:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    s2 = 20546;
                    if (C1929.f83011 == 0) {
                        iM55680 = C0946.m55979("ۙۧ") ^ i6;
                        i = ((iM55680 ^ i7) * 19663) ^ (-301225557);
                        i2 = -1423041165;
                        int i116 = iM55680 ^ i2;
                        sArr5 = sArr5;
                        i9 = i116;
                        i8 = i;
                        strM40499 = strM40499;
                    }
                    sArr5 = sArr5;
                    iM55979 = C0946.m55979("֫ܰ") ^ i7;
                    i = ((iM55979 ^ i6) * (-16819)) ^ (-1045658742);
                    i3 = 964630693;
                    i9 = iM55979 ^ i3;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -932311896:
                case -430114749:
                    C0927.m55873();
                    C0898.m55800();
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    iM55680 = (i6 - C0946.m55979("ۖۧ")) * 9;
                    i = ((iM55680 ^ i7) * (-22833)) ^ 1652625217;
                    i2 = 12997038;
                    int i117 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i117;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -713796290:
                case 1386087299:
                    ServiceConnectionC1013.m56150(c19179M43668, C0937.m55921(sArr5, i10, 4, i12), str);
                    return c19179M43668.m43674();
                case -526813999:
                case 517726857:
                    if (C1003.f81929 <= 0) {
                        iM55681 = C0946.m55979("ۜۘ") ^ i6;
                        sArr = sArr5;
                        i4 = ((iM55681 ^ i7) * (-4079)) ^ 415371655;
                        i5 = 1768140801;
                        short[] sArr8 = sArr;
                        i9 = iM55681 ^ i5;
                        i8 = i4;
                        sArr5 = sArr8;
                    } else {
                        strM40499 = strM40499;
                        iM55979 = C0946.m55979("֫ܰ") ^ i7;
                        i = ((iM55979 ^ i6) * (-16819)) ^ (-1045658742);
                        i3 = 964630693;
                        i9 = iM55979 ^ i3;
                        i8 = i;
                        strM40499 = strM40499;
                    }
                    break;
                case -493417950:
                case 187763692:
                    C1964.m56597();
                    return null;
                case -325701579:
                case 1748832137:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    c = 189;
                    if (C0873.f81841 > 0) {
                        iM55680 = C0946.m55979("ۚ֫") ^ i6;
                        i = ((iM55680 ^ i7) * 6709) ^ 56732333;
                        i2 = 1641313059;
                        int i118 = iM55680 ^ i2;
                        sArr5 = sArr5;
                        i9 = i118;
                        i8 = i;
                        strM40499 = strM40499;
                    }
                    sArr5 = sArr5;
                    iM55979 = C0946.m55979("֫ܰ") ^ i7;
                    i = ((iM55979 ^ i6) * (-16819)) ^ (-1045658742);
                    i3 = 964630693;
                    i9 = iM55979 ^ i3;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case -249875769:
                case -41661986:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    if (i11 - (s * s2) < 0) {
                        iM55680 = (i7 - C0873.m55680("۬᩻")) * 77;
                        i = ((iM55680 ^ i6) * 19579) ^ 18068665;
                        i2 = 966808140;
                    } else {
                        iM55680 = C0873.m55680("ᩳ۠") ^ i7;
                        i = ((iM55680 ^ i6) * (-6753)) ^ (-1807594629);
                        i2 = 1682605985;
                    }
                    int i119 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i119;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                case 575237262:
                case 1246367437:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    sArr3 = f82254;
                    i13 = 190;
                    i14 = 9;
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("ᩳ᩶") ^ i7;
                        i = ((iM55680 ^ i6) * (-24839)) ^ 1061898663;
                        i2 = 1479617652;
                    } else {
                        iM55680 = (C0946.m55979("۫ۤ") + i6) * 101;
                        i = ((iM55680 ^ i7) * (-21229)) ^ 407618887;
                        i2 = -1849306117;
                    }
                    int i1110 = iM55680 ^ i2;
                    sArr5 = sArr5;
                    i9 = i1110;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
                default:
                    strM40499 = strM40499;
                    sArr5 = sArr5;
                    s = sArr2[c];
                    i18 = s * s;
                    if (AbstractC0942.f81890 > 0) {
                        iM55680 = (C0873.m55680("ܶ֨") + i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55680 ^ i6) * (-16813)) ^ 589690590;
                        i2 = 1625545038;
                        int i1111 = iM55680 ^ i2;
                        sArr5 = sArr5;
                        i9 = i1111;
                        i8 = i;
                        strM40499 = strM40499;
                    }
                    sArr5 = sArr5;
                    iM55979 = C0946.m55979("֫ܰ") ^ i7;
                    i = ((iM55979 ^ i6) * (-16819)) ^ (-1045658742);
                    i3 = 964630693;
                    i9 = iM55979 ^ i3;
                    i8 = i;
                    strM40499 = strM40499;
                    break;
            }
        }
    }

    static {
        ApplicationC14266.m56479(UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
        f82254 = new short[]{5353, 21141, 21132, 21128, 4446, -22585, -22565, -22590, -22576, -22562, -22567, -22552, -22572, -22574, -22567, -22589, -22574, -22587, -22552, -22590, -22585, -22565, -22568, -22570, -22573, -22552, 10668, 13367, -1633, -22643, -22631, -22566, -22589, -22585, -22631, -22566, -22589, -22585, -22588, -22587, -22572, -22632, -22562, -22572, -22568, -22567, -22631, -22592, -22574, -22571, -22585, -22565, -22562, -22571, -22588, -22632, -22558, -22567, -22564, -22567, -22568, -22592, -22567, -22633, -22574, -22587, -22587, -22568, -22587, -22631, -22563, -22570, -22591, -22570, -22562, -22572, -22568, -22567, -22631, -22585, -22567, -22576, -22631, -22563, -22570, -22587, -22562, -22572, -22568, -22567, -22631, -22563, -22585, -22576, -22566, -22570, -22567, -22562, -22575, -22574, -22588, -22589, -22631, -22563, -22588, -22568, -22567, -22562, -22572, -22568, -22567, -22631, -22592, -22574, -22571, -22585, -22562, -22572, -22568, -22567, -22631, -22585, -22567, -22576, -22562, -22572, -22568, -22567, -22631, -22563, -22585, -22576, -22572, -22565, -22570, -22588, -22588, -22574, -22588, -22631, -22573, -22574, -22577, -22573, -22574, -22577, -22534, -22568, -22573, -22574, -22566, -22570, -22567, -22562, -22575, -22574, -22588, -22589, -22631, -22563, -22588, -22568, -22567, 2565, 24670, 24660, 24664, 24665, 24601, 24640, 24658, 24661, 24647, 24670, 24660, 24664, 24665, 24601, 24647, 24665, 24656, 24670, 24660, 24664, 24665, 24601, 24669, 24647, 24656, 8161, -12410, -12325, -12340, -12338, -12352, -12326, -12323, -12340, -12325, -12344, -12324, -12323, -12351, -12345, -12344, -12348, -12340, 3180, -31615, -31522, -31550, -31525, -31543, -31545, -31552, -31615, -31542, -31541, -31528, -31615, -31525, -31522, -31550, -31551, -31537, -31542, -31588, -31542, -31541, -31523, -31539, -31524, -31545, -31522, -31526, -31545, -31551, -31552, -31525, -31522, -31542, -31537, -31526, -31541, -31507, -31551, -31552, -31526, -31541, -31552, -31526, -31525, -31522, -31542, -31537, -31526, -31541, -31522, -31525, -31540, -31550, -31545, -31523, -31546, -31549, -31551, -31542, -31541, -31549, -31542, -31589, 2208, -11895, -11870, -11846, -11869, -11871, -11870, -11860, -11863, -11795, -11861, -11860, -11868, -11871, -11864, -11863, -11806, -11843, -11871, -11848, -11862, -11868, -11869, -11806, -11806, -11806, -11843, -11871, -11848, -11862, -11868, -11869, -11805, -11872, -11847, -11843, -11860, -11848, -11847, -11867, 4513, -30419, -30350, -30354, -30345, -30363, -30357, -30356, -30419, -30419, -30419, -30357, -30367, -30355, -30356, -30420, -30350, -30356, -30363, 1294, -19976, -29847, -27736, -6557, -6561, -6586, -6572, -6566, -6563, -6534, -6576, -6564, -6563, -6647, -6647, 12, 15787, 15860, 15848, 15857, 15843, 15853, 15850, 15787, 15828, 15848, 15857, 15843, 15853, 15850, 15821, 15847, 15851, 15850, 15806, 15806, 15787, 15787, 15853, 15847, 15851, 15850, 15786, 15860, 15850, 15843, 3941, -1154, -1227, -1228, -1241, -1228, -1219, -1218, -1247, -1228, -1245, -1232, -1244, -1243, -1223};
        HashMap map = null;
        int i = 2136916973;
        int i2 = C1025.f81947;
        int i3 = C1053.f81965;
        int iM55680 = C0873.m55680("ۢۗ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-10241)) ^ (-1607772089);
        int i5 = 1656185582;
        while (true) {
            i = ((((i ^ i3) * (-23997)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2047068848:
                case 412204227:
                    C1036.m56259(new RunnableC25214());
                    return;
                case -1933144173:
                case -775028542:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("᩷ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11461) ^ (-492748510);
                        i5 = -1621315716;
                    } else {
                        iM55680 = C0873.m55680("᩵ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26663) ^ 860546720;
                        i5 = -672790008;
                    }
                    break;
                case -1836326426:
                case -211407475:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۤۖ")) * (-105);
                        i4 = ((iM55680 ^ i2) * 24801) ^ (-2072365814);
                        i5 = 463357730;
                    } else {
                        iM55680 = (C0946.m55979("ۧۜ") + i2) * (-31);
                        i4 = ((iM55680 ^ i3) * 10763) ^ 321609817;
                        i5 = 1195051748;
                    }
                    break;
                case -1803783401:
                case 510146522:
                    if (C0912.f81867 > 0) {
                        iM55680 = (C0946.m55979("۟᩺") ^ i2) * (-61);
                        i4 = ((iM55680 ^ i3) * 17507) ^ 1775605910;
                        i5 = 1119297659;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۤۖ")) * (-105);
                        i4 = ((iM55680 ^ i2) * 24801) ^ (-2072365814);
                        i5 = 463357730;
                    }
                    break;
                case -1775206602:
                case -926651295:
                    map = new HashMap();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("᩷ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11461) ^ (-492748510);
                        i5 = -1621315716;
                    } else {
                        iM55680 = C0873.m55680("᩵᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27133)) ^ (-1413876877);
                        i5 = 2088625299;
                    }
                    break;
                case -1659646344:
                case 254243749:
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = C0873.m55680("᩷ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11461) ^ (-492748510);
                        i5 = -1621315716;
                    } else {
                        iM55680 = C0873.m55680("֫᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29159)) ^ 1793907651;
                        i5 = 497612654;
                    }
                    break;
                case -1478355693:
                case -474408916:
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0946.m55979("᩹᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11191)) ^ 1257816192;
                        i5 = -1608313569;
                    } else {
                        iM55680 = (C0873.m55680("ܿ֡") ^ i3) * (-89);
                        i4 = ((iM55680 ^ i2) * (-845)) ^ 861885140;
                        i5 = -1108790718;
                    }
                    break;
                case -1425818126:
                case -494054401:
                    C1229.m56410();
                    C0890.m55740();
                    iM55680 = C0873.m55680("֫᩵") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-29159)) ^ 1793907651;
                    i5 = 497612654;
                    break;
                case -1397684148:
                case -105555950:
                    if (C0906.m55809() <= 0) {
                        iM55680 = (i3 - C0873.m55680("ۤۖ")) * (-105);
                        i4 = ((iM55680 ^ i2) * 24801) ^ (-2072365814);
                        i5 = 463357730;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܿ") ^ i2) * (-11);
                        i4 = ((iM55680 ^ i3) * (-13549)) ^ 1306322367;
                        i5 = -225456223;
                    }
                    break;
                case -1139483587:
                case -382731095:
                    C1012.m56134();
                    RunnableC0897.m55784();
                    throw new RuntimeException();
                case -160645277:
                case 883823665:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۤۖ")) * (-105);
                        i4 = ((iM55680 ^ i2) * 24801) ^ (-2072365814);
                        i5 = 463357730;
                    } else {
                        iM55680 = C0946.m55979("֨᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1351)) ^ 1517917172;
                        i5 = -952447625;
                    }
                    break;
                case 58377281:
                case 1985140324:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("۟᩺") ^ i2) * (-61);
                        i4 = ((iM55680 ^ i3) * 17507) ^ 1775605910;
                        i5 = 1119297659;
                    } else {
                        iM55680 = (C0946.m55979("ۨܳ") + i2) * (-25);
                        i4 = ((iM55680 ^ i3) * 2475) ^ (-1968536654);
                        i5 = -389755669;
                    }
                    break;
                case 354747939:
                case 2121227696:
                    f53210 = map;
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("᩹᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11191)) ^ 1257816192;
                        i5 = -1608313569;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7381)) ^ 245538583;
                        i5 = 751660194;
                    }
                    break;
                case 609209446:
                case 1097899121:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("֫᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29159)) ^ 1793907651;
                        i5 = 497612654;
                    } else {
                        iM55680 = (C0873.m55680("۫۟") ^ i2) * (-117);
                        i4 = ((iM55680 ^ i3) * 8621) ^ (-2096796180);
                        i5 = 723179856;
                    }
                    break;
                case 1210221337:
                case 1849179487:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("֫᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29159)) ^ 1793907651;
                        i5 = 497612654;
                    } else {
                        iM55680 = C0873.m55680("᩶ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-607)) ^ (-387594083);
                        i5 = 221356761;
                    }
                    break;
                default:
                    RunnableC1014.m56177();
                    if (!C0927.f81875) {
                        iM55680 = C0873.m55680("᩷ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11461) ^ (-492748510);
                        i5 = -1621315716;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۤۖ")) * (-105);
                        i4 = ((iM55680 ^ i2) * 24801) ^ (-2072365814);
                        i5 = 463357730;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:67:0x0232 A[PHI: r5 r11
      0x0232: PHI (r5v4 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:66:0x0230, B:39:0x0131, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r11v4 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:66:0x0230, B:39:0x0131, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0264 A[PHI: r1 r6 r7
      0x0264: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v3 long) binds: [B:70:0x0262, B:62:0x0212, B:58:0x01f1, B:22:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:70:0x0262, B:62:0x0212, B:58:0x01f1, B:22:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:70:0x0262, B:62:0x0212, B:58:0x01f1, B:22:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02b2 A[PHI: r3 r4 r9 r10
      0x02b2: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:78:0x02b0, B:74:0x0290, B:43:0x014f, B:15:0x0062, B:13:0x005e, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:78:0x02b0, B:74:0x0290, B:43:0x014f, B:15:0x0062, B:13:0x005e, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r9v3 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:78:0x02b0, B:74:0x0290, B:43:0x014f, B:15:0x0062, B:13:0x005e, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:78:0x02b0, B:74:0x0290, B:43:0x014f, B:15:0x0062, B:13:0x005e, B:6:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static String m40499() {
        int iM55680;
        int i;
        int i2;
        long jM55013 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1659528982;
        int i9 = AbstractC0942.f81890;
        int i10 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("ܰ֫") ^ i10;
        int i11 = ((iM55979 ^ i9) * 22045) ^ 1172385634;
        int i12 = iM55979 ^ 2099482353;
        C25065 c25065M9846 = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid) >> 31));
            switch (i8) {
                case -2118579909:
                case -204053749:
                    jM55013 = c25065M9846.m55013();
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0946.m55979("ܺܶ") + i10) * 45;
                        i = ((iM55680 ^ i9) * 1061) ^ (-338759551);
                        i2 = 1111615167;
                    } else {
                        iM55680 = C0946.m55979("۟ۖ") ^ i9;
                        i = ((iM55680 ^ i10) * 5613) ^ (-1096865386);
                        i2 = -220171846;
                    }
                    int i13 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i13;
                    break;
                case -2113860996:
                case 2134738528:
                    i5 = 54933;
                    iM55680 = (C0873.m55680("᩻ᩴ") ^ i10) * (-107);
                    i = ((iM55680 ^ i9) * (-9541)) ^ (-598478803);
                    i2 = -2016972072;
                    int i14 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i14;
                    break;
                case -1848336390:
                case 1542002160:
                    sArr = f82254;
                    c = 0;
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("֡۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-7583)) ^ 498858044;
                        i2 = 425394776;
                    } else {
                        iM55680 = C0873.m55680("ۛ᩵") ^ i10;
                        i = ((iM55680 ^ i9) * 29487) ^ 1871718281;
                        i2 = 512822817;
                    }
                    int i15 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i15;
                    break;
                case -1538644498:
                case 741551660:
                    f53212 = jM55013 - C0240c.f1145a;
                    iM55680 = C0873.m55680("۟۬") ^ i10;
                    i = ((iM55680 ^ i9) * 30421) ^ (-723901358);
                    i2 = -1337723656;
                    int i16 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i16;
                    break;
                case -1428353459:
                case -135392875:
                    i7 = 3;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("ۖܳ") ^ i10) * (-23);
                        i = ((iM55680 ^ i9) * 14587) ^ 115740112;
                        i2 = -1753411076;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩹") ^ i10;
                        i = ((iM55680 ^ i9) * (-26739)) ^ 1717441984;
                        i2 = -749071978;
                    }
                    int i17 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i17;
                    break;
                case -1337712703:
                case 1555356261:
                    return f53211;
                case -1201967909:
                case -173543038:
                    f53211 = null;
                    iM55680 = C0873.m55680("۟۬") ^ i10;
                    i = ((iM55680 ^ i9) * 30421) ^ (-723901358);
                    i2 = -1337723656;
                    int i18 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i18;
                    break;
                case -949490557:
                case 1320515528:
                    if (f53212 < ViewOnClickListenerC0939.m55944()) {
                        iM55680 = C0946.m55979("᩷ᩳ") ^ i9;
                        i = ((iM55680 ^ i10) * (-779)) ^ 2128955848;
                        i2 = -1260416190;
                    } else {
                        iM55680 = C0873.m55680("۟۬") ^ i10;
                        i = ((iM55680 ^ i9) * 30421) ^ (-723901358);
                        i2 = -1337723656;
                    }
                    int i19 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i19;
                    break;
                case -847414668:
                case 1341208753:
                    C0854.m55595();
                    C0890.m55740();
                    return null;
                case -608843216:
                case 1712586442:
                    s = sArr[c];
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0946.m55979("ۖܳ") ^ i10) * (-23);
                        i = ((iM55680 ^ i9) * 14587) ^ 115740112;
                        i2 = -1753411076;
                    } else {
                        iM55680 = (C0873.m55680("ܶۘ") ^ i9) * 119;
                        i = ((iM55680 ^ i10) * 16403) ^ (-1569377217);
                        i2 = 1884559757;
                    }
                    int i110 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i110;
                    break;
                case -581432699:
                case -228190805:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("֡۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-7583)) ^ 498858044;
                        i2 = 425394776;
                    } else {
                        iM55680 = (C0946.m55979("ۚᩳ") + i9) * 67;
                        i = ((iM55680 ^ i10) * 809) ^ (-1359170682);
                        i2 = -1474079136;
                    }
                    int i111 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i111;
                    break;
                case -508528946:
                case 1288928216:
                    C1124.m56367();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("֡۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-7583)) ^ 498858044;
                        i2 = 425394776;
                    } else {
                        iM55680 = C0873.m55680("ۘۨ") ^ i9;
                        i = ((iM55680 ^ i10) * (-6243)) ^ 1263264077;
                        i2 = 1808167145;
                    }
                    int i112 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i112;
                    break;
                case -495562211:
                case 2143563566:
                    sArr2 = f82254;
                    i6 = 1;
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("֡۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-7583)) ^ 498858044;
                        i2 = 425394776;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ۨܺ")) * 3;
                        i = ((iM55680 ^ i10) * 22707) ^ (-1077919647);
                        i2 = -200079610;
                    }
                    int i113 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i113;
                    break;
                case -451007232:
                case 962801178:
                    i3 = s * 69844;
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0946.m55979("ܺܶ") + i10) * 45;
                        i = ((iM55680 ^ i9) * 1061) ^ (-338759551);
                        i2 = 1111615167;
                    } else {
                        iM55680 = (C0873.m55680("֫᩻") + i9) * 47;
                        i = ((iM55680 ^ i10) * 27461) ^ 1219395016;
                        i2 = -1914616644;
                    }
                    int i114 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i114;
                    break;
                case -436261757:
                case 657771673:
                    C0882.m55710();
                    if (C1003.m56123() != 0) {
                        iM55680 = C0873.m55680("ۘۨ") ^ i9;
                        i = ((iM55680 ^ i10) * (-6243)) ^ 1263264077;
                        i2 = 1808167145;
                    } else {
                        iM55680 = C0873.m55680("ۡܽ") ^ i10;
                        i = ((iM55680 ^ i9) * (-24171)) ^ 449965357;
                        i2 = -1608232236;
                    }
                    int i115 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i115;
                    break;
                case 113329268:
                case 2131086582:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ܺܶ") + i10) * 45;
                        i = ((iM55680 ^ i9) * 1061) ^ (-338759551);
                        i2 = 1111615167;
                    } else {
                        iM55680 = C0946.m55979("ᩳܺ") ^ i10;
                        i = ((iM55680 ^ i9) * (-29477)) ^ 90731686;
                        i2 = 927007847;
                    }
                    int i116 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i116;
                    break;
                case 182726431:
                case 1201147434:
                    i5 = 21208;
                    iM55680 = (C0873.m55680("᩻ᩴ") ^ i10) * (-107);
                    i = ((iM55680 ^ i9) * (-9541)) ^ (-598478803);
                    i2 = -2016972072;
                    int i117 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i117;
                    break;
                case 233784920:
                case 1092704464:
                    f53211 = ViewOnClickListenerC0939.m55952(c25065M9846);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ۘۨ") ^ i9;
                        i = ((iM55680 ^ i10) * (-6243)) ^ 1263264077;
                        i2 = 1808167145;
                    } else {
                        iM55680 = (i9 - C0946.m55979("ܰۗ")) * (-27);
                        i = ((iM55680 ^ i10) * 16601) ^ (-1030351508);
                        i2 = 1570905335;
                    }
                    int i118 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i118;
                    break;
                case 324038737:
                case 1068309824:
                    c25065M9846 = C4654.m9846(RunnableC0938.m55936(sArr2, i6, i7, i5));
                    if (C0930.m55892(c25065M9846)) {
                        iM55680 = C0946.m55979("ۛۜ") ^ i10;
                        i = ((iM55680 ^ i9) * 19415) ^ (-1103730410);
                        i2 = -518494135;
                    } else {
                        iM55680 = (C0873.m55680("ܰ᩶") + i10) * 53;
                        i = ((iM55680 ^ i9) * 30455) ^ (-1053722574);
                        i2 = -97609172;
                    }
                    int i119 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i119;
                    break;
                case 377960286:
                case 1200667256:
                    if ((i4 * i4) - i3 >= 0) {
                        iM55680 = (i10 - C0873.m55680("ۙ۫")) * (-19);
                        i = ((iM55680 ^ i9) * (-11267)) ^ (-452314524);
                        i2 = 1665999481;
                    } else {
                        iM55680 = C0946.m55979("֫ۖ") ^ i9;
                        i = ((iM55680 ^ i10) * (-21639)) ^ 206389412;
                        i2 = 697810792;
                    }
                    int i1110 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i1110;
                    break;
                case 582469065:
                case 668496747:
                    C0890.m55740();
                    iM55680 = C0946.m55979("֡۫") ^ i9;
                    i = ((iM55680 ^ i10) * (-7583)) ^ 498858044;
                    i2 = 425394776;
                    int i1111 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i1111;
                    break;
                case 619825416:
                case 1687434081:
                    i4 = s + 17461;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("ܺܶ") + i10) * 45;
                        i = ((iM55680 ^ i9) * 1061) ^ (-338759551);
                        i2 = 1111615167;
                    } else {
                        iM55680 = (C0946.m55979("᩷᩷") + i10) * 9;
                        i = ((iM55680 ^ i9) * 14013) ^ (-2102310559);
                        i2 = 323345576;
                    }
                    int i1112 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i1112;
                    break;
                case 1337288578:
                case 1920025093:
                    if (f53211 != null) {
                        iM55680 = C0873.m55680("ۙ᩹") ^ i9;
                        i = ((iM55680 ^ i10) * 23239) ^ 1292548846;
                        i2 = -1848799808;
                    } else {
                        iM55680 = C0946.m55979("᩷ᩳ") ^ i9;
                        i = ((iM55680 ^ i10) * (-779)) ^ 2128955848;
                        i2 = -1260416190;
                    }
                    int i1113 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i1113;
                    break;
                default:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("֡۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-7583)) ^ 498858044;
                        i2 = 425394776;
                    } else {
                        iM55680 = (C0946.m55979("ۖܳ") ^ i10) * (-23);
                        i = ((iM55680 ^ i9) * 14587) ^ 115740112;
                        i2 = -1753411076;
                    }
                    int i1114 = i;
                    i12 = iM55680 ^ i2;
                    i11 = i1114;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40510() {
        f53211 = null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01c3 A[PHI: r11 r12
      0x01c3: PHI (r11v5 int) = (r11v3 int), (r11v2 int) binds: [B:53:0x01c1, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r12v5 short) = (r12v3 short), (r12v2 short) binds: [B:53:0x01c1, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fa A[PHI: r2 r10 r13 r23
      0x01fa: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:57:0x01f8, B:49:0x01a3, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:57:0x01f8, B:49:0x01a3, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:57:0x01f8, B:49:0x01a3, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r23v5 int) = (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:57:0x01f8, B:49:0x01a3, B:30:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0230 A[PHI: r3 r5 r6 r8 r15 r18
      0x0230: PHI (r3v4 l.ܿ᩻᩷) = (r3v2 l.ܿ᩻᩷), (r3v2 l.ܿ᩻᩷), (r3v3 l.ܿ᩻᩷), (r3v2 l.ܿ᩻᩷), (r3v2 l.ܿ᩻᩷) binds: [B:61:0x022e, B:34:0x00fb, B:26:0x00b9, B:16:0x0076, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:61:0x022e, B:34:0x00fb, B:26:0x00b9, B:16:0x0076, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:61:0x022e, B:34:0x00fb, B:26:0x00b9, B:16:0x0076, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:61:0x022e, B:34:0x00fb, B:26:0x00b9, B:16:0x0076, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:61:0x022e, B:34:0x00fb, B:26:0x00b9, B:16:0x0076, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:61:0x022e, B:34:0x00fb, B:26:0x00b9, B:16:0x0076, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0263 A[PHI: r4 r7
      0x0263: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:65:0x0261, B:22:0x0097, B:14:0x0072, B:11:0x006c, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:65:0x0261, B:22:0x0097, B:14:0x0072, B:11:0x006c, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0297 A[PHI: r16 r17
      0x0297: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:69:0x0295, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:69:0x0295, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static C16496 m40509() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0877.f81843;
        int i4 = C1012.f81938;
        int iM559710 = (C0946.m55979("ᩴ۠") + i3) * 49;
        int i5 = ((iM559710 ^ i4) * (-15331)) ^ 456179711;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM559710 ^ 227212975;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s3 = 0;
        int i13 = 935510617;
        int i14 = 0;
        String strM56235 = null;
        C19179 c19179M43668 = null;
        String strM56584 = null;
        String strM40499 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-1623)) >> 31));
            switch (i13) {
                case -1842779917:
                case -768808111:
                    strM40499 = m40499();
                    if (strM40499 == null) {
                        iM55979 = (i4 - C0873.m55680("ۢ᩷")) * (-23);
                        i = ((iM55979 ^ i3) * (-20919)) ^ (-1974360434);
                        i2 = 769108561;
                    } else {
                        iM55979 = C0946.m55979("ۖܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-26873)) ^ (-1065696931);
                        i2 = -977925141;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1351973720:
                case 1734742708:
                    c19179M43668 = C19179.m43668(strM56584);
                    sArr3 = f82254;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("ܿۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 20955) ^ 722305988;
                        i2 = 562150830;
                    } else {
                        iM55979 = C0946.m55979("᩹᩹") ^ i3;
                        i = ((iM55979 ^ i4) * (-10647)) ^ 151547350;
                        i2 = -1644553198;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1345437642:
                case 1139182434:
                    C1124.m56367();
                    C0946.m55980();
                    return null;
                case -1293071885:
                case -894260106:
                    i11 = s + s2;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("ۗܰ") ^ i3;
                        i = ((iM55979 ^ i4) * 28849) ^ (-122837658);
                        i2 = 938511675;
                    } else {
                        iM55979 = C0873.m55680("֫ܺ") ^ i4;
                        i = ((iM55979 ^ i3) * 28153) ^ (-1908967503);
                        i2 = -1511254538;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1178645473:
                case 1554524981:
                    C1071.m56343();
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۢܰ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4305)) ^ 281438318;
                        i2 = 1227505443;
                    } else {
                        iM55979 = C0946.m55979("᩺ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-15705)) ^ 528828195;
                        i2 = -757246426;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1114136889:
                case 1889700836:
                    sArr2 = f82254;
                    i7 = 378;
                    i8 = 10;
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("ܿۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 20955) ^ 722305988;
                        i2 = 562150830;
                    } else {
                        iM55979 = C0873.m55680("ۗۨ") ^ i3;
                        i = ((iM55979 ^ i4) * 21607) ^ (-658443016);
                        i2 = -812463692;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -949618256:
                case 133897099:
                    C0967.m56074();
                    C0937.m55918();
                    iM55979 = C0873.m55680("ܿۤ") ^ i3;
                    i = ((iM55979 ^ i4) * 20955) ^ 722305988;
                    i2 = 562150830;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -843751289:
                case 156181595:
                    s3 = 2;
                    if (C1404.m56468()) {
                        iM55979 = C0873.m55680("֡ۨ") ^ i3;
                        i = ((iM55979 ^ i4) * (-10251)) ^ (-166539892);
                        i2 = -1680630617;
                    } else {
                        iM55979 = C0873.m55680("ܿۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 20955) ^ 722305988;
                        i2 = 562150830;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -654927255:
                case 647025805:
                    i12 = 21970;
                    iM55979 = (C0873.m55680("۠ۗ") ^ i3) * (-43);
                    i = ((iM55979 ^ i4) * (-8727)) ^ (-990042232);
                    i2 = -894007581;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -651451468:
                case 1483701916:
                    s = sArr[c];
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0873.m55680("ۢܰ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4305)) ^ 281438318;
                        i2 = 1227505443;
                    } else {
                        iM55979 = (C0946.m55979("֨ۖ") ^ i4) * (-57);
                        i = ((iM55979 ^ i3) * 27369) ^ (-264764589);
                        i2 = 1675778349;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -459468841:
                case -36491140:
                    if (C0877.f81843 < 0) {
                        iM55979 = C0873.m55680("ܿۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 20955) ^ 722305988;
                        i2 = 562150830;
                    } else {
                        iM55979 = C0873.m55680("ۢܰ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4305)) ^ 281438318;
                        i2 = 1227505443;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -320420922:
                case 1216923359:
                    i12 = 64337;
                    iM55979 = (C0873.m55680("۠ۗ") ^ i3) * (-43);
                    i = ((iM55979 ^ i4) * (-8727)) ^ (-990042232);
                    i2 = -894007581;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -145666517:
                case 362558429:
                    i14 = s * s3;
                    i9 = 1;
                    if (C0892.m55749()) {
                        iM55979 = (C0873.m55680("ۖ᩻") ^ i4) * (-31);
                        i = ((iM55979 ^ i3) * (-31953)) ^ (-224587141);
                        i2 = 1562223189;
                    } else {
                        iM55979 = C0946.m55979("ۗܰ") ^ i3;
                        i = ((iM55979 ^ i4) * 28849) ^ (-122837658);
                        i2 = 938511675;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -26185628:
                case 330713391:
                    strM56235 = C1028.m56235(sArr3, 388, 4, i12);
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("ۢܰ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4305)) ^ 281438318;
                        i2 = 1227505443;
                    } else {
                        iM55979 = C0873.m55680("ۗۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 16971) ^ 2124249943;
                        i2 = -460986370;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 178386131:
                case 1331931640:
                    i10 = i14 + i9;
                    s2 = 1;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("᩺ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-15705)) ^ 528828195;
                        i2 = -757246426;
                    } else {
                        iM55979 = (C0873.m55680("ܺۢ") ^ i3) * 7;
                        i = ((iM55979 ^ i4) * (-8991)) ^ 2015537342;
                        i2 = 1455596352;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 284751921:
                case 2050255498:
                    if ((i11 * i11) - i10 < 0) {
                        iM55979 = (i3 - C0873.m55680("۬ۡ")) * (-75);
                        i = ((iM55979 ^ i4) * 14093) ^ 963270276;
                        i2 = 1770319429;
                    } else {
                        iM55979 = C0873.m55680("ۘ۫") ^ i4;
                        i = ((iM55979 ^ i3) * (-8705)) ^ 1044733123;
                        i2 = 1509049341;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 755516708:
                case 1368483387:
                    C1044.m56278(c19179M43668, strM56235, strM40499);
                    return c19179M43668.m43674();
                case 810072086:
                case 2049661572:
                    sArr = f82254;
                    c = 377;
                    if (C0955.f81898) {
                        iM55979 = (i4 - C0946.m55979("ᩴۘ")) * 23;
                        i = ((iM55979 ^ i3) * 13133) ^ (-1153187610);
                        i2 = -1185229216;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩵۠")) * 55;
                        i = ((iM55979 ^ i4) * 12431) ^ 474496834;
                        i2 = -903638462;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 826867870:
                case 1741305504:
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ۢܰ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4305)) ^ 281438318;
                        i2 = 1227505443;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ᩴۘ")) * 23;
                        i = ((iM55979 ^ i3) * 13133) ^ (-1153187610);
                        i2 = -1185229216;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1105004888:
                case 1776944764:
                    strM56584 = C1964.m56584(sArr2, i7, i8, i12);
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("ܺۛ") ^ i4;
                        i = ((iM55979 ^ i3) * 10183) ^ (-757311536);
                        i2 = -764235907;
                    } else {
                        iM55979 = C0946.m55979("ۗܰ") ^ i3;
                        i = ((iM55979 ^ i4) * 28849) ^ (-122837658);
                        i2 = 938511675;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    return new C16496(2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x03ed A[PHI: r8 r11 r23 r51 r55
      0x03ed: PHI (r8v77 android.graphics.Bitmap) = (r8v66 android.graphics.Bitmap), (r8v71 android.graphics.Bitmap), (r8v78 android.graphics.Bitmap) binds: [B:90:0x03d6, B:74:0x032f, B:48:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r11v75 java.lang.String) = (r11v61 java.lang.String), (r11v65 java.lang.String), (r11v79 java.lang.String) binds: [B:90:0x03d6, B:74:0x032f, B:48:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r23v75 java.lang.String) = (r23v64 java.lang.String), (r23v68 java.lang.String), (r23v78 java.lang.String) binds: [B:90:0x03d6, B:74:0x032f, B:48:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r51v81 byte[]) = (r51v71 byte[]), (r51v75 byte[]), (r51v82 byte[]) binds: [B:90:0x03d6, B:74:0x032f, B:48:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x03ed: PHI (r55v62 int) = (r55v54 int), (r55v58 int), (r55v63 int) binds: [B:90:0x03d6, B:74:0x032f, B:48:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C11804 m40501(C19561 c19561) throws Throwable {
        int i;
        int i2;
        BitmapFactory.Options options;
        int i3;
        int i4;
        int iM55680;
        int i5;
        int i6;
        BitmapFactory.Options options2;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM55681;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int iM55682;
        int i15;
        int iM55979;
        int i16;
        BitmapFactory.Options options3;
        int i17;
        int i18;
        int iM559710;
        int i19;
        int i20;
        byte[] bArr;
        BitmapFactory.Options options4;
        int iM559711;
        int i21;
        int i22;
        int i23;
        int i24;
        int iM559712;
        int i25;
        int iM559713;
        int i26;
        int i27;
        int i28;
        int iM55683;
        int i29;
        byte[] byteArray;
        Bitmap bitmapDecodeByteArray = null;
        Bitmap bitmap = null;
        Bitmap.CompressFormat compressFormat = null;
        Throwable th = null;
        boolean zCompress = false;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        boolean zM55949 = false;
        long j = 0;
        boolean zM55806 = false;
        long jMax = 0;
        C11804 c11804M27054 = null;
        boolean zCompress2 = false;
        C11804 c11804M27055 = null;
        C11804 c11804M27056 = null;
        int i30 = 2133507672;
        int i31 = C1017.f81942;
        int i32 = C0894.f81854;
        int iM559714 = (C0946.m55979("᩵֨") + i31) * 39;
        int i33 = ((iM559714 ^ i32) * 27875) ^ (-1592163983);
        int i34 = iM559714 ^ (-1904877714);
        C5738 c5738M56013 = null;
        byte[] bArr4 = null;
        byte[] bArrM56127 = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] byteArray2 = null;
        String strM56241 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        Bitmap.CompressFormat compressFormat2 = null;
        byte[] bArr5 = null;
        int i35 = 0;
        int length = 0;
        int length2 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        boolean zM55807 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        String strM55970 = null;
        C5738 c5738M56014 = null;
        BitmapFactory.Options options5 = null;
        boolean z = false;
        String strM55597 = null;
        C11804 c11804 = null;
        String str2 = null;
        int i45 = 0;
        while (true) {
            i30 = i34 ^ (i33 & (((i30 ^ i32) * (-5271)) >> 31));
            switch (i30) {
                case -2121362527:
                case -1060977182:
                    compressFormat2 = Bitmap.CompressFormat.PNG;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    iM559713 = C0946.m55979("۟ᩴ") ^ i31;
                    i26 = ((iM559713 ^ i32) * (-31719)) ^ 229466396;
                    i27 = -678835857;
                    i28 = iM559713 ^ i27;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i28;
                    i33 = i26;
                    break;
                case -2113479683:
                case 99124276:
                    bitmap.recycle();
                    return c11804M27054;
                case -2110843243:
                case -1528098360:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    int i46 = i40;
                    options5 = options5;
                    i42 = i42;
                    i10 = i43;
                    strM55597 = strM55597;
                    i40 = i46;
                    i9 = i44;
                    strM55970 = AbstractC0942.m55970(f82254, 181, 8, i9);
                    if (c5738M56013 == null) {
                        iM55979 = (C0946.m55979("ܶ᩹") ^ i31) * 7;
                        i11 = ((iM55979 ^ i32) * (-24357)) ^ (-1065511767);
                        i16 = -1268070381;
                    } else {
                        c5738M56014 = c5738M56013;
                        iM55979 = (C0873.m55680("ۡܿ") ^ i31) * 95;
                        i11 = ((iM55979 ^ i32) * 8095) ^ 260241750;
                        i16 = 842720371;
                    }
                    i13 = iM55979 ^ i16;
                    i44 = i9;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i47 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i47;
                    break;
                case -2100687225:
                case -532929073:
                    bitmap.recycle();
                    return c11804;
                case -2084468593:
                case -901235534:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options3 = options5;
                    i43 = i43;
                    strM55597 = strM55597;
                    if (i42 > 0) {
                        iM559710 = (C0946.m55979("۫ܳ") + i31) * (-53);
                        i19 = ((iM559710 ^ i32) * (-32463)) ^ 127593869;
                        i20 = -513982470;
                        i22 = iM559710 ^ i20;
                        options5 = options3;
                        i43 = i43;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i22;
                        i33 = i19;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    } else {
                        i43 = i43;
                        i42 = i42;
                        int iM559715 = C0946.m55979("᩶ܿ") ^ i32;
                        i23 = ((iM559715 ^ i31) * (-8889)) ^ 348525543;
                        i24 = iM559715 ^ 29793352;
                        strM55597 = strM55597;
                        options5 = options3;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case -2077182597:
                case -983130551:
                    i35 = i35;
                    i8 = i41;
                    i = i42;
                    options = options5;
                    options.inSampleSize = i8;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    i38 = i;
                    bArr3 = bArr4;
                    i36 = i40;
                    iM55680 = (C0873.m55680("֫ۢ") + i32) * (-75);
                    i41 = i8;
                    i5 = ((iM55680 ^ i31) * 19409) ^ 36004958;
                    i6 = 1427730257;
                    int i48 = iM55680 ^ i6;
                    options5 = options;
                    strM55597 = strM55597;
                    i43 = i43;
                    i42 = i;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i35 = i35;
                    i34 = i48;
                    i33 = i5;
                    str2 = str2;
                    break;
                case -2057891721:
                case 1923565463:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    options3 = options5;
                    strM55597 = strM55597;
                    BitmapFactory.Options options6 = new BitmapFactory.Options();
                    options6.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArrM56127, 0, bArrM56127.length, options6);
                    i40 = options6.outWidth;
                    int i49 = options6.outHeight;
                    if (i40 > 0) {
                        int iM559716 = C0946.m55979("֫ۛ") ^ i32;
                        i42 = i49;
                        i33 = ((iM559716 ^ i31) * (-9961)) ^ (-1732624344);
                        strM55597 = strM55597;
                        options5 = options3;
                        i35 = i35;
                        i43 = 0;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = iM559716 ^ 247020406;
                        i41 = 1;
                    } else {
                        i42 = i49;
                        i41 = 1;
                        i43 = 0;
                        int iM559717 = C0946.m55979("᩶ܿ") ^ i32;
                        i23 = ((iM559717 ^ i31) * (-8889)) ^ 348525543;
                        i24 = iM559717 ^ 29793352;
                        strM55597 = strM55597;
                        options5 = options3;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case -2013110167:
                case -851526558:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    if (j < jMax) {
                        i35 = i35;
                        str2 = str2;
                        strM55597 = strM55597;
                        iM559712 = C0873.m55680("ۨۤ") ^ i32;
                        i23 = ((iM559712 ^ i31) * 22241) ^ 776135581;
                        i25 = 1476320359;
                        i24 = iM559712 ^ i25;
                        str2 = str2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    } else {
                        iM559713 = C0946.m55979("᩸۟") ^ i32;
                        i26 = ((iM559713 ^ i31) * 17077) ^ (-18929178);
                        i27 = 65073414;
                        i28 = iM559713 ^ i27;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i28;
                        i33 = i26;
                    }
                    break;
                case -1965951818:
                case -389321685:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    if (zCompress) {
                        iM559712 = (i32 - C0946.m55979("᩶᩵")) * 19;
                        i23 = ((iM559712 ^ i31) * 29593) ^ 1827968202;
                        i25 = -601609623;
                    } else {
                        byteArray2 = bArr2;
                        iM559712 = C0946.m55979("ܰ۟") ^ i31;
                        i23 = ((iM559712 ^ i32) * 14687) ^ 1893723101;
                        i25 = 1720878863;
                    }
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -1933729112:
                case -1265271191:
                    return c11804;
                case -1924565003:
                case 886765426:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    zM55806 = C0906.m55806(strM55597, strM56241);
                    iM559713 = C0946.m55979("᩶ᩴ") ^ i32;
                    i26 = ((iM559713 ^ i31) * (-8635)) ^ (-2017558883);
                    i27 = 1183588161;
                    i28 = iM559713 ^ i27;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i28;
                    i33 = i26;
                    break;
                case -1914489480:
                case -1131323204:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    strM56241 = C1028.m56241(c5738M56014);
                    zM55949 = ViewOnClickListenerC0939.m55949(strM55970, strM56241);
                    iM559712 = C0946.m55979("ۖᩴ") ^ i32;
                    i23 = ((iM559712 ^ i31) * 16499) ^ (-2141971962);
                    i25 = -1305489876;
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -1902391544:
                case -704121606:
                    c11804M27054 = C11804.m27054(str2, byteArray2);
                    iM55683 = (i32 - C0873.m55680("ᩴ۬")) * (-127);
                    i26 = ((iM55683 ^ i31) * (-9577)) ^ (-106751868);
                    i29 = 1359563276;
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                case -1883864331:
                case 636581136:
                    i10 = i43;
                    i44 = 24631;
                    int iM559718 = C0946.m55979("۠᩷") ^ i32;
                    i11 = ((iM559718 ^ i31) * 23611) ^ 157630555;
                    i13 = iM559718 ^ (-608774185);
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i410 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i410;
                    break;
                case -1835087896:
                case -1453890690:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i42 = i42;
                    i43 = i43;
                    strM55597 = strM55597;
                    options4 = options5;
                    i40 = i40;
                    if (!zM55807) {
                        options3 = options4;
                        iM559710 = C0946.m55979("ܳ֨") ^ i32;
                        i19 = ((iM559710 ^ i31) * 8261) ^ 927489294;
                        i20 = -1789688861;
                        i22 = iM559710 ^ i20;
                        options5 = options3;
                        i43 = i43;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i22;
                        i33 = i19;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    } else {
                        i43 = i43;
                        i42 = i42;
                        options3 = options4;
                        int iM559719 = C0946.m55979("᩶ܿ") ^ i32;
                        i23 = ((iM559719 ^ i31) * (-8889)) ^ 348525543;
                        i24 = iM559719 ^ 29793352;
                        strM55597 = strM55597;
                        options5 = options3;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case -1789636868:
                case 204687001:
                    if (byteArray2 != null) {
                        iM55683 = (C0946.m55979("ᩴᩳ") ^ i31) * (-121);
                        i26 = ((iM55683 ^ i32) * (-735)) ^ (-1224469929);
                        i29 = 1971615184;
                    } else {
                        iM55683 = (i31 - C0873.m55680("ᩴܺ")) * 53;
                        i26 = ((iM55683 ^ i32) * (-25945)) ^ 471123459;
                        i29 = -395424941;
                    }
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                case -1689446528:
                case 231278769:
                    c11804M27056 = C11804.m27054(C1028.m56241(c5738M56014), bArr5);
                    iM55683 = C0873.m55680("ܰᩴ") ^ i32;
                    i26 = ((iM55683 ^ i31) * (-31239)) ^ 1057551587;
                    i29 = 1080032864;
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                case -1678179782:
                case 1062675739:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    if (zM55949) {
                        iM559712 = C0873.m55680("᩷ۙ") ^ i31;
                        i23 = ((iM559712 ^ i32) * 2211) ^ 1507261341;
                        i25 = -1140842387;
                    } else {
                        iM559712 = C0946.m55979("ܰ۫") ^ i32;
                        i23 = ((iM559712 ^ i31) * 26297) ^ (-168097441);
                        i25 = 3249959;
                    }
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -1663588270:
                case 2122643938:
                    bitmap.recycle();
                    return c11804;
                case -1550998281:
                case -1109762935:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    byteArray2 = byteArrayOutputStream.toByteArray();
                    iM559712 = C0946.m55979("ܰ۟") ^ i31;
                    i23 = ((iM559712 ^ i32) * 14687) ^ 1893723101;
                    i25 = 1720878863;
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -1418542813:
                case 86427054:
                    try {
                        c11804M27055 = C11804.m27054(str2, byteArray2);
                        iM55683 = C0946.m55979("۟۠") ^ i32;
                        i26 = ((iM55683 ^ i31) * (-25813)) ^ 772705872;
                        i29 = 1427090495;
                        i34 = iM55683 ^ i29;
                        i33 = i26;
                    } catch (Throwable th2) {
                        th = th2;
                        bArr5 = bArr5;
                        bitmap = bitmap;
                        strM55597 = strM55597;
                        iM559712 = (C0946.m55979("ܽܺ") + i32) * (-49);
                        i23 = ((iM559712 ^ i31) * 5953) ^ 1204586206;
                        i25 = -952447087;
                        i24 = iM559712 ^ i25;
                        str2 = str2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case -1395922683:
                case 752905803:
                    bitmap.recycle();
                    throw th;
                case -1390454588:
                case -1241766759:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i = i42;
                    i2 = i43;
                    strM55597 = strM55597;
                    options = options5;
                    if (i <= i45) {
                        bArr2 = bArr4;
                        iM55680 = (i31 - C0873.m55680("ۡܺ")) * 83;
                        i43 = i2;
                        i5 = ((iM55680 ^ i32) * 15819) ^ 1035339000;
                        i6 = -1391265336;
                        int i411 = iM55680 ^ i6;
                        options5 = options;
                        strM55597 = strM55597;
                        i43 = i43;
                        i42 = i;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i35 = i35;
                        i34 = i411;
                        i33 = i5;
                        str2 = str2;
                    } else {
                        i3 = i2;
                        options5 = options;
                        i4 = i40;
                        iM559711 = (C0946.m55979("ܿ֨") ^ i32) * 33;
                        i19 = ((iM559711 ^ i31) * 22003) ^ (-1757156180);
                        i21 = -101459607;
                        i22 = iM559711 ^ i21;
                        i40 = i4;
                        str2 = str2;
                        i43 = i3;
                        i42 = i;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i22;
                        i33 = i19;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    }
                    break;
                case -1336049255:
                case -173933269:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    long j2 = length2;
                    i35 = i35;
                    j = j2 - ((long) length);
                    try {
                        jMax = Math.max((j2 + 19) / 20, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                        iM559712 = (i32 - C0873.m55680("ۚ᩺")) * 43;
                        i23 = ((iM559712 ^ i31) * 28101) ^ (-993510874);
                        i25 = 238974305;
                    } catch (Throwable th3) {
                        th = th3;
                        iM559712 = (C0946.m55979("ܽܺ") + i32) * (-49);
                        i23 = ((iM559712 ^ i31) * 5953) ^ 1204586206;
                        i25 = -952447087;
                    }
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -1221890326:
                case 1582659267:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    if (byteArray2 != null) {
                        iM559712 = C0946.m55979("ۘܽ") ^ i31;
                        i23 = ((iM559712 ^ i32) * (-15007)) ^ (-1822022133);
                        i25 = 419498812;
                    } else {
                        iM559712 = C0873.m55680("ۨۤ") ^ i32;
                        i23 = ((iM559712 ^ i31) * 22241) ^ 776135581;
                        i25 = 1476320359;
                    }
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -927409133:
                case 572813470:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    length2 = bArrM56127.length;
                    length = byteArray2.length;
                    iM559712 = C0873.m55680("ۢ۫") ^ i31;
                    i23 = ((iM559712 ^ i32) * 28357) ^ (-514381987);
                    i25 = -360112163;
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -905893563:
                case -508085281:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options3 = options5;
                    i43 = i43;
                    strM55597 = strM55597;
                    int i50 = i39;
                    if (i42 > i50) {
                        i39 = i50;
                        iM559710 = C0946.m55979("ۜۚ") ^ i31;
                        i19 = ((iM559710 ^ i32) * 21173) ^ 70226619;
                        i20 = 149454882;
                    } else {
                        iM559710 = C0946.m55979("֨֡") ^ i31;
                        i39 = i50;
                        i19 = ((iM559710 ^ i32) * (-21673)) ^ (-1835593787);
                        i20 = -1490865404;
                    }
                    i22 = iM559710 ^ i20;
                    options5 = options3;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i22;
                    i33 = i19;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -872983402:
                case 2123585882:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    if (zM55806) {
                        iM559713 = (C0873.m55680("ۗۚ") + i31) * 39;
                        i26 = ((iM559713 ^ i32) * (-12635)) ^ 1376239353;
                        i27 = 1927062650;
                    } else {
                        compressFormat2 = compressFormat;
                        iM559713 = C0946.m55979("۟ᩴ") ^ i31;
                        i26 = ((iM559713 ^ i32) * (-31719)) ^ 229466396;
                        i27 = -678835857;
                    }
                    i28 = iM559713 ^ i27;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i28;
                    i33 = i26;
                    break;
                case -853081523:
                case -133258879:
                    bitmap.recycle();
                    return c11804M27056;
                case -725841230:
                case 2111533317:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i9 = i44;
                    strM55597 = strM55597;
                    int i51 = i43;
                    i40 = i40;
                    options5 = options5;
                    i42 = i42;
                    i10 = i51;
                    short s = f82254[163];
                    int i52 = s + 18014;
                    int i53 = (s * s) + 324504196;
                    if ((i52 * i52) - (i53 + i53) <= 0) {
                        iM55681 = C0873.m55680("ۡ᩶") ^ i31;
                        i11 = ((iM55681 ^ i32) * (-12013)) ^ (-481729337);
                        i12 = -196569361;
                    } else {
                        iM55681 = (i32 - C0873.m55680("ۗ۬")) * (-97);
                        i11 = ((iM55681 ^ i31) * 21485) ^ 1036966373;
                        i12 = -1155531179;
                    }
                    i13 = iM55681 ^ i12;
                    i44 = i9;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i412 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i412;
                    break;
                case -708597916:
                case 1989839799:
                    options3 = options5;
                    z = false;
                    iM559710 = C0873.m55680("۬ܰ") ^ i32;
                    i19 = ((iM559710 ^ i31) * 6717) ^ (-678295350);
                    i20 = -929637965;
                    i22 = iM559710 ^ i20;
                    options5 = options3;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i22;
                    i33 = i19;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -663260489:
                case -367124367:
                    bitmap.recycle();
                    return c11804M27055;
                case -658930863:
                case 524889445:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i7 = i43;
                    strM55597 = strM55597;
                    options2 = options5;
                    options2.inSampleSize *= 2;
                    int i54 = i36 / 2;
                    i35 = i38 / 2;
                    if (i54 <= i45) {
                        int iM559720 = C0946.m55979("֨ۤ") ^ i32;
                        i33 = ((iM559720 ^ i31) * 18127) ^ (-335851673);
                        i43 = i7;
                        str2 = str2;
                        options5 = options2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = iM559720 ^ (-1896279123);
                        i37 = i54;
                    } else {
                        i37 = i54;
                        int iM559721 = (C0946.m55979("۬᩶") + i31) * 9;
                        i43 = i7;
                        str2 = str2;
                        bArr = bArr5;
                        i34 = iM559721 ^ 987640478;
                        i33 = ((iM559721 ^ i32) * (-15671)) ^ (-243795126);
                        i35 = i35;
                        options5 = options2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    }
                    break;
                case -648980714:
                case 1997881452:
                    options3 = options5;
                    z = true;
                    iM559710 = C0873.m55680("۬ܰ") ^ i32;
                    i19 = ((iM559710 ^ i31) * 6717) ^ (-678295350);
                    i20 = -929637965;
                    i22 = iM559710 ^ i20;
                    options5 = options3;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i22;
                    i33 = i19;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -629019186:
                case 1977593628:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options3 = options5;
                    i43 = i43;
                    strM55597 = strM55597;
                    if (i40 <= 512) {
                        int iM55684 = C0873.m55680("۬᩹") ^ i32;
                        i33 = ((iM55684 ^ i31) * (-32323)) ^ 1789097324;
                        options5 = options3;
                        i43 = i43;
                        i39 = 512;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = iM55684 ^ 1825558459;
                    } else {
                        i39 = 512;
                        iM559710 = C0946.m55979("ۜۚ") ^ i31;
                        i19 = ((iM559710 ^ i32) * 21173) ^ 70226619;
                        i20 = 149454882;
                        i22 = iM559710 ^ i20;
                        options5 = options3;
                        i43 = i43;
                        i42 = i42;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                        bArr = bArr5;
                        i34 = i22;
                        i33 = i19;
                    }
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case -628750862:
                case 1357972624:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    if (z) {
                        iM559712 = (i31 - C0873.m55680("ᩴ᩻")) * (-111);
                        i23 = ((iM559712 ^ i32) * 28181) ^ 521206502;
                        i25 = -1613656821;
                    } else {
                        iM559712 = C0873.m55680("۟ۤ") ^ i32;
                        i23 = ((iM559712 ^ i31) * (-631)) ^ (-1139660730);
                        i25 = 296711902;
                    }
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case -594257386:
                case 698528548:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.WEBP;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        try {
                            zCompress = bitmap.compress(compressFormat3, 90, byteArrayOutputStream3);
                            int iM559722 = C0946.m55979("ܽܰ") ^ i31;
                            i19 = ((iM559722 ^ i32) * (-251)) ^ 1874878957;
                            i22 = iM559722 ^ 1533550447;
                            compressFormat = compressFormat3;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            str2 = str2;
                            i35 = i35;
                            bArr = bArr5;
                            i34 = i22;
                            i33 = i19;
                            strM55597 = strM55597;
                            bitmap = bitmap;
                            bArr5 = bArr;
                        } catch (Throwable th4) {
                            th = th4;
                            compressFormat = compressFormat3;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            iM559712 = (C0946.m55979("ܽܺ") + i32) * (-49);
                            i23 = ((iM559712 ^ i31) * 5953) ^ 1204586206;
                            i25 = -952447087;
                            i24 = iM559712 ^ i25;
                            str2 = str2;
                            strM55597 = strM55597;
                            bitmap = bitmap;
                            bArr5 = bArr5;
                            i34 = i24;
                            i33 = i23;
                            i35 = i35;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        compressFormat = compressFormat3;
                        byteArrayOutputStream = null;
                    }
                    break;
                case -557378471:
                case 1598238066:
                    i10 = i43;
                    i44 = 46107;
                    int iM5597110 = C0946.m55979("۠᩷") ^ i32;
                    i11 = ((iM5597110 ^ i31) * 23611) ^ 157630555;
                    i13 = iM5597110 ^ (-608774185);
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i413 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i413;
                    break;
                case -506550465:
                case 1540511122:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    options3 = options5;
                    strM55597 = strM55597;
                    int i55 = i42;
                    int i56 = i43;
                    c11804 = C11804.f32957;
                    if (c5738M56014 != null) {
                        int iM55685 = C0873.m55680("ۛ᩹") ^ i32;
                        i17 = ((iM55685 ^ i31) * 17349) ^ (-405794562);
                        i18 = iM55685 ^ (-1154663803);
                        strM55597 = strM55597;
                        i43 = i56;
                        i42 = i55;
                        bitmap = bitmap;
                        options5 = options3;
                        bArr5 = bArr5;
                        i34 = i18;
                        i33 = i17;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                    } else {
                        i43 = i56;
                        i42 = i55;
                        int iM5597111 = C0946.m55979("᩶ܿ") ^ i32;
                        i23 = ((iM5597111 ^ i31) * (-8889)) ^ 348525543;
                        i24 = iM5597111 ^ 29793352;
                        strM55597 = strM55597;
                        options5 = options3;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case -378852073:
                case 142570476:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    int i57 = i40;
                    options5 = options5;
                    strM55597 = strM55597;
                    i42 = i42;
                    i10 = i43;
                    c5738M56014 = C0949.m56013(c19561, strM55970);
                    i40 = i57;
                    i9 = i44;
                    iM55979 = (C0873.m55680("ۡܿ") ^ i31) * 95;
                    i11 = ((iM55979 ^ i32) * 8095) ^ 260241750;
                    i16 = 842720371;
                    i13 = iM55979 ^ i16;
                    i44 = i9;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i414 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i414;
                    break;
                case -245135875:
                case 911593746:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    options3 = options5;
                    int i58 = i43;
                    strM55597 = strM55597;
                    bArrM56127 = C1003.m56127(c19561, c5738M56014, null);
                    if (bArrM56127.length != 0) {
                        int iM559723 = C0946.m55979("ۡۡ") ^ i31;
                        i17 = ((iM559723 ^ i32) * 8143) ^ (-1904816755);
                        i18 = iM559723 ^ (-1558276099);
                        strM55597 = strM55597;
                        i43 = i58;
                        i42 = i42;
                        bArr4 = null;
                        bitmap = bitmap;
                        options5 = options3;
                        bArr5 = bArr5;
                        i34 = i18;
                        i33 = i17;
                        i40 = i40;
                        str2 = str2;
                        i35 = i35;
                    } else {
                        i43 = i58;
                        bArr4 = null;
                        i42 = i42;
                        int iM5597112 = C0946.m55979("᩶ܿ") ^ i32;
                        i23 = ((iM5597112 ^ i31) * (-8889)) ^ 348525543;
                        i24 = iM5597112 ^ 29793352;
                        strM55597 = strM55597;
                        options5 = options3;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case 58827000:
                case 311880590:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    if (i35 > i45) {
                        options2 = options5;
                        i7 = i43;
                        int iM559724 = (C0946.m55979("۬᩶") + i31) * 9;
                        i43 = i7;
                        str2 = str2;
                        bArr = bArr5;
                        i34 = iM559724 ^ 987640478;
                        i33 = ((iM559724 ^ i32) * (-15671)) ^ (-243795126);
                        i35 = i35;
                        options5 = options2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr;
                    } else {
                        i35 = i35;
                        bArr2 = bArr3;
                        i = i42;
                        options = options5;
                        i2 = i43;
                        iM55680 = (i31 - C0873.m55680("ۡܺ")) * 83;
                        i43 = i2;
                        i5 = ((iM55680 ^ i32) * 15819) ^ 1035339000;
                        i6 = -1391265336;
                        int i415 = iM55680 ^ i6;
                        options5 = options;
                        strM55597 = strM55597;
                        i43 = i43;
                        i42 = i;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i35 = i35;
                        i34 = i415;
                        i33 = i5;
                        str2 = str2;
                    }
                    break;
                case 103819856:
                case 683711786:
                    try {
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        bArr5 = bArr5;
                        bitmap = bitmap;
                        try {
                            zCompress2 = bitmap.compress(compressFormat2, 90, byteArrayOutputStream4);
                            int iM559725 = C0946.m55979("ۗ᩻") ^ i31;
                            i26 = ((iM559725 ^ i32) * (-24607)) ^ 1163848397;
                            i28 = iM559725 ^ (-161826332);
                            byteArrayOutputStream2 = byteArrayOutputStream4;
                            bitmap = bitmap;
                            bArr5 = bArr5;
                            i34 = i28;
                            i33 = i26;
                        } catch (Throwable th6) {
                            th = th6;
                            byteArrayOutputStream2 = byteArrayOutputStream4;
                            strM55597 = strM55597;
                            iM559712 = (C0946.m55979("ܽܺ") + i32) * (-49);
                            i23 = ((iM559712 ^ i31) * 5953) ^ 1204586206;
                            i25 = -952447087;
                            i24 = iM559712 ^ i25;
                            str2 = str2;
                            strM55597 = strM55597;
                            bitmap = bitmap;
                            bArr5 = bArr5;
                            i34 = i24;
                            i33 = i23;
                            i35 = i35;
                        }
                    } catch (Throwable th7) {
                        bArr5 = bArr5;
                        bitmap = bitmap;
                        th = th7;
                        i35 = i35;
                        str2 = str2;
                        strM55597 = strM55597;
                        byteArrayOutputStream2 = null;
                        iM559712 = (C0946.m55979("ܽܺ") + i32) * (-49);
                        i23 = ((iM559712 ^ i31) * 5953) ^ 1204586206;
                        i25 = -952447087;
                        i24 = iM559712 ^ i25;
                        str2 = str2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case 291560479:
                case 405496415:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i = i42;
                    i3 = i43;
                    strM55597 = strM55597;
                    options5 = new BitmapFactory.Options();
                    i45 = 600;
                    i4 = i40;
                    if (i4 <= 600) {
                        iM559711 = (C0873.m55680("ܶۤ") ^ i31) * (-57);
                        i19 = ((iM559711 ^ i32) * (-7023)) ^ 1747917880;
                        i21 = -127469211;
                    } else {
                        iM559711 = (C0946.m55979("ܿ֨") ^ i32) * 33;
                        i19 = ((iM559711 ^ i31) * 22003) ^ (-1757156180);
                        i21 = -101459607;
                    }
                    i22 = iM559711 ^ i21;
                    i40 = i4;
                    str2 = str2;
                    i43 = i3;
                    i42 = i;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i22;
                    i33 = i19;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case 357955387:
                case 1840912229:
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    try {
                        compressFormat2 = Bitmap.CompressFormat.JPEG;
                        iM559713 = C0946.m55979("۟ᩴ") ^ i31;
                        i26 = ((iM559713 ^ i32) * (-31719)) ^ 229466396;
                        i27 = -678835857;
                        i28 = iM559713 ^ i27;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i28;
                        i33 = i26;
                    } catch (Throwable th8) {
                        th = th8;
                        strM55597 = strM55597;
                        iM559712 = (C0946.m55979("ܽܺ") + i32) * (-49);
                        i23 = ((iM559712 ^ i31) * 5953) ^ 1204586206;
                        i25 = -952447087;
                        i24 = iM559712 ^ i25;
                        str2 = str2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case 428149295:
                case 1731196535:
                    i35 = i35;
                    String str3 = str2;
                    String str4 = strM55597;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    int i59 = i40;
                    options5 = options5;
                    i42 = i42;
                    i10 = i43;
                    c5738M56013 = C0949.m56013(c19561, str4);
                    strM55597 = str4;
                    i40 = i59;
                    str = str3;
                    i14 = i44;
                    iM55682 = C0873.m55680("᩺᩻") ^ i31;
                    i11 = ((iM55682 ^ i32) * (-13889)) ^ 1360491075;
                    i15 = 1968263875;
                    i13 = iM55682 ^ i15;
                    i44 = i14;
                    str2 = str;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i416 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i416;
                    break;
                case 601032379:
                case 1467634440:
                    i35 = i35;
                    str2 = str2;
                    Bitmap bitmapM40498 = m40498(bitmapDecodeByteArray);
                    int iM55686 = (C0873.m55680("ᩴۛ") ^ i32) * 79;
                    strM55597 = strM55597;
                    bArr5 = bArr5;
                    bitmap = bitmapM40498;
                    i34 = iM55686 ^ (-2136330250);
                    i33 = ((iM55686 ^ i31) * 23931) ^ (-1948166086);
                    str2 = str2;
                    i35 = i35;
                    break;
                case 645595709:
                case 1403353355:
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    options4 = options5;
                    int i60 = i43;
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM56127, i60, bArrM56127.length, options4);
                    if (bitmapDecodeByteArray != null) {
                        int iM55687 = (C0873.m55680("۟ۧ") ^ i31) * 95;
                        i35 = i35;
                        i23 = ((iM55687 ^ i32) * (-5665)) ^ (-248519910);
                        i24 = iM55687 ^ (-2071112170);
                        i43 = i60;
                        options5 = options4;
                        str2 = str2;
                        strM55597 = strM55597;
                        bitmap = bitmap;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    } else {
                        i35 = i35;
                        i43 = i60;
                        i40 = i40;
                        options3 = options4;
                        int iM5597113 = C0946.m55979("᩶ܿ") ^ i32;
                        i23 = ((iM5597113 ^ i31) * (-8889)) ^ 348525543;
                        i24 = iM5597113 ^ 29793352;
                        strM55597 = strM55597;
                        options5 = options3;
                        i40 = i40;
                        bitmap = bitmap;
                        str2 = str2;
                        bArr5 = bArr5;
                        i34 = i24;
                        i33 = i23;
                        i35 = i35;
                    }
                    break;
                case 669211434:
                case 1864098592:
                    if (zCompress2) {
                        iM55683 = C0946.m55979("ᩳۛ") ^ i32;
                        i26 = ((iM55683 ^ i31) * 4949) ^ 147120140;
                        i29 = -495787966;
                    } else {
                        iM55683 = (C0873.m55680("ܳۘ") + i31) * (-95);
                        i26 = ((iM55683 ^ i32) * 17659) ^ 1502737803;
                        i29 = 1665983500;
                    }
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                case 720149238:
                case 1588869022:
                    if (bArr5 != null) {
                        iM55683 = C0873.m55680("۬ۡ") ^ i32;
                        i26 = ((iM55683 ^ i31) * (-5033)) ^ (-137597429);
                        i29 = -2135830355;
                    } else {
                        iM55683 = C0946.m55979("ۚۚ") ^ i32;
                        i26 = ((iM55683 ^ i31) * 20491) ^ 393605668;
                        i29 = -2125752144;
                    }
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                case 906297354:
                case 1219752099:
                    byteArray = null;
                    bArr5 = byteArray;
                    iM55683 = (C0873.m55680("ۧۧ") ^ i31) * (-71);
                    i26 = ((iM55683 ^ i32) * (-14475)) ^ (-1411386713);
                    i29 = -1950148796;
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                case 993054686:
                case 1891315217:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    strM55597 = strM55597;
                    if (length >= length2) {
                        iM559712 = C0873.m55680("ۨۤ") ^ i32;
                        i23 = ((iM559712 ^ i31) * 22241) ^ 776135581;
                        i25 = 1476320359;
                    } else {
                        iM559712 = (C0873.m55680("ۘۛ") ^ i31) * 87;
                        i23 = ((iM559712 ^ i32) * 8827) ^ 277807984;
                        i25 = -160061354;
                    }
                    i24 = iM559712 ^ i25;
                    str2 = str2;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i24;
                    i33 = i23;
                    i35 = i35;
                    break;
                case 1173225758:
                case 1538472159:
                    i35 = i35;
                    str2 = str2;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i40 = i40;
                    i42 = i42;
                    i43 = i43;
                    strM55597 = strM55597;
                    options4 = options5;
                    zM55807 = C0906.m55806(str2, C0898.m55791(c5738M56014));
                    if (z) {
                        options3 = options4;
                        iM559710 = C0946.m55979("ܳ֨") ^ i32;
                        i19 = ((iM559710 ^ i31) * 8261) ^ 927489294;
                        i20 = -1789688861;
                    } else {
                        iM559710 = C0946.m55979("ܰܺ") ^ i31;
                        options3 = options4;
                        i19 = ((iM559710 ^ i32) * (-15493)) ^ 1626900261;
                        i20 = 1126641064;
                    }
                    i22 = iM559710 ^ i20;
                    options5 = options3;
                    i43 = i43;
                    i42 = i42;
                    i40 = i40;
                    str2 = str2;
                    i35 = i35;
                    bArr = bArr5;
                    i34 = i22;
                    i33 = i19;
                    strM55597 = strM55597;
                    bitmap = bitmap;
                    bArr5 = bArr;
                    break;
                case 1345562126:
                case 1456356649:
                    i35 = i35;
                    bArr5 = bArr5;
                    bitmap = bitmap;
                    i14 = i44;
                    int i61 = i43;
                    i40 = i40;
                    options5 = options5;
                    i42 = i42;
                    i10 = i61;
                    String strM55773 = C0894.m55773(f82254, 164, 9, i14);
                    C5738 c5738M56015 = C0949.m56013(c19561, strM55773);
                    str = strM55773;
                    strM55597 = C0854.m55597(f82254, 173, 8, i14);
                    if (c5738M56015 == null) {
                        iM55682 = C0873.m55680("ۚ۠") ^ i32;
                        i11 = ((iM55682 ^ i31) * 23273) ^ (-285932619);
                        i15 = -363386792;
                    } else {
                        c5738M56013 = c5738M56015;
                        iM55682 = C0873.m55680("᩺᩻") ^ i31;
                        i11 = ((iM55682 ^ i32) * (-13889)) ^ 1360491075;
                        i15 = 1968263875;
                    }
                    i13 = iM55682 ^ i15;
                    i44 = i14;
                    str2 = str;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i34 = i13;
                    i33 = i11;
                    i35 = i35;
                    int i417 = i42;
                    options5 = options5;
                    i40 = i40;
                    i43 = i10;
                    i42 = i417;
                    break;
                case 1368953320:
                case 1862918115:
                    byteArray = byteArrayOutputStream2.toByteArray();
                    bArr5 = byteArray;
                    iM55683 = (C0873.m55680("ۧۧ") ^ i31) * (-71);
                    i26 = ((iM55683 ^ i32) * (-14475)) ^ (-1411386713);
                    i29 = -1950148796;
                    i34 = iM55683 ^ i29;
                    i33 = i26;
                    break;
                default:
                    bArr3 = null;
                    i38 = i35;
                    i35 = i38;
                    i36 = i37;
                    i8 = i41;
                    i = i42;
                    options = options5;
                    iM55680 = (C0873.m55680("֫ۢ") + i32) * (-75);
                    i41 = i8;
                    i5 = ((iM55680 ^ i31) * 19409) ^ 36004958;
                    i6 = 1427730257;
                    int i418 = iM55680 ^ i6;
                    options5 = options;
                    strM55597 = strM55597;
                    i43 = i43;
                    i42 = i;
                    bitmap = bitmap;
                    bArr5 = bArr5;
                    i35 = i35;
                    i34 = i418;
                    i33 = i5;
                    str2 = str2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0274 A[PHI: r1 r8 r9 r17
      0x0274: PHI (r1v5 java.lang.StringBuilder) = (r1v2 java.lang.StringBuilder), (r1v1 java.lang.StringBuilder), (r1v1 java.lang.StringBuilder) binds: [B:45:0x0183, B:67:0x0272, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r8v6 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:45:0x0183, B:67:0x0272, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r9v6 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:45:0x0183, B:67:0x0272, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r17v15 java.lang.String) = (r17v2 java.lang.String), (r17v5 java.lang.String), (r17v16 java.lang.String) binds: [B:45:0x0183, B:67:0x0272, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        if (p067l.C0906.f81862 >= 0) goto L7;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C20066 m40504(int i, String str) throws IOException {
        String str2;
        int iM55979;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        int iM559711;
        int i6;
        int i7 = C1036.f81953;
        int i8 = C0845.f81821;
        int iM559712 = (C0946.m55979("֨᩶") ^ i8) * (-99);
        int i9 = ((iM559712 ^ i7) * (-19479)) ^ 1270234336;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM559712 ^ 1606420271;
        StringBuilder sb = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -951230099;
        C19179 c19179M43668 = null;
        String strM55993 = null;
        String strM56293 = null;
        String strM40499 = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i7) * (-19079)) >> 31));
            switch (i14) {
                case -2117163552:
                case 253472170:
                    i11 = 53709;
                    iM55979 = C0873.m55680("ۤ۠") ^ i7;
                    i2 = ((iM55979 ^ i8) * (-931)) ^ (-987558855);
                    i3 = -940396394;
                    str2 = strM40499;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    strM40499 = str2;
                    break;
                case -2039733459:
                case -2009835300:
                    short[] sArr3 = f82254;
                    if (C1046.f81962 > 0) {
                        throw new IOException(C0863.m55635(sArr3, 272, 15, i11));
                    }
                    int iM55680 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                    i9 = ((iM55680 ^ i8) * 6707) ^ 1430917890;
                    strM40499 = strM40499;
                    i10 = iM55680 ^ 1602284464;
                    sb = null;
                    break;
                case -2012549587:
                case 190471823:
                    strM40499 = strM40499;
                    s = sArr[c];
                    s2 = 21940;
                    if (C0937.m55918() >= 0) {
                        iM55979 = (C0946.m55979("ܺ֫") ^ i7) * 73;
                        i2 = ((iM55979 ^ i8) * 10689) ^ 221800764;
                        i3 = 1972667070;
                    } else {
                        iM55979 = C0873.m55680("ܺܺ") ^ i7;
                        i2 = ((iM55979 ^ i8) * (-31511)) ^ 1651357377;
                        i3 = 1402878970;
                    }
                    str2 = strM40499;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    strM40499 = str2;
                    break;
                case -1918758986:
                case 418899333:
                    ServiceConnectionC1013.m56150(c19179M43668, C0930.m55893(sArr2, i12, i13, i11), strM40499);
                    return c19179M43668.m43675();
                case -1810421348:
                case 554781439:
                    strM40499 = m40499();
                    if (strM40499 == null) {
                        iM559710 = C0946.m55979("ۚܽ") ^ i8;
                        i4 = ((iM559710 ^ i7) * (-239)) ^ 2039187516;
                        i5 = 1955700276;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        iM559711 = C0946.m55979("֡᩶") ^ i7;
                        i9 = ((iM559711 ^ i8) * (-28649)) ^ 1161449833;
                        i6 = -608093297;
                        i10 = iM559711 ^ i6;
                    }
                    break;
                case -1553577094:
                case 1394345097:
                    C0863.m55643();
                    RunnableC0871.m55672();
                    strM40499 = strM40499;
                    iM55979 = C0873.m55680("ᩴ۠") ^ i8;
                    i2 = ((iM55979 ^ i7) * (-2105)) ^ 1691173619;
                    i3 = 143122837;
                    str2 = strM40499;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    strM40499 = str2;
                    break;
                case -1528000825:
                case 306619230:
                    C0912.m55825(sb, strM55993);
                    c19179M43668 = C19179.m43668(C0863.m55639(sb));
                    if (!C1025.m56230()) {
                        iM559710 = (i7 - C0873.m55680("ܺܽ")) * 23;
                        i4 = ((iM559710 ^ i8) * 13481) ^ (-293476550);
                        i5 = -17421330;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        int iM55681 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                        i9 = ((iM55681 ^ i8) * 6707) ^ 1430917890;
                        strM40499 = strM40499;
                        i10 = iM55681 ^ 1602284464;
                        sb = null;
                    }
                    break;
                case -1444478171:
                case 1150928085:
                    C1003.m56121(sb, strM56293);
                    C0845.m55589(sb, i);
                    if (C0946.f81894 == 0) {
                        iM559710 = (C0946.m55979("᩹ܳ") + i7) * 59;
                        i4 = ((iM559710 ^ i8) * 24201) ^ 615080163;
                        i5 = -835183113;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        iM559711 = C0873.m55680("ۜ᩷") ^ i8;
                        i9 = ((iM559711 ^ i7) * (-29301)) ^ (-1310293898);
                        i6 = -2096706836;
                        i10 = iM559711 ^ i6;
                    }
                    break;
                case -1250035025:
                case 1087341344:
                    strM40499 = strM40499;
                    int i15 = s + 5485;
                    if ((s * s2) - (i15 * i15) <= 0) {
                        iM55979 = (C0873.m55680("᩵֨") ^ i8) * (-65);
                        i2 = ((iM55979 ^ i7) * 4537) ^ (-1748637153);
                        i3 = 1478365320;
                    } else {
                        iM55979 = C0946.m55979("ܳᩴ") ^ i7;
                        i2 = ((iM55979 ^ i8) * (-16929)) ^ (-319859959);
                        i3 = 744052259;
                    }
                    str2 = strM40499;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    strM40499 = str2;
                    break;
                case -893744745:
                case 2026816959:
                    i11 = 62515;
                    iM55979 = C0873.m55680("ۤ۠") ^ i7;
                    i2 = ((iM55979 ^ i8) * (-931)) ^ (-987558855);
                    i3 = -940396394;
                    str2 = strM40499;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    strM40499 = str2;
                    break;
                case -837991228:
                case 1802761329:
                    strM56293 = C1046.m56293(f82254, 295, 1, i11);
                    if (C0989.f81920 < 0) {
                        iM559710 = C0946.m55979("ۛܺ") ^ i8;
                        i4 = ((iM559710 ^ i7) * (-13469)) ^ (-1851480589);
                        i5 = -1204026847;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        int iM55682 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                        i9 = ((iM55682 ^ i8) * 6707) ^ 1430917890;
                        strM40499 = strM40499;
                        i10 = iM55682 ^ 1602284464;
                        sb = null;
                    }
                    break;
                case -491407162:
                case 5137379:
                    if (C1053.f81965 > 0) {
                        iM559710 = C0946.m55979("ۖ۬") ^ i8;
                        i4 = ((iM559710 ^ i7) * 30285) ^ 395740989;
                        i5 = -1691197482;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        strM40499 = strM40499;
                        iM55979 = (C0946.m55979("ܺ֫") ^ i7) * 73;
                        i2 = ((iM55979 ^ i8) * 10689) ^ 221800764;
                        i3 = 1972667070;
                        str2 = strM40499;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        strM40499 = str2;
                    }
                    break;
                case -481846626:
                case 1737988171:
                    RunnableC0938.m55938();
                    break;
                case -199113166:
                case 1853459359:
                    ServiceConnectionC1013.m56157();
                    return null;
                case -115306526:
                case 2124403279:
                    strM55993 = C0947.m55993(f82254, 296, 11, i11);
                    if (C0992.f81922 < 0) {
                        iM559710 = C0873.m55680("ܰۛ") ^ i8;
                        i4 = ((iM559710 ^ i7) * (-20583)) ^ (-245000460);
                        i5 = 1481209383;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        int iM55683 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                        i9 = ((iM55683 ^ i8) * 6707) ^ 1430917890;
                        strM40499 = strM40499;
                        i10 = iM55683 ^ 1602284464;
                        sb = null;
                    }
                    break;
                case -55136425:
                case 1084591920:
                    sArr2 = f82254;
                    i12 = 307;
                    i13 = 4;
                    if (RunnableC1014.f81941 > 0) {
                        iM559710 = (C0946.m55979("ۖ۫") + i7) * (-39);
                        i4 = ((iM559710 ^ i8) * (-27065)) ^ 677079940;
                        i5 = 1591858156;
                        i10 = iM559710 ^ i5;
                        i9 = i4;
                    } else {
                        int iM55684 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                        i9 = ((iM55684 ^ i8) * 6707) ^ 1430917890;
                        strM40499 = strM40499;
                        i10 = iM55684 ^ 1602284464;
                        sb = null;
                    }
                    break;
                case 337565630:
                case 1435976058:
                    strM40499 = strM40499;
                    sArr = f82254;
                    c = 271;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ᩴ۠") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-2105)) ^ 1691173619;
                        i3 = 143122837;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ᩵") + i8) * 45;
                        i2 = ((iM55979 ^ i7) * 18583) ^ 1743108653;
                        i3 = -510649103;
                    }
                    str2 = strM40499;
                    i10 = iM55979 ^ i3;
                    i9 = i2;
                    strM40499 = str2;
                    break;
                case 702386267:
                case 1025693039:
                    short[] sArr4 = f82254;
                    if (C0877.f81843 < 0) {
                        strM40499 = strM40499;
                        sb = new StringBuilder(AbstractC0942.m55970(sArr4, 287, 8, i11));
                        C0912.m55825(sb, str);
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            iM55979 = (C0946.m55979("ܺ֫") ^ i7) * 73;
                            i2 = ((iM55979 ^ i8) * 10689) ^ 221800764;
                            i3 = 1972667070;
                            str2 = strM40499;
                            i10 = iM55979 ^ i3;
                            i9 = i2;
                        } else {
                            int iM559713 = C0946.m55979("᩶۠") ^ i8;
                            i9 = ((iM559713 ^ i7) * 20567) ^ (-655763495);
                            str2 = strM40499;
                            i10 = iM559713 ^ 850092709;
                        }
                        strM40499 = str2;
                    } else {
                        int iM55685 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                        i9 = ((iM55685 ^ i8) * 6707) ^ 1430917890;
                        strM40499 = strM40499;
                        i10 = iM55685 ^ 1602284464;
                        sb = null;
                    }
                    break;
                default:
                    C0906.m55809();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        int iM55686 = (C0873.m55680("ܽۘ") ^ i7) * C0254q.f1218h;
                        i9 = ((iM55686 ^ i8) * 6707) ^ 1430917890;
                        strM40499 = strM40499;
                        i10 = iM55686 ^ 1602284464;
                        sb = null;
                    } else {
                        strM40499 = strM40499;
                        iM55979 = C0873.m55680("ᩴ۠") ^ i8;
                        i2 = ((iM55979 ^ i7) * (-2105)) ^ 1691173619;
                        i3 = 143122837;
                        str2 = strM40499;
                        i10 = iM55979 ^ i3;
                        i9 = i2;
                        strM40499 = str2;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0377 A[PHI: r3 r7 r8 r16 r17 r18 r21 r26 r28
      0x0377: PHI (r3v30 int) = (r3v11 int), (r3v13 int), (r3v14 int), (r3v22 int), (r3v31 int) binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r7v9 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r8v7 java.nio.charset.Charset) = 
      (r8v2 java.nio.charset.Charset)
      (r8v2 java.nio.charset.Charset)
      (r8v2 java.nio.charset.Charset)
      (r8v3 java.nio.charset.Charset)
      (r8v2 java.nio.charset.Charset)
     binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r16v7 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r17v7 int) = (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r18v7 short) = (r18v2 short), (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r21v7 short) = (r21v2 short), (r21v3 short), (r21v2 short), (r21v2 short), (r21v2 short) binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r26v28 int) = (r26v4 int), (r26v6 int), (r26v7 int), (r26v17 int), (r26v29 int) binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r28v9 java.lang.StringBuilder) = 
      (r28v1 java.lang.StringBuilder)
      (r28v1 java.lang.StringBuilder)
      (r28v1 java.lang.StringBuilder)
      (r28v3 java.lang.StringBuilder)
      (r28v1 java.lang.StringBuilder)
     binds: [B:83:0x0375, B:75:0x031f, B:71:0x02fa, B:40:0x0186, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        if (p067l.RunnableC1014.f81941 > 0) goto L13;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m40506(final String str, final int i, boolean z, ImageView imageView) {
        int iM55979;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM55680;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        int iM55682;
        int i10;
        int i11;
        i = i;
        ImageView imageView2 = imageView;
        int i12 = C1229.f82066;
        int i13 = C0992.f81922;
        int iM55683 = (C0873.m55680("֨۠") + i13) * (-103);
        int i14 = ((iM55683 ^ i12) * (-24469)) ^ 502463121;
        String strM56462 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = iM55683 ^ (-670686620);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        short s2 = 0;
        int i20 = 502964465;
        int i21 = 0;
        StringBuilder sb = null;
        Bitmap bitmapM40498 = null;
        final WeakReference weakReference = null;
        Bitmap bitmapM33864 = null;
        final String strM55913 = null;
        Charset charset = null;
        String str2 = null;
        MessageDigest messageDigestM36660 = null;
        int iM55684 = 0;
        while (true) {
            i20 = i15 ^ (i14 & (((i20 ^ i12) * (-11521)) >> 31));
            switch (i20) {
                case -1757167170:
                case 1496873043:
                    bitmapM40498 = m40498(bitmapM33864);
                    if (bitmapM40498 != bitmapM33864) {
                        iM55979 = (C0946.m55979("ܳ֫") ^ i12) * (-7);
                        i2 = ((iM55979 ^ i13) * 20383) ^ 441142525;
                        i3 = -705057327;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ۘ֫")) * 97;
                        i2 = ((iM55979 ^ i13) * 17117) ^ (-295929932);
                        i3 = -1792126027;
                    }
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -1444241963:
                case 1345198552:
                    C0873.m55676(AsyncTask.THREAD_POOL_EXECUTOR, new Runnable() { // from class: l.᩷᩻᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = null;
                            WeakReference weakReference2 = null;
                            int i22 = 1382958431;
                            int i23 = C0989.f81920;
                            int i24 = C0877.f81843;
                            int iM55685 = (C0873.m55680("ۙ᩹") ^ i24) * 73;
                            int i25 = ((iM55685 ^ i23) * 30139) ^ (-208321596);
                            int i26 = 1337342500;
                            while (true) {
                                i22 = ((((i22 ^ i23) * (-23609)) >> 31) & i25) ^ (iM55685 ^ i26);
                                switch (i22) {
                                    case -2066623851:
                                    case -2060612822:
                                        if (AbstractC0942.m55971()) {
                                            iM55685 = C0946.m55979("ۖۙ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-9207)) ^ 2108706870;
                                            i26 = -716252822;
                                        } else {
                                            iM55685 = (C0946.m55979("ۧ֫") ^ i23) * (-17);
                                            i25 = ((iM55685 ^ i24) * 23983) ^ 462737281;
                                            i26 = 597524892;
                                        }
                                        break;
                                    case -1754370344:
                                    case 61358897:
                                        C1044.m56286();
                                        if (C0877.f81843 >= 0) {
                                            iM55685 = C0946.m55979("ܰۗ") ^ i24;
                                            i25 = ((iM55685 ^ i23) * (-4379)) ^ (-1656866126);
                                            i26 = 1532457674;
                                        } else {
                                            iM55685 = C0946.m55979("ۖۙ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-9207)) ^ 2108706870;
                                            i26 = -716252822;
                                        }
                                        break;
                                    case -1692374527:
                                    case 1366962944:
                                        if (C1044.f81959 >= 0) {
                                            iM55685 = C0873.m55680("ۘۚ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-24187)) ^ 1633263930;
                                            i26 = 1495866771;
                                        } else {
                                            iM55685 = C0946.m55979("᩵ۡ") ^ i24;
                                            i25 = ((iM55685 ^ i23) * (-28883)) ^ (-1655641241);
                                            i26 = 1429932418;
                                        }
                                        break;
                                    case -1560338023:
                                    case 544004414:
                                        C1071.m56343();
                                        C0890.m55740();
                                        iM55685 = C0873.m55680("ۛ᩸") ^ i24;
                                        i25 = ((iM55685 ^ i23) * 27649) ^ 621594709;
                                        i26 = -417922606;
                                        break;
                                    case -1408558074:
                                    case 1864722580:
                                        if (C1028.f81950 <= 0) {
                                            iM55685 = C0873.m55680("ۧܰ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * 22285) ^ (-849687634);
                                            i26 = -158710641;
                                        } else {
                                            iM55685 = C0946.m55979("ܰۗ") ^ i24;
                                            i25 = ((iM55685 ^ i23) * (-4379)) ^ (-1656866126);
                                            i26 = 1532457674;
                                        }
                                        break;
                                    case -1211854947:
                                    case -1186504902:
                                        if (C0882.m55710() != 0) {
                                            iM55685 = C0946.m55979("ܰۗ") ^ i24;
                                            i25 = ((iM55685 ^ i23) * (-4379)) ^ (-1656866126);
                                            i26 = 1532457674;
                                        } else {
                                            iM55685 = (C0946.m55979("ۨᩳ") + i24) * 43;
                                            i25 = ((iM55685 ^ i23) * 22097) ^ (-1306572576);
                                            i26 = 1650213138;
                                        }
                                        break;
                                    case -1122443331:
                                    case 1493147024:
                                        if (RunnableC0897.f81856) {
                                            iM55685 = (C0873.m55680("ۤۡ") + i24) * 5;
                                            i25 = ((iM55685 ^ i23) * 29439) ^ 1878993754;
                                            i26 = 959397819;
                                        } else {
                                            iM55685 = C0873.m55680("ۛ᩸") ^ i24;
                                            i25 = ((iM55685 ^ i23) * 27649) ^ 621594709;
                                            i26 = -417922606;
                                        }
                                        break;
                                    case -950837488:
                                    case 1767437618:
                                        C0873.m55678();
                                        break;
                                    case -719811216:
                                    case -198991741:
                                        C0992.m56107();
                                        if (C0894.f81854 >= 0) {
                                            iM55685 = C0946.m55979("ۖۙ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-9207)) ^ 2108706870;
                                            i26 = -716252822;
                                        } else {
                                            iM55685 = C0873.m55680("ۛ᩸") ^ i24;
                                            i25 = ((iM55685 ^ i23) * 27649) ^ 621594709;
                                            i26 = -417922606;
                                        }
                                        break;
                                    case -612947821:
                                    case -212085894:
                                        if (C0894.f81854 >= 0) {
                                            iM55685 = C0873.m55680("ۛ᩸") ^ i24;
                                            i25 = ((iM55685 ^ i23) * 27649) ^ 621594709;
                                            i26 = -417922606;
                                        } else {
                                            iM55685 = (i24 - C0873.m55680("ۙܽ")) * 59;
                                            i25 = ((iM55685 ^ i23) * (-26141)) ^ (-2052633582);
                                            i26 = -307507613;
                                        }
                                        break;
                                    case -612701919:
                                    case 2075073859:
                                        str3 = strM55913;
                                        if (C1194.f82045 != 0) {
                                            iM55685 = C0946.m55979("ۖۙ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-9207)) ^ 2108706870;
                                            i26 = -716252822;
                                        } else {
                                            iM55685 = (C0946.m55979("ܽ᩺") + i23) * 33;
                                            i25 = ((iM55685 ^ i24) * 32355) ^ 1363993532;
                                            i26 = 777653353;
                                        }
                                        break;
                                    case -611648028:
                                    case 1738212249:
                                        C17837.m40505(str, i, str3, weakReference2);
                                        break;
                                    case -23007559:
                                    case 416884360:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55685 = C0946.m55979("ۖۙ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-9207)) ^ 2108706870;
                                            i26 = -716252822;
                                        } else {
                                            iM55685 = C0946.m55979("ᩳۢ") ^ i24;
                                            i25 = ((iM55685 ^ i23) * 30029) ^ (-780040805);
                                            i26 = -594891415;
                                        }
                                        break;
                                    case 468293962:
                                    case 542241912:
                                        if (C1194.f82045 != 0) {
                                            iM55685 = C0873.m55680("ۛ᩸") ^ i24;
                                            i25 = ((iM55685 ^ i23) * 27649) ^ 621594709;
                                            i26 = -417922606;
                                        } else {
                                            iM55685 = C0946.m55979("۫᩸") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-5037)) ^ (-1720064184);
                                            i26 = -1377978390;
                                        }
                                        break;
                                    case 1388744123:
                                    case 1535494113:
                                        weakReference2 = weakReference;
                                        if (C0854.f81826 != 0) {
                                            iM55685 = C0873.m55680("ۘۚ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-24187)) ^ 1633263930;
                                            i26 = 1495866771;
                                        } else {
                                            iM55685 = (i23 - C0873.m55680("֡ܺ")) * (-31);
                                            i25 = ((iM55685 ^ i24) * (-6413)) ^ (-568147036);
                                            i26 = 927369863;
                                        }
                                        break;
                                    default:
                                        if (C0854.f81826 != 0) {
                                            iM55685 = C0873.m55680("ۧܰ") ^ i23;
                                            i25 = ((iM55685 ^ i24) * 22285) ^ (-849687634);
                                            i26 = -158710641;
                                        } else {
                                            iM55685 = C0873.m55680("ۨ᩹") ^ i23;
                                            i25 = ((iM55685 ^ i24) * (-4341)) ^ 919022363;
                                            i26 = -288640180;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i22 = 243957465;
                            int i23 = C0967.f81910;
                            int i24 = C0906.f81862;
                            int iM559710 = C0946.m55979("۫ۛ") ^ i24;
                            int i25 = ((iM559710 ^ i23) * (-229)) ^ 1576958181;
                            int i26 = -1995608978;
                            while (true) {
                                i22 = ((((i22 ^ i23) * (-16149)) >> 31) & i25) ^ (iM559710 ^ i26);
                                switch (i22) {
                                    case -1997619012:
                                    case -396268966:
                                        C0937.m55918();
                                        if (C0927.m55873() > 0) {
                                            iM559710 = (i24 - C0946.m55979("۠᩹")) * (-33);
                                            i25 = ((iM559710 ^ i23) * 22795) ^ 169857549;
                                            i26 = -861465850;
                                        } else {
                                            iM559710 = (i24 - C0873.m55680("ۢᩴ")) * 81;
                                            i25 = ((iM559710 ^ i23) * (-4379)) ^ 1591526286;
                                            i26 = -2045121810;
                                        }
                                        break;
                                    case -1762806682:
                                    case 564130686:
                                        C1036.m56257();
                                        C0947.m55997();
                                        throw new RuntimeException();
                                    case -1753478508:
                                    case -352920454:
                                        if (C0947.f81895) {
                                            iM559710 = (i24 - C0946.m55979("۠᩹")) * (-33);
                                            i25 = ((iM559710 ^ i23) * 22795) ^ 169857549;
                                            i26 = -861465850;
                                        } else {
                                            iM559710 = (C0873.m55680("ۛܳ") ^ i24) * (-67);
                                            i25 = ((iM559710 ^ i23) * (-8543)) ^ 684349929;
                                            i26 = -1029126708;
                                        }
                                        break;
                                    case -1554484184:
                                    case 112611867:
                                        if (C0906.f81862 < 0) {
                                            iM559710 = (i24 - C0873.m55680("ۢᩴ")) * 81;
                                            i25 = ((iM559710 ^ i23) * (-4379)) ^ 1591526286;
                                            i26 = -2045121810;
                                        } else {
                                            iM559710 = C0873.m55680("ۚܿ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 14753) ^ 921935618;
                                            i26 = 491366295;
                                        }
                                        break;
                                    case -1529127803:
                                    case 1571856381:
                                        if (C0845.f81821 >= 0) {
                                            iM559710 = (i24 - C0873.m55680("ۢᩴ")) * 81;
                                            i25 = ((iM559710 ^ i23) * (-4379)) ^ 1591526286;
                                            i26 = -2045121810;
                                        } else {
                                            iM559710 = (i23 - C0873.m55680("ᩳܰ")) * (-79);
                                            i25 = ((iM559710 ^ i24) * 9711) ^ (-128762446);
                                            i26 = 406619055;
                                        }
                                        break;
                                    case -1527886319:
                                    case 2123601753:
                                        if (C1044.f81959 >= 0) {
                                            iM559710 = (i24 - C0946.m55979("۠᩹")) * (-33);
                                            i25 = ((iM559710 ^ i23) * 22795) ^ 169857549;
                                            i26 = -861465850;
                                        } else {
                                            iM559710 = C0946.m55979("ᩳܶ") ^ i24;
                                            i25 = ((iM559710 ^ i23) * (-13959)) ^ (-746859886);
                                            i26 = 1174229362;
                                        }
                                        break;
                                    case -1272332990:
                                    case 1183280132:
                                        return;
                                    case -471069265:
                                    case 1889076239:
                                        if (C1053.f81965 <= 0) {
                                            iM559710 = C0873.m55680("ۚܿ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 14753) ^ 921935618;
                                            i26 = 491366295;
                                        } else {
                                            iM559710 = (i23 - C0946.m55979("᩺ܽ")) * (-91);
                                            i25 = ((iM559710 ^ i24) * 13607) ^ (-171695910);
                                            i26 = 587237484;
                                        }
                                        break;
                                    case -470713192:
                                    case -412342073:
                                        C0863.m55643();
                                        iM559710 = C0873.m55680("ۚܿ") ^ i23;
                                        i25 = ((iM559710 ^ i24) * 14753) ^ 921935618;
                                        i26 = 491366295;
                                        break;
                                    case -457458887:
                                    case 580638056:
                                        if (C1229.f82066 >= 0) {
                                            iM559710 = C0873.m55680("ۙᩳ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 13679) ^ (-1069276019);
                                            i26 = 1673874612;
                                        } else {
                                            iM559710 = C0946.m55979("۫ۗ") ^ i24;
                                            i25 = ((iM559710 ^ i23) * 27253) ^ 967522189;
                                            i26 = -892779767;
                                        }
                                        break;
                                    case -347935376:
                                    case 513652999:
                                        if (!C0882.f81846) {
                                            iM559710 = C0873.m55680("ۙᩳ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 13679) ^ (-1069276019);
                                            i26 = 1673874612;
                                        } else {
                                            iM559710 = (i24 - C0946.m55979("۠᩹")) * (-33);
                                            i25 = ((iM559710 ^ i23) * 22795) ^ 169857549;
                                            i26 = -861465850;
                                        }
                                        break;
                                    case -249958488:
                                    case 740153614:
                                        if (C0989.f81920 >= 0) {
                                            iM559710 = (i24 - C0873.m55680("ۧᩳ")) * 89;
                                            i25 = ((iM559710 ^ i23) * (-9309)) ^ 359256590;
                                            i26 = 854675991;
                                        } else {
                                            iM559710 = (C0946.m55979("ۛۙ") + i24) * 63;
                                            i25 = ((iM559710 ^ i23) * 28839) ^ 168516947;
                                            i26 = 1440595123;
                                        }
                                        break;
                                    case -239370156:
                                    case 196502661:
                                        if (C0861.f81831) {
                                            iM559710 = C0873.m55680("۬ᩳ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 19489) ^ 1738741720;
                                            i26 = -79872676;
                                        } else {
                                            iM559710 = (i24 - C0946.m55979("۠᩹")) * (-33);
                                            i25 = ((iM559710 ^ i23) * 22795) ^ 169857549;
                                            i26 = -861465850;
                                        }
                                        break;
                                    case 637863701:
                                    case 1248426245:
                                        if (C0890.f81849 != 0) {
                                            iM559710 = C0873.m55680("ۚܿ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 14753) ^ 921935618;
                                            i26 = 491366295;
                                        } else {
                                            iM559710 = C0946.m55979("֨ܳ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 27793) ^ 1820634213;
                                            i26 = 1864353254;
                                        }
                                        break;
                                    case 1645456300:
                                    case 1707157614:
                                        if (C1124.f82007 >= 0) {
                                            iM559710 = C0873.m55680("ۚܿ") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 14753) ^ 921935618;
                                            i26 = 491366295;
                                        } else {
                                            iM559710 = C0946.m55979("۫ۧ") ^ i24;
                                            i25 = ((iM559710 ^ i23) * 18105) ^ 1330680474;
                                            i26 = 1588849443;
                                        }
                                        break;
                                    default:
                                        if (C0992.f81922 >= 0) {
                                            iM559710 = (i24 - C0873.m55680("ۧᩳ")) * 89;
                                            i25 = ((iM559710 ^ i23) * (-9309)) ^ 359256590;
                                            i26 = 854675991;
                                        } else {
                                            iM559710 = C0946.m55979("ᩴ۫") ^ i23;
                                            i25 = ((iM559710 ^ i24) * 3013) ^ 1002067920;
                                            i26 = 796700198;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -1306582844:
                case -1144235629:
                    i5 = i21;
                    messageDigestM36660 = C16111.m36660();
                    short[] sArr3 = f82254;
                    if (C1017.f81942 >= 0) {
                        i4 = iM55684;
                        iM55682 = (C0946.m55979("᩷᩸") ^ i12) * 115;
                        i6 = ((iM55682 ^ i13) * 15023) ^ 1290521925;
                        i10 = -446647771;
                        i11 = iM55682 ^ i10;
                        i21 = i5;
                        iM55684 = i4;
                        sb = null;
                        i15 = i11;
                        i14 = i6;
                    } else {
                        i4 = iM55684;
                        String strM55822 = C0912.m55822(sArr3, 334, 11, i5);
                        if (!C0955.f81898) {
                            StringBuilder sb2 = new StringBuilder(strM55822);
                            C0912.m55825(sb2, str);
                            sArr2 = f82254;
                            i17 = 345;
                            i16 = 1;
                            if (!C0927.f81875) {
                                int iM559710 = C0946.m55979("۬ۖ") ^ i13;
                                sb = sb2;
                                i21 = i5;
                                i14 = ((iM559710 ^ i12) * (-2771)) ^ (-2048951628);
                                iM55684 = i4;
                                i15 = iM559710 ^ (-722570347);
                            }
                        }
                        iM55682 = (C0873.m55680("ᩳ۫") ^ i13) * (-11);
                        i6 = ((iM55682 ^ i12) * (-2059)) ^ 197047339;
                        i10 = 319309137;
                        i11 = iM55682 ^ i10;
                        i21 = i5;
                        iM55684 = i4;
                        sb = null;
                        i15 = i11;
                        i14 = i6;
                    }
                    imageView2 = imageView;
                    break;
                case -1294035445:
                case 792476860:
                    i4 = iM55684;
                    i5 = i21;
                    s2 = sArr[330];
                    i18 = s2 * s2;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ܰ۬") ^ i13;
                        i6 = ((iM55680 ^ i12) * (-24415)) ^ (-1620543890);
                        i7 = 407939402;
                    } else {
                        iM55680 = (C0946.m55979("ۚۧ") ^ i13) * 65;
                        i6 = ((iM55680 ^ i12) * 1559) ^ 102921402;
                        i7 = -1732944334;
                    }
                    i11 = iM55680 ^ i7;
                    i21 = i5;
                    iM55684 = i4;
                    i15 = i11;
                    i14 = i6;
                    imageView2 = imageView;
                    break;
                case -1145172596:
                case 708083768:
                    i4 = iM55684;
                    i5 = i21;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("ܰ۬") ^ i13;
                        i6 = ((iM55680 ^ i12) * (-24415)) ^ (-1620543890);
                        i7 = 407939402;
                    } else {
                        iM55680 = C0873.m55680("ۤ֨") ^ i12;
                        i6 = ((iM55680 ^ i13) * (-4013)) ^ 491017707;
                        i7 = -1945240643;
                    }
                    i11 = iM55680 ^ i7;
                    i21 = i5;
                    iM55684 = i4;
                    i15 = i11;
                    i14 = i6;
                    imageView2 = imageView;
                    break;
                case -1028899725:
                case -727052823:
                    C0989.m56095();
                    C0898.m55800();
                    break;
                case -920787364:
                case 877123579:
                    break;
                case -890825879:
                case -653653991:
                    if (!C0882.f81846) {
                        iM55979 = (C0946.m55979("ۗ֫") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM55979 ^ i13) * (-9487)) ^ (-1821798846);
                        i3 = 1585857433;
                        i15 = iM55979 ^ i3;
                        i14 = i2;
                    } else {
                        i4 = iM55684;
                        i5 = i21;
                        iM55680 = C0946.m55979("ܰ۬") ^ i13;
                        i6 = ((iM55680 ^ i12) * (-24415)) ^ (-1620543890);
                        i7 = 407939402;
                        i11 = iM55680 ^ i7;
                        i21 = i5;
                        iM55684 = i4;
                        i15 = i11;
                        i14 = i6;
                        imageView2 = imageView;
                    }
                    break;
                case -851222577:
                case 1851335619:
                    i4 = iM55684;
                    i5 = i21;
                    int i22 = i18 + 194825764;
                    i19 = i22 + i22;
                    s = 13958;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("ܰ۬") ^ i13;
                        i6 = ((iM55680 ^ i12) * (-24415)) ^ (-1620543890);
                        i7 = 407939402;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩶") ^ i12;
                        i6 = ((iM55680 ^ i13) * 23617) ^ (-1407651183);
                        i7 = -1522694518;
                    }
                    i11 = iM55680 ^ i7;
                    i21 = i5;
                    iM55684 = i4;
                    i15 = i11;
                    i14 = i6;
                    imageView2 = imageView;
                    break;
                case -615308047:
                case 107932773:
                    i21 = 58931;
                    int iM55685 = C0873.m55680("ۙ۬") ^ i12;
                    i14 = (-1785529156) ^ ((iM55685 ^ i13) * 5459);
                    imageView2 = imageView;
                    iM55684 = iM55684;
                    i15 = iM55685 ^ (-1047539472);
                    i = i;
                    break;
                case -529335167:
                case -20552383:
                    imageView2.setImageBitmap(bitmapM40498);
                    break;
                case -201323449:
                case 92988286:
                    messageDigestM36660.update(C0930.m55880(str2, charset));
                    strM55913 = C0937.m55913(messageDigestM36660.digest());
                    bitmapM33864 = C14828.m33864(strM55913);
                    if (bitmapM33864 != null) {
                        iM55979 = C0873.m55680("۫ܶ") ^ i13;
                        i2 = ((iM55979 ^ i12) * (-15849)) ^ 1146419305;
                        i3 = 2061669861;
                    } else {
                        iM55979 = C0873.m55680("᩺۟") ^ i12;
                        i2 = ((iM55979 ^ i13) * (-20477)) ^ (-991312247);
                        i3 = 1199480463;
                    }
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -196303972:
                case 1040049598:
                    i4 = iM55684;
                    i5 = i21;
                    sArr = f82254;
                    if (C1044.f81959 < 0) {
                        iM55680 = C0946.m55979("ۗ᩶") ^ i13;
                        i6 = ((iM55680 ^ i12) * 5221) ^ 1359901279;
                        i7 = -1029874893;
                        i11 = iM55680 ^ i7;
                        i21 = i5;
                        iM55684 = i4;
                        i15 = i11;
                        i14 = i6;
                        imageView2 = imageView;
                    }
                    iM55682 = (C0873.m55680("ᩳ۫") ^ i13) * (-11);
                    i6 = ((iM55682 ^ i12) * (-2059)) ^ 197047339;
                    i10 = 319309137;
                    i11 = iM55682 ^ i10;
                    i21 = i5;
                    iM55684 = i4;
                    sb = null;
                    i15 = i11;
                    i14 = i6;
                    imageView2 = imageView;
                    break;
                case -168704762:
                case 91135107:
                    if (C0845.f81821 >= 0) {
                        i4 = iM55684;
                        i5 = i21;
                        iM55682 = (C0946.m55979("᩷᩸") ^ i12) * 115;
                        i6 = ((iM55682 ^ i13) * 15023) ^ 1290521925;
                        i10 = -446647771;
                        i11 = iM55682 ^ i10;
                        i21 = i5;
                        iM55684 = i4;
                        sb = null;
                        i15 = i11;
                        i14 = i6;
                        imageView2 = imageView;
                    } else {
                        iM55979 = C0946.m55979("᩺ۨ") ^ i13;
                        i2 = ((iM55979 ^ i12) * (-4675)) ^ 470623215;
                        i3 = 956874679;
                        i15 = iM55979 ^ i3;
                        i14 = i2;
                    }
                    break;
                case -158506899:
                case 2107990994:
                    weakReference = new WeakReference(imageView2);
                    imageView2.setImageResource(iM55684);
                    C1053.m56331(imageView2, str);
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("᩺ۨ") ^ i13;
                        i2 = ((iM55979 ^ i12) * (-4675)) ^ 470623215;
                        i3 = 956874679;
                    } else {
                        iM55979 = C0873.m55680("֫ۚ") ^ i13;
                        i2 = ((iM55979 ^ i12) * 4957) ^ 1721666133;
                        i3 = -1114691929;
                    }
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -141117066:
                case 1044146050:
                    C14828.m33866(strM55913, bitmapM40498);
                    iM55979 = (i12 - C0946.m55979("ۘ֫")) * 97;
                    i2 = ((iM55979 ^ i13) * 17117) ^ (-295929932);
                    i3 = -1792126027;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case -44709167:
                case 1294000585:
                    int i23 = i21;
                    iM55684 = C0873.m55680(strM56462) ^ 2120173079;
                    if (z) {
                        iM55681 = (i12 - C0873.m55680("ۡۙ")) * 23;
                        i8 = ((iM55681 ^ i13) * 7041) ^ 1368288030;
                        i9 = 1195485866;
                    } else {
                        iM55681 = (i13 - C0946.m55979("᩶ᩴ")) * (-5);
                        i8 = ((iM55681 ^ i12) * 2389) ^ (-1569896468);
                        i9 = 2064927705;
                    }
                    i15 = iM55681 ^ i9;
                    i21 = i23;
                    i14 = i8;
                    imageView2 = imageView;
                    break;
                case 92436834:
                case 961488655:
                    i5 = i21;
                    StringBuilder sb3 = sb;
                    C0912.m55825(sb3, C1071.m56336(sArr2, i17, i16, i5));
                    C0863.m55629(sb3, i);
                    String strM55591 = C0845.m55591(sb3);
                    charset = StandardCharsets.UTF_8;
                    if (C0873.f81841 > 0) {
                        int iM559711 = C0946.m55979("ۤ֡") ^ i12;
                        int i24 = ((iM559711 ^ i13) * (-29023)) ^ 1214134003;
                        i15 = iM559711 ^ 1173361213;
                        i21 = i5;
                        sb = sb3;
                        i14 = i24;
                        str2 = strM55591;
                        i = i;
                    } else {
                        i4 = iM55684;
                        sb = sb3;
                        str2 = strM55591;
                        iM55680 = C0946.m55979("ܰ۬") ^ i13;
                        i6 = ((iM55680 ^ i12) * (-24415)) ^ (-1620543890);
                        i7 = 407939402;
                        i11 = iM55680 ^ i7;
                        i21 = i5;
                        iM55684 = i4;
                        i15 = i11;
                        i14 = i6;
                        imageView2 = imageView;
                    }
                    break;
                case 349026955:
                case 1995736619:
                    i4 = iM55684;
                    i5 = i21;
                    int i25 = s2 + s;
                    if ((i25 * i25) - i19 <= 0) {
                        iM55680 = (i12 - C0873.m55680("᩸ۡ")) * (-107);
                        i6 = ((iM55680 ^ i13) * (-747)) ^ 605950890;
                        i7 = 2061780167;
                    } else {
                        iM55680 = C0946.m55979("ܳ֨") ^ i13;
                        i6 = ((iM55680 ^ i12) * (-9513)) ^ 1572810293;
                        i7 = -1348661662;
                    }
                    i11 = iM55680 ^ i7;
                    i21 = i5;
                    iM55684 = i4;
                    i15 = i11;
                    i14 = i6;
                    imageView2 = imageView;
                    break;
                case 352782775:
                case 403333132:
                    C1964.m56597();
                    iM55979 = C0946.m55979("᩺ۨ") ^ i13;
                    i2 = ((iM55979 ^ i12) * (-4675)) ^ 470623215;
                    i3 = 956874679;
                    i15 = iM55979 ^ i3;
                    i14 = i2;
                    break;
                case 1111253831:
                case 1981190972:
                    i21 = 2206;
                    int iM55686 = C0873.m55680("ۙ۬") ^ i12;
                    i14 = (-1785529156) ^ ((iM55686 ^ i13) * 5459);
                    imageView2 = imageView;
                    iM55684 = iM55684;
                    i15 = iM55686 ^ (-1047539472);
                    i = i;
                    break;
                case 1887424132:
                case 2047656436:
                    i4 = iM55684;
                    i5 = i21;
                    strM56462 = C1404.m56462(f82254, 331, 3, i5);
                    if (C1028.m56247() < 0) {
                        iM55680 = C0946.m55979("᩹᩵") ^ i13;
                        i6 = ((iM55680 ^ i12) * 237) ^ (-946319785);
                        i7 = 284625981;
                        i11 = iM55680 ^ i7;
                        i21 = i5;
                        iM55684 = i4;
                        i15 = i11;
                        i14 = i6;
                        imageView2 = imageView;
                    }
                    iM55682 = (C0946.m55979("᩷᩸") ^ i12) * 115;
                    i6 = ((iM55682 ^ i13) * 15023) ^ 1290521925;
                    i10 = -446647771;
                    i11 = iM55682 ^ i10;
                    i21 = i5;
                    iM55684 = i4;
                    sb = null;
                    i15 = i11;
                    i14 = i6;
                    imageView2 = imageView;
                    break;
                default:
                    imageView2.setImageResource(iM55684);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03bd A[PHI: r16 r17
      0x03bd: PHI (r16v19 int) = (r16v1 int), (r16v2 int), (r16v20 int) binds: [B:101:0x03bb, B:97:0x0397, B:24:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r17v18 java.lang.String) = (r17v1 java.lang.String), (r17v2 java.lang.String), (r17v19 java.lang.String) binds: [B:101:0x03bb, B:97:0x0397, B:24:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x03ef A[PHI: r4 r5 r16 r17
      0x03ef: PHI (r4v3 short) = (r4v2 short), (r4v2 short), (r4v2 short), (r4v4 short) binds: [B:105:0x03ed, B:93:0x0372, B:85:0x031a, B:73:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x03ef: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:105:0x03ed, B:93:0x0372, B:85:0x031a, B:73:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x03ef: PHI (r16v8 int) = (r16v0 int), (r16v3 int), (r16v5 int), (r16v9 int) binds: [B:105:0x03ed, B:93:0x0372, B:85:0x031a, B:73:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x03ef: PHI (r17v8 java.lang.String) = (r17v0 java.lang.String), (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:105:0x03ed, B:93:0x0372, B:85:0x031a, B:73:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40505(String str, int i, String str2, WeakReference weakReference) {
        int iM55979;
        int i2;
        String str3 = str;
        String strM56016 = null;
        Bitmap bitmapM40498 = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1418935826;
        int i8 = C0912.f81867;
        int i9 = C0967.f81910;
        int iM55680 = C0873.m55680("ۙۚ") ^ i9;
        int i10 = ((iM55680 ^ i8) * 13169) ^ 42805547;
        int i11 = -681147240;
        while (true) {
            int i12 = iM55680 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * (-29437)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2019683341:
                    case -1860502787:
                        C0955.m56025();
                        break;
                    case -1902090961:
                    case 1559733987:
                        strM56016 = strM56016;
                        i7 = i7;
                        int i13 = i4 + i5;
                        if (i3 - (i13 + i13) <= 0) {
                            iM55979 = C0873.m55680("ۙۡ") ^ i8;
                            i10 = (-1389479646) ^ ((iM55979 ^ i9) * (-24697));
                            i2 = 470237363;
                        } else {
                            iM55979 = (C0946.m55979("ۢ۠") + i9) * (-63);
                            i10 = (-955106985) ^ ((iM55979 ^ i8) * 13507);
                            i2 = -1723349595;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -1847430809:
                    case -1761284284:
                        i7 = i7;
                        if (bitmapM40498 != null) {
                            int iM55681 = C0873.m55680("ۜᩳ") ^ i8;
                            i12 = iM55681 ^ 1675459892;
                            i10 = ((iM55681 ^ i9) * (-22879)) ^ (-1758006606);
                            i7 = i7;
                        } else {
                            strM56016 = strM56016;
                            iM55979 = (C0873.m55680("֨ۤ") + i9) * 63;
                            i10 = (-14070169) ^ ((iM55979 ^ i8) * 24333);
                            i2 = 1761715247;
                            i12 = iM55979 ^ i2;
                            i7 = i7;
                            strM56016 = strM56016;
                            str3 = str;
                        }
                        break;
                    case -1734517207:
                    case 765132867:
                        strM56016 = strM56016;
                        i7 = i7;
                        sArr = f82254;
                        if (C0989.f81920 >= 0) {
                            iM55979 = C0946.m55979("ۢ᩺") ^ i8;
                            i10 = 426578198 ^ ((iM55979 ^ i9) * 12609);
                            i2 = 1891291428;
                        } else {
                            iM55979 = C0946.m55979("ۢܿ") ^ i9;
                            i10 = (-1849658959) ^ ((iM55979 ^ i8) * 31651);
                            i2 = 725973197;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -1693252378:
                    case -1171160620:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (C0873.f81841 <= 0) {
                            iM55979 = C0873.m55680("ܺۢ") ^ i8;
                            i10 = 1968757969 ^ ((iM55979 ^ i9) * (-9471));
                            i2 = 1613646482;
                        } else {
                            iM55979 = (C0873.m55680("֫᩺") + i9) * (-39);
                            i10 = (-1773590447) ^ ((iM55979 ^ i8) * (-16895));
                            i2 = 1225179145;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -1595839484:
                    case -317805950:
                        strM56016 = strM56016;
                        i7 = i7;
                        s = sArr[311];
                        s2 = 8170;
                        if (RunnableC0897.m55784()) {
                            iM55979 = (C0946.m55979("ܿ֡") + i8) * 79;
                            i10 = 36450027 ^ ((iM55979 ^ i9) * (-3477));
                            i2 = 407375669;
                        } else {
                            iM55979 = (i9 - C0873.m55680("۟֡")) * 123;
                            i10 = (-6702225) ^ ((iM55979 ^ i8) * (-13637));
                            i2 = 1459606027;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -1523568180:
                    case -255824382:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (AbstractC0942.f81890 <= 0) {
                            iM55979 = (C0946.m55979("ܿ֡") + i8) * 79;
                            i10 = 36450027 ^ ((iM55979 ^ i9) * (-3477));
                            i2 = 407375669;
                        } else {
                            iM55979 = (i8 - C0873.m55680("ܽۖ")) * 43;
                            i10 = (-1792057913) ^ ((iM55979 ^ i9) * (-20299));
                            i2 = -1613150610;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -1505526766:
                    case 2044807423:
                        strM56016 = C0949.m56016(f82254, 312, 8, i6);
                        int iM55682 = (C0873.m55680("᩶ۡ") + i9) * (-79);
                        i10 = ((iM55682 ^ i8) * 2461) ^ 1655984943;
                        i12 = iM55682 ^ (-1305348475);
                        i7 = i7;
                        str3 = str;
                        break;
                    case -1436498313:
                    case 1726494341:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (C1046.f81962 <= 0) {
                            iM55979 = (C0946.m55979("ܿ֡") + i8) * 79;
                            i10 = 36450027 ^ ((iM55979 ^ i9) * (-3477));
                            i2 = 407375669;
                        } else {
                            iM55979 = (C0873.m55680("ۢ۫") ^ i9) * 43;
                            i10 = (-1697568074) ^ ((iM55979 ^ i8) * 12241);
                            i2 = 953437413;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -1312734548:
                    case 884703583:
                        break;
                    case -896786511:
                    case -407821627:
                        RunnableC0897.m55784();
                        iM55680 = (C0946.m55979("ܶܶ") + i9) * (-25);
                        i10 = ((iM55680 ^ i8) * (-11533)) ^ (-1217143482);
                        i11 = -615516929;
                    case -727400297:
                    case 1556256749:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (C0955.f81898) {
                            iM55979 = (C0946.m55979("ܿ֡") + i8) * 79;
                            i10 = 36450027 ^ ((iM55979 ^ i9) * (-3477));
                            i2 = 407375669;
                        } else {
                            iM55979 = C0946.m55979("᩺ܺ") ^ i8;
                            i10 = 1302602969 ^ ((iM55979 ^ i9) * 423);
                            i2 = 1250046086;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -715680782:
                    case 997934519:
                        i6 = 20536;
                        iM55979 = C0946.m55979("᩻ܳ") ^ i8;
                        i10 = (-1010339467) ^ ((iM55979 ^ i9) * 25257);
                        i2 = 975744883;
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -428538570:
                    case 518296851:
                        if (C1071.f81975 <= 0) {
                            iM55680 = C0873.m55680("۠ܽ") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-23079)) ^ 464945255;
                            i11 = -83787201;
                        } else {
                            iM55680 = (C0946.m55979("ܶܶ") + i9) * (-25);
                            i10 = ((iM55680 ^ i8) * (-11533)) ^ (-1217143482);
                            i11 = -615516929;
                        }
                        break;
                    case -382583996:
                    case 1889900086:
                        C1404.m56468();
                        if (C1017.f81942 >= 0) {
                            strM56016 = strM56016;
                            i7 = i7;
                            iM55979 = C0946.m55979("ۙۛ") ^ i8;
                            i10 = (-1328023634) ^ ((iM55979 ^ i9) * 18375);
                            i2 = 1473379027;
                            i12 = iM55979 ^ i2;
                            i7 = i7;
                            strM56016 = strM56016;
                            str3 = str;
                        } else {
                            iM55680 = (C0946.m55979("ܶܶ") + i9) * (-25);
                            i10 = ((iM55680 ^ i8) * (-11533)) ^ (-1217143482);
                            i11 = -615516929;
                        }
                        break;
                    case -373520873:
                    case 602175470:
                        C1404.m56468();
                        if (ViewOnClickListenerC0939.m55941() < 0) {
                            iM55680 = (C0946.m55979("ܶܶ") + i9) * (-25);
                            i10 = ((iM55680 ^ i8) * (-11533)) ^ (-1217143482);
                            i11 = -615516929;
                        }
                        strM56016 = strM56016;
                        i7 = i7;
                        iM55979 = C0946.m55979("۠ۛ") ^ i8;
                        i10 = 1972526420 ^ ((iM55979 ^ i9) * (-11709));
                        i2 = 1563334012;
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -207036865:
                    case 1922533022:
                        C1012.m56134();
                        if (C1229.f82066 < 0) {
                            iM55680 = C0946.m55979("ۘ᩵") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-4381)) ^ (-145116194);
                            i11 = -1036889982;
                        } else {
                            iM55680 = C0873.m55680("۠ܽ") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-23079)) ^ 464945255;
                            i11 = -83787201;
                        }
                        break;
                    case -193557564:
                    case 1094510221:
                        strM56016 = strM56016;
                        i7 = i7;
                        int i14 = s + s2;
                        i3 = i14 * i14;
                        i4 = s * s;
                        i5 = 66748900;
                        if (C1124.m56367() >= 0) {
                            iM55979 = C0873.m55680("֨֨") ^ i9;
                            i10 = (-575230384) ^ ((iM55979 ^ i8) * 4819);
                            i2 = -2145865404;
                        } else {
                            iM55979 = C0946.m55979("ܿ֨") ^ i8;
                            i10 = (-826177409) ^ ((iM55979 ^ i9) * (-7077));
                            i2 = -848668430;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case -46838489:
                    case 1533211489:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (C0937.f81884) {
                            iM55979 = C0946.m55979("ۜ᩹") ^ i8;
                            i10 = (-629383071) ^ ((iM55979 ^ i9) * 29743);
                            i2 = 622985740;
                        } else {
                            iM55979 = C0946.m55979("۠ۛ") ^ i8;
                            i10 = 1972526420 ^ ((iM55979 ^ i9) * (-11709));
                            i2 = 1563334012;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case 141782630:
                    case 863036776:
                        if (C0930.f81879 > 0) {
                            strM56016 = strM56016;
                            i7 = i7;
                            iM55979 = C0873.m55680("֨֨") ^ i9;
                            i10 = (-575230384) ^ ((iM55979 ^ i8) * 4819);
                            i2 = -2145865404;
                            i12 = iM55979 ^ i2;
                            i7 = i7;
                            strM56016 = strM56016;
                            str3 = str;
                        } else {
                            iM55680 = C0873.m55680("۠ܽ") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-23079)) ^ 464945255;
                            i11 = -83787201;
                        }
                        break;
                    case 155965202:
                    case 1753617803:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (C0894.m55769() >= 0) {
                            iM55979 = C0873.m55680("ܺۢ") ^ i8;
                            i10 = 1968757969 ^ ((iM55979 ^ i9) * (-9471));
                            i2 = 1613646482;
                        } else {
                            iM55979 = C0946.m55979("۠֫") ^ i9;
                            i10 = 796580189 ^ ((iM55979 ^ i8) * (-32595));
                            i2 = 280434297;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case 196922384:
                    case 753308160:
                        if (!C0955.f81898) {
                            strM56016 = strM56016;
                            i7 = i7;
                            iM55979 = C0873.m55680("ܺۢ") ^ i8;
                            i10 = 1968757969 ^ ((iM55979 ^ i9) * (-9471));
                            i2 = 1613646482;
                            i12 = iM55979 ^ i2;
                            i7 = i7;
                            strM56016 = strM56016;
                            str3 = str;
                        } else {
                            iM55680 = (C0946.m55979("ۤ᩹") ^ i9) * 77;
                            i10 = ((iM55680 ^ i8) * 1807) ^ (-1749500669);
                            i11 = -890702788;
                        }
                        break;
                    case 337377893:
                    case 588830821:
                        C1046.m56302();
                        if (C1053.m56327() >= 0) {
                            iM55680 = (C0946.m55979("ۤ᩹") ^ i9) * 77;
                            i10 = ((iM55680 ^ i8) * 1807) ^ (-1749500669);
                            i11 = -890702788;
                            break;
                        }
                        iM55680 = (C0946.m55979("ܶܶ") + i9) * (-25);
                        i10 = ((iM55680 ^ i8) * (-11533)) ^ (-1217143482);
                        i11 = -615516929;
                        break;
                    case 1004186551:
                    case 1281043514:
                        strM56016 = strM56016;
                        i7 = i7;
                        if (C1003.f81929 <= 0) {
                            iM55979 = C0946.m55979("ۙۛ") ^ i8;
                            i10 = (-1328023634) ^ ((iM55979 ^ i9) * 18375);
                            i2 = 1473379027;
                        } else {
                            iM55979 = C0873.m55680("᩷ۛ") ^ i8;
                            i10 = 1260842694 ^ ((iM55979 ^ i9) * (-6965));
                            i2 = -615203079;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case 1160746154:
                    case 1427578186:
                        i7 = i7;
                        StringBuilder sb = new StringBuilder(strM56016);
                        C0912.m55825(sb, str3);
                        strM56016 = strM56016;
                        try {
                            C0912.m55825(sb, AbstractC0942.m55970(f82254, 320, 1, i6));
                            C0845.m55589(sb, i);
                            C0912.m55825(sb, RunnableC0871.m55667(f82254, 321, 9, i6));
                            bitmapM40498 = m40498(BitmapFactory.decodeStream(C19179.m43668(C0845.m55591(sb)).m43670().m45436().m4011()));
                            iM55979 = C0946.m55979("ۙۖ") ^ i8;
                            i10 = (-647769874) ^ ((iM55979 ^ i9) * 18097);
                            i2 = -769101330;
                        } catch (IOException unused) {
                            iM55979 = (C0873.m55680("֨ۤ") + i9) * 63;
                            i10 = (-14070169) ^ ((iM55979 ^ i8) * 24333);
                            i2 = 1761715247;
                        }
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case 1234597451:
                    case 1381358306:
                        if (C0873.f81841 > 0) {
                            strM56016 = strM56016;
                            i7 = i7;
                            iM55979 = C0946.m55979("ۢ᩺") ^ i8;
                            i10 = 426578198 ^ ((iM55979 ^ i9) * 12609);
                            i2 = 1891291428;
                            i12 = iM55979 ^ i2;
                            i7 = i7;
                            strM56016 = strM56016;
                            str3 = str;
                        }
                        strM56016 = strM56016;
                        i7 = i7;
                        iM55979 = C0946.m55979("۠ۛ") ^ i8;
                        i10 = 1972526420 ^ ((iM55979 ^ i9) * (-11709));
                        i2 = 1563334012;
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    case 1253012341:
                    case 1607286799:
                        i6 = 35074;
                        iM55979 = C0946.m55979("᩻ܳ") ^ i8;
                        i10 = (-1010339467) ^ ((iM55979 ^ i9) * 25257);
                        i2 = 975744883;
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                    default:
                        try {
                            C14828.m33866(str2, bitmapM40498);
                            i7 = i7;
                            try {
                                C1036.m56259(new RunnableC2470(weakReference, str3, bitmapM40498, 2));
                                break;
                            } catch (IOException unused2) {
                            }
                        } catch (IOException unused3) {
                            i7 = i7;
                        }
                        strM56016 = strM56016;
                        iM55979 = (C0873.m55680("֨ۤ") + i9) * 63;
                        i10 = (-14070169) ^ ((iM55979 ^ i8) * 24333);
                        i2 = 1761715247;
                        i12 = iM55979 ^ i2;
                        i7 = i7;
                        strM56016 = strM56016;
                        str3 = str;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b A[PHI: r8 r13
      0x011b: PHI (r8v5 float) = (r8v3 float), (r8v2 float), (r8v2 float), (r8v2 float) binds: [B:40:0x0119, B:16:0x0079, B:6:0x0050, B:94:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:40:0x0119, B:16:0x0079, B:6:0x0050, B:94:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0153 A[PHI: r7 r10 r11 r12
      0x0153: PHI (r7v4 float) = (r7v3 float), (r7v2 float), (r7v2 float) binds: [B:44:0x0151, B:32:0x00d7, B:28:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float) binds: [B:44:0x0151, B:32:0x00d7, B:28:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:44:0x0151, B:32:0x00d7, B:28:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r12v3 float) = (r12v2 float), (r12v2 float), (r12v4 float) binds: [B:44:0x0151, B:32:0x00d7, B:28:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c4 A[PHI: r1 r4 r17
      0x01c4: PHI (r1v45 int) = (r1v42 int), (r1v47 int) binds: [B:52:0x01aa, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:52:0x01aa, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r17v20 int) = (r17v19 int), (r17v22 int) binds: [B:52:0x01aa, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0252 A[PHI: r3 r5 r6 r18
      0x0252: PHI (r3v22 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:64:0x0250, B:18:0x007d, B:16:0x0079, B:49:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v4 float) binds: [B:64:0x0250, B:18:0x007d, B:16:0x0079, B:49:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r6v3 float) = (r6v2 float), (r6v2 float), (r6v2 float), (r6v4 float) binds: [B:64:0x0250, B:18:0x007d, B:16:0x0079, B:49:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r18v17 int) = (r18v4 int), (r18v3 int), (r18v3 int), (r18v18 int) binds: [B:64:0x0250, B:18:0x007d, B:16:0x0079, B:49:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x029d A[PHI: r1 r17
      0x029d: PHI (r1v46 int) = (r1v39 int), (r1v47 int) binds: [B:70:0x0285, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r17v21 int) = (r17v16 int), (r17v22 int) binds: [B:70:0x0285, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (p067l.C0890.m55740() != false) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m40498(Bitmap bitmap) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int i4;
        int iM55979;
        int i5;
        int i6;
        int i7 = C0866.f81837;
        int i8 = C0894.f81854;
        int iM55681 = (C0873.m55680("ۖۚ") + i7) * (-27);
        int i9 = ((iM55681 ^ i8) * (-20171)) ^ 1274358078;
        int i10 = iM55681 ^ (-1448889986);
        int height = 0;
        int i11 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float fMin = 0.0f;
        float f5 = 0.0f;
        int iRound = 0;
        float f6 = 0.0f;
        int iRound2 = 0;
        int i12 = 1589705145;
        int width = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i8) * 27119) >> 31));
            switch (i12) {
                case -2086217986:
                case -916116585:
                    C0946.m55980();
                    if (C1929.m56553()) {
                        iM55680 = C0946.m55979("֨۠") ^ i8;
                        i = ((iM55680 ^ i7) * (-19991)) ^ 492690902;
                        i2 = -966652793;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۛ֫")) * (-29);
                        i = ((iM55680 ^ i8) * 353) ^ (-2137488338);
                        i2 = -943767987;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1876879695:
                case -561157507:
                    i3 = height;
                    i4 = width;
                    if (bitmap != null) {
                        iM55979 = (C0946.m55979("ܽܽ") + i7) * (-91);
                        i5 = ((iM55979 ^ i8) * (-2335)) ^ (-662463304);
                        i6 = 475083787;
                    } else {
                        iM55979 = C0873.m55680("֨ܳ") ^ i8;
                        i5 = ((iM55979 ^ i7) * 13849) ^ 2067862915;
                        i6 = 648102779;
                    }
                    int i13 = iM55979 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i13;
                    break;
                case -1712015957:
                case 607676021:
                    C0949.m56012();
                    break;
                case -1514584848:
                case 1064503460:
                    C0927.m55873();
                    if (C0946.f81894 == 0) {
                        i3 = height;
                        i4 = width;
                        iM55979 = C0946.m55979("ۧᩴ") ^ i8;
                        i5 = ((iM55979 ^ i7) * (-15607)) ^ 1168371030;
                        i6 = 249439226;
                        int i14 = iM55979 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i14;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۛ֫")) * (-29);
                        i = ((iM55680 ^ i8) * 353) ^ (-2137488338);
                        i2 = -943767987;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1411780455:
                case -1108472349:
                    return bitmap;
                case -1336191734:
                case 2124990292:
                    C0898.m55800();
                    iM55680 = C0946.m55979("֨۠") ^ i8;
                    i = ((iM55680 ^ i7) * (-19991)) ^ 492690902;
                    i2 = -966652793;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1303436540:
                case 1966247962:
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                    if (C1048.m56305() >= 0) {
                        iM55680 = C0946.m55979("֨۠") ^ i8;
                        i = ((iM55680 ^ i7) * (-19991)) ^ 492690902;
                        i2 = -966652793;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۛ") ^ i8) * (-27);
                        i = ((iM55680 ^ i7) * 16563) ^ (-653474986);
                        i2 = 319104281;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1153635447:
                case 1966773924:
                    f3 = f / f2;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = (C0946.m55979("ۧܰ") ^ i7) * 9;
                        i = ((iM55680 ^ i8) * (-8667)) ^ 2058605153;
                        i2 = 1103843793;
                    } else {
                        iM55680 = (C0873.m55680("ܰܰ") + i7) * (-45);
                        i = ((iM55680 ^ i8) * (-8459)) ^ (-2138183208);
                        i2 = 514769744;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -901179763:
                case 292527816:
                    iRound = Math.round(f5);
                    f6 = f4 * fMin;
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("ۧܰ") ^ i7) * 9;
                        i = ((iM55680 ^ i8) * (-8667)) ^ 2058605153;
                        i2 = 1103843793;
                    } else {
                        iM55680 = (C0946.m55979("ۧۘ") + i7) * (-49);
                        i = ((iM55680 ^ i8) * (-2393)) ^ 386211242;
                        i2 = -150217129;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -878539029:
                case -794662263:
                    i3 = height;
                    i4 = width;
                    i11 = 512;
                    if (i4 <= 512) {
                        iM55979 = (i7 - C0946.m55979("ۢ۟")) * (-31);
                        i5 = ((iM55979 ^ i8) * 21619) ^ 1368157522;
                        i6 = 113726716;
                    } else {
                        iM55979 = (i8 - C0873.m55680("ۤܽ")) * (-33);
                        i5 = ((iM55979 ^ i7) * (-13999)) ^ 1240062594;
                        i6 = 1001910007;
                    }
                    int i15 = iM55979 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i15;
                    break;
                case -812119134:
                case 1260044246:
                    C1028.m56247();
                    return null;
                case -805771347:
                case 160980627:
                    i3 = height;
                    i4 = width;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۧᩴ") ^ i8;
                        i5 = ((iM55979 ^ i7) * (-15607)) ^ 1168371030;
                        i6 = 249439226;
                    } else {
                        iM55979 = (C0946.m55979("۫ܺ") ^ i7) * 35;
                        i5 = ((iM55979 ^ i8) * (-31969)) ^ 2118255313;
                        i6 = 1249810031;
                    }
                    int i16 = iM55979 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i16;
                    break;
                case -721616026:
                case -132895865:
                    f = i11;
                    i4 = width;
                    f2 = i4;
                    if (C0873.f81841 > 0) {
                        iM55979 = C0873.m55680("ۖ۫") ^ i8;
                        i3 = height;
                        i5 = ((iM55979 ^ i7) * 25153) ^ 1040149074;
                        i6 = 910439477;
                        int i17 = iM55979 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i17;
                    } else {
                        width = i4;
                        iM55680 = C0946.m55979("֨۠") ^ i8;
                        i = ((iM55680 ^ i7) * (-19991)) ^ 492690902;
                        i2 = -966652793;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -693225400:
                case 826102986:
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true);
                    bitmap.recycle();
                    return bitmapCreateScaledBitmap;
                case -670060503:
                case -303201119:
                    f4 = height;
                    if (C0967.m56074()) {
                        iM55680 = (i7 - C0946.m55979("ۛ֫")) * (-29);
                        i = ((iM55680 ^ i8) * 353) ^ (-2137488338);
                        i2 = -943767987;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ۨ᩹")) * (-9);
                        i = ((iM55680 ^ i7) * 14445) ^ (-468105612);
                        i2 = 1810550373;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -65792518:
                case 1509708149:
                    i3 = height;
                    i4 = width;
                    if (height > i11) {
                        iM55979 = (i8 - C0873.m55680("ۤܽ")) * (-33);
                        i5 = ((iM55979 ^ i7) * (-13999)) ^ 1240062594;
                        i6 = 1001910007;
                    } else {
                        iM55979 = C0873.m55680("֨ܳ") ^ i8;
                        i5 = ((iM55979 ^ i7) * 13849) ^ 2067862915;
                        i6 = 648102779;
                    }
                    int i18 = iM55979 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i18;
                    break;
                case 111884542:
                case 117786853:
                    i3 = height;
                    i4 = width;
                    if (C0861.f81831) {
                        iM55979 = (i7 - C0946.m55979("᩹ۚ")) * 17;
                        i5 = ((iM55979 ^ i8) * 1275) ^ 893823287;
                        i6 = -658924495;
                    } else {
                        iM55979 = C0873.m55680("۫ܳ") ^ i7;
                        i5 = ((iM55979 ^ i8) * (-8039)) ^ 1546280358;
                        i6 = 2056965979;
                    }
                    int i19 = iM55979 ^ i6;
                    width = i4;
                    i9 = i5;
                    height = i3;
                    i10 = i19;
                    break;
                case 443482752:
                case 1516056038:
                    f5 = f2 * fMin;
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0946.m55979("ۧܰ") ^ i7) * 9;
                        i = ((iM55680 ^ i8) * (-8667)) ^ 2058605153;
                        i2 = 1103843793;
                    } else {
                        iM55680 = C0873.m55680("ܽۘ") ^ i8;
                        i = ((iM55680 ^ i7) * 10349) ^ (-1105271240);
                        i2 = -1676182374;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case 1832552973:
                case 1906701302:
                    fMin = Math.min(f3, f / f4);
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (i7 - C0946.m55979("ۖۖ")) * (-13);
                        i = ((iM55680 ^ i8) * 10569) ^ 656409366;
                        i2 = -1320108263;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        i3 = height;
                        i4 = width;
                        iM55979 = C0873.m55680("۫ܳ") ^ i7;
                        i5 = ((iM55979 ^ i8) * (-8039)) ^ 1546280358;
                        i6 = 2056965979;
                        int i110 = iM55979 ^ i6;
                        width = i4;
                        i9 = i5;
                        height = i3;
                        i10 = i110;
                    }
                    break;
                default:
                    iRound2 = Math.round(f6);
                    if (C0992.f81922 >= 0) {
                        iM55680 = (i7 - C0946.m55979("ۛ֫")) * (-29);
                        i = ((iM55680 ^ i8) * 353) ^ (-2137488338);
                        i2 = -943767987;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ۗ۟")) * 37;
                        i = ((iM55680 ^ i7) * (-12413)) ^ 1661306992;
                        i2 = -1533600531;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }
}
