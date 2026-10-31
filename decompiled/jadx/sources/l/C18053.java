package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18053 extends AbstractC10771 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17347 f56259;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f56260;

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ۧ */
    public final int mo1336() {
        return this.f56260.size();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ֫ */
    public final int mo1334() {
        return this.f56259.f53143.size();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1337(int i, int i2) {
        return this.f56260.get(i) == this.f56259.f53143.get(i2);
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1335(int i, int i2) {
        return this.f56260.get(i) == this.f56259.f53143.get(i2);
    }

    public C18053(C17347 c17347, ArrayList arrayList) {
        this.f56259 = c17347;
        this.f56260 = arrayList;
    }
}
