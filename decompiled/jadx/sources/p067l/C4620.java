package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۖۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4620 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11326 f10356;

    public C4620(C11326 c11326) {
        this.f10356 = c11326;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C11326 c11326 = this.f10356;
        if (i >= c11326.size()) {
            return C20778.m46922(i, i < 10 ? "type0" : "type");
        }
        return c11326.m50188(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10356.size();
    }
}
