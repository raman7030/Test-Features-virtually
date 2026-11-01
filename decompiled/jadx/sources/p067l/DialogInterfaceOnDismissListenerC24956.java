package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QAI5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC24956 extends AbstractC3947 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗ */
    public boolean f79683;

    /* JADX INFO: renamed from: ۛ */
    public long f79684;

    /* JADX INFO: renamed from: ۤ */
    public int f79685;

    /* JADX INFO: renamed from: ۨ */
    public AbstractC5375 f79686;

    /* JADX INFO: renamed from: ۫ */
    public int f79687;

    /* JADX INFO: renamed from: ۬ */
    public C3007 f79688;

    public DialogInterfaceOnDismissListenerC24956() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f79684 = 0L;
        this.f79687 = 0;
        this.f79685 = 0;
        this.f79683 = false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        c4697.m9955(C0168b.f616k);
        this.f79686 = (AbstractC5375) c4697.m9970().mo8217();
        final List listM9957 = c4697.m9957();
        this.f79688 = new C3007(c4697.m9969(), listM9957);
        if (listM9957.size() == 1) {
            final InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            if (interfaceC19370.isDirectory()) {
                this.f79688.m5074(this);
                this.f79688.m5078(interfaceC19370);
                C4081.f8987.execute(new Runnable() { // from class: l.ۧܳ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC24956.m54840(this.f36243, interfaceC19370);
                    }
                });
                return;
            }
            this.f79688.m5076(interfaceC19370);
            return;
        }
        this.f79688.m5074(this);
        this.f79688.m5075(c4697.m9973());
        C4081.f8987.execute(new Runnable() { // from class: l.ܽܳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC24956.m54839(this.f54504, listM9957);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54840(final DialogInterfaceOnDismissListenerC24956 dialogInterfaceOnDismissListenerC24956, InterfaceC19370 interfaceC19370) {
        dialogInterfaceOnDismissListenerC24956.m54837(interfaceC19370.getPath());
        C7050.m16212(new Runnable() { // from class: l.ᩳܳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC24956.m54841(this.f59610);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m54841(DialogInterfaceOnDismissListenerC24956 dialogInterfaceOnDismissListenerC24956) {
        dialogInterfaceOnDismissListenerC24956.f79688.m5073(dialogInterfaceOnDismissListenerC24956.f79687, dialogInterfaceOnDismissListenerC24956.f79685, dialogInterfaceOnDismissListenerC24956.f79684);
        dialogInterfaceOnDismissListenerC24956.f79688.m5072();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54839(final DialogInterfaceOnDismissListenerC24956 dialogInterfaceOnDismissListenerC24956, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            if (interfaceC19370.isDirectory()) {
                dialogInterfaceOnDismissListenerC24956.f79685++;
                if (!interfaceC19370.mo39144()) {
                    dialogInterfaceOnDismissListenerC24956.m54837(interfaceC19370.getPath());
                }
            } else {
                dialogInterfaceOnDismissListenerC24956.f79687++;
                if (!interfaceC19370.mo39144()) {
                    dialogInterfaceOnDismissListenerC24956.f79684 = interfaceC19370.getSize() + dialogInterfaceOnDismissListenerC24956.f79684;
                }
            }
        }
        C7050.m16212(new Runnable() { // from class: l.ܿܳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC24956.m54842(this.f56452);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m54842(DialogInterfaceOnDismissListenerC24956 dialogInterfaceOnDismissListenerC24956) {
        dialogInterfaceOnDismissListenerC24956.f79688.m5073(dialogInterfaceOnDismissListenerC24956.f79687, dialogInterfaceOnDismissListenerC24956.f79685, dialogInterfaceOnDismissListenerC24956.f79684);
        dialogInterfaceOnDismissListenerC24956.f79688.m5072();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54837(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty() && !this.f79683) {
            try {
                for (InterfaceC19370 interfaceC19370 : this.f79686.mo9708((String) linkedList.removeFirst(), true)) {
                    if (interfaceC19370.isDirectory()) {
                        this.f79685++;
                        if (!interfaceC19370.mo39144()) {
                            linkedList.addLast(interfaceC19370.getPath());
                        }
                    } else {
                        this.f79687++;
                        if (!interfaceC19370.mo39144()) {
                            this.f79684 = interfaceC19370.getSize() + this.f79684;
                        }
                    }
                }
                C7050.m16212(new Runnable() { // from class: l.ܳܳ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC24956 dialogInterfaceOnDismissListenerC24956 = this.f47789;
                        dialogInterfaceOnDismissListenerC24956.f79688.m5073(dialogInterfaceOnDismissListenerC24956.f79687, dialogInterfaceOnDismissListenerC24956.f79685, dialogInterfaceOnDismissListenerC24956.f79684);
                    }
                });
            } catch (IOException unused) {
                return;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f79683 = true;
    }
}
