package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7543 extends C6322 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f23309 = new ArrayList();

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final void mo17590(Object obj, String str) {
        this.f23309.add(obj);
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final C6322 mo17582(String str, String str2) {
        C11261 c11261 = new C11261(str2, EnumC16715.RUNTIME);
        this.f23309.add(c11261);
        return c11261;
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final C6322 mo17581(String str) {
        return new C13892(this);
    }

    @Override // l.C6322
    /* JADX INFO: renamed from: ֫ */
    public final void mo17591(String str, String str2, String str3) {
        this.f23309.add(new C13687(null, str3, str2));
    }
}
