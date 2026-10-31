package l;

import java.io.Serializable;
import java.lang.reflect.Field;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۖ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2808 implements InterfaceC11791, InterfaceC19742, Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 f8778;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract Object mo8684(Object obj);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo8687() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11791 mo8682(Object obj, InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC11791, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public AbstractC2808(InterfaceC11791 interfaceC11791) {
        this.f8778 = interfaceC11791;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 m8686() {
        return this.f8778;
    }

    @Override // l.InterfaceC11791
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8683(Object obj) {
        InterfaceC11791 interfaceC11791 = this;
        while (true) {
            AbstractC2808 abstractC2808 = (AbstractC2808) interfaceC11791;
            InterfaceC11791 interfaceC11792 = abstractC2808.f8778;
            C11233.m27799(interfaceC11792);
            try {
                obj = abstractC2808.mo8684(obj);
                if (obj == EnumC7041.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C18642.m43235(th);
            }
            abstractC2808.mo8687();
            if (!(interfaceC11792 instanceof AbstractC2808)) {
                interfaceC11792.mo8683(obj);
                return;
            }
            interfaceC11791 = interfaceC11792;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo8685 = mo8685();
        if (objMo8685 == null) {
            objMo8685 = getClass().getName();
        }
        sb.append(objMo8685);
        return sb.toString();
    }

    @Override // l.InterfaceC19742
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC19742 mo3350() {
        InterfaceC11791 interfaceC11791 = this.f8778;
        if (interfaceC11791 instanceof InterfaceC19742) {
            return (InterfaceC19742) interfaceC11791;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public StackTraceElement mo8685() {
        int iIntValue;
        String strC;
        InterfaceC0690 interfaceC0690 = (InterfaceC0690) getClass().getAnnotation(InterfaceC0690.class);
        if (interfaceC0690 == null || interfaceC0690.v() < 1) {
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
        int i = iIntValue >= 0 ? interfaceC0690.l()[iIntValue] : -1;
        String strM4888 = C1396.m4888(this);
        if (strM4888 == null) {
            strC = interfaceC0690.c();
        } else {
            strC = strM4888 + '/' + interfaceC0690.c();
        }
        return new StackTraceElement(strC, interfaceC0690.m(), interfaceC0690.f(), i);
    }
}
