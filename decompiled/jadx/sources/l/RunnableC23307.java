package l;

/* JADX INFO: renamed from: l.᩺᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23307 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14134 f74923;

    public RunnableC23307(C14134 c14134) {
        this.f74923 = c14134;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14134 c14134 = this.f74923;
        if (c14134.f42635) {
            return;
        }
        if (c14134.m33743()) {
            c14134.f42634.postDelayed(this, 200L);
        } else {
            c14134.m33740();
        }
    }
}
