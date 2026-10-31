package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C19084 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        c23525.m51974((Boolean) obj);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        EnumC14352 enumC14352M40398 = c17175.m40398();
        if (enumC14352M40398 == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        if (enumC14352M40398 == EnumC14352.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(c17175.m40399()));
        }
        return Boolean.valueOf(c17175.m40401());
    }
}
