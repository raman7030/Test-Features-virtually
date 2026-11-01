package p067l;

/* JADX INFO: renamed from: l.۫۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14160 implements InterfaceC20145 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC20145 f40384;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8125 f40385;

    public C14160(InterfaceC20145 interfaceC20145, C8125 c8125) {
        this.f40384 = interfaceC20145;
        this.f40385 = c8125;
    }

    @Override // p067l.InterfaceC20145
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13686(InterfaceC20816 interfaceC20816, InterfaceC13575 interfaceC13575) {
        Object objMo13686 = this.f40384.mo13686(new C14830(interfaceC20816, this.f40385), interfaceC13575);
        return objMo13686 == EnumC9061.COROUTINE_SUSPENDED ? objMo13686 : C10027.f27775;
    }
}
