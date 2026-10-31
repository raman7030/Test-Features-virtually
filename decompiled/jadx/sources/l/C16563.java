package l;

/* JADX INFO: renamed from: l.ܽۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16563 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14986 f50912;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50916;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f50917;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f50919;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50920;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f50921;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17975 f50922;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f50913 = 1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f50915 = -1;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f50914 = true;

    public C16563(C17975 c17975, C14986 c14986, int i, int i2, boolean z) {
        this.f50922 = c17975;
        C11003.requireNonNull(c14986, "changes");
        this.f50912 = c14986;
        this.f50917 = i;
        this.f50919 = i2;
        this.f50921 = z;
        if (c14986.m35507() != c17975.f56071 || i < 0 || i > c14986.m35507() || i2 < 0 || i2 > c14986.m35509()) {
            throw new IllegalArgumentException("Syntax context reuse boundaries differ");
        }
        if (z) {
            this.f50918 = c17975.f56069 - 1;
            this.f50920 = true;
        } else {
            this.f50918 = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39069(C14446 c14446) {
        if (this.f50916) {
            return false;
        }
        boolean z = this.f50920;
        int i = this.f50917;
        C17975 c17975 = this.f50922;
        if (z) {
            if (this.f50918 > 0) {
                int[] iArr = c17975.f56067;
                int i2 = this.f50918;
                if (iArr[i2] >= i) {
                    this.f50918 = i2 - 1;
                    return true;
                }
            }
            int i3 = this.f50918 + 1;
            this.f50913 = i3;
            this.f50918 = i3;
            this.f50915 = c14446.m34498();
            this.f50920 = false;
            if (this.f50918 >= c17975.f56069) {
                this.f50916 = true;
                return true;
            }
        } else {
            boolean z2 = this.f50921;
            if (!z2 && (this.f50918 >= c17975.f56069 || c17975.f56065[this.f50918] > i)) {
                this.f50916 = true;
                return false;
            }
            if (this.f50918 >= c17975.f56069) {
                this.f50916 = true;
                return false;
            }
            if (this.f50915 < 0) {
                this.f50915 = c14446.m34498();
            }
            int i4 = this.f50918;
            int i5 = c17975.f56068[i4];
            if (i5 != 0 && i5 < this.f50913) {
                this.f50914 = false;
                this.f50916 = true;
            } else {
                EnumC0875 enumC0875 = z2 ? EnumC0875.AFTER : EnumC0875.BEFORE;
                int i6 = c17975.f56067[i4];
                C14986 c14986 = this.f50912;
                int iM35503 = c14986.m35503(i6, enumC0875);
                int iM35504 = c14986.m35503(c17975.f56065[i4], enumC0875);
                if (iM35503 < 0 || iM35504 <= iM35503 || iM35504 - iM35503 != c17975.f56065[i4] - c17975.f56067[i4]) {
                    this.f50914 = false;
                    this.f50916 = true;
                } else {
                    int i7 = this.f50919;
                    if (!z2 ? iM35504 > i7 : iM35503 < i7) {
                        this.f50914 = false;
                        this.f50916 = true;
                    } else {
                        if (!c14446.m34497((this.f50915 + i4) - this.f50913, iM35503, iM35504, i5 == 0 ? 0 : (this.f50915 + i5) - this.f50913, c17975.f56066[i4])) {
                            this.f50914 = false;
                            this.f50916 = true;
                        }
                    }
                }
            }
            int i8 = this.f50918 + 1;
            this.f50918 = i8;
            if (i8 >= c17975.f56069) {
                this.f50916 = true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39068() {
        return this.f50916;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39070() {
        return this.f50914;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39067(int i) {
        if (!this.f50921 || !this.f50916 || !this.f50914 || this.f50915 < 0 || i < this.f50913 || i > this.f50922.f56069) {
            return -1;
        }
        return (this.f50915 + i) - this.f50913;
    }
}
