package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܺۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17479 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C4740 f52279;

    public C17479(C4740 c4740) {
        this.f52279 = c4740;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f52279.f10733;
        View childAt = dialogInterfaceOnDismissListenerC7422.f19428.getChildAt(0);
        dialogInterfaceOnDismissListenerC7422.f19428.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC7422.f19428.addView(childAt);
        if (i < dialogInterfaceOnDismissListenerC7422.f19430.size()) {
            AbstractC3398 abstractC3398 = (AbstractC3398) dialogInterfaceOnDismissListenerC7422.f19430.get(i);
            String strM17153 = DialogInterfaceOnDismissListenerC7422.m17153(abstractC3398);
            if (strM17153 != null) {
                ApplicationC21448.f67649.edit().putString("auto_translation_record", strM17153).apply();
            }
            abstractC3398.mo6004(dialogInterfaceOnDismissListenerC7422.f19428);
            if (abstractC3398.mo6015()) {
                dialogInterfaceOnDismissListenerC7422.f19429.setVisibility(0);
                return;
            } else {
                dialogInterfaceOnDismissListenerC7422.f19429.setVisibility(8);
                return;
            }
        }
        dialogInterfaceOnDismissListenerC7422.f19429.setVisibility(0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f52279.f10733;
        View childAt = dialogInterfaceOnDismissListenerC7422.f19428.getChildAt(0);
        dialogInterfaceOnDismissListenerC7422.f19428.removeAllViewsInLayout();
        dialogInterfaceOnDismissListenerC7422.f19428.addView(childAt);
    }
}
