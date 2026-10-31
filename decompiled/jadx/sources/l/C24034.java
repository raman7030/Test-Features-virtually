package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24034 extends AbstractC19530 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77866;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f77867;

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24034(String str, Consumer consumer) {
        super(null);
        this.f77866 = str;
        this.f77867 = consumer;
    }

    @Override // l.C1184, net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f77866;
    }

    @Override // l.AbstractC19530
    /* JADX INFO: renamed from: ۖ */
    public final void mo19103(String str) {
        this.f77867.n(C16999.m39866(str, new String[0]));
    }
}
