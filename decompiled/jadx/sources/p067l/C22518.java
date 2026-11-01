package p067l;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C22518 extends AbstractC10288 {
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c24726.m54374();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c24726.m54385(bitSet.get(i) ? 1L : 0L);
        }
        c24726.m54391();
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        BitSet bitSet = new BitSet();
        c18691.m42636();
        EnumC16008 enumC16008M42643 = c18691.m42643();
        int i = 0;
        while (enumC16008M42643 != EnumC16008.END_ARRAY) {
            int i2 = C6424.f16627[enumC16008M42643.ordinal()];
            boolean zM42646 = true;
            if (i2 == 1 || i2 == 2) {
                int iM42653 = c18691.m42653();
                if (iM42653 == 0) {
                    zM42646 = false;
                } else if (iM42653 != 1) {
                    StringBuilder sbM34408 = C15033.m34408(iM42653, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM34408.append(c18691.m42638());
                    throw new C16322(sbM34408.toString());
                }
            } else {
                if (i2 != 3) {
                    throw new C16322("Invalid bitset value type: " + enumC16008M42643 + "; at path " + c18691.m42642());
                }
                zM42646 = c18691.m42646();
            }
            if (zM42646) {
                bitSet.set(i);
            }
            i++;
            enumC16008M42643 = c18691.m42643();
        }
        c18691.m42645();
        return bitSet;
    }
}
