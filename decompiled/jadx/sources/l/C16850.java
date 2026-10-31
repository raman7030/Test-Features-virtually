package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16850 extends AbstractC17556 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f51716;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f51717;

    public C16850(String str, String str2, String[] strArr) {
        super(str);
        this.f51717 = str2;
        this.f51716 = strArr;
    }

    @Override // l.AbstractC17556
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17556 mo27778(String str) {
        return new C16850(str, this.f51717, this.f51716);
    }

    @Override // l.AbstractC17556
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18262 mo27779() {
        return EnumC18262.METHOD;
    }

    @Override // l.AbstractC17556
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16850)) {
            return false;
        }
        C16850 c16850 = (C16850) obj;
        return this.f51717.equals(c16850.f51717) && this.f53664.equals(c16850.f53664) && Arrays.equals(this.f51716, c16850.f51716);
    }

    @Override // l.AbstractC17556
    public final int hashCode() {
        return C11010.m27349(this.f51717.hashCode() * 17, 31, this.f53664) + Arrays.hashCode(this.f51716);
    }

    @Override // l.AbstractC17556
    public final String toString() {
        return this.f51717 + ' ' + this.f53664 + '(' + C9679.m24614((Object[]) this.f51716, ',') + ')';
    }
}
