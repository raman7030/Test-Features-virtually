package p067l;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19686 {

    /* JADX INFO: renamed from: ֫ */
    public C9710 f59835;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f59836;

    /* JADX INFO: renamed from: ܽ */
    public int f59837;

    public C19686(InterfaceC6434 interfaceC6434) {
        Iterator it;
        Iterator it2;
        this.f59837 = interfaceC6434.mo14722();
        HashMap map = new HashMap();
        C9710 c9710 = new C9710();
        Iterator it3 = interfaceC6434.mo14714().iterator();
        while (it3.hasNext()) {
            InterfaceC3080 interfaceC3080 = (InterfaceC3080) it3.next();
            String typeName = interfaceC3080.getTypeName();
            if (typeName.equals("attr") || typeName.equals("^attr-private")) {
                if (interfaceC3080.mo5200() != 0) {
                    InterfaceC3080 type = interfaceC6434.getType("id");
                    InterfaceC9116 interfaceC9116Mo5206 = (type == null || type.mo5200() == 0) ? null : type.mo5206(0);
                    Iterator it4 = interfaceC3080.mo5206(0).mo20696().iterator();
                    while (it4.hasNext()) {
                        InterfaceC22528 interfaceC22528 = (InterfaceC22528) it4.next();
                        if (!interfaceC22528.mo31474() || interfaceC22528.mo31471() != 0) {
                            int iMo50213 = interfaceC22528.mo50213();
                            int value = interfaceC22528.getValue().getValue();
                            String strMo31468 = interfaceC22528.mo31468();
                            if (!strMo31468.startsWith("__") && !map.containsKey(strMo31468)) {
                                int iMo31471 = interfaceC22528.mo31471() - 1;
                                C16332[] c16332Arr = new C16332[iMo31471];
                                int i = 0;
                                while (true) {
                                    if (i < iMo31471) {
                                        int i2 = i + 1;
                                        InterfaceC3751 value2 = interfaceC22528.getValue(i2);
                                        it = it3;
                                        int value3 = value2.getValue();
                                        int iMo7247 = value2.mo7247();
                                        it2 = it4;
                                        InterfaceC22528 interfaceC22529 = interfaceC22528;
                                        if (((value2.mo7249() >>> 24) & 255) != interfaceC6434.mo14722()) {
                                            break;
                                        }
                                        InterfaceC22528 interfaceC22528Mo4717 = interfaceC9116Mo5206 == null ? null : interfaceC9116Mo5206.mo4717(value2.mo7249() & 65535);
                                        if (interfaceC22528Mo4717 == null) {
                                            break;
                                        }
                                        c16332Arr[i] = new C16332(value3, iMo7247, interfaceC22528Mo4717.mo31468());
                                        i = i2;
                                        it3 = it;
                                        interfaceC22528 = interfaceC22529;
                                        it4 = it2;
                                    } else {
                                        it = it3;
                                        it2 = it4;
                                        map.put(strMo31468, new C18344(value, strMo31468, c16332Arr, (interfaceC6434.mo14722() << 24) | (interfaceC3080.mo5199() << 16) | iMo50213));
                                        break;
                                    }
                                }
                                it3 = it;
                                it4 = it2;
                            }
                        }
                    }
                }
            }
        }
        for (C18344 c18344 : map.values()) {
            c9710.mo4686(c18344.f54786, c18344);
        }
        this.f59836 = map;
        this.f59835 = c9710;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m44707() {
        return this.f59837;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18344 m44705(String str) {
        return (C18344) this.f59836.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18344 m44704(int i) {
        return (C18344) this.f59835.get(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44706() {
        return this.f59835.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Collection m44703() {
        return this.f59836.values();
    }
}
