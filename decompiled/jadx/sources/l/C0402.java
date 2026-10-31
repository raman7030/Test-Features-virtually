package l;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: RCE9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0402 implements InterfaceC19454 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LocaleList f1857;

    public C0402(Object obj) {
        this.f1857 = (LocaleList) obj;
    }

    @Override // l.InterfaceC19454
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo1896() {
        return this.f1857;
    }

    @Override // l.InterfaceC19454
    public final Locale get(int i) {
        return this.f1857.get(i);
    }

    @Override // l.InterfaceC19454
    public final boolean isEmpty() {
        return this.f1857.isEmpty();
    }

    @Override // l.InterfaceC19454
    public final int size() {
        return this.f1857.size();
    }

    public final boolean equals(Object obj) {
        return this.f1857.equals(((InterfaceC19454) obj).mo1896());
    }

    public final int hashCode() {
        return this.f1857.hashCode();
    }

    public final String toString() {
        return this.f1857.toString();
    }

    @Override // l.InterfaceC19454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo1895() {
        return this.f1857.toLanguageTags();
    }
}
