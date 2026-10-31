package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۠ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8332 implements InterfaceC1276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f25547;

    @Override // l.InterfaceC1276
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4337() {
        return this;
    }

    public C8332(String str) {
        this.f25547 = str;
    }

    @Override // l.InterfaceC1276
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4338(CharSequence charSequence, int i, int i2, C1961 c1961) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f25547)) {
            return true;
        }
        c1961.m6465();
        return false;
    }
}
