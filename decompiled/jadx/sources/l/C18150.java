package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18150 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11095 f56442;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11095 f56443;

    public C18150() {
        C11095 c11095 = new C11095(0, 0);
        this.f56443 = c11095;
        C11095 c11096 = new C11095(0, 0);
        this.f56442 = c11096;
        c11095.f33304 = c11096;
        c11096.f33306 = c11095;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0114 A[EDGE_INSN: B:81:0x0114->B:60:0x0114 BREAK  A[LOOP:4: B:46:0x00dc->B:82:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m42257(List list) {
        C16738 c16738;
        C11095 c11095;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        InterfaceC2216 interfaceC2216;
        String strMo7393;
        String strMo7394;
        C16738 c16739;
        C18150 c18150 = new C18150();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC5038 interfaceC5038 = (InterfaceC5038) it2.next();
            int iMo14555 = interfaceC5038.mo14555();
            int iMo14557 = interfaceC5038.mo14557() + iMo14555;
            if (iMo14555 != iMo14557) {
                for (InterfaceC2216 interfaceC2217 : interfaceC5038.mo14556()) {
                    C11095 c11095M27530 = c18150.f56443.f33304;
                    while (true) {
                        C11095 c11096 = c18150.f56442;
                        if (c11095M27530 != c11096) {
                            int i3 = c11095M27530.f33305;
                            int i4 = c11095M27530.f33302;
                            if (iMo14555 != i3) {
                                if (iMo14555 > i3 && iMo14555 < i4) {
                                    c11095M27530 = c11095M27530.m27530(iMo14555);
                                } else if (iMo14555 >= i3) {
                                    c11095M27530 = c11095M27530.f33304;
                                } else {
                                    if (iMo14557 <= i3) {
                                        C11095 c11097 = new C11095(iMo14555, iMo14557);
                                        c11095M27530.m27531(c11097);
                                        c16738 = new C16738(c11097, c11097);
                                    } else {
                                        C11095 c11098 = new C11095(iMo14555, i3);
                                        c11095M27530.m27531(c11098);
                                        c11095M27530 = c11098;
                                    }
                                    c11095 = c16738.f51383;
                                    i = iMo14555;
                                    do {
                                        i2 = c11095.f33305;
                                        if (i2 > i) {
                                            C11095 c11099 = new C11095(i, i2);
                                            c11095.m27531(c11099);
                                            c11095 = c11099;
                                        }
                                        arrayList = c11095.f33303;
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                interfaceC2216 = (InterfaceC2216) it.next();
                                                strMo7393 = interfaceC2216.mo7393();
                                                strMo7394 = interfaceC2217.mo7393();
                                                if (strMo7393 != null) {
                                                    if (strMo7393.equals(strMo7394)) {
                                                        break;
                                                    }
                                                } else {
                                                    if (strMo7394 == null) {
                                                        if (interfaceC2216.mo7391() == interfaceC2217.mo7391()) {
                                                            break;
                                                        }
                                                        throw new C1922(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                arrayList.add(interfaceC2217);
                                                break;
                                            }
                                        }
                                        i = c11095.f33302;
                                        c11095 = c11095.f33304;
                                    } while (c11095.f33306 != c16738.f51382);
                                }
                            }
                        } else {
                            c11095M27530 = null;
                        }
                        if (c11095M27530 == null) {
                            C11095 c110910 = new C11095(iMo14555, iMo14557);
                            c11096.m27531(c110910);
                            c16739 = new C16738(c110910, c110910);
                        } else {
                            C11095 c110911 = c11095M27530;
                            while (true) {
                                if (c110911 != c11096) {
                                    int i5 = c110911.f33305;
                                    int i6 = c110911.f33302;
                                    if (iMo14557 == i6) {
                                        c16739 = new C16738(c11095M27530, c110911);
                                    } else if (iMo14557 > i5 && iMo14557 < i6) {
                                        c110911.m27530(iMo14557);
                                        c16739 = new C16738(c11095M27530, c110911);
                                    } else {
                                        if (iMo14557 <= i5) {
                                            C11095 c110912 = new C11095(c110911.f33306.f33302, iMo14557);
                                            c110911.m27531(c110912);
                                            c16738 = new C16738(c11095M27530, c110912);
                                            break;
                                        }
                                        c110911 = c110911.f33304;
                                    }
                                } else {
                                    C11095 c110913 = new C11095(c11096.f33306.f33302, iMo14557);
                                    c11096.m27531(c110913);
                                    c16739 = new C16738(c11095M27530, c110913);
                                }
                            }
                            c11095 = c16738.f51383;
                            i = iMo14555;
                            do {
                                i2 = c11095.f33305;
                                if (i2 > i) {
                                    C11095 c110914 = new C11095(i, i2);
                                    c11095.m27531(c110914);
                                    c11095 = c110914;
                                }
                                arrayList = c11095.f33303;
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        interfaceC2216 = (InterfaceC2216) it.next();
                                        strMo7393 = interfaceC2216.mo7393();
                                        strMo7394 = interfaceC2217.mo7393();
                                        if (strMo7393 != null) {
                                            if (strMo7393.equals(strMo7394)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            if (strMo7394 == null) {
                                                if (interfaceC2216.mo7391() == interfaceC2217.mo7391()) {
                                                    break;
                                                }
                                                throw new C1922(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                            }
                                        }
                                    } else {
                                        arrayList.add(interfaceC2217);
                                        break;
                                    }
                                }
                                i = c11095.f33302;
                                c11095 = c11095.f33304;
                            } while (c11095.f33306 != c16738.f51382);
                        }
                        c16738 = c16739;
                        c11095 = c16738.f51383;
                        i = iMo14555;
                        do {
                            i2 = c11095.f33305;
                            if (i2 > i) {
                                C11095 c110915 = new C11095(i, i2);
                                c11095.m27531(c110915);
                                c11095 = c110915;
                            }
                            arrayList = c11095.f33303;
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC2216 = (InterfaceC2216) it.next();
                                    strMo7393 = interfaceC2216.mo7393();
                                    strMo7394 = interfaceC2217.mo7393();
                                    if (strMo7393 != null) {
                                        if (strMo7393.equals(strMo7394)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (strMo7394 == null) {
                                            if (interfaceC2216.mo7391() == interfaceC2217.mo7391()) {
                                                break;
                                            }
                                            throw new C1922(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                        }
                                    }
                                } else {
                                    arrayList.add(interfaceC2217);
                                    break;
                                }
                            }
                            i = c11095.f33302;
                            c11095 = c11095.f33304;
                        } while (c11095.f33306 != c16738.f51382);
                    }
                }
            }
        }
        return C7470.m20015(new C7361(c18150));
    }
}
