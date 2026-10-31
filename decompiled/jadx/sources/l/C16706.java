package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16706 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f51293;

    public C16706(ArrayList arrayList) throws C17412 {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11852 c11852 = (C11852) it.next();
            if (map.put(c11852.f35378, c11852.f35379) != null) {
                throw new C17412("Duplicate signed attribute: " + c11852.f35378);
            }
        }
        this.f51293 = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23161 m39271(String str) throws C17412 {
        List list = (List) this.f51293.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() <= 1) {
            return (C23161) list.get(0);
        }
        throw new C17412(C4860.m14172("Attribute ", str, " has multiple values"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m39272() throws C17412 {
        C23161 c23161M39271 = m39271("1.2.840.113549.1.9.3");
        if (c23161M39271 == null) {
            return null;
        }
        try {
            return ((C1890) C15399.m36436(c23161M39271.m51340(), C1890.class)).f6401;
        } catch (C22456 e) {
            throw new C17412("Failed to decode OBJECT IDENTIFIER", e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m39273() throws C17412 {
        C23161 c23161M39271 = m39271("1.2.840.113549.1.9.4");
        if (c23161M39271 == null) {
            return null;
        }
        try {
            return ((C11063) C15399.m36436(c23161M39271.m51340(), C11063.class)).f33238;
        } catch (C22456 e) {
            throw new C17412("Failed to decode OBJECT IDENTIFIER", e);
        }
    }
}
