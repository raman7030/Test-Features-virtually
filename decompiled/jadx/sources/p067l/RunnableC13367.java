package p067l;

import com.tencent.connect.auth.DialogC0602a;

/* JADX INFO: renamed from: l.ۨ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13367 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public String f37510;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ DialogC0602a f37511;

    public RunnableC13367(DialogC0602a dialogC0602a, String str) {
        this.f37511 = dialogC0602a;
        this.f37510 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("-->timeoutUrl: ");
        String str = this.f37510;
        sb.append(str);
        sb.append(" | mRetryUrl: ");
        DialogC0602a dialogC0602a = this.f37511;
        sb.append(dialogC0602a.f2071);
        C11060.m25471("openSDK_LOG.AuthDialog", sb.toString());
        if (str.equals(dialogC0602a.f2071)) {
            dialogC0602a.f2082.mo5757(new C21139(9002, "请求页面超时，请稍后重试！", dialogC0602a.f2071));
            dialogC0602a.dismiss();
        }
    }
}
