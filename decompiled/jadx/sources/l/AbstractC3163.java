package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۗۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3163 extends AbstractC13921 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Set f9952 = C20195.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9953 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f9954;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC3577 f9955;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract InputStream mo9681(long j, String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo9684(String str, String str2);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String mo9686() {
        return null;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9687();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public abstract String mo9688();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo9689() {
        return true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9691(String str);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public abstract void mo9692(String str);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract OutputStream mo9693(long j, String str);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo9695(C10130 c10130);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract String mo9699();

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return b.k;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo9701(String str, boolean z);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract void mo9702(String str);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9703(String str);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9706();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract void mo9707();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9708();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract String mo9709(String str);

    static {
        C4925.m14315(new RunnableC15156());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9678() {
        boolean z;
        AbstractC3577 abstractC3577M31047;
        Set<AbstractC3163> set = f9952;
        synchronized (set) {
            z = false;
            for (AbstractC3163 abstractC3163 : set) {
                if (!abstractC3163.f9953 && (abstractC3577M31047 = C12749.m31047(abstractC3163.f9955.f11356)) != null && !abstractC3163.f9955.equals(abstractC3577M31047)) {
                    abstractC3163.mo9685(abstractC3577M31047);
                    z = true;
                }
            }
        }
        if (z) {
            C5935.m16666();
        }
    }

    public AbstractC3163(int i, AbstractC3577 abstractC3577) {
        this.f9954 = i;
        this.f9955 = abstractC3577;
        f9952.add(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo9685(AbstractC3577 abstractC3577) {
        this.f9955 = abstractC3577;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.writeInt(this.f9954);
        c10130.m25442(getClass().getName());
        c10130.m25423((CharSequence) C12749.m31041(this.f9955).toString());
        mo9695(c10130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3163 m9676(C12951 c12951) {
        int i = c12951.readInt();
        try {
            return (AbstractC3163) Class.forName(c12951.m31499()).getConstructor(Integer.TYPE, AbstractC3577.class, C12951.class).newInstance(Integer.valueOf(i), C12749.m31030(new JSONObject(c12951.m31504())), c12951);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m9704() {
        return this.f9955.f11349 ? 4 : 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m9679(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            return new URI(strTrim).getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m9677(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            return m9679(strTrim);
        }
        char[] cArr = {'/', '?', '#'};
        int i = -1;
        for (int i2 = 0; i2 < 3; i2++) {
            int iIndexOf = strTrim.indexOf(cArr[i2]);
            if (iIndexOf >= 0 && (i < 0 || iIndexOf < i)) {
                i = iIndexOf;
            }
        }
        if (i >= 0) {
            strTrim = strTrim.substring(0, i);
        }
        if (strTrim.isEmpty()) {
            return null;
        }
        if (strTrim.startsWith("[")) {
            int iIndexOf2 = strTrim.indexOf(93);
            return iIndexOf2 > 0 ? strTrim.substring(0, iIndexOf2 + 1) : strTrim;
        }
        int iIndexOf3 = strTrim.indexOf(58);
        if (iIndexOf3 < 0 || iIndexOf3 != strTrim.lastIndexOf(58)) {
            return strTrim;
        }
        String strSubstring = strTrim.substring(iIndexOf3 + 1);
        if (strSubstring.isEmpty()) {
            return strTrim;
        }
        for (int i3 = 0; i3 < strSubstring.length(); i3++) {
            char cCharAt = strSubstring.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                return strTrim;
            }
        }
        return strTrim.substring(0, iIndexOf3);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo9694(int i, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo9683(int i, int i2, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C20097 mo9705() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo9700(long j, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m9680() {
        return this.f9955.mo6371();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC1377 mo9698(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        return mo9681(0L, interfaceC17889.getPath());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update(b.k.getBytes());
        C14460.m34528(messageDigest, this.f9955.mo6369().toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream mo9682(String str, long j, long j2) {
        return mo9681(j, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m9697(String str, boolean z) {
        try {
            mo9701(str, z);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo9696(String str, String str2) {
        try {
            mo9684(str, str2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC3577 m9690() {
        return this.f9955;
    }
}
