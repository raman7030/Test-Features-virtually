package p067l;

/* JADX INFO: renamed from: l.᩶۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21415 extends EnumC20940 {
    public /* synthetic */ C21415() {
        this("CommentEndDash", 47);
    }

    public C21415(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == 0) {
            c20548.m46468(this);
            C15852 c15852 = c20548.f63523;
            c15852.m35979('-');
            c15852.m35979((char) 65533);
            c20548.m46471(EnumC20940.f65766);
            return;
        }
        if (cM44046 == '-') {
            c20548.m46471(EnumC20940.f65787);
            return;
        }
        if (cM44046 == 65535) {
            c20548.m46465(this);
            c20548.m46470();
            c20548.m46471(EnumC20940.f65740);
        } else {
            C15852 c15853 = c20548.f63523;
            c15853.m35979('-');
            c15853.m35979(cM44046);
            c20548.m46471(EnumC20940.f65766);
        }
    }
}
