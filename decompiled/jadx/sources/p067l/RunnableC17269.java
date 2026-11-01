package p067l;

/* JADX INFO: renamed from: l.ܺۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17269 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C1910 f51390;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f51391;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f51392;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f51393;

    public RunnableC17269(C2517 c2517, C3188 c3188, String str, C1910 c1910) {
        this.f51392 = c2517;
        this.f51393 = c3188;
        this.f51391 = str;
        this.f51390 = c1910;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C11868) this.f51392.f4113.f48755.getOrDefault(this.f51393.f6126.getBinder(), null)) == null) {
            return;
        }
        String str = this.f51391;
        C21256 c21256 = new C21256(str, this.f51390);
        c21256.m36046(2);
        c21256.m36048();
        if (!c21256.m36047()) {
            throw new IllegalStateException(C21466.m48631("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
