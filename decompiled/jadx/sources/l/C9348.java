package l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9348 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f28391;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f28392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28393;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f28394;

    public C9348(AbstractActivityC3346 abstractActivityC3346, String str, EditText editText) {
        this.f28394 = abstractActivityC3346;
        this.f28393 = str;
        this.f28391 = editText;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f28394, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        String strM36489 = C16999.m39866(this.f28393, new String[0]).m36489();
        this.f28392 = strM36489;
        if (strM36489.length() > 20480) {
            this.f28392 = this.f28392.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f28391.setText(this.f28392);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f28394.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
