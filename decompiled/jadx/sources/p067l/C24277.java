package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes.dex */
public class C24277 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Iterator f76905;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ JSONObject f76906;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f76907;

    public C24277(JSONObject jSONObject, Iterator it, Iterator it2) {
        this.f76906 = jSONObject;
        this.f76907 = it;
        this.f76905 = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76907.hasNext();
    }

    @Override // java.util.Iterator
    public JSONObject.Member next() {
        return new JSONObject.Member((String) this.f76907.next(), (JSONValue) this.f76905.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
