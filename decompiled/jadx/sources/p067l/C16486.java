package p067l;

import android.content.DialogInterface;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.p010m.p058y.C0252o;

/* JADX INFO: renamed from: l.ܳ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16486 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public String f48433;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f48434;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ int f48435;

    public C16486(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f48434 = abstractActivityC5549;
        this.f48435 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f48434);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        C7350 c7350 = C9111.f24679;
        String[] strArrM21056 = C9111.m21056(this.f48435, 0);
        C23724.f75500 = new RunnableC20791(2, strArrM21056);
        this.f48433 = (String) new PayTask(this.f48434).payV2(strArrM21056[0], true).get(C0252o.f1206a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("8000") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.equals("6004") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        p067l.C22682.m50795((java.lang.CharSequence) "支付结果未知");
        r0 = p067l.C23724.f75500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r0.run();
        r0 = p067l.C10027.f27775;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3402() {
        String str = this.f48433;
        if (str != null) {
            switch (str.hashCode()) {
                case 1596796:
                    if (str.equals("4000")) {
                        C22682.m50795((CharSequence) "支付失败");
                    }
                    break;
                case 1626587:
                    if (str.equals("5000")) {
                        C22682.m50795((CharSequence) "重复请求");
                    }
                    break;
                case 1656379:
                    if (str.equals("6001")) {
                        C22682.m50795((CharSequence) "支付被取消");
                    }
                    break;
                case 1656380:
                    if (str.equals("6002")) {
                        C22682.m50795((CharSequence) "网络连接出错");
                    }
                    break;
                case 1656382:
                    break;
                case 1715960:
                    break;
                case 1745751:
                    if (str.equals("9000")) {
                        C22682.m50795((CharSequence) "支付成功");
                        Runnable runnable = C23724.f75500;
                        if (runnable != null) {
                            runnable.run();
                            C10027 c10027 = C10027.f27775;
                        }
                    }
                    break;
            }
            return;
        }
        C22682.m50795((CharSequence) "未知错误");
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f48434.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
