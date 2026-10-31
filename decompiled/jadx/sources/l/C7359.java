package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7359 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final C7359 f22574;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f22575;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22576 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f22577;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile Object f22578;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22579;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f22580;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f22581;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile Object f22582;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public List f22583;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public volatile Object f22584;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile Object f22585;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte f22586;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f22587;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5969 f22588;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f22590;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public volatile Object f22591;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public volatile Object f22592;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public volatile Object f22593;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f22594;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22595;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public volatile Object f22596;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22597;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f22598;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public volatile Object f22599;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f22597 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f22582);
        }
        if ((this.f22597 & 2) != 0) {
            AbstractC4121.m12380(abstractC14766, 8, this.f22590);
        }
        if ((this.f22597 & 32) != 0) {
            abstractC14766.mo35101(9, this.f22594);
        }
        if ((this.f22597 & 4) != 0) {
            abstractC14766.mo35093(10, this.f22598);
        }
        if ((this.f22597 & 64) != 0) {
            AbstractC4121.m12380(abstractC14766, 11, this.f22585);
        }
        if ((this.f22597 & 128) != 0) {
            abstractC14766.mo35093(16, this.f22579);
        }
        if ((this.f22597 & 256) != 0) {
            abstractC14766.mo35093(17, this.f22587);
        }
        if ((this.f22597 & 512) != 0) {
            abstractC14766.mo35093(18, this.f22581);
        }
        if ((this.f22597 & 8) != 0) {
            abstractC14766.mo35093(20, this.f22580);
        }
        if ((this.f22597 & 1024) != 0) {
            abstractC14766.mo35093(23, this.f22589);
        }
        if ((this.f22597 & 16) != 0) {
            abstractC14766.mo35093(27, this.f22577);
        }
        if ((this.f22597 & 2048) != 0) {
            abstractC14766.mo35093(31, this.f22595);
        }
        if ((this.f22597 & 4096) != 0) {
            AbstractC4121.m12380(abstractC14766, 36, this.f22592);
        }
        if ((this.f22597 & 8192) != 0) {
            AbstractC4121.m12380(abstractC14766, 37, this.f22578);
        }
        if ((this.f22597 & 16384) != 0) {
            AbstractC4121.m12380(abstractC14766, 39, this.f22584);
        }
        if ((this.f22597 & 32768) != 0) {
            AbstractC4121.m12380(abstractC14766, 40, this.f22593);
        }
        if ((this.f22597 & 65536) != 0) {
            AbstractC4121.m12380(abstractC14766, 41, this.f22599);
        }
        if ((this.f22597 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            AbstractC4121.m12380(abstractC14766, 44, this.f22591);
        }
        if ((this.f22597 & 262144) != 0) {
            AbstractC4121.m12380(abstractC14766, 45, this.f22596);
        }
        if ((this.f22597 & 524288) != 0) {
            abstractC14766.mo35104(50, m19777());
        }
        for (int i = 0; i < this.f22583.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f22583.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C7359.class.getName());
        f22574 = new C7359();
        f22575 = new C5948();
    }

    public C7359(C11593 c11593) {
        super(c11593);
        this.f22582 = "";
        this.f22590 = "";
        this.f22598 = false;
        this.f22580 = false;
        this.f22577 = false;
        this.f22594 = 1;
        this.f22585 = "";
        this.f22579 = false;
        this.f22587 = false;
        this.f22581 = false;
        this.f22589 = false;
        this.f22595 = true;
        this.f22592 = "";
        this.f22578 = "";
        this.f22584 = "";
        this.f22593 = "";
        this.f22599 = "";
        this.f22591 = "";
        this.f22596 = "";
        this.f22586 = (byte) -1;
    }

    public C7359() {
        this.f22582 = "";
        this.f22590 = "";
        this.f22598 = false;
        this.f22580 = false;
        this.f22577 = false;
        this.f22594 = 1;
        this.f22585 = "";
        this.f22579 = false;
        this.f22587 = false;
        this.f22581 = false;
        this.f22589 = false;
        this.f22595 = true;
        this.f22592 = "";
        this.f22578 = "";
        this.f22584 = "";
        this.f22593 = "";
        this.f22599 = "";
        this.f22591 = "";
        this.f22596 = "";
        this.f22586 = (byte) -1;
        this.f22582 = "";
        this.f22590 = "";
        this.f22594 = 1;
        this.f22585 = "";
        this.f22595 = true;
        this.f22592 = "";
        this.f22578 = "";
        this.f22584 = "";
        this.f22593 = "";
        this.f22599 = "";
        this.f22591 = "";
        this.f22596 = "";
        this.f22583 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32249;
        c9766.m24773(C7359.class, C11593.class);
        return c9766;
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m19786() {
        return (this.f22597 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m19771() {
        Object obj = this.f22582;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22582 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19770() {
        return (this.f22597 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m19760() {
        Object obj = this.f22590;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22590 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19775() {
        return (this.f22597 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m19748() {
        return this.f22598;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19774() {
        return (this.f22597 & 8) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m19747() {
        return this.f22580;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19758() {
        return (this.f22597 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19783() {
        return this.f22577;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19763() {
        return (this.f22597 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC13708 m19781() {
        EnumC13708 enumC13708M32959 = EnumC13708.m32959(this.f22594);
        return enumC13708M32959 == null ? EnumC13708.SPEED : enumC13708M32959;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19765() {
        return (this.f22597 & 64) != 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m19779() {
        Object obj = this.f22585;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22585 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m19785() {
        return (this.f22597 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m19772() {
        return this.f22579;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19776() {
        return (this.f22597 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m19756() {
        return this.f22587;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19754() {
        return (this.f22597 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m19767() {
        return this.f22581;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m19759() {
        return (this.f22597 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m19753() {
        return this.f22589;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m19766() {
        return (this.f22597 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m19761() {
        return this.f22595;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m19782() {
        return (this.f22597 & 4096) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m19784() {
        Object obj = this.f22592;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22592 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m19769() {
        return (this.f22597 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m19750() {
        Object obj = this.f22578;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22578 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final boolean m19780() {
        return (this.f22597 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m19757() {
        Object obj = this.f22584;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22584 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19762() {
        return (this.f22597 & 32768) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19755() {
        Object obj = this.f22593;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22593 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19751() {
        return (this.f22597 & 65536) != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m19768() {
        Object obj = this.f22599;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22599 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19773() {
        return (this.f22597 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m19752() {
        Object obj = this.f22591;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22591 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19778() {
        return (this.f22597 & 262144) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m19764() {
        Object obj = this.f22596;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String strM16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f22596 = strM16501;
        }
        return strM16501;
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean m19749() {
        return (this.f22597 & 524288) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5969 m19777() {
        C5969 c5969 = this.f22588;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f22586;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m19749() || m19777().isInitialized()) {
            for (int i = 0; i < this.f22583.size(); i++) {
                if (!((C1529) this.f22583.get(i)).isInitialized()) {
                    this.f22586 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f22586 = (byte) 0;
                return false;
            }
            this.f22586 = (byte) 1;
            return true;
        }
        this.f22586 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM12365 = (this.f22597 & 1) != 0 ? AbstractC4121.m12365(1, this.f22582) : 0;
        if ((this.f22597 & 2) != 0) {
            iM12365 += AbstractC4121.m12365(8, this.f22590);
        }
        if ((this.f22597 & 32) != 0) {
            iM12365 += AbstractC14766.m35079(9, this.f22594);
        }
        if ((this.f22597 & 4) != 0) {
            iM12365 += AbstractC14766.m35080(10);
        }
        if ((this.f22597 & 64) != 0) {
            iM12365 += AbstractC4121.m12365(11, this.f22585);
        }
        if ((this.f22597 & 128) != 0) {
            iM12365 += AbstractC14766.m35080(16);
        }
        if ((this.f22597 & 256) != 0) {
            iM12365 += AbstractC14766.m35080(17);
        }
        if ((this.f22597 & 512) != 0) {
            iM12365 += AbstractC14766.m35080(18);
        }
        if ((this.f22597 & 8) != 0) {
            iM12365 += AbstractC14766.m35080(20);
        }
        if ((this.f22597 & 1024) != 0) {
            iM12365 += AbstractC14766.m35080(23);
        }
        if ((this.f22597 & 16) != 0) {
            iM12365 += AbstractC14766.m35080(27);
        }
        if ((this.f22597 & 2048) != 0) {
            iM12365 += AbstractC14766.m35080(31);
        }
        if ((this.f22597 & 4096) != 0) {
            iM12365 += AbstractC4121.m12365(36, this.f22592);
        }
        if ((this.f22597 & 8192) != 0) {
            iM12365 += AbstractC4121.m12365(37, this.f22578);
        }
        if ((this.f22597 & 16384) != 0) {
            iM12365 += AbstractC4121.m12365(39, this.f22584);
        }
        if ((this.f22597 & 32768) != 0) {
            iM12365 += AbstractC4121.m12365(40, this.f22593);
        }
        if ((this.f22597 & 65536) != 0) {
            iM12365 += AbstractC4121.m12365(41, this.f22599);
        }
        if ((this.f22597 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            iM12365 += AbstractC4121.m12365(44, this.f22591);
        }
        if ((this.f22597 & 262144) != 0) {
            iM12365 += AbstractC4121.m12365(45, this.f22596);
        }
        if ((this.f22597 & 524288) != 0) {
            iM12365 += AbstractC14766.m35082(50, m19777());
        }
        for (int i2 = 0; i2 < this.f22583.size(); i2++) {
            iM12365 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f22583.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM12365 + m29577();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7359)) {
            return super.equals(obj);
        }
        C7359 c7359 = (C7359) obj;
        if (m19786() != c7359.m19786()) {
            return false;
        }
        if ((m19786() && !m19771().equals(c7359.m19771())) || m19770() != c7359.m19770()) {
            return false;
        }
        if ((m19770() && !m19760().equals(c7359.m19760())) || m19775() != c7359.m19775()) {
            return false;
        }
        if ((m19775() && this.f22598 != c7359.f22598) || m19774() != c7359.m19774()) {
            return false;
        }
        if ((m19774() && this.f22580 != c7359.f22580) || m19758() != c7359.m19758()) {
            return false;
        }
        if ((m19758() && this.f22577 != c7359.f22577) || m19763() != c7359.m19763()) {
            return false;
        }
        if ((m19763() && this.f22594 != c7359.f22594) || m19765() != c7359.m19765()) {
            return false;
        }
        if ((m19765() && !m19779().equals(c7359.m19779())) || m19785() != c7359.m19785()) {
            return false;
        }
        if ((m19785() && this.f22579 != c7359.f22579) || m19776() != c7359.m19776()) {
            return false;
        }
        if ((m19776() && this.f22587 != c7359.f22587) || m19754() != c7359.m19754()) {
            return false;
        }
        if ((m19754() && this.f22581 != c7359.f22581) || m19759() != c7359.m19759()) {
            return false;
        }
        if ((m19759() && this.f22589 != c7359.f22589) || m19766() != c7359.m19766()) {
            return false;
        }
        if ((m19766() && this.f22595 != c7359.f22595) || m19782() != c7359.m19782()) {
            return false;
        }
        if ((m19782() && !m19784().equals(c7359.m19784())) || m19769() != c7359.m19769()) {
            return false;
        }
        if ((m19769() && !m19750().equals(c7359.m19750())) || m19780() != c7359.m19780()) {
            return false;
        }
        if ((m19780() && !m19757().equals(c7359.m19757())) || m19762() != c7359.m19762()) {
            return false;
        }
        if ((m19762() && !m19755().equals(c7359.m19755())) || m19751() != c7359.m19751()) {
            return false;
        }
        if ((m19751() && !m19768().equals(c7359.m19768())) || m19773() != c7359.m19773()) {
            return false;
        }
        if ((m19773() && !m19752().equals(c7359.m19752())) || m19778() != c7359.m19778()) {
            return false;
        }
        if ((!m19778() || m19764().equals(c7359.m19764())) && m19749() == c7359.m19749()) {
            return (!m19749() || m19777().equals(c7359.m19777())) && this.f22583.equals(c7359.f22583) && getUnknownFields().equals(c7359.getUnknownFields()) && m29575().equals(c7359.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C10702.f32257.hashCode() + 779;
        if (m19786()) {
            iHashCode = C4153.m12551(iHashCode, 37, 1, 53) + m19771().hashCode();
        }
        if (m19770()) {
            iHashCode = C4153.m12551(iHashCode, 37, 8, 53) + m19760().hashCode();
        }
        if (m19775()) {
            iHashCode = C4153.m12551(iHashCode, 37, 10, 53) + C13997.m33481(this.f22598);
        }
        if (m19774()) {
            iHashCode = C4153.m12551(iHashCode, 37, 20, 53) + C13997.m33481(this.f22580);
        }
        if (m19758()) {
            iHashCode = C4153.m12551(iHashCode, 37, 27, 53) + C13997.m33481(this.f22577);
        }
        if (m19763()) {
            iHashCode = C4153.m12551(iHashCode, 37, 9, 53) + this.f22594;
        }
        if (m19765()) {
            iHashCode = C4153.m12551(iHashCode, 37, 11, 53) + m19779().hashCode();
        }
        if (m19785()) {
            iHashCode = C4153.m12551(iHashCode, 37, 16, 53) + C13997.m33481(this.f22579);
        }
        if (m19776()) {
            iHashCode = C4153.m12551(iHashCode, 37, 17, 53) + C13997.m33481(this.f22587);
        }
        if (m19754()) {
            iHashCode = C4153.m12551(iHashCode, 37, 18, 53) + C13997.m33481(this.f22581);
        }
        if (m19759()) {
            iHashCode = C4153.m12551(iHashCode, 37, 23, 53) + C13997.m33481(this.f22589);
        }
        if (m19766()) {
            iHashCode = C4153.m12551(iHashCode, 37, 31, 53) + C13997.m33481(this.f22595);
        }
        if (m19782()) {
            iHashCode = C4153.m12551(iHashCode, 37, 36, 53) + m19784().hashCode();
        }
        if (m19769()) {
            iHashCode = C4153.m12551(iHashCode, 37, 37, 53) + m19750().hashCode();
        }
        if (m19780()) {
            iHashCode = C4153.m12551(iHashCode, 37, 39, 53) + m19757().hashCode();
        }
        if (m19762()) {
            iHashCode = C4153.m12551(iHashCode, 37, 40, 53) + m19755().hashCode();
        }
        if (m19751()) {
            iHashCode = C4153.m12551(iHashCode, 37, 41, 53) + m19768().hashCode();
        }
        if (m19773()) {
            iHashCode = C4153.m12551(iHashCode, 37, 44, 53) + m19752().hashCode();
        }
        if (m19778()) {
            iHashCode = C4153.m12551(iHashCode, 37, 45, 53) + m19764().hashCode();
        }
        if (m19749()) {
            iHashCode = C4153.m12551(iHashCode, 37, 50, 53) + m19777().hashCode();
        }
        if (this.f22583.size() > 0) {
            iHashCode = C4153.m12551(iHashCode, 37, EnumC3478.f11008, 53) + this.f22583.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(iHashCode, m29575()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C11593 newBuilder() {
        return f22574.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f22574.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f22574.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C11593 toBuilder() {
        int i = 0;
        if (this == f22574) {
            return new C11593(i);
        }
        C11593 c11593 = new C11593(i);
        c11593.m28487(this);
        return c11593;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C11593(interfaceC9415, 0);
    }

    public static C7359 getDefaultInstance() {
        return f22574;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f22575;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f22574;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f22574;
    }
}
