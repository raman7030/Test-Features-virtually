package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes4.dex */
public class C13194 extends AbstractDialogInterfaceOnClickListenerC14794 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f39453;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f39454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39455;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HashSet f39456 = new HashSet();

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794, l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f39456;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f39455 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f39453 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f39454 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        C22367 c22367 = (C22367) m35179();
        if (c22367.m50133() == null || c22367.m50134() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c22367.m50131());
        this.f39455 = false;
        this.f39453 = c22367.m50133();
        this.f39454 = c22367.m50134();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794, l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f39456));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f39455);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f39453);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f39454);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ֫ */
    public final void mo21851(C18892 c18892) {
        int length = this.f39454.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f39456.contains(this.f39454[i].toString());
        }
        c18892.setMultiChoiceItems(this.f39453, zArr, new DialogInterfaceOnMultiChoiceClickListenerC3317(this));
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ֫ */
    public final void mo21852(boolean z) {
        if (z && this.f39455) {
            C22367 c22367 = (C22367) m35179();
            HashSet hashSet = this.f39456;
            c22367.m6893((Serializable) hashSet);
            c22367.m50132(hashSet);
        }
        this.f39455 = false;
    }
}
