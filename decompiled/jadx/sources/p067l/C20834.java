package p067l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20834 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f65464 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC7422 f65465;

    public C20834(DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422) {
        this.f65465 = dialogInterfaceOnDismissListenerC7422;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f65465.f19433);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ArrayList arrayList = new ArrayList();
        if (C24414.m53850()) {
            for (C18249 c18249 : C14976.m34301()) {
                c18249.m41554(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it.next()).newInstance();
                        translationEngine.init(c18249.m41540());
                        this.f65464.add(new C2727(c18249, translationEngine));
                    } catch (Throwable th) {
                        c18249.m41526(th);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean zM53850 = C24414.m53850();
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f65465;
        if (!zM53850) {
            m47066();
            dialogInterfaceOnDismissListenerC7422.f19430.add(0, new C18821(dialogInterfaceOnDismissListenerC7422.f19433));
            return;
        }
        ArrayList<C2727> arrayList = this.f65464;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C2727 c2727 : arrayList) {
            arrayList2.add(new C8763(dialogInterfaceOnDismissListenerC7422.f19433, c2727.f4573, c2727.f4572));
        }
        m47066();
        dialogInterfaceOnDismissListenerC7422.f19430.addAll(0, arrayList2);
        dialogInterfaceOnDismissListenerC7422.f19426 = C14976.m34317();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        m47066();
        this.f65465.f19433.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۜ */
    private void m47066() {
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f65465;
        int size = dialogInterfaceOnDismissListenerC7422.f19430.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (dialogInterfaceOnDismissListenerC7422.f19430.get(size) instanceof C8763) {
                dialogInterfaceOnDismissListenerC7422.f19430.remove(size);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f65465;
        ((BaseAdapter) dialogInterfaceOnDismissListenerC7422.f19431.getAdapter()).notifyDataSetChanged();
        dialogInterfaceOnDismissListenerC7422.m17159();
        dialogInterfaceOnDismissListenerC7422.f19431.getOnItemSelectedListener().onItemSelected(null, null, dialogInterfaceOnDismissListenerC7422.f19431.getSelectedItemPosition(), 0L);
        m22249();
    }
}
