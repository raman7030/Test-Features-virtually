package l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۡ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PAX3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9116 extends AbstractC19700 {
    /* JADX INFO: renamed from: ᩳ */
    public abstract Random mo2661();

    @Override // l.AbstractC19700
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo23493() {
        return mo2661().nextInt();
    }

    @Override // l.AbstractC19700
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo23494() {
        return mo2661().nextInt(2147418112);
    }
}
