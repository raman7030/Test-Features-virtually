package p067l;

import android.media.MediaDrmResetException;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: l.ۙ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: NJN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6988 implements InterfaceC9934 {
    /* JADX INFO: renamed from: ֫ */
    public static String m16053(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16054(String str, String str2) {
        C21334.m48351(str + str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ boolean m16055(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m16056(InterfaceC14364 interfaceC14364, Object obj, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        Object obj2 = interfaceC14364.get(obj);
        if (obj2 == null && !interfaceC14364.containsKey(obj)) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            interfaceC14364.remove(obj);
            return null;
        }
        interfaceC14364.put(obj, objApply);
        return objApply;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m16052(InterfaceC14364 interfaceC14364, Object obj, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        Object obj2 = interfaceC14364.get(obj);
        boolean z = obj2 != null || interfaceC14364.containsKey(obj);
        if (!z) {
            obj2 = null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            interfaceC14364.put(obj, objApply);
            return objApply;
        }
        if (z) {
            interfaceC14364.remove(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m16051(InterfaceC14364 interfaceC14364, Object obj, Object obj2, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        C12826.requireNonNull(obj2);
        Object obj3 = interfaceC14364.get(obj);
        if ((obj3 != null || interfaceC14364.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            interfaceC14364.remove(obj);
            return null;
        }
        interfaceC14364.put(obj, obj2);
        return obj2;
    }
}
