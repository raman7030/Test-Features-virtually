package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۜܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C8928 implements InterfaceC19657 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24185;

    /* JADX INFO: renamed from: ۧ */
    public final int f24186;

    /* JADX INFO: renamed from: ܽ */
    public final int f24187;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f24188;

    public C8928(int i, int i2, int i3, CharSequence charSequence) {
        this.f24188 = charSequence;
        this.f24186 = i;
        this.f24187 = i2;
        this.f24185 = i3;
    }

    @Override // p067l.InterfaceC19657
    /* JADX INFO: renamed from: ۧ */
    public final int mo20638() {
        return this.f24186;
    }

    @Override // p067l.InterfaceC19657
    /* JADX INFO: renamed from: ֫ */
    public final int mo20637() {
        return this.f24187;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8928.class != obj.getClass()) {
            return false;
        }
        C8928 c8928 = (C8928) obj;
        if (this.f24185 != c8928.f24185) {
            return false;
        }
        return TextUtils.equals(this.f24188.subSequence(this.f24186, this.f24187), c8928.f24188.subSequence(c8928.f24186, c8928.f24187));
    }

    public final int hashCode() {
        return this.f24185;
    }
}
