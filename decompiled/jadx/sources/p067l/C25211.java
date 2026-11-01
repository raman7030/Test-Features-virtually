package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25211 extends AbstractC20930 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ String f80618;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ Consumer f80619;

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25211(String str, Consumer consumer) {
        super(null);
        this.f80618 = str;
        this.f80619 = consumer;
    }

    @Override // p067l.C3494, net.p069sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f80618;
    }

    @Override // p067l.AbstractC20930
    /* JADX INFO: renamed from: ۖ */
    public final void mo21061(String str) {
        this.f80619.m45213n(C18524.m42109(str, new String[0]));
    }
}
