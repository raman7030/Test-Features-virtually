package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C5678 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c23525.m51981();
        } else {
            c23525.m51983(number.shortValue());
        }
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        try {
            int iM40408 = c17175.m40408();
            if (iM40408 <= 65535 && iM40408 >= -32768) {
                return Short.valueOf((short) iM40408);
            }
            StringBuilder sbM32308 = C13325.m32308(iM40408, "Lossy conversion from ", " to short; at path ");
            sbM32308.append(c17175.m40393());
            throw new C14682(sbM32308.toString());
        } catch (NumberFormatException e) {
            throw new C14682(e);
        }
    }
}
