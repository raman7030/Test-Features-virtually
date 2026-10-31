package l;

import android.content.Intent;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ۚ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5589 implements InterfaceC19764, InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17302;

    public /* synthetic */ C5589(Object obj) {
        this.f17302 = obj;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo7078() {
        return false;
    }

    @Override // l.InterfaceC19764
    /* JADX INFO: renamed from: ֫ */
    public void mo4668(Intent intent, int i) {
        ActivityC1355 activityC1355 = (ActivityC1355) this.f17302;
        int i2 = ActivityC1355.f4911;
        if (i != -1) {
            activityC1355.finish();
            return;
        }
        Intent intent2 = new Intent(activityC1355, (Class<?>) ServiceC3219.class);
        intent2.putExtra(e.m, intent);
        C0881.m3232(activityC1355, intent2);
        C4925.m14316(new RunnableC16622(3, activityC1355), 100L);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public void mo7076(AbstractC5698 abstractC5698) {
        C4541 c4541 = (C4541) this.f17302;
        c4541.getClass();
        c4541.m13336((C1323) null, (C14163) abstractC5698);
    }
}
