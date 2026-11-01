package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes3.dex */
public class C12208 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ JSONArray f34125;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f34126;

    public C12208(JSONArray jSONArray, Iterator it) {
        this.f34125 = jSONArray;
        this.f34126 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f34126.hasNext();
    }

    @Override // java.util.Iterator
    public JSONValue next() {
        return (JSONValue) this.f34126.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
