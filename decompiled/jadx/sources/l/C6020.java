package l;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۛۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6020 implements InterfaceC11665 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile C6020 f18480;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f18481 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7163 f18482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f18483 = new CopyOnWriteArrayList();

    @Override // l.InterfaceC11665
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16845(InterfaceC13041 interfaceC13041) {
        C11233.m27805(interfaceC13041, "callback");
        synchronized (f18481) {
            if (this.f18482 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (C10254 c10254 : this.f18483) {
                if (c10254.m25985() == interfaceC13041) {
                    arrayList.add(c10254);
                }
            }
            this.f18483.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Activity activityM25983 = ((C10254) it.next()).m25983();
                CopyOnWriteArrayList copyOnWriteArrayList = this.f18483;
                if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C11233.m27802(((C10254) it2.next()).m25983(), activityM25983)) {
                            }
                        }
                    }
                }
                InterfaceC7163 interfaceC7163 = this.f18482;
                if (interfaceC7163 != null) {
                    interfaceC7163.mo19186(activityM25983);
                }
            }
            C8058 c8058 = C8058.f24861;
        }
    }

    public C6020(C13075 c13075) {
        this.f18482 = c13075;
        if (c13075 == null) {
            return;
        }
        c13075.m31690(new C12370(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList m16843() {
        return this.f18483;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x006f A[SYNTHETIC] */
    @Override // l.InterfaceC11665
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16844(Activity activity, ExecutorC23282 executorC23282, C11124 c11124) {
        C10254 c10254;
        Iterator it;
        C17473 c17473M25986;
        Object next;
        C10254 c10255;
        ReentrantLock reentrantLock = f18481;
        reentrantLock.lock();
        try {
            InterfaceC7163 interfaceC7163 = this.f18482;
            if (interfaceC7163 == null) {
                c11124.accept(new C17473(C8969.f27244));
                reentrantLock.unlock();
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18483;
            if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!C11233.m27802(((C10254) it2.next()).m25983(), activity));
                c10254 = new C10254(activity, executorC23282, c11124);
                copyOnWriteArrayList.add(c10254);
                if (!z) {
                    interfaceC7163.mo19185(activity);
                } else {
                    it = copyOnWriteArrayList.iterator();
                    do {
                        c17473M25986 = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!activity.equals(((C10254) next).m25983()));
                    c10255 = (C10254) next;
                    if (c10255 == null) {
                        c17473M25986 = c10255.m25986();
                    }
                    if (c17473M25986 != null) {
                        c10254.m25984(c17473M25986);
                    }
                }
                C8058 c8058 = C8058.f24861;
                reentrantLock.unlock();
            }
            z = false;
            c10254 = new C10254(activity, executorC23282, c11124);
            copyOnWriteArrayList.add(c10254);
            if (!z) {
                interfaceC7163.mo19185(activity);
            } else {
                it = copyOnWriteArrayList.iterator();
                do {
                    c17473M25986 = null;
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!activity.equals(((C10254) next).m25983()));
                c10255 = (C10254) next;
                if (c10255 == null) {
                    c17473M25986 = c10255.m25986();
                }
                if (c17473M25986 != null) {
                    c10254.m25984(c17473M25986);
                }
            }
            C8058 c8059 = C8058.f24861;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
