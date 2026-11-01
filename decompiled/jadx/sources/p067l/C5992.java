package p067l;

/* JADX INFO: renamed from: l.ۘ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5992 extends EnumC20940 {
    public /* synthetic */ C5992() {
        this("AttributeValue_singleQuoted", 38);
    }

    public C5992(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        String strM44026 = c19325.m44026(true);
        if (strM44026.length() > 0) {
            c20548.f63519.m24222(strM44026);
        } else {
            c20548.f63519.m24218();
        }
        char cM44046 = c19325.m44046();
        if (cM44046 == 0) {
            c20548.m46468(this);
            c20548.f63519.m24221((char) 65533);
            return;
        }
        if (cM44046 == 65535) {
            c20548.m46465(this);
            c20548.m46471(EnumC20940.f65740);
            return;
        }
        if (cM44046 != '&') {
            if (cM44046 == '\'') {
                c20548.m46471(EnumC20940.f65799);
                return;
            } else {
                c20548.f63519.m24221(cM44046);
                return;
            }
        }
        int[] iArrM46462 = c20548.m46462((Character) '\'', true);
        if (iArrM46462 != null) {
            c20548.f63519.m24217(iArrM46462);
        } else {
            c20548.f63519.m24221('&');
        }
    }
}
