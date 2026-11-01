package p067l;

import java.io.Serializable;
import java.lang.reflect.Field;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۖ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5038 implements InterfaceC13575, InterfaceC21132, Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC13575 f11573;

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo10745(Object obj);

    /* JADX INFO: renamed from: ᩻ */
    public void mo10748() {
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC13575 mo10743(Object obj, InterfaceC13575 interfaceC13575) {
        C13045.m29867(interfaceC13575, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public AbstractC5038(InterfaceC13575 interfaceC13575) {
        this.f11573 = interfaceC13575;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC13575 m10747() {
        return this.f11573;
    }

    @Override // p067l.InterfaceC13575
    /* JADX INFO: renamed from: ֫ */
    public final void mo10744(Object obj) {
        InterfaceC13575 interfaceC13575 = this;
        while (true) {
            AbstractC5038 abstractC5038 = (AbstractC5038) interfaceC13575;
            InterfaceC13575 interfaceC13576 = abstractC5038.f11573;
            C13045.m29861(interfaceC13576);
            try {
                obj = abstractC5038.mo10745(obj);
                if (obj == EnumC9061.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C20086.m45501(th);
            }
            abstractC5038.mo10748();
            if (!(interfaceC13576 instanceof AbstractC5038)) {
                interfaceC13576.mo10744(obj);
                return;
            }
            interfaceC13575 = interfaceC13576;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo10746 = mo10746();
        if (objMo10746 == null) {
            objMo10746 = getClass().getName();
        }
        sb.append(objMo10746);
        return sb.toString();
    }

    @Override // p067l.InterfaceC21132
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC21132 mo5669() {
        InterfaceC13575 interfaceC13575 = this.f11573;
        if (interfaceC13575 instanceof InterfaceC21132) {
            return (InterfaceC21132) interfaceC13575;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public StackTraceElement mo10746() {
        int iIntValue;
        String strM5117c;
        InterfaceC3025 interfaceC3025 = (InterfaceC3025) getClass().getAnnotation(InterfaceC3025.class);
        if (interfaceC3025 == null || interfaceC3025.m5121v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC3025.m5119l()[iIntValue] : -1;
        String strM7127 = C3696.m7127(this);
        if (strM7127 == null) {
            strM5117c = interfaceC3025.m5117c();
        } else {
            strM5117c = strM7127 + '/' + interfaceC3025.m5117c();
        }
        return new StackTraceElement(strM5117c, interfaceC3025.m5120m(), interfaceC3025.m5118f(), i);
    }
}
