package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23659 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c24726.m54383();
            return;
        }
        double dDoubleValue = number.doubleValue();
        C14271.m32797(dDoubleValue);
        c24726.m54375(dDoubleValue);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        return Double.valueOf(c18691.m42652());
    }
}
