package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18708 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f59147;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18708(C22235 c22235) {
        super("OkHttp %s ping", c22235.f72148);
        this.f59147 = c22235;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        boolean z;
        synchronized (this.f59147) {
            if (this.f59147.f72150 < this.f59147.f72143) {
                z = true;
            } else {
                C22235.m49918(this.f59147);
                z = false;
            }
        }
        if (z) {
            C22235 c22235 = this.f59147;
            try {
                EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
                c22235.m49933(enumC13499, enumC13499);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        this.f59147.m49925(1, 0, false);
    }
}
