package p067l;

import java.util.ArrayList;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3570 {

    /* JADX INFO: renamed from: ۧ */
    public static final ConcurrentMapC12768 f7249 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14100 f7250;

    public C3570(InterfaceC14100 interfaceC14100) {
        this.f7250 = interfaceC14100;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m6567(C20335 c20335) {
        String strM45902;
        synchronized (this.f7250) {
            int iMax = -1;
            for (C7594 c7594 : m6565()) {
                if (c7594.f19892.equals(c20335.f62804)) {
                    iMax = Math.max(iMax, c20335.m45901(c7594.f19891));
                }
            }
            strM45902 = iMax < 0 ? c20335.m45902() : ((C6253) c20335.f62802.get(iMax)).m14193();
        }
        return strM45902;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6568(final C20335 c20335, final String str, final boolean z) {
        if (c20335.f62804 == null || c20335.m45901(str) < 0) {
            return;
        }
        synchronized (this.f7250) {
            ArrayList<C7594> arrayListM6565 = m6565();
            boolean z2 = false;
            for (C7594 c7594 : arrayListM6565) {
                if (c7594.f19892.equals(c20335.f62804) && c7594.f19891.equals(str)) {
                    z2 = true;
                }
            }
            if (z2 || z) {
                C7480.removeIf(arrayListM6565, new Predicate() { // from class: l.᩵ܿܳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m47346or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C7594 c7595 = (C7594) obj;
                        String str2 = c7595.f19892;
                        C20335 c20336 = c20335;
                        if (!str2.equals(c20336.f62804)) {
                            return false;
                        }
                        String str3 = c7595.f19891;
                        String str4 = str;
                        if (str3.equals(str4)) {
                            return true;
                        }
                        return z && c20336.m45901(c7595.f19891) > c20336.m45901(str4);
                    }
                });
                arrayListM6565.add(0, new C7594(c20335.f62804, str));
                while (arrayListM6565.size() > 64) {
                    arrayListM6565.remove(arrayListM6565.size() - 1);
                }
                JSONArray jSONArray = new JSONArray();
                for (C7594 c7595 : arrayListM6565) {
                    jSONArray.put(new JSONArray().put(c7595.f19892).put(c7595.f19891));
                }
                try {
                    f7249.put(this.f7250, new JSONObject().put("version", 1).put("roots", jSONArray).toString());
                    C4081.f8987.execute(new RunnableC2899(0, this));
                } catch (JSONException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m6566(C3570 c3570) {
        synchronized (c3570.f7250) {
            String str = (String) f7249.remove(c3570.f7250);
            if (str != null) {
                c3570.f7250.edit().putString("hprt", str).commit();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m6565() {
        ArrayList arrayList = new ArrayList();
        ConcurrentMapC12768 concurrentMapC12768 = f7249;
        InterfaceC14100 interfaceC14100 = this.f7250;
        String string = (String) concurrentMapC12768.get(interfaceC14100);
        if (string == null) {
            string = interfaceC14100.getString("hprt", "");
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
                                            if (str2.equals(C20335.m45900(str2))) {
                                                C7594 c7594 = new C7594(str, str2);
                                                if (arrayList.contains(c7594)) {
                                                    continue;
                                                } else {
                                                    arrayList.add(c7594);
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
