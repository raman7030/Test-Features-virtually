package l;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C16114 extends AbstractC5763 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10038 f49652;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f49653;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Class f49654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f49655;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23338 f49656;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC9997 f49657;

    public C16114(C14975 c14975, Class cls, InterfaceC23338 interfaceC23338, EnumC9997 enumC9997) {
        if (InterfaceC23338.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC23338)) {
            throw new IllegalArgumentException("Bad messageDefaultInstance for ".concat(cls.getName()));
        }
        this.f49652 = c14975;
        this.f49654 = cls;
        this.f49656 = interfaceC23338;
        if (InterfaceC13460.class.isAssignableFrom(cls)) {
            this.f49655 = AbstractC4121.m12387(cls, "valueOf", C2235.class);
            this.f49653 = AbstractC4121.m12387(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f49655 = null;
            this.f49653 = null;
        }
        this.f49657 = enumC9997;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38017(C0117 c0117) {
        if (this.f49652 != null) {
            throw new IllegalStateException("Already initialized.");
        }
        this.f49652 = new C9060(c0117);
    }

    @Override // l.AbstractC5763
    /* JADX INFO: renamed from: ۧ */
    public final C0117 mo16212() {
        InterfaceC10038 interfaceC10038 = this.f49652;
        if (interfaceC10038 == null) {
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        }
        return interfaceC10038.mo13123();
    }

    @Override // l.AbstractC5763
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC23338 mo16213() {
        return this.f49656;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC9997 m38019() {
        return this.f49657;
    }

    @Override // l.AbstractC5763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16209(Object obj) {
        C0117 c0117Mo16212 = mo16212();
        if (c0117Mo16212.mo1129()) {
            if (c0117Mo16212.m1138() != EnumC18463.MESSAGE && c0117Mo16212.m1138() != EnumC18463.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m38018(it.next()));
            }
            return arrayList;
        }
        return m38018(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m38018(Object obj) {
        int i = C21327.f68722[mo16212().m1138().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC4121.m12386(this.f49655, (Object) null, obj);
            }
        } else if (!this.f49654.isInstance(obj)) {
            return this.f49656.newBuilderForType().mergeFrom((InterfaceC23338) obj).build();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC5763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16210(C14724 c14724) {
        C0117 c0117Mo16212 = mo16212();
        boolean zMo1129 = c0117Mo16212.mo1129();
        Method method = this.f49653;
        if (zMo1129) {
            if (c0117Mo16212.m1138() == EnumC18463.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object objM12386 : (List) c14724) {
                    if (C21327.f68722[mo16212().m1138().ordinal()] == 2) {
                        objM12386 = AbstractC4121.m12386(method, objM12386, new Object[0]);
                    }
                    arrayList.add(objM12386);
                }
                return arrayList;
            }
        } else {
            if (C21327.f68722[mo16212().m1138().ordinal()] == 2) {
                return AbstractC4121.m12386(method, c14724, new Object[0]);
            }
        }
        return c14724;
    }
}
