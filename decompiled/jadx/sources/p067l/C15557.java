package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15557 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public String f44465;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f44466;

    /* JADX INFO: renamed from: ܳ */
    public String f44467;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractActivityC5549 f44468;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC9523 f44469;

    public C15557(ViewOnClickListenerC9523 viewOnClickListenerC9523, AbstractActivityC5549 abstractActivityC5549, String str) {
        this.f44469 = viewOnClickListenerC9523;
        this.f44468 = abstractActivityC5549;
        this.f44466 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f44468, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924, IOException {
        String strM38647 = C18524.m42109(this.f44466, new String[0]).m38647();
        this.f44467 = strM38647;
        String strM10026 = AbstractC4734.m10026(strM38647);
        if (strM10026 == null) {
            throw new C3924(this.f44469.getString(R.string.MT_Protector));
        }
        this.f44465 = C17073.m38720(1, 1, strM10026);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        String strM36347 = C15993.m36347(this.f44465);
        String strM36343 = C15993.m36343(this.f44465);
        if (strM36347.length() > 130 || C13451.m30593(strM36347)) {
            strM36347 = "# TOO_LONG_NAME/";
        }
        if (strM36343.length() > 100) {
            strM36343 = strM36343.substring(0, 50) + "_too_long_" + Long.toHexString(((long) strM36343.hashCode()) & 4294967295L);
        }
        this.f44469.m22166(R.string.MT_Protector, strM36347, strM36343, true, new InterfaceC21152() { // from class: l.᩺ܳۢ
            @Override // p067l.InterfaceC21152
            /* JADX INFO: renamed from: ֫ */
            public final Object mo9100(Object obj, Object obj2) {
                return this.f76904.f44467;
            }
        });
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f44468.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
