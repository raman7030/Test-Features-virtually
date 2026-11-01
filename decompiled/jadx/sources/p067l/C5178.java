package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V60Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f12189;

    /* JADX INFO: renamed from: ۧ */
    public static Class f12190;

    /* JADX INFO: renamed from: ܽ */
    public static final HashMap f12191;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m11082(Class cls, Object obj, String str) {
        C1028.m56246(f12191, str, new C6519(cls, obj));
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m11083(AbstractActivityC5549 abstractActivityC5549) {
        Class clsM56165 = RunnableC1014.m56165(abstractActivityC5549);
        if (f12190 != clsM56165) {
            f12190 = clsM56165;
        }
        C1028.m56246(f12189, clsM56165, C1046.m56298(ViewOnClickListenerC0939.m55944()));
        Iterator itM56139 = C1012.m56139(f12191.entrySet());
        ArrayList arrayList = null;
        while (C0930.m55886(itM56139)) {
            Map.Entry entry = (Map.Entry) C0955.m56035(itM56139);
            if (((C6519) entry.getValue()).f16853 == clsM56165) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C0937.m55917(arrayList, (String) entry.getKey());
            }
        }
        if (arrayList != null) {
            Iterator itM56090 = C0989.m56090(arrayList);
            while (C0866.m55647(itM56090)) {
                f12191.remove((String) RunnableC0897.m55785(itM56090));
            }
        }
    }

    static {
        HashMap map = null;
        int i = -728887741;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = RunnableC0938.f81886;
        int iM55979 = (i3 - C0946.m55979("ᩳܰ")) * (-21);
        int i4 = ((iM55979 ^ i2) * (-26649)) ^ 1516683378;
        int i5 = -448562466;
        while (true) {
            i = ((((i ^ i2) * (-20085)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2114175862:
                case -1448382666:
                    if (C0989.f81920 < 0) {
                        iM55979 = C0873.m55680("᩵᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16975) ^ 613607286;
                        i5 = 1336495948;
                    } else {
                        iM55979 = C0873.m55680("᩶֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-25327)) ^ (-1446355702);
                        i5 = -1507540532;
                    }
                    break;
                case -2098164836:
                case 1255148887:
                    C0955.m56025();
                    C0906.m55809();
                    throw new RuntimeException();
                case -1771044935:
                case 641028967:
                    if (C1194.m56396() <= 0) {
                        iM55979 = C0946.m55979("ۨ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17919)) ^ 268984702;
                        i5 = -1319499641;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֨۬")) * (-111);
                        i4 = ((iM55979 ^ i3) * 12161) ^ (-1305841510);
                        i5 = 1647128778;
                    }
                    break;
                case -1443873566:
                case -968231003:
                    f12189 = new HashMap();
                    return;
                case -1047871174:
                case -305008591:
                    map = new HashMap();
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM55979 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM55979 = C0873.m55680("ܰۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25135) ^ 1116255050;
                        i5 = -2075229344;
                    }
                    break;
                case -1002428018:
                case 1756992439:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("᩵᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16975) ^ 613607286;
                        i5 = 1336495948;
                    } else {
                        iM55979 = (C0873.m55680("ۤۜ") + i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-20865)) ^ 1482866544;
                        i5 = 757528389;
                    }
                    break;
                case -821298311:
                case 1135408719:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM55979 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM55979 = (C0873.m55680("ᩴ۟") + i2) * (-77);
                        i4 = ((iM55979 ^ i3) * 3931) ^ (-1217824361);
                        i5 = 1815017331;
                    }
                    break;
                case -732134446:
                case 752936236:
                    if (C0946.m55980() != 0) {
                        iM55979 = C0873.m55680("᩶֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-25327)) ^ (-1446355702);
                        i5 = -1507540532;
                    } else {
                        iM55979 = (C0946.m55979("֨۫") + i3) * 127;
                        i4 = ((iM55979 ^ i2) * 26905) ^ (-1208714382);
                        i5 = 351872408;
                    }
                    break;
                case -565584189:
                case 1486541060:
                    C0989.m56095();
                    iM55979 = C0873.m55680("᩶֡") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-25327)) ^ (-1446355702);
                    i5 = -1507540532;
                    break;
                case -101656439:
                case 549005117:
                    C0927.m55873();
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0946.m55979("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM55979 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۟") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * 12109) ^ (-496598474);
                        i5 = -1473177938;
                    }
                    break;
                case 50805013:
                case 1283445938:
                    f12191 = map;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ۨ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17919)) ^ 268984702;
                        i5 = -1319499641;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩷ۤ")) * (-107);
                        i4 = ((iM55979 ^ i3) * 3817) ^ 1788565306;
                        i5 = 1548095421;
                    }
                    break;
                case 585542438:
                case 1495784058:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ۨ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17919)) ^ 268984702;
                        i5 = -1319499641;
                    } else {
                        iM55979 = C0946.m55979("ܽ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13181) ^ 1253157993;
                        i5 = -778210815;
                    }
                    break;
                case 617503354:
                case 1746210906:
                    if (!C0955.f81898) {
                        iM55979 = C0873.m55680("᩵᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16975) ^ 613607286;
                        i5 = 1336495948;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۟") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * 12109) ^ (-496598474);
                        i5 = -1473177938;
                    }
                    break;
                case 1024550048:
                case 1082018607:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("᩶֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-25327)) ^ (-1446355702);
                        i5 = -1507540532;
                    } else {
                        iM55979 = C0873.m55680("ܺۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6603) ^ 47953823;
                        i5 = -1250113460;
                    }
                    break;
                case 1227958098:
                case 1956578443:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ۗ۟") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * 12109) ^ (-496598474);
                        i5 = -1473177938;
                    } else {
                        iM55979 = C0873.m55680("ܿܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2303) ^ 1901983954;
                        i5 = -1830551058;
                    }
                    break;
                default:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM55979 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM55979 = C0873.m55680("᩹᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-5135)) ^ 1527816643;
                        i5 = -766744966;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m11084(String str) {
        synchronized (C5178.class) {
            C6519 c6519 = (C6519) f12191.remove(str);
            if (c6519 == null) {
                return null;
            }
            Object obj = c6519.f16854;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m11081(String str) {
        synchronized (C5178.class) {
            C6519 c6519 = (C6519) C0890.m55737(f12191, str);
            if (c6519 == null) {
                return null;
            }
            Object obj = c6519.f16854;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Class m11080() {
        return f12190;
    }
}
