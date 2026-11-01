package p067l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C21100 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2993 f66299;

    public C21100(C2993 c2993) {
        this.f66299 = c2993;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2993 c2993 = this.f66299;
        return C6786.m15488(AbstractC16192.m36874of(c2993.f5298.iterator(), c2993.f5301.iterator()), AbstractC12093.m27883());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C2993 c2993 = this.f66299;
        return c2993.f5301.size() + c2993.f5298.size();
    }
}
