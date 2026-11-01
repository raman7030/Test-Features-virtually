package p067l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.֡֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public class C2417 extends AbstractC21195 implements InterfaceC19129 {

    /* JADX INFO: renamed from: ֫֫ */
    public C15828 f3687;

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC12224 f3688;

    /* JADX INFO: renamed from: ۘ֫ */
    public Map f3689;

    /* JADX INFO: renamed from: ۛ */
    public InterfaceC4317 f3690;

    /* JADX INFO: renamed from: ۜ֫ */
    public final EnumSet f3691;

    /* JADX INFO: renamed from: ۟ */
    public final EnumSet f3692;

    /* JADX INFO: renamed from: ۡ֫ */
    public C4848 f3693;

    /* JADX INFO: renamed from: ۢ֫ */
    public C9794 f3694;

    /* JADX INFO: renamed from: ۧ֫ */
    public C4848 f3695;

    /* JADX INFO: renamed from: ۨ */
    public C4848 f3696;

    /* JADX INFO: renamed from: ܰ */
    public C4848 f3697;

    /* JADX INFO: renamed from: ܳ֫ */
    public HashSet f3698;

    /* JADX INFO: renamed from: ܺ֫ */
    public InterfaceC8453 f3699;

    /* JADX INFO: renamed from: ܽ֫ */
    public InterfaceC4317 f3700;

    /* JADX INFO: renamed from: ܿ֫ */
    public C4848 f3701;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC4317 f3702;

    /* JADX INFO: renamed from: ᩷֫ */
    public InterfaceC4317 f3703;

    /* JADX INFO: renamed from: ᩺ */
    public C4848 f3704;

    /* JADX INFO: renamed from: ᩻֫ */
    public C4848 f3705;

    @Override // p067l.AbstractC7783, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 19;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۠֫ */
    public final C15828 mo3350() {
        return null;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean mo3351() {
        return (this.f20409 & 18014398509481984L) != 0;
    }

    @Override // p067l.InterfaceC19129, p067l.InterfaceC22483
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12224 mo3352() {
        return this.f20408;
    }

    public C2417(AbstractC12224 abstractC12224) {
        super(EnumC3600.f7340, 0L, abstractC12224, null, null);
        this.f3704 = C4848.m10283();
        this.f3699 = InterfaceC8453.f22683;
        this.f3692 = EnumSet.noneOf(EnumC19853.class);
        this.f3691 = EnumSet.noneOf(EnumC20524.class);
        C1446.m31699(abstractC12224);
        this.f20406 = new C17860(this, C22082.f69463);
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ܽ֫ */
    public final AbstractC12224 mo3355() {
        return C14514.m33177(this.f20408);
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC12224 mo3355() {
        return C14514.m33177(this.f20408);
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final boolean m3349() {
        return this.f20408.isEmpty() && this.f20407 == null;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final EnumC24473 mo3347() {
        return EnumC24473.MODULE;
    }

    @Override // p067l.AbstractC7783
    public String toString() {
        AbstractC12224 abstractC12224 = this.f20408;
        if (abstractC12224 == null) {
            return "<unknown>";
        }
        return abstractC12224.isEmpty() ? "<unnamed>" : String.valueOf(this.f20408);
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        return abstractC10412.mo12425(this, obj);
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ܺ */
    public final C4848 mo3353() {
        C4848 c4848M10283 = C4848.m10283();
        for (AbstractC7783 abstractC7783 : this.f3704) {
            if (abstractC7783.mo17983().mo22461(new C20149(1))) {
                c4848M10283 = c4848M10283.m10290(abstractC7783);
            }
        }
        return c4848M10283;
    }
}
