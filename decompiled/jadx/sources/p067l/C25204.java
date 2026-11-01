package p067l;

import android.content.DialogInterface;
import com.tencent.p062mm.opensdk.modelpay.PayReq;
import com.tencent.p062mm.opensdk.openapi.IWXAPI;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩻᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes.dex */
public final class C25204 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f80599;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f80600;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ IWXAPI f80601;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    public C25204(AbstractActivityC5549 abstractActivityC5549, int i, IWXAPI iwxapi) {
        this.f80600 = abstractActivityC5549;
        this.f80599 = i;
        this.f80601 = iwxapi;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f80600);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        C7350 c7350 = C9111.f24679;
        String[] strArrM21056 = C9111.m21056(this.f80599, 1);
        C23724.f75500 = new RunnableC6035(1, strArrM21056);
        JSONObject jSONObject = new JSONObject(strArrM21056[0]);
        if ("OK".equals(jSONObject.getString("1"))) {
            PayReq payReq = new PayReq();
            C7350 c7351 = C23724.f75498;
            payReq.appId = C23724.m52761();
            payReq.partnerId = "1493963962";
            payReq.prepayId = jSONObject.getString("2");
            payReq.nonceStr = jSONObject.getString("3");
            payReq.timeStamp = jSONObject.getString("4");
            payReq.packageValue = jSONObject.getString("5");
            payReq.sign = jSONObject.getString("6");
            this.f80601.sendReq(payReq);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f80600.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
