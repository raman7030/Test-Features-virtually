package l;

import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.۬۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12983 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12278 f38892;

    public RunnableC12983(C12278 c12278) {
        this.f38892 = c12278;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f38892.f36581;
        if (aVar.f875 != null) {
            aVar.f875.loadUrl(aVar.f874);
        }
    }
}
