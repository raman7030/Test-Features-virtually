package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18383 extends AbstractC19054 {

    /* JADX INFO: renamed from: ۧ */
    public final String[] f54896;

    /* JADX INFO: renamed from: ܽ */
    public final String f54897;

    public C18383(String str, String str2, String[] strArr) {
        super(str);
        this.f54897 = str2;
        this.f54896 = strArr;
    }

    @Override // p067l.AbstractC19054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19054 mo29840(String str) {
        return new C18383(str, this.f54897, this.f54896);
    }

    @Override // p067l.AbstractC19054
    /* JADX INFO: renamed from: ֫ */
    public final EnumC19725 mo29841() {
        return EnumC19725.METHOD;
    }

    @Override // p067l.AbstractC19054
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18383)) {
            return false;
        }
        C18383 c18383 = (C18383) obj;
        return this.f54897.equals(c18383.f54897) && this.f56854.equals(c18383.f56854) && Arrays.equals(this.f54896, c18383.f54896);
    }

    @Override // p067l.AbstractC19054
    public final int hashCode() {
        return C12832.m29411(this.f54897.hashCode() * 17, 31, this.f56854) + Arrays.hashCode(this.f54896);
    }

    @Override // p067l.AbstractC19054
    public final String toString() {
        return this.f54897 + ' ' + this.f56854 + '(' + C11567.m26628((Object[]) this.f54896, ',') + ')';
    }
}
