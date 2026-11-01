package p067l;

import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩵ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X88W */
/* JADX INFO: loaded from: classes5.dex */
public final class C20666 extends C18653 {

    /* JADX INFO: renamed from: ۡ */
    public final int f63842;

    /* JADX INFO: renamed from: ۢ */
    public final int f63843;

    /* JADX INFO: renamed from: ܺ */
    public final EnumC15970 f63844;

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC15970 f63845;

    public C20666(EnumC15970 enumC15970, EnumC15970 enumC15971) {
        m42406(EnumC8595.BIND);
        m42405(EnumSet.of(EnumC22007.FIRST_FRAGMENT, EnumC22007.LAST_FRAGMENT));
        m42407((short) 72);
        this.f63842 = 16384;
        this.f63843 = 16384;
        this.f63845 = enumC15970;
        this.f63844 = enumC15971;
    }

    @Override // p067l.C18653
    /* JADX INFO: renamed from: ֫ */
    public final void mo5579(C4572 c4572) throws IOException {
        super.mo5579(c4572);
        c4572.m9652(this.f63842);
        c4572.m9652(this.f63843);
        c4572.m9651(0);
        c4572.m9647(1);
        c4572.m9647(0);
        c4572.m9652(0);
        c4572.m9652(0);
        c4572.m9647(1);
        c4572.m9647(0);
        EnumC15970 enumC15970 = this.f63845;
        c4572.m9650(enumC15970.m36313());
        c4572.m9652(enumC15970.m36310());
        c4572.m9652(enumC15970.m36311());
        EnumC15970 enumC15971 = this.f63844;
        c4572.m9650(enumC15971.m36313());
        c4572.m9652(enumC15971.m36310());
        c4572.m9652(enumC15971.m36311());
    }
}
