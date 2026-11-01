package p067l;

/* JADX INFO: renamed from: l.᩶֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21233 implements InterfaceC19764 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f66752;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f66753;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23914 f66754;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f66755;

    public C21233(String str, String str2, int i, C23914 c23914) {
        this.f66753 = str;
        this.f66752 = str2;
        this.f66755 = i;
        this.f66754 = c23914;
    }

    @Override // p067l.InterfaceC19764
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18422 mo6852(int i) {
        return new C23244(i, this.f66753, this.f66752, this.f66755, this.f66754);
    }

    @Override // p067l.InterfaceC19764
    public final void cancel() {
        this.f66754.m52984();
    }
}
