package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z26I */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC10176 extends AbstractC3947 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗ */
    public boolean f28219;

    /* JADX INFO: renamed from: ۛ */
    public long f28220;

    /* JADX INFO: renamed from: ۤ */
    public int f28221;

    /* JADX INFO: renamed from: ۫ */
    public int f28222;

    /* JADX INFO: renamed from: ۬ */
    public C4073 f28223;

    public DialogInterfaceOnDismissListenerC10176() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f28220 = 0L;
        this.f28222 = 0;
        this.f28221 = 0;
        this.f28219 = false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955("local");
        final List listM9957 = c4697.m9957();
        this.f28223 = new C4073(c4697.m9969(), listM9957);
        if (listM9957.size() == 1) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            if (interfaceC19370.isDirectory()) {
                this.f28223.m8174(this);
                this.f28223.m8177(interfaceC19370);
                C4081.f8987.execute(new RunnableC6153(0, this, interfaceC19370));
                return;
            }
            this.f28223.m8176(interfaceC19370);
            return;
        }
        this.f28223.m8174(this);
        this.f28223.m8175(c4697.m9973());
        C4081.f8987.execute(new Runnable() { // from class: l.ᩴܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC10176.m23721(this.f62555, listM9957);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23722(final DialogInterfaceOnDismissListenerC10176 dialogInterfaceOnDismissListenerC10176, InterfaceC19370 interfaceC19370) {
        dialogInterfaceOnDismissListenerC10176.m23719(Collections.singleton(interfaceC19370.mo26445()));
        C7050.m16212(new Runnable() { // from class: l.ۚܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC10176.m23724(this.f19591);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m23724(DialogInterfaceOnDismissListenerC10176 dialogInterfaceOnDismissListenerC10176) {
        dialogInterfaceOnDismissListenerC10176.f28223.m8173(dialogInterfaceOnDismissListenerC10176.f28222, dialogInterfaceOnDismissListenerC10176.f28221, dialogInterfaceOnDismissListenerC10176.f28220);
        dialogInterfaceOnDismissListenerC10176.f28223.m8172();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23721(final DialogInterfaceOnDismissListenerC10176 dialogInterfaceOnDismissListenerC10176, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory()) {
                dialogInterfaceOnDismissListenerC10176.f28221++;
                if (!interfaceC19370.mo39144()) {
                    arrayList.add(interfaceC19370.mo26445());
                }
            } else {
                dialogInterfaceOnDismissListenerC10176.f28222++;
                if (!interfaceC19370.mo39144()) {
                    dialogInterfaceOnDismissListenerC10176.f28220 = interfaceC19370.getSize() + dialogInterfaceOnDismissListenerC10176.f28220;
                }
            }
        }
        C7050.m16212(new Runnable() { // from class: l.᩵ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC10176 dialogInterfaceOnDismissListenerC10177 = this.f65655;
                dialogInterfaceOnDismissListenerC10177.f28223.m8173(dialogInterfaceOnDismissListenerC10177.f28222, dialogInterfaceOnDismissListenerC10177.f28221, dialogInterfaceOnDismissListenerC10177.f28220);
            }
        });
        dialogInterfaceOnDismissListenerC10176.m23719(arrayList);
        C7050.m16212(new Runnable() { // from class: l.֡ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC10176.m23725(this.f4787);
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m23725(DialogInterfaceOnDismissListenerC10176 dialogInterfaceOnDismissListenerC10176) {
        dialogInterfaceOnDismissListenerC10176.f28223.m8173(dialogInterfaceOnDismissListenerC10176.f28222, dialogInterfaceOnDismissListenerC10176.f28221, dialogInterfaceOnDismissListenerC10176.f28220);
        dialogInterfaceOnDismissListenerC10176.f28223.m8172();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23719(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f28219) {
            for (AbstractC17043 abstractC17043 : ((AbstractC17043) linkedList.removeFirst()).mo25500(true)) {
                if (abstractC17043.mo25087()) {
                    this.f28221++;
                    if (!abstractC17043.m38691()) {
                        linkedList.addLast(abstractC17043);
                    }
                } else {
                    this.f28222++;
                    if (!abstractC17043.m38691()) {
                        this.f28220 = abstractC17043.mo25101() + this.f28220;
                    }
                }
            }
            C7050.m16212(new Runnable() { // from class: l.֨ܰܳ
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC10176 dialogInterfaceOnDismissListenerC10176 = this.f6962;
                    dialogInterfaceOnDismissListenerC10176.f28223.m8173(dialogInterfaceOnDismissListenerC10176.f28222, dialogInterfaceOnDismissListenerC10176.f28221, dialogInterfaceOnDismissListenerC10176.f28220);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f28219 = true;
    }
}
