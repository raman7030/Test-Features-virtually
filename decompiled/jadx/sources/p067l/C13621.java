package p067l;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13621 extends AbstractC10288 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC16992 f38328 = new C8256();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f38330 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f38331 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f38329 = new HashMap();

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        c24726.m54386(r3 == null ? null : (String) this.f38329.get(r3));
    }

    public C13621(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r3 = (Enum) field2.get(null);
                String strName = r3.name();
                String string = r3.toString();
                InterfaceC23699 interfaceC23699 = (InterfaceC23699) field2.getAnnotation(InterfaceC23699.class);
                if (interfaceC23699 != null) {
                    strName = interfaceC23699.value();
                    for (String str : interfaceC23699.alternate()) {
                        this.f38330.put(str, r3);
                    }
                }
                this.f38330.put(strName, r3);
                this.f38331.put(string, r3);
                this.f38329.put(r3, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        String strM42644 = c18691.m42644();
        Enum r0 = (Enum) this.f38330.get(strM42644);
        return r0 == null ? (Enum) this.f38331.get(strM42644) : r0;
    }
}
