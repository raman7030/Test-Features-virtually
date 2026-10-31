package l;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7IR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19801 extends AbstractC2867 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2306 f63952;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2306 f63953;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f63954;

    static {
        C12847 c12847M25201 = AbstractC10026.m25201();
        c12847M25201.m31239((Integer) 1, "builtin:copyLine");
        c12847M25201.m31239((Integer) 2, "builtin:cutLine");
        c12847M25201.m31239((Integer) 3, "builtin:deleteLine");
        c12847M25201.m31239((Integer) 4, "builtin:emptyLine");
        c12847M25201.m31239((Integer) 5, "builtin:replaceLine");
        c12847M25201.m31239((Integer) 6, "builtin:duplicateLine");
        c12847M25201.m31239((Integer) 7, "builtin:caseLow2Up");
        c12847M25201.m31239((Integer) 8, "builtin:caseUp2Low");
        c12847M25201.m31239((Integer) 9, "builtin:increaseIndent");
        c12847M25201.m31239((Integer) 10, "builtin:decreaseIndent");
        c12847M25201.m31239((Integer) 11, "builtin:toggleComment");
        c12847M25201.m31239((Integer) 12, "builtin:shrinkCode");
        c12847M25201.m31239((Integer) 13, "builtin:formatCode");
        c12847M25201.m31239((Integer) 14, "builtin:customize");
        AbstractC10026 abstractC10026Mo18430 = c12847M25201.mo18430();
        f63953 = abstractC10026Mo18430;
        f63952 = abstractC10026Mo18430.mo7567();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m45545() {
        return ((AbstractC10026) f63953).mo7567().keySet();
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final String mo8778() {
        InterfaceC2306 interfaceC2306 = f63953;
        int i = this.f63954;
        String str = (String) interfaceC2306.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m45544(String str) {
        return (Integer) f63952.get(str);
    }

    public C19801(int i) {
        this.f63954 = i;
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8780(C12392 c12392, boolean z, boolean z2, int i, int i2) {
        switch (this.f63954) {
            case 11:
                return !c12392.m30398().isEmpty();
            case 12:
                return c12392.m30451() != null;
            case 13:
                return c12392.m30535() != null;
            default:
                return true;
        }
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ۧ */
    public final C16271 mo8781() {
        int i;
        int i2 = this.f63954;
        switch (i2) {
            case 1:
                i = R.string.MT_Protector;
                break;
            case 2:
                i = R.string.MT_Protector;
                break;
            case 3:
                i = R.string.MT_Protector;
                break;
            case 4:
                i = R.string.MT_Protector;
                break;
            case 5:
                i = R.string.MT_Protector;
                break;
            case 6:
                i = R.string.MT_Protector;
                break;
            case 7:
                i = R.string.MT_Protector;
                break;
            case 8:
                i = R.string.MT_Protector;
                break;
            case 9:
                i = R.string.MT_Protector;
                break;
            case 10:
                i = R.string.MT_Protector;
                break;
            case 11:
                i = R.string.MT_Protector;
                break;
            case 12:
                i = R.string.MT_Protector;
                break;
            case 13:
                i = R.string.MT_Protector;
                break;
            case 14:
                i = R.string.MT_Protector;
                break;
            default:
                throw new RuntimeException(C19370.m44628(i2, "Unknown action "));
        }
        return new C16271(C4925.m14327(i), this);
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo8777(Context context) {
        int i;
        int i2 = this.f63954;
        switch (i2) {
            case 1:
                i = R.drawable.MT_Protector;
                break;
            case 2:
                i = R.drawable.MT_Protector;
                break;
            case 3:
                i = R.drawable.MT_Protector;
                break;
            case 4:
                i = R.drawable.MT_Protector;
                break;
            case 5:
                i = R.drawable.MT_Protector;
                break;
            case 6:
                i = R.drawable.MT_Protector;
                break;
            case 7:
                i = R.drawable.MT_Protector;
                break;
            case 8:
                i = R.drawable.MT_Protector;
                break;
            case 9:
                i = R.drawable.MT_Protector;
                break;
            case 10:
                i = R.drawable.MT_Protector;
                break;
            case 11:
                i = R.drawable.MT_Protector;
                break;
            case 12:
                i = R.drawable.MT_Protector;
                break;
            case 13:
                i = R.drawable.MT_Protector;
                break;
            case 14:
                i = R.drawable.MT_Protector;
                break;
            default:
                throw new RuntimeException("Unknown action " + i2);
        }
        return C4369.m13097(context.getResources(), i, context.getTheme());
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final void mo8779(C12392 c12392) {
        int i = this.f63954;
        switch (i) {
            case 1:
                C22975.m51114(c12392);
                return;
            case 2:
                C22975.m51121(c12392);
                return;
            case 3:
                C22975.m51128(c12392);
                return;
            case 4:
                C22975.m51123(c12392);
                return;
            case 5:
                C22975.m51130(c12392);
                return;
            case 6:
                C22975.m51126(c12392);
                return;
            case 7:
                C22975.m51116(c12392, true);
                return;
            case 8:
                C22975.m51116(c12392, false);
                return;
            case 9:
                C22975.m51131(c12392);
                return;
            case 10:
                C22975.m51124(c12392);
                return;
            case 11:
                C22975.m51118(c12392);
                return;
            case 12:
                C22975.m51119(c12392);
                return;
            case 13:
                C22975.m51117(c12392);
                return;
            case 14:
                c12392.getContext().startActivity(new Intent(c12392.getContext(), (Class<?>) ActivityC6394.class));
                return;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }
}
