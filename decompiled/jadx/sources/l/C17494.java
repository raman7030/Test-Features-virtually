package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C17494 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53445 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21023 f53446;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    public C17494(AbstractC21023 abstractC21023) {
        this.f53446 = abstractC21023;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53445 < this.f53446.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f53445;
        this.f53445 = i + 1;
        return this.f53446.getItem(i);
    }
}
