package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.᩸ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21411 {

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static Comparator f68915 = new C2361();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3149 f68923;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3855 f68924;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2775 f68926;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5971 f68928;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23527 f68933;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4477[] f68938;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20414 f68942;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6594 f68945;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2069 f68946;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299 f68948;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C3480 f68950;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15142 f68954;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7897 f68955;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C14416 f68957;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f68922 = new HashMap();

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f68944 = 0;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f68927 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f68919 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f68917 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f68921 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f68930 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f68952 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68951 = 0;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f68934 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f68931 = 0;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f68940 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68916 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68943 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f68939 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68947 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f68918 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f68949 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f68920 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f68941 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f68953 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f68929 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f68936 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f68937 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f68935 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f68925 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f68932 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Comparator f68956 = new C3772((C19357) this);

    /* JADX INFO: renamed from: ֫ */
    public abstract C18651 mo44612();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo44614(C0949 c0949, Object obj);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48525(C15765 c15765, int i, int i2) throws IOException {
        C15765.m37166(c15765, i);
        if (i > 0) {
            C15765.m37166(c15765, i2);
        } else {
            C15765.m37166(c15765, 0);
        }
    }

    public AbstractC21411(C7897 c7897) {
        this.f68955 = c7897;
        C18651 c18651Mo44612 = mo44612();
        this.f68948 = c18651Mo44612.m43246();
        C14416 c14416M43249 = c18651Mo44612.m43249();
        this.f68957 = c14416M43249;
        C5971 c5971M43253 = c18651Mo44612.m43253();
        this.f68928 = c5971M43253;
        C3855 c3855M43248 = c18651Mo44612.m43248();
        this.f68924 = c3855M43248;
        C3149 c3149M43244 = c18651Mo44612.m43244();
        this.f68923 = c3149M43244;
        this.f68942 = c18651Mo44612.m43252();
        C2775 c2775M43250 = c18651Mo44612.m43250();
        this.f68926 = c2775M43250;
        C15142 c15142M43254 = c18651Mo44612.m43254();
        this.f68954 = c15142M43254;
        this.f68946 = c18651Mo44612.m43245();
        this.f68933 = c18651Mo44612.m43243();
        this.f68945 = c18651Mo44612.m43247();
        this.f68950 = c18651Mo44612.m43251();
        this.f68938 = new InterfaceC4477[]{c14416M43249, c5971M43253, c3855M43248, c3149M43244, c2775M43250, c15142M43254};
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15765 m48522(InterfaceC5245 interfaceC5245, int i) {
        return new C15765(interfaceC5245.mo3524(i), i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m48530() {
        return (this.f68954.getItemCount() * 8) + (this.f68926.m8576() * 4) + (this.f68942.getItemCount() * 32) + (this.f68923.getItemCount() * 8) + (this.f68924.getItemCount() * 8) + (this.f68928.getItemCount() * 12) + (this.f68957.getItemCount() * 4) + (this.f68948.getItemCount() * 4) + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48536() {
        for (InterfaceC4477 interfaceC4477 : this.f68938) {
            if (interfaceC4477.getItemCount() > 65536) {
                System.err.println("Number of section items overflowed: 65535: " + interfaceC4477.getClass().getSimpleName() + "[" + interfaceC4477.getItemCount() + "]");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48534(InterfaceC5245 interfaceC5245) {
        InterfaceC0305 interfaceC0305M46245 = C20062.m46245();
        C20414 c20414 = this.f68942;
        if (this.f68923.getItemCount() <= 65536) {
            if (m48536()) {
                throw new IOException("Number of section items overflowed: 65535");
            }
            C2775 c2775 = this.f68926;
            Iterator it = ((AbstractC5266) c2775.mo8571()).iterator();
            int i = -1;
            while (it.hasNext()) {
                int index = ((InterfaceC4060) ((Map.Entry) it.next()).getKey()).getIndex();
                if (index >= 0 && index < 65536 && index > i) {
                    i = index;
                }
            }
            int itemCount = (i + 1) - c2775.getItemCount();
            if (itemCount > 0) {
                c2775.m8573(itemCount);
            }
            try {
                int iM48530 = m48530();
                C15765 c15765M48522 = m48522(interfaceC5245, 0);
                C15765 c15765M48523 = m48522(interfaceC5245, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                C15765 c15765M48524 = m48522(interfaceC5245, iM48530);
                try {
                    m48515(c15765M48523, c15765M48524);
                    m48518(c15765M48523);
                    m48527(c15765M48524);
                    m48520(c15765M48523);
                    m48533(c15765M48523);
                    m48521(c15765M48523);
                    C15765 c15765M48525 = m48522(interfaceC5245, (c2775.m8576() * 4) + (c20414.getItemCount() * 32) + c15765M48523.getPosition());
                    try {
                        m48532(c15765M48525);
                        c15765M48525.close();
                        m48526(c15765M48524);
                        C15765 c15765M48526 = m48522(interfaceC5245, (c20414.getItemCount() * 32) + c15765M48523.getPosition());
                        try {
                            m48529(c15765M48526);
                            c15765M48526.close();
                            m48531(c15765M48524);
                            m48528(c15765M48524);
                            m48524(c15765M48524);
                            m48511(c15765M48524);
                            m48516(c15765M48524, interfaceC0305M46245.mo1677());
                            m48510(interfaceC5245, c15765M48523, c15765M48524);
                            m48519(c15765M48524);
                            m48512(c15765M48522, iM48530, c15765M48524.getPosition());
                            c15765M48522.close();
                            c15765M48523.close();
                            c15765M48524.close();
                            m48523(interfaceC5245);
                            Adler32 adler32 = new Adler32();
                            byte[] bArr = new byte[4096];
                            InputStream inputStreamMo3525 = interfaceC5245.mo3525(12);
                            for (int i2 = inputStreamMo3525.read(bArr); i2 >= 0; i2 = inputStreamMo3525.read(bArr)) {
                                adler32.update(bArr, 0, i2);
                            }
                            OutputStream outputStreamMo3524 = interfaceC5245.mo3524(8);
                            C15765.m37166(outputStreamMo3524, (int) adler32.getValue());
                            outputStreamMo3524.close();
                            interfaceC5245.close();
                            return;
                        } catch (Throwable th) {
                            c15765M48526.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c15765M48525.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c15765M48522.close();
                    c15765M48523.close();
                    c15765M48524.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                interfaceC5245.close();
                throw th4;
            }
        }
        throw new IOException(C4925.m14327(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48535(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo23120()) {
            C1011 c1011 = new C1011(abstractC15440);
            try {
                m48534(c1011);
                c1011.close();
            } catch (Throwable th) {
                try {
                    c1011.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".tmp");
            try {
                C1011 c1012 = new C1011(abstractC15440M36520);
                try {
                    m48534(c1012);
                    c1012.close();
                    abstractC15440M36520.m36498(abstractC15440, (Runnable) null);
                    abstractC15440M36520.mo23552();
                } catch (Throwable th3) {
                    try {
                        c1012.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                abstractC15440M36520.mo23552();
                throw th5;
            }
        }
        C16999.m39870(abstractC15440);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48523(InterfaceC5245 interfaceC5245) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[4096];
            InputStream inputStreamMo3525 = interfaceC5245.mo3525(32);
            for (int i = inputStreamMo3525.read(bArr); i >= 0; i = inputStreamMo3525.read(bArr)) {
                messageDigest.update(bArr, 0, i);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length != 20) {
                throw new RuntimeException(C3200.m9831(bArrDigest.length, " bytes", new StringBuilder("unexpected digest write: ")));
            }
            OutputStream outputStreamMo3524 = interfaceC5245.mo3524(12);
            outputStreamMo3524.write(bArrDigest);
            outputStreamMo3524.close();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48515(C15765 c15765, C15765 c15766) throws IOException {
        this.f68944 = c15765.getPosition();
        this.f68934 = c15766.getPosition();
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) this.f68948.mo8571());
        Collections.sort(arrayList, f68915);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C15765.m37166(c15765, c15766.getPosition());
            String string = ((CharSequence) entry.getKey()).toString();
            C15765.m37168(c15766, string.length());
            c15766.m37174(string);
            c15766.write(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m48518(C15765 c15765) throws IOException {
        this.f68927 = c15765.getPosition();
        C14416 c14416 = this.f68957;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c14416.mo8571());
        Collections.sort(arrayList, f68915);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C15765.m37166(c15765, this.f68948.mo8575(c14416.m34447((CharSequence) entry.getKey())));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m48520(C15765 c15765) throws IOException {
        this.f68919 = c15765.getPosition();
        C5971 c5971 = this.f68928;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c5971.mo8571());
        Collections.sort(arrayList, new C18589());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC0531 interfaceC0531 = (InterfaceC0531) entry.getKey();
            C15765.m37166(c15765, this.f68948.mo8575(c5971.m16733(interfaceC0531)));
            C15765.m37166(c15765, this.f68957.mo8575(c5971.m16732(interfaceC0531)));
            C15765.m37166(c15765, this.f68946.mo23500(c5971.m16731(interfaceC0531)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m48533(C15765 c15765) throws IOException {
        this.f68917 = c15765.getPosition();
        C3855 c3855 = this.f68924;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c3855.mo8571());
        Collections.sort(arrayList, new C18589());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC18877 interfaceC18877 = (InterfaceC18877) entry.getKey();
            C23589 c23589M11612 = c3855.m11612(interfaceC18877);
            C14416 c14416 = this.f68957;
            c15765.m37175(c14416.mo8575(c23589M11612));
            c15765.m37175(c14416.mo8575(c3855.m11613(interfaceC18877)));
            C15765.m37166(c15765, this.f68948.mo8575(c3855.m11614(interfaceC18877)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m48521(C15765 c15765) throws IOException {
        this.f68921 = c15765.getPosition();
        C3149 c3149 = this.f68923;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c3149.mo8571());
        Collections.sort(arrayList, new C18589());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC5471 interfaceC5471 = (InterfaceC5471) entry.getKey();
            c15765.m37175(this.f68957.mo8575(c3149.m9573(interfaceC5471)));
            c15765.m37175(this.f68928.mo8575(c3149.m9576(interfaceC5471)));
            C15765.m37166(c15765, this.f68948.mo8575(c3149.m9575(interfaceC5471)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48510(InterfaceC5245 interfaceC5245, C15765 c15765, C15765 c15766) throws IOException {
        this.f68930 = c15765.getPosition();
        this.f68931 = c15766.getPosition();
        C20414 c20414 = this.f68942;
        ArrayList arrayList = new ArrayList((AbstractCollection) c20414.mo8571());
        Collections.sort(arrayList, new C18589());
        Iterator it = arrayList.iterator();
        int iM48508 = 0;
        while (it.hasNext()) {
            iM48508 = m48508(c15765, c15766, iM48508, (Map.Entry) it.next());
        }
        if (mo44617()) {
            c15766.m37169();
            this.f68941 = c15766.getPosition();
            ArrayList<Map.Entry> arrayList2 = new ArrayList((AbstractCollection) c20414.mo8571());
            Collections.sort(arrayList2, new C19295());
            C8005 c8005 = new C8005(interfaceC5245, c15766, arrayList2.size());
            try {
                for (Map.Entry entry : arrayList2) {
                    Iterator it2 = c20414.m46812((Comparable) entry.getKey()).iterator();
                    while (it2.hasNext()) {
                        c8005.m21319(c20414.m46802(it2.next()));
                    }
                    Iterator it3 = c20414.m46814((Comparable) entry.getKey()).iterator();
                    while (it3.hasNext()) {
                        c8005.m21319(c20414.m46802(it3.next()));
                    }
                    Iterator<E> it4 = c20414.m46806((Comparable) entry.getKey()).iterator();
                    while (it4.hasNext()) {
                        c8005.m21319(c20414.m46810(it4.next()));
                    }
                    Iterator<E> it5 = c20414.m46797((Comparable) entry.getKey()).iterator();
                    while (it5.hasNext()) {
                        c8005.m21319(c20414.m46810(it5.next()));
                    }
                    c8005.m21320();
                }
            } finally {
                c8005.m21318();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo44617() {
        return this.f68929 && this.f68955.f24463 >= 29;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48508(C15765 c15765, C15765 c15766, int i, Map.Entry entry) throws IOException {
        if (entry == null || ((Integer) entry.getValue()).intValue() != -1) {
            return i;
        }
        Comparable comparable = (Comparable) entry.getKey();
        entry.setValue(0);
        C20414 c20414 = this.f68942;
        int iM48508 = m48508(c15765, c15766, i, c20414.m46782((CharSequence) c20414.m46787(comparable)));
        C1717 c1717M46807 = c20414.m46807(comparable);
        InterfaceC2069 interfaceC2069 = this.f68946;
        Iterator it = interfaceC2069.mo6809(c1717M46807).iterator();
        while (it.hasNext()) {
            iM48508 = m48508(c15765, c15766, iM48508, c20414.m46782((CharSequence) it.next()));
        }
        int i2 = iM48508 + 1;
        entry.setValue(Integer.valueOf(iM48508));
        C23589 c23589M46789 = c20414.m46789(comparable);
        C14416 c14416 = this.f68957;
        C15765.m37166(c15765, c14416.mo8575(c23589M46789));
        C15765.m37166(c15765, c20414.m46781(comparable));
        C15765.m37166(c15765, c14416.mo16505(c20414.m46787(comparable)));
        C15765.m37166(c15765, interfaceC2069.mo23500(c20414.m46807(comparable)));
        C15765.m37166(c15765, this.f68948.mo16505(c20414.m46795(comparable)));
        C15765.m37166(c15765, c20414.m46798(comparable));
        SortedSet sortedSetM46812 = c20414.m46812(comparable);
        SortedSet sortedSetM46814 = c20414.m46814(comparable);
        AbstractC23698 abstractC23698M46806 = c20414.m46806(comparable);
        AbstractC23698 abstractC23698M46797 = c20414.m46797(comparable);
        boolean z = sortedSetM46812.size() > 0 || sortedSetM46814.size() > 0 || abstractC23698M46806.size() > 0 || abstractC23698M46797.size() > 0;
        if (z) {
            C15765.m37166(c15765, c15766.getPosition());
        } else {
            C15765.m37166(c15765, 0);
        }
        C12652 c12652M46803 = c20414.m46803(comparable);
        if (c12652M46803 != null) {
            C15765.m37166(c15765, this.f68950.mo10659(c12652M46803));
        } else {
            C15765.m37166(c15765, 0);
        }
        if (z) {
            this.f68932++;
            C15765.m37168(c15766, sortedSetM46812.size());
            C15765.m37168(c15766, sortedSetM46814.size());
            C15765.m37168(c15766, abstractC23698M46806.size());
            C15765.m37168(c15766, abstractC23698M46797.size());
            m48514(c15766, sortedSetM46812);
            m48514(c15766, sortedSetM46814);
            m48517(c15766, abstractC23698M46806);
            m48517(c15766, abstractC23698M46797);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m48529(C15765 c15765) throws IOException {
        C3480 c3480;
        this.f68952 = c15765.getPosition();
        C19720 c19720 = new C19720();
        ArrayList arrayList = new ArrayList();
        C2775 c2775 = this.f68926;
        int i = -1;
        for (Map.Entry entry : (AbstractC5266) c2775.mo8571()) {
            int index = ((InterfaceC4060) entry.getKey()).getIndex();
            if (index < 0 || index >= 65536 || c19720.mo2422(index)) {
                arrayList.add(entry);
            } else {
                c19720.mo2318(index, entry);
                if (index > i) {
                    i = index;
                }
            }
        }
        Collections.sort(arrayList, this.f68956);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            c3480 = this.f68950;
            if (i2 > i) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) c19720.get(i2);
            if (entry2 == null && it.hasNext()) {
                entry2 = (Map.Entry) it.next();
            }
            if (entry2 != null) {
                entry2.setValue(Integer.valueOf(i2));
                C15765.m37166(c15765, c3480.mo10659(c2775.m8572((InterfaceC4060) entry2.getKey())));
            } else {
                C15765.m37166(c15765, -1);
            }
            i2++;
        }
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            i++;
            entry3.setValue(Integer.valueOf(i));
            C15765.m37166(c15765, c3480.mo10659(c2775.m8572((InterfaceC4060) entry3.getKey())));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48532(C15765 c15765) throws IOException {
        int iMo8575;
        this.f68951 = c15765.getPosition();
        C15142 c15142 = this.f68954;
        int i = 0;
        for (Map.Entry entry : (AbstractC5266) c15142.mo8571()) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC19583 interfaceC19583 = (InterfaceC19583) entry.getKey();
            c15765.m37175(interfaceC19583.mo2849());
            c15765.m37175(0);
            switch (interfaceC19583.mo2849()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    iMo8575 = this.f68924.mo8575(c15142.m35846(interfaceC19583));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    iMo8575 = this.f68923.mo8575(c15142.m35847(interfaceC19583));
                    break;
                default:
                    throw new C15431(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC19583.mo2849()));
            }
            c15765.m37175(iMo8575);
            c15765.m37175(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48514(C15765 c15765, SortedSet sortedSet) throws IOException {
        int i = 0;
        for (Object obj : sortedSet) {
            int iM11616 = this.f68924.m11616(obj);
            C20414 c20414 = this.f68942;
            if (!c20414.m46802(obj).isEmpty()) {
                this.f68929 = true;
            }
            C15765.m37168(c15765, iM11616 - i);
            C15765.m37168(c15765, c20414.m46796(obj));
            i = iM11616;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48517(C15765 c15765, AbstractC23698 abstractC23698) throws IOException {
        int i = 0;
        for (Object obj : abstractC23698) {
            int iM9579 = this.f68923.m9579(obj);
            C20414 c20414 = this.f68942;
            if (!c20414.m46810(obj).isEmpty()) {
                this.f68929 = true;
            }
            C15765.m37168(c15765, iM9579 - i);
            C15765.m37168(c15765, c20414.m46788(obj));
            C15765.m37168(c15765, c20414.m46791(obj));
            i = iM9579;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m48527(C15765 c15765) throws IOException {
        c15765.m37169();
        this.f68940 = c15765.getPosition();
        InterfaceC2069 interfaceC2069 = this.f68946;
        for (Map.Entry entry : (AbstractC5266) interfaceC2069.mo10657()) {
            c15765.m37169();
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            List listMo6809 = interfaceC2069.mo6809(entry.getKey());
            C15765.m37166(c15765, listMo6809.size());
            Iterator it = listMo6809.iterator();
            while (it.hasNext()) {
                c15765.m37175(this.f68957.mo8575((CharSequence) it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m48526(C15765 c15765) throws IOException {
        C0949 c0949 = new C0949(this, c15765);
        this.f68916 = c15765.getPosition();
        C3480 c3480 = this.f68950;
        for (Map.Entry entry : (AbstractC5266) c3480.mo10657()) {
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            List listM10660 = c3480.m10660(entry.getKey());
            C15765.m37168(c15765, listM10660.size());
            Iterator it = listM10660.iterator();
            while (it.hasNext()) {
                mo44614(c0949, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48531(C15765 c15765) throws IOException {
        C0949 c0949 = new C0949(this, c15765);
        this.f68943 = c15765.getPosition();
        InterfaceC23527 interfaceC23527 = this.f68933;
        for (Map.Entry entry : (AbstractC5266) interfaceC23527.mo10657()) {
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            InterfaceC20561 interfaceC20561 = (InterfaceC20561) entry.getKey();
            c15765.m37172(interfaceC23527.mo51993(interfaceC20561));
            C15765.m37168(c15765, this.f68957.mo8575(interfaceC23527.mo51992(interfaceC20561)));
            AbstractC14545 abstractC14545M34731 = AbstractC14545.m34731(AbstractC10232.m25862(AbstractC14534.f44527), interfaceC23527.mo51995(interfaceC20561));
            C15765.m37168(c15765, abstractC14545M34731.size());
            AbstractC4628 abstractC4628ListIterator = abstractC14545M34731.listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                InterfaceC9272 interfaceC9272 = (InterfaceC9272) abstractC4628ListIterator.next();
                C15765.m37168(c15765, this.f68948.mo8575(interfaceC23527.mo51994(interfaceC9272)));
                mo44614(c0949, interfaceC23527.mo51991(interfaceC9272));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48528(C15765 c15765) throws IOException {
        c15765.m37169();
        this.f68939 = c15765.getPosition();
        if (this.f68955.f24463 < 17) {
            C15765.m37166(c15765, 0);
        }
        InterfaceC6594 interfaceC6594 = this.f68945;
        for (Map.Entry entry : (AbstractC5266) interfaceC6594.mo10657()) {
            AbstractC14545 abstractC14545M34731 = AbstractC14545.m34731(AbstractC10232.m25862(AbstractC18063.f56276), interfaceC6594.mo18100(entry.getKey()));
            c15765.m37169();
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            C15765.m37166(c15765, abstractC14545M34731.size());
            AbstractC4628 abstractC4628ListIterator = abstractC14545M34731.listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                C15765.m37166(c15765, this.f68933.mo10659(abstractC4628ListIterator.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48524(C15765 c15765) throws IOException {
        int iMo10659;
        c15765.m37169();
        this.f68947 = c15765.getPosition();
        HashMap map = new HashMap();
        C20414 c20414 = this.f68942;
        AbstractC4628 abstractC4628ListIterator = c20414.m46808().listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            for (Object obj : c20414.m46792((Comparable) abstractC4628ListIterator.next())) {
                List listM46779 = c20414.m46779(obj);
                if (listM46779 != null) {
                    Integer num = (Integer) map.get(listM46779);
                    if (num != null) {
                        c20414.m46784(num.intValue(), obj);
                    } else {
                        c15765.m37169();
                        int position = c15765.getPosition();
                        c20414.m46784(position, obj);
                        map.put(listM46779, Integer.valueOf(position));
                        this.f68936++;
                        C15765.m37166(c15765, listM46779.size());
                        for (Object obj2 : listM46779) {
                            InterfaceC6594 interfaceC6594 = this.f68945;
                            if (interfaceC6594.mo18100(obj2).size() > 0) {
                                iMo10659 = interfaceC6594.mo10659(obj2);
                            } else if (this.f68955.f24463 >= 17) {
                                C15765.m37166(c15765, 0);
                            } else {
                                iMo10659 = this.f68939;
                            }
                            C15765.m37166(c15765, iMo10659);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48511(C15765 c15765) throws IOException {
        InterfaceC6594 interfaceC6594;
        C3149 c3149;
        c15765.m37169();
        this.f68918 = c15765.getPosition();
        HashMap map = new HashMap();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(65536);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        C20414 c20414 = this.f68942;
        AbstractC4628 abstractC4628ListIterator = c20414.m46808().listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC4628ListIterator.next();
            Collection collectionM46800 = c20414.m46800(comparable);
            Collection collectionM46792 = c20414.m46792(comparable);
            int size = (collectionM46792.size() * 16) + (collectionM46800.size() * 8);
            if (size > byteBufferAllocate.capacity()) {
                byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            }
            byteBufferAllocate.clear();
            Iterator it = collectionM46800.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC6594 = this.f68945;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                C7008 c7008M46794 = c20414.m46794(next);
                if (c7008M46794 != null) {
                    i++;
                    byteBufferAllocate.putInt(this.f68924.m11616(next));
                    byteBufferAllocate.putInt(interfaceC6594.mo10659(c7008M46794));
                }
            }
            Iterator it2 = collectionM46792.iterator();
            int i2 = 0;
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                c3149 = this.f68923;
                if (!zHasNext2) {
                    break;
                }
                Object next2 = it2.next();
                C7008 c7008M46809 = c20414.m46809(next2);
                if (c7008M46809 != null) {
                    i2++;
                    byteBufferAllocate.putInt(c3149.m9579(next2));
                    byteBufferAllocate.putInt(interfaceC6594.mo10659(c7008M46809));
                }
            }
            int i3 = 0;
            for (Object obj : collectionM46792) {
                int iM46813 = c20414.m46813(obj);
                if (iM46813 != 0) {
                    i3++;
                    byteBufferAllocate.putInt(c3149.m9579(obj));
                    byteBufferAllocate.putInt(iM46813);
                }
            }
            C7008 c7008M46804 = c20414.m46804(comparable);
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (c7008M46804 != null) {
                    Integer num = (Integer) map.get(c7008M46804);
                    if (num != null) {
                        c20414.m46783(num.intValue(), comparable);
                    } else {
                        map.put(c7008M46804, Integer.valueOf(c15765.getPosition()));
                    }
                }
            }
            this.f68937++;
            c20414.m46783(c15765.getPosition(), comparable);
            C15765.m37166(c15765, interfaceC6594.mo23500(c7008M46804));
            C15765.m37166(c15765, i);
            C15765.m37166(c15765, i2);
            C15765.m37166(c15765, i3);
            c15765.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:89:0x025a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0267  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01bf, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48516(C15765 c15765, C20062 c20062) throws IOException {
        AbstractC4628 abstractC4628;
        List listMo3811;
        Iterable iterableMo3817;
        int position;
        int lineNumber;
        ArrayList arrayList;
        Iterable iterable;
        List list;
        byte[] byteArray;
        C9417 c9417;
        HashMap map;
        int iIntValue;
        InterfaceC15347 interfaceC15347Mo8923;
        C7382 c7382;
        InterfaceC21699 interfaceC21699Mo8921;
        C23589 c23589;
        InterfaceC15347 interfaceC15347Mo8922;
        C7382 c7383;
        ArrayList arrayList2;
        AbstractC4628 abstractC4629;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f68949 = c15765.getPosition();
        C15765 c15766 = new C15765(c20062, 0);
        ArrayList<C5183> arrayList3 = new ArrayList();
        C20414 c20414 = this.f68942;
        AbstractC4628 abstractC4628ListIterator = c20414.m46808().listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC4628ListIterator.next();
            Iterator it = C8882.m22948(c20414.m46806(comparable), c20414.m46797(comparable)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List listM46793 = c20414.m46793(next);
                Iterable iterableM46786 = c20414.m46786(next);
                Iterable<InterfaceC7860> iterableM46811 = c20414.m46811(next);
                InterfaceC7299 interfaceC7299 = this.f68948;
                if (iterableM46786 == null || !interfaceC7299.mo19581()) {
                    abstractC4628 = abstractC4628ListIterator;
                    listMo3811 = listM46793;
                    iterableMo3817 = iterableM46786;
                } else {
                    Iterator it2 = iterableM46786.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it2.next();
                            List list2 = listM46793;
                            Iterable iterable2 = iterableM46786;
                            if (interfaceC22677.mo3975() != EnumC0841.f3137 || interfaceC7299.mo19580((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()) < 65536) {
                                listM46793 = list2;
                                iterableM46786 = iterable2;
                                abstractC4628ListIterator = abstractC4628ListIterator;
                            } else {
                                C1109 c1109M46801 = c20414.m46801(next);
                                List listMo3817 = c1109M46801.mo3817();
                                int i = 0;
                                while (i < listMo3817.size()) {
                                    InterfaceC22677 interfaceC22678 = (InterfaceC22677) listMo3817.get(i);
                                    List list3 = listMo3817;
                                    if (interfaceC22678.mo3975() == EnumC0841.f3137) {
                                        InterfaceC10952 interfaceC10952 = (InterfaceC10952) interfaceC22678;
                                        abstractC4629 = abstractC4628ListIterator;
                                        if (interfaceC7299.mo19580((InterfaceC15347) interfaceC10952.getReference()) >= 65536) {
                                            c1109M46801.m3814(i, new C18688(EnumC0841.f3220, ((InterfaceC1779) interfaceC22678).mo1790(), interfaceC10952.getReference()));
                                        }
                                    } else {
                                        abstractC4629 = abstractC4628ListIterator;
                                    }
                                    i++;
                                    listMo3817 = list3;
                                    abstractC4628ListIterator = abstractC4629;
                                }
                                abstractC4628 = abstractC4628ListIterator;
                                iterableMo3817 = c1109M46801.mo3817();
                                listMo3811 = c1109M46801.mo3811();
                                iterableM46811 = c1109M46801.mo3812();
                            }
                        } else {
                            abstractC4628 = abstractC4628ListIterator;
                            listMo3811 = listM46793;
                            iterableMo3817 = iterableM46786;
                        }
                    }
                }
                Iterable iterableM46790 = c20414.m46790(next);
                int iM22959 = C8882.m22959(iterableM46790);
                Iterator it3 = iterableM46790.iterator();
                int i2 = 0;
                Iterator it4 = it;
                int i3 = -1;
                while (it3.hasNext()) {
                    if (((CharSequence) it3.next()) != null) {
                        i3 = i2;
                    }
                    i2++;
                }
                if (i3 == -1 && (iterableM46811 == null || C8882.m22957(iterableM46811))) {
                    list = listMo3811;
                    iterable = iterableMo3817;
                    arrayList = arrayList3;
                    position = 0;
                } else {
                    position = c15765.getPosition();
                    if (iterableM46811 != null) {
                        Iterator it5 = iterableM46811.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Iterator it6 = it5;
                                InterfaceC7860 interfaceC7860 = (InterfaceC7860) it5.next();
                                if (interfaceC7860 instanceof InterfaceC21267) {
                                    lineNumber = ((InterfaceC21267) interfaceC7860).getLineNumber();
                                } else {
                                    it5 = it6;
                                }
                            } else {
                                lineNumber = 0;
                            }
                        }
                    } else {
                        lineNumber = 0;
                    }
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    arrayList = arrayList3;
                    iterable = iterableMo3817;
                    list = listMo3811;
                    C15765 c15767 = new C15765(byteArrayOutputStream2, 0, 64);
                    C8711 c8711 = new C8711(interfaceC7299, this.f68957, c15767);
                    C15765.m37168(c15767, lineNumber);
                    C15765.m37168(c15767, iM22959);
                    Iterator it7 = iterableM46790.iterator();
                    int i4 = 0;
                    while (it7.hasNext()) {
                        Iterator it8 = it7;
                        CharSequence charSequence = (CharSequence) it7.next();
                        if (i4 != iM22959) {
                            i4++;
                            C15765.m37168(c15767, interfaceC7299.mo16505(charSequence) + 1);
                            it7 = it8;
                        } else {
                            if (iterableM46811 != null) {
                                c8711.m22502(lineNumber);
                                for (InterfaceC7860 interfaceC7861 : iterableM46811) {
                                    c20414.getClass();
                                    switch (interfaceC7861.mo8424()) {
                                        case 3:
                                            InterfaceC2922 interfaceC2922 = (InterfaceC2922) interfaceC7861;
                                            int iMo14974 = interfaceC2922.mo14974();
                                            int iMo8920 = interfaceC2922.mo8920();
                                            interfaceC15347Mo8923 = interfaceC2922.mo8923();
                                            if (interfaceC15347Mo8923 == null) {
                                                c7382 = null;
                                            } else {
                                                try {
                                                    c7382 = (C7382) interfaceC15347Mo8923;
                                                } catch (ClassCastException unused) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            interfaceC21699Mo8921 = interfaceC2922.mo8921();
                                            if (interfaceC21699Mo8921 == null) {
                                                c23589 = null;
                                            } else {
                                                try {
                                                    c23589 = (C23589) interfaceC21699Mo8921;
                                                } catch (ClassCastException unused2) {
                                                    throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                                                }
                                            }
                                            interfaceC15347Mo8922 = interfaceC2922.mo8922();
                                            if (interfaceC15347Mo8922 == null) {
                                                c7383 = null;
                                            } else {
                                                try {
                                                    c7383 = (C7382) interfaceC15347Mo8922;
                                                } catch (ClassCastException unused3) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c8711.m22504(iMo14974, iMo8920, c7382, c23589, c7383);
                                            break;
                                        case 4:
                                        default:
                                            throw new C15431(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC7861.mo8424()));
                                        case 5:
                                            InterfaceC14915 interfaceC14915 = (InterfaceC14915) interfaceC7861;
                                            c8711.m22503(interfaceC14915.mo14974(), interfaceC14915.mo23290());
                                            break;
                                        case 6:
                                            InterfaceC19856 interfaceC19856 = (InterfaceC19856) interfaceC7861;
                                            c8711.m22509(interfaceC19856.mo14974(), interfaceC19856.mo12317());
                                            break;
                                        case 7:
                                            c8711.m22508(interfaceC7861.mo14974());
                                            break;
                                        case 8:
                                            c8711.m22506(interfaceC7861.mo14974());
                                            break;
                                        case 9:
                                            InterfaceC4333 interfaceC4333 = (InterfaceC4333) interfaceC7861;
                                            int iMo14975 = interfaceC4333.mo14974();
                                            InterfaceC15347 interfaceC15347Mo9897 = interfaceC4333.mo9897();
                                            if (interfaceC15347Mo9897 != null) {
                                                try {
                                                } catch (ClassCastException unused4) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c8711.m22505(iMo14975, interfaceC15347Mo9897 != null ? (C7382) interfaceC15347Mo9897 : null);
                                            break;
                                        case 10:
                                            InterfaceC21267 interfaceC21267 = (InterfaceC21267) interfaceC7861;
                                            c8711.m22507(interfaceC21267.mo14974(), interfaceC21267.getLineNumber());
                                            break;
                                    }
                                }
                            }
                            c15767.write(0);
                            c15767.flush();
                            byteArray = byteArrayOutputStream2.toByteArray();
                            c9417 = new C9417(byteArray);
                            map = this.f68922;
                            iIntValue = ((Integer) C13843.getOrDefault(map, c9417, -1)).intValue();
                            if (iIntValue >= 0) {
                                position = iIntValue;
                            } else {
                                c15765.write(byteArray);
                                map.put(c9417, Integer.valueOf(position));
                                this.f68935++;
                            }
                        }
                    }
                    if (iterableM46811 != null) {
                        c8711.m22502(lineNumber);
                        while (r1.hasNext()) {
                            c20414.getClass();
                            switch (interfaceC7861.mo8424()) {
                                case 3:
                                    InterfaceC2922 interfaceC2923 = (InterfaceC2922) interfaceC7861;
                                    int iMo14976 = interfaceC2923.mo14974();
                                    int iMo8921 = interfaceC2923.mo8920();
                                    interfaceC15347Mo8923 = interfaceC2923.mo8923();
                                    if (interfaceC15347Mo8923 == null) {
                                        c7382 = null;
                                    } else {
                                        c7382 = (C7382) interfaceC15347Mo8923;
                                    }
                                    interfaceC21699Mo8921 = interfaceC2923.mo8921();
                                    if (interfaceC21699Mo8921 == null) {
                                        c23589 = null;
                                    } else {
                                        c23589 = (C23589) interfaceC21699Mo8921;
                                    }
                                    interfaceC15347Mo8922 = interfaceC2923.mo8922();
                                    if (interfaceC15347Mo8922 == null) {
                                        c7383 = null;
                                    } else {
                                        c7383 = (C7382) interfaceC15347Mo8922;
                                    }
                                    c8711.m22504(iMo14976, iMo8921, c7382, c23589, c7383);
                                    break;
                                case 4:
                                default:
                                    throw new C15431(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC7861.mo8424()));
                                case 5:
                                    InterfaceC14915 interfaceC14916 = (InterfaceC14915) interfaceC7861;
                                    c8711.m22503(interfaceC14916.mo14974(), interfaceC14916.mo23290());
                                    break;
                                case 6:
                                    InterfaceC19856 interfaceC19857 = (InterfaceC19856) interfaceC7861;
                                    c8711.m22509(interfaceC19857.mo14974(), interfaceC19857.mo12317());
                                    break;
                                case 7:
                                    c8711.m22508(interfaceC7861.mo14974());
                                    break;
                                case 8:
                                    c8711.m22506(interfaceC7861.mo14974());
                                    break;
                                case 9:
                                    InterfaceC4333 interfaceC4334 = (InterfaceC4333) interfaceC7861;
                                    int iMo14977 = interfaceC4334.mo14974();
                                    InterfaceC15347 interfaceC15347Mo9898 = interfaceC4334.mo9897();
                                    c8711.m22505(iMo14977, interfaceC15347Mo9898 != null ? (C7382) interfaceC15347Mo9898 : null);
                                    break;
                                case 10:
                                    InterfaceC21267 interfaceC21268 = (InterfaceC21267) interfaceC7861;
                                    c8711.m22507(interfaceC21268.mo14974(), interfaceC21268.getLineNumber());
                                    break;
                            }
                        }
                    }
                    c15767.write(0);
                    c15767.flush();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    c9417 = new C9417(byteArray);
                    map = this.f68922;
                    iIntValue = ((Integer) C13843.getOrDefault(map, c9417, -1)).intValue();
                    if (iIntValue >= 0) {
                        position = iIntValue;
                    } else {
                        c15765.write(byteArray);
                        map.put(c9417, Integer.valueOf(position));
                        this.f68935++;
                    }
                }
                try {
                    int iM48507 = m48507(c15766, byteArrayOutputStream, next, list, iterable, position);
                    if (iM48507 != -1) {
                        C5183 c5183 = new C5183();
                        c5183.f16253 = iM48507;
                        c5183.f16254 = next;
                        arrayList2 = arrayList;
                        arrayList2.add(c5183);
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayList3 = arrayList2;
                    abstractC4628ListIterator = abstractC4628;
                    it = it4;
                } catch (RuntimeException e) {
                    throw new C15431(e, "Exception occurred while writing code_item for method %s", this.f68923.m9574(next));
                }
            }
        }
        c15765.m37169();
        this.f68920 = c15765.getPosition();
        c15766.close();
        c20062.m46246(c15765);
        c20062.close();
        for (C5183 c5184 : arrayList3) {
            c20414.m46799(this.f68920 + c5184.f16253, c5184.f16254);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48507(C15765 c15765, ByteArrayOutputStream byteArrayOutputStream, Object obj, List list, Iterable iterable, int i) throws IOException {
        C23589 c23589;
        Iterator it;
        int iMo3615;
        if (iterable == null && i == 0) {
            return -1;
        }
        this.f68925++;
        c15765.m37169();
        int position = c15765.getPosition();
        C20414 c20414 = this.f68942;
        int iM46780 = c20414.m46780(obj);
        c15765.m37175(iM46780);
        boolean zM36866 = EnumC15657.STATIC.m36866(c20414.m46788(obj));
        C3149 c3149 = this.f68923;
        C13026 c13026M9578 = c3149.m9578(obj);
        C5971 c5971 = this.f68928;
        int iM40411 = C17177.m40411(this.f68946.mo6809(c5971.m16731(c13026M9578)), zM36866);
        int i2 = 3;
        if (iM40411 > iM46780) {
            throw new RuntimeException(String.format("ins_size (%dd) > registers_size (%dd): %s", Integer.valueOf(iM40411), Integer.valueOf(iM46780), obj.toString()));
        }
        c15765.m37175(iM40411);
        if (iterable == null) {
            c15765.m37175(0);
            c15765.m37175(0);
            C15765.m37166(c15765, i);
            C15765.m37166(c15765, 0);
            return position;
        }
        ArrayList<InterfaceC5038> arrayListM42257 = C18150.m42257(list);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        int iMo3974 = 0;
        while (it2.hasNext()) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it2.next();
            iMo3974 = interfaceC22677.mo3974() + iMo3974;
            int i4 = interfaceC22677.mo3975().f3318;
            if (i4 != i2) {
                iMo3615 = i4 != 5 ? 0 : ((InterfaceC6718) interfaceC22677).mo3615();
                it = it2;
            } else {
                InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference();
                EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
                it = it2;
                iMo3615 = (enumC0841Mo3975 == EnumC0841.f3044 || enumC0841Mo3975 == EnumC0841.f3100) ? ((InterfaceC6718) interfaceC22677).mo3615() : C17177.m40411(interfaceC5471.mo3565(), enumC0841Mo3975 == EnumC0841.f3052 || enumC0841Mo3975 == EnumC0841.f3133);
            }
            if (iMo3615 > i3) {
                i3 = iMo3615;
            }
            i2 = 3;
            it2 = it;
        }
        if (i3 > 5 && i3 > iM46780) {
            throw new RuntimeException(String.format("outs_size (%dd) > registers_size (%dd): %s", Integer.valueOf(i3), Integer.valueOf(iM46780), obj.toString()));
        }
        c15765.m37175(i3);
        c15765.m37175(arrayListM42257.size());
        C15765.m37166(c15765, i);
        C7897 c7897 = this.f68955;
        InterfaceC7299 interfaceC7299 = this.f68948;
        C14416 c14416 = this.f68957;
        C12943 c12943 = new C12943(c7897, c15765, interfaceC7299, c14416, this.f68924, c3149, c5971, this.f68954, this.f68926);
        C15765.m37166(c15765, iMo3974);
        Iterator it3 = iterable.iterator();
        int iMo3975 = 0;
        while (it3.hasNext()) {
            InterfaceC22677 interfaceC22678 = (InterfaceC22677) it3.next();
            try {
                switch (C0243.f1520[interfaceC22678.mo3975().f3316.ordinal()]) {
                    case 1:
                        c12943.m31470((InterfaceC15889) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 2:
                        c12943.m31450((InterfaceC2485) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 3:
                        c12943.m31452((InterfaceC3896) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 4:
                        c12943.m31475((InterfaceC18713) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 5:
                        c12943.m31476((InterfaceC19419) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 6:
                        c12943.m31447((InterfaceC0367) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 7:
                        c12943.m31454((InterfaceC5307) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 8:
                        c12943.m31448((InterfaceC1073) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 9:
                        c12943.m31458((InterfaceC8129) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 10:
                        c12943.m31469((InterfaceC15183) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 11:
                        c12943.m31479((InterfaceC21535) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 12:
                        c12943.m31480((InterfaceC22240) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 13:
                        c12943.m31477((InterfaceC20124) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 14:
                        c12943.m31453((InterfaceC4601) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 15:
                        c12943.m31451((InterfaceC3190) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 16:
                        c12943.m31466((InterfaceC13067) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 17:
                        c12943.m31465((InterfaceC12362) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 18:
                        c12943.m31462((InterfaceC10246) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 19:
                        c12943.m31455((InterfaceC6012) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 20:
                        c12943.m31464((InterfaceC11657) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 21:
                        c12943.m31481((InterfaceC22945) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 22:
                        c12943.m31467((InterfaceC13772) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 23:
                        c12943.m31457((InterfaceC7423) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 24:
                        c12943.m31449((InterfaceC1943) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 25:
                        c12943.m31463((InterfaceC11116) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 26:
                        c12943.m31472((InterfaceC16759) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 27:
                        c12943.m31474((InterfaceC18171) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 28:
                        c12943.m31473((InterfaceC17465) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 29:
                        c12943.m31468((InterfaceC14642) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 30:
                        c12943.m31482((InterfaceC23815) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 31:
                        c12943.m31456((InterfaceC6882) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 32:
                        c12943.m31478((InterfaceC20994) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 33:
                        c12943.m31461((InterfaceC9705) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 34:
                        c12943.m31459((InterfaceC8835) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 35:
                        c12943.m31460((InterfaceC8999) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    case 36:
                        c12943.m31471((InterfaceC16053) interfaceC22678);
                        continue;
                        iMo3975 += interfaceC22678.mo3974();
                        break;
                    default:
                        throw new C15431(null, "Unsupported instruction format: %s", interfaceC22678.mo3975().f3316);
                }
            } catch (RuntimeException e) {
                throw new C15431(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo3975));
            }
            throw new C15431(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo3975));
        }
        if (arrayListM42257.size() > 0) {
            c15765.m37169();
            HashMap map = new HashMap();
            Iterator it4 = arrayListM42257.iterator();
            while (it4.hasNext()) {
                map.put(((InterfaceC5038) it4.next()).mo14556(), 0);
            }
            C15765.m37168(byteArrayOutputStream, map.size());
            for (InterfaceC5038 interfaceC5038 : arrayListM42257) {
                int iMo14555 = interfaceC5038.mo14555();
                int iMo14557 = (interfaceC5038.mo14557() + iMo14555) - iMo14555;
                C15765.m37166(c15765, iMo14555);
                c15765.m37175(iMo14557);
                if (interfaceC5038.mo14556().size() == 0) {
                    throw new C15431(null, "No exception handlers for the try block!", new Object[0]);
                }
                Integer num = (Integer) map.get(interfaceC5038.mo14556());
                if (num.intValue() != 0) {
                    c15765.m37175(num.intValue());
                } else {
                    int size = byteArrayOutputStream.size();
                    Integer numValueOf = Integer.valueOf(size);
                    c15765.m37175(size);
                    map.put(interfaceC5038.mo14556(), numValueOf);
                    int size2 = interfaceC5038.mo14556().size();
                    if (((InterfaceC2216) interfaceC5038.mo14556().get(size2 - 1)).mo7393() == null) {
                        size2 = (size2 * (-1)) + 1;
                    }
                    C15765.m37167(byteArrayOutputStream, size2);
                    for (InterfaceC2216 interfaceC2216 : interfaceC5038.mo14556()) {
                        c20414.getClass();
                        InterfaceC21699 interfaceC21699Mo7392 = interfaceC2216.mo7392();
                        if (interfaceC21699Mo7392 == null) {
                            c23589 = null;
                        } else {
                            try {
                                c23589 = (C23589) interfaceC21699Mo7392;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                            }
                        }
                        int iMo7391 = interfaceC2216.mo7391();
                        if (c23589 != null) {
                            C15765.m37168(byteArrayOutputStream, c14416.mo8575(c23589));
                            C15765.m37168(byteArrayOutputStream, iMo7391);
                        } else {
                            C15765.m37168(byteArrayOutputStream, iMo7391);
                        }
                    }
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.writeTo(c15765);
                byteArrayOutputStream.reset();
            }
        }
        return position;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0215  */
    /* JADX WARN: Code duplicated, block: B:68:0x021f  */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m48519(C15765 c15765) throws IOException {
        C7897 c7897;
        C20414 c20414;
        int i;
        int i2;
        c15765.m37169();
        this.f68953 = c15765.getPosition();
        InterfaceC7299 interfaceC7299 = this.f68948;
        int i3 = ((AbstractC5266) interfaceC7299.mo8571()).size() > 0 ? 3 : 1;
        C14416 c14416 = this.f68957;
        if (((AbstractC5266) c14416.mo8571()).size() > 0) {
            i3++;
        }
        C5971 c5971 = this.f68928;
        if (((AbstractC5266) c5971.mo8571()).size() > 0) {
            i3++;
        }
        C3855 c3855 = this.f68924;
        if (((AbstractC5266) c3855.mo8571()).size() > 0) {
            i3++;
        }
        C3149 c3149 = this.f68923;
        if (((AbstractC5266) c3149.mo8571()).size() > 0) {
            i3++;
        }
        C2775 c2775 = this.f68926;
        if (c2775.m8576() > 0) {
            i3++;
        }
        C15142 c15142 = this.f68954;
        if (((AbstractC5266) c15142.mo8571()).size() > 0) {
            i3++;
        }
        InterfaceC2069 interfaceC2069 = this.f68946;
        if (((AbstractC5266) interfaceC2069.mo10657()).size() > 0) {
            i3++;
        }
        C3480 c3480 = this.f68950;
        if (((AbstractC5266) c3480.mo10657()).size() > 0) {
            i3++;
        }
        InterfaceC23527 interfaceC23527 = this.f68933;
        if (((AbstractC5266) interfaceC23527.mo10657()).size() > 0) {
            i3++;
        }
        InterfaceC6594 interfaceC6594 = this.f68945;
        int size = ((AbstractC5266) interfaceC6594.mo10657()).size();
        C7897 c7898 = this.f68955;
        if (size <= 0) {
            c7897 = c7898;
            if (c7898.f24463 < 17) {
            }
            if (this.f68936 > 0) {
                i3++;
            }
            if (this.f68937 > 0) {
                i3++;
            }
            if (this.f68935 > 0) {
                i3++;
            }
            if (this.f68925 > 0) {
                i3++;
            }
            c20414 = this.f68942;
            if (((AbstractC5266) c20414.mo8571()).size() > 0) {
                i3++;
            }
            if (this.f68932 > 0) {
                i3++;
            }
            if (mo44617()) {
                i3++;
            }
            C15765.m37166(c15765, i3 + 1);
            m48513(c15765, 0, 1, 0);
            m48513(c15765, 1, ((AbstractC5266) interfaceC7299.mo8571()).size(), this.f68944);
            m48513(c15765, 2, ((AbstractC5266) c14416.mo8571()).size(), this.f68927);
            m48513(c15765, 3, ((AbstractC5266) c5971.mo8571()).size(), this.f68919);
            m48513(c15765, 4, ((AbstractC5266) c3855.mo8571()).size(), this.f68917);
            m48513(c15765, 5, ((AbstractC5266) c3149.mo8571()).size(), this.f68921);
            m48513(c15765, 6, ((AbstractC5266) c20414.mo8571()).size(), this.f68930);
            m48513(c15765, 7, c2775.m8576(), this.f68952);
            m48513(c15765, 8, ((AbstractC5266) c15142.mo8571()).size(), this.f68951);
            m48513(c15765, o.a.r, ((AbstractC5266) interfaceC7299.mo8571()).size(), this.f68934);
            m48513(c15765, o.a.a, ((AbstractC5266) interfaceC2069.mo10657()).size(), this.f68940);
            m48513(c15765, o.a.u, ((AbstractC5266) c3480.mo10657()).size(), this.f68916);
            m48513(c15765, o.a.t, ((AbstractC5266) interfaceC23527.mo10657()).size(), this.f68943);
            int size2 = ((AbstractC5266) interfaceC6594.mo10657()).size();
            if (c7897.f24463 < 17) {
                i = 1;
            } else {
                i = 0;
            }
            m48513(c15765, o.a.c, size2 + i, this.f68939);
            m48513(c15765, o.a.b, this.f68936, this.f68947);
            m48513(c15765, 8198, this.f68937, this.f68918);
            m48513(c15765, o.a.s, this.f68935, this.f68949);
            m48513(c15765, o.a.q, this.f68925, this.f68920);
            m48513(c15765, 8192, this.f68932, this.f68931);
            if (mo44617()) {
                i2 = 1;
                m48513(c15765, 61440, 1, this.f68941);
            } else {
                i2 = 1;
            }
            m48513(c15765, 4096, i2, this.f68953);
        }
        c7897 = c7898;
        i3++;
        if (this.f68936 > 0) {
            i3++;
        }
        if (this.f68937 > 0) {
            i3++;
        }
        if (this.f68935 > 0) {
            i3++;
        }
        if (this.f68925 > 0) {
            i3++;
        }
        c20414 = this.f68942;
        if (((AbstractC5266) c20414.mo8571()).size() > 0) {
            i3++;
        }
        if (this.f68932 > 0) {
            i3++;
        }
        if (mo44617()) {
            i3++;
        }
        C15765.m37166(c15765, i3 + 1);
        m48513(c15765, 0, 1, 0);
        m48513(c15765, 1, ((AbstractC5266) interfaceC7299.mo8571()).size(), this.f68944);
        m48513(c15765, 2, ((AbstractC5266) c14416.mo8571()).size(), this.f68927);
        m48513(c15765, 3, ((AbstractC5266) c5971.mo8571()).size(), this.f68919);
        m48513(c15765, 4, ((AbstractC5266) c3855.mo8571()).size(), this.f68917);
        m48513(c15765, 5, ((AbstractC5266) c3149.mo8571()).size(), this.f68921);
        m48513(c15765, 6, ((AbstractC5266) c20414.mo8571()).size(), this.f68930);
        m48513(c15765, 7, c2775.m8576(), this.f68952);
        m48513(c15765, 8, ((AbstractC5266) c15142.mo8571()).size(), this.f68951);
        m48513(c15765, o.a.r, ((AbstractC5266) interfaceC7299.mo8571()).size(), this.f68934);
        m48513(c15765, o.a.a, ((AbstractC5266) interfaceC2069.mo10657()).size(), this.f68940);
        m48513(c15765, o.a.u, ((AbstractC5266) c3480.mo10657()).size(), this.f68916);
        m48513(c15765, o.a.t, ((AbstractC5266) interfaceC23527.mo10657()).size(), this.f68943);
        int size3 = ((AbstractC5266) interfaceC6594.mo10657()).size();
        if (c7897.f24463 < 17) {
            i = 1;
        } else {
            i = 0;
        }
        m48513(c15765, o.a.c, size3 + i, this.f68939);
        m48513(c15765, o.a.b, this.f68936, this.f68947);
        m48513(c15765, 8198, this.f68937, this.f68918);
        m48513(c15765, o.a.s, this.f68935, this.f68949);
        m48513(c15765, o.a.q, this.f68925, this.f68920);
        m48513(c15765, 8192, this.f68932, this.f68931);
        if (mo44617()) {
            i2 = 1;
            m48513(c15765, 61440, 1, this.f68941);
        } else {
            i2 = 1;
        }
        m48513(c15765, 4096, i2, this.f68953);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48513(C15765 c15765, int i, int i2, int i3) throws IOException {
        if (i2 > 0) {
            c15765.m37175(i);
            c15765.m37175(0);
            C15765.m37166(c15765, i2);
            C15765.m37166(c15765, i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48512(C15765 c15765, int i, int i2) throws IOException {
        byte[] bArrM15354 = C5383.m15354(this.f68955.f24463);
        c15765.write(bArrM15354, 0, bArrM15354.length);
        C15765.m37166(c15765, 0);
        c15765.write(new byte[20], 0, 20);
        C15765.m37166(c15765, i2);
        C15765.m37166(c15765, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C15765.m37166(c15765, 305419896);
        C15765.m37166(c15765, 0);
        C15765.m37166(c15765, 0);
        C15765.m37166(c15765, this.f68953);
        m48525(c15765, ((AbstractC5266) this.f68948.mo8571()).size(), this.f68944);
        m48525(c15765, ((AbstractC5266) this.f68957.mo8571()).size(), this.f68927);
        m48525(c15765, ((AbstractC5266) this.f68928.mo8571()).size(), this.f68919);
        m48525(c15765, ((AbstractC5266) this.f68924.mo8571()).size(), this.f68917);
        m48525(c15765, ((AbstractC5266) this.f68923.mo8571()).size(), this.f68921);
        m48525(c15765, ((AbstractC5266) this.f68942.mo8571()).size(), this.f68930);
        C15765.m37166(c15765, i2 - i);
        C15765.m37166(c15765, i);
    }
}
