package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5708 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Class f13969;

    public C5708(Enum[] enumArr) {
        C13045.m29867(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        C13045.m29861(componentType);
        this.f13969 = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f13969.getEnumConstants();
        C13045.m29865(enumConstants, "getEnumConstants(...)");
        return C21802.m49168((Enum[]) enumConstants);
    }
}
