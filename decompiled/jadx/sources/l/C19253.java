package l;

import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩵ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X88W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19253 extends C17135 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f60611;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f60612;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC14312 f60613;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC14312 f60614;

    public C19253(EnumC14312 enumC14312, EnumC14312 enumC14313) {
        m40161(EnumC6552.BIND);
        m40160(EnumSet.of(EnumC20664.FIRST_FRAGMENT, EnumC20664.LAST_FRAGMENT));
        m40162((short) 72);
        this.f60611 = 16384;
        this.f60612 = 16384;
        this.f60614 = enumC14312;
        this.f60613 = enumC14313;
    }

    @Override // l.C17135
    /* JADX INFO: renamed from: ֫ */
    public final void mo3260(C2319 c2319) throws IOException {
        super.mo3260(c2319);
        c2319.m7582(this.f60611);
        c2319.m7582(this.f60612);
        c2319.m7581(0);
        c2319.m7577(1);
        c2319.m7577(0);
        c2319.m7582(0);
        c2319.m7582(0);
        c2319.m7577(1);
        c2319.m7577(0);
        EnumC14312 enumC14312 = this.f60614;
        c2319.m7580(enumC14312.m34180());
        c2319.m7582(enumC14312.m34177());
        c2319.m7582(enumC14312.m34178());
        EnumC14312 enumC14313 = this.f60613;
        c2319.m7580(enumC14313.m34180());
        c2319.m7582(enumC14313.m34177());
        c2319.m7582(enumC14313.m34178());
    }
}
