package p067l;

import com.rosan.dhizuku.api.DhizukuRequestPermissionListener;

/* JADX INFO: renamed from: l.ܶۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC16650 extends DhizukuRequestPermissionListener {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12510 f48919;

    /* JADX INFO: renamed from: ܿ */
    public boolean f48920 = false;

    public BinderC16650(C12510 c12510) {
        this.f48919 = c12510;
    }

    @Override // com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener
    public final void onRequestPermission(int i) {
        if (this.f48920) {
            return;
        }
        this.f48920 = true;
        C12510 c12510 = this.f48919;
        if (i == 0) {
            c12510.m28816(EnumC7934.DHIZUKU);
        } else {
            c12510.m28817(EnumC7934.DHIZUKU);
        }
    }
}
