package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M8XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14162 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21365 f42760 = new C21365();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7666 f42761 = new C7666();

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f42760;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        if (interfaceC19124.mo44149()) {
            return null;
        }
        return C14721.m35022(interfaceC19124.getIndex());
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        this.f42761.m20471(c16300);
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7219(C19954 c19954) {
        this.f42761.m20472(c19954);
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ᩷ */
    public final List mo7224() {
        C16425 c16425 = new C16425();
        for (C3726 c3726 : this.f42761.m20469()) {
            c16425.m38698(c3726.m11332(), c3726);
        }
        Object[] objArr = {c16425};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C11003.requireNonNull(obj);
        arrayList.add(obj);
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ۜ */
    public final void mo7221() {
        C21365 c21365;
        C7666 c7666 = this.f42761;
        Iterator it = c7666.m20469().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c21365 = this.f42760;
            if (!zHasNext) {
                break;
            } else {
                c21365.m1344((C3726) it.next());
            }
        }
        if (c7666.m20473().m41448()) {
            c21365.m1348();
        } else {
            c21365.m1342(c7666.m20474());
        }
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7217(InterfaceC11487 interfaceC11487) {
        C17712 c17712M20473 = this.f42761.m20473();
        if (c17712M20473.m41448()) {
            return;
        }
        interfaceC11487.mo28307(c17712M20473, this.f42760);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17712 m33801() {
        return this.f42761.m20473();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m33800(int i) {
        return this.f42761.m20470(i);
    }
}
