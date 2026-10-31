package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۬᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBCG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13447 extends AbstractC17598 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f40170;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f40171;

    public C13447(C1662 c1662) {
        super("class_defs", c1662, 4);
        this.f40170 = new TreeMap();
        this.f40171 = null;
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        ArrayList arrayList = this.f40171;
        return arrayList != null ? arrayList : this.f40170.values();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32477(C18241 c18241) {
        m16524();
        int size = this.f40170.size();
        int iM16522 = size == 0 ? 0 : m16522();
        if (c18241.m42506()) {
            c18241.m42501(4, "class_defs_size: ".concat(C14712.m35008(size)));
            c18241.m42501(4, "class_defs_off:  ".concat(C14712.m35008(iM16522)));
        }
        c18241.m42514(size);
        c18241.m42514(iM16522);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32476(C3570 c3570) {
        try {
            C7573 c7573M30696 = c3570.m10885().m30696();
            m16519();
            TreeMap treeMap = this.f40170;
            if (treeMap.get(c7573M30696) != null) {
                throw new IllegalArgumentException("already added: " + c7573M30696);
            }
            treeMap.put(c7573M30696, c3570);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    @Override // l.AbstractC17598
    /* JADX INFO: renamed from: ۢ */
    public final void mo1508() {
        TreeMap treeMap = this.f40170;
        int size = treeMap.size();
        this.f40171 = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iM32475 = 0;
        while (it.hasNext()) {
            iM32475 = m32475(iM32475, size - iM32475, (C7573) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m32475(int i, int i2, C7573 c7573) {
        C3570 c3570 = (C3570) this.f40170.get(c7573);
        if (c3570 == null || c3570.m37190()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c7573);
        }
        int i3 = i2 - 1;
        C12512 c12512M10884 = c3570.m10884();
        if (c12512M10884 != null) {
            i = m32475(i, i3, c12512M10884.m30696());
        }
        InterfaceC10711 interfaceC10711M10887 = c3570.m10887();
        int size = interfaceC10711M10887.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m32475(i, i3, interfaceC10711M10887.getType(i4));
        }
        c3570.m37187(i);
        this.f40171.add(c3570);
        return i + 1;
    }
}
