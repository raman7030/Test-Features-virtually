package l;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3931 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3931 f12545 = m11975(new Locale[0]);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19454 f12546;

    public C3931(InterfaceC19454 interfaceC19454) {
        this.f12546 = interfaceC19454;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3931 m11973(LocaleList localeList) {
        return new C3931(new C0402(localeList));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m11981() {
        return this.f12546.mo1896();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3931 m11975(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m11973(C2520.m8017(localeArr));
        }
        return new C3931(new C18748(localeArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Locale m11977(int i) {
        return this.f12546.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11978() {
        return this.f12546.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m11979() {
        return this.f12546.size();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m11980() {
        return this.f12546.mo1895();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C3931 m11976() {
        return f12545;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3931 m11974(String str) {
        if (str == null || str.isEmpty()) {
            return f12545;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C15924.m37697(strArrSplit[i]);
        }
        return m11975(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3931) {
            return this.f12546.equals(((C3931) obj).f12546);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12546.hashCode();
    }

    public final String toString() {
        return this.f12546.toString();
    }
}
