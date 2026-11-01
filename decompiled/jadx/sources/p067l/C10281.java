package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۠ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes4.dex */
public class C10281 extends AbstractC13634 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC16985 f28451;

    public C10281(AbstractC16985 abstractC16985) {
        this.f28451 = abstractC16985;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f28451.mo4793(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28451.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f28451.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f28451.mo8083();
        return null;
    }

    @Override // p067l.InterfaceC4206, java.util.SortedSet
    public final InterfaceC6713 comparator() {
        this.f28451.mo8083();
        return null;
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ֡ */
    public final int mo8522() {
        return this.f28451.mo8080();
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo8527() {
        return this.f28451.mo8078();
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4206 mo8526(int i) {
        return this.f28451.mo8084(i).keySet();
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC4206 mo8524(int i) {
        return this.f28451.mo8081(i).keySet();
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4206 mo8525(int i, int i2) {
        return this.f28451.mo8082(i, i2).keySet();
    }
}
