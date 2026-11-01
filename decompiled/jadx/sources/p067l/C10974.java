package p067l;

import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10974 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۢܳ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f82096 = {9603, 3181, 2152, 9077, 3846, 25657, 25702, 25722, 25699, 25713, 25727, 25720, 25657, 25726, 25727, 25701, 25698, 25721, 25700, 25711, 25727, 25714, 25727, 25698, 25715, 25723, 25701, 25727, 25719, 25726, 25725, 25720, 25699, 25698, 25696, 25717, 25701};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f30393;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f30394;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC3597 f30395;

    /* JADX WARN: Code duplicated, block: B:59:0x0200 A[PHI: r7 r8 r11 r17 r18
      0x0200: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:58:0x01fe, B:50:0x01bd, B:9:0x0059, B:42:0x0153, B:90:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r8v3 short) = (r8v2 short), (r8v1 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:58:0x01fe, B:50:0x01bd, B:9:0x0059, B:42:0x0153, B:90:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:58:0x01fe, B:50:0x01bd, B:9:0x0059, B:42:0x0153, B:90:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r17v24 int) = (r17v7 int), (r17v9 int), (r17v13 int), (r17v19 int), (r17v25 int) binds: [B:58:0x01fe, B:50:0x01bd, B:9:0x0059, B:42:0x0153, B:90:0x0200] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r18v6 l.֨ᩳ᩷) = (r18v1 l.֨ᩳ᩷), (r18v1 l.֨ᩳ᩷), (r18v1 l.֨ᩳ᩷), (r18v2 l.֨ᩳ᩷), (r18v1 l.֨ᩳ᩷) binds: [B:58:0x01fe, B:50:0x01bd, B:9:0x0059, B:42:0x0153, B:90:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0234 A[PHI: r2 r4 r6 r9 r10 r13 r17
      0x0234: PHI (r2v3 android.widget.TextView) = 
      (r2v1 android.widget.TextView)
      (r2v1 android.widget.TextView)
      (r2v2 android.widget.TextView)
      (r2v1 android.widget.TextView)
     binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char), (r6v1 char) binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r13v3 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v2 short[]), (r13v1 short[]) binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r17v22 int) = (r17v6 int), (r17v8 int), (r17v21 int), (r17v23 int) binds: [B:62:0x0232, B:54:0x01de, B:92:0x0234, B:91:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x026a A[PHI: r5 r17
      0x026a: PHI (r5v4 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:66:0x0268, B:9:0x0059, B:89:0x026a] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r17v28 int) = (r17v5 int), (r17v13 int), (r17v34 int) binds: [B:66:0x0268, B:9:0x0059, B:89:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m25328(C10974 c10974) {
        int iM55680;
        int i;
        int iM55979;
        int i2;
        int i3;
        int i4;
        C10974 c10975 = c10974;
        TextView textView = null;
        int iM559710 = 0;
        String strM56386 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = -1938051262;
        int i10 = RunnableC0938.f81886;
        int i11 = AbstractC0942.f81890;
        int iM55681 = C0873.m55680("֫ۗ") ^ i11;
        int i12 = ((iM55681 ^ i10) * 29173) ^ 1879925189;
        int i13 = iM55681 ^ (-660009524);
        ActivityC3597 activityC3597 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * 30159) >> 31));
            switch (i14) {
                case -2103261508:
                case 874997406:
                    C0890.m55740();
                    break;
                case -2088216634:
                case -392743085:
                    i8 = 31394;
                    iM55680 = C0946.m55979("ᩴۘ") ^ i10;
                    i12 = ((iM55680 ^ i11) * (-19825)) ^ 597497252;
                    i = -738555367;
                    int i15 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i15;
                    c10975 = c10974;
                    break;
                case -1912392509:
                case -1505639569:
                    i14 = i14;
                    sArr = f82096;
                    if (C1053.m56327() >= 0) {
                        iM55680 = (C0873.m55680("ۜ֫") + i10) * (-65);
                        i12 = ((iM55680 ^ i11) * (-26023)) ^ (-1516893336);
                        i = -1126383024;
                    } else {
                        iM55680 = (C0873.m55680("ۡۜ") ^ i10) * 53;
                        i12 = ((iM55680 ^ i11) * (-9333)) ^ 1631610674;
                        i = 2064848253;
                    }
                    int i16 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i16;
                    c10975 = c10974;
                    break;
                case -1778170362:
                case 1315236616:
                    activityC3597.f7312.setClickable(false);
                    break;
                case -1626790584:
                case 1223474264:
                    i14 = i14;
                    c = 0;
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i10 - C0873.m55680("ᩴۢ")) * 65;
                        i12 = ((iM55680 ^ i11) * 8015) ^ 1544376740;
                        i = -64129418;
                    } else {
                        iM55680 = (C0946.m55979("֫ۘ") + i11) * 63;
                        i12 = ((iM55680 ^ i10) * (-32129)) ^ (-1854782929);
                        i = -312298004;
                    }
                    int i17 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i17;
                    c10975 = c10974;
                    break;
                case -1620078697:
                case 1953847971:
                    i14 = i14;
                    iM559710 = 2128493321 ^ C0946.m55979(strM56386);
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۛ") ^ i10) * 49;
                        i2 = ((iM55979 ^ i11) * (-16069)) ^ (-532709539);
                        i3 = 1856602034;
                    } else {
                        iM55979 = C0946.m55979("ܺᩳ") ^ i11;
                        i2 = ((iM55979 ^ i10) * 26493) ^ (-181645923);
                        i3 = 841610605;
                    }
                    i4 = i14;
                    i13 = iM55979 ^ i3;
                    i12 = i2;
                    i9 = i4;
                    break;
                case -1615662059:
                case -1186691044:
                    i14 = i14;
                    s = sArr[c];
                    s2 = 35558;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i11 - C0873.m55680("ۘᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM55680 ^ i10) * (-13111)) ^ (-1213980311);
                        i = 1961002735;
                    } else {
                        iM55680 = (C0873.m55680("֨ܶ") + i11) * C0254q.f1218h;
                        i12 = ((iM55680 ^ i10) * (-32605)) ^ (-1672968544);
                        i = 1079069552;
                    }
                    int i18 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i18;
                    c10975 = c10974;
                    break;
                case -1333274021:
                case 1211116055:
                    i14 = i14;
                    C1024.m56209();
                    C1929.m56553();
                    iM55979 = (C0873.m55680("᩷ۛ") ^ i10) * 49;
                    i2 = ((iM55979 ^ i11) * (-16069)) ^ (-532709539);
                    i3 = 1856602034;
                    i4 = i14;
                    i13 = iM55979 ^ i3;
                    i12 = i2;
                    i9 = i4;
                    break;
                case -1148388593:
                case -782565815:
                    i14 = i14;
                    strM56386 = C1194.m56386(sArr2, 1, 3, i8);
                    if (!C0912.m55833()) {
                        iM55979 = (C0873.m55680("ܿ᩸") ^ i10) * (-77);
                        i2 = ((iM55979 ^ i11) * 27175) ^ 918231634;
                        i3 = -2118020290;
                        i4 = i14;
                        i13 = iM55979 ^ i3;
                        i12 = i2;
                        i9 = i4;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ᩴۢ")) * 65;
                        i12 = ((iM55680 ^ i11) * 8015) ^ 1544376740;
                        i = -64129418;
                        int i19 = iM55680 ^ i;
                        i9 = i14;
                        i13 = i19;
                        c10975 = c10974;
                    }
                    break;
                case -945122960:
                case 1109028823:
                    i14 = i14;
                    ActivityC3597 activityC3598 = c10975.f30395;
                    activityC3598.f7313 = c10975.f30394;
                    if (C0989.m56095() > 0) {
                        int iM559711 = (i11 - C0946.m55979("ۚۨ")) * (-95);
                        activityC3597 = activityC3598;
                        i12 = ((iM559711 ^ i10) * (-5305)) ^ (-931295146);
                        c10975 = c10974;
                        i4 = i14;
                        i13 = iM559711 ^ (-1600786771);
                        i9 = i4;
                    } else {
                        activityC3597 = activityC3598;
                        iM55680 = (i11 - C0873.m55680("ۘᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM55680 ^ i10) * (-13111)) ^ (-1213980311);
                        i = 1961002735;
                        int i110 = iM55680 ^ i;
                        i9 = i14;
                        i13 = i110;
                        c10975 = c10974;
                    }
                    break;
                case -863714756:
                case -278655769:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۛ᩺") ^ i11;
                        i14 = i14;
                        i2 = ((iM55979 ^ i10) * (-26829)) ^ (-1489526239);
                        i3 = -1583650056;
                    } else {
                        i14 = i14;
                        iM55979 = (C0873.m55680("᩷ۛ") ^ i10) * 49;
                        i2 = ((iM55979 ^ i11) * (-16069)) ^ (-532709539);
                        i3 = 1856602034;
                    }
                    i4 = i14;
                    i13 = iM55979 ^ i3;
                    i12 = i2;
                    i9 = i4;
                    break;
                case -474391053:
                case 1635497957:
                    i8 = 5507;
                    iM55680 = C0946.m55979("ᩴۘ") ^ i10;
                    i12 = ((iM55680 ^ i11) * (-19825)) ^ 597497252;
                    i = -738555367;
                    int i111 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i111;
                    c10975 = c10974;
                    break;
                case -258782433:
                case -165362358:
                    i14 = i14;
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("ۜ֫") + i10) * (-65);
                        i12 = ((iM55680 ^ i11) * (-26023)) ^ (-1516893336);
                        i = -1126383024;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ۘᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM55680 ^ i10) * (-13111)) ^ (-1213980311);
                        i = 1961002735;
                    }
                    int i112 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i112;
                    c10975 = c10974;
                    break;
                case -147780732:
                case 614009991:
                    i14 = i14;
                    if (AbstractC0942.f81890 > 0) {
                        iM55680 = (C0873.m55680("ۜ֫") + i10) * (-65);
                        i12 = ((iM55680 ^ i11) * (-26023)) ^ (-1516893336);
                        i = -1126383024;
                        int i113 = iM55680 ^ i;
                        i9 = i14;
                        i13 = i113;
                        c10975 = c10974;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۛ") ^ i10) * 49;
                        i2 = ((iM55979 ^ i11) * (-16069)) ^ (-532709539);
                        i3 = 1856602034;
                        i4 = i14;
                        i13 = iM55979 ^ i3;
                        i12 = i2;
                        i9 = i4;
                    }
                    break;
                case 300973373:
                case 2019550984:
                    i14 = i14;
                    i5 = s * s2;
                    i6 = s * s;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (i10 - C0873.m55680("ᩴۢ")) * 65;
                        i12 = ((iM55680 ^ i11) * 8015) ^ 1544376740;
                        i = -64129418;
                    } else {
                        iM55680 = C0946.m55979("ۛ۬") ^ i10;
                        i12 = ((iM55680 ^ i11) * 5577) ^ (-1579775029);
                        i = -737561584;
                    }
                    int i114 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i114;
                    c10975 = c10974;
                    break;
                case 1173008459:
                case 1695268632:
                    i14 = i14;
                    i7 = 316092841;
                    if (C0863.m55643()) {
                        iM55680 = (C0873.m55680("ܿۨ") + i10) * (-59);
                        i12 = ((iM55680 ^ i11) * 21819) ^ 872570731;
                        i = -1776813617;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ۘᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM55680 ^ i10) * (-13111)) ^ (-1213980311);
                        i = 1961002735;
                    }
                    int i115 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i115;
                    c10975 = c10974;
                    break;
                case 1662900890:
                case 1686339735:
                    i14 = i14;
                    C0873.m55684(textView, iM559710);
                    if (C1071.f81975 > 0) {
                        iM55979 = (C0946.m55979("᩷ۤ") ^ i11) * (-77);
                        i2 = ((iM55979 ^ i10) * 12891) ^ 1872481134;
                        i3 = 2029508620;
                        i4 = i14;
                        i13 = iM55979 ^ i3;
                        i12 = i2;
                        i9 = i4;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ۘᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM55680 ^ i10) * (-13111)) ^ (-1213980311);
                        i = 1961002735;
                        int i116 = iM55680 ^ i;
                        i9 = i14;
                        i13 = i116;
                        c10975 = c10974;
                    }
                    break;
                case 1949970327:
                case 2006175480:
                    i14 = i14;
                    textView = activityC3597.f7312;
                    sArr2 = f82096;
                    if (AbstractC0942.f81890 > 0) {
                        iM55979 = C0873.m55680("۬ܰ") ^ i10;
                        i2 = ((iM55979 ^ i11) * (-7383)) ^ (-15448013);
                        i3 = 711981537;
                        i4 = i14;
                        i13 = iM55979 ^ i3;
                        i12 = i2;
                        i9 = i4;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ᩴۢ")) * 65;
                        i12 = ((iM55680 ^ i11) * 8015) ^ 1544376740;
                        i = -64129418;
                        int i117 = iM55680 ^ i;
                        i9 = i14;
                        i13 = i117;
                        c10975 = c10974;
                    }
                    break;
                default:
                    i14 = i14;
                    if (i5 - (i6 + i7) > 0) {
                        iM55680 = C0873.m55680("ᩴᩴ") ^ i11;
                        i12 = ((iM55680 ^ i10) * 30441) ^ 245281607;
                        i = -1257202448;
                    } else {
                        iM55680 = (C0946.m55979("ۧۖ") ^ i11) * 89;
                        i12 = ((iM55680 ^ i10) * (-22747)) ^ 402892427;
                        i = -912145857;
                    }
                    int i118 = iM55680 ^ i;
                    i9 = i14;
                    i13 = i118;
                    c10975 = c10974;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        ActivityC3597 activityC3597 = null;
        int i2 = 0;
        int i3 = -1128874170;
        int i4 = ServiceConnectionC1013.f81940;
        int i5 = C1036.f81953;
        int iM559710 = C0946.m55979("۫᩻") ^ i5;
        int i6 = ((iM559710 ^ i4) * (-13533)) ^ 1463121507;
        int i7 = -308043673;
        while (true) {
            int i8 = iM559710 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * 22657) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2072413778:
                    case 1668463511:
                        if (C1229.f82066 < 0) {
                            iM559710 = C0873.m55680("ۙᩳ") ^ i4;
                            i6 = ((iM559710 ^ i5) * 3699) ^ 1339471190;
                            i7 = -1505709058;
                        } else {
                            iM559710 = (i5 - C0873.m55680("ۚۚ")) * (-29);
                            i6 = ((iM559710 ^ i4) * (-1767)) ^ 1104062497;
                            i7 = 585269475;
                        }
                        break;
                    case -1785965078:
                    case 2070164903:
                        ActivityC3597.m6610(activityC3597, i2, new Runnable() { // from class: l.ۢᩳ᩷
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10974.m25328(this.f32487);
                            }
                        });
                        break;
                    case -1491541937:
                    case 1253550132:
                        if (C1071.f81975 > 0) {
                            iM559710 = (i5 - C0873.m55680("ۚۜ")) * (-29);
                            i6 = ((iM559710 ^ i4) * 13925) ^ 1196094444;
                            i7 = 192675777;
                        } else {
                            iM559710 = (i4 - C0873.m55680("᩶ܺ")) * 17;
                            i6 = ((iM559710 ^ i5) * (-13363)) ^ 1810868020;
                            i7 = -979434092;
                        }
                        break;
                    case -1451174103:
                    case 2044681528:
                        C1028.m56247();
                        if (C0906.m55809() > 0) {
                            iM559710 = C0946.m55979("۬۟") ^ i4;
                            i6 = ((iM559710 ^ i5) * 23235) ^ 2042039120;
                            i7 = -216552813;
                        } else {
                            iM559710 = (i5 - C0873.m55680("ۚۚ")) * (-29);
                            i6 = ((iM559710 ^ i4) * (-1767)) ^ 1104062497;
                            i7 = 585269475;
                        }
                        break;
                    case -1411357076:
                    case -800588055:
                        C0930.m55885();
                        if (RunnableC0871.f81839 < 0) {
                            iM559710 = (i5 - C0873.m55680("ۚۚ")) * (-29);
                            i6 = ((iM559710 ^ i4) * (-1767)) ^ 1104062497;
                            i7 = 585269475;
                            break;
                        }
                        iM559710 = C0946.m55979("ۙܰ") ^ i4;
                        i6 = ((iM559710 ^ i5) * (-27847)) ^ (-1079435612);
                        i7 = 1575886865;
                    case -1323758058:
                    case -1179241808:
                        C1071.m56343();
                        break;
                    case -1257076108:
                    case -281914904:
                        if (!C1929.m56553()) {
                            iM559710 = (i5 - C0873.m55680("᩻ۖ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM559710 ^ i4) * 10447) ^ 1067062655;
                            i7 = 2080669581;
                        } else {
                            iM559710 = (i4 - C0873.m55680("᩶ܺ")) * 17;
                            i6 = ((iM559710 ^ i5) * (-13363)) ^ 1810868020;
                            i7 = -979434092;
                        }
                        break;
                    case -1058958070:
                    case -88144580:
                        C1048.m56305();
                        iM559710 = C0946.m55979("ۙܰ") ^ i4;
                        i6 = ((iM559710 ^ i5) * (-27847)) ^ (-1079435612);
                        i7 = 1575886865;
                        break;
                    case -752453160:
                    case 804987993:
                        int i9 = activityC3597.f7309;
                        int i10 = this.f30393;
                        if (i10 != i9) {
                            iM55979 = C0873.m55680("ۘ۟") ^ i5;
                            i6 = ((iM55979 ^ i4) * 5471) ^ 2144363008;
                            i = -113597767;
                        } else {
                            iM55979 = (i4 - C0946.m55979("۬֨")) * (-119);
                            i6 = ((iM55979 ^ i5) * 22895) ^ 1679392482;
                            i = 1286544702;
                        }
                        i8 = iM55979 ^ i;
                        i2 = i10;
                        break;
                    case -596771070:
                    case 534807184:
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                            iM559710 = (C0873.m55680("ܶۙ") + i5) * (-57);
                            i6 = ((iM559710 ^ i4) * (-5541)) ^ 1196580717;
                            i7 = 1199490977;
                        } else {
                            iM559710 = (i5 - C0873.m55680("ۚۚ")) * (-29);
                            i6 = ((iM559710 ^ i4) * (-1767)) ^ 1104062497;
                            i7 = 585269475;
                        }
                        break;
                    case -128818001:
                    case 803534238:
                        if (C1048.m56305() < 0) {
                            iM559710 = (C0873.m55680("ۨ۠") + i4) * 29;
                            i6 = ((iM559710 ^ i5) * (-10307)) ^ 1833592592;
                            i7 = -1151504801;
                        } else {
                            iM559710 = (C0873.m55680("ܶۙ") + i5) * (-57);
                            i6 = ((iM559710 ^ i4) * (-5541)) ^ 1196580717;
                            i7 = 1199490977;
                        }
                        break;
                    case 35003381:
                    case 534339499:
                        break;
                    case 103688023:
                    case 206147579:
                        if (!C1404.m56468()) {
                            iM559710 = (i5 - C0873.m55680("ۚۚ")) * (-29);
                            i6 = ((iM559710 ^ i4) * (-1767)) ^ 1104062497;
                            i7 = 585269475;
                            break;
                        }
                        iM559710 = C0946.m55979("ܿܽ") ^ i5;
                        i6 = ((iM559710 ^ i4) * 17941) ^ 3387083;
                        i7 = 1408322495;
                        break;
                    case 188774018:
                    case 1763050686:
                        activityC3597 = this.f30395;
                        if (!RunnableC0897.f81856) {
                            iM559710 = (i4 - C0873.m55680("᩶ܺ")) * 17;
                            i6 = ((iM559710 ^ i5) * (-13363)) ^ 1810868020;
                            i7 = -979434092;
                            break;
                        }
                        iM559710 = (C0873.m55680("ܽ᩻") + i4) * (-103);
                        i6 = ((iM559710 ^ i5) * 26801) ^ 739126704;
                        i7 = -601732724;
                        break;
                    case 439720358:
                    case 1609756297:
                        if (C1028.m56247() < 0) {
                            iM559710 = (i5 - C0946.m55979("ᩳᩳ")) * (-45);
                            i6 = ((iM559710 ^ i4) * 15015) ^ (-393492892);
                            i7 = 723888067;
                        } else {
                            iM559710 = C0946.m55979("ۙܰ") ^ i4;
                            i6 = ((iM559710 ^ i5) * (-27847)) ^ (-1079435612);
                            i7 = 1575886865;
                        }
                        break;
                    case 1099084524:
                    case 1486788465:
                        if (C0967.f81910 < 0) {
                            iM559710 = C0873.m55680("᩷ᩳ") ^ i4;
                            i6 = ((iM559710 ^ i5) * (-13799)) ^ 191809981;
                            i7 = -524471209;
                        } else {
                            iM559710 = (i4 - C0873.m55680("᩶ܺ")) * 17;
                            i6 = ((iM559710 ^ i5) * (-13363)) ^ 1810868020;
                            i7 = -979434092;
                        }
                        break;
                    case 1549814875:
                    case 1569942851:
                        if (C1071.f81975 > 0) {
                            iM559710 = (i4 - C0946.m55979("᩻᩸")) * 27;
                            i6 = ((iM559710 ^ i5) * 8221) ^ (-1387418773);
                            i7 = -403169881;
                        } else {
                            iM559710 = (i5 - C0873.m55680("ۚۚ")) * (-29);
                            i6 = ((iM559710 ^ i4) * (-1767)) ^ 1104062497;
                            i7 = 585269475;
                        }
                        break;
                    default:
                        if (!C0947.f81895) {
                            iM559710 = (C0946.m55979("ۘۤ") + i5) * (-11);
                            i6 = ((iM559710 ^ i4) * (-23345)) ^ (-1242274253);
                            i7 = 1213448142;
                        } else {
                            iM559710 = C0946.m55979("۬۟") ^ i4;
                            i6 = ((iM559710 ^ i5) * 23235) ^ 2042039120;
                            i7 = -216552813;
                        }
                        break;
                }
                return;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        int iM55680;
        int i;
        ActivityC3597 activityC3597 = null;
        int i2 = 0;
        int i3 = -645086573;
        int i4 = RunnableC1014.f81941;
        int i5 = C0877.f81843;
        int iM55681 = (C0873.m55680("᩵۠") + i4) * 123;
        int i6 = ((iM55681 ^ i5) * 10953) ^ 80263453;
        int i7 = -2047328527;
        while (true) {
            int i8 = iM55681 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 20097) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2142520191:
                    case 1347854722:
                        if (C1053.f81965 > 0) {
                            iM55681 = C0946.m55979("ۘۢ") ^ i4;
                            i6 = ((iM55681 ^ i5) * (-11445)) ^ (-2140618990);
                            i7 = 174172516;
                        } else {
                            iM55681 = (C0946.m55979("ܽ᩶") + i5) * 85;
                            i6 = ((iM55681 ^ i4) * (-17599)) ^ (-2059807418);
                            i7 = -2069957827;
                        }
                        break;
                    case -2002383207:
                    case 891236441:
                        if (C0898.f81858 > 0) {
                            iM55681 = (C0946.m55979("۠ۜ") + i5) * 67;
                            i6 = ((iM55681 ^ i4) * (-14723)) ^ 2064847057;
                            i7 = -1964933971;
                        } else {
                            iM55681 = C0946.m55979("ܰۘ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-28895)) ^ (-1972948705);
                            i7 = -95208726;
                        }
                        break;
                    case -1971785138:
                    case -1165540908:
                        C1024.m56209();
                        C1024.m56209();
                        break;
                    case -1807478627:
                    case 1243690631:
                        if (C0967.f81910 < 0) {
                            iM55681 = C0946.m55979("᩷ܳ") ^ i4;
                            i6 = ((iM55681 ^ i5) * 30777) ^ (-2008206322);
                            i7 = -1189656046;
                        } else {
                            iM55681 = C0946.m55979("ܰۘ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-28895)) ^ (-1972948705);
                            i7 = -95208726;
                        }
                        break;
                    case -1632351274:
                    case -450895720:
                        break;
                    case -1553085297:
                    case 214760939:
                        activityC3597 = this.f30395;
                        if (C1124.f82007 < 0) {
                            iM55681 = C0946.m55979("᩵֡") ^ i4;
                            i6 = ((iM55681 ^ i5) * 5149) ^ 1343518709;
                            i7 = 2101246823;
                        } else {
                            iM55681 = (C0946.m55979("ܽ᩶") + i5) * 85;
                            i6 = ((iM55681 ^ i4) * (-17599)) ^ (-2059807418);
                            i7 = -2069957827;
                        }
                        break;
                    case -1274276826:
                    case 1682834297:
                        if (!C0927.f81875) {
                            iM55681 = (C0873.m55680("ۢ᩻") + i4) * 49;
                            i6 = ((iM55681 ^ i5) * (-16983)) ^ 44916841;
                            i7 = -197234655;
                        } else {
                            iM55681 = C0946.m55979("ܰۘ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-28895)) ^ (-1972948705);
                            i7 = -95208726;
                        }
                        break;
                    case -1248413782:
                    case 149079476:
                        if (C0930.f81879 > 0) {
                            iM55681 = (i4 - C0946.m55979("۠ۘ")) * (-105);
                            i6 = ((iM55681 ^ i5) * (-15559)) ^ (-1953891324);
                            i7 = 439164185;
                        } else {
                            iM55681 = (C0946.m55979("ܽ᩶") + i5) * 85;
                            i6 = ((iM55681 ^ i4) * (-17599)) ^ (-2059807418);
                            i7 = -2069957827;
                        }
                        break;
                    case -1006106989:
                    case 1145092630:
                        C1046.m56302();
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM55681 = C0946.m55979("ܰۘ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-28895)) ^ (-1972948705);
                            i7 = -95208726;
                            break;
                        }
                        iM55681 = (i4 - C0873.m55680("ۨ֨")) * 25;
                        i6 = ((iM55681 ^ i5) * 6577) ^ (-971955468);
                        i7 = -1231459513;
                    case -898843167:
                    case -654394333:
                        if (!C1024.f81946) {
                            iM55681 = (C0946.m55979("ܳۡ") ^ i5) * 75;
                            i6 = ((iM55681 ^ i4) * (-7897)) ^ 2027922234;
                            i7 = -1182000091;
                        } else {
                            iM55681 = (i4 - C0873.m55680("ۨ֨")) * 25;
                            i6 = ((iM55681 ^ i5) * 6577) ^ (-971955468);
                            i7 = -1231459513;
                        }
                        break;
                    case -853098022:
                    case 977427632:
                        if (ServiceConnectionC1013.f81940 < 0) {
                            iM55681 = C0946.m55979("ۢۛ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-28873)) ^ 1917000812;
                            i7 = -568760410;
                        } else {
                            iM55681 = C0946.m55979("ܰۘ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-28895)) ^ (-1972948705);
                            i7 = -95208726;
                        }
                        break;
                    case -637728593:
                    case 1804320707:
                        if (C0894.m55769() < 0) {
                            iM55681 = (i5 - C0873.m55680("۬֫")) * 89;
                            i6 = ((iM55681 ^ i4) * 19109) ^ 712357200;
                            i7 = -1682221989;
                        } else {
                            iM55681 = (C0946.m55979("ܽ᩶") + i5) * 85;
                            i6 = ((iM55681 ^ i4) * (-17599)) ^ (-2059807418);
                            i7 = -2069957827;
                        }
                        break;
                    case -494348683:
                    case 502365770:
                        if (C0949.f81897 < 0) {
                            iM55681 = C0946.m55979("۫ܿ") ^ i5;
                            i6 = ((iM55681 ^ i4) * (-31307)) ^ (-1941890640);
                            i7 = -2105329086;
                        } else {
                            iM55681 = C0873.m55680("᩻ܺ") ^ i5;
                            i6 = ((iM55681 ^ i4) * 29997) ^ 1525799769;
                            i7 = 70571084;
                        }
                        break;
                    case 123021656:
                    case 1948042591:
                        C1028.m56247();
                        if (C0894.f81854 < 0) {
                            iM55681 = (C0946.m55979("ۚۗ") ^ i4) * 89;
                            i6 = ((iM55681 ^ i5) * (-30107)) ^ (-1453212174);
                            i7 = 1903284307;
                        } else {
                            iM55681 = (i4 - C0873.m55680("ۨ֨")) * 25;
                            i6 = ((iM55681 ^ i5) * 6577) ^ (-971955468);
                            i7 = -1231459513;
                        }
                        break;
                    case 483888902:
                    case 2085178623:
                        int i9 = activityC3597.f7309;
                        int i10 = this.f30393;
                        if (i10 != i9) {
                            iM55680 = C0946.m55979("֫۟") ^ i4;
                            i6 = ((iM55680 ^ i5) * 26215) ^ 731235890;
                            i = -2064278623;
                        } else {
                            iM55680 = C0873.m55680("᩸۫") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-15119)) ^ 1767888740;
                            i = -810289132;
                        }
                        i8 = iM55680 ^ i;
                        i2 = i10;
                        break;
                    case 1107286394:
                    case 1409753485:
                        ActivityC3597.m6610(activityC3597, i2, new Runnable() { // from class: l.᩷ᩳ᩷

                            /* JADX INFO: renamed from: ۖۤ᩵, reason: not valid java name and contains not printable characters */
                            private static final short[] f82993 = {9063, -1931, -339, -14393};

                            /* JADX WARN: Code duplicated, block: B:54:0x01d0 A[PHI: r2 r5 r10 r11 r17 r19
                              0x01d0: PHI (r2v5 boolean) = (r2v1 boolean), (r2v2 boolean), (r2v1 boolean) binds: [B:53:0x01ce, B:37:0x00fe, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
                              0x01d0: PHI (r5v6 int) = (r5v1 int), (r5v1 int), (r5v7 int) binds: [B:53:0x01ce, B:37:0x00fe, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
                              0x01d0: PHI (r10v5 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:53:0x01ce, B:37:0x00fe, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
                              0x01d0: PHI (r11v5 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:53:0x01ce, B:37:0x00fe, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
                              0x01d0: PHI (r17v34 android.widget.TextView) = (r17v9 android.widget.TextView), (r17v12 android.widget.TextView), (r17v35 android.widget.TextView) binds: [B:53:0x01ce, B:37:0x00fe, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
                              0x01d0: PHI (r19v30 android.widget.TextView) = (r19v6 android.widget.TextView), (r19v9 android.widget.TextView), (r19v31 android.widget.TextView) binds: [B:53:0x01ce, B:37:0x00fe, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:66:0x025b A[PHI: r7 r8 r17 r19
                              0x025b: PHI (r7v3 char) = (r7v2 char), (r7v1 char), (r7v1 char) binds: [B:65:0x0259, B:61:0x0239, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]
                              0x025b: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:65:0x0259, B:61:0x0239, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]
                              0x025b: PHI (r17v19 android.widget.TextView) = (r17v6 android.widget.TextView), (r17v7 android.widget.TextView), (r17v21 android.widget.TextView) binds: [B:65:0x0259, B:61:0x0239, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]
                              0x025b: PHI (r19v14 android.widget.TextView) = (r19v3 android.widget.TextView), (r19v4 android.widget.TextView), (r19v16 android.widget.TextView) binds: [B:65:0x0259, B:61:0x0239, B:9:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
                            
                                if (p067l.C0861.f81831 != false) goto L12;
                             */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                int iM55979;
                                int i11;
                                int i12;
                                int i13;
                                int iM559710;
                                TextView textView;
                                TextView textView2;
                                int iM55682;
                                int i14;
                                int i15;
                                TextView textView3 = null;
                                boolean z = false;
                                TextView textView4 = null;
                                String strM55707 = null;
                                int iM559711 = 0;
                                short[] sArr = null;
                                char c = 0;
                                short s = 0;
                                int i16 = 0;
                                int i17 = 0;
                                int i18 = 0;
                                int i19 = 0;
                                short[] sArr2 = null;
                                int i20 = 714510681;
                                int i21 = C0845.f81821;
                                int i22 = C1044.f81959;
                                int iM559712 = C0946.m55979("۬᩶") ^ i21;
                                int i23 = ((iM559712 ^ i22) * (-13815)) ^ 1364531015;
                                int i24 = iM559712 ^ (-846215006);
                                ActivityC3597 activityC3598 = null;
                                while (true) {
                                    i20 = i24 ^ (i23 & (((i20 ^ i22) * 12073) >> 31));
                                    switch (i20) {
                                        case -2058484823:
                                        case 517383098:
                                            C1025.m56230();
                                            C1036.m56257();
                                            break;
                                        case -1961566815:
                                        case 1370559058:
                                            C0946.m55976(textView4, 2126390365 ^ iM559711);
                                            break;
                                        case -1448617015:
                                        case -1210962873:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            s = sArr[c];
                                            if (C0854.f81826 != 0) {
                                                iM55979 = C0946.m55979("᩶᩷") ^ i22;
                                                i11 = ((iM55979 ^ i21) * (-28017)) ^ (-1092700564);
                                                i12 = -863473451;
                                            } else {
                                                iM55979 = (C0873.m55680("۬֨") ^ i22) * 3;
                                                i11 = ((iM55979 ^ i21) * (-2343)) ^ (-1322299888);
                                                i12 = -504467346;
                                            }
                                            int i25 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i25;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -1172253432:
                                        case -1122052240:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            c = 0;
                                            if (C0955.f81898) {
                                                iM55979 = C0946.m55979("᩶᩷") ^ i22;
                                                i11 = ((iM55979 ^ i21) * (-28017)) ^ (-1092700564);
                                                i12 = -863473451;
                                            } else {
                                                iM55979 = (C0946.m55979("ܺ۫") ^ i21) * (-107);
                                                i11 = ((iM55979 ^ i22) * 13099) ^ 1279457360;
                                                i12 = -783424251;
                                            }
                                            int i26 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i26;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -931293500:
                                        case 1088151298:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            z = true;
                                            if (C0892.m55749()) {
                                                iM55979 = (C0873.m55680("᩺ۗ") + i22) * (-37);
                                                i11 = ((iM55979 ^ i21) * (-16769)) ^ 1184087984;
                                                i12 = -1762600929;
                                            } else {
                                                iM55979 = (i22 - C0946.m55979("ܽ᩶")) * 99;
                                                i11 = ((iM55979 ^ i21) * 6125) ^ 1061692685;
                                                i12 = -1543485657;
                                            }
                                            int i27 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i27;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -708982347:
                                        case 996938830:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            if (i17 - (i18 + 1) >= 0) {
                                                iM55979 = C0873.m55680("ᩴ᩵") ^ i21;
                                                i11 = ((iM55979 ^ i22) * 22215) ^ 805762286;
                                                i12 = 709240820;
                                            } else {
                                                iM55979 = (i22 - C0873.m55680("۬ܳ")) * (-107);
                                                i11 = ((iM55979 ^ i21) * (-8989)) ^ 2014627058;
                                                i12 = 989577303;
                                            }
                                            int i28 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i28;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -689933250:
                                        case -470358226:
                                            i19 = 38639;
                                            iM55979 = (C0946.m55979("ܿ֫") + i21) * (-15);
                                            i11 = ((iM55979 ^ i22) * 22901) ^ 1475720930;
                                            i12 = -1003125293;
                                            int i29 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i29;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -592570872:
                                        case 1078823708:
                                            textView3.setClickable(z);
                                            textView4 = activityC3598.f7312;
                                            sArr2 = f82993;
                                            if (C1046.f81962 <= 0) {
                                                textView3 = textView3;
                                                iM559710 = C0946.m55979("ۧۗ") ^ i21;
                                                i11 = ((iM559710 ^ i22) * (-2889)) ^ (-1529289035);
                                                i13 = -1217241193;
                                            } else {
                                                iM559710 = (i21 - C0873.m55680("ۧۛ")) * (-73);
                                                textView3 = textView3;
                                                i11 = ((iM559710 ^ i22) * (-5847)) ^ (-392980990);
                                                i13 = -1534011868;
                                            }
                                            i24 = iM559710 ^ i13;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -570113401:
                                        case 1782872459:
                                            break;
                                        case -557169123:
                                        case 2029853122:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            i16 = s + 1;
                                            if (C0967.m56074()) {
                                                iM55979 = C0873.m55680("ۙۖ") ^ i22;
                                                i11 = ((iM55979 ^ i21) * (-10939)) ^ (-1710454357);
                                                i12 = -1449901441;
                                            } else {
                                                iM55979 = C0873.m55680("ܿܽ") ^ i21;
                                                i11 = ((iM55979 ^ i22) * (-22749)) ^ (-944453768);
                                                i12 = 426756008;
                                            }
                                            int i210 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i210;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -439730883:
                                        case 2104663234:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            i17 = i16 * i16;
                                            i18 = s * 2;
                                            if (C0917.m55854()) {
                                                iM55979 = C0873.m55680("᩵ۢ") ^ i22;
                                                i11 = ((iM55979 ^ i21) * 1101) ^ (-874909827);
                                                i12 = 1575347040;
                                            } else {
                                                iM55979 = (i22 - C0946.m55979("ܽ᩶")) * 99;
                                                i11 = ((iM55979 ^ i21) * 6125) ^ 1061692685;
                                                i12 = -1543485657;
                                            }
                                            int i211 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i211;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case -160411660:
                                        case 1796459421:
                                            textView = textView4;
                                            ActivityC3597 activityC3599 = this.f70592.f30395;
                                            TextView textView5 = activityC3599.f7312;
                                            if (C0992.f81922 >= 0) {
                                                activityC3598 = activityC3599;
                                                textView3 = textView5;
                                                int iM55683 = (i21 - C0873.m55680("۟۫")) * (-123);
                                                i23 = ((iM55683 ^ i22) * (-6025)) ^ (-954497559);
                                                textView2 = textView;
                                                i24 = iM55683 ^ 1125144028;
                                            } else {
                                                int iM55684 = (i21 - C0873.m55680("ܰᩳ")) * (-107);
                                                activityC3598 = activityC3599;
                                                textView2 = textView;
                                                i24 = iM55684 ^ 666841002;
                                                i23 = ((iM55684 ^ i22) * 3735) ^ 363090134;
                                                textView3 = textView5;
                                            }
                                            textView4 = textView2;
                                            break;
                                        case -96707435:
                                        case 2124341686:
                                            iM559711 = C0946.m55979(strM55707);
                                            if (C0873.f81841 > 0) {
                                                iM55682 = C0946.m55979("ۤ᩵") ^ i21;
                                                textView4 = textView4;
                                                i14 = ((iM55682 ^ i22) * (-1539)) ^ 2108830089;
                                                i15 = 2008101115;
                                                textView2 = textView4;
                                                i24 = iM55682 ^ i15;
                                                i23 = i14;
                                                textView4 = textView2;
                                            } else {
                                                textView3 = textView3;
                                                textView4 = textView4;
                                                iM55979 = (i22 - C0946.m55979("ܽ᩶")) * 99;
                                                i11 = ((iM55979 ^ i21) * 6125) ^ 1061692685;
                                                i12 = -1543485657;
                                                int i212 = iM55979 ^ i12;
                                                textView4 = textView4;
                                                i24 = i212;
                                                i23 = i11;
                                                textView3 = textView3;
                                            }
                                            break;
                                        case 28851799:
                                        case 567249082:
                                            ViewOnClickListenerC0939.m55941();
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            iM55979 = (i22 - C0946.m55979("ܽ᩶")) * 99;
                                            i11 = ((iM55979 ^ i21) * 6125) ^ 1061692685;
                                            i12 = -1543485657;
                                            int i213 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i213;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case 824845539:
                                        case 856135621:
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            sArr = f82993;
                                            if (!C0937.f81884) {
                                                textView4 = textView4;
                                                iM559710 = C0946.m55979("ۧۗ") ^ i21;
                                                i11 = ((iM559710 ^ i22) * (-2889)) ^ (-1529289035);
                                                i13 = -1217241193;
                                                i24 = iM559710 ^ i13;
                                                i23 = i11;
                                                textView3 = textView3;
                                            } else {
                                                iM55979 = C0946.m55979("᩵ᩳ") ^ i22;
                                                i11 = ((iM55979 ^ i21) * (-13553)) ^ 1796485051;
                                                i12 = 846760526;
                                                int i214 = iM55979 ^ i12;
                                                textView4 = textView4;
                                                i24 = i214;
                                                i23 = i11;
                                                textView3 = textView3;
                                            }
                                            break;
                                        case 1154494412:
                                        case 2096518766:
                                            if (C0927.m55873() > 0) {
                                                textView = textView4;
                                                int iM55685 = (i21 - C0873.m55680("۟۫")) * (-123);
                                                i23 = ((iM55685 ^ i22) * (-6025)) ^ (-954497559);
                                                textView2 = textView;
                                                i24 = iM55685 ^ 1125144028;
                                                textView4 = textView2;
                                            } else {
                                                textView3 = textView3;
                                                textView4 = textView4;
                                                iM55979 = (i22 - C0946.m55979("ܽ᩶")) * 99;
                                                i11 = ((iM55979 ^ i21) * 6125) ^ 1061692685;
                                                i12 = -1543485657;
                                                int i215 = iM55979 ^ i12;
                                                textView4 = textView4;
                                                i24 = i215;
                                                i23 = i11;
                                                textView3 = textView3;
                                            }
                                            break;
                                        case 1272421900:
                                        case 1600963420:
                                            if (C1964.f83032 <= 0) {
                                                textView3 = textView3;
                                                textView4 = textView4;
                                                iM55979 = C0946.m55979("᩶᩷") ^ i22;
                                                i11 = ((iM55979 ^ i21) * (-28017)) ^ (-1092700564);
                                                i12 = -863473451;
                                                int i216 = iM55979 ^ i12;
                                                textView4 = textView4;
                                                i24 = i216;
                                                i23 = i11;
                                                textView3 = textView3;
                                            }
                                            textView3 = textView3;
                                            textView4 = textView4;
                                            iM55979 = C0873.m55680("ۙۖ") ^ i22;
                                            i11 = ((iM55979 ^ i21) * (-10939)) ^ (-1710454357);
                                            i12 = -1449901441;
                                            int i217 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i217;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                        case 1371097141:
                                        case 1967597062:
                                            textView4 = textView4;
                                            strM55707 = C0877.m55707(sArr2, 1, 3, i19);
                                            if (C0866.f81837 < 0) {
                                                iM55682 = C0873.m55680("֫۠") ^ i22;
                                                i14 = ((iM55682 ^ i21) * (-13423)) ^ 57057861;
                                                i15 = 1919417304;
                                                textView2 = textView4;
                                                i24 = iM55682 ^ i15;
                                                i23 = i14;
                                                textView4 = textView2;
                                            } else {
                                                textView3 = textView3;
                                                iM55979 = C0873.m55680("ۙۖ") ^ i22;
                                                i11 = ((iM55979 ^ i21) * (-10939)) ^ (-1710454357);
                                                i12 = -1449901441;
                                                int i218 = iM55979 ^ i12;
                                                textView4 = textView4;
                                                i24 = i218;
                                                i23 = i11;
                                                textView3 = textView3;
                                            }
                                            break;
                                        default:
                                            i19 = 2508;
                                            iM55979 = (C0946.m55979("ܿ֫") + i21) * (-15);
                                            i11 = ((iM55979 ^ i22) * 22901) ^ 1475720930;
                                            i12 = -1003125293;
                                            int i219 = iM55979 ^ i12;
                                            textView4 = textView4;
                                            i24 = i219;
                                            i23 = i11;
                                            textView3 = textView3;
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        break;
                    case 1265706128:
                    case 2064648259:
                        if (C0989.m56095() > 0) {
                            iM55681 = (i4 - C0873.m55680("ۨ֨")) * 25;
                            i6 = ((iM55681 ^ i5) * 6577) ^ (-971955468);
                            i7 = -1231459513;
                            break;
                        }
                        iM55681 = C0873.m55680("᩻ܺ") ^ i5;
                        i6 = ((iM55681 ^ i4) * 29997) ^ 1525799769;
                        i7 = 70571084;
                        break;
                    default:
                        C0845.m55584();
                        C0866.m55645();
                        iM55681 = C0873.m55680("᩻ܺ") ^ i5;
                        i6 = ((iM55681 ^ i4) * 29997) ^ 1525799769;
                        i7 = 70571084;
                        break;
                }
                return;
            }
        }
    }

    public C10974(ActivityC3597 activityC3597, int i) {
        int i2 = -1852807920;
        int i3 = C1229.f82066;
        int i4 = C0906.f81862;
        this.f30395 = activityC3597;
        this.f30393 = i;
        int iM55680 = C0873.m55680("ۧܽ") ^ i4;
        int i5 = ((iM55680 ^ i3) * 29267) ^ (-946336086);
        int i6 = -1252438534;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i3) * 7473) >> 31));
            switch (i2) {
                case -2088129626:
                case 1360669704:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ۢ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 1599) ^ (-1792912422);
                        i6 = -540317366;
                    }
                    break;
                case -1767069463:
                case 1891828520:
                    C0989.m56095();
                    C0906.m55809();
                    break;
                case -1638664330:
                case -98867955:
                    C0873.m55678();
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("۬᩹") + i3) * (-81);
                        i5 = ((iM55680 ^ i4) * (-5581)) ^ 1632254360;
                        i6 = 107885235;
                    }
                    break;
                case -1259635233:
                case 2055064418:
                    C1046.m56302();
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("֨֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15769) ^ 414076579;
                        i6 = 846846488;
                    }
                    break;
                case 361608035:
                case 441525991:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("ܿᩴ") + i4) * (-87);
                        i5 = ((iM55680 ^ i3) * 12071) ^ 1093707370;
                        i6 = 501691446;
                    } else {
                        iM55680 = C0946.m55979("ۜۜ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-16517)) ^ (-74602910);
                        i6 = -73869818;
                        continue;
                    }
                    break;
                case 666320712:
                case 951550997:
                    RunnableC0871.m55672();
                    throw new RuntimeException();
                default:
                    return;
            }
            iM55680 = (C0873.m55680("۠ۜ") + i3) * (-103);
            i5 = ((iM55680 ^ i4) * 14553) ^ 1326790781;
            i6 = 1082073411;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC3597 activityC3597 = null;
        TextView textView = null;
        int i = 0;
        C14102 c14102 = null;
        int i2 = -947952964;
        int i3 = RunnableC0938.f81886;
        int i4 = C1053.f81965;
        int iM55680 = (C0873.m55680("ᩴ۠") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM55680 ^ i3) * 9907) ^ 633539829;
        int i6 = -2024997061;
        while (true) {
            i2 = ((((i2 ^ i3) * 23083) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2006536818:
                case 1583917125:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("ᩴ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11373) ^ (-2141293146);
                        i6 = 2057015718;
                    } else {
                        iM55680 = C0946.m55979("ܶ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 27835) ^ (-817381380);
                        i6 = 2042939315;
                    }
                    break;
                case -1979911561:
                case 2121178625:
                    C1048.m56305();
                    iM55680 = C0946.m55979("ᩴ᩶") ^ i3;
                    i5 = ((iM55680 ^ i4) * 11373) ^ (-2141293146);
                    i6 = 2057015718;
                    break;
                case -1960628808:
                case -700327637:
                    C1194.m56396();
                    if (C0854.f81826 == 0) {
                        iM55680 = (C0873.m55680("ۚᩴ") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * 4799) ^ (-724552399);
                        i6 = 812408582;
                    } else {
                        iM55680 = C0873.m55680("ۢ۟") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-9423)) ^ (-849489146);
                        i6 = -758304372;
                    }
                    break;
                case -1933663596:
                case -65881367:
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0873.m55680("ۚᩴ") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * 4799) ^ (-724552399);
                        i6 = 812408582;
                    } else {
                        iM55680 = C0946.m55979("᩵ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 30373) ^ 1200561409;
                        i6 = -1106566514;
                    }
                    break;
                case -1777853806:
                case 1127101083:
                    C1003.m56123();
                    if (C1124.m56367() >= 0) {
                        iM55680 = C0946.m55979("۠ܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-25719)) ^ (-1341891167);
                        i6 = -1113585918;
                    } else {
                        iM55680 = C0946.m55979("ᩴ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11373) ^ (-2141293146);
                        i6 = 2057015718;
                    }
                    break;
                case -1698607421:
                case -371067071:
                    c14102.m32018(true);
                    break;
                case -1578601012:
                case -371035427:
                    RunnableC0871.m55672();
                    if (C1124.m56367() >= 0) {
                        iM55680 = C0873.m55680("ۢ۟") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-9423)) ^ (-849489146);
                        i6 = -758304372;
                    } else {
                        iM55680 = C0946.m55979("۠ܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-25719)) ^ (-1341891167);
                        i6 = -1113585918;
                    }
                    break;
                case -1369302811:
                case -1118291428:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("۟ۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-7515)) ^ 1498528468;
                        i6 = -884941135;
                    } else {
                        iM55680 = C0873.m55680("ܰܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 9869) ^ (-67311920);
                        i6 = -1082137955;
                    }
                    break;
                case -1206767854:
                case 769680050:
                    C1028.m56238(textView, i);
                    c14102 = activityC3597.f7310;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("ۚᩴ") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * 4799) ^ (-724552399);
                        i6 = 812408582;
                    } else {
                        iM55680 = (C0873.m55680("᩻ܿ") ^ i4) * (-25);
                        i5 = ((iM55680 ^ i3) * (-5499)) ^ (-367580044);
                        i6 = 190252693;
                    }
                    break;
                case -819147963:
                case 1082788826:
                    i = 8;
                    if (RunnableC0897.m55784()) {
                        iM55680 = C0873.m55680("ܰܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 9869) ^ (-67311920);
                        i6 = -1082137955;
                    } else {
                        iM55680 = (C0873.m55680("ۗ۫") + i3) * C0254q.f1218h;
                        i5 = ((iM55680 ^ i4) * 13887) ^ (-5128110);
                        i6 = 290357780;
                    }
                    break;
                case -344260594:
                case 1781922600:
                    C0992.m56107();
                    break;
                case 437517122:
                case 2130745569:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ᩴ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11373) ^ (-2141293146);
                        i6 = 2057015718;
                    } else {
                        iM55680 = C0873.m55680("ۗ֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13485) ^ (-1487958134);
                        i6 = 492676111;
                    }
                    break;
                case 692139537:
                case 1301812379:
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("ᩴ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11373) ^ (-2141293146);
                        i6 = 2057015718;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۢ") + i4) * 13;
                        i5 = ((iM55680 ^ i3) * (-16689)) ^ (-1191672239);
                        i6 = -673677147;
                    }
                    break;
                case 1180349007:
                case 1828123904:
                    activityC3597 = this.f30395;
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i4) * 59;
                        i5 = ((iM55680 ^ i3) * (-9695)) ^ (-59553566);
                        i6 = -1081388172;
                    } else {
                        iM55680 = (C0873.m55680("ۚᩴ") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * 4799) ^ (-724552399);
                        i6 = 812408582;
                    }
                    break;
                case 1520687680:
                case 1865121353:
                    if (C0892.m55749()) {
                        iM55680 = C0946.m55979("֨ۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9607) ^ (-634754811);
                        i6 = 428197092;
                    } else {
                        iM55680 = (C0873.m55680("ۚᩴ") ^ i4) * (-51);
                        i5 = ((iM55680 ^ i3) * 4799) ^ (-724552399);
                        i6 = 812408582;
                    }
                    break;
                default:
                    textView = activityC3597.f7312;
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("֡֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-10647)) ^ 355554039;
                        i6 = 1590665285;
                    } else {
                        iM55680 = C0873.m55680("ܰܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 9869) ^ (-67311920);
                        i6 = -1082137955;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC3597 activityC3597 = null;
        TextView textView = null;
        boolean z = false;
        int i = -1901461787;
        int i2 = C0930.f81879;
        int i3 = AbstractC0942.f81890;
        int iM55680 = (C0873.m55680("ۨ۬") + i3) * 53;
        int i4 = ((iM55680 ^ i2) * (-14697)) ^ 64072677;
        int i5 = -8847271;
        while (true) {
            i = ((((i ^ i2) * 18675) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2074782923:
                case 1235893536:
                    activityC3597.f7310.m32018(z);
                    break;
                case -1615742151:
                case -454521233:
                    if (this.f30393 != activityC3597.f7309) {
                        iM55680 = (i2 - C0946.m55979("ܺۡ")) * 11;
                        i4 = ((iM55680 ^ i3) * 9623) ^ 1229129847;
                        i5 = 1755030678;
                    } else {
                        iM55680 = C0946.m55979("ܳܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2223) ^ (-153322883);
                        i5 = 695169764;
                    }
                    break;
                case -1381382155:
                case -979853326:
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0946.m55979("۠ۗ") ^ i3) * 87;
                        i4 = ((iM55680 ^ i2) * 5839) ^ 1065459081;
                        i5 = 1226501641;
                    } else {
                        iM55680 = (C0873.m55680("ۗ᩵") + i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-17971)) ^ 1922886143;
                        i5 = 938025614;
                    }
                    break;
                case -1182101025:
                case -1158159411:
                    C1028.m56238(textView, z ? 1 : 0);
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-7221)) ^ 323293666;
                        i5 = -1676510014;
                    } else {
                        iM55680 = C0873.m55680("ۛۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17267)) ^ 928480323;
                        i5 = -755038227;
                    }
                    break;
                case -1175632278:
                case 989355365:
                    C1071.m56343();
                    C1036.m56257();
                    iM55680 = (i2 - C0946.m55979("֨֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM55680 ^ i3) * 32103) ^ (-1392541561);
                    i5 = -752864825;
                    break;
                case -848942227:
                case -654245344:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ۨۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-367)) ^ 1098544145;
                        i5 = 1574597423;
                    } else {
                        iM55680 = (C0873.m55680("ܽۛ") ^ i2) * 89;
                        i4 = ((iM55680 ^ i3) * (-20007)) ^ (-167149484);
                        i5 = -92584838;
                    }
                    break;
                case -764626130:
                case 1786965299:
                    break;
                case -723161937:
                case -129842686:
                    C1012.m56134();
                    break;
                case -514702702:
                case 381400147:
                    if (C0877.m55696()) {
                        iM55680 = C0873.m55680("ᩳ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9007) ^ (-429452760);
                        i5 = 1409821853;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩸ܺ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-31515)) ^ (-1277137386);
                        i5 = -141511035;
                    }
                    break;
                case -459068851:
                case 1936182827:
                    C0917.m55854();
                    if (C0854.f81826 == 0) {
                        iM55680 = (i3 - C0873.m55680("᩸ܺ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-31515)) ^ (-1277137386);
                        i5 = -141511035;
                    } else {
                        iM55680 = (C0946.m55979("۠ۗ") ^ i3) * 87;
                        i4 = ((iM55680 ^ i2) * 5839) ^ 1065459081;
                        i5 = 1226501641;
                    }
                    break;
                case -448407864:
                case -23641959:
                    C0927.m55873();
                    if (!C0861.m55626()) {
                        iM55680 = (i2 - C0946.m55979("֨֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * 32103) ^ (-1392541561);
                        i5 = -752864825;
                    } else {
                        iM55680 = (C0946.m55979("۠ۗ") ^ i3) * 87;
                        i4 = ((iM55680 ^ i2) * 5839) ^ 1065459081;
                        i5 = 1226501641;
                    }
                    break;
                case 235173802:
                case 2023360188:
                    activityC3597 = this.f30395;
                    if (C0927.f81875) {
                        iM55680 = (i3 - C0873.m55680("᩸ܺ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-31515)) ^ (-1277137386);
                        i5 = -141511035;
                    } else {
                        iM55680 = (C0873.m55680("ۙۘ") ^ i3) * 15;
                        i4 = ((iM55680 ^ i2) * (-22457)) ^ (-1805917953);
                        i5 = -223823946;
                    }
                    break;
                case 717309917:
                case 1722935292:
                    C1003.m56123();
                    if (C0877.f81843 < 0) {
                        iM55680 = C0873.m55680("ۨۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-367)) ^ 1098544145;
                        i5 = 1574597423;
                    } else {
                        iM55680 = (C0946.m55979("۠ۗ") ^ i3) * 87;
                        i4 = ((iM55680 ^ i2) * 5839) ^ 1065459081;
                        i5 = 1226501641;
                    }
                    break;
                case 858682851:
                case 2035264373:
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-7221)) ^ 323293666;
                        i5 = -1676510014;
                    } else {
                        iM55680 = C0873.m55680("֫ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27391)) ^ (-827729996);
                        i5 = -900376306;
                    }
                    break;
                case 1189498657:
                case 2143623943:
                    textView = activityC3597.f7312;
                    z = false;
                    z = false;
                    if (C0894.m55769() >= 0) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-7221)) ^ 323293666;
                        i5 = -1676510014;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܳۚ")) * (-97);
                        i4 = ((iM55680 ^ i3) * 28941) ^ 2049240408;
                        i5 = -261953092;
                    }
                    break;
                case 1195208131:
                case 1240485003:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0946.m55979("۠ۗ") ^ i3) * 87;
                        i4 = ((iM55680 ^ i2) * 5839) ^ 1065459081;
                        i5 = 1226501641;
                    } else {
                        iM55680 = C0946.m55979("᩵ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27349)) ^ (-1826053279);
                        i5 = 349650984;
                    }
                    break;
                case 2039193304:
                case 2058777829:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("ۨۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-367)) ^ 1098544145;
                        i5 = 1574597423;
                    } else {
                        iM55680 = C0873.m55680("᩶ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1147) ^ 194681912;
                        i5 = 1733170776;
                    }
                    break;
                default:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-7221)) ^ 323293666;
                        i5 = -1676510014;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-16085)) ^ (-1766805249);
                        i5 = -1681110387;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x018e A[PHI: r5 r6
      0x018e: PHI (r5v3 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v4 short[]) binds: [B:127:0x018e, B:28:0x018c, B:23:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:127:0x018e, B:28:0x018c, B:23:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x01ed A[PHI: r12
      0x01ed: PHI (r12v5 java.lang.String) = (r12v4 java.lang.String), (r12v2 java.lang.String), (r12v2 java.lang.String) binds: [B:33:0x01eb, B:18:0x0108, B:15:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws JSONException, C3924 {
        short[] sArr;
        short[] sArr2;
        int i;
        int i2;
        C19179 c19179;
        String str;
        short[] sArr3;
        JSONArray jSONArray;
        int i3;
        short[] sArr4;
        int i4;
        short[] sArr5;
        short s;
        int iM55979;
        int i5;
        int i6;
        int iM559710;
        int i7;
        int i8;
        int iM55680;
        int i9;
        int i10;
        String str2;
        JSONArray jSONArray2;
        short[] sArr6;
        int i11;
        int i12;
        int i13;
        int iM559711;
        int i14;
        int i15 = -139197179;
        int i16 = C0930.f81879;
        int i17 = ServiceConnectionC1013.f81940;
        int iM559712 = (C0946.m55979("ܽۨ") + i16) * 63;
        int i18 = ((iM559712 ^ i17) * 10733) ^ (-1191670452);
        int i19 = iM559712 ^ 1159712641;
        JSONObject jSONObjectM37420 = null;
        String str3 = null;
        ArrayList arrayList = null;
        String strM55993 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i20 = 0;
        int i21 = 0;
        int iM56152 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        String str4 = null;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        C19179 c19179M43668 = null;
        JSONArray jSONArray3 = null;
        C20521 c20521 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i30 = 0;
        C16496 c16496M43674 = null;
        JSONObject jSONObject = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        int i31 = 0;
        short s2 = 0;
        int i32 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * (-13049)) >> 31));
            switch (i15) {
                case -2137209278:
                case 1605919149:
                    i20 = i20;
                    str3 = str3;
                    sArr7 = sArr7;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    sArr11 = sArr11;
                    i26 = i26;
                    sArr14 = sArr14;
                    sArr = sArr13;
                    i = i25;
                    c19179M43668 = C19179.m43668(C1929.m56558(sArr, i, 15, i22));
                    if (C1194.m56396() > 0) {
                        int iM559713 = (C0946.m55979("۟֫") + i17) * (-117);
                        sArr13 = sArr;
                        i18 = ((iM559713 ^ i16) * 6865) ^ 152508312;
                        i2 = iM559713 ^ 1318959615;
                        i25 = i;
                        sArr14 = sArr14;
                        i26 = i26;
                        sArr11 = sArr11;
                        i32 = i32;
                        jSONArray3 = jSONArray3;
                        sArr7 = sArr7;
                        str3 = str3;
                        int i33 = i20;
                        i19 = i2;
                        i20 = i33;
                    } else {
                        sArr2 = sArr11;
                        i32 = i32;
                        int iM55681 = C0873.m55680("ܽۘ") ^ i16;
                        sArr14 = sArr14;
                        i26 = i26;
                        jSONArray3 = jSONArray3;
                        sArr11 = sArr2;
                        sArr7 = sArr7;
                        str3 = str3;
                        i25 = i;
                        short[] sArr15 = sArr;
                        i18 = ((iM55681 ^ i17) * (-16087)) ^ (-1193201612);
                        i20 = i20;
                        i19 = iM55681 ^ 666243079;
                        sArr13 = sArr15;
                    }
                    break;
                case -2125666000:
                case -2081172638:
                    throw new C3924(c16496M43674.m37418());
                case -2003007662:
                case 1490743934:
                    C1048.m56305();
                    iM559711 = C0873.m55680("۟ۤ") ^ i16;
                    i10 = ((iM559711 ^ i17) * (-12567)) ^ (-890947820);
                    i14 = 209052050;
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case -1974788666:
                case 1921057913:
                    str2 = str3;
                    JSONArray jSONArray4 = jSONObjectM37420.getJSONArray(str2);
                    jSONArray2 = jSONArray4;
                    arrayList = new ArrayList(jSONArray4.length());
                    i31 = 0;
                    int iM559714 = (i16 - C0946.m55979("ۚᩳ")) * (-47);
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray2;
                    sArr7 = sArr7;
                    String str5 = str2;
                    i18 = ((iM559714 ^ i17) * (-5409)) ^ (-911709310);
                    i20 = i20;
                    i19 = iM559714 ^ (-685904674);
                    str3 = str5;
                    break;
                case -1974666726:
                case -1959369278:
                    i20 = i20;
                    C19179 c191710 = c19179M43668;
                    str3 = str3;
                    sArr7 = sArr7;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    sArr11 = sArr11;
                    int i34 = i26;
                    short[] sArr16 = sArr14;
                    int i35 = i24 + i23;
                    short s3 = s2;
                    int i36 = s3 + 6792;
                    if ((i36 * i36) - (i35 + i35) <= 0) {
                        iM559710 = (i16 - C0946.m55979("ܿ᩹")) * (-65);
                        i7 = ((iM559710 ^ i17) * 2491) ^ (-37996761);
                        i8 = -2049216835;
                    } else {
                        iM559710 = (i16 - C0946.m55979("ܿܶ")) * (-27);
                        i7 = ((iM559710 ^ i17) * (-30393)) ^ 712334015;
                        i8 = 1090981457;
                    }
                    i2 = iM559710 ^ i8;
                    c19179M43668 = c191710;
                    sArr14 = sArr16;
                    i26 = i34;
                    s2 = s3;
                    i18 = i7;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr7 = sArr7;
                    str3 = str3;
                    int i37 = i20;
                    i19 = i2;
                    i20 = i37;
                    break;
                case -1962148905:
                case -1723170659:
                    c20521.m46305(iM56152);
                    sArr10 = f82096;
                    i30 = 36;
                    if (C0967.f81910 >= 0) {
                        iM559711 = (i17 - C0873.m55680("ᩴ᩹")) * (-11);
                        i10 = ((iM559711 ^ i16) * (-28911)) ^ (-610706841);
                        i14 = 750322867;
                    } else {
                        iM559711 = C0873.m55680("ۧ᩵") ^ i17;
                        i10 = ((iM559711 ^ i16) * (-26087)) ^ (-25180691);
                        i14 = 1247546508;
                    }
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case -1694024697:
                case 889569506:
                    c20521.m46291(C1929.m56556(jSONObject, C0937.m55921(sArr9, i21, i20, i22)));
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM559711 = (i17 - C0873.m55680("ᩴ᩹")) * (-11);
                        i10 = ((iM559711 ^ i16) * (-28911)) ^ (-610706841);
                        i14 = 750322867;
                    } else {
                        iM559711 = C0873.m55680("֨ܿ") ^ i16;
                        i10 = ((iM559711 ^ i17) * (-377)) ^ (-1168698297);
                        i14 = -1249116983;
                    }
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case -1690948696:
                case -1045239016:
                    iM56152 = ServiceConnectionC1013.m56152(jSONObject, C0866.m55652(f82096, 35, 1, i22));
                    iM559711 = C0946.m55979("ܳܿ") ^ i17;
                    i10 = ((iM559711 ^ i16) * (-4541)) ^ (-1893276556);
                    i14 = 1975358337;
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case -1570158861:
                case 1669710904:
                    i20 = i20;
                    int i38 = i26;
                    int i39 = i32;
                    short[] sArr17 = sArr11;
                    sArr5 = sArr14;
                    c20521.m46309(C1964.m56596(jSONObject, C0906.m55810(sArr17, i38, i39, i22)));
                    sArr7 = f82096;
                    if (RunnableC0897.f81856) {
                        int iM559715 = C0946.m55979("ۢܶ") ^ i17;
                        sArr11 = sArr17;
                        i32 = i39;
                        i18 = ((iM559715 ^ i16) * 9627) ^ 901858665;
                        i20 = i20;
                        i19 = iM559715 ^ 1574478795;
                        sArr14 = sArr5;
                        i26 = i38;
                    } else {
                        sArr4 = sArr17;
                        i4 = i38;
                        s = s2;
                        c19179 = c19179M43668;
                        str = str3;
                        sArr3 = sArr7;
                        jSONArray = jSONArray3;
                        i3 = i39;
                        iM55979 = C0946.m55979("֫ۘ") ^ i16;
                        i5 = ((iM55979 ^ i17) * 10357) ^ 271438334;
                        i6 = 277308276;
                        int i40 = iM55979 ^ i6;
                        c19179M43668 = c19179;
                        sArr14 = sArr5;
                        i26 = i4;
                        s2 = s;
                        sArr11 = sArr4;
                        i20 = i20;
                        i19 = i40;
                        i18 = i5;
                        i32 = i3;
                        jSONArray3 = jSONArray;
                        sArr7 = sArr3;
                        str3 = str;
                    }
                    break;
                case -1569118639:
                case -976500354:
                    i20 = i20;
                    c19179 = c19179M43668;
                    str = str3;
                    sArr3 = sArr7;
                    jSONArray = jSONArray3;
                    i3 = i32;
                    sArr4 = sArr11;
                    i4 = i26;
                    sArr5 = sArr14;
                    s = f82096[4];
                    i24 = s * s;
                    i23 = 46131264;
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("֫ۘ") ^ i16;
                        i5 = ((iM55979 ^ i17) * 10357) ^ 271438334;
                        i6 = 277308276;
                    } else {
                        iM55979 = (C0946.m55979("ۚۜ") ^ i17) * (-21);
                        i5 = ((iM55979 ^ i16) * (-10915)) ^ (-989247992);
                        i6 = 99995644;
                    }
                    int i41 = iM55979 ^ i6;
                    c19179M43668 = c19179;
                    sArr14 = sArr5;
                    i26 = i4;
                    s2 = s;
                    sArr11 = sArr4;
                    i20 = i20;
                    i19 = i41;
                    i18 = i5;
                    i32 = i3;
                    jSONArray3 = jSONArray;
                    sArr7 = sArr3;
                    str3 = str;
                    break;
                case -1556256549:
                case -1540057439:
                    i20 = i20;
                    i13 = i29;
                    sArr12 = f82096;
                    i28 = 29;
                    i27 = 1;
                    if (C0877.f81843 < 0) {
                        int iM559716 = (C0946.m55979("۟ۧ") ^ i16) * 63;
                        i18 = ((iM559716 ^ i17) * 13333) ^ 828619285;
                        i2 = iM559716 ^ (-2065290294);
                        i29 = i13;
                        int i310 = i20;
                        i19 = i2;
                        i20 = i310;
                    } else {
                        i29 = i13;
                        s = s2;
                        c19179 = c19179M43668;
                        str = str3;
                        sArr3 = sArr7;
                        jSONArray = jSONArray3;
                        i3 = i32;
                        sArr4 = sArr11;
                        i4 = i26;
                        sArr5 = sArr14;
                        iM55979 = C0946.m55979("֫ۘ") ^ i16;
                        i5 = ((iM55979 ^ i17) * 10357) ^ 271438334;
                        i6 = 277308276;
                        int i42 = iM55979 ^ i6;
                        c19179M43668 = c19179;
                        sArr14 = sArr5;
                        i26 = i4;
                        s2 = s;
                        sArr11 = sArr4;
                        i20 = i20;
                        i19 = i42;
                        i18 = i5;
                        i32 = i3;
                        jSONArray3 = jSONArray;
                        sArr7 = sArr3;
                        str3 = str;
                    }
                    break;
                case -1498740334:
                case 232498903:
                    c20521.m46283(ServiceConnectionC1013.m56152(jSONObject, C0947.m55993(sArr10, i30, 1, i22)));
                    C1194.m56393(arrayList, c20521);
                    i31++;
                    str2 = str3;
                    jSONArray2 = jSONArray3;
                    int iM559717 = (i16 - C0946.m55979("ۚᩳ")) * (-47);
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray2;
                    sArr7 = sArr7;
                    String str6 = str2;
                    i18 = ((iM559717 ^ i17) * (-5409)) ^ (-911709310);
                    i20 = i20;
                    i19 = iM559717 ^ (-685904674);
                    str3 = str6;
                    break;
                case -1477276519:
                case -1321056798:
                    i22 = 25622;
                    iM55680 = C0873.m55680("ᩳ᩵") ^ i17;
                    i18 = ((iM55680 ^ i16) * (-19007)) ^ (-814059281);
                    i9 = -68088415;
                    i2 = iM55680 ^ i9;
                    c19179M43668 = c19179M43668;
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr7 = sArr7;
                    str3 = str3;
                    int i311 = i20;
                    i19 = i2;
                    i20 = i311;
                    break;
                case -1430290508:
                case 1874629426:
                    int i43 = i20;
                    short[] sArr18 = sArr7;
                    JSONArray jSONArray5 = jSONArray3;
                    int i44 = i32;
                    jSONObjectM37420 = c16496M43674.m37420();
                    String strM56180 = RunnableC1014.m56180(f82096, 22, 5, i22);
                    int iM559718 = (i17 - C0946.m55979("۠᩶")) * (-115);
                    i10 = ((iM559718 ^ i16) * 22163) ^ 486124883;
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i44;
                    jSONArray3 = jSONArray5;
                    sArr7 = sArr18;
                    str3 = strM56180;
                    i20 = i43;
                    i19 = iM559718 ^ (-7775381);
                    i18 = i10;
                    break;
                case -1322284497:
                case -611650656:
                    i20 = i20;
                    sArr6 = sArr7;
                    c20521.m46282(C1044.m56279(jSONObject, C0917.m55852(sArr6, 28, 1, i22)));
                    int iM559719 = (i17 - C0946.m55979("֫֨")) * (-53);
                    i18 = ((iM559719 ^ i16) * 29075) ^ 1759616223;
                    i2 = iM559719 ^ 1408423114;
                    sArr7 = sArr6;
                    int i312 = i20;
                    i19 = i2;
                    i20 = i312;
                    break;
                case -1173518450:
                case 583555969:
                    C0937.m55918();
                    C1048.m56305();
                    return;
                case -1132777101:
                case -398671758:
                    i20 = i20;
                    JSONArray jSONArray6 = jSONArray3;
                    int i45 = i32;
                    short[] sArr19 = sArr11;
                    sArr6 = sArr7;
                    int i46 = i26;
                    short[] sArr20 = sArr14;
                    if (i31 >= jSONArray6.length()) {
                        int iM559720 = C0946.m55979("۟ܺ") ^ i17;
                        i18 = ((iM559720 ^ i16) * (-29469)) ^ (-659365220);
                        i2 = iM559720 ^ (-1525249416);
                        sArr14 = sArr20;
                        i26 = i46;
                        sArr11 = sArr19;
                        i32 = i45;
                        jSONArray3 = jSONArray6;
                        sArr7 = sArr6;
                        int i313 = i20;
                        i19 = i2;
                        i20 = i313;
                    } else {
                        int iM559721 = C0946.m55979("ۛܳ") ^ i16;
                        i11 = ((iM559721 ^ i17) * (-11293)) ^ 1416572549;
                        i12 = iM559721 ^ 1604961708;
                        sArr14 = sArr20;
                        i26 = i46;
                        sArr11 = sArr19;
                        i32 = i45;
                        jSONArray3 = jSONArray6;
                        sArr7 = sArr6;
                        int i47 = i12;
                        i18 = i11;
                        i20 = i20;
                        i19 = i47;
                    }
                    break;
                case -1037434873:
                case 420483443:
                    i13 = i29;
                    c20521.m46302(C1044.m56279(jSONObject, C0906.m55810(sArr8, i13, 1, i22)));
                    if (!C0892.m55749()) {
                        i20 = i20;
                        i29 = i13;
                        s = s2;
                        c19179 = c19179M43668;
                        str = str3;
                        sArr3 = sArr7;
                        jSONArray = jSONArray3;
                        i3 = i32;
                        sArr4 = sArr11;
                        i4 = i26;
                        sArr5 = sArr14;
                        iM55979 = C0946.m55979("֫ۘ") ^ i16;
                        i5 = ((iM55979 ^ i17) * 10357) ^ 271438334;
                        i6 = 277308276;
                        int i48 = iM55979 ^ i6;
                        c19179M43668 = c19179;
                        sArr14 = sArr5;
                        i26 = i4;
                        s2 = s;
                        sArr11 = sArr4;
                        i20 = i20;
                        i19 = i48;
                        i18 = i5;
                        i32 = i3;
                        jSONArray3 = jSONArray;
                        sArr7 = sArr3;
                        str3 = str;
                    } else {
                        int iM55682 = C0873.m55680("۟ۘ") ^ i16;
                        i20 = i20;
                        i11 = ((iM55682 ^ i17) * 27381) ^ (-1051029684);
                        i12 = iM55682 ^ 267552810;
                        i29 = i13;
                        int i49 = i12;
                        i18 = i11;
                        i20 = i20;
                        i19 = i49;
                    }
                    break;
                case -885805223:
                case 747904603:
                    c20521.m46296(jSONObject.getLong(strM55993));
                    sArr9 = f82096;
                    i21 = 34;
                    i20 = 1;
                    iM559711 = C0946.m55979("ۛ۟") ^ i16;
                    i10 = ((iM559711 ^ i17) * (-5241)) ^ (-224367925);
                    i14 = -1246067051;
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case -428525263:
                case -53126453:
                    i20 = i20;
                    String str7 = str3;
                    sArr7 = sArr7;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    sArr11 = sArr11;
                    i26 = i26;
                    sArr14 = sArr14;
                    str3 = str7;
                    String str8 = str4;
                    c19179M43668 = c19179M43668;
                    C1044.m56278(c19179M43668, C0947.m55993(f82096, 20, 2, i22), str8);
                    c16496M43674 = c19179M43668.m43674();
                    if (c16496M43674.m37422()) {
                        iM55680 = C0946.m55979("ۤۢ") ^ i16;
                        str4 = str8;
                        i18 = ((iM55680 ^ i17) * 1355) ^ (-1707879378);
                        i9 = 1090596538;
                    } else {
                        str4 = str8;
                        iM55680 = (C0946.m55979("۫ܽ") + i17) * 23;
                        i18 = ((iM55680 ^ i16) * (-1691)) ^ 2023148682;
                        i9 = -911660180;
                    }
                    i2 = iM55680 ^ i9;
                    c19179M43668 = c19179M43668;
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr7 = sArr7;
                    str3 = str3;
                    int i314 = i20;
                    i19 = i2;
                    i20 = i314;
                    break;
                case -96928685:
                case 1864450539:
                    c20521.m46314(C1964.m56596(jSONObject, C1964.m56584(sArr14, 32, 1, i22)));
                    iM559711 = C0873.m55680("᩺ۡ") ^ i17;
                    i10 = ((iM559711 ^ i16) * 1405) ^ 901132262;
                    i14 = -1485499790;
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case -37365932:
                case 1512038162:
                    C0917.m55854();
                    if (RunnableC0871.f81839 >= 0) {
                        i20 = i20;
                        sArr = sArr13;
                        i = i25;
                        str3 = str3;
                        sArr2 = sArr11;
                        sArr7 = sArr7;
                        jSONArray3 = jSONArray3;
                        i26 = i26;
                        sArr14 = sArr14;
                        int iM55683 = C0873.m55680("ܽۘ") ^ i16;
                        sArr14 = sArr14;
                        i26 = i26;
                        jSONArray3 = jSONArray3;
                        sArr11 = sArr2;
                        sArr7 = sArr7;
                        str3 = str3;
                        i25 = i;
                        short[] sArr110 = sArr;
                        i18 = ((iM55683 ^ i17) * (-16087)) ^ (-1193201612);
                        i20 = i20;
                        i19 = iM55683 ^ 666243079;
                        sArr13 = sArr110;
                    } else {
                        iM559711 = C0946.m55979("᩺᩷") ^ i17;
                        i10 = ((iM559711 ^ i16) * 20565) ^ 1198919739;
                        i14 = -1272035277;
                        i19 = iM559711 ^ i14;
                        i18 = i10;
                    }
                    break;
                case 72804008:
                case 1812864455:
                    int i50 = i20;
                    int i51 = i27;
                    short[] sArr21 = sArr12;
                    int i52 = i28;
                    c20521.m46295(C1044.m56279(jSONObject, C0854.m55597(sArr21, i52, i51, i22)));
                    sArr8 = f82096;
                    i29 = 30;
                    int iM55684 = C0873.m55680("᩸᩺") ^ i17;
                    sArr12 = sArr21;
                    i28 = i52;
                    i18 = ((iM55684 ^ i16) * 5433) ^ (-1974885104);
                    i20 = i50;
                    i19 = iM55684 ^ 786348661;
                    i27 = i51;
                    break;
                case 151754442:
                case 2057019579:
                    C0967.m56074();
                    if (C1024.f81946) {
                        iM559711 = C0946.m55979("᩺᩷") ^ i17;
                        i10 = ((iM559711 ^ i16) * 20565) ^ 1198919739;
                        i14 = -1272035277;
                    } else {
                        iM559711 = C0873.m55680("۟ۤ") ^ i16;
                        i10 = ((iM559711 ^ i17) * (-12567)) ^ (-890947820);
                        i14 = 209052050;
                    }
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case 250806200:
                case 386250419:
                    i20 = i20;
                    c19179M43668 = c19179M43668;
                    str3 = str3;
                    sArr7 = sArr7;
                    jSONArray3 = jSONArray3;
                    i32 = i32;
                    sArr11 = sArr11;
                    i26 = i26;
                    sArr14 = sArr14;
                    str4 = this.f30395.f7315;
                    int i53 = C17837.f53209;
                    sArr13 = f82096;
                    i25 = 5;
                    iM55680 = (i16 - C0946.m55979("ۚ֫")) * (-47);
                    i18 = ((iM55680 ^ i17) * 20907) ^ 1817274168;
                    i9 = -335557961;
                    i2 = iM55680 ^ i9;
                    c19179M43668 = c19179M43668;
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr7 = sArr7;
                    str3 = str3;
                    int i315 = i20;
                    i19 = i2;
                    i20 = i315;
                    break;
                case 263952952:
                case 1239524147:
                    this.f30394 = arrayList;
                    return;
                case 361972248:
                case 1394086122:
                    i22 = 52727;
                    iM55680 = C0873.m55680("ᩳ᩵") ^ i17;
                    i18 = ((iM55680 ^ i16) * (-19007)) ^ (-814059281);
                    i9 = -68088415;
                    i2 = iM55680 ^ i9;
                    c19179M43668 = c19179M43668;
                    sArr14 = sArr14;
                    i26 = i26;
                    sArr11 = sArr11;
                    i32 = i32;
                    jSONArray3 = jSONArray3;
                    sArr7 = sArr7;
                    str3 = str3;
                    int i316 = i20;
                    i19 = i2;
                    i20 = i316;
                    break;
                case 558838277:
                case 1441724066:
                    c20521.m46303(C1964.m56596(jSONObject, C1024.m56203(f82096, 31, 1, i22)));
                    sArr14 = f82096;
                    if (C1028.f81950 > 0) {
                        iM559711 = (C0946.m55979("ۛ᩶") ^ i16) * 65;
                        i10 = ((iM559711 ^ i17) * (-22005)) ^ (-2045572057);
                        i14 = -1325395034;
                        i19 = iM559711 ^ i14;
                        i18 = i10;
                    } else {
                        i20 = i20;
                        s = s2;
                        c19179 = c19179M43668;
                        str = str3;
                        sArr3 = sArr7;
                        jSONArray = jSONArray3;
                        i3 = i32;
                        sArr4 = sArr11;
                        i4 = i26;
                        sArr5 = sArr14;
                        iM55979 = C0946.m55979("֫ۘ") ^ i16;
                        i5 = ((iM55979 ^ i17) * 10357) ^ 271438334;
                        i6 = 277308276;
                        int i410 = iM55979 ^ i6;
                        c19179M43668 = c19179;
                        sArr14 = sArr5;
                        i26 = i4;
                        s2 = s;
                        sArr11 = sArr4;
                        i20 = i20;
                        i19 = i410;
                        i18 = i5;
                        i32 = i3;
                        jSONArray3 = jSONArray;
                        sArr7 = sArr3;
                        str3 = str;
                    }
                    break;
                case 810670942:
                case 1266801829:
                    strM55993 = C0947.m55993(f82096, 33, 1, i22);
                    if (C0917.m55854()) {
                        iM559711 = C0946.m55979("᩹᩷") ^ i17;
                        i10 = ((iM559711 ^ i16) * 9595) ^ (-509687030);
                        i14 = 667358519;
                    } else {
                        iM559711 = C0873.m55680("۟ۤ") ^ i16;
                        i10 = ((iM559711 ^ i17) * (-12567)) ^ (-890947820);
                        i14 = 209052050;
                    }
                    i19 = iM559711 ^ i14;
                    i18 = i10;
                    break;
                case 1044034575:
                case 1327768310:
                    C0882.m55710();
                    if (RunnableC1014.f81941 <= 0) {
                        iM559711 = (i17 - C0873.m55680("ᩴ᩹")) * (-11);
                        i10 = ((iM559711 ^ i16) * (-28911)) ^ (-610706841);
                        i14 = 750322867;
                        i19 = iM559711 ^ i14;
                        i18 = i10;
                    } else {
                        i20 = i20;
                        sArr = sArr13;
                        i = i25;
                        str3 = str3;
                        sArr2 = sArr11;
                        sArr7 = sArr7;
                        jSONArray3 = jSONArray3;
                        i26 = i26;
                        sArr14 = sArr14;
                        int iM55685 = C0873.m55680("ܽۘ") ^ i16;
                        sArr14 = sArr14;
                        i26 = i26;
                        jSONArray3 = jSONArray3;
                        sArr11 = sArr2;
                        sArr7 = sArr7;
                        str3 = str3;
                        i25 = i;
                        short[] sArr111 = sArr;
                        i18 = ((iM55685 ^ i17) * (-16087)) ^ (-1193201612);
                        i20 = i20;
                        i19 = iM55685 ^ 666243079;
                        sArr13 = sArr111;
                    }
                    break;
                default:
                    i20 = i20;
                    sArr14 = sArr14;
                    JSONArray jSONArray7 = jSONArray3;
                    short[] sArr22 = sArr7;
                    jSONObject = jSONArray7.getJSONObject(i31);
                    c20521 = new C20521();
                    sArr11 = f82096;
                    i32 = 1;
                    if (C1929.m56553()) {
                        jSONArray3 = jSONArray7;
                        sArr = sArr13;
                        str3 = str3;
                        sArr2 = sArr11;
                        i26 = 27;
                        sArr7 = sArr22;
                        i = i25;
                        int iM55686 = C0873.m55680("ܽۘ") ^ i16;
                        sArr14 = sArr14;
                        i26 = i26;
                        jSONArray3 = jSONArray3;
                        sArr11 = sArr2;
                        sArr7 = sArr7;
                        str3 = str3;
                        i25 = i;
                        short[] sArr112 = sArr;
                        i18 = ((iM55686 ^ i17) * (-16087)) ^ (-1193201612);
                        i20 = i20;
                        i19 = iM55686 ^ 666243079;
                        sArr13 = sArr112;
                    } else {
                        int iM55687 = C0873.m55680("ۖ᩸") ^ i16;
                        i18 = ((iM55687 ^ i17) * (-10095)) ^ (-1458079249);
                        jSONArray3 = jSONArray7;
                        sArr7 = sArr22;
                        i20 = i20;
                        i19 = iM55687 ^ 1295535020;
                        sArr14 = sArr14;
                        i26 = 27;
                    }
                    break;
            }
        }
    }
}
