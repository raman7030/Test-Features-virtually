package l;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public class C18916 implements InterfaceC20814 {
    @Override // l.InterfaceC20814
    /* JADX INFO: renamed from: ֫ */
    public final Object mo35812(Context context) {
        C9744 c9744 = new C9744(new C2688(context));
        c9744.f23457 = 1;
        C6921.m18712(c9744);
        AbstractC7379 lifecycle = ((InterfaceC23586) C23635.m52130(context).m52131()).getLifecycle();
        lifecycle.mo19833(new C21033(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // l.InterfaceC20814
    /* JADX INFO: renamed from: ֫ */
    public final List mo35813() {
        return Collections.singletonList(C15118.class);
    }
}
