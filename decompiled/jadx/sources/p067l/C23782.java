package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D76O */
/* JADX INFO: loaded from: classes.dex */
public final class C23782 implements InterfaceC4074 {

    /* JADX INFO: renamed from: ֫ */
    public C18155 f75631;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f75632;

    /* JADX INFO: renamed from: ܽ */
    public C18694 f75633;

    /* JADX INFO: renamed from: ܿ */
    public long f75634;

    /* JADX INFO: renamed from: ᩳ */
    public String f75635;

    /* JADX INFO: renamed from: ֫ */
    public final void m52871(C18694 c18694, ArrayList arrayList, C18155 c18155, long j) {
        this.f75633 = c18694;
        this.f75632 = arrayList;
        this.f75631 = c18155;
        this.f75634 = j;
        this.f75635 = null;
    }

    @Override // p067l.InterfaceC4074
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8178(EnumC3167 enumC3167, long j) {
        if (j != this.f75634) {
            return true;
        }
        if (this.f75635 == null) {
            this.f75635 = this.f75631.f54220.getType() + "->" + C10685.m24608(this.f75631);
        }
        this.f75632.add(new C19759("dex", "resource_id", "dex_method", this.f75635, enumC3167.f6089 + " " + this.f75633.f55831, null, null, null, null, null, null));
        return this.f75632.size() < this.f75633.f55828;
    }
}
