package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C4700 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c23525.m51981();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        c23525.m51975(numberValueOf);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        return Float.valueOf((float) c17175.m40407());
    }
}
