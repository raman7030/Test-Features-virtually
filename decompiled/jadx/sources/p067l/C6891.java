package p067l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۙܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes3.dex */
public class C6891 extends AbstractC5375 {

    /* JADX INFO: renamed from: ֫֫ */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f17935;

    /* JADX INFO: renamed from: ۟ */
    public static final /* synthetic */ int f17936 = 0;

    /* JADX INFO: renamed from: ۛ */
    public Boolean f17937;

    /* JADX INFO: renamed from: ۤ */
    public C5550 f17938;

    /* JADX INFO: renamed from: ۨ */
    public Boolean f17939;

    /* JADX INFO: renamed from: ۫ */
    public Boolean f17940;

    /* JADX INFO: renamed from: ۬ */
    public final C5967 f17941;

    /* JADX INFO: renamed from: ܰ */
    public volatile Boolean f17942;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f17943;

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo11750() {
        return false;
    }

    public C6891(int i, AbstractC5769 abstractC5769) {
        super(i, abstractC5769);
        this.f17943 = true;
        this.f17941 = new C5967(new C3538(this), mo15799());
        this.f17938 = C5550.m12282(i, abstractC5769);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11729(AbstractC5769 abstractC5769) {
        super.mo11729(abstractC5769);
        C5550 c5550M12282 = C5550.m12282(this.f12757, abstractC5769);
        if (this.f17938.equals(c5550M12282)) {
            return;
        }
        C14742.m33685(this.f17938);
        this.f17938 = c5550M12282;
        this.f17941.m13377();
    }

    public C6891(int i, AbstractC5769 abstractC5769, C14677 c14677) {
        this(i, abstractC5769);
        this.f17940 = c14677.m33589();
        this.f17939 = c14677.m33589();
        this.f17937 = c14677.m33589();
        this.f17942 = c14677.m33589();
        this.f17943 = c14677.m33585();
        Boolean bool = this.f17940;
        if (bool != null) {
            this.f17941.m13379(bool.booleanValue());
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11739(C11996 c11996) {
        c11996.m27442(this.f17940);
        c11996.m27442(this.f17939);
        c11996.m27442(this.f17937);
        c11996.m27442(this.f17942);
        c11996.m27445(this.f17943);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۘ */
    public final String mo11732() {
        return this.f17938.f13412;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۖ */
    public final String mo11730() {
        return this.f17938.f13412;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11752() {
        return this.f17937 != Boolean.FALSE;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11738(final int i, final String str) throws Throwable {
        m15796(new InterfaceC21644() { // from class: l.ۘܺ᩻
            @Override // p067l.InterfaceC21644
            /* JADX INFO: renamed from: ֫ */
            public final void mo4603(InterfaceC14937 interfaceC14937) {
                C6891.m15794(this.f15690, str, i, interfaceC14937);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15794(C6891 c6891, String str, int i, InterfaceC14937 interfaceC14937) {
        if (!interfaceC14937.mo28270(C11419.m26416(str))) {
            interfaceC14937.mo28274();
            throw null;
        }
        if (interfaceC14937.m34192("CHMOD " + Integer.toOctalString(i) + " " + C11419.m26414(str))) {
            return;
        }
        if (interfaceC14937.m34180() == 550) {
            c6891.f17937 = Boolean.FALSE;
        }
        interfaceC14937.mo28274();
        throw null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo11731() {
        return this.f17943;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        f17935 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C5468.getTimeZone("GMT"));
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11744(final long j, final String str) throws Throwable {
        m15796(new InterfaceC21644() { // from class: l.֡ܺ᩻
            @Override // p067l.InterfaceC21644
            /* JADX INFO: renamed from: ֫ */
            public final void mo4603(InterfaceC14937 interfaceC14937) {
                C6891.m15792(j, str, interfaceC14937);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15792(long j, String str, InterfaceC14937 interfaceC14937) {
        String str2;
        SimpleDateFormat simpleDateFormat = f17935;
        synchronized (simpleDateFormat) {
            str2 = simpleDateFormat.format(Long.valueOf(j));
        }
        if (interfaceC14937.mo28270(C11419.m26416(str)) && interfaceC14937.m34172(C11419.m26414(str), str2)) {
            return;
        }
        interfaceC14937.mo28274();
        throw null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܶ */
    public final String mo11743() {
        return (String) m15788(new InterfaceC23655() { // from class: l.ۡܺ᩻
            @Override // p067l.InterfaceC23655
            /* JADX INFO: renamed from: ֫ */
            public final Object mo10359(InterfaceC14937 interfaceC14937) {
                return C6891.m15789(this.f30259, interfaceC14937);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m15789(C6891 c6891, InterfaceC14937 interfaceC14937) {
        String str = c6891.f17938.f13414;
        if (!TextUtils.isEmpty(str) && interfaceC14937.mo28270(str)) {
            return interfaceC14937.getPath();
        }
        return interfaceC14937.mo28273();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11751() {
        C4081.f8988.execute(new RunnableC17056(1, this));
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        this.f17941.m13377();
        if (z) {
            C14742.m33685(this.f17938);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11733() {
        if (this.f17942 == null) {
            synchronized (this) {
                if (this.f17942 == null) {
                    this.f17942 = (Boolean) m15788(new C20974());
                }
            }
        }
        return this.f17942.booleanValue();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo11725(long j, String str) {
        return m15787(j, str, true);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo11737(long j, String str) {
        return m15798(str, true);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11745(final String str, final boolean z) throws Throwable {
        m15796(new InterfaceC21644() { // from class: l.᩷ܺ᩻
            @Override // p067l.InterfaceC21644
            /* JADX INFO: renamed from: ֫ */
            public final void mo4603(InterfaceC14937 interfaceC14937) {
                int i = C6891.f17936;
                String str2 = str;
                if (!interfaceC14937.mo28270(C11419.m26416(str2))) {
                    interfaceC14937.mo28274();
                    throw null;
                }
                if (z) {
                    if (interfaceC14937.m34171(C11419.m26414(str2))) {
                        return;
                    }
                    interfaceC14937.mo28274();
                    throw null;
                }
                if (interfaceC14937.m34188(C11419.m26414(str2))) {
                    return;
                }
                interfaceC14937.mo28274();
                throw null;
            }
        });
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11740(final String str, final String str2) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        return ((Boolean) m15788(new InterfaceC23655() { // from class: l.ۖܺ᩻
            @Override // p067l.InterfaceC23655
            /* JADX INFO: renamed from: ֫ */
            public final Object mo10359(InterfaceC14937 interfaceC14937) {
                int i = C6891.f17936;
                return Boolean.valueOf(interfaceC14937.m34189(str, str2));
            }
        })).booleanValue();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11728(final String str, final String str2) throws Throwable {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        m15796(new InterfaceC21644() { // from class: l.ܺܺ᩻
            @Override // p067l.InterfaceC21644
            /* JADX INFO: renamed from: ֫ */
            public final void mo4603(InterfaceC14937 interfaceC14937) {
                int i = C6891.f17936;
                if (interfaceC14937.m34189(str, str2)) {
                    return;
                }
                interfaceC14937.mo28274();
                throw null;
            }
        });
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܿ */
    public final void mo11746(final String str) throws Throwable {
        m15796(new InterfaceC21644() { // from class: l.ۚܺ᩻
            @Override // p067l.InterfaceC21644
            /* JADX INFO: renamed from: ֫ */
            public final void mo4603(InterfaceC14937 interfaceC14937) {
                int i = C6891.f17936;
                String str2 = str;
                if (interfaceC14937.mo28270(C11419.m26416(str2)) && interfaceC14937.m34191(C11419.m26414(str2))) {
                    return;
                }
                interfaceC14937.mo28274();
                throw null;
            }
        });
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11735(String str) {
        return this.f17941.m13381(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11747(String str) {
        C5967 c5967 = this.f17941;
        c5967.getClass();
        return c5967.m13376(C11419.m26416(str), C11419.m26414(str)) != null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩻ */
    public final String mo11753(String str) {
        return this.f17941.m13380(str);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        String strM26416 = C11419.m26416(str);
        C12237 c12237 = (C12237) this.f17941.m13376(strM26416, C11419.m26414(str));
        if (c12237 != null) {
            return new C14072(c12237, strM26416);
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        String strM41972 = AbstractC18422.m41972(str);
        Collection<C12237> collectionValues = this.f17941.m13382(strM41972).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C12237 c12237 : collectionValues) {
            if (z || !c12237.m28222().startsWith(".")) {
                arrayList.add(new C14072(c12237, strM41972));
            }
        }
        return arrayList;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۢ */
    public final void mo11736(String str) {
        this.f17941.m13378(str);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo15799() {
        return this.f17940 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15795(InterfaceC14937 interfaceC14937, C12237[] c12237Arr, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        for (C12237 c12237 : c12237Arr) {
            hashSet.add(c12237.m28222());
        }
        for (C12237 c12238 : c12237Arr) {
            if (c12238.m28218()) {
                String strM28222 = c12238.m28222();
                char cCharAt = strM28222.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM28222.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM28222.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (interfaceC14937.mo28270(str)) {
                        int iM34182 = interfaceC14937.m34182(lowerCase);
                        if (iM34182 == 213) {
                            this.f17940 = Boolean.TRUE;
                        } else if (iM34182 == 550 || iM34182 == 502) {
                            this.f17940 = Boolean.FALSE;
                        }
                        Boolean bool = this.f17940;
                        if (bool != null) {
                            this.f17941.m13379(bool.booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m15790(final C6891 c6891, String str) {
        final String strM41972 = AbstractC18422.m41972(str);
        return (List) c6891.m15788(new InterfaceC23655() { // from class: l.ᩴܺ᩻
            @Override // p067l.InterfaceC23655
            /* JADX INFO: renamed from: ֫ */
            public final Object mo10359(InterfaceC14937 interfaceC14937) {
                return C6891.m15791(this.f62715, strM41972, interfaceC14937);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m15791(C6891 c6891, String str, InterfaceC14937 interfaceC14937) {
        C12237[] c12237ArrM34186;
        boolean z;
        String strM28219;
        String absolutePath;
        if (c6891.f17939 == null) {
            c6891.f17939 = Boolean.valueOf(interfaceC14937.m34173(EnumC14918.MLST));
            c6891.f17943 = interfaceC14937.m34173(EnumC14918.MFMT);
        }
        if (!interfaceC14937.mo28270(str)) {
            interfaceC14937.mo28274();
            throw null;
        }
        if (c6891.f17939.booleanValue()) {
            c12237ArrM34186 = interfaceC14937.m34184();
            for (int i = 0; i < c12237ArrM34186.length; i++) {
                if (c12237ArrM34186[i].m28226().toLowerCase(Locale.ENGLISH).contains("type=cdir;")) {
                    C12237[] c12237Arr = new C12237[c12237ArrM34186.length - 1];
                    System.arraycopy(c12237ArrM34186, 0, c12237Arr, 0, i);
                    System.arraycopy(c12237ArrM34186, i + 1, c12237Arr, i, (c12237ArrM34186.length - i) - 1);
                    c12237ArrM34186 = c12237Arr;
                    break;
                }
            }
            if (c6891.f17937 == null && c12237ArrM34186.length > 0) {
                for (C12237 c12237 : c12237ArrM34186) {
                    if (c12237.m28222().indexOf(61) == -1) {
                        String strM28226 = c12237.m28226();
                        c6891.f17937 = Boolean.valueOf(strM28226.contains("UNIX.mode=") || strM28226.contains("perm="));
                        break;
                    }
                }
            }
        } else {
            c12237ArrM34186 = interfaceC14937.m34186();
            ArrayList arrayList = new ArrayList();
            for (final C12237 c12238 : c12237ArrM34186) {
                if (c12238.m28217() && (strM28219 = c12238.m28219()) != null) {
                    if (strM28219.indexOf(47) != -1) {
                        if (strM28219.startsWith("/")) {
                            absolutePath = new File(strM28219).getAbsolutePath();
                        } else {
                            absolutePath = new File(str, strM28219).getAbsolutePath();
                        }
                        strM28219 = str.equals(C11419.m26416(absolutePath)) ? C11419.m26414(absolutePath) : null;
                    }
                    if (strM28219 != null) {
                        for (final C12237 c12239 : c12237ArrM34186) {
                            if (c12239.m28222().equals(strM28219)) {
                                arrayList.add(new BooleanSupplier() { // from class: l.ۢܺ᩻
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        int i2 = C6891.f17936;
                                        C12237 c122310 = c12238;
                                        int iM28229 = c122310.m28229();
                                        C12237 c122311 = c12239;
                                        if (iM28229 == c122311.m28229()) {
                                            return false;
                                        }
                                        c122310.m28210(c122311.m28229());
                                        return true;
                                    }
                                });
                                break;
                            }
                        }
                    }
                }
            }
            do {
                Iterator it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    if (((BooleanSupplier) it.next()).getAsBoolean()) {
                        z = true;
                    }
                }
            } while (z);
        }
        if (c6891.f17940 == null && c12237ArrM34186.length > 0) {
            try {
                c6891.m15795(interfaceC14937, c12237ArrM34186, str);
            } catch (IOException unused) {
            }
        }
        return Arrays.asList(c12237ArrM34186);
    }

    /* JADX INFO: renamed from: ֫ */
    private InputStream m15787(long j, String str, boolean z) throws Throwable {
        InterfaceC14937 interfaceC14937M33683 = C14742.m33683(this.f17938);
        try {
            if (!interfaceC14937M33683.mo28270(C11419.m26416(str))) {
                interfaceC14937M33683.mo28274();
                throw null;
            }
            interfaceC14937M33683.m34170(j);
            C3147 c3147M34185 = interfaceC14937M33683.m34185(C11419.m26414(str));
            if (c3147M34185 == null) {
                interfaceC14937M33683.mo28274();
                throw null;
            }
            return new C16948(this, c3147M34185, interfaceC14937M33683);
        } catch (IOException e) {
            interfaceC14937M33683.m34170(0L);
            if (!z || !m15797(e)) {
                C14742.m33686(interfaceC14937M33683);
                throw e;
            }
            C14742.m33684(interfaceC14937M33683);
            return m15787(j, str, false);
        } catch (Error e2) {
            e = e2;
            interfaceC14937M33683.m34170(0L);
            C14742.m33686(interfaceC14937M33683);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            interfaceC14937M33683.m34170(0L);
            C14742.m33686(interfaceC14937M33683);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    /* JADX INFO: renamed from: ֫ */
    private Object m15788(InterfaceC23655 interfaceC23655) throws Throwable {
        InterfaceC14937 interfaceC14937M33683 = C14742.m33683(this.f17938);
        try {
            try {
                Object objMo10359 = interfaceC23655.mo10359(interfaceC14937M33683);
                if (interfaceC14937M33683 != null) {
                    C14742.m33686(interfaceC14937M33683);
                }
                return objMo10359;
            } catch (IOException e) {
                if (m15797(e)) {
                    C14742.m33684(interfaceC14937M33683);
                    try {
                        InterfaceC14937 interfaceC14937M33684 = C14742.m33683(this.f17938);
                        Object objMo103510 = interfaceC23655.mo10359(interfaceC14937M33684);
                        if (interfaceC14937M33684 != null) {
                            C14742.m33686(interfaceC14937M33684);
                        }
                        return objMo103510;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC14937M33683 = null;
                        if (interfaceC14937M33683 != null) {
                            C14742.m33686(interfaceC14937M33683);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC14937M33683 != null) {
                C14742.m33686(interfaceC14937M33683);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX INFO: renamed from: ֫ */
    private void m15796(InterfaceC21644 interfaceC21644) throws Throwable {
        InterfaceC14937 interfaceC14937M33683 = C14742.m33683(this.f17938);
        try {
            try {
                interfaceC21644.mo4603(interfaceC14937M33683);
                if (interfaceC14937M33683 != null) {
                    C14742.m33686(interfaceC14937M33683);
                }
            } catch (IOException e) {
                if (m15797(e)) {
                    C14742.m33684(interfaceC14937M33683);
                    try {
                        InterfaceC14937 interfaceC14937M33684 = C14742.m33683(this.f17938);
                        interfaceC21644.mo4603(interfaceC14937M33684);
                        if (interfaceC14937M33684 != null) {
                            C14742.m33686(interfaceC14937M33684);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC14937M33683 = null;
                        if (interfaceC14937M33683 != null) {
                            C14742.m33686(interfaceC14937M33683);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC14937M33683 != null) {
                C14742.m33686(interfaceC14937M33683);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private OutputStream m15798(String str, boolean z) throws Throwable {
        InterfaceC14937 interfaceC14937M33683 = C14742.m33683(this.f17938);
        try {
            if (!interfaceC14937M33683.mo28270(C11419.m26416(str))) {
                interfaceC14937M33683.mo28274();
                throw null;
            }
            OutputStream outputStreamMo15752 = interfaceC14937M33683.mo15752(C11419.m26414(str));
            if (outputStreamMo15752 == null) {
                interfaceC14937M33683.mo28274();
                throw null;
            }
            return new C22985(this, outputStreamMo15752, interfaceC14937M33683, outputStreamMo15752);
        } catch (IOException e) {
            if (!z || !m15797(e)) {
                C14742.m33686(interfaceC14937M33683);
                throw e;
            }
            C14742.m33684(interfaceC14937M33683);
            return m15798(str, false);
        } catch (Error e2) {
            e = e2;
            C14742.m33686(interfaceC14937M33683);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C14742.m33686(interfaceC14937M33683);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15797(IOException iOException) {
        if (iOException instanceof C14248) {
            return true;
        }
        String message = iOException.getMessage();
        if (message == null) {
            return false;
        }
        String lowerCase = message.toLowerCase(Locale.ENGLISH);
        return (lowerCase.contains("connection") && (lowerCase.contains("closed") || lowerCase.contains("reset"))) || lowerCase.contains("broken pipe") || lowerCase.contains("connection abort");
    }
}
