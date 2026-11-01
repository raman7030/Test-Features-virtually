package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۚۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C7427 extends AbstractList {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f19442;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f19443;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15472 f19444;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f19445;

    public C7427(C15472 c15472, int i, int i2, int i3) {
        this.f19444 = c15472;
        this.f19445 = i;
        this.f19442 = i2;
        this.f19443 = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= this.f19445) {
            throw new IndexOutOfBoundsException();
        }
        C15472 c15472 = this.f19444;
        boolean z = c15472.f44184;
        int i2 = this.f19443;
        int i3 = this.f19442;
        if (z) {
            return new C6756(c15472, (i * i2) + i3);
        }
        return new C21509(c15472, (i * i2) + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19445;
    }
}
