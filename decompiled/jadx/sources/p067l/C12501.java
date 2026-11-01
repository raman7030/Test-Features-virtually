package p067l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12501 {

    /* JADX INFO: renamed from: ۧ */
    public C3783 f35042;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC2833 f35044;

    /* JADX INFO: renamed from: ܽ */
    public boolean f35043 = false;

    /* JADX INFO: renamed from: ֫ */
    public C9266 f35041 = new C9266(0);

    public C12501(AbstractC2833 abstractC2833) {
        this.f35044 = abstractC2833;
        this.f35042 = abstractC2833.mo4527();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3092 m28797(String str, String str2) {
        StringReader stringReader = new StringReader(str);
        AbstractC2833 abstractC2833 = this.f35044;
        abstractC2833.mo4521(stringReader, str2, this);
        abstractC2833.m4529();
        abstractC2833.f4879.m44039();
        abstractC2833.f4879 = null;
        abstractC2833.f4876 = null;
        abstractC2833.f4884 = null;
        abstractC2833.f4885 = null;
        return abstractC2833.f4881;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m28796(String str, C21199 c21199, String str2) {
        return this.f35044.mo4518(str, c21199, str2, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28799(String str) {
        return this.f35044.mo4528(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m28800() {
        this.f35041.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9266 m28798() {
        return this.f35041;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m28801() {
        return this.f35043;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m28804() {
        this.f35043 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28803() {
        this.f35042 = C3783.f8102;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C3783 m28802() {
        return this.f35042;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C12501 m28795() {
        return new C12501(new C3504());
    }
}
