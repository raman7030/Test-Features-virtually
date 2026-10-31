package l;

/* JADX INFO: renamed from: l.ܺ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15961 implements InterfaceC20196 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f49268;

    @Override // l.InterfaceC20196
    /* JADX INFO: renamed from: ᩳ */
    public final C23703 mo20125() {
        return null;
    }

    public C15961(boolean z) {
        this.f49268 = z;
    }

    @Override // l.InterfaceC20196
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo20124() {
        return this.f49268;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f49268 ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
