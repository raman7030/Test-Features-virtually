package l;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: l.֡ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28K4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0591 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f2313;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f2314 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2446(int i) {
        C22632.m50634(!this.f2313);
        this.f2314.append(i, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5531 m2445() {
        C22632.m50634(!this.f2313);
        this.f2313 = true;
        return new C5531(this.f2314);
    }
}
