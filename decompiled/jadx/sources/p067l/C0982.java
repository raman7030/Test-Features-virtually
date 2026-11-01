package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۖ᩺ */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0982 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C0982 f11861 = new C0982(1);

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C1052(viewGroup);
        }
        return null;
    }
}
