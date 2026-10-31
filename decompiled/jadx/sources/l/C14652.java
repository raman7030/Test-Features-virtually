package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܳܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14652 implements InterfaceC0562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23825 f44784;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0562 f44785;

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2313(long j, C23411 c23411) {
        C4091.m12293(this, c23411, j);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2315(MessageDigest messageDigest, long j) {
        C4091.m12292(this, messageDigest, j);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC0562 mo2317() {
        return C4091.m12290(this);
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ۧ */
    public final long mo2316() {
        return size() - mo2312();
    }

    public C14652(C23825 c23825, InterfaceC0562 interfaceC0562) {
        this.f44785 = interfaceC0562;
        this.f44784 = c23825;
    }

    @Override // l.InterfaceC0562
    public final long size() {
        return this.f44785.size();
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final long mo2312() {
        return this.f44785.mo2312();
    }

    @Override // l.InterfaceC0562
    public final void reset() {
        this.f44785.reset();
    }

    @Override // l.InterfaceC0562
    /* JADX INFO: renamed from: ֫ */
    public final void mo2314(OutputStream outputStream, long j) {
        this.f44785.mo2314(new C17475(this, outputStream), j);
    }
}
