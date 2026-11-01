package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H72R */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23408 {

    /* JADX INFO: renamed from: ۫ܰۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f83017 = {5989, 4453, 4418, 4426, 4431, 4422, 4423, 4355, 4439, 4428, 4355, 4433, 4422, 4430, 4428, 4437, 4422, 4355, 4438, 4429, 4431, 4428, 4418, 4423, 4418, 4417, 4431, 4422, 4355, 4355, 4431, 4426, 4417, 4433, 4418, 4433, 4442, 4355, 4416, 4418, 4416, 4427, 4422, 4355, 4355, 4431, 4426, 4417, 4433, 4418, 4433, 4442, 4453, 4418, 4426, 4431, 4422, 4423, 4355, 4439, 4428, 4355, 4431, 4428, 4418, 4423, 4355, 4453, 4418, 4426, 4431, 4422, 4423, 4355, 4439, 4428, 4355, 4426, 4429, 4426, 4439, 4426, 4418, 4431, 4426, 4441, 4422, 4355, 4431, 4428, 4418, 4423, 4422, 4423, 4355, 4355, 4431, 4426, 4417, 4433, 4418, 4433, 4442, 3857, 12885, 12889, 12830, 12822, 12813, 12889, 12844, 12823, 12828, 12801, 12809, 12828, 12826, 12813, 12828, 12829, 12889, 12889, 12821, 12816, 12827, 12811, 12824, 12811, 12800, 12889, 12810, 12816, 12803, 12828, 12867, 12889, 12828, 12801, 12809, 12828, 12826, 12813, 12828, 12829, 12889, 12889, 12821, 12816, 12827, 12811, 12824, 12811, 12800, 12889, 12842, 12849, 12856, 12884, 12875, 12876, 12879, 12867, 12889, 12828, 12801, 12809, 12828, 12826, 12813, 12828, 12829, 12889, 12861, 12828, 12826, 12822, 12820, 12809, 12811, 12828, 12810, 12810, 12828, 12829, 12889, 12889, 12821, 12816, 12827, 12811, 12824, 12811, 12800, 12889, 12828, 12801, 12826, 12828, 12828, 12829, 12810, 12889, 12828, 12801, 12809, 12828, 12826, 12813, 12828, 12829, 12889, 12810, 12816, 12803, 12828, 7108, -22602, -22643, -22654, -22655, -22641, -22650, -22589, -22633, -22644, -22589, -22649, -22650, -22633, -22650, -22639, -22642, -22646, -22643, -22650, -22589, -22633, -22645, -22650, -22589, -22656, -22634, -22639, -22639, -22650, -22643, -22633, -22589, -22637, -22639, -22644, -22656, -22650, -22640, -22640, -22589, -22622, -22623, -22614, -22602, -22643, -22640, -22634, -22637, -22637, -22644, -22639, -22633, -22650, -22649, -22589, -22622, -22623, -22614, -22567, -22589, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22579, -22633, -22642, -22637, -22578, -22619, -22654, -22646, -22641, -22650, -22649, -22589, -22633, -22644, -22589, -22637, -22639, -22650, -22637, -22654, -22639, -22650, -22589, -22610, -22646, -22640, -22640, -22646, -22643, -22652, -22589, -22619, -22654, -22646, -22641, -22650, -22649, -22589, -22633, -22644, -22589, -22637, -22634, -22655, -22641, -22646, -22640, -22645, -22589, -22637, -22639, -22650, -22637, -22654, -22639, -22650, -22649, -22589, -22619, -22654, -22646, -22641, -22650, -22649, -22589, -22633, -22644, -22589, -22656, -22639, -22650, -22654, -22633, -22650, -22589, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22589, -22656, -22654, -22656, -22645, -22650, -22589, -22649, -22646, -22639, -22650, -22656, -22633, -22644, -22639, -22630, -22619, -22654, -22646, -22641, -22650, -22649, -22589, -22633, -22644, -22589, -22639, -22650, -22642, -22644, -22635, -22650, -22589, -22646, -22643, -22635, -22654, -22641, -22646, -22649, -22589, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22589, -22656, -22654, -22656, -22645, -22650, -22656, -22654, -22656, -22645, -22650, -22649, -22654, -22639, -22642, -22571, -22569, -22578, -22635, -22565, -22654, -22619, -22654, -22646, -22641, -22650, -22649, -22589, -22633, -22644, -22589, -22635, -22650, -22639, -22646, -22651, -22630, -22589, -22656, -22654, -22656, -22645, -22650, -22649, -22589, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22589, -22651, -22644, -22639, -22589, -22622, -22623, -22614, -22589, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22589, -22649, -22644, -22636, -22643, -22641, -22644, -22654, -22649, -22589, -22602, -22607, -22609, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22589, -22639, -22650, -22638, -22634, -22650, -22640, -22633, -22589, -22651, -22654, -22646, -22641, -22650, -22649, -22589, -22636, -22646, -22633, -22645, -22589, -22613, -22601, -22601, -22605, -22589, -22637, -22639, -22650, -22637, -22654, -22639, -22650, -22649, -22589, -22641, -22646, -22655, -22639, -22654, -22639, -22630, -22589, -22639, -22650, -22640, -22637, -22644, -22643, -22640, -22650, -22589, -22655, -22644, -22649, -22630, -22589, -22646, -22640, -22589, -22650, -22642, -22637, -22633, -22630};

    /* JADX INFO: renamed from: ֫ */
    public final String f74559;

    /* JADX INFO: renamed from: ۧ */
    public final String f74560;

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f74561;

    /* JADX INFO: renamed from: ܽ */
    public final String f74562;

    /* JADX INFO: renamed from: ܿ */
    public final Object f74563;

    /* JADX INFO: renamed from: ᩳ */
    public final String f74564;

    /* JADX INFO: renamed from: ֫ */
    public abstract RuntimeException mo10853(String str, Throwable th);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo10854(String str);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo10855();

    /* JADX INFO: renamed from: ۧ */
    public abstract C22738 mo10856(String str);

    /* JADX INFO: renamed from: ܽ */
    public void mo10857() {
    }

    public AbstractC23408(String str, String str2, String str3, String str4, String str5) {
        Object obj = null;
        int i = -1908109766;
        int i2 = C1028.f81950;
        int i3 = C1046.f81962;
        int iM55680 = (C0873.m55680("ܽᩳ") ^ i2) * (-121);
        int i4 = ((iM55680 ^ i3) * 9523) ^ (-30549128);
        int i5 = 1378444108;
        while (true) {
            i = ((((i ^ i3) * (-14273)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2064319632:
                case -1282343284:
                    this.f74562 = str;
                    if (C0892.m55749()) {
                        iM55680 = (i2 - C0946.m55979("֫ۧ")) * 21;
                        i4 = ((iM55680 ^ i3) * (-3931)) ^ 513299586;
                        i5 = 1738290666;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ᩳ۟")) * 29;
                        i4 = ((iM55680 ^ i3) * 24417) ^ 1498817010;
                        i5 = 398884708;
                    }
                    break;
                case -1964044538:
                case -1101292606:
                    C0854.m55595();
                    iM55680 = C0873.m55680("۫᩵") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-32043)) ^ 1634078042;
                    i5 = 1518594755;
                    break;
                case -1963001353:
                case 825468585:
                    obj = new Object();
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("۠᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23857) ^ 757546829;
                        i5 = -393023746;
                    } else {
                        iM55680 = (C0946.m55979("ۢۧ") ^ i3) * (-29);
                        i4 = ((iM55680 ^ i2) * 9727) ^ 259672133;
                        i5 = 847031932;
                    }
                    break;
                case -1758609371:
                case 283201438:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i2 - C0946.m55979("ۛܳ")) * (-85);
                        i4 = ((iM55680 ^ i3) * 23937) ^ 968497398;
                        i5 = 60028990;
                    } else {
                        iM55680 = C0873.m55680("۠᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23857) ^ 757546829;
                        i5 = -393023746;
                    }
                    break;
                case -1309022287:
                case 1890647409:
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0873.m55680("۠᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23857) ^ 757546829;
                        i5 = -393023746;
                    } else {
                        iM55680 = (C0946.m55979("ۙۜ") ^ i3) * (-85);
                        i4 = ((iM55680 ^ i2) * 22527) ^ 955527052;
                        i5 = 1070362802;
                    }
                    break;
                case -1200365790:
                case 424564250:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("۠᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23857) ^ 757546829;
                        i5 = -393023746;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۙ۫")) * (-81);
                        i4 = ((iM55680 ^ i3) * 19617) ^ 93146791;
                        i5 = -1238271453;
                    }
                    break;
                case -1011601282:
                case -949953565:
                    if (C1024.f81946) {
                        iM55680 = (i2 - C0946.m55979("ۛܳ")) * (-85);
                        i4 = ((iM55680 ^ i3) * 23937) ^ 968497398;
                        i5 = 60028990;
                    } else {
                        iM55680 = C0873.m55680("ۗۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27425) ^ (-115414431);
                        i5 = -1686285714;
                    }
                    break;
                case -989030801:
                case -642762703:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("۠᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23857) ^ 757546829;
                        i5 = -393023746;
                    } else {
                        iM55680 = C0873.m55680("۫᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32043)) ^ 1634078042;
                        i5 = 1518594755;
                    }
                    break;
                case -246062435:
                case 146730416:
                    this.f74563 = obj;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("۫᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32043)) ^ 1634078042;
                        i5 = 1518594755;
                    } else {
                        iM55680 = C0873.m55680("ۤۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26917) ^ (-1086071394);
                        i5 = -767705681;
                    }
                    break;
                case -245406869:
                case -59640102:
                    if (C0890.f81849 != 0) {
                        iM55680 = (i2 - C0946.m55979("ᩳ۟")) * 29;
                        i4 = ((iM55680 ^ i3) * 24417) ^ 1498817010;
                        i5 = 398884708;
                    } else {
                        iM55680 = (C0946.m55979("֡֡") + i3) * 99;
                        i4 = ((iM55680 ^ i2) * (-17595)) ^ 1004856701;
                        i5 = 1634276456;
                    }
                    break;
                case 140495383:
                case 194653591:
                    this.f74564 = str3;
                    this.f74560 = str4;
                    this.f74559 = str5;
                    return;
                case 442821874:
                case 1735937773:
                    if (C1194.f82045 != 0) {
                        iM55680 = (i2 - C0946.m55979("ۛܳ")) * (-85);
                        i4 = ((iM55680 ^ i3) * 23937) ^ 968497398;
                        i5 = 60028990;
                    } else {
                        iM55680 = (C0946.m55979("ᩴܳ") ^ i3) * 19;
                        i4 = ((iM55680 ^ i2) * (-12345)) ^ (-1159945496);
                        i5 = 762806884;
                    }
                    break;
                case 666006441:
                case 2035371867:
                    if (C1036.m56257() <= 0) {
                        iM55680 = (i2 - C0946.m55979("ᩳ۟")) * 29;
                        i4 = ((iM55680 ^ i3) * 24417) ^ 1498817010;
                        i5 = 398884708;
                    } else {
                        iM55680 = C0946.m55979("ܰۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7809)) ^ (-1671813240);
                        i5 = 27386787;
                    }
                    break;
                case 1012552396:
                case 1365408350:
                    C1046.m56302();
                    C0912.m55833();
                    throw new RuntimeException();
                case 1551793196:
                case 1994669503:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ᩳ۟")) * 29;
                        i4 = ((iM55680 ^ i3) * 24417) ^ 1498817010;
                        i5 = 398884708;
                    } else {
                        iM55680 = (C0946.m55979("᩺ᩳ") + i2) * 87;
                        i4 = ((iM55680 ^ i3) * (-21851)) ^ (-1119842376);
                        i5 = 143017192;
                    }
                    break;
                default:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۛܳ")) * (-85);
                        i4 = ((iM55680 ^ i3) * 23937) ^ 968497398;
                        i5 = 60028990;
                    } else {
                        iM55680 = C0946.m55979("᩺ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21585)) ^ 504884108;
                        i5 = 1903743662;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52079() {
        if (this.f74561) {
            return;
        }
        synchronized (this.f74563) {
            if (this.f74561) {
                return;
            }
            m52078();
            this.f74561 = true;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 70801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ᩳ */
    private void m52078() {
        /*
            Method dump skipped, instruction units count: 7080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.AbstractC23408.m52078():void");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x012a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
    
        if (p067l.AbstractC0942.f81890 > 0) goto L41;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m52077(InputStream inputStream, File file, C22738 c22738) throws Throwable {
        String str;
        int i;
        int iM55979;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int iM559710;
        int i5;
        int i6;
        Object obj;
        int i7;
        int iM559711;
        int i8;
        Throwable th;
        int i9;
        MessageDigest messageDigest;
        int iM559712;
        int i10;
        int iM55680;
        int i11;
        int i12 = C0894.f81854;
        int i13 = C1003.f81929;
        int iM55681 = (C0873.m55680("ܿۚ") ^ i12) * (-99);
        int i14 = ((iM55681 ^ i13) * (-3941)) ^ (-2031584111);
        byte[] bArr2 = null;
        long j = 0;
        long j2 = 0;
        Object obj2 = null;
        String strM56077 = null;
        String strM56389 = null;
        short[] sArr = null;
        int i15 = iM55681 ^ (-1767303344);
        MessageDigest messageDigestM36668 = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        short s2 = 0;
        int i19 = 1734050976;
        FileOutputStream fileOutputStream = null;
        Throwable th2 = null;
        Object obj3 = null;
        long j3 = 0;
        int i20 = 0;
        InputStream inputStreamM6038 = null;
        Throwable th3 = null;
        String str2 = null;
        String strM56180 = null;
        long j4 = 0;
        while (true) {
            i19 = i15 ^ (i14 & (((i19 ^ i13) * (-28621)) >> 31));
            switch (i19) {
                case -2000427778:
                case -1671870115:
                    C1024.m56209();
                    iM55680 = (C0873.m55680("۬ܰ") + i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM55680 ^ i12) * (-11209)) ^ 1455053407;
                    i11 = -470909061;
                    i15 = iM55680 ^ i11;
                    i14 = i2;
                    break;
                case -1969360075:
                case 486167019:
                    Object obj4 = obj2;
                    String str3 = strM56077;
                    int i21 = i20;
                    try {
                        C0949.m56011(th3, obj4);
                        obj2 = obj4;
                        i20 = i21;
                        bArr = bArr2;
                        fileOutputStream = fileOutputStream;
                        messageDigestM36668 = messageDigestM36668;
                        strM56077 = str3;
                        strM56180 = strM56180;
                        iM559711 = C0873.m55680("ۨۚ") ^ i13;
                        i5 = ((iM559711 ^ i12) * 31615) ^ 691051242;
                        i8 = 1478239031;
                        i9 = iM559711 ^ i8;
                    } catch (Throwable th4) {
                        th2 = th4;
                        obj2 = obj4;
                        i20 = i21;
                        bArr = bArr2;
                        fileOutputStream = fileOutputStream;
                        messageDigestM36668 = messageDigestM36668;
                        strM56077 = str3;
                        strM56180 = strM56180;
                        obj = obj3;
                        int iM559713 = (i12 - C0946.m55979("ۛܰ")) * 115;
                        i5 = ((iM559713 ^ i13) * 4701) ^ (-1047190095);
                        i9 = iM559713 ^ (-1112504391);
                        obj3 = obj;
                    }
                    strM56180 = strM56180;
                    obj2 = obj2;
                    fileOutputStream = fileOutputStream;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str4 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str4;
                    break;
                case -1941352549:
                case -1473387081:
                    C1929.m56553();
                    return;
                case -1921157648:
                case 162805079:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    th2 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr3 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr3;
                    i18 = s2 * 37448;
                    s = 9362;
                    if (C1028.f81950 <= 0) {
                        iM559710 = (C0946.m55979("ۖᩳ") ^ i13) * (-67);
                        i5 = ((iM559710 ^ i12) * (-6703)) ^ (-1379983113);
                        i6 = 1000532818;
                    } else {
                        iM559710 = (C0873.m55680("ۖ᩸") ^ i13) * (-67);
                        i5 = ((iM559710 ^ i12) * 7615) ^ 200922102;
                        i6 = -169298515;
                    }
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str5 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str5;
                    break;
                case -1915565833:
                case -412250235:
                    obj2 = obj2;
                    str = strM56077;
                    i = i20;
                    strM56180 = RunnableC1014.m56180(sArr, i17, 6, i16);
                    if (C1404.f82149 < 0) {
                        iM55979 = (i12 - C0946.m55979("ۘ᩶")) * (-95);
                        i2 = ((iM55979 ^ i13) * (-369)) ^ (-89584609);
                        i3 = -758542391;
                        i4 = iM55979 ^ i3;
                        strM56077 = str;
                        i20 = i;
                        obj2 = obj2;
                        i15 = i4;
                        i14 = i2;
                    } else {
                        i20 = i;
                        bArr = bArr2;
                        fileOutputStream = fileOutputStream;
                        messageDigestM36668 = messageDigestM36668;
                        strM56077 = str;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        th2 = th2;
                        iM559710 = (C0946.m55979("ۖᩳ") ^ i13) * (-67);
                        i5 = ((iM559710 ^ i12) * (-6703)) ^ (-1379983113);
                        i6 = 1000532818;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                        messageDigestM36668 = messageDigest;
                        String str6 = strM56077;
                        bArr2 = bArr;
                        strM56077 = str6;
                    }
                    break;
                case -1908835920:
                case 825703525:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    th2 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr4 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr4;
                    try {
                        RunnableC0897.m55779(inputStreamM6038);
                        iM559710 = (C0873.m55680("ۗ᩻") + i13) * (-123);
                        i5 = ((iM559710 ^ i12) * 16327) ^ (-933768120);
                        i6 = 1856153303;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                    } catch (Throwable th5) {
                        int iM55682 = (C0873.m55680("᩶ۤ") + i13) * (-113);
                        int i22 = ((iM55682 ^ i12) * (-8461)) ^ (-163478268);
                        i7 = iM55682 ^ (-1688597550);
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = th5;
                        i14 = i22;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i7;
                    }
                    messageDigestM36668 = messageDigest;
                    String str7 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str7;
                    break;
                case -1867526999:
                case 1447904651:
                    String str8 = strM56077;
                    messageDigestM36668 = C16111.m36668();
                    inputStreamM6038 = C3410.m6038(inputStream);
                    int iM559714 = C0946.m55979("᩻ۙ") ^ i13;
                    i14 = ((iM559714 ^ i12) * 16721) ^ 208751340;
                    i15 = iM559714 ^ (-1946933502);
                    strM56077 = str8;
                    strM56180 = strM56180;
                    fileOutputStream = fileOutputStream;
                    bArr2 = new byte[32768];
                    i20 = i20;
                    th2 = th2;
                    obj3 = obj3;
                    obj2 = obj2;
                    break;
                case -1768199435:
                case 1170646359:
                    if (C0992.f81922 < 0) {
                        iM55680 = (i12 - C0873.m55680("ۚܶ")) * 57;
                        i2 = ((iM55680 ^ i13) * 28943) ^ (-2074326342);
                        i11 = 441480214;
                        i15 = iM55680 ^ i11;
                        i14 = i2;
                    }
                    i = i20;
                    int iM559715 = C0946.m55979("ᩳܿ") ^ i13;
                    i2 = ((iM559715 ^ i12) * (-13137)) ^ 829954400;
                    i4 = iM559715 ^ (-1430681670);
                    i20 = i;
                    i15 = i4;
                    i14 = i2;
                    break;
                case -1742291688:
                case -965938343:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    Throwable th6 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr5 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr5;
                    str2 = this.f74562;
                    if (i20 != -1) {
                        iM559710 = C0946.m55979("۠۬") ^ i13;
                        th2 = th6;
                        i5 = ((iM559710 ^ i12) * 29607) ^ 1558803144;
                        i6 = 2026810139;
                    } else {
                        th2 = th6;
                        iM559710 = (i12 - C0946.m55979("ۚۚ")) * (-13);
                        i5 = ((iM559710 ^ i13) * 12907) ^ (-944584973);
                        i6 = -348963858;
                    }
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str9 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str9;
                    break;
                case -1658582388:
                case 1971352592:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr6 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr6;
                    try {
                        j2 = c22738.f71705;
                        iM559711 = C0946.m55979("ۛ֡") ^ i12;
                        i5 = ((iM559711 ^ i13) * 14883) ^ (-1085592639);
                        i8 = 1963686687;
                        i9 = iM559711 ^ i8;
                        strM56180 = strM56180;
                        obj2 = obj2;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th7) {
                        th = th7;
                        th3 = th;
                        obj3 = obj3;
                        th2 = th2;
                        iM559710 = (C0873.m55680("ۖ᩹") ^ i12) * (-47);
                        i5 = ((iM559710 ^ i13) * (-4535)) ^ 108053331;
                        i6 = 1382762983;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                    }
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str10 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str10;
                    break;
                case -1508429944:
                case 611357278:
                    obj2 = obj2;
                    i = i20;
                    short[] sArr2 = f83017;
                    if (C1036.f81953 < 0) {
                        StringBuilder sbM11879 = C5410.m11879(strM56077, str2, C1053.m56325(sArr2, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 24, i16));
                        if (C0912.f81867 > 0) {
                            str = strM56077;
                            C1046.m56290(sbM11879, c22738.f71705);
                            C1003.m56121(sbM11879, strM56180);
                            if (C0949.f81897 < 0) {
                                C1046.m56290(sbM11879, j3);
                                throw new IOException(C0845.m55591(sbM11879));
                            }
                            i20 = i;
                            bArr = bArr2;
                            fileOutputStream = fileOutputStream;
                            messageDigestM36668 = messageDigestM36668;
                            strM56077 = str;
                            strM56180 = strM56180;
                            obj3 = obj3;
                            th2 = th2;
                            iM559710 = C0946.m55979("᩷ܿ") ^ i12;
                            i5 = ((iM559710 ^ i13) * (-18495)) ^ (-1452867848);
                            i6 = -2103610558;
                            i9 = iM559710 ^ i6;
                            th2 = th2;
                            strM56180 = strM56180;
                            obj3 = obj3;
                            fileOutputStream = fileOutputStream;
                            obj2 = obj2;
                            i20 = i20;
                            messageDigest = messageDigestM36668;
                            i15 = i9;
                            i14 = i5;
                            messageDigestM36668 = messageDigest;
                            String str11 = strM56077;
                            bArr2 = bArr;
                            strM56077 = str11;
                        } else {
                            iM559712 = (i12 - C0946.m55979("۠ۛ")) * (-13);
                            i2 = ((iM559712 ^ i13) * 30715) ^ (-2010621068);
                            i10 = 2048461195;
                            i4 = iM559712 ^ i10;
                            i20 = i;
                            obj2 = obj2;
                            i15 = i4;
                            i14 = i2;
                        }
                    } else {
                        i20 = i;
                        strM56180 = strM56180;
                        byte[] bArr7 = bArr2;
                        strM56077 = strM56077;
                        bArr = bArr7;
                        iM559710 = (C0946.m55979("ۖᩳ") ^ i13) * (-67);
                        i5 = ((iM559710 ^ i12) * (-6703)) ^ (-1379983113);
                        i6 = 1000532818;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                        messageDigestM36668 = messageDigest;
                        String str12 = strM56077;
                        bArr2 = bArr;
                        strM56077 = str12;
                    }
                    break;
                case -1503374324:
                case 265154255:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    th2 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr8 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr8;
                    int i23 = s2 + s;
                    if (i18 - (i23 * i23) > 0) {
                        iM559710 = (C0873.m55680("۟ۗ") + i13) * (-47);
                        i5 = ((iM559710 ^ i12) * (-16923)) ^ 134158691;
                        i6 = 1647725453;
                    } else {
                        iM559710 = (C0873.m55680("ܿ᩺") ^ i12) * 55;
                        i5 = ((iM559710 ^ i13) * 201) ^ 113012805;
                        i6 = 1929428405;
                    }
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str13 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str13;
                    break;
                case -1450294060:
                case 1579552599:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    strM56180 = strM56180;
                    obj = obj3;
                    Throwable th8 = th2;
                    byte[] bArr9 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr9;
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            int iM55683 = (C0873.m55680("ۚ᩶") ^ i12) * (-61);
                            i14 = ((iM55683 ^ i13) * (-25191)) ^ 1064012662;
                            messageDigestM36668 = messageDigestM36668;
                            strM56180 = strM56180;
                            i15 = iM55683 ^ 1702087258;
                            fileOutputStream = fileOutputStream2;
                            i20 = i20;
                            th2 = th8;
                            obj3 = obj;
                            obj2 = obj2;
                            bArr2 = bArr;
                            strM56077 = strM56077;
                        } catch (Throwable th9) {
                            th = th9;
                            th2 = th;
                            fileOutputStream = null;
                            int iM559716 = (i12 - C0946.m55979("ۛܰ")) * 115;
                            i5 = ((iM559716 ^ i13) * 4701) ^ (-1047190095);
                            i9 = iM559716 ^ (-1112504391);
                            obj3 = obj;
                            strM56180 = strM56180;
                            obj2 = obj2;
                            fileOutputStream = fileOutputStream;
                            i20 = i20;
                            messageDigest = messageDigestM36668;
                            i15 = i9;
                            i14 = i5;
                            messageDigestM36668 = messageDigest;
                            String str14 = strM56077;
                            bArr2 = bArr;
                            strM56077 = str14;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                    break;
                case -1427378975:
                case -518157981:
                    if (C1404.f82149 < 0) {
                        iM55680 = (C0873.m55680("۬ܰ") + i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM55680 ^ i12) * (-11209)) ^ 1455053407;
                        i11 = -470909061;
                    } else {
                        iM55680 = C0946.m55979("۟ۙ") ^ i12;
                        i2 = ((iM55680 ^ i13) * 1259) ^ (-462997755);
                        i11 = -1161843146;
                    }
                    i15 = iM55680 ^ i11;
                    i14 = i2;
                    break;
                case -1048069261:
                case -150168500:
                    if (C0845.f81821 < 0) {
                        iM55680 = C0946.m55979("۟ۙ") ^ i12;
                        i2 = ((iM55680 ^ i13) * 1259) ^ (-462997755);
                        i11 = -1161843146;
                    } else {
                        iM55680 = (C0873.m55680("ܿۛ") + i13) * (-117);
                        i2 = ((iM55680 ^ i12) * (-22979)) ^ 287069283;
                        i11 = -654646372;
                    }
                    i15 = iM55680 ^ i11;
                    i14 = i2;
                    break;
                case -1037387665:
                case 215681113:
                    obj2 = obj2;
                    i = i20;
                    strM56389 = C1194.m56389(messageDigestM36668.digest());
                    if (ViewOnClickListenerC0939.m55949(c22738.f71706, strM56389)) {
                        iM559712 = C0873.m55680("ۗ᩷") ^ i12;
                        i2 = ((iM559712 ^ i13) * 28501) ^ (-1502857035);
                        i10 = -902660955;
                    } else {
                        iM559712 = C0873.m55680("ᩴ᩶") ^ i13;
                        i2 = ((iM559712 ^ i12) * 23919) ^ 201087705;
                        i10 = 1297359275;
                    }
                    i4 = iM559712 ^ i10;
                    i20 = i;
                    obj2 = obj2;
                    i15 = i4;
                    i14 = i2;
                    break;
                case -969973419:
                case 1865299777:
                    short[] sArr3 = f83017;
                    i = i20;
                    if (C0947.f81895) {
                        int iM559717 = C0946.m55979("ᩳܿ") ^ i13;
                        i2 = ((iM559717 ^ i12) * (-13137)) ^ 829954400;
                        i4 = iM559717 ^ (-1430681670);
                        i20 = i;
                    } else {
                        String strM55936 = RunnableC0938.m55936(sArr3, 145, 27, i16);
                        if (!C0927.f81875) {
                            throw new IOException(C24420.m53894(C5410.m11879(strM56077, str2, strM55936), c22738.f71706, strM56180, strM56389));
                        }
                        iM559712 = C0946.m55979("ۧۜ") ^ i13;
                        i2 = ((iM559712 ^ i12) * 20003) ^ (-1315006370);
                        i10 = -1260196280;
                        i4 = iM559712 ^ i10;
                        i20 = i;
                        obj2 = obj2;
                    }
                    i15 = i4;
                    i14 = i2;
                    break;
                case -940237236:
                case -543644079:
                    if (C0947.f81895) {
                        i = i20;
                        iM559712 = C0946.m55979("ۧۜ") ^ i13;
                        i2 = ((iM559712 ^ i12) * 20003) ^ (-1315006370);
                        i10 = -1260196280;
                        i4 = iM559712 ^ i10;
                        i20 = i;
                        obj2 = obj2;
                        i15 = i4;
                        i14 = i2;
                    }
                    i = i20;
                    int iM559718 = C0946.m55979("ᩳܿ") ^ i13;
                    i2 = ((iM559718 ^ i12) * (-13137)) ^ 829954400;
                    i4 = iM559718 ^ (-1430681670);
                    i20 = i;
                    i15 = i4;
                    i14 = i2;
                    break;
                case -911858739:
                case 923717635:
                    bArr = bArr2;
                    i16 = 29788;
                    iM559710 = (C0873.m55680("᩺ۨ") ^ i12) * (-101);
                    i5 = ((iM559710 ^ i13) * 3399) ^ 1676673777;
                    i6 = -1093666860;
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str15 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str15;
                    break;
                case -889719387:
                case 1549324568:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    Throwable th11 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr10 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr10;
                    C0949.m56011(th11, obj3);
                    th2 = th11;
                    iM559710 = (C0873.m55680("ۗ᩻") + i13) * (-123);
                    i5 = ((iM559710 ^ i12) * 16327) ^ (-933768120);
                    i6 = 1856153303;
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str16 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str16;
                    break;
                case -794141748:
                case 1521954687:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr11 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr11;
                    j = j3 + ((long) i20);
                    iM559711 = C0946.m55979("ۜᩳ") ^ i13;
                    i5 = ((iM559711 ^ i12) * 10275) ^ (-643123298);
                    i8 = 1475986287;
                    i9 = iM559711 ^ i8;
                    strM56180 = strM56180;
                    obj2 = obj2;
                    fileOutputStream = fileOutputStream;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str17 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str17;
                    break;
                case -663091766:
                case 2053482413:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr12 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr12;
                    throw th3;
                case -588676006:
                case 608828573:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    th2 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr13 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr13;
                    if (C0992.f81922 >= 0) {
                        iM559710 = C0946.m55979("᩷ܿ") ^ i12;
                        i5 = ((iM559710 ^ i13) * (-18495)) ^ (-1452867848);
                        i6 = -2103610558;
                    } else {
                        iM559710 = (C0873.m55680("᩸ۗ") ^ i12) * 79;
                        i5 = ((iM559710 ^ i13) * (-17721)) ^ 80521360;
                        i6 = -319835638;
                    }
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str18 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str18;
                    break;
                case -576242288:
                case 1376191842:
                    obj2 = obj2;
                    i = i20;
                    strM56077 = C0967.m56077(f83017, UMErrorCode.E_UM_BE_JSON_FAILED, 11, i16);
                    if (j3 == j4) {
                        iM559712 = (C0946.m55979("֫ۘ") ^ i12) * (-97);
                        i2 = ((iM559712 ^ i13) * 6731) ^ 509417802;
                        i10 = 1771626181;
                    } else {
                        iM559712 = C0946.m55979("۬᩷") ^ i13;
                        i2 = ((iM559712 ^ i12) * (-7117)) ^ 753111080;
                        i10 = 101268285;
                    }
                    i4 = iM559712 ^ i10;
                    i20 = i;
                    obj2 = obj2;
                    i15 = i4;
                    i14 = i2;
                    break;
                case -463422861:
                case 350851994:
                    obj2 = obj2;
                    str = strM56077;
                    i = i20;
                    RunnableC0897.m55779(inputStreamM6038);
                    j4 = c22738.f71705;
                    sArr = f83017;
                    i17 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (i12 - C0946.m55979("ۡۤ")) * 45;
                        i2 = ((iM55979 ^ i13) * (-21673)) ^ (-1034638696);
                        i3 = 1344309689;
                        i4 = iM55979 ^ i3;
                        strM56077 = str;
                        i20 = i;
                        obj2 = obj2;
                        i15 = i4;
                        i14 = i2;
                    } else {
                        i20 = i;
                        bArr = bArr2;
                        fileOutputStream = fileOutputStream;
                        messageDigestM36668 = messageDigestM36668;
                        strM56077 = str;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        th2 = th2;
                        iM559710 = C0946.m55979("᩷ܿ") ^ i12;
                        i5 = ((iM559710 ^ i13) * (-18495)) ^ (-1452867848);
                        i6 = -2103610558;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                        messageDigestM36668 = messageDigest;
                        String str19 = strM56077;
                        bArr2 = bArr;
                        strM56077 = str19;
                    }
                    break;
                case -428055476:
                case 1420267725:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr14 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr14;
                    try {
                        fileOutputStream.close();
                        iM559711 = C0873.m55680("ۨۚ") ^ i13;
                        i5 = ((iM559711 ^ i12) * 31615) ^ 691051242;
                        i8 = 1478239031;
                        i9 = iM559711 ^ i8;
                        strM56180 = strM56180;
                        obj2 = obj2;
                        fileOutputStream = fileOutputStream;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                        messageDigestM36668 = messageDigest;
                        String str110 = strM56077;
                        bArr2 = bArr;
                        strM56077 = str110;
                    } catch (Throwable th12) {
                        int iM559719 = C0946.m55979("ۚᩴ") ^ i13;
                        strM56180 = strM56180;
                        fileOutputStream = fileOutputStream;
                        i20 = i20;
                        obj2 = th12;
                        i14 = ((iM559719 ^ i12) * 29537) ^ (-2062080987);
                        i15 = iM559719 ^ 1048831833;
                        messageDigestM36668 = messageDigestM36668;
                        bArr2 = bArr;
                        strM56077 = strM56077;
                    }
                    break;
                case -421908656:
                case 1921151330:
                    RunnableC0871.m55672();
                    if (C0863.f81833 > 0) {
                        obj2 = obj2;
                        i = i20;
                        iM559712 = (i12 - C0946.m55979("۠ۛ")) * (-13);
                        i2 = ((iM559712 ^ i13) * 30715) ^ (-2010621068);
                        i10 = 2048461195;
                        i4 = iM559712 ^ i10;
                        i20 = i;
                        obj2 = obj2;
                        i15 = i4;
                        i14 = i2;
                    }
                    iM55680 = (C0873.m55680("۬ܰ") + i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i2 = ((iM55680 ^ i12) * (-11209)) ^ 1455053407;
                    i11 = -470909061;
                    i15 = iM55680 ^ i11;
                    i14 = i2;
                    break;
                case -418805998:
                case 266751363:
                    if (!C0967.m56074()) {
                        obj2 = obj2;
                        i20 = i20;
                        strM56180 = strM56180;
                        byte[] bArr15 = bArr2;
                        strM56077 = strM56077;
                        bArr = bArr15;
                        iM559710 = (C0946.m55979("ۖᩳ") ^ i13) * (-67);
                        i5 = ((iM559710 ^ i12) * (-6703)) ^ (-1379983113);
                        i6 = 1000532818;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                        messageDigestM36668 = messageDigest;
                        String str111 = strM56077;
                        bArr2 = bArr;
                        strM56077 = str111;
                    } else {
                        iM55680 = C0946.m55979("۟ۙ") ^ i12;
                        i2 = ((iM55680 ^ i13) * 1259) ^ (-462997755);
                        i11 = -1161843146;
                        i15 = iM55680 ^ i11;
                        i14 = i2;
                    }
                    break;
                case -220497492:
                case 794566533:
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    byte[] bArr16 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr16;
                    j3 = 0;
                    iM559710 = C0946.m55979("ܰ۬") ^ i13;
                    i5 = ((iM559710 ^ i12) * 31283) ^ 2035415293;
                    i6 = -1301207777;
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str112 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str112;
                    break;
                case -139616283:
                case 967625880:
                    Object obj5 = obj2;
                    String str20 = strM56077;
                    obj2 = obj5;
                    i20 = i20;
                    bArr = bArr2;
                    fileOutputStream = fileOutputStream;
                    try {
                        fileOutputStream.write(bArr, 0, i20);
                        messageDigestM36668.update(bArr, 0, i20);
                        strM56077 = str20;
                        j3 = j;
                        iM559710 = C0946.m55979("ܰ۬") ^ i13;
                        i5 = ((iM559710 ^ i12) * 31283) ^ 2035415293;
                        i6 = -1301207777;
                    } catch (Throwable th13) {
                        th3 = th13;
                        messageDigestM36668 = messageDigestM36668;
                        strM56077 = str20;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        th2 = th2;
                        iM559710 = (C0873.m55680("ۖ᩹") ^ i12) * (-47);
                        i5 = ((iM559710 ^ i13) * (-4535)) ^ 108053331;
                        i6 = 1382762983;
                    }
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str113 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str113;
                    break;
                case -126639024:
                case 49078212:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr17 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr17;
                    if (j <= j2) {
                        iM559711 = (C0946.m55979("ܳۛ") + i12) * 51;
                        i5 = ((iM559711 ^ i13) * (-4201)) ^ 1328204768;
                        i8 = -658802586;
                    } else {
                        iM559711 = C0946.m55979("᩵ܺ") ^ i12;
                        i5 = ((iM559711 ^ i13) * (-17331)) ^ 171803926;
                        i8 = -156206495;
                    }
                    i9 = iM559711 ^ i8;
                    strM56180 = strM56180;
                    obj2 = obj2;
                    fileOutputStream = fileOutputStream;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str114 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str114;
                    break;
                case 27085387:
                case 1370535536:
                    throw th2;
                case 229942026:
                case 1708669619:
                    RunnableC0938.m55938();
                    if (!C0955.f81898) {
                        messageDigestM36668 = messageDigestM36668;
                        obj2 = obj2;
                        i20 = i20;
                        obj3 = obj3;
                        th2 = th2;
                        fileOutputStream = fileOutputStream;
                        strM56180 = strM56180;
                        byte[] bArr18 = bArr2;
                        strM56077 = strM56077;
                        bArr = bArr18;
                        iM559710 = C0946.m55979("᩷ܿ") ^ i12;
                        i5 = ((iM559710 ^ i13) * (-18495)) ^ (-1452867848);
                        i6 = -2103610558;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                        messageDigestM36668 = messageDigest;
                        String str115 = strM56077;
                        bArr2 = bArr;
                        strM56077 = str115;
                    } else {
                        iM55680 = (C0873.m55680("۬ܰ") + i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM55680 ^ i12) * (-11209)) ^ 1455053407;
                        i11 = -470909061;
                        i15 = iM55680 ^ i11;
                        i14 = i2;
                    }
                    break;
                case 402528203:
                case 1912566984:
                    bArr = bArr2;
                    i16 = 12921;
                    iM559710 = (C0873.m55680("᩺ۨ") ^ i12) * (-101);
                    i5 = ((iM559710 ^ i13) * 3399) ^ 1676673777;
                    i6 = -1093666860;
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str116 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str116;
                    break;
                case 550754558:
                case 1172799648:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    th2 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr19 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr19;
                    s2 = f83017[103];
                    if (C0949.f81897 >= 0) {
                        iM559710 = C0873.m55680("ۧ֫") ^ i13;
                        i5 = ((iM559710 ^ i12) * 17531) ^ 1695694170;
                        i6 = -443769472;
                    } else {
                        iM559710 = (C0946.m55979("᩺᩹") + i13) * (-63);
                        i5 = ((iM559710 ^ i12) * 29977) ^ 1817029497;
                        i6 = -1964603216;
                    }
                    i9 = iM559710 ^ i6;
                    th2 = th2;
                    strM56180 = strM56180;
                    obj3 = obj3;
                    fileOutputStream = fileOutputStream;
                    obj2 = obj2;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str117 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str117;
                    break;
                case 935817349:
                case 2132963465:
                    C1229.m56410();
                    break;
                case 960702252:
                case 1196070732:
                    return;
                case 1002561541:
                case 1670163255:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr20 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr20;
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    try {
                        fileOutputStream.close();
                        iM559711 = C0946.m55979("᩵᩺") ^ i13;
                        i5 = ((iM559711 ^ i12) * 6553) ^ 1017243885;
                        i8 = 915637591;
                        i9 = iM559711 ^ i8;
                    } catch (Throwable th14) {
                        th2 = th14;
                        obj = obj3;
                        int iM5597110 = (i12 - C0946.m55979("ۛܰ")) * 115;
                        i5 = ((iM5597110 ^ i13) * 4701) ^ (-1047190095);
                        i9 = iM5597110 ^ (-1112504391);
                        obj3 = obj;
                    }
                    strM56180 = strM56180;
                    obj2 = obj2;
                    fileOutputStream = fileOutputStream;
                    i20 = i20;
                    messageDigest = messageDigestM36668;
                    i15 = i9;
                    i14 = i5;
                    messageDigestM36668 = messageDigest;
                    String str118 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str118;
                    break;
                case 1903230319:
                case 2076918893:
                    obj2 = obj2;
                    String str21 = strM56077;
                    i20 = i20;
                    bArr = bArr2;
                    fileOutputStream = fileOutputStream;
                    try {
                        StringBuilder sb = new StringBuilder();
                        messageDigestM36668 = messageDigestM36668;
                        try {
                            strM56077 = str21;
                            strM56180 = strM56180;
                            C0912.m55825(sb, C0930.m55893(f83017, 172, 13, i16));
                            C0912.m55825(sb, str2);
                            C1003.m56121(sb, C0890.m55726(f83017, 185, 30, i16));
                            throw new IOException(C0863.m55639(sb));
                        } catch (Throwable th15) {
                            th = th15;
                            strM56077 = str21;
                            strM56180 = strM56180;
                            th3 = th;
                            obj3 = obj3;
                            th2 = th2;
                            iM559710 = (C0873.m55680("ۖ᩹") ^ i12) * (-47);
                            i5 = ((iM559710 ^ i13) * (-4535)) ^ 108053331;
                            i6 = 1382762983;
                            i9 = iM559710 ^ i6;
                            th2 = th2;
                            strM56180 = strM56180;
                            obj3 = obj3;
                            fileOutputStream = fileOutputStream;
                            obj2 = obj2;
                            i20 = i20;
                            messageDigest = messageDigestM36668;
                            i15 = i9;
                            i14 = i5;
                            messageDigestM36668 = messageDigest;
                            String str119 = strM56077;
                            bArr2 = bArr;
                            strM56077 = str119;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        messageDigestM36668 = messageDigestM36668;
                    }
                    break;
                default:
                    messageDigestM36668 = messageDigestM36668;
                    obj2 = obj2;
                    i20 = i20;
                    obj3 = obj3;
                    th2 = th2;
                    fileOutputStream = fileOutputStream;
                    strM56180 = strM56180;
                    byte[] bArr21 = bArr2;
                    strM56077 = strM56077;
                    bArr = bArr21;
                    try {
                        int i24 = inputStreamM6038.read(bArr);
                        int iM559720 = C0946.m55979("᩷ܰ") ^ i12;
                        int i25 = ((iM559720 ^ i13) * 14671) ^ (-723530071);
                        i7 = iM559720 ^ 1259851177;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i24;
                        i14 = i25;
                        messageDigest = messageDigestM36668;
                        i15 = i7;
                    } catch (Throwable th17) {
                        th3 = th17;
                        iM559710 = (C0873.m55680("ۖ᩹") ^ i12) * (-47);
                        i5 = ((iM559710 ^ i13) * (-4535)) ^ 108053331;
                        i6 = 1382762983;
                        i9 = iM559710 ^ i6;
                        th2 = th2;
                        strM56180 = strM56180;
                        obj3 = obj3;
                        fileOutputStream = fileOutputStream;
                        obj2 = obj2;
                        i20 = i20;
                        messageDigest = messageDigestM36668;
                        i15 = i9;
                        i14 = i5;
                    }
                    messageDigestM36668 = messageDigest;
                    String str1110 = strM56077;
                    bArr2 = bArr;
                    strM56077 = str1110;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52076(File file, String str) {
        String str2;
        LinkageError linkageError;
        short[] sArr;
        int i;
        String str3;
        String str4;
        String str5;
        int iM55979;
        int i2;
        int i3;
        int i4;
        int i5;
        String str6;
        LinkageError linkageError2;
        int iM55680;
        int i6;
        int i7;
        String str7;
        int iM55681;
        int i8;
        int iM55682;
        int i9;
        int i10;
        AbstractC23408 abstractC23408 = this;
        int i11 = C0877.f81843;
        int i12 = RunnableC0938.f81886;
        int iM55683 = (C0873.m55680("ۘܰ") + i11) * (-17);
        int i13 = ((iM55683 ^ i12) * (-24627)) ^ 1882708928;
        String strM55707 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i14 = iM55683 ^ 1348155581;
        LinkageError linkageError3 = null;
        int i15 = 0;
        int i16 = 0;
        StringBuilder sb = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        int i21 = 0;
        int i22 = -479849031;
        int i23 = 0;
        Throwable th = null;
        String str8 = null;
        String strM55936 = null;
        String strM55947 = null;
        String str9 = null;
        String str10 = null;
        short[] sArr5 = null;
        short s2 = 0;
        while (true) {
            i22 = i14 ^ (i13 & (((i22 ^ i12) * 27617) >> 31));
            switch (i22) {
                case -2083947914:
                case -1763057604:
                    short[] sArr6 = f83017;
                    if (RunnableC1014.f81941 > 0) {
                        sb = new StringBuilder(C1964.m56584(sArr6, 67, 28, i15));
                        str8 = abstractC23408.f74562;
                        if (C1194.f82045 == 0) {
                            int iM55684 = C0873.m55680("ۜ֫") ^ i12;
                            i5 = ((iM55684 ^ i11) * (-21333)) ^ 2116143407;
                            i14 = iM55684 ^ 1180600233;
                            i13 = i5;
                        } else {
                            str8 = str8;
                            sArr4 = sArr4;
                            linkageError3 = linkageError3;
                            iM55979 = C0946.m55979("֡ۗ") ^ i11;
                            i2 = ((iM55979 ^ i12) * 15931) ^ (-1603931474);
                            i3 = 1605276482;
                            i4 = iM55979 ^ i3;
                            str8 = str8;
                            linkageError3 = linkageError3;
                            i14 = i4;
                            i13 = i2;
                            sArr4 = sArr4;
                            abstractC23408 = this;
                        }
                    } else {
                        str8 = str8;
                        sArr4 = sArr4;
                        linkageError3 = linkageError3;
                        int iM559710 = C0946.m55979("ܺᩳ") ^ i11;
                        i2 = ((iM559710 ^ i12) * 7835) ^ 923404857;
                        i4 = iM559710 ^ 1767211477;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        sb = null;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    }
                    break;
                case -1966133649:
                case -1546789515:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    int i24 = i19 + 329277316;
                    i20 = i24 + i24;
                    s2 = 18146;
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("֡ۗ") ^ i11;
                        i2 = ((iM55979 ^ i12) * 15931) ^ (-1603931474);
                        i3 = 1605276482;
                    } else {
                        iM55979 = C0946.m55979("᩶ۡ") ^ i12;
                        i2 = ((iM55979 ^ i11) * (-14265)) ^ (-1650352037);
                        i3 = 595505302;
                    }
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case -1935338574:
                case -417701455:
                    if (C0877.f81843 >= 0) {
                        str8 = str8;
                        sArr4 = sArr4;
                        linkageError3 = linkageError3;
                        iM55979 = C0946.m55979("ܶܳ") ^ i11;
                        i2 = ((iM55979 ^ i12) * (-5161)) ^ (-101630914);
                        i3 = -261092393;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    } else {
                        str6 = str8;
                        sArr4 = sArr4;
                        linkageError2 = linkageError3;
                        iM55680 = C0873.m55680("֨ܳ") ^ i12;
                        i6 = ((iM55680 ^ i11) * 25977) ^ 1356432111;
                        i7 = 1863806898;
                        str8 = str6;
                        i14 = iM55680 ^ i7;
                        i13 = i6;
                        linkageError3 = linkageError2;
                        sArr4 = sArr4;
                    }
                    break;
                case -1904748994:
                case -696177857:
                    C1124.m56367();
                    if (C1036.f81953 >= 0) {
                        str8 = str8;
                        sArr4 = sArr4;
                        linkageError3 = linkageError3;
                        iM55979 = C0946.m55979("֡ۗ") ^ i11;
                        i2 = ((iM55979 ^ i12) * 15931) ^ (-1603931474);
                        i3 = 1605276482;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    } else {
                        str6 = str8;
                        sArr4 = sArr4;
                        linkageError2 = linkageError3;
                        iM55680 = C0873.m55680("֨ܳ") ^ i12;
                        i6 = ((iM55680 ^ i11) * 25977) ^ 1356432111;
                        i7 = 1863806898;
                        str8 = str6;
                        i14 = iM55680 ^ i7;
                        i13 = i6;
                        linkageError3 = linkageError2;
                        sArr4 = sArr4;
                    }
                    break;
                case -1903081818:
                case 558933663:
                    throw abstractC23408.mo10853(C21459.m48622(C0989.m56092(sArr5, i16, i17, i15), str, strM55947, str10, strM55936), linkageError3);
                case -1898016976:
                case 468718354:
                    str2 = str8;
                    if (!C0927.m55869(file)) {
                        str4 = strM55707;
                        sArr4 = sArr4;
                        linkageError = linkageError3;
                        sArr = sArr3;
                        str5 = str9;
                        str3 = str10;
                        i = i21;
                        int iM559711 = C0946.m55979("ܶۜ") ^ i11;
                        strM55707 = str4;
                        i21 = i;
                        str10 = str3;
                        str9 = str5;
                        str8 = str2;
                        i14 = iM559711 ^ 433246818;
                        i13 = ((iM559711 ^ i12) * 13459) ^ (-1101842193);
                        sArr3 = sArr;
                        linkageError3 = linkageError;
                        abstractC23408 = this;
                        sArr4 = sArr4;
                    } else {
                        iM55682 = (C0946.m55979("ۙۙ") + i11) * (-57);
                        i9 = ((iM55682 ^ i12) * 12831) ^ 1127099207;
                        i10 = -1934511857;
                        String str11 = str2;
                        i14 = iM55682 ^ i10;
                        i13 = i9;
                        str8 = str11;
                    }
                    break;
                case -1882016030:
                case -1306203666:
                    str6 = str8;
                    sArr4 = sArr4;
                    linkageError2 = linkageError3;
                    try {
                        mo10857();
                        iM55680 = (C0873.m55680("ܽ֨") ^ i11) * (-71);
                        i6 = ((iM55680 ^ i12) * 30811) ^ 1387041183;
                        i7 = 657809546;
                    } catch (Exception | LinkageError e) {
                        th = e;
                        iM55680 = (C0873.m55680("ܰ۟") + i11) * (-71);
                        i6 = ((iM55680 ^ i12) * 19269) ^ 1063678868;
                        i7 = 289009232;
                    }
                    str8 = str6;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    linkageError3 = linkageError2;
                    sArr4 = sArr4;
                    break;
                case -1751306727:
                case 248163701:
                    str6 = str8;
                    sArr4 = sArr4;
                    linkageError2 = linkageError3;
                    strM55947 = ViewOnClickListenerC0939.m55947(f83017, 43, 1, i15);
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("֨ܳ") ^ i12;
                        i6 = ((iM55680 ^ i11) * 25977) ^ 1356432111;
                        i7 = 1863806898;
                    } else {
                        iM55680 = (i12 - C0873.m55680("֡᩺")) * (-121);
                        i6 = ((iM55680 ^ i11) * (-11897)) ^ 1213086600;
                        i7 = 1618305252;
                    }
                    str8 = str6;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    linkageError3 = linkageError2;
                    sArr4 = sArr4;
                    break;
                case -1595640468:
                case 1096110711:
                    return;
                case -1408869600:
                case -17562093:
                    C0877.m55696();
                    return;
                case -1298246505:
                case 1694936328:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    int i25 = s + s2;
                    if (i20 - (i25 * i25) < 0) {
                        iM55979 = (C0946.m55979("ۧۜ") ^ i11) * (-53);
                        i2 = ((iM55979 ^ i12) * (-31019)) ^ 526561630;
                        i3 = -420758298;
                    } else {
                        iM55979 = (C0946.m55979("֫۬") + i11) * 79;
                        i2 = ((iM55979 ^ i12) * (-23635)) ^ (-1982587633);
                        i3 = -1255609815;
                    }
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case -1287977123:
                case -771023641:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    try {
                        System.load(file.getAbsolutePath());
                        iM55979 = (C0873.m55680("ۢۚ") + i11) * (-95);
                        i2 = ((iM55979 ^ i12) * (-12907)) ^ (-1056270265);
                        i3 = -2106097765;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                    } catch (LinkageError e2) {
                        linkageError3 = e2;
                        int iM55685 = (C0873.m55680("᩶ܳ") + i11) * (-85);
                        sArr4 = sArr4;
                        str8 = str8;
                        i14 = iM55685 ^ (-342955370);
                        i13 = ((iM55685 ^ i12) * (-24713)) ^ (-1791953054);
                    }
                    abstractC23408 = this;
                    break;
                case -1061142683:
                case 1692857458:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    sArr3 = f83017;
                    i21 = 29;
                    if (RunnableC1014.m56177()) {
                        iM55979 = (C0946.m55979("ۚܺ") ^ i12) * (-99);
                        i2 = ((iM55979 ^ i11) * 16945) ^ (-1088664104);
                        i3 = -1798772233;
                    } else {
                        iM55979 = C0946.m55979("ۖۖ") ^ i12;
                        i2 = ((iM55979 ^ i11) * 10227) ^ (-1620403222);
                        i3 = -1267425118;
                    }
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case -964699796:
                case 1602846859:
                    i15 = 4387;
                    iM55979 = (C0946.m55979("ܰۙ") ^ i12) * (-117);
                    i2 = ((iM55979 ^ i11) * (-7353)) ^ 403224350;
                    i3 = -534952580;
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case -773768183:
                case 2121378556:
                    C0898.m55800();
                    if (C1017.f81942 >= 0) {
                        str8 = str8;
                        sArr4 = sArr4;
                        linkageError3 = linkageError3;
                        iM55979 = (i11 - C0946.m55979("ܰۚ")) * 119;
                        i2 = ((iM55979 ^ i12) * (-8427)) ^ 803654880;
                        i3 = 225431120;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    } else {
                        str6 = str8;
                        sArr4 = sArr4;
                        linkageError2 = linkageError3;
                        iM55680 = C0873.m55680("֨ܳ") ^ i12;
                        i6 = ((iM55680 ^ i11) * 25977) ^ 1356432111;
                        i7 = 1863806898;
                        str8 = str6;
                        i14 = iM55680 ^ i7;
                        i13 = i6;
                        linkageError3 = linkageError2;
                        sArr4 = sArr4;
                    }
                    break;
                case -675446068:
                case 70905547:
                    throw abstractC23408.mo10853(C10965.m25286(sb, str8, C0863.m55635(f83017, 95, 8, i15)), th);
                case -595340188:
                case -244596484:
                    throw abstractC23408.mo10853(str9, linkageError3);
                case -591132864:
                case 40241484:
                    str2 = str8;
                    if (!file.delete()) {
                        iM55682 = C0873.m55680("ۜܶ") ^ i12;
                        i9 = ((iM55682 ^ i11) * (-8911)) ^ 312023167;
                        i10 = -1978460190;
                        String str12 = str2;
                        i14 = iM55682 ^ i10;
                        i13 = i9;
                        str8 = str12;
                    } else {
                        str4 = strM55707;
                        sArr4 = sArr4;
                        linkageError = linkageError3;
                        sArr = sArr3;
                        str5 = str9;
                        str3 = str10;
                        i = i21;
                        int iM559712 = C0946.m55979("ܶۜ") ^ i11;
                        strM55707 = str4;
                        i21 = i;
                        str10 = str3;
                        str9 = str5;
                        str8 = str2;
                        i14 = iM559712 ^ 433246818;
                        i13 = ((iM559712 ^ i12) * 13459) ^ (-1101842193);
                        sArr3 = sArr;
                        linkageError3 = linkageError;
                        abstractC23408 = this;
                        sArr4 = sArr4;
                    }
                    break;
                case -588543098:
                case 1929857243:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    sArr2 = f83017;
                    if (C1046.m56302() != 0) {
                        iM55979 = (i11 - C0946.m55979("ܰۚ")) * 119;
                        i2 = ((iM55979 ^ i12) * (-8427)) ^ 803654880;
                        i3 = 225431120;
                    } else {
                        iM55979 = (C0873.m55680("ۢ֫") + i12) * 65;
                        i2 = ((iM55979 ^ i11) * 19471) ^ 816392559;
                        i3 = 1230875043;
                    }
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case -205666601:
                case 630695240:
                    if (C1053.f81965 <= 0) {
                        str7 = str8;
                        iM55681 = (i12 - C0946.m55979("۠ܳ")) * (-27);
                        i5 = ((iM55681 ^ i11) * 4737) ^ 151728463;
                        i8 = 326722925;
                        str8 = str7;
                        i14 = iM55681 ^ i8;
                        i13 = i5;
                    } else {
                        str6 = str8;
                        sArr4 = sArr4;
                        linkageError2 = linkageError3;
                        iM55680 = C0873.m55680("֨ܳ") ^ i12;
                        i6 = ((iM55680 ^ i11) * 25977) ^ 1356432111;
                        i7 = 1863806898;
                        str8 = str6;
                        i14 = iM55680 ^ i7;
                        i13 = i6;
                        linkageError3 = linkageError2;
                        sArr4 = sArr4;
                    }
                    break;
                case -43430481:
                case 2118121335:
                    if (C1048.m56305() >= 0) {
                        str8 = str8;
                        sArr4 = sArr4;
                        linkageError3 = linkageError3;
                        iM55979 = C0946.m55979("ۖۖ") ^ i12;
                        i2 = ((iM55979 ^ i11) * 10227) ^ (-1620403222);
                        i3 = -1267425118;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    } else {
                        str7 = str8;
                        iM55681 = (i12 - C0946.m55979("۠ܳ")) * (-27);
                        i5 = ((iM55681 ^ i11) * 4737) ^ 151728463;
                        i8 = 326722925;
                        str8 = str7;
                        i14 = iM55681 ^ i8;
                        i13 = i5;
                    }
                    break;
                case 343334726:
                case 1428650312:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    strM55707 = C0877.m55707(f83017, 1, 28, i15);
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("۬ܰ") ^ i12;
                        i2 = ((iM55979 ^ i11) * (-21561)) ^ (-564625678);
                        i3 = 1361264011;
                    } else {
                        iM55979 = C0946.m55979("ܶܳ") ^ i11;
                        i2 = ((iM55979 ^ i12) * (-5161)) ^ (-101630914);
                        i3 = -261092393;
                    }
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case 610352398:
                case 724938533:
                    C0992.m56107();
                    str6 = str8;
                    sArr4 = sArr4;
                    linkageError2 = linkageError3;
                    iM55680 = C0873.m55680("֨ܳ") ^ i12;
                    i6 = ((iM55680 ^ i11) * 25977) ^ 1356432111;
                    i7 = 1863806898;
                    str8 = str6;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    linkageError3 = linkageError2;
                    sArr4 = sArr4;
                    break;
                case 1112469328:
                case 1323818957:
                    str8 = str8;
                    sArr4 = sArr4;
                    linkageError3 = linkageError3;
                    s = sArr2[0];
                    i19 = s * s;
                    if (C0866.f81837 >= 0) {
                        int iM559713 = C0946.m55979("ܺᩳ") ^ i11;
                        i2 = ((iM559713 ^ i12) * 7835) ^ 923404857;
                        i4 = iM559713 ^ 1767211477;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        sb = null;
                    } else {
                        iM55979 = C0946.m55979("ۚᩳ") ^ i11;
                        i2 = ((iM55979 ^ i12) * 10597) ^ 955548156;
                        i3 = 75553451;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                    }
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                case 1397970495:
                case 1710775580:
                    str8 = str8;
                    int i26 = i23;
                    sArr4 = sArr4;
                    strM55936 = RunnableC0938.m55936(sArr4, i26, i18, i15);
                    short[] sArr7 = f83017;
                    i17 = 15;
                    if (RunnableC0897.f81856) {
                        int iM55686 = C0873.m55680("ᩳۜ") ^ i11;
                        int i27 = ((iM55686 ^ i12) * 293) ^ (-340910705);
                        sArr4 = sArr4;
                        str8 = str8;
                        i14 = iM55686 ^ (-1357085109);
                        i23 = i26;
                        sArr5 = sArr7;
                        i13 = i27;
                        i16 = 52;
                    } else {
                        linkageError3 = linkageError3;
                        i23 = i26;
                        i16 = 52;
                        sArr5 = sArr7;
                        iM55979 = C0946.m55979("ܶܳ") ^ i11;
                        i2 = ((iM55979 ^ i12) * (-5161)) ^ (-101630914);
                        i3 = -261092393;
                        i4 = iM55979 ^ i3;
                        str8 = str8;
                        linkageError3 = linkageError3;
                        i14 = i4;
                        i13 = i2;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    }
                    break;
                case 1452778813:
                case 1809834547:
                    str7 = str8;
                    sArr4 = f83017;
                    i23 = 44;
                    i18 = 8;
                    if (C0892.f81851) {
                        iM55681 = (i12 - C0873.m55680("ᩳۘ")) * (-3);
                        i5 = ((iM55681 ^ i11) * (-28175)) ^ 127131439;
                        i8 = 420300014;
                    } else {
                        iM55681 = (i12 - C0946.m55979("۠ܳ")) * (-27);
                        i5 = ((iM55681 ^ i11) * 4737) ^ 151728463;
                        i8 = 326722925;
                    }
                    str8 = str7;
                    i14 = iM55681 ^ i8;
                    i13 = i5;
                    break;
                case 1871733886:
                case 1914783290:
                    i15 = 40808;
                    iM55979 = (C0946.m55979("ܰۙ") ^ i12) * (-117);
                    i2 = ((iM55979 ^ i11) * (-7353)) ^ 403224350;
                    i3 = -534952580;
                    i4 = iM55979 ^ i3;
                    str8 = str8;
                    linkageError3 = linkageError3;
                    i14 = i4;
                    i13 = i2;
                    sArr4 = sArr4;
                    abstractC23408 = this;
                    break;
                default:
                    str2 = str8;
                    sArr4 = sArr4;
                    linkageError = linkageError3;
                    sArr = sArr3;
                    i = i21;
                    String strM55863 = C0927.m55863(sArr, i, 14, i15);
                    str3 = abstractC23408.f74562;
                    str4 = strM55707;
                    String strM16053 = C6988.m16053(str4, str3, strM55863);
                    if (!C0927.m55869(file)) {
                        str5 = strM16053;
                        int iM559714 = C0946.m55979("ܶۜ") ^ i11;
                        strM55707 = str4;
                        i21 = i;
                        str10 = str3;
                        str9 = str5;
                        str8 = str2;
                        i14 = iM559714 ^ 433246818;
                        i13 = ((iM559714 ^ i12) * 13459) ^ (-1101842193);
                        sArr3 = sArr;
                        linkageError3 = linkageError;
                        abstractC23408 = this;
                        sArr4 = sArr4;
                    } else {
                        int iM559715 = C0946.m55979("ۡ۫") ^ i12;
                        i13 = ((iM559715 ^ i11) * (-32367)) ^ 1319557217;
                        i21 = i;
                        str10 = str3;
                        str9 = strM16053;
                        str8 = str2;
                        sArr3 = sArr;
                        i14 = iM559715 ^ 1294402624;
                        linkageError3 = linkageError;
                        strM55707 = str4;
                        sArr4 = sArr4;
                        abstractC23408 = this;
                    }
                    break;
            }
        }
    }
}
