package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15988 extends AbstractC3995 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f49334;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49335;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49336;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f49337;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f49338;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49339;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15988(String str, Field field, boolean z, Method method, AbstractC8333 abstractC8333, AbstractC8333 abstractC8334, boolean z2, boolean z3) {
        super(str, field);
        this.f49336 = z;
        this.f49337 = method;
        this.f49338 = abstractC8333;
        this.f49334 = abstractC8334;
        this.f49335 = z2;
        this.f49339 = z3;
    }

    @Override // l.AbstractC3995
    /* JADX INFO: renamed from: ֫ */
    public final void mo12041(C23525 c23525, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f49336;
        Field field = this.f12662;
        Method method = this.f49337;
        if (z) {
            if (method == null) {
                C5406.m15476(obj, field);
            } else {
                C5406.m15476(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new C13934(C4860.m14172("Accessor ", C13438.m32463((AccessibleObject) method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c23525.m51976(this.f12664);
        this.f49338.mo2845(c23525, objInvoke);
    }

    @Override // l.AbstractC3995
    /* JADX INFO: renamed from: ֫ */
    public final void mo12039(C17175 c17175, int i, Object[] objArr) {
        Object objMo2844 = this.f49334.mo2844(c17175);
        if (objMo2844 == null && this.f49335) {
            throw new C11156("null is not allowed as value for record component '" + this.f12663 + "' of primitive type; at path " + c17175.m40397());
        }
        objArr[i] = objMo2844;
    }

    @Override // l.AbstractC3995
    /* JADX INFO: renamed from: ֫ */
    public final void mo12040(C17175 c17175, Object obj) throws IllegalAccessException {
        Object objMo2844 = this.f49334.mo2844(c17175);
        if (objMo2844 == null && this.f49335) {
            return;
        }
        boolean z = this.f49336;
        Field field = this.f12662;
        if (z) {
            C5406.m15476(obj, field);
        } else if (this.f49339) {
            throw new C13934(C20094.m46315("Cannot set value of 'static final' ", C13438.m32463((AccessibleObject) field, false)));
        }
        field.set(obj, objMo2844);
    }
}
