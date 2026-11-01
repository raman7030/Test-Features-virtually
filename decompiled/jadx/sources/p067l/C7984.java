package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7984 extends AbstractC15359 {

    /* JADX INFO: renamed from: ᩶ */
    public int f20991;

    /* JADX INFO: renamed from: ᩹ */
    public int f20992;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 3;
    }

    public C7984(EnumC19222 enumC19222, int i, int i2) {
        super(enumC19222);
        this.f20992 = i;
        this.f20991 = i2;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f20992);
        c8121.m18811(this.f20991);
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ֫ */
    public final String mo11479() {
        return this.f20992 + " " + this.f20991;
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ܽ */
    public final String mo11481() {
        return String.format("{ offset: %d; type_argument_index: %d; }", Integer.valueOf(this.f20992), Integer.valueOf(this.f20991));
    }
}
