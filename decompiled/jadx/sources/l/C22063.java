package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩹ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C22063 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f70705;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f70706;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Drawable f70707;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f70708;

    public C22063(int i, int i2, CharSequence charSequence, Drawable drawable) {
        this.f70706 = i;
        this.f70705 = i2;
        this.f70708 = charSequence == null ? null : charSequence.toString();
        this.f70707 = drawable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22063 m49644(MenuItem menuItem) {
        return new C22063(menuItem.getItemId(), menuItem.getGroupId(), menuItem.getTitle(), menuItem.getIcon());
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f70706), Integer.valueOf(this.f70705), this.f70708, this.f70707);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22063)) {
            return false;
        }
        C22063 c22063 = (C22063) obj;
        return this.f70706 == c22063.f70706 && this.f70705 == c22063.f70705 && TextUtils.equals(this.f70708, c22063.f70708) && C11003.equals(this.f70707, c22063.f70707);
    }
}
