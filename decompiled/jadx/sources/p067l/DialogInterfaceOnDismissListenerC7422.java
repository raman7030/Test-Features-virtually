package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC7422 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۙ */
    public boolean f19427;

    /* JADX INFO: renamed from: ۛ */
    public final C12686 f19428;

    /* JADX INFO: renamed from: ۤ */
    public final CheckBox f19429;

    /* JADX INFO: renamed from: ۬ */
    public final Spinner f19431;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC14026 f19433;

    /* JADX INFO: renamed from: ᩹ */
    public DialogInterfaceC2564 f19434;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f19430 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public int f19426 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f19432 = true;

    public DialogInterfaceOnDismissListenerC7422(AbstractActivityC14026 abstractActivityC14026) {
        this.f19433 = abstractActivityC14026;
        View viewM12252 = abstractActivityC14026.m12252(R.layout.MT_Protector);
        this.f19431 = (Spinner) viewM12252.findViewById(R.id.spinner1);
        this.f19429 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f19428 = (C12686) viewM12252.findViewById(R.id.MT_Protector);
        new C4740(this, abstractActivityC14026, viewM12252).m22250();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m17159() {
        String string = ApplicationC21448.f67649.getString("auto_translation_record", null);
        Spinner spinner = this.f19431;
        if (string != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f19430;
                if (i >= arrayList.size()) {
                    break;
                }
                if (string.equals(m17153((AbstractC3398) arrayList.get(i)))) {
                    spinner.setSelection(i);
                    return;
                }
                i++;
            }
        }
        spinner.setSelection(0);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m17153(AbstractC3398 abstractC3398) {
        if (abstractC3398 instanceof C8763) {
            C8763 c8763 = (C8763) abstractC3398;
            return C20865.m47154("@|", c8763.m20273(), "|", c8763.m20272().getClass().getName());
        }
        if (abstractC3398 instanceof C12787) {
            return C21466.m48631("#|", ((C12787) abstractC3398).m29335().m48007());
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17165() {
        if (this.f19427) {
            new C6081(this).m22250();
        } else {
            m17158();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public void m17158() {
        if (!C24414.m53856()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = this.f19430;
        boolean zIsEmpty = arrayList.isEmpty();
        AbstractActivityC14026 abstractActivityC14026 = this.f19433;
        if (zIsEmpty) {
            C22682.m50793(R.string.MT_Protector);
            abstractActivityC14026.startActivity(new Intent(abstractActivityC14026, (Class<?>) ActivityC24364.class));
            return;
        }
        this.f19434.m3862();
        if (this.f19432) {
            this.f19432 = false;
            this.f19434.m3860().setOnClickListener(new ViewOnClickListenerC8346(1, this));
            this.f19434.m3861().setOnClickListener(new ViewOnClickListenerC19291(2, this));
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size) instanceof C12787) {
                arrayList.remove(size);
            }
        }
        Iterator it = C4069.m8151().iterator();
        while (it.hasNext()) {
            arrayList.add(new C12787(abstractActivityC14026, (C21249) it.next()));
        }
        ((BaseAdapter) this.f19431.getAdapter()).notifyDataSetChanged();
        m17159();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m17154(DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422) {
        AbstractC3398 abstractC3398 = (AbstractC3398) dialogInterfaceOnDismissListenerC7422.f19430.get(dialogInterfaceOnDismissListenerC7422.f19431.getSelectedItemPosition());
        if (abstractC3398.mo6012()) {
            dialogInterfaceOnDismissListenerC7422.f19434.dismiss();
            new C20163(dialogInterfaceOnDismissListenerC7422, abstractC3398, dialogInterfaceOnDismissListenerC7422.f19433.m31855()).m22250();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17147(DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422) {
        AbstractActivityC14026 abstractActivityC14026 = dialogInterfaceOnDismissListenerC7422.f19433;
        abstractActivityC14026.startActivity(new Intent(abstractActivityC14026, (Class<?>) ActivityC24364.class));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17163() {
        Iterator it = this.f19430.iterator();
        while (it.hasNext()) {
            ((AbstractC3398) it.next()).mo6016();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17164() {
        int i = this.f19426;
        if (i == -1 || i == C14976.m34317()) {
            return;
        }
        new C20834(this).m22250();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C8763.m20269();
    }
}
