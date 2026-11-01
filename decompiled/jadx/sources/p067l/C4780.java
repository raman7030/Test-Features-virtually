package p067l;

/* JADX INFO: renamed from: l.ۖ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4780 {

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadLocal f10847 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4799 m10076() {
        ThreadLocal threadLocal = f10847;
        AbstractC4799 abstractC4799 = (AbstractC4799) threadLocal.get();
        if (abstractC4799 != null) {
            return abstractC4799;
        }
        C18606 c18606 = new C18606(Thread.currentThread());
        threadLocal.set(c18606);
        return c18606;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m10078() {
        f10847.set(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10077(RunnableC18209 runnableC18209) {
        f10847.set(runnableC18209);
    }
}
