package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98C */
/* JADX INFO: loaded from: classes4.dex */
public final class C18367 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f57060;

    /* JADX INFO: renamed from: ۚۚۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f57061 = {351, -14981, -14979, -14983, -14996, -14978, -15006, -14979, -15002, -14978, -14999, 7335, -28199, -28195, -28216, -28198, -28218, -28199, -28222, -28198, -28193, -28211};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m42800(String str, C16955 c16955) {
        try {
            if (c16955 == null) {
                if (f57060.remove(str) != null) {
                    m42799();
                }
            } else if (!ViewOnClickListenerC1958.m6437(c16955, C3746.m11368(f57060, str, c16955))) {
                m42799();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0664, code lost:
    
        if (l.RunnableC1937.f6483 >= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0445, code lost:
    
        if (l.C0714.f2697 >= 0) goto L84;
     */
    static {
        int iM2566;
        int i;
        int iM2567;
        int i2;
        String str;
        String str2;
        int i3;
        String str3;
        String str4;
        JSONArray jSONArray;
        String str5;
        String string;
        JSONObject jSONObject;
        String str6;
        int i4;
        String str7;
        int i5;
        int iM6981;
        String string2;
        int i6;
        int i7;
        JSONArray jSONArray2;
        String str8;
        int i8;
        String str9;
        JSONObject jSONObject2;
        int i9;
        int iM6982;
        int i10;
        JSONArray jSONArray3;
        String str10;
        InterfaceC12344 interfaceC12344 = null;
        String strM3407 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = RunnableC0588.f2309;
        int i12 = C3537.f11231;
        int iM6983 = C2105.m6981("᩸ۖ") ^ i11;
        int i13 = ((iM6983 ^ i12) * (-22741)) ^ 1528382854;
        int i14 = iM6983 ^ (-1976828061);
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 231431422;
        boolean z = false;
        String str11 = null;
        JSONObject jSONObject3 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        JSONArray jSONArray4 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            i18 = i14 ^ (i13 & (((i18 ^ i12) * (-24155)) >> 31));
            switch (i18) {
                case -2020954871:
                case 694846603:
                    interfaceC12344 = interfaceC12344;
                    String str16 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    int i26 = i25;
                    str3 = str13;
                    i22 = i22;
                    str4 = str14;
                    jSONArray = jSONArray4;
                    try {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i20);
                        String str17 = str16;
                        try {
                            i25 = i26;
                            i20 = i20;
                            try {
                                String string3 = jSONObject4.getString(C1420.m4902(f57061, 7, 1, i19));
                                try {
                                    str17 = string3;
                                    string = jSONObject4.getString(C1128.m3841(f57061, 8, 1, i19));
                                    try {
                                        i15 = jSONObject4.getInt(C3432.m10488(f57061, 9, 1, i19));
                                        boolean zContains = jSONObject4.contains(str15);
                                        int iM2568 = (C0630.m2566("ۘۖ") ^ i12) * 81;
                                        z = zContains;
                                        str14 = str4;
                                        jSONObject3 = jSONObject4;
                                        i25 = i25;
                                        i4 = -701731302;
                                        str7 = string;
                                        i5 = ((iM2568 ^ i11) * 30181) ^ 1300408700;
                                        str6 = str17;
                                        jSONArray4 = jSONArray;
                                        iM6981 = iM2568;
                                        i20 = i20;
                                    } catch (Exception unused) {
                                        jSONObject = jSONObject4;
                                        str6 = str17;
                                        int iM2569 = C0630.m2566("֫᩺") ^ i12;
                                        jSONObject3 = jSONObject;
                                        str14 = str4;
                                        jSONArray4 = jSONArray;
                                        i20 = i20;
                                        str7 = string;
                                        iM6981 = iM2569;
                                        i5 = ((iM2569 ^ i11) * (-30817)) ^ 535976770;
                                        i25 = i25;
                                        i4 = -2048950696;
                                    }
                                } catch (Exception unused2) {
                                    str17 = string3;
                                    string = str3;
                                    jSONObject = jSONObject4;
                                    str6 = str17;
                                    int iM25610 = C0630.m2566("֫᩺") ^ i12;
                                    jSONObject3 = jSONObject;
                                    str14 = str4;
                                    jSONArray4 = jSONArray;
                                    i20 = i20;
                                    str7 = string;
                                    iM6981 = iM25610;
                                    i5 = ((iM25610 ^ i11) * (-30817)) ^ 535976770;
                                    i25 = i25;
                                    i4 = -2048950696;
                                    i14 = iM6981 ^ i4;
                                    i25 = i25;
                                    str10 = str7;
                                    jSONArray3 = jSONArray4;
                                    i22 = i22;
                                    str8 = str6;
                                    i21 = i21;
                                    str13 = str10;
                                    str12 = str8;
                                    jSONArray4 = jSONArray3;
                                    i13 = i5;
                                    interfaceC12344 = interfaceC12344;
                                    str15 = str15;
                                    strM3407 = strM3407;
                                    jSONObject3 = jSONObject3;
                                    break;
                                }
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            i25 = i26;
                            i20 = i20;
                        }
                    } catch (Exception unused5) {
                        str5 = str16;
                        i25 = i26;
                        string = str3;
                        str6 = str5;
                        jSONObject = jSONObject3;
                        int iM25611 = C0630.m2566("֫᩺") ^ i12;
                        jSONObject3 = jSONObject;
                        str14 = str4;
                        jSONArray4 = jSONArray;
                        i20 = i20;
                        str7 = string;
                        iM6981 = iM25611;
                        i5 = ((iM25611 ^ i11) * (-30817)) ^ 535976770;
                        i25 = i25;
                        i4 = -2048950696;
                        i14 = iM6981 ^ i4;
                        i25 = i25;
                        str10 = str7;
                        jSONArray3 = jSONArray4;
                        i22 = i22;
                        str8 = str6;
                        i21 = i21;
                        str13 = str10;
                        str12 = str8;
                        jSONArray4 = jSONArray3;
                        i13 = i5;
                        interfaceC12344 = interfaceC12344;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                        break;
                    }
                    i14 = iM6981 ^ i4;
                    i25 = i25;
                    str10 = str7;
                    jSONArray3 = jSONArray4;
                    i22 = i22;
                    str8 = str6;
                    i21 = i21;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1972070816:
                case 2143182390:
                    C3432.m10477();
                    C1128.m3851();
                    throw new RuntimeException();
                case -1914666770:
                case 642987253:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i22 = i22;
                    str14 = str14;
                    if (!z) {
                        string2 = str11;
                        int iM25612 = C0630.m2566("ᩳ۟") ^ i12;
                        i6 = ((iM25612 ^ i11) * 18677) ^ 1047973482;
                        i4 = 2056988659;
                        str14 = string2;
                        iM6981 = iM25612;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                        i14 = iM6981 ^ i4;
                        i25 = i25;
                        str10 = str7;
                        jSONArray3 = jSONArray4;
                        i22 = i22;
                        str8 = str6;
                        i21 = i21;
                        str13 = str10;
                        str12 = str8;
                        jSONArray4 = jSONArray3;
                        i13 = i5;
                        interfaceC12344 = interfaceC12344;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        iM6981 = C2105.m6981("ۧ᩵") ^ i11;
                        i6 = ((iM6981 ^ i12) * 30541) ^ (-1279294660);
                        i4 = 1218173597;
                        str14 = str14;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                        i14 = iM6981 ^ i4;
                        i25 = i25;
                        str10 = str7;
                        jSONArray3 = jSONArray4;
                        i22 = i22;
                        str8 = str6;
                        i21 = i21;
                        str13 = str10;
                        str12 = str8;
                        jSONArray4 = jSONArray3;
                        i13 = i5;
                        interfaceC12344 = interfaceC12344;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -1737828291:
                case 2088983133:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    String str18 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    if (i16 - (i17 + i17) > 0) {
                        iM2567 = C0630.m2566("᩵ܿ") ^ i12;
                        i13 = ((iM2567 ^ i11) * (-32433)) ^ (-1193124451);
                        str2 = str18;
                        i3 = -1471739621;
                    } else {
                        iM2567 = C2105.m6981("۬ܶ") ^ i11;
                        i13 = ((iM2567 ^ i12) * (-11553)) ^ 199278473;
                        str2 = str18;
                        i3 = -1704277638;
                    }
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1702510405:
                case 2095619229:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    break;
                case -1679512862:
                case -1477038843:
                    i20 = 0;
                    iM6981 = (i12 - C0630.m2566("᩸ۘ")) * 63;
                    i6 = ((iM6981 ^ i11) * (-22507)) ^ (-1523892272);
                    i4 = -416268474;
                    str14 = str14;
                    str7 = str13;
                    str6 = str12;
                    i5 = i6;
                    i14 = iM6981 ^ i4;
                    i25 = i25;
                    str10 = str7;
                    jSONArray3 = jSONArray4;
                    i22 = i22;
                    str8 = str6;
                    i21 = i21;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1649093715:
                case 2089703120:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i22 = i22;
                    str14 = str14;
                    if (i20 >= i25) {
                        int iM25613 = C0630.m2566("ܳܺ") ^ i11;
                        i13 = ((iM25613 ^ i12) * (-14097)) ^ (-1665173257);
                        i14 = iM25613 ^ (-51149352);
                        str12 = str12;
                        i25 = i25;
                        str14 = str14;
                        i22 = i22;
                        strM3407 = strM3407;
                        interfaceC12344 = interfaceC12344;
                        jSONObject3 = jSONObject3;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                    } else {
                        iM6981 = (i11 - C2105.m6981("᩺֡")) * 99;
                        i6 = ((iM6981 ^ i12) * (-24881)) ^ (-1915222644);
                        i4 = -1570845101;
                        str14 = str14;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                        i14 = iM6981 ^ i4;
                        i25 = i25;
                        str10 = str7;
                        jSONArray3 = jSONArray4;
                        i22 = i22;
                        str8 = str6;
                        i21 = i21;
                        str13 = str10;
                        str12 = str8;
                        jSONArray4 = jSONArray3;
                        i13 = i5;
                        interfaceC12344 = interfaceC12344;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -1647676702:
                case 287740486:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    if (C4075.f12947 < 0) {
                        int iM25614 = (i11 - C0630.m2566("ᩴ۫")) * 123;
                        i13 = ((iM25614 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM25614 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                    } else {
                        iM2567 = C2105.m6981("ۧܳ") ^ i11;
                        i13 = (-1644981573) ^ ((iM2567 ^ i12) * (-28681));
                        i25 = i25;
                        str2 = str15;
                        i3 = 727267317;
                        i14 = iM2567 ^ i3;
                    }
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1579490603:
                case 79167547:
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    InterfaceC12344 interfaceC12345 = ApplicationC20075.f65008;
                    sArr3 = f57061;
                    i24 = 2;
                    if (!C1504.f5354) {
                        iM2566 = C0630.m2566("ܰۚ") ^ i12;
                        i13 = ((iM2566 ^ i11) * (-21743)) ^ 1326525623;
                        interfaceC12344 = interfaceC12345;
                        i25 = i25;
                        i = 175226949;
                        i14 = iM2566 ^ i;
                        str12 = str12;
                        i25 = i25;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        interfaceC12344 = interfaceC12345;
                        int iM25615 = (i11 - C0630.m2566("ᩴ۫")) * 123;
                        i13 = ((iM25615 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM25615 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -1492880465:
                case -1034359329:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    C2167.m7155();
                    C1005.m3501();
                    i25 = i25;
                    iM2567 = (C2105.m6981("۬᩶") + i12) * (-45);
                    i13 = ((iM2567 ^ i11) * 9339) ^ 1115817975;
                    str2 = str15;
                    i3 = 1576019466;
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1468713535:
                case -889167457:
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    RunnableC0588.m2441();
                    if (C0630.f2410 <= 0) {
                        i7 = i20;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        i8 = i21;
                        int iM25616 = (C0630.m2566("ۗ۠") + i12) * (-55);
                        i13 = ((iM25616 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC12344 = interfaceC12344;
                        i14 = iM25616 ^ 1824859881;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    i25 = i25;
                    iM2567 = (C2105.m6981("۬᩶") + i12) * (-45);
                    i13 = ((iM2567 ^ i11) * 9339) ^ 1115817975;
                    str2 = str15;
                    i3 = 1576019466;
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1423896203:
                case 853463842:
                    interfaceC12344 = interfaceC12344;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    try {
                        strM3407 = strM3407;
                        try {
                            boolean z2 = jSONObject3.getBoolean(C1047.m3603(f57061, 10, 1, i19));
                            jSONObject3 = jSONObject3;
                            try {
                                i21 = i21;
                                str3 = str13;
                                i22 = i22;
                                str4 = str14;
                                try {
                                    str9 = str12;
                                    try {
                                        C1128.m3856(f57060, str9, new C16955(str3, EnumC8139.values()[i15], str4, z2));
                                        int iM6984 = (C2105.m6981("ۜ֡") + i11) * 5;
                                        str14 = str4;
                                        str7 = str3;
                                        str6 = str9;
                                        i5 = ((iM6984 ^ i12) * (-1535)) ^ 540574452;
                                        iM6981 = iM6984;
                                        i25 = i25;
                                        i4 = 957688684;
                                    } catch (Exception unused6) {
                                        jSONArray = jSONArray4;
                                        str5 = str9;
                                        string = str3;
                                        str6 = str5;
                                        jSONObject = jSONObject3;
                                        int iM25617 = C0630.m2566("֫᩺") ^ i12;
                                        jSONObject3 = jSONObject;
                                        str14 = str4;
                                        jSONArray4 = jSONArray;
                                        i20 = i20;
                                        str7 = string;
                                        iM6981 = iM25617;
                                        i5 = ((iM25617 ^ i11) * (-30817)) ^ 535976770;
                                        i25 = i25;
                                        i4 = -2048950696;
                                    }
                                } catch (Exception unused7) {
                                    jSONArray = jSONArray4;
                                    str5 = str12;
                                    string = str3;
                                    str6 = str5;
                                    jSONObject = jSONObject3;
                                    int iM25618 = C0630.m2566("֫᩺") ^ i12;
                                    jSONObject3 = jSONObject;
                                    str14 = str4;
                                    jSONArray4 = jSONArray;
                                    i20 = i20;
                                    str7 = string;
                                    iM6981 = iM25618;
                                    i5 = ((iM25618 ^ i11) * (-30817)) ^ 535976770;
                                    i25 = i25;
                                    i4 = -2048950696;
                                }
                            } catch (Exception unused8) {
                                i21 = i21;
                                str3 = str13;
                                i22 = i22;
                                str4 = str14;
                            }
                        } catch (Exception unused9) {
                            i21 = i21;
                            str9 = str12;
                            str3 = str13;
                            i22 = i22;
                            str4 = str14;
                            jSONArray = jSONArray4;
                            str5 = str9;
                            string = str3;
                            str6 = str5;
                            jSONObject = jSONObject3;
                            int iM25619 = C0630.m2566("֫᩺") ^ i12;
                            jSONObject3 = jSONObject;
                            str14 = str4;
                            jSONArray4 = jSONArray;
                            i20 = i20;
                            str7 = string;
                            iM6981 = iM25619;
                            i5 = ((iM25619 ^ i11) * (-30817)) ^ 535976770;
                            i25 = i25;
                            i4 = -2048950696;
                            i14 = iM6981 ^ i4;
                            i25 = i25;
                            str10 = str7;
                            jSONArray3 = jSONArray4;
                            i22 = i22;
                            str8 = str6;
                            i21 = i21;
                            str13 = str10;
                            str12 = str8;
                            jSONArray4 = jSONArray3;
                            i13 = i5;
                            interfaceC12344 = interfaceC12344;
                            str15 = str15;
                            strM3407 = strM3407;
                            jSONObject3 = jSONObject3;
                            break;
                        }
                    } catch (Exception unused10) {
                        strM3407 = strM3407;
                    }
                    i14 = iM6981 ^ i4;
                    i25 = i25;
                    str10 = str7;
                    jSONArray3 = jSONArray4;
                    i22 = i22;
                    str8 = str6;
                    i21 = i21;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -1369051870:
                case -1298000522:
                    interfaceC12344 = interfaceC12344;
                    jSONObject2 = jSONObject3;
                    str15 = str15;
                    break;
                case -1109805565:
                case 1116964669:
                    interfaceC12344 = interfaceC12344;
                    JSONObject jSONObject5 = jSONObject3;
                    str15 = str15;
                    int i27 = s + s2;
                    i16 = i27 * i27;
                    if (C3537.f11231 >= 0) {
                        jSONObject3 = jSONObject5;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        iM2567 = C2105.m6981("ۧܳ") ^ i11;
                        i13 = (-1644981573) ^ ((iM2567 ^ i12) * (-28681));
                        i25 = i25;
                        str2 = str15;
                        i3 = 727267317;
                    } else {
                        iM2567 = (i12 - C0630.m2566("ۧۜ")) * (-7);
                        i13 = ((iM2567 ^ i11) * (-19861)) ^ (-1321765116);
                        jSONObject3 = jSONObject5;
                        strM3407 = strM3407;
                        i21 = i21;
                        i25 = i25;
                        str12 = str12;
                        str13 = str13;
                        i2 = i22;
                        str2 = str15;
                        str = str14;
                        i3 = 347663485;
                    }
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -905976653:
                case 1653003134:
                    interfaceC12344 = interfaceC12344;
                    jSONObject2 = jSONObject3;
                    str15 = str15;
                    if (C1773.m5908() > 0) {
                        jSONObject3 = jSONObject2;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        int iM256110 = (i11 - C0630.m2566("ᩴ۫")) * 123;
                        i13 = ((iM256110 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM256110 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    jSONObject3 = jSONObject2;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str12 = str12;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    iM2566 = (C2105.m6981("ۧ֨") + i12) * 7;
                    i13 = ((iM2566 ^ i11) * 32567) ^ (-291315234);
                    i = 454108354;
                    i14 = iM2566 ^ i;
                    str12 = str12;
                    i25 = i25;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -782183076:
                case 157285295:
                    interfaceC12344 = interfaceC12344;
                    JSONObject jSONObject6 = jSONObject3;
                    str15 = str15;
                    try {
                        string2 = jSONObject6.getString(str15);
                        jSONObject3 = jSONObject6;
                        strM3407 = strM3407;
                        i21 = i21;
                        i25 = i25;
                        str12 = str12;
                        str13 = str13;
                        i22 = i22;
                        int iM256111 = C0630.m2566("ᩳ۟") ^ i12;
                        i6 = ((iM256111 ^ i11) * 18677) ^ 1047973482;
                        i4 = 2056988659;
                        str14 = string2;
                        iM6981 = iM256111;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                    } catch (Exception unused11) {
                        jSONObject3 = jSONObject6;
                        strM3407 = strM3407;
                        i21 = i21;
                        jSONArray = jSONArray4;
                        str5 = str12;
                        str3 = str13;
                        i22 = i22;
                        str4 = str14;
                        string = str3;
                        str6 = str5;
                        jSONObject = jSONObject3;
                        int iM256112 = C0630.m2566("֫᩺") ^ i12;
                        jSONObject3 = jSONObject;
                        str14 = str4;
                        jSONArray4 = jSONArray;
                        i20 = i20;
                        str7 = string;
                        iM6981 = iM256112;
                        i5 = ((iM256112 ^ i11) * (-30817)) ^ 535976770;
                        i25 = i25;
                        i4 = -2048950696;
                    }
                    i14 = iM6981 ^ i4;
                    i25 = i25;
                    str10 = str7;
                    jSONArray3 = jSONArray4;
                    i22 = i22;
                    str8 = str6;
                    i21 = i21;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -755414657:
                case 725172264:
                    interfaceC12344 = interfaceC12344;
                    if (C11340.f33930 >= 0) {
                        int iM25620 = C0630.m2566("֨ۖ") ^ i12;
                        i13 = ((iM25620 ^ i11) * 18511) ^ (-1787908982);
                        iM2566 = iM25620;
                        i = -1077226403;
                        i2 = i22;
                        str = str14;
                        i14 = iM2566 ^ i;
                        str12 = str12;
                        i25 = i25;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        int iM25621 = C0630.m2566("᩺ܶ") ^ i11;
                        i13 = (-502216431) ^ ((iM25621 ^ i12) * 12751);
                        i14 = 58524904 ^ iM25621;
                        interfaceC12344 = interfaceC12344;
                    }
                    break;
                case -666531575:
                case 1416017981:
                    f57060.clear();
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i22 = i22;
                    str14 = str14;
                    int iM256113 = C0630.m2566("ܳܺ") ^ i11;
                    i13 = ((iM256113 ^ i12) * (-14097)) ^ (-1665173257);
                    i14 = iM256113 ^ (-51149352);
                    str12 = str12;
                    i25 = i25;
                    str14 = str14;
                    i22 = i22;
                    strM3407 = strM3407;
                    interfaceC12344 = interfaceC12344;
                    jSONObject3 = jSONObject3;
                    str13 = str13;
                    i21 = i21;
                    str15 = str15;
                    break;
                case -504313388:
                case 157271238:
                    interfaceC12344 = interfaceC12344;
                    f57060 = new HashMap();
                    if (C7106.f21815 != 0) {
                        int iM25622 = (C0630.m2566("۫ۢ") + i11) * (-27);
                        i9 = 779281678 ^ ((iM25622 ^ i12) * 23811);
                        i8 = i21;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM3407 = strM3407;
                        i2 = i22;
                        iM6982 = iM25622;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str = str14;
                        i7 = i20;
                        i10 = 821022762;
                    } else {
                        int iM25623 = (C0630.m2566("ܽܽ") + i11) * (-119);
                        i9 = (-1206190647) ^ ((iM25623 ^ i12) * 28931);
                        i8 = i21;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM3407 = strM3407;
                        i2 = i22;
                        iM6982 = iM25623;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str = str14;
                        i7 = i20;
                        i10 = -894789486;
                    }
                    int i28 = iM6982 ^ i10;
                    str14 = str;
                    i20 = i7;
                    i22 = i2;
                    String str19 = str13;
                    i21 = i8;
                    i5 = i9;
                    jSONArray3 = jSONArray2;
                    i14 = i28;
                    str10 = str19;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -449771030:
                case -292800273:
                    interfaceC12344 = interfaceC12344;
                    String strM948 = C0050.m948(sArr2, i22, i23, i19);
                    if (C2167.f7158 < 0) {
                        iM2567 = C0630.m2566("ۗ֨") ^ i12;
                        i13 = (-866942562) ^ ((iM2567 ^ i11) * (-16169));
                        i21 = i21;
                        str12 = str12;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        strM3407 = strM3407;
                        i2 = i22;
                        i25 = i25;
                        str = str14;
                        str2 = strM948;
                        i3 = -656010947;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        str15 = strM948;
                        int iM25624 = C0630.m2566("᩺ܶ") ^ i11;
                        i13 = (-502216431) ^ ((iM25624 ^ i12) * 12751);
                        i14 = 58524904 ^ iM25624;
                        interfaceC12344 = interfaceC12344;
                    }
                    break;
                case -265275326:
                case 1464754096:
                    interfaceC12344 = interfaceC12344;
                    i17 = (s * s) + 123810129;
                    if (C7106.m19120() > 0) {
                        iM2567 = C2105.m6981("᩹֡") ^ i12;
                        i13 = (-1197404467) ^ ((iM2567 ^ i11) * 12033);
                        i3 = 1238429247;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM3407 = strM3407;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        i8 = i21;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM3407 = strM3407;
                        i7 = i20;
                        i2 = i22;
                        str = str14;
                        int iM256114 = (C0630.m2566("ۗ۠") + i12) * (-55);
                        i13 = ((iM256114 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC12344 = interfaceC12344;
                        i14 = iM256114 ^ 1824859881;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -222601100:
                case 1171651910:
                    interfaceC12344 = interfaceC12344;
                    C3432.m10477();
                    if (!C1504.m5179()) {
                        int iM6985 = (C2105.m6981("֫᩵") + i11) * (-45);
                        i13 = ((iM6985 ^ i12) * (-20575)) ^ (-140749201);
                        iM2566 = iM6985;
                        i = 1189458202;
                        i2 = i22;
                        str = str14;
                        i14 = iM2566 ^ i;
                        str12 = str12;
                        i25 = i25;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        iM2567 = C2105.m6981("ۧܳ") ^ i11;
                        i13 = (-1644981573) ^ ((iM2567 ^ i12) * (-28681));
                        i25 = i25;
                        str2 = str15;
                        i3 = 727267317;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -204053064:
                case 1025259474:
                    try {
                        jSONArray = new JSONArray(strM3407);
                        try {
                            int size = jSONArray.size();
                            int iM25625 = (C0630.m2566("᩸۬") + i11) * (-79);
                            interfaceC12344 = interfaceC12344;
                            i5 = ((iM25625 ^ i12) * 12975) ^ 1584721744;
                            jSONArray4 = jSONArray;
                            iM6981 = iM25625;
                            jSONObject3 = jSONObject3;
                            str15 = str15;
                            i4 = -573903562;
                            strM3407 = strM3407;
                            i21 = i21;
                            i25 = size;
                            str6 = str12;
                            String str20 = str13;
                            i22 = i22;
                            str7 = str20;
                        } catch (Exception unused12) {
                            string = str13;
                            str15 = str15;
                            i21 = i21;
                            i22 = i22;
                            str6 = str12;
                            str4 = str14;
                            i20 = i20;
                            jSONObject = jSONObject3;
                            strM3407 = strM3407;
                            int iM256115 = C0630.m2566("֫᩺") ^ i12;
                            jSONObject3 = jSONObject;
                            str14 = str4;
                            jSONArray4 = jSONArray;
                            i20 = i20;
                            str7 = string;
                            iM6981 = iM256115;
                            i5 = ((iM256115 ^ i11) * (-30817)) ^ 535976770;
                            i25 = i25;
                            i4 = -2048950696;
                        }
                    } catch (Exception unused13) {
                        jSONArray = null;
                    }
                    i14 = iM6981 ^ i4;
                    i25 = i25;
                    str10 = str7;
                    jSONArray3 = jSONArray4;
                    i22 = i22;
                    str8 = str6;
                    i21 = i21;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case -112574279:
                case 1695063056:
                    return;
                case 11145682:
                case 954559144:
                    i20++;
                    iM6981 = (i12 - C0630.m2566("᩸ۘ")) * 63;
                    i6 = ((iM6981 ^ i11) * (-22507)) ^ (-1523892272);
                    i4 = -416268474;
                    str14 = str14;
                    str7 = str13;
                    str6 = str12;
                    i5 = i6;
                    i14 = iM6981 ^ i4;
                    i25 = i25;
                    str10 = str7;
                    jSONArray3 = jSONArray4;
                    i22 = i22;
                    str8 = str6;
                    i21 = i21;
                    str13 = str10;
                    str12 = str8;
                    jSONArray4 = jSONArray3;
                    i13 = i5;
                    interfaceC12344 = interfaceC12344;
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case 45510717:
                case 919870233:
                    sArr2 = f57061;
                    i23 = 1;
                    if (C4263.f13799 > 0) {
                        int iM6986 = (i11 - C2105.m6981("ۙۢ")) * (-123);
                        i9 = ((iM6986 ^ i12) * 20815) ^ (-741296279);
                        interfaceC12344 = interfaceC12344;
                        i8 = i21;
                        str13 = str13;
                        str = str14;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        i2 = 1;
                        strM3407 = strM3407;
                        iM6982 = iM6986;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        i7 = i20;
                        i10 = -513508748;
                        int i29 = iM6982 ^ i10;
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        String str110 = str13;
                        i21 = i8;
                        i5 = i9;
                        jSONArray3 = jSONArray2;
                        i14 = i29;
                        str10 = str110;
                        str13 = str10;
                        str12 = str8;
                        jSONArray4 = jSONArray3;
                        i13 = i5;
                        interfaceC12344 = interfaceC12344;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        i23 = 1;
                        interfaceC12344 = interfaceC12344;
                        i8 = i21;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str13 = str13;
                        str = str14;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        i2 = 1;
                        strM3407 = strM3407;
                        i7 = i20;
                        int iM256116 = (C0630.m2566("ۗ۠") + i12) * (-55);
                        i13 = ((iM256116 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC12344 = interfaceC12344;
                        i14 = iM256116 ^ 1824859881;
                        str15 = str15;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 59894559:
                case 86547559:
                    i19 = 50445;
                    iM2567 = C0630.m2566("ܳ᩻") ^ i11;
                    i13 = ((iM2567 ^ i12) * (-1959)) ^ 985745377;
                    i3 = -1689422278;
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    strM3407 = strM3407;
                    i25 = i25;
                    str2 = str15;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case 185164566:
                case 1853058617:
                    if (RunnableC0588.f2309 >= 0) {
                        interfaceC12344 = interfaceC12344;
                        int iM25626 = C0630.m2566("᩺ܶ") ^ i11;
                        i13 = (-502216431) ^ ((iM25626 ^ i12) * 12751);
                        i14 = 58524904 ^ iM25626;
                        interfaceC12344 = interfaceC12344;
                    } else {
                        interfaceC12344 = interfaceC12344;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM3407 = strM3407;
                        i21 = i21;
                        i25 = i25;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        iM2567 = (C2105.m6981("۬᩶") + i12) * (-45);
                        i13 = ((iM2567 ^ i11) * 9339) ^ 1115817975;
                        str2 = str15;
                        i3 = 1576019466;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 210356861:
                case 332610450:
                    sArr = f57061;
                    c = 0;
                    if (C0050.f910 < 0) {
                        iM2567 = (i11 - C0630.m2566("ۨۗ")) * 21;
                        i13 = ((iM2567 ^ i12) * (-1489)) ^ (-743155396);
                        i3 = -1189332793;
                        interfaceC12344 = interfaceC12344;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM3407 = strM3407;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        interfaceC12344 = interfaceC12344;
                        jSONObject2 = jSONObject3;
                        str15 = str15;
                        iM2567 = (i12 - C2105.m6981("᩹᩸")) * (-101);
                        i13 = ((iM2567 ^ i11) * 2153) ^ (-651736357);
                        jSONObject3 = jSONObject2;
                        strM3407 = strM3407;
                        i21 = i21;
                        i25 = i25;
                        str12 = str12;
                        str13 = str13;
                        i2 = i22;
                        str2 = str15;
                        str = str14;
                        i3 = -1967932742;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 411427079:
                case 439631981:
                    s = sArr[c];
                    if (C4117.m12364() == 0) {
                        iM2567 = (C2105.m6981("ۙ᩵") + i12) * (-65);
                        i13 = ((iM2567 ^ i11) * (-22199)) ^ 1074479438;
                        i3 = -970366680;
                        interfaceC12344 = interfaceC12344;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM3407 = strM3407;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    } else {
                        interfaceC12344 = interfaceC12344;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        int iM256117 = (i11 - C0630.m2566("ᩴ۫")) * 123;
                        i13 = ((iM256117 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM256117 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 573974523:
                case 1813707321:
                    strM3407 = C0964.m3407(interfaceC12344, C1128.m3841(sArr3, i24, i21, i19), null);
                    if (strM3407 != null) {
                        int iM6987 = C2105.m6981("ܰ֡") ^ i11;
                        i13 = ((iM6987 ^ i12) * 3883) ^ (-860752970);
                        i14 = iM6987 ^ 1781366374;
                        str11 = null;
                    } else {
                        str11 = null;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM3407 = strM3407;
                        i21 = i21;
                        i25 = i25;
                        str13 = str13;
                        i22 = i22;
                        str14 = str14;
                        int iM256118 = C0630.m2566("ܳܺ") ^ i11;
                        i13 = ((iM256118 ^ i12) * (-14097)) ^ (-1665173257);
                        i14 = iM256118 ^ (-51149352);
                        str12 = str12;
                        i25 = i25;
                        str14 = str14;
                        i22 = i22;
                        strM3407 = strM3407;
                        interfaceC12344 = interfaceC12344;
                        jSONObject3 = jSONObject3;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                    }
                    break;
                case 1758630023:
                case 2046639675:
                    i19 = 5559;
                    iM2567 = C0630.m2566("ܳ᩻") ^ i11;
                    i13 = ((iM2567 ^ i12) * (-1959)) ^ 985745377;
                    i3 = -1689422278;
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    strM3407 = strM3407;
                    i25 = i25;
                    str2 = str15;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                case 2045649490:
                case 2059409057:
                    s2 = 11127;
                    if (C3911.m11924() > 0) {
                        iM2567 = (C2105.m6981("ۢۡ") ^ i11) * (-65);
                        i13 = ((iM2567 ^ i12) * (-8089)) ^ 1868771944;
                        i3 = -1515684019;
                        interfaceC12344 = interfaceC12344;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM3407 = strM3407;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM2567 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC12344 = interfaceC12344;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM3407 = strM3407;
                        jSONObject3 = jSONObject3;
                    }
                    interfaceC12344 = interfaceC12344;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    iM2567 = (C2105.m6981("۬᩶") + i12) * (-45);
                    i13 = ((iM2567 ^ i11) * 9339) ^ 1115817975;
                    str2 = str15;
                    i3 = 1576019466;
                    i14 = iM2567 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC12344 = interfaceC12344;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
                default:
                    interfaceC12344 = interfaceC12344;
                    jSONArray2 = jSONArray4;
                    str8 = str12;
                    str13 = str13;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM3407 = strM3407;
                    i7 = i20;
                    i2 = i22;
                    str = str14;
                    i8 = 5;
                    if (C2126.f7087) {
                        int iM256119 = (C0630.m2566("ۗ۠") + i12) * (-55);
                        i13 = ((iM256119 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC12344 = interfaceC12344;
                        i14 = iM256119 ^ 1824859881;
                    } else {
                        iM6982 = (i12 - C2105.m6981("᩶ۢ")) * 79;
                        i9 = 297034287 ^ ((iM6982 ^ i11) * 26625);
                        i10 = -1792168007;
                        int i210 = iM6982 ^ i10;
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        String str111 = str13;
                        i21 = i8;
                        i5 = i9;
                        jSONArray3 = jSONArray2;
                        i14 = i210;
                        str10 = str111;
                        str13 = str10;
                        str12 = str8;
                        jSONArray4 = jSONArray3;
                        i13 = i5;
                        interfaceC12344 = interfaceC12344;
                    }
                    str15 = str15;
                    strM3407 = strM3407;
                    jSONObject3 = jSONObject3;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16955 m42798(String str) {
        Object objM12820 = null;
        int i = -469232881;
        int i2 = C0483.f2088;
        int i3 = C22628.f73083;
        int iM6981 = (C2105.m6981("ۚۛ") + i2) * 55;
        int i4 = ((iM6981 ^ i3) * 29279) ^ 2096726654;
        int i5 = -1796099194;
        while (true) {
            i = ((((i ^ i3) * (-28113)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2115673176:
                case 1249941751:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C2105.m6981("ۙۨ") + i3) * (-37);
                        i4 = ((iM6981 ^ i2) * 28915) ^ (-990272850);
                        i5 = -1115098347;
                    } else {
                        iM6981 = (C2105.m6981("᩷ᩳ") ^ i2) * (-109);
                        i4 = ((iM6981 ^ i3) * 6615) ^ (-855931847);
                        i5 = 982636125;
                    }
                    break;
                case -2069435949:
                case 1851169261:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ܽۤ")) * 5;
                        i4 = ((iM6981 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17631)) ^ (-1926206805);
                        i5 = 1665518226;
                    }
                    break;
                case -1952931725:
                case -492090366:
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("᩹ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 525) ^ (-1741438777);
                        i5 = -1320758195;
                    } else {
                        iM6981 = (C0630.m2566("᩸ۗ") ^ i3) * 91;
                        i4 = ((iM6981 ^ i2) * (-4865)) ^ 1618296538;
                        i5 = 1205281338;
                    }
                    break;
                case -1946146758:
                case 1453735137:
                    RunnableC3474.m10630();
                    C0050.m940();
                    return null;
                case -1470798183:
                case 1306991020:
                    return null;
                case -1326451018:
                case -888091018:
                    if (C1916.m6313(str)) {
                        iM6981 = C2105.m6981("ۤܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25851)) ^ 2076647401;
                        i5 = -1648968522;
                    } else {
                        iM6981 = C2105.m6981("᩹۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5515) ^ 766728995;
                        i5 = -1934343687;
                    }
                    break;
                case -976961712:
                case 421070219:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("᩹ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 525) ^ (-1741438777);
                        i5 = -1320758195;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17631)) ^ (-1926206805);
                        i5 = 1665518226;
                    }
                    break;
                case -818311081:
                case 1861909582:
                    RunnableC0588.m2441();
                    iM6981 = C0630.m2566("ۨ᩸") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-17631)) ^ (-1926206805);
                    i5 = 1665518226;
                    break;
                case -802475010:
                case 715386168:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("۬ۧ") ^ i3) * (-83);
                        i4 = ((iM6981 ^ i2) * 13737) ^ 783245907;
                        i5 = 1721833091;
                    } else {
                        iM6981 = (C2105.m6981("ܿ᩺") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * (-23341)) ^ (-1455049201);
                        i5 = -63717528;
                    }
                    break;
                case -699019867:
                case -342110520:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("ۨ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17631)) ^ (-1926206805);
                        i5 = 1665518226;
                    } else {
                        iM6981 = C0630.m2566("᩺ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19375)) ^ 1597265430;
                        i5 = 1618841762;
                    }
                    break;
                case -689730019:
                case 1633866734:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ܽۤ")) * 5;
                        i4 = ((iM6981 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۡ᩶")) * (-71);
                        i4 = ((iM6981 ^ i3) * (-30601)) ^ (-628304000);
                        i5 = -500250630;
                    }
                    break;
                case -684734762:
                case 522305594:
                    return (C16955) objM12820;
                case -654001114:
                case 305682000:
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("۬ۧ") ^ i3) * (-83);
                        i4 = ((iM6981 ^ i2) * 13737) ^ 783245907;
                        i5 = 1721833091;
                    } else {
                        iM6981 = (C0630.m2566("ᩴᩳ") + i2) * (-53);
                        i4 = ((iM6981 ^ i3) * 12763) ^ (-1695547142);
                        i5 = 447364275;
                    }
                    break;
                case -59838907:
                case 1681335834:
                    if (str != null) {
                        iM6981 = C0630.m2566("ۙ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15119)) ^ (-1457765152);
                        i5 = 1875660405;
                    } else {
                        iM6981 = C2105.m6981("ۤܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25851)) ^ 2076647401;
                        i5 = -1648968522;
                    }
                    break;
                case -10786908:
                case 436820479:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C2105.m6981("᩷ᩳ") ^ i2) * (-109);
                        i4 = ((iM6981 ^ i3) * 6615) ^ (-855931847);
                        i5 = 982636125;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۖۜ")) * (-93);
                        i4 = ((iM6981 ^ i2) * (-15397)) ^ 1642526054;
                        i5 = 854389553;
                    }
                    break;
                case 30191931:
                case 1402219625:
                    objM12820 = C4263.m12820(f57060, str);
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ܽۤ")) * 5;
                        i4 = ((iM6981 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31915) ^ (-534203837);
                        i5 = -320383814;
                    }
                    break;
                case 333875996:
                case 1580796486:
                    if (C2272.m7503()) {
                        iM6981 = (C0630.m2566("۬ۧ") ^ i3) * (-83);
                        i4 = ((iM6981 ^ i2) * 13737) ^ 783245907;
                        i5 = 1721833091;
                    } else {
                        iM6981 = (C2105.m6981("ܺ֫") ^ i2) * (-19);
                        i4 = ((iM6981 ^ i3) * (-20513)) ^ 1455048049;
                        i5 = -1603102156;
                    }
                    break;
                case 1230120583:
                case 1436397030:
                    if (C2958.m9034() <= 0) {
                        iM6981 = (i2 - C0630.m2566("ܽۤ")) * 5;
                        i4 = ((iM6981 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM6981 = C0630.m2566("ۖۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7727)) ^ (-1659814003);
                        i5 = -1784474586;
                    }
                    break;
                default:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C2105.m6981("᩷ᩳ") ^ i2) * (-109);
                        i4 = ((iM6981 ^ i3) * 6615) ^ (-855931847);
                        i5 = 982636125;
                    } else {
                        iM6981 = C2105.m6981("᩹ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 525) ^ (-1741438777);
                        i5 = -1320758195;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42799() {
        /*
            Method dump skipped, instruction units count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18367.m42799():void");
    }
}
