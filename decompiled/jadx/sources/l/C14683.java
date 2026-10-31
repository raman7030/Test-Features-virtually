package l;

/* JADX INFO: renamed from: l.ܳᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14683 implements InterfaceC13851 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f44854;

    public C14683(long j) {
        this.f44854 = j;
    }

    @Override // l.InterfaceC13851
    public final Long apply(Object obj) {
        long jM43931 = ((C19064) obj).m43931();
        long j = this.f44854;
        if (jM43931 == j) {
            return Long.valueOf(j);
        }
        throw new C10951(C15942.m37718(C12803.m31106("Possible remote file corruption detected, server wrote less bytes (", ") in async mode than we sent (", jM43931), j, ")."));
    }
}
