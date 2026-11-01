package p067l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11253 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ EditText f31340;

    /* JADX INFO: renamed from: ܳ */
    public String f31341;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f31342;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f31343;

    public C11253(AbstractActivityC5549 abstractActivityC5549, String str, EditText editText) {
        this.f31343 = abstractActivityC5549;
        this.f31342 = str;
        this.f31340 = editText;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f31343, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        String strM38647 = C18524.m42109(this.f31342, new String[0]).m38647();
        this.f31341 = strM38647;
        if (strM38647.length() > 20480) {
            this.f31341 = this.f31341.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f31340.setText(this.f31341);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f31343.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
