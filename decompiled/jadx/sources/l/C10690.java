package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10690 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Constructor f32174;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f32175;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f32176;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f32177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f32178;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15896[] f32179;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f32180;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Constructor f32181;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Method f32182;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f32183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15896[] f32184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f32185 = false;

    public C10690(Class cls, Constructor constructor, Constructor constructor2, Method method, C15896[] c15896Arr, C15896[] c15896Arr2, InterfaceC12261 interfaceC12261, String[] strArr) {
        int i;
        boolean z;
        int length = 0;
        this.f32181 = constructor;
        this.f32174 = constructor2;
        this.f32182 = method;
        this.f32179 = c15896Arr;
        if (strArr != null && strArr.length == c15896Arr.length) {
            this.f32178 = null;
        } else {
            this.f32178 = strArr;
        }
        if (interfaceC12261 != null) {
            String strTypeName = interfaceC12261.typeName();
            this.f32180 = strTypeName.length() <= 0 ? cls.getName() : strTypeName;
            String strTypeKey = interfaceC12261.typeKey();
            this.f32176 = strTypeKey.length() > 0 ? strTypeKey : null;
            i = 0;
            for (EnumC13671 enumC13671 : interfaceC12261.parseFeatures()) {
                i |= enumC13671.f40811;
            }
        } else {
            this.f32180 = cls.getName();
            this.f32176 = null;
            i = 0;
        }
        String str = this.f32176;
        if (str != null) {
            C19426.m44747(str);
        }
        this.f32175 = i;
        if (interfaceC12261 != null) {
            EnumC13671[] features = interfaceC12261.parseFeatures();
            z = false;
            for (EnumC13671 enumC13672 : features) {
                if (enumC13672 == EnumC13671.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.f32177 = z;
        this.f32184 = Arrays.equals(c15896Arr, c15896Arr2) ? c15896Arr : c15896Arr2;
        if (constructor != null) {
            length = constructor.getParameterTypes().length;
        } else if (method != null) {
            length = method.getParameterTypes().length;
        }
        this.f32183 = length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26815(ArrayList arrayList, C15896 c15896) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15896 c15897 = (C15896) arrayList.get(i);
            if (c15897.f49123.equals(c15896.f49123) && (!c15897.f49116 || c15896.f49116)) {
                return;
            }
        }
        arrayList.add(c15896);
    }
}
