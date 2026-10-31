package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6951 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21426 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f21427;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18780(C16828 c16828) {
        C11233.m27805(c16828, "item");
        ArrayList arrayList = this.f21426;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == c16828) {
                return i;
            }
        }
        return -1;
    }

    public C6951(String str) {
        this.f21427 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18795() {
        return this.f21426;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m18792() {
        return this.f21427;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m18797() {
        return this.f21427 == null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m18787() {
        return C11233.m27802((Object) this.f21427, (Object) "\rH\rI\rS\r");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18796() {
        Iterator it = this.f21426.iterator();
        while (it.hasNext()) {
            ((C16828) it.next()).m39586(false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16828 m18789(int i) {
        Object obj = this.f21426.get(i);
        C11233.m27803(obj, "get(...)");
        return (C16828) obj;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m18793() {
        return this.f21426.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18790(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f21426.addAll(0, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18785(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f21426.addAll(list);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m18794() {
        String str = this.f21427;
        if (str == null) {
            return C4925.m14327(R.string.MT_Protector);
        }
        return str.equals("\rH\rI\rS\r") ? C4925.m14327(R.string.MT_Protector) : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18784(String str) {
        if (!m18797()) {
            m18787();
        }
        this.f21427 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18783(int i, int i2) {
        m18787();
        C6055.m16890(i, i2, this.f21426);
        C9068.m23426();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18782(int i) {
        this.f21426.remove(i);
        C9068.m23426();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16828 m18788() {
        Object next;
        Iterator it = this.f21426.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C16828) next).m39587()) {
                return (C16828) next;
            }
        }
        next = null;
        return (C16828) next;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18781() {
        C1913.m6276(this.f21426, new C14711());
        C9068.f27500.mo1664(C8058.f24861);
        C9068.f27496.m23394();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18786(C6951 c6951) {
        if (!m18787()) {
            c6951.m18787();
        }
        ArrayList<C16828> arrayList = this.f21426;
        for (C16828 c16828 : arrayList) {
            if (c16828.m39587()) {
                new C16828(c16828.m39592(), c16828.m39588()).m39582(c16828.m39590());
            }
        }
        ArrayList arrayList2 = c6951.f21426;
        ArrayList<C16828> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C16828) obj).m39587()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C1913.m6270((Iterable) arrayList3));
        for (C16828 c16829 : arrayList3) {
            C16828 c168210 = new C16828(c16829.m39592(), c16829.m39588());
            c168210.m39582(c16829.m39590());
            arrayList4.add(c168210);
        }
        arrayList2.addAll(arrayList4);
        C9068.f27500.mo1664(C8058.f24861);
        C9068.f27496.m23394();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18791(C6951 c6951) {
        if (!m18787()) {
            c6951.m18787();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f21426;
        for (Object obj : arrayList2) {
            if (((C16828) obj).m39587()) {
                arrayList.add(obj);
            }
        }
        C1913.m6276(arrayList2, new C23884());
        c6951.f21426.addAll(arrayList);
        C9068.f27500.mo1664(C8058.f24861);
        C9068.f27496.m23394();
    }
}
