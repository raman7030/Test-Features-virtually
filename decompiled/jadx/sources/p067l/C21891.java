package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩷֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21891 extends AbstractC15669 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC17195 f68830;

    public C21891(AbstractC17195 abstractC17195) {
        this.f68830 = abstractC17195;
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4510(C16637 c16637, Object obj) {
        Locale locale = (Locale) obj;
        AbstractC17195 abstractC17195 = this.f68830;
        if (!abstractC17195.f51186.contains(c16637)) {
            abstractC17195.f51186 = abstractC17195.f51186.m10286(c16637);
        }
        return super.m35599(c16637, locale);
    }

    @Override // p067l.AbstractC15669
    /* JADX INFO: renamed from: ֫ */
    public final String mo25477(Locale locale, String str, Object... objArr) {
        return this.f68830.mo38936(locale, str, objArr);
    }

    @Override // p067l.AbstractC15669
    /* JADX INFO: renamed from: ֫ */
    public final String mo25482(C16637 c16637) {
        return "" + (this.f68830.f51186.indexOf(c16637) + 1);
    }
}
