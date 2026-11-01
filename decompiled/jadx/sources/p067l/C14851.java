package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.۬۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14851 extends AbstractC21995 implements Serializable {

    /* JADX INFO: renamed from: ۙ */
    public static final C14851 f42337;

    /* JADX INFO: renamed from: ᩶ */
    public static final C14851 f42338;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f42339 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final transient AbstractC16192 f42340;

    public C14851(AbstractC16192 abstractC16192) {
        this.f42340 = abstractC16192;
    }

    static {
        int i = AbstractC16192.f47662;
        f42337 = new C14851(C18009.f53770);
        f42338 = new C14851(AbstractC16192.m36873of((Object) C15444.m35185()));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14851 m33945() {
        return f42337;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14851 m33944() {
        return f42338;
    }

    @Override // p067l.InterfaceC3928
    /* JADX INFO: renamed from: ֫ */
    public final C15444 mo6045(Integer num) {
        int iM29352 = C12803.m29352(this.f42340, new C7476(), new C4520(num), C14774.f42115, EnumC4085.f9008, EnumC11975.f33391);
        if (iM29352 == -1) {
            return null;
        }
        C15444 c15444 = (C15444) this.f42340.get(iM29352);
        if (c15444.m35188(num)) {
            return c15444;
        }
        return null;
    }

    @Override // p067l.InterfaceC3928
    /* JADX INFO: renamed from: ֫ */
    public final Set mo7746() {
        AbstractC16192 abstractC16192 = this.f42340;
        if (abstractC16192.isEmpty()) {
            int i = AbstractC8146.f21506;
            return C22034.f69338;
        }
        int i2 = C15444.f44129;
        return new C11305(abstractC16192, C24162.f76622);
    }

    public Object writeReplace() {
        return new C5464(this.f42340);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
