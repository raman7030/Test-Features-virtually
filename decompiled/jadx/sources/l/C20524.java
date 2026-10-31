package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20524 implements InterfaceC18553 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f66132;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f66133;

    public C20524(int i) {
        this(i, AbstractC14545.of());
    }

    public C20524(int i, List list) {
        this.f66133 = i;
        this.f66132 = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0207 m47012(int i, C3736 c3736) {
        String str = c3736.f11807;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C22640(new C4296(str, c3736.m11352(), "video/mp2t"));
            }
            if (i == 21) {
                return new C22640(new C21935());
            }
            if (i == 27) {
                if (m47011(4)) {
                    return null;
                }
                return new C22640(new C7823(new C14318(m47010(c3736)), m47011(1), m47011(8)));
            }
            if (i == 36) {
                return new C22640(new C21230(new C14318(m47010(c3736))));
            }
            if (i == 45) {
                return new C22640(new C2885());
            }
            if (i == 89) {
                return new C22640(new C8529(c3736.f11806));
            }
            if (i == 172) {
                return new C22640(new C14172(str, c3736.m11352(), "video/mp2t"));
            }
            if (i != 257) {
                if (i != 138) {
                    if (i != 139) {
                        switch (i) {
                            case 15:
                                if (m47011(2)) {
                                    return null;
                                }
                                return new C22640(new C6412(str, c3736.m11352(), "video/mp2t", false));
                            case 16:
                                return new C22640(new C0061(new C0913(m47010(c3736))));
                            case 17:
                                if (m47011(2)) {
                                    return null;
                                }
                                return new C22640(new C19819(str, c3736.m11352()));
                            default:
                                switch (i) {
                                    case 128:
                                        break;
                                    case 129:
                                        return new C22640(new C17701(str, c3736.m11352(), "video/mp2t"));
                                    case 130:
                                        if (!m47011(64)) {
                                            return null;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 134:
                                                if (m47011(16)) {
                                                    return null;
                                                }
                                                return new C17141(new C11352("application/x-scte35"));
                                            case 135:
                                                return new C22640(new C17701(str, c3736.m11352(), "video/mp2t"));
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
                        return new C22640(new C9235(str, c3736.m11352(), 5408));
                    }
                }
                return new C22640(new C9235(str, c3736.m11352(), 4096));
            }
            return new C17141(new C11352("application/vnd.dvb.ait"));
        }
        return new C22640(new C3590(new C0913(m47010(c3736)), "video/mp2t"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m47010(C3736 c3736) {
        String str;
        int i;
        List listSingletonList;
        boolean zM47011 = m47011(32);
        List list = this.f66132;
        if (zM47011) {
            return list;
        }
        C17714 c17714 = new C17714(c3736.f11805);
        while (c17714.m41457() > 0) {
            int iM41456 = c17714.m41456();
            int iM41485 = c17714.m41485() + c17714.m41456();
            if (iM41456 == 134) {
                ArrayList arrayList = new ArrayList();
                int iM41457 = c17714.m41456() & 31;
                for (int i2 = 0; i2 < iM41457; i2++) {
                    String strM41459 = c17714.m41459(3, StandardCharsets.UTF_8);
                    int iM41458 = c17714.m41456();
                    boolean z = (iM41458 & 128) != 0;
                    if (z) {
                        i = iM41458 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM41456 = (byte) c17714.m41456();
                    c17714.m41478(1);
                    if (z) {
                        boolean z2 = (bM41456 & 64) != 0;
                        int i3 = C17839.f54488;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C1297 c1297 = new C1297();
                    c1297.m4465(str);
                    c1297.m4471(strM41459);
                    c1297.m4442(i);
                    c1297.m4446(listSingletonList);
                    arrayList.add(c1297.m4440());
                }
                list = arrayList;
            }
            c17714.m41484(iM41485);
        }
        return list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m47011(int i) {
        return (i & this.f66133) != 0;
    }
}
