package p067l;

import android.graphics.Canvas;
import java.util.Collections;
import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۜܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4S1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8898 implements InterfaceC22450 {

    /* JADX INFO: renamed from: ֫ */
    public final C9393 f24111;

    /* JADX INFO: renamed from: ۧ */
    public final C22115 f24112;

    /* JADX INFO: renamed from: ܽ */
    public final C24991 f24113;

    public C8898(C14146 c14146) {
        C21545 c21545 = new C21545();
        this.f24111 = new C9393();
        C22115 c22115 = new C22115(c14146, c21545);
        this.f24112 = c22115;
        this.f24113 = c22115.f69974;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m20525() {
        return this.f24112.m49881();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20546(InterfaceC21800 interfaceC21800) {
        this.f24112.m49896(interfaceC21800);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m20551(InterfaceC21800 interfaceC21800) {
        this.f24112.m49902(interfaceC21800);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20529(InterfaceC21800 interfaceC21800, int i, int i2) {
        this.f24112.m49883(interfaceC21800, i, i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m20533(InterfaceC21800 interfaceC21800) {
        this.f24112.m49888(interfaceC21800);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20515(InterfaceC21800 interfaceC21800, int i, int i2) {
        this.f24112.m49870(interfaceC21800, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20508() {
        this.f24112.m49865();
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m20520() {
        this.f24112.m49863();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20538(InterfaceC21800 interfaceC21800) {
        this.f24112.m49891(interfaceC21800);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m20521() {
        this.f24112.m49877();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20514(InterfaceC21800 interfaceC21800) {
        this.f24112.m49869(interfaceC21800);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m20542(InterfaceC21800 interfaceC21800) {
        this.f24112.m49894(interfaceC21800);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m20535() {
        m20520();
        this.f24112.m49898();
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m20523() {
        return this.f24112.m49876();
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m20524() {
        return this.f24112.m49875();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m20549() {
        return this.f24112.m49889();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m20543(int i, int i2) {
        return this.f24112.m49871(i, i2);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m20522() {
        return this.f24112.m49880();
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m20526(int i, int i2) {
        C8723 c8723M49887 = this.f24112.m49887();
        if (c8723M49887 == null || !c8723M49887.m20180(i, i2)) {
            return Collections.EMPTY_LIST;
        }
        C16689 c16689M20183 = c8723M49887.m20183(i, i2);
        return c16689M20183 == null ? Collections.EMPTY_LIST : c16689M20183.m37826();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20513(C11996 c11996) {
        this.f24112.m49868(c11996);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20519(C14677 c14677, int i) {
        return this.f24112.m49874(c14677, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20517(CharSequence charSequence) {
        return this.f24112.m49872(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20527(CharSequence charSequence) {
        this.f24112.m49882(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20528(InterfaceC21800 interfaceC21800) {
        if (this.f24112.m49886(interfaceC21800)) {
            m20527((CharSequence) interfaceC21800);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20510(int i, int i2, int i3, CharSequence charSequence) {
        this.f24112.m49866(i, i2, i3, charSequence);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m20544(int i, int i2) {
        return this.f24111.m21879(i, i2, this.f24112.m49879());
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m20504(int i, int i2) {
        return this.f24111.m21868(i, i2, this.f24112.m49879());
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16273 m20537(int i, int i2) {
        return this.f24111.m21878(i, i2, this.f24112.m49879());
    }

    /* JADX INFO: renamed from: ۧ */
    public final int[] m20531(int i) {
        return this.f24111.m21877(i, this.f24112.m49879());
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m20503(CharSequence charSequence, int i, int i2, float f, C11477 c11477) {
        return this.f24111.m21867(this.f24112.m49879(), charSequence, i, i2, f, c11477);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ᩳܺܿ] */
    /* JADX INFO: renamed from: ֫ */
    public final C8794 m20505(CharSequence charSequence, int i, final int i2, C11477 c11477) {
        final C11209 c11209M49879 = this.f24112.m49879();
        if (c11209M49879 != null && c11209M49879.m25889() != 0) {
            final C19255 c19255 = new C19255();
            c19255.m43866(c11209M49879);
            return c11477.m26488(charSequence, i, i2, 0.0f, (C19627) new IntUnaryOperator() { // from class: l.ᩳܺܿ
                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                    return C17342.$default$andThen(this, intUnaryOperator);
                }

                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                    return C17342.$default$compose(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    if (i3 < c11209M49879.m25889()) {
                        C19255 c19256 = c19255;
                        if (c19256.m43867(i3)) {
                            return c19256.m43865();
                        }
                    }
                    return i2;
                }
            });
        }
        return c11477.m26488(charSequence, i, i2, 0.0f, (C19627) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20512(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, C3831 c3831, C23929 c23929) {
        C22115 c22115 = this.f24112;
        C9393 c9393 = this.f24111;
        c22115.m49867(c9393, i, i2);
        int i5 = -1;
        try {
            try {
                this.f24111.m21873(c22115.m49879(), canvas, charSequence, i, i2, f, i3, i4, c3831, c23929);
                if (c9393.m21875()) {
                    c9393.m21871(1.0f, 0);
                    c22115.m49899();
                }
                c9393.m21874((C14757) null, -1, -1, 0);
            } catch (Throwable th) {
                th = th;
                i5 = -1;
                c9393.m21874((C14757) null, i5, i5, 0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20511(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, C3831 c3831, C23929 c23929, int[] iArr) {
        this.f24111.m21872(this.f24112.m49879(), canvas, charSequence, i, i2, f, f2, i3, c3831, c23929, iArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m20540(int i) {
        C11209 c11209M49879 = this.f24112.m49879();
        return c11209M49879 != null && c11209M49879.m25894() == 1 && c11209M49879.m25892(0).m51556() == i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20516(int i, int i2, int i3) {
        return this.f24111.m21876(this.f24112.m49879(), i, i2, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20509(float f, int i) {
        this.f24111.m21871(f, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20518(String str) {
        return this.f24112.m49873(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20530(String str) {
        return this.f24112.m49885(str);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m20548() {
        this.f24112.m49864();
    }

    @Override // p067l.InterfaceC22450
    /* JADX INFO: renamed from: ֫ */
    public final C23120 mo20507(int i, int i2, CharSequence charSequence) {
        C22115 c22115 = this.f24112;
        C8723 c8723M49900 = c22115.m49900();
        C9393 c9393 = this.f24111;
        if (c8723M49900 != null) {
            return c9393.m21869(c8723M49900, charSequence, i, i2);
        }
        return c9393.m21870(c22115.m49901(), charSequence, i, i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C8723 m20532() {
        return this.f24112.m49887();
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m20536() {
        return this.f24112.m49890();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18702 m20545() {
        return this.f24112.m49895();
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC8644 m20541() {
        return this.f24112.m49893();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C16689 m20550() {
        return this.f24112.m49878();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20547(InterfaceC21800 interfaceC21800, int i, int i2) {
        this.f24112.m49897(interfaceC21800, i, i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m20534(int i, int i2) {
        return this.f24112.m49884(i, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20539(InterfaceC21800 interfaceC21800, int i, int i2) {
        this.f24112.m49892(interfaceC21800, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20502(AbstractActivityC5549 abstractActivityC5549, final InterfaceC21800 interfaceC21800, final int i, final int i2, final int i3) {
        final String string = interfaceC21800.subSequence(i, i2).toString();
        int iM24500 = C10656.m24500(i3, string);
        DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = new DialogInterfaceOnClickListenerC5863(abstractActivityC5549, (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 11) ? false : true);
        dialogInterfaceOnClickListenerC5863.m13163(new InterfaceC4522() { // from class: l.ܿܺܿ
            @Override // p067l.InterfaceC4522
            /* JADX INFO: renamed from: ۧ */
            public final void mo9575(int i4) {
                String strM24494 = C10656.m24494(i3, i4, string);
                if (strM24494 != null) {
                    InterfaceC21800 interfaceC21801 = interfaceC21800;
                    int i5 = i;
                    interfaceC21801.replace(i5, i2, strM24494);
                    interfaceC21801.setSelection(strM24494.length() + i5);
                }
            }
        });
        dialogInterfaceOnClickListenerC5863.m13162(iM24500);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m20506(int i) {
        C16689 c16689M20182;
        C8723 c8723M49887 = this.f24112.m49887();
        if (c8723M49887 == null || i < 0 || i >= c8723M49887.m20178() || !c8723M49887.m20180(i, i + 1) || (c16689M20182 = c8723M49887.m20182(c8723M49887.m20174(i))) == null) {
            return null;
        }
        return c16689M20182.m37809(C7026.f18306);
    }
}
