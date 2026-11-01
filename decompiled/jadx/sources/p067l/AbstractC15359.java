package p067l;

/* JADX INFO: renamed from: l.ܰ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15359 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public EnumC19222 f43830;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo11479();

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo11481();

    public AbstractC15359(EnumC19222 enumC19222) {
        this.f43830 = enumC19222;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m34951() {
        String strMo11479 = mo11479();
        int length = strMo11479.length();
        int iCharCount = 0;
        while (true) {
            EnumC19222 enumC19222 = this.f43830;
            if (iCharCount >= length) {
                return C6988.m16053(" { ", enumC19222.m43790(), " } ");
            }
            int iCodePointAt = strMo11479.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return C21459.m48622(" { ", enumC19222.m43790(), " ", strMo11479, " } ");
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public final String toString() {
        return C24104.m53357(this.f43830.m43792().m40681(), "_target ", mo11481());
    }
}
