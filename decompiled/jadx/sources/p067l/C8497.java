package p067l;

/* JADX INFO: renamed from: l.ۜ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I59Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C8497 {

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f22807 = new ConcurrentMapC12768();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX INFO: renamed from: ֫ */
    public final int m19756(String str) {
        if (str.length() == 1) {
            switch (str) {
                case "B":
                    return -3;
                case "C":
                    return -5;
                case "D":
                    return -9;
                case "F":
                    return -7;
                case "I":
                    return -6;
                case "J":
                    return -8;
                case "S":
                    return -4;
                case "V":
                    return -1;
                case "Z":
                    return -2;
            }
        }
        Integer numValueOf = (Integer) this.f22807.get(str);
        if (numValueOf == null) {
            synchronized (this.f22807) {
                numValueOf = Integer.valueOf(this.f22807.size());
                this.f22807.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }
}
