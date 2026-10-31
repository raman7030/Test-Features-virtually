package l;

import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8GX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11621 implements InterfaceC20088 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f34633;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34634;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11621 m28513(int i, C17714 c17714) {
        InterfaceC20088 c22909;
        String str;
        String str2;
        C1846 c1846 = new C1846();
        int iM41483 = c17714.m41483();
        int iM25618 = -2;
        while (c17714.m41457() > 8) {
            int iM41490 = c17714.m41490();
            int iM41485 = c17714.m41485() + c17714.m41490();
            c17714.m41486(iM41485);
            if (iM41490 != 1414744396) {
                C22909 c229010 = null;
                switch (iM41490) {
                    case 1718776947:
                        if (iM25618 != 2) {
                            if (iM25618 == 1) {
                                int iM41465 = c17714.m41465();
                                if (iM41465 == 1) {
                                    str = "audio/raw";
                                } else if (iM41465 == 85) {
                                    str = "audio/mpeg";
                                } else if (iM41465 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM41465 != 8192) {
                                    str = iM41465 != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM41466 = c17714.m41465();
                                    int iM41491 = c17714.m41490();
                                    c17714.m41478(6);
                                    int iM41467 = c17714.m41465();
                                    String str3 = C3603.f11424;
                                    int iM11003 = C3603.m11003(iM41467, ByteOrder.LITTLE_ENDIAN);
                                    int iM41468 = c17714.m41457() > 0 ? c17714.m41465() : 0;
                                    C1297 c1297 = new C1297();
                                    c1297.m4465(str);
                                    c1297.m4472(iM41466);
                                    c1297.m4456(iM41491);
                                    if (str.equals("audio/raw") && iM11003 != 0) {
                                        c1297.m4475(iM11003);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iM41468 > 0) {
                                        byte[] bArr = new byte[iM41468];
                                        c17714.m41461(0, iM41468, bArr);
                                        c1297.m4446((List) AbstractC14545.of((Object) bArr));
                                    }
                                    c22909 = new C22909(c1297.m4440());
                                } else {
                                    C8083.m21451(iM41465, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                C19956.m46037("Ignoring strf box for unsupported track type: " + C3603.m11045(iM25618));
                            }
                            break;
                        } else {
                            c17714.m41478(4);
                            int iM41492 = c17714.m41490();
                            int iM41493 = c17714.m41490();
                            c17714.m41478(4);
                            int iM41494 = c17714.m41490();
                            switch (iM41494) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                C8083.m21451(iM41494, "Ignoring track with unsupported compression ");
                            } else {
                                C1297 c1298 = new C1297();
                                c1298.m4453(iM41492);
                                c1298.m4457(iM41493);
                                c1298.m4465(str2);
                                c229010 = new C22909(c1298.m4440());
                            }
                        }
                        c22909 = c229010;
                        break;
                    case 1751742049:
                        c22909 = C12326.m29896(c17714);
                        break;
                    case 1752331379:
                        c22909 = C10210.m25617(c17714);
                        break;
                    case 1852994675:
                        c22909 = C13736.m33036(c17714);
                        break;
                    default:
                        c22909 = c229010;
                        break;
                }
            } else {
                c22909 = m28513(c17714.m41490(), c17714);
            }
            if (c22909 != null) {
                if (c22909.getType() == 1752331379) {
                    iM25618 = ((C10210) c22909).m25618();
                }
                c1846.m16264(c22909);
            }
            c17714.m41484(iM41485);
            c17714.m41486(iM41483);
        }
        return new C11621(i, c1846.m6131());
    }

    public C11621(int i, AbstractC14545 abstractC14545) {
        this.f34634 = i;
        this.f34633 = abstractC14545;
    }

    @Override // l.InterfaceC20088
    public final int getType() {
        return this.f34634;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20088 m28514(Class cls) {
        AbstractC4628 abstractC4628ListIterator = this.f34633.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            InterfaceC20088 interfaceC20088 = (InterfaceC20088) abstractC4628ListIterator.next();
            if (interfaceC20088.getClass() == cls) {
                return interfaceC20088;
            }
        }
        return null;
    }
}
