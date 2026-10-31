package l;

/* JADX INFO: renamed from: l.ۛ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5929 extends EnumC19541 {
    public /* synthetic */ C5929() {
        this("DoctypeName", 52);
    }

    public C5929(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41786()) {
            c19129.f60286.f75040.append(c17842.m41811());
            return;
        }
        char cM41800 = c17842.m41800();
        if (cM41800 != 0) {
            if (cM41800 != ' ') {
                if (cM41800 == '>') {
                    c19129.m44175();
                    c19129.m44177(EnumC19541.f63120);
                    return;
                }
                if (cM41800 == 65535) {
                    c19129.m44171(this);
                    c19129.f60286.f75041 = true;
                    c19129.m44175();
                    c19129.m44177(EnumC19541.f63120);
                    return;
                }
                if (cM41800 != '\t' && cM41800 != '\n' && cM41800 != '\f' && cM41800 != '\r') {
                    c19129.f60286.f75040.append(cM41800);
                    return;
                }
            }
            c19129.m44177(EnumC19541.f63133);
            return;
        }
        c19129.m44174(this);
        c19129.f60286.f75040.append((char) 65533);
    }
}
