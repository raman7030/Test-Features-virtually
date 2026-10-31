package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J97P */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC4926 extends AbstractC1661 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f15528;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f15529;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f15530;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f15531;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3515 f15532;

    public DialogInterfaceOnDismissListenerC4926() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f15529 = 0L;
        this.f15531 = 0;
        this.f15530 = 0;
        this.f15528 = false;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("trash");
        final List listM7909 = c2450.m7909();
        this.f15532 = new C3515(c2450.m7921());
        if (listM7909.size() == 1) {
            final InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(0);
            if (interfaceC17889.isDirectory()) {
                this.f15532.m10709(this);
                this.f15532.m10712(interfaceC17889);
                C1802.f6208.execute(new Runnable() { // from class: l.֨᩸᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC4926.m14344(this.f5037, interfaceC17889);
                    }
                });
                return;
            }
            this.f15532.m10711(interfaceC17889);
            return;
        }
        this.f15532.m10709(this);
        this.f15532.m10710(c2450.m7925(), listM7909);
        C1802.f6208.execute(new Runnable() { // from class: l.۠᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC4926.m14343(this.f25864, listM7909);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14344(final DialogInterfaceOnDismissListenerC4926 dialogInterfaceOnDismissListenerC4926, InterfaceC17889 interfaceC17889) {
        dialogInterfaceOnDismissListenerC4926.m14341(Collections.singleton(interfaceC17889.mo24433()));
        C4925.m14315(new Runnable() { // from class: l.ܶ᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC4926.m14342(this.f47402);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14342(DialogInterfaceOnDismissListenerC4926 dialogInterfaceOnDismissListenerC4926) {
        dialogInterfaceOnDismissListenerC4926.f15532.m10708(dialogInterfaceOnDismissListenerC4926.f15531, dialogInterfaceOnDismissListenerC4926.f15530, dialogInterfaceOnDismissListenerC4926.f15529);
        dialogInterfaceOnDismissListenerC4926.f15532.m10707();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14343(final DialogInterfaceOnDismissListenerC4926 dialogInterfaceOnDismissListenerC4926, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory()) {
                dialogInterfaceOnDismissListenerC4926.f15530++;
                if (!interfaceC17889.mo36978()) {
                    arrayList.add(interfaceC17889.mo24433());
                }
            } else {
                dialogInterfaceOnDismissListenerC4926.f15531++;
                if (!interfaceC17889.mo36978()) {
                    dialogInterfaceOnDismissListenerC4926.f15529 = interfaceC17889.getSize() + dialogInterfaceOnDismissListenerC4926.f15529;
                }
            }
        }
        C4925.m14315(new Runnable() { // from class: l.᩸᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC4926 dialogInterfaceOnDismissListenerC4927 = this.f70025;
                dialogInterfaceOnDismissListenerC4927.f15532.m10708(dialogInterfaceOnDismissListenerC4927.f15531, dialogInterfaceOnDismissListenerC4927.f15530, dialogInterfaceOnDismissListenerC4927.f15529);
            }
        });
        dialogInterfaceOnDismissListenerC4926.m14341(arrayList);
        C4925.m14315(new Runnable() { // from class: l.᩹᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC4926.m14345(this.f72960);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14345(DialogInterfaceOnDismissListenerC4926 dialogInterfaceOnDismissListenerC4926) {
        dialogInterfaceOnDismissListenerC4926.f15532.m10708(dialogInterfaceOnDismissListenerC4926.f15531, dialogInterfaceOnDismissListenerC4926.f15530, dialogInterfaceOnDismissListenerC4926.f15529);
        dialogInterfaceOnDismissListenerC4926.f15532.m10707();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14341(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f15528) {
            for (AbstractC15440 abstractC15440 : ((AbstractC15440) linkedList.removeFirst()).mo23549(true)) {
                if (abstractC15440.mo23113()) {
                    this.f15530++;
                    if (!abstractC15440.m36533()) {
                        linkedList.addLast(abstractC15440);
                    }
                } else {
                    this.f15531++;
                    if (!abstractC15440.m36533()) {
                        this.f15529 = abstractC15440.mo23127() + this.f15529;
                    }
                }
            }
            C4925.m14315(new Runnable() { // from class: l.᩶᩸᩻
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC4926 dialogInterfaceOnDismissListenerC4926 = this.f65945;
                    dialogInterfaceOnDismissListenerC4926.f15532.m10708(dialogInterfaceOnDismissListenerC4926.f15531, dialogInterfaceOnDismissListenerC4926.f15530, dialogInterfaceOnDismissListenerC4926.f15529);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f15528 = true;
    }
}
