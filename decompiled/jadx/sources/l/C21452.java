package l;

/* JADX INFO: renamed from: l.᩸۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21452 extends EnumC19541 {
    public /* synthetic */ C21452() {
        this("CommentStartDash", 45);
    }

    public C21452(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41800 = c17842.m41800();
        if (cM41800 == 0) {
            c19129.m44174(this);
            c19129.f60291.m33847((char) 65533);
            c19129.m44177(EnumC19541.f63146);
            return;
        }
        if (cM41800 == '-') {
            c19129.m44177(EnumC19541.f63167);
            return;
        }
        if (cM41800 == '>') {
            c19129.m44174(this);
            c19129.m44176();
            c19129.m44177(EnumC19541.f63120);
        } else if (cM41800 == 65535) {
            c19129.m44171(this);
            c19129.m44176();
            c19129.m44177(EnumC19541.f63120);
        } else {
            c19129.f60291.m33847(cM41800);
            c19129.m44177(EnumC19541.f63146);
        }
    }
}
