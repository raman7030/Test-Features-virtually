package p067l;

import bin.p000mt.plus.Features;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
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
public class C6241 extends AbstractC21614 {

    /* JADX INFO: renamed from: ܽۧ */
    public static final /* synthetic */ int f15751 = 0;

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f15755;

    /* JADX INFO: renamed from: ۬֫ */
    public volatile boolean f15760;

    /* JADX INFO: renamed from: ܰ֫ */
    public boolean f15761;

    /* JADX INFO: renamed from: ֫ۧ */
    public final AtomicInteger f15752 = new AtomicInteger();

    /* JADX INFO: renamed from: ۤ֫ */
    public final AtomicInteger f15756 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧۧ */
    public final AtomicInteger f15757 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩺֫ */
    public final AtomicInteger f15762 = new AtomicInteger();

    /* JADX INFO: renamed from: ۛ֫ */
    public final LinkedBlockingQueue f15754 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۫֫ */
    public final ArrayList f15759 = new ArrayList();

    /* JADX INFO: renamed from: ۨ֫ */
    public final LinkedHashSet f15758 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۗ֫ */
    public final LinkedHashSet f15753 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩳ */
    private synchronized void m14162(C18736 c18736) {
        if (this.f15755) {
            return;
        }
        this.f15755 = true;
        C10334 c10334M23948 = C10334.m23948();
        String strM13492 = m13492("remoteTaskId");
        ArrayList arrayListM14161 = m14161();
        ArrayList arrayListM14159 = m14159();
        List list = Collections.EMPTY_LIST;
        c10334M23948.m23955(strM13492, this, c18736, arrayListM14161, arrayListM14159, list, list);
    }

    /* JADX INFO: renamed from: ᩸ */
    private synchronized void m14163(String str) {
        String strM46051 = C20393.m46051(str);
        this.f15758.add(strM46051);
        this.f15753.add(C20393.m46047(strM46051));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
    }

