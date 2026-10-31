package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۘܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4078 extends Editable.Factory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f12996 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile Editable.Factory f12997;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class f12998;

    public static Editable.Factory getInstance() {
        if (f12997 == null) {
            synchronized (f12996) {
                if (f12997 == null) {
                    C4078 c4078 = new C4078();
                    try {
                        f12998 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C4078.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    f12997 = c4078;
                }
            }
        }
        return f12997;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f12998;
        if (cls != null) {
            return C7626.m20416(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
