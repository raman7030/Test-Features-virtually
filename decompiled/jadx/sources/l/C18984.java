package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18984 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59855;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59856;

    public /* synthetic */ C18984(int i, Object obj) {
        this.f59855 = i;
        this.f59856 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f59855) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f59855) {
            case 0:
                try {
                    return ((DirectoryStream.Filter) this.f59856).mo39985accept((InterfaceC20758) obj);
                } catch (IOException unused) {
                    return false;
                }
            default:
                return ((InterfaceC14812) this.f59856).mo26175((String) obj);
        }
    }
}
