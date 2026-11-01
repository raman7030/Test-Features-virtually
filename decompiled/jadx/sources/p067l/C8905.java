package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8905 extends AbstractC13599 implements InterfaceC5552 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f24130;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f24131;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f24132;

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20569(DataInputStream dataInputStream, EnumC6799 enumC6799, int i) throws IOException {
        int i2 = C24998.f79813[enumC6799.ordinal()];
        if (i2 == 1) {
            if (this.f38268 != null) {
                this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", EnumC6799.f17627.m15522(), EnumC5458.field_info.toString());
            }
            C8925 c8925 = new C8925((C22161) this.f38259);
            c8925.m20620(i, dataInputStream);
            this.f38268 = c8925;
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        if (i != 2) {
            if (this.f32301) {
                this.f38257.mo13866("{0}: Invalid attribute length #{1}", EnumC6799.f17623.m15522(), Integer.valueOf(i));
            } else {
                throw new C6526(this.f38257.m48082(), "{0}: Invalid attribute length #{1}", EnumC6799.f17623.m15522(), Integer.valueOf(i));
            }
        }
        EnumC6799 enumC67910 = EnumC6799.f17623;
        if (m30952(enumC67910).size() > 1) {
            this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", enumC67910.m15522(), EnumC5458.field_info.toString());
        }
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f24131 = unsignedShort;
        if (!this.f38266.m27990(unsignedShort)) {
            this.f38257.mo4612("The constantvalue_index \"{0}\" is not a valid index into the constant_pool table.", Integer.valueOf(this.f24131));
            return true;
        }
        C12102 c12102 = this.f38266;
        int i3 = this.f24131;
        EnumC14113[] enumC14113Arr = {EnumC14113.CONSTANT_INTEGER, EnumC14113.CONSTANT_FLOAT, EnumC14113.CONSTANT_DOUBLE, EnumC14113.CONSTANT_LONG, EnumC14113.CONSTANT_STRING};
        AbstractC5396 abstractC5396M27975 = c12102.m27975(i3);
        if (!(abstractC5396M27975 != null ? abstractC5396M27975.f12856.m32043(enumC14113Arr) : false)) {
            AbstractC5396 abstractC5396M27976 = this.f38266.m27975(this.f24131);
            EnumC14113 enumC14113 = abstractC5396M27976 != null ? abstractC5396M27976.f12856 : null;
            this.f38257.mo4612("The constant_pool entry \"{0}\" is not of an appropriate type for the field.", enumC14113 == null ? "unknown" : enumC14113.m32042());
        }
        return true;
    }

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ۜ */
    public final void mo20570(int i) {
        if (!((C22161) this.f38259).f38266.m27990(i)) {
            this.f38257.mo4612("The value of the attribute_name_index #{0} item is not a valid index into the constant_pool table. The attribute is ignored.", Integer.valueOf(i));
        } else {
            this.f38257.mo4612("The attribute_name_index #{0} refers to an unknown attribute name. The attribute is ignored.", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۧ */
    public final void mo6308(int i, int i2) {
        String str;
        String strConcat;
        int i3;
        C8925 c8925 = this.f38268;
        boolean z = (c8925 == null || c8925.f32289 || !this.f32296) ? false : true;
        mo10015(this.f38267, this.f38261);
        mo10015(this.f38265, this.f38269);
        EnumC6799 enumC6799 = EnumC6799.f17637;
        if (m30952(enumC6799).size() > 0) {
            for (C22576 c22576 : m30952(enumC6799)) {
                m26679(String.format("// Ignored unrecognized attribute: { u2 #%d; u4 %d; u1[ %s ]; }", Integer.valueOf(c22576.m50608()), Integer.valueOf(c22576.m50607()), c22576.m50602()));
            }
        }
        boolean z2 = this.f32275;
        if (!z2 && (i3 = this.f24131) != -1) {
            C12102 c12102 = this.f38266;
            EnumC14113[] enumC14113Arr = {EnumC14113.CONSTANT_INTEGER, EnumC14113.CONSTANT_FLOAT, EnumC14113.CONSTANT_DOUBLE, EnumC14113.CONSTANT_LONG, EnumC14113.CONSTANT_STRING};
            AbstractC5396 abstractC5396M27975 = c12102.m27975(i3);
            if (!(abstractC5396M27975 != null ? abstractC5396M27975.f12856.m32043(enumC14113Arr) : false)) {
                AbstractC5396 abstractC5396M27976 = this.f38266.m27975(this.f24131);
                EnumC14113 enumC14113 = abstractC5396M27976 != null ? abstractC5396M27976.f12856 : null;
                m26679("// ".concat(this.f38257.m48081("Unrecognized constantvalue_index: #{0} [ {1} ]", Integer.valueOf(this.f24131), enumC14113 == null ? "unknown" : enumC14113.m32042())));
            }
        }
        StringBuilder sb = new StringBuilder(m26664());
        sb.append(EnumC8140.m18861(this.f38256, EnumC21552.FIELD));
        sb.append(m30957());
        sb.append(EnumC16818.f49718.m38127());
        sb.append(' ');
        int iMax = Math.max(sb.length() - (m26670() * 2), m26670() + EnumC3290.SIGNATURE.m5731().length());
        int i4 = this.f24131;
        if (i4 != -1) {
            if (!z2 && i4 != -1) {
                C12102 c12103 = this.f38266;
                EnumC14113[] enumC14113Arr2 = {EnumC14113.CONSTANT_INTEGER, EnumC14113.CONSTANT_FLOAT, EnumC14113.CONSTANT_DOUBLE, EnumC14113.CONSTANT_LONG, EnumC14113.CONSTANT_STRING};
                AbstractC5396 abstractC5396M27977 = c12103.m27975(i4);
                if (abstractC5396M27977 != null ? abstractC5396M27977.f12856.m32043(enumC14113Arr2) : false) {
                    strConcat = " = ".concat(((C22161) this.f38259).f38266.m27983(this.f24131));
                } else {
                    strConcat = "";
                }
            } else {
                strConcat = " = ".concat(((C22161) this.f38259).f38266.m27983(this.f24131));
            }
            str = strConcat;
        } else {
            str = null;
        }
        m30954(sb, str, z ? ":" : C0249l.f1196b, this.f24132, this.f24130, this.f24131);
        if (z) {
            C8925 c8926 = this.f38268;
            c8926.m20625(iMax);
            c8926.m26678(1);
            c8926.f32298 = mo8555() - (m26683() * 2);
            this.f38268.mo5334();
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        mo6308(i, i2);
    }

    @Override // p067l.InterfaceC5552
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12286() {
        String string;
        if (!this.f32275 || this.f32292) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(EnumC8140.m18861(this.f38256, EnumC21552.FIELD));
            sb.append(m30957());
            sb.append(EnumC16818.f49718.m38127());
            sb.append(" #");
            sb.append(this.f24132);
            sb.append(":#");
            sb.append(this.f24130);
            C8925 c8925 = this.f38268;
            if (c8925 != null && c8925.f32289) {
                sb.append(":#");
                sb.append(this.f38268.m20622());
            }
            if (this.f24131 != -1) {
                sb.append(" = #");
                sb.append(this.f24131);
            }
            sb.append(';');
            string = sb.toString();
        }
        return string.length();
    }

    @Override // p067l.InterfaceC5552
    /* JADX INFO: renamed from: ֫ */
    public final void mo12285(int i) {
        this.f32302 = i;
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ܿ */
    public final int mo8555() {
        return Math.max(this.f32298, m26670() + this.f32302);
    }
}
