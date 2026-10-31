package l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.᩸ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21664 extends AbstractC20253 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14607 f69520;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21664(C3319 c3319, CharSequence charSequence, C14607 c14607) {
        super(c3319, charSequence);
        this.f69520 = c14607;
    }

    @Override // l.AbstractC20253
    /* JADX INFO: renamed from: ܽ */
    public final int mo36336(int i) {
        Matcher matcher = this.f69520.f44707;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // l.AbstractC20253
    /* JADX INFO: renamed from: ۧ */
    public final int mo36335(int i) {
        return this.f69520.f44707.end();
    }
}
