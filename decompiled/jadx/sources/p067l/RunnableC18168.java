package p067l;

/* JADX INFO: renamed from: l.ܽۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18168 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final C13318 f54243;

    public RunnableC18168(C13318 c13318, C21545 c21545) {
        this.f54243 = c13318;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final EnumC7953 enumC7953M36784 = EnumC7953.COMMAND_FAILED;
        try {
            enumC7953M36784 = C16156.m36784();
        } catch (Throwable unused) {
        }
        C7050.m16212(new Runnable() { // from class: l.ۧۨܿ
            @Override // java.lang.Runnable
            public final void run() {
                C16156.m36787(this.f36034.f54243, enumC7953M36784);
            }
        });
    }
}
