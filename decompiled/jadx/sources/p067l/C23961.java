package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩺ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes.dex */
public final class C23961 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f76127;

    /* JADX INFO: renamed from: ۧ */
    public final Executor f76128;

    /* JADX INFO: renamed from: ܳ */
    public boolean f76129;

    /* JADX INFO: renamed from: ܽ */
    public final C21545 f76130;

    /* JADX INFO: renamed from: ܿ */
    public C13233 f76131;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f76132;

    public C23961(Context context) {
        ExecutorService executorService = C4081.f8987;
        C21545 c21545 = new C21545();
        this.f76132 = new Object();
        this.f76127 = context.getApplicationContext();
        this.f76128 = executorService;
        this.f76130 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53104(InterfaceC19370 interfaceC19370, C13823 c13823, long j, int i, InterfaceC23291 interfaceC23291) {
        String strM31497 = c13823.m31497();
        synchronized (this.f76132) {
            C13233 c13233 = this.f76131;
            if (c13233 != null && c13233.f37188 == i) {
                InterfaceC19370 interfaceC19371 = c13233.f37196;
                String path = null;
                String path2 = interfaceC19371 == null ? null : interfaceC19371.getPath();
                if (interfaceC19370 != null) {
                    path = interfaceC19370.getPath();
                }
                if (C12826.equals(path2, path) && C12826.equals(this.f76131.f37187, strM31497)) {
                    C13233 c13234 = this.f76131;
                    c13234.f37196 = interfaceC19370;
                    c13234.f37190 = c13823;
                    c13234.f37187 = strM31497;
                    c13234.f37194 = j;
                    c13234.f37185 = interfaceC23291;
                    if (c13234.f37186 == null && !this.f76129) {
                        c13234.f37193 = false;
                    }
                    return;
                }
            }
            C13233 c13235 = this.f76131;
            m53097(c13235);
            this.f76131 = new C13233(interfaceC19370, c13823, strM31497, j, i, interfaceC23291);
            if (!this.f76129 && c13235 != null && c13235.f37186 != null) {
                this.f76129 = true;
                this.f76128.execute(new RunnableC2502(this, c13235));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53102(int i, int i2, long j) {
        synchronized (this.f76132) {
            C13233 c13233 = this.f76131;
            if (c13233 == null) {
                return;
            }
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            int i3 = c13233.f37188;
            int i4 = c13233.f37195;
            long j2 = c13233.f37194;
            long jMax = Math.max(1L, 1000L);
            if (j2 <= 0) {
                j2 = C14849.FOREVER_NS;
            }
            C7868 c7868 = new C7868(i3, i4, iMax, iMax2, (Math.max(0L, Math.min(j, j2)) / jMax) * jMax);
            if (c7868.equals(c13233.f37192)) {
                return;
            }
            c13233.f37198 = c7868;
            if (!this.f76129) {
                m53099();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53101() {
        synchronized (this.f76132) {
            C13233 c13233 = this.f76131;
            if (c13233 != null) {
                c13233.f37195++;
                c13233.f37198 = null;
                c13233.f37191 = true;
                if (!this.f76129) {
                    m53099();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53105() {
        synchronized (this.f76132) {
            C13233 c13233 = this.f76131;
            if (c13233 != null && !c13233.f37193) {
                if (c13233.f37186 != null || this.f76129) {
                    m53097(c13233);
                    if (!this.f76129) {
                        m53099();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53103(Runnable runnable) {
        synchronized (this.f76132) {
            C13233 c13233 = this.f76131;
            if (c13233 != null) {
                m53097(c13233);
                c13233.f37189.add(runnable);
                if (!this.f76129) {
                    m53099();
                }
                return;
            }
            Object[] objArr = {runnable};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C12826.requireNonNull(obj);
            arrayList.add(obj);
            List listUnmodifiableList = C21562.unmodifiableList(arrayList);
            this.f76129 = true;
            this.f76128.execute(new RunnableC3173(this, listUnmodifiableList));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53097(C13233 c13233) {
        if (c13233 == null) {
            return;
        }
        c13233.f37195++;
        c13233.f37198 = null;
        c13233.f37191 = false;
        c13233.f37193 = true;
        c13233.f37197 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m53099() {
        List list;
        final C13233 c13233 = this.f76131;
        if (c13233 == null) {
            return;
        }
        boolean z = c13233.f37193;
        Executor executor = this.f76128;
        if (z && c13233.f37186 != null) {
            this.f76129 = true;
            executor.execute(new RunnableC2502(this, c13233));
            return;
        }
        if (z && c13233.f37186 == null) {
            c13233.f37193 = false;
            ArrayList arrayList = c13233.f37189;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                this.f76129 = true;
                executor.execute(new RunnableC3173(this, list));
                return;
            }
        }
        if (c13233.f37191) {
            final InterfaceC14573 interfaceC14573 = c13233.f37186;
            c13233.f37191 = false;
            if (interfaceC14573 != null && interfaceC14573.mo11122()) {
                this.f76129 = true;
                executor.execute(new Runnable() { // from class: l.ۚۗۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23961.m53092(this.f18801, interfaceC14573, c13233);
                    }
                });
                return;
            }
        }
        C7868 c7868 = c13233.f37198;
        if (c7868 == null) {
            return;
        }
        c13233.f37198 = null;
        c13233.f37192 = c7868;
        this.f76129 = true;
        executor.execute(new RunnableC9345(this, c13233, c7868));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53088(C23961 c23961, C13233 c13233) {
        c23961.m53093(c13233);
        c23961.m53100(c13233);
        c23961.m53096();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53092(C23961 c23961, InterfaceC14573 interfaceC14573, C13233 c13233) {
        try {
            interfaceC14573.mo11123();
        } catch (Throwable unused) {
        }
        if (c23961.m53098(c13233)) {
            c23961.m53093(c13233);
            c23961.m53100(c13233);
        }
        c23961.m53096();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53090(final C23961 c23961, final C13233 c13233, final C7868 c7868) {
        Bitmap bitmapMo11120;
        try {
            InterfaceC14573 interfaceC14573M53083 = c23961.m53083(c13233);
            if (interfaceC14573M53083 != null) {
                bitmapMo11120 = interfaceC14573M53083.mo11120(c7868.f20662 * 1000, c7868.f20661, c7868.f20659, new InterfaceC21280() { // from class: l.۠ۗۜ
                    @Override // p067l.InterfaceC21280
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo23161() {
                        C23961.m53095(this.f27402, c13233, c7868);
                    }
                });
                c23961.m53085(c13233, interfaceC14573M53083);
            } else {
                bitmapMo11120 = null;
            }
        } catch (Throwable unused) {
        }
        c23961.m53084(c13233, c7868, bitmapMo11120);
        synchronized (c23961.f76132) {
            c13233.f37192 = null;
        }
        if (c23961.m53098(c13233)) {
            c23961.m53093(c13233);
            c23961.m53100(c13233);
        }
        c23961.m53096();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC14573 m53083(C13233 c13233) {
        InterfaceC14573 interfaceC14573M31628;
        InterfaceC14573 interfaceC14573 = c13233.f37186;
        if (interfaceC14573 != null) {
            return interfaceC14573;
        }
        C21545 c21545 = this.f76130;
        Context context = this.f76127;
        C13823 c13823 = c13233.f37190;
        long j = c13233.f37194;
        c21545.getClass();
        if (c13823.m31500()) {
            int i = C24292.f76943;
            if (j > 0 && j <= 10000) {
                try {
                    interfaceC14573M31628 = new C11892(context, c13823, C24292.m53620(c13823, j));
                } catch (IOException | RuntimeException unused) {
                    interfaceC14573M31628 = C13903.m31628(context, c13823);
                }
            } else {
                interfaceC14573M31628 = C13903.m31628(context, c13823);
            }
        } else {
            interfaceC14573M31628 = C13903.m31628(context, c13823);
        }
        InterfaceC14573 interfaceC14574 = interfaceC14573M31628;
        synchronized (this.f76132) {
            if (!c13233.f37193 && this.f76131 == c13233) {
                c13233.f37186 = interfaceC14574;
                return interfaceC14574;
            }
            interfaceC14574.mo11121();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53095(C23961 c23961, C13233 c13233, C7868 c7868) {
        synchronized (c23961.f76132) {
            if (Thread.currentThread().isInterrupted() || c23961.f76131 != c13233 || c13233.f37193 || c13233.f37195 != c7868.f20658) {
                throw new InterruptedIOException("Video preview request was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53085(final C13233 c13233, InterfaceC14573 interfaceC14573) {
        C15243 c15243Mo11124;
        synchronized (this.f76132) {
            if (c13233.f37197) {
                return;
            }
            c13233.f37197 = true;
            try {
                c15243Mo11124 = interfaceC14573.mo11124();
            } catch (Throwable unused) {
                c15243Mo11124 = null;
            }
            final C15243 c15243 = c15243Mo11124;
            if (c15243 == null) {
                return;
            }
            synchronized (this.f76132) {
                if (this.f76131 == c13233 && !c13233.f37193) {
                    final int i = c13233.f37188;
                    final int i2 = c13233.f37195;
                    C7050.m16212(new Runnable() { // from class: l.ܶۗۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23961.m53089(this.f48723, c13233, i2, i, c15243);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53089(C23961 c23961, C13233 c13233, int i, int i2, C15243 c15243) {
        synchronized (c23961.f76132) {
            if (c23961.f76131 == c13233 && c13233.f37195 == i && c13233.f37188 == i2 && !c13233.f37193) {
                c13233.f37185.mo8095(i2, c15243);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53084(final C13233 c13233, final C7868 c7868, final Bitmap bitmap) {
        synchronized (this.f76132) {
            if (this.f76131 == c13233 && c13233.f37195 == c7868.f20658 && c13233.f37188 == c7868.f20660) {
                C7050.m16212(new Runnable() { // from class: l.᩸ۗۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23961.m53091(this.f71389, c13233, c7868, bitmap);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53091(C23961 c23961, C13233 c13233, C7868 c7868, Bitmap bitmap) {
        synchronized (c23961.f76132) {
            if (c23961.f76131 == c13233 && c13233.f37195 == c7868.f20658 && c13233.f37188 == c7868.f20660) {
                c13233.f37185.mo8094(c7868.f20660, bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m53098(C13233 c13233) {
        boolean z;
        synchronized (this.f76132) {
            z = c13233.f37193;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53093(C13233 c13233) {
        InterfaceC14573 interfaceC14573;
        synchronized (this.f76132) {
            interfaceC14573 = c13233.f37186;
            c13233.f37186 = null;
            c13233.f37193 = false;
            c13233.f37197 = false;
        }
        m53094(interfaceC14573);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m53100(C13233 c13233) {
        List list;
        synchronized (this.f76132) {
            ArrayList arrayList = c13233.f37189;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53087(C23961 c23961, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c23961.m53096();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53096() {
        synchronized (this.f76132) {
            this.f76129 = false;
            m53099();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53094(InterfaceC14573 interfaceC14573) {
        if (interfaceC14573 != null) {
            interfaceC14573.mo11121();
        }
    }
}
