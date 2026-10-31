package l;

/* JADX INFO: renamed from: l.᩷᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21097 extends AbstractC18980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f68038;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f68039;

    public C21097(EnumC1340 enumC1340, String str, int i) {
        super(enumC1340);
        this.f68039 = str;
        this.f68038 = i;
    }

    @Override // l.AbstractC18980, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C21097(this.f25745, this.f68039, this.f68038);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C21097(this.f25745, this.f68039, this.f68038);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        int i = C6985.f21533[this.f25745.ordinal()];
        if (i == 1) {
            return "@this";
        }
        if (i != 2) {
            return i != 3 ? mo6719() : "@Exception";
        }
        return "@parameter_" + this.f68038;
    }
}
