package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9537 extends C8377 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f26222 = new ArrayList();

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final void mo19530(Object obj, String str) {
        this.f26222.add(obj);
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final C8377 mo19522(String str, String str2) {
        C13071 c13071 = new C13071(str2, EnumC18254.RUNTIME);
        this.f26222.add(c13071);
        return c13071;
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final C8377 mo19521(String str) {
        return new C15571(this);
    }

    @Override // p067l.C8377
    /* JADX INFO: renamed from: ֫ */
    public final void mo19531(String str, String str2, String str3) {
        this.f26222.add(new C15376(null, str3, str2));
    }
}
