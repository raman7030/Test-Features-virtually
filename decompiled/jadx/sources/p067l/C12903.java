package p067l;

import android.os.Bundle;
import bin.p000mt.plugin.api.util.ResultCallback;
import com.alipay.sdk.p010m.p016c0.C0094d;

/* JADX INFO: renamed from: l.ۧܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12903 implements InterfaceC13696 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23631 f36280;

    public C12903(C23631 c23631) {
        this.f36280 = c23631;
    }

    @Override // p067l.InterfaceC13696
    public final void onGetPath(Bundle bundle, String str) {
        this.f36280.m52559(str, bundle.getBoolean(C0094d.f367A, false));
    }

    @Override // p067l.InterfaceC13696
    public final void onCanceled() {
        C23631 c23631 = this.f36280;
        if (c23631.f75239 != null) {
            c23631.f75239.onFailure(ResultCallback.ERROR_OPERATION_CANCELED);
            c23631.f75239 = null;
        }
    }
}
