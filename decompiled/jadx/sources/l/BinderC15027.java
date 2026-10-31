package l;

import com.rosan.dhizuku.api.DhizukuRequestPermissionListener;

/* JADX INFO: renamed from: l.ܶۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC15027 extends DhizukuRequestPermissionListener {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f45803;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f45804 = false;

    public BinderC15027(C10671 c10671) {
        this.f45803 = c10671;
    }

    @Override // com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener
    public final void onRequestPermission(int i) {
        if (this.f45804) {
            return;
        }
        this.f45804 = true;
        C10671 c10671 = this.f45803;
        if (i == 0) {
            c10671.m26777(EnumC5856.DHIZUKU);
        } else {
            c10671.m26778(EnumC5856.DHIZUKU);
        }
    }
}
