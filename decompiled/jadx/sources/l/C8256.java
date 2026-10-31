package l;

import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۠ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes4.dex */
public class C8256 extends AbstractDialogInterfaceOnClickListenerC14794 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f25409;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f25410;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public CharSequence[] f25411;

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794, l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f25409 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f25410 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f25411 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C19546 c19546 = (C19546) m35179();
        if (c19546.m44958() == null || c19546.m44953() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f25409 = c19546.m44956(c19546.getValue());
        this.f25410 = c19546.m44958();
        this.f25411 = c19546.m44953();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794, l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f25409);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f25410);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f25411);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21851(C18892 c18892) {
        c18892.setSingleChoiceItems(this.f25410, this.f25409, new DialogInterfaceOnClickListenerC1200(this));
        c18892.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21852(boolean z) {
        int i;
        if (!z || (i = this.f25409) < 0) {
            return;
        }
        String string = this.f25411[i].toString();
        C19546 c19546 = (C19546) m35179();
        c19546.m6893((Serializable) string);
        c19546.m44957(string);
    }
}
