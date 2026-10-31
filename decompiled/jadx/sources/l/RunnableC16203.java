package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16203 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49897;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49898;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49899;

    public /* synthetic */ RunnableC16203(int i, Object obj, Object obj2) {
        this.f49898 = i;
        this.f49899 = obj;
        this.f49897 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49898;
        Object obj = this.f49897;
        Object obj2 = this.f49899;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((InterfaceC2799) obj2).mo8644(new IOException(th.getMessage(), th));
                break;
            case 1:
                ActivityC22062.m49627((ActivityC22062) obj2, (AbstractC13262) obj);
                break;
            default:
                int i2 = C9193.f27851;
                ((AbstractC15440) obj2).mo18537(((AbstractC1139) obj).m3887());
                break;
        }
    }
}
