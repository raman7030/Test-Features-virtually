package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.util.Stack;

/* JADX INFO: renamed from: l.֨ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3384 extends AbstractC5396 {

    /* JADX INFO: renamed from: ۜ */
    public final int f6689;

    /* JADX INFO: renamed from: ܳ */
    public final Stack f6690;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C12102 f6691;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3384(C12102 c12102, EnumC14113 enumC14113, int i, int i2) {
        super(c12102, enumC14113, Integer.valueOf(i));
        this.f6691 = c12102;
        this.f6690 = new Stack();
        this.f6689 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3384(C12102 c12102, EnumC14113 enumC14113) {
        super(c12102, enumC14113, 0);
        this.f6691 = c12102;
        this.f6690 = new Stack();
        this.f6689 = 0;
    }

    @Override // p067l.AbstractC5396
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3384) && super.equals(obj) && this.f6689 == ((C3384) obj).f6689;
    }

    @Override // p067l.AbstractC5396
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f6689;
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ܽ */
    public final String mo5910() {
        EnumC14113 enumC14113 = this.f12856;
        int iOrdinal = enumC14113.ordinal();
        int i = this.f6689;
        Object obj = this.f12857;
        C12102 c12102 = this.f6691;
        switch (iOrdinal) {
            case 8:
                return C12102.m27969(c12102.m27982(((Integer) obj).intValue()), c12102.f33846.f70107) + "." + c12102.m27986(i);
            case 9:
            case 10:
                return c12102.m27979(enumC14113) + C12102.m27969(c12102.m27982(((Integer) obj).intValue()), c12102.f33846.f70107) + "." + c12102.m27986(i);
            case 11:
                return c12102.getName(((Integer) obj).intValue()) + ":" + c12102.m27986(i);
            case 12:
                return C12102.m27970(c12102, ((Integer) obj).intValue()) + ":" + c12102.m27986(i);
            case 13:
            default:
                return "UnknownTag";
            case 14:
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                try {
                    C15198 c15198 = (C15198) ((AbstractC11588) c12102.f33846.f70094.f25709.get(iIntValue));
                    return c12102.m27986(c15198.f43381) + ":" + c12102.m27986(i) + m5907(c15198, "{", C0249l.f1198d);
                } catch (IndexOutOfBoundsException unused) {
                    return C19768.m44906(iIntValue, "<Invalid bootstrap method index:", ">");
                } catch (NullPointerException unused2) {
                    return "<Missing BootstrapMethods attribute>";
                }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5907(C15198 c15198, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int size = c15198.f43382.size();
        sb.append(str);
        if (size > 0) {
            int i = 0;
            while (i < size) {
                int iIntValue = ((Integer) c15198.f43382.get(i)).intValue();
                boolean z = i != size + (-1);
                String str3 = "";
                String str4 = z ? "^" : "";
                if (z) {
                    str3 = "⾀";
                }
                sb.append(m5906(iIntValue, str4, str3));
                i++;
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5906(int i, String str, String str2) {
        String str3;
        String strConcat;
        C12102 c12102 = this.f6691;
        if (c12102.m27990(i)) {
            AbstractC5396 abstractC5396 = (AbstractC5396) c12102.f33843.get(i);
            Stack stack = this.f6690;
            if (stack.search(this) == -1) {
                stack.push(this);
                String strConcat2 = "".concat(c12102.m27983(i)).concat(str);
                stack.pop();
                return strConcat2;
            }
            if (abstractC5396 instanceof C3384) {
                str3 = String.format("%-8s %d:#%d; ", abstractC5396.f12856.m32047(), abstractC5396.f12857, Integer.valueOf(((C3384) abstractC5396).f6689));
            } else {
                str3 = String.format("%-8s #%d; ", abstractC5396.f12856.m32047(), abstractC5396.f12857);
            }
            String str4 = "circular reference to " + abstractC5396.f12856.m32047() + " #" + i;
            if (c12102.f32275) {
                strConcat = "".concat(c12102.m26671(25, str3)).concat("<").concat(str4).concat(">").concat(str);
            } else {
                strConcat = "".concat(c12102.m26671(25, str3)).concat(" // <").concat(str4).concat(">").concat(str2);
            }
            abstractC5396.m11845(new IOException(str4));
            return strConcat;
        }
        return c12102.f33844.m48081("??? The entry is missing from the constant_pool table", new Object[0]);
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ֫ */
    public final void mo5908(InterfaceC3446 interfaceC3446, int i) {
        super.mo5908(interfaceC3446, i);
        m5905();
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ۧ */
    public final void mo5909(InterfaceC3446 interfaceC3446, int i) {
        super.mo5909(interfaceC3446, i);
        m5905();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m5905() {
        C12102 c12102 = this.f6691;
        boolean z = c12102.f32292;
        EnumC14113 enumC14113 = this.f12856;
        int i = this.f6689;
        Object obj = this.f12857;
        if (z) {
            switch (enumC14113.ordinal()) {
                case 8:
                case 9:
                case 10:
                    c12102.m26680("#%d.#%d;", obj, Integer.valueOf(i));
                    break;
                case 11:
                    c12102.m26680("#%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 12:
                case 14:
                case 15:
                    c12102.m26680("%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 13:
                default:
                    c12102.m26675(this.f12854, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                    c12102.m26676(" // unknown tag: " + enumC14113.f40058);
                    break;
            }
        }
        switch (enumC14113.ordinal()) {
            case 8:
            case 9:
            case 10:
                c12102.m26675(this.f12854, String.format("#%d.#%d;", obj, Integer.valueOf(i)));
                c12102.m26676(" // " + mo5910());
                break;
            case 11:
                c12102.m26675(this.f12854, String.format("#%d:#%d;", obj, Integer.valueOf(i)));
                c12102.m26676(" // " + mo5910());
                break;
            case 12:
                c12102.m26675(this.f12854, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c12102.m26676(" // " + mo5910());
                break;
            case 13:
            default:
                c12102.m26675(this.f12854, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c12102.m26676(" // unknown tag: " + enumC14113.f40058);
                break;
            case 14:
            case 15:
                c12102.m26675(this.f12854, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c12102.m26680(" // #%d:%s", obj, c12102.m27986(i));
                break;
        }
    }
}
