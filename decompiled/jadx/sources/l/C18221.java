package l;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18221 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7724 f56622;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f56623;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56624;

    public C18221(InterfaceC4277 interfaceC4277) {
        Iterator it;
        Iterator it2;
        this.f56624 = interfaceC4277.mo12858();
        HashMap map = new HashMap();
        C7724 c7724 = new C7724();
        Iterator it3 = interfaceC4277.mo12850().iterator();
        while (it3.hasNext()) {
            InterfaceC0748 interfaceC0748 = (InterfaceC0748) it3.next();
            String typeName = interfaceC0748.getTypeName();
            if (typeName.equals("attr") || typeName.equals("^attr-private")) {
                if (interfaceC0748.mo2871() != 0) {
                    InterfaceC0748 type = interfaceC4277.getType("id");
                    InterfaceC7099 interfaceC7099Mo2877 = (type == null || type.mo2871() == 0) ? null : type.mo2877(0);
                    Iterator it4 = interfaceC0748.mo2877(0).mo18746().iterator();
                    while (it4.hasNext()) {
                        InterfaceC21211 interfaceC21211 = (InterfaceC21211) it4.next();
                        if (!interfaceC21211.mo29412() || interfaceC21211.mo29409() != 0) {
                            int iMo47883 = interfaceC21211.mo47883();
                            int value = interfaceC21211.getValue().getValue();
                            String strMo29406 = interfaceC21211.mo29406();
                            if (!strMo29406.startsWith("__") && !map.containsKey(strMo29406)) {
                                int iMo29409 = interfaceC21211.mo29409() - 1;
                                C14692[] c14692Arr = new C14692[iMo29409];
                                int i = 0;
                                while (true) {
                                    if (i < iMo29409) {
                                        int i2 = i + 1;
                                        InterfaceC1454 value2 = interfaceC21211.getValue(i2);
                                        it = it3;
                                        int value3 = value2.getValue();
                                        int iMo5004 = value2.mo5004();
                                        it2 = it4;
                                        InterfaceC21211 interfaceC21212 = interfaceC21211;
                                        if (((value2.mo5006() >>> 24) & 255) != interfaceC4277.mo12858()) {
                                            break;
                                        }
                                        InterfaceC21211 interfaceC21211Mo2346 = interfaceC7099Mo2877 == null ? null : interfaceC7099Mo2877.mo2346(value2.mo5006() & 65535);
                                        if (interfaceC21211Mo2346 == null) {
                                            break;
                                        }
                                        c14692Arr[i] = new C14692(value3, iMo5004, interfaceC21211Mo2346.mo29406());
                                        i = i2;
                                        it3 = it;
                                        interfaceC21211 = interfaceC21212;
                                        it4 = it2;
                                    } else {
                                        it = it3;
                                        it2 = it4;
                                        map.put(strMo29406, new C16809(value, strMo29406, c14692Arr, (interfaceC4277.mo12858() << 24) | (interfaceC0748.mo2870() << 16) | iMo47883));
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
        for (C16809 c16809 : map.values()) {
            c7724.mo2318(c16809.f51604, c16809);
        }
        this.f56623 = map;
        this.f56622 = c7724;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m42446() {
        return this.f56624;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16809 m42444(String str) {
        return (C16809) this.f56623.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16809 m42443(int i) {
        return (C16809) this.f56622.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42445() {
        return this.f56622.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection m42442() {
        return this.f56623.values();
    }
}
