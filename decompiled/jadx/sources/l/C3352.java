package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.ۗܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3352 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f10612;

    public C3352(AbstractC8333 abstractC8333) {
        this.f10612 = abstractC8333;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        c23525.m51972();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f10612.mo2845(c23525, Long.valueOf(atomicLongArray.get(i)));
        }
        c23525.m51989();
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        ArrayList arrayList = new ArrayList();
        c17175.m40391();
        while (c17175.m40404()) {
            arrayList.add(Long.valueOf(((Number) this.f10612.mo2844(c17175)).longValue()));
        }
        c17175.m40400();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }
}
