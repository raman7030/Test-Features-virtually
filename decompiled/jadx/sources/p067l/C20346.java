package p067l;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public class C20346 implements InterfaceC22150 {
    @Override // p067l.InterfaceC22150
    /* JADX INFO: renamed from: ֫ */
    public final Object mo37970(Context context) {
        C11629 c11629 = new C11629(new C4923(context));
        c11629.f26368 = 1;
        C8946.m20661(c11629);
        AbstractC9381 lifecycle = ((InterfaceC24784) C24831.m54533(context).m54534()).getLifecycle();
        lifecycle.mo21806(new C22358(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p067l.InterfaceC22150
    /* JADX INFO: renamed from: ֫ */
    public final List mo37971() {
        return Collections.singletonList(C16736.class);
    }
}
