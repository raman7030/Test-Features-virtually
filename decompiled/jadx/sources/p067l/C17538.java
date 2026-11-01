package p067l;

/* JADX INFO: renamed from: l.ܺ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17538 implements InterfaceC21563 {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f52426;

    @Override // p067l.InterfaceC21563
    /* JADX INFO: renamed from: ᩳ */
    public final C24896 mo22101() {
        return null;
    }

    public C17538(boolean z) {
        this.f52426 = z;
    }

    @Override // p067l.InterfaceC21563
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22100() {
        return this.f52426;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f52426 ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
