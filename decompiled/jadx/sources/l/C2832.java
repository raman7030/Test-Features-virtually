package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2832 extends AbstractC16876 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C2832 f9064 = new C2832(1);

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C4243(viewGroup);
        }
        return null;
    }
}
