package p067l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܳܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16294 implements InterfaceC2903 {

    /* JADX INFO: renamed from: ֫ */
    public final C25012 f47891;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2903 f47892;

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4681(long j, C24618 c24618) {
        C6257.m14198(this, c24618, j);
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4683(MessageDigest messageDigest, long j) {
        C6257.m14197(this, messageDigest, j);
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC2903 mo4685() {
        return C6257.m14195(this);
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ۧ */
    public final long mo4684() {
        return size() - mo4680();
    }

    public C16294(C25012 c25012, InterfaceC2903 interfaceC2903) {
        this.f47892 = interfaceC2903;
        this.f47891 = c25012;
    }

    @Override // p067l.InterfaceC2903
    public final long size() {
        return this.f47892.size();
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final long mo4680() {
        return this.f47892.mo4680();
    }

    @Override // p067l.InterfaceC2903
    public final void reset() {
        this.f47892.reset();
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final void mo4682(OutputStream outputStream, long j) {
        this.f47892.mo4682(new C18977(this, outputStream), j);
    }
}
