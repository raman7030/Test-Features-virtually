package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14207 extends AbstractC7858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f42872;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f42873;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC0802 f42874;

    @Override // l.AbstractC7858
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21057() {
        return this.f42872;
    }

    public C14207(boolean z, boolean z2, EnumC0802 enumC0802) {
        this.f42872 = z;
        this.f42873 = z2;
        this.f42874 = enumC0802;
    }

    @Override // l.AbstractC7858
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo21058() {
        return this.f42873;
    }

    @Override // l.AbstractC7858
    /* JADX INFO: renamed from: ܽ */
    public final EnumC0802 mo21059() {
        return this.f42874;
    }

    public final String toString() {
        return "JavaFormatterOptions{formatJavadoc=" + this.f42872 + ", reorderModifiers=" + this.f42873 + ", style=" + this.f42874 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7858)) {
            return false;
        }
        AbstractC7858 abstractC7858 = (AbstractC7858) obj;
        return this.f42872 == abstractC7858.mo21057() && this.f42873 == abstractC7858.mo21058() && this.f42874.equals(abstractC7858.mo21059());
    }

    public final int hashCode() {
        return (((((this.f42872 ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.f42873 ? 1231 : 1237)) * 1000003) ^ this.f42874.hashCode();
    }
}
