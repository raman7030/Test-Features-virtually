package p067l;

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
public final class C22061 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18588 f69397;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f69404;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f69407;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC5375 f69408;

    /* JADX INFO: renamed from: ۜ */
    public final AtomicInteger f69398 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f69406 = new AtomicInteger();

    /* JADX INFO: renamed from: ܺ */
    public final AtomicInteger f69403 = new AtomicInteger();

    /* JADX INFO: renamed from: ܳ */
    public final AtomicInteger f69402 = new AtomicInteger();

    /* JADX INFO: renamed from: ܿ */
    public final LinkedBlockingQueue f69405 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f69401 = true;

    /* JADX INFO: renamed from: ۢ */
    public boolean f69400 = true;

    /* JADX INFO: renamed from: ۡ */
    public boolean f69399 = true;

    public C22061(AbstractC5375 abstractC5375, InterfaceC18588 interfaceC18588) {
        this.f69408 = abstractC5375;
        this.f69397 = interfaceC18588;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49649() {
        this.f69407 = this.f69399;
        this.f69404 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49651(boolean z) {
        this.f69400 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49653(boolean z) {
        this.f69399 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49652(String[] strArr, C20343 c20343) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            InterfaceC19370 interfaceC19370Mo9709 = this.f69408.mo9709(str);
            if (interfaceC19370Mo9709 != null) {
                arrayList.add(interfaceC19370Mo9709);
            }
        }
        m49650(arrayList, c20343);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49650(List list, InterfaceC24742 interfaceC24742) {
        this.f69401 = true;
        RunnableC16024 runnableC16024 = new RunnableC16024(0, this, interfaceC24742);
        int iM11748 = this.f69408.m11748();
        ArrayList arrayList = new ArrayList(iM11748);
        for (int i = 0; i < iM11748; i++) {
            arrayList.add(C4081.f8988.submit(runnableC16024));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m49646((InterfaceC19370) it.next(), "");
                if (this.f69397.mo3924()) {
                    this.f69401 = false;
                    return;
                }
            }
            if (this.f69407) {
                C0977 c0977 = new C0977();
                for (C8649 c8649 : this.f69404) {
                    ((List) C15525.computeIfAbsent(c0977, Integer.valueOf(C11567.m26619(c8649.f23221, '/')), new C12272(3))).add(c8649);
                }
                ArrayList arrayList2 = new ArrayList(c0977.keySet());
                Collections.sort(arrayList2);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    while (true) {
                        if (this.f69405.isEmpty() && this.f69403.get() == this.f69402.get()) {
                            break;
                        }
                        if (this.f69397.mo3924()) {
                            this.f69401 = false;
                            return;
                        }
                        Thread.sleep(10L);
                    }
                    Iterator it2 = ((List) c0977.getOrDefault(arrayList2.get(size), null)).iterator();
                    while (it2.hasNext()) {
                        this.f69405.put((C8649) it2.next());
                    }
                }
            }
            this.f69401 = false;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    ((Future) it3.next()).get();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            this.f69401 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49647(C22061 c22061, InterfaceC24742 interfaceC24742) {
        AtomicInteger atomicInteger = c22061.f69402;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C8649 c8649M49648 = c22061.m49648();
                if (c8649M49648 == null) {
                    break;
                } else {
                    interfaceC24742.mo16881(c8649M49648, c22061.f69406.incrementAndGet(), c22061.f69398.get());
                }
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
        if (c22061.f69397.mo3924()) {
            c22061.f69405.clear();
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ۧ */
    private C8649 m49648() {
        this.f69403.incrementAndGet();
        while (!this.f69397.mo3924()) {
            try {
                try {
                    C8649 c8649 = (C8649) this.f69405.poll(200L, TimeUnit.MILLISECONDS);
                    if (c8649 == null) {
                        if (!this.f69401) {
                            break;
                        }
                    } else {
                        this.f69403.decrementAndGet();
                        return c8649;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f69403.decrementAndGet();
                throw th;
            }
        }
        this.f69403.decrementAndGet();
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49646(InterfaceC19370 interfaceC19370, String str) throws InterruptedException {
        InterfaceC18588 interfaceC18588 = this.f69397;
        if (interfaceC18588.mo3924()) {
            return;
        }
        String name = interfaceC19370.getName();
        String path = interfaceC19370.getPath();
        if (!str.isEmpty()) {
            name = C24104.m53357(str, "/", name);
        }
        boolean zIsDirectory = interfaceC19370.isDirectory();
        LinkedBlockingQueue linkedBlockingQueue = this.f69405;
        AtomicInteger atomicInteger = this.f69398;
        if (!zIsDirectory) {
            if (this.f69400 || str.isEmpty()) {
                atomicInteger.incrementAndGet();
                linkedBlockingQueue.put(new C8649(path, name, true));
                return;
            }
            return;
        }
        if ((this.f69400 || this.f69399) && !interfaceC19370.mo39144()) {
            Iterator it = this.f69408.mo9708(path, true).iterator();
            while (it.hasNext()) {
                m49646((InterfaceC19370) it.next(), name);
            }
            if (interfaceC18588.mo3924()) {
                return;
            }
        }
        if (this.f69399 || str.isEmpty()) {
            atomicInteger.incrementAndGet();
            if (this.f69407) {
                this.f69404.add(new C8649(path, name, false));
            } else {
                linkedBlockingQueue.put(new C8649(path, name, false));
            }
        }
    }
}
