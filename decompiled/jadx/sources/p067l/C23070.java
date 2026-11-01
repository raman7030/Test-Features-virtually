package p067l;

/* JADX INFO: renamed from: l.᩸᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8DU */
/* JADX INFO: loaded from: classes.dex */
public final class C23070 {

    /* JADX INFO: renamed from: ֫ */
    public int f72481;

    /* JADX INFO: renamed from: ۧ */
    public C9226 f72482;

    /* JADX INFO: renamed from: ܽ */
    public long f72483;

    /* JADX INFO: renamed from: ᩳ */
    public C17033[] f72484;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m51462(int i) {
        C17033 c17033M51459 = m51459(i);
        if (c17033M51459 != null) {
            c17033M51459.f50368 = false;
            C23070 c23070 = c17033M51459.f50370;
            long j = c23070.f72483;
            c23070.f72483 = 1 + j;
            c17033M51459.f50371 = j;
        }
    }

    public C23070(InterfaceC22400[] interfaceC22400Arr) {
        int length = interfaceC22400Arr.length;
        this.f72481 = length;
        this.f72484 = new C17033[length];
        for (int i = 0; i < this.f72481; i++) {
            C17033[] c17033Arr = this.f72484;
            C17033 c17033 = new C17033(this);
            c17033Arr[i] = c17033;
            c17033.f50372 = interfaceC22400Arr[i];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6544 m51461() {
        if (this.f72482 == null) {
            AbstractC25081 abstractC25081 = (AbstractC25081) this.f72484[0].f50372;
            abstractC25081.getClass();
            this.f72482 = abstractC25081.m55060();
        }
        return this.f72482;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public C17033 m51459(int i) {
        for (C17033 c17033 : this.f72484) {
            if (c17033.f50369 == i) {
                return c17033;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX INFO: renamed from: ֫ */
    public static C17033 m51458(C23070 c23070, int i) {
        C17033 c17033M51459 = c23070.m51459(i);
        if (c17033M51459 == null) {
            C17033 c17033 = null;
            C17033 c17034 = null;
            for (C17033 c17035 : c23070.f72484) {
                if (c17035.f50372 == null) {
                    c17033M51459 = c17035;
                } else {
                    if (c17033 != null) {
                        if (!c17035.f50368 && c17035.f50371 < c17033.f50371) {
                            c17033 = c17035;
                        }
                    } else if (!c17035.f50368) {
                        c17033 = c17035;
                    } else if (c17034 == null || c17035.f50371 < c17034.f50371) {
                        c17034 = c17035;
                    }
                }
            }
            c17033M51459 = c17033 != null ? c17033 : c17034;
        }
        c17033M51459.f50369 = i;
        long j = c23070.f72483;
        c23070.f72483 = 1 + j;
        c17033M51459.f50371 = j;
        c17033M51459.f50368 = true;
        return c17033M51459;
    }
}
