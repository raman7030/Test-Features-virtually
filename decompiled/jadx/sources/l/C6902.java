package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۜܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C6902 implements InterfaceC18191 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f21306;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f21307;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f21308;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f21309;

    public C6902(int i, int i2, int i3, CharSequence charSequence) {
        this.f21309 = charSequence;
        this.f21307 = i;
        this.f21308 = i2;
        this.f21306 = i3;
    }

    @Override // l.InterfaceC18191
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo18689() {
        return this.f21307;
    }

    @Override // l.InterfaceC18191
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo18688() {
        return this.f21308;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6902.class != obj.getClass()) {
            return false;
        }
        C6902 c6902 = (C6902) obj;
        if (this.f21306 != c6902.f21306) {
            return false;
        }
        return TextUtils.equals(this.f21309.subSequence(this.f21307, this.f21308), c6902.f21309.subSequence(c6902.f21307, c6902.f21308));
    }

    public final int hashCode() {
        return this.f21306;
    }
}
