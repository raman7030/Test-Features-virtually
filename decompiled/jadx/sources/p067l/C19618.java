package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19618 {

    /* JADX INFO: renamed from: ֫ */
    public final C12913 f59657;

    /* JADX INFO: renamed from: ۧ */
    public final C12913 f59658;

    public C19618() {
        C12913 c12913 = new C12913(0, 0);
        this.f59658 = c12913;
        C12913 c12914 = new C12913(0, 0);
        this.f59657 = c12914;
        c12913.f36306 = c12914;
        c12914.f36308 = c12913;
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
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m44518(List list) {
        C18276 c18276;
        C12913 c12913;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        InterfaceC4474 interfaceC4474;
        String strMo9476;
        String strMo9477;
        C18276 c18277;
        C19618 c19618 = new C19618();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC7156 interfaceC7156 = (InterfaceC7156) it2.next();
            int iMo16459 = interfaceC7156.mo16459();
            int iMo16461 = interfaceC7156.mo16461() + iMo16459;
            if (iMo16459 != iMo16461) {
                for (InterfaceC4474 interfaceC4475 : interfaceC7156.mo16460()) {
                    C12913 c12913M29592 = c19618.f59658.f36306;
                    while (true) {
                        C12913 c12914 = c19618.f59657;
                        if (c12913M29592 != c12914) {
                            int i3 = c12913M29592.f36307;
                            int i4 = c12913M29592.f36304;
                            if (iMo16459 != i3) {
                                if (iMo16459 > i3 && iMo16459 < i4) {
                                    c12913M29592 = c12913M29592.m29592(iMo16459);
                                } else if (iMo16459 >= i3) {
                                    c12913M29592 = c12913M29592.f36306;
                                } else {
                                    if (iMo16461 <= i3) {
                                        C12913 c12915 = new C12913(iMo16459, iMo16461);
                                        c12913M29592.m29593(c12915);
                                        c18276 = new C18276(c12915, c12915);
                                    } else {
                                        C12913 c12916 = new C12913(iMo16459, i3);
                                        c12913M29592.m29593(c12916);
                                        c12913M29592 = c12916;
                                    }
                                    c12913 = c18276.f54566;
                                    i = iMo16459;
                                    do {
                                        i2 = c12913.f36307;
                                        if (i2 > i) {
                                            C12913 c12917 = new C12913(i, i2);
                                            c12913.m29593(c12917);
                                            c12913 = c12917;
                                        }
                                        arrayList = c12913.f36305;
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                interfaceC4474 = (InterfaceC4474) it.next();
                                                strMo9476 = interfaceC4474.mo9476();
                                                strMo9477 = interfaceC4475.mo9476();
                                                if (strMo9476 != null) {
                                                    if (strMo9476.equals(strMo9477)) {
                                                        break;
                                                    }
                                                } else {
                                                    if (strMo9477 == null) {
                                                        if (interfaceC4474.mo9474() == interfaceC4475.mo9474()) {
                                                            break;
                                                        }
                                                        throw new C4195(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                arrayList.add(interfaceC4475);
                                                break;
                                            }
                                        }
                                        i = c12913.f36304;
                                        c12913 = c12913.f36306;
                                    } while (c12913.f36308 != c18276.f54565);
                                }
                            }
                        } else {
                            c12913M29592 = null;
                        }
                        if (c12913M29592 == null) {
                            C12913 c12918 = new C12913(iMo16459, iMo16461);
                            c12914.m29593(c12918);
                            c18277 = new C18276(c12918, c12918);
                        } else {
                            C12913 c12919 = c12913M29592;
                            while (true) {
                                if (c12919 != c12914) {
                                    int i5 = c12919.f36307;
                                    int i6 = c12919.f36304;
                                    if (iMo16461 == i6) {
                                        c18277 = new C18276(c12913M29592, c12919);
                                    } else if (iMo16461 > i5 && iMo16461 < i6) {
                                        c12919.m29592(iMo16461);
                                        c18277 = new C18276(c12913M29592, c12919);
                                    } else {
                                        if (iMo16461 <= i5) {
                                            C12913 c129110 = new C12913(c12919.f36308.f36304, iMo16461);
                                            c12919.m29593(c129110);
                                            c18276 = new C18276(c12913M29592, c129110);
                                            break;
                                        }
                                        c12919 = c12919.f36306;
                                    }
                                } else {
                                    C12913 c129111 = new C12913(c12914.f36308.f36304, iMo16461);
                                    c12914.m29593(c129111);
                                    c18277 = new C18276(c12913M29592, c129111);
                                }
                            }
                            c12913 = c18276.f54566;
                            i = iMo16459;
                            do {
                                i2 = c12913.f36307;
                                if (i2 > i) {
                                    C12913 c129112 = new C12913(i, i2);
                                    c12913.m29593(c129112);
                                    c12913 = c129112;
                                }
                                arrayList = c12913.f36305;
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        interfaceC4474 = (InterfaceC4474) it.next();
                                        strMo9476 = interfaceC4474.mo9476();
                                        strMo9477 = interfaceC4475.mo9476();
                                        if (strMo9476 != null) {
                                            if (strMo9476.equals(strMo9477)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            if (strMo9477 == null) {
                                                if (interfaceC4474.mo9474() == interfaceC4475.mo9474()) {
                                                    break;
                                                }
                                                throw new C4195(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                            }
                                        }
                                    } else {
                                        arrayList.add(interfaceC4475);
                                        break;
                                    }
                                }
                                i = c12913.f36304;
                                c12913 = c12913.f36306;
                            } while (c12913.f36308 != c18276.f54565);
                        }
                        c18276 = c18277;
                        c12913 = c18276.f54566;
                        i = iMo16459;
                        do {
                            i2 = c12913.f36307;
                            if (i2 > i) {
                                C12913 c129113 = new C12913(i, i2);
                                c12913.m29593(c129113);
                                c12913 = c129113;
                            }
                            arrayList = c12913.f36305;
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC4474 = (InterfaceC4474) it.next();
                                    strMo9476 = interfaceC4474.mo9476();
                                    strMo9477 = interfaceC4475.mo9476();
                                    if (strMo9476 != null) {
                                        if (strMo9476.equals(strMo9477)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (strMo9477 == null) {
                                            if (interfaceC4474.mo9474() == interfaceC4475.mo9474()) {
                                                break;
                                            }
                                            throw new C4195(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                        }
                                    }
                                } else {
                                    arrayList.add(interfaceC4475);
                                    break;
                                }
                            }
                            i = c12913.f36304;
                            c12913 = c12913.f36306;
                        } while (c12913.f36308 != c18276.f54565);
                    }
                }
            }
        }
        return C9468.m21990(new C9364(c19618));
    }
}
