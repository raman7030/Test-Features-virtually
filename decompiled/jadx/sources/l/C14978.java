package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܶۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14978 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f45648;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f45649;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f45651;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONArray f45652 = JSON.array();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final JSONArray f45653 = JSON.array();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f45647 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f45650 = -1;

    public C14978(int i) {
        this.f45649 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35461(long j, String str) {
        JSONArray jSONArray = this.f45653;
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            if (str.equals(((JSONValue) it.next()).asObject().getString("reason"))) {
                return;
            }
        }
        jSONArray.add(JSON.object().add("reason", str).add("line", j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONArray m35460() {
        JSONArray jSONArrayArray = JSON.array();
        for (C7923 c7923 : this.f45647) {
            jSONArrayArray.add(JSON.object().add("startLine", c7923.f24530).add("startColumn", c7923.f24529).add(TextBundle.TEXT_ENTRY, c7923.f24531.toString()));
        }
        return jSONArrayArray;
    }
}
