package p067l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.᩸ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22958 extends AbstractC21617 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C16251 f72224;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22958(C5523 c5523, CharSequence charSequence, C16251 c16251) {
        super(c5523, charSequence);
        this.f72224 = c16251;
    }

    @Override // p067l.AbstractC21617
    /* JADX INFO: renamed from: ܽ */
    public final int mo38498(int i) {
        Matcher matcher = this.f72224.f47813;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // p067l.AbstractC21617
    /* JADX INFO: renamed from: ۧ */
    public final int mo38497(int i) {
        return this.f72224.f47813.end();
    }
}
