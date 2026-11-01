package p067l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.۫ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14080 {

    /* JADX INFO: renamed from: ܳ */
    public final C8374 f39894;

    /* JADX INFO: renamed from: ܽ */
    public final C8200 f39895;

    /* JADX INFO: renamed from: ܿ */
    public final C5363 f39896;

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashSet f39893 = new LinkedHashSet();

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashMap f39892 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final C14750 f39897 = new C14750(this);

    public C14080(C8374 c8374, C8200 c8200) {
        this.f39894 = c8374;
        this.f39895 = c8200;
        this.f39896 = new C5363(this, c8374);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31949(AbstractC6462 abstractC6462) {
        return C14750.m33698(this.f39897, this.f39894.m19459(abstractC6462));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31953(AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462M19459 = this.f39894.m19459(abstractC6462);
        C5363 c5363 = this.f39896;
        c5363.f12646.f48564 = 0;
        c5363.mo10687(abstractC6462M19459);
        C16525 c16525 = c5363.f12646;
        C8200 c8200 = c5363.f12647.f39895;
        byte[] bArr = c16525.f48563;
        return C14750.m33698(this.f39897, c8200.f21738.mo17847(0, c16525.f48564, bArr));
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m31955(AbstractC7783 abstractC7783) {
        AbstractC12224 abstractC12224Mo17847;
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7354;
        C5363 c5363 = this.f39896;
        C14750 c14750 = this.f39897;
        if (enumC3600 == enumC3601) {
            AbstractC6462 abstractC6462 = abstractC7783.f20406;
            c5363.f12646.f48564 = 0;
            C4848 c4848Mo14802 = abstractC6462.mo14802();
            if (c4848Mo14802.m10293()) {
                c5363.m10682(c4848Mo14802);
            }
            C8374 c8374 = this.f39894;
            c5363.mo10687(c8374.m19502(abstractC6462));
            Iterator it = c8374.m19450(abstractC6462).iterator();
            while (it.hasNext()) {
                c5363.mo10687((AbstractC6462) it.next());
            }
            C16525 c16525 = c5363.f12646;
            C8200 c8200 = c5363.f12647.f39895;
            byte[] bArr = c16525.f48563;
            abstractC12224Mo17847 = c8200.f21738.mo17847(0, c16525.f48564, bArr);
        } else {
            AbstractC6462 abstractC6463 = abstractC7783.f20406;
            c5363.f12646.f48564 = 0;
            c5363.mo10687(abstractC6463);
            C16525 c16526 = c5363.f12646;
            C8200 c8201 = c5363.f12647.f39895;
            byte[] bArr2 = c16526.f48563;
            abstractC12224Mo17847 = c8201.f21738.mo17847(0, c16526.f48564, bArr2);
        }
        return C14750.m33698(c14750, abstractC12224Mo17847);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31948(Object obj) {
        if (obj instanceof Integer) {
            return m31951((InterfaceC10057) new C3351(3, (Integer) obj));
        }
        if (obj instanceof Float) {
            return m31951((InterfaceC10057) new C3351(4, (Float) obj));
        }
        if (obj instanceof Long) {
            return m31951((InterfaceC10057) new C3351(5, (Long) obj));
        }
        if (obj instanceof Double) {
            return m31951((InterfaceC10057) new C3351(6, (Double) obj));
        }
        if (obj instanceof String) {
            return m31951((InterfaceC10057) C7375.m17097((String) obj));
        }
        throw new AssertionError(C7470.m17246(obj, "unexpected constant: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final int m31951(InterfaceC10057 interfaceC10057) {
        int iMo3348 = interfaceC10057.mo3348();
        if (iMo3348 == 7) {
            return m31949((AbstractC6462) interfaceC10057);
        }
        C14750 c14750 = this.f39897;
        if (iMo3348 == 16) {
            return C14750.m33698(c14750, this.f39894.m19459((AbstractC6462) interfaceC10057));
        }
        return C14750.m33698(c14750, interfaceC10057);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31954(AbstractC7783 abstractC7783) {
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7343;
        C8374 c8374 = this.f39894;
        return C14750.m33698(this.f39897, new C16761(abstractC12224, enumC3600 == enumC3601 ? abstractC7783.m18015(c8374) : abstractC7783.mo18010(c8374)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31952(C15828 c15828) {
        if (c15828.f20406.mo7388()) {
            throw new AssertionError("Unexpected intersection type: " + c15828.f20406);
        }
        c15828.mo18020();
        if (c15828.f20407.m17990() != null) {
            LinkedHashSet linkedHashSet = this.f39893;
            if (linkedHashSet.contains(c15828)) {
                return;
            }
            m31952(c15828.f20407.m17990());
            linkedHashSet.add(c15828);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31950(AbstractC7783 abstractC7783) {
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7343;
        C8374 c8374 = this.f39894;
        return m31953(enumC3600 == enumC3601 ? abstractC7783.m18015(c8374) : abstractC7783.mo18010(c8374));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31945(C14080 c14080, InterfaceC2680 interfaceC2680) {
        C20787 c20787Mo4146 = interfaceC2680.mo4146(c14080.f39894);
        LinkedHashMap linkedHashMap = c14080.f39892;
        Integer numValueOf = (Integer) linkedHashMap.get(c20787Mo4146);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(c20787Mo4146, numValueOf);
        }
        return numValueOf.intValue();
    }
}
