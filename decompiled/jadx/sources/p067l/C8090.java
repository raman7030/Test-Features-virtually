package p067l;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۛۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8090 implements InterfaceC13455 {

    /* JADX INFO: renamed from: ܽ */
    public static volatile C8090 f21335;

    /* JADX INFO: renamed from: ᩳ */
    public static final ReentrantLock f21336 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9176 f21337;

    /* JADX INFO: renamed from: ۧ */
    public final CopyOnWriteArrayList f21338 = new CopyOnWriteArrayList();

    @Override // p067l.InterfaceC13455
    /* JADX INFO: renamed from: ֫ */
    public final void mo18773(InterfaceC1489 interfaceC1489) {
        C13045.m29867(interfaceC1489, "callback");
        synchronized (f21336) {
            if (this.f21337 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (C12114 c12114 : this.f21338) {
                if (c12114.m28007() == interfaceC1489) {
                    arrayList.add(c12114);
                }
            }
            this.f21338.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Activity activityM28005 = ((C12114) it.next()).m28005();
                CopyOnWriteArrayList copyOnWriteArrayList = this.f21338;
                if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (C13045.m29864(((C12114) it2.next()).m28005(), activityM28005)) {
                            }
                        }
                    }
                }
                InterfaceC9176 interfaceC9176 = this.f21337;
                if (interfaceC9176 != null) {
                    interfaceC9176.mo21129(activityM28005);
                }
            }
            C10027 c10027 = C10027.f27775;
        }
    }

    public C8090(C14795 c14795) {
        this.f21337 = c14795;
        if (c14795 == null) {
            return;
        }
        c14795.m33778(new C14125(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final CopyOnWriteArrayList m18771() {
        return this.f21338;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0005, B:5:0x0009, B:13:0x0021, B:23:0x0044, B:25:0x004e, B:39:0x007e, B:26:0x0052, B:27:0x0056, B:29:0x005d, B:33:0x0070, B:38:0x007b, B:36:0x0075, B:16:0x0028, B:17:0x002c, B:19:0x0032), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x006f A[SYNTHETIC] */
    @Override // p067l.InterfaceC13455
    /* JADX INFO: renamed from: ֫ */
    public final void mo18772(Activity activity, ExecutorC24496 executorC24496, C12941 c12941) {
        C12114 c12114;
        Iterator it;
        C18975 c18975M28008;
        Object next;
        C12114 c12115;
        ReentrantLock reentrantLock = f21336;
        reentrantLock.lock();
        try {
            InterfaceC9176 interfaceC9176 = this.f21337;
            if (interfaceC9176 == null) {
                c12941.accept(new C18975(C10893.f30179));
                reentrantLock.unlock();
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f21338;
            if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!C13045.m29864(((C12114) it2.next()).m28005(), activity));
                c12114 = new C12114(activity, executorC24496, c12941);
                copyOnWriteArrayList.add(c12114);
                if (!z) {
                    interfaceC9176.mo21128(activity);
                } else {
                    it = copyOnWriteArrayList.iterator();
                    do {
                        c18975M28008 = null;
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!activity.equals(((C12114) next).m28005()));
                    c12115 = (C12114) next;
                    if (c12115 == null) {
                        c18975M28008 = c12115.m28008();
                    }
                    if (c18975M28008 != null) {
                        c12114.m28006(c18975M28008);
                    }
                }
                C10027 c10027 = C10027.f27775;
                reentrantLock.unlock();
            }
            z = false;
            c12114 = new C12114(activity, executorC24496, c12941);
            copyOnWriteArrayList.add(c12114);
            if (!z) {
                interfaceC9176.mo21128(activity);
            } else {
                it = copyOnWriteArrayList.iterator();
                do {
                    c18975M28008 = null;
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!activity.equals(((C12114) next).m28005()));
                c12115 = (C12114) next;
                if (c12115 == null) {
                    c18975M28008 = c12115.m28008();
                }
                if (c18975M28008 != null) {
                    c12114.m28006(c18975M28008);
                }
            }
            C10027 c10028 = C10027.f27775;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
