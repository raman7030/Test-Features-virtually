package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ܺ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17817 extends C5275 {
    /* JADX INFO: renamed from: ֫ */
    public static void m40438(C20856 c20856, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, final InterfaceC6616 interfaceC6616, Set set) {
        final C11113 c11113 = new C11113(c20856, i2 != 0);
        final C22513 c22513 = new C22513(i2, str, z3, z2, c11113, i, z4, c20856, str2, z, set);
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: l.ۤۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                final C11113 c11114 = c11113;
                final InterfaceC6616 interfaceC6617 = interfaceC6616;
                try {
                    c11114.f30823 = c11114.f30822 ? c11114.f30821.m47129() : Collections.EMPTY_MAP;
                    final InterfaceC21369 interfaceC21369 = c22513;
                    C22513 c22514 = (C22513) interfaceC21369;
                    InterfaceC9969 interfaceC9969Mo4629 = c22514.mo4629();
                    if (interfaceC9969Mo4629 == null) {
                        C7050.m16212(new RunnableC20435(5, interfaceC6617));
                        return;
                    }
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c22514.mo4630(concurrentLinkedQueue);
                    interfaceC6617.mo5694(0);
                    C20689 c20689 = new C20689(concurrentLinkedQueue.size());
                    c20689.m46753(new C4407(interfaceC6617));
                    C10748 c10748M24760 = C10748.m24760();
                    final ArrayList arrayList2 = arrayList;
                    C5275.m11400(C19110.f57020, new RunnableC11784(concurrentLinkedQueue, interfaceC6617, c20689, interfaceC9969Mo4629, arrayList2, c10748M24760));
                    C7050.m16212(new Runnable() { // from class: l.ۧ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC6616 interfaceC6618 = interfaceC6617;
                            if (interfaceC6618.mo5692()) {
                                C22682.m50801();
                            }
                            interfaceC6618.mo5691(((C22513) interfaceC21369).mo4628(arrayList2));
                            interfaceC6618.mo5693();
                        }
                    });
                } catch (Exception e) {
                    C7050.m16212(new Runnable() { // from class: l.۟ۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC6616 interfaceC6618 = interfaceC6617;
                            c11114.m25633(interfaceC6618.mo5695(), exc);
                            interfaceC6618.mo5693();
                        }
                    });
                }
            }
        }).start();
    }
}
