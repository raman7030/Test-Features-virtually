package p067l;

/* JADX INFO: renamed from: l.ܳᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16323 implements InterfaceC15532 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ long f47969;

    public C16323(long j) {
        this.f47969 = j;
    }

    @Override // p067l.InterfaceC15532
    public final Long apply(Object obj) {
        long jM46225 = ((C20487) obj).m46225();
        long j = this.f47969;
        if (jM46225 == j) {
            return Long.valueOf(j);
        }
        throw new C12776(C17520.m39893(C14536.m33191("Possible remote file corruption detected, server wrote less bytes (", ") in async mode than we sent (", jM46225), j, ")."));
    }
}
