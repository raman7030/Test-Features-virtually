package p067l;

/* JADX INFO: renamed from: l.֡ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBHJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2880 implements InterfaceC10988 {

    /* JADX INFO: renamed from: ֫ */
    public final C10257 f4973;

    /* JADX INFO: renamed from: ۧ */
    public final int f4974;

    /* JADX INFO: renamed from: ܽ */
    public final int f4975;

    /* JADX INFO: renamed from: ܿ */
    public final C22388 f4976;

    /* JADX INFO: renamed from: ᩳ */
    public final int f4977;

    public C2880(int i, int i2, int i3, C22388 c22388, C10257 c10257) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int size = c22388.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (c22388.get(i4) < 0) {
                StringBuilder sbM34408 = C15033.m34408(i4, "successors[", "] == ");
                sbM34408.append(c22388.get(i4));
                throw new IllegalArgumentException(sbM34408.toString());
            }
        }
        if (c10257 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f4975 = i;
        this.f4977 = i2;
        this.f4974 = i3;
        this.f4976 = c22388;
        this.f4973 = c10257;
    }

    public final String toString() {
        return "{" + C16351.m37153(this.f4975) + ": " + C16351.m37153(this.f4977) + ".." + C16351.m37153(this.f4974) + '}';
    }

    @Override // p067l.InterfaceC10988
    /* JADX INFO: renamed from: ֫ */
    public final int mo4636() {
        return this.f4975;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m4640() {
        return this.f4977;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m4638() {
        return this.f4974;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C22388 m4639() {
        return this.f4976;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10257 m4637() {
        return this.f4973;
    }
}
