package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܶۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16603 {

    /* JADX INFO: renamed from: ۧ */
    public long f48761;

    /* JADX INFO: renamed from: ܳ */
    public int f48762;

    /* JADX INFO: renamed from: ܿ */
    public String f48764;

    /* JADX INFO: renamed from: ᩳ */
    public final JSONArray f48765 = JSON.array();

    /* JADX INFO: renamed from: ᩻ */
    public final JSONArray f48766 = JSON.array();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f48760 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public long f48763 = -1;

    public C16603(int i) {
        this.f48762 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37617(long j, String str) {
        JSONArray jSONArray = this.f48766;
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            if (str.equals(((JSONValue) it.next()).asObject().getString("reason"))) {
                return;
            }
        }
        jSONArray.add(JSON.object().add("reason", str).add("line", j));
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONArray m37616() {
        JSONArray jSONArrayArray = JSON.array();
        for (C9898 c9898 : this.f48760) {
            jSONArrayArray.add(JSON.object().add("startLine", c9898.f27445).add("startColumn", c9898.f27444).add(TextBundle.TEXT_ENTRY, c9898.f27446.toString()));
        }
        return jSONArrayArray;
    }
}
