package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9834 extends AbstractC13599 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final /* synthetic */ int f27272 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public C11176 f27273;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f27274;

    public C9834() {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11176 m23011(DataInputStream dataInputStream, AbstractC13599 abstractC13599, boolean z) throws IOException {
        char c = (char) dataInputStream.readByte();
        EnumC9462 enumC9462M44279 = C19463.m44279(c);
        switch (C21905.f68914[enumC9462M44279.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                short s = dataInputStream.readShort();
                C3128 c3128 = new C3128(enumC9462M44279, abstractC13599);
                c3128.f5697 = s;
                c3128.f38254 = "CPX_AnnotationValue";
                return c3128;
            case 11:
                short s2 = dataInputStream.readShort();
                short s3 = dataInputStream.readShort();
                C4470 c4470 = new C4470(enumC9462M44279, abstractC13599);
                c4470.f10048 = s2;
                c4470.f10049 = s3;
                c4470.f38254 = "CPX2_AnnotationValue";
                return c4470;
            case 12:
                C8493 c8493 = new C8493(abstractC13599, z);
                c8493.mo19750(dataInputStream);
                return new C10505(enumC9462M44279, abstractC13599, c8493);
            case 13:
                C17209 c17209 = new C17209(enumC9462M44279, abstractC13599);
                c17209.f51235 = new ArrayList();
                c17209.f38254 = "Array_AnnotationValue";
                short s4 = dataInputStream.readShort();
                for (int i = 0; i < s4; i++) {
                    c17209.f51235.add(m23011(dataInputStream, abstractC13599, z));
                }
                return c17209;
            default:
                if (abstractC13599.f32301) {
                    abstractC13599.f38257.mo13866("Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C19937.m45256(c) ? c : '?'), Integer.toHexString(c));
                    return new C10505(enumC9462M44279, abstractC13599, null);
                }
                throw new C6526(abstractC13599.f38257.m48082(), "Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C19937.m45256(c) ? c : '?'), Integer.toHexString(c));
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m23012() {
        String name = this.f38266.getName(this.f27274);
        if (this.f32275) {
            return this.f32292 ? String.format("#%d", Integer.valueOf(this.f27274)) : String.format("#%d /* %s */", Integer.valueOf(this.f27274), name);
        }
        return name;
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        m26672(m23012() + " = ");
        C11176 c11176 = this.f27273;
        c11176.m26661(this);
        c11176.m26678(1);
        C11176 c11177 = this.f27273;
        if (c11177.f31025 == EnumC9462.AE_ARRAY) {
            if (((C17209) c11177).f51235.size() == 0) {
                m26668("{ }");
                return;
            }
            m26681();
            m26668(m26664());
            this.f27273.mo5334();
            m26672(C0249l.f1198d);
            return;
        }
        c11177.mo24245(m30951());
        this.f27273.mo5334();
    }

    public final String toString() {
        return "<AnnotationElement " + m23012() + " = " + this.f27273.toString() + ">";
    }
}
