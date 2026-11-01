package p067l;

import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79CQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7472 {

    /* JADX INFO: renamed from: ֫ */
    public int f19553;

    /* JADX INFO: renamed from: ۜ */
    public int f19554;

    /* JADX INFO: renamed from: ۧ */
    public Field f19555;

    /* JADX INFO: renamed from: ܳ */
    public int f19556;

    /* JADX INFO: renamed from: ܽ */
    public int f19557;

    /* JADX INFO: renamed from: ܿ */
    public Method f19558;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f19559;

    /* JADX INFO: renamed from: ᩷ */
    public Field f19560;

    /* JADX INFO: renamed from: ᩻ */
    public Field f19561;

    public C7472(Object obj) {
        this.f19559 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f19555 = cls.getDeclaredField("contentInsets");
        } catch (Exception unused) {
            this.f19555 = null;
        }
        try {
            this.f19560 = cls.getDeclaredField("visibleInsets");
        } catch (Exception unused2) {
            this.f19560 = null;
        }
        try {
            this.f19561 = cls.getDeclaredField("touchableRegion");
        } catch (Exception unused3) {
            this.f19561 = null;
        }
        try {
            this.f19557 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_FRAME").get(null)).intValue();
            this.f19553 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_CONTENT").get(null)).intValue();
            this.f19554 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_VISIBLE").get(null)).intValue();
            this.f19556 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_REGION").get(null)).intValue();
        } catch (Exception unused4) {
        }
        try {
            this.f19558 = cls.getDeclaredMethod("setTouchableInsets", Integer.TYPE);
        } catch (Exception unused5) {
            this.f19558 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Rect m17252() {
        Field field = this.f19555;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f19559);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Rect m17254() {
        Field field = this.f19560;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f19559);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Region m17253() {
        Field field = this.f19561;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Region) field.get(this.f19559);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17255() {
        int i;
        Method method = this.f19558;
        if (method == null) {
            return;
        }
        int i2 = this.f19556;
        int i3 = this.f19557;
        int i4 = this.f19553;
        if (i3 == i4 && i4 == (i = this.f19554) && i == i2) {
            return;
        }
        try {
            method.invoke(this.f19559, Integer.valueOf(i2));
        } catch (Exception unused) {
        }
    }
}
