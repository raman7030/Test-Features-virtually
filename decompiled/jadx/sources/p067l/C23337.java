package p067l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩹ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C23337 {

    /* JADX INFO: renamed from: ֫ */
    public final int f73422;

    /* JADX INFO: renamed from: ۧ */
    public final int f73423;

    /* JADX INFO: renamed from: ܽ */
    public final Drawable f73424;

    /* JADX INFO: renamed from: ᩳ */
    public final String f73425;

    public C23337(int i, int i2, CharSequence charSequence, Drawable drawable) {
        this.f73423 = i;
        this.f73422 = i2;
        this.f73425 = charSequence == null ? null : charSequence.toString();
        this.f73424 = drawable;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23337 m51980(MenuItem menuItem) {
        return new C23337(menuItem.getItemId(), menuItem.getGroupId(), menuItem.getTitle(), menuItem.getIcon());
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f73423), Integer.valueOf(this.f73422), this.f73425, this.f73424);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23337)) {
            return false;
        }
        C23337 c23337 = (C23337) obj;
        return this.f73423 == c23337.f73423 && this.f73422 == c23337.f73422 && TextUtils.equals(this.f73425, c23337.f73425) && C12826.equals(this.f73424, c23337.f73424);
    }
}
