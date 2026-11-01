package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19876 extends IOException {

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC9460 f60389;

    public C19876(C24864 c24864, String str) {
        super(String.format("%s returned %s (%d/%d): %s", c24864.m54620(), Long.valueOf(c24864.m54605()), Long.valueOf(c24864.m54605()), Long.valueOf(c24864.m54605()), str));
        this.f60389 = EnumC9460.m21963(c24864.m54605());
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC9460 m45117() {
        return this.f60389;
    }
}
