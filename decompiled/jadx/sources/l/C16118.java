package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C16118 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1302 f49660;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f49661 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Iterator f49662;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9064(this, this);
    }

    public C16118(C1302 c1302, Iterator it) {
        this.f49660 = c1302;
        this.f49662 = it;
    }
}
