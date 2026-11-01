package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ᩴۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19953 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C1910 f60566;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f60567;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f60568;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f60569;

    public RunnableC19953(C2517 c2517, C3188 c3188, String str, Bundle bundle, C1910 c1910) {
        this.f60568 = c2517;
        this.f60569 = c3188;
        this.f60567 = str;
        this.f60566 = c1910;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C11868) this.f60568.f4113.f48755.getOrDefault(this.f60569.f6126.getBinder(), null)) == null) {
            return;
        }
        String str = this.f60567;
        C6503 c6503 = new C6503(str, this.f60566);
        c6503.m36046(4);
        c6503.m36048();
        if (!c6503.m36047()) {
            throw new IllegalStateException(C21466.m48631("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
