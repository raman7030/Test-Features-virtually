package l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ܶ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14872 extends C21224 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public AbstractC22634 f45385;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f45386;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C1467 f45387;

    public C14872(AbstractC7112 abstractC7112, float... fArr) {
        super(abstractC7112);
        mo35307(fArr);
        if (abstractC7112 instanceof AbstractC22634) {
            this.f45385 = (AbstractC22634) this.f68405;
        }
    }

    @Override // l.C21224
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo35307(float... fArr) {
        super.mo35307(fArr);
        this.f45387 = this.f68406;
    }

    @Override // l.C21224
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo35304(float f) {
        this.f45386 = this.f45387.m5019(f);
    }

    @Override // l.C21224
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Float mo35303() {
        return Float.valueOf(this.f45386);
    }

    @Override // l.C21224
    public final Object clone() {
        C14872 c14872 = (C14872) super.clone();
        c14872.f45387 = c14872.f68406;
        return c14872;
    }

    @Override // l.C21224
    public final C21224 clone() {
        C14872 c14872 = (C14872) super.clone();
        c14872.f45387 = c14872.f68406;
        return c14872;
    }

    @Override // l.C21224
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo35306(Object obj) {
        Object[] objArr = this.f68407;
        AbstractC22634 abstractC22634 = this.f45385;
        if (abstractC22634 != null) {
            abstractC22634.mo974(obj, this.f45386);
            return;
        }
        AbstractC7112 abstractC7112 = this.f68405;
        if (abstractC7112 != null) {
            abstractC7112.mo19130(obj, Float.valueOf(this.f45386));
            return;
        }
        if (this.f68408 != null) {
            try {
                objArr[0] = Float.valueOf(this.f45386);
                this.f68408.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    @Override // l.C21224
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo35305(Class cls) {
        if (this.f68405 != null) {
            return;
        }
        super.mo35305(cls);
    }
}
