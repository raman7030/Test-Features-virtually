package p067l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.᩶ۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1841 {

    /* JADX INFO: renamed from: ֫ */
    public final int f67848;

    /* JADX INFO: renamed from: ۧ */
    public final int f67849;

    /* JADX INFO: renamed from: ܽ */
    public final int f67850;

    /* JADX INFO: renamed from: ᩳ */
    public final Class f67851;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo6026(View view);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6027(View view, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo6028(Object obj, Object obj2);

    public AbstractC1841(int i, int i2, int i3, Class cls) {
        this.f67850 = i;
        this.f67851 = cls;
        this.f67848 = i2;
        this.f67849 = i3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m48701(View view) {
        if (Build.VERSION.SDK_INT >= this.f67849) {
            return mo6026(view);
        }
        Object tag = view.getTag(this.f67850);
        if (this.f67851.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48702(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f67849) {
            mo6027(view, obj);
            return;
        }
        if (mo6028(m48701(view), obj)) {
            C1658 c1658M43569 = C1717.m43569(view);
            if (c1658M43569 == null) {
                c1658M43569 = new C1658();
            }
            C1717.m43555(view, c1658M43569);
            view.setTag(this.f67850, obj);
            C1717.m43546(this.f67848, view);
        }
    }
}
