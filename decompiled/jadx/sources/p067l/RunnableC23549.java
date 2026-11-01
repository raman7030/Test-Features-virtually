package p067l;

import bin.p000mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩹۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23549 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f74993;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f74994;

    public /* synthetic */ RunnableC23549(int i, Object obj) {
        this.f74993 = i;
        this.f74994 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74993) {
            case 0:
                C8126.m18828((C8126) this.f74994);
                break;
            case 1:
                C24164.m53424((C24164) this.f74994);
                break;
            case 2:
                C17127.m38755((String) this.f74994);
                break;
            case 3:
                ((AsyncTask) this.f74994).lambda$start$0();
                break;
            default:
                C16407.m37257((C16407) this.f74994);
                break;
        }
    }
}
