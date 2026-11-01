package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19994 extends C16639 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22676 f60700;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19994(C22676 c22676) {
        super(c22676);
        this.f60700 = c22676;
    }

    @Override // p067l.C16639, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5912(this.f60700);
    }
}
