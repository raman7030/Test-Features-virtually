package l;

import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79CQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5370 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16715;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f16716;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Field f16717;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f16718;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16719;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Method f16720;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f16721;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Field f16722;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Field f16723;

    public C5370(Object obj) {
        this.f16721 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f16717 = cls.getDeclaredField("contentInsets");
        } catch (Exception unused) {
            this.f16717 = null;
        }
        try {
            this.f16722 = cls.getDeclaredField("visibleInsets");
        } catch (Exception unused2) {
            this.f16722 = null;
        }
        try {
            this.f16723 = cls.getDeclaredField("touchableRegion");
        } catch (Exception unused3) {
            this.f16723 = null;
        }
        try {
            this.f16719 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_FRAME").get(null)).intValue();
            this.f16715 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_CONTENT").get(null)).intValue();
            this.f16716 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_VISIBLE").get(null)).intValue();
            this.f16718 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_REGION").get(null)).intValue();
        } catch (Exception unused4) {
        }
        try {
            this.f16720 = cls.getDeclaredMethod("setTouchableInsets", Integer.TYPE);
        } catch (Exception unused5) {
            this.f16720 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect m15343() {
        Field field = this.f16717;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f16721);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect m15345() {
        Field field = this.f16722;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f16721);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Region m15344() {
        Field field = this.f16723;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Region) field.get(this.f16721);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15346() {
        int i;
        Method method = this.f16720;
        if (method == null) {
            return;
        }
        int i2 = this.f16718;
        int i3 = this.f16719;
        int i4 = this.f16715;
        if (i3 == i4 && i4 == (i = this.f16716) && i == i2) {
            return;
        }
        try {
            method.invoke(this.f16721, Integer.valueOf(i2));
        } catch (Exception unused) {
        }
    }
}
