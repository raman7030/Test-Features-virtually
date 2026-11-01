package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes5.dex */
public final class C18964 extends AbstractC7565 {
    @Override // p067l.AbstractC16951
    public final float getValue(Object obj) {
        return ((View) obj).getScrollY();
    }

    @Override // p067l.AbstractC16951
    public final void setValue(Object obj, float f) {
        ((View) obj).setScrollY((int) f);
    }
}
