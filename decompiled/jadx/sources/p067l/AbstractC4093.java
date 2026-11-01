package p067l;

/* JADX INFO: renamed from: l.֫۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4093 extends AbstractC9476 implements InterfaceC9168 {

    /* JADX INFO: renamed from: ᩶ */
    public final C18845 f9021;

    public AbstractC4093(EnumC3167 enumC3167, C18845 c18845) {
        super(enumC3167);
        this.f9021 = c18845;
    }

    @Override // p067l.InterfaceC9168
    /* JADX INFO: renamed from: ۖ */
    public final int mo5147() {
        int i = this.f9021.m42918().f52332 - m22075().f52332;
        if (mo6216() == 1) {
            if (i < -128 || i > 127) {
                throw new C17034(null, "Invalid instruction offset: %d. Offset must be in [-128, 127]", Integer.valueOf(i));
            }
        } else if (mo6216() == 2 && (i < -32768 || i > 32767)) {
            throw new C17034(null, "Invalid instruction offset: %d. Offset must be in [-32768, 32767]", Integer.valueOf(i));
        }
        return i;
    }

    /* JADX INFO: renamed from: ۛ */
    public final C18845 m8235() {
        return this.f9021;
    }
}
