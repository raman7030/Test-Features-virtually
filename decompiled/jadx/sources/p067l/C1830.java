package p067l;

import android.util.Property;

/* JADX INFO: renamed from: l.᩶ۘ */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes4.dex */
public final class C1830 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((C0990) obj).mThumbPosition);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((C0990) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
