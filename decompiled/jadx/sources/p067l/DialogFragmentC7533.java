package p067l;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC7533 extends AbstractDialogFragmentC19783 {

    /* JADX INFO: renamed from: ۛ */
    public int f19773;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence[] f19774;

    /* JADX INFO: renamed from: ᩺ */
    public CharSequence[] f19775;

    @Deprecated
    public DialogFragmentC7533() {
    }

    @Override // p067l.AbstractDialogFragmentC19783, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f19773 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f19774 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f19775 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C20945 c20945 = (C20945) m44964();
        if (c20945.m47258() == null || c20945.m47253() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f19773 = c20945.m47256(c20945.getValue());
        this.f19774 = c20945.m47258();
        this.f19775 = c20945.m47253();
    }

    @Override // p067l.AbstractDialogFragmentC19783, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f19773);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f19774);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f19775);
    }

    @Override // p067l.AbstractDialogFragmentC19783
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo15724(boolean z) {
        int i;
        C20945 c20945 = (C20945) m44964();
        if (!z || (i = this.f19773) < 0) {
            return;
        }
        String string = this.f19775[i].toString();
        c20945.m9019((Serializable) string);
        c20945.m47257(string);
    }

    @Override // p067l.AbstractDialogFragmentC19783
    /* JADX INFO: renamed from: ֫ */
    public final void mo15723(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f19774, this.f19773, new DialogInterfaceOnClickListenerC2838(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }
}
