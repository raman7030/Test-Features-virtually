package l;

import android.graphics.drawable.Drawable;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۘܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes2.dex */
public final class C4021 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f12756;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f12757;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f12758;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12759;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12760;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f12761;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f12762;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f12763;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f12764;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Drawable f12765;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4021)) {
            return false;
        }
        C4021 c4021 = (C4021) obj;
        return C11233.m27802((Object) this.f12760, (Object) c4021.f12760) && C11233.m27802((Object) this.f12761, (Object) c4021.f12761) && C11233.m27802((Object) this.f12758, (Object) c4021.f12758) && this.f12764 == c4021.f12764 && this.f12763 == c4021.f12763 && this.f12757 == c4021.f12757 && this.f12762 == c4021.f12762 && C11233.m27802(this.f12756, c4021.f12756) && C11233.m27802(this.f12765, c4021.f12765) && this.f12759 == c4021.f12759;
    }

    public final String toString() {
        StringBuilder sbM10501 = C3435.m10501("ApkInfo(packageName=", this.f12760, ", label=", this.f12761, ", versionName=");
        sbM10501.append(this.f12758);
        sbM10501.append(", versionCode=");
        sbM10501.append(this.f12764);
        sbM10501.append(", length=");
        sbM10501.append(this.f12763);
        sbM10501.append(", targetSdk=");
        C5834.m16344(sbM10501, this.f12757, ", minimumSdk=", this.f12762, ", icon=");
        sbM10501.append(this.f12756);
        sbM10501.append(", rawIcon=");
        sbM10501.append(this.f12765);
        sbM10501.append(", iconRes=");
        return C3200.m9831(this.f12759, MotionUtils.EASING_TYPE_FORMAT_END, sbM10501);
    }

    public final int hashCode() {
        int iM27349 = C11010.m27349(C11010.m27349(this.f12760.hashCode() * 31, 31, this.f12761), 31, this.f12758);
        long j = this.f12764;
        int i = (iM27349 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f12763;
        return ((this.f12765.hashCode() + ((this.f12756.hashCode() + ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f12757) * 31) + this.f12762) * 31)) * 31)) * 31) + this.f12759;
    }

    public C4021(String str, String str2, String str3, long j, long j2, int i, int i2, Drawable drawable, Drawable drawable2, int i3) {
        C11233.m27805(str2, AnnotatedPrivateKey.LABEL);
        this.f12760 = str;
        this.f12761 = str2;
        this.f12758 = str3;
        this.f12764 = j;
        this.f12763 = j2;
        this.f12757 = i;
        this.f12762 = i2;
        this.f12756 = drawable;
        this.f12765 = drawable2;
        this.f12759 = i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m12094() {
        return this.f12760;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m12095() {
        return this.f12761;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m12092() {
        return this.f12758;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m12098() {
        return this.f12764;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m12097() {
        return this.f12763;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m12091() {
        return this.f12757;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m12096() {
        return this.f12762;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m12090() {
        return this.f12756;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Drawable m12099() {
        return this.f12765;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12093() {
        return this.f12759;
    }
}
