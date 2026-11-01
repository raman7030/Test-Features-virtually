package p067l;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes.dex */
public final class C5565 extends AbstractC23000 {

    /* JADX INFO: renamed from: ۖ */
    public final C10970 f13449;

    /* JADX INFO: renamed from: ۜ */
    public boolean f13450;

    /* JADX INFO: renamed from: ۡ */
    public int f13451;

    /* JADX INFO: renamed from: ۢ */
    public int f13452;

    /* JADX INFO: renamed from: ܺ */
    public final TextWatcher f13453;

    /* JADX INFO: renamed from: ᩷ */
    public int f13454;

    /* JADX INFO: renamed from: ᩻ */
    public final ForegroundColorSpan f13455;

    static {
        ApplicationC14266.m56479(48);
    }

    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ֫ */
    public native void mo12316(CharSequence charSequence, int i, int i2, int i3);

    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ֫ */
    public final void mo12318(C14146 c14146, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        c14146.m32500().replace(this.f13452, this.f13454, string);
        c14146.mo27941(string.length() + this.f13452);
    }

    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo12319(C14146 c14146, CharSequence charSequence) {
        String string = ((SpannableString) charSequence).toString();
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int i = this.f13452;
        InterfaceC9768 interfaceC9768M32501 = c14146.m32500();
        int i2 = this.f13454;
        this.f13449.getClass();
        interfaceC9768M32500.replace(i, C10970.m25317(interfaceC9768M32501, i2), string);
        c14146.mo27941(string.length() + this.f13452);
        return true;
    }

    public C5565(Context context) {
        super(context);
        this.f13455 = new ForegroundColorSpan(C23223.f72969);
        this.f13449 = new C10970();
        this.f13453 = new C6906(this);
    }

    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ֫ */
    public final void mo12317(C14146 c14146) {
        C9729 c9729Mo28589 = c14146.m32500().mo28589();
        try {
            boolean z = c9729Mo28589.length() > 100000;
            this.f13450 = z;
            this.f13449.m25325(z ? new C24340(100000, c9729Mo28589) : c9729Mo28589);
            c9729Mo28589.close();
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC23000
    /* JADX INFO: renamed from: ֫ */
    public final C16963 mo12315(int i, CharSequence charSequence) {
        int length;
        C10970 c10970 = this.f13449;
        c10970.getClass();
        final String strM25320 = C10970.m25320(i, charSequence);
        if (strM25320.isEmpty() || this.f13451 < (length = i - strM25320.length())) {
            return null;
        }
        StringBuilder sbM17248 = C7470.m17248(strM25320);
        sbM17248.append(C10970.m25321(i, charSequence));
        final String string = sbM17248.toString();
        InterfaceC19157 interfaceC19157Filter = c10970.m25323().filter(new Predicate() { // from class: l.᩹ܽܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m52684or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C5565.m12314(this.f75360, string, (C11641) obj);
            }
        });
        final String lowerCase = strM25320.toLowerCase();
        InterfaceC19157 map = interfaceC19157Filter.map(new Function() { // from class: l.۬ܽܿ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C8247.m19039(strM25320, lowerCase, (C20989) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        }).filter(new C14282()).sorted(new C24513(1)).map(new C21659(0, this));
        int i2 = C16963.f50191;
        C16963 c16963 = (C16963) map.collect(C24205.toCollection(new C10259()));
        if (c16963.isEmpty()) {
            return null;
        }
        if (c16963.size() == 1 && ((SpannableString) c16963.get(0)).toString().equals(strM25320)) {
            return null;
        }
        c16963.m38551(length);
        this.f13452 = length;
        this.f13454 = i;
        return c16963;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m12314(C5565 c5565, String str, C11641 c11641) {
        return !c11641.m47322().equals(str) || c5565.f13449.m25322(c11641) > 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ SpannableString m12312(C5565 c5565, C12271 c12271) {
        ForegroundColorSpan foregroundColorSpan = c5565.f13455;
        SpannableString spannableString = new SpannableString(c12271.f34285);
        boolean z = true;
        int i = -1;
        int i2 = -1;
        for (int i3 : c12271.f34286) {
            if (i == -1) {
                i2 = i3 + 1;
                i = i3;
            } else if (i3 == i2) {
                i2 = i3 + 1;
            } else {
                spannableString.setSpan(z ? foregroundColorSpan : new ForegroundColorSpan(C23223.f72969), i, i2, 33);
                i2 = i3 + 1;
                i = i3;
                z = false;
            }
        }
        if (i != -1) {
            if (!z) {
                foregroundColorSpan = new ForegroundColorSpan(C23223.f72969);
            }
            spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        }
        return spannableString;
    }
}
