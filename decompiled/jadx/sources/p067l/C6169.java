package p067l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C6169 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f15489 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f15490 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C23603 f15491;

    public C6169(C23603 c23603) {
        this.f15491 = c23603;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13968(C18238 c18238) {
        this.f15489.put(c18238.f54451, c18238);
        Iterator it = c18238.f54448.iterator();
        while (it.hasNext()) {
            this.f15490.put(C23603.m52416((InterfaceC22097) it.next()), c18238);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13972(C18238 c18238) {
        LinkedHashMap linkedHashMap = this.f15490;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == c18238) {
                it.remove();
            }
        }
        Iterator it2 = c18238.f54448.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(C23603.m52416((InterfaceC22097) it2.next()), c18238);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18238 m13966(String str) {
        return (C18238) this.f15489.get(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18238 m13971(InterfaceC22097 interfaceC22097) {
        while (interfaceC22097 != null) {
            C18238 c18238 = (C18238) this.f15490.get(interfaceC22097);
            if (c18238 != null) {
                return c18238;
            }
            interfaceC22097 = interfaceC22097.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13967() {
        this.f15489.clear();
        this.f15490.clear();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13973() {
        return this.f15489.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13969(InterfaceC22097 interfaceC22097) {
        return C23603.m52418(this.f15491, this.f15490.keySet(), interfaceC22097);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Set m13974() {
        return C21562.unmodifiableSet((Set) C7480.stream(this.f15489.values()).collect(C24205.toSet()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final Set m13970() {
        return C21562.unmodifiableSet((Set) C7480.stream(this.f15489.entrySet()).filter(new C17567()).map(new C4828()).collect(C24205.toSet()));
    }
}
