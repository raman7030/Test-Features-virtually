package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.io.Writer;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V3ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C22680 extends AbstractC2562 {

    /* JADX INFO: renamed from: ۧ */
    public AbstractC12224 f71545;

    /* JADX INFO: renamed from: ܳ */
    public int f71546;

    /* JADX INFO: renamed from: ܿ */
    public Writer f71548;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f71550;

    /* JADX INFO: renamed from: ᩳ */
    public int f71549 = 0;

    /* JADX INFO: renamed from: ֫ */
    public C10570 f71544 = null;

    /* JADX INFO: renamed from: ܽ */
    public String f71547 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: ᩳ */
    public final void m50789() throws IOException {
        for (int i = 0; i < this.f71549; i++) {
            this.f71548.write(" ");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50782(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f71548.write(MotionUtils.EASING_TYPE_FORMAT_START);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50775(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f71548.write(MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50777(Object obj) throws IOException {
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
        this.f71548.write(string);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m50787() throws IOException {
        this.f71548.write(this.f71547);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50781(AbstractC7257 abstractC7257, int i) {
        int i2 = this.f71546;
        try {
            try {
                this.f71546 = i;
                if (abstractC7257 == null) {
                    m50777("/*missing*/");
                } else {
                    abstractC7257.mo3382(this);
                }
                this.f71546 = i2;
            } catch (C16643 e) {
                IOException iOException = new IOException(e.getMessage());
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Throwable th) {
            this.f71546 = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50780(C4848 c4848, String str) throws IOException {
        if (!c4848.m10293()) {
            return;
        }
        AbstractC7257 abstractC7257 = (AbstractC7257) c4848.f11034;
        while (true) {
            m50781(abstractC7257, 0);
            c4848 = c4848.f11035;
            if (!c4848.m10293()) {
                return;
            }
            m50777(str);
            abstractC7257 = (AbstractC7257) c4848.f11034;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m50790(C4848 c4848) throws IOException {
        m50780(c4848, ", ");
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m50788(C4848 c4848) throws IOException {
        while (c4848.m10293()) {
            m50789();
            m50781((AbstractC7257) c4848.f11034, -1);
            m50787();
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50776(long j) throws IOException {
        if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j) != 0) {
            m50777("/*synthetic*/ ");
        }
        long j2 = (-4611677222334361601L) & j;
        int i = C21036.f66007;
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (EnumC20365 enumC20365 : C21036.m47446(j2)) {
            sb.append(str);
            sb.append(enumC20365);
            str = " ";
        }
        m50777(sb.toString().trim());
        if (j2 != 0) {
            m50777(" ");
        }
        if ((j & 8192) != 0) {
            m50777("@");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50779(C4848 c4848) throws IOException {
        while (c4848.m10293()) {
            m50781((AbstractC7257) c4848.f11034, -1);
            m50787();
            m50789();
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m50785(C4848 c4848) throws IOException {
        while (c4848.m10293()) {
            m50781((AbstractC7257) c4848.f11034, 0);
            m50777(" ");
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50784(AbstractC7257 abstractC7257) throws IOException {
        String strM24360;
        C10570 c10570 = this.f71544;
        if (c10570 == null || (strM24360 = c10570.m24360(abstractC7257)) == null) {
            return;
        }
        m50777("/**");
        m50787();
        int i = 0;
        int iIndexOf = strM24360.indexOf(10, 0);
        if (iIndexOf < 0) {
            iIndexOf = strM24360.length();
        }
        while (i < strM24360.length()) {
            m50789();
            m50777(" *");
            if (i < strM24360.length() && strM24360.charAt(i) > ' ') {
                m50777(" ");
            }
            m50777(strM24360.substring(i, iIndexOf));
            m50787();
            i = iIndexOf + 1;
            iIndexOf = strM24360.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM24360.length();
            }
        }
        m50789();
        m50777(" */");
        m50787();
        m50789();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m50791(C4848 c4848) throws IOException {
        if (c4848.m10293()) {
            m50777("<");
            m50780(c4848, ", ");
            m50777(">");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50783(C4848 c4848) throws IOException {
        m50777("{");
        m50787();
        this.f71549 += 4;
        m50788(c4848);
        this.f71549 -= 4;
        m50789();
        m50777(C0249l.f1198d);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50786(C4848 c4848) throws IOException {
        m50777("{");
        m50787();
        this.f71549 += 4;
        boolean z = true;
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            AbstractC7257 abstractC7257 = (AbstractC7257) c4849.f11034;
            if (abstractC7257.m16617(EnumC19998.f60802) && (16384 & ((C11281) abstractC7257).f31435.f9954) != 0) {
                if (!z) {
                    m50777(",");
                    m50787();
                }
                m50789();
                m50781((AbstractC7257) c4849.f11034, -1);
                z = false;
            }
        }
        m50777(C0249l.f1196b);
        m50787();
        while (c4848.m10293()) {
            AbstractC7257 abstractC7258 = (AbstractC7257) c4848.f11034;
            if (!abstractC7258.m16617(EnumC19998.f60802) || (((C11281) abstractC7258).f31435.f9954 & 16384) == 0) {
                m50789();
                m50781((AbstractC7257) c4848.f11034, -1);
                m50787();
            }
            c4848 = c4848.f11035;
        }
        this.f71549 -= 4;
        m50789();
        m50777(C0249l.f1198d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ۧ֡۠] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.᩸ۚ۠] */
    /* JADX INFO: renamed from: ֫ */
    public final void m50778(C3626 c3626, C7650 c7650) throws IOException {
        ?? r1;
        this.f71544 = c3626.f7515;
        m50784(c3626);
        boolean z = true;
        for (C4848 c4848 = c3626.f7509; c4848.m10293() && (c7650 == null || ((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60715) || ((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60726)); c4848 = c4848.f11035) {
            if (((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60715)) {
                r1 = (C12483) c4848.f11034;
                AbstractC12224 abstractC12224M21428 = C9268.m21428(r1.f34992);
                if (abstractC12224M21428 != abstractC12224M21428.f34165.f40540.f21693 && c7650 != null) {
                    C9939 c9939 = new C9939(C9268.m21438(r1.f34992));
                    c9939.mo12739(c7650);
                    if (c9939.f27521) {
                    }
                }
                if (z) {
                    m50787();
                    z = false;
                }
            } else {
                r1 = (AbstractC7257) c4848.f11034;
            }
            m50781(r1, -1);
        }
        if (c7650 != null) {
            m50781(c7650, -1);
            m50787();
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3780(C3626 c3626) {
        try {
            m50778(c3626, (C7650) null);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3799(C9800 c9800) {
        try {
            m50784(c9800);
            m50779(c9800.f27114);
            if (c9800.f27115 != null) {
                m50777("package ");
                m50781(c9800.f27115, 0);
                m50777(C0249l.f1196b);
                m50787();
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        try {
            m50784(c5777);
            C4436 c4436 = c5777.f14184;
            C4848 c4848 = c5777.f14181;
            m50779(c4436.f9953);
            if (c5777.mo12958() == EnumC8885.OPEN) {
                m50777("open ");
            }
            m50777("module ");
            m50781(c5777.f14183, 0);
            if (c4848 == null) {
                m50777(C0249l.f1196b);
            } else {
                m50777(" ");
                m50783(c4848);
            }
            m50787();
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3813(C15025 c15025) {
        try {
            m50777("exports ");
            AbstractC14355 abstractC14355 = c15025.f42932;
            C4848 c4848 = c15025.f42933;
            m50781(abstractC14355, 0);
            if (c4848 != null) {
                m50777(" to ");
                m50780(c4848, ", ");
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3778(C2423 c2423) {
        try {
            m50777("opens ");
            AbstractC14355 abstractC14355 = c2423.f3722;
            C4848 c4848 = c2423.f3723;
            m50781(abstractC14355, 0);
            if (c4848 != null) {
                m50777(" to ");
                m50780(c4848, ", ");
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3812(C14494 c14494) {
        try {
            m50777("provides ");
            m50781(c14494.f41389, 0);
            m50777(" with ");
            m50790(c14494.f41388);
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3811(C13824 c13824) {
        try {
            m50777("requires ");
            if (c13824.f39065) {
                m50777("static ");
            }
            if (c13824.f39064) {
                m50777("transitive ");
            }
            m50781(c13824.f39063, 0);
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3835(C22010 c22010) {
        try {
            m50777("uses ");
            m50781(c22010.f69239, 0);
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3808(C12483 c12483) {
        try {
            m50777("import ");
            if (c12483.f34991) {
                m50777("static ");
            }
            m50781(c12483.f34992, 0);
            m50777(C0249l.f1196b);
            m50787();
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        try {
            m50787();
            m50789();
            m50784(c7650);
            C4436 c4436 = c7650.f20022;
            C4848 c4848 = c7650.f20023;
            m50779(c4436.f9953);
            m50776(c7650.f20022.f9954 & (-513));
            AbstractC12224 abstractC12224 = this.f71545;
            this.f71545 = c7650.f20021;
            long j = c7650.f20022.f9954;
            if ((512 & j) != 0) {
                m50777("interface " + ((Object) c7650.f20021));
                m50791(c7650.f20026);
                if (c7650.f20024.m10293()) {
                    m50777(" extends ");
                    m50790(c7650.f20024);
                }
                if (c4848.m10293()) {
                    m50777(" permits ");
                    m50780(c4848, ", ");
                }
            } else {
                if ((j & 16384) != 0) {
                    m50777("enum " + ((Object) c7650.f20021));
                } else {
                    m50777("class " + ((Object) c7650.f20021));
                }
                m50791(c7650.f20026);
                if (c7650.f20025 != null) {
                    m50777(" extends ");
                    m50781(c7650.f20025, 0);
                }
                if (c7650.f20024.m10293()) {
                    m50777(" implements ");
                    m50790(c7650.f20024);
                }
                if (c4848.m10293()) {
                    m50777(" permits ");
                    m50780(c4848, ", ");
                }
            }
            m50777(" ");
            if ((c7650.f20022.f9954 & 16384) != 0) {
                m50786(c7650.f20020);
            } else {
                m50783(c7650.f20020);
            }
            this.f71545 = abstractC12224;
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        try {
            AbstractC12224 abstractC12224 = c10471.f28959;
            AbstractC7257 abstractC7257 = c10471.f28964;
            if (abstractC12224 == abstractC12224.f34165.f40540.f21737 && this.f71545 == null && this.f71550) {
                return;
            }
            m50787();
            m50789();
            m50784(c10471);
            m50781(c10471.f28961, 0);
            m50791(c10471.f28962);
            if (abstractC12224 == abstractC12224.f34165.f40540.f21737) {
                AbstractC12224 abstractC12225 = this.f71545;
                if (abstractC12225 != null) {
                    abstractC12224 = abstractC12225;
                }
                m50777(abstractC12224);
            } else {
                m50781(c10471.f28966, 0);
                m50777(" " + ((Object) abstractC12224));
            }
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            AbstractC7257 abstractC7258 = c10471.f28967;
            if (abstractC7258 != null) {
                m50781(abstractC7258, 0);
                if (c10471.f28963.m10289() > 0) {
                    m50777(", ");
                }
            }
            m50790(c10471.f28963);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            if (c10471.f28957.m10293()) {
                m50777(" throws ");
                m50790(c10471.f28957);
            }
            if (abstractC7257 != null) {
                m50777(" default ");
                m50781(abstractC7257, 0);
            }
            if (c10471.f28958 == null) {
                m50777(C0249l.f1196b);
            } else {
                m50777(" ");
                m50781(c10471.f28958, -1);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C4848 c4848;
        try {
            C10570 c10570 = this.f71544;
            if (c10570 != null && c10570.m24362(c11281)) {
                m50787();
                m50789();
            }
            m50784(c11281);
            C4436 c4436 = c11281.f31435;
            Object obj = c11281.f31433;
            if ((c4436.f9954 & 16384) == 0) {
                m50781(c4436, 0);
                if ((c11281.f31435.f9954 & 17179869184L) != 0) {
                    AbstractC14355 abstractC14355 = c11281.f31437;
                    if (abstractC14355 instanceof C19720) {
                        C19720 c19720 = (C19720) abstractC14355;
                        c4848 = c19720.f59995;
                        abstractC14355 = c19720.f59996;
                    } else {
                        c4848 = null;
                    }
                    m50781(((C25084) abstractC14355).f80025, 0);
                    if (c4848 != null) {
                        m50777((Object) ' ');
                        m50785(c4848);
                    }
                    m50777("... " + obj);
                } else {
                    m50781(c11281.f31437, 0);
                    m50777(" " + obj);
                }
                if (c11281.f31436 != null) {
                    m50777(" = ");
                    m50781(c11281.f31436, 0);
                }
                if (this.f71546 == -1) {
                    m50777(C0249l.f1196b);
                    return;
                }
                return;
            }
            m50777("/*public static final*/ ");
            m50777(obj);
            AbstractC14355 abstractC14356 = c11281.f31436;
            if (abstractC14356 != null) {
                if (!abstractC14356.m16617(EnumC19998.f60772)) {
                    m50777(" /* = ");
                    m50781(c11281.f31436, 0);
                    m50777(" */");
                    return;
                }
                C20530 c20530 = (C20530) c11281.f31436;
                if (this.f71550) {
                    m50777(" /*enum*/ ");
                    C4848 c4849 = c20530.f63430;
                    if (c4849 != null && c4849.m10293()) {
                        m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                        m50777(c20530.f63430);
                        m50777(MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    C7650 c7650 = c20530.f63428;
                    if (c7650 == null || c7650.f20020 == null) {
                        return;
                    }
                    m50777(" ");
                    m50783(c20530.f63428.f20020);
                    return;
                }
                m50777(" /* = ");
                m50777("new ");
                C7650 c7651 = c20530.f63428;
                if (c7651 != null && c7651.f20022.f9953.m10293()) {
                    m50785(c20530.f63428.f20022.f9953);
                }
                m50781(c20530.f63429, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50790(c20530.f63430);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
                m50777(" */");
                m50777(" /*enum*/ ");
                C4848 c48410 = c20530.f63430;
                if (c48410 != null && c48410.m10293()) {
                    m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                    m50790(c20530.f63430);
                    m50777(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                C7650 c7652 = c20530.f63428;
                if (c7652 == null || c7652.f20020 == null) {
                    return;
                }
                m50777(" ");
                m50783(c20530.f63428.f20020);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3793(C7789 c7789) {
        try {
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        try {
            m50776(c4968.f11317);
            m50783(c4968.f11316);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        try {
            m50777("do ");
            m50781(c21732.f68446, -1);
            m50789();
            m50777(" while ");
            if (c21732.f68447.m16617(EnumC19998.f60706)) {
                m50781(c21732.f68447, 0);
            } else {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50781(c21732.f68447, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        try {
            m50777("while ");
            if (c10610.f29370.m16617(EnumC19998.f60706)) {
                m50781(c10610.f29370, 0);
            } else {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50781(c10610.f29370, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m50777(" ");
            m50781(c10610.f29369, -1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        try {
            m50777("for (");
            if (c13685.f38597.m10293()) {
                if (((AbstractC13154) c13685.f38597.f11034).m16617(EnumC19998.f60802)) {
                    m50781((AbstractC7257) c13685.f38597.f11034, 0);
                    C4848 c4848 = c13685.f38597;
                    while (true) {
                        c4848 = c4848.f11035;
                        if (!c4848.m10293()) {
                            break;
                        }
                        C11281 c11281 = (C11281) c4848.f11034;
                        m50777(", " + ((Object) c11281.f31433));
                        if (c11281.f31436 != null) {
                            m50777(" = ");
                            m50781(c11281.f31436, 0);
                        }
                    }
                } else {
                    m50790(c13685.f38597);
                }
            }
            m50777("; ");
            AbstractC14355 abstractC14355 = c13685.f38598;
            if (abstractC14355 != null) {
                m50781(abstractC14355, 0);
            }
            m50777("; ");
            m50790(c13685.f38596);
            m50777(") ");
            m50781(c13685.f38595, -1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        try {
            m50777("for (");
            m50781(c6979.f18157, 0);
            m50777(" : ");
            m50781(c6979.f18158, 0);
            m50777(") ");
            m50781(c6979.f18156, -1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        try {
            m50777(((Object) c19188.f57352) + ": ");
            m50781(c19188.f57351, -1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        try {
            m50777("switch ");
            if (c23882.f75829.m16617(EnumC19998.f60706)) {
                m50781(c23882.f75829, 0);
            } else {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50781(c23882.f75829, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m50777(" {");
            m50787();
            m50788(c23882.f75828);
            m50789();
            m50777(C0249l.f1198d);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3831(C20391 c20391) {
        try {
            if (c20391.f63044.m10289() == 1 && ((AbstractC21062) c20391.f63044.get(0)).m16617(EnumC19998.f60740)) {
                m50777("default");
            } else {
                m50777("case ");
                m50790(c20391.f63044);
            }
            if (c20391.f63046 == C20391.f63041) {
                m50777(":");
                m50787();
                this.f71549 += 4;
                m50788(c20391.f63043);
                this.f71549 -= 4;
                m50789();
                return;
            }
            m50777(" -> ");
            if (c20391.f63043.m10289() == 1) {
                m50781((AbstractC7257) c20391.f63043.f11034, -1);
            } else {
                m50783(c20391.f63043);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3838(C23073 c23073) {
        try {
            m50777("default");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        try {
            m50777("switch ");
            if (c15164.f43267.m16617(EnumC19998.f60706)) {
                m50781(c15164.f43267, 0);
            } else {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50781(c15164.f43267, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m50777(" {");
            m50787();
            m50788(c15164.f43269);
            m50789();
            m50777(C0249l.f1198d);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        try {
            m50781(c17707.f52887, 0);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3837(C22542 c22542) {
        try {
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            m50781(c22542.f71103, 0);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3815(C15695 c15695) {
        try {
            m50781(c15695.f45487, 0);
            m50777(" && ");
            m50781(c15695.f45486, 0);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3797(C9130 c9130) {
        try {
            m50777("synchronized ");
            if (c9130.f24711.m16617(EnumC19998.f60706)) {
                m50781(c9130.f24711, 0);
            } else {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50781(c9130.f24711, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m50777(" ");
            m50781(c9130.f24710, -1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        try {
            m50777("try ");
            if (c12622.f35422.m10293()) {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                boolean z = true;
                for (AbstractC7257 abstractC7257 : c12622.f35422) {
                    if (!z) {
                        m50787();
                        this.f71549 += 4;
                    }
                    m50781(abstractC7257, -1);
                    z = false;
                }
                m50777(") ");
            }
            m50781(c12622.f35421, -1);
            for (C4848 c4848 = c12622.f35425; c4848.m10293(); c4848 = c4848.f11035) {
                m50781((AbstractC7257) c4848.f11034, -1);
            }
            if (c12622.f35424 != null) {
                m50777(" finally ");
                m50781(c12622.f35424, -1);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3779(C2955 c2955) {
        try {
            m50777(" catch (");
            m50781(c2955.f5147, 0);
            m50777(") ");
            m50781(c2955.f5146, -1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        try {
            m50782(this.f71546, 3);
            m50781(c10332.f28614, 4);
            m50777(" ? ");
            m50781(c10332.f28612, 0);
            m50777(" : ");
            m50781(c10332.f28613, 3);
            m50775(this.f71546, 3);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        try {
            m50777("if ");
            if (c3765.f7998.m16617(EnumC19998.f60706)) {
                m50781(c3765.f7998, 0);
            } else {
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50781(c3765.f7998, 0);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m50777(" ");
            m50781(c3765.f7999, -1);
            if (c3765.f8000 != null) {
                m50777(" else ");
                m50781(c3765.f8000, -1);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3807(C12344 c12344) {
        try {
            m50781(c12344.f34446, 0);
            if (this.f71546 == -1) {
                m50777(C0249l.f1196b);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        AbstractC12224 abstractC12224 = c6309.f16359;
        try {
            m50777("break");
            if (abstractC12224 != null) {
                m50777(" " + ((Object) abstractC12224));
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        try {
            m50777("yield");
            m50777(" ");
            m50781(c4575.f10248, 0);
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        AbstractC12224 abstractC12224 = c17036.f50376;
        try {
            m50777("continue");
            if (abstractC12224 != null) {
                m50777(" " + ((Object) abstractC12224));
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        try {
            m50777("return");
            if (c11813.f32975 != null) {
                m50777(" ");
                m50781(c11813.f32975, 0);
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        try {
            m50777("throw ");
            m50781(c3904.f8460, 0);
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3796(C8991 c8991) {
        try {
            m50777("assert ");
            m50781(c8991.f24356, 0);
            if (c8991.f24357 != null) {
                m50777(" : ");
                m50781(c8991.f24357, 0);
            }
            m50777(C0249l.f1196b);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        AbstractC14355 abstractC14355;
        try {
            if (!c17175.f51142.isEmpty()) {
                if (c17175.f51143.m16617(EnumC19998.f60805)) {
                    C8320 c8320 = (C8320) c17175.f51143;
                    m50781(c8320.f22261, 0);
                    m50777(".<");
                    m50790(c17175.f51142);
                    m50777(">" + ((Object) c8320.f22259));
                } else {
                    m50777("<");
                    m50790(c17175.f51142);
                    m50777(">");
                    abstractC14355 = c17175.f51143;
                }
                m50777(MotionUtils.EASING_TYPE_FORMAT_START);
                m50790(c17175.f51144);
                m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            abstractC14355 = c17175.f51143;
            m50781(abstractC14355, 0);
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            m50790(c17175.f51144);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        try {
            AbstractC14355 abstractC14355 = c20530.f63432;
            C4848 c4848 = c20530.f63431;
            if (abstractC14355 != null) {
                m50781(abstractC14355, 0);
                m50777(".");
            }
            m50777("new ");
            if (!c4848.isEmpty()) {
                m50777("<");
                m50780(c4848, ", ");
                m50777(">");
            }
            C7650 c7650 = c20530.f63428;
            if (c7650 != null && c7650.f20022.f9953.m10293()) {
                m50785(c20530.f63428.f20022.f9953);
            }
            m50781(c20530.f63429, 0);
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            m50790(c20530.f63430);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            C7650 c7651 = c20530.f63428;
            if (c7651 != null) {
                AbstractC12224 abstractC12224 = this.f71545;
                AbstractC12224 abstractC12225 = c7651.f20021;
                if (abstractC12225 == null) {
                    AbstractC6462 abstractC6462 = c20530.f18925;
                    if (abstractC6462 != null) {
                        abstractC12225 = abstractC6462.f16705.f20408;
                        if (abstractC12225 == abstractC12225.f34165.f40540.f21725) {
                            abstractC12225 = null;
                        }
                    } else {
                        abstractC12225 = null;
                    }
                }
                this.f71545 = abstractC12225;
                if ((c7651.f20022.f9954 & 16384) != 0) {
                    m50777("/*enum*/");
                }
                m50783(c20530.f63428.f20020);
                this.f71545 = abstractC12224;
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        try {
            if (c19859.f60358 != null) {
                m50777("new ");
                AbstractC14355 abstractC14355 = c19859.f60358;
                m50781(C9268.m21403((AbstractC7257) abstractC14355, false), 0);
                if (!c19859.f60357.isEmpty()) {
                    m50777((Object) ' ');
                    m50785(c19859.f60357);
                }
                if (c19859.f60359 != null) {
                    m50777("[]");
                }
                C4848 c4848 = c19859.f60361;
                int i = 0;
                for (C4848 c4849 = c19859.f60360; c4849.m10293(); c4849 = c4849.f11035) {
                    if (c4848.m10289() > i && !((C4848) c4848.get(i)).isEmpty()) {
                        m50777((Object) ' ');
                        m50785((C4848) c4848.get(i));
                    }
                    m50777("[");
                    i++;
                    m50781((AbstractC7257) c4849.f11034, 0);
                    m50777("]");
                }
                m50774(abstractC14355);
            }
            if (c19859.f60359 != null) {
                m50777("{");
                m50790(c19859.f60359);
                m50777(C0249l.f1198d);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        try {
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c15834.f45861 == EnumC18517.EXPLICIT) {
                m50790(c15834.f45863);
            } else {
                String str = "";
                for (C11281 c11281 : c15834.f45863) {
                    m50777(str);
                    m50777(c11281.f31433);
                    str = ",";
                }
            }
            m50777(")->");
            m50781(c15834.f45864, 0);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(C16505 c16505) {
        try {
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            m50781(c16505.f48507, 0);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        try {
            m50782(this.f71546, 1);
            m50781(c22403.f70670, 2);
            m50777(" = ");
            m50781(c22403.f70671, 1);
            m50775(this.f71546, 1);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50773(EnumC19998 enumC19998) {
        switch (C3233.f6264[enumC19998.ordinal()]) {
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
                return C0233a.f1084p;
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

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        try {
            m50782(this.f71546, 2);
            m50781(c11674.f32571, 3);
            m50777(" " + m50773(c11674.f5601.m45374()) + "= ");
            m50781(c11674.f32570, 2);
            m50775(this.f71546, 2);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        try {
            m50782(this.f71546, 14);
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            m50781(c19327.f57709, 0);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
            m50781(c19327.f57710, 14);
            m50775(this.f71546, 14);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        try {
            m50782(this.f71546, 10);
            m50781(c17846.f53242, 10);
            m50777(" instanceof ");
            AbstractC7257 abstractC7257 = c17846.f53243;
            if (abstractC7257 instanceof AbstractC23212) {
                m50781(abstractC7257, 0);
            } else {
                if (abstractC7257 instanceof AbstractC23212) {
                    abstractC7257 = abstractC7257.m16617(EnumC19998.f60728) ? ((C17707) c17846.f53243).f52887.f31437 : null;
                }
                m50781(abstractC7257, 11);
            }
            m50775(this.f71546, 10);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3817(C16366 c16366) {
        try {
            m50781(c16366.f48093, 15);
            m50777("[");
            m50781(c16366.f48092, 0);
            m50777("]");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        try {
            m50781(c8320.f22261, 15);
            m50777("." + ((Object) c8320.f22259));
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        try {
            AbstractC14355 abstractC14355 = c11142.f30891;
            C4848 c4848 = c11142.f30893;
            m50781(abstractC14355, 0);
            m50777("::");
            if (c4848 != null) {
                m50777("<");
                m50780(c4848, ", ");
                m50777(">");
            }
            m50777(c11142.f30886 == EnumC12909.INVOKE ? c11142.f30890 : "new");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        try {
            m50777(c9661.f26610);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3840(C24552 c24552) {
        try {
            int[] iArr = C3233.f6263;
            EnumC11353 enumC11353 = c24552.f77743;
            Object obj = c24552.f77744;
            switch (iArr[enumC11353.ordinal()]) {
                case 1:
                    m50777(obj.toString());
                    return;
                case 2:
                    m50777(obj + "L");
                    return;
                case 3:
                    m50777(obj + "F");
                    return;
                case 4:
                    m50777(obj.toString());
                    return;
                case 5:
                    m50777("'" + C14514.m33174(String.valueOf((char) ((Number) obj).intValue())) + "'");
                    return;
                case 6:
                    m50777(((Number) obj).intValue() == 1 ? "true" : "false");
                    return;
                case 7:
                    m50777("null");
                    return;
                default:
                    m50777("\"" + C14514.m33174(obj.toString()) + "\"");
                    return;
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3786(C5107 c5107) {
        try {
            switch (C3233.f6263[c5107.f11988.ordinal()]) {
                case 1:
                    m50777(ClassTransform.INTEGER);
                    return;
                case 2:
                    m50777(ClassTransform.LONG);
                    return;
                case 3:
                    m50777(ClassTransform.FLOAT);
                    return;
                case 4:
                    m50777(ClassTransform.DOUBLE);
                    return;
                case 5:
                    m50777(ClassTransform.CHARACTER);
                    return;
                case 6:
                    m50777(ClassTransform.BOOLEAN);
                    return;
                case 7:
                default:
                    m50777(C0708d.f2599O);
                    return;
                case 8:
                    m50777(ClassTransform.BYTE);
                    return;
                case 9:
                    m50777(ClassTransform.SHORT);
                    return;
                case 10:
                    m50777(ClassTransform.VOID);
                    return;
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3842(C25084 c25084) {
        try {
            m50781(C9268.m21403((AbstractC7257) c25084, false), 0);
            m50774(c25084);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m50774(AbstractC7257 abstractC7257) throws IOException {
        while (true) {
            if (abstractC7257.m16617(EnumC19998.f60721)) {
                C19720 c19720 = (C19720) abstractC7257;
                AbstractC14355 abstractC14355 = c19720.f59996;
                if (abstractC14355.m16617(EnumC19998.f60742)) {
                    m50777((Object) ' ');
                    m50785(c19720.f59995);
                }
                abstractC7257 = abstractC14355;
            }
            if (!abstractC7257.m16617(EnumC19998.f60742)) {
                return;
            }
            m50777("[]");
            abstractC7257 = ((C25084) abstractC7257).f80025;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        try {
            m50781(c17985.f53722, 0);
            m50777("<");
            m50790(c17985.f53721);
            m50777(">");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3841(C24691 c24691) {
        try {
            m50780(c24691.f78164, " | ");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3825(C18656 c18656) {
        try {
            m50780(c18656.f55708, " & ");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        try {
            if (c15973.f46260.m10293()) {
                m50785(c15973.f46260);
            }
            m50777(c15973.f46261);
            if (c15973.f46262.m10293()) {
                m50777(" extends ");
                m50780(c15973.f46262, " & ");
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3821(C17314 c17314) {
        try {
            m50777((Object) c17314.f51642);
            if (c17314.f51642.f63851 != EnumC17268.UNBOUND) {
                m50781(c17314.f51641, 0);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3833(C20669 c20669) {
        try {
            m50777(String.valueOf(c20669.f63851));
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3787(C5638 c5638) {
        try {
            m50777("(ERROR)");
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3789(C5916 c5916) {
        try {
            m50777("(let " + c5916.f14604 + " in " + c5916.f14606 + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3783(C4436 c4436) {
        try {
            m50779(c4436.f9953);
            m50776(c4436.f9954);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        try {
            m50777("@");
            m50781(c19049.f56840, 0);
            if (c19049.f56843.isEmpty()) {
                return;
            }
            m50777(MotionUtils.EASING_TYPE_FORMAT_START);
            m50790(c19049.f56843);
            m50777(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        try {
            if (c19720.f59996.m16617(EnumC19998.f60805)) {
                C8320 c8320 = (C8320) c19720.f59996;
                m50781(c8320.f22261, 15);
                m50777(".");
                m50785(c19720.f59995);
                m50777(c8320.f22259);
                return;
            }
            if (c19720.f59996.m16617(EnumC19998.f60742)) {
                m50781(C9268.m21403((AbstractC7257) c19720, false), 0);
                m50774(c19720);
            } else {
                m50785(c19720.f59995);
                m50781(c19720.f59996, 0);
            }
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
        try {
            m50777("(UNKNOWN: " + abstractC7257.mo3383() + MotionUtils.EASING_TYPE_FORMAT_END);
            m50787();
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        try {
            int iM21399 = C9268.m21399(c8598.f5601);
            String strM50773 = m50773(c8598.f5601);
            m50782(this.f71546, iM21399);
            if (!c8598.f5601.m45372()) {
                m50777(strM50773);
                m50781(c8598.f23105, iM21399);
            } else {
                m50781(c8598.f23105, iM21399);
                m50777(strM50773);
            }
            m50775(this.f71546, iM21399);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        try {
            int iM21399 = C9268.m21399(c11003.f5601);
            String strM50773 = m50773(c11003.f5601);
            m50782(this.f71546, iM21399);
            m50781(c11003.f30470, iM21399);
            m50777(" " + strM50773 + " ");
            m50781(c11003.f30469, iM21399 + 1);
            m50775(this.f71546, iM21399);
        } catch (IOException e) {
            throw new C16643(e.getMessage(), e);
        }
    }

    public C22680(Writer writer, boolean z) {
        this.f71548 = writer;
        this.f71550 = z;
    }
}
