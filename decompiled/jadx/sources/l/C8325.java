package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۠ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes4.dex */
public class C8325 extends AbstractC11853 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15379 f25540;

    public C8325(AbstractC15379 abstractC15379) {
        this.f25540 = abstractC15379;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f25540.mo2422(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25540.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f25540.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f25540.mo5873();
        return null;
    }

    @Override // l.InterfaceC1933, java.util.SortedSet
    public final InterfaceC4571 comparator() {
        this.f25540.mo5873();
        return null;
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ֡ */
    public final int mo6349() {
        return this.f25540.mo5870();
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo6354() {
        return this.f25540.mo5868();
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC1933 mo6353(int i) {
        return this.f25540.mo5874(i).keySet();
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC1933 mo6351(int i) {
        return this.f25540.mo5871(i).keySet();
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1933 mo6352(int i, int i2) {
        return this.f25540.mo5872(i, i2).keySet();
    }
}
