package l;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f2102;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C1489 f2103;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19129 f2104;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC2195 f2106;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17842 f2107;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f2108;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0762 f2109;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10662 f2110;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f2112;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public HashMap f2113;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9251 f2105 = new C9251();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20540 f2111 = new C20540();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract List mo2151(String str, C19814 c19814, String str2, C10662 c10662);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo2158(AbstractC2195 abstractC2195);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract C1489 mo2160();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo2161(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2154(StringReader stringReader, String str, C10662 c10662) {
        if (str == null) {
            throw new C14167("The parameter 'baseUri' must not be null.");
        }
        C0762 c0762 = new C0762(str);
        this.f2109 = c0762;
        c0762.m2909(c10662);
        this.f2110 = c10662;
        this.f2103 = c10662.m26763();
        this.f2107 = new C17842(stringReader, 32768);
        this.f2108 = c10662.m26762();
        C17842 c17842 = this.f2107;
        c10662.m26761();
        c17842.m41794(this.f2108);
        this.f2106 = null;
        this.f2104 = new C19129(this.f2107, c10662.m26759());
        this.f2112 = new ArrayList(32);
        this.f2113 = new HashMap();
        this.f2102 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2162() {
        AbstractC2195 abstractC2195M44169;
        C19129 c19129 = this.f2104;
        EnumC15599 enumC15599 = EnumC15599.EOF;
        do {
            abstractC2195M44169 = c19129.m44169();
            mo2158(abstractC2195M44169);
            abstractC2195M44169.mo7259();
        } while (abstractC2195M44169.f7214 != enumC15599);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2164(String str) {
        AbstractC2195 abstractC2195 = this.f2106;
        C9251 c9251 = this.f2105;
        if (abstractC2195 == c9251) {
            C9251 c9252 = new C9251();
            c9252.m22257(str);
            mo2158(c9252);
        } else {
            c9251.mo7259();
            c9251.m22257(str);
            mo2158(c9251);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m2159(C15578 c15578) {
        AbstractC2195 abstractC2195 = this.f2106;
        C9251 c9251 = this.f2105;
        if (abstractC2195 == c9251) {
            C9251 c9252 = new C9251();
            c9252.f26117 = "input";
            c9252.f26118 = c15578;
            c9252.f26122 = C23340.m51750("input");
            return mo2158(c9252);
        }
        c9251.mo7259();
        c9251.f26117 = "input";
        c9251.f26118 = c15578;
        c9251.f26122 = C23340.m51750("input");
        return mo2158(c9251);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m2163(String str) {
        AbstractC2195 abstractC2195 = this.f2106;
        C20540 c20540 = this.f2111;
        if (abstractC2195 == c20540) {
            C20540 c20541 = new C20540();
            c20541.m22257(str);
            return mo2158(c20541);
        }
        c20540.mo7259();
        c20540.m22257(str);
        return mo2158(c20540);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19814 m2153() {
        int size = this.f2112.size();
        return size > 0 ? (C19814) this.f2112.get(size - 1) : this.f2109;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2157(String str) {
        C19814 c19814M2153;
        return (this.f2112.size() == 0 || (c19814M2153 = m2153()) == null || !c19814M2153.m45588().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16305 m2152(String str, C1489 c1489) {
        C16305 c16305 = (C16305) this.f2113.get(str);
        if (c16305 != null) {
            return c16305;
        }
        C16305 c16305M38357 = C16305.m38357(str, c1489);
        this.f2113.put(str, c16305M38357);
        return c16305M38357;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2155(AbstractC11347 abstractC11347, AbstractC2195 abstractC2195) {
        m2150(abstractC11347, abstractC2195, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2156(C19814 c19814, AbstractC2195 abstractC2195) {
        m2150((AbstractC11347) c19814, abstractC2195, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2150(AbstractC11347 abstractC11347, AbstractC2195 abstractC2195, boolean z) {
        int iM7252;
        if (!this.f2108 || abstractC2195 == null || (iM7252 = abstractC2195.m7252()) == -1) {
            return;
        }
        C7113 c7113 = new C7113(iM7252, this.f2107.m41791(iM7252), this.f2107.m41778(iM7252));
        int iM7250 = abstractC2195.m7250();
        new C1614(c7113, new C7113(iM7250, this.f2107.m41791(iM7250), this.f2107.m41778(iM7250))).m5478(abstractC11347, z);
    }
}
