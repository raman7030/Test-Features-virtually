package l;

/* JADX INFO: renamed from: l.᩶֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19835 extends EnumC19541 {
    public /* synthetic */ C19835() {
        this("ScriptDataLessthanSign", 16);
    }

    public C19835(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* JADX INFO: renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char cM41800 = c17842.m41800();
        if (cM41800 == '!') {
            c19129.m44163("<!");
            c19129.m44177(EnumC19541.f63149);
            return;
        }
        if (cM41800 == '/') {
            c19129.m44173();
            c19129.m44177(EnumC19541.f63183);
        } else if (cM41800 == 65535) {
            c19129.m44163("<");
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
        } else {
            c19129.m44163("<");
            c17842.m41798();
            c19129.m44177(EnumC19541.f63125);
        }
    }
}
