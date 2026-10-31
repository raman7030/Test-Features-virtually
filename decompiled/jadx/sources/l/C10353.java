package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes3.dex */
public class C10353 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONArray f31163;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f31164;

    public C10353(JSONArray jSONArray, Iterator it) {
        this.f31163 = jSONArray;
        this.f31164 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f31164.hasNext();
    }

    @Override // java.util.Iterator
    public JSONValue next() {
        return (JSONValue) this.f31164.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
