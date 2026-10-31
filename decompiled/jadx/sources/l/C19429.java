package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19429 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f62851 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC5317 f62852;

    public C19429(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317) {
        this.f62852 = dialogInterfaceOnDismissListenerC5317;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f62852.f16596);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ArrayList arrayList = new ArrayList();
        if (C23196.m51454()) {
            for (C16709 c16709 : C13265.m32202()) {
                c16709.m39318(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it.next()).newInstance();
                        translationEngine.init(c16709.m39304());
                        this.f62851.add(new C0377(c16709, translationEngine));
                    } catch (Throwable th) {
                        c16709.m39290(th);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean zM51454 = C23196.m51454();
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f62852;
        if (!zM51454) {
            m44772();
            dialogInterfaceOnDismissListenerC5317.f16593.add(0, new C17311(dialogInterfaceOnDismissListenerC5317.f16596));
            return;
        }
        ArrayList<C0377> arrayList = this.f62851;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C0377 c0377 : arrayList) {
            arrayList2.add(new C6728(dialogInterfaceOnDismissListenerC5317.f16596, c0377.f1794, c0377.f1793));
        }
        m44772();
        dialogInterfaceOnDismissListenerC5317.f16593.addAll(0, arrayList2);
        dialogInterfaceOnDismissListenerC5317.f16589 = C13265.m32218();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        m44772();
        this.f62852.f16596.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m44772() {
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f62852;
        int size = dialogInterfaceOnDismissListenerC5317.f16593.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (dialogInterfaceOnDismissListenerC5317.f16593.get(size) instanceof C6728) {
                dialogInterfaceOnDismissListenerC5317.f16593.remove(size);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f62852;
        ((BaseAdapter) dialogInterfaceOnDismissListenerC5317.f16594.getAdapter()).notifyDataSetChanged();
        dialogInterfaceOnDismissListenerC5317.m15253();
        dialogInterfaceOnDismissListenerC5317.f16594.getOnItemSelectedListener().onItemSelected(null, null, dialogInterfaceOnDismissListenerC5317.f16594.getSelectedItemPosition(), 0L);
        m20273();
    }
}
