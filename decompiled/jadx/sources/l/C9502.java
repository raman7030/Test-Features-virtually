package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07RX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9502 extends C20791 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f28844;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.append("[");
        return (AbstractC4308) c5138.f16077.mo2962(this, sb);
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        String strReplace = (this.f28844 ? c19955.f13890.mo16083().toString() : c19955.f13890.mo16076().toString()).replace('.', '/');
        sb.append("L");
        sb.append(strReplace);
        sb.append(l.b);
        return null;
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2140(AbstractC4308 abstractC4308, StringBuilder sb) {
        String str;
        if (!abstractC4308.mo12907()) {
            return (AbstractC4308) abstractC4308.mo2962(this, sb);
        }
        int i = C23612.f76530[abstractC4308.mo3256().ordinal()];
        if (i != 11) {
            switch (i) {
                case 1:
                    str = "Z";
                    break;
                case 2:
                    str = "B";
                    break;
                case 3:
                    str = "S";
                    break;
                case 4:
                    str = "I";
                    break;
                case 5:
                    str = "J";
                    break;
                case 6:
                    str = "C";
                    break;
                case 7:
                    str = "F";
                    break;
                case 8:
                    str = "D";
                    break;
                default:
                    C12171.m29640("unknown type: should not happen");
                    throw null;
            }
        } else {
            str = "V";
        }
        sb.append(str);
        return null;
    }

    public C9502(boolean z) {
        this.f28844 = z;
    }
}
