package p067l;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M1H2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12910 {

    /* JADX INFO: renamed from: ܳ */
    public static final /* synthetic */ int f36286 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public static final Class[] f36287 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f36288;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f36289;

    /* JADX INFO: renamed from: ܽ */
    public final LinkedHashMap f36290;

    /* JADX INFO: renamed from: ܿ */
    public final LinkedHashMap f36291;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC10137 f36292;

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m29582(C12910 c12910) {
        LinkedHashMap linkedHashMap = c12910.f36290;
        Iterator it = C2845.m4541(c12910.f36291).entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return C1702.m42917(new C17402("keys", arrayList), new C17402("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleMo4332 = ((InterfaceC10137) entry.getValue()).mo4332();
            C13045.m29867(str2, "key");
            if (bundleMo4332 != null) {
                while (true) {
                    if (i >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleMo4332.getClass() + " into saved state");
                    }
                    Class cls = f36287[i];
                    C13045.m29861(cls);
                    if (cls.isInstance(bundleMo4332)) {
                        break;
                    }
                    i++;
                }
            }
            Object obj = c12910.f36289.get(str2);
            C7350 c7350 = obj instanceof C7350 ? (C7350) obj : null;
            if (c7350 != null) {
                c7350.mo4067(bundleMo4332);
            } else {
                linkedHashMap.put(str2, bundleMo4332);
            }
            InterfaceC16790 interfaceC16790 = (InterfaceC16790) c12910.f36288.get(str2);
            if (interfaceC16790 != null) {
                interfaceC16790.m38036();
            }
        }
    }

    public C12910(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f36290 = linkedHashMap;
        this.f36291 = new LinkedHashMap();
        this.f36289 = new LinkedHashMap();
        this.f36288 = new LinkedHashMap();
        this.f36292 = new InterfaceC10137() { // from class: l.۟ۡ֫
            @Override // p067l.InterfaceC10137
            /* JADX INFO: renamed from: ֫ */
            public final Bundle mo4332() {
                return C12910.m29582(this.f25487);
            }
        };
        linkedHashMap.putAll(map);
    }

    public C12910() {
        this.f36290 = new LinkedHashMap();
        this.f36291 = new LinkedHashMap();
        this.f36289 = new LinkedHashMap();
        this.f36288 = new LinkedHashMap();
        this.f36292 = new InterfaceC10137() { // from class: l.۟ۡ֫
            @Override // p067l.InterfaceC10137
            /* JADX INFO: renamed from: ֫ */
            public final Bundle mo4332() {
                return C12910.m29582(this.f25487);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10137 m29583() {
        return this.f36292;
    }
}
