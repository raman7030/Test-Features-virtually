package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۠ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4RX */
/* JADX INFO: loaded from: classes4.dex */
public class C10215 extends AbstractDialogInterfaceOnClickListenerC16429 {

    /* JADX INFO: renamed from: ۛ */
    public int f28319;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence[] f28320;

    /* JADX INFO: renamed from: ᩺ */
    public CharSequence[] f28321;

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429, p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f28319 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f28320 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f28321 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        C20945 c20945 = (C20945) m37326();
        if (c20945.m47258() == null || c20945.m47253() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f28319 = c20945.m47256(c20945.getValue());
        this.f28320 = c20945.m47258();
        this.f28321 = c20945.m47253();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429, p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f28319);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f28320);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f28321);
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ֫ */
    public final void mo23821(C1779 c1779) {
        c1779.setSingleChoiceItems(this.f28320, this.f28319, new DialogInterfaceOnClickListenerC3509(this));
        c1779.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ֫ */
    public final void mo23822(boolean z) {
        int i;
        if (!z || (i = this.f28319) < 0) {
            return;
        }
        String string = this.f28321[i].toString();
        C20945 c20945 = (C20945) m37326();
        c20945.m9019((Serializable) string);
        c20945.m47257(string);
    }
}