    @Override // p067l.AbstractC21614
    /* JADX INFO: renamed from: ۫֫ */
    public final String mo14165() {
        return "";
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC5549 mo13485() {
        return null;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo13498() {
        return false;
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
        String strM13492 = m13492("remoteTaskId");
        C10334 c10334M23948 = C10334.m23948();
        c10334M23948.m23956(strM13492, this, (C20323) null);
        m13472(m13488("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo13456("...");
        c10334M23948.m23954(strM13492, this);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws InterruptedException {
        C18736 c18736M13481;
        if (m13488("recycle")) {
            String[] strArrM13494 = m13494("ARG_PATHS");
            C19210.m43751(m14160(strArrM13494));
            int i = 0;
            while (i < strArrM13494.length) {
                if (mo3924()) {
                    c18736M13481 = C18736.m42768();
                } else {
                    String strM46051 = C20393.m46051(strArrM13494[i]);
                    AbstractC17043 abstractC17043M42109 = C18524.m42109(strArrM13494[i], new String[0]);
                    String strMo25505 = abstractC17043M42109.mo25505();
                    mo13456(abstractC17043M42109.getName());
                    i++;
                    m13477(i, strArrM13494.length);
                    EnumC18126 enumC18126M41309 = EnumC18126.m41309(abstractC17043M42109.mo25087());
                    if (!C20393.m46048(abstractC17043M42109)) {
                        c18736M13481 = C18736.m42765(C7050.m16203(R.string.MT_Protector, abstractC17043M42109.getName()));
                    } else if (!abstractC17043M42109.mo31069(this)) {
                        c18736M13481 = mo3924() ? C18736.m42768() : C18736.m42765(C7050.m16203(R.string.MT_Protector, abstractC17043M42109.getName()));
                    } else {
                        m14163(strM46051);
                        enumC18126M41309.m41311(strMo25505);
                    }
                }
            }
            c18736M13481 = m13481();
        } else {
            String[] strArrM13495 = m13494("ARG_PATHS");
            this.f15761 = m13488("speedMode");
            final int iM13484 = m13484("minTotal");
            C19210.m43751(m14160(strArrM13495));
            Runnable runnable = new Runnable() { // from class: l.ܺܽ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C6241.m14157(this.f52698, iM13484);
                }
            };
            this.f15760 = true;
            int iMin = Math.min(4, C19110.f57020);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(C4081.f8988.submit(runnable));
            }
            for (String str : strArrM13495) {
                m14158(C18524.m42109(str, new String[0]), "");
                if (mo3924()) {
                    break;
                }
            }
            C0977 c0977 = new C0977();
            for (C4900 c4900 : this.f15759) {
                ((List) C15525.computeIfAbsent(c0977, Integer.valueOf(C11567.m26619(c4900.f11162, '/')), new C8678(1))).add(c4900);
            }
            ArrayList arrayList2 = new ArrayList(c0977.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f15754.isEmpty() || this.f15757.get() != this.f15762.get()) {
                        if (mo3924()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                List list = (List) c0977.getOrDefault(arrayList2.get(size), null);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f15754.put((C4900) it.next());
                    }
                }
            }
            this.f15760 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
            c18736M13481 = m13481();
        }
        m14162(c18736M13481);
        return c18736M13481;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m14157(C6241 c6241, int i) {
        AtomicInteger atomicInteger = c6241.f15762;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C4900 c4900M14164 = c6241.m14164();
                if (c4900M14164 != null) {
                    EnumC18126 enumC18126 = c4900M14164.f11161;
                    c6241.mo13456(c4900M14164.f11162);
                    c6241.m13477(c6241.f15756.incrementAndGet(), Math.max(c6241.f15752.get(), i));
                    AbstractC17043 abstractC17043 = c4900M14164.f11160;
                    String strM46051 = C20393.m46051(abstractC17043.mo25505());
                    if (c6241.f15761 && abstractC17043.mo38688()) {
                        boolean zDeleteFile = Features.deleteFile(abstractC17043.mo25505());
                        if (!abstractC17043.mo25094()) {
                            c6241.m14163(strM46051);
                        }
                        if (zDeleteFile) {
                            enumC18126.m41311(abstractC17043.mo25505());
                        }
                    } else {
                        if (!abstractC17043.mo29990() && abstractC17043.mo25094()) {
                            abstractC17043.mo25503();
                        }
                        if (!abstractC17043.mo25094()) {
                            c6241.m14163(strM46051);
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

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ܶ */
    public final void mo13482(String str) {
        super.mo13482(str);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo13456(CharSequence charSequence) {
        super.mo13456(charSequence);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final void mo13474(int i) {
        super.mo13474(i);
        C10334.m23948().m23954(m13492("remoteTaskId"), this);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
        C10987.m25375();
        m14162(c18736);
    }

    /* JADX INFO: renamed from: ۨ֫ */
    private ArrayList m14161() {
        LinkedHashSet<String> linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f15753);
        }
        for (String str : linkedHashSet) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            if (abstractC17043M42109.mo25094() && abstractC17043M42109.mo25087()) {
                linkedHashSet2.add(str);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    /* JADX INFO: renamed from: ۛ֫ */
    private ArrayList m14159() {
        LinkedHashSet linkedHashSet;
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f15758);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C3787[] m14160(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (String str : strArr) {
            linkedHashSet.add(C20393.m46047(C20393.m46051(str)));
        }
        C3787[] c3787Arr = new C3787[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c3787Arr[i] = C3787.m7403((String) it.next(), EnumC17868.MODIFY_DIRECTORY);
            i++;
        }
        return c3787Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14158(AbstractC17043 abstractC17043, String str) throws InterruptedException {
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
        LinkedBlockingQueue linkedBlockingQueue = this.f15754;
        AtomicInteger atomicInteger = this.f15752;
        if (!zMo25087 || abstractC17043.m38691()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C4900(abstractC17043, string, EnumC18126.EXACT));
            return;
        }
        if (abstractC17043.mo29994()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C4900(abstractC17043, string, EnumC18126.TREE));
            return;
        }
        if (this.f15761 && abstractC17043.mo38688()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C4900(abstractC17043, string, EnumC18126.TREE));
            return;
        }
        Iterator it = abstractC17043.mo25500(true).iterator();
        while (it.hasNext()) {
            m14158((AbstractC17043) it.next(), string);
        }
        if (mo3924()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f15759.add(new C4900(abstractC17043, string, EnumC18126.NONE));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final C18736 mo5458(Exception exc) {
        C18736 c18736M42764 = C18736.m42764(exc);
        m14162(c18736M42764);
        return c18736M42764;
    }

    /* JADX INFO: renamed from: ᩺֫ */
    private C4900 m14164() {
        this.f15757.incrementAndGet();
        while (!mo3924()) {
            try {
                try {
                    C4900 c4900 = (C4900) this.f15754.poll(200L, TimeUnit.MILLISECONDS);
                    if (c4900 == null) {
                        if (!this.f15760) {
                            break;
                        }
                    } else {
                        this.f15757.decrementAndGet();
                        return c4900;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f15757.decrementAndGet();
                throw th;
            }
        }
        this.f15757.decrementAndGet();
        return null;
    }
}
