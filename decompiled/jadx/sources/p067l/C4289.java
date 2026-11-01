package p067l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4289 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ EditText f9525;

    /* JADX INFO: renamed from: ܳ */
    public String f9526;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f9527;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f9528;

    public C4289(AbstractActivityC5549 abstractActivityC5549, String str, EditText editText) {
        this.f9528 = abstractActivityC5549;
        this.f9527 = str;
        this.f9525 = editText;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f9528, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        String strM38647 = C18524.m42109(this.f9527, new String[0]).m38647();
        this.f9526 = strM38647;
        if (strM38647.length() > 20480) {
            this.f9526 = this.f9526.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f9525.setText(this.f9526);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f9528.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
