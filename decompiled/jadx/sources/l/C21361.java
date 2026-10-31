package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21361 implements InterfaceC14304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13598 f68807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f68808;

    public C21361(String str, C13598 c13598) {
        this.f68808 = str;
        this.f68807 = c13598;
    }

    @Override // l.InterfaceC14304
    public final Iterator iterator() {
        return new C15009(this);
    }
}
