package p067l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12528 {

    /* JADX INFO: renamed from: ֫ */
    public final Constructor f35145;

    /* JADX INFO: renamed from: ۜ */
    public final int f35146;

    /* JADX INFO: renamed from: ۡ */
    public final String f35147;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f35148;

    /* JADX INFO: renamed from: ۧ */
    public final String[] f35149;

    /* JADX INFO: renamed from: ܳ */
    public final C17476[] f35150;

    /* JADX INFO: renamed from: ܺ */
    public final String f35151;

    /* JADX INFO: renamed from: ܽ */
    public final Constructor f35152;

    /* JADX INFO: renamed from: ܿ */
    public final Method f35153;

    /* JADX INFO: renamed from: ᩳ */
    public final int f35154;

    /* JADX INFO: renamed from: ᩷ */
    public final C17476[] f35155;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f35156 = false;

    public C12528(Class cls, Constructor constructor, Constructor constructor2, Method method, C17476[] c17476Arr, C17476[] c17476Arr2, InterfaceC14021 interfaceC14021, String[] strArr) {
        int i;
        boolean z;
        int length = 0;
        this.f35152 = constructor;
        this.f35145 = constructor2;
        this.f35153 = method;
        this.f35150 = c17476Arr;
        if (strArr != null && strArr.length == c17476Arr.length) {
            this.f35149 = null;
        } else {
            this.f35149 = strArr;
        }
        if (interfaceC14021 != null) {
            String strTypeName = interfaceC14021.typeName();
            this.f35151 = strTypeName.length() <= 0 ? cls.getName() : strTypeName;
            String strTypeKey = interfaceC14021.typeKey();
            this.f35147 = strTypeKey.length() > 0 ? strTypeKey : null;
            i = 0;
            for (EnumC15361 enumC15361 : interfaceC14021.parseFeatures()) {
                i |= enumC15361.f43892;
            }
        } else {
            this.f35151 = cls.getName();
            this.f35147 = null;
            i = 0;
        }
        String str = this.f35147;
        if (str != null) {
            C20831.m47041(str);
        }
        this.f35146 = i;
        if (interfaceC14021 != null) {
            EnumC15361[] features = interfaceC14021.parseFeatures();
            z = false;
            for (EnumC15361 enumC15362 : features) {
                if (enumC15362 == EnumC15361.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.f35148 = z;
        this.f35155 = Arrays.equals(c17476Arr, c17476Arr2) ? c17476Arr : c17476Arr2;
        if (constructor != null) {
            length = constructor.getParameterTypes().length;
        } else if (method != null) {
            length = method.getParameterTypes().length;
        }
        this.f35154 = length;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28855(ArrayList arrayList, C17476 c17476) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C17476 c17477 = (C17476) arrayList.get(i);
            if (c17477.f52263.equals(c17476.f52263) && (!c17477.f52256 || c17476.f52256)) {
                return;
            }
        }
        arrayList.add(c17476);
    }
}
