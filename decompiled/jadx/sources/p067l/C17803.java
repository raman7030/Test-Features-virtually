package p067l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9GX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17803 extends C18158 {

    /* JADX INFO: renamed from: ۜ */
    public byte f53159;

    /* JADX INFO: renamed from: ܳ */
    public EnumSet f53160;

    /* JADX INFO: renamed from: ܿ */
    public EnumSet f53161;

    /* JADX INFO: renamed from: ᩻ */
    public EnumSet f53162;

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ۧ */
    public final void mo9145(C2460 c2460) throws C14862 {
        c2460.m28121(2);
        this.f53159 = c2460.m28120();
        c2460.m28120();
        this.f53162 = C16873.m38439(c2460.m28107(), EnumC11454.class);
        this.f53161 = C16873.m38439(c2460.m28107(), EnumC22183.class);
        this.f53160 = C16873.m38439(c2460.m28107(), EnumC13484.class);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m40420() {
        return this.f53159 == 1;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m40422() {
        return this.f53159 == 2;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m40418() {
        return this.f53159 == 3;
    }

    /* JADX INFO: renamed from: ۢ */
    public final EnumSet m40421() {
        return this.f53162;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Set m40419() {
        return this.f53161;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumSet m40423() {
        return this.f53160;
    }
}
