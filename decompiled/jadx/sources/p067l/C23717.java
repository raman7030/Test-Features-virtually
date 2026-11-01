package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes.dex */
public final class C23717 implements InterfaceC11235 {

    /* JADX INFO: renamed from: ۙ */
    public C22004 f75470;

    /* JADX INFO: renamed from: ᩶ */
    public C6953 f75471;

    /* JADX INFO: renamed from: ᩸ */
    public final C5127 f75472;

    /* JADX INFO: renamed from: ᩹ */
    public C6953 f75473;

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26025(C12576 c12576) {
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26026(C15927 c15927) {
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26028(C18610 c18610) {
    }

    public C23717(C5127 c5127) {
        this.f75472 = c5127;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6953 m52734(C6953 c6953, C4848 c4848) {
        if (this.f75470 == null) {
            this.f75470 = C22004.m49577(this.f75472);
        }
        this.f75471 = c6953;
        this.f75473 = null;
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C17939 c17939 = (C17939) it.next();
            c17939.getClass();
            mo26027(c17939);
        }
        C6953 c6954 = this.f75473;
        return c6954 == null ? c6953 : c6954;
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26029(C19281 c19281) {
        EnumC21706 enumC21706M48993;
        if (c19281.f29256.f16705 != this.f75470.f69215.f16705 || (enumC21706M48993 = EnumC21706.m48993((String) c19281.f57613)) == null) {
            return;
        }
        if (this.f75473 == null) {
            this.f75473 = new C6953(this.f75471);
        }
        this.f75473.f18083.add(enumC21706M48993);
        this.f75473.f18084.remove(enumC21706M48993);
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26027(C17939 c17939) {
        if (c17939.f29256.f16705 == this.f75470.f69153.f16705) {
            for (C4848 c4848 = c17939.f53589; c4848.m10293(); c4848 = c4848.f11035) {
                C24293 c24293 = (C24293) c4848.f11034;
                if (((C5771) c24293.f76952).f20408.toString().equals(C0226b.f1011d)) {
                    ((AbstractC10564) c24293.f76953).mo7611(this);
                }
            }
        }
    }

    @Override // p067l.InterfaceC11235
    /* JADX INFO: renamed from: ֫ */
    public final void mo26024(C3858 c3858) {
        for (AbstractC10564 abstractC10564 : c3858.f8345) {
            abstractC10564.mo7611(this);
        }
    }
}
