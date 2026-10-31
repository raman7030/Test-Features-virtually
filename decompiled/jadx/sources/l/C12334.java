package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P418 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12334 {

    /* JADX INFO: renamed from: ۗܰᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f36935 = {8446, -180, -248, -253, -236, -253, 6746, 15901, 2406, 15862, 15797, 15796, 15788, 15802, 15785, 15797, 15862, 15806, 15797, 15800, 15796, 15807, 15794, 15797, 15804, 15790, 15791, 15805, 15862, 15843, 15862, 15784, 15796, 15790, 15785, 15800, 15806, 15850, 15861, 15843, 15862, 15791, 15802, 15785, 15804, 15806, 15791, 15862, 15801, 15796, 15796, 15791, 15800, 15799, 15802, 15784, 15784, 15787, 15802, 15791, 15795, 15793, 15802, 15789, 15802, 15800, 15860, 15801, 15796, 15796, 15791, 15860, 15800, 15799, 15802, 15784, 15784, 15806, 15784, 15861, 15793, 15802, 15785, 15862, 15806, 15779, 15791, 15807, 15794, 15785, 15784, 15793, 15802, 15789, 15802, 15800, 15860, 15806, 15779, 15791, 15862, 15807, 15862, 15800, 15787, 15861, 15793, 15802, 15785, 15758, 15759, 15773, 15862, 15843, 15860, 8262, -15843, -15850, -15871, -15850, -15852, -15784, -15871, -15854, -15867, -15868, -15842, -15848, -15847, -15843, -15850, -15871, -15850, -15852, -15784, -15851, -15848, -15848, -15869, -15843, -15850, -15871, -15850, -15852, -15784, -15854, -15857, -15869, -15852, -15845, -15850, -15868, -15868, -15854, -15868, -15783, -15843, -15850, -15867, -15852, -15845, -15850, -15868, -15868, -15854, -15868, -15783, -15853, -15854, -15857, -15784, -15850, -15868, -15868, -15854, -15869, -15868, -15784, -15850, -15847, -15853, -15867, -15848, -15842, -15853, -15832, -15853, -15854, -15857, -15784, -15850, -15868, -15868, -15854, -15869, -15868, -15784, -15852, -15848, -15846, -15865, -15842, -15845, -15854, -15832, -15853, -15854, -15857};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29941(C18911 c18911) throws IOException {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int iM2566;
        int i4;
        int i5;
        int i6;
        int i7;
        File file;
        int iM6983;
        int i8;
        int i9;
        int iM6984;
        int i10;
        int i11 = C1047.f3863;
        int i12 = C0714.f2697;
        int iM2567 = C0630.m2566("ۤ᩸") ^ i11;
        int i13 = ((iM2567 ^ i12) * (-15917)) ^ 524413714;
        String strM948 = null;
        File file2 = null;
        FileInputStream fileInputStream = null;
        File file3 = null;
        byte[] bArrM21646 = null;
        short[] sArr = null;
        int i14 = iM2567 ^ 1798506387;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z = false;
        boolean z2 = false;
        short s = 0;
        int i28 = 0;
        boolean z3 = false;
        int i29 = 0;
        int i30 = -944731281;
        File file4 = null;
        File file5 = null;
        File file6 = null;
        File file7 = null;
        File file8 = null;
        while (true) {
            i30 = i14 ^ (i13 & (((i30 ^ i12) * (-25691)) >> 31));
            switch (i30) {
                case -2131241803:
                case -813978449:
                    bArrM21646 = bArrM21646;
                    File file9 = file5;
                    File file10 = file6;
                    file3 = file3;
                    C15843.m37503(file4);
                    file4.mkdirs();
                    File file11 = file4;
                    File file12 = new File(file11, strM948);
                    sArr = f36935;
                    if (C3911.f12484 >= 0) {
                        file2 = file12;
                        file4 = file11;
                        file7 = file7;
                        strM948 = strM948;
                        i18 = 170;
                        int iM6985 = (C2105.m6981("۬ۛ") + i11) * 55;
                        i14 = iM6985 ^ (-436135232);
                        i13 = ((iM6985 ^ i12) * 9613) ^ 1436380294;
                        file3 = file3;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file5 = null;
                        file6 = null;
                        file2 = file2;
                    } else {
                        int iM6986 = (i12 - C2105.m6981("֨ۚ")) * (-119);
                        file4 = file11;
                        file6 = file10;
                        file3 = file3;
                        bArrM21646 = bArrM21646;
                        file2 = file12;
                        i13 = ((iM6986 ^ i11) * 537) ^ (-1328968428);
                        file5 = file9;
                        i18 = 170;
                        i14 = iM6986 ^ 415410516;
                    }
                    break;
                case -2097568088:
                case 89218399:
                    if (!C1005.m3501()) {
                        file5 = file5;
                        iM6981 = C0630.m2566("ۤۜ") ^ i12;
                        i = ((iM6981 ^ i11) * 3651) ^ (-236878406);
                        i2 = 134764952;
                        int i31 = iM6981 ^ i2;
                        file5 = file5;
                        i14 = i31;
                        i13 = i;
                    }
                    iM6982 = (i12 - C0630.m2566("ۚ֡")) * (-9);
                    i = ((iM6982 ^ i11) * 26969) ^ (-155116078);
                    i3 = 1817016927;
                    i14 = iM6982 ^ i3;
                    i13 = i;
                    break;
                case -2050917839:
                case -154386492:
                    file5 = file5;
                    fileInputStream = new FileInputStream(file8);
                    i21 = fileInputStream.read() | (fileInputStream.read() << 8);
                    i22 = fileInputStream.read();
                    if (C3019.f9544 < 0) {
                        iM6981 = C0630.m2566("᩻ۜ") ^ i12;
                        i = ((iM6981 ^ i11) * 24893) ^ 1297094368;
                        i2 = -741282943;
                        int i32 = iM6981 ^ i2;
                        file5 = file5;
                        i14 = i32;
                        i13 = i;
                    } else {
                        bArrM21646 = bArrM21646;
                        iM2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((iM2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = iM2566 ^ i5;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    }
                    break;
                case -2042126339:
                case -1813729693:
                    C3245.m9925();
                    if (!C4159.f13567) {
                        file5 = file5;
                        bArrM21646 = bArrM21646;
                        iM2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((iM2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = iM2566 ^ i5;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    } else {
                        iM6982 = C2105.m6981("ۚۜ") ^ i11;
                        i = ((iM6982 ^ i12) * (-29945)) ^ (-934512494);
                        i3 = -442880340;
                        i14 = iM6982 ^ i3;
                        i13 = i;
                    }
                    break;
                case -2000142572:
                case 830177392:
                    break;
                case -1932485393:
                case 754274540:
                    file7 = file7;
                    strM948 = strM948;
                    file5 = file5;
                    file2 = file2;
                    file3 = file3;
                    bArrM21646 = bArrM21646;
                    if ((i28 * i28) - ((s * 2) + 1) >= 0) {
                        iM2566 = (C2105.m6981("ܿۛ") + i12) * 91;
                        i4 = ((iM2566 ^ i11) * 22695) ^ (-1037339894);
                        i5 = -1736060229;
                    } else {
                        iM2566 = C0630.m2566("ܿۨ") ^ i12;
                        i4 = ((iM2566 ^ i11) * 20411) ^ (-1832483433);
                        i5 = 1879657980;
                    }
                    i6 = iM2566 ^ i5;
                    bArrM21646 = bArrM21646;
                    file7 = file7;
                    strM948 = strM948;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case -1785100132:
                case 1570556509:
                    file5 = file5;
                    i23 = i21 | (i22 << 16);
                    i24 = fileInputStream.read() << 24;
                    if (!C2272.f7362) {
                        iM6981 = (C0630.m2566("᩷᩺") + i11) * (-117);
                        i = ((iM6981 ^ i12) * (-24199)) ^ 485511513;
                        i2 = 1442544806;
                        int i33 = iM6981 ^ i2;
                        file5 = file5;
                        i14 = i33;
                        i13 = i;
                    } else {
                        bArrM21646 = bArrM21646;
                        int iM2568 = (C0630.m2566("ۡ֫") ^ i11) * (-79);
                        i4 = ((iM2568 ^ i12) * 29651) ^ 12352324;
                        i6 = iM2568 ^ (-1620579383);
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        file4 = null;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    }
                    break;
                case -1426714029:
                case 1068607745:
                    i20 = -1;
                    i29 = -1;
                    iM6984 = C2105.m6981("ۙۛ") ^ i12;
                    i4 = ((iM6984 ^ i11) * 18401) ^ 1119599649;
                    i10 = 1572033132;
                    i6 = iM6984 ^ i10;
                    file6 = file6;
                    bArrM21646 = bArrM21646;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case -1422497450:
                case -409727114:
                    C1294.m4372();
                    file5 = file5;
                    iM6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                    i = ((iM6981 ^ i12) * 441) ^ 404756723;
                    i2 = -1847363215;
                    int i34 = iM6981 ^ i2;
                    file5 = file5;
                    i14 = i34;
                    i13 = i;
                    break;
                case -1187615581:
                case 234330228:
                    FileOutputStream fileOutputStream = new FileOutputStream(file8);
                    fileOutputStream.write(i16);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i19);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    C3019.m9251(fileOutputStream);
                    iM6982 = C2105.m6981("ۚ᩸") ^ i12;
                    i = ((iM6982 ^ i11) * (-10573)) ^ (-1412715846);
                    i3 = 109562839;
                    i14 = iM6982 ^ i3;
                    i13 = i;
                    break;
                case -1165655138:
                case -398957944:
                    int i35 = i29;
                    file5 = file5;
                    file2 = file2;
                    file3 = file3;
                    bArrM21646 = bArrM21646;
                    file6 = file6;
                    if (!C0798.m3003(file7)) {
                        i29 = i35;
                        file6 = file6;
                        strM948 = strM948;
                        int iM2569 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                        i4 = ((iM2569 ^ i11) * (-29343)) ^ (-617877859);
                        i6 = iM2569 ^ (-1191569899);
                        bArrM21646 = bArrM21646;
                        strM948 = strM948;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    } else {
                        int iM25610 = C0630.m2566("ۨܿ") ^ i11;
                        i29 = i35;
                        i13 = ((iM25610 ^ i12) * (-19747)) ^ 1052292627;
                        i7 = iM25610 ^ (-1891220599);
                        file6 = file6;
                        bArrM21646 = bArrM21646;
                        file2 = file2;
                        file = file5;
                        i14 = i7;
                        file3 = file3;
                        file5 = file;
                    }
                    break;
                case -1051908969:
                case 1253639449:
                    file2 = file2;
                    C15843.m37500(file2, C8172.m21646(C0422.m1955(sArr, i18, 19, i15)));
                    if (C0964.f3626 == 0) {
                        C3310 c3310M10118 = C3310.m10118(new FileInputStream(file2));
                        c3310M10118.m10121(new C4573(c18911));
                        c3310M10118.m10123();
                        file6 = file6;
                        c3310M10118.m10120(new FileOutputStream(file6));
                        file2.delete();
                        z = true;
                        iM6984 = C2105.m6981("ᩳۚ") ^ i12;
                        file4 = file4;
                        i4 = ((iM6984 ^ i11) * 17487) ^ 170153567;
                        i10 = 1563612932;
                        i6 = iM6984 ^ i10;
                        file6 = file6;
                        bArrM21646 = bArrM21646;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    } else {
                        file3 = file3;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        int iM6987 = (C2105.m6981("۬ۛ") + i11) * 55;
                        i14 = iM6987 ^ (-436135232);
                        i13 = ((iM6987 ^ i12) * 9613) ^ 1436380294;
                        file3 = file3;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file5 = null;
                        file6 = null;
                        file2 = file2;
                    }
                    break;
                case -1040851674:
                case 807105877:
                    C15843.m37503(file5);
                    file5.mkdirs();
                    File file13 = file5;
                    file3 = new File(file13, strM948);
                    file5 = file13;
                    bArrM21646 = C8172.m21646(C3432.m10488(f36935, 189, 19, i15));
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = C0630.m2566("ۤۜ") ^ i12;
                        i = ((iM6981 ^ i11) * 3651) ^ (-236878406);
                        i2 = 134764952;
                    } else {
                        iM6981 = (C0630.m2566("ۡ֨") + i12) * (-75);
                        i = ((iM6981 ^ i11) * (-9819)) ^ 1819027049;
                        i2 = 2028907429;
                    }
                    int i36 = iM6981 ^ i2;
                    file5 = file5;
                    i14 = i36;
                    i13 = i;
                    break;
                case -925569702:
                case 603440404:
                    C4263.m12819();
                    if (AbstractC2021.f6743 > 0) {
                        file5 = file5;
                        bArrM21646 = bArrM21646;
                        iM2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((iM2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = iM2566 ^ i5;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    } else {
                        file5 = file5;
                        iM6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                        i = ((iM6981 ^ i12) * 441) ^ 404756723;
                        i2 = -1847363215;
                        int i37 = iM6981 ^ i2;
                        file5 = file5;
                        i14 = i37;
                        i13 = i;
                    }
                    break;
                case -746653730:
                case 239177660:
                    file5 = file5;
                    i19 = 18;
                    if (18 != i20) {
                        iM6981 = (C2105.m6981("ۡ᩷") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i11) * (-16967)) ^ 312272119;
                        i2 = -2082600213;
                    } else {
                        z2 = z;
                        iM6981 = C0630.m2566("ۙۚ") ^ i11;
                        i = ((iM6981 ^ i12) * (-7947)) ^ 984496106;
                        i2 = -1322682569;
                    }
                    int i38 = iM6981 ^ i2;
                    file5 = file5;
                    i14 = i38;
                    i13 = i;
                    break;
                case -738421933:
                case -634370332:
                    file5 = file5;
                    file2 = file2;
                    file3 = file3;
                    byte[] bArr = bArrM21646;
                    File file14 = file6;
                    strM948 = C0050.m948(f36935, 159, 11, i15);
                    z3 = true;
                    i17 = 0;
                    int i39 = i29;
                    if (4 != i39) {
                        iM6983 = C0630.m2566("ۜ֨") ^ i11;
                        i8 = ((iM6983 ^ i12) * (-30275)) ^ 1022618178;
                        i9 = 1107522442;
                    } else {
                        iM6983 = (C2105.m6981("ܳᩴ") + i12) * 119;
                        i8 = ((iM6983 ^ i11) * 355) ^ 917558835;
                        i9 = 151751689;
                    }
                    i7 = iM6983 ^ i9;
                    i29 = i39;
                    file6 = file14;
                    i13 = i8;
                    bArrM21646 = bArr;
                    i16 = 4;
                    file2 = file2;
                    file = file5;
                    i14 = i7;
                    file3 = file3;
                    file5 = file;
                    break;
                case -596607918:
                case 970066269:
                    file5 = file5;
                    if (file8.length() != 8) {
                        file3 = file3;
                        strM948 = strM948;
                        file2 = file2;
                        bArrM21646 = bArrM21646;
                        int iM25611 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                        i4 = ((iM25611 ^ i11) * (-29343)) ^ (-617877859);
                        i6 = iM25611 ^ (-1191569899);
                        bArrM21646 = bArrM21646;
                        strM948 = strM948;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    } else {
                        iM6981 = (C2105.m6981("ۤۨ") ^ i11) * 119;
                        i = ((iM6981 ^ i12) * 26917) ^ (-134838981);
                        i2 = 1189885722;
                        int i310 = iM6981 ^ i2;
                        file5 = file5;
                        i14 = i310;
                        i13 = i;
                    }
                    break;
                case -431230226:
                case 440120796:
                    file7 = file7;
                    strM948 = strM948;
                    file5 = file5;
                    file2 = file2;
                    file3 = file3;
                    bArrM21646 = bArrM21646;
                    s = f36935[115];
                    i28 = s + 1;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((iM2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                    } else {
                        iM2566 = C0630.m2566("ܺۖ") ^ i11;
                        i4 = ((iM2566 ^ i12) * (-30603)) ^ (-1683253813);
                        i5 = 27819866;
                    }
                    i6 = iM2566 ^ i5;
                    bArrM21646 = bArrM21646;
                    file7 = file7;
                    strM948 = strM948;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case -380873538:
                case 1730603992:
                    i20 = i26 | (i27 << 16) | (fileInputStream.read() << 24);
                    i29 = i25;
                    iM6984 = C2105.m6981("ۙۛ") ^ i12;
                    i4 = ((iM6984 ^ i11) * 18401) ^ 1119599649;
                    i10 = 1572033132;
                    i6 = iM6984 ^ i10;
                    file6 = file6;
                    bArrM21646 = bArrM21646;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case -323655105:
                case 1874253298:
                    file5 = file5;
                    file2 = file2;
                    file3 = file3;
                    bArrM21646 = bArrM21646;
                    file7 = file7;
                    file8 = new File(C4925.m14322(), C3019.m9250(f36935, 116, 13, i15));
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        int iM25612 = (C0630.m2566("ۡ֫") ^ i11) * (-79);
                        i4 = ((iM25612 ^ i12) * 29651) ^ 12352324;
                        i6 = iM25612 ^ (-1620579383);
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        file4 = null;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    } else {
                        File file15 = new File(C4925.m14322(), C1711.m5726(f36935, 129, 10, i15));
                        if (RunnableC3474.m10630()) {
                            strM948 = strM948;
                            File file16 = new File(C4925.m14322(), C22628.m50602(f36935, 139, 9, i15));
                            short[] sArr2 = f36935;
                            if (C2958.f9394 < 0) {
                                String strM28025 = C11340.m28025(sArr2, 148, 11, i15);
                                File file17 = new File(file15, strM28025);
                                file7 = new File(file16, strM28025);
                                if (C1711.m5732(file17)) {
                                    int iM6988 = C2105.m6981("᩺ܺ") ^ i11;
                                    int i40 = ((iM6988 ^ i12) * 1299) ^ 322045066;
                                    i14 = iM6988 ^ 939440887;
                                    file6 = file17;
                                    file8 = file8;
                                    bArrM21646 = bArrM21646;
                                    file4 = file15;
                                    i13 = i40;
                                    file2 = file2;
                                    strM948 = strM948;
                                    file5 = file16;
                                    file3 = file3;
                                } else {
                                    file5 = file16;
                                    file6 = file17;
                                    file8 = file8;
                                    file4 = file15;
                                    int iM25613 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                                    i4 = ((iM25613 ^ i11) * (-29343)) ^ (-617877859);
                                    i6 = iM25613 ^ (-1191569899);
                                    bArrM21646 = bArrM21646;
                                    strM948 = strM948;
                                    file2 = file2;
                                    file = file5;
                                    i14 = i6;
                                    i13 = i4;
                                    file3 = file3;
                                    file5 = file;
                                }
                            }
                        } else {
                            strM948 = strM948;
                        }
                        file8 = file8;
                        file4 = file15;
                        int iM6989 = (C2105.m6981("۬ۛ") + i11) * 55;
                        i14 = iM6989 ^ (-436135232);
                        i13 = ((iM6989 ^ i12) * 9613) ^ 1436380294;
                        file3 = file3;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file5 = null;
                        file6 = null;
                        file2 = file2;
                    }
                    break;
                case -214383056:
                case -28921752:
                    i15 = 39267;
                    iM2566 = C0630.m2566("᩸۠") ^ i11;
                    i4 = ((iM2566 ^ i12) * (-26297)) ^ 1810694153;
                    i5 = 1640911934;
                    i6 = iM2566 ^ i5;
                    bArrM21646 = bArrM21646;
                    file7 = file7;
                    strM948 = strM948;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case -176307309:
                case 37657527:
                    file5 = file5;
                    file2 = file2;
                    file3 = file3;
                    bArrM21646 = bArrM21646;
                    file6 = file6;
                    if (C0798.m3003(file8)) {
                        iM6984 = C2105.m6981("۟ܿ") ^ i11;
                        i4 = ((iM6984 ^ i12) * 17877) ^ 1352670027;
                        i10 = -1263873932;
                        i6 = iM6984 ^ i10;
                        file6 = file6;
                        bArrM21646 = bArrM21646;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    }
                    file6 = file6;
                    strM948 = strM948;
                    int iM25614 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                    i4 = ((iM25614 ^ i11) * (-29343)) ^ (-617877859);
                    i6 = iM25614 ^ (-1191569899);
                    bArrM21646 = bArrM21646;
                    strM948 = strM948;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case 14204601:
                case 775070043:
                    file2 = file2;
                    file6 = file6;
                    z = false;
                    iM6984 = C2105.m6981("ᩳۚ") ^ i12;
                    file4 = file4;
                    i4 = ((iM6984 ^ i11) * 17487) ^ 170153567;
                    i10 = 1563612932;
                    i6 = iM6984 ^ i10;
                    file6 = file6;
                    bArrM21646 = bArrM21646;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case 56165858:
                case 1878833834:
                    file5 = file5;
                    i25 = i23 | i24;
                    i26 = fileInputStream.read() | (fileInputStream.read() << 8);
                    i27 = fileInputStream.read();
                    if (C1294.f4556 >= 0) {
                        iM6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                        i = ((iM6981 ^ i12) * 441) ^ 404756723;
                        i2 = -1847363215;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ܶܳ")) * (-73);
                        i = ((iM6981 ^ i12) * 6987) ^ (-2045474267);
                        i2 = -835802324;
                    }
                    int i311 = iM6981 ^ i2;
                    file5 = file5;
                    i14 = i311;
                    i13 = i;
                    break;
                case 250954712:
                case 1503801940:
                    i15 = 49783;
                    iM2566 = C0630.m2566("᩸۠") ^ i11;
                    i4 = ((iM2566 ^ i12) * (-26297)) ^ 1810694153;
                    i5 = 1640911934;
                    i6 = iM2566 ^ i5;
                    bArrM21646 = bArrM21646;
                    file7 = file7;
                    strM948 = strM948;
                    file2 = file2;
                    file = file5;
                    i14 = i6;
                    i13 = i4;
                    file3 = file3;
                    file5 = file;
                    break;
                case 446621895:
                case 2054166787:
                    C1128.m3851();
                    break;
                case 489413580:
                case 1011984767:
                    if (z2) {
                        iM6982 = C0630.m2566("ۖ᩹") ^ i11;
                        i = ((iM6982 ^ i12) * (-28539)) ^ (-2041068508);
                        i3 = 877561769;
                    } else {
                        iM6982 = C2105.m6981("ۚ᩸") ^ i12;
                        i = ((iM6982 ^ i11) * (-10573)) ^ (-1412715846);
                        i3 = 109562839;
                    }
                    i14 = iM6982 ^ i3;
                    i13 = i;
                    break;
                case 734876361:
                case 914201713:
                    C15843.m37500(file3, bArrM21646);
                    C3310 c3310M10119 = C3310.m10118(new FileInputStream(file3));
                    c3310M10119.m10123();
                    c3310M10119.m10120(new FileOutputStream(file7));
                    file3.delete();
                    z2 = z3;
                    file5 = file5;
                    iM6981 = C0630.m2566("ۙۚ") ^ i11;
                    i = ((iM6981 ^ i12) * (-7947)) ^ 984496106;
                    i2 = -1322682569;
                    int i312 = iM6981 ^ i2;
                    file5 = file5;
                    i14 = i312;
                    i13 = i;
                    break;
                case 964110191:
                case 1759703175:
                    if (C4159.m12565() >= 0) {
                        iM6982 = (i12 - C0630.m2566("ۚ֡")) * (-9);
                        i = ((iM6982 ^ i11) * 26969) ^ (-155116078);
                        i3 = 1817016927;
                        i14 = iM6982 ^ i3;
                        i13 = i;
                    } else {
                        file5 = file5;
                        bArrM21646 = bArrM21646;
                        iM2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((iM2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = iM2566 ^ i5;
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        strM948 = strM948;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    }
                    break;
                default:
                    if (!C3683.m11222()) {
                        file5 = file5;
                        iM6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                        i = ((iM6981 ^ i12) * 441) ^ 404756723;
                        i2 = -1847363215;
                        int i313 = iM6981 ^ i2;
                        file5 = file5;
                        i14 = i313;
                        i13 = i;
                    } else {
                        file5 = file5;
                        bArrM21646 = bArrM21646;
                        int iM25615 = (C0630.m2566("ۡ֫") ^ i11) * (-79);
                        i4 = ((iM25615 ^ i12) * 29651) ^ 12352324;
                        i6 = iM25615 ^ (-1620579383);
                        bArrM21646 = bArrM21646;
                        file7 = file7;
                        file4 = null;
                        file2 = file2;
                        file = file5;
                        i14 = i6;
                        i13 = i4;
                        file3 = file3;
                        file5 = file;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x032e A[PHI: r5 r7 r16 r18
      0x032e: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:76:0x032c, B:68:0x02e7, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:76:0x032c, B:68:0x02e7, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r16v24 java.lang.String) = (r16v14 java.lang.String), (r16v16 java.lang.String), (r16v25 java.lang.String) binds: [B:76:0x032c, B:68:0x02e7, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r18v14 java.lang.StringBuilder) = (r18v4 java.lang.StringBuilder), (r18v6 java.lang.StringBuilder), (r18v15 java.lang.StringBuilder) binds: [B:76:0x032c, B:68:0x02e7, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0364 A[PHI: r6 r10 r11 r16 r18
      0x0364: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short) binds: [B:80:0x0362, B:72:0x030c, B:118:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:80:0x0362, B:72:0x030c, B:118:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:80:0x0362, B:72:0x030c, B:118:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r16v20 java.lang.String) = (r16v13 java.lang.String), (r16v15 java.lang.String), (r16v21 java.lang.String) binds: [B:80:0x0362, B:72:0x030c, B:118:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r18v10 java.lang.StringBuilder) = (r18v3 java.lang.StringBuilder), (r18v5 java.lang.StringBuilder), (r18v11 java.lang.StringBuilder) binds: [B:80:0x0362, B:72:0x030c, B:118:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29939(AbstractC15440 abstractC15440, C8918 c8918, String str) throws IOException {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        C8918 c8919 = c8918;
        StringBuilder sbM15339 = null;
        String strM1959 = null;
        Iterator itM6374 = null;
        short[] sArr = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 775894727;
        int i10 = RunnableC3474.f10992;
        int i11 = C0483.f2088;
        int iM6982 = C2105.m6981("ۨ۬") ^ i10;
        int i12 = ((iM6982 ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED) ^ (-67357282);
        int i13 = iM6982 ^ 1704897981;
        C3545 c3545 = null;
        while (true) {
            i9 = ((((i9 ^ i11) * 7715) >> 31) & i12) ^ i13;
            switch (i9) {
                case -2123278667:
                case -1025933019:
                    C0382.m1848();
                    break;
                case -1977695909:
                case -928759857:
                    String str2 = strM1959;
                    sbM15339 = C5368.m15339(str);
                    C3245.m9923(sbM15339, C11340.m28023(abstractC15440));
                    sArr2 = f36935;
                    if (AbstractC2021.f6743 > 0) {
                        int iM2567 = (C0630.m2566("ܳۨ") ^ i10) * 73;
                        sbM15339 = sbM15339;
                        i = ((iM2567 ^ i11) * (-27431)) ^ (-21362208);
                        i13 = iM2567 ^ 2046969349;
                        strM1959 = str2;
                        i12 = i;
                        sbM15339 = sbM15339;
                    } else {
                        strM1959 = str2;
                        int iM6983 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((iM6983 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ iM6983;
                        c3545 = null;
                        c8919 = c8918;
                    }
                    break;
                case -1849413251:
                case 1130841566:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    i7 = 7;
                    i8 = 1;
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (i10 - C0630.m2566("֡᩷")) * (-89);
                        i3 = ((iM2566 ^ i11) * 6579) ^ (-912697396);
                        i4 = -632999089;
                        i13 = iM2566 ^ i4;
                        sbM15339 = sbM15339;
                        String str3 = strM1959;
                        i12 = i3;
                        strM1959 = str3;
                    } else {
                        iM6981 = (C2105.m6981("ۤ᩵") ^ i11) * (-7);
                        i = ((iM6981 ^ i10) * 19297) ^ 1618985102;
                        i2 = 1597296559;
                        i13 = iM6981 ^ i2;
                        strM1959 = strM1959;
                        c8919 = c8918;
                        i12 = i;
                        sbM15339 = sbM15339;
                    }
                    break;
                case -1744291155:
                case 355234473:
                    c8919.m23011(C1420.m4910(abstractC15440));
                    c8918.m23023();
                    break;
                case -1355210946:
                case 652523275:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    int i14 = s + 13694;
                    i5 = i14 * i14;
                    if (C1504.f5354) {
                        iM6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                        i = ((iM6981 ^ i11) * (-25791)) ^ (-536667320);
                        i2 = 2030672382;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ܿ᩻")) * 27;
                        i = ((iM6981 ^ i10) * 4911) ^ (-485152710);
                        i2 = -1663253100;
                    }
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -1224871765:
                case 79288851:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    sArr = f36935;
                    if (C7106.f21815 != 0) {
                        iM6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                        i = ((iM6981 ^ i11) * (-25791)) ^ (-536667320);
                        i2 = 2030672382;
                    } else {
                        iM6981 = (i10 - C2105.m6981("ܰۧ")) * (-91);
                        i = ((iM6981 ^ i11) * (-14649)) ^ (-69368047);
                        i2 = 711736301;
                    }
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -1187857875:
                case 65729644:
                    C0964.m3413();
                    if (C4117.f13076 <= 0) {
                        sbM15339 = sbM15339;
                        strM1959 = strM1959;
                        iM6981 = C0630.m2566("ܿۛ") ^ i10;
                        i = ((iM6981 ^ i11) * 17747) ^ 1214213644;
                        i2 = 2074929763;
                        i13 = iM6981 ^ i2;
                        strM1959 = strM1959;
                        c8919 = c8918;
                        i12 = i;
                        sbM15339 = sbM15339;
                    }
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    iM6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                    i = ((iM6981 ^ i11) * (-25791)) ^ (-536667320);
                    i2 = 2030672382;
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -1144523687:
                case 1464419867:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    c3545.setTime(0L);
                    c8919.m23013(c3545);
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("֫᩶") ^ i10;
                        i3 = ((iM2566 ^ i11) * 22867) ^ (-873752506);
                        i4 = -1352134991;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ۜۖ")) * (-59);
                        i3 = ((iM2566 ^ i10) * 29269) ^ 111145668;
                        i4 = -2044612412;
                    }
                    i13 = iM2566 ^ i4;
                    sbM15339 = sbM15339;
                    String str4 = strM1959;
                    i12 = i3;
                    strM1959 = str4;
                    break;
                case -1120231557:
                case 768109815:
                    if (C0422.f1886 <= 0) {
                        sbM15339 = sbM15339;
                        strM1959 = strM1959;
                        iM2566 = C2105.m6981("֫᩶") ^ i10;
                        i3 = ((iM2566 ^ i11) * 22867) ^ (-873752506);
                        i4 = -1352134991;
                        i13 = iM2566 ^ i4;
                        sbM15339 = sbM15339;
                        String str5 = strM1959;
                        i12 = i3;
                        strM1959 = str5;
                    } else {
                        sbM15339 = sbM15339;
                        strM1959 = strM1959;
                        iM6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                        i = ((iM6981 ^ i11) * (-25791)) ^ (-536667320);
                        i2 = 2030672382;
                        i13 = iM6981 ^ i2;
                        strM1959 = strM1959;
                        c8919 = c8918;
                        i12 = i;
                        sbM15339 = sbM15339;
                    }
                    break;
                case -997865965:
                case 985130455:
                    m29939((AbstractC15440) C2272.m7513(itM6374), c8919, strM1959);
                    int iM6984 = (i10 - C2105.m6981("۠֡")) * 81;
                    Iterator it = itM6374;
                    int i15 = ((iM6984 ^ i11) * (-17851)) ^ (-1984172762);
                    i13 = iM6984 ^ (-1429765960);
                    strM1959 = strM1959;
                    i12 = i15;
                    itM6374 = it;
                    break;
                case -964529158:
                case 533256765:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    StringBuilder sbM153310 = C5368.m15339(str);
                    C3245.m9923(sbM153310, C11340.m28023(abstractC15440));
                    if (C3663.m11168() < 0) {
                        c3545 = new C3545(C0050.m947(sbM153310));
                        if (C4075.f12947 >= 0) {
                            iM6981 = C0630.m2566("ܿۛ") ^ i10;
                            i = ((iM6981 ^ i11) * 17747) ^ 1214213644;
                            i2 = 2074929763;
                        } else {
                            iM6981 = (C2105.m6981("ۘۙ") ^ i10) * (-13);
                            i = ((iM6981 ^ i11) * 8839) ^ (-1778037197);
                            i2 = 1347788639;
                        }
                        i13 = iM6981 ^ i2;
                        strM1959 = strM1959;
                        c8919 = c8918;
                        i12 = i;
                        sbM15339 = sbM15339;
                    } else {
                        strM1959 = strM1959;
                        sbM15339 = sbM15339;
                        int iM6985 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((iM6985 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ iM6985;
                        c3545 = null;
                        c8919 = c8918;
                    }
                    break;
                case -933072407:
                case 464957539:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    s = sArr[6];
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۤ᩵") ^ i11) * (-7);
                        i = ((iM6981 ^ i10) * 19297) ^ 1618985102;
                        i2 = 1597296559;
                    } else {
                        iM6981 = C0630.m2566("֨ᩴ") ^ i10;
                        i = ((iM6981 ^ i11) * (-29555)) ^ 1380999119;
                        i2 = 1192145770;
                    }
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -830338761:
                case -571131282:
                    C2520.m8026();
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    iM6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                    i = ((iM6981 ^ i11) * (-25791)) ^ (-536667320);
                    i2 = 2030672382;
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -716041611:
                case 1342968021:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    if (C4075.m12248(abstractC15440)) {
                        iM6981 = C0630.m2566("ܶۚ") ^ i11;
                        i = ((iM6981 ^ i10) * (-14207)) ^ 1388235870;
                        i2 = 394760104;
                    } else {
                        iM6981 = (i10 - C2105.m6981("᩵۬")) * (-119);
                        i = ((iM6981 ^ i11) * 3823) ^ (-1941080660);
                        i2 = -1143427140;
                    }
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -535167356:
                case 2076807648:
                    i6 = 44785;
                    iM6981 = (i11 - C2105.m6981("ᩳ᩷")) * 5;
                    i = ((iM6981 ^ i10) * 12265) ^ 1244196870;
                    i2 = -1896729490;
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case -386744348:
                case 1154194297:
                    itM6374 = RunnableC1937.m6374(abstractC15440.mo23549(true));
                    int iM6986 = (i10 - C2105.m6981("۠֡")) * 81;
                    Iterator it2 = itM6374;
                    int i16 = ((iM6986 ^ i11) * (-17851)) ^ (-1984172762);
                    i13 = iM6986 ^ (-1429765960);
                    strM1959 = strM1959;
                    i12 = i16;
                    itM6374 = it2;
                    break;
                case -334612967:
                case 1371692052:
                    if (C1773.m5910(itM6374)) {
                        int iM2568 = C0630.m2566("᩹ۚ") ^ i11;
                        strM1959 = strM1959;
                        i3 = ((iM2568 ^ i10) * (-25475)) ^ (-59770569);
                        i13 = iM2568 ^ 463842193;
                        String str6 = strM1959;
                        i12 = i3;
                        strM1959 = str6;
                    } else {
                        String str7 = strM1959;
                        int iM6987 = C2105.m6981("ۢܶ") ^ i11;
                        int i17 = ((iM6987 ^ i10) * 24863) ^ 1812286619;
                        i13 = iM6987 ^ (-194812904);
                        strM1959 = str7;
                        i12 = i17;
                    }
                    break;
                case 74759444:
                case 1187851068:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("ۤ᩵") ^ i11) * (-7);
                        i = ((iM6981 ^ i10) * 19297) ^ 1618985102;
                        i2 = 1597296559;
                    } else {
                        iM6981 = C0630.m2566("֨۠") ^ i11;
                        i = ((iM6981 ^ i10) * 7365) ^ 1669879510;
                        i2 = -610649560;
                    }
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case 169340004:
                case 803303214:
                    C3245.m9923(sbM15339, C3746.m11357(sArr2, i7, i8, i6));
                    strM1959 = C0422.m1959(sbM15339);
                    if (!C1005.f3721) {
                        int iM6988 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((iM6988 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ iM6988;
                        c3545 = null;
                        c8919 = c8918;
                    } else {
                        int iM2569 = C0630.m2566("᩻ۡ") ^ i11;
                        sbM15339 = sbM15339;
                        i = ((iM2569 ^ i10) * (-11089)) ^ 885580677;
                        i13 = iM2569 ^ (-1679034692);
                        i12 = i;
                        sbM15339 = sbM15339;
                    }
                    break;
                case 339956681:
                case 1695075043:
                    sbM15339 = sbM15339;
                    strM1959 = strM1959;
                    if (i5 - (54776 * s) >= 0) {
                        iM6981 = (C0630.m2566("ܳ֫") + i10) * q.h;
                        i = ((iM6981 ^ i11) * 27055) ^ 1884723752;
                        i2 = -1737464637;
                    } else {
                        iM6981 = (i11 - C0630.m2566("ۙܺ")) * 95;
                        i = ((iM6981 ^ i10) * 24971) ^ (-1514937163);
                        i2 = 768772282;
                    }
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
                case 421083154:
                case 725675663:
                    break;
                case 440844466:
                case 2078391464:
                    C4117.m12364();
                    if (C0237.f1507 == 0) {
                        int iM6989 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((iM6989 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ iM6989;
                        c3545 = null;
                        c8919 = c8918;
                    } else {
                        sbM15339 = sbM15339;
                        strM1959 = strM1959;
                        iM6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                        i = ((iM6981 ^ i11) * (-25791)) ^ (-536667320);
                        i2 = 2030672382;
                        i13 = iM6981 ^ i2;
                        strM1959 = strM1959;
                        c8919 = c8918;
                        i12 = i;
                        sbM15339 = sbM15339;
                    }
                    break;
                default:
                    i6 = 15922;
                    iM6981 = (i11 - C2105.m6981("ᩳ᩷")) * 5;
                    i = ((iM6981 ^ i10) * 12265) ^ 1244196870;
                    i2 = -1896729490;
                    i13 = iM6981 ^ i2;
                    strM1959 = strM1959;
                    c8919 = c8918;
                    i12 = i;
                    sbM15339 = sbM15339;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29940(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, AbstractC15440 abstractC15442, AbstractC15440 abstractC15443) throws IOException {
        int iM6981;
        int i;
        int i2;
        ArrayList arrayList;
        boolean z;
        C8918 c8918;
        ByteArrayOutputStream byteArrayOutputStream;
        short[] sArr;
        short[] sArr2;
        int i3;
        int i4;
        short[] sArr3;
        short[] sArr4;
        int i5;
        PrintStream printStream;
        int iM6982;
        int i6;
        int i7;
        int iM6983;
        int i8;
        int i9;
        int i10;
        int i11;
        short[] sArr5;
        short[] sArr6;
        int i12;
        int iM6984;
        int i13;
        short[] sArr7;
        int i14;
        C8918 c8919;
        ByteArrayOutputStream byteArrayOutputStream2;
        C8918 c89110;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        int iM6985;
        int i15;
        int i16;
        int iM2566;
        int i17;
        int i18;
        int i19;
        int i20;
        C8918 c89111;
        int i21 = 327874048;
        int i22 = C4117.f13076;
        int i23 = C4075.f12947;
        int iM6986 = (C2105.m6981("᩷᩷") ^ i22) * 31;
        int i24 = ((iM6986 ^ i23) * 13915) ^ 2109183101;
        int i25 = iM6986 ^ (-2122181049);
        String str = null;
        String[] strArr = null;
        Iterator itM3596 = null;
        C8918 c89112 = null;
        Iterator itM6374 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        ArrayList arrayList2 = null;
        PrintStream printStream2 = null;
        int length = 0;
        short s = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        File file = null;
        ByteArrayOutputStream byteArrayOutputStream5 = null;
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        int i29 = 0;
        boolean z2 = false;
        String string = null;
        AbstractC15440 abstractC15444 = null;
        String str2 = null;
        int i30 = 0;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i23) * (-25667)) >> 31));
            switch (i21) {
                case -2067185874:
                case -1989578152:
                    c89110 = c89112;
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    str2 = "";
                    if (new C12302(new PrintWriter(printStream2, z2)).m29850(strArr).f38941 == 0) {
                        iM2566 = C2105.m6981("ۡۡ") ^ i23;
                        i17 = ((iM2566 ^ i22) * 32113) ^ 1909533980;
                        i18 = -1120909599;
                    } else {
                        iM2566 = C0630.m2566("᩸ܿ") ^ i23;
                        i17 = ((iM2566 ^ i22) * 18031) ^ 987629377;
                        i18 = -1759855960;
                    }
                    i25 = iM2566 ^ i18;
                    i24 = i17;
                    c89112 = c89110;
                    byteArrayOutputStream5 = byteArrayOutputStream4;
                    break;
                case -2043920720:
                case -1185964671:
                    AbstractC2021.m6561(c89112);
                    return;
                case -2035254872:
                case 741401983:
                    c89110 = c89112;
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    int i31 = length;
                    if (i30 < i31) {
                        iM6985 = C0630.m2566("ۙܰ") ^ i22;
                        i15 = ((iM6985 ^ i23) * (-17717)) ^ 2080830261;
                        i16 = -1641815461;
                    } else {
                        iM6985 = C2105.m6981("ܺ᩻") ^ i23;
                        i15 = ((iM6985 ^ i22) * (-6821)) ^ (-1582762436);
                        i16 = 210949239;
                    }
                    i25 = iM6985 ^ i16;
                    length = i31;
                    i24 = i15;
                    c89112 = c89110;
                    byteArrayOutputStream5 = byteArrayOutputStream4;
                    break;
                case -2034419987:
                case 1400110771:
                    i29 = 15835;
                    int iM6987 = (C2105.m6981("᩸ᩳ") + i22) * 79;
                    i10 = ((iM6987 ^ i23) * (-28385)) ^ (-1685706070);
                    i11 = iM6987 ^ 519008092;
                    sArr9 = sArr9;
                    i26 = i26;
                    i27 = i27;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    z2 = z2;
                    sArr10 = sArr10;
                    i28 = i28;
                    sArr8 = sArr8;
                    i25 = i11;
                    i24 = i10;
                    printStream2 = printStream2;
                    sArr11 = sArr11;
                    break;
                case -2009533592:
                case -1363035947:
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    printStream2 = printStream2;
                    C1916.m6307(arrayList2, file.getPath());
                    z2 = z2;
                    C1916.m6307(arrayList2, C4117.m12355(f36935, 83, 8, i29));
                    if (C4117.m12364() != 0) {
                        int iM6988 = (C2105.m6981("᩷ۡ") ^ i23) * 33;
                        i25 = iM6988 ^ (-2068391064);
                        i24 = ((iM6988 ^ i22) * 15585) ^ 186608101;
                        printStream2 = printStream2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr11 = sArr11;
                    } else {
                        C7106.m19117(arrayList2, new File(C4925.m14322(), C2167.m7159(f36935, 91, 9, i29)).getPath());
                        sArr7 = f36935;
                        if (C1916.f6442) {
                            int iM2567 = C0630.m2566("᩷ܿ") ^ i22;
                            int i32 = ((iM2567 ^ i23) * 10535) ^ 309356125;
                            i25 = iM2567 ^ 1600266530;
                            printStream2 = printStream2;
                            c89112 = c89112;
                            byteArrayOutputStream5 = byteArrayOutputStream5;
                            sArr11 = sArr7;
                            i24 = i32;
                            z2 = z2;
                        } else {
                            sArr5 = sArr9;
                            sArr6 = sArr10;
                            i12 = i28;
                            int iM6989 = (C2105.m6981("֨֨") + i22) * (-103);
                            i20 = ((iM6989 ^ i23) * (-4077)) ^ 2012993829;
                            sArr9 = sArr5;
                            byteArrayOutputStream5 = byteArrayOutputStream5;
                            z2 = z2;
                            sArr10 = sArr6;
                            i28 = i12;
                            i25 = iM6989 ^ (-1944819187);
                            printStream2 = printStream2;
                            sArr11 = sArr7;
                            i24 = i20;
                            c89112 = c89112;
                        }
                    }
                    break;
                case -2006451008:
                case -780435379:
                    c89110 = c89112;
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    C7106.m19117(arrayList2, C0483.m2128(f36935, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i29));
                    sb = new StringBuilder();
                    itM3596 = C1047.m3596(abstractC15441.mo23549(z2));
                    int iM2568 = (i23 - C0630.m2566("ܶۘ")) * (-43);
                    i19 = ((iM2568 ^ i22) * 8961) ^ (-1623615439);
                    i25 = iM2568 ^ 640057043;
                    length = length;
                    i24 = i19;
                    c89112 = c89110;
                    byteArrayOutputStream5 = byteArrayOutputStream4;
                    break;
                case -1967495503:
                case -550330645:
                    z2 = z2;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    sArr11 = sArr11;
                    i26 = i26;
                    i27 = i27;
                    sArr10 = sArr10;
                    i28 = i28;
                    printStream2 = printStream2;
                    short[] sArr12 = sArr8;
                    C7106.m19117(arrayList2, C4075.m12252(sArr12, i26, i27, i29));
                    sArr8 = sArr12;
                    C1916.m6307(arrayList2, RunnableC1937.m6385(f36935, 25, 5, i29));
                    sArr9 = f36935;
                    if (C2520.f8000 < 0) {
                        int iM69810 = C2105.m6981("᩺ۧ") ^ i23;
                        i10 = ((iM69810 ^ i22) * (-23579)) ^ (-1602801063);
                        i11 = iM69810 ^ (-1829777950);
                        i26 = i26;
                        i27 = i27;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr10;
                        i28 = i28;
                        sArr8 = sArr8;
                        i25 = i11;
                        i24 = i10;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    } else {
                        sArr10 = sArr10;
                        i28 = i28;
                        int iM69811 = (i22 - C2105.m6981("ۛ᩵")) * (-109);
                        i25 = iM69811 ^ 70912977;
                        i24 = ((iM69811 ^ i23) * (-583)) ^ 335159040;
                        i26 = i26;
                        i27 = i27;
                        printStream2 = printStream2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr8 = sArr8;
                        sArr11 = sArr11;
                    }
                    break;
                case -1931680640:
                case -1179850327:
                    C2520.m8026();
                    C4263.m12819();
                    return;
                case -1860880758:
                case 401319866:
                    C0382.m1848();
                    if (C1773.f6144 > 0) {
                        z2 = z2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        sArr11 = sArr11;
                        sArr5 = sArr9;
                        sArr6 = sArr10;
                        i12 = i28;
                        printStream2 = printStream2;
                        iM6984 = (i23 - C0630.m2566("ۛ᩶")) * 21;
                        i10 = ((iM6984 ^ i22) * 9345) ^ 1100840457;
                        i13 = -1877434233;
                        i11 = iM6984 ^ i13;
                        sArr9 = sArr5;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i11;
                        i24 = i10;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    } else {
                        arrayList = arrayList2;
                        z = z2;
                        c8918 = c89112;
                        byteArrayOutputStream = byteArrayOutputStream5;
                        sArr = sArr11;
                        sArr2 = sArr8;
                        i3 = i26;
                        i4 = i27;
                        sArr3 = sArr9;
                        sArr4 = sArr10;
                        i5 = i28;
                        printStream = printStream2;
                        iM6982 = (i22 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((iM6982 ^ i23) * 32041) ^ 824565712;
                        i7 = -1765972983;
                        int i33 = iM6982 ^ i7;
                        sArr9 = sArr3;
                        i26 = i3;
                        i27 = i4;
                        printStream2 = printStream;
                        c89112 = c8918;
                        byteArrayOutputStream5 = byteArrayOutputStream;
                        z2 = z;
                        sArr10 = sArr4;
                        i28 = i5;
                        sArr8 = sArr2;
                        i25 = i33;
                        i24 = i6;
                        sArr11 = sArr;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1848232940:
                case 448259991:
                    z2 = z2;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    sArr11 = sArr11;
                    sArr6 = sArr10;
                    i12 = i28;
                    printStream2 = printStream2;
                    sArr5 = sArr9;
                    C1916.m6307(arrayList2, C0050.m948(sArr5, 30, 7, i29));
                    String strM5177 = C1504.m5177(f36935, 37, 3, i29);
                    C1916.m6307(arrayList2, strM5177);
                    if (C1420.f5096 > 0) {
                        int iM69812 = (C2105.m6981("ۙ᩻") ^ i23) * 115;
                        int i34 = ((iM69812 ^ i22) * (-31217)) ^ (-2070727118);
                        i14 = iM69812 ^ 778634863;
                        str = strM5177;
                        sArr9 = sArr5;
                        i24 = i34;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i14;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    } else {
                        str = strM5177;
                        iM6984 = (i23 - C0630.m2566("ۛ᩶")) * 21;
                        i10 = ((iM6984 ^ i22) * 9345) ^ 1100840457;
                        i13 = -1877434233;
                        i11 = iM6984 ^ i13;
                        sArr9 = sArr5;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i11;
                        i24 = i10;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    }
                    break;
                case -1735550526:
                case -1692199086:
                    C7106.m19120();
                    arrayList = arrayList2;
                    z = z2;
                    c8918 = c89112;
                    byteArrayOutputStream = byteArrayOutputStream5;
                    sArr = sArr11;
                    sArr2 = sArr8;
                    i3 = i26;
                    i4 = i27;
                    sArr3 = sArr9;
                    sArr4 = sArr10;
                    i5 = i28;
                    printStream = printStream2;
                    iM6982 = (i22 - C2105.m6981("ۙܳ")) * 77;
                    i6 = ((iM6982 ^ i23) * 32041) ^ 824565712;
                    i7 = -1765972983;
                    int i35 = iM6982 ^ i7;
                    sArr9 = sArr3;
                    i26 = i3;
                    i27 = i4;
                    printStream2 = printStream;
                    c89112 = c8918;
                    byteArrayOutputStream5 = byteArrayOutputStream;
                    z2 = z;
                    sArr10 = sArr4;
                    i28 = i5;
                    sArr8 = sArr2;
                    i25 = i35;
                    i24 = i6;
                    sArr11 = sArr;
                    arrayList2 = arrayList;
                    break;
                case -1717874141:
                case 1163252060:
                    c89110 = c89112;
                    abstractC15444 = (AbstractC15440) RunnableC1108.m3791(itM3596);
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    if (!C3746.m11370(RunnableC1937.m6378(C11340.m28023(abstractC15444)), C0714.m2816(f36935, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 4, i29))) {
                        int iM2569 = (i23 - C0630.m2566("ܶۘ")) * (-43);
                        i19 = ((iM2569 ^ i22) * 8961) ^ (-1623615439);
                        i25 = iM2569 ^ 640057043;
                        length = length;
                        i24 = i19;
                        c89112 = c89110;
                        byteArrayOutputStream5 = byteArrayOutputStream4;
                    } else {
                        iM2566 = C2105.m6981("ۖᩴ") ^ i22;
                        i17 = ((iM2566 ^ i23) * (-3019)) ^ 744266886;
                        i18 = 803488315;
                        i25 = iM2566 ^ i18;
                        i24 = i17;
                        c89112 = c89110;
                        byteArrayOutputStream5 = byteArrayOutputStream4;
                    }
                    break;
                case -1307693206:
                case -1242522452:
                    z2 = z2;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    sArr11 = sArr11;
                    printStream2 = printStream2;
                    short[] sArr13 = sArr10;
                    int i36 = i28;
                    C1916.m6307(arrayList2, C1294.m4373(sArr13, i36, 14, i29));
                    sArr6 = sArr13;
                    i12 = i36;
                    File file2 = new File(C4925.m14322(), C0422.m1955(f36935, 61, 22, i29));
                    if (C0422.f1886 > 0) {
                        int iM69813 = C2105.m6981("ۘᩳ") ^ i23;
                        int i37 = ((iM69813 ^ i22) * 27523) ^ 863577105;
                        i14 = iM69813 ^ 6491179;
                        file = file2;
                        i24 = i37;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i14;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    } else {
                        file = file2;
                        sArr5 = sArr9;
                        iM6984 = (i23 - C0630.m2566("ۛ᩶")) * 21;
                        i10 = ((iM6984 ^ i22) * 9345) ^ 1100840457;
                        i13 = -1877434233;
                        i11 = iM6984 ^ i13;
                        sArr9 = sArr5;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i11;
                        i24 = i10;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    }
                    break;
                case -1105124206:
                case 1286465434:
                    i29 = 30178;
                    int iM69814 = (C2105.m6981("᩸ᩳ") + i22) * 79;
                    i10 = ((iM69814 ^ i23) * (-28385)) ^ (-1685706070);
                    i11 = iM69814 ^ 519008092;
                    sArr9 = sArr9;
                    i26 = i26;
                    i27 = i27;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    z2 = z2;
                    sArr10 = sArr10;
                    i28 = i28;
                    sArr8 = sArr8;
                    i25 = i11;
                    i24 = i10;
                    printStream2 = printStream2;
                    sArr11 = sArr11;
                    break;
                case -1082360666:
                case 1356489513:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        z2 = z2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        sArr7 = sArr11;
                        sArr5 = sArr9;
                        sArr6 = sArr10;
                        i12 = i28;
                        printStream2 = printStream2;
                        int iM69815 = (C2105.m6981("֨֨") + i22) * (-103);
                        i20 = ((iM69815 ^ i23) * (-4077)) ^ 2012993829;
                        sArr9 = sArr5;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = iM69815 ^ (-1944819187);
                        printStream2 = printStream2;
                        sArr11 = sArr7;
                        i24 = i20;
                        c89112 = c89112;
                    } else {
                        arrayList = arrayList2;
                        z = z2;
                        c8918 = c89112;
                        byteArrayOutputStream = byteArrayOutputStream5;
                        sArr = sArr11;
                        sArr2 = sArr8;
                        i3 = i26;
                        i4 = i27;
                        sArr3 = sArr9;
                        sArr4 = sArr10;
                        i5 = i28;
                        printStream = printStream2;
                        iM6982 = (i22 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((iM6982 ^ i23) * 32041) ^ 824565712;
                        i7 = -1765972983;
                        int i38 = iM6982 ^ i7;
                        sArr9 = sArr3;
                        i26 = i3;
                        i27 = i4;
                        printStream2 = printStream;
                        c89112 = c8918;
                        byteArrayOutputStream5 = byteArrayOutputStream;
                        z2 = z;
                        sArr10 = sArr4;
                        i28 = i5;
                        sArr8 = sArr2;
                        i25 = i38;
                        i24 = i6;
                        sArr11 = sArr;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1045821619:
                case 865040345:
                    m29939((AbstractC15440) C2272.m7513(itM6374), c89112, str2);
                    c89111 = c89112;
                    int iM25610 = (i23 - C0630.m2566("᩵᩷")) * 41;
                    C8918 c89113 = c89111;
                    i24 = ((iM25610 ^ i22) * (-15087)) ^ 1135438981;
                    i25 = iM25610 ^ (-1195352733);
                    c89112 = c89113;
                    break;
                case -925952282:
                case -924146805:
                    c89110 = c89112;
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    C3019.m9257(strArr[i30]);
                    i30++;
                    int iM69816 = C2105.m6981("ۧ۫") ^ i22;
                    i19 = ((iM69816 ^ i23) * 15365) ^ 266639056;
                    i25 = iM69816 ^ (-797360149);
                    i24 = i19;
                    c89112 = c89110;
                    byteArrayOutputStream5 = byteArrayOutputStream4;
                    break;
                case -892845384:
                case 51225310:
                    arrayList = arrayList2;
                    z = z2;
                    c8918 = c89112;
                    byteArrayOutputStream = byteArrayOutputStream5;
                    sArr = sArr11;
                    sArr2 = sArr8;
                    i3 = i26;
                    i4 = i27;
                    sArr3 = sArr9;
                    sArr4 = sArr10;
                    i5 = i28;
                    printStream = printStream2;
                    s = f36935[8];
                    if (C1128.f4106 <= 0) {
                        iM6982 = (i22 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((iM6982 ^ i23) * 32041) ^ 824565712;
                        i7 = -1765972983;
                    } else {
                        iM6982 = (C2105.m6981("ܽۛ") + i23) * (-91);
                        i6 = ((iM6982 ^ i22) * 2479) ^ 231757790;
                        i7 = -72684083;
                    }
                    int i39 = iM6982 ^ i7;
                    sArr9 = sArr3;
                    i26 = i3;
                    i27 = i4;
                    printStream2 = printStream;
                    c89112 = c8918;
                    byteArrayOutputStream5 = byteArrayOutputStream;
                    z2 = z;
                    sArr10 = sArr4;
                    i28 = i5;
                    sArr8 = sArr2;
                    i25 = i39;
                    i24 = i6;
                    sArr11 = sArr;
                    arrayList2 = arrayList;
                    break;
                case -674007134:
                case 1926757522:
                    z2 = z2;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    sArr11 = sArr11;
                    sArr5 = sArr9;
                    sArr6 = sArr10;
                    i12 = i28;
                    printStream2 = printStream2;
                    arrayList2 = new ArrayList();
                    C1916.m6307(arrayList2, C5695.m16034(f36935, 9, 7, i29));
                    sArr8 = f36935;
                    i26 = 16;
                    i27 = 9;
                    if (AbstractC2021.f6743 > 0) {
                        iM6984 = (C2105.m6981("ܽ᩸") ^ i22) * 37;
                        i10 = ((iM6984 ^ i23) * (-19839)) ^ (-999630226);
                        i13 = 27301725;
                        i11 = iM6984 ^ i13;
                        sArr9 = sArr5;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i11;
                        i24 = i10;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    } else {
                        sArr7 = sArr11;
                        int iM69817 = (C2105.m6981("֨֨") + i22) * (-103);
                        i20 = ((iM69817 ^ i23) * (-4077)) ^ 2012993829;
                        sArr9 = sArr5;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = iM69817 ^ (-1944819187);
                        printStream2 = printStream2;
                        sArr11 = sArr7;
                        i24 = i20;
                        c89112 = c89112;
                    }
                    break;
                case -641927875:
                case 2044696388:
                    c89110 = c89112;
                    m29938(abstractC15440, arrayList2);
                    RunnableC3474.m10626(abstractC15442);
                    abstractC15442.mo23546();
                    byteArrayOutputStream3 = new ByteArrayOutputStream();
                    if (!C2272.f7362) {
                        PrintStream printStream3 = new PrintStream(byteArrayOutputStream3);
                        strArr = (String[]) arrayList2.toArray(new String[0]);
                        byteArrayOutputStream4 = byteArrayOutputStream3;
                        printStream2 = printStream3;
                        length = strArr.length;
                        i30 = 0;
                        int iM69818 = C2105.m6981("ۧ۫") ^ i22;
                        i19 = ((iM69818 ^ i23) * 15365) ^ 266639056;
                        i25 = iM69818 ^ (-797360149);
                        i24 = i19;
                        c89112 = c89110;
                        byteArrayOutputStream5 = byteArrayOutputStream4;
                    } else {
                        int iM69819 = C2105.m6981("ܶ᩵") ^ i22;
                        length = length;
                        i24 = ((iM69819 ^ i23) * (-21079)) ^ 1714865637;
                        i25 = iM69819 ^ 2147098347;
                        byteArrayOutputStream5 = byteArrayOutputStream3;
                        c89112 = c89110;
                        printStream2 = null;
                    }
                    break;
                case -583977629:
                case -34008149:
                    C1420.m4905(sb2, C1711.m5726(f36935, 114, 1, i29));
                    throw new IOException(RunnableC0588.m2443(string, C0422.m1959(sb2), str2));
                case -496357491:
                case 862584279:
                    C1420.m4905(sb, C4117.m12359(abstractC15444));
                    c89110 = c89112;
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    int iM25611 = (i23 - C0630.m2566("ܶۘ")) * (-43);
                    i19 = ((iM25611 ^ i22) * 8961) ^ (-1623615439);
                    i25 = iM25611 ^ 640057043;
                    length = length;
                    i24 = i19;
                    c89112 = c89110;
                    byteArrayOutputStream5 = byteArrayOutputStream4;
                    break;
                case -436478588:
                case 1723643352:
                    c8919 = c89112;
                    byteArrayOutputStream2 = byteArrayOutputStream5;
                    C7106.m19117(arrayList2, C0050.m947(sb));
                    sArr11 = sArr11;
                    int iM25612 = C0630.m2566("۫ۡ") ^ i23;
                    i25 = iM25612 ^ (-242983990);
                    i24 = ((iM25612 ^ i22) * (-6729)) ^ 199632438;
                    printStream2 = printStream2;
                    c89112 = c8919;
                    byteArrayOutputStream5 = byteArrayOutputStream2;
                    sArr11 = sArr11;
                    break;
                case -134523414:
                case 896240409:
                    c89111 = new C8918(abstractC15443);
                    itM6374 = RunnableC1937.m6374(abstractC15442.mo23549(z2));
                    int iM25613 = (i23 - C0630.m2566("᩵᩷")) * 41;
                    C8918 c89114 = c89111;
                    i24 = ((iM25613 ^ i22) * (-15087)) ^ 1135438981;
                    i25 = iM25613 ^ (-1195352733);
                    c89112 = c89114;
                    break;
                case 146074758:
                case 1744139217:
                    C1294.m4372();
                    if (C1047.f3863 < 0) {
                        iM6981 = (C2105.m6981("ۡܺ") + i23) * 67;
                        i = ((iM6981 ^ i22) * (-16697)) ^ 828603219;
                        i2 = -34135700;
                        i25 = iM6981 ^ i2;
                        i24 = i;
                    } else {
                        z2 = z2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        printStream2 = printStream2;
                        int iM69820 = (C2105.m6981("᩷ۡ") ^ i23) * 33;
                        i25 = iM69820 ^ (-2068391064);
                        i24 = ((iM69820 ^ i22) * 15585) ^ 186608101;
                        printStream2 = printStream2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr11 = sArr11;
                    }
                    break;
                case 162037805:
                case 643611057:
                    c8919 = c89112;
                    byteArrayOutputStream2 = byteArrayOutputStream5;
                    sArr11 = sArr11;
                    C1916.m6307(arrayList2, C2167.m7159(sArr11, 100, 2, i29));
                    C7106.m19117(arrayList2, C2958.m9025(abstractC15442));
                    if (C3245.m9926(abstractC15441)) {
                        int iM25614 = C0630.m2566("ۛۚ") ^ i22;
                        i25 = iM25614 ^ (-558973640);
                        i24 = ((iM25614 ^ i23) * (-6959)) ^ (-306997587);
                        sArr11 = sArr11;
                        c89112 = c8919;
                        byteArrayOutputStream5 = byteArrayOutputStream2;
                        z2 = true;
                    } else {
                        z2 = true;
                        int iM25615 = C0630.m2566("۫ۡ") ^ i23;
                        i25 = iM25615 ^ (-242983990);
                        i24 = ((iM25615 ^ i22) * (-6729)) ^ 199632438;
                        printStream2 = printStream2;
                        c89112 = c8919;
                        byteArrayOutputStream5 = byteArrayOutputStream2;
                        sArr11 = sArr11;
                    }
                    break;
                case 379878516:
                case 1866112705:
                    z2 = z2;
                    c89112 = c89112;
                    byteArrayOutputStream5 = byteArrayOutputStream5;
                    sArr11 = sArr11;
                    printStream2 = printStream2;
                    C1916.m6307(arrayList2, C1711.m5726(f36935, 40, 7, i29));
                    String str3 = str;
                    C7106.m19117(arrayList2, str3);
                    sArr10 = f36935;
                    i28 = 47;
                    if (C1711.m5736() > 0) {
                        int iM25616 = (i22 - C0630.m2566("ۡۗ")) * 19;
                        i25 = iM25616 ^ (-988366737);
                        str = str3;
                        i24 = ((iM25616 ^ i23) * (-901)) ^ (-1981111233);
                        printStream2 = printStream2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr11 = sArr11;
                    } else {
                        str = str3;
                        sArr8 = sArr8;
                        i26 = i26;
                        i27 = i27;
                        int iM698110 = (i22 - C2105.m6981("ۛ᩵")) * (-109);
                        i25 = iM698110 ^ 70912977;
                        i24 = ((iM698110 ^ i23) * (-583)) ^ 335159040;
                        i26 = i26;
                        i27 = i27;
                        printStream2 = printStream2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr8 = sArr8;
                        sArr11 = sArr11;
                    }
                    break;
                case 524456119:
                case 1927379006:
                    string = byteArrayOutputStream5.toString(C5695.m16034(f36935, 109, 5, i29));
                    sb2 = new StringBuilder();
                    C3245.m9923(sb2, C2958.m9025(abstractC15440));
                    if (C4616.f14690 <= 0) {
                        z2 = z2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        sArr7 = sArr11;
                        sArr5 = sArr9;
                        sArr6 = sArr10;
                        i12 = i28;
                        printStream2 = printStream2;
                        int iM698111 = (C2105.m6981("֨֨") + i22) * (-103);
                        i20 = ((iM698111 ^ i23) * (-4077)) ^ 2012993829;
                        sArr9 = sArr5;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = iM698111 ^ (-1944819187);
                        printStream2 = printStream2;
                        sArr11 = sArr7;
                    } else {
                        int iM69821 = (C2105.m6981("ۘۢ") ^ i22) * (-7);
                        c89112 = c89112;
                        i20 = ((iM69821 ^ i23) * (-10467)) ^ (-489014527);
                        i25 = iM69821 ^ 1569073134;
                    }
                    i24 = i20;
                    c89112 = c89112;
                    break;
                case 691240371:
                case 1015787222:
                    C2105.m6982();
                    if (C5695.f17556 < 0) {
                        z2 = z2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        printStream2 = printStream2;
                        int iM69822 = (C2105.m6981("᩷ۡ") ^ i23) * 33;
                        i25 = iM69822 ^ (-2068391064);
                        i24 = ((iM69822 ^ i22) * 15585) ^ 186608101;
                        printStream2 = printStream2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr11 = sArr11;
                    } else {
                        arrayList = arrayList2;
                        z = z2;
                        c8918 = c89112;
                        byteArrayOutputStream = byteArrayOutputStream5;
                        sArr = sArr11;
                        sArr2 = sArr8;
                        i3 = i26;
                        i4 = i27;
                        sArr3 = sArr9;
                        sArr4 = sArr10;
                        i5 = i28;
                        printStream = printStream2;
                        iM6982 = (i22 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((iM6982 ^ i23) * 32041) ^ 824565712;
                        i7 = -1765972983;
                        int i310 = iM6982 ^ i7;
                        sArr9 = sArr3;
                        i26 = i3;
                        i27 = i4;
                        printStream2 = printStream;
                        c89112 = c8918;
                        byteArrayOutputStream5 = byteArrayOutputStream;
                        z2 = z;
                        sArr10 = sArr4;
                        i28 = i5;
                        sArr8 = sArr2;
                        i25 = i310;
                        i24 = i6;
                        sArr11 = sArr;
                        arrayList2 = arrayList;
                    }
                    break;
                case 1056755197:
                case 1292218693:
                    c89110 = c89112;
                    byteArrayOutputStream4 = byteArrayOutputStream5;
                    if (C1773.m5910(itM3596)) {
                        iM2566 = (C2105.m6981("֫ܶ") + i22) * (-107);
                        i17 = ((iM2566 ^ i23) * 20799) ^ 19388193;
                        i18 = -63293786;
                    } else {
                        iM2566 = (i23 - C0630.m2566("ۚ᩵")) * 25;
                        i17 = ((iM2566 ^ i22) * 28335) ^ (-1077891054);
                        i18 = -1254705359;
                    }
                    i25 = iM2566 ^ i18;
                    i24 = i17;
                    c89112 = c89110;
                    byteArrayOutputStream5 = byteArrayOutputStream4;
                    break;
                case 1308130911:
                case 1493723904:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        c89110 = c89112;
                        byteArrayOutputStream3 = byteArrayOutputStream5;
                        int iM698112 = C2105.m6981("ܶ᩵") ^ i22;
                        length = length;
                        i24 = ((iM698112 ^ i23) * (-21079)) ^ 1714865637;
                        i25 = iM698112 ^ 2147098347;
                        byteArrayOutputStream5 = byteArrayOutputStream3;
                        c89112 = c89110;
                        printStream2 = null;
                    } else {
                        z2 = z2;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        sArr11 = sArr11;
                        sArr5 = sArr9;
                        sArr6 = sArr10;
                        i12 = i28;
                        printStream2 = printStream2;
                        iM6984 = (i23 - C0630.m2566("ۛ᩶")) * 21;
                        i10 = ((iM6984 ^ i22) * 9345) ^ 1100840457;
                        i13 = -1877434233;
                        i11 = iM6984 ^ i13;
                        sArr9 = sArr5;
                        c89112 = c89112;
                        byteArrayOutputStream5 = byteArrayOutputStream5;
                        z2 = z2;
                        sArr10 = sArr6;
                        i28 = i12;
                        i25 = i11;
                        i24 = i10;
                        printStream2 = printStream2;
                        sArr11 = sArr11;
                    }
                    break;
                case 1394695249:
                case 1859002053:
                    if (C1773.m5910(itM6374)) {
                        iM6981 = C2105.m6981("ܿ᩵") ^ i23;
                        i = ((iM6981 ^ i22) * (-27855)) ^ (-1307590771);
                        i2 = 1240591747;
                    } else {
                        iM6981 = C0630.m2566("ۡܳ") ^ i22;
                        i = ((iM6981 ^ i23) * 14527) ^ 760899970;
                        i2 = -790267803;
                    }
                    i25 = iM6981 ^ i2;
                    i24 = i;
                    break;
                case 1658898833:
                case 2033006274:
                    if (C0237.m1493(sb) > 0) {
                        iM6981 = (C2105.m6981("֫ۨ") + i23) * 61;
                        i = ((iM6981 ^ i22) * (-22389)) ^ (-1787128002);
                        i2 = -1662699278;
                    } else {
                        iM6981 = (C0630.m2566("֡۫") + i22) * (-61);
                        i = ((iM6981 ^ i23) * (-30383)) ^ 719714497;
                        i2 = 1654855204;
                    }
                    i25 = iM6981 ^ i2;
                    i24 = i;
                    break;
                case 1919697050:
                case 2095356131:
                    boolean z3 = z2;
                    C8918 c89115 = c89112;
                    ByteArrayOutputStream byteArrayOutputStream6 = byteArrayOutputStream5;
                    sArr = sArr11;
                    short[] sArr14 = sArr8;
                    int i40 = i26;
                    int i41 = i27;
                    short[] sArr15 = sArr9;
                    short[] sArr16 = sArr10;
                    int i42 = i28;
                    PrintStream printStream4 = printStream2;
                    short s2 = s;
                    int i43 = s2 + 3815;
                    arrayList = arrayList2;
                    if ((s2 * 15260) - (i43 * i43) <= 0) {
                        iM6983 = C0630.m2566("ۡۖ") ^ i22;
                        i8 = ((iM6983 ^ i23) * 31659) ^ 772708752;
                        i9 = 96122881;
                    } else {
                        iM6983 = C2105.m6981("۟ۧ") ^ i23;
                        i8 = ((iM6983 ^ i22) * 17003) ^ 1298292245;
                        i9 = -990499414;
                    }
                    int i44 = iM6983 ^ i9;
                    s = s2;
                    i24 = i8;
                    sArr9 = sArr15;
                    i26 = i40;
                    i27 = i41;
                    printStream2 = printStream4;
                    c89112 = c89115;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    z2 = z3;
                    sArr10 = sArr16;
                    i28 = i42;
                    sArr8 = sArr14;
                    i25 = i44;
                    sArr11 = sArr;
                    arrayList2 = arrayList;
                    break;
                default:
                    C2105.m6979(sb, ':');
                    iM6981 = (C0630.m2566("֡۫") + i22) * (-61);
                    i = ((iM6981 ^ i23) * (-30383)) ^ 719714497;
                    i2 = 1654855204;
                    i25 = iM6981 ^ i2;
                    i24 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01e8 A[PHI: r0
      0x01e8: PHI (r0v3 l.ۗ֨۠) = (r0v2 l.ۗ֨۠), (r0v1 l.ۗ֨۠) binds: [B:57:0x01e6, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (l.C2126.m7040() == false) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1323 m29937(CharSequence charSequence) {
        int iM6981;
        int i;
        int iM6982;
        int i2;
        C2903 c2903 = null;
        C4314 c4314 = null;
        C22364 c22364M50099 = null;
        C13039 c13039 = null;
        int i3 = -407176793;
        int i4 = RunnableC1937.f6483;
        int i5 = C1294.f4556;
        int iM2566 = C0630.m2566("᩺ܽ") ^ i5;
        int i6 = ((iM2566 ^ i4) * 32371) ^ 1345062764;
        int i7 = iM2566 ^ (-544784182);
        PrintWriter printWriter = null;
        C4083 c4083 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        C15684 c15684M36959 = null;
        int i8 = i7;
        while (true) {
            i3 = i8 ^ ((((i3 ^ i4) * 14477) >> 31) & i6);
            switch (i3) {
                case -1788122926:
                case -190378888:
                    C0050.m940();
                    if (C3683.f11629 < 0) {
                        int iM2567 = (i5 - C0630.m2566("᩵ۡ")) * 19;
                        i6 = 1695317253 ^ ((iM2567 ^ i4) * (-28967));
                        i8 = iM2567 ^ (-2014295079);
                        c4083 = null;
                    } else {
                        iM6982 = C0630.m2566("ۚۛ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 12169) ^ 1418342207;
                        i2 = 1182238310;
                        i8 = iM6982 ^ i2;
                    }
                    break;
                case -1701805540:
                case 359936960:
                    c2903.m8841(c4314, printWriter);
                    int i9 = C11844.f35338;
                    if (C1294.f4556 < 0) {
                        c4083 = new C4083();
                        if (C1711.f5919) {
                            iM6982 = C0630.m2566("ᩳ۬") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-18489)) ^ (-1277003063);
                            i2 = -924121465;
                        } else {
                            iM6982 = (C0630.m2566("᩶᩹") ^ i4) * (-85);
                            i6 = ((iM6982 ^ i5) * 1589) ^ 842238443;
                            i2 = 1644664319;
                        }
                        i8 = iM6982 ^ i2;
                    } else {
                        int iM2568 = (i5 - C0630.m2566("᩵ۡ")) * 19;
                        i6 = 1695317253 ^ ((iM2568 ^ i4) * (-28967));
                        i8 = iM2568 ^ (-2014295079);
                        c4083 = null;
                    }
                    break;
                case -1277755170:
                case 2056808596:
                    C3019.m9255();
                    break;
                case -1131026840:
                case 1888275170:
                    c2903 = new C2903();
                    if (C22628.f73083 <= 0) {
                        iM6982 = (i5 - C2105.m6981("ۡۤ")) * 89;
                        i6 = ((iM6982 ^ i4) * (-28421)) ^ (-1754269124);
                        i2 = 1288807450;
                    } else {
                        iM6982 = C2105.m6981("ᩳܶ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-15455)) ^ 1016417067;
                        i2 = -2040462;
                    }
                    i8 = iM6982 ^ i2;
                    break;
                case -918996111:
                case 2048358976:
                    c2903.m8841(C22364.f72449, c22364M50099);
                    c15684M36959 = C15684.m36959(c2903);
                    if (RunnableC1937.m6387() == 0) {
                        iM6981 = (C2105.m6981("᩶ۨ") + i4) * 91;
                        i6 = 1811206452 ^ ((iM6981 ^ i5) * 5955);
                        i = 1328593937;
                        i8 = iM6981 ^ i;
                    } else {
                        iM6982 = C0630.m2566("ᩳ۬") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-18489)) ^ (-1277003063);
                        i2 = -924121465;
                        i8 = iM6982 ^ i2;
                    }
                    break;
                case -857484090:
                case 129513323:
                    C2105.m6982();
                    ViewOnClickListenerC1958.m6429();
                    return null;
                case -705849110:
                case -704078596:
                    return c15684M36959.m36960(charSequence, z, true, z2, z3).m33988();
                case -576676763:
                case -198777932:
                    c22364M50099.m7284(c13039);
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("ۘۗ") ^ i5;
                        i6 = 1236299411 ^ ((iM6981 ^ i4) * (-4561));
                        i = 1714509733;
                        i8 = iM6981 ^ i;
                    } else {
                        iM6982 = C0630.m2566("ᩳ۬") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-18489)) ^ (-1277003063);
                        i2 = -924121465;
                        i8 = iM6982 ^ i2;
                    }
                    break;
                case -377492724:
                case 1277812851:
                    C0050.m940();
                    int iM6983 = C2105.m6981("۠ۛ") ^ i4;
                    i6 = (-22428393) ^ ((iM6983 ^ i5) * 18273);
                    i8 = iM6983 ^ 1560334359;
                    printWriter = null;
                    break;
                case -228059044:
                case 1268716191:
                    c2903.m8840(InterfaceC11223.class, (InterfaceC19837) c4083);
                    if (C2520.m8026()) {
                        iM6982 = (i5 - C2105.m6981("ۡۤ")) * 89;
                        i6 = ((iM6982 ^ i4) * (-28421)) ^ (-1754269124);
                        i2 = 1288807450;
                    } else {
                        iM6982 = (i5 - C2105.m6981("᩷ۢ")) * (-69);
                        i6 = ((iM6982 ^ i4) * (-25505)) ^ (-456879542);
                        i2 = -573921862;
                    }
                    i8 = iM6982 ^ i2;
                    break;
                case 240075802:
                case 1493736294:
                    c22364M50099 = C22364.m50099(c2903);
                    c13039 = new C13039(charSequence);
                    if (!C0714.m2805()) {
                        int iM2569 = (i5 - C0630.m2566("᩵ۡ")) * 19;
                        i6 = 1695317253 ^ ((iM2569 ^ i4) * (-28967));
                        i8 = iM2569 ^ (-2014295079);
                        c4083 = null;
                    } else {
                        iM6982 = C2105.m6981("ܶۖ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-28573)) ^ 1876458834;
                        i2 = 1279501615;
                        i8 = iM6982 ^ i2;
                    }
                    break;
                case 1280904533:
                case 1493951348:
                    if (C7106.f21815 != 0) {
                        iM6982 = C0630.m2566("ۚۛ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 12169) ^ 1418342207;
                        i2 = 1182238310;
                        i8 = iM6982 ^ i2;
                    } else {
                        int iM6984 = C2105.m6981("۠ۛ") ^ i4;
                        i6 = (-22428393) ^ ((iM6984 ^ i5) * 18273);
                        i8 = iM6984 ^ 1560334359;
                        printWriter = null;
                    }
                    break;
                case 1713176370:
                case 1845508475:
                    c4314 = C22364.f72448;
                    if (!C1420.m4913()) {
                        printWriter = new PrintWriter(new C3162());
                        if (C0050.f910 >= 0) {
                            iM6982 = C0630.m2566("ۚۛ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 12169) ^ 1418342207;
                            i2 = 1182238310;
                        } else {
                            iM6982 = (C0630.m2566("᩷᩵") ^ i5) * 21;
                            i6 = ((iM6982 ^ i4) * (-31445)) ^ (-1679283891);
                            i2 = -1049891323;
                        }
                        i8 = iM6982 ^ i2;
                    } else {
                        int iM6985 = C2105.m6981("۠ۛ") ^ i4;
                        i6 = (-22428393) ^ ((iM6985 ^ i5) * 18273);
                        i8 = iM6985 ^ 1560334359;
                        printWriter = null;
                    }
                    break;
                default:
                    z2 = true;
                    z3 = false;
                    z = false;
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = (i5 - C2105.m6981("᩹᩷")) * 15;
                        i6 = 284361557 ^ ((iM6981 ^ i4) * (-5813));
                        i = -1755736769;
                        i8 = iM6981 ^ i;
                    } else {
                        int iM25610 = (i5 - C0630.m2566("᩵ۡ")) * 19;
                        i6 = 1695317253 ^ ((iM25610 ^ i4) * (-28967));
                        i8 = iM25610 ^ (-2014295079);
                        c4083 = null;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x028a A[PHI: r6 r7 r8 r9 r10 r17
      0x028a: PHI (r6v3 short) = (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:67:0x0288, B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:67:0x0288, B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:67:0x0288, B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:67:0x0288, B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:67:0x0288, B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r17v11 int) = (r17v9 int), (r17v10 int), (r17v12 int) binds: [B:67:0x0288, B:63:0x0266, B:59:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02e4 A[PHI: r4 r5 r12 r17
      0x02e4: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:75:0x02e2, B:71:0x02bf, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r5v3 char) = (r5v1 char), (r5v2 char), (r5v1 char) binds: [B:75:0x02e2, B:71:0x02bf, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r12v2 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v3 short[]) binds: [B:75:0x02e2, B:71:0x02bf, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r17v26 int) = (r17v7 int), (r17v8 int), (r17v27 int) binds: [B:75:0x02e2, B:71:0x02bf, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0333 A[PHI: r3 r17
      0x0333: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v1 java.lang.String), (r3v6 java.lang.String) binds: [B:83:0x0331, B:79:0x0313, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0333: PHI (r17v38 int) = (r17v5 int), (r17v6 int), (r17v39 int) binds: [B:83:0x0331, B:79:0x0313, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29938(AbstractC15440 abstractC15440, ArrayList arrayList) {
        int iM2566;
        int i;
        int iM2567;
        int i2;
        int i3;
        ArrayList arrayList2 = arrayList;
        AbstractC15440 abstractC15441 = null;
        String strM6378 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = -797620763;
        int i10 = C0050.f910;
        int i11 = C4616.f14690;
        int iM2568 = C0630.m2566("ᩳۘ") ^ i10;
        int i12 = ((iM2568 ^ i11) * (-31557)) ^ (-2117117273);
        int i13 = iM2568 ^ 1847889072;
        Iterator itM3596 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i11) * 24561) >> 31));
            switch (i14) {
                case -2062523128:
                case 1840079867:
                    i7 = 65378;
                    iM2566 = (C0630.m2566("᩸ۡ") + i11) * 83;
                    i12 = ((iM2566 ^ i10) * (-29687)) ^ (-1818037629);
                    i = -742351617;
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -2024615818:
                case -324810151:
                    C0964.m3413();
                    if (C3746.f11829 > 0) {
                        iM2567 = C0630.m2566("ܽۜ") ^ i11;
                        i14 = i14;
                        i2 = ((iM2567 ^ i10) * 9823) ^ (-2120277620);
                        i3 = -1990135913;
                        int i15 = i14;
                        i13 = iM2567 ^ i3;
                        i12 = i2;
                        i9 = i15;
                    } else {
                        i14 = i14;
                        iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                        i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                        i = -1095206903;
                        i9 = i14;
                        i13 = iM2566 ^ i;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1921831638:
                case -1482953159:
                    i7 = 56000;
                    iM2566 = (C0630.m2566("᩸ۡ") + i11) * 83;
                    i12 = ((iM2566 ^ i10) * (-29687)) ^ (-1818037629);
                    i = -742351617;
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -1836930242:
                case -596729245:
                    i14 = i14;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                        i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                        i = -1095206903;
                    } else {
                        iM2566 = C0630.m2566("ۢۗ") ^ i10;
                        i12 = ((iM2566 ^ i11) * 4479) ^ (-1782881112);
                        i = -1946850109;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -1744947993:
                case 119602513:
                    i14 = i14;
                    C1916.m6307(arrayList2, C2958.m9025(abstractC15441));
                    int iM6981 = (i10 - C2105.m6981("ۛۜ")) * (-75);
                    i9 = i14;
                    i13 = iM6981 ^ 1220402509;
                    i12 = ((iM6981 ^ i11) * 28739) ^ 1314083448;
                    arrayList2 = arrayList;
                    break;
                case -1735238819:
                case 665808903:
                    i14 = i14;
                    s = sArr[c];
                    s2 = 30070;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i10 - C0630.m2566("ۗ۫")) * (-5);
                        i12 = ((iM2566 ^ i11) * 27875) ^ 590594295;
                        i = -225457380;
                    } else {
                        iM2566 = C0630.m2566("֫ۢ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 20099) ^ (-610938945);
                        i = 1317174403;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -1344547224:
                case 1155965224:
                    i14 = i14;
                    if (C3911.m11924() <= 0) {
                        iM2567 = (C0630.m2566("ܺۘ") + i10) * 93;
                        i2 = ((iM2567 ^ i11) * (-13491)) ^ 1272234380;
                        i3 = -1943848853;
                        int i16 = i14;
                        i13 = iM2567 ^ i3;
                        i12 = i2;
                        i9 = i16;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                        i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                        i = -1095206903;
                        i9 = i14;
                        i13 = iM2566 ^ i;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1301790761:
                case 2102545460:
                    i14 = i14;
                    strM6378 = RunnableC1937.m6378(C11340.m28023(abstractC15441));
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2567 = C2105.m6981("ۜۗ") ^ i10;
                        i2 = ((iM2567 ^ i11) * 27547) ^ 913755867;
                        i3 = -647444977;
                        int i17 = i14;
                        i13 = iM2567 ^ i3;
                        i12 = i2;
                        i9 = i17;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                        i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                        i = -1095206903;
                        i9 = i14;
                        i13 = iM2566 ^ i;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1285722817:
                case 307619793:
                    i14 = i14;
                    if (C1773.m5910(itM3596)) {
                        iM2567 = (i10 - C2105.m6981("ۜᩴ")) * 123;
                        i2 = ((iM2567 ^ i11) * (-22163)) ^ 1098110712;
                        i3 = -1234415893;
                    } else {
                        iM2567 = C0630.m2566("ۖ֨") ^ i11;
                        i2 = ((iM2567 ^ i10) * (-14119)) ^ 78266259;
                        i3 = 908115979;
                    }
                    int i18 = i14;
                    i13 = iM2567 ^ i3;
                    i12 = i2;
                    i9 = i18;
                    break;
                case -1222727756:
                case 634191935:
                    i14 = i14;
                    sArr2 = f36935;
                    if (!C2126.f7087) {
                        iM2567 = C0630.m2566("ۡܰ") ^ i11;
                        i2 = ((iM2567 ^ i10) * 1683) ^ (-342611965);
                        i3 = 1847569407;
                        int i19 = i14;
                        i13 = iM2567 ^ i3;
                        i12 = i2;
                        i9 = i19;
                    } else {
                        iM2566 = C2105.m6981("᩵֨") ^ i11;
                        i12 = ((iM2566 ^ i10) * 20279) ^ 2000743111;
                        i = -1578485915;
                        i9 = i14;
                        i13 = iM2566 ^ i;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1163958122:
                case 346211905:
                    i14 = i14;
                    if ((i5 + i6) - i4 < 0) {
                        iM2566 = C0630.m2566("۟᩺") ^ i10;
                        i12 = ((iM2566 ^ i11) * 17937) ^ (-1767745309);
                        i = 1909907226;
                    } else {
                        iM2566 = (C0630.m2566("۫ۨ") ^ i11) * (-35);
                        i12 = ((iM2566 ^ i10) * (-32413)) ^ (-884709387);
                        i = -641473934;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -1050908212:
                case -1038398350:
                    i14 = i14;
                    m29938(abstractC15441, arrayList2);
                    int iM6982 = (i10 - C2105.m6981("ۛۜ")) * (-75);
                    i9 = i14;
                    i13 = iM6982 ^ 1220402509;
                    i12 = ((iM6982 ^ i11) * 28739) ^ 1314083448;
                    arrayList2 = arrayList;
                    break;
                case -754667786:
                case 1046326450:
                    i14 = i14;
                    if (!C1128.m3850(strM6378, C0630.m2575(sArr2, i8, 5, i7))) {
                        int iM6983 = (i10 - C2105.m6981("ۛۜ")) * (-75);
                        i9 = i14;
                        i13 = iM6983 ^ 1220402509;
                        i12 = ((iM6983 ^ i11) * 28739) ^ 1314083448;
                        arrayList2 = arrayList;
                    } else {
                        iM2567 = (C0630.m2566("ܶܶ") ^ i10) * (-125);
                        i2 = ((iM2567 ^ i11) * 22619) ^ 346014029;
                        i3 = 889854406;
                        int i110 = i14;
                        i13 = iM2567 ^ i3;
                        i12 = i2;
                        i9 = i110;
                    }
                    break;
                case -752051639:
                case -180484646:
                    C2105.m6982();
                    break;
                case -728859542:
                case 520235583:
                    i14 = i14;
                    abstractC15441 = (AbstractC15440) C2272.m7513(itM3596);
                    if (ServiceConnectionC3453.m10569(abstractC15441)) {
                        iM2567 = C2105.m6981("ۗۘ") ^ i11;
                        i2 = ((iM2567 ^ i10) * (-12019)) ^ (-1885605412);
                        i3 = -459257773;
                    } else {
                        iM2567 = (C0630.m2566("֡᩶") ^ i11) * 91;
                        i2 = ((iM2567 ^ i10) * 6027) ^ 691140695;
                        i3 = 1994971904;
                    }
                    int i111 = i14;
                    i13 = iM2567 ^ i3;
                    i12 = i2;
                    i9 = i111;
                    break;
                case -672754601:
                case 2001776061:
                    i14 = i14;
                    if (C3663.f11553) {
                        iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                        i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                        i = -1095206903;
                    } else {
                        iM2566 = C2105.m6981("۬ܶ") ^ i11;
                        i12 = ((iM2566 ^ i10) * 13239) ^ 807821675;
                        i = -1013277650;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -554547039:
                case -498761903:
                    if (C0798.f2919) {
                        i14 = i14;
                        iM2566 = C2105.m6981("᩵֨") ^ i11;
                        i12 = ((iM2566 ^ i10) * 20279) ^ 2000743111;
                        i = -1578485915;
                        i9 = i14;
                        i13 = iM2566 ^ i;
                        arrayList2 = arrayList;
                    }
                    i14 = i14;
                    iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                    i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                    i = -1095206903;
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case -450781404:
                case 1049193784:
                    i14 = i14;
                    sArr = f36935;
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("᩵֨") ^ i11;
                        i12 = ((iM2566 ^ i10) * 20279) ^ 2000743111;
                        i = -1578485915;
                    } else {
                        iM2566 = C2105.m6981("֡ܶ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-14095)) ^ (-1277772365);
                        i = -1563536610;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case 1098024461:
                case 1584135136:
                    i14 = i14;
                    c = 0;
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("ۛ֡") ^ i11) * 3;
                        i12 = ((iM2566 ^ i10) * 9249) ^ (-757547965);
                        i = -324839953;
                    } else {
                        iM2566 = C2105.m6981("᩵֨") ^ i11;
                        i12 = ((iM2566 ^ i10) * 20279) ^ 2000743111;
                        i = -1578485915;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case 1147976334:
                case 1205105955:
                    i14 = i14;
                    C2126.m7040();
                    iM2566 = (i11 - C2105.m6981("ۨۨ")) * (-17);
                    i12 = ((iM2566 ^ i10) * (-1107)) ^ 48020732;
                    i = -1095206903;
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case 1218750800:
                case 1463494335:
                    i14 = i14;
                    i8 = 1;
                    if (C1504.f5354) {
                        iM2567 = (C0630.m2566("ܺۘ") + i10) * 93;
                        i2 = ((iM2567 ^ i11) * (-13491)) ^ 1272234380;
                        i3 = -1943848853;
                    } else {
                        iM2567 = (i10 - C0630.m2566("۟ܳ")) * (-115);
                        i2 = ((iM2567 ^ i11) * (-13389)) ^ 982627733;
                        i3 = 1362259037;
                    }
                    int i112 = i14;
                    i13 = iM2567 ^ i3;
                    i12 = i2;
                    i9 = i112;
                    break;
                case 1280387417:
                case 1498731950:
                    i14 = i14;
                    i6 = 226051225;
                    if (C1504.f5354) {
                        iM2566 = (i10 - C0630.m2566("ۗ۫")) * (-5);
                        i12 = ((iM2566 ^ i11) * 27875) ^ 590594295;
                        i = -225457380;
                    } else {
                        iM2566 = (C2105.m6981("֨ܳ") + i10) * (-97);
                        i12 = ((iM2566 ^ i11) * 9833) ^ (-979692307);
                        i = -4861060;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
                case 1342997303:
                case 1547036596:
                    i14 = i14;
                    itM3596 = C1047.m3596(abstractC15440.mo23549(true));
                    int iM6984 = (i10 - C2105.m6981("ۛۜ")) * (-75);
                    i9 = i14;
                    i13 = iM6984 ^ 1220402509;
                    i12 = ((iM6984 ^ i11) * 28739) ^ 1314083448;
                    arrayList2 = arrayList;
                    break;
                case 1458089535:
                case 1748571348:
                    i14 = i14;
                    i4 = s * s2;
                    i5 = s * s;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (i10 - C0630.m2566("ۗ۫")) * (-5);
                        i12 = ((iM2566 ^ i11) * 27875) ^ 590594295;
                        i = -225457380;
                    } else {
                        iM2566 = C0630.m2566("۬ۘ") ^ i10;
                        i12 = ((iM2566 ^ i11) * (-32275)) ^ (-376701396);
                        i = -1510926967;
                    }
                    i9 = i14;
                    i13 = iM2566 ^ i;
                    arrayList2 = arrayList;
                    break;
            }
            return;
        }
    }
}
