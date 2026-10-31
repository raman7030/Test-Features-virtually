package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۫֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12079 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f36116;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12784 f36117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f36118;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BooleanSupplier f36119;

    public C12079(AbstractActivityC3346 abstractActivityC3346, InterfaceC12784 interfaceC12784) {
        this.f36119 = new C0478();
        this.f36116 = abstractActivityC3346;
        this.f36117 = interfaceC12784;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12079(Main main, C18090 c18090) {
        this(main, new C6576(c18090));
        C11003.requireNonNull(c18090);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29463(BooleanSupplier booleanSupplier) {
        this.f36119 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29464() {
        C10975.m27286();
        if (this.f36119.getAsBoolean()) {
            this.f36118 = true;
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f36116;
        if (abstractActivityC3346 != null) {
            if (abstractActivityC3346.isFinishing() || this.f36116.isDestroyed()) {
                return false;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicReference atomicReference = new AtomicReference();
            this.f36116.runOnUiThread(new Runnable() { // from class: l.ۚ֨ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12079.m29459(this.f15817, atomicBoolean, atomicReference);
                }
            });
            try {
                synchronized (this) {
                    while (true) {
                        wait(200L);
                        if (atomicBoolean.get()) {
                            break;
                        }
                        if (this.f36119.getAsBoolean() || this.f36116.isFinishing() || this.f36116.isDestroyed()) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                break;
                            }
                            this.f36118 = true;
                            AbstractViewOnClickListenerC11726 abstractViewOnClickListenerC11726 = (AbstractViewOnClickListenerC11726) atomicReference.getAndSet(null);
                            if (abstractViewOnClickListenerC11726 == null) {
                                break;
                            }
                            this.f36116.runOnUiThread(new RunnableC20699(4, abstractViewOnClickListenerC11726));
                            break;
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        } else {
            this.f36118 = !new C19841(this).m21850(this.f36119);
        }
        return !this.f36118;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29459(C12079 c12079, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        if (c12079.f36119.getAsBoolean()) {
            synchronized (c12079) {
                c12079.f36118 = true;
                atomicBoolean.compareAndSet(false, true);
                c12079.notify();
            }
            return;
        }
        C21252 c21252 = new C21252(c12079, c12079.f36116, atomicBoolean);
        c21252.m28621(null);
        atomicReference.set(c21252);
        if (!atomicBoolean.get() && !c12079.f36119.getAsBoolean()) {
            c21252.m28622();
            return;
        }
        while (!atomicReference.compareAndSet(c21252, null) && atomicReference.get() == c21252) {
        }
        synchronized (c12079) {
            c12079.f36118 = true;
            atomicBoolean.compareAndSet(false, true);
            c12079.notify();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence[], java.lang.Cloneable] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29465(List list) {
        int i;
        DialogInterfaceC0206 dialogInterfaceC0206;
        C10975.m27286();
        if (list.isEmpty()) {
            return m29464();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C20195.unmodifiableList(arrayList);
        ?? r4 = new CharSequence[listUnmodifiableList.size() + 1];
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            r4[i2] = ((C12511) listUnmodifiableList.get(i2)).m30693();
        }
        r4[listUnmodifiableList.size()] = C4925.m14333(R.string.MT_Protector);
        AbstractActivityC3346 abstractActivityC3346 = this.f36116;
        if (abstractActivityC3346 == null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            if (new C2907(r4, atomicInteger).m21850(this.f36119)) {
                i = atomicInteger.get();
            } else {
                i = -1;
            }
        } else if (abstractActivityC3346.isFinishing() || this.f36116.isDestroyed() || this.f36119.getAsBoolean()) {
            i = -1;
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicInteger atomicInteger2 = new AtomicInteger(-1);
            AtomicReference atomicReference = new AtomicReference();
            this.f36116.runOnUiThread(new RunnableC0789(this, atomicBoolean, r4, atomicInteger2, atomicReference, 0));
            try {
                synchronized (this) {
                    while (!atomicBoolean.get()) {
                        wait(200L);
                        if (this.f36119.getAsBoolean() || this.f36116.isFinishing() || this.f36116.isDestroyed()) {
                            if (atomicBoolean.compareAndSet(false, true) && (dialogInterfaceC0206 = (DialogInterfaceC0206) atomicReference.getAndSet(null)) != null) {
                                this.f36116.runOnUiThread(new RunnableC20760(3, dialogInterfaceC0206));
                            }
                        }
                    }
                }
                i = atomicInteger2.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = -1;
            }
        }
        if (i < 0) {
            this.f36118 = true;
            return false;
        }
        if (i == listUnmodifiableList.size()) {
            return m29464();
        }
        this.f36117.mo15503(((C12511) listUnmodifiableList.get(i)).f37581);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29460(final C12079 c12079, final AtomicBoolean atomicBoolean, CharSequence[] charSequenceArr, final AtomicInteger atomicInteger, AtomicReference atomicReference) {
        if (atomicBoolean.get() || c12079.f36119.getAsBoolean() || c12079.f36116.isFinishing() || c12079.f36116.isDestroyed()) {
            synchronized (c12079) {
                atomicBoolean.set(true);
                c12079.notify();
            }
            return;
        }
        C19258 c19258BuildDialog = c12079.f36116.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44429(charSequenceArr, -1, new DialogInterfaceOnClickListenerC9594(1, atomicInteger));
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7845(c12079, atomicBoolean, atomicInteger, 0));
        c19258BuildDialog.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        atomicReference.set(dialogInterfaceC0206M44438);
        if (!atomicBoolean.get() && !c12079.f36119.getAsBoolean() && !c12079.f36116.isFinishing() && !c12079.f36116.isDestroyed()) {
            dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ֨ܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C12079 c120710 = this.f45457;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                    c120710.getClass();
                    if (atomicInteger2.get() < 0) {
                        return;
                    }
                    synchronized (c120710) {
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            dialogInterfaceC0206.dismiss();
                            c120710.notify();
                        }
                    }
                }
            });
            return;
        }
        while (!atomicReference.compareAndSet(dialogInterfaceC0206M44438, null) && atomicReference.get() == dialogInterfaceC0206M44438) {
        }
        dialogInterfaceC0206M44438.dismiss();
        synchronized (c12079) {
            atomicBoolean.set(true);
            c12079.notify();
        }
    }
}
