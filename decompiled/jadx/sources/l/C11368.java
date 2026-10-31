package l;

/* JADX INFO: renamed from: l.ۨ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11368 extends EnumC19541 {
    public /* synthetic */ C11368() {
        this("ScriptDataEscapedDash", 22);
    }

    public C11368(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41785()) {
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        char cM41800 = c17842.m41800();
        if (cM41800 == 0) {
            c19129.m44174(this);
            c19129.m44162((char) 65533);
            c19129.m44177(EnumC19541.f63168);
        } else if (cM41800 == '-') {
            c19129.m44162(cM41800);
            c19129.m44177(EnumC19541.f63132);
        } else if (cM41800 == '<') {
            c19129.m44177(EnumC19541.f63121);
        } else {
            c19129.m44162(cM41800);
            c19129.m44177(EnumC19541.f63168);
        }
    }
}
