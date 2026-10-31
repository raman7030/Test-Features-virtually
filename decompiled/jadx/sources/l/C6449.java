package l;

/* JADX INFO: renamed from: l.ۜ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I59Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C6449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f19934 = new ConcurrentMapC10942();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17809(String str) {
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
        Integer numValueOf = (Integer) this.f19934.get(str);
        if (numValueOf == null) {
            synchronized (this.f19934) {
                numValueOf = Integer.valueOf(this.f19934.size());
                this.f19934.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }
}
