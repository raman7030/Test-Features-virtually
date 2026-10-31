package l;

/* JADX INFO: renamed from: l.᩵ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes5.dex */
public final class C19365 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        C11955 c11955 = new C11955();
        try {
            C8595 c8595 = (C8595) ((C11955) c16040.m37919()).m29175();
            c11955.m29153((((long) c8595.m22306()) & 255) | ((((long) c8595.m22306()) & 255) << 8) | ((((long) c8595.m22306()) & 255) << 16) | ((((long) c8595.m22306()) & 255) << 24) | ((((long) c8595.m22306()) & 255) << 32) | ((((long) c8595.m22306()) & 255) << 40) | ((((long) c8595.m22306()) & 255) << 48) | ((255 & ((long) c8595.m22306())) << 56));
        } catch (Exception unused) {
            c11955.m29153(0L);
        }
        c16040.m37918(c11955);
    }
}
