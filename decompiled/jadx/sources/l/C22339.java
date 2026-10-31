package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: l.᩹ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C22339 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        c23525.m51972();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            c23525.m51983(atomicIntegerArray.get(i));
        }
        c23525.m51989();
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        ArrayList arrayList = new ArrayList();
        c17175.m40391();
        while (c17175.m40404()) {
            try {
                arrayList.add(Integer.valueOf(c17175.m40408()));
            } catch (NumberFormatException e) {
                throw new C14682(e);
            }
        }
        c17175.m40400();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
