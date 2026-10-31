package l;

/* JADX INFO: renamed from: l.ۤ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10163 extends EnumC19541 {
    public /* synthetic */ C10163() {
        this("BeforeDoctypeName", 51);
    }

    public C10163(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41808()) {
            c19129.f60286.mo7259();
            c19129.m44177(EnumC19541.f63122);
            return;
        }
        char cM41800 = c17842.m41800();
        if (cM41800 == 0) {
            c19129.m44174(this);
            C23361 c23361 = c19129.f60286;
            c23361.mo7259();
            c23361.f75040.append((char) 65533);
            c19129.m44177(EnumC19541.f63122);
            return;
        }
        if (cM41800 != ' ') {
            if (cM41800 == 65535) {
                c19129.m44171(this);
                C23361 c23362 = c19129.f60286;
                c23362.mo7259();
                c23362.f75041 = true;
                c19129.m44175();
                c19129.m44177(EnumC19541.f63120);
                return;
            }
            if (cM41800 == '\t' || cM41800 == '\n' || cM41800 == '\f' || cM41800 == '\r') {
                return;
            }
            c19129.f60286.mo7259();
            c19129.f60286.f75040.append(cM41800);
            c19129.m44177(EnumC19541.f63122);
        }
    }
}
