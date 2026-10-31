package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V60Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2956 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f9389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class f9390;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f9391;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m9014(Class cls, Object obj, String str) {
        C3746.m11368(f9391, str, new C4367(cls, obj));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m9015(AbstractActivityC3346 abstractActivityC3346) {
        Class clsM10618 = RunnableC3474.m10618(abstractActivityC3346);
        if (f9390 != clsM10618) {
            f9390 = clsM10618;
        }
        C3746.m11368(f9389, clsM10618, C4117.m12360(ViewOnClickListenerC1958.m6432()));
        Iterator itM10483 = C3432.m10483(f9391.entrySet());
        ArrayList arrayList = null;
        while (C1773.m5910(itM10483)) {
            Map.Entry entry = (Map.Entry) C2272.m7513(itM10483);
            if (((C4367) entry.getValue()).f14038 == clsM10618) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C1916.m6307(arrayList, (String) entry.getKey());
            }
        }
        if (arrayList != null) {
            Iterator itM9029 = C2958.m9029(arrayList);
            while (C0483.m2123(itM9029)) {
                f9391.remove((String) RunnableC1108.m3791(itM9029));
            }
        }
    }

    static {
        HashMap map = null;
        int i = -728887741;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = RunnableC1937.f6483;
        int iM6981 = (i3 - C2105.m6981("ᩳܰ")) * (-21);
        int i4 = ((iM6981 ^ i2) * (-26649)) ^ 1516683378;
        int i5 = -448562466;
        while (true) {
            i = ((((i ^ i2) * (-20085)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2114175862:
                case -1448382666:
                    if (C2958.f9394 < 0) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16975) ^ 613607286;
                        i5 = 1336495948;
                    } else {
                        iM6981 = C0630.m2566("᩶֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25327)) ^ (-1446355702);
                        i5 = -1507540532;
                    }
                    break;
                case -2098164836:
                case 1255148887:
                    C2272.m7503();
                    C1294.m4372();
                    throw new RuntimeException();
                case -1771044935:
                case 641028967:
                    if (C7106.m19120() <= 0) {
                        iM6981 = C2105.m6981("ۨ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17919)) ^ 268984702;
                        i5 = -1319499641;
                    } else {
                        iM6981 = (i2 - C2105.m6981("֨۬")) * (-111);
                        i4 = ((iM6981 ^ i3) * 12161) ^ (-1305841510);
                        i5 = 1647128778;
                    }
                    break;
                case -1443873566:
                case -968231003:
                    f9389 = new HashMap();
                    return;
                case -1047871174:
                case -305008591:
                    map = new HashMap();
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM6981 = C0630.m2566("ܰۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25135) ^ 1116255050;
                        i5 = -2075229344;
                    }
                    break;
                case -1002428018:
                case 1756992439:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16975) ^ 613607286;
                        i5 = 1336495948;
                    } else {
                        iM6981 = (C0630.m2566("ۤۜ") + i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-20865)) ^ 1482866544;
                        i5 = 757528389;
                    }
                    break;
                case -821298311:
                case 1135408719:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ۟") + i2) * (-77);
                        i4 = ((iM6981 ^ i3) * 3931) ^ (-1217824361);
                        i5 = 1815017331;
                    }
                    break;
                case -732134446:
                case 752936236:
                    if (C2105.m6982() != 0) {
                        iM6981 = C0630.m2566("᩶֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25327)) ^ (-1446355702);
                        i5 = -1507540532;
                    } else {
                        iM6981 = (C2105.m6981("֨۫") + i3) * 127;
                        i4 = ((iM6981 ^ i2) * 26905) ^ (-1208714382);
                        i5 = 351872408;
                    }
                    break;
                case -565584189:
                case 1486541060:
                    C2958.m9034();
                    iM6981 = C0630.m2566("᩶֡") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-25327)) ^ (-1446355702);
                    i5 = -1507540532;
                    break;
                case -101656439:
                case 549005117:
                    C1711.m5736();
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = (C2105.m6981("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM6981 = (C0630.m2566("ۗ۟") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i3) * 12109) ^ (-496598474);
                        i5 = -1473177938;
                    }
                    break;
                case 50805013:
                case 1283445938:
                    f9391 = map;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ۨ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17919)) ^ 268984702;
                        i5 = -1319499641;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩷ۤ")) * (-107);
                        i4 = ((iM6981 ^ i3) * 3817) ^ 1788565306;
                        i5 = 1548095421;
                    }
                    break;
                case 585542438:
                case 1495784058:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۨ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17919)) ^ 268984702;
                        i5 = -1319499641;
                    } else {
                        iM6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13181) ^ 1253157993;
                        i5 = -778210815;
                    }
                    break;
                case 617503354:
                case 1746210906:
                    if (!C2272.f7362) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16975) ^ 613607286;
                        i5 = 1336495948;
                    } else {
                        iM6981 = (C0630.m2566("ۗ۟") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i3) * 12109) ^ (-496598474);
                        i5 = -1473177938;
                    }
                    break;
                case 1024550048:
                case 1082018607:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("᩶֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25327)) ^ (-1446355702);
                        i5 = -1507540532;
                    } else {
                        iM6981 = C0630.m2566("ܺۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6603) ^ 47953823;
                        i5 = -1250113460;
                    }
                    break;
                case 1227958098:
                case 1956578443:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ۗ۟") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i3) * 12109) ^ (-496598474);
                        i5 = -1473177938;
                    } else {
                        iM6981 = C0630.m2566("ܿܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2303) ^ 1901983954;
                        i5 = -1830551058;
                    }
                    break;
                default:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C2105.m6981("ۚ᩻") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * 23703) ^ 884107941;
                        i5 = 1599622217;
                    } else {
                        iM6981 = C0630.m2566("᩹᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5135)) ^ 1527816643;
                        i5 = -766744966;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9016(String str) {
        synchronized (C2956.class) {
            C4367 c4367 = (C4367) f9391.remove(str);
            if (c4367 == null) {
                return null;
            }
            Object obj = c4367.f14039;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m9013(String str) {
        synchronized (C2956.class) {
            C4367 c4367 = (C4367) C0964.m3410(f9391, str);
            if (c4367 == null) {
                return null;
            }
            Object obj = c4367.f14039;
            if (obj == null) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m9012() {
        return f9390;
    }
}
