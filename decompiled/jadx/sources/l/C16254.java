package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ܺ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16254 extends C3058 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38224(C19452 c19452, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, final InterfaceC4469 interfaceC4469, Set set) {
        final C9200 c9200 = new C9200(c19452, i2 != 0);
        final C21195 c21195 = new C21195(i2, str, z3, z2, c9200, i, z4, c19452, str2, z, set);
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: l.ۤۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                final C9200 c9201 = c9200;
                final InterfaceC4469 interfaceC44610 = interfaceC4469;
                try {
                    c9201.f27877 = c9201.f27876 ? c9201.f27875.m44833() : Collections.EMPTY_MAP;
                    final InterfaceC19992 interfaceC19992 = c21195;
                    C21195 c21196 = (C21195) interfaceC19992;
                    InterfaceC7997 interfaceC7997Mo2262 = c21196.mo2262();
                    if (interfaceC7997Mo2262 == null) {
                        C4925.m14315(new RunnableC19009(5, interfaceC44610));
                        return;
                    }
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c21196.mo2263(concurrentLinkedQueue);
                    interfaceC44610.mo3375(0);
                    C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                    c19277.m44459(new C2144(interfaceC44610));
                    C8817 c8817M22790 = C8817.m22790();
                    final ArrayList arrayList2 = arrayList;
                    C3058.m9358(C17615.f53826, new RunnableC9906(concurrentLinkedQueue, interfaceC44610, c19277, interfaceC7997Mo2262, arrayList2, c8817M22790));
                    C4925.m14315(new Runnable() { // from class: l.ۧ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC4469 interfaceC44611 = interfaceC44610;
                            if (interfaceC44611.mo3373()) {
                                C21374.m48465();
                            }
                            interfaceC44611.mo3372(((C21195) interfaceC19992).mo2261(arrayList2));
                            interfaceC44611.mo3374();
                        }
                    });
                } catch (Exception e) {
                    C4925.m14315(new Runnable() { // from class: l.۟ۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC4469 interfaceC44611 = interfaceC44610;
                            c9201.m23634(interfaceC44611.mo3376(), exc);
                            interfaceC44611.mo3374();
                        }
                    });
                }
            }
        }).start();
    }
}
