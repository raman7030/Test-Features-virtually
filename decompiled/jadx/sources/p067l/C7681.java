package p067l;

import android.content.Intent;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;

/* JADX INFO: renamed from: l.ۚ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7681 implements InterfaceC21153, InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f20146;

    public /* synthetic */ C7681(Object obj) {
        this.f20146 = obj;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo9173() {
        return false;
    }

    @Override // p067l.InterfaceC21153
    /* JADX INFO: renamed from: ֫ */
    public void mo6900(Intent intent, int i) {
        ActivityC3657 activityC3657 = (ActivityC3657) this.f20146;
        int i2 = ActivityC3657.f7683;
        if (i != -1) {
            activityC3657.finish();
            return;
        }
        Intent intent2 = new Intent(activityC3657, (Class<?>) ServiceC5428.class);
        intent2.putExtra(AbstractC0213e.f989m, intent);
        C0886.m5546(activityC3657, intent2);
        C7050.m16213(new RunnableC18166(3, activityC3657), 100L);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public void mo9171(AbstractC7783 abstractC7783) {
        C6684 c6684 = (C6684) this.f20146;
        c6684.getClass();
        c6684.m15224((C3626) null, (C15828) abstractC7783);
    }
}
