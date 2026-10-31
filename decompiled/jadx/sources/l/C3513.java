package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3513 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Class f11163;

    public C3513(Enum[] enumArr) {
        C11233.m27805(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        C11233.m27799(componentType);
        this.f11163 = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f11163.getEnumConstants();
        C11233.m27803(enumConstants, "getEnumConstants(...)");
        return C20447.m46845((Enum[]) enumConstants);
    }
}
