package p067l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۫ۛ */
/* JADX INFO: compiled from: 0B2V */
/* JADX INFO: loaded from: classes3.dex */
public final class C1448 {

    /* JADX INFO: renamed from: ۧ */
    public final Runnable f39459;

    /* JADX INFO: renamed from: ֫ */
    public final CopyOnWriteArrayList f39458 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f39460 = new HashMap();

    public C1448(Runnable runnable) {
        this.f39459 = runnable;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31767(Menu menu) {
        Iterator it = this.f39458.iterator();
        while (it.hasNext()) {
            ((InterfaceC1413) it.next()).mo30384(menu);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31762(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f39458.iterator();
        while (it.hasNext()) {
            ((InterfaceC1413) it.next()).mo30382(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31766(MenuItem menuItem) {
        Iterator it = this.f39458.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1413) it.next()).mo30383(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31761(Menu menu) {
        Iterator it = this.f39458.iterator();
        while (it.hasNext()) {
            ((InterfaceC1413) it.next()).mo30381(menu);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31763(InterfaceC1413 interfaceC1413) {
        this.f39458.add(interfaceC1413);
        this.f39459.run();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31764(final InterfaceC1413 interfaceC1413, InterfaceC24784 interfaceC24784) {
        m31763(interfaceC1413);
        AbstractC9381 lifecycle = interfaceC24784.getLifecycle();
        HashMap map = this.f39460;
        C1483 c1483 = (C1483) map.remove(interfaceC1413);
        if (c1483 != null) {
            c1483.m33465();
        }
        map.put(interfaceC1413, new C1483(lifecycle, new InterfaceC18749() { // from class: l.ۗۛ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24785, EnumC24133 enumC24133) {
                C1448 c1448 = this.f12377;
                c1448.getClass();
                if (enumC24133 == EnumC24133.ON_DESTROY) {
                    c1448.m31768(interfaceC1413);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31765(final InterfaceC1413 interfaceC1413, InterfaceC24784 interfaceC24784, final EnumC15415 enumC15415) {
        AbstractC9381 lifecycle = interfaceC24784.getLifecycle();
        HashMap map = this.f39460;
        C1483 c1483 = (C1483) map.remove(interfaceC1413);
        if (c1483 != null) {
            c1483.m33465();
        }
        map.put(interfaceC1413, new C1483(lifecycle, new InterfaceC18749() { // from class: l.ۙۛ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24785, EnumC24133 enumC24133) {
                C1448.m31760(this.f17033, enumC15415, interfaceC1413, enumC24133);
            }
        }));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31760(C1448 c1448, EnumC15415 enumC15415, InterfaceC1413 interfaceC1413, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.m53379(enumC15415)) {
            c1448.m31763(interfaceC1413);
            return;
        }
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            c1448.m31768(interfaceC1413);
        } else if (enumC24133 == EnumC24133.m53375(enumC15415)) {
            c1448.f39458.remove(interfaceC1413);
            c1448.f39459.run();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31768(InterfaceC1413 interfaceC1413) {
        this.f39458.remove(interfaceC1413);
        C1483 c1483 = (C1483) this.f39460.remove(interfaceC1413);
        if (c1483 != null) {
            c1483.m33465();
        }
        this.f39459.run();
    }
}
