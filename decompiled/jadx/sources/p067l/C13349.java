package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13349 extends AbstractC15359 {

    /* JADX INFO: renamed from: ᩶ */
    public int f37476;

    /* JADX INFO: renamed from: ᩹ */
    public int f37477;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 2;
    }

    public C13349(EnumC19222 enumC19222, int i, int i2) {
        super(enumC19222);
        this.f37476 = i;
        this.f37477 = i2;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811(this.f37476);
        c8121.m18811(this.f37477);
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ֫ */
    public final String mo11479() {
        return this.f37476 + " " + this.f37477;
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ܽ */
    public final String mo11481() {
        return String.format("{ type_parameter_index: %d; bound_index: %d; }", Integer.valueOf(this.f37476), Integer.valueOf(this.f37477));
    }
}
