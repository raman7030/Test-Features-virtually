package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Stack;

/* JADX INFO: renamed from: l.֨ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069 extends AbstractC3186 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f3918;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Stack f3919;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f3920;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069(C10242 c10242, EnumC12358 enumC12358, int i, int i2) {
        super(c10242, enumC12358, Integer.valueOf(i));
        this.f3920 = c10242;
        this.f3919 = new Stack();
        this.f3918 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069(C10242 c10242, EnumC12358 enumC12358) {
        super(c10242, enumC12358, 0);
        this.f3920 = c10242;
        this.f3919 = new Stack();
        this.f3918 = 0;
    }

    @Override // l.AbstractC3186
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1069) && super.equals(obj) && this.f3918 == ((C1069) obj).f3918;
    }

    @Override // l.AbstractC3186
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f3918;
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo3639() {
        EnumC12358 enumC12358 = this.f10052;
        int iOrdinal = enumC12358.ordinal();
        int i = this.f3918;
        Object obj = this.f10053;
        C10242 c10242 = this.f3920;
        switch (iOrdinal) {
            case 8:
                return C10242.m25947(c10242.m25960(((Integer) obj).intValue()), c10242.f30885.f67424) + "." + c10242.m25964(i);
            case 9:
            case 10:
                return c10242.m25957(enumC12358) + C10242.m25947(c10242.m25960(((Integer) obj).intValue()), c10242.f30885.f67424) + "." + c10242.m25964(i);
            case 11:
                return c10242.getName(((Integer) obj).intValue()) + ":" + c10242.m25964(i);
            case 12:
                return C10242.m25948(c10242, ((Integer) obj).intValue()) + ":" + c10242.m25964(i);
            case 13:
            default:
                return "UnknownTag";
            case 14:
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                try {
                    C13500 c13500 = (C13500) ((AbstractC9701) c10242.f30885.f67411.f22796.get(iIntValue));
                    return c10242.m25964(c13500.f40311) + ":" + c10242.m25964(i) + m3636(c13500, "{", l.d);
                } catch (IndexOutOfBoundsException unused) {
                    return C18307.m42645(iIntValue, "<Invalid bootstrap method index:", ">");
                } catch (NullPointerException unused2) {
                    return "<Missing BootstrapMethods attribute>";
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3636(C13500 c13500, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int size = c13500.f40312.size();
        sb.append(str);
        if (size > 0) {
            int i = 0;
            while (i < size) {
                int iIntValue = ((Integer) c13500.f40312.get(i)).intValue();
                boolean z = i != size + (-1);
                String str3 = "";
                String str4 = z ? "^" : "";
                if (z) {
                    str3 = "⾀";
                }
                sb.append(m3635(iIntValue, str4, str3));
                i++;
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3635(int i, String str, String str2) {
        String str3;
        String strConcat;
        C10242 c10242 = this.f3920;
        if (c10242.m25968(i)) {
            AbstractC3186 abstractC3186 = (AbstractC3186) c10242.f30882.get(i);
            Stack stack = this.f3919;
            if (stack.search(this) == -1) {
                stack.push(this);
                String strConcat2 = "".concat(c10242.m25961(i)).concat(str);
                stack.pop();
                return strConcat2;
            }
            if (abstractC3186 instanceof C1069) {
                str3 = String.format("%-8s %d:#%d; ", abstractC3186.f10052.m29986(), abstractC3186.f10053, Integer.valueOf(((C1069) abstractC3186).f3918));
            } else {
                str3 = String.format("%-8s #%d; ", abstractC3186.f10052.m29986(), abstractC3186.f10053);
            }
            String str4 = "circular reference to " + abstractC3186.f10052.m29986() + " #" + i;
            if (c10242.f29326) {
                strConcat = "".concat(c10242.m24657(25, str3)).concat("<").concat(str4).concat(">").concat(str);
            } else {
                strConcat = "".concat(c10242.m24657(25, str3)).concat(" // <").concat(str4).concat(">").concat(str2);
            }
            abstractC3186.m9800(new IOException(str4));
            return strConcat;
        }
        return c10242.f30883.m45769("??? The entry is missing from the constant_pool table", new Object[0]);
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3637(InterfaceC1134 interfaceC1134, int i) {
        super.mo3637(interfaceC1134, i);
        m3634();
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3638(InterfaceC1134 interfaceC1134, int i) {
        super.mo3638(interfaceC1134, i);
        m3634();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m3634() {
        C10242 c10242 = this.f3920;
        boolean z = c10242.f29343;
        EnumC12358 enumC12358 = this.f10052;
        int i = this.f3918;
        Object obj = this.f10053;
        if (z) {
            switch (enumC12358.ordinal()) {
                case 8:
                case 9:
                case 10:
                    c10242.m24666("#%d.#%d;", obj, Integer.valueOf(i));
                    break;
                case 11:
                    c10242.m24666("#%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 12:
                case 14:
                case 15:
                    c10242.m24666("%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 13:
                default:
                    c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                    c10242.m24662(" // unknown tag: " + enumC12358.f37042);
                    break;
            }
        }
        switch (enumC12358.ordinal()) {
            case 8:
            case 9:
            case 10:
                c10242.m24661(this.f10050, String.format("#%d.#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // " + mo3639());
                break;
            case 11:
                c10242.m24661(this.f10050, String.format("#%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // " + mo3639());
                break;
            case 12:
                c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // " + mo3639());
                break;
            case 13:
            default:
                c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // unknown tag: " + enumC12358.f37042);
                break;
            case 14:
            case 15:
                c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24666(" // #%d:%s", obj, c10242.m25964(i));
                break;
        }
    }
}
