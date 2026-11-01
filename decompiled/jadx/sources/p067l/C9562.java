package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۟ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9562 {

    /* JADX INFO: renamed from: ֫ */
    public String f26287;

    /* JADX INFO: renamed from: ۧ */
    public String f26288;

    public C9562(String str, String str2) {
        this.f26287 = C8597.m20011(50, str);
        this.f26288 = C8597.m20011(10000, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m22266() {
        if (TextUtils.isEmpty(this.f26287)) {
            return C8597.m20011(50, this.f26288);
        }
        return this.f26287;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m22268() {
        return this.f26287;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22267(String str) {
        this.f26287 = TextUtils.isEmpty(str) ? null : C8597.m20011(50, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m22270() {
        return this.f26288;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22269(String str) {
        this.f26288 = str;
    }
}
