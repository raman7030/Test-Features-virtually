package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17768 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f53063;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53064;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f53065;

    public /* synthetic */ RunnableC17768(int i, Object obj, Object obj2) {
        this.f53064 = i;
        this.f53065 = obj;
        this.f53063 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f53064;
        Object obj = this.f53063;
        Object obj2 = this.f53065;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((InterfaceC5029) obj2).mo10704(new IOException(th.getMessage(), th));
                break;
            case 1:
                ActivityC23336.m51963((ActivityC23336) obj2, (AbstractC14973) obj);
                break;
            default:
                int i2 = C11106.f30790;
                ((AbstractC17043) obj2).mo20486(((AbstractC3451) obj).m6128());
                break;
        }
    }
}
