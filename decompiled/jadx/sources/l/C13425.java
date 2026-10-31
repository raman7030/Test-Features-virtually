package l;

import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes4.dex */
public class C13425 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40110 = 0;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f40116;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40115 = new AtomicInteger();

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40114 = new AtomicInteger();

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40112 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40118 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public LinkedBlockingQueue f40117 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40113 = new ArrayList();

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f40111 = false;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public C17222 mo2780() throws InterruptedException {
        String[] strArrM11558 = m11558("ARG_PATHS");
        boolean zM11552 = m11552("recycle");
        this.f40111 = m11552("speedMode");
        int i = 2;
        C17721.m41505((C1493[]) C22311.stream(strArrM11558).map(new C11539(i)).distinct().map(new C6416(i)).toArray(new C20482()));
        if (zM11552) {
            int length = strArrM11558.length;
            int i2 = 0;
            while (i2 < length) {
                if (mo1526()) {
                    return C17222.m40521();
                }
                AbstractC15440 abstractC15440M39866 = C16999.m39866(strArrM11558[i2], new String[0]);
                String strMo23554 = abstractC15440M39866.mo23554();
                mo11520(abstractC15440M39866.getName());
                i2++;
                m11541(i2, length);
                EnumC16580 enumC16580M39083 = EnumC16580.m39083(abstractC15440M39866.mo23113());
                if (!abstractC15440M39866.mo29016() || !abstractC15440M39866.mo29017(this)) {
                    if (!mo1526()) {
                        if (new C3548(abstractC15440M39866).m21850(new C16015())) {
                            if (abstractC15440M39866.mo23552()) {
                                enumC16580M39083.m39085(strMo23554);
                            }
                        } else {
                            cancel();
                            return C17222.m40521();
                        }
                    } else {
                        return C17222.m40521();
                    }
                } else {
                    enumC16580M39083.m39085(strMo23554);
                }
            }
        } else {
            final int iM11548 = m11548("minTotal");
            Runnable runnable = new Runnable() { // from class: l.ۙ᩺ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C13425.m32441(this.f15619, iM11548);
                }
            };
            this.f40116 = true;
            int iMin = Math.min(4, C17615.f53826);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                arrayList.add(C1802.f6209.submit(runnable));
            }
            for (String str : strArrM11558) {
                m32442(C16999.m39866(str, new String[0]), "");
                if (mo1526()) {
                    break;
                }
            }
            C2727 c2727 = new C2727();
            for (C22598 c22598 : this.f40113) {
                ((List) C13843.computeIfAbsent(c2727, Integer.valueOf(C9679.m24605(c22598.f73045, '/')), new C10420(3))).add(c22598);
            }
            ArrayList arrayList2 = new ArrayList(c2727.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f40117.isEmpty() || this.f40112.get() != this.f40118.get()) {
                        if (mo1526()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                Iterator it = ((List) c2727.getOrDefault(arrayList2.get(size), null)).iterator();
                while (it.hasNext()) {
                    this.f40117.put((C22598) it.next());
                }
            }
            this.f40116 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
        }
        return m11545();
    }

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
        m11536(m11552("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo11520("...");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32441(C13425 c13425, int i) {
        AtomicInteger atomicInteger = c13425.f40118;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C22598 c22598M32443 = c13425.m32443();
                if (c22598M32443 != null) {
                    EnumC16580 enumC16580 = c22598M32443.f73044;
                    c13425.mo11520(c22598M32443.f73045);
                    c13425.m11541(c13425.f40114.incrementAndGet(), Math.max(c13425.f40115.get(), i));
                    AbstractC15440 abstractC15440 = c22598M32443.f73043;
                    if (c13425.f40111 && abstractC15440.mo36530()) {
                        if (Features.deleteFile(abstractC15440.mo23554())) {
                            enumC16580.m39085(abstractC15440.mo23554());
                        }
                    } else {
                        boolean zMo27929 = abstractC15440.mo27929();
                        if (!zMo27929) {
                            zMo27929 = abstractC15440.mo23120() ? abstractC15440.mo23552() : true;
                        }
                        if (zMo27929) {
                            enumC16580.m39085(abstractC15440.mo23554());
                        }
                    }
                } else {
                    atomicInteger.decrementAndGet();
                    return;
                }
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32442(AbstractC15440 abstractC15440, String str) throws InterruptedException {
        String string;
        if (mo1526()) {
            return;
        }
        if (str.isEmpty()) {
            string = abstractC15440.getName();
        } else {
            StringBuilder sbM19190 = C7166.m19190(str, "/");
            sbM19190.append(abstractC15440.getName());
            string = sbM19190.toString();
        }
        boolean zMo23113 = abstractC15440.mo23113();
        LinkedBlockingQueue linkedBlockingQueue = this.f40117;
        AtomicInteger atomicInteger = this.f40115;
        if (!zMo23113 || abstractC15440.m36533()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C22598(abstractC15440, string, EnumC16580.EXACT));
            return;
        }
        if (abstractC15440.mo27933()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C22598(abstractC15440, string, EnumC16580.TREE));
            return;
        }
        if (this.f40111 && abstractC15440.mo36530()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C22598(abstractC15440, string, EnumC16580.TREE));
            return;
        }
        Iterator it = abstractC15440.mo23549(true).iterator();
        while (it.hasNext()) {
            m32442((AbstractC15440) it.next(), string);
        }
        if (mo1526()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f40113.add(new C22598(abstractC15440, string, EnumC16580.NONE));
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    private C22598 m32443() {
        this.f40112.incrementAndGet();
        while (!mo1526()) {
            try {
                try {
                    C22598 c22598 = (C22598) this.f40117.poll(200L, TimeUnit.MILLISECONDS);
                    if (c22598 == null) {
                        if (!this.f40116) {
                            break;
                        }
                    } else {
                        this.f40112.decrementAndGet();
                        return c22598;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f40112.decrementAndGet();
                throw th;
            }
        }
        this.f40112.decrementAndGet();
        return null;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
        C9068.m23429();
    }
}
