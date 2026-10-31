package l;

/* JADX INFO: renamed from: l.ۢᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9766 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String[] f29542;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17757 f29543;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5804[] f29544;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22737[] f29545;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f29546 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5804 m24770(C9766 c9766, C0117 c0117) {
        c9766.getClass();
        if (c0117.m1144() != c9766.f29543) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (c0117.m1126()) {
            throw new IllegalArgumentException("This type does not have extensions.");
        }
        return c9766.f29544[c0117.m1130()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC22737 m24772(C9766 c9766, C14934 c14934) {
        c9766.getClass();
        if (c14934.m35389() != c9766.f29543) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
        return c9766.f29545[c14934.m35387()];
    }

    public C9766(C17757 c17757, String[] strArr) {
        this.f29543 = c17757;
        this.f29542 = strArr;
        this.f29544 = new InterfaceC5804[c17757.getFields().size()];
        this.f29545 = new InterfaceC22737[c17757.m41589().size()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24773(Class cls, Class cls2) {
        if (this.f29546) {
            return;
        }
        synchronized (this) {
            if (this.f29546) {
                return;
            }
            int length = this.f29544.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                C0117 c0117 = (C0117) this.f29543.getFields().get(i);
                if (c0117.m1139() != null) {
                    int iM35387 = c0117.m1139().m35387() + length;
                    String[] strArr = this.f29542;
                    if (iM35387 < strArr.length) {
                        str = strArr[iM35387];
                    }
                }
                String str2 = str;
                if (c0117.mo1129()) {
                    if (c0117.m1138() == EnumC18463.MESSAGE) {
                        if (c0117.m1137()) {
                            this.f29544[i] = new C11449(c0117, cls);
                        } else {
                            this.f29544[i] = new C16820(cls, cls2, this.f29542[i]);
                        }
                    } else if (c0117.m1138() == EnumC18463.ENUM) {
                        this.f29544[i] = new C7215(c0117, this.f29542[i], cls, cls2);
                    } else {
                        this.f29544[i] = new C11177(cls, cls2, this.f29542[i]);
                    }
                } else if (c0117.m1138() == EnumC18463.MESSAGE) {
                    this.f29544[i] = new C23876(c0117, this.f29542[i], cls, cls2, str2);
                } else if (c0117.m1138() == EnumC18463.ENUM) {
                    this.f29544[i] = new C18232(c0117, this.f29542[i], cls, cls2, str2);
                } else if (c0117.m1138() == EnumC18463.STRING) {
                    this.f29544[i] = new C6943(c0117, this.f29542[i], cls, cls2, str2);
                } else {
                    this.f29544[i] = new C14703(c0117, this.f29542[i], cls, cls2, str2);
                }
                i++;
            }
            for (int i2 = 0; i2 < this.f29543.m41589().size(); i2++) {
                if (i2 < this.f29543.m41595().size()) {
                    this.f29545[i2] = new C13564(this.f29543, this.f29542[i2 + length], cls, cls2);
                } else {
                    this.f29545[i2] = new C21055(this.f29543, i2);
                }
            }
            this.f29546 = true;
            this.f29542 = null;
        }
    }
}
