package l;

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
public class C4758 extends AbstractC3163 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f15105;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15106 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Boolean f15107;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3347 f15108;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Boolean f15109;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Boolean f15110;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f15111;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Boolean f15112;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f15113;

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo9706() {
        return false;
    }

    public C4758(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f15113 = true;
        this.f15111 = new C3786(new C1230(this), mo13919());
        this.f15108 = C3347.m10246(i, abstractC3577);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C3347 c3347M10246 = C3347.m10246(this.f9954, abstractC3577);
        if (this.f15108.equals(c3347M10246)) {
            return;
        }
        C13019.m31600(this.f15108);
        this.f15108 = c3347M10246;
        this.f15111.m11441();
    }

    public C4758(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
        this.f15110 = c12951.m31502();
        this.f15109 = c12951.m31502();
        this.f15107 = c12951.m31502();
        this.f15112 = c12951.m31502();
        this.f15113 = c12951.m31498();
        Boolean bool = this.f15110;
        if (bool != null) {
            this.f15111.m11443(bool.booleanValue());
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
        c10130.m25422(this.f15110);
        c10130.m25422(this.f15109);
        c10130.m25422(this.f15107);
        c10130.m25422(this.f15112);
        c10130.m25425(this.f15113);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۘ */
    public final String mo9688() {
        return this.f15108.f10604;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۖ */
    public final String mo9686() {
        return this.f15108.f10604;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo9708() {
        return this.f15107 != Boolean.FALSE;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final void mo9694(final int i, final String str) throws Throwable {
        m13916(new InterfaceC20281() { // from class: l.ۘܺ᩻
            @Override // l.InterfaceC20281
            /* JADX INFO: renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                C4758.m13914(this.f12876, str, i, interfaceC13224);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13914(C4758 c4758, String str, int i, InterfaceC13224 interfaceC13224) {
        if (!interfaceC13224.mo26241(C9523.m24406(str))) {
            interfaceC13224.mo26245();
            throw null;
        }
        if (interfaceC13224.m32094("CHMOD " + Integer.toOctalString(i) + " " + C9523.m24404(str))) {
            return;
        }
        if (interfaceC13224.m32082() == 550) {
            c4758.f15107 = Boolean.FALSE;
        }
        interfaceC13224.mo26245();
        throw null;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo9687() {
        return this.f15113;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        f15105 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܽ */
    public final void mo9700(final long j, final String str) throws Throwable {
        m13916(new InterfaceC20281() { // from class: l.֡ܺ᩻
            @Override // l.InterfaceC20281
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                C4758.m13912(j, str, interfaceC13224);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13912(long j, String str, InterfaceC13224 interfaceC13224) {
        String str2;
        SimpleDateFormat simpleDateFormat = f15105;
        synchronized (simpleDateFormat) {
            str2 = simpleDateFormat.format(Long.valueOf(j));
        }
        if (interfaceC13224.mo26241(C9523.m24406(str)) && interfaceC13224.m32074(C9523.m24404(str), str2)) {
            return;
        }
        interfaceC13224.mo26245();
        throw null;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܶ */
    public final String mo9699() {
        return (String) m13908(new InterfaceC22397() { // from class: l.ۡܺ᩻
            @Override // l.InterfaceC22397
            /* JADX INFO: renamed from: ֫ */
            public final Object mo8315(InterfaceC13224 interfaceC13224) {
                return C4758.m13909(this.f27325, interfaceC13224);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m13909(C4758 c4758, InterfaceC13224 interfaceC13224) {
        String str = c4758.f15108.f10606;
        if (!TextUtils.isEmpty(str) && interfaceC13224.mo26241(str)) {
            return interfaceC13224.getPath();
        }
        return interfaceC13224.mo26244();
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩸ */
    public final void mo9707() {
        C1802.f6209.execute(new RunnableC15454(1, this));
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        this.f15111.m11441();
        if (z) {
            C13019.m31600(this.f15108);
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9689() {
        if (this.f15112 == null) {
            synchronized (this) {
                if (this.f15112 == null) {
                    this.f15112 = (Boolean) m13908(new C19576());
                }
            }
        }
        return this.f15112.booleanValue();
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9681(long j, String str) {
        return m13907(j, str, true);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo9693(long j, String str) {
        return m13918(str, true);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܽ */
    public final void mo9701(final String str, final boolean z) throws Throwable {
        m13916(new InterfaceC20281() { // from class: l.᩷ܺ᩻
            @Override // l.InterfaceC20281
            /* JADX INFO: renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                String str2 = str;
                if (!interfaceC13224.mo26241(C9523.m24406(str2))) {
                    interfaceC13224.mo26245();
                    throw null;
                }
                if (z) {
                    if (interfaceC13224.m32073(C9523.m24404(str2))) {
                        return;
                    }
                    interfaceC13224.mo26245();
                    throw null;
                }
                if (interfaceC13224.m32090(C9523.m24404(str2))) {
                    return;
                }
                interfaceC13224.mo26245();
                throw null;
            }
        });
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9696(final String str, final String str2) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        return ((Boolean) m13908(new InterfaceC22397() { // from class: l.ۖܺ᩻
            @Override // l.InterfaceC22397
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final Object mo8315(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                return Boolean.valueOf(interfaceC13224.m32091(str, str2));
            }
        })).booleanValue();
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final void mo9684(final String str, final String str2) throws Throwable {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        m13916(new InterfaceC20281() { // from class: l.ܺܺ᩻
            @Override // l.InterfaceC20281
            /* JADX INFO: renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                if (interfaceC13224.m32091(str, str2)) {
                    return;
                }
                interfaceC13224.mo26245();
                throw null;
            }
        });
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܿ */
    public final void mo9702(final String str) throws Throwable {
        m13916(new InterfaceC20281() { // from class: l.ۚܺ᩻
            @Override // l.InterfaceC20281
            /* JADX INFO: renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                String str2 = str;
                if (interfaceC13224.mo26241(C9523.m24406(str2)) && interfaceC13224.m32093(C9523.m24404(str2))) {
                    return;
                }
                interfaceC13224.mo26245();
                throw null;
            }
        });
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f15111.m11445(str);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f15111;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f15111.m11444(str);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        String strM24406 = C9523.m24406(str);
        C10384 c10384 = (C10384) this.f15111.m11440(strM24406, C9523.m24404(str));
        if (c10384 != null) {
            return new C12314(c10384, strM24406);
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String strM39731 = AbstractC16891.m39731(str);
        Collection<C10384> collectionValues = this.f15111.m11446(strM39731).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C10384 c10384 : collectionValues) {
            if (z || !c10384.m26193().startsWith(".")) {
                arrayList.add(new C12314(c10384, strM39731));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۢ */
    public final void mo9692(String str) {
        this.f15111.m11442(str);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo13919() {
        return this.f15110 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13915(InterfaceC13224 interfaceC13224, C10384[] c10384Arr, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        for (C10384 c10384 : c10384Arr) {
            hashSet.add(c10384.m26193());
        }
        for (C10384 c10385 : c10384Arr) {
            if (c10385.m26189()) {
                String strM26193 = c10385.m26193();
                char cCharAt = strM26193.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM26193.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM26193.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (interfaceC13224.mo26241(str)) {
                        int iM32084 = interfaceC13224.m32084(lowerCase);
                        if (iM32084 == 213) {
                            this.f15110 = Boolean.TRUE;
                        } else if (iM32084 == 550 || iM32084 == 502) {
                            this.f15110 = Boolean.FALSE;
                        }
                        Boolean bool = this.f15110;
                        if (bool != null) {
                            this.f15111.m11443(bool.booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m13910(final C4758 c4758, String str) {
        final String strM39731 = AbstractC16891.m39731(str);
        return (List) c4758.m13908(new InterfaceC22397() { // from class: l.ᩴܺ᩻
            @Override // l.InterfaceC22397
            /* JADX INFO: renamed from: ֫ */
            public final Object mo8315(InterfaceC13224 interfaceC13224) {
                return C4758.m13911(this.f59486, strM39731, interfaceC13224);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m13911(C4758 c4758, String str, InterfaceC13224 interfaceC13224) {
        C10384[] c10384ArrM32088;
        boolean z;
        String strM26190;
        String absolutePath;
        if (c4758.f15109 == null) {
            c4758.f15109 = Boolean.valueOf(interfaceC13224.m32075(EnumC13205.MLST));
            c4758.f15113 = interfaceC13224.m32075(EnumC13205.MFMT);
        }
        if (!interfaceC13224.mo26241(str)) {
            interfaceC13224.mo26245();
            throw null;
        }
        if (c4758.f15109.booleanValue()) {
            c10384ArrM32088 = interfaceC13224.m32086();
            for (int i = 0; i < c10384ArrM32088.length; i++) {
                if (c10384ArrM32088[i].m26197().toLowerCase(Locale.ENGLISH).contains("type=cdir;")) {
                    C10384[] c10384Arr = new C10384[c10384ArrM32088.length - 1];
                    System.arraycopy(c10384ArrM32088, 0, c10384Arr, 0, i);
                    System.arraycopy(c10384ArrM32088, i + 1, c10384Arr, i, (c10384ArrM32088.length - i) - 1);
                    c10384ArrM32088 = c10384Arr;
                    break;
                }
            }
            if (c4758.f15107 == null && c10384ArrM32088.length > 0) {
                for (C10384 c10384 : c10384ArrM32088) {
                    if (c10384.m26193().indexOf(61) == -1) {
                        String strM26197 = c10384.m26197();
                        c4758.f15107 = Boolean.valueOf(strM26197.contains("UNIX.mode=") || strM26197.contains("perm="));
                        break;
                    }
                }
            }
        } else {
            c10384ArrM32088 = interfaceC13224.m32088();
            ArrayList arrayList = new ArrayList();
            for (final C10384 c10385 : c10384ArrM32088) {
                if (c10385.m26188() && (strM26190 = c10385.m26190()) != null) {
                    if (strM26190.indexOf(47) != -1) {
                        if (strM26190.startsWith("/")) {
                            absolutePath = new File(strM26190).getAbsolutePath();
                        } else {
                            absolutePath = new File(str, strM26190).getAbsolutePath();
                        }
                        strM26190 = str.equals(C9523.m24406(absolutePath)) ? C9523.m24404(absolutePath) : null;
                    }
                    if (strM26190 != null) {
                        for (final C10384 c10386 : c10384ArrM32088) {
                            if (c10386.m26193().equals(strM26190)) {
                                arrayList.add(new BooleanSupplier() { // from class: l.ۢܺ᩻
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        int i2 = C4758.f15106;
                                        C10384 c10387 = c10385;
                                        int iM26200 = c10387.m26200();
                                        C10384 c10388 = c10386;
                                        if (iM26200 == c10388.m26200()) {
                                            return false;
                                        }
                                        c10387.m26181(c10388.m26200());
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
        if (c4758.f15110 == null && c10384ArrM32088.length > 0) {
            try {
                c4758.m13915(interfaceC13224, c10384ArrM32088, str);
            } catch (IOException unused) {
            }
        }
        return Arrays.asList(c10384ArrM32088);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InputStream m13907(long j, String str, boolean z) throws Throwable {
        InterfaceC13224 interfaceC13224M31598 = C13019.m31598(this.f15108);
        try {
            if (!interfaceC13224M31598.mo26241(C9523.m24406(str))) {
                interfaceC13224M31598.mo26245();
                throw null;
            }
            interfaceC13224M31598.m32072(j);
            C0820 c0820M32087 = interfaceC13224M31598.m32087(C9523.m24404(str));
            if (c0820M32087 == null) {
                interfaceC13224M31598.mo26245();
                throw null;
            }
            return new C15340(this, c0820M32087, interfaceC13224M31598);
        } catch (IOException e) {
            interfaceC13224M31598.m32072(0L);
            if (!z || !m13917(e)) {
                C13019.m31601(interfaceC13224M31598);
                throw e;
            }
            C13019.m31599(interfaceC13224M31598);
            return m13907(j, str, false);
        } catch (Error e2) {
            e = e2;
            interfaceC13224M31598.m32072(0L);
            C13019.m31601(interfaceC13224M31598);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            interfaceC13224M31598.m32072(0L);
            C13019.m31601(interfaceC13224M31598);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m13908(InterfaceC22397 interfaceC22397) throws Throwable {
        InterfaceC13224 interfaceC13224M31598 = C13019.m31598(this.f15108);
        try {
            try {
                Object objMo8315 = interfaceC22397.mo8315(interfaceC13224M31598);
                if (interfaceC13224M31598 != null) {
                    C13019.m31601(interfaceC13224M31598);
                }
                return objMo8315;
            } catch (IOException e) {
                if (m13917(e)) {
                    C13019.m31599(interfaceC13224M31598);
                    try {
                        InterfaceC13224 interfaceC13224M31599 = C13019.m31598(this.f15108);
                        Object objMo8316 = interfaceC22397.mo8315(interfaceC13224M31599);
                        if (interfaceC13224M31599 != null) {
                            C13019.m31601(interfaceC13224M31599);
                        }
                        return objMo8316;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC13224M31598 = null;
                        if (interfaceC13224M31598 != null) {
                            C13019.m31601(interfaceC13224M31598);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC13224M31598 != null) {
                C13019.m31601(interfaceC13224M31598);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13916(InterfaceC20281 interfaceC20281) throws Throwable {
        InterfaceC13224 interfaceC13224M31598 = C13019.m31598(this.f15108);
        try {
            try {
                interfaceC20281.mo2236(interfaceC13224M31598);
                if (interfaceC13224M31598 != null) {
                    C13019.m31601(interfaceC13224M31598);
                }
            } catch (IOException e) {
                if (m13917(e)) {
                    C13019.m31599(interfaceC13224M31598);
                    try {
                        InterfaceC13224 interfaceC13224M31599 = C13019.m31598(this.f15108);
                        interfaceC20281.mo2236(interfaceC13224M31599);
                        if (interfaceC13224M31599 != null) {
                            C13019.m31601(interfaceC13224M31599);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC13224M31598 = null;
                        if (interfaceC13224M31598 != null) {
                            C13019.m31601(interfaceC13224M31598);
                        }
                        throw th;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC13224M31598 != null) {
                C13019.m31601(interfaceC13224M31598);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private OutputStream m13918(String str, boolean z) throws Throwable {
        InterfaceC13224 interfaceC13224M31598 = C13019.m31598(this.f15108);
        try {
            if (!interfaceC13224M31598.mo26241(C9523.m24406(str))) {
                interfaceC13224M31598.mo26245();
                throw null;
            }
            OutputStream outputStreamMo13872 = interfaceC13224M31598.mo13872(C9523.m24404(str));
            if (outputStreamMo13872 == null) {
                interfaceC13224M31598.mo26245();
                throw null;
            }
            return new C21692(this, outputStreamMo13872, interfaceC13224M31598, outputStreamMo13872);
        } catch (IOException e) {
            if (!z || !m13917(e)) {
                C13019.m31601(interfaceC13224M31598);
                throw e;
            }
            C13019.m31599(interfaceC13224M31598);
            return m13918(str, false);
        } catch (Error e2) {
            e = e2;
            C13019.m31601(interfaceC13224M31598);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C13019.m31601(interfaceC13224M31598);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13917(IOException iOException) {
        if (iOException instanceof C12500) {
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
