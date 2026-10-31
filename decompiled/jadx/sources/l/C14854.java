package l;

import android.content.DialogInterface;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.y.o;

/* JADX INFO: renamed from: l.ܳ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14854 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f45317;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f45318;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45319;

    public C14854(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f45318 = abstractActivityC3346;
        this.f45319 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f45318);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        C5242 c5242 = C7094.f21798;
        String[] strArrM19098 = C7094.m19098(this.f45319, 0);
        C22470.f72773 = new RunnableC19384(2, strArrM19098);
        this.f45317 = (String) new PayTask(this.f45318).payV2(strArrM19098[0], true).get(o.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("8000") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.equals("6004") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        l.C21374.m48459((java.lang.CharSequence) "支付结果未知");
        r0 = l.C22470.f72773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r0.run();
        r0 = l.C8058.f24861;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1006() {
        String str = this.f45317;
        if (str != null) {
            switch (str.hashCode()) {
                case 1596796:
                    if (str.equals("4000")) {
                        C21374.m48459((CharSequence) "支付失败");
                    }
                    break;
                case 1626587:
                    if (str.equals("5000")) {
                        C21374.m48459((CharSequence) "重复请求");
                    }
                    break;
                case 1656379:
                    if (str.equals("6001")) {
                        C21374.m48459((CharSequence) "支付被取消");
                    }
                    break;
                case 1656380:
                    if (str.equals("6002")) {
                        C21374.m48459((CharSequence) "网络连接出错");
                    }
                    break;
                case 1656382:
                    break;
                case 1715960:
                    break;
                case 1745751:
                    if (str.equals("9000")) {
                        C21374.m48459((CharSequence) "支付成功");
                        Runnable runnable = C22470.f72773;
                        if (runnable != null) {
                            runnable.run();
                            C8058 c8058 = C8058.f24861;
                        }
                    }
                    break;
            }
            return;
        }
        C21374.m48459((CharSequence) "未知错误");
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f45318.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
