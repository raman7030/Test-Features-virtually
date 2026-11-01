package p067l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۗܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5533 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f13344 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 m12224(String str) {
        C13045.m29867(str, "key");
        return (AbstractC7545) this.f13344.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12226(String str, AbstractC7545 abstractC7545) {
        C13045.m29867(str, "key");
        C13045.m29867(abstractC7545, "viewModel");
        AbstractC7545 abstractC7546 = (AbstractC7545) this.f13344.put(str, abstractC7545);
        if (abstractC7546 != null) {
            abstractC7546.mo17458();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final HashSet m12227() {
        return new HashSet(this.f13344.keySet());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12225() {
        LinkedHashMap linkedHashMap = this.f13344;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC7545) it.next()).m17455();
        }
        linkedHashMap.clear();
    }
}
