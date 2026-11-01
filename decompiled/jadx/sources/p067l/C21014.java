package p067l;

import android.os.SystemClock;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩵ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes5.dex */
public class C21014 extends AbstractC8202 {

    /* JADX INFO: renamed from: ᩵֫ */
    public static final /* synthetic */ int f65955 = 0;

    /* JADX INFO: renamed from: ۖ֫ */
    public AtomicReference f65956 = new AtomicReference();

    /* JADX INFO: renamed from: ۘ֫ */
    public AtomicReference f65957 = new AtomicReference(null);

    /* JADX INFO: renamed from: ܺ֫ */
    public AtomicInteger f65958 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩴ֫ */
    public AbstractC5375 f65959;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79723;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13467("deleteFrom"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ᩴܿ᩻] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        String[] strArrM13494 = m13494("ARG_PATHS");
        this.f65959 = (AbstractC5375) m13462();
        final int iM13484 = m13484("minTotal");
        C22061 c22061 = new C22061(this.f65959, new InterfaceC18588() { // from class: l.ۘܿ᩻
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                int i = C21014.f65955;
                C21014 c21014 = this.f15839;
                return c21014.mo3924() || c21014.f65956.get() != null;
            }
        });
        c22061.m49649();
        c22061.m49652(strArrM13494, (C20343) new InterfaceC24742() { // from class: l.ᩴܿ᩻
            @Override // p067l.InterfaceC24742
            /* JADX INFO: renamed from: ֫ */
            public final void mo16881(C8649 c8649, int i, int i2) {
                C21014 c21014 = this.f62823;
                int i3 = iM13484;
                int i4 = C21014.f65955;
                c21014.m13477(i, Math.max(i2, i3));
                Object obj = c21014.f65957.get();
                if (obj == null) {
                    c21014.mo13456(c8649.f23221);
                    c21014.f65958.incrementAndGet();
                    try {
                        try {
                            c21014.f65959.mo11745(c8649.f23220, !c8649.f23219);
                            c21014.f65958.decrementAndGet();
                            return;
                        } catch (Throwable th) {
                            c21014.f65958.decrementAndGet();
                            throw th;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof C12216)) {
                            AtomicReference atomicReference = c21014.f65956;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                            c21014.f65958.decrementAndGet();
                            return;
                        }
                        AtomicReference atomicReference2 = c21014.f65957;
                        Object obj2 = new Object();
                        while (!atomicReference2.compareAndSet(null, obj2) && atomicReference2.get() == null) {
                        }
                        obj = c21014.f65957.get();
                        SystemClock.sleep(1000L);
                        c21014.f65958.decrementAndGet();
                    }
                }
                synchronized (obj) {
                    while (c21014.f65958.get() != 0) {
                        SystemClock.sleep(100L);
                    }
                    c21014.mo13456(c8649.f23221);
                    try {
                        c21014.f65959.mo11745(c8649.f23220, !c8649.f23219);
                    } catch (Exception e2) {
                        if (e2 instanceof C12216) {
                            AtomicReference atomicReference3 = c21014.f65956;
                            Exception exc = (Exception) e2.getCause();
                            while (!atomicReference3.compareAndSet(null, exc) && atomicReference3.get() == null) {
                            }
                        } else {
                            AtomicReference atomicReference4 = c21014.f65956;
                            while (!atomicReference4.compareAndSet(null, e2) && atomicReference4.get() == null) {
                            }
                        }
                    }
                }
            }
        });
        if (mo3924()) {
            return C18736.m42768();
        }
        AtomicReference atomicReference = this.f65956;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41241();
            c18107.m41267();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38755(this.f65959.mo11732());
    }
}
