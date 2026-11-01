package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24430 implements InterfaceC2972 {

    /* JADX INFO: renamed from: ֫ */
    public final List f77340;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f77341 = new HashSet(3);

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f77342;

    public C24430(ArrayList arrayList) {
        this.f77340 = arrayList;
        this.f77342 = new ArrayList(arrayList.size());
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m53902() {
        Iterator it = this.f77340.iterator();
        while (it.hasNext()) {
            m53901((InterfaceC7667) it.next());
        }
        return this.f77342;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53901(InterfaceC7667 interfaceC7667) {
        ArrayList arrayList = this.f77342;
        if (arrayList.contains(interfaceC7667)) {
            return;
        }
        HashSet hashSet = this.f77341;
        if (hashSet.contains(interfaceC7667)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(interfaceC7667);
        interfaceC7667.mo17755(this);
        hashSet.remove(interfaceC7667);
        if (arrayList.contains(interfaceC7667)) {
            return;
        }
        if (C22658.class.isAssignableFrom(interfaceC7667.getClass())) {
            arrayList.add(0, interfaceC7667);
        } else {
            arrayList.add(interfaceC7667);
        }
    }

    @Override // p067l.InterfaceC2972
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7667 mo4924() {
        InterfaceC7667 interfaceC7667;
        InterfaceC7667 interfaceC7668;
        Iterator it = this.f77342.iterator();
        do {
            interfaceC7667 = null;
            if (!it.hasNext()) {
                interfaceC7668 = null;
                break;
            }
            interfaceC7668 = (InterfaceC7667) it.next();
        } while (!C22658.class.isAssignableFrom(interfaceC7668.getClass()));
        if (interfaceC7668 != null) {
            return interfaceC7668;
        }
        List<InterfaceC7667> list = this.f77340;
        for (InterfaceC7667 interfaceC7669 : list) {
            if (C22658.class.isAssignableFrom(interfaceC7669.getClass())) {
                interfaceC7667 = interfaceC7669;
                break;
            }
        }
        if (interfaceC7667 == null) {
            throw new IllegalStateException("Requested plugin is not added: " + C22658.class.getName() + ", plugins: " + list);
        }
        m53901(interfaceC7667);
        return interfaceC7667;
    }
}
