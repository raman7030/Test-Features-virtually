package l;

import java.util.concurrent.atomic.AtomicBoolean;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܽۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C16456 implements InterfaceC21213 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15750 f50587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f50588;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2346 f50589;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8383 f50590;

    public C16456(C2346 c2346, C15750 c15750, AtomicBoolean atomicBoolean, C8383 c8383) {
        this.f50589 = c2346;
        this.f50587 = c15750;
        this.f50588 = atomicBoolean;
        this.f50590 = c8383;
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ֫ */
    public final void mo18444(IInArchive iInArchive) {
        try {
            this.f50589.m7633(iInArchive, this.f50587);
        } catch (Throwable th) {
            C0349.m1793(iInArchive);
            throw th;
        }
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ܽ */
    public final void mo18445() {
        this.f50588.set(true);
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ֫ */
    public final void mo18443(AbstractC15440 abstractC15440) {
        this.f50587.m37147(abstractC15440);
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f50590.getAsBoolean();
    }
}
