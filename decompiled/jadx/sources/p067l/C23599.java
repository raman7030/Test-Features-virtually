package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.᩹ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C23599 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        c24726.m54374();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            c24726.m54385(atomicIntegerArray.get(i));
        }
        c24726.m54391();
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        ArrayList arrayList = new ArrayList();
        c18691.m42636();
        while (c18691.m42649()) {
            try {
                arrayList.add(Integer.valueOf(c18691.m42653()));
            } catch (NumberFormatException e) {
                throw new C16322(e);
            }
        }
        c18691.m42645();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
