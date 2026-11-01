package p067l;

import bin.p000mt.plus.Features;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
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
public class C15128 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۠֫ */
    public static final /* synthetic */ int f43179 = 0;

    /* JADX INFO: renamed from: ܺ֫ */
    public volatile boolean f43185;

    /* JADX INFO: renamed from: ۚ֫ */
    public AtomicInteger f43184 = new AtomicInteger();

    /* JADX INFO: renamed from: ۘ֫ */
    public AtomicInteger f43183 = new AtomicInteger();

    /* JADX INFO: renamed from: ֨֫ */
    public AtomicInteger f43181 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩵֫ */
    public AtomicInteger f43187 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩴ֫ */
    public LinkedBlockingQueue f43186 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۖ֫ */
    public ArrayList f43182 = new ArrayList();

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f43180 = false;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public C18736 mo5125() throws InterruptedException {
        String[] strArrM13494 = m13494("ARG_PATHS");
        boolean zM13488 = m13488("recycle");
        this.f43180 = m13488("speedMode");
        int i = 2;
        C19210.m43751((C3787[]) C23573.stream(strArrM13494).map(new C13335(i)).distinct().map(new C8466(i)).toArray(new C21835()));
        if (zM13488) {
            int length = strArrM13494.length;
            int i2 = 0;
            while (i2 < length) {
                if (mo3924()) {
                    return C18736.m42768();
                }
                AbstractC17043 abstractC17043M42109 = C18524.m42109(strArrM13494[i2], new String[0]);
                String strMo25505 = abstractC17043M42109.mo25505();
                mo13456(abstractC17043M42109.getName());
                i2++;
                m13477(i2, length);
                EnumC18126 enumC18126M41309 = EnumC18126.m41309(abstractC17043M42109.mo25087());
                if (!abstractC17043M42109.mo31068() || !abstractC17043M42109.mo31069(this)) {
                    if (!mo3924()) {
                        if (new C5741(abstractC17043M42109).m23820(new C17589())) {
                            if (abstractC17043M42109.mo25503()) {
                                enumC18126M41309.m41311(strMo25505);
                            }
                        } else {
                            cancel();
                            return C18736.m42768();
                        }
                    } else {
                        return C18736.m42768();
                    }
                } else {
                    enumC18126M41309.m41311(strMo25505);
                }
            }
        } else {
            final int iM13484 = m13484("minTotal");
            Runnable runnable = new Runnable() { // from class: l.ۙ᩺ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C15128.m34543(this.f18453, iM13484);
                }
            };
            this.f43185 = true;
            int iMin = Math.min(4, C19110.f57020);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                arrayList.add(C4081.f8988.submit(runnable));
            }
            for (String str : strArrM13494) {
                m34544(C18524.m42109(str, new String[0]), "");
                if (mo3924()) {
                    break;
                }
            }
            C0977 c0977 = new C0977();
            for (C23846 c23846 : this.f43182) {
                ((List) C15525.computeIfAbsent(c0977, Integer.valueOf(C11567.m26619(c23846.f75772, '/')), new C12272(3))).add(c23846);
            }
            ArrayList arrayList2 = new ArrayList(c0977.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f43186.isEmpty() || this.f43181.get() != this.f43187.get()) {
                        if (mo3924()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                Iterator it = ((List) c0977.getOrDefault(arrayList2.get(size), null)).iterator();
                while (it.hasNext()) {
                    this.f43186.put((C23846) it.next());
                }
            }
            this.f43185 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
        }
        return m13481();
    }

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
        m13472(m13488("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo13456("...");
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34543(C15128 c15128, int i) {
        AtomicInteger atomicInteger = c15128.f43187;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C23846 c23846M34545 = c15128.m34545();
                if (c23846M34545 != null) {
                    EnumC18126 enumC18126 = c23846M34545.f75771;
                    c15128.mo13456(c23846M34545.f75772);
                    c15128.m13477(c15128.f43183.incrementAndGet(), Math.max(c15128.f43184.get(), i));
                    AbstractC17043 abstractC17043 = c23846M34545.f75770;
                    if (c15128.f43180 && abstractC17043.mo38688()) {
                        if (Features.deleteFile(abstractC17043.mo25505())) {
                            enumC18126.m41311(abstractC17043.mo25505());
                        }
                    } else {
                        boolean zMo29990 = abstractC17043.mo29990();
                        if (!zMo29990) {
                            zMo29990 = abstractC17043.mo25094() ? abstractC17043.mo25503() : true;
                        }
                        if (zMo29990) {
                            enumC18126.m41311(abstractC17043.mo25505());
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

    /* JADX INFO: renamed from: ֫ */
    private void m34544(AbstractC17043 abstractC17043, String str) throws InterruptedException {
        String string;
        if (mo3924()) {
            return;
        }
        if (str.isEmpty()) {
            string = abstractC17043.getName();
        } else {
            StringBuilder sbM21133 = C9179.m21133(str, "/");
            sbM21133.append(abstractC17043.getName());
            string = sbM21133.toString();
        }
        boolean zMo25087 = abstractC17043.mo25087();
        LinkedBlockingQueue linkedBlockingQueue = this.f43186;
        AtomicInteger atomicInteger = this.f43184;
        if (!zMo25087 || abstractC17043.m38691()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C23846(abstractC17043, string, EnumC18126.EXACT));
            return;
        }
        if (abstractC17043.mo29994()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C23846(abstractC17043, string, EnumC18126.TREE));
            return;
        }
        if (this.f43180 && abstractC17043.mo38688()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C23846(abstractC17043, string, EnumC18126.TREE));
            return;
        }
        Iterator it = abstractC17043.mo25500(true).iterator();
        while (it.hasNext()) {
            m34544((AbstractC17043) it.next(), string);
        }
        if (mo3924()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f43182.add(new C23846(abstractC17043, string, EnumC18126.NONE));
    }

    /* JADX INFO: renamed from: ۫֫ */
    private C23846 m34545() {
        this.f43181.incrementAndGet();
        while (!mo3924()) {
            try {
                try {
                    C23846 c23846 = (C23846) this.f43186.poll(200L, TimeUnit.MILLISECONDS);
                    if (c23846 == null) {
                        if (!this.f43185) {
                            break;
                        }
                    } else {
                        this.f43181.decrementAndGet();
                        return c23846;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f43181.decrementAndGet();
                throw th;
            }
        }
        this.f43181.decrementAndGet();
        return null;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
        C10987.m25375();
    }
}
