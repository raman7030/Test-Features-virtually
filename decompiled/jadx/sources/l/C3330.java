package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۗܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3330 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f10534 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m10188(String str) {
        C11233.m27805(str, "key");
        return (AbstractC5447) this.f10534.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10190(String str, AbstractC5447 abstractC5447) {
        C11233.m27805(str, "key");
        C11233.m27805(abstractC5447, "viewModel");
        AbstractC5447 abstractC5448 = (AbstractC5447) this.f10534.put(str, abstractC5447);
        if (abstractC5448 != null) {
            abstractC5448.mo15547();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet m10191() {
        return new HashSet(this.f10534.keySet());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10189() {
        LinkedHashMap linkedHashMap = this.f10534;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5447) it.next()).m15544();
        }
        linkedHashMap.clear();
    }
}
