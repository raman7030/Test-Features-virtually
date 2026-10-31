package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JK */
/* JADX INFO: loaded from: classes.dex */
public class C22350 extends AbstractC2867 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2306 f72416;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2306 f72417;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f72418;

    static {
        C12847 c12847M25201 = AbstractC10026.m25201();
        c12847M25201.m31239((Integer) 1, "builtin:selectText");
        c12847M25201.m31239((Integer) 2, "builtin:selectAll");
        c12847M25201.m31239((Integer) 3, "builtin:cut");
        c12847M25201.m31239((Integer) 4, "builtin:copy");
        c12847M25201.m31239((Integer) 5, "builtin:paste");
        c12847M25201.m31239((Integer) 6, "builtin:delete");
        c12847M25201.m31239((Integer) 7, "builtin:search");
        c12847M25201.m31239((Integer) 8, "builtin:rangeSearch");
        c12847M25201.m31239((Integer) 9, "builtin:shareText");
        c12847M25201.m31239((Integer) 10, "builtin:openLink");
        c12847M25201.m31239((Integer) 11, "builtin:translate");
        c12847M25201.m31239((Integer) 12, "builtin:systemTranslate");
        c12847M25201.m31239((Integer) 13, "builtin:toggleComment");
        c12847M25201.m31239((Integer) 14, "builtin:function");
        c12847M25201.m31239((Integer) 15, "builtin:customize");
        AbstractC10026 abstractC10026Mo18430 = c12847M25201.mo18430();
        f72417 = abstractC10026Mo18430;
        f72416 = abstractC10026Mo18430.mo7567();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m50092() {
        return ((AbstractC10026) f72417).mo7567().keySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50091(int i) {
        return (String) f72417.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m50090(String str) {
        return (Integer) f72416.get(str);
    }

    public C22350(int i) {
        this.f72418 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo48910() {
        int i = this.f72418;
        switch (i) {
            case 1:
                return R.string.MT_Protector;
            case 2:
                return android.R.string.selectAll;
            case 3:
                return android.R.string.cut;
            case 4:
                return android.R.string.copy;
            case 5:
                return android.R.string.paste;
            case 6:
                return R.string.MT_Protector;
            case 7:
                return R.string.MT_Protector;
            case 8:
                return R.string.MT_Protector;
            case 9:
                return R.string.MT_Protector;
            case 10:
                return R.string.MT_Protector;
            case 11:
                return R.string.MT_Protector;
            case 12:
                return R.string.MT_Protector;
            case 13:
                return R.string.MT_Protector;
            case 14:
                return R.string.MT_Protector;
            case 15:
                return R.string.MT_Protector;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final String mo8778() {
        int i = this.f72418;
        String strM50091 = m50091(i);
        if (strM50091 != null) {
            return strM50091;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public boolean mo8780(C12392 c12392, boolean z, boolean z2, int i, int i2) {
        int i3 = this.f72418;
        switch (i3) {
            case 1:
                return !z2 && i == i2;
            case 2:
                return (i == 0 && i2 == c12392.m30526()) ? false : true;
            case 3:
            case 6:
                return z && i != i2;
            case 4:
            case 9:
                return i != i2;
            case 5:
                return z && c12392.m30409();
            case 7:
                return i != i2 && c12392.m30469();
            case 8:
                return i != i2 && c12392.m30469() && c12392.m30403();
            case 10:
                if (i == i2 || i2 - i > 2048) {
                    return false;
                }
                C7744 c7744Mo26556 = c12392.m30436().mo26556();
                try {
                    boolean zM19033 = C7053.m19033(c7744Mo26556, i, i2);
                    c7744Mo26556.close();
                    return zM19033;
                } catch (Throwable th) {
                    try {
                        c7744Mo26556.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                return (i == i2 || c12392.m30503() == null) ? false : true;
            case 12:
                return i != i2 && C14714.m35011();
            case 13:
                return z && !c12392.m30398().isEmpty();
            case 14:
                return false;
            case 15:
                return true;
            default:
                throw new RuntimeException(C19370.m44628(i3, "Unknown action "));
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ۧ */
    public final C16271 mo8781() {
        C16271 c16271 = new C16271(C4925.m14327(mo48910()), this);
        if (this.f72418 == 14) {
            c16271.setSpan(new ForegroundColorSpan(C21943.f70257), 0, c16271.length(), 17);
        }
        return c16271;
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo48911() {
        int i = this.f72418;
        switch (i) {
            case 1:
                return R.drawable.MT_Protector;
            case 2:
                return R.drawable.MT_Protector;
            case 3:
                return R.drawable.MT_Protector;
            case 4:
                return R.drawable.MT_Protector;
            case 5:
                return R.drawable.MT_Protector;
            case 6:
                return R.drawable.MT_Protector;
            case 7:
                return R.drawable.MT_Protector;
            case 8:
                return R.drawable.MT_Protector;
            case 9:
                return R.drawable.MT_Protector;
            case 10:
                return R.drawable.MT_Protector;
            case 11:
            case 12:
                return R.drawable.MT_Protector;
            case 13:
                return R.drawable.MT_Protector;
            case 14:
                return R.drawable.MT_Protector;
            case 15:
                return R.drawable.MT_Protector;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo8777(Context context) {
        Drawable drawableM13097 = C4369.m13097(context.getResources(), mo48911(), context.getTheme());
        if (this.f72418 != 14) {
            return drawableM13097;
        }
        Drawable drawableMutate = C8184.m21684(drawableM13097).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(C21943.f70257));
        return drawableMutate;
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public void mo8779(C12392 c12392) {
        int i = this.f72418;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
                c12392.m30406(mo48910());
                return;
            case 14:
            default:
                throw new RuntimeException(C19370.m44628(i, "Unknown action "));
        }
    }
}
