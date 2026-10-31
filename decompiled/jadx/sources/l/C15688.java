package l;

/* JADX INFO: renamed from: l.ܺۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 62A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C15688 implements InterfaceC17889 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17889 f48358 = new C8634("..", "", null, -1, 0, false);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f48359;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11813 f48360;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f48361;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f48362;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f48363;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f48364;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f48365;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f48366;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4488 f48367;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC1629 f48368;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f48369 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f48370;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f48371;

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ֨ۧ */
    public C16477 mo24428() {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28850() {
        return this instanceof C10231;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۗ֫ */
    public CharSequence mo29720() {
        return null;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo36968() {
        return this instanceof C19218;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean mo36972() {
        return false;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo25860() {
        return false;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean mo36982() {
        return this instanceof C8634;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩸ */
    public CharSequence mo21183() {
        return null;
    }

    public C15688(String str, String str2, String str3, long j, long j2, boolean z) {
        String strConcat = "/";
        if (str2 != null && !str2.isEmpty()) {
            str2 = str2.startsWith("/") ? str2 : "/".concat(str2);
            strConcat = !str2.endsWith("/") ? str2.concat("/") : str2;
        }
        this.f48361 = str;
        this.f48364 = strConcat;
        this.f48365 = str3;
        this.f48371 = j;
        this.f48362 = j2;
        this.f48366 = z;
    }

    @Override // l.InterfaceC17889
    public final String getName() {
        return this.f48361;
    }

    public final String toString() {
        return this.f48361;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String mo36985() {
        String str = this.f48361;
        return str.length() <= 500 ? str : str.substring(0, 500);
    }

    @Override // l.InterfaceC17889
    public final String getParent() {
        return this.f48364;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo36981() {
        return (this instanceof C8634) || mo36972() || (this instanceof C19218);
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ܶۧ */
    public AbstractC15440 mo24433() {
        return C16999.m39866(getPath(), new String[0]);
    }

    @Override // l.InterfaceC17889
    public final String getPath() {
        String str = this.f48361;
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.f48364;
        return zIsEmpty ? C16014.m37867(str2, "/") : C16014.m37867(str2, str);
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۠ۧ */
    public int mo24431() {
        if (this instanceof C8634) {
            return 0;
        }
        if (isDirectory()) {
            return 5;
        }
        return !mo36972() ? 10 : 15;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final String mo36980() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48364);
        return C9045.m23341(sb, this.f48361, "/");
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final String mo36971() {
        return (isDirectory() || mo36972()) ? "*/*" : mo36973().m7315();
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final String mo36962() {
        InterfaceC1629 interfaceC1629 = this.f48368;
        if (interfaceC1629 != null) {
            return ((C2204) interfaceC1629.get()).m7319().toLowerCase();
        }
        return mo24433().m36505().toLowerCase();
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36965(InterfaceC1629 interfaceC1629) {
        this.f48368 = interfaceC1629;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final C2204 mo36973() {
        InterfaceC1629 interfaceC1629 = this.f48368;
        if (interfaceC1629 == null) {
            return C2204.m7292(this.f48361, true);
        }
        return (C2204) interfaceC1629.get();
    }

    @Override // l.InterfaceC17889
    public final long getSize() {
        return this.f48371;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36963(long j) {
        this.f48369 = j;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final long mo36979() {
        return this.f48369;
    }

    @Override // l.InterfaceC17889
    public final long getTime() {
        return this.f48362;
    }

    @Override // l.InterfaceC17889
    public final void setTime(long j) {
        this.f48362 = j;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo36969() {
        return !mo36981() && this.f48366;
    }

    @Override // l.InterfaceC17889
    public final boolean isDirectory() {
        return (mo36981() || this.f48366) ? false : true;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo36978() {
        return this.f48365 != null;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String mo36977() {
        return this.f48365;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36964(String str) {
        this.f48365 = str;
    }

    @Override // l.InterfaceC17889
    public final boolean isChecked() {
        return this.f48370;
    }

    @Override // l.InterfaceC17889
    public final void setChecked(boolean z) {
        if (mo36981()) {
            throw new RuntimeException();
        }
        this.f48370 = z;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo36983() {
        return this.f48363;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo36976(boolean z) {
        if (mo36981()) {
            throw new RuntimeException();
        }
        this.f48363 = z;
    }

    @Override // l.InterfaceC17889
    public final C11813 getIcon() {
        return this.f48360;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36966(C11813 c11813) {
        this.f48360 = c11813;
        this.f48359 = 0;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo36974(int i) {
        this.f48359 = i;
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩸֫ */
    public boolean mo24437() {
        if (mo36981() || this.f48371 == -1) {
            return false;
        }
        return !isDirectory() || mo28850();
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36967(C19883 c19883) {
        mo36966(c19883.f64250);
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final int mo36984() {
        return this.f48359;
    }

    @Override // 
    public final InterfaceC17889 clone() {
        try {
            return (InterfaceC17889) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo36975(int i, Object obj) {
        C4488 c4488 = this.f48367;
        if (c4488 == null) {
            c4488 = new C4488();
            this.f48367 = c4488;
        }
        c4488.mo2318(i, obj);
    }

    @Override // l.InterfaceC17889
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object mo36970(int i) {
        C4488 c4488 = this.f48367;
        if (c4488 == null) {
            return null;
        }
        return c4488.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15688 c15688 = (C15688) obj;
        if (this.f48371 == c15688.f48371 && this.f48362 == c15688.f48362 && this.f48366 == c15688.f48366 && this.f48361.equals(c15688.f48361) && this.f48364.equals(c15688.f48364)) {
            return C11003.equals(this.f48365, c15688.f48365);
        }
        return false;
    }

    public int hashCode() {
        int iM27349 = C11010.m27349(this.f48361.hashCode() * 31, 31, this.f48364);
        long j = this.f48371;
        int i = (iM27349 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f48362;
        int i2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f48366 ? 1 : 0)) * 31;
        String str = this.f48365;
        return i2 + (str != null ? str.hashCode() : 0);
    }
}
