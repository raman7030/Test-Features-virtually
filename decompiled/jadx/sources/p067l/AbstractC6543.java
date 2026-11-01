package p067l;

/* JADX INFO: renamed from: l.ۙۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6543 implements InterfaceC11908 {

    /* JADX INFO: renamed from: ֫ */
    public volatile C2479 f16894;

    @Override // p067l.InterfaceC11908
    /* JADX INFO: renamed from: ᩻ */
    public final C2479 mo14987() {
        if (this.f16894 == null) {
            C16600 c16600 = (C16600) this;
            C2479 c2479 = (C2479) c16600.f48758.getDescriptorForType().m43833().get(c16600.f48757);
            synchronized (this) {
                if (this.f16894 == null) {
                    this.f16894 = c2479;
                }
            }
        }
        return this.f16894;
    }
}
