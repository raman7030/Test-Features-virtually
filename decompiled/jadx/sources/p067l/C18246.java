package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C18246 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f54478;

    public C18246(ArrayList arrayList) throws C18917 {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13633 c13633 = (C13633) it.next();
            if (map.put(c13633.f38383, c13633.f38384) != null) {
                throw new C18917("Duplicate signed attribute: " + c13633.f38383);
            }
        }
        this.f54478 = map;
    }

    /* JADX INFO: renamed from: ֫ */
    private C24381 m41507(String str) throws C18917 {
        List list = (List) this.f54478.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() <= 1) {
            return (C24381) list.get(0);
        }
        throw new C18917(C6988.m16053("Attribute ", str, " has multiple values"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m41508() throws C18917 {
        C24381 c24381M41507 = m41507("1.2.840.113549.1.9.3");
        if (c24381M41507 == null) {
            return null;
        }
        try {
            return ((C4165) C17004.m38594(c24381M41507.m53736(), C4165.class)).f9183;
        } catch (C23711 e) {
            throw new C18917("Failed to decode OBJECT IDENTIFIER", e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m41509() throws C18917 {
        C24381 c24381M41507 = m41507("1.2.840.113549.1.9.4");
        if (c24381M41507 == null) {
            return null;
        }
        try {
            return ((C12883) C17004.m38594(c24381M41507.m53736(), C12883.class)).f36239;
        } catch (C23711 e) {
            throw new C18917("Failed to decode OBJECT IDENTIFIER", e);
        }
    }
}
