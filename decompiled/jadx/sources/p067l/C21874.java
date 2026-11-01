package p067l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21874 implements InterfaceC20001 {

    /* JADX INFO: renamed from: ֫ */
    public final List f68809;

    /* JADX INFO: renamed from: ۧ */
    public final int f68810;

    public C21874(int i) {
        this(i, AbstractC16192.m36872of());
    }

    public C21874(int i, List list) {
        this.f68810 = i;
        this.f68809 = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2565 m49335(int i, C5919 c5919) {
        String str = c5919.f14614;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C23885(new C6451(str, c5919.m13304(), "video/mp2t"));
            }
            if (i == 21) {
                return new C23885(new C23215());
            }
            if (i == 27) {
                if (m49334(4)) {
                    return null;
                }
                return new C23885(new C9803(new C15976(m49333(c5919)), m49334(1), m49334(8)));
            }
            if (i == 36) {
                return new C23885(new C22545(new C15976(m49333(c5919))));
            }
            if (i == 45) {
                return new C23885(new C5110());
            }
            if (i == 89) {
                return new C23885(new C10474(c5919.f14613));
            }
            if (i == 172) {
                return new C23885(new C15837(str, c5919.m13304(), "video/mp2t"));
            }
            if (i != 257) {
                if (i != 138) {
                    if (i != 139) {
                        switch (i) {
                            case 15:
                                if (m49334(2)) {
                                    return null;
                                }
                                return new C23885(new C8462(str, c5919.m13304(), "video/mp2t", false));
                            case 16:
                                return new C23885(new C2426(new C3236(m49333(c5919))));
                            case 17:
                                if (m49334(2)) {
                                    return null;
                                }
                                return new C23885(new C21204(str, c5919.m13304()));
                            default:
                                switch (i) {
                                    case 128:
                                        break;
                                    case 129:
                                        return new C23885(new C19191(str, c5919.m13304(), "video/mp2t"));
                                    case 130:
                                        if (!m49334(64)) {
                                            return null;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 134:
                                                if (m49334(16)) {
                                                    return null;
                                                }
                                                return new C18659(new C13157("application/x-scte35"));
                                            case 135:
                                                return new C23885(new C19191(str, c5919.m13304(), "video/mp2t"));
                                            case 136:
                                                break;
                                            default:
                                                return null;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        return new C23885(new C11145(str, c5919.m13304(), 5408));
                    }
                }
                return new C23885(new C11145(str, c5919.m13304(), 4096));
            }
            return new C18659(new C13157("application/vnd.dvb.ait"));
        }
        return new C23885(new C5780(new C3236(m49333(c5919)), "video/mp2t"));
    }

    /* JADX INFO: renamed from: ֫ */
    private List m49333(C5919 c5919) {
        String str;
        int i;
        List listSingletonList;
        boolean zM49334 = m49334(32);
        List list = this.f68809;
        if (zM49334) {
            return list;
        }
        C19203 c19203 = new C19203(c5919.f14612);
        while (c19203.m43703() > 0) {
            int iM43702 = c19203.m43702();
            int iM43731 = c19203.m43731() + c19203.m43702();
            if (iM43702 == 134) {
                ArrayList arrayList = new ArrayList();
                int iM43703 = c19203.m43702() & 31;
                for (int i2 = 0; i2 < iM43703; i2++) {
                    String strM43705 = c19203.m43705(3, StandardCharsets.UTF_8);
                    int iM43704 = c19203.m43702();
                    boolean z = (iM43704 & 128) != 0;
                    if (z) {
                        i = iM43704 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM43702 = (byte) c19203.m43702();
                    c19203.m43724(1);
                    if (z) {
                        boolean z2 = (bM43702 & 64) != 0;
                        int i3 = C19322.f57686;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C3601 c3601 = new C3601();
                    c3601.m6697(str);
                    c3601.m6703(strM43705);
                    c3601.m6674(i);
                    c3601.m6678(listSingletonList);
                    arrayList.add(c3601.m6672());
                }
                list = arrayList;
            }
            c19203.m43730(iM43731);
        }
        return list;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m49334(int i) {
        return (i & this.f68810) != 0;
    }
}
