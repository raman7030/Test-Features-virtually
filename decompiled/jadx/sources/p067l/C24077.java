package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes.dex */
public final class C24077 extends AbstractC15359 {

    /* JADX INFO: renamed from: ᩹ */
    public int f76456;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 1;
    }

    public C24077(EnumC19222 enumC19222, int i) {
        super(enumC19222);
        this.f76456 = i;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        ((C8121) interfaceC2756).m18811(this.f76456);
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ܽ */
    public final String mo11481() {
        return String.format("{ type_parameter_index: %d; }", Integer.valueOf(this.f76456));
    }

    @Override // p067l.AbstractC15359
    /* JADX INFO: renamed from: ֫ */
    public final String mo11479() {
        return String.valueOf(this.f76456);
    }
}
