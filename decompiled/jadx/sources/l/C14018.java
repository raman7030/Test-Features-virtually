package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14018 extends AbstractC1466 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3436 f42395;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f42396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f42397;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile EnumC23191 f42398;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11903 f42399;

    public C14018() {
        throw null;
    }

    public C14018(InterfaceC3436 interfaceC3436, EnumC23191 enumC23191, LinkedHashMap linkedHashMap) {
        this.f42395 = interfaceC3436;
        this.f42396 = true;
        this.f42398 = enumC23191;
        this.f42399 = new C11903(this, linkedHashMap);
        this.f42397 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14018 m33615(C20370 c20370) {
        return new C14018(new C13313(c20370), EnumC23191.MAP, new LinkedHashMap());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m33613(C11903 c11903) {
        ArrayList arrayList = new ArrayList();
        C10492 c10492 = (C10492) ((C6258) c11903.entrySet()).iterator();
        if (!c10492.hasNext()) {
            return arrayList;
        }
        Map.Entry entry = (Map.Entry) c10492.next();
        entry.getKey();
        entry.getValue();
        ((C13313) this.f42395).m32296();
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11903 m33614(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC23338 interfaceC23338 = (InterfaceC23338) it.next();
            ((C13313) this.f42395).getClass();
            ((C20370) interfaceC23338).getClass();
            linkedHashMap.put(null, null);
        }
        return new C11903(this, linkedHashMap);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map m33617() {
        EnumC23191 enumC23191 = this.f42398;
        EnumC23191 enumC23192 = EnumC23191.LIST;
        if (enumC23191 == enumC23192) {
            synchronized (this) {
                if (this.f42398 == enumC23192) {
                    this.f42399 = m33614(this.f42397);
                    this.f42398 = EnumC23191.BOTH;
                }
            }
        }
        return C20195.unmodifiableMap(this.f42399);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Map m33621() {
        EnumC23191 enumC23191 = this.f42398;
        EnumC23191 enumC23192 = EnumC23191.MAP;
        if (enumC23191 != enumC23192) {
            if (this.f42398 == EnumC23191.LIST) {
                this.f42399 = m33614(this.f42397);
            }
            this.f42397 = null;
            this.f42398 = enumC23192;
        }
        return this.f42399;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14018) {
            return C7669.m20485(m33617(), ((C14018) obj).m33617());
        }
        return false;
    }

    public final int hashCode() {
        return C7669.m20484(m33617());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33619() {
        new C14018(this.f42395, EnumC23191.MAP, C7669.m20487(m33617()));
    }

    @Override // l.AbstractC1466
    /* JADX INFO: renamed from: ֫ */
    public final List mo5016() {
        EnumC23191 enumC23191 = this.f42398;
        EnumC23191 enumC23192 = EnumC23191.MAP;
        if (enumC23191 == enumC23192) {
            synchronized (this) {
                if (this.f42398 == enumC23192) {
                    this.f42397 = m33613(this.f42399);
                    this.f42398 = EnumC23191.BOTH;
                }
            }
        }
        return C20195.unmodifiableList(this.f42397);
    }

    @Override // l.AbstractC1466
    /* JADX INFO: renamed from: ܽ */
    public final List mo5018() {
        EnumC23191 enumC23191 = this.f42398;
        EnumC23191 enumC23192 = EnumC23191.LIST;
        if (enumC23191 != enumC23192) {
            if (this.f42398 == EnumC23191.MAP) {
                this.f42397 = m33613(this.f42399);
            }
            this.f42399 = null;
            this.f42398 = enumC23192;
        }
        return this.f42397;
    }

    @Override // l.AbstractC1466
    /* JADX INFO: renamed from: ۧ */
    public final C20370 mo5017() {
        return ((C13313) this.f42395).m32297();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33620() {
        this.f42396 = false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m33616() {
        return this.f42396;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33618() {
        if (!this.f42396) {
            throw new UnsupportedOperationException();
        }
    }
}
