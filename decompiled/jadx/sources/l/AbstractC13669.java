package l;

/* JADX INFO: renamed from: l.ܰ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13669 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC17734 f40749;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo9436();

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo9438();

    public AbstractC13669(EnumC17734 enumC17734) {
        this.f40749 = enumC17734;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m32836() {
        String strMo9436 = mo9436();
        int length = strMo9436.length();
        int iCharCount = 0;
        while (true) {
            EnumC17734 enumC17734 = this.f40749;
            if (iCharCount >= length) {
                return C4860.m14172(" { ", enumC17734.m41545(), " } ");
            }
            int iCodePointAt = strMo9436.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return C20087.m46306(" { ", enumC17734.m41545(), " ", strMo9436, " } ");
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public final String toString() {
        return C22870.m50967(this.f40749.m41547().m38466(), "_target ", mo9438());
    }
}
