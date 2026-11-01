package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public class C3070 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c24726.m54383();
        } else {
            c24726.m54385(number.byteValue());
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        try {
            int iM42653 = c18691.m42653();
            if (iM42653 <= 255 && iM42653 >= -128) {
                return Byte.valueOf((byte) iM42653);
            }
            StringBuilder sbM34408 = C15033.m34408(iM42653, "Lossy conversion from ", " to byte; at path ");
            sbM34408.append(c18691.m42638());
            throw new C16322(sbM34408.toString());
        } catch (NumberFormatException e) {
            throw new C16322(e);
        }
    }
}
