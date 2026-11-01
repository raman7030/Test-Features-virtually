package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17687 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C3606 f52826;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f52827 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public Iterator f52828;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10983(this, this);
    }

    public C17687(C3606 c3606, Iterator it) {
        this.f52826 = c3606;
        this.f52828 = it;
    }
}
