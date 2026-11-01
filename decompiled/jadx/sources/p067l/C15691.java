package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15691 extends AbstractC3761 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5634 f45478;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f45479;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f45480;

    /* JADX INFO: renamed from: ܿ */
    public volatile EnumC24409 f45481;

    /* JADX INFO: renamed from: ᩳ */
    public C13681 f45482;

    public C15691() {
        throw null;
    }

    public C15691(InterfaceC5634 interfaceC5634, EnumC24409 enumC24409, LinkedHashMap linkedHashMap) {
        this.f45478 = interfaceC5634;
        this.f45479 = true;
        this.f45481 = enumC24409;
        this.f45482 = new C13681(this, linkedHashMap);
        this.f45480 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15691 m35735(C21728 c21728) {
        return new C15691(new C15021(c21728), EnumC24409.MAP, new LinkedHashMap());
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m35733(C13681 c13681) {
        ArrayList arrayList = new ArrayList();
        C12340 c12340 = (C12340) ((C8316) c13681.entrySet()).iterator();
        if (!c12340.hasNext()) {
            return arrayList;
        }
        Map.Entry entry = (Map.Entry) c12340.next();
        entry.getKey();
        entry.getValue();
        ((C15021) this.f45478).m34396();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C13681 m35734(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC24548 interfaceC24548 = (InterfaceC24548) it.next();
            ((C15021) this.f45478).getClass();
            ((C21728) interfaceC24548).getClass();
            linkedHashMap.put(null, null);
        }
        return new C13681(this, linkedHashMap);
    }

    /* JADX INFO: renamed from: ܳ */
    public final Map m35737() {
        EnumC24409 enumC24409 = this.f45481;
        EnumC24409 enumC244010 = EnumC24409.LIST;
        if (enumC24409 == enumC244010) {
            synchronized (this) {
                if (this.f45481 == enumC244010) {
                    this.f45482 = m35734(this.f45480);
                    this.f45481 = EnumC24409.BOTH;
                }
            }
        }
        return C21562.unmodifiableMap(this.f45482);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Map m35741() {
        EnumC24409 enumC24409 = this.f45481;
        EnumC24409 enumC244010 = EnumC24409.MAP;
        if (enumC24409 != enumC244010) {
            if (this.f45481 == EnumC24409.LIST) {
                this.f45482 = m35734(this.f45480);
            }
            this.f45480 = null;
            this.f45481 = enumC244010;
        }
        return this.f45482;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15691) {
            return C9657.m22465(m35737(), ((C15691) obj).m35737());
        }
        return false;
    }

    public final int hashCode() {
        return C9657.m22464(m35737());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35739() {
        new C15691(this.f45478, EnumC24409.MAP, C9657.m22467(m35737()));
    }

    @Override // p067l.AbstractC3761
    /* JADX INFO: renamed from: ֫ */
    public final List mo7259() {
        EnumC24409 enumC24409 = this.f45481;
        EnumC24409 enumC244010 = EnumC24409.MAP;
        if (enumC24409 == enumC244010) {
            synchronized (this) {
                if (this.f45481 == enumC244010) {
                    this.f45480 = m35733(this.f45482);
                    this.f45481 = EnumC24409.BOTH;
                }
            }
        }
        return C21562.unmodifiableList(this.f45480);
    }

    @Override // p067l.AbstractC3761
    /* JADX INFO: renamed from: ܽ */
    public final List mo7261() {
        EnumC24409 enumC24409 = this.f45481;
        EnumC24409 enumC244010 = EnumC24409.LIST;
        if (enumC24409 != enumC244010) {
            if (this.f45481 == EnumC24409.MAP) {
                this.f45480 = m35733(this.f45482);
            }
            this.f45482 = null;
            this.f45481 = enumC244010;
        }
        return this.f45480;
    }

    @Override // p067l.AbstractC3761
    /* JADX INFO: renamed from: ۧ */
    public final C21728 mo7260() {
        return ((C15021) this.f45478).m34397();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m35740() {
        this.f45479 = false;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m35736() {
        return this.f45479;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35738() {
        if (!this.f45479) {
            throw new UnsupportedOperationException();
        }
    }
}
