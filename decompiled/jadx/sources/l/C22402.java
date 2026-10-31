package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22402 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c23525.m51981();
            return;
        }
        double dDoubleValue = number.doubleValue();
        C12524.m30725(dDoubleValue);
        c23525.m51973(dDoubleValue);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        return Double.valueOf(c17175.m40407());
    }
}
