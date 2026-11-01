package p067l;

/* JADX INFO: renamed from: l.ܶ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16719 extends EnumC20940 {
    public /* synthetic */ C16719() {
        this("CommentStart", 44);
    }

    public C16719(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        char cM44046 = c19325.m44046();
        if (cM44046 == 0) {
            c20548.m46468(this);
            c20548.f63523.m35979((char) 65533);
            c20548.m46471(EnumC20940.f65766);
            return;
        }
        if (cM44046 == '-') {
            c20548.m46471(EnumC20940.f65797);
            return;
        }
        if (cM44046 == '>') {
            c20548.m46468(this);
            c20548.m46470();
            c20548.m46471(EnumC20940.f65740);
        } else if (cM44046 == 65535) {
            c20548.m46465(this);
            c20548.m46470();
            c20548.m46471(EnumC20940.f65740);
        } else {
            c19325.m44044();
            c20548.m46471(EnumC20940.f65766);
        }
    }
}
