package l;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C21201 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c23525.m51972();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c23525.m51983(bitSet.get(i) ? 1L : 0L);
        }
        c23525.m51989();
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        BitSet bitSet = new BitSet();
        c17175.m40391();
        EnumC14352 enumC14352M40398 = c17175.m40398();
        int i = 0;
        while (enumC14352M40398 != EnumC14352.END_ARRAY) {
            int i2 = C4267.f13810[enumC14352M40398.ordinal()];
            boolean zM40401 = true;
            if (i2 == 1 || i2 == 2) {
                int iM40408 = c17175.m40408();
                if (iM40408 == 0) {
                    zM40401 = false;
                } else if (iM40408 != 1) {
                    StringBuilder sbM32308 = C13325.m32308(iM40408, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM32308.append(c17175.m40393());
                    throw new C14682(sbM32308.toString());
                }
            } else {
                if (i2 != 3) {
                    throw new C14682("Invalid bitset value type: " + enumC14352M40398 + "; at path " + c17175.m40397());
                }
                zM40401 = c17175.m40401();
            }
            if (zM40401) {
                bitSet.set(i);
            }
            i++;
            enumC14352M40398 = c17175.m40398();
        }
        c17175.m40400();
        return bitSet;
    }
}
