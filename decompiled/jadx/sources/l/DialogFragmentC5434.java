package l;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4II */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC5434 extends AbstractDialogFragmentC18323 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f16933;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f16934;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public CharSequence[] f16935;

    @Deprecated
    public DialogFragmentC5434() {
    }

    @Override // l.AbstractDialogFragmentC18323, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16933 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f16934 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f16935 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C19546 c19546 = (C19546) m42702();
        if (c19546.m44958() == null || c19546.m44953() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f16933 = c19546.m44956(c19546.getValue());
        this.f16934 = c19546.m44958();
        this.f16935 = c19546.m44953();
    }

    @Override // l.AbstractDialogFragmentC18323, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f16933);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f16934);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f16935);
    }

    @Override // l.AbstractDialogFragmentC18323
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo13844(boolean z) {
        int i;
        C19546 c19546 = (C19546) m42702();
        if (!z || (i = this.f16933) < 0) {
            return;
        }
        String string = this.f16935[i].toString();
        c19546.m6893((Serializable) string);
        c19546.m44957(string);
    }

    @Override // l.AbstractDialogFragmentC18323
    /* JADX INFO: renamed from: ֫ */
    public final void mo13843(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f16934, this.f16933, new DialogInterfaceOnClickListenerC0494(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }
}
