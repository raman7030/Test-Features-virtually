package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16642 extends C20897 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Comparator f51100;

    public C16642(C18054 c18054) {
        super(c18054);
        this.f51100 = c18054.comparator();
    }

    @Override // l.C20897
    /* JADX INFO: renamed from: ֫ */
    public final C6785 mo29568(int i) {
        return new C10999(this.f51100);
    }
}
