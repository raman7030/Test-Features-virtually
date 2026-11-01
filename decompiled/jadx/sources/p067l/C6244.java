package p067l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۘܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6244 extends Editable.Factory {

    /* JADX INFO: renamed from: ֫ */
    public static final Object f15811 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public static volatile Editable.Factory f15812;

    /* JADX INFO: renamed from: ܽ */
    public static Class f15813;

    public static Editable.Factory getInstance() {
        if (f15812 == null) {
            synchronized (f15811) {
                if (f15812 == null) {
                    C6244 c6244 = new C6244();
                    try {
                        f15813 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C6244.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    f15812 = c6244;
                }
            }
        }
        return f15812;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f15813;
        if (cls != null) {
            return C9616.m22395(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
