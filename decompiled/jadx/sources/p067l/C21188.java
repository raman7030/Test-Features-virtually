package p067l;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7IR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21188 extends AbstractC5094 {

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC4560 f66589;

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC4560 f66590;

    /* JADX INFO: renamed from: ֫ */
    public final int f66591;

    static {
        C14578 c14578M27218 = AbstractC11897.m27218();
        c14578M27218.m33325((Integer) 1, "builtin:copyLine");
        c14578M27218.m33325((Integer) 2, "builtin:cutLine");
        c14578M27218.m33325((Integer) 3, "builtin:deleteLine");
        c14578M27218.m33325((Integer) 4, "builtin:emptyLine");
        c14578M27218.m33325((Integer) 5, "builtin:replaceLine");
        c14578M27218.m33325((Integer) 6, "builtin:duplicateLine");
        c14578M27218.m33325((Integer) 7, "builtin:caseLow2Up");
        c14578M27218.m33325((Integer) 8, "builtin:caseUp2Low");
        c14578M27218.m33325((Integer) 9, "builtin:increaseIndent");
        c14578M27218.m33325((Integer) 10, "builtin:decreaseIndent");
        c14578M27218.m33325((Integer) 11, "builtin:toggleComment");
        c14578M27218.m33325((Integer) 12, "builtin:shrinkCode");
        c14578M27218.m33325((Integer) 13, "builtin:formatCode");
        c14578M27218.m33325((Integer) 14, "builtin:customize");
        AbstractC11897 abstractC11897Mo20378 = c14578M27218.mo20378();
        f66590 = abstractC11897Mo20378;
        f66589 = abstractC11897Mo20378.mo9635();
    }

    /* JADX INFO: renamed from: ܿ */
    public static AbstractC8146 m47856() {
        return ((AbstractC11897) f66590).mo9635().keySet();
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final String mo10845() {
        InterfaceC4560 interfaceC4560 = f66590;
        int i = this.f66591;
        String str = (String) interfaceC4560.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m47855(String str) {
        return (Integer) f66589.get(str);
    }

    public C21188(int i) {
        this.f66591 = i;
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10847(C14146 c14146, boolean z, boolean z2, int i, int i2) {
        switch (this.f66591) {
            case 11:
                return !c14146.m32462().isEmpty();
            case 12:
                return c14146.m32515() != null;
            case 13:
                return c14146.m32599() != null;
            default:
                return true;
        }
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ۧ */
    public final C17833 mo10848() {
        int i;
        int i2 = this.f66591;
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
                throw new RuntimeException(C20778.m46922(i2, "Unknown action "));
        }
        return new C17833(C7050.m16224(i), this);
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo10844(Context context) {
        int i;
        int i2 = this.f66591;
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
        return C1059.m14961(context.getResources(), i, context.getTheme());
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final void mo10846(C14146 c14146) {
        int i = this.f66591;
        switch (i) {
            case 1:
                C24204.m53506(c14146);
                return;
            case 2:
                C24204.m53513(c14146);
                return;
            case 3:
                C24204.m53520(c14146);
                return;
            case 4:
                C24204.m53515(c14146);
                return;
            case 5:
                C24204.m53522(c14146);
                return;
            case 6:
                C24204.m53518(c14146);
                return;
            case 7:
                C24204.m53508(c14146, true);
                return;
            case 8:
                C24204.m53508(c14146, false);
                return;
            case 9:
                C24204.m53523(c14146);
                return;
            case 10:
                C24204.m53516(c14146);
                return;
            case 11:
                C24204.m53510(c14146);
                return;
            case 12:
                C24204.m53511(c14146);
                return;
            case 13:
                C24204.m53509(c14146);
                return;
            case 14:
                c14146.getContext().startActivity(new Intent(c14146.getContext(), (Class<?>) ActivityC8446.class));
                return;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }
}
