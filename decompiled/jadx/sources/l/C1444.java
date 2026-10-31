package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public class C1444 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c23525.m51981();
        } else {
            c23525.m51983(number.intValue());
        }
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        try {
            return Integer.valueOf(c17175.m40408());
        } catch (NumberFormatException e) {
            throw new C14682(e);
        }
    }
}
