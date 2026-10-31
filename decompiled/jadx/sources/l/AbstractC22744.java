package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩺ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8J1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22744 extends AbstractC3498 implements InterfaceC7222 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f73455;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC13571 mo34981(byte[] bArr, int i, boolean z);

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ֫ */
    public final void mo14072(long j) {
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ֫ */
    public final C8437 mo11(C21843 c21843, AbstractC20432 abstractC20432, boolean z) {
        C18239 c18239 = (C18239) c21843;
        AbstractC17533 abstractC17533 = (AbstractC17533) abstractC20432;
        try {
            ByteBuffer byteBuffer = c18239.f69995;
            byteBuffer.getClass();
            abstractC17533.m40971(c18239.f69997, mo34981(byteBuffer.array(), byteBuffer.limit(), z), c18239.f56684);
            abstractC17533.f65928 = false;
            return null;
        } catch (C2011 e) {
            return e;
        }
    }

    public AbstractC22744(String str) {
        super(new C18239[2], new AbstractC17533[2]);
        this.f73455 = str;
        m10680(1024);
    }

    @Override // l.InterfaceC1381
    public final String getName() {
        return this.f73455;
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ᩳ */
    public final C21843 mo16() {
        return new C18239();
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC20432 mo15() {
        return new C11456(this);
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ֫ */
    public final C8437 mo10(Throwable th) {
        return new C2011("Unexpected decode error", th);
    }
}
