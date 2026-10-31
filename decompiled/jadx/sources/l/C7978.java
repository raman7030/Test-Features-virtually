package l;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes.dex */
public class C7978 extends AbstractC3163 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C20483 f24633;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24634 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15032 f24635;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Boolean f24636;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24637;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10577 f24638;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f24639;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private native void m21280();

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo9687() {
        return false;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo9706() {
        return false;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩸ */
    public final void mo9707() {
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo9708() {
        return false;
    }

    public C7978(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f24637 = true;
        this.f24639 = new C3786(new C0922(this), true);
        this.f24635 = C15032.m35556(i, abstractC3577);
        m21280();
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C15032 c15032M35556 = C15032.m35556(this.f9954, abstractC3577);
        if (this.f24635.equals(c15032M35556)) {
            return;
        }
        this.f24635 = c15032M35556;
        m21280();
        this.f24639.m11441();
    }

    public C7978(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
        this.f24637 = c12951.m31498();
        Boolean boolM31502 = c12951.m31502();
        this.f24636 = boolM31502;
        if (boolM31502 != null) {
            this.f24639.m11443(boolM31502.booleanValue());
        }
        this.f24638.m26590(c12951.m31503());
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
        c10130.m25425(this.f24637);
        c10130.m25422(this.f24636);
        c10130.m25424(this.f24638.m26587());
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۘ */
    public final String mo9688() {
        return this.f24635.f45813;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۖ */
    public final String mo9686() {
        return AbstractC3163.m9679(this.f24635.f45813);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܶ */
    public final String mo9699() {
        return TextUtils.isEmpty(this.f9955.f11354) ? "/" : AbstractC16891.m39731(this.f9955.f11354);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        this.f24639.m11441();
        if (z) {
            this.f24638.m26583();
        }
    }

    static {
        ApplicationC12518.m30701(79);
        f24633 = new C20483();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String m21279(String str) {
        boolean zStartsWith = str.startsWith("/");
        C20483 c20483 = f24633;
        if (zStartsWith) {
            return this.f24635.f45813 + c20483.m46935(str);
        }
        return this.f24635.f45813 + "/" + c20483.m46935(str);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9689() {
        return this.f24637;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9681(long j, String str) throws C6343 {
        try {
            return this.f24638.m26581(j, m21279(str));
        } catch (C6343 e) {
            this.f24637 = false;
            throw e;
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo9693(long j, String str) {
        String strM7304 = C2204.m7304(C9523.m24404(str));
        if (strM7304.indexOf(42) != -1) {
            strM7304 = "application/octet-stream";
        }
        return this.f24638.m26582(m21279(str), strM7304, j);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܽ */
    public final void mo9701(String str, boolean z) throws C11988, C10361 {
        try {
            if (z) {
                this.f24638.m26588(m21279(str) + "/");
                return;
            }
            this.f24638.m26588(m21279(str));
        } catch (C11988 e) {
            if (e.m29292() == 405) {
                throw new C10361(e);
            }
            throw e;
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final void mo9684(String str, String str2) {
        this.f24638.m26585(m21279(str), m21279(str2));
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܿ */
    public final void mo9702(String str) {
        this.f24638.m26584(m21279(str));
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f24639.m11445(str);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f24639;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f24639.m11444(str);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        String strM24406 = C9523.m24406(str);
        C8460 c8460 = (C8460) this.f24639.m11440(strM24406, C9523.m24404(str));
        if (c8460 != null) {
            return new C8684(c8460, strM24406);
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String strM39731 = AbstractC16891.m39731(str);
        Collection<C8460> collectionValues = this.f24639.m11446(strM39731).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C8460 c8460 : collectionValues) {
            if (z || !c8460.m22144().startsWith(".")) {
                arrayList.add(new C8684(c8460, strM39731));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۢ */
    public final void mo9692(String str) {
        this.f24639.m11442(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21278(C7978 c7978, List list, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C8460) it.next()).m22144());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C8460 c8460 = (C8460) it2.next();
            if (!c8460.m22145()) {
                String strM22144 = c8460.m22144();
                char cCharAt = strM22144.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM22144.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM22144.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (c7978.f24638.m26589(c7978.m21279(C9523.m24393(str, lowerCase)))) {
                        c7978.f24636 = Boolean.TRUE;
                    } else {
                        c7978.f24636 = Boolean.FALSE;
                    }
                    c7978.f24639.m11443(c7978.f24636.booleanValue());
                    return;
                }
            }
        }
    }
}
