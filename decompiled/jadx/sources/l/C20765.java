package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H4Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20765 extends AbstractC7379 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f67247;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC13728 f67248;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f67249;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10467 f67250;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f67251;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67252;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f67253;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f67254;

    @Override // l.AbstractC7379
    /* JADX INFO: renamed from: ֫ */
    public final void mo19833(InterfaceC14413 interfaceC14413) {
        InterfaceC23586 interfaceC23586;
        C11233.m27805(interfaceC14413, "observer");
        m47433("addObserver");
        EnumC13728 enumC13728 = this.f67248;
        EnumC13728 enumC13729 = EnumC13728.DESTROYED;
        if (enumC13728 != enumC13729) {
            enumC13729 = EnumC13728.INITIALIZED;
        }
        C6653 c6653 = new C6653(interfaceC14413, enumC13729);
        if (((C6653) this.f67250.mo26347(interfaceC14413, c6653)) == null && (interfaceC23586 = (InterfaceC23586) this.f67253.get()) != null) {
            boolean z = this.f67247 != 0 || this.f67251;
            EnumC13728 enumC13728M47436 = m47436(interfaceC14413);
            this.f67247++;
            while (c6653.m18172().compareTo(enumC13728M47436) < 0 && this.f67250.m26348(interfaceC14413)) {
                EnumC13728 enumC13728M18172 = c6653.m18172();
                ArrayList arrayList = this.f67254;
                arrayList.add(enumC13728M18172);
                C5968 c5968 = EnumC22901.f73834;
                EnumC13728 enumC13728M18173 = c6653.m18172();
                c5968.getClass();
                EnumC22901 enumC22901M16709 = C5968.m16709(enumC13728M18173);
                if (enumC22901M16709 == null) {
                    throw new IllegalStateException("no event up from " + c6653.m18172());
                }
                c6653.m18173(interfaceC23586, enumC22901M16709);
                arrayList.remove(arrayList.size() - 1);
                enumC13728M47436 = m47436(interfaceC14413);
            }
            if (!z) {
                m47434();
            }
            this.f67247--;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47438(EnumC22901 enumC22901) {
        C11233.m27805(enumC22901, "event");
        m47433("handleLifecycleEvent");
        m47435(enumC22901.m50989());
    }

    @Override // l.AbstractC7379
    /* JADX INFO: renamed from: ۧ */
    public final void mo19834(InterfaceC14413 interfaceC14413) {
        C11233.m27805(interfaceC14413, "observer");
        m47433("removeObserver");
        this.f67250.remove(interfaceC14413);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47437(EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "state");
        m47433("setCurrentState");
        m47435(enumC13728);
    }

    public C20765(InterfaceC23586 interfaceC23586) {
        new AtomicReference();
        this.f67249 = true;
        this.f67250 = new C10467();
        this.f67248 = EnumC13728.INITIALIZED;
        this.f67254 = new ArrayList();
        this.f67253 = new WeakReference(interfaceC23586);
    }

    @Override // l.AbstractC7379
    /* JADX INFO: renamed from: ֫ */
    public final EnumC13728 mo19832() {
        return this.f67248;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m47435(EnumC13728 enumC13728) {
        EnumC13728 enumC13729 = this.f67248;
        if (enumC13729 == enumC13728) {
            return;
        }
        if (enumC13729 == EnumC13728.INITIALIZED && enumC13728 == EnumC13728.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f67248 + " in component " + this.f67253.get()).toString());
        }
        this.f67248 = enumC13728;
        if (this.f67251 || this.f67247 != 0) {
            this.f67252 = true;
            return;
        }
        this.f67251 = true;
        m47434();
        this.f67251 = false;
        if (this.f67248 == EnumC13728.DESTROYED) {
            this.f67250 = new C10467();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final EnumC13728 m47436(InterfaceC14413 interfaceC14413) {
        C6653 c6653;
        Map.Entry entryM26346 = this.f67250.m26346(interfaceC14413);
        EnumC13728 enumC13728M18172 = (entryM26346 == null || (c6653 = (C6653) entryM26346.getValue()) == null) ? null : c6653.m18172();
        ArrayList arrayList = this.f67254;
        EnumC13728 enumC13728 = arrayList.isEmpty() ? null : (EnumC13728) C18566.m43105(arrayList, 1);
        EnumC13728 enumC13729 = this.f67248;
        C11233.m27805(enumC13729, "state1");
        if (enumC13728M18172 == null || enumC13728M18172.compareTo(enumC13729) >= 0) {
            enumC13728M18172 = enumC13729;
        }
        return (enumC13728 == null || enumC13728.compareTo(enumC13728M18172) >= 0) ? enumC13728M18172 : enumC13728;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m47434() {
        InterfaceC23586 interfaceC23586 = (InterfaceC23586) this.f67253.get();
        if (interfaceC23586 != null) {
            while (this.f67250.size() != 0) {
                Map.Entry entryM27763 = this.f67250.m27763();
                C11233.m27799(entryM27763);
                EnumC13728 enumC13728M18172 = ((C6653) entryM27763.getValue()).m18172();
                Map.Entry entryM27765 = this.f67250.m27765();
                C11233.m27799(entryM27765);
                EnumC13728 enumC13728M18173 = ((C6653) entryM27765.getValue()).m18172();
                if (enumC13728M18172 == enumC13728M18173 && this.f67248 == enumC13728M18173) {
                    break;
                }
                this.f67252 = false;
                EnumC13728 enumC13728 = this.f67248;
                Map.Entry entryM27764 = this.f67250.m27763();
                C11233.m27799(entryM27764);
                int iCompareTo = enumC13728.compareTo(((C6653) entryM27764.getValue()).m18172());
                ArrayList arrayList = this.f67254;
                if (iCompareTo < 0) {
                    Iterator itDescendingIterator = this.f67250.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.f67252) {
                        Map.Entry entry = (Map.Entry) itDescendingIterator.next();
                        C11233.m27803(entry, "next()");
                        InterfaceC14413 interfaceC14413 = (InterfaceC14413) entry.getKey();
                        C6653 c6653 = (C6653) entry.getValue();
                        while (c6653.m18172().compareTo(this.f67248) > 0 && !this.f67252 && this.f67250.m26348(interfaceC14413)) {
                            C5968 c5968 = EnumC22901.f73834;
                            EnumC13728 enumC13728M18174 = c6653.m18172();
                            c5968.getClass();
                            EnumC22901 enumC22901M16708 = C5968.m16708(enumC13728M18174);
                            if (enumC22901M16708 != null) {
                                arrayList.add(enumC22901M16708.m50989());
                                c6653.m18173(interfaceC23586, enumC22901M16708);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c6653.m18172());
                            }
                        }
                    }
                }
                Map.Entry entryM27766 = this.f67250.m27765();
                if (!this.f67252 && entryM27766 != null && this.f67248.compareTo(((C6653) entryM27766.getValue()).m18172()) > 0) {
                    C13993 c13993M27764 = this.f67250.m27764();
                    while (c13993M27764.hasNext() && !this.f67252) {
                        Map.Entry entry2 = (Map.Entry) c13993M27764.next();
                        InterfaceC14413 interfaceC14414 = (InterfaceC14413) entry2.getKey();
                        C6653 c6654 = (C6653) entry2.getValue();
                        while (c6654.m18172().compareTo(this.f67248) < 0 && !this.f67252 && this.f67250.m26348(interfaceC14414)) {
                            arrayList.add(c6654.m18172());
                            C5968 c5969 = EnumC22901.f73834;
                            EnumC13728 enumC13728M18175 = c6654.m18172();
                            c5969.getClass();
                            EnumC22901 enumC22901M16709 = C5968.m16709(enumC13728M18175);
                            if (enumC22901M16709 == null) {
                                throw new IllegalStateException("no event up from " + c6654.m18172());
                            }
                            c6654.m18173(interfaceC23586, enumC22901M16709);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            this.f67252 = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m47433(String str) {
        if (this.f67249 && !C4822.m14046().m14048()) {
            throw new IllegalStateException(C4860.m14172("Method ", str, " must be called on the main thread").toString());
        }
    }
}
