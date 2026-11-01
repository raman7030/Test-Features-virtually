package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۨ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7EH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13188 extends AbstractC11588 {

    /* JADX INFO: renamed from: ۗ֫ */
    public int f37054;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f37055;

    /* JADX INFO: renamed from: ۛ֫ */
    public AbstractC15242 f37056;

    /* JADX INFO: renamed from: ۟֫ */
    public C12102 f37057;

    /* JADX INFO: renamed from: ۤ֫ */
    public C23246 f37058;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f37059;

    /* JADX INFO: renamed from: ۫֫ */
    public C21235 f37060;

    /* JADX INFO: renamed from: ۬֫ */
    public Supplier f37061;

    /* JADX INFO: renamed from: ܰ֫ */
    public InterfaceC7823 f37062;

    /* JADX INFO: renamed from: ᩺֫ */
    public String f37063;

    /* JADX INFO: renamed from: ֨ */
    public abstract String mo25208();

    public AbstractC13188(C22161 c22161, EnumC3290 enumC3290) {
        super(c22161.f32274);
        this.f37055 = 0;
        this.f37063 = null;
        this.f37059 = 0;
        this.f37058 = new C23246(this);
        this.f37060 = new C21235(this);
        this.f37057 = c22161.f38266;
        this.f37056 = ((C22161) c22161.f38259).f38257.m48082();
        this.f32297 = enumC3290;
        int i = C11847.f33048[enumC3290.ordinal()];
        if (i == 1) {
            this.f37055 = 2;
            this.f37061 = new C23007(this, 1);
            this.f37062 = new InterfaceC7823() { // from class: l.ۙ֫֨
                @Override // p067l.InterfaceC7823
                /* JADX INFO: renamed from: ۧ */
                public final void mo10981() {
                    AbstractC13188 abstractC13188 = this.f16743;
                    String str = abstractC13188.f37063;
                    if (str == null) {
                        str = "???";
                    }
                    abstractC13188.m26676("\"" + str + "\";");
                }
            };
        } else if (i == 2) {
            this.f37055 = 2;
            this.f37061 = new C23677(this, 1);
            this.f37062 = new InterfaceC7823() { // from class: l.ۗ֫֨
                @Override // p067l.InterfaceC7823
                /* JADX INFO: renamed from: ۧ */
                public final void mo10981() {
                    AbstractC13188 abstractC13188 = this.f12084;
                    String str = abstractC13188.f37063;
                    if (str == null) {
                        str = "\"???\"";
                    }
                    abstractC13188.m26676(str.concat(C0249l.f1196b));
                }
            };
        } else {
            if (i != 3) {
                throw new RuntimeException(C6988.m16053("Implementation of \"", this.f32297.m5731(), "\" is not supported"));
            }
            this.f37055 = 4;
            this.f37061 = new Supplier() { // from class: l.۬֫֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    AbstractC13188 abstractC13188 = this.f41460;
                    return String.format("#%d:#%d;", Integer.valueOf(abstractC13188.f37054), Integer.valueOf(abstractC13188.f37059));
                }
            };
            this.f37062 = new InterfaceC7823() { // from class: l.۫֫֨
                @Override // p067l.InterfaceC7823
                /* JADX INFO: renamed from: ۧ */
                public final void mo10981() {
                    AbstractC13188 abstractC13188 = this.f39169;
                    abstractC13188.m26676(abstractC13188.f37063 + C0249l.f1196b);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30192(int i, DataInputStream dataInputStream) {
        if (i != this.f37055) {
            boolean z = this.f32301;
            AbstractC15242 abstractC15242 = this.f37056;
            if (z) {
                abstractC15242.mo34699("{0}: Invalid attribute length #{1}", this.f32297.m5727().m15522(), Integer.valueOf(i));
            } else {
                throw new C6526(abstractC15242, "{0}: Invalid attribute length #{1}", this.f32297.m5727().m15522(), Integer.valueOf(i));
            }
        }
        this.f37054 = dataInputStream.readUnsignedShort();
        if (this.f32297 == EnumC3290.ENCLOSING_METHOD) {
            this.f37059 = dataInputStream.readUnsignedShort();
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩴ */
    public final void mo20628() {
        mo25208();
        m26672(m26671(mo20624(), this.f32297.m5728().m38127()));
        if (this.f32275) {
            if (this.f32292) {
                this.f37058.mo10981();
                return;
            } else {
                this.f37060.mo10981();
                return;
            }
        }
        this.f37062.mo10981();
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۚ */
    public final void mo20623() {
        mo20628();
    }
}
