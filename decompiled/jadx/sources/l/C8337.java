package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8337 extends C15391 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f25557;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3581 f25558;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f25559;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f25560;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8337(C11139 c11139, AbstractC19810 abstractC19810, C3581 c3581, AbstractC12612 abstractC12612) {
        super(c11139, abstractC19810);
        this.f25557 = c11139;
        this.f25559 = false;
        this.f25558 = c3581;
        this.f25560 = abstractC12612 != null ? abstractC12612.f16086 : AbstractC4308.f13885;
    }

    @Override // l.C15391, l.InterfaceC21743
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo20424() {
        if (this.f47127 == null) {
            C11139 c11139 = this.f25557;
            AbstractC4308 abstractC4308M17543 = c11139.f33442.m17543(this.f25558, this.f47128.f17560);
            EnumC9454 enumC9454 = EnumC9454.NONE;
            AbstractC4308 abstractC4308 = this.f25560;
            if (!abstractC4308.m12913(enumC9454)) {
                abstractC4308M17543 = c11139.f33442.m17487(abstractC4308M17543, abstractC4308M17543.mo12933().m8246(abstractC4308));
                this.f25559 = true;
            }
            this.f47127 = abstractC4308M17543;
        }
        return this.f47127;
    }

    @Override // l.C15391, l.InterfaceC21743
    /* JADX INFO: renamed from: ᩳ */
    public final C3581 mo20426() {
        C3581 c3581Mo20426 = super.mo20426();
        long j = c3581Mo20426.f17563;
        C3581 c3581 = this.f25558;
        long j2 = j | (c3581.f17563 & 17179869184L) | 536870912;
        c3581Mo20426.f17563 = j2;
        c3581Mo20426.f17563 = j2 | (this.f25559 ? 144115188075855872L : 0L);
        C18837 c18837 = new C18837();
        C2609 c2609Mo12933 = mo20424().mo12933();
        if (!this.f25560.m12913(EnumC9454.NONE)) {
            C2609 c2609 = c2609Mo12933.f8241;
            c18837.m43515(new C12048(8589934592L, this.f25557.f33425.m39952(0), this.f25560, c3581Mo20426));
            c2609Mo12933 = c2609;
        }
        C2609<C12048> c26010 = c3581.f11367;
        if (c26010 != null) {
            C2609 c26011 = c2609Mo12933;
            for (C12048 c12048 : c26010) {
                c18837.m43511(new C12048(8589934592L | c12048.f17563, c12048.f17562, (AbstractC4308) c26011.f8240, c3581Mo20426));
                c26011 = c26011.f8241;
            }
        }
        c3581Mo20426.f11367 = c18837.m43517();
        return c3581Mo20426;
    }

    @Override // l.C15391, l.InterfaceC21743
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 mo21938() {
        return this.f25560;
    }

    @Override // l.C15391, l.InterfaceC21743
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 mo21937() {
        C2609 c2609M39901 = this.f25557.f33425.m39901(mo20424().mo12933(), mo20426());
        if (!this.f25560.m12913(EnumC9454.NONE)) {
            c2609M39901 = c2609M39901.f8241;
        }
        return c2609M39901.m8243((Function) new C0966(1));
    }
}
