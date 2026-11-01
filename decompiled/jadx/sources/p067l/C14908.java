package p067l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes4.dex */
public class C14908 extends AbstractDialogInterfaceOnClickListenerC16429 {

    /* JADX INFO: renamed from: ۛ */
    public CharSequence[] f42517;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence[] f42518;

    /* JADX INFO: renamed from: ܰ */
    public boolean f42519;

    /* JADX INFO: renamed from: ᩺ */
    public HashSet f42520 = new HashSet();

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429, p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f42520;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f42519 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f42517 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f42518 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        C23626 c23626 = (C23626) m37326();
        if (c23626.m52473() == null || c23626.m52474() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(c23626.m52471());
        this.f42519 = false;
        this.f42517 = c23626.m52473();
        this.f42518 = c23626.m52474();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429, p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f42520));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f42519);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f42517);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f42518);
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ֫ */
    public final void mo23821(C1779 c1779) {
        int length = this.f42518.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f42520.contains(this.f42518[i].toString());
        }
        c1779.setMultiChoiceItems(this.f42517, zArr, new DialogInterfaceOnMultiChoiceClickListenerC5521(this));
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ֫ */
    public final void mo23822(boolean z) {
        if (z && this.f42519) {
            C23626 c23626 = (C23626) m37326();
            HashSet hashSet = this.f42520;
            c23626.m9019((Serializable) hashSet);
            c23626.m52472(hashSet);
        }
        this.f42519 = false;
    }
}
