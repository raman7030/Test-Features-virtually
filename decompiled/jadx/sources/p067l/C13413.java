package p067l;

import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8GX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13413 implements InterfaceC21460 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 f37630;

    /* JADX INFO: renamed from: ۧ */
    public final int f37631;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public static C13413 m30559(int i, C19203 c19203) {
        InterfaceC21460 c24141;
        String str;
        String str2;
        C4123 c4123 = new C4123();
        int iM43729 = c19203.m43729();
        int iM27640 = -2;
        while (c19203.m43703() > 8) {
            int iM43736 = c19203.m43736();
            int iM43731 = c19203.m43731() + c19203.m43736();
            c19203.m43732(iM43731);
            if (iM43736 != 1414744396) {
                C24141 c24142 = null;
                switch (iM43736) {
                    case 1718776947:
                        if (iM27640 != 2) {
                            if (iM27640 == 1) {
                                int iM43711 = c19203.m43711();
                                if (iM43711 == 1) {
                                    str = "audio/raw";
                                } else if (iM43711 == 85) {
                                    str = "audio/mpeg";
                                } else if (iM43711 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM43711 != 8192) {
                                    str = iM43711 != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM43712 = c19203.m43711();
                                    int iM43737 = c19203.m43736();
                                    c19203.m43724(6);
                                    int iM43713 = c19203.m43711();
                                    String str3 = C5792.f14228;
                                    int iM12979 = C5792.m12979(iM43713, ByteOrder.LITTLE_ENDIAN);
                                    int iM43714 = c19203.m43703() > 0 ? c19203.m43711() : 0;
                                    C3601 c3601 = new C3601();
                                    c3601.m6697(str);
                                    c3601.m6704(iM43712);
                                    c3601.m6688(iM43737);
                                    if (str.equals("audio/raw") && iM12979 != 0) {
                                        c3601.m6707(iM12979);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iM43714 > 0) {
                                        byte[] bArr = new byte[iM43714];
                                        c19203.m43707(0, iM43714, bArr);
                                        c3601.m6678((List) AbstractC16192.m36873of((Object) bArr));
                                    }
                                    c24141 = new C24141(c3601.m6672());
                                } else {
                                    C10050.m23419(iM43711, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                C21334.m48351("Ignoring strf box for unsupported track type: " + C5792.m13021(iM27640));
                            }
                            break;
                        } else {
                            c19203.m43724(4);
                            int iM43738 = c19203.m43736();
                            int iM43739 = c19203.m43736();
                            c19203.m43724(4);
                            int iM437310 = c19203.m43736();
                            switch (iM437310) {
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
                                C10050.m23419(iM437310, "Ignoring track with unsupported compression ");
                            } else {
                                C3601 c3602 = new C3601();
                                c3602.m6685(iM43738);
                                c3602.m6689(iM43739);
                                c3602.m6697(str2);
                                c24142 = new C24141(c3602.m6672());
                            }
                        }
                        c24141 = c24142;
                        break;
                    case 1751742049:
                        c24141 = C14083.m31956(c19203);
                        break;
                    case 1752331379:
                        c24141 = C12072.m27639(c19203);
                        break;
                    case 1852994675:
                        c24141 = C15423.m35150(c19203);
                        break;
                    default:
                        c24141 = c24142;
                        break;
                }
            } else {
                c24141 = m30559(c19203.m43736(), c19203);
            }
            if (c24141 != null) {
                if (c24141.getType() == 1752331379) {
                    iM27640 = ((C12072) c24141).m27640();
                }
                c4123.m18184(c24141);
            }
            c19203.m43730(iM43731);
            c19203.m43732(iM43729);
        }
        return new C13413(i, c4123.m8329());
    }

    public C13413(int i, AbstractC16192 abstractC16192) {
        this.f37631 = i;
        this.f37630 = abstractC16192;
    }

    @Override // p067l.InterfaceC21460
    public final int getType() {
        return this.f37631;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21460 m30560(Class cls) {
        AbstractC6767 abstractC6767ListIterator = this.f37630.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            InterfaceC21460 interfaceC21460 = (InterfaceC21460) abstractC6767ListIterator.next();
            if (interfaceC21460.getClass() == cls) {
                return interfaceC21460;
            }
        }
        return null;
    }
}
