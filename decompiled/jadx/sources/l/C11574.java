package l;

/* JADX INFO: renamed from: l.ۨ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11574 extends EnumC19541 {
    public /* synthetic */ C11574() {
        this("AfterDoctypeName", 53);
    }

    public C11574(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41785()) {
            c19129.m44171(this);
            c19129.f60286.f75041 = true;
            c19129.m44175();
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        if (c17842.m41802('\t', '\n', '\r', '\f', ' ')) {
            c17842.m41782();
            return;
        }
        if (c17842.m41795('>')) {
            c19129.m44175();
            c19129.m44167(EnumC19541.f63120);
            return;
        }
        if (c17842.m41801("PUBLIC")) {
            c19129.f60286.f75039 = "PUBLIC";
            c19129.m44177(EnumC19541.f63158);
        } else if (c17842.m41801("SYSTEM")) {
            c19129.f60286.f75039 = "SYSTEM";
            c19129.m44177(EnumC19541.f63150);
        } else {
            c19129.m44174(this);
            c19129.f60286.f75041 = true;
            c19129.m44167(EnumC19541.f63192);
        }
    }
}
