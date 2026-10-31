package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14311 implements InterfaceC9415 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f43146;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC9415 f43147;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16428 f43148;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f43149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17840 f43150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f43151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17134 f43152;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f43153;

    public C14311(List list, boolean z, InterfaceC9415 interfaceC9415, boolean z2) {
        this.f43153 = list;
        this.f43149 = z;
        this.f43147 = interfaceC9415;
        this.f43151 = z2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34172() {
        this.f43147 = null;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m34155() {
        if (this.f43149) {
            return;
        }
        this.f43153 = new ArrayList(this.f43153);
        this.f43149 = true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m34156() {
        if (this.f43146 == null) {
            this.f43146 = new ArrayList(this.f43153.size());
            for (int i = 0; i < this.f43153.size(); i++) {
                this.f43146.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m34167() {
        return this.f43153.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34174() {
        return this.f43153.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4121 m34164(int i) {
        return m34153(i, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4121 m34153(int i, boolean z) {
        ArrayList arrayList = this.f43146;
        if (arrayList == null) {
            return (AbstractC4121) this.f43153.get(i);
        }
        C15722 c15722 = (C15722) arrayList.get(i);
        if (c15722 == null) {
            return (AbstractC4121) this.f43153.get(i);
        }
        return z ? c15722.m37099() : c15722.m37103();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19916 m34158(int i) {
        m34156();
        C15722 c15722 = (C15722) this.f43146.get(i);
        if (c15722 == null) {
            C15722 c15723 = new C15722((AbstractC4121) this.f43153.get(i), this, this.f43151);
            this.f43146.set(i, c15723);
            c15722 = c15723;
        }
        return c15722.m37104();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3583 m34168(int i) {
        ArrayList arrayList = this.f43146;
        if (arrayList == null) {
            return (InterfaceC3583) this.f43153.get(i);
        }
        C15722 c15722 = (C15722) arrayList.get(i);
        if (c15722 == null) {
            return (InterfaceC3583) this.f43153.get(i);
        }
        return c15722.m37101();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34170(int i, AbstractC4121 abstractC4121) {
        C15722 c15722;
        byte[] bArr = C13997.f41722;
        abstractC4121.getClass();
        m34155();
        this.f43153.set(i, abstractC4121);
        ArrayList arrayList = this.f43146;
        if (arrayList != null && (c15722 = (C15722) arrayList.set(i, null)) != null) {
            c15722.m37102();
        }
        m34154();
        m34157();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34166(AbstractC4121 abstractC4121) {
        byte[] bArr = C13997.f41722;
        abstractC4121.getClass();
        m34155();
        this.f43153.add(abstractC4121);
        ArrayList arrayList = this.f43146;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m34154();
        m34157();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34165(int i, AbstractC4121 abstractC4121) {
        byte[] bArr = C13997.f41722;
        abstractC4121.getClass();
        m34155();
        this.f43153.add(i, abstractC4121);
        ArrayList arrayList = this.f43146;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m34154();
        m34157();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34161(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC4121 abstractC4121 = (AbstractC4121) it.next();
            byte[] bArr = C13997.f41722;
            abstractC4121.getClass();
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
        m34155();
        if (size >= 0) {
            List list = this.f43153;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m34166((AbstractC4121) it2.next());
        }
        m34154();
        m34157();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19916 m34160(AbstractC4121 abstractC4121) {
        m34155();
        m34156();
        C15722 c15722 = new C15722(abstractC4121, this, this.f43151);
        this.f43153.add(null);
        this.f43146.add(c15722);
        m34154();
        m34157();
        return c15722.m37104();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19916 m34159(int i, AbstractC4121 abstractC4121) {
        m34155();
        m34156();
        C15722 c15722 = new C15722(abstractC4121, this, this.f43151);
        this.f43153.add(i, null);
        this.f43146.add(i, c15722);
        m34154();
        m34157();
        return c15722.m37104();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34173(int i) {
        C15722 c15722;
        m34155();
        this.f43153.remove(i);
        ArrayList arrayList = this.f43146;
        if (arrayList != null && (c15722 = (C15722) arrayList.remove(i)) != null) {
            c15722.m37102();
        }
        m34154();
        m34157();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34169() {
        this.f43153 = Collections.EMPTY_LIST;
        this.f43149 = false;
        ArrayList<C15722> arrayList = this.f43146;
        if (arrayList != null) {
            for (C15722 c15722 : arrayList) {
                if (c15722 != null) {
                    c15722.m37102();
                }
            }
            this.f43146 = null;
        }
        m34154();
        m34157();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m34163() {
        this.f43151 = true;
        boolean z = this.f43149;
        if (!z && this.f43146 == null) {
            return this.f43153;
        }
        if (!z) {
            for (int i = 0; i < this.f43153.size(); i++) {
                InterfaceC23338 interfaceC23338 = (InterfaceC23338) this.f43153.get(i);
                C15722 c15722 = (C15722) this.f43146.get(i);
                if (c15722 == null || c15722.m37099() == interfaceC23338) {
                }
            }
            return this.f43153;
        }
        m34155();
        for (int i2 = 0; i2 < this.f43153.size(); i2++) {
            this.f43153.set(i2, m34153(i2, true));
        }
        List listUnmodifiableList = C20195.unmodifiableList(this.f43153);
        this.f43153 = listUnmodifiableList;
        this.f43149 = false;
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List m34175() {
        if (this.f43150 == null) {
            this.f43150 = new C17840(this);
        }
        return this.f43150;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m34171() {
        if (this.f43148 == null) {
            this.f43148 = new C16428(this);
        }
        return this.f43148;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m34162() {
        if (this.f43152 == null) {
            this.f43152 = new C17134(this);
        }
        return this.f43152;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m34154() {
        InterfaceC9415 interfaceC9415;
        if (!this.f43151 || (interfaceC9415 = this.f43147) == null) {
            return;
        }
        interfaceC9415.mo24254();
        this.f43151 = false;
    }

    @Override // l.InterfaceC9415
    /* JADX INFO: renamed from: ֫ */
    public final void mo24254() {
        m34154();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m34157() {
        C17840 c17840 = this.f43150;
        if (c17840 != null) {
            c17840.m41771();
        }
        C16428 c16428 = this.f43148;
        if (c16428 != null) {
            c16428.m38700();
        }
        C17134 c17134 = this.f43152;
        if (c17134 != null) {
            c17134.m40158();
        }
    }
}
