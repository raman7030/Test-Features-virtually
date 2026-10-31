package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C8500 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        c23525.m51983(((AtomicInteger) obj).get());
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        try {
            return new AtomicInteger(c17175.m40408());
        } catch (NumberFormatException e) {
            throw new C14682(e);
        }
    }
}
