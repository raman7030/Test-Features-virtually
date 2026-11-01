package p067l;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩻ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C24851 extends AbstractC24336 {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f79382;

    /* JADX INFO: renamed from: ۟ */
    public boolean f79383;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C23738 f79384;

    /* JADX INFO: renamed from: ܰ */
    public boolean f79385;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C21727 f79386;

    /* JADX INFO: renamed from: ܽ֫ */
    public C18816 f79387;

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean f79388;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C19487 f79389;

    public C24851(InterfaceC6076 interfaceC6076, boolean z) {
        super(interfaceC6076);
        this.f79388 = z && interfaceC6076.mo13821();
        this.f79386 = new C21727();
        this.f79384 = new C23738();
        AbstractC6974 abstractC6974Mo13822 = interfaceC6076.mo13822();
        if (abstractC6974Mo13822 != null) {
            this.f79387 = C18816.m42867(abstractC6974Mo13822, (Object) null, (Object) null);
            this.f79385 = true;
        } else {
            this.f79387 = C18816.m42868(interfaceC6076.mo11862());
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC6974 m54589() {
        return this.f79387;
    }

    @Override // p067l.AbstractC24336, p067l.AbstractC11185, p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11867(C13010 c13010) {
        if (this.f79385) {
            this.f79387 = this.f79387.m42869((AbstractC6974) new C12267(this.f79387.f43390, c13010));
        } else {
            this.f79387 = C18816.m42868(c13010);
        }
        this.f77096.mo11867(c13010);
    }

    @Override // p067l.AbstractC24336
    /* JADX INFO: renamed from: ۡ */
    public final void mo53690() {
        if (this.f79388) {
            return;
        }
        this.f79383 = true;
        m53691();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final C19487 mo11861(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        C19487 c19487 = new C19487(c17474, interfaceC23016, j);
        c19487.m44311(this.f77096);
        if (this.f79382) {
            Object obj = c17474.f52252;
            if (this.f79387.f56195 != null && obj.equals(C18816.f56194)) {
                obj = this.f79387.f56195;
            }
            c19487.m44312(c17474.m39841(obj));
            return c19487;
        }
        this.f79389 = c19487;
        if (!this.f79383) {
            this.f79383 = true;
            m53691();
        }
        return c19487;
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11866(InterfaceC11441 interfaceC11441) {
        ((C19487) interfaceC11441).m44316();
        if (interfaceC11441 == this.f79389) {
            this.f79389 = null;
        }
    }

    @Override // p067l.AbstractC22585, p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11869() {
        this.f79382 = false;
        this.f79383 = false;
        super.mo11869();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p067l.AbstractC24336
    /* JADX INFO: renamed from: ۧ */
    public final void mo16468(AbstractC6974 abstractC6974) {
        long j;
        C18816 c18816M42867;
        C17474 c17474M39841;
        C18816 c18816M42868;
        if (this.f79382) {
            this.f79387 = this.f79387.m42869(abstractC6974);
            C19487 c19487 = this.f79389;
            if (c19487 != null) {
                m54588(c19487.m44315());
            }
        } else if (abstractC6974.m15990()) {
            if (this.f79385) {
                c18816M42868 = this.f79387.m42869(abstractC6974);
            } else {
                c18816M42868 = C18816.m42867(abstractC6974, C21727.f68424, C18816.f56194);
            }
            this.f79387 = c18816M42868;
        } else {
            C21727 c21727 = this.f79386;
            abstractC6974.m15986(0, c21727);
            long j2 = c21727.f68425;
            Object obj = c21727.f68437;
            C19487 c19488 = this.f79389;
            if (c19488 != null) {
                long jM44313 = c19488.m44313();
                C18816 c18816 = this.f79387;
                Object obj2 = this.f79389.f59375.f52252;
                C23738 c23738 = this.f79384;
                c18816.mo15985(obj2, c23738);
                long j3 = c23738.f75530 + jM44313;
                this.f79387.mo15983(0, c21727, 0L);
                if (j3 != c21727.f68425) {
                    j = j3;
                } else {
                    j = j2;
                }
            } else {
                j = j2;
            }
            Pair pairM15980 = abstractC6974.m15980(this.f79386, this.f79384, 0, j);
            Object obj3 = pairM15980.first;
            long jLongValue = ((Long) pairM15980.second).longValue();
            if (this.f79385) {
                c18816M42867 = this.f79387.m42869(abstractC6974);
            } else {
                c18816M42867 = C18816.m42867(abstractC6974, obj, obj3);
            }
            this.f79387 = c18816M42867;
            C19487 c19489 = this.f79389;
            if (c19489 != null && m54588(jLongValue)) {
                C17474 c17474 = c19489.f59375;
                Object obj4 = c17474.f52252;
                if (this.f79387.f56195 != null && obj4.equals(C18816.f56194)) {
                    obj4 = this.f79387.f56195;
                }
                c17474M39841 = c17474.m39841(obj4);
            }
            this.f79385 = true;
            this.f79382 = true;
            m25803(this.f79387);
            if (c17474M39841 != null) {
                C19487 c194810 = this.f79389;
                c194810.getClass();
                c194810.m44312(c17474M39841);
            }
        }
        c17474M39841 = null;
        this.f79385 = true;
        this.f79382 = true;
        m25803(this.f79387);
        if (c17474M39841 != null) {
            C19487 c194811 = this.f79389;
            c194811.getClass();
            c194811.m44312(c17474M39841);
        }
    }

    @Override // p067l.AbstractC24336
    /* JADX INFO: renamed from: ܽ */
    public final C17474 mo53692(C17474 c17474) {
        Object obj = c17474.f52252;
        if (this.f79387.f56195 != null && this.f79387.f56195.equals(obj)) {
            obj = C18816.f56194;
        }
        return c17474.m39841(obj);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: ֫ */
    private boolean m54588(long j) {
        C19487 c19487 = this.f79389;
        int iMo15978 = this.f79387.mo15978(c19487.f59375.f52252);
        if (iMo15978 == -1) {
            return false;
        }
        C18816 c18816 = this.f79387;
        C23738 c23738 = this.f79384;
        c18816.mo15984(iMo15978, c23738, false);
        long j2 = c23738.f75527;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c19487.m44314(j);
        return true;
    }
}
