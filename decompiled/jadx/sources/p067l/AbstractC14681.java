package p067l;

import java.util.EventObject;

/* JADX INFO: renamed from: l.۬ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A27 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14681 extends EventObject implements Cloneable {
    public static final long serialVersionUID = -8558445644541006271L;

    public abstract String getName();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC23399 mo33609();

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC12000 mo33610();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo33611();

    @Override // 
    public AbstractC14681 clone() {
        try {
            return (AbstractC14681) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
