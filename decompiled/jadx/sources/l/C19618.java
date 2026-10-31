package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩵ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes5.dex */
public class C19618 extends AbstractC6138 {

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63334 = 0;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f63335 = new AtomicReference();

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f63336 = new AtomicReference(null);

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f63337 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f63338;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76971;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11531("deleteFrom"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ᩴܿ᩻] */
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        String[] strArrM11558 = m11558("ARG_PATHS");
        this.f63338 = (AbstractC3163) m11526();
        final int iM11548 = m11548("minTotal");
        C20720 c20720 = new C20720(this.f63338, new InterfaceC17066() { // from class: l.ۘܿ᩻
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                int i = C19618.f63334;
                C19618 c19618 = this.f13025;
                return c19618.mo1526() || c19618.f63335.get() != null;
            }
        });
        c20720.m47322();
        c20720.m47325(strArrM11558, (C18912) new InterfaceC23541() { // from class: l.ᩴܿ᩻
            @Override // l.InterfaceC23541
            /* JADX INFO: renamed from: ֫ */
            public final void mo14971(C6608 c6608, int i, int i2) {
                C19618 c19618 = this.f59592;
                int i3 = iM11548;
                int i4 = C19618.f63334;
                c19618.m11541(i, Math.max(i2, i3));
                Object obj = c19618.f63336.get();
                if (obj == null) {
                    c19618.mo11520(c6608.f20344);
                    c19618.f63337.incrementAndGet();
                    try {
                        try {
                            c19618.f63338.mo9701(c6608.f20343, !c6608.f20342);
                            c19618.f63337.decrementAndGet();
                            return;
                        } catch (Throwable th) {
                            c19618.f63337.decrementAndGet();
                            throw th;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof C10361)) {
                            AtomicReference atomicReference = c19618.f63335;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                            c19618.f63337.decrementAndGet();
                            return;
                        }
                        AtomicReference atomicReference2 = c19618.f63336;
                        Object obj2 = new Object();
                        while (!atomicReference2.compareAndSet(null, obj2) && atomicReference2.get() == null) {
                        }
                        obj = c19618.f63336.get();
                        SystemClock.sleep(1000L);
                        c19618.f63337.decrementAndGet();
                    }
                }
                synchronized (obj) {
                    while (c19618.f63337.get() != 0) {
                        SystemClock.sleep(100L);
                    }
                    c19618.mo11520(c6608.f20344);
                    try {
                        c19618.f63338.mo9701(c6608.f20343, !c6608.f20342);
                    } catch (Exception e2) {
                        if (e2 instanceof C10361) {
                            AtomicReference atomicReference3 = c19618.f63335;
                            Exception exc = (Exception) e2.getCause();
                            while (!atomicReference3.compareAndSet(null, exc) && atomicReference3.get() == null) {
                            }
                        } else {
                            AtomicReference atomicReference4 = c19618.f63335;
                            while (!atomicReference4.compareAndSet(null, e2) && atomicReference4.get() == null) {
                            }
                        }
                    }
                }
            }
        });
        if (mo1526()) {
            return C17222.m40521();
        }
        AtomicReference atomicReference = this.f63335;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39015();
            c16560.m39041();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36595(this.f63338.mo9688());
    }
}
