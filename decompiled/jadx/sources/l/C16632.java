package l;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public class C16632 extends C20161 implements InterfaceC19456, InterfaceC3748 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f51075;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12399 f51076;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0384 f51077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f51078;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f51079;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1217(C14169 c14169) {
        C0384 c0384 = this.f51077;
        boolean zContains = c0384.f1817.contains(this.f51079);
        LinkedHashSet linkedHashSet = this.f51078;
        if (zContains) {
            linkedHashSet.add(this.f51079);
        }
        C12399 c12399 = this.f51076;
        if (c12399.f37343.m17558(this.f51079)) {
            AbstractC4308 abstractC4308M17538 = c12399.f37343.m17538(this.f51079);
            C2609 c2609M1877 = c0384.m1877(abstractC4308M17538.mo12933());
            if (c14169.f42773 == EnumC16992.IMPLICIT && c2609M1877.m8249()) {
                linkedHashSet.addAll(c2609M1877);
                C2609 c2609M1871 = c0384.m1871(abstractC4308M17538.mo12923());
                LinkedHashSet linkedHashSet2 = this.f51075;
                linkedHashSet2.addAll(c2609M1871);
                linkedHashSet2.addAll(c0384.m1877(abstractC4308M17538.mo12930()));
            }
            AbstractC4308 abstractC4308Mo12923 = abstractC4308M17538.mo12923();
            if (c14169.m33819() == EnumC13706.EXPRESSION) {
                AbstractC4308 abstractC4308 = this.f51079;
                try {
                    this.f51079 = abstractC4308Mo12923;
                    mo10758(c14169.f42776);
                    return;
                } finally {
                    this.f51079 = abstractC4308;
                }
            }
            new C1816(this, abstractC4308Mo12923).mo10758(c14169.f42776);
        }
    }

    @Override // l.InterfaceC19456
    /* JADX INFO: renamed from: ֫ */
    public boolean mo28592() {
        return !this.f51078.isEmpty();
    }

    @Override // l.InterfaceC19456
    /* JADX INFO: renamed from: ܽ */
    public final Set mo28594() {
        return this.f51078;
    }

    @Override // l.InterfaceC19456
    /* JADX INFO: renamed from: ۧ */
    public final Set mo28593() {
        return this.f51075;
    }

    public C16632(C12399 c12399, C23420 c23420, C1110 c1110) {
        this.f51076 = c12399;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f51078 = linkedHashSet;
        this.f51075 = new LinkedHashSet();
        this.f51079 = c23420.f75219;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        this.f51077 = interfaceC3953.mo3857();
        mo10758(c1110.f4048);
        if (linkedHashSet.isEmpty()) {
            return;
        }
        interfaceC3953.mo3857().m1864(C2609.m8235((Iterable) linkedHashSet), this);
    }

    @Override // l.InterfaceC3748
    /* JADX INFO: renamed from: ֫ */
    public final void mo4673(C0384 c0384) {
        this.f51078.clear();
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1391(C9232 c9232) {
        mo10758(c9232.f27945);
        C0384 c0384 = this.f51077;
        boolean zContains = c0384.f1817.contains(this.f51079);
        LinkedHashSet linkedHashSet = this.f51078;
        if (zContains) {
            linkedHashSet.add(this.f51079);
            return;
        }
        C12399 c12399 = this.f51076;
        if (c12399.f37343.m17558(this.f51079)) {
            AbstractC4308 abstractC4308M17538 = c12399.f37343.m17538(this.f51079);
            C2609 c2609M1877 = c0384.m1877(abstractC4308M17538.mo12933());
            if (!c2609M1877.m8249() || c9232.mo23672() == EnumC6409.UNOVERLOADED) {
                return;
            }
            linkedHashSet.addAll(c2609M1877);
            C2609 c2609M1871 = c0384.m1871(abstractC4308M17538.mo12923());
            LinkedHashSet linkedHashSet2 = this.f51075;
            linkedHashSet2.addAll(c2609M1871);
            linkedHashSet2.addAll(c0384.m1877(abstractC4308M17538.mo12930()));
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        new C10989(this).m33860(c13464.f40199);
    }
}
