package p067l;

/* JADX INFO: renamed from: l.᩵۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20745 extends EnumC20940 {
    public /* synthetic */ C20745() {
        this("AttributeValue_unquoted", 39);
    }

    public C20745(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC20940
    /* JADX INFO: renamed from: ֫ */
    public void mo3428(C20548 c20548, C19325 c19325) {
        String strM44038 = c19325.m44038(EnumC20940.f65809);
        if (strM44038.length() > 0) {
            c20548.f63519.m24222(strM44038);
        }
        char cM44046 = c19325.m44046();
        if (cM44046 != 0) {
            if (cM44046 != ' ') {
                if (cM44046 != '\"' && cM44046 != '`') {
                    if (cM44046 == 65535) {
                        c20548.m46465(this);
                        c20548.m46471(EnumC20940.f65740);
                        return;
                    }
                    if (cM44046 != '\t' && cM44046 != '\n' && cM44046 != '\f' && cM44046 != '\r') {
                        if (cM44046 == '&') {
                            int[] iArrM46462 = c20548.m46462((Character) '>', true);
                            if (iArrM46462 != null) {
                                c20548.f63519.m24217(iArrM46462);
                                return;
                            } else {
                                c20548.f63519.m24221('&');
                                return;
                            }
                        }
                        if (cM44046 != '\'') {
                            switch (cM44046) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c20548.m46466();
                                    c20548.m46471(EnumC20940.f65740);
                                    break;
                                default:
                                    c20548.f63519.m24221(cM44046);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c20548.m46468(this);
                c20548.f63519.m24221(cM44046);
                return;
            }
            c20548.m46471(EnumC20940.f65762);
            return;
        }
        c20548.m46468(this);
        c20548.f63519.m24221((char) 65533);
    }
}
