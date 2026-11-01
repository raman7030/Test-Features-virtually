package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public final class C22152 extends AbstractC8740 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC11423 f70069;

    public C22152(AbstractC11423 abstractC11423) {
        this.f70069 = abstractC11423;
    }

    @Override // p067l.AbstractC8740
    /* JADX INFO: renamed from: ۧ */
    public final Map mo20213() {
        return this.f70069;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f70069.mo17188();
    }
}
