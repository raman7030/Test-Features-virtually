package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܺۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15899 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2495 f49139;

    public C15899(C2495 c2495) {
        this.f49139 = c2495;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f49139.f7946;
        View childAt = dialogInterfaceOnDismissListenerC5317.f16591.getChildAt(0);
        dialogInterfaceOnDismissListenerC5317.f16591.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC5317.f16591.addView(childAt);
        if (i < dialogInterfaceOnDismissListenerC5317.f16593.size()) {
            AbstractC1083 abstractC1083 = (AbstractC1083) dialogInterfaceOnDismissListenerC5317.f16593.get(i);
            String strM15247 = DialogInterfaceOnDismissListenerC5317.m15247(abstractC1083);
            if (strM15247 != null) {
                ApplicationC20075.f65008.edit().putString("auto_translation_record", strM15247).apply();
            }
            abstractC1083.mo3733(dialogInterfaceOnDismissListenerC5317.f16591);
            if (abstractC1083.mo3744()) {
                dialogInterfaceOnDismissListenerC5317.f16592.setVisibility(0);
                return;
            } else {
                dialogInterfaceOnDismissListenerC5317.f16592.setVisibility(8);
                return;
            }
        }
        dialogInterfaceOnDismissListenerC5317.f16592.setVisibility(0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f49139.f7946;
        View childAt = dialogInterfaceOnDismissListenerC5317.f16591.getChildAt(0);
        dialogInterfaceOnDismissListenerC5317.f16591.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC5317.f16591.addView(childAt);
    }
}
