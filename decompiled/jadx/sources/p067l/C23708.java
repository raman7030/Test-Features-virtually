package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23708 {

    /* JADX INFO: renamed from: ֫ */
    public int f75444;

    /* JADX INFO: renamed from: ۜ */
    public C19665 f75445;

    /* JADX INFO: renamed from: ۡ */
    public C14260 f75446;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f75447;

    /* JADX INFO: renamed from: ۧ */
    public C14990 f75448;

    /* JADX INFO: renamed from: ܳ */
    public final String f75449;

    /* JADX INFO: renamed from: ܺ */
    public C14260 f75450;

    /* JADX INFO: renamed from: ܽ */
    public C15660 f75451;

    /* JADX INFO: renamed from: ܿ */
    public C4242 f75452;

    /* JADX INFO: renamed from: ᩳ */
    public final C13000 f75453;

    /* JADX INFO: renamed from: ᩷ */
    public C12249 f75454;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC12548 f75455;

    /* JADX INFO: renamed from: ۘ */
    public final void m52720() {
        this.f75448 = C14990.f42827;
    }

    public C23708(String str, boolean z, byte[] bArr) {
        C13000 c13000 = new C13000(bArr);
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f75449 = str;
        this.f75453 = c13000;
        this.f75447 = z;
        this.f75444 = -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m52731() {
        return this.f75449;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C13000 m52729() {
        return this.f75453;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m52730() {
        m52714();
        this.f75453.m29814(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52717() {
        m52714();
        return this.f75444;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C14260 m52719() {
        m52714();
        return this.f75450;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C14260 m52726() {
        m52714();
        return this.f75446;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C12249 m52728() {
        m52714();
        return this.f75454;
    }

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC12548 m52721() {
        m52714();
        return this.f75455;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12548 m52718(int i, int i2) {
        if (i2 == 0) {
            return C15600.f44675;
        }
        C12249 c12249 = this.f75454;
        if (c12249 == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new C23038(this.f75453, i, i2, c12249);
    }

    /* JADX INFO: renamed from: ֡ */
    private void m52714() {
        if (this.f75444 == -1) {
            m52715();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final C14930 m52722() {
        if (this.f75451 == null) {
            m52715();
        }
        InterfaceC14320 interfaceC14320M35585 = this.f75451.m35585("SourceFile");
        if (interfaceC14320M35585 instanceof C19645) {
            return ((C19645) interfaceC14320M35585).m44660();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C19665 m52723() {
        if (this.f75451 == null) {
            m52715();
        }
        return this.f75445;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15660 m52724() {
        if (this.f75451 == null) {
            m52715();
        }
        return this.f75451;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C4242 m52725() {
        if (this.f75451 == null) {
            m52715();
        }
        return this.f75452;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C20987 m52727() {
        if (this.f75451 == null) {
            m52715();
        }
        C22842 c22842 = (C22842) this.f75451.m35585("BootstrapMethods");
        if (c22842 != null) {
            return c22842.m51046();
        }
        return C20987.f65899;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m52715() {
        String str = this.f75449;
        try {
            m52716();
        } catch (C24378 e) {
            e.m23570("...while parsing " + str);
            throw e;
        } catch (RuntimeException e2) {
            C24378 c24378 = new C24378(null, e2);
            c24378.m23570("...while parsing " + str);
            throw c24378;
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m52716() {
        AbstractC15405 abstractC15405;
        C13000 c13000 = this.f75453;
        if (c13000.m29810() < 10) {
            throw new C24378("severely truncated class file", null);
        }
        boolean z = this.f75447;
        if (z) {
            if (c13000.m29814(0) != -889275714) {
                throw new C24378("bad class file magic (" + C16351.m37155(c13000.m29814(0)) + MotionUtils.EASING_TYPE_FORMAT_END, null);
            }
            int iM29815 = c13000.m29815(4);
            int iM29816 = c13000.m29815(6);
            if (iM29815 < 0 || (iM29816 != 53 ? iM29816 >= 53 || iM29816 < 45 : iM29815 > 0)) {
                throw new C24378("unsupported class file version " + c13000.m29815(6) + "." + c13000.m29815(4), null);
            }
        }
        C7615 c7615 = new C7615(c13000);
        C12249 c12249M17569 = c7615.m17569();
        this.f75454 = c12249M17569;
        c12249M17569.mo22326();
        int iM17568 = c7615.m17568();
        int iM29817 = c13000.m29815(iM17568);
        this.f75450 = (C14260) this.f75454.get(c13000.m29815(iM17568 + 2));
        int iM29818 = c13000.m29815(iM17568 + 4);
        C12249 c12249 = this.f75454;
        if (iM29818 == 0) {
            c12249.getClass();
            abstractC15405 = null;
        } else {
            abstractC15405 = c12249.get(iM29818);
        }
        this.f75446 = (C14260) abstractC15405;
        int iM29819 = c13000.m29815(iM17568 + 6);
        int i = iM17568 + 8;
        this.f75455 = m52718(i, iM29819);
        int i2 = (iM29819 * 2) + i;
        if (z) {
            String strM22286 = this.f75450.m32771().m22286();
            String str = this.f75449;
            if (!str.endsWith(".class") || !str.startsWith(strM22286) || str.length() != strM22286.length() + 6) {
                throw new C24378(C21459.m48622("class name (", strM22286, ") does not match path (", str, MotionUtils.EASING_TYPE_FORMAT_END), null);
            }
        }
        this.f75444 = iM29817;
        C21697 c21697 = new C21697(this, this.f75450, i2, this.f75448);
        this.f75452 = c21697.m48989();
        C5603 c5603 = new C5603(this, this.f75450, c21697.m15917(), this.f75448);
        this.f75445 = c5603.m12413();
        C17001 c17001 = new C17001(this, 0, c5603.m15917(), this.f75448);
        C15660 c15660M38593 = c17001.m38593();
        this.f75451 = c15660M38593;
        c15660M38593.mo22326();
        int iM38592 = c17001.m38592();
        if (iM38592 != c13000.m29810()) {
            throw new C24378("extra bytes at end of class file, at offset ".concat(C16351.m37155(iM38592)), null);
        }
    }
}
