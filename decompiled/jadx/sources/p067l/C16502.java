package p067l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ܶ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16502 extends C22539 {

    /* JADX INFO: renamed from: ۜ֫ */
    public AbstractC23879 f48500;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f48501;

    /* JADX INFO: renamed from: ᩻֫ */
    public C3762 f48502;

    public C16502(AbstractC9127 abstractC9127, float... fArr) {
        super(abstractC9127);
        mo37460(fArr);
        if (abstractC9127 instanceof AbstractC23879) {
            this.f48500 = (AbstractC23879) this.f71088;
        }
    }

    @Override // p067l.C22539
    /* JADX INFO: renamed from: ֫ */
    public final void mo37460(float... fArr) {
        super.mo37460(fArr);
        this.f48502 = this.f71089;
    }

    @Override // p067l.C22539
    /* JADX INFO: renamed from: ֫ */
    public final void mo37457(float f) {
        this.f48501 = this.f48502.m7262(f);
    }

    @Override // p067l.C22539
    /* JADX INFO: renamed from: ֫ */
    public final Float mo37456() {
        return Float.valueOf(this.f48501);
    }

    @Override // p067l.C22539
    public final Object clone() {
        C16502 c16502 = (C16502) super.clone();
        c16502.f48502 = c16502.f71089;
        return c16502;
    }

    @Override // p067l.C22539
    public final C22539 clone() {
        C16502 c16502 = (C16502) super.clone();
        c16502.f48502 = c16502.f71089;
        return c16502;
    }

    @Override // p067l.C22539
    /* JADX INFO: renamed from: ֫ */
    public final void mo37459(Object obj) {
        Object[] objArr = this.f71090;
        AbstractC23879 abstractC23879 = this.f48500;
        if (abstractC23879 != null) {
            abstractC23879.mo3369(obj, this.f48501);
            return;
        }
        AbstractC9127 abstractC9127 = this.f71088;
        if (abstractC9127 != null) {
            abstractC9127.mo21073(obj, Float.valueOf(this.f48501));
            return;
        }
        if (this.f71091 != null) {
            try {
                objArr[0] = Float.valueOf(this.f48501);
                this.f71091.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    @Override // p067l.C22539
    /* JADX INFO: renamed from: ֫ */
    public final void mo37458(Class cls) {
        if (this.f71088 != null) {
            return;
        }
        super.mo37458(cls);
    }
}
