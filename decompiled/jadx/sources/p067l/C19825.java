package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98C */
/* JADX INFO: loaded from: classes4.dex */
public final class C19825 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f60280;

    /* JADX INFO: renamed from: ۚۚۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f82307 = {351, -14981, -14979, -14983, -14996, -14978, -15006, -14979, -15002, -14978, -14999, 7335, -28199, -28195, -28216, -28198, -28218, -28199, -28222, -28198, -28193, -28211};

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m45072(String str, C18483 c18483) {
        try {
            if (c18483 == null) {
                if (f60280.remove(str) != null) {
                    m45071();
                }
            } else if (!ViewOnClickListenerC0939.m55949(c18483, C1028.m56246(f60280, str, c18483))) {
                m45071();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0664, code lost:
    
        if (p067l.RunnableC0938.f81886 >= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0445, code lost:
    
        if (p067l.C0877.f81843 >= 0) goto L84;
     */
    static {
        int iM55680;
        int i;
        int iM55681;
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
        int iM55979;
        String string2;
        int i6;
        int i7;
        JSONArray jSONArray2;
        String str8;
        int i8;
        String str9;
        JSONObject jSONObject2;
        int i9;
        int iM559710;
        int i10;
        JSONArray jSONArray3;
        String str10;
        InterfaceC14100 interfaceC14100 = null;
        String strM55734 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = RunnableC0871.f81839;
        int i12 = C1017.f81942;
        int iM559711 = C0946.m55979("᩸ۖ") ^ i11;
        int i13 = ((iM559711 ^ i12) * (-22741)) ^ 1528382854;
        int i14 = iM559711 ^ (-1976828061);
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
                    interfaceC14100 = interfaceC14100;
                    String str16 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
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
                                String string3 = jSONObject4.getString(C0912.m55822(f82307, 7, 1, i19));
                                try {
                                    str17 = string3;
                                    string = jSONObject4.getString(C0898.m55792(f82307, 8, 1, i19));
                                    try {
                                        i15 = jSONObject4.getInt(C1012.m56144(f82307, 9, 1, i19));
                                        boolean zContains = jSONObject4.contains(str15);
                                        int iM55682 = (C0873.m55680("ۘۖ") ^ i12) * 81;
                                        z = zContains;
                                        str14 = str4;
                                        jSONObject3 = jSONObject4;
                                        i25 = i25;
                                        i4 = -701731302;
                                        str7 = string;
                                        i5 = ((iM55682 ^ i11) * 30181) ^ 1300408700;
                                        str6 = str17;
                                        jSONArray4 = jSONArray;
                                        iM55979 = iM55682;
                                        i20 = i20;
                                    } catch (Exception unused) {
                                        jSONObject = jSONObject4;
                                        str6 = str17;
                                        int iM55683 = C0873.m55680("֫᩺") ^ i12;
                                        jSONObject3 = jSONObject;
                                        str14 = str4;
                                        jSONArray4 = jSONArray;
                                        i20 = i20;
                                        str7 = string;
                                        iM55979 = iM55683;
                                        i5 = ((iM55683 ^ i11) * (-30817)) ^ 535976770;
                                        i25 = i25;
                                        i4 = -2048950696;
                                    }
                                } catch (Exception unused2) {
                                    str17 = string3;
                                    string = str3;
                                    jSONObject = jSONObject4;
                                    str6 = str17;
                                    int iM55684 = C0873.m55680("֫᩺") ^ i12;
                                    jSONObject3 = jSONObject;
                                    str14 = str4;
                                    jSONArray4 = jSONArray;
                                    i20 = i20;
                                    str7 = string;
                                    iM55979 = iM55684;
                                    i5 = ((iM55684 ^ i11) * (-30817)) ^ 535976770;
                                    i25 = i25;
                                    i4 = -2048950696;
                                    i14 = iM55979 ^ i4;
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
                                    interfaceC14100 = interfaceC14100;
                                    str15 = str15;
                                    strM55734 = strM55734;
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
                        int iM55685 = C0873.m55680("֫᩺") ^ i12;
                        jSONObject3 = jSONObject;
                        str14 = str4;
                        jSONArray4 = jSONArray;
                        i20 = i20;
                        str7 = string;
                        iM55979 = iM55685;
                        i5 = ((iM55685 ^ i11) * (-30817)) ^ 535976770;
                        i25 = i25;
                        i4 = -2048950696;
                        i14 = iM55979 ^ i4;
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
                        interfaceC14100 = interfaceC14100;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                        break;
                    }
                    i14 = iM55979 ^ i4;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1972070816:
                case 2143182390:
                    C1012.m56134();
                    C0898.m55800();
                    throw new RuntimeException();
                case -1914666770:
                case 642987253:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i22 = i22;
                    str14 = str14;
                    if (!z) {
                        string2 = str11;
                        int iM55686 = C0873.m55680("ᩳ۟") ^ i12;
                        i6 = ((iM55686 ^ i11) * 18677) ^ 1047973482;
                        i4 = 2056988659;
                        str14 = string2;
                        iM55979 = iM55686;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                        i14 = iM55979 ^ i4;
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
                        interfaceC14100 = interfaceC14100;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        iM55979 = C0946.m55979("ۧ᩵") ^ i11;
                        i6 = ((iM55979 ^ i12) * 30541) ^ (-1279294660);
                        i4 = 1218173597;
                        str14 = str14;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                        i14 = iM55979 ^ i4;
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
                        interfaceC14100 = interfaceC14100;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -1737828291:
                case 2088983133:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    String str18 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    if (i16 - (i17 + i17) > 0) {
                        iM55681 = C0873.m55680("᩵ܿ") ^ i12;
                        i13 = ((iM55681 ^ i11) * (-32433)) ^ (-1193124451);
                        str2 = str18;
                        i3 = -1471739621;
                    } else {
                        iM55681 = C0946.m55979("۬ܶ") ^ i11;
                        i13 = ((iM55681 ^ i12) * (-11553)) ^ 199278473;
                        str2 = str18;
                        i3 = -1704277638;
                    }
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1702510405:
                case 2095619229:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    break;
                case -1679512862:
                case -1477038843:
                    i20 = 0;
                    iM55979 = (i12 - C0873.m55680("᩸ۘ")) * 63;
                    i6 = ((iM55979 ^ i11) * (-22507)) ^ (-1523892272);
                    i4 = -416268474;
                    str14 = str14;
                    str7 = str13;
                    str6 = str12;
                    i5 = i6;
                    i14 = iM55979 ^ i4;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1649093715:
                case 2089703120:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i22 = i22;
                    str14 = str14;
                    if (i20 >= i25) {
                        int iM55687 = C0873.m55680("ܳܺ") ^ i11;
                        i13 = ((iM55687 ^ i12) * (-14097)) ^ (-1665173257);
                        i14 = iM55687 ^ (-51149352);
                        str12 = str12;
                        i25 = i25;
                        str14 = str14;
                        i22 = i22;
                        strM55734 = strM55734;
                        interfaceC14100 = interfaceC14100;
                        jSONObject3 = jSONObject3;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                    } else {
                        iM55979 = (i11 - C0946.m55979("᩺֡")) * 99;
                        i6 = ((iM55979 ^ i12) * (-24881)) ^ (-1915222644);
                        i4 = -1570845101;
                        str14 = str14;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                        i14 = iM55979 ^ i4;
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
                        interfaceC14100 = interfaceC14100;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -1647676702:
                case 287740486:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    if (C1044.f81959 < 0) {
                        int iM55688 = (i11 - C0873.m55680("ᩴ۫")) * 123;
                        i13 = ((iM55688 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM55688 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                    } else {
                        iM55681 = C0946.m55979("ۧܳ") ^ i11;
                        i13 = (-1644981573) ^ ((iM55681 ^ i12) * (-28681));
                        i25 = i25;
                        str2 = str15;
                        i3 = 727267317;
                        i14 = iM55681 ^ i3;
                    }
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1579490603:
                case 79167547:
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    InterfaceC14100 interfaceC14101 = ApplicationC21448.f67649;
                    sArr3 = f82307;
                    i24 = 2;
                    if (!C0917.f81868) {
                        iM55680 = C0873.m55680("ܰۚ") ^ i12;
                        i13 = ((iM55680 ^ i11) * (-21743)) ^ 1326525623;
                        interfaceC14100 = interfaceC14101;
                        i25 = i25;
                        i = 175226949;
                        i14 = iM55680 ^ i;
                        str12 = str12;
                        i25 = i25;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        interfaceC14100 = interfaceC14101;
                        int iM55689 = (i11 - C0873.m55680("ᩴ۫")) * 123;
                        i13 = ((iM55689 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM55689 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -1492880465:
                case -1034359329:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    C0949.m56012();
                    C0892.m55749();
                    i25 = i25;
                    iM55681 = (C0946.m55979("۬᩶") + i12) * (-45);
                    i13 = ((iM55681 ^ i11) * 9339) ^ 1115817975;
                    str2 = str15;
                    i3 = 1576019466;
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1468713535:
                case -889167457:
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    RunnableC0871.m55672();
                    if (C0873.f81841 <= 0) {
                        i7 = i20;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        i8 = i21;
                        int iM556810 = (C0873.m55680("ۗ۠") + i12) * (-55);
                        i13 = ((iM556810 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC14100 = interfaceC14100;
                        i14 = iM556810 ^ 1824859881;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    i25 = i25;
                    iM55681 = (C0946.m55979("۬᩶") + i12) * (-45);
                    i13 = ((iM55681 ^ i11) * 9339) ^ 1115817975;
                    str2 = str15;
                    i3 = 1576019466;
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1423896203:
                case 853463842:
                    interfaceC14100 = interfaceC14100;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    try {
                        strM55734 = strM55734;
                        try {
                            boolean z2 = jSONObject3.getBoolean(C0894.m55773(f82307, 10, 1, i19));
                            jSONObject3 = jSONObject3;
                            try {
                                i21 = i21;
                                str3 = str13;
                                i22 = i22;
                                str4 = str14;
                                try {
                                    str9 = str12;
                                    try {
                                        C0898.m55805(f60280, str9, new C18483(str3, EnumC10104.values()[i15], str4, z2));
                                        int iM559712 = (C0946.m55979("ۜ֡") + i11) * 5;
                                        str14 = str4;
                                        str7 = str3;
                                        str6 = str9;
                                        i5 = ((iM559712 ^ i12) * (-1535)) ^ 540574452;
                                        iM55979 = iM559712;
                                        i25 = i25;
                                        i4 = 957688684;
                                    } catch (Exception unused6) {
                                        jSONArray = jSONArray4;
                                        str5 = str9;
                                        string = str3;
                                        str6 = str5;
                                        jSONObject = jSONObject3;
                                        int iM556811 = C0873.m55680("֫᩺") ^ i12;
                                        jSONObject3 = jSONObject;
                                        str14 = str4;
                                        jSONArray4 = jSONArray;
                                        i20 = i20;
                                        str7 = string;
                                        iM55979 = iM556811;
                                        i5 = ((iM556811 ^ i11) * (-30817)) ^ 535976770;
                                        i25 = i25;
                                        i4 = -2048950696;
                                    }
                                } catch (Exception unused7) {
                                    jSONArray = jSONArray4;
                                    str5 = str12;
                                    string = str3;
                                    str6 = str5;
                                    jSONObject = jSONObject3;
                                    int iM556812 = C0873.m55680("֫᩺") ^ i12;
                                    jSONObject3 = jSONObject;
                                    str14 = str4;
                                    jSONArray4 = jSONArray;
                                    i20 = i20;
                                    str7 = string;
                                    iM55979 = iM556812;
                                    i5 = ((iM556812 ^ i11) * (-30817)) ^ 535976770;
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
                            int iM556813 = C0873.m55680("֫᩺") ^ i12;
                            jSONObject3 = jSONObject;
                            str14 = str4;
                            jSONArray4 = jSONArray;
                            i20 = i20;
                            str7 = string;
                            iM55979 = iM556813;
                            i5 = ((iM556813 ^ i11) * (-30817)) ^ 535976770;
                            i25 = i25;
                            i4 = -2048950696;
                            i14 = iM55979 ^ i4;
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
                            interfaceC14100 = interfaceC14100;
                            str15 = str15;
                            strM55734 = strM55734;
                            jSONObject3 = jSONObject3;
                            break;
                        }
                    } catch (Exception unused10) {
                        strM55734 = strM55734;
                    }
                    i14 = iM55979 ^ i4;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -1369051870:
                case -1298000522:
                    interfaceC14100 = interfaceC14100;
                    jSONObject2 = jSONObject3;
                    str15 = str15;
                    break;
                case -1109805565:
                case 1116964669:
                    interfaceC14100 = interfaceC14100;
                    JSONObject jSONObject5 = jSONObject3;
                    str15 = str15;
                    int i27 = s + s2;
                    i16 = i27 * i27;
                    if (C1017.f81942 >= 0) {
                        jSONObject3 = jSONObject5;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        iM55681 = C0946.m55979("ۧܳ") ^ i11;
                        i13 = (-1644981573) ^ ((iM55681 ^ i12) * (-28681));
                        i25 = i25;
                        str2 = str15;
                        i3 = 727267317;
                    } else {
                        iM55681 = (i12 - C0873.m55680("ۧۜ")) * (-7);
                        i13 = ((iM55681 ^ i11) * (-19861)) ^ (-1321765116);
                        jSONObject3 = jSONObject5;
                        strM55734 = strM55734;
                        i21 = i21;
                        i25 = i25;
                        str12 = str12;
                        str13 = str13;
                        i2 = i22;
                        str2 = str15;
                        str = str14;
                        i3 = 347663485;
                    }
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -905976653:
                case 1653003134:
                    interfaceC14100 = interfaceC14100;
                    jSONObject2 = jSONObject3;
                    str15 = str15;
                    if (C0930.m55885() > 0) {
                        jSONObject3 = jSONObject2;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        int iM556814 = (i11 - C0873.m55680("ᩴ۫")) * 123;
                        i13 = ((iM556814 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM556814 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    jSONObject3 = jSONObject2;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str12 = str12;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    iM55680 = (C0946.m55979("ۧ֨") + i12) * 7;
                    i13 = ((iM55680 ^ i11) * 32567) ^ (-291315234);
                    i = 454108354;
                    i14 = iM55680 ^ i;
                    str12 = str12;
                    i25 = i25;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -782183076:
                case 157285295:
                    interfaceC14100 = interfaceC14100;
                    JSONObject jSONObject6 = jSONObject3;
                    str15 = str15;
                    try {
                        string2 = jSONObject6.getString(str15);
                        jSONObject3 = jSONObject6;
                        strM55734 = strM55734;
                        i21 = i21;
                        i25 = i25;
                        str12 = str12;
                        str13 = str13;
                        i22 = i22;
                        int iM556815 = C0873.m55680("ᩳ۟") ^ i12;
                        i6 = ((iM556815 ^ i11) * 18677) ^ 1047973482;
                        i4 = 2056988659;
                        str14 = string2;
                        iM55979 = iM556815;
                        str7 = str13;
                        str6 = str12;
                        i5 = i6;
                    } catch (Exception unused11) {
                        jSONObject3 = jSONObject6;
                        strM55734 = strM55734;
                        i21 = i21;
                        jSONArray = jSONArray4;
                        str5 = str12;
                        str3 = str13;
                        i22 = i22;
                        str4 = str14;
                        string = str3;
                        str6 = str5;
                        jSONObject = jSONObject3;
                        int iM556816 = C0873.m55680("֫᩺") ^ i12;
                        jSONObject3 = jSONObject;
                        str14 = str4;
                        jSONArray4 = jSONArray;
                        i20 = i20;
                        str7 = string;
                        iM55979 = iM556816;
                        i5 = ((iM556816 ^ i11) * (-30817)) ^ 535976770;
                        i25 = i25;
                        i4 = -2048950696;
                    }
                    i14 = iM55979 ^ i4;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -755414657:
                case 725172264:
                    interfaceC14100 = interfaceC14100;
                    if (C1404.f82149 >= 0) {
                        int iM556817 = C0873.m55680("֨ۖ") ^ i12;
                        i13 = ((iM556817 ^ i11) * 18511) ^ (-1787908982);
                        iM55680 = iM556817;
                        i = -1077226403;
                        i2 = i22;
                        str = str14;
                        i14 = iM55680 ^ i;
                        str12 = str12;
                        i25 = i25;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        int iM556818 = C0873.m55680("᩺ܶ") ^ i11;
                        i13 = (-502216431) ^ ((iM556818 ^ i12) * 12751);
                        i14 = 58524904 ^ iM556818;
                        interfaceC14100 = interfaceC14100;
                    }
                    break;
                case -666531575:
                case 1416017981:
                    f60280.clear();
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i22 = i22;
                    str14 = str14;
                    int iM556819 = C0873.m55680("ܳܺ") ^ i11;
                    i13 = ((iM556819 ^ i12) * (-14097)) ^ (-1665173257);
                    i14 = iM556819 ^ (-51149352);
                    str12 = str12;
                    i25 = i25;
                    str14 = str14;
                    i22 = i22;
                    strM55734 = strM55734;
                    interfaceC14100 = interfaceC14100;
                    jSONObject3 = jSONObject3;
                    str13 = str13;
                    i21 = i21;
                    str15 = str15;
                    break;
                case -504313388:
                case 157271238:
                    interfaceC14100 = interfaceC14100;
                    f60280 = new HashMap();
                    if (C1194.f82045 != 0) {
                        int iM556820 = (C0873.m55680("۫ۢ") + i11) * (-27);
                        i9 = 779281678 ^ ((iM556820 ^ i12) * 23811);
                        i8 = i21;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM55734 = strM55734;
                        i2 = i22;
                        iM559710 = iM556820;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str = str14;
                        i7 = i20;
                        i10 = 821022762;
                    } else {
                        int iM556821 = (C0873.m55680("ܽܽ") + i11) * (-119);
                        i9 = (-1206190647) ^ ((iM556821 ^ i12) * 28931);
                        i8 = i21;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM55734 = strM55734;
                        i2 = i22;
                        iM559710 = iM556821;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str = str14;
                        i7 = i20;
                        i10 = -894789486;
                    }
                    int i28 = iM559710 ^ i10;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -449771030:
                case -292800273:
                    interfaceC14100 = interfaceC14100;
                    String strM55592 = C0845.m55592(sArr2, i22, i23, i19);
                    if (C0949.f81897 < 0) {
                        iM55681 = C0873.m55680("ۗ֨") ^ i12;
                        i13 = (-866942562) ^ ((iM55681 ^ i11) * (-16169));
                        i21 = i21;
                        str12 = str12;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        strM55734 = strM55734;
                        i2 = i22;
                        i25 = i25;
                        str = str14;
                        str2 = strM55592;
                        i3 = -656010947;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        str15 = strM55592;
                        int iM5568110 = C0873.m55680("᩺ܶ") ^ i11;
                        i13 = (-502216431) ^ ((iM5568110 ^ i12) * 12751);
                        i14 = 58524904 ^ iM5568110;
                        interfaceC14100 = interfaceC14100;
                    }
                    break;
                case -265275326:
                case 1464754096:
                    interfaceC14100 = interfaceC14100;
                    i17 = (s * s) + 123810129;
                    if (C1194.m56396() > 0) {
                        iM55681 = C0946.m55979("᩹֡") ^ i12;
                        i13 = (-1197404467) ^ ((iM55681 ^ i11) * 12033);
                        i3 = 1238429247;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM55734 = strM55734;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        i8 = i21;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str13 = str13;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM55734 = strM55734;
                        i7 = i20;
                        i2 = i22;
                        str = str14;
                        int iM5568111 = (C0873.m55680("ۗ۠") + i12) * (-55);
                        i13 = ((iM5568111 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC14100 = interfaceC14100;
                        i14 = iM5568111 ^ 1824859881;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -222601100:
                case 1171651910:
                    interfaceC14100 = interfaceC14100;
                    C1012.m56134();
                    if (!C0917.m55854()) {
                        int iM559713 = (C0946.m55979("֫᩵") + i11) * (-45);
                        i13 = ((iM559713 ^ i12) * (-20575)) ^ (-140749201);
                        iM55680 = iM559713;
                        i = 1189458202;
                        i2 = i22;
                        str = str14;
                        i14 = iM55680 ^ i;
                        str12 = str12;
                        i25 = i25;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        iM55681 = C0946.m55979("ۧܳ") ^ i11;
                        i13 = (-1644981573) ^ ((iM55681 ^ i12) * (-28681));
                        i25 = i25;
                        str2 = str15;
                        i3 = 727267317;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case -204053064:
                case 1025259474:
                    try {
                        jSONArray = new JSONArray(strM55734);
                        try {
                            int size = jSONArray.size();
                            int iM556822 = (C0873.m55680("᩸۬") + i11) * (-79);
                            interfaceC14100 = interfaceC14100;
                            i5 = ((iM556822 ^ i12) * 12975) ^ 1584721744;
                            jSONArray4 = jSONArray;
                            iM55979 = iM556822;
                            jSONObject3 = jSONObject3;
                            str15 = str15;
                            i4 = -573903562;
                            strM55734 = strM55734;
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
                            strM55734 = strM55734;
                            int iM5568112 = C0873.m55680("֫᩺") ^ i12;
                            jSONObject3 = jSONObject;
                            str14 = str4;
                            jSONArray4 = jSONArray;
                            i20 = i20;
                            str7 = string;
                            iM55979 = iM5568112;
                            i5 = ((iM5568112 ^ i11) * (-30817)) ^ 535976770;
                            i25 = i25;
                            i4 = -2048950696;
                        }
                    } catch (Exception unused13) {
                        jSONArray = null;
                    }
                    i14 = iM55979 ^ i4;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case -112574279:
                case 1695063056:
                    return;
                case 11145682:
                case 954559144:
                    i20++;
                    iM55979 = (i12 - C0873.m55680("᩸ۘ")) * 63;
                    i6 = ((iM55979 ^ i11) * (-22507)) ^ (-1523892272);
                    i4 = -416268474;
                    str14 = str14;
                    str7 = str13;
                    str6 = str12;
                    i5 = i6;
                    i14 = iM55979 ^ i4;
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
                    interfaceC14100 = interfaceC14100;
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case 45510717:
                case 919870233:
                    sArr2 = f82307;
                    i23 = 1;
                    if (C1053.f81965 > 0) {
                        int iM559714 = (i11 - C0946.m55979("ۙۢ")) * (-123);
                        i9 = ((iM559714 ^ i12) * 20815) ^ (-741296279);
                        interfaceC14100 = interfaceC14100;
                        i8 = i21;
                        str13 = str13;
                        str = str14;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        i2 = 1;
                        strM55734 = strM55734;
                        iM559710 = iM559714;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        i7 = i20;
                        i10 = -513508748;
                        int i29 = iM559710 ^ i10;
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
                        interfaceC14100 = interfaceC14100;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        i23 = 1;
                        interfaceC14100 = interfaceC14100;
                        i8 = i21;
                        jSONArray2 = jSONArray4;
                        str8 = str12;
                        str13 = str13;
                        str = str14;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        i2 = 1;
                        strM55734 = strM55734;
                        i7 = i20;
                        int iM5568113 = (C0873.m55680("ۗ۠") + i12) * (-55);
                        i13 = ((iM5568113 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC14100 = interfaceC14100;
                        i14 = iM5568113 ^ 1824859881;
                        str15 = str15;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 59894559:
                case 86547559:
                    i19 = 50445;
                    iM55681 = C0873.m55680("ܳ᩻") ^ i11;
                    i13 = ((iM55681 ^ i12) * (-1959)) ^ 985745377;
                    i3 = -1689422278;
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    strM55734 = strM55734;
                    i25 = i25;
                    str2 = str15;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case 185164566:
                case 1853058617:
                    if (RunnableC0871.f81839 >= 0) {
                        interfaceC14100 = interfaceC14100;
                        int iM5568114 = C0873.m55680("᩺ܶ") ^ i11;
                        i13 = (-502216431) ^ ((iM5568114 ^ i12) * 12751);
                        i14 = 58524904 ^ iM5568114;
                        interfaceC14100 = interfaceC14100;
                    } else {
                        interfaceC14100 = interfaceC14100;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM55734 = strM55734;
                        i21 = i21;
                        i25 = i25;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        iM55681 = (C0946.m55979("۬᩶") + i12) * (-45);
                        i13 = ((iM55681 ^ i11) * 9339) ^ 1115817975;
                        str2 = str15;
                        i3 = 1576019466;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 210356861:
                case 332610450:
                    sArr = f82307;
                    c = 0;
                    if (C0845.f81821 < 0) {
                        iM55681 = (i11 - C0873.m55680("ۨۗ")) * 21;
                        i13 = ((iM55681 ^ i12) * (-1489)) ^ (-743155396);
                        i3 = -1189332793;
                        interfaceC14100 = interfaceC14100;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM55734 = strM55734;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        interfaceC14100 = interfaceC14100;
                        jSONObject2 = jSONObject3;
                        str15 = str15;
                        iM55681 = (i12 - C0946.m55979("᩹᩸")) * (-101);
                        i13 = ((iM55681 ^ i11) * 2153) ^ (-651736357);
                        jSONObject3 = jSONObject2;
                        strM55734 = strM55734;
                        i21 = i21;
                        i25 = i25;
                        str12 = str12;
                        str13 = str13;
                        i2 = i22;
                        str2 = str15;
                        str = str14;
                        i3 = -1967932742;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 411427079:
                case 439631981:
                    s = sArr[c];
                    if (C1046.m56302() == 0) {
                        iM55681 = (C0946.m55979("ۙ᩵") + i12) * (-65);
                        i13 = ((iM55681 ^ i11) * (-22199)) ^ 1074479438;
                        i3 = -970366680;
                        interfaceC14100 = interfaceC14100;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM55734 = strM55734;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    } else {
                        interfaceC14100 = interfaceC14100;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        int iM5568115 = (i11 - C0873.m55680("ᩴ۫")) * 123;
                        i13 = ((iM5568115 ^ i12) * 14003) ^ 1575178897;
                        i14 = iM5568115 ^ 679464215;
                        i25 = i25;
                        str2 = str15;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    break;
                case 573974523:
                case 1813707321:
                    strM55734 = C0890.m55734(interfaceC14100, C0898.m55792(sArr3, i24, i21, i19), null);
                    if (strM55734 != null) {
                        int iM559715 = C0946.m55979("ܰ֡") ^ i11;
                        i13 = ((iM559715 ^ i12) * 3883) ^ (-860752970);
                        i14 = iM559715 ^ 1781366374;
                        str11 = null;
                    } else {
                        str11 = null;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        str15 = str15;
                        strM55734 = strM55734;
                        i21 = i21;
                        i25 = i25;
                        str13 = str13;
                        i22 = i22;
                        str14 = str14;
                        int iM5568116 = C0873.m55680("ܳܺ") ^ i11;
                        i13 = ((iM5568116 ^ i12) * (-14097)) ^ (-1665173257);
                        i14 = iM5568116 ^ (-51149352);
                        str12 = str12;
                        i25 = i25;
                        str14 = str14;
                        i22 = i22;
                        strM55734 = strM55734;
                        interfaceC14100 = interfaceC14100;
                        jSONObject3 = jSONObject3;
                        str13 = str13;
                        i21 = i21;
                        str15 = str15;
                    }
                    break;
                case 1758630023:
                case 2046639675:
                    i19 = 5559;
                    iM55681 = C0873.m55680("ܳ᩻") ^ i11;
                    i13 = ((iM55681 ^ i12) * (-1959)) ^ 985745377;
                    i3 = -1689422278;
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    strM55734 = strM55734;
                    i25 = i25;
                    str2 = str15;
                    i21 = i21;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                case 2045649490:
                case 2059409057:
                    s2 = 11127;
                    if (C1036.m56257() > 0) {
                        iM55681 = (C0946.m55979("ۢۡ") ^ i11) * (-65);
                        i13 = ((iM55681 ^ i12) * (-8089)) ^ 1868771944;
                        i3 = -1515684019;
                        interfaceC14100 = interfaceC14100;
                        str12 = str12;
                        jSONObject3 = jSONObject3;
                        strM55734 = strM55734;
                        i25 = i25;
                        str2 = str15;
                        i21 = i21;
                        str13 = str13;
                        i2 = i22;
                        str = str14;
                        i14 = iM55681 ^ i3;
                        str12 = str12;
                        str14 = str;
                        i22 = i2;
                        interfaceC14100 = interfaceC14100;
                        str13 = str13;
                        i21 = i21;
                        str15 = str2;
                        i25 = i25;
                        strM55734 = strM55734;
                        jSONObject3 = jSONObject3;
                    }
                    interfaceC14100 = interfaceC14100;
                    str12 = str12;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i21 = i21;
                    i25 = i25;
                    str13 = str13;
                    i2 = i22;
                    str = str14;
                    iM55681 = (C0946.m55979("۬᩶") + i12) * (-45);
                    i13 = ((iM55681 ^ i11) * 9339) ^ 1115817975;
                    str2 = str15;
                    i3 = 1576019466;
                    i14 = iM55681 ^ i3;
                    str12 = str12;
                    str14 = str;
                    i22 = i2;
                    interfaceC14100 = interfaceC14100;
                    str13 = str13;
                    i21 = i21;
                    str15 = str2;
                    i25 = i25;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
                default:
                    interfaceC14100 = interfaceC14100;
                    jSONArray2 = jSONArray4;
                    str8 = str12;
                    str13 = str13;
                    jSONObject3 = jSONObject3;
                    str15 = str15;
                    strM55734 = strM55734;
                    i7 = i20;
                    i2 = i22;
                    str = str14;
                    i8 = 5;
                    if (C0947.f81895) {
                        int iM5568117 = (C0873.m55680("ۗ۠") + i12) * (-55);
                        i13 = ((iM5568117 ^ i11) * 16853) ^ (-3435568);
                        str14 = str;
                        i20 = i7;
                        i22 = i2;
                        str13 = str13;
                        str12 = str8;
                        i21 = i8;
                        jSONArray4 = jSONArray2;
                        interfaceC14100 = interfaceC14100;
                        i14 = iM5568117 ^ 1824859881;
                    } else {
                        iM559710 = (i12 - C0946.m55979("᩶ۢ")) * 79;
                        i9 = 297034287 ^ ((iM559710 ^ i11) * 26625);
                        i10 = -1792168007;
                        int i210 = iM559710 ^ i10;
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
                        interfaceC14100 = interfaceC14100;
                    }
                    str15 = str15;
                    strM55734 = strM55734;
                    jSONObject3 = jSONObject3;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18483 m45070(String str) {
        Object objM56328 = null;
        int i = -469232881;
        int i2 = C0866.f81837;
        int i3 = C1964.f83032;
        int iM55979 = (C0946.m55979("ۚۛ") + i2) * 55;
        int i4 = ((iM55979 ^ i3) * 29279) ^ 2096726654;
        int i5 = -1796099194;
        while (true) {
            i = ((((i ^ i3) * (-28113)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2115673176:
                case 1249941751:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("ۙۨ") + i3) * (-37);
                        i4 = ((iM55979 ^ i2) * 28915) ^ (-990272850);
                        i5 = -1115098347;
                    } else {
                        iM55979 = (C0946.m55979("᩷ᩳ") ^ i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 6615) ^ (-855931847);
                        i5 = 982636125;
                    }
                    break;
                case -2069435949:
                case 1851169261:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (i2 - C0873.m55680("ܽۤ")) * 5;
                        i4 = ((iM55979 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM55979 = C0873.m55680("ۨ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17631)) ^ (-1926206805);
                        i5 = 1665518226;
                    }
                    break;
                case -1952931725:
                case -492090366:
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("᩹ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 525) ^ (-1741438777);
                        i5 = -1320758195;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۗ") ^ i3) * 91;
                        i4 = ((iM55979 ^ i2) * (-4865)) ^ 1618296538;
                        i5 = 1205281338;
                    }
                    break;
                case -1946146758:
                case 1453735137:
                    RunnableC1014.m56177();
                    C0845.m55584();
                    return null;
                case -1470798183:
                case 1306991020:
                    return null;
                case -1326451018:
                case -888091018:
                    if (C0937.m55923(str)) {
                        iM55979 = C0946.m55979("ۤܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25851)) ^ 2076647401;
                        i5 = -1648968522;
                    } else {
                        iM55979 = C0946.m55979("᩹۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 5515) ^ 766728995;
                        i5 = -1934343687;
                    }
                    break;
                case -976961712:
                case 421070219:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("᩹ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 525) ^ (-1741438777);
                        i5 = -1320758195;
                    } else {
                        iM55979 = C0873.m55680("ۨ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17631)) ^ (-1926206805);
                        i5 = 1665518226;
                    }
                    break;
                case -818311081:
                case 1861909582:
                    RunnableC0871.m55672();
                    iM55979 = C0873.m55680("ۨ᩸") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-17631)) ^ (-1926206805);
                    i5 = 1665518226;
                    break;
                case -802475010:
                case 715386168:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("۬ۧ") ^ i3) * (-83);
                        i4 = ((iM55979 ^ i2) * 13737) ^ 783245907;
                        i5 = 1721833091;
                    } else {
                        iM55979 = (C0946.m55979("ܿ᩺") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * (-23341)) ^ (-1455049201);
                        i5 = -63717528;
                    }
                    break;
                case -699019867:
                case -342110520:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ۨ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17631)) ^ (-1926206805);
                        i5 = 1665518226;
                    } else {
                        iM55979 = C0873.m55680("᩺ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19375)) ^ 1597265430;
                        i5 = 1618841762;
                    }
                    break;
                case -689730019:
                case 1633866734:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (i2 - C0873.m55680("ܽۤ")) * 5;
                        i4 = ((iM55979 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۡ᩶")) * (-71);
                        i4 = ((iM55979 ^ i3) * (-30601)) ^ (-628304000);
                        i5 = -500250630;
                    }
                    break;
                case -684734762:
                case 522305594:
                    return (C18483) objM56328;
                case -654001114:
                case 305682000:
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("۬ۧ") ^ i3) * (-83);
                        i4 = ((iM55979 ^ i2) * 13737) ^ 783245907;
                        i5 = 1721833091;
                    } else {
                        iM55979 = (C0873.m55680("ᩴᩳ") + i2) * (-53);
                        i4 = ((iM55979 ^ i3) * 12763) ^ (-1695547142);
                        i5 = 447364275;
                    }
                    break;
                case -59838907:
                case 1681335834:
                    if (str != null) {
                        iM55979 = C0873.m55680("ۙ᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15119)) ^ (-1457765152);
                        i5 = 1875660405;
                    } else {
                        iM55979 = C0946.m55979("ۤܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25851)) ^ 2076647401;
                        i5 = -1648968522;
                    }
                    break;
                case -10786908:
                case 436820479:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("᩷ᩳ") ^ i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 6615) ^ (-855931847);
                        i5 = 982636125;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۖۜ")) * (-93);
                        i4 = ((iM55979 ^ i2) * (-15397)) ^ 1642526054;
                        i5 = 854389553;
                    }
                    break;
                case 30191931:
                case 1402219625:
                    objM56328 = C1053.m56328(f60280, str);
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ܽۤ")) * 5;
                        i4 = ((iM55979 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM55979 = C0946.m55979("ۗ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31915) ^ (-534203837);
                        i5 = -320383814;
                    }
                    break;
                case 333875996:
                case 1580796486:
                    if (C0955.m56025()) {
                        iM55979 = (C0873.m55680("۬ۧ") ^ i3) * (-83);
                        i4 = ((iM55979 ^ i2) * 13737) ^ 783245907;
                        i5 = 1721833091;
                    } else {
                        iM55979 = (C0946.m55979("ܺ֫") ^ i2) * (-19);
                        i4 = ((iM55979 ^ i3) * (-20513)) ^ 1455048049;
                        i5 = -1603102156;
                    }
                    break;
                case 1230120583:
                case 1436397030:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (i2 - C0873.m55680("ܽۤ")) * 5;
                        i4 = ((iM55979 ^ i3) * 23313) ^ (-657402586);
                        i5 = -1802126853;
                    } else {
                        iM55979 = C0873.m55680("ۖۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7727)) ^ (-1659814003);
                        i5 = -1784474586;
                    }
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0946.m55979("᩷ᩳ") ^ i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 6615) ^ (-855931847);
                        i5 = 982636125;
                    } else {
                        iM55979 = C0946.m55979("᩹ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 525) ^ (-1741438777);
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
    /* JADX INFO: renamed from: ֫ */
    public static void m45071() {
        /*
            Method dump skipped, instruction units count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C19825.m45071():void");
    }
}
