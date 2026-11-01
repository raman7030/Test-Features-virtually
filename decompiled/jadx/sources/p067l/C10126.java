package p067l;

import java.io.BufferedOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۠ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10126 implements Supplier {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AtomicInteger f28071;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean f28072;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ BufferedOutputStream f28073;

    public /* synthetic */ C10126(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f28072 = z;
        this.f28073 = bufferedOutputStream;
        this.f28071 = atomicInteger;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new C14819(this.f28072, this.f28073, this.f28071);
    }
}
