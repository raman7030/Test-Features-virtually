package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۜ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes2.dex */
public final class C6426 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19868 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f19869;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f19870;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f19871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f19872;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f19873;

    public /* synthetic */ C6426(int i) {
        this();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17767(C6426 c6426, int i, InterfaceC6633 interfaceC6633) {
        c6426.getClass();
        C23939 c23939 = (C23939) interfaceC6633;
        c23939.getClass();
        if (EnumC23566.ASCENDING == EnumC23566.DESCENDING) {
            List list = c6426.f19873;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c23939.m52758(i, listIterator.previous());
            }
            return;
        }
        Iterator it = c6426.f19873.iterator();
        while (it.hasNext()) {
            c23939.m52758(i, (AbstractC5886) it.next());
        }
    }

    public C6426() {
    }

    static {
        C23359.m51769().m51770();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m17785() {
        return this.f19872;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m17778() {
        return this.f19869;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m17782() {
        return this.f19870;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m17786() {
        return this.f19873;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m17784() {
        return this.f19871;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6426)) {
            return false;
        }
        C6426 c6426 = (C6426) obj;
        return Arrays.equals(new Object[]{this.f19872, this.f19869, this.f19870, this.f19873, this.f19871}, new Object[]{c6426.f19872, c6426.f19869, c6426.f19870, c6426.f19873, c6426.f19871});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19872, this.f19869, this.f19870, this.f19873, this.f19871});
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17783(int i, AbstractC14766 abstractC14766) {
        Iterator it = this.f19872.iterator();
        while (it.hasNext()) {
            abstractC14766.mo35102(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f19869.iterator();
        while (it2.hasNext()) {
            abstractC14766.mo35087(i, ((Integer) it2.next()).intValue());
        }
        Iterator it3 = this.f19870.iterator();
        while (it3.hasNext()) {
            abstractC14766.mo35088(i, ((Long) it3.next()).longValue());
        }
        Iterator it4 = this.f19873.iterator();
        while (it4.hasNext()) {
            abstractC14766.mo35090(i, (AbstractC5886) it4.next());
        }
        Iterator it5 = this.f19871.iterator();
        while (it5.hasNext()) {
            abstractC14766.m35091(i, (C9249) it5.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17777(int i) {
        Iterator it = this.f19872.iterator();
        int serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += AbstractC14766.m35081(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f19869.iterator();
        while (it2.hasNext()) {
            ((Integer) it2.next()).getClass();
            serializedSize += AbstractC14766.m35078(i);
        }
        Iterator it3 = this.f19870.iterator();
        while (it3.hasNext()) {
            ((Long) it3.next()).getClass();
            serializedSize += AbstractC14766.m35073(i) + 8;
        }
        Iterator it4 = this.f19873.iterator();
        while (it4.hasNext()) {
            serializedSize += AbstractC14766.m35076(i, (AbstractC5886) it4.next());
        }
        for (C9249 c9249 : this.f19871) {
            serializedSize += c9249.getSerializedSize() + (AbstractC14766.m35073(i) * 2);
        }
        return serializedSize;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17780(int i, AbstractC14766 abstractC14766) {
        Iterator it = this.f19873.iterator();
        while (it.hasNext()) {
            abstractC14766.mo35103(i, (AbstractC5886) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17779(int i, InterfaceC6633 interfaceC6633) {
        C23939 c23939 = (C23939) interfaceC6633;
        c23939.m52743(i, false, this.f19872);
        c23939.m52765(i, false, this.f19869);
        c23939.m52762(i, false, this.f19870);
        c23939.m52736(i, this.f19873);
        EnumC23566 enumC23566 = EnumC23566.ASCENDING;
        for (int i2 = 0; i2 < this.f19871.size(); i2++) {
            c23939.m52746(i);
            ((C9249) this.f19871.get(i2)).m23746(c23939);
            c23939.m52729(i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m17781(int i) {
        int iM35076 = 0;
        for (AbstractC5886 abstractC5886 : this.f19873) {
            iM35076 += AbstractC14766.m35076(3, abstractC5886) + AbstractC14766.m35084(2, i) + (AbstractC14766.m35073(1) * 2);
        }
        return iM35076;
    }
}
