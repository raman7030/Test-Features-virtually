package p067l;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C17683 extends AbstractC7845 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11908 f52818;

    /* JADX INFO: renamed from: ۧ */
    public final Method f52819;

    /* JADX INFO: renamed from: ܳ */
    public final Class f52820;

    /* JADX INFO: renamed from: ܽ */
    public final Method f52821;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC24548 f52822;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC11869 f52823;

    public C17683(C16600 c16600, Class cls, InterfaceC24548 interfaceC24548, EnumC11869 enumC11869) {
        if (InterfaceC24548.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC24548)) {
            throw new IllegalArgumentException("Bad messageDefaultInstance for ".concat(cls.getName()));
        }
        this.f52818 = c16600;
        this.f52820 = cls;
        this.f52822 = interfaceC24548;
        if (InterfaceC15160.class.isAssignableFrom(cls)) {
            this.f52821 = AbstractC6285.m14276(cls, "valueOf", C4492.class);
            this.f52819 = AbstractC6285.m14276(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f52821 = null;
            this.f52819 = null;
        }
        this.f52823 = enumC11869;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40208(C2479 c2479) {
        if (this.f52818 != null) {
            throw new IllegalStateException("Already initialized.");
        }
        this.f52818 = new C10979(c2479);
    }

    @Override // p067l.AbstractC7845
    /* JADX INFO: renamed from: ۧ */
    public final C2479 mo18131() {
        InterfaceC11908 interfaceC11908 = this.f52818;
        if (interfaceC11908 == null) {
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        }
        return interfaceC11908.mo14987();
    }

    @Override // p067l.AbstractC7845
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC24548 mo18132() {
        return this.f52822;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC11869 m40210() {
        return this.f52823;
    }

    @Override // p067l.AbstractC7845
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18128(Object obj) {
        C2479 c2479Mo18131 = mo18131();
        if (c2479Mo18131.mo3530()) {
            if (c2479Mo18131.m3539() != EnumC19915.MESSAGE && c2479Mo18131.m3539() != EnumC19915.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m40209(it.next()));
            }
            return arrayList;
        }
        return m40209(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m40209(Object obj) {
        int i = C22637.f71416[mo18131().m3539().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC6285.m14275(this.f52821, (Object) null, obj);
            }
        } else if (!this.f52820.isInstance(obj)) {
            return this.f52822.newBuilderForType().mergeFrom((InterfaceC24548) obj).build();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC7845
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18129(C16362 c16362) {
        C2479 c2479Mo18131 = mo18131();
        boolean zMo3530 = c2479Mo18131.mo3530();
        Method method = this.f52819;
        if (zMo3530) {
            if (c2479Mo18131.m3539() == EnumC19915.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object objM14275 : (List) c16362) {
                    if (C22637.f71416[mo18131().m3539().ordinal()] == 2) {
                        objM14275 = AbstractC6285.m14275(method, objM14275, new Object[0]);
                    }
                    arrayList.add(objM14275);
                }
                return arrayList;
            }
        } else {
            if (C22637.f71416[mo18131().m3539().ordinal()] == 2) {
                return AbstractC6285.m14275(method, c16362, new Object[0]);
            }
        }
        return c16362;
    }
}
