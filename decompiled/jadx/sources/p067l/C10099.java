package p067l;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10099 {

    /* JADX INFO: renamed from: ֫ */
    public final CopyOnWriteArrayList f28018;

    /* JADX INFO: renamed from: ۧ */
    public final C17474 f28019;

    /* JADX INFO: renamed from: ܽ */
    public final int f28020;

    /* JADX INFO: renamed from: ֫ */
    public final void m23558(Handler handler, InterfaceC16803 interfaceC16803) {
        handler.getClass();
        C3393 c3393 = new C3393();
        c3393.f6713 = handler;
        c3393.f6714 = interfaceC16803;
        this.f28018.add(c3393);
    }

    public C10099() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C10099(CopyOnWriteArrayList copyOnWriteArrayList, int i, C17474 c17474) {
        this.f28018 = copyOnWriteArrayList;
        this.f28020 = i;
        this.f28019 = c17474;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10099 m23557(int i, C17474 c17474) {
        return new C10099(this.f28018, i, c17474);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23562(InterfaceC16803 interfaceC16803) {
        CopyOnWriteArrayList<C3393> copyOnWriteArrayList = this.f28018;
        for (C3393 c3393 : copyOnWriteArrayList) {
            if (c3393.f6714 == interfaceC16803) {
                copyOnWriteArrayList.remove(c3393);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23560(C12782 c12782, int i, int i2, C10307 c10307, int i3, Object obj, long j, long j2, int i4) {
        m23563(new C7417(this, c12782, new C8758(i, i2, c10307, i3, obj, C5792.m13013(j), C5792.m13013(j2)), i4));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23564(C12782 c12782, int i, int i2, C10307 c10307, int i3, Object obj, long j, long j2) {
        m23563(new C2722(this, c12782, new C8758(i, i2, c10307, i3, obj, C5792.m13013(j), C5792.m13013(j2))));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23559(C12782 c12782, int i, int i2, C10307 c10307, int i3, Object obj, long j, long j2) {
        m23563(new C20829(this, c12782, new C8758(i, i2, c10307, i3, obj, C5792.m13013(j), C5792.m13013(j2))));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23561(C12782 c12782, int i, int i2, C10307 c10307, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        m23563(new C20158(this, c12782, new C8758(i, i2, c10307, i3, obj, C5792.m13013(j), C5792.m13013(j2)), iOException, z));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23563(InterfaceC24686 interfaceC24686) {
        for (C3393 c3393 : this.f28018) {
            C5792.m12999(c3393.f6713, new RunnableC5447(2, interfaceC24686, c3393.f6714));
        }
    }
}
