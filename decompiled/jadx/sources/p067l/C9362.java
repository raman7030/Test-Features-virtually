package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9362 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final C9362 f25488;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final InterfaceC13820 f25489;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final /* synthetic */ int f25490 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f25491;

    /* JADX INFO: renamed from: ۗ */
    public volatile Object f25492;

    /* JADX INFO: renamed from: ۙ */
    public boolean f25493;

    /* JADX INFO: renamed from: ۛ */
    public boolean f25494;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f25495;

    /* JADX INFO: renamed from: ۟ */
    public volatile Object f25496;

    /* JADX INFO: renamed from: ۡ֫ */
    public List f25497;

    /* JADX INFO: renamed from: ۢ֫ */
    public volatile Object f25498;

    /* JADX INFO: renamed from: ۤ */
    public volatile Object f25499;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte f25500;

    /* JADX INFO: renamed from: ۨ */
    public boolean f25501;

    /* JADX INFO: renamed from: ۫ */
    public C8041 f25502;

    /* JADX INFO: renamed from: ۬ */
    public boolean f25503;

    /* JADX INFO: renamed from: ܰ */
    public volatile Object f25504;

    /* JADX INFO: renamed from: ܳ֫ */
    public volatile Object f25505;

    /* JADX INFO: renamed from: ܽ֫ */
    public volatile Object f25506;

    /* JADX INFO: renamed from: ܿ֫ */
    public volatile Object f25507;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f25508;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f25509;

    /* JADX INFO: renamed from: ᩷֫ */
    public volatile Object f25510;

    /* JADX INFO: renamed from: ᩹ */
    public int f25511;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f25512;

    /* JADX INFO: renamed from: ᩻֫ */
    public volatile Object f25513;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f25511 & 1) != 0) {
            AbstractC6285.m14269(abstractC16402, 1, this.f25496);
        }
        if ((this.f25511 & 2) != 0) {
            AbstractC6285.m14269(abstractC16402, 8, this.f25504);
        }
        if ((this.f25511 & 32) != 0) {
            abstractC16402.mo37248(9, this.f25508);
        }
        if ((this.f25511 & 4) != 0) {
            abstractC16402.mo37240(10, this.f25512);
        }
        if ((this.f25511 & 64) != 0) {
            AbstractC6285.m14269(abstractC16402, 11, this.f25499);
        }
        if ((this.f25511 & 128) != 0) {
            abstractC16402.mo37240(16, this.f25493);
        }
        if ((this.f25511 & 256) != 0) {
            abstractC16402.mo37240(17, this.f25501);
        }
        if ((this.f25511 & 512) != 0) {
            abstractC16402.mo37240(18, this.f25495);
        }
        if ((this.f25511 & 8) != 0) {
            abstractC16402.mo37240(20, this.f25494);
        }
        if ((this.f25511 & 1024) != 0) {
            abstractC16402.mo37240(23, this.f25503);
        }
        if ((this.f25511 & 16) != 0) {
            abstractC16402.mo37240(27, this.f25491);
        }
        if ((this.f25511 & 2048) != 0) {
            abstractC16402.mo37240(31, this.f25509);
        }
        if ((this.f25511 & 4096) != 0) {
            AbstractC6285.m14269(abstractC16402, 36, this.f25506);
        }
        if ((this.f25511 & 8192) != 0) {
            AbstractC6285.m14269(abstractC16402, 37, this.f25492);
        }
        if ((this.f25511 & 16384) != 0) {
            AbstractC6285.m14269(abstractC16402, 39, this.f25498);
        }
        if ((this.f25511 & 32768) != 0) {
            AbstractC6285.m14269(abstractC16402, 40, this.f25507);
        }
        if ((this.f25511 & 65536) != 0) {
            AbstractC6285.m14269(abstractC16402, 41, this.f25513);
        }
        if ((this.f25511 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            AbstractC6285.m14269(abstractC16402, 44, this.f25505);
        }
        if ((this.f25511 & 262144) != 0) {
            AbstractC6285.m14269(abstractC16402, 45, this.f25510);
        }
        if ((this.f25511 & 524288) != 0) {
            abstractC16402.mo37251(50, m21750());
        }
        for (int i = 0; i < this.f25497.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f25497.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C9362.class.getName());
        f25488 = new C9362();
        f25489 = new C8021();
    }

    public C9362(C13386 c13386) {
        super(c13386);
        this.f25496 = "";
        this.f25504 = "";
        this.f25512 = false;
        this.f25494 = false;
        this.f25491 = false;
        this.f25508 = 1;
        this.f25499 = "";
        this.f25493 = false;
        this.f25501 = false;
        this.f25495 = false;
        this.f25503 = false;
        this.f25509 = true;
        this.f25506 = "";
        this.f25492 = "";
        this.f25498 = "";
        this.f25507 = "";
        this.f25513 = "";
        this.f25505 = "";
        this.f25510 = "";
        this.f25500 = (byte) -1;
    }

    public C9362() {
        this.f25496 = "";
        this.f25504 = "";
        this.f25512 = false;
        this.f25494 = false;
        this.f25491 = false;
        this.f25508 = 1;
        this.f25499 = "";
        this.f25493 = false;
        this.f25501 = false;
        this.f25495 = false;
        this.f25503 = false;
        this.f25509 = true;
        this.f25506 = "";
        this.f25492 = "";
        this.f25498 = "";
        this.f25507 = "";
        this.f25513 = "";
        this.f25505 = "";
        this.f25510 = "";
        this.f25500 = (byte) -1;
        this.f25496 = "";
        this.f25504 = "";
        this.f25508 = 1;
        this.f25499 = "";
        this.f25509 = true;
        this.f25506 = "";
        this.f25492 = "";
        this.f25498 = "";
        this.f25507 = "";
        this.f25513 = "";
        this.f25505 = "";
        this.f25510 = "";
        this.f25497 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35224;
        c11650.m26787(C9362.class, C13386.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean m21759() {
        return (this.f25511 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܶ */
    public final String m21744() {
        Object obj = this.f25496;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25496 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean m21743() {
        return (this.f25511 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m21733() {
        Object obj = this.f25504;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25504 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean m21748() {
        return (this.f25511 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m21721() {
        return this.f25512;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean m21747() {
        return (this.f25511 & 8) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֡ */
    public final boolean m21720() {
        return this.f25494;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m21731() {
        return (this.f25511 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m21756() {
        return this.f25491;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean m21736() {
        return (this.f25511 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC15396 m21754() {
        EnumC15396 enumC15396M35073 = EnumC15396.m35073(this.f25508);
        return enumC15396M35073 == null ? EnumC15396.SPEED : enumC15396M35073;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean m21738() {
        return (this.f25511 & 64) != 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m21752() {
        Object obj = this.f25499;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25499 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m21758() {
        return (this.f25511 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m21745() {
        return this.f25493;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean m21749() {
        return (this.f25511 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m21729() {
        return this.f25501;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean m21727() {
        return (this.f25511 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m21740() {
        return this.f25495;
    }

    /* JADX INFO: renamed from: ۟ */
    public final boolean m21732() {
        return (this.f25511 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m21726() {
        return this.f25503;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m21739() {
        return (this.f25511 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m21734() {
        return this.f25509;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m21755() {
        return (this.f25511 & 4096) != 0;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m21757() {
        Object obj = this.f25506;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25506 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m21742() {
        return (this.f25511 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m21723() {
        Object obj = this.f25492;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25492 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean m21753() {
        return (this.f25511 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۛ */
    public final String m21730() {
        Object obj = this.f25498;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25498 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean m21735() {
        return (this.f25511 & 32768) != 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public final String m21728() {
        Object obj = this.f25507;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25507 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean m21724() {
        return (this.f25511 & 65536) != 0;
    }

    /* JADX INFO: renamed from: ۬ */
    public final String m21741() {
        Object obj = this.f25513;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25513 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean m21746() {
        return (this.f25511 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0;
    }

    /* JADX INFO: renamed from: ۗ */
    public final String m21725() {
        Object obj = this.f25505;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25505 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final boolean m21751() {
        return (this.f25511 & 262144) != 0;
    }

    /* JADX INFO: renamed from: ۤ */
    public final String m21737() {
        Object obj = this.f25510;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC7962 abstractC7962 = (AbstractC7962) obj;
        String strM18427 = abstractC7962.m18427();
        if (abstractC7962.mo18426()) {
            this.f25510 = strM18427;
        }
        return strM18427;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean m21722() {
        return (this.f25511 & 524288) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C8041 m21750() {
        C8041 c8041 = this.f25502;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f25500;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m21722() || m21750().isInitialized()) {
            for (int i = 0; i < this.f25497.size(); i++) {
                if (!((C3821) this.f25497.get(i)).isInitialized()) {
                    this.f25500 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f25500 = (byte) 0;
                return false;
            }
            this.f25500 = (byte) 1;
            return true;
        }
        this.f25500 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM14254 = (this.f25511 & 1) != 0 ? AbstractC6285.m14254(1, this.f25496) : 0;
        if ((this.f25511 & 2) != 0) {
            iM14254 += AbstractC6285.m14254(8, this.f25504);
        }
        if ((this.f25511 & 32) != 0) {
            iM14254 += AbstractC16402.m37226(9, this.f25508);
        }
        if ((this.f25511 & 4) != 0) {
            iM14254 += AbstractC16402.m37227(10);
        }
        if ((this.f25511 & 64) != 0) {
            iM14254 += AbstractC6285.m14254(11, this.f25499);
        }
        if ((this.f25511 & 128) != 0) {
            iM14254 += AbstractC16402.m37227(16);
        }
        if ((this.f25511 & 256) != 0) {
            iM14254 += AbstractC16402.m37227(17);
        }
        if ((this.f25511 & 512) != 0) {
            iM14254 += AbstractC16402.m37227(18);
        }
        if ((this.f25511 & 8) != 0) {
            iM14254 += AbstractC16402.m37227(20);
        }
        if ((this.f25511 & 1024) != 0) {
            iM14254 += AbstractC16402.m37227(23);
        }
        if ((this.f25511 & 16) != 0) {
            iM14254 += AbstractC16402.m37227(27);
        }
        if ((this.f25511 & 2048) != 0) {
            iM14254 += AbstractC16402.m37227(31);
        }
        if ((this.f25511 & 4096) != 0) {
            iM14254 += AbstractC6285.m14254(36, this.f25506);
        }
        if ((this.f25511 & 8192) != 0) {
            iM14254 += AbstractC6285.m14254(37, this.f25492);
        }
        if ((this.f25511 & 16384) != 0) {
            iM14254 += AbstractC6285.m14254(39, this.f25498);
        }
        if ((this.f25511 & 32768) != 0) {
            iM14254 += AbstractC6285.m14254(40, this.f25507);
        }
        if ((this.f25511 & 65536) != 0) {
            iM14254 += AbstractC6285.m14254(41, this.f25513);
        }
        if ((this.f25511 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            iM14254 += AbstractC6285.m14254(44, this.f25505);
        }
        if ((this.f25511 & 262144) != 0) {
            iM14254 += AbstractC6285.m14254(45, this.f25510);
        }
        if ((this.f25511 & 524288) != 0) {
            iM14254 += AbstractC16402.m37229(50, m21750());
        }
        for (int i2 = 0; i2 < this.f25497.size(); i2++) {
            iM14254 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f25497.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM14254 + m31642();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9362)) {
            return super.equals(obj);
        }
        C9362 c9362 = (C9362) obj;
        if (m21759() != c9362.m21759()) {
            return false;
        }
        if ((m21759() && !m21744().equals(c9362.m21744())) || m21743() != c9362.m21743()) {
            return false;
        }
        if ((m21743() && !m21733().equals(c9362.m21733())) || m21748() != c9362.m21748()) {
            return false;
        }
        if ((m21748() && this.f25512 != c9362.f25512) || m21747() != c9362.m21747()) {
            return false;
        }
        if ((m21747() && this.f25494 != c9362.f25494) || m21731() != c9362.m21731()) {
            return false;
        }
        if ((m21731() && this.f25491 != c9362.f25491) || m21736() != c9362.m21736()) {
            return false;
        }
        if ((m21736() && this.f25508 != c9362.f25508) || m21738() != c9362.m21738()) {
            return false;
        }
        if ((m21738() && !m21752().equals(c9362.m21752())) || m21758() != c9362.m21758()) {
            return false;
        }
        if ((m21758() && this.f25493 != c9362.f25493) || m21749() != c9362.m21749()) {
            return false;
        }
        if ((m21749() && this.f25501 != c9362.f25501) || m21727() != c9362.m21727()) {
            return false;
        }
        if ((m21727() && this.f25495 != c9362.f25495) || m21732() != c9362.m21732()) {
            return false;
        }
        if ((m21732() && this.f25503 != c9362.f25503) || m21739() != c9362.m21739()) {
            return false;
        }
        if ((m21739() && this.f25509 != c9362.f25509) || m21755() != c9362.m21755()) {
            return false;
        }
        if ((m21755() && !m21757().equals(c9362.m21757())) || m21742() != c9362.m21742()) {
            return false;
        }
        if ((m21742() && !m21723().equals(c9362.m21723())) || m21753() != c9362.m21753()) {
            return false;
        }
        if ((m21753() && !m21730().equals(c9362.m21730())) || m21735() != c9362.m21735()) {
            return false;
        }
        if ((m21735() && !m21728().equals(c9362.m21728())) || m21724() != c9362.m21724()) {
            return false;
        }
        if ((m21724() && !m21741().equals(c9362.m21741())) || m21746() != c9362.m21746()) {
            return false;
        }
        if ((m21746() && !m21725().equals(c9362.m21725())) || m21751() != c9362.m21751()) {
            return false;
        }
        if ((!m21751() || m21737().equals(c9362.m21737())) && m21722() == c9362.m21722()) {
            return (!m21722() || m21750().equals(c9362.m21750())) && this.f25497.equals(c9362.f25497) && getUnknownFields().equals(c9362.getUnknownFields()) && m31640().equals(c9362.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35232.hashCode() + 779;
        if (m21759()) {
            iHashCode = C6316.m14441(iHashCode, 37, 1, 53) + m21744().hashCode();
        }
        if (m21743()) {
            iHashCode = C6316.m14441(iHashCode, 37, 8, 53) + m21733().hashCode();
        }
        if (m21748()) {
            iHashCode = C6316.m14441(iHashCode, 37, 10, 53) + C15671.m35601(this.f25512);
        }
        if (m21747()) {
            iHashCode = C6316.m14441(iHashCode, 37, 20, 53) + C15671.m35601(this.f25494);
        }
        if (m21731()) {
            iHashCode = C6316.m14441(iHashCode, 37, 27, 53) + C15671.m35601(this.f25491);
        }
        if (m21736()) {
            iHashCode = C6316.m14441(iHashCode, 37, 9, 53) + this.f25508;
        }
        if (m21738()) {
            iHashCode = C6316.m14441(iHashCode, 37, 11, 53) + m21752().hashCode();
        }
        if (m21758()) {
            iHashCode = C6316.m14441(iHashCode, 37, 16, 53) + C15671.m35601(this.f25493);
        }
        if (m21749()) {
            iHashCode = C6316.m14441(iHashCode, 37, 17, 53) + C15671.m35601(this.f25501);
        }
        if (m21727()) {
            iHashCode = C6316.m14441(iHashCode, 37, 18, 53) + C15671.m35601(this.f25495);
        }
        if (m21732()) {
            iHashCode = C6316.m14441(iHashCode, 37, 23, 53) + C15671.m35601(this.f25503);
        }
        if (m21739()) {
            iHashCode = C6316.m14441(iHashCode, 37, 31, 53) + C15671.m35601(this.f25509);
        }
        if (m21755()) {
            iHashCode = C6316.m14441(iHashCode, 37, 36, 53) + m21757().hashCode();
        }
        if (m21742()) {
            iHashCode = C6316.m14441(iHashCode, 37, 37, 53) + m21723().hashCode();
        }
        if (m21753()) {
            iHashCode = C6316.m14441(iHashCode, 37, 39, 53) + m21730().hashCode();
        }
        if (m21735()) {
            iHashCode = C6316.m14441(iHashCode, 37, 40, 53) + m21728().hashCode();
        }
        if (m21724()) {
            iHashCode = C6316.m14441(iHashCode, 37, 41, 53) + m21741().hashCode();
        }
        if (m21746()) {
            iHashCode = C6316.m14441(iHashCode, 37, 44, 53) + m21725().hashCode();
        }
        if (m21751()) {
            iHashCode = C6316.m14441(iHashCode, 37, 45, 53) + m21737().hashCode();
        }
        if (m21722()) {
            iHashCode = C6316.m14441(iHashCode, 37, 50, 53) + m21750().hashCode();
        }
        if (this.f25497.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f25497.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C13386 newBuilder() {
        return f25488.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f25488.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f25488.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C13386 toBuilder() {
        int i = 0;
        if (this == f25488) {
            return new C13386(i);
        }
        C13386 c13386 = new C13386(i);
        c13386.m30533(this);
        return c13386;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C13386(interfaceC11316, 0);
    }

    public static C9362 getDefaultInstance() {
        return f25488;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f25489;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f25488;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f25488;
    }
}
