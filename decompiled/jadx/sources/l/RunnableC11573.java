package l;

import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.ۨ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11573 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f34511;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f34512;

    public RunnableC11573(a aVar, String str) {
        this.f34512 = aVar;
        this.f34511 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("-->timeoutUrl: ");
        String str = this.f34511;
        sb.append(str);
        sb.append(" | mRetryUrl: ");
        a aVar = this.f34512;
        sb.append(aVar.f874);
        C9145.m23520("openSDK_LOG.AuthDialog", sb.toString());
        if (str.equals(aVar.f874)) {
            aVar.f885.mo3454(new C19750(9002, "请求页面超时，请稍后重试！", aVar.f874));
            aVar.dismiss();
        }
    }
}
