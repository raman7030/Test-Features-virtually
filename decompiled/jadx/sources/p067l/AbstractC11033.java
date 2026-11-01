package p067l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۡ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PAX3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11033 extends AbstractC21092 {
    /* JADX INFO: renamed from: ᩳ */
    public abstract Random mo5001();

    @Override // p067l.AbstractC21092
    /* JADX INFO: renamed from: ֫ */
    public final int mo25444() {
        return mo5001().nextInt();
    }

    @Override // p067l.AbstractC21092
    /* JADX INFO: renamed from: ۧ */
    public final int mo25445() {
        return mo5001().nextInt(2147418112);
    }
}
