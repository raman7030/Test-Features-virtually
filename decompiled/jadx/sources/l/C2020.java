package l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2020 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f6739;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f6740;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6741;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f6742;

    public C2020(AbstractActivityC3346 abstractActivityC3346, String str, EditText editText) {
        this.f6742 = abstractActivityC3346;
        this.f6741 = str;
        this.f6739 = editText;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f6742, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        String strM36489 = C16999.m39866(this.f6741, new String[0]).m36489();
        this.f6740 = strM36489;
        if (strM36489.length() > 20480) {
            this.f6740 = this.f6740.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f6739.setText(this.f6740);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f6742.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
