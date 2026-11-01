package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JK */
/* JADX INFO: loaded from: classes.dex */
public class C23610 extends AbstractC5094 {

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC4560 f75142;

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC4560 f75143;

    /* JADX INFO: renamed from: ֫ */
    public final int f75144;

    static {
        C14578 c14578M27218 = AbstractC11897.m27218();
        c14578M27218.m33325((Integer) 1, "builtin:selectText");
        c14578M27218.m33325((Integer) 2, "builtin:selectAll");
        c14578M27218.m33325((Integer) 3, "builtin:cut");
        c14578M27218.m33325((Integer) 4, "builtin:copy");
        c14578M27218.m33325((Integer) 5, "builtin:paste");
        c14578M27218.m33325((Integer) 6, "builtin:delete");
        c14578M27218.m33325((Integer) 7, "builtin:search");
        c14578M27218.m33325((Integer) 8, "builtin:rangeSearch");
        c14578M27218.m33325((Integer) 9, "builtin:shareText");
        c14578M27218.m33325((Integer) 10, "builtin:openLink");
        c14578M27218.m33325((Integer) 11, "builtin:translate");
        c14578M27218.m33325((Integer) 12, "builtin:systemTranslate");
        c14578M27218.m33325((Integer) 13, "builtin:toggleComment");
        c14578M27218.m33325((Integer) 14, "builtin:function");
        c14578M27218.m33325((Integer) 15, "builtin:customize");
        AbstractC11897 abstractC11897Mo20378 = c14578M27218.mo20378();
        f75143 = abstractC11897Mo20378;
        f75142 = abstractC11897Mo20378.mo9635();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static AbstractC8146 m52431() {
        return ((AbstractC11897) f75143).mo9635().keySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52430(int i) {
        return (String) f75143.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m52429(String str) {
        return (Integer) f75142.get(str);
    }

    public C23610(int i) {
        this.f75144 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo51258() {
        int i = this.f75144;
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

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final String mo10845() {
        int i = this.f75144;
        String strM52430 = m52430(i);
        if (strM52430 != null) {
            return strM52430;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public boolean mo10847(C14146 c14146, boolean z, boolean z2, int i, int i2) {
        int i3 = this.f75144;
        switch (i3) {
            case 1:
                return !z2 && i == i2;
            case 2:
                return (i == 0 && i2 == c14146.m32590()) ? false : true;
            case 3:
            case 6:
                return z && i != i2;
            case 4:
            case 9:
                return i != i2;
            case 5:
                return z && c14146.m32473();
            case 7:
                return i != i2 && c14146.m32533();
            case 8:
                return i != i2 && c14146.m32533() && c14146.m32467();
            case 10:
                if (i == i2 || i2 - i > 2048) {
                    return false;
                }
                C9729 c9729Mo28589 = c14146.m32500().mo28589();
                try {
                    boolean zM20990 = C9072.m20990(c9729Mo28589, i, i2);
                    c9729Mo28589.close();
                    return zM20990;
                } catch (Throwable th) {
                    try {
                        c9729Mo28589.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                return (i == i2 || c14146.m32567() == null) ? false : true;
            case 12:
                return i != i2 && C16353.m37158();
            case 13:
                return z && !c14146.m32462().isEmpty();
            case 14:
                return false;
            case 15:
                return true;
            default:
                throw new RuntimeException(C20778.m46922(i3, "Unknown action "));
        }
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ۧ */
    public final C17833 mo10848() {
        C17833 c17833 = new C17833(C7050.m16224(mo51258()), this);
        if (this.f75144 == 14) {
            c17833.setSpan(new ForegroundColorSpan(C23223.f72969), 0, c17833.length(), 17);
        }
        return c17833;
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo51259() {
        int i = this.f75144;
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

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo10844(Context context) {
        Drawable drawableM14961 = C1059.m14961(context.getResources(), mo51259(), context.getTheme());
        if (this.f75144 != 14) {
            return drawableM14961;
        }
        Drawable drawableMutate = C1248.m23653(drawableM14961).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(C23223.f72969));
        return drawableMutate;
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public void mo10846(C14146 c14146) {
        int i = this.f75144;
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
                c14146.m32470(mo51258());
                return;
            case 14:
            default:
                throw new RuntimeException(C20778.m46922(i, "Unknown action "));
        }
    }
}
