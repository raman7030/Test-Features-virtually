package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.۬۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13134 extends AbstractC20651 implements Serializable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13134 f39282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13134 f39283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39284 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f39285;

    public C13134(AbstractC14545 abstractC14545) {
        this.f39285 = abstractC14545;
    }

    static {
        int i = AbstractC14545.f44556;
        f39282 = new C13134(C16457.f50591);
        f39283 = new C13134(AbstractC14545.of((Object) C13758.m33070()));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13134 m31853() {
        return f39282;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13134 m31852() {
        return f39283;
    }

    @Override // l.InterfaceC1641
    /* JADX INFO: renamed from: ֫ */
    public final C13758 mo3772(Integer num) {
        int iM27290 = C10979.m27290(this.f39285, new C5374(), new C2264(num), C13053.f39070, EnumC1806.f6229, EnumC10108.f30432);
        if (iM27290 == -1) {
            return null;
        }
        C13758 c13758 = (C13758) this.f39285.get(iM27290);
        if (c13758.m33073(num)) {
            return c13758;
        }
        return null;
    }

    @Override // l.InterfaceC1641
    /* JADX INFO: renamed from: ֫ */
    public final Set mo5516() {
        AbstractC14545 abstractC14545 = this.f39285;
        if (abstractC14545.isEmpty()) {
            int i = AbstractC6079.f18650;
            return C20692.f66656;
        }
        int i2 = C13758.f41051;
        return new C9403(abstractC14545, C22931.f73892);
    }

    public Object writeReplace() {
        return new C3257(this.f39285);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
