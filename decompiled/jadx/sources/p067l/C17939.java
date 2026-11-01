package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܽۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public class C17939 extends AbstractC10564 implements InterfaceC14415 {

    /* JADX INFO: renamed from: ۧ */
    public C11827 f53587;

    /* JADX INFO: renamed from: ܽ */
    public boolean f53588;

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 f53589;

    public C17939() {
        throw null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m40800() {
        return this.f53588;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m40801() {
        C8552 c8552M40796;
        C11827 c11827;
        if (!this.f53588 || this.f53589.m10289() != 1 || m40796() == null || (c8552M40796 = m40796()) == null || (c11827 = c8552M40796.f53587) == null || c11827.f33002 == EnumC11275.UNKNOWN) {
            return false;
        }
        this.f53587 = c11827;
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40798() {
        this.f53588 = true;
    }

    public C17939(AbstractC6462 abstractC6462, C4848 c4848, C11827 c11827) {
        super(abstractC6462);
        this.f53588 = false;
        this.f53589 = c4848;
        this.f53587 = c11827;
    }

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ۧ */
    public final C11827 mo7612() {
        C24293 c24293;
        if (m40799()) {
            C4848 c4848 = this.f53589;
            if (c4848.m10289() != 0) {
                AbstractC12224 abstractC12224 = ((C5771) ((C24293) c4848.f11034).f76952).f20408.f34165.f40540.f21718;
                Iterator it = c4848.iterator();
                do {
                    if (!it.hasNext()) {
                        c24293 = null;
                        break;
                    }
                    c24293 = (C24293) it.next();
                } while (((C5771) c24293.f76952).f20408 != abstractC12224);
                this.f53587 = c24293 != null ? ((AbstractC10564) c24293.f76953).mo7612() : null;
            }
        }
        return this.f53587;
    }

    /* JADX INFO: renamed from: ۜ */
    private C8552 m40796() {
        C4848 c4848 = this.f53589;
        if (c4848.m10289() != 1) {
            return null;
        }
        C24293 c24293 = (C24293) c4848.get(0);
        if (!((C5771) c24293.f76952).f20408.mo28204(C0226b.f1011d)) {
            return null;
        }
        Object obj = c24293.f76953;
        if (!(obj instanceof C3858)) {
            return null;
        }
        AbstractC10564[] abstractC10564Arr = ((C3858) obj).f8345;
        if (abstractC10564Arr.length == 0) {
            return null;
        }
        AbstractC10564 abstractC10564 = abstractC10564Arr[0];
        if (abstractC10564 instanceof C8552) {
            return (C8552) abstractC10564;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m40799() {
        return this.f53587.f33002 == EnumC11275.UNKNOWN;
    }

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ֫ */
    public final void mo7611(InterfaceC11235 interfaceC11235) {
        interfaceC11235.mo26027(this);
    }

    @Override // p067l.InterfaceC12404
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.f29256);
        C4848<C24293> c4848 = this.f53589;
        int iM10289 = c4848.m10289();
        if (iM10289 > 0) {
            sb.append('(');
            boolean z = true;
            for (C24293 c24293 : c4848) {
                if (!z) {
                    sb.append(", ");
                }
                AbstractC12224 abstractC12224 = ((C5771) c24293.f76952).f20408;
                if (iM10289 > 1 || abstractC12224 != abstractC12224.f34165.f40540.f21718) {
                    sb.append((CharSequence) abstractC12224);
                    sb.append(C0184a.f880h);
                }
                sb.append(c24293.f76953);
                z = false;
            }
            sb.append(')');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10564 m40797(AbstractC12224 abstractC12224) {
        for (C24293 c24293 : this.f53589) {
            if (((C5771) c24293.f76952).f20408 == abstractC12224) {
                if (c24293 == null) {
                    return null;
                }
                return (AbstractC10564) c24293.f76953;
            }
        }
        c24293 = null;
        if (c24293 == null) {
            return null;
        }
        return (AbstractC10564) c24293.f76953;
    }

    @Override // p067l.AbstractC10564, p067l.InterfaceC12404
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7610(InterfaceC8380 interfaceC8380) {
        return Boolean.FALSE;
    }

    @Override // p067l.InterfaceC14415
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC21142 mo33029() {
        return (InterfaceC21142) this.f29256;
    }

    @Override // p067l.InterfaceC14415
    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap mo33028() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C24293 c24293 : this.f53589) {
            linkedHashMap.put((C5771) c24293.f76952, (AbstractC10564) c24293.f76953);
        }
        return linkedHashMap;
    }
}
