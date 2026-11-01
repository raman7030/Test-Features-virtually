package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C18315 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f54716 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8848 f54717;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f54718;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f54719;

    public C18315(InterfaceC8848 interfaceC8848, CharSequence charSequence, CharSequence charSequence2) {
        this.f54717 = interfaceC8848;
        this.f54718 = charSequence;
        this.f54719 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4154 m41749() {
        Iterator itMo8422 = this.f54717.mo8420().f44736.mo8422();
        while (true) {
            boolean zHasNext = itMo8422.hasNext();
            ArrayList arrayList = this.f54716;
            CharSequence charSequence = this.f54719;
            CharSequence charSequence2 = this.f54718;
            if (zHasNext) {
                C23600 c23600 = (C23600) itMo8422.next();
                int i = c23600.f75123;
                int i2 = c23600.f75124;
                int i3 = c23600.f75121;
                int i4 = c23600.f75122;
                int i5 = i;
                for (int i6 = i2; i5 < i3 && i6 < i4 && charSequence2.charAt(i5) == charSequence.charAt(i6) && C13061.m29890(charSequence2.charAt(i5)); i6++) {
                    i5++;
                }
                int i7 = i5 - i;
                int i8 = i + i7;
                int i9 = i2 + i7;
                int i10 = i3;
                for (int i11 = i4; i8 < i10 && i9 < i11; i11--) {
                    int i12 = i10 - 1;
                    if (charSequence2.charAt(i12) != charSequence.charAt(i11 - 1) || !C13061.m29890(charSequence2.charAt(i12))) {
                        break;
                    }
                    i10--;
                }
                int i13 = i3 - i10;
                int i14 = i3 - i13;
                int i15 = i4 - i13;
                while (i8 < i14 && C13061.m29890(charSequence2.charAt(i8))) {
                    i8++;
                }
                while (i8 < i14 && C13061.m29890(charSequence2.charAt(i14 - 1))) {
                    i14--;
                }
                while (i9 < i15 && C13061.m29890(charSequence.charAt(i9))) {
                    i9++;
                }
                while (i9 < i15 && C13061.m29890(charSequence.charAt(i15 - 1))) {
                    i15--;
                }
                C23600 c23601 = new C23600(i8, i14, i9, i15);
                if (!c23601.m52411() && !C10269.m23885(charSequence2.subSequence(i8, i14), charSequence.subSequence(i9, i15), EnumC7587.IGNORE_WHITESPACES)) {
                    arrayList.add(c23601);
                }
            } else {
                return C24941.m54809(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
