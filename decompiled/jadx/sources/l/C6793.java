package l;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6793 extends C2560 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f21076;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f21077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Constructor f21078;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Field f21079;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public WindowInsets f21080;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11007 f21081;

    public C6793() {
        this.f21080 = m18438();
    }

    public C6793(C21610 c21610) {
        super(c21610);
        this.f21080 = c21610.m48823();
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ᩳ */
    public void mo8106(C11007 c11007) {
        WindowInsets windowInsets = this.f21080;
        if (windowInsets != null) {
            this.f21080 = windowInsets.replaceSystemWindowInsets(c11007.f33109, c11007.f33111, c11007.f33110, c11007.f33108);
        }
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ۧ */
    public void mo8103(C11007 c11007) {
        this.f21081 = c11007;
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ۧ */
    public C21610 mo8102() {
        m8099();
        C21610 c21610M48814 = C21610.m48814(null, this.f21080);
        c21610M48814.m48821(this.f8102);
        c21610M48814.m48819(this.f21081);
        return c21610M48814;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m18438() {
        if (!f21076) {
            try {
                f21079 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f21076 = true;
        }
        Field field = f21079;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f21077) {
            try {
                f21078 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f21077 = true;
        }
        Constructor constructor = f21078;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }
}
