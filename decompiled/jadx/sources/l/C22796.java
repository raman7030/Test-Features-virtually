package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩺ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes.dex */
public final class C22796 extends C3438 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73607;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22796(Writer writer, boolean z) {
        super(writer);
        this.f73607 = z;
    }

    @Override // l.C3438
    /* JADX INFO: renamed from: ֫ */
    public final void mo10509(EnumC0841 enumC0841) throws IOException {
        if (enumC0841 == EnumC0841.f3220) {
            enumC0841 = EnumC0841.f3137;
        } else if (enumC0841 == EnumC0841.f3238 || enumC0841 == EnumC0841.f3206) {
            enumC0841 = EnumC0841.f3246;
        }
        super.mo10509(enumC0841);
    }

    @Override // l.C3438
    /* JADX INFO: renamed from: ۧ */
    public final void mo10511(long j) throws IOException {
        if (this.f73607 && 2130706432 <= j && j <= 2147483647L) {
            super.mo10511(2130706432L);
        } else {
            super.mo10511(j);
        }
    }
}
