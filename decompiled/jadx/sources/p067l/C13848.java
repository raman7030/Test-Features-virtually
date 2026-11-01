package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۫֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13848 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f39127;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14518 f39128;

    /* JADX INFO: renamed from: ܽ */
    public boolean f39129;

    /* JADX INFO: renamed from: ᩳ */
    public BooleanSupplier f39130;

    public C13848(AbstractActivityC5549 abstractActivityC5549, InterfaceC14518 interfaceC14518) {
        this.f39130 = new C2823();
        this.f39127 = abstractActivityC5549;
        this.f39128 = interfaceC14518;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13848(Main main, C19561 c19561) {
        this(main, new C8618(c19561));
        C12826.requireNonNull(c19561);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31525(BooleanSupplier booleanSupplier) {
        this.f39130 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31526() {
        C12799.m29348();
        if (this.f39130.getAsBoolean()) {
            this.f39129 = true;
            return false;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f39127;
        if (abstractActivityC5549 != null) {
            if (abstractActivityC5549.isFinishing() || this.f39127.isDestroyed()) {
                return false;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicReference atomicReference = new AtomicReference();
            this.f39127.runOnUiThread(new Runnable() { // from class: l.ۚ֨ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C13848.m31521(this.f18649, atomicBoolean, atomicReference);
                }
            });
            try {
                synchronized (this) {
                    while (true) {
                        wait(200L);
                        if (atomicBoolean.get()) {
                            break;
                        }
                        if (this.f39130.getAsBoolean() || this.f39127.isFinishing() || this.f39127.isDestroyed()) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                break;
                            }
                            this.f39129 = true;
                            AbstractViewOnClickListenerC13513 abstractViewOnClickListenerC13513 = (AbstractViewOnClickListenerC13513) atomicReference.getAndSet(null);
                            if (abstractViewOnClickListenerC13513 == null) {
                                break;
                            }
                            this.f39127.runOnUiThread(new RunnableC22041(4, abstractViewOnClickListenerC13513));
                            break;
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        } else {
            this.f39129 = !new C21225(this).m23820(this.f39130);
        }
        return !this.f39129;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31521(C13848 c13848, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        if (c13848.f39130.getAsBoolean()) {
            synchronized (c13848) {
                c13848.f39129 = true;
                atomicBoolean.compareAndSet(false, true);
                c13848.notify();
            }
            return;
        }
        C22566 c22566 = new C22566(c13848, c13848.f39127, atomicBoolean);
        c22566.m30669(null);
        atomicReference.set(c22566);
        if (!atomicBoolean.get() && !c13848.f39130.getAsBoolean()) {
            c22566.m30670();
            return;
        }
        while (!atomicReference.compareAndSet(c22566, null) && atomicReference.get() == c22566) {
        }
        synchronized (c13848) {
            c13848.f39129 = true;
            atomicBoolean.compareAndSet(false, true);
            c13848.notify();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence[], java.lang.Cloneable] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m31527(List list) {
        int i;
        DialogInterfaceC2564 dialogInterfaceC2564;
        C12799.m29348();
        if (list.isEmpty()) {
            return m31526();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C12826.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C21562.unmodifiableList(arrayList);
        ?? r4 = new CharSequence[listUnmodifiableList.size() + 1];
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            r4[i2] = ((C14259) listUnmodifiableList.get(i2)).m32768();
        }
        r4[listUnmodifiableList.size()] = C7050.m16230(R.string.MT_Protector);
        AbstractActivityC5549 abstractActivityC5549 = this.f39127;
        if (abstractActivityC5549 == null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            if (new C5131(r4, atomicInteger).m23820(this.f39130)) {
                i = atomicInteger.get();
            } else {
                i = -1;
            }
        } else if (abstractActivityC5549.isFinishing() || this.f39127.isDestroyed() || this.f39130.getAsBoolean()) {
            i = -1;
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicInteger atomicInteger2 = new AtomicInteger(-1);
            AtomicReference atomicReference = new AtomicReference();
            this.f39127.runOnUiThread(new RunnableC3118(this, atomicBoolean, r4, atomicInteger2, atomicReference, 0));
            try {
                synchronized (this) {
                    while (!atomicBoolean.get()) {
                        wait(200L);
                        if (this.f39130.getAsBoolean() || this.f39127.isFinishing() || this.f39127.isDestroyed()) {
                            if (atomicBoolean.compareAndSet(false, true) && (dialogInterfaceC2564 = (DialogInterfaceC2564) atomicReference.getAndSet(null)) != null) {
                                this.f39127.runOnUiThread(new RunnableC22099(3, dialogInterfaceC2564));
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
            this.f39129 = true;
            return false;
        }
        if (i == listUnmodifiableList.size()) {
            return m31526();
        }
        this.f39128.mo17414(((C14259) listUnmodifiableList.get(i)).f40605);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31522(final C13848 c13848, final AtomicBoolean atomicBoolean, CharSequence[] charSequenceArr, final AtomicInteger atomicInteger, AtomicReference atomicReference) {
        if (atomicBoolean.get() || c13848.f39130.getAsBoolean() || c13848.f39127.isFinishing() || c13848.f39127.isDestroyed()) {
            synchronized (c13848) {
                atomicBoolean.set(true);
                c13848.notify();
            }
            return;
        }
        C20671 c20671BuildDialog = c13848.f39127.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(charSequenceArr, -1, new DialogInterfaceOnClickListenerC11487(1, atomicInteger));
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9824(c13848, atomicBoolean, atomicInteger, 0));
        c20671BuildDialog.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        atomicReference.set(dialogInterfaceC2564M46732);
        if (!atomicBoolean.get() && !c13848.f39130.getAsBoolean() && !c13848.f39127.isFinishing() && !c13848.f39127.isDestroyed()) {
            dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ֨ܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C13848 c13849 = this.f48572;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                    c13849.getClass();
                    if (atomicInteger2.get() < 0) {
                        return;
                    }
                    synchronized (c13849) {
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            dialogInterfaceC2564.dismiss();
                            c13849.notify();
                        }
                    }
                }
            });
            return;
        }
        while (!atomicReference.compareAndSet(dialogInterfaceC2564M46732, null) && atomicReference.get() == dialogInterfaceC2564M46732) {
        }
        dialogInterfaceC2564M46732.dismiss();
        synchronized (c13848) {
            atomicBoolean.set(true);
            c13848.notify();
        }
    }
}
