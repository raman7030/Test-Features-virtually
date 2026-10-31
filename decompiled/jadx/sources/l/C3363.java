package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes.dex */
public final class C3363 extends AbstractC21708 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9050 f10641;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f10642;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f10643;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f10644;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextWatcher f10645;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f10646;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ForegroundColorSpan f10647;

    static {
        ApplicationC12518.m30701(48);
    }

    @Override // l.AbstractC21708
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void mo10279(CharSequence charSequence, int i, int i2, int i3);

    @Override // l.AbstractC21708
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10281(C12392 c12392, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        c12392.m30436().replace(this.f10644, this.f10646, string);
        c12392.mo25919(string.length() + this.f10644);
    }

    @Override // l.AbstractC21708
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo10282(C12392 c12392, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int i = this.f10644;
        InterfaceC7785 interfaceC7785M30437 = c12392.m30436();
        int i2 = this.f10646;
        this.f10641.getClass();
        interfaceC7785M30436.replace(i, C9050.m23372(interfaceC7785M30437, i2), string);
        c12392.mo25919(string.length() + this.f10644);
        return true;
    }

    public C3363(Context context) {
        super(context);
        this.f10647 = new ForegroundColorSpan(C21943.f70257);
        this.f10641 = new C9050();
        this.f10645 = new C4774(this);
    }

    @Override // l.AbstractC21708
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10280(C12392 c12392) {
        C7744 c7744Mo26556 = c12392.m30436().mo26556();
        try {
            boolean z = c7744Mo26556.length() > 100000;
            this.f10642 = z;
            this.f10641.m23380(z ? new C23118(100000, c7744Mo26556) : c7744Mo26556);
            c7744Mo26556.close();
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC21708
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15356 mo10278(int i, CharSequence charSequence) {
        int length;
        C9050 c9050 = this.f10641;
        c9050.getClass();
        final String strM23375 = C9050.m23375(i, charSequence);
        if (strM23375.isEmpty() || this.f10643 < (length = i - strM23375.length())) {
            return null;
        }
        StringBuilder sbM15339 = C5368.m15339(strM23375);
        sbM15339.append(C9050.m23376(i, charSequence));
        final String string = sbM15339.toString();
        InterfaceC17664 interfaceC17664Filter = c9050.m23378().filter(new Predicate() { // from class: l.᩹ܽܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C3363.m10277(this.f72634, string, (C9756) obj);
            }
        });
        final String lowerCase = strM23375.toLowerCase();
        InterfaceC17664 map = interfaceC17664Filter.map(new Function() { // from class: l.۬ܽܿ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C6185.m17107(strM23375, lowerCase, (C19592) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }).filter(new C12535()).sorted(new C23300(1)).map(new C20297(0, this));
        int i2 = C15356.f47066;
        C15356 c15356 = (C15356) map.collect(C22976.toCollection(new C8302()));
        if (c15356.isEmpty()) {
            return null;
        }
        if (c15356.size() == 1 && ((SpannableString) c15356.get(0)).toString().equals(strM23375)) {
            return null;
        }
        c15356.m36393(length);
        this.f10644 = length;
        this.f10646 = i;
        return c15356;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m10277(C3363 c3363, String str, C9756 c9756) {
        return !c9756.m45027().equals(str) || c3363.f10641.m23377(c9756) > 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ SpannableString m10275(C3363 c3363, C10419 c10419) {
        ForegroundColorSpan foregroundColorSpan = c3363.f10647;
        SpannableString spannableString = new SpannableString(c10419.f31320);
        boolean z = true;
        int i = -1;
        int i2 = -1;
        for (int i3 : c10419.f31321) {
            if (i == -1) {
                i2 = i3 + 1;
                i = i3;
            } else if (i3 == i2) {
                i2 = i3 + 1;
            } else {
                spannableString.setSpan(z ? foregroundColorSpan : new ForegroundColorSpan(C21943.f70257), i, i2, 33);
                i2 = i3 + 1;
                i = i3;
                z = false;
            }
        }
        if (i != -1) {
            if (!z) {
                foregroundColorSpan = new ForegroundColorSpan(C21943.f70257);
            }
            spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        }
        return spannableString;
    }
}
