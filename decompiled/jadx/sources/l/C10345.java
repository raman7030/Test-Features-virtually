package l;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ۤܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C10345 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        c23525.m51975((BigDecimal) obj);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String strM40399 = c17175.m40399();
        try {
            return C6901.m18686(strM40399);
        } catch (NumberFormatException e) {
            StringBuilder sbM9834 = C3200.m9834("Failed parsing '", strM40399, "' as BigDecimal; at path ");
            sbM9834.append(c17175.m40393());
            throw new C14682(sbM9834.toString(), e);
        }
    }
}
