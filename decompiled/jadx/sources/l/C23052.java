package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes.dex */
public class C23052 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f74163;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f74164;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f74165;

    public C23052(JSONObject jSONObject, Iterator it, Iterator it2) {
        this.f74164 = jSONObject;
        this.f74165 = it;
        this.f74163 = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f74165.hasNext();
    }

    @Override // java.util.Iterator
    public JSONObject.Member next() {
        return new JSONObject.Member((String) this.f74165.next(), (JSONValue) this.f74163.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
