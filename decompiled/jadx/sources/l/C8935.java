package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8935 implements InterfaceC13251 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterator f27162;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22340 f27163;

    public C8935(Collection collection) {
        this.f27162 = collection.iterator();
        next();
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8187() {
        return this.f27163 != null;
    }

    @Override // l.InterfaceC13251
    public final void next() {
        Iterator it = this.f27162;
        this.f27163 = it.hasNext() ? (C22340) it.next() : null;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8191() {
        return this.f27163.f72397;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ܿ */
    public final int mo8190() {
        return this.f27163.f72398;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ܽ */
    public final int mo8189() {
        return this.f27163.f72395;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ۧ */
    public final int mo8188() {
        return this.f27163.f72396;
    }
}
