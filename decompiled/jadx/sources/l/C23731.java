package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes2.dex */
public class C23731 extends AbstractC5387 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6798 f76840;

    public C23731(AbstractC6798 abstractC6798) {
        this.f76840 = abstractC6798;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8956(char c) {
        return this.f76840.mo13247(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f76840.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f76840.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f76840.comparator();
        return null;
    }
}
