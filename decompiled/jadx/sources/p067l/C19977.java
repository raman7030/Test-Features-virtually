package p067l;

import bin.p000mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19977 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f60624 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public C15952 f60625;

    /* JADX INFO: renamed from: ܽ */
    public boolean f60626;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC14100 f60627;

    public C19977(InterfaceC14100 interfaceC14100) {
        this.f60625 = C15952.f46170;
        this.f60627 = interfaceC14100;
        String string = interfaceC14100.getString("smdh", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f60625 = C15952.m36209(jSONObject.getString("headers", ""), jSONObject.getBoolean("crossOrigin", false));
            } catch (RuntimeException unused) {
                this.f60626 = true;
            }
        }
        String string2 = interfaceC14100.getString("smhc", null);
        if (string2 == null) {
            return;
        }
        try {
            for (JSONObject.Member member : new JSONObject(string2)) {
                try {
                    JSONObject jSONObjectAsObject = member.getValue().asObject();
                    C15952 c15952M36209 = C15952.m36209(jSONObjectAsObject.getString("headers", ""), jSONObjectAsObject.getBoolean("crossOrigin", false));
                    this.f60626 = (this.f60624.put(member.getName(), c15952M36209) != null) | this.f60626;
                } catch (RuntimeException unused2) {
                    this.f60626 = true;
                }
            }
        } catch (RuntimeException unused3) {
            this.f60626 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15952 m45327(String str) {
        C15952 c15952 = (C15952) this.f60624.get(str);
        return c15952 == null ? this.f60625 : c15952;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45326(String str) {
        return this.f60624.containsKey(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45325(String str, C15952 c15952, boolean z) {
        LinkedHashMap linkedHashMap = this.f60624;
        if (z) {
            linkedHashMap.put(str, c15952);
        } else {
            linkedHashMap.remove(str);
            this.f60625 = c15952;
        }
        m45323();
        m45322();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45324() {
        if (m45323() || this.f60626) {
            m45322();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m45323() {
        return this.f60624.keySet().retainAll(new HashSet(Arrays.asList(this.f60627.mo20203("smur", new String[0]))));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m45322() {
        this.f60626 = false;
        InterfaceC14770 interfaceC14770Edit = this.f60627.edit();
        LinkedHashMap linkedHashMap = this.f60624;
        if (linkedHashMap.isEmpty()) {
            interfaceC14770Edit.remove("smhc");
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                C15952 c15952 = (C15952) entry.getValue();
                jSONObject.put(str, new JSONObject().put("headers", c15952.m36211()).put("crossOrigin", c15952.m36210()));
            }
            interfaceC14770Edit.putString("smhc", jSONObject.toString());
        }
        if (this.f60625.m36212().isEmpty() && !this.f60625.m36210()) {
            interfaceC14770Edit.remove("smdh");
        } else {
            C15952 c15953 = this.f60625;
            interfaceC14770Edit.putString("smdh", new JSONObject().put("headers", c15953.m36211()).put("crossOrigin", c15953.m36210()).toString());
        }
        interfaceC14770Edit.apply();
    }
}
