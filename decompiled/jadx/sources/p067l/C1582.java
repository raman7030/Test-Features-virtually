package p067l;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ֫ */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1582 {

    /* JADX INFO: renamed from: ֫ */
    public final C0882 f48594;

    /* JADX INFO: renamed from: ۧ */
    public final Set f48595;

    public C1582(Context context, C1560 c1560) {
        if (c1560 == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f48595 = C21562.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f48594 = new C1232(context, c1560);
        } else {
            this.f48594 = new C0882(context, c1560);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37519(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        this.f48594.f5692.dispatchMediaButtonEvent(keyEvent);
    }
}
