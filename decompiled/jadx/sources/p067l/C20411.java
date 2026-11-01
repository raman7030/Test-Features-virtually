package p067l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20411 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f63083;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f63084;

    public /* synthetic */ C20411(int i, Object obj) {
        this.f63083 = i;
        this.f63084 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f63083) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m46085or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f63083) {
            case 0:
                try {
                    return ((DirectoryStream.Filter) this.f63084).mo56507accept((InterfaceC22097) obj);
                } catch (IOException unused) {
                    return false;
                }
            default:
                return ((InterfaceC16446) this.f63084).mo28204((String) obj);
        }
    }
}
