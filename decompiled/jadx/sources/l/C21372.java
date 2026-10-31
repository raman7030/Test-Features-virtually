package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.Writer;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V3ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21372 extends AbstractC0204 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f68849;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f68850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Writer f68852;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f68854;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68853 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8630 f68848 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f68851 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m48453() throws IOException {
        for (int i = 0; i < this.f68853; i++) {
            this.f68852.write(" ");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48446(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f68852.write(MotionUtils.EASING_TYPE_FORMAT_START);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48439(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f68852.write(MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48441(Object obj) throws IOException {
        String string = obj.toString();
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (string.charAt(i) > 255) {
                StringBuilder sb = new StringBuilder();
                sb.append(string.substring(0, i));
                while (i < length) {
                    char cCharAt = string.charAt(i);
                    if (cCharAt > 255) {
                        sb.append("\\u");
                        sb.append(Character.forDigit((cCharAt >> '\f') % 16, 16));
                        sb.append(Character.forDigit((cCharAt >> '\b') % 16, 16));
                        sb.append(Character.forDigit((cCharAt >> 4) % 16, 16));
                        sb.append(Character.forDigit(cCharAt % 16, 16));
                    } else {
                        sb.append(cCharAt);
                    }
                    i++;
                }
                string = sb.toString();
            } else {
                i++;
            }
        }
        this.f68852.write(string);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m48451() throws IOException {
        this.f68852.write(this.f68851);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48445(AbstractC5144 abstractC5144, int i) {
        int i2 = this.f68850;
        try {
            try {
                this.f68850 = i;
                if (abstractC5144 == null) {
                    m48441("/*missing*/");
                } else {
                    abstractC5144.mo988(this);
                }
                this.f68850 = i2;
            } catch (C15020 e) {
                IOException iOException = new IOException(e.getMessage());
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Throwable th) {
            this.f68850 = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48444(C2609 c2609, String str) throws IOException {
        if (!c2609.m8249()) {
            return;
        }
        AbstractC5144 abstractC5144 = (AbstractC5144) c2609.f8240;
        while (true) {
            m48445(abstractC5144, 0);
            c2609 = c2609.f8241;
            if (!c2609.m8249()) {
                return;
            }
            m48441(str);
            abstractC5144 = (AbstractC5144) c2609.f8240;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m48454(C2609 c2609) throws IOException {
        m48444(c2609, ", ");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m48452(C2609 c2609) throws IOException {
        while (c2609.m8249()) {
            m48453();
            m48445((AbstractC5144) c2609.f8240, -1);
            m48451();
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48440(long j) throws IOException {
        if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j) != 0) {
            m48441("/*synthetic*/ ");
        }
        long j2 = (-4611677222334361601L) & j;
        int i = C19642.f63384;
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (EnumC18936 enumC18936 : C19642.m45150(j2)) {
            sb.append(str);
            sb.append(enumC18936);
            str = " ";
        }
        m48441(sb.toString().trim());
        if (j2 != 0) {
            m48441(" ");
        }
        if ((j & 8192) != 0) {
            m48441("@");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48443(C2609 c2609) throws IOException {
        while (c2609.m8249()) {
            m48445((AbstractC5144) c2609.f8240, -1);
            m48451();
            m48453();
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48449(C2609 c2609) throws IOException {
        while (c2609.m8249()) {
            m48445((AbstractC5144) c2609.f8240, 0);
            m48441(" ");
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48448(AbstractC5144 abstractC5144) throws IOException {
        String strM22391;
        C8630 c8630 = this.f68848;
        if (c8630 == null || (strM22391 = c8630.m22391(abstractC5144)) == null) {
            return;
        }
        m48441("/**");
        m48451();
        int i = 0;
        int iIndexOf = strM22391.indexOf(10, 0);
        if (iIndexOf < 0) {
            iIndexOf = strM22391.length();
        }
        while (i < strM22391.length()) {
            m48453();
            m48441(" *");
            if (i < strM22391.length() && strM22391.charAt(i) > ' ') {
                m48441(" ");
            }
            m48441(strM22391.substring(i, iIndexOf));
            m48451();
            i = iIndexOf + 1;
            iIndexOf = strM22391.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM22391.length();
            }
        }
        m48453();
        m48441(" */");
        m48451();
        m48453();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m48455(C2609 c2609) throws IOException {
        if (c2609.m8249()) {
            m48441("<");
            m48444(c2609, ", ");
            m48441(">");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48447(C2609 c2609) throws IOException {
        m48441("{");
        m48451();
        this.f68853 += 4;
        m48452(c2609);
        this.f68853 -= 4;
        m48453();
        m48441(l.d);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48450(C2609 c2609) throws IOException {
        m48441("{");
        m48451();
        this.f68853 += 4;
        boolean z = true;
        for (C2609 c26010 = c2609; c26010.m8249(); c26010 = c26010.f8241) {
            AbstractC5144 abstractC5144 = (AbstractC5144) c26010.f8240;
            if (abstractC5144.m14709(EnumC18550.f57578) && (16384 & ((C9378) abstractC5144).f28486.f7169) != 0) {
                if (!z) {
                    m48441(",");
                    m48451();
                }
                m48453();
                m48445((AbstractC5144) c26010.f8240, -1);
                z = false;
            }
        }
        m48441(l.b);
        m48451();
        while (c2609.m8249()) {
            AbstractC5144 abstractC5145 = (AbstractC5144) c2609.f8240;
            if (!abstractC5145.m14709(EnumC18550.f57578) || (((C9378) abstractC5145).f28486.f7169 & 16384) == 0) {
                m48453();
                m48445((AbstractC5144) c2609.f8240, -1);
                m48451();
            }
            c2609 = c2609.f8241;
        }
        this.f68853 -= 4;
        m48453();
        m48441(l.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ۧ֡۠] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.᩸ۚ۠] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48442(C1323 c1323, C5557 c5557) throws IOException {
        ?? r1;
        this.f68848 = c1323.f4744;
        m48448(c1323);
        boolean z = true;
        for (C2609 c2609 = c1323.f4738; c2609.m8249() && (c5557 == null || ((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57491) || ((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57502)); c2609 = c2609.f8241) {
            if (((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57491)) {
                r1 = (C10643) c2609.f8240;
                AbstractC10370 abstractC10370M19462 = C7260.m19462(r1.f32021);
                if (abstractC10370M19462 != abstractC10370M19462.f31203.f37517.f18835 && c5557 != null) {
                    C7966 c7966 = new C7966(C7260.m19472(r1.f32021));
                    c7966.mo10758(c5557);
                    if (c7966.f24607) {
                    }
                }
                if (z) {
                    m48451();
                    z = false;
                }
            } else {
                r1 = (AbstractC5144) c2609.f8240;
            }
            m48445(r1, -1);
        }
        if (c5557 != null) {
            m48445(c5557, -1);
            m48451();
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1367(C1323 c1323) {
        try {
            m48442(c1323, (C5557) null);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1386(C7820 c7820) {
        try {
            m48448(c7820);
            m48443(c7820.f24198);
            if (c7820.f24199 != null) {
                m48441("package ");
                m48445(c7820.f24199, 0);
                m48441(l.b);
                m48451();
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        try {
            m48448(c3587);
            C2176 c2176 = c3587.f11379;
            C2609 c2609 = c3587.f11376;
            m48443(c2176.f7168);
            if (c3587.mo10982() == EnumC6857.OPEN) {
                m48441("open ");
            }
            m48441("module ");
            m48445(c3587.f11378, 0);
            if (c2609 == null) {
                m48441(l.b);
            } else {
                m48441(" ");
                m48447(c2609);
            }
            m48451();
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1400(C13317 c13317) {
        try {
            m48441("exports ");
            AbstractC12612 abstractC12612 = c13317.f39865;
            C2609 c2609 = c13317.f39866;
            m48445(abstractC12612, 0);
            if (c2609 != null) {
                m48441(" to ");
                m48444(c2609, ", ");
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1365(C0058 c0058) {
        try {
            m48441("opens ");
            AbstractC12612 abstractC12612 = c0058.f946;
            C2609 c2609 = c0058.f947;
            m48445(abstractC12612, 0);
            if (c2609 != null) {
                m48441(" to ");
                m48444(c2609, ", ");
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1399(C12759 c12759) {
        try {
            m48441("provides ");
            m48445(c12759.f38349, 0);
            m48441(" with ");
            m48454(c12759.f38348);
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1398(C12054 c12054) {
        try {
            m48441("requires ");
            if (c12054.f36054) {
                m48441("static ");
            }
            if (c12054.f36053) {
                m48441("transitive ");
            }
            m48445(c12054.f36052, 0);
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1422(C20667 c20667) {
        try {
            m48441("uses ");
            m48445(c20667.f66557, 0);
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1395(C10643 c10643) {
        try {
            m48441("import ");
            if (c10643.f32020) {
                m48441("static ");
            }
            m48445(c10643.f32021, 0);
            m48441(l.b);
            m48451();
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        try {
            m48451();
            m48453();
            m48448(c5557);
            C2176 c2176 = c5557.f17181;
            C2609 c2609 = c5557.f17182;
            m48443(c2176.f7168);
            m48440(c5557.f17181.f7169 & (-513));
            AbstractC10370 abstractC10370 = this.f68849;
            this.f68849 = c5557.f17180;
            long j = c5557.f17181.f7169;
            if ((512 & j) != 0) {
                m48441("interface " + ((Object) c5557.f17180));
                m48455(c5557.f17185);
                if (c5557.f17183.m8249()) {
                    m48441(" extends ");
                    m48454(c5557.f17183);
                }
                if (c2609.m8249()) {
                    m48441(" permits ");
                    m48444(c2609, ", ");
                }
            } else {
                if ((j & 16384) != 0) {
                    m48441("enum " + ((Object) c5557.f17180));
                } else {
                    m48441("class " + ((Object) c5557.f17180));
                }
                m48455(c5557.f17185);
                if (c5557.f17184 != null) {
                    m48441(" extends ");
                    m48445(c5557.f17184, 0);
                }
                if (c5557.f17183.m8249()) {
                    m48441(" implements ");
                    m48454(c5557.f17183);
                }
                if (c2609.m8249()) {
                    m48441(" permits ");
                    m48444(c2609, ", ");
                }
            }
            m48441(" ");
            if ((c5557.f17181.f7169 & 16384) != 0) {
                m48450(c5557.f17179);
            } else {
                m48447(c5557.f17179);
            }
            this.f68849 = abstractC10370;
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        try {
            AbstractC10370 abstractC10370 = c8526.f26044;
            AbstractC5144 abstractC5144 = c8526.f26049;
            if (abstractC10370 == abstractC10370.f31203.f37517.f18879 && this.f68849 == null && this.f68854) {
                return;
            }
            m48451();
            m48453();
            m48448(c8526);
            m48445(c8526.f26046, 0);
            m48455(c8526.f26047);
            if (abstractC10370 == abstractC10370.f31203.f37517.f18879) {
                AbstractC10370 abstractC10371 = this.f68849;
                if (abstractC10371 != null) {
                    abstractC10370 = abstractC10371;
                }
                m48441(abstractC10370);
            } else {
                m48445(c8526.f26051, 0);
                m48441(" " + ((Object) abstractC10370));
            }
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            AbstractC5144 abstractC5145 = c8526.f26052;
            if (abstractC5145 != null) {
                m48445(abstractC5145, 0);
                if (c8526.f26048.m8245() > 0) {
                    m48441(", ");
                }
            }
            m48454(c8526.f26048);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            if (c8526.f26042.m8249()) {
                m48441(" throws ");
                m48454(c8526.f26042);
            }
            if (abstractC5144 != null) {
                m48441(" default ");
                m48445(abstractC5144, 0);
            }
            if (c8526.f26043 == null) {
                m48441(l.b);
            } else {
                m48441(" ");
                m48445(c8526.f26043, -1);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C2609 c2609;
        try {
            C8630 c8630 = this.f68848;
            if (c8630 != null && c8630.m22393(c9378)) {
                m48451();
                m48453();
            }
            m48448(c9378);
            C2176 c2176 = c9378.f28486;
            Object obj = c9378.f28484;
            if ((c2176.f7169 & 16384) == 0) {
                m48445(c2176, 0);
                if ((c9378.f28486.f7169 & 17179869184L) != 0) {
                    AbstractC12612 abstractC12612 = c9378.f28488;
                    if (abstractC12612 instanceof C18257) {
                        C18257 c18257 = (C18257) abstractC12612;
                        c2609 = c18257.f56778;
                        abstractC12612 = c18257.f56779;
                    } else {
                        c2609 = null;
                    }
                    m48445(((C23901) abstractC12612).f77274, 0);
                    if (c2609 != null) {
                        m48441((Object) ' ');
                        m48449(c2609);
                    }
                    m48441("... " + obj);
                } else {
                    m48445(c9378.f28488, 0);
                    m48441(" " + obj);
                }
                if (c9378.f28487 != null) {
                    m48441(" = ");
                    m48445(c9378.f28487, 0);
                }
                if (this.f68850 == -1) {
                    m48441(l.b);
                    return;
                }
                return;
            }
            m48441("/*public static final*/ ");
            m48441(obj);
            AbstractC12612 abstractC12613 = c9378.f28487;
            if (abstractC12613 != null) {
                if (!abstractC12613.m14709(EnumC18550.f57548)) {
                    m48441(" /* = ");
                    m48445(c9378.f28487, 0);
                    m48441(" */");
                    return;
                }
                C19110 c19110 = (C19110) c9378.f28487;
                if (this.f68854) {
                    m48441(" /*enum*/ ");
                    C2609 c26010 = c19110.f60197;
                    if (c26010 != null && c26010.m8249()) {
                        m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                        m48441(c19110.f60197);
                        m48441(MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    C5557 c5557 = c19110.f60195;
                    if (c5557 == null || c5557.f17179 == null) {
                        return;
                    }
                    m48441(" ");
                    m48447(c19110.f60195.f17179);
                    return;
                }
                m48441(" /* = ");
                m48441("new ");
                C5557 c5558 = c19110.f60195;
                if (c5558 != null && c5558.f17181.f7168.m8249()) {
                    m48449(c19110.f60195.f17181.f7168);
                }
                m48445(c19110.f60196, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48454(c19110.f60197);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
                m48441(" */");
                m48441(" /*enum*/ ");
                C2609 c26011 = c19110.f60197;
                if (c26011 != null && c26011.m8249()) {
                    m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                    m48454(c19110.f60197);
                    m48441(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                C5557 c5559 = c19110.f60195;
                if (c5559 == null || c5559.f17179 == null) {
                    return;
                }
                m48441(" ");
                m48447(c19110.f60195.f17179);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1380(C5704 c5704) {
        try {
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        try {
            m48440(c2735.f8522);
            m48447(c2735.f8521);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        try {
            m48441("do ");
            m48445(c20374.f65770, -1);
            m48453();
            m48441(" while ");
            if (c20374.f65771.m14709(EnumC18550.f57482)) {
                m48445(c20374.f65771, 0);
            } else {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48445(c20374.f65771, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        try {
            m48441("while ");
            if (c8672.f26445.m14709(EnumC18550.f57482)) {
                m48445(c8672.f26445, 0);
            } else {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48445(c8672.f26445, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m48441(" ");
            m48445(c8672.f26444, -1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        try {
            m48441("for (");
            if (c11907.f35587.m8249()) {
                if (((AbstractC11349) c11907.f35587.f8240).m14709(EnumC18550.f57578)) {
                    m48445((AbstractC5144) c11907.f35587.f8240, 0);
                    C2609 c2609 = c11907.f35587;
                    while (true) {
                        c2609 = c2609.f8241;
                        if (!c2609.m8249()) {
                            break;
                        }
                        C9378 c9378 = (C9378) c2609.f8240;
                        m48441(", " + ((Object) c9378.f28484));
                        if (c9378.f28487 != null) {
                            m48441(" = ");
                            m48445(c9378.f28487, 0);
                        }
                    }
                } else {
                    m48454(c11907.f35587);
                }
            }
            m48441("; ");
            AbstractC12612 abstractC12612 = c11907.f35588;
            if (abstractC12612 != null) {
                m48445(abstractC12612, 0);
            }
            m48441("; ");
            m48454(c11907.f35586);
            m48441(") ");
            m48445(c11907.f35585, -1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        try {
            m48441("for (");
            m48445(c4851.f15325, 0);
            m48441(" : ");
            m48445(c4851.f15326, 0);
            m48441(") ");
            m48445(c4851.f15324, -1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        try {
            m48441(((Object) c17698.f54160) + ": ");
            m48445(c17698.f54159, -1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        try {
            m48441("switch ");
            if (c22637.f73103.m14709(EnumC18550.f57482)) {
                m48445(c22637.f73103, 0);
            } else {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48445(c22637.f73103, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m48441(" {");
            m48451();
            m48452(c22637.f73102);
            m48453();
            m48441(l.d);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1418(C18963 c18963) {
        try {
            if (c18963.f59815.m8245() == 1 && ((AbstractC19669) c18963.f59815.get(0)).m14709(EnumC18550.f57516)) {
                m48441("default");
            } else {
                m48441("case ");
                m48454(c18963.f59815);
            }
            if (c18963.f59817 == C18963.f59812) {
                m48441(":");
                m48451();
                this.f68853 += 4;
                m48452(c18963.f59814);
                this.f68853 -= 4;
                m48453();
                return;
            }
            m48441(" -> ");
            if (c18963.f59814.m8245() == 1) {
                m48445((AbstractC5144) c18963.f59814.f8240, -1);
            } else {
                m48447(c18963.f59814);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1425(C21785 c21785) {
        try {
            m48441("default");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        try {
            m48441("switch ");
            if (c13464.f40197.m14709(EnumC18550.f57482)) {
                m48445(c13464.f40197, 0);
            } else {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48445(c13464.f40197, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m48441(" {");
            m48451();
            m48452(c13464.f40199);
            m48453();
            m48441(l.d);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        try {
            m48445(c16139.f49721, 0);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1424(C21227 c21227) {
        try {
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            m48445(c21227.f68420, 0);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1402(C14022 c14022) {
        try {
            m48445(c14022.f42404, 0);
            m48441(" && ");
            m48445(c14022.f42403, 0);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1384(C7115 c7115) {
        try {
            m48441("synchronized ");
            if (c7115.f21831.m14709(EnumC18550.f57482)) {
                m48445(c7115.f21831, 0);
            } else {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48445(c7115.f21831, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m48441(" ");
            m48445(c7115.f21830, -1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        try {
            m48441("try ");
            if (c10789.f32446.m8249()) {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                boolean z = true;
                for (AbstractC5144 abstractC5144 : c10789.f32446) {
                    if (!z) {
                        m48451();
                        this.f68853 += 4;
                    }
                    m48445(abstractC5144, -1);
                    z = false;
                }
                m48441(") ");
            }
            m48445(c10789.f32445, -1);
            for (C2609 c2609 = c10789.f32449; c2609.m8249(); c2609 = c2609.f8241) {
                m48445((AbstractC5144) c2609.f8240, -1);
            }
            if (c10789.f32448 != null) {
                m48441(" finally ");
                m48445(c10789.f32448, -1);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1366(C0617 c0617) {
        try {
            m48441(" catch (");
            m48445(c0617.f2373, 0);
            m48441(") ");
            m48445(c0617.f2372, -1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        try {
            m48446(this.f68850, 3);
            m48445(c8379.f25701, 4);
            m48441(" ? ");
            m48445(c8379.f25699, 0);
            m48441(" : ");
            m48445(c8379.f25700, 3);
            m48439(this.f68850, 3);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        try {
            m48441("if ");
            if (c1470.f5225.m14709(EnumC18550.f57482)) {
                m48445(c1470.f5225, 0);
            } else {
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48445(c1470.f5225, 0);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m48441(" ");
            m48445(c1470.f5226, -1);
            if (c1470.f5227 != null) {
                m48441(" else ");
                m48445(c1470.f5227, -1);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1394(C10496 c10496) {
        try {
            m48445(c10496.f31483, 0);
            if (this.f68850 == -1) {
                m48441(l.b);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        AbstractC10370 abstractC10370 = c4146.f13545;
        try {
            m48441("break");
            if (abstractC10370 != null) {
                m48441(" " + ((Object) abstractC10370));
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        try {
            m48441("yield");
            m48441(" ");
            m48445(c2322.f7456, 0);
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        AbstractC10370 abstractC10370 = c15433.f47247;
        try {
            m48441("continue");
            if (abstractC10370 != null) {
                m48441(" " + ((Object) abstractC10370));
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        try {
            m48441("return");
            if (c9938.f30017 != null) {
                m48441(" ");
                m48445(c9938.f30017, 0);
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        try {
            m48441("throw ");
            m48445(c1616.f5680, 0);
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        try {
            m48441("assert ");
            m48445(c6968.f21475, 0);
            if (c6968.f21476 != null) {
                m48441(" : ");
                m48445(c6968.f21476, 0);
            }
            m48441(l.b);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        AbstractC12612 abstractC12612;
        try {
            if (!c15580.f48010.isEmpty()) {
                if (c15580.f48011.m14709(EnumC18550.f57581)) {
                    C6262 c6262 = (C6262) c15580.f48011;
                    m48445(c6262.f19397, 0);
                    m48441(".<");
                    m48454(c15580.f48010);
                    m48441(">" + ((Object) c6262.f19395));
                } else {
                    m48441("<");
                    m48454(c15580.f48010);
                    m48441(">");
                    abstractC12612 = c15580.f48011;
                }
                m48441(MotionUtils.EASING_TYPE_FORMAT_START);
                m48454(c15580.f48012);
                m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            abstractC12612 = c15580.f48011;
            m48445(abstractC12612, 0);
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            m48454(c15580.f48012);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        try {
            AbstractC12612 abstractC12612 = c19110.f60199;
            C2609 c2609 = c19110.f60198;
            if (abstractC12612 != null) {
                m48445(abstractC12612, 0);
                m48441(".");
            }
            m48441("new ");
            if (!c2609.isEmpty()) {
                m48441("<");
                m48444(c2609, ", ");
                m48441(">");
            }
            C5557 c5557 = c19110.f60195;
            if (c5557 != null && c5557.f17181.f7168.m8249()) {
                m48449(c19110.f60195.f17181.f7168);
            }
            m48445(c19110.f60196, 0);
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            m48454(c19110.f60197);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            C5557 c5558 = c19110.f60195;
            if (c5558 != null) {
                AbstractC10370 abstractC10370 = this.f68849;
                AbstractC10370 abstractC10371 = c5558.f17180;
                if (abstractC10371 == null) {
                    AbstractC4308 abstractC4308 = c19110.f16086;
                    if (abstractC4308 != null) {
                        abstractC10371 = abstractC4308.f13890.f17562;
                        if (abstractC10371 == abstractC10371.f31203.f37517.f18867) {
                            abstractC10371 = null;
                        }
                    } else {
                        abstractC10371 = null;
                    }
                }
                this.f68849 = abstractC10371;
                if ((c5558.f17181.f7169 & 16384) != 0) {
                    m48441("/*enum*/");
                }
                m48447(c19110.f60195.f17179);
                this.f68849 = abstractC10370;
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        try {
            if (c18404.f57138 != null) {
                m48441("new ");
                AbstractC12612 abstractC12612 = c18404.f57138;
                m48445(C7260.m19437((AbstractC5144) abstractC12612, false), 0);
                if (!c18404.f57137.isEmpty()) {
                    m48441((Object) ' ');
                    m48449(c18404.f57137);
                }
                if (c18404.f57139 != null) {
                    m48441("[]");
                }
                C2609 c2609 = c18404.f57141;
                int i = 0;
                for (C2609 c26010 = c18404.f57140; c26010.m8249(); c26010 = c26010.f8241) {
                    if (c2609.m8245() > i && !((C2609) c2609.get(i)).isEmpty()) {
                        m48441((Object) ' ');
                        m48449((C2609) c2609.get(i));
                    }
                    m48441("[");
                    i++;
                    m48445((AbstractC5144) c26010.f8240, 0);
                    m48441("]");
                }
                m48438(abstractC12612);
            }
            if (c18404.f57139 != null) {
                m48441("{");
                m48454(c18404.f57139);
                m48441(l.d);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        try {
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c14169.f42773 == EnumC16992.EXPLICIT) {
                m48454(c14169.f42775);
            } else {
                String str = "";
                for (C9378 c9378 : c14169.f42775) {
                    m48441(str);
                    m48441(c9378.f28484);
                    str = ",";
                }
            }
            m48441(")->");
            m48445(c14169.f42776, 0);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1405(C14875 c14875) {
        try {
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            m48445(c14875.f45392, 0);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        try {
            m48446(this.f68850, 1);
            m48445(c21080.f67987, 2);
            m48441(" = ");
            m48445(c21080.f67988, 1);
            m48439(this.f68850, 1);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48437(EnumC18550 enumC18550) {
        switch (C0910.f3489[enumC18550.ordinal()]) {
            case 1:
            case 24:
                return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
            case 2:
            case 25:
                return "-";
            case 3:
                return "!";
            case 4:
                return "~";
            case 5:
            case 7:
                return "++";
            case 6:
            case 8:
                return "--";
            case 9:
                return "<*nullchk*>";
            case 10:
                return "||";
            case 11:
                return "&&";
            case 12:
                return "==";
            case 13:
                return "!=";
            case 14:
                return "<";
            case 15:
                return ">";
            case 16:
                return "<=";
            case 17:
                return ">=";
            case 18:
                return "|";
            case 19:
                return "^";
            case 20:
                return a.p;
            case 21:
                return "<<";
            case 22:
                return ">>";
            case 23:
                return ">>>";
            case 26:
                return "*";
            case 27:
                return "/";
            case 28:
                return "%";
            default:
                throw new Error();
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        try {
            m48446(this.f68850, 2);
            m48445(c9791.f29619, 3);
            m48441(" " + m48437(c9791.f2829.m43096()) + "= ");
            m48445(c9791.f29618, 2);
            m48439(this.f68850, 2);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        try {
            m48446(this.f68850, 14);
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            m48445(c17844.f54511, 0);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
            m48445(c17844.f54512, 14);
            m48439(this.f68850, 14);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        try {
            m48446(this.f68850, 10);
            m48445(c16286.f50075, 10);
            m48441(" instanceof ");
            AbstractC5144 abstractC5144 = c16286.f50076;
            if (abstractC5144 instanceof AbstractC21932) {
                m48445(abstractC5144, 0);
            } else {
                if (abstractC5144 instanceof AbstractC21932) {
                    abstractC5144 = abstractC5144.m14709(EnumC18550.f57504) ? ((C16139) c16286.f50076).f49721.f28488 : null;
                }
                m48445(abstractC5144, 11);
            }
            m48439(this.f68850, 10);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1404(C14728 c14728) {
        try {
            m48445(c14728.f44980, 15);
            m48441("[");
            m48445(c14728.f44979, 0);
            m48441("]");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        try {
            m48445(c6262.f19397, 15);
            m48441("." + ((Object) c6262.f19395));
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        try {
            AbstractC12612 abstractC12612 = c9232.f27945;
            C2609 c2609 = c9232.f27947;
            m48445(abstractC12612, 0);
            m48441("::");
            if (c2609 != null) {
                m48441("<");
                m48444(c2609, ", ");
                m48441(">");
            }
            m48441(c9232.f27940 == EnumC11091.INVOKE ? c9232.f27944 : "new");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        try {
            m48441(c7673.f23696);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        try {
            int[] iArr = C0910.f3488;
            EnumC9454 enumC9454 = c23342.f74996;
            Object obj = c23342.f74997;
            switch (iArr[enumC9454.ordinal()]) {
                case 1:
                    m48441(obj.toString());
                    return;
                case 2:
                    m48441(obj + "L");
                    return;
                case 3:
                    m48441(obj + "F");
                    return;
                case 4:
                    m48441(obj.toString());
                    return;
                case 5:
                    m48441("'" + C12780.m31090(String.valueOf((char) ((Number) obj).intValue())) + "'");
                    return;
                case 6:
                    m48441(((Number) obj).intValue() == 1 ? "true" : "false");
                    return;
                case 7:
                    m48441("null");
                    return;
                default:
                    m48441("\"" + C12780.m31090(obj.toString()) + "\"");
                    return;
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1373(C2882 c2882) {
        try {
            switch (C0910.f3488[c2882.f9190.ordinal()]) {
                case 1:
                    m48441(ClassTransform.INTEGER);
                    return;
                case 2:
                    m48441(ClassTransform.LONG);
                    return;
                case 3:
                    m48441(ClassTransform.FLOAT);
                    return;
                case 4:
                    m48441(ClassTransform.DOUBLE);
                    return;
                case 5:
                    m48441(ClassTransform.CHARACTER);
                    return;
                case 6:
                    m48441(ClassTransform.BOOLEAN);
                    return;
                case 7:
                default:
                    m48441(d.O);
                    return;
                case 8:
                    m48441(ClassTransform.BYTE);
                    return;
                case 9:
                    m48441(ClassTransform.SHORT);
                    return;
                case 10:
                    m48441(ClassTransform.VOID);
                    return;
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        try {
            m48445(C7260.m19437((AbstractC5144) c23901, false), 0);
            m48438(c23901);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48438(AbstractC5144 abstractC5144) throws IOException {
        while (true) {
            if (abstractC5144.m14709(EnumC18550.f57497)) {
                C18257 c18257 = (C18257) abstractC5144;
                AbstractC12612 abstractC12612 = c18257.f56779;
                if (abstractC12612.m14709(EnumC18550.f57518)) {
                    m48441((Object) ' ');
                    m48449(c18257.f56778);
                }
                abstractC5144 = abstractC12612;
            }
            if (!abstractC5144.m14709(EnumC18550.f57518)) {
                return;
            }
            m48441("[]");
            abstractC5144 = ((C23901) abstractC5144).f77274;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        try {
            m48445(c16432.f50542, 0);
            m48441("<");
            m48454(c16432.f50541);
            m48441(">");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1428(C23488 c23488) {
        try {
            m48444(c23488.f75416, " | ");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1412(C17138 c17138) {
        try {
            m48444(c17138.f52525, " & ");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        try {
            if (c14315.f43168.m8249()) {
                m48449(c14315.f43168);
            }
            m48441(c14315.f43169);
            if (c14315.f43170.m8249()) {
                m48441(" extends ");
                m48444(c14315.f43170, " & ");
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        try {
            m48441((Object) c15726.f48502);
            if (c15726.f48502.f60620 != EnumC15678.UNBOUND) {
                m48445(c15726.f48501, 0);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1420(C19256 c19256) {
        try {
            m48441(String.valueOf(c19256.f60620));
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1374(C3440 c3440) {
        try {
            m48441("(ERROR)");
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1376(C3733 c3733) {
        try {
            m48441("(let " + c3733.f11797 + " in " + c3733.f11799 + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1370(C2176 c2176) {
        try {
            m48443(c2176.f7168);
            m48440(c2176.f7169);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        try {
            m48441("@");
            m48445(c17551.f53650, 0);
            if (c17551.f53653.isEmpty()) {
                return;
            }
            m48441(MotionUtils.EASING_TYPE_FORMAT_START);
            m48454(c17551.f53653);
            m48441(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        try {
            if (c18257.f56779.m14709(EnumC18550.f57581)) {
                C6262 c6262 = (C6262) c18257.f56779;
                m48445(c6262.f19397, 15);
                m48441(".");
                m48449(c18257.f56778);
                m48441(c6262.f19395);
                return;
            }
            if (c18257.f56779.m14709(EnumC18550.f57518)) {
                m48445(C7260.m19437((AbstractC5144) c18257, false), 0);
                m48438(c18257);
            } else {
                m48449(c18257.f56778);
                m48445(c18257.f56779, 0);
            }
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        try {
            m48441("(UNKNOWN: " + abstractC5144.mo989() + MotionUtils.EASING_TYPE_FORMAT_END);
            m48451();
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        try {
            int iM19433 = C7260.m19433(c6555.f2829);
            String strM48437 = m48437(c6555.f2829);
            m48446(this.f68850, iM19433);
            if (!c6555.f2829.m43094()) {
                m48441(strM48437);
                m48445(c6555.f20226, iM19433);
            } else {
                m48445(c6555.f20226, iM19433);
                m48441(strM48437);
            }
            m48439(this.f68850, iM19433);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        try {
            int iM19433 = C7260.m19433(c9085.f2829);
            String strM48437 = m48437(c9085.f2829);
            m48446(this.f68850, iM19433);
            m48445(c9085.f27533, iM19433);
            m48441(" " + strM48437 + " ");
            m48445(c9085.f27532, iM19433 + 1);
            m48439(this.f68850, iM19433);
        } catch (IOException e) {
            throw new C15020(e.getMessage(), e);
        }
    }

    public C21372(Writer writer, boolean z) {
        this.f68852 = writer;
        this.f68854 = z;
    }
}
