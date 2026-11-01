package p067l;

import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩸֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C22578 implements InterfaceC16706 {

    /* JADX INFO: renamed from: ֫ */
    public final int f71285;

    /* JADX INFO: renamed from: ۧ */
    public final int f71286;

    /* JADX INFO: renamed from: ܳ */
    public final int f71287;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f71288;

    /* JADX INFO: renamed from: ܿ */
    public final String f71289;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC21300 f71290;

    /* JADX INFO: renamed from: ᩻ */
    public final String f71291;

    public C22578(int i, String str, String str2, int i2, int i3, boolean z, EnumC21300 enumC21300) {
        this.f71286 = i;
        this.f71289 = str;
        this.f71291 = str2;
        this.f71287 = i2;
        this.f71285 = i3;
        this.f71288 = z;
        this.f71290 = enumC21300;
    }

    @Override // p067l.InterfaceC16706
    public final int getIndex() {
        return this.f71286;
    }

    @Override // p067l.InterfaceC16706
    public final String getText() {
        return this.f71291;
    }

    @Override // p067l.InterfaceC16706
    /* JADX INFO: renamed from: ᩳ */
    public final String mo37859() {
        return this.f71289;
    }

    @Override // p067l.InterfaceC16706
    public final int length() {
        return this.f71289.length();
    }

    @Override // p067l.InterfaceC16706
    public final int getPosition() {
        return this.f71287;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m50615() {
        return this.f71285;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m50613() {
        return this.f71288;
    }

    @Override // p067l.InterfaceC16706
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo37856() {
        return C14695.m33620(this.f71291);
    }

    @Override // p067l.InterfaceC16706
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo37854() {
        return this.f71291.startsWith("//");
    }

    @Override // p067l.InterfaceC16706
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo37857() {
        return this.f71291.startsWith("/*");
    }

    @Override // p067l.InterfaceC16706
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo37855() {
        String str = this.f71291;
        return str.startsWith("/**") && str.charAt(3) != '*' && str.length() > 4;
    }

    @Override // p067l.InterfaceC16706
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo37858() {
        return mo37854() || mo37857();
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25085("index", this.f71286);
        c10888M40057.m25084((Object) this.f71291, TextBundle.TEXT_ENTRY);
        c10888M40057.m25085("position", this.f71287);
        c10888M40057.m25085("columnI", this.f71285);
        c10888M40057.m25086("isToken", this.f71288);
        return c10888M40057.toString();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC21300 m50614() {
        return this.f71290;
    }
}
