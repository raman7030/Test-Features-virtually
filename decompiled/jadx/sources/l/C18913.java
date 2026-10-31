package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18913 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7379 f59594;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59595 = new ArrayList();

    public C18913(AbstractC7379 abstractC7379) {
        this.f59594 = abstractC7379;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43655(InterfaceC17236 interfaceC17236) {
        this.f59594.mo19833(interfaceC17236);
        this.f59595.add(interfaceC17236);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43654() {
        ArrayList arrayList = this.f59595;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f59594.mo19834((InterfaceC17236) it.next());
        }
        arrayList.clear();
    }
}
