package p067l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes4.dex */
public final class C17563 extends AbstractC6165 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC10288 f52497;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ boolean f52498;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean f52499;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Method f52500;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC10288 f52501;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f52502;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17563(String str, Field field, boolean z, Method method, AbstractC10288 abstractC10288, AbstractC10288 abstractC10289, boolean z2, boolean z3) {
        super(str, field);
        this.f52499 = z;
        this.f52500 = method;
        this.f52501 = abstractC10288;
        this.f52497 = abstractC10289;
        this.f52498 = z2;
        this.f52502 = z3;
    }

    @Override // p067l.AbstractC6165
    /* JADX INFO: renamed from: ֫ */
    public final void mo13961(C24726 c24726, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f52499;
        Field field = this.f15478;
        Method method = this.f52500;
        if (z) {
            if (method == null) {
                C7506.m17387(obj, field);
            } else {
                C7506.m17387(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new C15611(C6988.m16053("Accessor ", C15140.m34565((AccessibleObject) method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c24726.m54378(this.f15480);
        this.f52501.mo5174(c24726, objInvoke);
    }

    @Override // p067l.AbstractC6165
    /* JADX INFO: renamed from: ֫ */
    public final void mo13959(C18691 c18691, int i, Object[] objArr) {
        Object objMo5173 = this.f52497.mo5173(c18691);
        if (objMo5173 == null && this.f52498) {
            throw new C12971("null is not allowed as value for record component '" + this.f15479 + "' of primitive type; at path " + c18691.m42642());
        }
        objArr[i] = objMo5173;
    }

    @Override // p067l.AbstractC6165
    /* JADX INFO: renamed from: ֫ */
    public final void mo13960(C18691 c18691, Object obj) throws IllegalAccessException {
        Object objMo5173 = this.f52497.mo5173(c18691);
        if (objMo5173 == null && this.f52498) {
            return;
        }
        boolean z = this.f52499;
        Field field = this.f15478;
        if (z) {
            C7506.m17387(obj, field);
        } else if (this.f52502) {
            throw new C15611(C21466.m48631("Cannot set value of 'static final' ", C15140.m34565((AccessibleObject) field, false)));
        }
        field.set(obj, objMo5173);
    }
}
