package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7CI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8925 extends AbstractC13599 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f24180;

    /* JADX INFO: renamed from: ۡۧ */
    public AbstractC10857 f24181;

    /* JADX INFO: renamed from: ۢۧ */
    public int f24182;

    /* JADX INFO: renamed from: ᩷ۧ */
    public String f24183;

    /* JADX INFO: renamed from: ᩻ۧ */
    public String f24184;

    public C8925(C22161 c22161) {
        super(c22161);
        this.f24181 = null;
        this.f24182 = -1;
        this.f24184 = C0249l.f1196b;
        this.f24183 = System.getProperty("line.separator");
        this.f32297 = EnumC3290.SIGNATURE;
    }

    /* JADX INFO: renamed from: ۙ */
    public final int m20622() {
        return this.f24180;
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6310() {
        return !this.f32289;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20620(int i, DataInputStream dataInputStream) {
        if (i != 2) {
            if (this.f32301) {
                this.f38257.m48082().mo34699("{0}: Invalid attribute length #{1}", EnumC6799.f17627.m15522(), Integer.valueOf(i));
            } else {
                throw new C6526(this.f38257.m48082(), "{0}: Invalid attribute length #{1}", EnumC6799.f17627.m15522(), Integer.valueOf(i));
            }
        }
        this.f24180 = dataInputStream.readUnsignedShort();
    }

    public final String toString() {
        return String.format("signature[%d]=%s", Integer.valueOf(this.f24180), this.f38266.m27986(this.f24180));
    }

    /* JADX INFO: renamed from: ۬ */
    public final String m20627() {
        if (this.f24181 == null) {
            this.f38257.getClass();
            this.f24181 = new C12869(this.f24180).m29496(this.f38266);
        }
        AbstractC10857 abstractC10857 = this.f24181;
        if (abstractC10857 != null) {
            return abstractC10857.toString().replace('/', '.');
        }
        return this.f38266.m27986(this.f24180);
    }

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC10857 m20626() {
        if (this.f24181 == null) {
            this.f38257.getClass();
            this.f24181 = new C12869(this.f24180).m29496(this.f38266);
        }
        return this.f24181;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m20625(int i) {
        this.f24182 = i;
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۡ */
    public final int mo20624() {
        int i = this.f24182;
        return i == -1 ? super.mo20624() : i;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m20629() {
        this.f24183 = "";
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۚ */
    public final void mo20623() {
        m26672(m26671(mo20624(), this.f32297.m5730()));
        String strM27986 = this.f38266.m27986(this.f24180);
        if (this.f32275) {
            if (this.f32292) {
                m26668(String.format("#%d%s", Integer.valueOf(this.f24180), this.f24184).concat(this.f24183));
                return;
            } else {
                this.f32274.mo4344(m26671(m26665(), String.format("#%d%s", Integer.valueOf(this.f24180), this.f24184)));
                m26668(" // ".concat(strM27986).concat(this.f24183));
                return;
            }
        }
        m26668(strM27986.concat(this.f24184).concat(this.f24183));
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩴ */
    public final void mo20628() {
        m26672(m26671(mo20624(), EnumC3290.SIGNATURE.m5731()));
        String strM27986 = this.f38266.m27986(this.f24180);
        if (this.f32275) {
            if (this.f32292) {
                m26668(String.format("#%d%s", Integer.valueOf(this.f24180), this.f24184).concat(this.f24183));
                return;
            } else {
                this.f32274.mo4344(m26671(m26665(), String.format("#%d%s", Integer.valueOf(this.f24180), this.f24184)));
                m26668(" // ".concat(strM27986).concat(this.f24183));
                return;
            }
        }
        m26668(strM27986.concat(this.f24184).concat(this.f24183));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8537 m20619(Function function) {
        String str;
        if (this.f32296) {
            return new C8537("", "");
        }
        String str2 = String.format(":#%d", Integer.valueOf(this.f24180));
        if (((Boolean) function.apply(Integer.valueOf(this.f24180))).booleanValue()) {
            str = ":" + this.f38266.m27986(this.f24180);
        } else {
            str = String.format(":?%d Invalid constant_pool index", Integer.valueOf(this.f24180));
        }
        return new C8537(str2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20621(boolean z) {
        this.f24184 = z ? C0249l.f1196b : ",";
    }
}
