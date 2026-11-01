package p067l;

import android.app.AlertDialog;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC6862 extends AbstractDialogFragmentC19783 {

    /* JADX INFO: renamed from: ۛ */
    public CharSequence[] f17840;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence[] f17841;

    /* JADX INFO: renamed from: ܰ */
    public boolean f17842;

    /* JADX INFO: renamed from: ᩺ */
    public HashSet f17843 = new HashSet();

    @Deprecated
    public DialogFragmentC6862() {
    }

    @Override // p067l.AbstractDialogFragmentC19783, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f17843;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.f17842 = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.f17840 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.f17841 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        C23626 c23626 = (C23626) m44964();
        if (c23626.m52473() == null || c23626.m52474() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c23626.m52471());
        this.f17842 = false;
        this.f17840 = c23626.m52473();
        this.f17841 = c23626.m52474();
    }

    @Override // p067l.AbstractDialogFragmentC19783, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f17843));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f17842);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f17840);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f17841);
    }

    @Override // p067l.AbstractDialogFragmentC19783
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo15724(boolean z) {
        C23626 c23626 = (C23626) m44964();
        if (z && this.f17842) {
            HashSet hashSet = this.f17843;
            c23626.m9019((Serializable) hashSet);
            c23626.m52472(hashSet);
        }
        this.f17842 = false;
    }

    @Override // p067l.AbstractDialogFragmentC19783
    /* JADX INFO: renamed from: ֫ */
    public final void mo15723(AlertDialog.Builder builder) {
        int length = this.f17841.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f17843.contains(this.f17841[i].toString());
        }
        builder.setMultiChoiceItems(this.f17840, zArr, new DialogInterfaceOnMultiChoiceClickListenerC21615(this));
    }
}
