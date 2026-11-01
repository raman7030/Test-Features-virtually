package p067l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20429 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2993 f63117;

    public C20429(C2993 c2993) {
        this.f63117 = c2993;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2993 c2993 = this.f63117;
        return C6786.m15488(AbstractC16192.m36874of((Object) c2993.f5300.iterator(), (Object) c2993.f5305.iterator()), AbstractC12093.m27883());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C2993 c2993 = this.f63117;
        return c2993.f5305.size() + c2993.f5300.size();
    }
}
