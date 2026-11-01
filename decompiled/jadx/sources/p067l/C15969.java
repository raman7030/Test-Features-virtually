package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15969 implements InterfaceC11316 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f46238;

    /* JADX INFO: renamed from: ۜ */
    public InterfaceC11316 f46239;

    /* JADX INFO: renamed from: ۧ */
    public C17981 f46240;

    /* JADX INFO: renamed from: ܳ */
    public boolean f46241;

    /* JADX INFO: renamed from: ܽ */
    public C19323 f46242;

    /* JADX INFO: renamed from: ܿ */
    public boolean f46243;

    /* JADX INFO: renamed from: ᩳ */
    public C18652 f46244;

    /* JADX INFO: renamed from: ᩻ */
    public List f46245;

    public C15969(List list, boolean z, InterfaceC11316 interfaceC11316, boolean z2) {
        this.f46245 = list;
        this.f46241 = z;
        this.f46239 = interfaceC11316;
        this.f46243 = z2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36305() {
        this.f46239 = null;
    }

    /* JADX INFO: renamed from: ۡ */
    private void m36288() {
        if (this.f46241) {
            return;
        }
        this.f46245 = new ArrayList(this.f46245);
        this.f46241 = true;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m36289() {
        if (this.f46238 == null) {
            this.f46238 = new ArrayList(this.f46245.size());
            for (int i = 0; i < this.f46245.size(); i++) {
                this.f46238.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m36300() {
        return this.f46245.size();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m36307() {
        return this.f46245.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6285 m36297(int i) {
        return m36286(i, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC6285 m36286(int i, boolean z) {
        ArrayList arrayList = this.f46238;
        if (arrayList == null) {
            return (AbstractC6285) this.f46245.get(i);
        }
        C17310 c17310 = (C17310) arrayList.get(i);
        if (c17310 == null) {
            return (AbstractC6285) this.f46245.get(i);
        }
        return z ? c17310.m39268() : c17310.m39272();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21296 m36291(int i) {
        m36289();
        C17310 c17310 = (C17310) this.f46238.get(i);
        if (c17310 == null) {
            C17310 c17311 = new C17310((AbstractC6285) this.f46245.get(i), this, this.f46243);
            this.f46238.set(i, c17311);
            c17310 = c17311;
        }
        return c17310.m39273();
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC5773 m36301(int i) {
        ArrayList arrayList = this.f46238;
        if (arrayList == null) {
            return (InterfaceC5773) this.f46245.get(i);
        }
        C17310 c17310 = (C17310) arrayList.get(i);
        if (c17310 == null) {
            return (InterfaceC5773) this.f46245.get(i);
        }
        return c17310.m39270();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36303(int i, AbstractC6285 abstractC6285) {
        C17310 c17310;
        byte[] bArr = C15671.f44805;
        abstractC6285.getClass();
        m36288();
        this.f46245.set(i, abstractC6285);
        ArrayList arrayList = this.f46238;
        if (arrayList != null && (c17310 = (C17310) arrayList.set(i, null)) != null) {
            c17310.m39271();
        }
        m36287();
        m36290();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36299(AbstractC6285 abstractC6285) {
        byte[] bArr = C15671.f44805;
        abstractC6285.getClass();
        m36288();
        this.f46245.add(abstractC6285);
        ArrayList arrayList = this.f46238;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m36287();
        m36290();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36298(int i, AbstractC6285 abstractC6285) {
        byte[] bArr = C15671.f44805;
        abstractC6285.getClass();
        m36288();
        this.f46245.add(i, abstractC6285);
        ArrayList arrayList = this.f46238;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m36287();
        m36290();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36294(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC6285 abstractC6285 = (AbstractC6285) it.next();
            byte[] bArr = C15671.f44805;
            abstractC6285.getClass();
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return;
            } else {
                size = collection.size();
            }
        } else {
            size = -1;
        }
        m36288();
        if (size >= 0) {
            List list = this.f46245;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m36299((AbstractC6285) it2.next());
        }
        m36287();
        m36290();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21296 m36293(AbstractC6285 abstractC6285) {
        m36288();
        m36289();
        C17310 c17310 = new C17310(abstractC6285, this, this.f46243);
        this.f46245.add(null);
        this.f46238.add(c17310);
        m36287();
        m36290();
        return c17310.m39273();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21296 m36292(int i, AbstractC6285 abstractC6285) {
        m36288();
        m36289();
        C17310 c17310 = new C17310(abstractC6285, this, this.f46243);
        this.f46245.add(i, null);
        this.f46238.add(i, c17310);
        m36287();
        m36290();
        return c17310.m39273();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36306(int i) {
        C17310 c17310;
        m36288();
        this.f46245.remove(i);
        ArrayList arrayList = this.f46238;
        if (arrayList != null && (c17310 = (C17310) arrayList.remove(i)) != null) {
            c17310.m39271();
        }
        m36287();
        m36290();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36302() {
        this.f46245 = Collections.EMPTY_LIST;
        this.f46241 = false;
        ArrayList<C17310> arrayList = this.f46238;
        if (arrayList != null) {
            for (C17310 c17310 : arrayList) {
                if (c17310 != null) {
                    c17310.m39271();
                }
            }
            this.f46238 = null;
        }
        m36287();
        m36290();
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m36296() {
        this.f46243 = true;
        boolean z = this.f46241;
        if (!z && this.f46238 == null) {
            return this.f46245;
        }
        if (!z) {
            for (int i = 0; i < this.f46245.size(); i++) {
                InterfaceC24548 interfaceC24548 = (InterfaceC24548) this.f46245.get(i);
                C17310 c17310 = (C17310) this.f46238.get(i);
                if (c17310 == null || c17310.m39268() == interfaceC24548) {
                }
            }
            return this.f46245;
        }
        m36288();
        for (int i2 = 0; i2 < this.f46245.size(); i2++) {
            this.f46245.set(i2, m36286(i2, true));
        }
        List listUnmodifiableList = C21562.unmodifiableList(this.f46245);
        this.f46245 = listUnmodifiableList;
        this.f46241 = false;
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final List m36308() {
        if (this.f46242 == null) {
            this.f46242 = new C19323(this);
        }
        return this.f46242;
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m36304() {
        if (this.f46240 == null) {
            this.f46240 = new C17981(this);
        }
        return this.f46240;
    }

    /* JADX INFO: renamed from: ۜ */
    public final List m36295() {
        if (this.f46244 == null) {
            this.f46244 = new C18652(this);
        }
        return this.f46244;
    }

    /* JADX INFO: renamed from: ۖ */
    private void m36287() {
        InterfaceC11316 interfaceC11316;
        if (!this.f46243 || (interfaceC11316 = this.f46239) == null) {
            return;
        }
        interfaceC11316.mo26264();
        this.f46243 = false;
    }

    @Override // p067l.InterfaceC11316
    /* JADX INFO: renamed from: ֫ */
    public final void mo26264() {
        m36287();
    }

    /* JADX INFO: renamed from: ܺ */
    private void m36290() {
        C19323 c19323 = this.f46242;
        if (c19323 != null) {
            c19323.m44017();
        }
        C17981 c17981 = this.f46240;
        if (c17981 != null) {
            c17981.m40925();
        }
        C18652 c18652 = this.f46244;
        if (c18652 != null) {
            c18652.m42403();
        }
    }
}
