package p067l;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۜܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1179 extends C0969 {

    /* JADX INFO: renamed from: ۜ */
    public static boolean f23954;

    /* JADX INFO: renamed from: ܳ */
    public static boolean f23955;

    /* JADX INFO: renamed from: ܿ */
    public static Constructor f23956;

    /* JADX INFO: renamed from: ᩻ */
    public static Field f23957;

    /* JADX INFO: renamed from: ܽ */
    public WindowInsets f23958;

    /* JADX INFO: renamed from: ᩳ */
    public C1388 f23959;

    public C1179() {
        this.f23958 = m20387();
    }

    public C1179(C1914 c1914) {
        super(c1914);
        this.f23958 = c1914.m51171();
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ᩳ */
    public void mo10138(C1388 c1388) {
        WindowInsets windowInsets = this.f23958;
        if (windowInsets != null) {
            this.f23958 = windowInsets.replaceSystemWindowInsets(c1388.f36103, c1388.f36105, c1388.f36104, c1388.f36102);
        }
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ۧ */
    public void mo10135(C1388 c1388) {
        this.f23959 = c1388;
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ۧ */
    public C1914 mo10134() {
        m10131();
        C1914 c1914M51162 = C1914.m51162(null, this.f23958);
        c1914M51162.m51169(this.f10892);
        c1914M51162.m51167(this.f23959);
        return c1914M51162;
    }

    /* JADX INFO: renamed from: ܽ */
    public static WindowInsets m20387() {
        if (!f23954) {
            try {
                f23957 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f23954 = true;
        }
        Field field = f23957;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f23955) {
            try {
                f23956 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f23955 = true;
        }
        Constructor constructor = f23956;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }
}
