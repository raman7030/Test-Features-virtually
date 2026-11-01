package p067l;

import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p035m.C0168b;
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
public abstract class AbstractC5375 extends AbstractC15599 {

    /* JADX INFO: renamed from: ۗ */
    public static final Set f12755 = C21562.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: ۙ */
    public boolean f12756 = true;

    /* JADX INFO: renamed from: ᩶ */
    public final int f12757;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC5769 f12758;

    /* JADX INFO: renamed from: ֫ */
    public abstract InputStream mo11725(long j, String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo11728(String str, String str2);

    /* JADX INFO: renamed from: ۖ */
    public String mo11730() {
        return null;
    }

    /* JADX INFO: renamed from: ۗ */
    public abstract boolean mo11731();

    /* JADX INFO: renamed from: ۘ */
    public abstract String mo11732();

    /* JADX INFO: renamed from: ۙ */
    public boolean mo11733() {
        return true;
    }

    /* JADX INFO: renamed from: ۜ */
    public abstract boolean mo11735(String str);

    /* JADX INFO: renamed from: ۢ */
    public abstract void mo11736(String str);

    /* JADX INFO: renamed from: ۧ */
    public abstract OutputStream mo11737(long j, String str);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo11739(C11996 c11996);

    /* JADX INFO: renamed from: ܶ */
    public abstract String mo11743();

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return C0168b.f616k;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo11745(String str, boolean z);

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo11746(String str);

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo11747(String str);

    /* JADX INFO: renamed from: ᩶ */
    public abstract boolean mo11750();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo11751();

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo11752();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo11753(String str);

    static {
        C7050.m16212(new RunnableC16773());
    }

    /* JADX INFO: renamed from: ۬ */
    public static /* synthetic */ void m11722() {
        boolean z;
        AbstractC5769 abstractC5769M33131;
        Set<AbstractC5375> set = f12755;
        synchronized (set) {
            z = false;
            for (AbstractC5375 abstractC5375 : set) {
                if (!abstractC5375.f12756 && (abstractC5769M33131 = C14486.m33131(abstractC5375.f12758.f14161)) != null && !abstractC5375.f12758.equals(abstractC5769M33131)) {
                    abstractC5375.mo11729(abstractC5769M33131);
                    z = true;
                }
            }
        }
        if (z) {
            C8009.m18592();
        }
    }

    public AbstractC5375(int i, AbstractC5769 abstractC5769) {
        this.f12757 = i;
        this.f12758 = abstractC5769;
        f12755.add(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11729(AbstractC5769 abstractC5769) {
        this.f12758 = abstractC5769;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        c11996.writeInt(this.f12757);
        c11996.m27462(getClass().getName());
        c11996.m27443((CharSequence) C14486.m33125(this.f12758).toString());
        mo11739(c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5375 m11720(C14677 c14677) {
        int i = c14677.readInt();
        try {
            return (AbstractC5375) Class.forName(c14677.m33586()).getConstructor(Integer.TYPE, AbstractC5769.class, C14677.class).newInstance(Integer.valueOf(i), C14486.m33114(new JSONObject(c14677.m33591())), c14677);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m11748() {
        return this.f12758.f14154 ? 4 : 1;
    }

    /* JADX INFO: renamed from: ܺ */
    public static String m11723(String str) {
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

    /* JADX INFO: renamed from: ۡ */
    public static String m11721(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            return m11723(strTrim);
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

    /* JADX INFO: renamed from: ۧ */
    public void mo11738(int i, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11727(int i, int i2, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩵ */
    public C21469 mo11749() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo11744(long j, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m11724() {
        return this.f12758.mo8544();
    }

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC3678 mo11742(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) {
        return mo11725(0L, interfaceC19370.getPath());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update(C0168b.f616k.getBytes());
        C16111.m36662(messageDigest, this.f12758.mo8542().toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public InputStream mo11726(String str, long j, long j2) {
        return mo11725(j, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m11741(String str, boolean z) {
        try {
            mo11745(str, z);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo11740(String str, String str2) {
        try {
            mo11728(str, str2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC5769 m11734() {
        return this.f12758;
    }
}
