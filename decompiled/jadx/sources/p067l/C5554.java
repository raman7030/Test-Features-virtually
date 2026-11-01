package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.ۗܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5554 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC10288 f13420;

    public C5554(AbstractC10288 abstractC10288) {
        this.f13420 = abstractC10288;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        c24726.m54374();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f13420.mo5174(c24726, Long.valueOf(atomicLongArray.get(i)));
        }
        c24726.m54391();
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        ArrayList arrayList = new ArrayList();
        c18691.m42636();
        while (c18691.m42649()) {
            arrayList.add(Long.valueOf(((Number) this.f13420.mo5173(c18691)).longValue()));
        }
        c18691.m42645();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }
}
