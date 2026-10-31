package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20286 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c23525.m51981();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        C12524.m30725(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
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
