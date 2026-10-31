package l;

import java.util.EventObject;

/* JADX INFO: renamed from: l.۬ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A27 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12955 extends EventObject implements Cloneable {
    public static final long serialVersionUID = -8558445644541006271L;

    public abstract String getName();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC22128 mo31522();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC10134 mo31523();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract String mo31524();

    @Override // 
    public AbstractC12955 clone() {
        try {
            return (AbstractC12955) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
