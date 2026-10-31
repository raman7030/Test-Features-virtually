package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public class C13166 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        Character ch = (Character) obj;
        c23525.m51984(ch == null ? null : String.valueOf(ch));
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String strM40399 = c17175.m40399();
        if (strM40399.length() == 1) {
            return Character.valueOf(strM40399.charAt(0));
        }
        StringBuilder sbM9834 = C3200.m9834("Expecting character, got: ", strM40399, "; at ");
        sbM9834.append(c17175.m40393());
        throw new C14682(sbM9834.toString());
    }
}
