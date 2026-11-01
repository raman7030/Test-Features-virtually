package p067l;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.Vibrator;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.math.p080ec.rfc8032.Scalar448;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCS256Config;

/* JADX INFO: renamed from: l.᩶ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes5.dex */
public class ApplicationC21448 extends ApplicationC14266 {

    /* JADX INFO: renamed from: ۗ */
    public static Vibrator f67648;

    /* JADX INFO: renamed from: ۙ */
    public static InterfaceC14100 f67649;

    /* JADX INFO: renamed from: ܿ֨᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f82969 = {1836, 22113, 22122, 22141, 22122, 22053, 22142, 22143, 22114, 22119, 22053, 22090, 22137, 22137, 22122, 22130, 22136, 22053, 22142, 22136, 22126, 22087, 22126, 22124, 22122, 22120, 22130, 22086, 22126, 22137, 22124, 22126, 22104, 22116, 22137, 22143, 22143, 22137, 22142, 22126, 3585, -15568, -15573, -15562, -15568, -15563, -15563, -15574, -15561, -15567, -15584, -15583, -15568, -15573, -15570, -15573, -15574, -15566, -15573, -15584, -15555, -15572, -15567, -15558, -15562, -15584, -15575, -15581, -15562, -15572, -15582, -15573, -15580, -15575, -15584, -15583, -15575, -15574, -15566, -15558, -15576, -15584, -15576, -15574, -15561, -15556, -15578, -15561, -15580, -15562, -15571, -15578, -15561, -15580, -15562, -15571, -15558, -15573, -15580, -15567, -15572, -15565, -15584, -15580, -15573, -15561, -15572, -15573, -15572, -15567, -15572, -15580, -15575, -15572, -15553, -15580, -15567, -15572, -15574, -15573, -15558, -15581, -15580, -15572, -15575, -15568, -15561, -15584, -15563, -15584, -15561, -15576, -15572, -15562, -15562, -15572, -15574, -15573, -15558, -15578, -15571, -15580, -15573, -15582, -15584, -15584, -15555, -15578, -15584, -15562, -15562, -15572, -15565, -15584, -15558, -15561, -15584, -15562, -15574, -15568, -15561, -15578, -15584, -15558, -15568, -15562, -15580, -15582, -15584, -15568, -15562, -15584, -15561, -15558, -15561, -15584, -15564, -15568, -15584, -15562, -15567, -15584, -15583, -15568, -15562, -15584, -15561, -15558, -15562, -15567, -15574, -15563, -15563, -15584, -15583, -15583, -15584, -15563, -15584, -15573, -15583, -15584, -15573, -15578, -15556, -15558, -15583, -15572, -15584, -15583, -15574, -15567, -15571, -15584, -15561, -15581, -15561, -15584, -15584, -15553, -15584, -15561, -15563, -15580, -15578, -15570, -15580, -15582, -15584, -15558, -15562, -15567, -15580, -15567, -15584, -15558, -15578, -15571, -15580, -15573, -15582, -15584, -15563, -15580, -15578, -15570, -15580, -15582, -15584, -15558, -15568, -15563, -15583, -15580, -15567, -15584, -15583, -15568, -15573, -15570, -15573, -15574, -15566, -15573, -15558, 27, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1288, 1303, 1290, 1292, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1288, 1305, 1292, 1296, 1290, 1301, 1288, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1307, 1296, 1305, 1290, 1291, 1309, 1292, 1290, 1301, 1307, 1291, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1293, 1291, 1309, 1290, 1302, 1305, 1301, 1309, 1290, 1301, 1293, 1302, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1288, 1305, 1291, 1291, 1295, 1303, 1290, 1308, 1290, 1301, 1288, 1295, 1290, 1301, 1288, 1292, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1295, 1309, 1306, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1288, 1303, 1290, 1292, 1305, 1288, 1299, 1319, 1301, 1307, 1288, 1319, 1288, 1303, 1290, 1292, 1305, 1288, 1299, 1319, 1301, 1307, 1288, 1319, 1291, 1297, 1311, 1302, 1305, 1292, 1293, 1290, 1309, 1319, 1299, 1309, 1281, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1295, 1309, 1306, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1297, 1302, 1297, 1292, 1297, 1305, 1300, 1319, 1288, 1305, 1292, 1296, 1290, 1295, 1301, 1297, 1288, 1290, 1295, 1301, 1288, 1290, 1309, 1301, 1303, 1292, 1309, 1319, 1295, 1309, 1306, 1319, 1301, 1305, 1302, 1305, 1311, 1309, 1290, 1319, 1288, 1305, 1297, 1290, 1297, 1302, 1311, 1319, 1307, 1303, 1308, 1309, 1290, 1295, 1301, 1288, 1307, 1305, 1301, 1288, 1305, 1288, 1299, 1319, 1301, 1307, 1288, 1319, 1303, 1288, 1309, 1290, 1305, 1292, 1297, 1303, 1302, 1319, 1288, 1305, 1292, 1296, 1305, 1301, 1303, 1288, 1291, 1301, 1303, 1303, 1292, 1296, 1319, 1301, 1303, 1308, 1309, 1319, 1292, 1296, 1290, 1309, 1291, 1296, 1303, 1300, 1308, 1305, 1301, 1291, 1299, 1305, 1288, 1299, 1319, 1301, 1307, 1288, 1319, 1291, 1297, 1311, 1302, 1305, 1292, 1293, 1290, 1309, 1319, 1291, 1307, 1296, 1309, 1301, 1309, 1305, 1301, 1291, 1291, 1305, 1288, 1299, 1319, 1301, 1307, 1288, 1319, 1294, 1353, 1319, 1291, 1297, 1311, 1302, 1305, 1292, 1293, 1290, 1309, 1319, 1310, 1297, 1300, 1309, 1302, 1305, 1301, 1309, 1305, 1301, 1294, 1353, 1291, 1310, 1301, 1310, 1290, 6419, 39, 120, 122, 103, 107, 39, 123, 109, 100, 110, 39, 107, 101, 108, 100, 97, 102, 109, 108, 124, 73, 102, 108, 122, 103, 97, 108, 39, 108, 105, 124, 105, 39, 39, 38, 108, 105, 124, 105, 39, 766, 22490, 22507, 22507, 22453, 22516, 22517, 22488, 22505, 22526, 22522, 22511, 22526, 22459, 22521, 22526, 22524, 22514, 22517, 22490, 22507, 22507, 22453, 22516, 22517, 22488, 22505, 22526, 22522, 22511, 22526, 22459, 22526, 22517, 22527, 22509, 22514, 22521, 22505, 22522, 22511, 22516, 22505, 22527, 22526, 22525, 22522, 22510, 22519, 22511, 22453, 22514, 22517, 22514, 22520, 22516, 22517, 22525, 22514, 22524, 22453, 22514, 22517, 22514, 22511, 22452, 22504, 22527, 22520, 22522, 22505, 22527, 22452, 22486, 22479, 22441, 22518, 22511, 22441, 22468, 22507, 22522, 22511, 22515, 22513, 22512, 22527, 22468, 22510, 22504, 22526, 22505, 22468, 22522, 22524, 22505, 22526, 22526, 22518, 22526, 22517, 22511, 22522, 22520, 22511, 22514, 22509, 22514, 22511, 22498, 22507, 22505, 22516, 22520, 22526, 22504, 22504, 22454, 22526, 22499, 22514, 22511, 22454, 22515, 22514, 22504, 22511, 22516, 22505, 22498, 22459, 22510, 22517, 22504, 22510, 22507, 22507, 22516, 22505, 22511, 22526, 22527, 22455, 22459, 22504, 22527, 22512, 22438, 22510, 22504, 22526, 22505, 22468, 22517, 22522, 22518, 22526, 22507, 22505, 22516, 22520, 22526, 22504, 22504, 22454, 22526, 22499, 22514, 22511, 22454, 22515, 22514, 22504, 22511, 22516, 22505, 22498, 22459, 22505, 22526, 22522, 22527, 22459, 22525, 22522, 22514, 22519, 22526, 22527, 22507, 22505, 22516, 22520, 22526, 22504, 22504, 22454, 22526, 22499, 22514, 22511, 22454, 22515, 22514, 22504, 22511, 22516, 22505, 22498, 22459, 22510, 22517, 22522, 22509, 22522, 22514, 22519, 22522, 22521, 22519, 22526, 22433, 22459, 22490, 22520, 22511, 22514, 22509, 22514, 22511, 22498, 22486, 22522, 22517, 22522, 22524, 22526, 22505, 22459, 22514, 22504, 22459, 22517, 22510, 22519, 22519, 22527, 22514, 22504, 22522, 22521, 22519, 22526, 22495, 22526, 22522, 22511, 22515, 22484, 22517, 22493, 22514, 22519, 22526, 22478, 22505, 22514, 22494, 22499, 22507, 22516, 22504, 22510, 22505, 22526, 22507, 22505, 22516, 22520, 22526, 22504, 22504, 22454, 22526, 22499, 22514, 22511, 22454, 22515, 22514, 22504, 22511, 22516, 22505, 22498, 22459, 22526, 22518, 22507, 22511, 22498, 22507, 22505, 22516, 22520, 22526, 22504, 22504, 22454, 22526, 22499, 22514, 22511, 22454, 22515, 22514, 
    22504, 22511, 22516, 22505, 22498, 22464, 22470, 22433, 22459, 22507, 22505, 22516, 22520, 22526, 22504, 22504, 22438, 22455, 22459, 22507, 22514, 22527, 22438, 22455, 22459, 22505, 22526, 22522, 22504, 22516, 22517, 22438, 22451, 22450, 22455, 22459, 22504, 22511, 22522, 22511, 22510, 22504, 22438, 22455, 22459, 22514, 22518, 22507, 22516, 22505, 22511, 22522, 22517, 22520, 22526, 22438, 22455, 22459, 22507, 22504, 22504, 22438, 22455, 22459, 22505, 22504, 22504, 22438, 22455, 22459, 22511, 22514, 22518, 22526, 22504, 22511, 22522, 22518, 22507, 22438, 22455, 22459, 22527, 22526, 22504, 22520, 22505, 22514, 22507, 22511, 22514, 22516, 22517, 22438};

    /* JADX INFO: renamed from: ᩶ */
    public static SharedPreferences f67650;

    /* JADX INFO: renamed from: ᩸ */
    public static boolean f67651;

    /* JADX INFO: renamed from: ᩹ */
    public static boolean f67652;

