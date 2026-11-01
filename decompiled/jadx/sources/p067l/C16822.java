package p067l;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: l.ܶۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16822 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((View) obj).getClipBounds();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((View) obj).setClipBounds((Rect) obj2);
    }
}
