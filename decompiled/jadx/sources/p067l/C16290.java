package p067l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܳܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16290 {

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicInteger f47887 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧ */
    public static C18973 m37085() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        C18973 c18973 = new C18973();
        do {
            atomicInteger = f47887;
            i = atomicInteger.get();
            if (i >= 128) {
                throw new IOException("Too many open hex file channels");
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return c18973;
    }
}
