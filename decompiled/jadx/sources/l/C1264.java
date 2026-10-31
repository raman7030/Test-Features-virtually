package l;

import java.util.ArrayList;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1264 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f4479 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f4480;

    public C1264(InterfaceC12344 interfaceC12344) {
        this.f4480 = interfaceC12344;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m4323(C18904 c18904) {
        String strM43636;
        synchronized (this.f4480) {
            int iMax = -1;
            for (C5498 c5498 : m4321()) {
                if (c5498.f17053.equals(c18904.f59574)) {
                    iMax = Math.max(iMax, c18904.m43635(c5498.f17052));
                }
            }
            strM43636 = iMax < 0 ? c18904.m43636() : ((C4087) c18904.f59572.get(iMax)).m12288();
        }
        return strM43636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4324(final C18904 c18904, final String str, final boolean z) {
        if (c18904.f59574 == null || c18904.m43635(str) < 0) {
            return;
        }
        synchronized (this.f4480) {
            ArrayList<C5498> arrayListM4321 = m4321();
            boolean z2 = false;
            for (C5498 c5498 : arrayListM4321) {
                if (c5498.f17053.equals(c18904.f59574) && c5498.f17052.equals(str)) {
                    z2 = true;
                }
            }
            if (z2 || z) {
                C5378.removeIf(arrayListM4321, new Predicate() { // from class: l.᩵ܿܳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C5498 c5499 = (C5498) obj;
                        String str2 = c5499.f17053;
                        C18904 c18905 = c18904;
                        if (!str2.equals(c18905.f59574)) {
                            return false;
                        }
                        String str3 = c5499.f17052;
                        String str4 = str;
                        if (str3.equals(str4)) {
                            return true;
                        }
                        return z && c18905.m43635(c5499.f17052) > c18905.m43635(str4);
                    }
                });
                arrayListM4321.add(0, new C5498(c18904.f59574, str));
                while (arrayListM4321.size() > 64) {
                    arrayListM4321.remove(arrayListM4321.size() - 1);
                }
                JSONArray jSONArray = new JSONArray();
                for (C5498 c5499 : arrayListM4321) {
                    jSONArray.put(new JSONArray().put(c5499.f17053).put(c5499.f17052));
                }
                try {
                    f4479.put(this.f4480, new JSONObject().put("version", 1).put("roots", jSONArray).toString());
                    C1802.f6208.execute(new RunnableC0558(0, this));
                } catch (JSONException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4322(C1264 c1264) {
        synchronized (c1264.f4480) {
            String str = (String) f4479.remove(c1264.f4480);
            if (str != null) {
                c1264.f4480.edit().putString("hprt", str).commit();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m4321() {
        ArrayList arrayList = new ArrayList();
        ConcurrentMapC10942 concurrentMapC10942 = f4479;
        InterfaceC12344 interfaceC12344 = this.f4480;
        String string = (String) concurrentMapC10942.get(interfaceC12344);
        if (string == null) {
            string = interfaceC12344.getString("hprt", "");
        }
        if (!string.isEmpty() && string.length() <= 1048576) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.optInt("version") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray("roots");
                    for (int i = 0; i < jSONArray.length() && arrayList.size() < 64; i++) {
                        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 2) {
                            Object objOpt = jSONArrayOptJSONArray.opt(0);
                            if (objOpt instanceof String) {
                                String str = (String) objOpt;
                                if (str.isEmpty()) {
                                    continue;
                                } else {
                                    Object objOpt2 = jSONArrayOptJSONArray.opt(1);
                                    if (objOpt2 instanceof String) {
                                        String str2 = (String) objOpt2;
                                        try {
                                            if (str2.equals(C18904.m43634(str2))) {
                                                C5498 c5498 = new C5498(str, str2);
                                                if (arrayList.contains(c5498)) {
                                                    continue;
                                                } else {
                                                    arrayList.add(c5498);
                                                }
                                            } else {
                                                continue;
                                            }
                                        } catch (IllegalArgumentException unused) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }
}
