package p067l;

import android.content.DialogInterface;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۠ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10214 {

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f28313 = 0;

    /* JADX INFO: renamed from: ֫ */
    public volatile AtomicBoolean f28315;

    /* JADX INFO: renamed from: ۧ */
    public volatile DialogInterfaceC2564 f28316;

    /* JADX INFO: renamed from: ܽ */
    public volatile EnumC3508 f28317 = EnumC3508.RETRY;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f28318;

    /* JADX INFO: renamed from: ᩻ */
    public static final ConcurrentLinkedQueue f28314 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ܳ */
    public static final C7350 f28312 = new C7350(new Object());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public synchronized void m23812(EnumC3508 enumC3508) {
        if (this.f28318) {
            this.f28317 = enumC3508;
            this.f28318 = false;
            this.f28315 = null;
            this.f28316 = null;
            notify();
        }
        f28312.mo4062(new Object());
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract View mo10912(Main main);

    /* JADX INFO: renamed from: ֫ */
    public void mo12797(DialogInterfaceC2564 dialogInterfaceC2564) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10913(C20671 c20671) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo10914(View view);

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m23820(BooleanSupplier booleanSupplier) {
        C12799.m29348();
        while (true) {
            if (C16723.m37945()) {
                if (booleanSupplier.getAsBoolean()) {
                    return false;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            } else {
                if (booleanSupplier.getAsBoolean()) {
                    return false;
                }
                f28314.offer(this);
                f28312.mo4062(new Object());
                while (true) {
                    if (!this.f28318 && this.f28317 != EnumC3508.RETRY) {
                        return this.f28317 == EnumC3508.SUCCESS;
                    }
                    if (booleanSupplier.getAsBoolean()) {
                        m23811();
                        return false;
                    }
                    try {
                        wait(100L);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m23818(final Main main) {
        f28312.m4066(main, new InterfaceC3326() { // from class: l.ۖܶۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                AbstractC10214.m23816(main);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23816(Main main) {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f28314;
            final AbstractC10214 abstractC10214 = (AbstractC10214) concurrentLinkedQueue.peek();
            if (abstractC10214 == null || abstractC10214.f28318) {
                return;
            }
            EnumC3508 enumC3508 = abstractC10214.f28317;
            EnumC3508 enumC3509 = EnumC3508.RETRY;
            if (enumC3508 == enumC3509) {
                synchronized (abstractC10214) {
                    if (abstractC10214.f28317 != enumC3509) {
                        return;
                    }
                    abstractC10214.f28318 = true;
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final View viewMo10912 = abstractC10214.mo10912(main);
                    if (viewMo10912 != null) {
                        viewMo10912.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7532(abstractC10214, atomicBoolean));
                    }
                    C20671 c20671BuildDialog = main.buildDialog();
                    c20671BuildDialog.m46722(false);
                    c20671BuildDialog.m46736(R.string.MT_Protector, null);
                    c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6191(0, abstractC10214, atomicBoolean));
                    c20671BuildDialog.m46713(new DialogInterfaceOnCancelListenerC20273(0, abstractC10214, atomicBoolean));
                    c20671BuildDialog.m46714(new DialogInterface.OnDismissListener() { // from class: l.᩵ܶۢ
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AbstractC10214.m23819(this.f65817, atomicBoolean);
                        }
                    });
                    if (viewMo10912 != null) {
                        c20671BuildDialog.m46715(viewMo10912);
                    }
                    abstractC10214.mo10913(c20671BuildDialog);
                    final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
                    abstractC10214.f28315 = atomicBoolean;
                    abstractC10214.f28316 = dialogInterfaceC2564M46732;
                    dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֡ܶۢ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractC10214.m23814(this.f4893, atomicBoolean, viewMo10912, dialogInterfaceC2564M46732);
                        }
                    });
                    abstractC10214.mo12797(dialogInterfaceC2564M46732);
                    return;
                }
            }
            concurrentLinkedQueue.remove();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23813(AbstractC10214 abstractC10214, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC10214.m23812(EnumC3508.CANCEL);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m23817(AbstractC10214 abstractC10214, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC10214.m23812(EnumC3508.CANCEL);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m23819(AbstractC10214 abstractC10214, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC10214.m23812(EnumC3508.RETRY);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23814(AbstractC10214 abstractC10214, AtomicBoolean atomicBoolean, View view, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (atomicBoolean.compareAndSet(true, false)) {
            if (abstractC10214.mo10914(view)) {
                abstractC10214.m23812(EnumC3508.SUCCESS);
                dialogInterfaceC2564.dismiss();
            } else {
                atomicBoolean.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23811() {
        AtomicBoolean atomicBoolean = this.f28315;
        if (atomicBoolean != null) {
            atomicBoolean.compareAndSet(true, false);
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f28316;
        this.f28315 = null;
        this.f28316 = null;
        this.f28317 = EnumC3508.CANCEL;
        this.f28318 = false;
        f28314.remove(this);
        notify();
        if (dialogInterfaceC2564 != null) {
            C7050.m16212(new RunnableC22099(3, dialogInterfaceC2564));
        }
        f28312.mo4062(new Object());
    }
}
