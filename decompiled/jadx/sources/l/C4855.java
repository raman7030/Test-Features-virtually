package l;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۙ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C4855 implements InterfaceC13883 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2346 f15348;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f15349;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f15350;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0914 f15351;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f15352;

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo7139() {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ void mo7141() {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ISequentialOutStream mo14153() {
        return null;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo7142(int i) {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩻֫ */
    public final /* synthetic */ boolean mo7145() {
        return true;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩸ */
    public final String mo7144() {
        return C10395.m26212(mo7137());
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo7136(String str) {
        C10395.m26217(mo7137(), str);
    }

    public C4855(C2346 c2346, List list, AtomicReference atomicReference, C0914 c0914, AtomicInteger atomicInteger) {
        this.f15348 = c2346;
        this.f15350 = list;
        this.f15352 = atomicReference;
        this.f15351 = c0914;
        this.f15349 = atomicInteger;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۜ */
    public final String mo7137() {
        return this.f15348.m7650();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩳ֫ */
    public final IInArchive mo7143() {
        return this.f15348.m7659();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۧ */
    public final void mo7140(IInArchive iInArchive) {
        this.f15348.m7651(iInArchive);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14155(int i) {
        AtomicReference atomicReference = this.f15352;
        if (i >= 0) {
            List list = this.f15350;
            if (i < list.size()) {
                atomicReference.set(((C4007) list.get(i)).m12082());
                return;
            }
        }
        atomicReference.set(null);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo7138(int i) {
        if (i < 0) {
            return false;
        }
        List list = this.f15350;
        return i < list.size() && ((C4007) list.get(i)).m12075();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo14156() {
        this.f15352.set(null);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo14154() {
        this.f15351.cancel();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f15351.m3271();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14152(int i) {
        this.f15349.set(i);
    }
}
