package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۬᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBCG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15149 extends AbstractC19094 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f43241;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f43242;

    public C15149(C3948 c3948) {
        super("class_defs", c3948, 4);
        this.f43241 = new TreeMap();
        this.f43242 = null;
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        ArrayList arrayList = this.f43242;
        return arrayList != null ? arrayList : this.f43241.values();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34579(C19705 c19705) {
        m18450();
        int size = this.f43241.size();
        int iM18448 = size == 0 ? 0 : m18448();
        if (c19705.m44765()) {
            c19705.m44760(4, "class_defs_size: ".concat(C16351.m37155(size)));
            c19705.m44760(4, "class_defs_off:  ".concat(C16351.m37155(iM18448)));
        }
        c19705.m44773(size);
        c19705.m44773(iM18448);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34578(C5762 c5762) {
        try {
            C9566 c9566M32771 = c5762.m12865().m32771();
            m18445();
            TreeMap treeMap = this.f43241;
            if (treeMap.get(c9566M32771) != null) {
                throw new IllegalArgumentException("already added: " + c9566M32771);
            }
            treeMap.put(c9566M32771, c5762);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        TreeMap treeMap = this.f43241;
        int size = treeMap.size();
        this.f43242 = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iM34577 = 0;
        while (it.hasNext()) {
            iM34577 = m34577(iM34577, size - iM34577, (C9566) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m34577(int i, int i2, C9566 c9566) {
        C5762 c5762 = (C5762) this.f43241.get(c9566);
        if (c5762 == null || c5762.m39360()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c9566);
        }
        int i3 = i2 - 1;
        C14260 c14260M12864 = c5762.m12864();
        if (c14260M12864 != null) {
            i = m34577(i, i3, c14260M12864.m32771());
        }
        InterfaceC12548 interfaceC12548M12867 = c5762.m12867();
        int size = interfaceC12548M12867.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m34577(i, i3, interfaceC12548M12867.getType(i4));
        }
        c5762.m39357(i);
        this.f43242.add(c5762);
        return i + 1;
    }
}
