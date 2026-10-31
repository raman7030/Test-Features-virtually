package l;

/* JADX INFO: renamed from: l.ۖ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2537 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f8057 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2557 m8046() {
        ThreadLocal threadLocal = f8057;
        AbstractC2557 abstractC2557 = (AbstractC2557) threadLocal.get();
        if (abstractC2557 != null) {
            return abstractC2557;
        }
        C17085 c17085 = new C17085(Thread.currentThread());
        threadLocal.set(c17085);
        return c17085;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m8048() {
        f8057.set(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8047(RunnableC16667 runnableC16667) {
        f8057.set(runnableC16667);
    }
}
