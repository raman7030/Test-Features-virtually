package l;

/* JADX INFO: renamed from: l.᩻᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01EH */
/* JADX INFO: loaded from: classes.dex */
public final class C24032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f77859;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f77860;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f77861;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f77862;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21916[] f77863;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f77864;

    public C24032(int i, int i2, String str, C21916[] c21916Arr, int i3, int i4) {
        this.f77861 = i;
        this.f77860 = i2;
        this.f77864 = str;
        this.f77863 = c21916Arr;
        this.f77862 = i3;
        this.f77859 = i4;
    }

    public C24032(C4794 c4794, int i, int i2) {
        if (c4794.mo5009()) {
            this.f77861 = 1;
            this.f77860 = -1;
            this.f77864 = c4794.mo5008().getValue();
            this.f77863 = c4794.mo5008().mo10320();
        } else if (c4794.mo5007()) {
            this.f77861 = 2;
            this.f77860 = c4794.getValue();
            this.f77864 = null;
            this.f77863 = null;
        } else if (c4794.mo5005()) {
            this.f77861 = 3;
            this.f77860 = c4794.getValue();
            this.f77864 = null;
            this.f77863 = null;
        } else {
            throw new RuntimeException();
        }
        this.f77862 = i;
        this.f77859 = i2;
    }

    public C24032(int i, int i2, int i3) {
        this.f77861 = 0;
        this.f77860 = i;
        this.f77864 = null;
        this.f77863 = null;
        this.f77862 = i2;
        this.f77859 = i3;
    }
}
