package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֨ۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0896 extends AbstractC1841 {
    @Override // p067l.AbstractC1841
    /* JADX INFO: renamed from: ֫ */
    public final void mo6027(View view, Object obj) {
        C1981.m53481(view, ((Boolean) obj).booleanValue());
    }

    @Override // p067l.AbstractC1841
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6028(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
    }

    @Override // p067l.AbstractC1841
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6026(View view) {
        return Boolean.valueOf(C1981.m53483(view));
    }
}
