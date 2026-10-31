package l;

import android.app.AlertDialog;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC4728 extends AbstractDialogFragmentC18323 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f15009;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f15010;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f15011;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HashSet f15012 = new HashSet();

    @Deprecated
    public DialogFragmentC4728() {
    }

    @Override // l.AbstractDialogFragmentC18323, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f15012;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.f15011 = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.f15009 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.f15010 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        C22367 c22367 = (C22367) m42702();
        if (c22367.m50133() == null || c22367.m50134() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c22367.m50131());
        this.f15011 = false;
        this.f15009 = c22367.m50133();
        this.f15010 = c22367.m50134();
    }

    @Override // l.AbstractDialogFragmentC18323, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f15012));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f15011);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f15009);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f15010);
    }

    @Override // l.AbstractDialogFragmentC18323
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13844(boolean z) {
        C22367 c22367 = (C22367) m42702();
        if (z && this.f15011) {
            HashSet hashSet = this.f15012;
            c22367.m6893((Serializable) hashSet);
            c22367.m50132(hashSet);
        }
        this.f15011 = false;
    }

    @Override // l.AbstractDialogFragmentC18323
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13843(AlertDialog.Builder builder) {
        int length = this.f15010.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f15012.contains(this.f15010[i].toString());
        }
        builder.setMultiChoiceItems(this.f15009, zArr, new DialogInterfaceOnMultiChoiceClickListenerC20251(this));
    }
}
