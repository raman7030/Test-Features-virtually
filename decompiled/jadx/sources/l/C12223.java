package l;

/* JADX INFO: renamed from: l.۫ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8EG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12223 extends C15688 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f36458;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public EnumC15915 f36459;

    public C12223(String str, long j, long j2, long j3, EnumC15915 enumC15915) {
        super(str, "", null, j, j3, true);
        this.f36459 = enumC15915;
        this.f36458 = j2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m29721() {
        return this.f36458;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC15915 m29722() {
        return this.f36459;
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence mo29720() {
        if (getSize() != -1) {
            return null;
        }
        return "↘️ " + C22927.m51020(this.f36458);
    }
}
