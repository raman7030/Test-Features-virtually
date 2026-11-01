package p067l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H4Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22103 extends AbstractC9381 {

    /* JADX INFO: renamed from: ֫ */
    public int f69931;

    /* JADX INFO: renamed from: ۜ */
    public EnumC15415 f69932;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f69933;

    /* JADX INFO: renamed from: ܳ */
    public C1361 f69934;

    /* JADX INFO: renamed from: ܽ */
    public boolean f69935;

    /* JADX INFO: renamed from: ܿ */
    public boolean f69936;

    /* JADX INFO: renamed from: ᩳ */
    public final WeakReference f69937;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f69938;

    @Override // p067l.AbstractC9381
    /* JADX INFO: renamed from: ֫ */
    public final void mo21806(InterfaceC16066 interfaceC16066) {
        InterfaceC24784 interfaceC24784;
        C13045.m29867(interfaceC16066, "observer");
        m49761("addObserver");
        EnumC15415 enumC15415 = this.f69932;
        EnumC15415 enumC15416 = EnumC15415.DESTROYED;
        if (enumC15415 != enumC15416) {
            enumC15416 = EnumC15415.INITIALIZED;
        }
        C8691 c8691 = new C8691(interfaceC16066, enumC15416);
        if (((C8691) this.f69934.mo28379(interfaceC16066, c8691)) == null && (interfaceC24784 = (InterfaceC24784) this.f69937.get()) != null) {
            boolean z = this.f69931 != 0 || this.f69935;
            EnumC15415 enumC15415M49764 = m49764(interfaceC16066);
            this.f69931++;
            while (c8691.m20120().compareTo(enumC15415M49764) < 0 && this.f69934.m28380(interfaceC16066)) {
                EnumC15415 enumC15415M20120 = c8691.m20120();
                ArrayList arrayList = this.f69938;
                arrayList.add(enumC15415M20120);
                C8040 c8040 = EnumC24133.f76564;
                EnumC15415 enumC15415M20121 = c8691.m20120();
                c8040.getClass();
                EnumC24133 enumC24133M18635 = C8040.m18635(enumC15415M20121);
                if (enumC24133M18635 == null) {
                    throw new IllegalStateException("no event up from " + c8691.m20120());
                }
                c8691.m20121(interfaceC24784, enumC24133M18635);
                arrayList.remove(arrayList.size() - 1);
                enumC15415M49764 = m49764(interfaceC16066);
            }
            if (!z) {
                m49762();
            }
            this.f69931--;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49766(EnumC24133 enumC24133) {
        C13045.m29867(enumC24133, "event");
        m49761("handleLifecycleEvent");
        m49763(enumC24133.m53380());
    }

    @Override // p067l.AbstractC9381
    /* JADX INFO: renamed from: ۧ */
    public final void mo21807(InterfaceC16066 interfaceC16066) {
        C13045.m29867(interfaceC16066, "observer");
        m49761("removeObserver");
        this.f69934.remove(interfaceC16066);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49765(EnumC15415 enumC15415) {
        C13045.m29867(enumC15415, "state");
        m49761("setCurrentState");
        m49763(enumC15415);
    }

    public C22103(InterfaceC24784 interfaceC24784) {
        new AtomicReference();
        this.f69933 = true;
        this.f69934 = new C1361();
        this.f69932 = EnumC15415.INITIALIZED;
        this.f69938 = new ArrayList();
        this.f69937 = new WeakReference(interfaceC24784);
    }

    @Override // p067l.AbstractC9381
    /* JADX INFO: renamed from: ֫ */
    public final EnumC15415 mo21805() {
        return this.f69932;
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m49763(EnumC15415 enumC15415) {
        EnumC15415 enumC15416 = this.f69932;
        if (enumC15416 == enumC15415) {
            return;
        }
        if (enumC15416 == EnumC15415.INITIALIZED && enumC15415 == EnumC15415.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f69932 + " in component " + this.f69937.get()).toString());
        }
        this.f69932 = enumC15415;
        if (this.f69935 || this.f69931 != 0) {
            this.f69936 = true;
            return;
        }
        this.f69935 = true;
        m49762();
        this.f69935 = false;
        if (this.f69932 == EnumC15415.DESTROYED) {
            this.f69934 = new C1361();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private final EnumC15415 m49764(InterfaceC16066 interfaceC16066) {
        C8691 c8691;
        Map.Entry entryM28378 = this.f69934.m28378(interfaceC16066);
        EnumC15415 enumC15415M20120 = (entryM28378 == null || (c8691 = (C8691) entryM28378.getValue()) == null) ? null : c8691.m20120();
        ArrayList arrayList = this.f69938;
        EnumC15415 enumC15415 = arrayList.isEmpty() ? null : (EnumC15415) C20013.m45383(arrayList, 1);
        EnumC15415 enumC15416 = this.f69932;
        C13045.m29867(enumC15416, "state1");
        if (enumC15415M20120 == null || enumC15415M20120.compareTo(enumC15416) >= 0) {
            enumC15415M20120 = enumC15416;
        }
        return (enumC15415 == null || enumC15415.compareTo(enumC15415M20120) >= 0) ? enumC15415M20120 : enumC15415;
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m49762() {
        InterfaceC24784 interfaceC24784 = (InterfaceC24784) this.f69937.get();
        if (interfaceC24784 != null) {
            while (this.f69934.size() != 0) {
                Map.Entry entryM29825 = this.f69934.m29825();
                C13045.m29861(entryM29825);
                EnumC15415 enumC15415M20120 = ((C8691) entryM29825.getValue()).m20120();
                Map.Entry entryM29827 = this.f69934.m29827();
                C13045.m29861(entryM29827);
                EnumC15415 enumC15415M20121 = ((C8691) entryM29827.getValue()).m20120();
                if (enumC15415M20120 == enumC15415M20121 && this.f69932 == enumC15415M20121) {
                    break;
                }
                this.f69936 = false;
                EnumC15415 enumC15415 = this.f69932;
                Map.Entry entryM29826 = this.f69934.m29825();
                C13045.m29861(entryM29826);
                int iCompareTo = enumC15415.compareTo(((C8691) entryM29826.getValue()).m20120());
                ArrayList arrayList = this.f69938;
                if (iCompareTo < 0) {
                    Iterator itDescendingIterator = this.f69934.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.f69936) {
                        Map.Entry entry = (Map.Entry) itDescendingIterator.next();
                        C13045.m29865(entry, "next()");
                        InterfaceC16066 interfaceC16066 = (InterfaceC16066) entry.getKey();
                        C8691 c8691 = (C8691) entry.getValue();
                        while (c8691.m20120().compareTo(this.f69932) > 0 && !this.f69936 && this.f69934.m28380(interfaceC16066)) {
                            C8040 c8040 = EnumC24133.f76564;
                            EnumC15415 enumC15415M20122 = c8691.m20120();
                            c8040.getClass();
                            EnumC24133 enumC24133M18634 = C8040.m18634(enumC15415M20122);
                            if (enumC24133M18634 != null) {
                                arrayList.add(enumC24133M18634.m53380());
                                c8691.m20121(interfaceC24784, enumC24133M18634);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c8691.m20120());
                            }
                        }
                    }
                }
                Map.Entry entryM29828 = this.f69934.m29827();
                if (!this.f69936 && entryM29828 != null && this.f69932.compareTo(((C8691) entryM29828.getValue()).m20120()) > 0) {
                    C1536 c1536M29826 = this.f69934.m29826();
                    while (c1536M29826.hasNext() && !this.f69936) {
                        Map.Entry entry2 = (Map.Entry) c1536M29826.next();
                        InterfaceC16066 interfaceC16067 = (InterfaceC16066) entry2.getKey();
                        C8691 c8692 = (C8691) entry2.getValue();
                        while (c8692.m20120().compareTo(this.f69932) < 0 && !this.f69936 && this.f69934.m28380(interfaceC16067)) {
                            arrayList.add(c8692.m20120());
                            C8040 c8041 = EnumC24133.f76564;
                            EnumC15415 enumC15415M20123 = c8692.m20120();
                            c8041.getClass();
                            EnumC24133 enumC24133M18635 = C8040.m18635(enumC15415M20123);
                            if (enumC24133M18635 == null) {
                                throw new IllegalStateException("no event up from " + c8692.m20120());
                            }
                            c8692.m20121(interfaceC24784, enumC24133M18635);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            this.f69936 = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m49761(String str) {
        if (this.f69933 && !C1081.m15926().m15928()) {
            throw new IllegalStateException(C6988.m16053("Method ", str, " must be called on the main thread").toString());
        }
    }
}
