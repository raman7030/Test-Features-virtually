package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩺ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8J1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23984 extends AbstractC5693 implements InterfaceC9232 {

    /* JADX INFO: renamed from: ᩴ */
    public final String f76181;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC15266 mo37128(byte[] bArr, int i, boolean z);

    @Override // p067l.InterfaceC9232
    /* JADX INFO: renamed from: ֫ */
    public final void mo15952(long j) {
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo11(C23128 c23128, AbstractC21787 abstractC21787, boolean z) {
        C19703 c19703 = (C19703) c23128;
        AbstractC19032 abstractC19032 = (AbstractC19032) abstractC21787;
        try {
            ByteBuffer byteBuffer = c19703.f72704;
            byteBuffer.getClass();
            abstractC19032.m43231(c19703.f72706, mo37128(byteBuffer.array(), byteBuffer.limit(), z), c19703.f59902);
            abstractC19032.f68603 = false;
            return null;
        } catch (C4280 e) {
            return e;
        }
    }

    public AbstractC23984(String str) {
        super(new C19703[2], new AbstractC19032[2]);
        this.f76181 = str;
        m12675(1024);
    }

    @Override // p067l.InterfaceC3681
    public final String getName() {
        return this.f76181;
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ᩳ */
    public final C23128 mo16() {
        return new C19703();
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21787 mo15() {
        return new C13256(this);
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo10(Throwable th) {
        return new C4280("Unexpected decode error", th);
    }
}
