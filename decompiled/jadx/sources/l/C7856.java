package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7856 extends AbstractC11817 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24356 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C9268 f24357;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f24358;

    public C7856() {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9268 m21046(DataInputStream dataInputStream, AbstractC11817 abstractC11817, boolean z) throws IOException {
        char c = (char) dataInputStream.readByte();
        EnumC7464 enumC7464M42029 = C17987.m42029(c);
        switch (C20557.f66233[enumC7464M42029.ordinal()]) {
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
                C0800 c0800 = new C0800(enumC7464M42029, abstractC11817);
                c0800.f2926 = s;
                c0800.f35252 = "CPX_AnnotationValue";
                return c0800;
            case 11:
                short s2 = dataInputStream.readShort();
                short s3 = dataInputStream.readShort();
                C2212 c2212 = new C2212(enumC7464M42029, abstractC11817);
                c2212.f7260 = s2;
                c2212.f7261 = s3;
                c2212.f35252 = "CPX2_AnnotationValue";
                return c2212;
            case 12:
                C6445 c6445 = new C6445(abstractC11817, z);
                c6445.mo17803(dataInputStream);
                return new C8562(enumC7464M42029, abstractC11817, c6445);
            case 13:
                C15616 c15616 = new C15616(enumC7464M42029, abstractC11817);
                c15616.f48096 = new ArrayList();
                c15616.f35252 = "Array_AnnotationValue";
                short s4 = dataInputStream.readShort();
                for (int i = 0; i < s4; i++) {
                    c15616.f48096.add(m21046(dataInputStream, abstractC11817, z));
                }
                return c15616;
            default:
                if (abstractC11817.f29352) {
                    abstractC11817.f35255.mo11946("Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C18486.m42980(c) ? c : '?'), Integer.toHexString(c));
                    return new C8562(enumC7464M42029, abstractC11817, null);
                }
                throw new C4375(abstractC11817.f35255.m45770(), "Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C18486.m42980(c) ? c : '?'), Integer.toHexString(c));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m21047() {
        String name = this.f35264.getName(this.f24358);
        if (this.f29326) {
            return this.f29343 ? String.format("#%d", Integer.valueOf(this.f24358)) : String.format("#%d /* %s */", Integer.valueOf(this.f24358), name);
        }
        return name;
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        m24658(m21047() + " = ");
        C9268 c9268 = this.f24357;
        c9268.m24647(this);
        c9268.m24664(1);
        C9268 c9269 = this.f24357;
        if (c9269.f28077 == EnumC7464.AE_ARRAY) {
            if (((C15616) c9269).f48096.size() == 0) {
                m24654("{ }");
                return;
            }
            m24667();
            m24654(m24650());
            this.f24357.mo3021();
            m24658(l.d);
            return;
        }
        c9269.mo22276(m28902());
        this.f24357.mo3021();
    }

    public final String toString() {
        return "<AnnotationElement " + m21047() + " = " + this.f24357.toString() + ">";
    }
}
