package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J97P */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC7051 extends AbstractC3947 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗ */
    public boolean f18360;

    /* JADX INFO: renamed from: ۛ */
    public long f18361;

    /* JADX INFO: renamed from: ۤ */
    public int f18362;

    /* JADX INFO: renamed from: ۫ */
    public int f18363;

    /* JADX INFO: renamed from: ۬ */
    public C5710 f18364;

    public DialogInterfaceOnDismissListenerC7051() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f18361 = 0L;
        this.f18363 = 0;
        this.f18362 = 0;
        this.f18360 = false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("trash");
        final List listM9957 = c4697.m9957();
        this.f18364 = new C5710(c4697.m9969());
        if (listM9957.size() == 1) {
            final InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            if (interfaceC19370.isDirectory()) {
                this.f18364.m12705(this);
                this.f18364.m12708(interfaceC19370);
                C4081.f8987.execute(new Runnable() { // from class: l.֨᩸᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC7051.m16241(this.f7808, interfaceC19370);
                    }
                });
                return;
            }
            this.f18364.m12707(interfaceC19370);
            return;
        }
        this.f18364.m12705(this);
        this.f18364.m12706(c4697.m9973(), listM9957);
        C4081.f8987.execute(new Runnable() { // from class: l.۠᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7051.m16240(this.f28777, listM9957);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16241(final DialogInterfaceOnDismissListenerC7051 dialogInterfaceOnDismissListenerC7051, InterfaceC19370 interfaceC19370) {
        dialogInterfaceOnDismissListenerC7051.m16238(Collections.singleton(interfaceC19370.mo26445()));
        C7050.m16212(new Runnable() { // from class: l.ܶ᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7051.m16239(this.f50534);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16239(DialogInterfaceOnDismissListenerC7051 dialogInterfaceOnDismissListenerC7051) {
        dialogInterfaceOnDismissListenerC7051.f18364.m12704(dialogInterfaceOnDismissListenerC7051.f18363, dialogInterfaceOnDismissListenerC7051.f18362, dialogInterfaceOnDismissListenerC7051.f18361);
        dialogInterfaceOnDismissListenerC7051.f18364.m12703();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16240(final DialogInterfaceOnDismissListenerC7051 dialogInterfaceOnDismissListenerC7051, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory()) {
                dialogInterfaceOnDismissListenerC7051.f18362++;
                if (!interfaceC19370.mo39144()) {
                    arrayList.add(interfaceC19370.mo26445());
                }
            } else {
                dialogInterfaceOnDismissListenerC7051.f18363++;
                if (!interfaceC19370.mo39144()) {
                    dialogInterfaceOnDismissListenerC7051.f18361 = interfaceC19370.getSize() + dialogInterfaceOnDismissListenerC7051.f18361;
                }
            }
        }
        C7050.m16212(new Runnable() { // from class: l.᩸᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7051 dialogInterfaceOnDismissListenerC7052 = this.f72735;
                dialogInterfaceOnDismissListenerC7052.f18364.m12704(dialogInterfaceOnDismissListenerC7052.f18363, dialogInterfaceOnDismissListenerC7052.f18362, dialogInterfaceOnDismissListenerC7052.f18361);
            }
        });
        dialogInterfaceOnDismissListenerC7051.m16238(arrayList);
        C7050.m16212(new Runnable() { // from class: l.᩹᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7051.m16242(this.f75687);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m16242(DialogInterfaceOnDismissListenerC7051 dialogInterfaceOnDismissListenerC7051) {
        dialogInterfaceOnDismissListenerC7051.f18364.m12704(dialogInterfaceOnDismissListenerC7051.f18363, dialogInterfaceOnDismissListenerC7051.f18362, dialogInterfaceOnDismissListenerC7051.f18361);
        dialogInterfaceOnDismissListenerC7051.f18364.m12703();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16238(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f18360) {
            for (AbstractC17043 abstractC17043 : ((AbstractC17043) linkedList.removeFirst()).mo25500(true)) {
                if (abstractC17043.mo25087()) {
                    this.f18362++;
                    if (!abstractC17043.m38691()) {
                        linkedList.addLast(abstractC17043);
                    }
                } else {
                    this.f18363++;
                    if (!abstractC17043.m38691()) {
                        this.f18361 = abstractC17043.mo25101() + this.f18361;
                    }
                }
            }
            C7050.m16212(new Runnable() { // from class: l.᩶᩸᩻
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC7051 dialogInterfaceOnDismissListenerC7051 = this.f68621;
                    dialogInterfaceOnDismissListenerC7051.f18364.m12704(dialogInterfaceOnDismissListenerC7051.f18363, dialogInterfaceOnDismissListenerC7051.f18362, dialogInterfaceOnDismissListenerC7051.f18361);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f18360 = true;
    }
}
