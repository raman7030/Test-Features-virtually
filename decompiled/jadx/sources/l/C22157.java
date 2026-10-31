package l;

/* JADX INFO: renamed from: l.᩹۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C22157 extends EnumC19541 {
    public /* synthetic */ C22157() {
        this("Comment", 46);
    }

    public C22157(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41799 = c17842.m41799();
        if (cM41799 == 0) {
            c19129.m44174(this);
            c17842.m41782();
            c19129.f60291.m33847((char) 65533);
        } else if (cM41799 == '-') {
            c19129.m44167(EnumC19541.f63131);
        } else {
            if (cM41799 == 65535) {
                c19129.m44171(this);
                c19129.m44176();
                c19129.m44177(EnumC19541.f63120);
                return;
            }
            c19129.f60291.m33848(c17842.m41781('-', 0));
        }
    }
}
