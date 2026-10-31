package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܽۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public class C16384 extends AbstractC8624 implements InterfaceC12675 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9953 f50415;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50416;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 f50417;

    public C16384() {
        throw null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m38583() {
        return this.f50416;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m38584() {
        C6507 c6507M38579;
        C9953 c9953;
        if (!this.f50416 || this.f50417.m8245() != 1 || m38579() == null || (c6507M38579 = m38579()) == null || (c9953 = c6507M38579.f50415) == null || c9953.f30045 == EnumC9372.UNKNOWN) {
            return false;
        }
        this.f50415 = c9953;
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38581() {
        this.f50416 = true;
    }

    public C16384(AbstractC4308 abstractC4308, C2609 c2609, C9953 c9953) {
        super(abstractC4308);
        this.f50416 = false;
        this.f50417 = c2609;
        this.f50415 = c9953;
    }

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ۧ */
    public final C9953 mo5383() {
        C23069 c23069;
        if (m38582()) {
            C2609 c2609 = this.f50417;
            if (c2609.m8245() != 0) {
                AbstractC10370 abstractC10370 = ((C3581) ((C23069) c2609.f8240).f74207).f17562.f31203.f37517.f18860;
                Iterator it = c2609.iterator();
                do {
                    if (!it.hasNext()) {
                        c23069 = null;
                        break;
                    }
                    c23069 = (C23069) it.next();
                } while (((C3581) c23069.f74207).f17562 != abstractC10370);
                this.f50415 = c23069 != null ? ((AbstractC8624) c23069.f74208).mo5383() : null;
            }
        }
        return this.f50415;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C6507 m38579() {
        C2609 c2609 = this.f50417;
        if (c2609.m8245() != 1) {
            return null;
        }
        C23069 c23069 = (C23069) c2609.get(0);
        if (!((C3581) c23069.f74207).f17562.mo26175(b.d)) {
            return null;
        }
        Object obj = c23069.f74208;
        if (!(obj instanceof C1568)) {
            return null;
        }
        AbstractC8624[] abstractC8624Arr = ((C1568) obj).f5564;
        if (abstractC8624Arr.length == 0) {
            return null;
        }
        AbstractC8624 abstractC8624 = abstractC8624Arr[0];
        if (abstractC8624 instanceof C6507) {
            return (C6507) abstractC8624;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m38582() {
        return this.f50415.f30045 == EnumC9372.UNKNOWN;
    }

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ֫ */
    public final void mo5382(InterfaceC9330 interfaceC9330) {
        interfaceC9330.mo24018(this);
    }

    @Override // l.InterfaceC10559
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.f26338);
        C2609<C23069> c2609 = this.f50417;
        int iM8245 = c2609.m8245();
        if (iM8245 > 0) {
            sb.append('(');
            boolean z = true;
            for (C23069 c23069 : c2609) {
                if (!z) {
                    sb.append(", ");
                }
                AbstractC10370 abstractC10370 = ((C3581) c23069.f74207).f17562;
                if (iM8245 > 1 || abstractC10370 != abstractC10370.f31203.f37517.f18860) {
                    sb.append((CharSequence) abstractC10370);
                    sb.append(a.h);
                }
                sb.append(c23069.f74208);
                z = false;
            }
            sb.append(')');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 m38580(AbstractC10370 abstractC10370) {
        for (C23069 c23069 : this.f50417) {
            if (((C3581) c23069.f74207).f17562 == abstractC10370) {
                if (c23069 == null) {
                    return null;
                }
                return (AbstractC8624) c23069.f74208;
            }
        }
        c23069 = null;
        if (c23069 == null) {
            return null;
        }
        return (AbstractC8624) c23069.f74208;
    }

    @Override // l.AbstractC8624, l.InterfaceC10559
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5381(InterfaceC6325 interfaceC6325) {
        return Boolean.FALSE;
    }

    @Override // l.InterfaceC12675
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC19753 mo30951() {
        return (InterfaceC19753) this.f26338;
    }

    @Override // l.InterfaceC12675
    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap mo30950() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C23069 c23069 : this.f50417) {
            linkedHashMap.put((C3581) c23069.f74207, (AbstractC8624) c23069.f74208);
        }
        return linkedHashMap;
    }
}
