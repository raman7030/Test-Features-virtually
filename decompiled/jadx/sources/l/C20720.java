package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩷ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20720 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f66716;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f66723;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f66726;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f66727;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66717 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66725 = new AtomicInteger();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66722 = new AtomicInteger();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f66721 = new AtomicInteger();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f66724 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66720 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f66719 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f66718 = true;

    public C20720(AbstractC3163 abstractC3163, InterfaceC17066 interfaceC17066) {
        this.f66727 = abstractC3163;
        this.f66716 = interfaceC17066;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47322() {
        this.f66726 = this.f66718;
        this.f66723 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47324(boolean z) {
        this.f66719 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47326(boolean z) {
        this.f66718 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47325(String[] strArr, C18912 c18912) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            InterfaceC17889 interfaceC17889Mo7638 = this.f66727.mo7638(str);
            if (interfaceC17889Mo7638 != null) {
                arrayList.add(interfaceC17889Mo7638);
            }
        }
        m47323(arrayList, c18912);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47323(List list, InterfaceC23541 interfaceC23541) {
        this.f66720 = true;
        RunnableC14368 runnableC14368 = new RunnableC14368(0, this, interfaceC23541);
        int iM9704 = this.f66727.m9704();
        ArrayList arrayList = new ArrayList(iM9704);
        for (int i = 0; i < iM9704; i++) {
            arrayList.add(C1802.f6209.submit(runnableC14368));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m47319((InterfaceC17889) it.next(), "");
                if (this.f66716.mo1526()) {
                    this.f66720 = false;
                    return;
                }
            }
            if (this.f66726) {
                C2727 c2727 = new C2727();
                for (C6608 c6608 : this.f66723) {
                    ((List) C13843.computeIfAbsent(c2727, Integer.valueOf(C9679.m24605(c6608.f20344, '/')), new C10420(3))).add(c6608);
                }
                ArrayList arrayList2 = new ArrayList(c2727.keySet());
                Collections.sort(arrayList2);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    while (true) {
                        if (this.f66724.isEmpty() && this.f66722.get() == this.f66721.get()) {
                            break;
                        }
                        if (this.f66716.mo1526()) {
                            this.f66720 = false;
                            return;
                        }
                        Thread.sleep(10L);
                    }
                    Iterator it2 = ((List) c2727.getOrDefault(arrayList2.get(size), null)).iterator();
                    while (it2.hasNext()) {
                        this.f66724.put((C6608) it2.next());
                    }
                }
            }
            this.f66720 = false;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    ((Future) it3.next()).get();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            this.f66720 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47320(C20720 c20720, InterfaceC23541 interfaceC23541) {
        AtomicInteger atomicInteger = c20720.f66721;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C6608 c6608M47321 = c20720.m47321();
                if (c6608M47321 == null) {
                    break;
                } else {
                    interfaceC23541.mo14971(c6608M47321, c20720.f66725.incrementAndGet(), c20720.f66717.get());
                }
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
        if (c20720.f66716.mo1526()) {
            c20720.f66724.clear();
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C6608 m47321() {
        this.f66722.incrementAndGet();
        while (!this.f66716.mo1526()) {
            try {
                try {
                    C6608 c6608 = (C6608) this.f66724.poll(200L, TimeUnit.MILLISECONDS);
                    if (c6608 == null) {
                        if (!this.f66720) {
                            break;
                        }
                    } else {
                        this.f66722.decrementAndGet();
                        return c6608;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f66722.decrementAndGet();
                throw th;
            }
        }
        this.f66722.decrementAndGet();
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47319(InterfaceC17889 interfaceC17889, String str) throws InterruptedException {
        InterfaceC17066 interfaceC17066 = this.f66716;
        if (interfaceC17066.mo1526()) {
            return;
        }
        String name = interfaceC17889.getName();
        String path = interfaceC17889.getPath();
        if (!str.isEmpty()) {
            name = C22870.m50967(str, "/", name);
        }
        boolean zIsDirectory = interfaceC17889.isDirectory();
        LinkedBlockingQueue linkedBlockingQueue = this.f66724;
        AtomicInteger atomicInteger = this.f66717;
        if (!zIsDirectory) {
            if (this.f66719 || str.isEmpty()) {
                atomicInteger.incrementAndGet();
                linkedBlockingQueue.put(new C6608(path, name, true));
                return;
            }
            return;
        }
        if ((this.f66719 || this.f66718) && !interfaceC17889.mo36978()) {
            Iterator it = this.f66727.mo7637(path, true).iterator();
            while (it.hasNext()) {
                m47319((InterfaceC17889) it.next(), name);
            }
            if (interfaceC17066.mo1526()) {
                return;
            }
        }
        if (this.f66718 || str.isEmpty()) {
            atomicInteger.incrementAndGet();
            if (this.f66726) {
                this.f66723.add(new C6608(path, name, false));
            } else {
                linkedBlockingQueue.put(new C6608(path, name, false));
            }
        }
    }
}
