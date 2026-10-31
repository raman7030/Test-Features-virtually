package l;

import java.io.DataOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C0428 extends AbstractC3957 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public StringBuilder f1906;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1907 = new ArrayList();

    @Override // l.InterfaceC1134
    public final void flush() {
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DataOutputStream mo1967() {
        return null;
    }

    @Override // l.AbstractC3957
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo1970() {
        return "string";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m1972() {
        return this.f1907;
    }

    public final String toString() {
        return (String) C5378.stream(this.f1907).map(new C18554(6)).collect(C22976.joining(System.lineSeparator()));
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo1971(String str) {
        String str2 = this.f12584;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C20087.m46306("Ended with a different class: ", str, "; then ", str2, " was started."));
        }
        StringBuilder sb = this.f1906;
        if (sb != null) {
            this.f1907.add(new C19480(str, sb.toString()));
        }
        super.mo1971(str);
        this.f1906 = null;
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1969(String str, C16646 c16646, AbstractC19898 abstractC19898) {
        this.f12584 = str;
        this.f1906 = new StringBuilder();
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo1973(String str) {
        StringBuilder sb = this.f1906;
        sb.append(str);
        sb.append("\n");
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1968(String str) {
        this.f1906.append(str);
    }
}
