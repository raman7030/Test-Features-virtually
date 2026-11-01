package p067l;

/* JADX INFO: renamed from: l.۫ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8EG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13985 extends C17278 {

    /* JADX INFO: renamed from: ۧ֫ */
    public long f39472;

    /* JADX INFO: renamed from: ܽ֫ */
    public EnumC17494 f39473;

    public C13985(String str, long j, long j2, long j3, EnumC17494 enumC17494) {
        super(str, "", null, j, j3, true);
        this.f39473 = enumC17494;
        this.f39472 = j2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m31783() {
        return this.f39472;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC17494 m31784() {
        return this.f39473;
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۗ֫ */
    public final CharSequence mo31782() {
        if (getSize() != -1) {
            return null;
        }
        return "↘️ " + C24158.m53411(this.f39472);
    }
}
