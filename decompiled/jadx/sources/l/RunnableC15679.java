package l;

/* JADX INFO: renamed from: l.ܺۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15679 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21529 f48252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48253;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f48254;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f48255;

    public RunnableC15679(C0157 c0157, C0863 c0863, String str, C21529 c21529) {
        this.f48254 = c0157;
        this.f48255 = c0863;
        this.f48253 = str;
        this.f48252 = c21529;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C9996) this.f48254.f1338.f45642.getOrDefault(this.f48255.f3353.getBinder(), null)) == null) {
            return;
        }
        String str = this.f48253;
        C19874 c19874 = new C19874(str, this.f48252);
        c19874.m33913(2);
        c19874.m33915();
        if (!c19874.m33914()) {
            throw new IllegalStateException(C20094.m46315("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
