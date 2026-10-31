package l;

import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۫֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C12048 extends AbstractC5698 implements InterfaceC4230 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f36038;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object f36039;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f36040;

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public int mo953() {
        return 9;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public EnumC23258 mo952() {
        long j = this.f17563;
        if ((8589934592L & j) != 0) {
            if (m29423()) {
                return EnumC23258.EXCEPTION_PARAMETER;
            }
            return EnumC23258.PARAMETER;
        }
        if ((16384 & j) != 0) {
            return EnumC23258.ENUM_CONSTANT;
        }
        EnumC1296 enumC1296 = this.f17561.f17559;
        if (enumC1296 == EnumC1296.f4582 || enumC1296 == EnumC1296.f4581) {
            return EnumC23258.FIELD;
        }
        if (m29422()) {
            return EnumC23258.RESOURCE_VARIABLE;
        }
        if ((j & 576460752303423488L) != 0) {
            return EnumC23258.BINDING_VARIABLE;
        }
        return EnumC23258.LOCAL_VARIABLE;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ᩵ */
    public AbstractC4308 mo29242() {
        return this.f17560;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ۜ */
    public InterfaceC11970 mo7176() {
        return this.f17561;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC10370 mo960() {
        return this.f17562;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ᩷ */
    public /* bridge */ /* synthetic */ C2609 mo7180() {
        return mo7180();
    }

    public C12048(long j, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4567, j, abstractC10370, abstractC4308, abstractC5698);
        this.f36040 = -1;
        this.f36038 = -1;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۧ */
    public final C12048 mo7177(AbstractC5698 abstractC5698) {
        C12753 c12753 = new C12753(this, this.f17563, this.f17562, this.f17560, abstractC5698, abstractC5698);
        c12753.f36040 = this.f36040;
        c12753.f36038 = this.f36038;
        c12753.f36039 = this.f36039;
        return c12753;
    }

    @Override // l.AbstractC5698
    public final String toString() {
        return this.f17562.toString();
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo10960(AbstractC4308 abstractC4308, C6319 c6319) {
        return new C12048(this.f17563, this.f17562, c6319.m17543(this, abstractC4308), this.f17561);
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10391(this, obj);
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final Object m29424() {
        return C21953.m49440(m29425(), this.f17560);
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29423() {
        return this.f36039 == EnumC23258.EXCEPTION_PARAMETER;
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29422() {
        return this.f36039 == EnumC23258.RESOURCE_VARIABLE;
    }

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final Object m29425() {
        Object obj = this.f36039;
        if (obj == EnumC23258.EXCEPTION_PARAMETER || obj == EnumC23258.RESOURCE_VARIABLE) {
            return null;
        }
        if (obj instanceof Callable) {
            Callable callable = (Callable) obj;
            this.f36039 = null;
            try {
                this.f36039 = callable.call();
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return this.f36039;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29421(Object obj) {
        C12171.m29639(this, !(obj instanceof C1755));
        this.f36039 = obj;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo4021(this, (Object) locale);
    }
}
