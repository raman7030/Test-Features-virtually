package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes.dex */
public final class C23687 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC18043 f76717 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f76718;

    public C23687(Iterator it) {
        this.f76718 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76718.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC18043 abstractC18043 = (AbstractC18043) this.f76718.next();
        this.f76717 = abstractC18043;
        return abstractC18043;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC18043 abstractC18043 = this.f76717;
        if (abstractC18043 != null) {
            abstractC18043.f56236 = null;
        }
        this.f76718.remove();
    }
}
