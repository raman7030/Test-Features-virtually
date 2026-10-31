package l;

import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۘܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T7BL */
/* JADX INFO: loaded from: classes3.dex */
public class C4074 extends AbstractC20250 {

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12935 = 0;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f12939;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f12944;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f12945;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12936 = new AtomicInteger();

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12940 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12941 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12946 = new AtomicInteger();

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f12938 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f12943 = new ArrayList();

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12942 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f12937 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m12241(C17222 c17222) {
        if (this.f12939) {
            return;
        }
        this.f12939 = true;
        C8381 c8381M21977 = C8381.m21977();
        String strM11556 = m11556("remoteTaskId");
        ArrayList arrayListM12240 = m12240();
        ArrayList arrayListM12238 = m12238();
        List list = Collections.EMPTY_LIST;
        c8381M21977.m21984(strM11556, this, c17222, arrayListM12240, arrayListM12238, list, list);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m12242(String str) {
        String strM43784 = C18965.m43784(str);
        this.f12942.add(strM43784);
        this.f12937.add(C18965.m43780(strM43784));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
    }

    @Override // l.AbstractC20250
    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final String mo12244() {
        return "";
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC3346 mo11549() {
        return null;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo11562() {
        return false;
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
        String strM11556 = m11556("remoteTaskId");
        C8381 c8381M21977 = C8381.m21977();
        c8381M21977.m21985(strM11556, this, (C18891) null);
        m11536(m11552("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo11520("...");
        c8381M21977.m21983(strM11556, this);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws InterruptedException {
        C17222 c17222M11545;
        if (m11552("recycle")) {
            String[] strArrM11558 = m11558("ARG_PATHS");
            C17721.m41505(m12239(strArrM11558));
            int i = 0;
            while (i < strArrM11558.length) {
                if (mo1526()) {
                    c17222M11545 = C17222.m40521();
                } else {
                    String strM43784 = C18965.m43784(strArrM11558[i]);
                    AbstractC15440 abstractC15440M39866 = C16999.m39866(strArrM11558[i], new String[0]);
                    String strMo23554 = abstractC15440M39866.mo23554();
                    mo11520(abstractC15440M39866.getName());
                    i++;
                    m11541(i, strArrM11558.length);
                    EnumC16580 enumC16580M39083 = EnumC16580.m39083(abstractC15440M39866.mo23113());
                    if (!C18965.m43781(abstractC15440M39866)) {
                        c17222M11545 = C17222.m40518(C4925.m14306(R.string.MT_Protector, abstractC15440M39866.getName()));
                    } else if (!abstractC15440M39866.mo29017(this)) {
                        c17222M11545 = mo1526() ? C17222.m40521() : C17222.m40518(C4925.m14306(R.string.MT_Protector, abstractC15440M39866.getName()));
                    } else {
                        m12242(strM43784);
                        enumC16580M39083.m39085(strMo23554);
                    }
                }
            }
            c17222M11545 = m11545();
        } else {
            String[] strArrM11559 = m11558("ARG_PATHS");
            this.f12945 = m11552("speedMode");
            final int iM11548 = m11548("minTotal");
            C17721.m41505(m12239(strArrM11559));
            Runnable runnable = new Runnable() { // from class: l.ܺܽ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C4074.m12236(this.f49535, iM11548);
                }
            };
            this.f12944 = true;
            int iMin = Math.min(4, C17615.f53826);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(C1802.f6209.submit(runnable));
            }
            for (String str : strArrM11559) {
                m12237(C16999.m39866(str, new String[0]), "");
                if (mo1526()) {
                    break;
                }
            }
            C2727 c2727 = new C2727();
            for (C2663 c2663 : this.f12943) {
                ((List) C13843.computeIfAbsent(c2727, Integer.valueOf(C9679.m24605(c2663.f8367, '/')), new C6639(1))).add(c2663);
            }
            ArrayList arrayList2 = new ArrayList(c2727.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f12938.isEmpty() || this.f12941.get() != this.f12946.get()) {
                        if (mo1526()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                List list = (List) c2727.getOrDefault(arrayList2.get(size), null);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f12938.put((C2663) it.next());
                    }
                }
            }
            this.f12944 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
            c17222M11545 = m11545();
        }
        m12241(c17222M11545);
        return c17222M11545;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12236(C4074 c4074, int i) {
        AtomicInteger atomicInteger = c4074.f12946;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C2663 c2663M12243 = c4074.m12243();
                if (c2663M12243 != null) {
                    EnumC16580 enumC16580 = c2663M12243.f8366;
                    c4074.mo11520(c2663M12243.f8367);
                    c4074.m11541(c4074.f12940.incrementAndGet(), Math.max(c4074.f12936.get(), i));
                    AbstractC15440 abstractC15440 = c2663M12243.f8365;
                    String strM43784 = C18965.m43784(abstractC15440.mo23554());
                    if (c4074.f12945 && abstractC15440.mo36530()) {
                        boolean zDeleteFile = Features.deleteFile(abstractC15440.mo23554());
                        if (!abstractC15440.mo23120()) {
                            c4074.m12242(strM43784);
                        }
                        if (zDeleteFile) {
                            enumC16580.m39085(abstractC15440.mo23554());
                        }
                    } else {
                        if (!abstractC15440.mo27929() && abstractC15440.mo23120()) {
                            abstractC15440.mo23552();
                        }
                        if (!abstractC15440.mo23120()) {
                            c4074.m12242(strM43784);
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

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ܶ */
    public final void mo11546(String str) {
        super.mo11546(str);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo11520(CharSequence charSequence) {
        super.mo11520(charSequence);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final void mo11538(int i) {
        super.mo11538(i);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
        C9068.m23429();
        m12241(c17222);
    }

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m12240() {
        LinkedHashSet<String> linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f12937);
        }
        for (String str : linkedHashSet) {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
            if (abstractC15440M39866.mo23120() && abstractC15440M39866.mo23113()) {
                linkedHashSet2.add(str);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m12238() {
        LinkedHashSet linkedHashSet;
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f12942);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1493[] m12239(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (String str : strArr) {
            linkedHashSet.add(C18965.m43780(C18965.m43784(str)));
        }
        C1493[] c1493Arr = new C1493[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c1493Arr[i] = C1493.m5161((String) it.next(), EnumC16309.MODIFY_DIRECTORY);
            i++;
        }
        return c1493Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12237(AbstractC15440 abstractC15440, String str) throws InterruptedException {
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
        LinkedBlockingQueue linkedBlockingQueue = this.f12938;
        AtomicInteger atomicInteger = this.f12936;
        if (!zMo23113 || abstractC15440.m36533()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2663(abstractC15440, string, EnumC16580.EXACT));
            return;
        }
        if (abstractC15440.mo27933()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2663(abstractC15440, string, EnumC16580.TREE));
            return;
        }
        if (this.f12945 && abstractC15440.mo36530()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2663(abstractC15440, string, EnumC16580.TREE));
            return;
        }
        Iterator it = abstractC15440.mo23549(true).iterator();
        while (it.hasNext()) {
            m12237((AbstractC15440) it.next(), string);
        }
        if (mo1526()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f12943.add(new C2663(abstractC15440, string, EnumC16580.NONE));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        C17222 c17222M40517 = C17222.m40517(exc);
        m12241(c17222M40517);
        return c17222M40517;
    }

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    private C2663 m12243() {
        this.f12941.incrementAndGet();
        while (!mo1526()) {
            try {
                try {
                    C2663 c2663 = (C2663) this.f12938.poll(200L, TimeUnit.MILLISECONDS);
                    if (c2663 == null) {
                        if (!this.f12944) {
                            break;
                        }
                    } else {
                        this.f12941.decrementAndGet();
                        return c2663;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f12941.decrementAndGet();
                throw th;
            }
        }
        this.f12941.decrementAndGet();
        return null;
    }
}
