package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9BL */
/* JADX INFO: loaded from: classes.dex */
public final class C24669 extends AbstractC21988 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f78041 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15951 f78042;

    /* JADX INFO: renamed from: ܽ */
    public final C11259 f78043;

    public C24669(C11259 c11259, AbstractC15951 abstractC15951) {
        this.f78043 = c11259;
        this.f78042 = abstractC15951;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ֫ */
    public final void mo26163(String str) {
        this.f78041.add(str);
        this.f78042.getClass();
        this.f78043.mo26163(AbstractC15951.m36206(str));
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܽ */
    public final void mo26171(String str) {
        ArrayList arrayList = this.f78041;
        String str2 = (String) C6406.m14670(arrayList, 1);
        String str3 = str2 + "$" + str;
        arrayList.add(str3);
        this.f78042.getClass();
        String strM40053 = C17588.m40053(AbstractC15951.m36206(str2), "$");
        String strM36206 = AbstractC15951.m36206(str3);
        this.f78043.mo26171(strM36206.substring(strM36206.startsWith(strM40053) ? strM40053.length() : strM36206.lastIndexOf(36) + 1));
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۧ */
    public final void mo26168(String str) {
        this.f78043.mo26168(str);
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩳ */
    public final void mo26174(String str) {
        this.f78043.mo26174(str);
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21988 mo26161() {
        this.f78043.mo26161();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ֫ */
    public final void mo26162(char c) {
        this.f78043.mo26162(c);
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21988 mo26166() {
        this.f78043.getClass();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC21988 mo26173() {
        this.f78043.mo26173();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21988 mo26172() {
        this.f78043.getClass();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC21988 mo26169() {
        this.f78043.mo26169();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC21988 mo26176() {
        this.f78043.mo26176();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC21988 mo26164() {
        this.f78043.mo26164();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC21988 mo26175() {
        this.f78043.mo26175();
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۢ */
    public final void mo26165() {
        this.f78043.mo26165();
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21988 mo26167(char c) {
        this.f78043.mo26167(c);
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܽ */
    public final void mo26170() {
        this.f78043.mo26170();
        C19925.m45229(this.f78041, 1);
    }
}
