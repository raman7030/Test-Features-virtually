package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֨۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public class C1110 extends AbstractC4308 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EnumC13829 f4047;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f4048;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1755 f4049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashSet f4050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12399 f4051;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C5344 f4052;

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        return "DeferredType";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1110(C12399 c12399, AbstractC12612 abstractC12612, C1755 c1755) {
        super(null, C20743.f66779);
        this.f4051 = c12399;
        this.f4050 = new HashSet();
        this.f4048 = abstractC12612;
        c12399.f37350.getClass();
        this.f4049 = C9310.m23919(c1755);
        this.f4052 = new C5344();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo1357(C20743 c20743) {
        throw new AssertionError("Cannot add metadata to a deferred type");
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return EnumC9454.DEFERRED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 mo3821(AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        C0404 c0404M15288 = this.f4052.m15288(abstractC5698, enumC16761);
        return c0404M15288 != null ? c0404M15288.f1860.f16086 : AbstractC4308.f13885;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5144 mo3824(C6755 c6755) {
        C0404 c0404M15288 = this.f4052.m15288(c6755.f20972, c6755.f20969);
        return c0404M15288 != null ? c0404M15288.f1860 : this.f4051.f37354;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 mo3823(C23420 c23420, C6755 c6755) {
        int iOrdinal = c6755.f20970.ordinal();
        C1755 c1755 = this.f4049;
        AbstractC12612 abstractC12612 = this.f4048;
        C12399 c12399 = this.f4051;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C12171.m29642(this.f4047 != null);
                return c12399.f37350.m23930(abstractC12612, c1755, c23420);
            }
            C12171.m29636();
            throw null;
        }
        EnumC13829 enumC13829 = this.f4047;
        C12171.m29642(enumC13829 == null || enumC13829 == EnumC13829.SPECULATIVE);
        AbstractC5144 abstractC5144M30568 = c12399.m30568(abstractC12612, c1755, c23420, c12399.f37339, null, EnumC7480.SPECULATIVE, null);
        this.f4052.m15289(abstractC5144M30568, c23420);
        return abstractC5144M30568.f16086;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m3822(C23420 c23420) {
        InterfaceC19456 c22277;
        AbstractC4308 abstractC4308 = c23420.f75219;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        boolean zM12913 = abstractC4308.m12913(EnumC9454.NONE);
        C12399 c12399 = this.f4051;
        if (zM12913 || c23420.f75219.mo12948()) {
            c22277 = c12399.f37344;
        } else if (interfaceC3953.mo3860().f20970 != EnumC13829.SPECULATIVE && !interfaceC3953.mo3860().m18377()) {
            c22277 = new C16632(c12399, c23420, this);
        } else {
            c22277 = new C22277(c12399, c23420, this);
        }
        return m3819(c23420, c22277);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 m3819(C23420 c23420, InterfaceC19456 interfaceC19456) {
        C6755 c6755Mo3860 = c23420.f75215.mo3860();
        C12171.m29642(c6755Mo3860 != this.f4051.f37355);
        if (interfaceC19456.mo28592()) {
            c6755Mo3860.mo18376(this, c23420, interfaceC19456);
            EnumC13829 enumC13829 = c6755Mo3860.f20970;
            EnumC13829 enumC138210 = EnumC13829.SPECULATIVE;
            if (enumC13829 == enumC138210) {
                this.f4050.add(c6755Mo3860.f20972);
                this.f4047 = enumC138210;
            }
            return AbstractC4308.f13885;
        }
        try {
            return mo3823(c23420, c6755Mo3860);
        } finally {
            this.f4047 = c6755Mo3860.f20970;
        }
    }
}
