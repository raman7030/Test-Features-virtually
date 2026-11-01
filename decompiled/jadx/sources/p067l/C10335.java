package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10335 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ֫ */
    public final int f28622;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f28623;

    /* JADX INFO: renamed from: ܳ */
    public final float f28624;

    /* JADX INFO: renamed from: ܽ */
    public final int f28625;

    /* JADX INFO: renamed from: ܿ */
    public final String f28626;

    /* JADX INFO: renamed from: ᩳ */
    public final int f28627;

    /* JADX INFO: renamed from: ᩻ */
    public final C19203 f28628 = new C19203();

    @Override // p067l.InterfaceC11657
    public final /* synthetic */ void reset() {
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        return C16349.m37149(this, bArr, i2);
    }

    public C10335(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f28627 = bArr[24];
            this.f28625 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            int length = bArr.length - 43;
            String str = C5792.f14228;
            this.f28626 = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f28622 = i;
            boolean z = (bArr[0] & UTF8.S_CS3) != 0;
            this.f28623 = z;
            if (z) {
                this.f28624 = C5792.m12973(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f28624 = 0.85f;
                return;
            }
        }
        this.f28627 = 0;
        this.f28625 = -1;
        this.f28626 = "sans-serif";
        this.f28623 = false;
        this.f28624 = 0.85f;
        this.f28622 = -1;
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        String strM43705;
        C19203 c19203 = this.f28628;
        c19203.m43708(i + i2, bArr);
        c19203.m43730(i);
        int i3 = 1;
        int i4 = 2;
        C23877.m52957(c19203.m43703() >= 2);
        int iM43710 = c19203.m43710();
        if (iM43710 == 0) {
            strM43705 = "";
        } else {
            int iM43731 = c19203.m43731();
            Charset charsetM43721 = c19203.m43721();
            int iM43732 = iM43710 - (c19203.m43731() - iM43731);
            if (charsetM43721 == null) {
                charsetM43721 = StandardCharsets.UTF_8;
            }
            strM43705 = c19203.m43705(iM43732, charsetM43721);
        }
        if (strM43705.isEmpty()) {
            interfaceC24686.accept(new C14596(-9223372036854775807L, -9223372036854775807L, AbstractC16192.m36872of()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM43705);
        m23962(spannableStringBuilder, this.f28627, 0, 0, spannableStringBuilder.length(), 16711680);
        m23961(spannableStringBuilder, this.f28625, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f28626;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM12973 = this.f28624;
        while (c19203.m43703() >= 8) {
            int iM43733 = c19203.m43731();
            int iM43739 = c19203.m43739();
            int iM437310 = c19203.m43739();
            if (iM437310 == 1937013100) {
                C23877.m52957(c19203.m43703() >= i4);
                int iM43711 = c19203.m43710();
                int i5 = 0;
                while (i5 < iM43711) {
                    C23877.m52957(c19203.m43703() >= 12);
                    int iM43712 = c19203.m43710();
                    int iM43713 = c19203.m43710();
                    c19203.m43724(i4);
                    int iM43702 = c19203.m43702();
                    c19203.m43724(i3);
                    int iM437311 = c19203.m43739();
                    if (iM43713 > spannableStringBuilder.length()) {
                        StringBuilder sbM34408 = C15033.m34408(iM43713, "Truncating styl end (", ") to cueText.length() (");
                        sbM34408.append(spannableStringBuilder.length());
                        sbM34408.append(").");
                        C21334.m48351(sbM34408.toString());
                        iM43713 = spannableStringBuilder.length();
                    }
                    if (iM43712 >= iM43713) {
                        C21334.m48351("Ignoring styl with start (" + iM43712 + ") >= end (" + iM43713 + ").");
                    } else {
                        int i6 = iM43713;
                        m23962(spannableStringBuilder, iM43702, this.f28627, iM43712, i6, 0);
                        m23961(spannableStringBuilder, iM437311, this.f28625, iM43712, i6, 0);
                    }
                    i5++;
                    i3 = 1;
                    i4 = 2;
                }
            } else {
                if (iM437310 == 1952608120 && this.f28623) {
                    C23877.m52957(c19203.m43703() >= 2);
                    fM12973 = C5792.m12973(c19203.m43710() / this.f28622, 0.0f, 0.95f);
                }
                c19203.m43730(iM43733 + iM43739);
                i3 = 1;
                i4 = 2;
            }
            c19203.m43730(iM43733 + iM43739);
            i3 = 1;
            i4 = 2;
        }
        C23207 c23207 = new C23207();
        c23207.m51726(spannableStringBuilder);
        c23207.m51722(fM12973, 0);
        c23207.m51723(0);
        interfaceC24686.accept(new C14596(-9223372036854775807L, -9223372036854775807L, AbstractC16192.m36873of((Object) c23207.m51720())));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23962(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23961(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }
}