    /* JADX INFO: renamed from: ۧ */
    public static void m48584(InterfaceC14770 interfaceC14770, String str, String str2) {
        int i = 735636931;
        int i2 = C0967.f81910;
        int i3 = C1964.f83032;
        int iM55979 = (C0946.m55979("ۙ۟") + i2) * 53;
        int i4 = ((iM55979 ^ i3) * (-27467)) ^ (-556702674);
        int i5 = 1398089679;
        while (true) {
            i = ((((i ^ i3) * (-17395)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1774585832:
                case -496960982:
                    if (C0955.f81898) {
                        iM55979 = (i3 - C0873.m55680("֨ۛ")) * (-29);
                        i4 = ((iM55979 ^ i2) * (-6923)) ^ (-965701994);
                        i5 = -472243755;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۨ") ^ i3) * 119;
                        i4 = ((iM55979 ^ i2) * 12611) ^ (-1803512232);
                        i5 = -583231148;
                    }
                    break;
                case -1609579564:
                case 514265392:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i3 - C0873.m55680("֨ۛ")) * (-29);
                        i4 = ((iM55979 ^ i2) * (-6923)) ^ (-965701994);
                        i5 = -472243755;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29369)) ^ 569241436;
                        i5 = -2124802641;
                    }
                    break;
                case -1262884558:
                case 1549622993:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ᩴ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5845)) ^ (-800912814);
                        i5 = -33553429;
                    } else {
                        iM55979 = C0946.m55979("֨ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27553) ^ (-1657274357);
                        i5 = 340824330;
                    }
                    break;
                case -1172308083:
                case 1054924918:
                    if (AbstractC0942.m55971()) {
                        iM55979 = (i3 - C0873.m55680("֨ۛ")) * (-29);
                        i4 = ((iM55979 ^ i2) * (-6923)) ^ (-965701994);
                        i5 = -472243755;
                    } else {
                        iM55979 = (C0946.m55979("֨ܿ") ^ i2) * 13;
                        i4 = ((iM55979 ^ i3) * 29561) ^ 29052697;
                        i5 = 2010577933;
                    }
                    break;
                case -1111301400:
                case -40399214:
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0946.m55979("ᩴ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5845)) ^ (-800912814);
                        i5 = -33553429;
                    } else {
                        iM55979 = (C0873.m55680("ᩴܺ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * (-12047)) ^ 1676752905;
                        i5 = -906571466;
                    }
                    break;
                case -827128390:
                case 1694306180:
                    if (f67649.contains(str2)) {
                        iM55979 = (i2 - C0946.m55979("ܶۚ")) * (-111);
                        i4 = ((iM55979 ^ i3) * (-30321)) ^ (-1685535915);
                        i5 = 504069951;
                    } else {
                        iM55979 = C0946.m55979("ܶۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15859) ^ (-1154502008);
                        i5 = 144598092;
                    }
                    break;
                case -779840819:
                case 1014310577:
                    C1028.m56247();
                    if (C0989.m56095() > 0) {
                        iM55979 = C0946.m55979("ᩴ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5845)) ^ (-800912814);
                        i5 = -33553429;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩺") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * (-23585)) ^ (-281956568);
                        i5 = 1329654029;
                    }
                    break;
                case -775584185:
                case 109510085:
                    C1124.m56367();
                    if (C1028.m56247() >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۧۧ")) * (-7);
                        i4 = ((iM55979 ^ i2) * 10679) ^ 889914622;
                        i5 = 2052737713;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩺") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * (-23585)) ^ (-281956568);
                        i5 = 1329654029;
                    }
                    break;
                case -755453417:
                case 1619825642:
                    if (C0927.f81875) {
                        iM55979 = (i3 - C0873.m55680("֨ۛ")) * (-29);
                        i4 = ((iM55979 ^ i2) * (-6923)) ^ (-965701994);
                        i5 = -472243755;
                    } else {
                        iM55979 = (C0873.m55680("ۛᩴ") ^ i3) * 37;
                        i4 = ((iM55979 ^ i2) * 10165) ^ 80810835;
                        i5 = -1797694964;
                    }
                    break;
                case -593258246:
                case 1643470740:
                    C1044.m56286();
                    C0861.m55626();
                    break;
                case -500735597:
                case 1563021774:
                    if (C1929.f83011 != 0) {
                        iM55979 = (i3 - C0873.m55680("ۧۧ")) * (-7);
                        i4 = ((iM55979 ^ i2) * 10679) ^ 889914622;
                        i5 = 2052737713;
                    } else {
                        iM55979 = C0946.m55979("ܽܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24547)) ^ (-1426437489);
                        i5 = 1774507496;
                    }
                    break;
                case -431537291:
                case 565403173:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ۧۜ")) * (-55);
                        i4 = ((iM55979 ^ i2) * (-29123)) ^ (-1439527170);
                        i5 = 1344131151;
                    } else {
                        iM55979 = (C0873.m55680("ܳ֫") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i3) * 26779) ^ 55406739;
                        i5 = -518280946;
                    }
                    break;
                case -426291525:
                case 1297027777:
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ۗ᩺") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * (-23585)) ^ (-281956568);
                        i5 = 1329654029;
                    } else {
                        iM55979 = C0873.m55680("ۚۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22501)) ^ 525996566;
                        i5 = -1794964955;
                    }
                    break;
                case -58027174:
                case -44969683:
                    C0930.m55885();
                    iM55979 = (C0873.m55680("ۗ᩺") + i2) * 15;
                    i4 = ((iM55979 ^ i3) * (-23585)) ^ (-281956568);
                    i5 = 1329654029;
                    break;
                case 336906578:
                case 1031636175:
                    C1025.m56231(interfaceC14770, str2, C1053.m56333(f67649, str, null));
                    iM55979 = (i2 - C0946.m55979("ܶۚ")) * (-111);
                    i4 = ((iM55979 ^ i3) * (-30321)) ^ (-1685535915);
                    i5 = 504069951;
                    break;
                case 1241101063:
                case 1845131215:
                    interfaceC14770.remove(str);
                    break;
                case 1720111902:
                case 1973940754:
                    if (C1229.f82066 < 0) {
                        iM55979 = (i3 - C0873.m55680("֨ۛ")) * (-29);
                        i4 = ((iM55979 ^ i2) * (-6923)) ^ (-965701994);
                        i5 = -472243755;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩺") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * (-23585)) ^ (-281956568);
                        i5 = 1329654029;
                    }
                    break;
                default:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("ᩴ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5845)) ^ (-800912814);
                        i5 = -33553429;
                    } else {
                        iM55979 = C0946.m55979("ۡۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12623) ^ 304755482;
                        i5 = 912717483;
                    }
                    break;
            }
            return;
        }
    }

    public ApplicationC21448() {
        C17452.m39789();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x014a, code lost:
    
        if (p067l.C1036.f81953 >= 0) goto L26;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m48583() {
        int iM55979;
        int i;
        int i2;
        String str;
        String str2;
        InterfaceC14770 interfaceC14770;
        int i3;
        InterfaceC14770 interfaceC14771;
        String str3;
        String str4;
        String str5;
        String str6;
        short[] sArr;
        String str7;
        InterfaceC14770 interfaceC14772;
        short[] sArr2;
        String str8;
        int iM55680;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        InterfaceC14770 interfaceC14773;
        String str9;
        String str10;
        String str11;
        InterfaceC14770 interfaceC14774;
        String str12;
        short[] sArr3;
        int i8;
        String strM55993;
        int iM559710;
        int i9;
        int i10;
        InterfaceC14770 interfaceC14775;
        String str13;
        InterfaceC14770 interfaceC14776;
        String str14;
        int i11;
        InterfaceC14770 interfaceC14777;
        String str15;
        int i12;
        int i13;
        String str16;
        InterfaceC14770 interfaceC14778;
        int i14;
        InterfaceC14770 interfaceC14779;
        String strM55810;
        int iM55682;
        int i15;
        int i16;
        InterfaceC14770 interfaceC147710;
        String str17;
        int i17;
        int i18;
        InterfaceC14770 interfaceC147711;
        String str18;
        int i19;
        String str19;
        InterfaceC14770 interfaceC147712;
        InterfaceC14770 interfaceC14770M55950;
        int iM559711;
        int i20;
        int i21;
        InterfaceC14770 interfaceC147713;
        String str20;
        String str21;
        InterfaceC14770 interfaceC14770M55814;
        String str22;
        int i22;
        int i23;
        short[] sArr4;
        String str23;
        String str24;
        String str25;
        int i24;
        InterfaceC14770 interfaceC147714;
        short[] sArr5;
        String str26;
        int i25;
        String str27;
        InterfaceC14770 interfaceC147715;
        int iM55683;
        int i26;
        int i27;
        int iM559712;
        int i28;
        int i29;
        int iM559713;
        int i30;
        int i31;
        InterfaceC14770 interfaceC147716;
        InterfaceC14770 interfaceC147717;
        int i32;
        InterfaceC14770 interfaceC147718;
        int i33;
        String str28;
        String str29;
        int i34;
        int i35;
        String strM55597;
        int iM55684;
        int i36;
        int i37;
        String str30;
        int i38;
        int i39;
        InterfaceC14770 interfaceC147719;
        int i40;
        String str31;
        String str32;
        int i41;
        String str33;
        InterfaceC14770 interfaceC147720;
        int iM559714;
        int i42;
        int i43;
        InterfaceC14770 interfaceC14770M55815;
        InterfaceC14770 interfaceC147721;
        String str34;
        int iM55685;
        int i44;
        int i45;
        int iM559715;
        int i46;
        int iM559716;
        int i47;
        int i48;
        int i49 = -442828569;
        int i50 = C1071.f81975;
        int i51 = C1053.f81965;
        int iM55686 = (i50 - C0873.m55680("ܶۡ")) * 35;
        int i52 = ((iM55686 ^ i51) * (-12215)) ^ (-1142089829);
        int i53 = iM55686 ^ 770038518;
        String str35 = null;
        InterfaceC14770 interfaceC147722 = null;
        InterfaceC14770 interfaceC147723 = null;
        InterfaceC14770 interfaceC147724 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i54 = 0;
        int i55 = 0;
        String str36 = null;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        InterfaceC14770 interfaceC147725 = null;
        String strM56584 = null;
        InterfaceC14770 interfaceC147726 = null;
        String strM56189 = null;
        String strM55852 = null;
        InterfaceC14770 interfaceC147727 = null;
        InterfaceC14770 interfaceC14770M55951 = null;
        String strM56558 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i59 = 0;
        String strM56203 = null;
        String str37 = null;
        String str38 = null;
        InterfaceC14770 interfaceC147728 = null;
        String strM56386 = null;
        short[] sArr13 = null;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        String strM55811 = null;
        int i63 = 0;
        while (true) {
            i49 = i53 ^ (i52 & (((i49 ^ i51) * 5969) >> 31));
            switch (i49) {
                case -2138994829:
                case -1387983101:
                    C0955.m56025();
                    C0989.m56095();
                    break;
                case -2048771051:
                case 484826465:
                    InterfaceC14770 interfaceC147729 = interfaceC147728;
                    String str39 = strM56386;
                    String str40 = strM55811;
                    String str41 = strM56584;
                    i59 = i59;
                    short[] sArr14 = sArr6;
                    short[] sArr15 = sArr7;
                    short[] sArr16 = sArr8;
                    String str42 = strM56558;
                    String str43 = str37;
                    InterfaceC14770 interfaceC147730 = interfaceC147725;
                    i62 = i62;
                    i56 = i56;
                    interfaceC147723 = interfaceC147723;
                    str35 = str35;
                    i57 = i57;
                    String str44 = str38;
                    InterfaceC14770 interfaceC147731 = interfaceC14770M55951;
                    InterfaceC14100 interfaceC14100 = f67649;
                    interfaceC147725 = interfaceC147730;
                    strM55811 = str40;
                    String strM56077 = C0967.m56077(f82969, 266, 19, i63);
                    if (interfaceC14100.contains(strM56077)) {
                        iM559712 = (i50 - C0946.m55979("ۘ۠")) * 71;
                        i28 = ((iM559712 ^ i51) * 18715) ^ (-970212767);
                        i29 = -677565976;
                    } else {
                        iM559712 = C0946.m55979("ۢܿ") ^ i50;
                        i28 = ((iM559712 ^ i51) * 19749) ^ (-1631775308);
                        i29 = 663948919;
                    }
                    int i64 = iM559712 ^ i29;
                    sArr6 = sArr14;
                    sArr8 = sArr16;
                    str37 = str43;
                    interfaceC14770M55951 = interfaceC147731;
                    strM56386 = str39;
                    sArr7 = sArr15;
                    strM56584 = str41;
                    i53 = i64;
                    str36 = strM56077;
                    i52 = i28;
                    strM56558 = str42;
                    str38 = str44;
                    interfaceC147728 = interfaceC147729;
                    i59 = i59;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i62;
                    interfaceC147725 = interfaceC147725;
                    strM55811 = strM55811;
                    break;
                case -1973934457:
                case -1284780723:
                    interfaceC14770 = interfaceC147725;
                    String str45 = strM56584;
                    m48584(interfaceC14770, str45, C0861.m55618(f82969, 383, 4, i63));
                    i3 = i62;
                    String str46 = str36;
                    m48580(interfaceC14770, str46, C0863.m55635(f82969, 387, 4, i63));
                    interfaceC147726 = interfaceC14770;
                    str = str45;
                    str2 = str46;
                    int iM559717 = C0946.m55979("᩶ܶ") ^ i51;
                    strM55811 = strM55811;
                    sArr6 = sArr6;
                    sArr8 = sArr8;
                    strM56386 = strM56386;
                    interfaceC147728 = interfaceC147728;
                    sArr7 = sArr7;
                    i53 = iM559717 ^ (-992572257);
                    i52 = ((iM559717 ^ i50) * 21847) ^ 1165684090;
                    str36 = str2;
                    str37 = str37;
                    interfaceC14770M55951 = interfaceC14770M55951;
                    strM56584 = str;
                    str38 = str38;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i3;
                    interfaceC147725 = interfaceC14770;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case -1921771764:
                case 1940056697:
                    C0912.m55833();
                    if (C0967.f81910 < 0) {
                        interfaceC147713 = interfaceC147728;
                        str21 = strM56386;
                        interfaceC14770M55814 = interfaceC147725;
                        str22 = strM56584;
                        i22 = i62;
                        i23 = i59;
                        sArr4 = sArr7;
                        str23 = strM56558;
                        str24 = str37;
                        str25 = str36;
                        i24 = i56;
                        interfaceC147714 = interfaceC147723;
                        sArr5 = sArr8;
                        str26 = str35;
                        i25 = i57;
                        str27 = str38;
                        interfaceC147715 = interfaceC14770M55951;
                        iM559713 = (C0946.m55979("᩻᩸") + i50) * 21;
                        i30 = ((iM559713 ^ i51) * (-23691)) ^ (-655938828);
                        i31 = 1279052303;
                        int i65 = iM559713 ^ i31;
                        sArr8 = sArr5;
                        interfaceC14770M55951 = interfaceC147715;
                        strM56386 = str21;
                        sArr7 = sArr4;
                        i53 = i65;
                        str36 = str25;
                        str37 = str24;
                        strM56558 = str23;
                        str38 = str27;
                        strM56584 = str22;
                        i59 = i23;
                        i57 = i25;
                        str35 = str26;
                        interfaceC147723 = interfaceC147714;
                        i56 = i24;
                        i62 = i22;
                        interfaceC147725 = interfaceC14770M55814;
                        i52 = i30;
                        interfaceC147728 = interfaceC147713;
                    } else {
                        interfaceC14771 = interfaceC147728;
                        str3 = strM56386;
                        str8 = strM55811;
                        str4 = strM56584;
                        i59 = i59;
                        sArr2 = sArr6;
                        strM56558 = strM56558;
                        str5 = str37;
                        str6 = str36;
                        interfaceC14770 = interfaceC147725;
                        i3 = i62;
                        sArr = sArr8;
                        i56 = i56;
                        interfaceC147723 = interfaceC147723;
                        str35 = str35;
                        i57 = i57;
                        str7 = str38;
                        interfaceC14772 = interfaceC14770M55951;
                        iM55680 = C0873.m55680("ܳᩳ") ^ i50;
                        i4 = ((iM55680 ^ i51) * 12953) ^ 62493850;
                        i5 = 624489044;
                        i53 = iM55680 ^ i5;
                        strM55811 = str8;
                        sArr6 = sArr2;
                        i52 = i4;
                        sArr8 = sArr;
                        interfaceC14770M55951 = interfaceC14772;
                        strM56386 = str3;
                        interfaceC147728 = interfaceC14771;
                        str36 = str6;
                        str37 = str5;
                        str38 = str7;
                        strM56584 = str4;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i59;
                    }
                    break;
                case -1840899268:
                case 1818678121:
                    interfaceC14773 = interfaceC147728;
                    str9 = strM56386;
                    str10 = str36;
                    i59 = i59;
                    strM56558 = strM56558;
                    interfaceC14770 = interfaceC147725;
                    i3 = i62;
                    i56 = i56;
                    interfaceC147723 = interfaceC147723;
                    str35 = str35;
                    i57 = i57;
                    str11 = str38;
                    interfaceC14774 = interfaceC14770M55951;
                    str12 = strM56584;
                    short[] sArr17 = sArr8;
                    int i66 = i58;
                    strM56203 = C1024.m56203(sArr17, i66, 23, i63);
                    sArr3 = sArr17;
                    i8 = i66;
                    strM55993 = C0947.m55993(f82969, 356, 4, i63);
                    if (C0890.f81849 != 0) {
                        iM559710 = C0946.m55979("ᩴ᩹") ^ i50;
                        i9 = ((iM559710 ^ i51) * (-26217)) ^ (-836222887);
                        i10 = 577278147;
                    } else {
                        iM559710 = (C0946.m55979("ܳ۠") + i51) * (-41);
                        i9 = ((iM559710 ^ i50) * (-17623)) ^ (-454604961);
                        i10 = -1312333082;
                    }
                    i53 = iM559710 ^ i10;
                    sArr8 = sArr3;
                    i58 = i8;
                    interfaceC147728 = interfaceC14773;
                    strM56584 = str12;
                    str36 = str10;
                    interfaceC14770M55951 = interfaceC14774;
                    str37 = strM55993;
                    i52 = i9;
                    str38 = str11;
                    strM56386 = str9;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i3;
                    interfaceC147725 = interfaceC14770;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case -1834595536:
                case -1703548352:
                    InterfaceC14770 interfaceC147732 = interfaceC147728;
                    String str47 = strM56386;
                    String str48 = str37;
                    String str49 = str36;
                    i59 = i59;
                    strM56558 = strM56558;
                    interfaceC14770 = interfaceC147725;
                    i3 = i62;
                    i56 = i56;
                    interfaceC147723 = interfaceC147723;
                    str35 = str35;
                    i57 = i57;
                    String str50 = str38;
                    InterfaceC14770 interfaceC147733 = interfaceC14770M55951;
                    String str51 = strM56584;
                    short[] sArr18 = sArr7;
                    m48584(interfaceC14770, C0866.m55652(sArr18, 307, 22, i63), C1003.m56132(f82969, 329, 4, i63));
                    sArr8 = f82969;
                    i58 = 333;
                    if (C1017.f81942 >= 0) {
                        iM55681 = C0873.m55680("֡۬") ^ i51;
                        i6 = ((iM55681 ^ i50) * (-16703)) ^ 1608885174;
                        i7 = 1207858746;
                    } else {
                        iM55681 = (C0873.m55680("ۘ᩺") + i51) * 33;
                        i6 = ((iM55681 ^ i50) * (-29259)) ^ 978510727;
                        i7 = 1380321846;
                    }
                    int i67 = iM55681 ^ i7;
                    str36 = str49;
                    str37 = str48;
                    interfaceC14770M55951 = interfaceC147733;
                    strM56386 = str47;
                    sArr7 = sArr18;
                    strM56584 = str51;
                    i53 = i67;
                    i52 = i6;
                    str38 = str50;
                    interfaceC147728 = interfaceC147732;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i3;
                    interfaceC147725 = interfaceC14770;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case -1715202020:
                case 920457894:
                    C3826.m7474();
                    interfaceC147713 = interfaceC147728;
                    str20 = strM56386;
                    iM559716 = (C0873.m55680("᩹ܽ") + i50) * (-9);
                    i47 = ((iM559716 ^ i51) * (-27577)) ^ 2015954634;
                    i48 = -1182688671;
                    i53 = iM559716 ^ i48;
                    i52 = i47;
                    strM56386 = str20;
                    interfaceC147728 = interfaceC147713;
                    break;
                case -1643352169:
                case 652284172:
                    interfaceC147710 = interfaceC147728;
                    str17 = strM56386;
                    short[] sArr19 = sArr9;
                    i17 = i56;
                    i18 = i62;
                    i59 = i59;
                    strM56558 = strM56558;
                    interfaceC147711 = interfaceC147723;
                    str18 = str35;
                    i19 = i57;
                    str19 = str38;
                    interfaceC147712 = interfaceC14770M55951;
                    if (interfaceC147722 != null) {
                        sArr9 = sArr19;
                        interfaceC14770M55950 = interfaceC147722;
                        int iM55687 = C0873.m55680("ۗۜ") ^ i51;
                        InterfaceC14770 interfaceC147734 = interfaceC14770M55950;
                        i52 = ((iM55687 ^ i50) * 5003) ^ 862575026;
                        i53 = iM55687 ^ 173056021;
                        i62 = i18;
                        interfaceC14770M55951 = interfaceC147712;
                        strM56386 = str17;
                        str38 = str19;
                        i57 = i19;
                        str35 = str18;
                        interfaceC147723 = interfaceC147711;
                        strM56558 = strM56558;
                        i59 = i59;
                        i56 = i17;
                        interfaceC147728 = interfaceC147734;
                    } else {
                        int iM55688 = (C0873.m55680("᩵ۜ") ^ i51) * (-3);
                        sArr9 = sArr19;
                        i52 = ((iM55688 ^ i50) * 1259) ^ 1467434013;
                        i53 = iM55688 ^ (-1303358350);
                        i56 = i17;
                        i62 = i18;
                        interfaceC14770M55951 = interfaceC147712;
                        strM56386 = str17;
                        interfaceC147728 = interfaceC147710;
                        str38 = str19;
                        i57 = i19;
                        str35 = str18;
                        interfaceC147723 = interfaceC147711;
                        strM56558 = strM56558;
                        i59 = i59;
                    }
                    break;
                case -1630328498:
                case 1918208687:
                    C0854.m55595();
                    if (C0946.m55980() == 0) {
                        interfaceC14773 = interfaceC147728;
                        str9 = strM56386;
                        strM55993 = str37;
                        str10 = str36;
                        i59 = i59;
                        sArr3 = sArr8;
                        strM56558 = strM56558;
                        interfaceC14770 = interfaceC147725;
                        i3 = i62;
                        i56 = i56;
                        interfaceC147723 = interfaceC147723;
                        str35 = str35;
                        i57 = i57;
                        str11 = str38;
                        interfaceC14774 = interfaceC14770M55951;
                        str12 = strM56584;
                        i8 = i58;
                        iM559710 = C0946.m55979("ᩴ᩹") ^ i50;
                        i9 = ((iM559710 ^ i51) * (-26217)) ^ (-836222887);
                        i10 = 577278147;
                        i53 = iM559710 ^ i10;
                        sArr8 = sArr3;
                        i58 = i8;
                        interfaceC147728 = interfaceC14773;
                        strM56584 = str12;
                        str36 = str10;
                        interfaceC14770M55951 = interfaceC14774;
                        str37 = strM55993;
                        i52 = i9;
                        str38 = str11;
                        strM56386 = str9;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i59;
                    } else {
                        interfaceC14775 = interfaceC147728;
                        str9 = strM56386;
                        str13 = str37;
                        str14 = str36;
                        int i68 = i59;
                        strM56558 = strM56558;
                        interfaceC14770 = interfaceC147725;
                        i3 = i62;
                        i56 = i56;
                        interfaceC147723 = interfaceC147723;
                        str35 = str35;
                        i57 = i57;
                        str11 = str38;
                        interfaceC14776 = interfaceC14770M55951;
                        i11 = i68;
                        int iM559718 = (C0946.m55979("۫᩷") + i51) * 93;
                        i53 = iM559718 ^ 1228376821;
                        i52 = ((iM559718 ^ i50) * 18759) ^ (-1777461221);
                        str36 = str14;
                        interfaceC147728 = interfaceC14775;
                        str37 = str13;
                        strM56386 = str9;
                        int i69 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i11;
                        interfaceC14770M55951 = interfaceC14776;
                        str38 = str11;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i69;
                    }
                    break;
                case -1511893939:
                case -793600767:
                    str17 = strM56386;
                    interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(f67649);
                    i17 = i56;
                    i18 = i62;
                    i59 = i59;
                    strM56558 = strM56558;
                    interfaceC147711 = interfaceC147723;
                    str18 = str35;
                    i19 = i57;
                    str19 = str38;
                    interfaceC147712 = interfaceC14770M55951;
                    int iM55689 = C0873.m55680("ۗۜ") ^ i51;
                    InterfaceC14770 interfaceC147735 = interfaceC14770M55950;
                    i52 = ((iM55689 ^ i50) * 5003) ^ 862575026;
                    i53 = iM55689 ^ 173056021;
                    i62 = i18;
                    interfaceC14770M55951 = interfaceC147712;
                    strM56386 = str17;
                    str38 = str19;
                    i57 = i19;
                    str35 = str18;
                    interfaceC147723 = interfaceC147711;
                    strM56558 = strM56558;
                    i59 = i59;
                    i56 = i17;
                    interfaceC147728 = interfaceC147735;
                    break;
                case -1377941293:
                case 1358562635:
                    InterfaceC14770 interfaceC147736 = interfaceC147728;
                    str21 = strM56386;
                    m48584(interfaceC147736, C0946.m55986(sArr10, i60, 22, i63), RunnableC0897.m55783(f82969, 548, 4, i63));
                    interfaceC147724 = interfaceC147736;
                    interfaceC147716 = interfaceC147724;
                    i32 = i62;
                    i33 = i59;
                    str28 = strM56558;
                    i35 = i56;
                    interfaceC147718 = interfaceC147723;
                    strM55597 = str38;
                    interfaceC147717 = interfaceC14770M55951;
                    str29 = str35;
                    i34 = i57;
                    iM55684 = C0946.m55979("᩷֨") ^ i51;
                    i36 = ((iM55684 ^ i50) * (-6631)) ^ (-2065114618);
                    i37 = 2106347971;
                    i53 = iM55684 ^ i37;
                    i52 = i36;
                    i57 = i34;
                    str35 = str29;
                    interfaceC14770M55951 = interfaceC147717;
                    interfaceC147728 = interfaceC147716;
                    str38 = strM55597;
                    interfaceC147723 = interfaceC147718;
                    i56 = i35;
                    strM56558 = str28;
                    i62 = i32;
                    i59 = i33;
                    strM56386 = str21;
                    break;
                case -1313495137:
                case 378412940:
                    interfaceC147716 = interfaceC147728;
                    str21 = strM56386;
                    interfaceC147717 = interfaceC14770M55951;
                    int i70 = i56;
                    i32 = i62;
                    interfaceC147718 = interfaceC147723;
                    i33 = i59;
                    str28 = strM56558;
                    str29 = str35;
                    i34 = i57;
                    InterfaceC14100 interfaceC14101 = f67649;
                    i35 = i70;
                    strM55597 = C0854.m55597(f82969, 414, 12, i63);
                    if (interfaceC14101.contains(strM55597)) {
                        iM55684 = C0873.m55680("ۚ᩹") ^ i51;
                        i36 = ((iM55684 ^ i50) * 16457) ^ (-1830908364);
                        i37 = 314431227;
                    } else {
                        interfaceC147724 = interfaceC147722;
                        iM55684 = C0946.m55979("᩷֨") ^ i51;
                        i36 = ((iM55684 ^ i50) * (-6631)) ^ (-2065114618);
                        i37 = 2106347971;
                    }
                    i53 = iM55684 ^ i37;
                    i52 = i36;
                    i57 = i34;
                    str35 = str29;
                    interfaceC14770M55951 = interfaceC147717;
                    interfaceC147728 = interfaceC147716;
                    str38 = strM55597;
                    interfaceC147723 = interfaceC147718;
                    i56 = i35;
                    strM56558 = str28;
                    i62 = i32;
                    i59 = i33;
                    strM56386 = str21;
                    break;
                case -1308969121:
                case -1204076505:
                    int i71 = f67649.getInt(strM56386, 200000);
                    C0937.m55912(C0906.m55814(f67649).remove(strM56386));
                    f67650.edit().putInt(strM56386, i71).apply();
                    interfaceC147713 = interfaceC147728;
                    iM559715 = (C0946.m55979("ۜܳ") ^ i51) * 3;
                    i30 = ((iM559715 ^ i50) * 23215) ^ 529824753;
                    i46 = 1759462474;
                    i53 = iM559715 ^ i46;
                    i52 = i30;
                    interfaceC147728 = interfaceC147713;
                    break;
                case -1176118784:
                case -385530749:
                    interfaceC147713 = interfaceC147728;
                    str30 = strM56386;
                    m48580(interfaceC14770M55951, strM56558, C0906.m55810(sArr12, i55, i61, i63));
                    m48584(interfaceC14770M55951, C1044.m56276(f82969, 605, 29, i63), C0937.m55921(f82969, 634, 6, i63));
                    interfaceC147727 = interfaceC14770M55951;
                    i38 = i56;
                    i39 = i62;
                    interfaceC147719 = interfaceC147723;
                    i40 = i59;
                    str31 = strM56558;
                    str32 = str35;
                    i41 = i57;
                    str33 = str38;
                    interfaceC147720 = interfaceC147727;
                    iM559714 = C0946.m55979("ܺ᩻") ^ i51;
                    i42 = ((iM559714 ^ i50) * 945) ^ (-1685618152);
                    i43 = 1391797590;
                    i53 = iM559714 ^ i43;
                    i52 = i42;
                    i62 = i39;
                    strM56558 = str31;
                    interfaceC14770M55951 = interfaceC147720;
                    strM56386 = str30;
                    i59 = i40;
                    str38 = str33;
                    i57 = i41;
                    str35 = str32;
                    interfaceC147723 = interfaceC147719;
                    i56 = i38;
                    interfaceC147728 = interfaceC147713;
                    break;
                case -1053307775:
                case 752874085:
                    interfaceC14775 = interfaceC147728;
                    str9 = strM56386;
                    str13 = str37;
                    i59 = i59;
                    strM56558 = strM56558;
                    interfaceC14770 = interfaceC147725;
                    i3 = i62;
                    i56 = i56;
                    interfaceC147723 = interfaceC147723;
                    str35 = str35;
                    i57 = i57;
                    str11 = str38;
                    interfaceC14776 = interfaceC14770M55951;
                    m48584(interfaceC14770, strM56203, str13);
                    str14 = str36;
                    strM56584 = C1964.m56584(f82969, 360, 23, i63);
                    if (!C0955.f81898) {
                        int iM556810 = C0873.m55680("᩹᩻") ^ i50;
                        i53 = iM556810 ^ (-1394559131);
                        i52 = ((iM556810 ^ i51) * 15993) ^ 1810868400;
                        str36 = str14;
                        interfaceC14770M55951 = interfaceC14776;
                        interfaceC147728 = interfaceC14775;
                        str37 = str13;
                        str38 = str11;
                        strM56386 = str9;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i59;
                    } else {
                        i11 = i59;
                        int iM559719 = (C0946.m55979("۫᩷") + i51) * 93;
                        i53 = iM559719 ^ 1228376821;
                        i52 = ((iM559719 ^ i50) * 18759) ^ (-1777461221);
                        str36 = str14;
                        interfaceC147728 = interfaceC14775;
                        str37 = str13;
                        strM56386 = str9;
                        int i610 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i11;
                        interfaceC14770M55951 = interfaceC14776;
                        str38 = str11;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i610;
                    }
                    break;
                case -911403948:
                case 280019522:
                    str21 = strM56386;
                    interfaceC147721 = interfaceC147728;
                    str34 = str38;
                    if (interfaceC147724 == null) {
                        iM55685 = C0873.m55680("᩻᩶") ^ i51;
                        i44 = ((iM55685 ^ i50) * (-6471)) ^ 1568017180;
                        i45 = 991950409;
                    } else {
                        interfaceC14770M55951 = interfaceC147724;
                        iM55685 = (C0873.m55680("ۗܽ") ^ i50) * 55;
                        i44 = ((iM55685 ^ i51) * 15389) ^ 2083112216;
                        i45 = -2022333259;
                    }
                    i53 = iM55685 ^ i45;
                    str38 = str34;
                    interfaceC147728 = interfaceC147721;
                    i52 = i44;
                    strM56386 = str21;
                    break;
                case -812452483:
                case -785523609:
                    if (!C0866.m55645()) {
                        interfaceC147710 = interfaceC147728;
                        str17 = strM56386;
                        i59 = i59;
                        strM56558 = strM56558;
                        interfaceC147711 = interfaceC147723;
                        str18 = str35;
                        i19 = i57;
                        str19 = str38;
                        interfaceC147712 = interfaceC14770M55951;
                        iM559711 = (C0946.m55979("ܿܽ") + i51) * (-29);
                        i20 = ((iM559711 ^ i50) * 22943) ^ 1644786511;
                        i21 = -1884931300;
                        i53 = iM559711 ^ i21;
                        i52 = i20;
                        interfaceC14770M55951 = interfaceC147712;
                        strM56386 = str17;
                        interfaceC147728 = interfaceC147710;
                        str38 = str19;
                        i57 = i19;
                        str35 = str18;
                        interfaceC147723 = interfaceC147711;
                        strM56558 = strM56558;
                        i59 = i59;
                    } else {
                        iM55979 = C0946.m55979("᩶ۛ") ^ i50;
                        i = ((iM55979 ^ i51) * (-18097)) ^ 1979249256;
                        i2 = 1697886621;
                        i53 = iM55979 ^ i2;
                        i52 = i;
                    }
                    break;
                case -807441088:
                case 704409294:
                    InterfaceC14770 interfaceC147737 = interfaceC147728;
                    str21 = strM56386;
                    C1194.m56383(interfaceC147727);
                    str34 = str38;
                    interfaceC147721 = interfaceC147737;
                    iM55685 = (i51 - C0946.m55979("ܰۚ")) * 97;
                    i44 = ((iM55685 ^ i50) * (-24929)) ^ 1801656416;
                    i45 = -113825491;
                    i53 = iM55685 ^ i45;
                    str38 = str34;
                    interfaceC147728 = interfaceC147721;
                    i52 = i44;
                    strM56386 = str21;
                    break;
                case -769121775:
                case -47864400:
                    i63 = 23855;
                    iM55683 = C0873.m55680("ۨ᩸") ^ i51;
                    i26 = ((iM55683 ^ i50) * 19631) ^ 455236220;
                    i27 = 683214041;
                    int i72 = iM55683 ^ i27;
                    sArr6 = sArr6;
                    sArr8 = sArr8;
                    interfaceC14770M55951 = interfaceC14770M55951;
                    strM56386 = strM56386;
                    interfaceC147728 = interfaceC147728;
                    sArr7 = sArr7;
                    i53 = i72;
                    i52 = i26;
                    str36 = str36;
                    str37 = str37;
                    strM56558 = strM56558;
                    str38 = str38;
                    strM56584 = strM56584;
                    i59 = i59;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i62;
                    interfaceC147725 = interfaceC147725;
                    strM55811 = strM55811;
                    break;
                case -726219628:
                case 80740486:
                    C0845.m55584();
                    if (!C0882.f81846) {
                        interfaceC14775 = interfaceC147728;
                        str9 = strM56386;
                        str13 = str37;
                        str14 = str36;
                        int i611 = i59;
                        strM56558 = strM56558;
                        interfaceC14770 = interfaceC147725;
                        i3 = i62;
                        i56 = i56;
                        interfaceC147723 = interfaceC147723;
                        str35 = str35;
                        i57 = i57;
                        str11 = str38;
                        interfaceC14776 = interfaceC14770M55951;
                        i11 = i611;
                        int iM5597110 = (C0946.m55979("۫᩷") + i51) * 93;
                        i53 = iM5597110 ^ 1228376821;
                        i52 = ((iM5597110 ^ i50) * 18759) ^ (-1777461221);
                        str36 = str14;
                        interfaceC147728 = interfaceC14775;
                        str37 = str13;
                        strM56386 = str9;
                        int i612 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i11;
                        interfaceC14770M55951 = interfaceC14776;
                        str38 = str11;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i612;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۢ") + i50) * (-49);
                        i = ((iM55979 ^ i51) * 7515) ^ (-333450301);
                        i2 = 367893714;
                        i53 = iM55979 ^ i2;
                        i52 = i;
                    }
                    break;
                case -715420801:
                case -34213379:
                    interfaceC147713 = interfaceC147728;
                    str20 = strM56386;
                    m48584(interfaceC14770M55951, strM56189, C0873.m55689(f82969, 573, 4, i63));
                    sArr11 = f82969;
                    i54 = 577;
                    if (C1044.f81959 >= 0) {
                        iM559716 = (C0946.m55979("ۗ֫") ^ i51) * (-91);
                        i47 = ((iM559716 ^ i50) * 26339) ^ (-1616669570);
                        i48 = -1277451029;
                    } else {
                        iM559716 = C0873.m55680("᩺᩵") ^ i51;
                        i47 = ((iM559716 ^ i50) * 24091) ^ 1215290351;
                        i48 = -683748500;
                    }
                    i53 = iM559716 ^ i48;
                    i52 = i47;
                    strM56386 = str20;
                    interfaceC147728 = interfaceC147713;
                    break;
                case -697529323:
                case -259416521:
                    interfaceC14777 = interfaceC147728;
                    str15 = strM56386;
                    i12 = i62;
                    i59 = i59;
                    i13 = i57;
                    str16 = str38;
                    strM56558 = strM56558;
                    interfaceC14778 = interfaceC14770M55951;
                    i14 = i56;
                    interfaceC14779 = interfaceC147723;
                    InterfaceC14100 interfaceC14102 = f67649;
                    strM55810 = C0906.m55810(f82969, 391, 23, i63);
                    if (interfaceC14102.contains(strM55810)) {
                        iM55682 = (C0873.m55680("ۚ֡") + i50) * (-41);
                        i15 = ((iM55682 ^ i51) * (-30605)) ^ (-2045601641);
                        i16 = -522576235;
                    } else {
                        interfaceC147722 = interfaceC147726;
                        iM55682 = C0946.m55979("۟ۚ") ^ i50;
                        i15 = ((iM55682 ^ i51) * 31661) ^ 2135877476;
                        i16 = -1760648572;
                    }
                    i53 = iM55682 ^ i16;
                    i52 = i15;
                    interfaceC147723 = interfaceC14779;
                    i56 = i14;
                    interfaceC14770M55951 = interfaceC14778;
                    interfaceC147728 = interfaceC14777;
                    i62 = i12;
                    str38 = str16;
                    strM56386 = str15;
                    i57 = i13;
                    str35 = strM55810;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case -625898631:
                case -156926363:
                    strM56558 = strM56558;
                    interfaceC14775 = interfaceC147728;
                    str9 = strM56386;
                    short[] sArr20 = sArr9;
                    int i73 = i56;
                    int i74 = i62;
                    InterfaceC14770 interfaceC147738 = interfaceC147723;
                    str11 = str38;
                    interfaceC14776 = interfaceC14770M55951;
                    str35 = str35;
                    String str52 = strM55852;
                    m48584(interfaceC147738, str52, C0854.m55597(sArr20, i73, i74, i63));
                    sArr13 = f82969;
                    if (C1964.f83032 <= 0) {
                        sArr9 = sArr20;
                        interfaceC147723 = interfaceC147738;
                        i56 = i73;
                        strM55852 = str52;
                        interfaceC14770 = interfaceC147725;
                        i11 = 483;
                        i57 = 4;
                        i3 = i74;
                        str13 = str37;
                        str14 = str36;
                        int iM5597111 = (C0946.m55979("۫᩷") + i51) * 93;
                        i53 = iM5597111 ^ 1228376821;
                        i52 = ((iM5597111 ^ i50) * 18759) ^ (-1777461221);
                        str36 = str14;
                        interfaceC147728 = interfaceC14775;
                        str37 = str13;
                        strM56386 = str9;
                        int i613 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i11;
                        interfaceC14770M55951 = interfaceC14776;
                        str38 = str11;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i613;
                    } else {
                        int iM559720 = (C0946.m55979("ᩴ֨") ^ i51) * (-7);
                        int i75 = ((iM559720 ^ i50) * 24891) ^ (-862007955);
                        i53 = iM559720 ^ (-1701086901);
                        sArr9 = sArr20;
                        i56 = i73;
                        i62 = i74;
                        i52 = i75;
                        strM55852 = str52;
                        str35 = str35;
                        interfaceC14770M55951 = interfaceC14776;
                        strM56386 = str9;
                        interfaceC147728 = interfaceC14775;
                        interfaceC147723 = interfaceC147738;
                        strM56558 = strM56558;
                        str38 = str11;
                        i59 = 483;
                        i57 = 4;
                    }
                    break;
                case -588357257:
                case 19401770:
                    str = strM56584;
                    str2 = str36;
                    interfaceC14770 = interfaceC147725;
                    i3 = i62;
                    interfaceC147726 = null;
                    int iM5597112 = C0946.m55979("᩶ܶ") ^ i51;
                    strM55811 = strM55811;
                    sArr6 = sArr6;
                    sArr8 = sArr8;
                    strM56386 = strM56386;
                    interfaceC147728 = interfaceC147728;
                    sArr7 = sArr7;
                    i53 = iM5597112 ^ (-992572257);
                    i52 = ((iM5597112 ^ i50) * 21847) ^ 1165684090;
                    str36 = str2;
                    str37 = str37;
                    interfaceC14770M55951 = interfaceC14770M55951;
                    strM56584 = str;
                    str38 = str38;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i3;
                    interfaceC147725 = interfaceC14770;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case -480135809:
                case 1391630033:
                    interfaceC147713 = interfaceC147728;
                    str20 = strM56386;
                    strM56558 = C1929.m56558(sArr11, i54, 24, i63);
                    sArr12 = f82969;
                    i55 = 601;
                    i61 = 4;
                    if (C0866.f81837 >= 0) {
                        iM559716 = C0873.m55680("ܰ᩷") ^ i51;
                        i47 = ((iM559716 ^ i50) * (-28315)) ^ 54894872;
                        i48 = 759198360;
                    } else {
                        iM559716 = C0946.m55979("۟۫") ^ i50;
                        i47 = ((iM559716 ^ i51) * 14719) ^ (-1986320513);
                        i48 = -809614929;
                    }
                    i53 = iM559716 ^ i48;
                    i52 = i47;
                    strM56386 = str20;
                    interfaceC147728 = interfaceC147713;
                    break;
                case -259631428:
                case 293288238:
                    interfaceC147710 = interfaceC147728;
                    str17 = strM56386;
                    i59 = i59;
                    strM56558 = strM56558;
                    interfaceC147711 = interfaceC147723;
                    str18 = str35;
                    i19 = i57;
                    str19 = str38;
                    interfaceC147712 = interfaceC14770M55951;
                    strM55852 = C0917.m55852(f82969, Scalar448.TARGET_LENGTH, 31, i63);
                    sArr9 = f82969;
                    i56 = 478;
                    i62 = 5;
                    if (C1046.f81962 <= 0) {
                        iM559711 = (C0946.m55979("ܿܽ") + i51) * (-29);
                        i20 = ((iM559711 ^ i50) * 22943) ^ 1644786511;
                        i21 = -1884931300;
                    } else {
                        iM559711 = C0946.m55979("۬ۡ") ^ i50;
                        i20 = ((iM559711 ^ i51) * (-15181)) ^ 632359643;
                        i21 = -66418484;
                    }
                    i53 = iM559711 ^ i21;
                    i52 = i20;
                    interfaceC14770M55951 = interfaceC147712;
                    strM56386 = str17;
                    interfaceC147728 = interfaceC147710;
                    str38 = str19;
                    i57 = i19;
                    str35 = str18;
                    interfaceC147723 = interfaceC147711;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case -182103307:
                case -171336521:
                    str20 = strM56386;
                    interfaceC147713 = interfaceC147728;
                    if (f67649.mo20200(16, RunnableC0871.m55667(f82969, 640, 3, i63))) {
                        iM559716 = (C0946.m55979("ܿۜ") ^ i51) * (-9);
                        i47 = ((iM559716 ^ i50) * 25647) ^ (-627960713);
                        i48 = -1317492961;
                    } else {
                        iM559716 = (C0873.m55680("᩹ܽ") + i50) * (-9);
                        i47 = ((iM559716 ^ i51) * (-27577)) ^ 2015954634;
                        i48 = -1182688671;
                    }
                    i53 = iM559716 ^ i48;
                    i52 = i47;
                    strM56386 = str20;
                    interfaceC147728 = interfaceC147713;
                    break;
                case -162044626:
                case 984183795:
                    str30 = strM56386;
                    InterfaceC14770 interfaceC147739 = interfaceC147728;
                    String str53 = str38;
                    interfaceC14770M55815 = C0906.m55814(f67649);
                    interfaceC147713 = interfaceC147739;
                    interfaceC147720 = interfaceC14770M55951;
                    i39 = i62;
                    str32 = str35;
                    i40 = i59;
                    i41 = i57;
                    str31 = strM56558;
                    str33 = str53;
                    i38 = i56;
                    int iM559721 = C0946.m55979("֨ᩴ") ^ i50;
                    int i76 = ((iM559721 ^ i51) * (-21257)) ^ (-1119597778);
                    i53 = iM559721 ^ (-700628560);
                    i56 = i38;
                    i62 = i39;
                    strM56558 = str31;
                    strM56386 = str30;
                    interfaceC147728 = interfaceC147713;
                    i59 = i40;
                    String str54 = str32;
                    interfaceC147723 = interfaceC14770M55815;
                    i52 = i76;
                    interfaceC14770M55951 = interfaceC147720;
                    str38 = str33;
                    i57 = i41;
                    str35 = str54;
                    break;
                case -100298738:
                case 201192183:
                    str15 = strM56386;
                    i59 = i59;
                    strM56558 = strM56558;
                    InterfaceC14770 interfaceC147740 = interfaceC147728;
                    int i77 = i57;
                    str16 = str38;
                    String strM55994 = C0947.m55993(sArr13, i59, i77, i63);
                    String str55 = str35;
                    i13 = i77;
                    InterfaceC14770 interfaceC147741 = interfaceC147723;
                    m48580(interfaceC147741, str55, strM55994);
                    interfaceC14777 = interfaceC147740;
                    interfaceC14778 = interfaceC14770M55951;
                    m48584(interfaceC147741, C0890.m55726(f82969, 487, 31, i63), C0930.m55893(f82969, 518, 5, i63));
                    interfaceC147722 = interfaceC147741;
                    i12 = i62;
                    i14 = i56;
                    strM55810 = str55;
                    interfaceC14779 = interfaceC147722;
                    iM55682 = C0946.m55979("۟ۚ") ^ i50;
                    i15 = ((iM55682 ^ i51) * 31661) ^ 2135877476;
                    i16 = -1760648572;
                    i53 = iM55682 ^ i16;
                    i52 = i15;
                    interfaceC147723 = interfaceC14779;
                    i56 = i14;
                    interfaceC14770M55951 = interfaceC14778;
                    interfaceC147728 = interfaceC14777;
                    i62 = i12;
                    str38 = str16;
                    strM56386 = str15;
                    i57 = i13;
                    str35 = strM55810;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case 58971444:
                case 1826347174:
                    C0898.m55800();
                    if (!C1024.f81946) {
                        interfaceC147710 = interfaceC147728;
                        str17 = strM56386;
                        i59 = i59;
                        strM56558 = strM56558;
                        interfaceC147711 = interfaceC147723;
                        str18 = str35;
                        i19 = i57;
                        str19 = str38;
                        interfaceC147712 = interfaceC14770M55951;
                        iM559711 = (C0946.m55979("ܿܽ") + i51) * (-29);
                        i20 = ((iM559711 ^ i50) * 22943) ^ 1644786511;
                        i21 = -1884931300;
                        i53 = iM559711 ^ i21;
                        i52 = i20;
                        interfaceC14770M55951 = interfaceC147712;
                        strM56386 = str17;
                        interfaceC147728 = interfaceC147710;
                        str38 = str19;
                        i57 = i19;
                        str35 = str18;
                        interfaceC147723 = interfaceC147711;
                        strM56558 = strM56558;
                        i59 = i59;
                    } else {
                        interfaceC147713 = interfaceC147728;
                        str20 = strM56386;
                        iM559716 = (C0946.m55979("ۗ֫") ^ i51) * (-91);
                        i47 = ((iM559716 ^ i50) * 26339) ^ (-1616669570);
                        i48 = -1277451029;
                        i53 = iM559716 ^ i48;
                        i52 = i47;
                        strM56386 = str20;
                        interfaceC147728 = interfaceC147713;
                    }
                    break;
                case 255889466:
                case 1051840637:
                    InterfaceC14770 interfaceC147742 = interfaceC147728;
                    str21 = strM56386;
                    interfaceC14770M55951 = ViewOnClickListenerC0939.m55950(f67649);
                    str34 = str38;
                    interfaceC147721 = interfaceC147742;
                    iM55685 = (C0873.m55680("ۗܽ") ^ i50) * 55;
                    i44 = ((iM55685 ^ i51) * 15389) ^ 2083112216;
                    i45 = -2022333259;
                    i53 = iM55685 ^ i45;
                    str38 = str34;
                    interfaceC147728 = interfaceC147721;
                    i52 = i44;
                    strM56386 = str21;
                    break;
                case 421307127:
                case 1603529188:
                    break;
                case 449415773:
                case 1013442587:
                    break;
                case 670841286:
                case 1277615190:
                    interfaceC14771 = interfaceC147728;
                    str3 = strM56386;
                    str4 = strM56584;
                    i59 = i59;
                    strM56558 = strM56558;
                    str5 = str37;
                    str6 = str36;
                    interfaceC14770 = interfaceC147725;
                    i3 = i62;
                    sArr = sArr8;
                    i56 = i56;
                    interfaceC147723 = interfaceC147723;
                    str35 = str35;
                    i57 = i57;
                    str7 = str38;
                    interfaceC14772 = interfaceC14770M55951;
                    sArr2 = sArr6;
                    str8 = strM55811;
                    m48584(interfaceC14770, str8, C0882.m55717(sArr2, 304, 3, i63));
                    sArr7 = f82969;
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("ܳᩳ") ^ i50;
                        i4 = ((iM55680 ^ i51) * 12953) ^ 62493850;
                        i5 = 624489044;
                    } else {
                        iM55680 = C0873.m55680("֫۠") ^ i50;
                        i4 = ((iM55680 ^ i51) * 9331) ^ 197418583;
                        i5 = -1127316971;
                    }
                    i53 = iM55680 ^ i5;
                    strM55811 = str8;
                    sArr6 = sArr2;
                    i52 = i4;
                    sArr8 = sArr;
                    interfaceC14770M55951 = interfaceC14772;
                    strM56386 = str3;
                    interfaceC147728 = interfaceC14771;
                    str36 = str6;
                    str37 = str5;
                    str38 = str7;
                    strM56584 = str4;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i3;
                    interfaceC147725 = interfaceC14770;
                    strM56558 = strM56558;
                    i59 = i59;
                    break;
                case 704246326:
                case 1290138545:
                    C1046.m56302();
                    C1124.m56367();
                    iM55979 = (C0946.m55979("ᩳۢ") + i50) * (-49);
                    i = ((iM55979 ^ i51) * 7515) ^ (-333450301);
                    i2 = 367893714;
                    i53 = iM55979 ^ i2;
                    i52 = i;
                    break;
                case 723285684:
                case 784339240:
                    interfaceC147713 = interfaceC147728;
                    str30 = strM56386;
                    i38 = i56;
                    i39 = i62;
                    interfaceC147719 = interfaceC147723;
                    i40 = i59;
                    str31 = strM56558;
                    str32 = str35;
                    i41 = i57;
                    str33 = str38;
                    interfaceC147720 = interfaceC14770M55951;
                    if (interfaceC147726 != null) {
                        interfaceC14770M55815 = interfaceC147726;
                        int iM559722 = C0946.m55979("֨ᩴ") ^ i50;
                        int i78 = ((iM559722 ^ i51) * (-21257)) ^ (-1119597778);
                        i53 = iM559722 ^ (-700628560);
                        i56 = i38;
                        i62 = i39;
                        strM56558 = str31;
                        strM56386 = str30;
                        interfaceC147728 = interfaceC147713;
                        i59 = i40;
                        String str56 = str32;
                        interfaceC147723 = interfaceC14770M55815;
                        i52 = i78;
                        interfaceC14770M55951 = interfaceC147720;
                        str38 = str33;
                        i57 = i41;
                        str35 = str56;
                    } else {
                        iM559714 = C0946.m55979("ۢ᩹") ^ i50;
                        i42 = ((iM559714 ^ i51) * (-32159)) ^ (-1486931198);
                        i43 = -789818311;
                        i53 = iM559714 ^ i43;
                        i52 = i42;
                        i62 = i39;
                        strM56558 = str31;
                        interfaceC14770M55951 = interfaceC147720;
                        strM56386 = str30;
                        i59 = i40;
                        str38 = str33;
                        i57 = i41;
                        str35 = str32;
                        interfaceC147723 = interfaceC147719;
                        i56 = i38;
                        interfaceC147728 = interfaceC147713;
                    }
                    break;
                case 799259539:
                case 1457055153:
                    interfaceC147713 = interfaceC147728;
                    InterfaceC14100 interfaceC14103 = f67649;
                    strM56386 = C1194.m56386(f82969, 552, 21, i63);
                    if (interfaceC14103.contains(strM56386)) {
                        iM559715 = (i50 - C0946.m55979("ۡᩴ")) * 51;
                        i30 = ((iM559715 ^ i51) * (-7939)) ^ (-1451733573);
                        i46 = 113715400;
                    } else {
                        iM559715 = (C0946.m55979("ۜܳ") ^ i51) * 3;
                        i30 = ((iM559715 ^ i50) * 23215) ^ 529824753;
                        i46 = 1759462474;
                    }
                    i53 = iM559715 ^ i46;
                    i52 = i30;
                    interfaceC147728 = interfaceC147713;
                    break;
                case 809698785:
                case 1782784480:
                    interfaceC147713 = interfaceC147728;
                    str21 = strM56386;
                    str22 = strM56584;
                    i22 = i62;
                    i23 = i59;
                    sArr4 = sArr7;
                    str23 = strM56558;
                    str24 = str37;
                    str25 = str36;
                    i24 = i56;
                    interfaceC147714 = interfaceC147723;
                    sArr5 = sArr8;
                    str26 = str35;
                    i25 = i57;
                    str27 = str38;
                    interfaceC147715 = interfaceC14770M55951;
                    interfaceC14770M55814 = C0906.m55814(f67649);
                    strM55811 = C0906.m55810(f82969, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 19, i63);
                    sArr6 = f82969;
                    if (C0892.f81851) {
                        iM559713 = (C0946.m55979("ۜᩳ") + i51) * 73;
                        i30 = ((iM559713 ^ i50) * 10443) ^ 755401997;
                        i31 = -914894799;
                    } else {
                        iM559713 = (C0946.m55979("᩻᩸") + i50) * 21;
                        i30 = ((iM559713 ^ i51) * (-23691)) ^ (-655938828);
                        i31 = 1279052303;
                    }
                    int i614 = iM559713 ^ i31;
                    sArr8 = sArr5;
                    interfaceC14770M55951 = interfaceC147715;
                    strM56386 = str21;
                    sArr7 = sArr4;
                    i53 = i614;
                    str36 = str25;
                    str37 = str24;
                    strM56558 = str23;
                    str38 = str27;
                    strM56584 = str22;
                    i59 = i23;
                    i57 = i25;
                    str35 = str26;
                    interfaceC147723 = interfaceC147714;
                    i56 = i24;
                    i62 = i22;
                    interfaceC147725 = interfaceC14770M55814;
                    i52 = i30;
                    interfaceC147728 = interfaceC147713;
                    break;
                case 1002894462:
                case 1722414847:
                    str21 = strM56386;
                    interfaceC147721 = interfaceC147728;
                    str34 = str38;
                    if (interfaceC147727 != null) {
                        iM55685 = C0873.m55680("ۜ۟") ^ i50;
                        i44 = ((iM55685 ^ i51) * 27937) ^ 999639877;
                        i45 = 256338829;
                    } else {
                        iM55685 = (i51 - C0946.m55979("ܰۚ")) * 97;
                        i44 = ((iM55685 ^ i50) * (-24929)) ^ 1801656416;
                        i45 = -113825491;
                    }
                    i53 = iM55685 ^ i45;
                    str38 = str34;
                    interfaceC147728 = interfaceC147721;
                    i52 = i44;
                    strM56386 = str21;
                    break;
                case 1040995288:
                case 1723393893:
                    str21 = strM56386;
                    interfaceC147721 = interfaceC147728;
                    str34 = str38;
                    m48580(interfaceC147721, str34, C0992.m56102(f82969, 523, 3, i63));
                    sArr10 = f82969;
                    i60 = 526;
                    if (C0854.m55595() < 0) {
                        iM55685 = C0873.m55680("ۧܺ") ^ i50;
                        i44 = ((iM55685 ^ i51) * 23159) ^ (-207510443);
                        i45 = 1983973048;
                        i53 = iM55685 ^ i45;
                        str38 = str34;
                        interfaceC147728 = interfaceC147721;
                        i52 = i44;
                        strM56386 = str21;
                    } else {
                        interfaceC147713 = interfaceC147721;
                        interfaceC147715 = interfaceC14770M55951;
                        interfaceC14770M55814 = interfaceC147725;
                        str22 = strM56584;
                        i22 = i62;
                        i23 = i59;
                        sArr4 = sArr7;
                        str23 = strM56558;
                        str24 = str37;
                        str25 = str36;
                        i24 = i56;
                        interfaceC147714 = interfaceC147723;
                        sArr5 = sArr8;
                        str26 = str35;
                        i25 = i57;
                        str27 = str34;
                        iM559713 = (C0946.m55979("᩻᩸") + i50) * 21;
                        i30 = ((iM559713 ^ i51) * (-23691)) ^ (-655938828);
                        i31 = 1279052303;
                        int i615 = iM559713 ^ i31;
                        sArr8 = sArr5;
                        interfaceC14770M55951 = interfaceC147715;
                        strM56386 = str21;
                        sArr7 = sArr4;
                        i53 = i615;
                        str36 = str25;
                        str37 = str24;
                        strM56558 = str23;
                        str38 = str27;
                        strM56584 = str22;
                        i59 = i23;
                        i57 = i25;
                        str35 = str26;
                        interfaceC147723 = interfaceC147714;
                        i56 = i24;
                        i62 = i22;
                        interfaceC147725 = interfaceC14770M55814;
                        i52 = i30;
                        interfaceC147728 = interfaceC147713;
                    }
                    break;
                case 1133204600:
                case 1774059091:
                    if (C0927.m55873() > 0) {
                        interfaceC147713 = interfaceC147728;
                        str20 = strM56386;
                        iM559716 = C0873.m55680("ܰ᩷") ^ i51;
                        i47 = ((iM559716 ^ i50) * (-28315)) ^ 54894872;
                        i48 = 759198360;
                        i53 = iM559716 ^ i48;
                        i52 = i47;
                        strM56386 = str20;
                        interfaceC147728 = interfaceC147713;
                    } else {
                        interfaceC147710 = interfaceC147728;
                        str17 = strM56386;
                        i59 = i59;
                        strM56558 = strM56558;
                        interfaceC147711 = interfaceC147723;
                        str18 = str35;
                        i19 = i57;
                        str19 = str38;
                        interfaceC147712 = interfaceC14770M55951;
                        iM559711 = (C0946.m55979("ܿܽ") + i51) * (-29);
                        i20 = ((iM559711 ^ i50) * 22943) ^ 1644786511;
                        i21 = -1884931300;
                        i53 = iM559711 ^ i21;
                        i52 = i20;
                        interfaceC14770M55951 = interfaceC147712;
                        strM56386 = str17;
                        interfaceC147728 = interfaceC147710;
                        str38 = str19;
                        i57 = i19;
                        str35 = str18;
                        interfaceC147723 = interfaceC147711;
                        strM56558 = strM56558;
                        i59 = i59;
                    }
                    break;
                case 1233517333:
                case 1912757108:
                    i63 = 1400;
                    iM55683 = C0873.m55680("ۨ᩸") ^ i51;
                    i26 = ((iM55683 ^ i50) * 19631) ^ 455236220;
                    i27 = 683214041;
                    int i79 = iM55683 ^ i27;
                    sArr6 = sArr6;
                    sArr8 = sArr8;
                    interfaceC14770M55951 = interfaceC14770M55951;
                    strM56386 = strM56386;
                    interfaceC147728 = interfaceC147728;
                    sArr7 = sArr7;
                    i53 = i79;
                    i52 = i26;
                    str36 = str36;
                    str37 = str37;
                    strM56558 = strM56558;
                    str38 = str38;
                    strM56584 = strM56584;
                    i59 = i59;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i62;
                    interfaceC147725 = interfaceC147725;
                    strM55811 = strM55811;
                    break;
                case 1238582010:
                case 1448561581:
                    interfaceC147713 = interfaceC147728;
                    str30 = strM56386;
                    i38 = i56;
                    i39 = i62;
                    i40 = i59;
                    str31 = strM56558;
                    InterfaceC14770 interfaceC147743 = interfaceC147723;
                    str32 = str35;
                    i41 = i57;
                    str33 = str38;
                    interfaceC147720 = interfaceC14770M55951;
                    InterfaceC14100 interfaceC14104 = f67649;
                    interfaceC147719 = interfaceC147743;
                    strM56189 = C1017.m56189(f82969, 426, 21, i63);
                    if (interfaceC14104.contains(strM56189)) {
                        iM559714 = C0946.m55979("᩻᩹") ^ i50;
                        i42 = ((iM559714 ^ i51) * (-12143)) ^ 167225600;
                        i43 = -283802166;
                    } else {
                        interfaceC147727 = interfaceC147724;
                        iM559714 = C0946.m55979("ܺ᩻") ^ i51;
                        i42 = ((iM559714 ^ i50) * 945) ^ (-1685618152);
                        i43 = 1391797590;
                    }
                    i53 = iM559714 ^ i43;
                    i52 = i42;
                    i62 = i39;
                    strM56558 = str31;
                    interfaceC14770M55951 = interfaceC147720;
                    strM56386 = str30;
                    i59 = i40;
                    str38 = str33;
                    i57 = i41;
                    str35 = str32;
                    interfaceC147723 = interfaceC147719;
                    i56 = i38;
                    interfaceC147728 = interfaceC147713;
                    break;
                case 1718233449:
                case 1742745821:
                    interfaceC147728 = interfaceC147728;
                    strM56386 = strM56386;
                    strM55811 = strM55811;
                    interfaceC147725 = interfaceC147725;
                    strM56584 = strM56584;
                    i62 = i62;
                    i59 = i59;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    strM56558 = strM56558;
                    str37 = str37;
                    str36 = str36;
                    i56 = i56;
                    interfaceC147723 = interfaceC147723;
                    sArr8 = sArr8;
                    str35 = str35;
                    i57 = i57;
                    str38 = str38;
                    interfaceC14770M55951 = interfaceC14770M55951;
                    short s = f82969[265];
                    int i80 = s + 18363;
                    if ((i80 * i80) - (s * 73452) < 0) {
                        iM55683 = C0946.m55979("ܿ᩺") ^ i51;
                        i26 = ((iM55683 ^ i50) * 6473) ^ (-617878550);
                        i27 = -428543966;
                    } else {
                        iM55683 = (C0873.m55680("ۧܽ") + i50) * 23;
                        i26 = ((iM55683 ^ i51) * 28131) ^ (-1505414089);
                        i27 = 150386798;
                    }
                    int i710 = iM55683 ^ i27;
                    sArr6 = sArr6;
                    sArr8 = sArr8;
                    interfaceC14770M55951 = interfaceC14770M55951;
                    strM56386 = strM56386;
                    interfaceC147728 = interfaceC147728;
                    sArr7 = sArr7;
                    i53 = i710;
                    i52 = i26;
                    str36 = str36;
                    str37 = str37;
                    strM56558 = strM56558;
                    str38 = str38;
                    strM56584 = strM56584;
                    i59 = i59;
                    i57 = i57;
                    str35 = str35;
                    interfaceC147723 = interfaceC147723;
                    i56 = i56;
                    i62 = i62;
                    interfaceC147725 = interfaceC147725;
                    strM55811 = strM55811;
                    break;
                default:
                    if (!C0917.f81868) {
                        interfaceC14771 = interfaceC147728;
                        str3 = strM56386;
                        str8 = strM55811;
                        str4 = strM56584;
                        i59 = i59;
                        sArr2 = sArr6;
                        strM56558 = strM56558;
                        str5 = str37;
                        str6 = str36;
                        interfaceC14770 = interfaceC147725;
                        i3 = i62;
                        sArr = sArr8;
                        i56 = i56;
                        interfaceC147723 = interfaceC147723;
                        str35 = str35;
                        i57 = i57;
                        str7 = str38;
                        interfaceC14772 = interfaceC14770M55951;
                        iM55680 = C0873.m55680("ܳᩳ") ^ i50;
                        i4 = ((iM55680 ^ i51) * 12953) ^ 62493850;
                        i5 = 624489044;
                        i53 = iM55680 ^ i5;
                        strM55811 = str8;
                        sArr6 = sArr2;
                        i52 = i4;
                        sArr8 = sArr;
                        interfaceC14770M55951 = interfaceC14772;
                        strM56386 = str3;
                        interfaceC147728 = interfaceC14771;
                        str36 = str6;
                        str37 = str5;
                        str38 = str7;
                        strM56584 = str4;
                        i57 = i57;
                        str35 = str35;
                        interfaceC147723 = interfaceC147723;
                        i56 = i56;
                        i62 = i3;
                        interfaceC147725 = interfaceC14770;
                        strM56558 = strM56558;
                        i59 = i59;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۢ") + i50) * (-49);
                        i = ((iM55979 ^ i51) * 7515) ^ (-333450301);
                        i2 = 367893714;
                        i53 = iM55979 ^ i2;
                        i52 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0477 A[PHI: r6 r7 r13 r14
      0x0477: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:120:0x0475, B:116:0x0454, B:70:0x01ad, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:120:0x0475, B:116:0x0454, B:70:0x01ad, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r13v3 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v2 short[]), (r13v1 short[]) binds: [B:120:0x0475, B:116:0x0454, B:70:0x01ad, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0477: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:120:0x0475, B:116:0x0454, B:70:0x01ad, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x04c3 A[PHI: r3
      0x04c3: PHI (r3v3 short) = (r3v2 short), (r3v1 short) binds: [B:125:0x04c1, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x04f6 A[PHI: r11 r12 r16
      0x04f6: PHI (r11v3 short[]) = 
      (r11v1 short[])
      (r11v2 short[])
      (r11v1 short[])
      (r11v1 short[])
      (r11v1 short[])
      (r11v1 short[])
      (r11v1 short[])
      (r11v1 short[])
     binds: [B:129:0x04f4, B:76:0x01d3, B:28:0x00b0, B:26:0x00ac, B:22:0x008b, B:19:0x0085, B:15:0x0069, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x04f6: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:129:0x04f4, B:76:0x01d3, B:28:0x00b0, B:26:0x00ac, B:22:0x008b, B:19:0x0085, B:15:0x0069, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x04f6: PHI (r16v4 char) = (r16v3 char), (r16v2 char), (r16v2 char), (r16v2 char), (r16v2 char), (r16v2 char), (r16v2 char), (r16v2 char) binds: [B:129:0x04f4, B:76:0x01d3, B:28:0x00b0, B:26:0x00ac, B:22:0x008b, B:19:0x0085, B:15:0x0069, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0528 A[PHI: r17 r22 r23
      0x0528: PHI (r17v3 int) = (r17v2 int), (r17v5 int) binds: [B:133:0x0526, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0528: PHI (r22v3 short[]) = (r22v2 short[]), (r22v1 short[]) binds: [B:133:0x0526, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0528: PHI (r23v4 int) = (r23v3 int), (r23v6 int) binds: [B:133:0x0526, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf A[PHI: r2 r4 r15
      0x00cf: PHI (r2v19 int) = (r2v18 int), (r2v2 int), (r2v2 int) binds: [B:34:0x00cd, B:19:0x0085, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:34:0x00cd, B:19:0x0085, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r15v3 short[]) = (r15v2 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:34:0x00cd, B:19:0x0085, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc A[PHI: r9 r10
      0x01fc: PHI (r9v3 short[]) = (r9v2 short[]), (r9v1 short[]) binds: [B:82:0x01fa, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r10v3 int) = (r10v2 int), (r10v1 int) binds: [B:82:0x01fa, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static String m48579(int i) {
        int iM55680;
        int i2;
        int i3;
        short s = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        short[] sArr3 = null;
        int i8 = 0;
        short[] sArr4 = null;
        int i9 = 877723103;
        int i10 = C1003.f81929;
        int i11 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("ܽۤ") ^ i10;
        int i12 = ((iM55979 ^ i11) * 27251) ^ 2042759308;
        int i13 = iM55979 ^ 325542127;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        short[] sArr5 = null;
        int i17 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-1375)) >> 31));
            switch (i9) {
                case -2104234973:
                case -1206790602:
                    return C1017.m56189(sArr2, i7, 7, i5);
                case -2099600463:
                case 594427991:
                    return ViewOnClickListenerC0939.m55947(f82969, 128, 17, i5);
                case -2089569117:
                case 389450186:
                    return C0927.m55863(f82969, 68, 8, i5);
                case -2084526186:
                case -1119693601:
                    return C0845.m55592(sArr, i6, 11, i5);
                case -2000877616:
                case 1368756488:
                    if (C0989.f81920 < 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = (i11 - C0946.m55979("ܽۘ")) * (-25);
                        i2 = ((iM55680 ^ i10) * 20519) ^ (-802973411);
                        i3 = 628012670;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1927194551:
                case 457435264:
                    sArr2 = f82969;
                    i7 = 52;
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = C0873.m55680("᩺۠") ^ i11;
                        i2 = ((iM55680 ^ i10) * (-9759)) ^ (-1023889173);
                        i3 = 1424300256;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1881876745:
                case -1802166230:
                    return C0912.m55829(i, C0967.m56077(sArr4, i14, i15, i5));
                case -1757907756:
                case -1123446133:
                    return C0845.m55592(f82969, 145, 24, i5);
                case -1701828371:
                case -1521648070:
                    return C0882.m55717(f82969, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 22, i5);
                case -1539647000:
                case -1145981251:
                    s = sArr5[c];
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("ܰ᩻") ^ i11) * 47;
                        i2 = ((iM55680 ^ i10) * 29285) ^ 1329606017;
                        i3 = -1306847544;
                    } else {
                        iM55680 = C0873.m55680("۫ۙ") ^ i10;
                        i2 = ((iM55680 ^ i11) * (-7217)) ^ 1414922531;
                        i3 = 1420038695;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1507509178:
                case 1604466450:
                    return C1044.m56276(f82969, 215, 7, i5);
                case -1491587089:
                case -1057800074:
                    C0845.m55584();
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = (C0873.m55680("ۘܶ") + i10) * 77;
                        i2 = ((iM55680 ^ i11) * (-2603)) ^ 537788862;
                        i3 = -215239061;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1464557035:
                case -1164432783:
                    int i18 = s + s2;
                    if (i4 - (i18 * i18) >= 0) {
                        iM55680 = (C0946.m55979("۠᩹") ^ i10) * 127;
                        i2 = ((iM55680 ^ i11) * 14197) ^ (-1654606816);
                        i3 = 525538094;
                    } else {
                        iM55680 = C0873.m55680("᩻ܳ") ^ i11;
                        i2 = ((iM55680 ^ i10) * (-23857)) ^ (-1729678323);
                        i3 = 1075762797;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1393942779:
                case 1027019784:
                    i5 = 64193;
                    iM55680 = C0873.m55680("ᩴܳ") ^ i11;
                    i2 = ((iM55680 ^ i10) * 5473) ^ 1686015224;
                    i3 = 531775042;
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1377164059:
                case 2099820813:
                    C0937.m55918();
                    if (C1024.m56209() >= 0) {
                        iM55680 = (i11 - C0946.m55979("ܽۘ")) * (-25);
                        i2 = ((iM55680 ^ i10) * 20519) ^ (-802973411);
                        i3 = 628012670;
                    } else {
                        iM55680 = (C0946.m55979("ܰ᩻") ^ i11) * 47;
                        i2 = ((iM55680 ^ i10) * 29285) ^ 1329606017;
                        i3 = -1306847544;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -1314390765:
                case 1122473285:
                    return C1404.m56462(f82969, 86, 5, i5);
                case -1283619003:
                case 932147317:
                    C1124.m56367();
                    iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                    i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                    i3 = -745912985;
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -857776898:
                case 306447060:
                    return C1229.m56403(f82969, 183, 12, i5);
                case -766331123:
                case 859842589:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = C0946.m55979("ۤۢ") ^ i10;
                        i2 = ((iM55680 ^ i11) * 20243) ^ (-1866960310);
                        i3 = 1944851742;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -763692177:
                case 1065257837:
                    C1194.m56396();
                    return null;
                case -506394296:
                case 1038186199:
                    return C0873.m55689(f82969, 210, 5, i5);
                case -453327525:
                case -19992729:
                    c = '(';
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = (C0873.m55680("۫᩻") + i10) * 65;
                        i2 = ((iM55680 ^ i11) * 3915) ^ 745217773;
                        i3 = 2059217381;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -404804603:
                case -229753080:
                    sArr = f82969;
                    i6 = 41;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("ۘܶ") + i10) * 77;
                        i2 = ((iM55680 ^ i11) * (-2603)) ^ 537788862;
                        i3 = -215239061;
                    } else {
                        iM55680 = C0946.m55979("ܿۘ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 15573) ^ 189853180;
                        i3 = 1370867414;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -308453884:
                case 2115611444:
                    return C1003.m56132(f82969, 222, 20, i5);
                case -272203256:
                case 1372784688:
                    sArr4 = f82969;
                    i14 = 257;
                    i15 = 8;
                    if (C0890.m55740()) {
                        iM55680 = (i10 - C0946.m55979("᩵ۡ")) * (-41);
                        i2 = ((iM55680 ^ i11) * (-28885)) ^ 1947521377;
                        i3 = -276796306;
                    } else {
                        iM55680 = (i11 - C0946.m55979("ܽۘ")) * (-25);
                        i2 = ((iM55680 ^ i10) * 20519) ^ (-802973411);
                        i3 = 628012670;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -213454835:
                case 2010082098:
                    if (Build.VERSION.SDK_INT < 30) {
                        iM55680 = C0946.m55979("ۙ۫") ^ i10;
                        i2 = ((iM55680 ^ i11) * (-22091)) ^ (-1258268993);
                        i3 = -978931873;
                    } else {
                        iM55680 = (i10 - C0946.m55979("ۤ᩸")) * (-11);
                        i2 = ((iM55680 ^ i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ (-731124648);
                        i3 = -595632250;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -162948201:
                case 2054380363:
                    return C0861.m55618(f82969, 91, 12, i5);
                case -104745949:
                case 61935171:
                    C0892.m55749();
                    if (C1046.m56302() != 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = C0946.m55979("֡ܺ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 27789) ^ 844467101;
                        i3 = -612880196;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -60134943:
                case 824106944:
                    sArr5 = f82969;
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("֨֡") ^ i11;
                        i2 = ((iM55680 ^ i10) * (-23235)) ^ (-750632956);
                        i3 = 1273982566;
                    } else {
                        iM55680 = (C0873.m55680("ۡۗ") ^ i11) * (-33);
                        i2 = ((iM55680 ^ i10) * 6961) ^ 80880430;
                        i3 = -1864799103;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case -21943635:
                case 191945677:
                    if (C0989.f81920 < 0) {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 8117) ^ (-1034600120);
                        i3 = -745912985;
                    } else {
                        iM55680 = C0946.m55979("ᩴ᩺") ^ i10;
                        i2 = ((iM55680 ^ i11) * 9227) ^ 778716586;
                        i3 = 566958253;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case 87118753:
                case 1154748682:
                    i5 = 50021;
                    iM55680 = C0873.m55680("ᩴܳ") ^ i11;
                    i2 = ((iM55680 ^ i10) * 5473) ^ 1686015224;
                    i3 = 531775042;
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case 147396150:
                case 279727044:
                    sArr3 = f82969;
                    i8 = 59;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("֡ܺ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 27789) ^ 844467101;
                        i3 = -612880196;
                    } else {
                        iM55680 = C0946.m55979("ۘ۟") ^ i10;
                        i2 = ((iM55680 ^ i11) * (-30775)) ^ (-1964046923);
                        i3 = 1089857021;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case 239201808:
                case 2051399892:
                    return C1017.m56189(f82969, 169, 14, i5);
                case 285818520:
                case 1727614853:
                    int i19 = i16 + i17;
                    i4 = i19 + i19;
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("֡ܺ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 27789) ^ 844467101;
                        i3 = -612880196;
                    } else {
                        iM55680 = (C0873.m55680("ۤܳ") + i11) * 33;
                        i2 = ((iM55680 ^ i10) * (-31071)) ^ 1945604198;
                        i3 = -1152028800;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case 811955312:
                case 1653368466:
                    return C1404.m56462(sArr3, i8, 9, i5);
                case 927364511:
                case 1234629422:
                    s2 = 6707;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("֡ܺ") ^ i11;
                        i2 = ((iM55680 ^ i10) * 27789) ^ 844467101;
                        i3 = -612880196;
                    } else {
                        iM55680 = (C0946.m55979("۠᩶") + i10) * 29;
                        i2 = ((iM55680 ^ i11) * (-2553)) ^ (-1775685986);
                        i3 = 1564609975;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                case 1012169786:
                case 1751240811:
                    return C1025.m56233(f82969, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 3, i5);
                case 1021972075:
                case 1185423538:
                    return C1025.m56233(f82969, 242, 15, i5);
                case 1194695870:
                case 2042659808:
                    return C0937.m55921(f82969, 76, 10, i5);
                case 1242414814:
                case 1703620740:
                    return C0989.m56092(f82969, 195, 15, i5);
                case 1487723490:
                case 1959976558:
                    switch (i) {
                        case 0:
                            iM55680 = C0946.m55979("ܺ᩷") ^ i10;
                            i2 = ((iM55680 ^ i11) * (-27115)) ^ (-1759516288);
                            i3 = -1353123236;
                            break;
                        case 1:
                            iM55680 = (i11 - C0946.m55979("ܽ۫")) * 29;
                            i2 = ((iM55680 ^ i10) * 6711) ^ 1292758220;
                            i3 = -550137876;
                            break;
                        case 2:
                            iM55680 = (C0946.m55979("ܶۙ") ^ i10) * C0254q.f1218h;
                            i2 = ((iM55680 ^ i11) * (-2279)) ^ 1906923262;
                            i3 = 1443004412;
                            break;
                        case 3:
                            iM55680 = C0873.m55680("ܳ᩹") ^ i11;
                            i2 = ((iM55680 ^ i10) * (-22453)) ^ (-1469801228);
                            i3 = -1791520970;
                            break;
                        case 4:
                            iM55680 = C0873.m55680("۠ۚ") ^ i10;
                            i2 = ((iM55680 ^ i11) * (-14999)) ^ 273204452;
                            i3 = -1814135167;
                            break;
                        case 5:
                            iM55680 = C0873.m55680("ۤ۟") ^ i11;
                            i2 = ((iM55680 ^ i10) * (-26607)) ^ 1432325967;
                            i3 = 448705180;
                            break;
                        case 6:
                            iM55680 = C0946.m55979("ۖ۠") ^ i11;
                            i2 = ((iM55680 ^ i10) * (-4697)) ^ 2017345455;
                            i3 = -794602624;
                            break;
                        case 7:
                            iM55680 = (C0873.m55680("ۜ֡") + i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i2 = ((iM55680 ^ i11) * (-14309)) ^ 351876048;
                            i3 = -2125220145;
                            break;
                        case 8:
                            iM55680 = (C0946.m55979("ۢܰ") + i11) * 7;
                            i2 = ((iM55680 ^ i10) * (-6391)) ^ (-767235188);
                            i3 = -132702653;
                            break;
                        case 9:
                            iM55680 = C0873.m55680("ۨ֡") ^ i10;
                            i2 = ((iM55680 ^ i11) * 10205) ^ 792660386;
                            i3 = -1620045478;
                            break;
                        case 10:
                            iM55680 = C0946.m55979("ۖۧ") ^ i10;
                            i2 = ((iM55680 ^ i11) * (-15339)) ^ (-107431495);
                            i3 = 741895337;
                            break;
                        case 11:
                            iM55680 = C0946.m55979("ܽۧ") ^ i11;
                            i2 = ((iM55680 ^ i10) * 12433) ^ 1914447448;
                            i3 = -21819154;
                            break;
                        case 12:
                            iM55680 = C0946.m55979("ۙ᩸") ^ i11;
                            i2 = ((iM55680 ^ i10) * (-19823)) ^ (-1972248115);
                            i3 = -1493523183;
                            break;
                        case 13:
                            iM55680 = (C0873.m55680("ܺ᩶") + i10) * (-105);
                            i2 = ((iM55680 ^ i11) * (-17537)) ^ 1979329387;
                            i3 = -432703829;
                            break;
                        case 14:
                            iM55680 = C0946.m55979("᩵ᩴ") ^ i11;
                            i2 = ((iM55680 ^ i10) * 7091) ^ (-1649254607);
                            i3 = 1255245737;
                            break;
                        case 15:
                            iM55680 = C0946.m55979("֨᩻") ^ i10;
                            i2 = ((iM55680 ^ i11) * (-8751)) ^ (-1174635125);
                            i3 = -807088193;
                            break;
                        case 16:
                            iM55680 = C0873.m55680("ۗۖ") ^ i10;
                            i2 = ((iM55680 ^ i11) * 9127) ^ 1125284104;
                            i3 = 512986332;
                            break;
                        default:
                            iM55680 = C0946.m55979("ۡۜ") ^ i11;
                            i2 = ((iM55680 ^ i10) * 30399) ^ 2051553541;
                            i3 = -1121705637;
                            break;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
                default:
                    i16 = s * s;
                    i17 = 44983849;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("֨֡") ^ i11;
                        i2 = ((iM55680 ^ i10) * (-23235)) ^ (-750632956);
                        i3 = 1273982566;
                    } else {
                        iM55680 = (C0946.m55979("֡᩶") ^ i11) * 3;
                        i2 = ((iM55680 ^ i10) * 5413) ^ (-1628502658);
                        i3 = -1608714486;
                    }
                    i13 = iM55680 ^ i3;
                    i12 = i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48580(InterfaceC14770 interfaceC14770, String str, String str2) {
        int i = -359322485;
        int i2 = C1025.f81947;
        int i3 = C0845.f81821;
        int iM55680 = C0873.m55680("ۜۖ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 22819) ^ 1681763672;
        int i5 = 1458814110;
        while (true) {
            i = ((((i ^ i2) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1848061243:
                case 757695377:
                    RunnableC1014.m56177();
                    C1964.m56597();
                    iM55680 = (i2 - C0946.m55979("ۖۘ")) * 115;
                    i4 = ((iM55680 ^ i3) * 8789) ^ (-162927121);
                    i5 = 7199246;
                    break;
                case -1577502007:
                case 675053743:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0946.m55979("ܽ֨") + i3) * 15;
                        i4 = ((iM55680 ^ i2) * 12369) ^ (-1168558167);
                        i5 = -1971900876;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12567) ^ (-179586249);
                        i5 = -1192890017;
                    }
                    break;
                case -1437173073:
                case 1057577187:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("۫᩸") + i2) * 5;
                        i4 = ((iM55680 ^ i3) * 13551) ^ (-753489069);
                        i5 = -762345236;
                    } else {
                        iM55680 = C0946.m55979("᩶ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12659) ^ (-1113811103);
                        i5 = 162191294;
                    }
                    break;
                case -1373346763:
                case -947200699:
                    C1003.m56123();
                    if (C0946.f81894 == 0) {
                        iM55680 = (C0946.m55979("ܽ֨") + i3) * 15;
                        i4 = ((iM55680 ^ i2) * 12369) ^ (-1168558167);
                        i5 = -1971900876;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۖۘ")) * 115;
                        i4 = ((iM55680 ^ i3) * 8789) ^ (-162927121);
                        i5 = 7199246;
                    }
                    break;
                case -1255544317:
                case -27195853:
                    if (C0892.f81851) {
                        iM55680 = (i3 - C0946.m55979("ܰ᩸")) * 17;
                        i4 = ((iM55680 ^ i2) * 4927) ^ (-1520836520);
                        i5 = -6473778;
                    } else {
                        iM55680 = (C0946.m55979("ܽ֨") + i3) * 15;
                        i4 = ((iM55680 ^ i2) * 12369) ^ (-1168558167);
                        i5 = -1971900876;
                    }
                    break;
                case -863528020:
                case 1436357324:
                    interfaceC14770.mo27875(f67649.getInt(str, 0), str2);
                    iM55680 = (C0873.m55680("᩵ۢ") + i2) * 27;
                    i4 = ((iM55680 ^ i3) * 30143) ^ 1370889526;
                    i5 = 943219832;
                    break;
                case -658631526:
                case 337966766:
                    C0917.m55854();
                    if (C0949.f81897 < 0) {
                        iM55680 = C0946.m55979("ܽ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29327)) ^ (-1976353412);
                        i5 = -779323180;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۖۘ")) * 115;
                        i4 = ((iM55680 ^ i3) * 8789) ^ (-162927121);
                        i5 = 7199246;
                    }
                    break;
                case -655097249:
                case 887556626:
                    C0898.m55800();
                    C0854.m55595();
                    break;
                case -390370353:
                case 922914950:
                    if (f67649.contains(str2)) {
                        iM55680 = (C0873.m55680("᩵ۢ") + i2) * 27;
                        i4 = ((iM55680 ^ i3) * 30143) ^ 1370889526;
                        i5 = 943219832;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۚۚ")) * (-7);
                        i4 = ((iM55680 ^ i2) * (-6063)) ^ (-549276450);
                        i5 = -620385761;
                    }
                    break;
                case -225392090:
                case 876077755:
                    interfaceC14770.remove(str);
                    break;
                case -183701026:
                case 1813866472:
                    if (C1194.m56396() <= 0) {
                        iM55680 = (C0946.m55979("ܽ֨") + i3) * 15;
                        i4 = ((iM55680 ^ i2) * 12369) ^ (-1168558167);
                        i5 = -1971900876;
                    } else {
                        iM55680 = (C0946.m55979("ۧ᩻") ^ i2) * 73;
                        i4 = ((iM55680 ^ i3) * 15851) ^ (-572650934);
                        i5 = -66578217;
                    }
                    break;
                case -181581629:
                case 1145050545:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("۫᩸") + i2) * 5;
                        i4 = ((iM55680 ^ i3) * 13551) ^ (-753489069);
                        i5 = -762345236;
                    } else {
                        iM55680 = (C0946.m55979("ۖ᩷") + i2) * 37;
                        i4 = ((iM55680 ^ i3) * 4197) ^ (-2035318173);
                        i5 = 611307743;
                    }
                    break;
                case 301742811:
                case 1940827033:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("ܽ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29327)) ^ (-1976353412);
                        i5 = -779323180;
                    } else {
                        iM55680 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6773) ^ 1803171769;
                        i5 = 46618011;
                    }
                    break;
                case 781865851:
                case 1116739586:
                    if (C0946.m55980() != 0) {
                        iM55680 = (i2 - C0946.m55979("ۖۘ")) * 115;
                        i4 = ((iM55680 ^ i3) * 8789) ^ (-162927121);
                        i5 = 7199246;
                    } else {
                        iM55680 = (C0873.m55680("᩶۬") + i2) * (-41);
                        i4 = ((iM55680 ^ i3) * (-25327)) ^ (-1013933208);
                        i5 = 1950633900;
                    }
                    break;
                case 964032519:
                case 964383741:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0873.m55680("ۜۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24037)) ^ 894989426;
                        i5 = 1384227582;
                    } else {
                        iM55680 = C0873.m55680("ۚ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9277) ^ 1719914093;
                        i5 = -1014658503;
                    }
                    break;
                case 1183136886:
                case 1742921202:
                    if (C0854.f81826 != 0) {
                        iM55680 = (i2 - C0946.m55979("ۖۘ")) * 115;
                        i4 = ((iM55680 ^ i3) * 8789) ^ (-162927121);
                        i5 = 7199246;
                    } else {
                        iM55680 = (C0946.m55979("ۤۧ") ^ i3) * 49;
                        i4 = ((iM55680 ^ i2) * 10439) ^ 1487440856;
                        i5 = -1623765023;
                    }
                    break;
                case 1203853184:
                case 1204624446:
                    if (!C0912.m55833()) {
                        iM55680 = (C0873.m55680("۫᩸") + i2) * 5;
                        i4 = ((iM55680 ^ i3) * 13551) ^ (-753489069);
                        i5 = -762345236;
                    } else {
                        iM55680 = C0946.m55979("ܽ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29327)) ^ (-1976353412);
                        i5 = -779323180;
                    }
                    break;
                default:
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0873.m55680("ۜۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24037)) ^ 894989426;
                        i5 = 1384227582;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۡۧ")) * (-41);
                        i4 = ((iM55680 ^ i3) * (-17295)) ^ (-1098244173);
                        i5 = -117481382;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0039. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Class[], java.lang.Object, java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.app.ActivityManager] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // android.app.Application
    public final void onCreate() {
        int iM55979;
        int i;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int iM559711;
        int i8;
        int i9;
        int i10;
        ?? r5;
        int iM55680;
        int i11;
        int iM55681;
        int i12;
        int i13;
        ?? r6;
        int i14;
        final ApplicationC21448 applicationC21448 = this;
        boolean z = false;
        String strM56276 = null;
        boolean z2 = false;
        ?? r7 = 0;
        ExecutorService executorService = null;
        int i15 = 0;
        Throwable th = null;
        ?? r9 = 0;
        List<ApplicationExitInfo> historicalProcessExitReasons = null;
        boolean zM56018 = false;
        int iM55989 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1915750017;
        int i19 = C0894.f81854;
        int i20 = C0906.f81862;
        int iM55682 = (C0873.m55680("᩸ᩴ") + i20) * 47;
        int i21 = ((iM55682 ^ i19) * (-16303)) ^ (-1292322073);
        int i22 = iM55682 ^ 1248868642;
        String strM56318 = null;
        while (true) {
            int i23 = i22 ^ (i21 & (((i18 ^ i19) * (-8387)) >> 31));
            switch (i23) {
                case -1975052158:
                case 1183470307:
                    i16++;
                    iM55979 = C0873.m55680("᩶ᩴ") ^ i20;
                    i = ((iM55979 ^ i19) * (-15267)) ^ (-2146835622);
                    i2 = 1489268929;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1953665530:
                case -1045523678:
                    executorService = executorService;
                    i23 = i23;
                    C21306.m48188(C0894.m55773(f82969, 841, 32, i17), th);
                    int iM55683 = (i20 - C0873.m55680("ۘۜ")) * (-75);
                    i = ((iM55683 ^ i19) * 18125) ^ 1254149696;
                    i3 = iM55683 ^ 120288421;
                    i18 = i23;
                    executorService = executorService;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1853826404:
                case 842618495:
                    executorService = executorService;
                    i23 = i23;
                    StringBuilder sb = new StringBuilder(C0947.m55993(f82969, 794, 38, i17));
                    i15 = i15;
                    C0845.m55589(sb, i15);
                    C1017.m56185(C0863.m55639(sb));
                    int iM55684 = (i20 - C0873.m55680("ۘۜ")) * (-75);
                    i = ((iM55684 ^ i19) * 18125) ^ 1254149696;
                    i3 = iM55684 ^ 120288421;
                    i18 = i23;
                    executorService = executorService;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1776355972:
                case -1047687025:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    int i24 = C20953.f65836;
                    C0946.m55973(C4081.f8987, new RunnableC20282(z2 ? 1 : 0));
                    if (C7816.f20502) {
                        iM55979 = (C0873.m55680("᩻ۗ") + i20) * 53;
                        i = ((iM55979 ^ i19) * 24881) ^ 1708423586;
                        i2 = 1702786817;
                    } else {
                        iM55979 = C0946.m55979("ᩳᩴ") ^ i19;
                        i = ((iM55979 ^ i20) * (-29301)) ^ (-410760268);
                        i2 = 840246055;
                    }
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1617011481:
                case 870569735:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    C8092.m18776(new C20778());
                    if (f67652) {
                        iM55979 = C0946.m55979("۟᩵") ^ i19;
                        i = ((iM55979 ^ i20) * (-455)) ^ 366768223;
                        i2 = 1176644880;
                    } else {
                        iM55979 = (i20 - C0946.m55979("ܰܳ")) * (-65);
                        i = ((iM55979 ^ i19) * (-3715)) ^ 698033872;
                        i2 = 1968949798;
                    }
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1388240563:
                case 1457960339:
                    i23 = i23;
                    C0873.m55676(executorService, new RunnableC6025(z2 ? 1 : 0, applicationC21448));
                    z = z;
                    strM56276 = strM56276;
                    i15 = i15;
                    iM559710 = C0946.m55979("۫᩻") ^ i20;
                    i4 = ((iM559710 ^ i19) * 28195) ^ (-94199372);
                    i5 = -783944051;
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case -1235986425:
                case 934670273:
                    i17 = 9871;
                    iM559710 = C0873.m55680("ۚۜ") ^ i19;
                    i4 = ((iM559710 ^ i20) * 30131) ^ 1230298681;
                    i5 = -1678176401;
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case -1130805564:
                case -584719747:
                    str = strM56276;
                    i15 = Build.VERSION.SDK_INT;
                    if (i15 < 30) {
                        iM55681 = C0946.m55979("۟ᩴ") ^ i19;
                        i8 = ((iM55681 ^ i20) * (-4991)) ^ 819177300;
                        i12 = 486027392;
                    } else {
                        iM55681 = (C0873.m55680("ۢ᩺") ^ i20) * (-21);
                        i8 = ((iM55681 ^ i19) * 19027) ^ 645909342;
                        i12 = -1952858978;
                    }
                    i13 = iM55681 ^ i12;
                    i18 = i23;
                    i22 = i13;
                    i21 = i8;
                    strM56276 = str;
                    break;
                case -1083283409:
                case -1029072230:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    try {
                        StrictMode.class.getMethod(C0989.m56092(f82969, 930, 29, i17), r7).invoke(r7, r7);
                        C7816.f20502 = z;
                        break;
                    } catch (Throwable unused) {
                    }
                    iM55979 = (C0873.m55680("᩻ۗ") + i20) * 53;
                    i = ((iM55979 ^ i19) * 24881) ^ 1708423586;
                    i2 = 1702786817;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1080443082:
                case 2103012164:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    if (f67650.contains(strM56276)) {
                        iM55979 = (C0946.m55979("ܽܰ") ^ i19) * 85;
                        i = ((iM55979 ^ i20) * 28983) ^ 1789477273;
                        i2 = 959664053;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۚ") + i20) * (-81);
                        i = ((iM55979 ^ i19) * 14643) ^ 1224483870;
                        i2 = -1649373702;
                    }
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -1072688457:
                case 1283837409:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    C0873.m55676(C4081.f8987, new RunnableC7366(z2 ? 1 : 0));
                    iM55979 = (C0946.m55979("ᩴۚ") + i20) * (-81);
                    i = ((iM55979 ^ i19) * 14643) ^ 1224483870;
                    i2 = -1649373702;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -894715529:
                case 695588726:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    if (i16 < iM55989) {
                        iM55979 = (C0946.m55979("ܿܶ") ^ i20) * 11;
                        i = ((iM55979 ^ i19) * (-9301)) ^ 1976503911;
                        i2 = 1642806375;
                        i3 = iM55979 ^ i2;
                        i18 = i23;
                        executorService = executorService;
                        i15 = i15;
                        i22 = i3;
                        i21 = i;
                        applicationC21448 = this;
                    }
                    i15 = i15;
                    int iM55685 = (i20 - C0873.m55680("ۘۜ")) * (-75);
                    i = ((iM55685 ^ i19) * 18125) ^ 1254149696;
                    i3 = iM55685 ^ 120288421;
                    i18 = i23;
                    executorService = executorService;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -883243249:
                case 348825796:
                    C1017.m56185(strM56318);
                    applicationC21448 = this;
                    iM559710 = C0873.m55680("᩺ۜ") ^ i20;
                    i4 = ((iM559710 ^ i19) * 19615) ^ (-1499501117);
                    i5 = -488291704;
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case -830938408:
                case 1251154000:
                    i16 = 0;
                    iM55979 = C0873.m55680("᩶ᩴ") ^ i20;
                    i = ((iM55979 ^ i19) * (-15267)) ^ (-2146835622);
                    i2 = 1489268929;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -547087637:
                case -458180173:
                    try {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) C1964.m56587(historicalProcessExitReasons, i16);
                        i23 = i23;
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            executorService = executorService;
                            try {
                                i15 = i15;
                                try {
                                    C1003.m56121(sb2, C1028.m56235(f82969, 985, 21, i17));
                                    C0845.m55589(sb2, i16);
                                    C0912.m55825(sb2, AbstractC0942.m55970(f82969, 1006, 11, i17));
                                    C1003.m56121(sb2, applicationExitInfo.getProcessName());
                                    C1003.m56121(sb2, C0873.m55689(f82969, 1017, 6, i17));
                                    C0845.m55589(sb2, applicationExitInfo.getPid());
                                    C1003.m56121(sb2, C0866.m55652(f82969, 1023, 9, i17));
                                    C1003.m56121(sb2, m48579(applicationExitInfo.getReason()));
                                    C1003.m56121(sb2, RunnableC0897.m55783(f82969, 1032, 1, i17));
                                    C0863.m55629(sb2, applicationExitInfo.getReason());
                                    C1003.m56121(sb2, C0930.m55893(f82969, 1033, 10, i17));
                                    C0845.m55589(sb2, applicationExitInfo.getStatus());
                                    C1003.m56121(sb2, C0955.m56029(f82969, 1043, 13, i17));
                                    C0845.m55589(sb2, applicationExitInfo.getImportance());
                                    C0912.m55825(sb2, C1071.m56336(f82969, SPHINCS256Config.CRYPTO_PUBLICKEYBYTES, 6, i17));
                                    C1046.m56290(sb2, applicationExitInfo.getPss());
                                    C0912.m55825(sb2, C1044.m56276(f82969, 1062, 6, i17));
                                    C1046.m56290(sb2, applicationExitInfo.getRss());
                                    C0912.m55825(sb2, C0927.m55863(f82969, 1068, 12, i17));
                                    C0989.m56099(sb2, applicationExitInfo.getTimestamp());
                                    C1003.m56121(sb2, C0892.m55750(f82969, 1080, 14, i17));
                                    C1003.m56121(sb2, applicationExitInfo.getDescription());
                                    C1017.m56185(C0845.m55591(sb2));
                                    iM55979 = (C0873.m55680("᩶᩶") + i19) * (-109);
                                    i = ((iM55979 ^ i20) * (-4539)) ^ (-144523967);
                                    i2 = 1211773449;
                                    i3 = iM55979 ^ i2;
                                    i18 = i23;
                                    executorService = executorService;
                                    i15 = i15;
                                    i22 = i3;
                                    i21 = i;
                                    applicationC21448 = this;
                                } catch (Throwable th2) {
                                    th = th2;
                                    applicationC21448 = this;
                                    th = th;
                                    i15 = i15;
                                    int iM559712 = C0946.m55979("ۧ᩷") ^ i19;
                                    i18 = i23;
                                    i22 = iM559712 ^ 1289119291;
                                    i21 = ((iM559712 ^ i20) * (-3155)) ^ (-665836562);
                                    executorService = executorService;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i15 = i15;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            executorService = executorService;
                            applicationC21448 = this;
                            th = th;
                            int iM559713 = C0946.m55979("ۧ᩷") ^ i19;
                            i18 = i23;
                            i22 = iM559713 ^ 1289119291;
                            i21 = ((iM559713 ^ i20) * (-3155)) ^ (-665836562);
                            executorService = executorService;
                            break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        executorService = executorService;
                        i23 = i23;
                    }
                    break;
                case -419943994:
                case 953492846:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    historicalProcessExitReasons = r9.getHistoricalProcessExitReasons(r7, z2 ? 1 : 0, 5);
                    zM56018 = C0949.m56018(historicalProcessExitReasons);
                    iM55979 = C0946.m55979("۟ۤ") ^ i20;
                    i = ((iM55979 ^ i19) * 25115) ^ 987872540;
                    i2 = -814056119;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -292783239:
                case 8926309:
                    i15 = i15;
                    i10 = i23;
                    C11164.m25775();
                    C22224.m50057((ContextWrapper) this);
                    applicationC21448 = this;
                    z = z;
                    r5 = r7;
                    iM55680 = (C0946.m55979("ܶ֨") + i19) * 81;
                    i4 = ((iM55680 ^ i20) * 28213) ^ 1266649585;
                    i11 = -1686989846;
                    r6 = r5;
                    i14 = iM55680 ^ i11;
                    i18 = i10;
                    r7 = r6;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case -210150906:
                case 1618088071:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    if (zM56018) {
                        iM55979 = (C0946.m55979("ܽ۟") ^ i19) * (-73);
                        i = ((iM55979 ^ i20) * (-21339)) ^ 354181081;
                        i2 = -1587818380;
                    } else {
                        iM55979 = C0873.m55680("ܰܽ") ^ i19;
                        i = ((iM55979 ^ i20) * (-507)) ^ 1332540931;
                        i2 = -940836044;
                    }
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -137394092:
                case 593125250:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    iM55989 = C0947.m55989(historicalProcessExitReasons);
                    iM55979 = C0873.m55680("ᩳܽ") ^ i19;
                    i = ((iM55979 ^ i20) * (-20445)) ^ 2029340729;
                    i2 = 1204848436;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -94375938:
                case 594894403:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    C0892.m55747(new C16962());
                    C0873.m55676(C4081.f8987, new RunnableC2671(z2 ? 1 : 0));
                    iM55979 = C0946.m55979("۟᩵") ^ i19;
                    i = ((iM55979 ^ i20) * (-455)) ^ 366768223;
                    i2 = 1176644880;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case -36596290:
                case 165433801:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    C0992.m56105(C0989.m56092(f82969, 959, 26, i17));
                    i15 = i15;
                    int iM55686 = (i20 - C0873.m55680("ۘۜ")) * (-75);
                    i = ((iM55686 ^ i19) * 18125) ^ 1254149696;
                    i3 = iM55686 ^ 120288421;
                    i18 = i23;
                    executorService = executorService;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case 44956313:
                case 1742820025:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    try {
                        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
                        C7816.f20502 = z;
                        break;
                    } catch (Throwable unused2) {
                    }
                    iM55979 = C0946.m55979("۠ۜ") ^ i19;
                    i = ((iM55979 ^ i20) * 26445) ^ 965638342;
                    i2 = -1097135726;
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case 142170704:
                case 564179803:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    if (r9 == 0) {
                        iM55979 = C0873.m55680("ܺۛ") ^ i20;
                        i = ((iM55979 ^ i19) * (-487)) ^ 1981700775;
                        i2 = -1141925766;
                    } else {
                        iM55979 = C0946.m55979("֫ۤ") ^ i19;
                        i = ((iM55979 ^ i20) * 835) ^ (-1924262407);
                        i2 = 1803590198;
                    }
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case 350734512:
                case 515147004:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    C1017.m56185(C0927.m55863(f82969, 873, 57, i17));
                    i15 = i15;
                    int iM55687 = (i20 - C0873.m55680("ۘۜ")) * (-75);
                    i = ((iM55687 ^ i19) * 18125) ^ 1254149696;
                    i3 = iM55687 ^ 120288421;
                    i18 = i23;
                    executorService = executorService;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
                case 377606468:
                case 737523581:
                    str = strM56276;
                    i6 = i15;
                    i7 = i23;
                    super.onCreate();
                    C0992.m56105(C1048.m56318(f82969, 685, 18, i17));
                    boolean z3 = f67651;
                    strM56318 = C1048.m56318(f82969, 703, 16, i17);
                    z = true;
                    if (z3) {
                        iM559711 = (C0873.m55680("ۗۧ") ^ i20) * (-65);
                        i8 = ((iM559711 ^ i19) * 22139) ^ (-1005101499);
                        i9 = -345379481;
                    } else {
                        iM559711 = C0946.m55979("ۢ֫") ^ i20;
                        i8 = ((iM559711 ^ i19) * (-24219)) ^ (-1473035189);
                        i9 = -190600977;
                    }
                    i13 = iM559711 ^ i9;
                    i18 = i7;
                    i15 = i6;
                    i22 = i13;
                    i21 = i8;
                    strM56276 = str;
                    break;
                case 493235257:
                case 801710991:
                    executorService = executorService;
                    i23 = i23;
                    try {
                        applicationC21448 = this;
                        try {
                            ActivityManager activityManager = (ActivityManager) C0955.m56031(applicationC21448, C0882.m55717(f82969, 786, 8, i17));
                            int iM559714 = C0946.m55979("֡ᩳ") ^ i19;
                            int i25 = ((iM559714 ^ i20) * (-19249)) ^ 1575103067;
                            i18 = i23;
                            i22 = iM559714 ^ (-1395097920);
                            executorService = executorService;
                            r9 = activityManager;
                            i21 = i25;
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            int iM559715 = C0946.m55979("ۧ᩷") ^ i19;
                            i18 = i23;
                            i22 = iM559715 ^ 1289119291;
                            i21 = ((iM559715 ^ i20) * (-3155)) ^ (-665836562);
                            executorService = executorService;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        applicationC21448 = this;
                        th = th;
                        int iM559716 = C0946.m55979("ۧ᩷") ^ i19;
                        i18 = i23;
                        i22 = iM559716 ^ 1289119291;
                        i21 = ((iM559716 ^ i20) * (-3155)) ^ (-665836562);
                        executorService = executorService;
                        break;
                    }
                    break;
                case 742248721:
                case 1537983949:
                    z = z;
                    i15 = i15;
                    i10 = i23;
                    C19553.m44410(new C19553());
                    C21933.m49463(new C17423());
                    f67648 = (Vibrator) RunnableC0897.m55787(applicationC21448, C1229.m56403(f82969, 719, 8, i17));
                    SharedPreferences sharedPreferencesM43511 = C19132.m43511(this);
                    f67650 = sharedPreferencesM43511;
                    C7050.f18355 = sharedPreferencesM43511;
                    C13430 c13430 = new C13430(new File(C7050.m16219(), RunnableC0897.m55783(f82969, 727, 11, i17)));
                    f67649 = c13430;
                    C7050.f18359 = c13430;
                    new C13430(new File(getFilesDir(), C1044.m56276(f82969, 738, 11, i17)));
                    m48583();
                    C12902.m29560(new C2434());
                    SharedPreferences sharedPreferences = f67650;
                    String strM55783 = RunnableC0897.m55783(f82969, 749, 11, i17);
                    strM56276 = C1044.m56276(f82969, 760, 8, i17);
                    C17853.m40543(C1404.m56466(sharedPreferences, strM56276, strM55783));
                    C13106.m30005(this);
                    z2 = false;
                    z2 = false;
                    r5 = 0;
                    r6 = 0;
                    if (f67652) {
                        iM55680 = (C0946.m55979("ܶ֨") + i19) * 81;
                        i4 = ((iM55680 ^ i20) * 28213) ^ 1266649585;
                        i11 = -1686989846;
                        r6 = r5;
                    } else {
                        iM55680 = (i19 - C0873.m55680("ۢ᩹")) * 99;
                        i4 = ((iM55680 ^ i20) * (-29773)) ^ (-475940930);
                        i11 = 1747498251;
                    }
                    i14 = iM55680 ^ i11;
                    i18 = i10;
                    r7 = r6;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case 859196076:
                case 1766116107:
                    z = z;
                    strM56276 = strM56276;
                    i15 = i15;
                    i23 = i23;
                    short s = f82969[684];
                    if (((s * s) + 142587481) - (s * 23882) < 0) {
                        iM559710 = C0946.m55979("ۧۛ") ^ i20;
                        i4 = ((iM559710 ^ i19) * 23933) ^ 680414712;
                        i5 = -1732410050;
                    } else {
                        iM559710 = C0946.m55979("֨ۡ") ^ i19;
                        i4 = ((iM559710 ^ i20) * 20943) ^ 1577697817;
                        i5 = -298633114;
                    }
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case 1307496193:
                case 1494557154:
                    break;
                case 1413627779:
                case 1706406146:
                    SharedPreferencesC3371 sharedPreferencesC3371 = new SharedPreferencesC3371();
                    C8736 c8736 = new C8736();
                    f67650 = sharedPreferencesC3371;
                    C7050.f18355 = sharedPreferencesC3371;
                    f67649 = c8736;
                    C7050.f18359 = c8736;
                    C0992.m56105(strM56318);
                    iM559710 = C0873.m55680("᩺ۜ") ^ i20;
                    i4 = ((iM559710 ^ i19) * 19615) ^ (-1499501117);
                    i5 = -488291704;
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case 1479583969:
                case 1734203056:
                    strM56276 = strM56276;
                    i15 = i15;
                    i23 = i23;
                    executorService = C4081.f8987;
                    C0946.m55973(executorService, new Runnable() { // from class: l.ۖۡ᩷

                        /* JADX INFO: renamed from: ۚۖ᩻, reason: not valid java name and contains not printable characters */
                        private static final short[] f81903 = {2011, 12105, 12106, 12106, 12057, 12107, 12063, 12111, 12109, 12057, 12108, 12058, 12105, 12105, 12061, 12062, 12056, 12107, 12105, 12108, 12108, 12108, 12058, 12106, 12108};

                        /* JADX WARN: Code duplicated, block: B:35:0x0114 A[PHI: r12 r16
                          0x0114: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:9:0x0058, B:34:0x0112, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0114: PHI (r16v28 int) = (r16v4 int), (r16v24 int), (r16v29 int) binds: [B:9:0x0058, B:34:0x0112, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:55:0x0204 A[PHI: r6 r7 r8 r16 r17
                          0x0204: PHI (r6v5 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:54:0x0202, B:50:0x01dc, B:8:0x0050] A[DONT_GENERATE, DONT_INLINE]
                          0x0204: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:54:0x0202, B:50:0x01dc, B:8:0x0050] A[DONT_GENERATE, DONT_INLINE]
                          0x0204: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:54:0x0202, B:50:0x01dc, B:8:0x0050] A[DONT_GENERATE, DONT_INLINE]
                          0x0204: PHI (r16v17 int) = (r16v10 int), (r16v11 int), (r16v18 int) binds: [B:54:0x0202, B:50:0x01dc, B:8:0x0050] A[DONT_GENERATE, DONT_INLINE]
                          0x0204: PHI (r17v15 l.᩶ۡ᩷) = (r17v8 l.᩶ۡ᩷), (r17v9 l.᩶ۡ᩷), (r17v16 l.᩶ۡ᩷) binds: [B:54:0x0202, B:50:0x01dc, B:8:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x02bc A[PHI: r2 r3 r16 r17
                          0x02bc: PHI (r2v4 short[]) = (r2v2 short[]), (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:13:0x0063, B:71:0x02ba, B:67:0x0299, B:63:0x027a] A[DONT_GENERATE, DONT_INLINE]
                          0x02bc: PHI (r3v3 char) = (r3v2 char), (r3v2 char), (r3v2 char), (r3v4 char) binds: [B:13:0x0063, B:71:0x02ba, B:67:0x0299, B:63:0x027a] A[DONT_GENERATE, DONT_INLINE]
                          0x02bc: PHI (r16v7 int) = (r16v3 int), (r16v5 int), (r16v6 int), (r16v8 int) binds: [B:13:0x0063, B:71:0x02ba, B:67:0x0299, B:63:0x027a] A[DONT_GENERATE, DONT_INLINE]
                          0x02bc: PHI (r17v5 l.᩶ۡ᩷) = (r17v2 l.᩶ۡ᩷), (r17v3 l.᩶ۡ᩷), (r17v4 l.᩶ۡ᩷), (r17v6 l.᩶ۡ᩷) binds: [B:13:0x0063, B:71:0x02ba, B:67:0x0299, B:63:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i26;
                            ApplicationC21448 applicationC21449;
                            int i27;
                            int iM559717;
                            int i28;
                            int i29;
                            ApplicationC21448 applicationC214410;
                            int i30;
                            int iM559718;
                            int i31;
                            int i32;
                            int i33 = C0989.f81920;
                            int i34 = C1017.f81942;
                            int iM55688 = (C0873.m55680("᩶ۜ") ^ i33) * (-93);
                            int i35 = ((iM55688 ^ i34) * 26443) ^ (-765357312);
                            short[] sArr = null;
                            short[] sArr2 = null;
                            int i36 = iM55688 ^ 202720684;
                            ApplicationC21448 applicationC214411 = null;
                            char c = 0;
                            short s2 = 0;
                            short s3 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 1485683477;
                            while (true) {
                                i43 = i36 ^ (i35 & (((i43 ^ i34) * (-22159)) >> 31));
                                switch (i43) {
                                    case -2146499953:
                                    case -502620254:
                                        i30 = 12156;
                                        int iM559719 = (C0946.m55979("᩸ܿ") ^ i33) * 81;
                                        int i44 = i30;
                                        i35 = ((iM559719 ^ i34) * 15535) ^ (-140271860);
                                        i36 = iM559719 ^ (-949088318);
                                        i40 = i44;
                                        break;
                                    case -2121718536:
                                    case 460637449:
                                        i27 = i40;
                                        if ((i38 + i39) - i37 >= 0) {
                                            iM559717 = C0873.m55680("ۢܰ") ^ i33;
                                            applicationC21449 = applicationC214411;
                                            i28 = ((iM559717 ^ i34) * (-4621)) ^ 1600339684;
                                            i29 = 388536763;
                                        } else {
                                            applicationC21449 = applicationC214411;
                                            iM559717 = C0873.m55680("֡ܺ") ^ i34;
                                            i28 = ((iM559717 ^ i33) * (-7583)) ^ (-693772702);
                                            i29 = 1483675775;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -2001464247:
                                    case 1985122317:
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        i39 = 237591396;
                                        if (C0917.f81868) {
                                            iM559717 = C0873.m55680("ۖۢ") ^ i34;
                                            i28 = ((iM559717 ^ i33) * (-27437)) ^ (-2133922991);
                                            i29 = -965709222;
                                        } else {
                                            iM559717 = (C0946.m55979("ܰ᩵") + i34) * 127;
                                            i28 = ((iM559717 ^ i33) * 27671) ^ 99262427;
                                            i29 = 272368888;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -1982422644:
                                    case -162951414:
                                        i30 = 51058;
                                        int iM5597110 = (C0946.m55979("᩸ܿ") ^ i33) * 81;
                                        int i45 = i30;
                                        i35 = ((iM5597110 ^ i34) * 15535) ^ (-140271860);
                                        i36 = iM5597110 ^ (-949088318);
                                        i40 = i45;
                                        break;
                                    case -1957742711:
                                    case 448652362:
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        s2 = sArr[c];
                                        s3 = 30828;
                                        if (C0947.f81895) {
                                            applicationC214410 = applicationC21449;
                                            iM559717 = (C0946.m55979("֡ۧ") + i33) * (-45);
                                            applicationC21449 = applicationC214410;
                                            i28 = ((iM559717 ^ i34) * 5551) ^ (-571369153);
                                            i29 = -1230833925;
                                        } else {
                                            iM559717 = (C0873.m55680("ܽۖ") + i34) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i28 = ((iM559717 ^ i33) * 28987) ^ 1599438612;
                                            i29 = 1600534350;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -1830233492:
                                    case 876675186:
                                        if (!C0917.m55854()) {
                                            applicationC21449 = applicationC214411;
                                            i27 = i40;
                                            iM559717 = C0873.m55680("ۖۢ") ^ i34;
                                            i28 = ((iM559717 ^ i33) * (-27437)) ^ (-2133922991);
                                            i29 = -965709222;
                                            i40 = i27;
                                            i36 = iM559717 ^ i29;
                                            i35 = i28;
                                            applicationC214411 = applicationC21449;
                                        } else {
                                            i26 = i40;
                                            iM559718 = C0946.m55979("᩷ۛ") ^ i34;
                                            i31 = ((iM559718 ^ i33) * (-3269)) ^ 1190950374;
                                            i32 = -1951488591;
                                            int i46 = i26;
                                            i36 = iM559718 ^ i32;
                                            i35 = i31;
                                            i40 = i46;
                                        }
                                        break;
                                    case -1632016218:
                                    case -359173599:
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        c = 0;
                                        if (C0898.f81858 <= 0) {
                                            iM559717 = (C0873.m55680("ܿ۠") ^ i33) * (-107);
                                            i28 = ((iM559717 ^ i34) * 3261) ^ 23313002;
                                            i29 = -1091471428;
                                        } else {
                                            iM559717 = C0873.m55680("᩺ܶ") ^ i33;
                                            i28 = ((iM559717 ^ i34) * (-6475)) ^ (-906453610);
                                            i29 = 2121193186;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -1516078787:
                                    case 722397086:
                                        if (!C0882.f81846) {
                                            applicationC21449 = applicationC214411;
                                            i27 = i40;
                                            iM559717 = (C0873.m55680("ܿ۠") ^ i33) * (-107);
                                            i28 = ((iM559717 ^ i34) * 3261) ^ 23313002;
                                            i29 = -1091471428;
                                            i40 = i27;
                                            i36 = iM559717 ^ i29;
                                            i35 = i28;
                                            applicationC214411 = applicationC21449;
                                        } else {
                                            i26 = i40;
                                            iM559718 = C0946.m55979("᩷ۛ") ^ i34;
                                            i31 = ((iM559718 ^ i33) * (-3269)) ^ 1190950374;
                                            i32 = -1951488591;
                                            int i47 = i26;
                                            i36 = iM559718 ^ i32;
                                            i35 = i31;
                                            i40 = i47;
                                        }
                                        break;
                                    case -1475205496:
                                    case 910973227:
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        if (C0882.f81846) {
                                            iM559717 = (C0873.m55680("ܿ۠") ^ i33) * (-107);
                                            i28 = ((iM559717 ^ i34) * 3261) ^ 23313002;
                                            i29 = -1091471428;
                                        } else {
                                            iM559717 = C0946.m55979("ۨ۠") ^ i34;
                                            i28 = ((iM559717 ^ i33) * 32493) ^ 1185448134;
                                            i29 = 992912019;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -1381546516:
                                    case -22788321:
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        sArr = f81903;
                                        if (C1028.f81950 <= 0) {
                                            iM559717 = (C0873.m55680("ܿ۠") ^ i33) * (-107);
                                            i28 = ((iM559717 ^ i34) * 3261) ^ 23313002;
                                            i29 = -1091471428;
                                        } else {
                                            iM559717 = C0946.m55979("ۖۚ") ^ i33;
                                            i28 = ((iM559717 ^ i34) * (-24161)) ^ (-1399766236);
                                            i29 = -1016178312;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -1329159549:
                                    case 1318903337:
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        i37 = s2 * s3;
                                        i38 = s2 * s2;
                                        if (C0898.f81858 <= 0) {
                                            iM559717 = C0873.m55680("ۖۢ") ^ i34;
                                            i28 = ((iM559717 ^ i33) * (-27437)) ^ (-2133922991);
                                            i29 = -965709222;
                                        } else {
                                            iM559717 = (i33 - C0946.m55979("֨᩶")) * (-23);
                                            i28 = ((iM559717 ^ i34) * 9503) ^ (-2135799583);
                                            i29 = 1900308920;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    case -1161318847:
                                    case 1013166318:
                                        i26 = i40;
                                        int i48 = C8775.f23820;
                                        if (C17452.m39788()) {
                                            iM559718 = C0946.m55979("ܿۡ") ^ i34;
                                            i31 = ((iM559718 ^ i33) * (-3867)) ^ (-2099467034);
                                            i32 = 1842604032;
                                        } else {
                                            iM559718 = (C0946.m55979("۠ۘ") + i33) * 71;
                                            i31 = ((iM559718 ^ i34) * (-15871)) ^ 483113519;
                                            i32 = 909327911;
                                        }
                                        int i49 = i26;
                                        i36 = iM559718 ^ i32;
                                        i35 = i31;
                                        i40 = i49;
                                        break;
                                    case -1133902904:
                                    case 889951957:
                                        break;
                                    case -892035186:
                                    case -379677118:
                                        i26 = i40;
                                        sArr2 = f81903;
                                        i41 = 1;
                                        if (C1229.f82066 >= 0) {
                                            iM559718 = C0946.m55979("᩷ۛ") ^ i34;
                                            i31 = ((iM559718 ^ i33) * (-3269)) ^ 1190950374;
                                            i32 = -1951488591;
                                        } else {
                                            iM559718 = C0946.m55979("᩵ᩴ") ^ i34;
                                            i31 = ((iM559718 ^ i33) * (-19535)) ^ 464560994;
                                            i32 = -747060732;
                                        }
                                        int i410 = i26;
                                        i36 = iM559718 ^ i32;
                                        i35 = i31;
                                        i40 = i410;
                                        break;
                                    case 46301393:
                                    case 2126989329:
                                        i26 = i40;
                                        i42 = 24;
                                        if (C0898.f81858 <= 0) {
                                            iM559718 = (C0873.m55680("ۙۧ") + i34) * (-101);
                                            i31 = ((iM559718 ^ i33) * (-11089)) ^ (-133091662);
                                            i32 = 1789479478;
                                        } else {
                                            iM559718 = C0873.m55680("֫۟") ^ i33;
                                            i31 = ((iM559718 ^ i34) * (-12611)) ^ (-182546111);
                                            i32 = -222484330;
                                        }
                                        int i411 = i26;
                                        i36 = iM559718 ^ i32;
                                        i35 = i31;
                                        i40 = i411;
                                        break;
                                    case 127878293:
                                    case 1600521777:
                                        i26 = i40;
                                        UMConfigure.preInit(applicationC214411, C0989.m56092(sArr2, i41, i42, i40), null);
                                        iM559718 = C0946.m55979("ܿۡ") ^ i34;
                                        i31 = ((iM559718 ^ i33) * (-3867)) ^ (-2099467034);
                                        i32 = 1842604032;
                                        int i412 = i26;
                                        i36 = iM559718 ^ i32;
                                        i35 = i31;
                                        i40 = i412;
                                        break;
                                    case 184237664:
                                    case 1578976892:
                                        C0906.m55809();
                                        if (!C0947.f81895) {
                                            i26 = i40;
                                            iM559718 = (C0873.m55680("ۙۧ") + i34) * (-101);
                                            i31 = ((iM559718 ^ i33) * (-11089)) ^ (-133091662);
                                            i32 = 1789479478;
                                            int i413 = i26;
                                            i36 = iM559718 ^ i32;
                                            i35 = i31;
                                            i40 = i413;
                                        } else {
                                            applicationC21449 = applicationC214411;
                                            i27 = i40;
                                            iM559717 = C0873.m55680("ۖۢ") ^ i34;
                                            i28 = ((iM559717 ^ i33) * (-27437)) ^ (-2133922991);
                                            i29 = -965709222;
                                            i40 = i27;
                                            i36 = iM559717 ^ i29;
                                            i35 = i28;
                                            applicationC214411 = applicationC21449;
                                        }
                                        break;
                                    case 399090908:
                                    case 1437895054:
                                        C0947.m55997();
                                        C0894.m55769();
                                        break;
                                    case 578075445:
                                    case 1343492643:
                                        i26 = i40;
                                        RunnableC1014.m56165(applicationC214411);
                                        if (C0866.f81837 >= 0) {
                                            iM559718 = (C0873.m55680("ۙۧ") + i34) * (-101);
                                            i31 = ((iM559718 ^ i33) * (-11089)) ^ (-133091662);
                                            i32 = 1789479478;
                                        } else {
                                            iM559718 = (i33 - C0946.m55979("۠۫")) * 89;
                                            i31 = ((iM559718 ^ i34) * (-4189)) ^ 729545949;
                                            i32 = 78827074;
                                        }
                                        int i414 = i26;
                                        i36 = iM559718 ^ i32;
                                        i35 = i31;
                                        i40 = i414;
                                        break;
                                    case 809032024:
                                    case 1222002066:
                                        i27 = i40;
                                        SharedPreferences sharedPreferences2 = ApplicationC21448.f67650;
                                        applicationC214410 = this.f10554;
                                        if (C0845.f81821 >= 0) {
                                            iM559717 = (C0946.m55979("֡ۧ") + i33) * (-45);
                                            applicationC21449 = applicationC214410;
                                            i28 = ((iM559717 ^ i34) * 5551) ^ (-571369153);
                                            i29 = -1230833925;
                                        } else {
                                            iM559717 = (C0946.m55979("ܰ۬") + i34) * (-91);
                                            applicationC21449 = applicationC214410;
                                            i28 = ((iM559717 ^ i33) * 6783) ^ 881543201;
                                            i29 = 586343933;
                                        }
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                    default:
                                        C0917.m55854();
                                        applicationC21449 = applicationC214411;
                                        i27 = i40;
                                        iM559717 = C0873.m55680("ۖۢ") ^ i34;
                                        i28 = ((iM559717 ^ i33) * (-27437)) ^ (-2133922991);
                                        i29 = -965709222;
                                        i40 = i27;
                                        i36 = iM559717 ^ i29;
                                        i35 = i28;
                                        applicationC214411 = applicationC21449;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    InterfaceC14100 interfaceC14100 = f67649;
                    z = z;
                    StringBuilder sb3 = new StringBuilder(RunnableC0938.m55936(f82969, 768, 4, i17));
                    C0845.m55589(sb3, Process.myUid());
                    C19701.m44740(C1053.m56333(interfaceC14100, C0863.m55639(sb3), r7));
                    if (C0890.m55727(f67649, C1024.m56203(f82969, 772, 14, i17), z2)) {
                        iM559710 = C0946.m55979("᩹ܺ") ^ i19;
                        i4 = ((iM559710 ^ i20) * 17055) ^ (-715360285);
                        i5 = 540680133;
                    } else {
                        iM559710 = C0946.m55979("۫᩻") ^ i20;
                        i4 = ((iM559710 ^ i19) * 28195) ^ (-94199372);
                        i5 = -783944051;
                    }
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case 1665895222:
                case 1997672538:
                    i17 = 22427;
                    iM559710 = C0873.m55680("ۚۜ") ^ i19;
                    i4 = ((iM559710 ^ i20) * 30131) ^ 1230298681;
                    i5 = -1678176401;
                    i14 = iM559710 ^ i5;
                    i18 = i23;
                    strM56276 = strM56276;
                    r7 = r7;
                    i15 = i15;
                    i22 = i14;
                    i21 = i4;
                    z = z;
                    break;
                case 1983950004:
                case 2119020630:
                    i7 = i23;
                    try {
                        InterfaceC14100 interfaceC14101 = f67649;
                        int i26 = ViewOnClickListenerC2424.f3726;
                        str = strM56276;
                        i6 = i15;
                        try {
                            C24414.m53847(C4654.m9884(C0890.m55734(interfaceC14101, RunnableC0871.m55667(f82969, 832, 9, i17), r7)));
                            C0946.m55973(executorService, new RunnableC20107(z2 ? 1 : 0));
                            break;
                        } catch (Throwable unused3) {
                        }
                    } catch (Throwable unused4) {
                        str = strM56276;
                        i6 = i15;
                    }
                    iM559711 = C0946.m55979("᩷֫") ^ i20;
                    i8 = ((iM559711 ^ i19) * 15557) ^ (-1064586531);
                    i9 = 957708611;
                    i13 = iM559711 ^ i9;
                    i18 = i7;
                    i15 = i6;
                    i22 = i13;
                    i21 = i8;
                    strM56276 = str;
                    break;
                default:
                    executorService = executorService;
                    i15 = i15;
                    i23 = i23;
                    if (C7816.f20502) {
                        iM55979 = C0946.m55979("۠ۜ") ^ i19;
                        i = ((iM55979 ^ i20) * 26445) ^ 965638342;
                        i2 = -1097135726;
                    } else {
                        iM55979 = (C0946.m55979("ܰ۟") ^ i20) * (-89);
                        i = ((iM55979 ^ i19) * 20383) ^ (-1643505269);
                        i2 = 1107010981;
                    }
                    i3 = iM55979 ^ i2;
                    i18 = i23;
                    executorService = executorService;
                    i15 = i15;
                    i22 = i3;
                    i21 = i;
                    applicationC21448 = this;
                    break;
            }
            C15322.f43724 = z;
            return;
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = 1861553143;
        int i2 = C1404.f82149;
        int i3 = C0873.f81841;
        int iM55680 = C0873.m55680("ۨ᩵") ^ i2;
        int i4 = ((iM55680 ^ i3) * 19453) ^ (-99684152);
        int i5 = -772728622;
        while (true) {
            i = ((((i ^ i3) * (-30427)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1608754179:
                case 622248120:
                    super.onConfigurationChanged(configuration);
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0946.m55979("ۚ᩵") + i2) * (-111);
                        i4 = ((iM55680 ^ i3) * (-4811)) ^ (-374707310);
                        i5 = 1790504972;
                    } else {
                        iM55680 = C0873.m55680("ܽۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31111)) ^ 1371190477;
                        i5 = 205846953;
                    }
                    break;
                case -1059454785:
                case 2029329420:
                    if (C1036.m56257() <= 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13163)) ^ 1285782898;
                        i5 = -1167420535;
                    } else {
                        iM55680 = C0873.m55680("ܺۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31501) ^ 468615404;
                        i5 = 927081402;
                    }
                    break;
                case -1046731916:
                case 1733431257:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ᩳ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26223) ^ 1822192059;
                        i5 = -147442673;
                    } else {
                        iM55680 = C0946.m55979("ܺ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31245)) ^ (-451229146);
                        i5 = 313693785;
                    }
                    break;
                case -894325012:
                case 1810471947:
                    if (C0912.f81867 > 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13163)) ^ 1285782898;
                        i5 = -1167420535;
                    } else {
                        iM55680 = C0873.m55680("ۡܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25071) ^ 631298871;
                        i5 = 364304436;
                    }
                    break;
                case -891869712:
                case -659818191:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ᩳ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26223) ^ 1822192059;
                        i5 = -147442673;
                    } else {
                        iM55680 = C0873.m55680("֡֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3653)) ^ 1230707008;
                        i5 = -1748376984;
                    }
                    break;
                case -663864865:
                case 1706549410:
                    C11419.m26419();
                    C11419.m26407((ContextWrapper) this);
                    C23223.m51767(configuration);
                    break;
                case -522631650:
                case 372620011:
                    AbstractC0942.m55971();
                    if (!C0861.f81831) {
                        iM55680 = C0946.m55979("ܺ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31245)) ^ (-451229146);
                        i5 = 313693785;
                    } else {
                        iM55680 = C0873.m55680("ۡܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25071) ^ 631298871;
                        i5 = 364304436;
                    }
                    break;
                case -489711952:
                case 98291555:
                    if (C1929.m56553()) {
                        iM55680 = (C0946.m55979("ۚ᩵") + i2) * (-111);
                        i4 = ((iM55680 ^ i3) * (-4811)) ^ (-374707310);
                        i5 = 1790504972;
                    } else {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13373)) ^ (-2025768676);
                        i5 = -226430756;
                    }
                    break;
                case -448743367:
                case 1208130734:
                    C0930.m55885();
                    C0949.m56012();
                    break;
                case 312974389:
                case 427788378:
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("ܺ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31245)) ^ (-451229146);
                        i5 = 313693785;
                    } else {
                        iM55680 = C0946.m55979("۫ۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-22291)) ^ (-1253141036);
                        i5 = -1704316256;
                    }
                    break;
                case 389483740:
                case 1138979187:
                    if (C0917.m55854()) {
                        iM55680 = (C0946.m55979("ۛۛ") ^ i2) * 65;
                        i4 = ((iM55680 ^ i3) * 13821) ^ (-1346071587);
                        i5 = -946496762;
                    } else {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13163)) ^ 1285782898;
                        i5 = -1167420535;
                    }
                    break;
                case 589244926:
                case 1693875996:
                    RunnableC0871.m55672();
                    C0877.m55696();
                    iM55680 = C0946.m55979("ܺ֫") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-31245)) ^ (-451229146);
                    i5 = 313693785;
                    break;
                case 606243490:
                case 1844587040:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ۚ᩵") + i2) * (-111);
                        i4 = ((iM55680 ^ i3) * (-4811)) ^ (-374707310);
                        i5 = 1790504972;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩸") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1479)) ^ 2125887917;
                        i5 = -1573818194;
                    }
                    break;
                case 632199634:
                case 1568023754:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0946.m55979("ۚ᩵") + i2) * (-111);
                        i4 = ((iM55680 ^ i3) * (-4811)) ^ (-374707310);
                        i5 = 1790504972;
                    } else {
                        iM55680 = C0873.m55680("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 5971) ^ 117913144;
                        i5 = -2112095986;
                    }
                    break;
                case 734511965:
                case 1981528365:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13163)) ^ 1285782898;
                        i5 = -1167420535;
                    } else {
                        iM55680 = C0946.m55979("֫ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22637) ^ 1449321191;
                        i5 = -89390549;
                    }
                    break;
                default:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13163)) ^ 1285782898;
                        i5 = -1167420535;
                    } else {
                        iM55680 = (C0946.m55979("۠᩸") ^ i3) * (-85);
                        i4 = ((iM55680 ^ i2) * 921) ^ 1248914590;
                        i5 = -970903656;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a0 A[PHI: r8
      0x01a0: PHI (r8v3 long[]) = (r8v2 long[]), (r8v1 long[]) binds: [B:47:0x019e, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x023f A[PHI: r3
      0x023f: PHI (r3v4 long) = (r3v1 long), (r3v2 long), (r3v1 long), (r3v1 long) binds: [B:61:0x023d, B:57:0x0221, B:43:0x0180, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x028e  */
    /* JADX WARN: Code duplicated, block: B:78:0x02dd A[PHI: r1 r2
      0x02dd: PHI (r1v3 int) = (r1v2 int), (r1v1 int), (r1v1 int) binds: [B:77:0x02db, B:73:0x02bc, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:77:0x02db, B:73:0x02bc, B:16:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m48581(boolean z) {
        int iM55680;
        int i;
        int i2;
        int i3 = 0;
        char c = 0;
        long j = 0;
        char c2 = 0;
        long j2 = 0;
        long[] jArr = null;
        Vibrator vibrator = null;
        boolean zHasVibrator = false;
        long[] jArr2 = null;
        int i4 = 2134762746;
        int i5 = C1964.f83032;
        int i6 = C1017.f81942;
        int iM55979 = (i6 - C0946.m55979("۫ۚ")) * 33;
        int i7 = ((iM55979 ^ i5) * 25747) ^ 1754840993;
        int i8 = iM55979 ^ 70356666;
        Vibrator vibrator2 = null;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * 18065) >> 31));
            switch (i4) {
                case -2142866902:
                case -733519484:
                    i3 = 2;
                    c = 1;
                    if (C0946.m55980() != 0) {
                        iM55680 = C0873.m55680("᩸ܶ") ^ i5;
                        i = ((iM55680 ^ i6) * 1361) ^ (-1818493113);
                        i2 = 1717940805;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ᩳܰ")) * (-89);
                        i = ((iM55680 ^ i6) * (-8707)) ^ 1185488334;
                        i2 = 640366443;
                    }
                    int i9 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i9;
                    break;
                case -2110765709:
                case 1489634153:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0873.m55680("ۧܶ") ^ i6;
                        i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                        i2 = -894644244;
                    } else {
                        iM55680 = (C0946.m55979("ۙ᩷") ^ i6) * 77;
                        i = ((iM55680 ^ i5) * 24221) ^ (-462619873);
                        i2 = 1575658382;
                    }
                    int i10 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i10;
                    break;
                case -2057392389:
                case -185746410:
                    if (zHasVibrator) {
                        iM55680 = (C0873.m55680("۠ۜ") ^ i5) * (-63);
                        i = ((iM55680 ^ i6) * (-673)) ^ (-1701566826);
                        i2 = 1242498909;
                    } else {
                        iM55680 = C0873.m55680("ܽܺ") ^ i6;
                        i = ((iM55680 ^ i5) * (-31075)) ^ 1620804865;
                        i2 = -1400637673;
                    }
                    int i11 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i11;
                    break;
                case -1862264172:
                case 454368905:
                    C0894.m55769();
                    break;
                case -1537703641:
                case -310533327:
                    zHasVibrator = vibrator2.hasVibrator();
                    iM55680 = (i6 - C0873.m55680("۠۬")) * 49;
                    i = ((iM55680 ^ i5) * (-11411)) ^ (-1931261164);
                    i2 = -1591765723;
                    int i12 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i12;
                    break;
                case -1514459586:
                case 1224990954:
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("ۧܶ") ^ i6;
                        i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                        i2 = -894644244;
                    } else {
                        iM55680 = C0946.m55979("ۧ᩷") ^ i5;
                        i = ((iM55680 ^ i6) * (-3111)) ^ (-2069287729);
                        i2 = -1621383580;
                    }
                    int i13 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i13;
                    break;
                case -1430761225:
                case -596582199:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (i6 - C0873.m55680("ۖۘ")) * (-113);
                        i = ((iM55680 ^ i5) * (-26835)) ^ (-1081875461);
                        i2 = 1429451078;
                    } else {
                        iM55680 = (C0946.m55979("᩹۫") + i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i6) * 24443) ^ (-2051760456);
                        i2 = -1966118262;
                    }
                    int i14 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i14;
                    break;
                case -1424414427:
                case 2100960448:
                    f67648 = vibrator;
                    iM55680 = C0946.m55979("֡֫") ^ i5;
                    i = ((iM55680 ^ i6) * 7165) ^ 276027354;
                    i2 = 1859106277;
                    int i15 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i15;
                    break;
                case -1183435270:
                case 948016062:
                    if (C0863.m55643()) {
                        iM55680 = C0873.m55680("ۧܶ") ^ i6;
                        i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                        i2 = -894644244;
                    } else {
                        iM55680 = C0873.m55680("ܶۨ") ^ i6;
                        i = ((iM55680 ^ i5) * 28637) ^ 1571714327;
                        i2 = 717812821;
                    }
                    int i16 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i16;
                    break;
                case -1151954280:
                case -1065175140:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ۧܶ") ^ i6;
                        i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                        i2 = -894644244;
                    } else {
                        iM55680 = C0873.m55680("᩸ܶ") ^ i5;
                        i = ((iM55680 ^ i6) * 1361) ^ (-1818493113);
                        i2 = 1717940805;
                    }
                    int i17 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i17;
                    break;
                case -1149783118:
                case 2022764697:
                    jArr[3] = j2;
                    jArr2 = jArr;
                    iM55680 = C0873.m55680("۠ܰ") ^ i6;
                    i = ((iM55680 ^ i5) * 9727) ^ 1356846569;
                    i2 = 1855759381;
                    int i18 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i18;
                    break;
                case -1088064497:
                case 2020916961:
                    vibrator = null;
                    iM55680 = C0946.m55979("ۛۖ") ^ i5;
                    i = ((iM55680 ^ i6) * (-25835)) ^ (-1346659124);
                    i2 = -660701559;
                    int i19 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i19;
                    break;
                case -519442308:
                case 1566636782:
                    if (C0955.f81898) {
                        iM55680 = (i6 - C0873.m55680("ۖۘ")) * (-113);
                        i = ((iM55680 ^ i5) * (-26835)) ^ (-1081875461);
                        i2 = 1429451078;
                    } else {
                        iM55680 = C0873.m55680("ۧܶ") ^ i6;
                        i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                        i2 = -894644244;
                    }
                    int i110 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i110;
                    break;
                case -499527569:
                case 1662590785:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("᩸ܶ") ^ i5;
                        i = ((iM55680 ^ i6) * 1361) ^ (-1818493113);
                        i2 = 1717940805;
                    } else {
                        iM55680 = (C0946.m55979("֫ۡ") ^ i6) * (-63);
                        i = ((iM55680 ^ i5) * (-15215)) ^ 1762292405;
                        i2 = -512014673;
                    }
                    int i111 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i111;
                    break;
                case -447069084:
                case -245076994:
                    c2 = 0;
                    j2 = 10;
                    if (z) {
                        iM55680 = (i5 - C0946.m55979("᩵ۗ")) * (-85);
                        i = ((iM55680 ^ i6) * 14919) ^ (-516136925);
                        i2 = 1776603634;
                    } else {
                        iM55680 = (i6 - C0873.m55680("᩻֫")) * (-49);
                        i = ((iM55680 ^ i5) * (-5557)) ^ (-1783423227);
                        i2 = 921688571;
                    }
                    int i112 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i112;
                    break;
                case -354614627:
                case 136079983:
                    long[] jArr3 = new long[i3];
                    jArr3[c2] = j;
                    jArr3[c] = j2;
                    jArr2 = jArr3;
                    iM55680 = C0873.m55680("۠ܰ") ^ i6;
                    i = ((iM55680 ^ i5) * 9727) ^ 1356846569;
                    i2 = 1855759381;
                    int i113 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i113;
                    break;
                case -216398905:
                case 1396489762:
                    j = 0;
                    if (C0946.f81894 != 0) {
                        iM55680 = (i6 - C0873.m55680("ۖۘ")) * (-113);
                        i = ((iM55680 ^ i5) * (-26835)) ^ (-1081875461);
                        i2 = 1429451078;
                    } else {
                        iM55680 = (C0873.m55680("ۤۗ") ^ i6) * 17;
                        i = ((iM55680 ^ i5) * 23023) ^ (-1662798932);
                        i2 = 135042989;
                    }
                    int i114 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i114;
                    break;
                case -152858110:
                case -40944801:
                    try {
                        f67648.vibrate(jArr2, -1);
                        iM55680 = C0873.m55680("ۤ֫") ^ i6;
                        i = ((iM55680 ^ i5) * (-25233)) ^ (-1902123874);
                        i2 = -237061614;
                    } catch (Throwable unused) {
                        iM55680 = (C0873.m55680("᩷ܰ") + i5) * (-127);
                        i = ((iM55680 ^ i6) * (-22907)) ^ 1797471590;
                        i2 = 756567303;
                    }
                    int i115 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i115;
                    break;
                case -138092824:
                case 210731233:
                    vibrator2 = f67648;
                    if (vibrator2 != null) {
                        iM55680 = (C0873.m55680("ۧۘ") + i6) * (-67);
                        i = ((iM55680 ^ i5) * 535) ^ 2100934074;
                        i2 = -1676570683;
                    } else {
                        iM55680 = (C0946.m55979("ۗ֫") ^ i5) * 49;
                        i = ((iM55680 ^ i6) * 27189) ^ 727402954;
                        i2 = -1188052159;
                    }
                    int i116 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i116;
                    break;
                case -76472723:
                case 703464821:
                    C0992.m56107();
                    if (C1046.m56302() != 0) {
                        iM55680 = C0873.m55680("ۧܶ") ^ i6;
                        i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                        i2 = -894644244;
                    } else {
                        iM55680 = C0873.m55680("ᩳۨ") ^ i5;
                        i = ((iM55680 ^ i6) * (-24825)) ^ 147157600;
                        i2 = -1900630354;
                    }
                    int i117 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i117;
                    break;
                case -44746564:
                case 1054909838:
                    jArr[c] = j2;
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("ۙ᩹") ^ i5) * 127;
                        i = ((iM55680 ^ i6) * 13621) ^ 81492561;
                        i2 = 1561975073;
                    } else {
                        iM55680 = C0946.m55979("ۚܳ") ^ i6;
                        i = ((iM55680 ^ i5) * 29635) ^ (-1978925075);
                        i2 = -1458531418;
                    }
                    int i118 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i118;
                    break;
                case 7552019:
                case 1876773243:
                    f67648 = vibrator;
                    iM55680 = (C0946.m55979("ۗ֫") ^ i5) * 49;
                    i = ((iM55680 ^ i6) * 27189) ^ 727402954;
                    i2 = -1188052159;
                    int i119 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i119;
                    break;
                case 543649055:
                case 1254716851:
                case 1529612076:
                case 1956235393:
                    break;
                case 606040243:
                case 1587651290:
                    jArr[c2] = j;
                    if (C0947.f81895) {
                        iM55680 = (i6 - C0873.m55680("ۖۘ")) * (-113);
                        i = ((iM55680 ^ i5) * (-26835)) ^ (-1081875461);
                        i2 = 1429451078;
                    } else {
                        iM55680 = C0946.m55979("ܽ֨") ^ i5;
                        i = ((iM55680 ^ i6) * (-8535)) ^ 1865232320;
                        i2 = 184763750;
                    }
                    int i1110 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i1110;
                    break;
                case 676820957:
                case 1968545721:
                    jArr = new long[4];
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("ᩳۨ") ^ i5;
                        i = ((iM55680 ^ i6) * (-24825)) ^ 147157600;
                        i2 = -1900630354;
                    } else {
                        iM55680 = (C0873.m55680("ۢۜ") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i5) * 14947) ^ (-1491414188);
                        i2 = -880500337;
                    }
                    int i1111 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i1111;
                    break;
                case 1043565336:
                case 1401261848:
                    C0967.m56074();
                    RunnableC0871.m55672();
                    iM55680 = C0873.m55680("ۧܶ") ^ i6;
                    i = ((iM55680 ^ i5) * (-10905)) ^ 340537591;
                    i2 = -894644244;
                    int i1112 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i1112;
                    break;
                case 1334270984:
                case 2024359029:
                    jArr[i3] = 120;
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ܶۨ") ^ i6;
                        i = ((iM55680 ^ i5) * 28637) ^ 1571714327;
                        i2 = 717812821;
                    } else {
                        iM55680 = (C0873.m55680("ۖ֨") + i5) * (-11);
                        i = ((iM55680 ^ i6) * 12271) ^ 721980726;
                        i2 = 339929419;
                    }
                    int i1113 = i;
                    i8 = iM55680 ^ i2;
                    i7 = i1113;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x039c A[PHI: r7 r23
      0x039c: PHI (r7v4 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:101:0x039a, B:97:0x0378, B:88:0x0323, B:71:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r23v31 short[]) = (r23v17 short[]), (r23v20 short[]), (r23v22 short[]), (r23v32 short[]) binds: [B:101:0x039a, B:97:0x0378, B:88:0x0323, B:71:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    /* JADX WARN: Code duplicated, block: B:81:0x02bc A[PHI: r23
      0x02bc: PHI (r23v29 short[]) = (r23v26 short[]), (r23v32 short[]) binds: [B:79:0x02a3, B:71:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iM55680;
        int i;
        int i2;
        short s;
        IOException iOException;
        int i3;
        int iM55681;
        int i4;
        IOException iOException2;
        int i5;
        short[] sArr;
        int iM55979;
        int i6;
        int i7;
        int iM55682;
        int i8;
        int i9;
        int i10;
        int iM559710;
        int i11;
        int i12;
        this = this;
        int i13 = 0;
        int i14 = 0;
        String strM55995 = null;
        boolean z = false;
        int iLastIndexOf = 0;
        boolean z2 = false;
        String strM55622 = null;
        Context contextM26413 = null;
        C23459 c23459 = null;
        int i15 = 0;
        int i16 = 747044996;
        int i17 = C0930.f81879;
        int i18 = C1003.f81929;
        int iM559711 = (C0946.m55979("ܰܿ") ^ i17) * 115;
        int i19 = ((iM559711 ^ i18) * (-31399)) ^ (-551780713);
        int i20 = iM559711 ^ 1479081063;
        IOException iOException3 = null;
        short[] sArr2 = null;
        int i21 = 0;
        StringBuilder sb = null;
        char c = 0;
        boolean z3 = false;
        short s2 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * 7071) >> 31));
            switch (i16) {
                case -2065782173:
                case -601377653:
                    sArr2 = sArr2;
                    c23459 = new C23459();
                    if (C1048.m56305() < 0) {
                        iM55680 = C0873.m55680("ۡۧ") ^ i17;
                        i = ((iM55680 ^ i18) * 8453) ^ 953494747;
                        i2 = -105797280;
                        i5 = iM55680 ^ i2;
                        sArr2 = sArr2;
                        i20 = i5;
                        i19 = i;
                    } else {
                        iOException3 = iOException3;
                        i13 = i13;
                        iM55682 = C0873.m55680("ܳ᩺") ^ i18;
                        i8 = ((iM55682 ^ i17) * 30337) ^ 599614517;
                        i9 = 712129597;
                        int i22 = iM55682 ^ i9;
                        sArr2 = sArr2;
                        i13 = i13;
                        i20 = i22;
                        i19 = i8;
                        iOException3 = iOException3;
                        this = this;
                    }
                    break;
                case -2054158873:
                case -1593215902:
                    C1003.m56121(sb, C0894.m55773(sArr2, 677, 7, i21));
                    if (C0912.f81867 <= 0) {
                        iM55681 = C0946.m55979("ܳܺ") ^ i17;
                        i = ((iM55681 ^ i18) * 21475) ^ (-2053194125);
                        i4 = 1206512050;
                    } else {
                        iM55681 = C0946.m55979("᩷ۤ") ^ i18;
                        i = ((iM55681 ^ i17) * 5441) ^ (-2134330893);
                        i4 = 1403480126;
                    }
                    i20 = iM55681 ^ i4;
                    i19 = i;
                    break;
                case -1956995514:
                case 1622620907:
                    sArr2 = sArr2;
                    contextM26413 = C11419.m26413(context);
                    iM55680 = C0873.m55680("ۡۡ") ^ i18;
                    i = ((iM55680 ^ i17) * (-28879)) ^ 1281414749;
                    i2 = 59457774;
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -1733660422:
                case -1530467227:
                    sArr2 = sArr2;
                    f67651 = z2;
                    if (z2) {
                        contextM26413 = context;
                        iM55680 = C0873.m55680("ۡۡ") ^ i18;
                        i = ((iM55680 ^ i17) * (-28879)) ^ 1281414749;
                        i2 = 59457774;
                    } else {
                        iM55680 = (C0873.m55680("֨᩶") + i17) * 33;
                        i = ((iM55680 ^ i18) * (-13911)) ^ (-1771134559);
                        i2 = -1915143678;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -1616629972:
                case -182877859:
                    if (RunnableC0938.f81886 < 0) {
                        iM55681 = C0946.m55979("ܳܺ") ^ i17;
                        i = ((iM55681 ^ i18) * 21475) ^ (-2053194125);
                        i4 = 1206512050;
                    } else {
                        iM55681 = C0873.m55680("۫ۖ") ^ i18;
                        i = ((iM55681 ^ i17) * 4583) ^ 1157885891;
                        i4 = 168479151;
                    }
                    i20 = iM55681 ^ i4;
                    i19 = i;
                    break;
                case -1574381032:
                case 1260474791:
                    sArr2 = sArr2;
                    iOException3 = iOException3;
                    i13 = i13;
                    s2 = sArr3[c];
                    i15 = s2 * s2;
                    if (C0917.m55854()) {
                        iM55682 = C0873.m55680("ۚܳ") ^ i17;
                        i8 = ((iM55682 ^ i18) * 25671) ^ 397322445;
                        i9 = 718756046;
                    } else {
                        iM55682 = C0873.m55680("ܳ᩺") ^ i18;
                        i8 = ((iM55682 ^ i17) * 30337) ^ 599614517;
                        i9 = 712129597;
                    }
                    int i23 = iM55682 ^ i9;
                    sArr2 = sArr2;
                    i13 = i13;
                    i20 = i23;
                    i19 = i8;
                    iOException3 = iOException3;
                    this = this;
                    break;
                case -1546453765:
                case -876624330:
                    C0845.m55584();
                    RunnableC0938.m55938();
                    return;
                case -1535973255:
                case 1265559055:
                    z = false;
                    iM55680 = (i17 - C0873.m55680("۟ۜ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM55680 ^ i18) * (-393)) ^ (-525225096);
                    i2 = -1842762579;
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -1492326212:
                case 1501904656:
                    sArr = sArr2;
                    s = s2;
                    iOException = iOException3;
                    i3 = i13;
                    sArr3 = f82969;
                    if (C1024.f81946) {
                        int iM55683 = C0873.m55680("ᩳܶ") ^ i18;
                        i6 = ((iM55683 ^ i17) * 3199) ^ (-1028256498);
                        i10 = iM55683 ^ (-2119655504);
                        s2 = s;
                        sArr2 = sArr;
                        sb = null;
                    } else {
                        iM55979 = C0946.m55979("ۗܰ") ^ i17;
                        i6 = ((iM55979 ^ i18) * (-7601)) ^ (-793682765);
                        i7 = 320714328;
                        i10 = iM55979 ^ i7;
                        s2 = s;
                        sArr2 = sArr;
                    }
                    i20 = i10;
                    i19 = i6;
                    i13 = i3;
                    iOException3 = iOException;
                    break;
                case -1341778351:
                case -388368987:
                    sArr2 = sArr2;
                    iLastIndexOf = strM55995.lastIndexOf(i14);
                    if (iLastIndexOf != i13) {
                        iM55680 = (C0873.m55680("ۡ۟") ^ i18) * (-63);
                        i = ((iM55680 ^ i17) * 3557) ^ (-1251950816);
                        i2 = 1174870309;
                    } else {
                        z2 = z3;
                        iM55680 = C0873.m55680("᩻ۚ") ^ i18;
                        i = ((iM55680 ^ i17) * 22129) ^ 1122212366;
                        i2 = -2034462798;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -1326006619:
                case 555603549:
                    RunnableC0897.m55784();
                    C1028.m56247();
                    sArr = sArr2;
                    s = s2;
                    iOException = iOException3;
                    i3 = i13;
                    int iM55684 = C0873.m55680("ᩳܶ") ^ i18;
                    i6 = ((iM55684 ^ i17) * 3199) ^ (-1028256498);
                    i10 = iM55684 ^ (-2119655504);
                    s2 = s;
                    sArr2 = sArr;
                    sb = null;
                    i20 = i10;
                    i19 = i6;
                    i13 = i3;
                    iOException3 = iOException;
                    break;
                case -1088116441:
                case -876177367:
                    sArr2 = sArr2;
                    strM55995 = Application.getProcessName();
                    i13 = i13;
                    iM55682 = C0873.m55680("ۘ֨") ^ i18;
                    i8 = ((iM55682 ^ i17) * 7555) ^ (-1351700942);
                    i9 = 1625807612;
                    int i24 = iM55682 ^ i9;
                    sArr2 = sArr2;
                    i13 = i13;
                    i20 = i24;
                    i19 = i8;
                    iOException3 = iOException3;
                    this = this;
                    break;
                case -1038123053:
                case 1904575475:
                    sArr2 = sArr2;
                    if (iLastIndexOf == C0882.m55719(strM55995) - 1) {
                        z2 = z3;
                        iM55680 = C0873.m55680("᩻ۚ") ^ i18;
                        i = ((iM55680 ^ i17) * 22129) ^ 1122212366;
                        i2 = -2034462798;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۘ") ^ i17) * 95;
                        i = ((iM55680 ^ i18) * 31327) ^ (-259105776);
                        i2 = -1833704131;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -984226512:
                case -235837911:
                    short[] sArr5 = f82969;
                    if (C1229.f82066 < 0) {
                        sArr2 = sArr2;
                        String strM56029 = C0955.m56029(sArr5, 664, 13, i21);
                        if (!C1929.m56553()) {
                            sb = new StringBuilder(strM56029);
                            C1003.m56121(sb, context.getPackageName());
                            sArr2 = f82969;
                            if (C1046.f81962 > 0) {
                                iM55681 = C0873.m55680("᩻ۙ") ^ i17;
                                i = ((iM55681 ^ i18) * (-8789)) ^ 2000517861;
                                i4 = -1423024209;
                                i20 = iM55681 ^ i4;
                                i19 = i;
                            } else {
                                s = s2;
                                iOException = iOException3;
                                i3 = i13;
                                int iM55685 = C0873.m55680("ۛܳ") ^ i17;
                                i20 = iM55685 ^ 66726785;
                                s2 = s;
                                i19 = ((iM55685 ^ i18) * 3237) ^ 1100778263;
                                i13 = i3;
                                iOException3 = iOException;
                            }
                        } else {
                            int iM55686 = (C0873.m55680("۠ۡ") + i18) * (-21);
                            i = ((iM55686 ^ i17) * 19891) ^ (-2087754271);
                            i5 = iM55686 ^ 809646171;
                            sArr2 = sArr2;
                            sb = null;
                            i20 = i5;
                            i19 = i;
                        }
                    } else {
                        sArr = sArr2;
                        s = s2;
                        iOException = iOException3;
                        i3 = i13;
                        int iM55687 = C0873.m55680("ᩳܶ") ^ i18;
                        i6 = ((iM55687 ^ i17) * 3199) ^ (-1028256498);
                        i10 = iM55687 ^ (-2119655504);
                        s2 = s;
                        sArr2 = sArr;
                        sb = null;
                        i20 = i10;
                        i19 = i6;
                        i13 = i3;
                        iOException3 = iOException;
                    }
                    break;
                case -929964452:
                case 1651008260:
                    RunnableC0871.m55672();
                    if (!C1025.m56230()) {
                        sArr = sArr2;
                        s = s2;
                        iOException = iOException3;
                        i3 = i13;
                        int iM55688 = C0873.m55680("ᩳܶ") ^ i18;
                        i6 = ((iM55688 ^ i17) * 3199) ^ (-1028256498);
                        i10 = iM55688 ^ (-2119655504);
                        s2 = s;
                        sArr2 = sArr;
                        sb = null;
                        i20 = i10;
                        i19 = i6;
                        i13 = i3;
                        iOException3 = iOException;
                    } else {
                        sArr2 = sArr2;
                        iOException3 = iOException3;
                        i13 = i13;
                        iM55682 = C0873.m55680("ܳ᩺") ^ i18;
                        i8 = ((iM55682 ^ i17) * 30337) ^ 599614517;
                        i9 = 712129597;
                        int i25 = iM55682 ^ i9;
                        sArr2 = sArr2;
                        i13 = i13;
                        i20 = i25;
                        i19 = i8;
                        iOException3 = iOException3;
                        this = this;
                    }
                    break;
                case -904911402:
                case -111968421:
                    sArr2 = sArr2;
                    strM55622 = C0861.m55622(strM55995, iLastIndexOf + 1);
                    sArr4 = f82969;
                    if (C0930.m55885() <= 0) {
                        int iM55689 = (C0873.m55680("۠ۡ") + i18) * (-21);
                        i = ((iM55689 ^ i17) * 19891) ^ (-2087754271);
                        i5 = iM55689 ^ 809646171;
                        sArr2 = sArr2;
                        sb = null;
                    } else {
                        iM55680 = (C0946.m55979("᩻ܰ") ^ i18) * 109;
                        i = ((iM55680 ^ i17) * 26703) ^ (-1743491106);
                        i2 = -1512525997;
                        i5 = iM55680 ^ i2;
                        sArr2 = sArr2;
                    }
                    i20 = i5;
                    i19 = i;
                    break;
                case -844683691:
                case 197420650:
                    sArr2 = sArr2;
                    if (ViewOnClickListenerC0939.m55949(ViewOnClickListenerC0939.m55947(sArr4, 662, 1, i21), strM55622)) {
                        iM55680 = C0946.m55979("ۙۖ") ^ i17;
                        i = ((iM55680 ^ i18) * (-16787)) ^ 8097057;
                        i2 = 1291370226;
                    } else {
                        iM55680 = (C0873.m55680("ۖ᩷") + i17) * (-107);
                        i = ((iM55680 ^ i18) * 7479) ^ 1316257826;
                        i2 = 1542169022;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -816831745:
                case 1648690201:
                    sArr2 = sArr2;
                    z2 = true;
                    iM55680 = C0873.m55680("᩻ۚ") ^ i18;
                    i = ((iM55680 ^ i17) * 22129) ^ 1122212366;
                    i2 = -2034462798;
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -687074128:
                case 1319898355:
                    sArr2 = sArr2;
                    c23459.f74705 = new C22789();
                    C18524.m42112(c23459);
                    iM55680 = (C0946.m55979("ܰ᩹") ^ i18) * 3;
                    i = ((iM55680 ^ i17) * (-31947)) ^ (-488160700);
                    i2 = 1072026422;
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -660683424:
                case 336210749:
                    throw new RuntimeException(iOException3);
                case -517024804:
                case 1429477404:
                    sArr2 = sArr2;
                    iOException3 = iOException3;
                    i13 = i13;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iM55682 = C0946.m55979("֨ۧ") ^ i18;
                        i8 = ((iM55682 ^ i17) * (-14041)) ^ (-1007387767);
                        i9 = -1654831248;
                    } else {
                        iM55682 = (i17 - C0946.m55979("ᩴ᩸")) * 57;
                        i8 = ((iM55682 ^ i18) * 23295) ^ (-428070937);
                        i9 = -1896979955;
                    }
                    int i26 = iM55682 ^ i9;
                    sArr2 = sArr2;
                    i13 = i13;
                    i20 = i26;
                    i19 = i8;
                    iOException3 = iOException3;
                    this = this;
                    break;
                case -473132930:
                case -377473425:
                    sArr2 = sArr2;
                    try {
                        i13 = i13;
                        try {
                            File file = new File(C0854.m55597(f82969, 644, 18, i21));
                            Charset charset = StandardCharsets.UTF_8;
                            strM55995 = C0947.m55995(C17425.m39674(file));
                            iM55682 = C0873.m55680("ۘ֨") ^ i18;
                            i8 = ((iM55682 ^ i17) * 7555) ^ (-1351700942);
                            i9 = 1625807612;
                            int i27 = iM55682 ^ i9;
                            sArr2 = sArr2;
                            i13 = i13;
                            i20 = i27;
                            i19 = i8;
                            iOException3 = iOException3;
                            this = this;
                        } catch (IOException e) {
                            e = e;
                            int iM559712 = C0946.m55979("᩹᩶") ^ i17;
                            int i28 = ((iM559712 ^ i18) * (-32731)) ^ (-788115790);
                            sArr2 = sArr2;
                            i20 = iM559712 ^ (-165614709);
                            this = this;
                            int i29 = i13;
                            iOException3 = e;
                            i19 = i28;
                            i13 = i29;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        i13 = i13;
                    }
                    break;
                case -439023195:
                case 569558182:
                    sArr2 = sArr2;
                    super.attachBaseContext(contextM26413);
                    C7050.m16215(f67652);
                    C7050.f18354 = this;
                    if (f67651) {
                        iM55680 = (C0946.m55979("ܰ᩹") ^ i18) * 3;
                        i = ((iM55680 ^ i17) * (-31947)) ^ (-488160700);
                        i2 = 1072026422;
                    } else {
                        iM55680 = (C0946.m55979("۫۬") + i18) * (-85);
                        i = ((iM55680 ^ i17) * (-91)) ^ (-139234684);
                        i2 = -1168785493;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -315576561:
                case 763927701:
                    C1964.m56597();
                    if (C0906.f81862 < 0) {
                        iM55681 = (i18 - C0873.m55680("᩵ܰ")) * (-57);
                        i = ((iM55681 ^ i17) * 19563) ^ 591743735;
                        i4 = 1924030022;
                        i20 = iM55681 ^ i4;
                        i19 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        iOException = iOException3;
                        i3 = i13;
                        int iM556810 = C0873.m55680("ᩳܶ") ^ i18;
                        i6 = ((iM556810 ^ i17) * 3199) ^ (-1028256498);
                        i10 = iM556810 ^ (-2119655504);
                        s2 = s;
                        sArr2 = sArr;
                        sb = null;
                        i20 = i10;
                        i19 = i6;
                        i13 = i3;
                        iOException3 = iOException;
                    }
                    break;
                case -295742046:
                case 765446685:
                    sArr2 = sArr2;
                    if (ViewOnClickListenerC0939.m55949(ServiceConnectionC1013.m56161(f82969, 663, 1, i21), strM55622)) {
                        iM55680 = C0946.m55979("ۙۖ") ^ i17;
                        i = ((iM55680 ^ i18) * (-16787)) ^ 8097057;
                        i2 = 1291370226;
                    } else {
                        z2 = z3;
                        iM55680 = C0873.m55680("᩻ۚ") ^ i18;
                        i = ((iM55680 ^ i17) * 22129) ^ 1122212366;
                        i2 = -2034462798;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case -173276548:
                case 678644876:
                    C0967.m56074();
                    if (C0946.f81894 != 0) {
                        iM55681 = C0946.m55979("ܳܺ") ^ i17;
                        i = ((iM55681 ^ i18) * 21475) ^ (-2053194125);
                        i4 = 1206512050;
                        i20 = iM55681 ^ i4;
                        i19 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        iOException = iOException3;
                        i3 = i13;
                        int iM556811 = C0873.m55680("ᩳܶ") ^ i18;
                        i6 = ((iM556811 ^ i17) * 3199) ^ (-1028256498);
                        i10 = iM556811 ^ (-2119655504);
                        s2 = s;
                        sArr2 = sArr;
                        sb = null;
                        i20 = i10;
                        i19 = i6;
                        i13 = i3;
                        iOException3 = iOException;
                    }
                    break;
                case -96280074:
                case 465275704:
                    if (C0898.f81858 <= 0) {
                        iM55681 = (C0873.m55680("ۘۚ") ^ i17) * (-37);
                        i = ((iM55681 ^ i18) * 4335) ^ (-1014567523);
                        i4 = -1590176368;
                    } else {
                        iM55681 = C0946.m55979("ۚܽ") ^ i17;
                        i = ((iM55681 ^ i18) * (-1751)) ^ 60894621;
                        i4 = 1289083217;
                    }
                    i20 = iM55681 ^ i4;
                    i19 = i;
                    break;
                case 68604357:
                case 926522344:
                    sArr2 = sArr2;
                    C23770.m52826(new C16752());
                    if (!C1024.f81946) {
                        iM55680 = (C0873.m55680("ۘۘ") ^ i17) * 57;
                        i = ((iM55680 ^ i18) * (-19233)) ^ 237300090;
                        i2 = -320861531;
                        i5 = iM55680 ^ i2;
                        sArr2 = sArr2;
                        i20 = i5;
                        i19 = i;
                    } else {
                        sArr2 = sArr2;
                        s = s2;
                        iOException = iOException3;
                        i3 = i13;
                        int iM556812 = C0873.m55680("ۛܳ") ^ i17;
                        i20 = iM556812 ^ 66726785;
                        s2 = s;
                        i19 = ((iM556812 ^ i18) * 3237) ^ 1100778263;
                        i13 = i3;
                        iOException3 = iOException;
                    }
                    break;
                case 74113697:
                case 1629561245:
                    sArr = sArr2;
                    iOException = iOException3;
                    i3 = i13;
                    s = s2;
                    if ((s * 5228) - (i15 + 6832996) <= 0) {
                        iM55979 = (i18 - C0873.m55680("۬֨")) * (-59);
                        i6 = ((iM55979 ^ i17) * (-29173)) ^ (-1672980503);
                        i7 = 2136978931;
                    } else {
                        iM55979 = C0873.m55680("ۜ֡") ^ i17;
                        i6 = ((iM55979 ^ i18) * 31771) ^ (-2007264411);
                        i7 = 1526539451;
                    }
                    i10 = iM55979 ^ i7;
                    s2 = s;
                    sArr2 = sArr;
                    i20 = i10;
                    i19 = i6;
                    i13 = i3;
                    iOException3 = iOException;
                    break;
                case 134979058:
                case 873061246:
                    if (C1929.f83011 != 0) {
                        iM55681 = C0873.m55680("۫ۖ") ^ i18;
                        i = ((iM55681 ^ i17) * 4583) ^ 1157885891;
                        i4 = 168479151;
                    } else {
                        iM55681 = (C0873.m55680("ۘۚ") ^ i17) * (-37);
                        i = ((iM55681 ^ i18) * 4335) ^ (-1014567523);
                        i4 = -1590176368;
                    }
                    i20 = iM55681 ^ i4;
                    i19 = i;
                    break;
                case 325960261:
                case 1431913898:
                    z = true;
                    iM55680 = (i17 - C0873.m55680("۟ۜ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM55680 ^ i18) * (-393)) ^ (-525225096);
                    i2 = -1842762579;
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case 368439595:
                case 451256542:
                    sArr2 = sArr2;
                    f67652 = z;
                    if (strM55995 == null) {
                        z2 = z3;
                        iM55680 = C0873.m55680("᩻ۚ") ^ i18;
                        i = ((iM55680 ^ i17) * 22129) ^ 1122212366;
                        i2 = -2034462798;
                    } else {
                        iM55680 = C0873.m55680("ۘ۬") ^ i17;
                        i = ((iM55680 ^ i18) * 29453) ^ 1327275254;
                        i2 = -966504633;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case 376752977:
                case 1602122052:
                    C21306.m48189(this);
                    sArr2 = sArr2;
                    iM55680 = C0873.m55680("ۗ۫") ^ i18;
                    i = ((iM55680 ^ i17) * (-28271)) ^ (-397583853);
                    i2 = -416520276;
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case 430215334:
                case 759665103:
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        sArr2 = sArr2;
                        int iM556813 = (C0873.m55680("۠ۡ") + i18) * (-21);
                        i = ((iM556813 ^ i17) * 19891) ^ (-2087754271);
                        i5 = iM556813 ^ 809646171;
                        sArr2 = sArr2;
                        sb = null;
                        i20 = i5;
                        i19 = i;
                    } else {
                        sArr2 = sArr2;
                        iOException3 = iOException3;
                        i13 = i13;
                        iM55682 = C0873.m55680("ܳ᩺") ^ i18;
                        i8 = ((iM55682 ^ i17) * 30337) ^ 599614517;
                        i9 = 712129597;
                        int i210 = iM55682 ^ i9;
                        sArr2 = sArr2;
                        i13 = i13;
                        i20 = i210;
                        i19 = i8;
                        iOException3 = iOException3;
                        this = this;
                    }
                    break;
                case 857935789:
                case 1033899159:
                    sArr = sArr2;
                    s = s2;
                    iOException = iOException3;
                    i3 = i13;
                    c = 643;
                    if (!C0955.f81898) {
                        iM55979 = (i18 - C0873.m55680("ܰۡ")) * (-117);
                        i6 = ((iM55979 ^ i17) * (-11405)) ^ (-1683231378);
                        i7 = 1976747002;
                        i10 = iM55979 ^ i7;
                        s2 = s;
                        sArr2 = sArr;
                        i20 = i10;
                        i19 = i6;
                        i13 = i3;
                        iOException3 = iOException;
                    } else {
                        sArr2 = sArr;
                        int iM556814 = C0873.m55680("ۛܳ") ^ i17;
                        i20 = iM556814 ^ 66726785;
                        s2 = s;
                        i19 = ((iM556814 ^ i18) * 3237) ^ 1100778263;
                        i13 = i3;
                        iOException3 = iOException;
                    }
                    break;
                case 1003972764:
                case 1117674308:
                    sArr2 = sArr2;
                    iOException2 = iOException3;
                    z3 = false;
                    i13 = -1;
                    i14 = 58;
                    if (strM55995 != null) {
                        iM559710 = (C0946.m55979("ۛۛ") + i17) * (-49);
                        i11 = ((iM559710 ^ i18) * 767) ^ (-1131670239);
                        i12 = 1325453554;
                    } else {
                        iM559710 = (C0946.m55979("֡ۜ") ^ i18) * (-91);
                        i11 = ((iM559710 ^ i17) * (-23231)) ^ 1006241823;
                        i12 = -171554608;
                    }
                    int i30 = iM559710 ^ i12;
                    iOException3 = iOException2;
                    short[] sArr6 = sArr2;
                    i20 = i30;
                    i19 = i11;
                    sArr2 = sArr6;
                    break;
                case 1106458056:
                case 1485385813:
                    sArr2 = sArr2;
                    if (f67651) {
                        iM55680 = C0873.m55680("ۗ۫") ^ i18;
                        i = ((iM55680 ^ i17) * (-28271)) ^ (-397583853);
                        i2 = -416520276;
                    } else {
                        iM55680 = C0873.m55680("ܺۙ") ^ i17;
                        i = ((iM55680 ^ i18) * (-15409)) ^ 552907418;
                        i2 = 952716408;
                    }
                    i5 = iM55680 ^ i2;
                    sArr2 = sArr2;
                    i20 = i5;
                    i19 = i;
                    break;
                case 1117164152:
                case 1669008455:
                    sArr2 = sArr2;
                    if (C0989.m56097(strM55995, i14) == i13) {
                        iOException2 = iOException3;
                        iM559710 = (C0946.m55979("֡ۜ") ^ i18) * (-91);
                        i11 = ((iM559710 ^ i17) * (-23231)) ^ 1006241823;
                        i12 = -171554608;
                        int i31 = iM559710 ^ i12;
                        iOException3 = iOException2;
                        short[] sArr7 = sArr2;
                        i20 = i31;
                        i19 = i11;
                        sArr2 = sArr7;
                    } else {
                        iM55680 = (i18 - C0946.m55979("ۚ᩺")) * (-33);
                        i = ((iM55680 ^ i17) * 17999) ^ 1318960189;
                        i2 = -1659394243;
                        i5 = iM55680 ^ i2;
                        sArr2 = sArr2;
                        i20 = i5;
                        i19 = i;
                    }
                    break;
                case 1262030964:
                case 1950392072:
                    i21 = 56397;
                    iM55682 = (C0946.m55979("֡ܳ") ^ i18) * (-69);
                    i8 = ((iM55682 ^ i17) * 14893) ^ (-884793368);
                    i9 = 1410086882;
                    int i211 = iM55682 ^ i9;
                    sArr2 = sArr2;
                    i13 = i13;
                    i20 = i211;
                    i19 = i8;
                    iOException3 = iOException3;
                    this = this;
                    break;
                case 1417924104:
                case 1902433327:
                    i21 = 8;
                    iM55682 = (C0946.m55979("֡ܳ") ^ i18) * (-69);
                    i8 = ((iM55682 ^ i17) * 14893) ^ (-884793368);
                    i9 = 1410086882;
                    int i212 = iM55682 ^ i9;
                    sArr2 = sArr2;
                    i13 = i13;
                    i20 = i212;
                    i19 = i8;
                    iOException3 = iOException3;
                    this = this;
                    break;
                case 1624685691:
                case 1910311707:
                    C1003.m56121(sb, C20448.f63161);
                    C20448.f63161 = C0863.m55639(sb);
                    return;
                default:
                    if (C0906.f81862 < 0) {
                        iM55681 = C0873.m55680("ܽܳ") ^ i17;
                        i = ((iM55681 ^ i18) * 29955) ^ (-546279038);
                        i4 = 53811957;
                        i20 = iM55681 ^ i4;
                        i19 = i;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        iOException = iOException3;
                        i3 = i13;
                        int iM556815 = C0873.m55680("ᩳܶ") ^ i18;
                        i6 = ((iM556815 ^ i17) * 3199) ^ (-1028256498);
                        i10 = iM556815 ^ (-2119655504);
                        s2 = s;
                        sArr2 = sArr;
                        sb = null;
                        i20 = i10;
                        i19 = i6;
                        i13 = i3;
                        iOException3 = iOException;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48582() {
        return !f67652;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008e A[PHI: r1
      0x008e: PHI (r1v19 java.lang.String) = (r1v2 java.lang.String), (r1v21 java.lang.String) binds: [B:13:0x008c, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x014f A[PHI: r6 r18
      0x014f: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:44:0x0190, B:40:0x0171, B:36:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r18v5 l.ۙۚ᩷) = (r18v3 l.ۙۚ᩷), (r18v4 l.ۙۚ᩷), (r18v3 l.ۙۚ᩷) binds: [B:44:0x0190, B:40:0x0171, B:36:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x019c A[PHI: r10
      0x019c: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:47:0x019a, B:44:0x0190, B:23:0x00ed, B:21:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d3 A[PHI: r3 r4 r7 r8
      0x01d3: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]) binds: [B:51:0x01d1, B:28:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r4v4 char) = (r4v3 char), (r4v2 char) binds: [B:51:0x01d1, B:28:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:51:0x01d1, B:28:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:51:0x01d1, B:28:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0218 A[PHI: r5
      0x0218: PHI (r5v5 short) = (r5v3 short), (r5v2 short) binds: [B:60:0x0216, B:23:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        short[] sArr;
        int iM55979;
        int i;
        int i2;
        int i3;
        String str;
        short[] sArr2;
        int i4;
        int i5 = C1404.f82149;
        int i6 = AbstractC0942.f81890;
        int iM55680 = (C0873.m55680("ۜ᩶") ^ i6) * (-101);
        int i7 = ((iM55680 ^ i5) * (-32253)) ^ 177039366;
        C6597 c6597M15080 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i8 = iM55680 ^ 1699365722;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -368782794;
        String strM56373 = null;
        short[] sArr5 = null;
        String strM55597 = null;
        int i15 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * 24221) >> 31));
            switch (i14) {
                case -1505011677:
                case 1963393353:
                    String str2 = strM55597;
                    sArr = sArr4;
                    strM56373 = C1124.m56373(sArr, i12, i13, i15);
                    if (C0873.f81841 <= 0) {
                        strM55597 = str2;
                        int iM55681 = (C0873.m55680("۬ۨ") + i5) * (-75);
                        sArr4 = sArr;
                        i2 = 777811053;
                        i4 = iM55681;
                        i = ((iM55681 ^ i6) * (-12625)) ^ 1017031019;
                        iM55979 = i4;
                    } else {
                        sArr4 = sArr;
                        iM55979 = C0946.m55979("ۤܳ") ^ i6;
                        i = ((iM55979 ^ i5) * (-19117)) ^ 1305555479;
                        strM55597 = str2;
                        i2 = -33318917;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1474689378:
                case -879694450:
                    s = sArr3[c];
                    if (C1003.f81929 <= 0) {
                        sArr2 = sArr4;
                        iM55979 = C0946.m55979("ܳ᩷") ^ i5;
                        sArr4 = sArr2;
                        i = ((iM55979 ^ i6) * 27333) ^ (-1171581518);
                        strM55597 = strM55597;
                        i2 = 765887414;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ܶۘ")) * 61;
                        i = ((iM55979 ^ i5) * 13439) ^ (-1200981592);
                        strM55597 = strM55597;
                        i2 = -1029139410;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1465269065:
                case 1223689968:
                    System.setProperty(strM55597, strM56373);
                    int i16 = AbstractC1499.f42720;
                    int i17 = C1256.f28490;
                    return;
                case -1422485073:
                case 454408212:
                    i3 = 22027;
                    int iM55682 = C0873.m55680("۟ܽ") ^ i6;
                    i = ((iM55682 ^ i5) * (-7879)) ^ (-1355381838);
                    i2 = 109695670;
                    i4 = iM55682;
                    i15 = i3;
                    iM55979 = i4;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1416781575:
                case -352074974:
                    sArr3 = f82969;
                    c = 0;
                    if (C1053.m56327() >= 0) {
                        str = strM55597;
                        iM55979 = (C0873.m55680("᩹۠") + i6) * 77;
                        i = ((iM55979 ^ i5) * (-2663)) ^ (-2076635638);
                        strM55597 = str;
                        i2 = 557697758;
                    } else {
                        iM55979 = (C0873.m55680("᩶ۡ") ^ i5) * (-49);
                        i = ((iM55979 ^ i6) * 26207) ^ 1234157238;
                        i2 = -868509433;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1047315786:
                case -404416247:
                    C7025.m16153(c6597M15080);
                    sArr5 = f82969;
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("ۨᩳ") + i5) * 45;
                        i = ((iM55979 ^ i6) * (-19209)) ^ 2051303197;
                        i2 = 679881543;
                    } else {
                        iM55979 = (C0946.m55979("ۜ۠") ^ i5) * (-77);
                        i = ((iM55979 ^ i6) * 32169) ^ (-394001579);
                        i2 = 1412416548;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -839590053:
                case -108241618:
                    C1024.m56209();
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0946.m55979("ۨᩳ") + i5) * 45;
                        i = ((iM55979 ^ i6) * (-19209)) ^ 2051303197;
                        i2 = 679881543;
                    } else {
                        str = strM55597;
                        iM55979 = (i6 - C0946.m55979("᩷ۜ")) * (-37);
                        i = ((iM55979 ^ i5) * 30487) ^ 127120483;
                        strM55597 = str;
                        i2 = 66309355;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -761045516:
                case -488080171:
                    c6597M15080 = C6597.m15080();
                    if (C0894.f81854 >= 0) {
                        str = strM55597;
                        iM55979 = (i6 - C0946.m55979("᩷ۜ")) * (-37);
                        i = ((iM55979 ^ i5) * 30487) ^ 127120483;
                        strM55597 = str;
                        i2 = 66309355;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩸") ^ i6;
                        i = ((iM55979 ^ i5) * 17621) ^ (-2129273003);
                        i2 = -1757848632;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -268985916:
                case 1690687731:
                    i9 = s * 32036;
                    if (C1053.m56327() >= 0) {
                        str = strM55597;
                        iM55979 = (i6 - C0946.m55979("᩷ۜ")) * (-37);
                        i = ((iM55979 ^ i5) * 30487) ^ 127120483;
                        strM55597 = str;
                        i2 = 66309355;
                    } else {
                        iM55979 = (i5 - C0873.m55680("֫ܰ")) * (-123);
                        i = ((iM55979 ^ i6) * (-9057)) ^ 992534270;
                        i2 = 393505605;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -233692036:
                case 1166880011:
                    sArr2 = f82969;
                    i13 = 4;
                    if (C0890.m55740()) {
                        iM55979 = (i6 - C0946.m55979("ۧܿ")) * (-23);
                        sArr4 = sArr2;
                        i = ((iM55979 ^ i5) * (-28081)) ^ (-923328421);
                        i12 = 36;
                        i2 = 1137179146;
                    } else {
                        i12 = 36;
                        iM55979 = C0946.m55979("ܳ᩷") ^ i5;
                        sArr4 = sArr2;
                        i = ((iM55979 ^ i6) * 27333) ^ (-1171581518);
                        strM55597 = strM55597;
                        i2 = 765887414;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 123956598:
                case 1947236312:
                    i10 = s * s;
                    i11 = 256576324;
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i6;
                        i = ((iM55979 ^ i5) * (-23645)) ^ 527189670;
                        i2 = 1822033815;
                    } else {
                        str = strM55597;
                        iM55979 = (C0873.m55680("᩹۠") + i6) * 77;
                        i = ((iM55979 ^ i5) * (-2663)) ^ (-2076635638);
                        strM55597 = str;
                        i2 = 557697758;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 254885993:
                case 1662322364:
                    C0967.m56074();
                    throw new RuntimeException();
                case 863754460:
                case 1193344728:
                    C0967.m56074();
                    if (C0946.m55980() == 0) {
                        iM55979 = (C0946.m55979("ۨᩳ") + i5) * 45;
                        i = ((iM55979 ^ i6) * (-19209)) ^ 2051303197;
                        i2 = 679881543;
                    } else {
                        sArr2 = sArr4;
                        iM55979 = C0946.m55979("ܳ᩷") ^ i5;
                        sArr4 = sArr2;
                        i = ((iM55979 ^ i6) * 27333) ^ (-1171581518);
                        strM55597 = strM55597;
                        i2 = 765887414;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 883007832:
                case 2049122273:
                    C0937.m55918();
                    C1012.m56134();
                    iM55979 = (C0946.m55979("ۨᩳ") + i5) * 45;
                    i = ((iM55979 ^ i6) * (-19209)) ^ 2051303197;
                    i2 = 679881543;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 895706767:
                case 1850276604:
                    i3 = 24386;
                    int iM55683 = C0873.m55680("۟ܽ") ^ i6;
                    i = ((iM55683 ^ i5) * (-7879)) ^ (-1355381838);
                    i2 = 109695670;
                    i4 = iM55683;
                    i15 = i3;
                    iM55979 = i4;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 976253365:
                case 1600648969:
                    if ((i10 + i11) - i9 >= 0) {
                        iM55979 = C0946.m55979("ܽ᩺") ^ i5;
                        i = ((iM55979 ^ i6) * 817) ^ (-878326919);
                        i2 = 2132558926;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩵") + i6) * 3;
                        i = ((iM55979 ^ i5) * (-14821)) ^ (-1808753465);
                        i2 = 1783267484;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 1344504075:
                case 2137740032:
                    C19945.m45266().m45267();
                    if (C1024.m56209() >= 0) {
                        sArr = sArr4;
                        int iM55684 = (C0873.m55680("۬ۨ") + i5) * (-75);
                        sArr4 = sArr;
                        i2 = 777811053;
                        i4 = iM55684;
                        i = ((iM55684 ^ i6) * (-12625)) ^ 1017031019;
                        iM55979 = i4;
                    } else {
                        iM55979 = (C0873.m55680("ܶ֫") ^ i5) * (-123);
                        i = ((iM55979 ^ i6) * 21417) ^ 1434502015;
                        i2 = -573073319;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 1883323834:
                case 2067675276:
                    strM55597 = C0854.m55597(sArr5, 1, 35, i15);
                    if (C1404.f82149 >= 0) {
                        sArr = sArr4;
                        int iM55685 = (C0873.m55680("۬ۨ") + i5) * (-75);
                        sArr4 = sArr;
                        i2 = 777811053;
                        i4 = iM55685;
                        i = ((iM55685 ^ i6) * (-12625)) ^ 1017031019;
                        iM55979 = i4;
                    } else {
                        iM55979 = C0946.m55979("᩻ᩳ") ^ i5;
                        i = ((iM55979 ^ i6) * (-31617)) ^ 1820536558;
                        i2 = 641420312;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                default:
                    str = strM55597;
                    C0892.m55749();
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i6 - C0946.m55979("᩷ۜ")) * (-37);
                        i = ((iM55979 ^ i5) * 30487) ^ 127120483;
                        strM55597 = str;
                        i2 = 66309355;
                    } else {
                        iM55979 = (C0873.m55680("᩹۠") + i6) * 77;
                        i = ((iM55979 ^ i5) * (-2663)) ^ (-2076635638);
                        strM55597 = str;
                        i2 = 557697758;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }
}
