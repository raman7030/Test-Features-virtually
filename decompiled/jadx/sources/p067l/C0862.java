package p067l;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡۫ */
/* JADX INFO: compiled from: RCE9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0862 implements InterfaceC1807 {

    /* JADX INFO: renamed from: ֫ */
    public final LocaleList f4634;

    public C0862(Object obj) {
        this.f4634 = (LocaleList) obj;
    }

    @Override // p067l.InterfaceC1807
    /* JADX INFO: renamed from: ۧ */
    public final Object mo4288() {
        return this.f4634;
    }

    @Override // p067l.InterfaceC1807
    public final Locale get(int i) {
        return this.f4634.get(i);
    }

    @Override // p067l.InterfaceC1807
    public final boolean isEmpty() {
        return this.f4634.isEmpty();
    }

    @Override // p067l.InterfaceC1807
    public final int size() {
        return this.f4634.size();
    }

    public final boolean equals(Object obj) {
        return this.f4634.equals(((InterfaceC1807) obj).mo4288());
    }

    public final int hashCode() {
        return this.f4634.hashCode();
    }

    public final String toString() {
        return this.f4634.toString();
    }

    @Override // p067l.InterfaceC1807
    /* JADX INFO: renamed from: ֫ */
    public final String mo4287() {
        return this.f4634.toLanguageTags();
    }
}
