package p067l;

/* JADX INFO: renamed from: l.᩵ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes5.dex */
public final class C20773 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        C13731 c13731 = new C13731();
        try {
            C10537 c10537 = (C10537) ((C13731) c17613.m40106()).m31229();
            c13731.m31207((((long) c10537.m24275()) & 255) | ((((long) c10537.m24275()) & 255) << 8) | ((((long) c10537.m24275()) & 255) << 16) | ((((long) c10537.m24275()) & 255) << 24) | ((((long) c10537.m24275()) & 255) << 32) | ((((long) c10537.m24275()) & 255) << 40) | ((((long) c10537.m24275()) & 255) << 48) | ((255 & ((long) c10537.m24275())) << 56));
        } catch (Exception unused) {
            c13731.m31207(0L);
        }
        c17613.m40105(c13731);
    }
}
