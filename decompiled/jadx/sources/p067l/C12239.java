package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O9NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12239 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C12239 f34195 = new C12239(1);

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13045.m29867(view, "viewParent");
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof InterfaceC24784) {
            return (InterfaceC24784) tag;
        }
        return null;
    }
}
