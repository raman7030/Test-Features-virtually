package p067l;

/* JADX INFO: renamed from: l.ܰᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15680 {

    /* JADX INFO: renamed from: ܳ */
    public static int f45451;

    /* JADX INFO: renamed from: ֫ */
    public final C22408 f45452;

    /* JADX INFO: renamed from: ۧ */
    public final Object f45453;

    /* JADX INFO: renamed from: ܽ */
    public final String f45454;

    /* JADX INFO: renamed from: ܿ */
    public final C18383 f45455;

    /* JADX INFO: renamed from: ᩳ */
    public final int f45456;

    public C15680(C22408 c22408, C18383 c18383, Object obj, String str) {
        int i;
        synchronized (this) {
            i = f45451;
            f45451 = i + 1;
        }
        this.f45456 = i;
        this.f45452 = c22408;
        this.f45455 = c18383;
        this.f45453 = obj;
        this.f45454 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C22408 c22408 = this.f45452;
        if (c22408 != null) {
            sb.append(c22408);
            sb.append(':');
        }
        sb.append(this.f45455);
        Object obj = this.f45453;
        if (obj != null && !c22408.equals(obj)) {
            sb.append(":");
            sb.append(obj);
        }
        sb.append(" -> ");
        sb.append(this.f45454);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15680)) {
            return false;
        }
        C15680 c15680 = (C15680) obj;
        return C12826.equals(this.f45452, c15680.f45452) && C12826.equals(this.f45453, c15680.f45453) && this.f45455.equals(c15680.f45455) && this.f45454.equals(c15680.f45454);
    }

    public final int hashCode() {
        return this.f45454.hashCode() + ((this.f45455.hashCode() + ((C12826.hashCode(this.f45453) + (C12826.hashCode(this.f45452) * 31)) * 31)) * 31);
    }
}
