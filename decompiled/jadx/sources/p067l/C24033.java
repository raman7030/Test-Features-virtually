package p067l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩺ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes.dex */
public final class C24033 extends C5636 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ boolean f76337;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24033(Writer writer, boolean z) {
        super(writer);
        this.f76337 = z;
    }

    @Override // p067l.C5636
    /* JADX INFO: renamed from: ֫ */
    public final void mo12533(EnumC3167 enumC3167) throws IOException {
        if (enumC3167 == EnumC3167.f5994) {
            enumC3167 = EnumC3167.f5911;
        } else if (enumC3167 == EnumC3167.f6012 || enumC3167 == EnumC3167.f5980) {
            enumC3167 = EnumC3167.f6020;
        }
        super.mo12533(enumC3167);
    }

    @Override // p067l.C5636
    /* JADX INFO: renamed from: ۧ */
    public final void mo12535(long j) throws IOException {
        if (this.f76337 && 2130706432 <= j && j <= 2147483647L) {
            super.mo12535(2130706432L);
        } else {
            super.mo12535(j);
        }
    }
}
