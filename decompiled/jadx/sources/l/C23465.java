package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9BL */
/* JADX INFO: loaded from: classes.dex */
public final class C23465 extends AbstractC20644 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f75294 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14292 f75295;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9355 f75296;

    public C23465(C9355 c9355, AbstractC14292 abstractC14292) {
        this.f75296 = c9355;
        this.f75295 = abstractC14292;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ֫ */
    public final void mo24153(String str) {
        this.f75294.add(str);
        this.f75295.getClass();
        this.f75296.mo24153(AbstractC14292.m34073(str));
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܽ */
    public final void mo24161(String str) {
        ArrayList arrayList = this.f75294;
        String str2 = (String) C4248.m12790(arrayList, 1);
        String str3 = str2 + "$" + str;
        arrayList.add(str3);
        this.f75295.getClass();
        String strM37867 = C16014.m37867(AbstractC14292.m34073(str2), "$");
        String strM34073 = AbstractC14292.m34073(str3);
        this.f75296.mo24161(strM34073.substring(strM34073.startsWith(strM37867) ? strM37867.length() : strM34073.lastIndexOf(36) + 1));
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۧ */
    public final void mo24158(String str) {
        this.f75296.mo24158(str);
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩳ */
    public final void mo24164(String str) {
        this.f75296.mo24164(str);
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20644 mo24151() {
        this.f75296.mo24151();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ֫ */
    public final void mo24152(char c) {
        this.f75296.mo24152(c);
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC20644 mo24156() {
        this.f75296.getClass();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC20644 mo24163() {
        this.f75296.mo24163();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC20644 mo24162() {
        this.f75296.getClass();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC20644 mo24159() {
        this.f75296.mo24159();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC20644 mo24166() {
        this.f75296.mo24166();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC20644 mo24154() {
        this.f75296.mo24154();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC20644 mo24165() {
        this.f75296.mo24165();
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۢ */
    public final void mo24155() {
        this.f75296.mo24155();
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC20644 mo24157(char c) {
        this.f75296.mo24157(c);
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܽ */
    public final void mo24160() {
        this.f75296.mo24160();
        C18473.m42953(this.f75294, 1);
    }
}
