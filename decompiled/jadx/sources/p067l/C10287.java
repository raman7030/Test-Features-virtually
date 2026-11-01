package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۠ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10287 implements InterfaceC3581 {

    /* JADX INFO: renamed from: ֫ */
    public final String f28461;

    @Override // p067l.InterfaceC3581
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6583() {
        return this;
    }

    public C10287(String str) {
        this.f28461 = str;
    }

    @Override // p067l.InterfaceC3581
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6584(CharSequence charSequence, int i, int i2, C4232 c4232) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f28461)) {
            return true;
        }
        c4232.m8606();
        return false;
    }
}
