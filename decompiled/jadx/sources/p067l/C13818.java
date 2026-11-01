package p067l;

import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۫֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C13818 extends AbstractC7783 implements InterfaceC6389 {

    /* JADX INFO: renamed from: ۛ */
    public int f39049;

    /* JADX INFO: renamed from: ۨ */
    public Object f39050;

    /* JADX INFO: renamed from: ᩺ */
    public int f39051;

    @Override // p067l.AbstractC7783, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public int mo3348() {
        return 9;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public EnumC24473 mo3347() {
        long j = this.f20409;
        if ((8589934592L & j) != 0) {
            if (m31485()) {
                return EnumC24473.EXCEPTION_PARAMETER;
            }
            return EnumC24473.PARAMETER;
        }
        if ((16384 & j) != 0) {
            return EnumC24473.ENUM_CONSTANT;
        }
        EnumC3600 enumC3600 = this.f20407.f20405;
        if (enumC3600 == EnumC3600.f7354 || enumC3600 == EnumC3600.f7353) {
            return EnumC24473.FIELD;
        }
        if (m31484()) {
            return EnumC24473.RESOURCE_VARIABLE;
        }
        if ((j & 576460752303423488L) != 0) {
            return EnumC24473.BINDING_VARIABLE;
        }
        return EnumC24473.LOCAL_VARIABLE;
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ᩵ */
    public AbstractC6462 mo31296() {
        return this.f20406;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ۜ */
    public InterfaceC13745 mo9255() {
        return this.f20407;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC12224 mo3355() {
        return this.f20408;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ᩷ */
    public /* bridge */ /* synthetic */ C4848 mo9259() {
        return mo9259();
    }

    public C13818(long j, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783) {
        super(EnumC3600.f7339, j, abstractC12224, abstractC6462, abstractC7783);
        this.f39051 = -1;
        this.f39049 = -1;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۧ */
    public final C13818 mo9256(AbstractC7783 abstractC7783) {
        C14488 c14488 = new C14488(this, this.f20409, this.f20408, this.f20406, abstractC7783, abstractC7783);
        c14488.f39051 = this.f39051;
        c14488.f39049 = this.f39049;
        c14488.f39050 = this.f39050;
        return c14488;
    }

    @Override // p067l.AbstractC7783
    public final String toString() {
        return this.f20408.toString();
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo12936(AbstractC6462 abstractC6462, C8374 c8374) {
        return new C13818(this.f20409, this.f20408, c8374.m19483(this, abstractC6462), this.f20407);
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        return abstractC10412.mo12430(this, obj);
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public final Object m31486() {
        return C23232.m51777(m31487(), this.f20406);
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final boolean m31485() {
        return this.f39050 == EnumC24473.EXCEPTION_PARAMETER;
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final boolean m31484() {
        return this.f39050 == EnumC24473.RESOURCE_VARIABLE;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public final Object m31487() {
        Object obj = this.f39050;
        if (obj == EnumC24473.EXCEPTION_PARAMETER || obj == EnumC24473.RESOURCE_VARIABLE) {
            return null;
        }
        if (obj instanceof Callable) {
            Callable callable = (Callable) obj;
            this.f39050 = null;
            try {
                this.f39050 = callable.call();
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return this.f39050;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31483(Object obj) {
        C1446.m31701(this, !(obj instanceof C4036));
        this.f39050 = obj;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo6263(this, (Object) locale);
    }
}
