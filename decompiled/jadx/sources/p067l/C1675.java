package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽᩳ */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C1675 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C1675 f54740 = new C1675(1);

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13045.m29867(view, "it");
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof InterfaceC1988) {
            return (InterfaceC1988) tag;
        }
        return null;
    }
}
