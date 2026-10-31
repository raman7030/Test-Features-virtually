package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8423 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22357 f25800;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f25801;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1109 f25802;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1032 f25803;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23655 f25804;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8423(C6306 c6306, ActivityC17169 activityC17169, C1109 c1109, C1032 c1032, C22357 c22357, C23655 c23655) {
        super(activityC17169, -1);
        this.f25801 = c6306;
        this.f25802 = c1109;
        this.f25803 = c1032;
        this.f25800 = c22357;
        this.f25804 = c23655;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        int i;
        try {
            int i2 = Integer.parseInt(m31260());
            if (i2 <= 0) {
                throw new Exception();
            }
            m31262();
            C1109 c1109 = this.f25802;
            int iMo3818 = c1109.mo3818();
            int i3 = i2 + iMo3818;
            EnumC15657 enumC15657 = EnumC15657.STATIC;
            C1032 c1032 = this.f25803;
            int i4 = !enumC15657.m36866(c1032.mo3567()) ? 1 : 0;
            Iterator<E> it = c1032.mo3565().iterator();
            while (it.hasNext()) {
                i4 = C11250.m27832(((C23589) it.next()).getType()) ? i4 + 2 : i4 + 1;
            }
            int i5 = iMo3818 - i4;
            int i6 = i3 - i4;
            c1109.m3816(i3);
            ArrayList arrayList = new ArrayList();
            if (EnumC15657.STATIC.m36866(c1032.mo3567())) {
                i = 0;
            } else {
                if (i5 >= 16 || i6 >= 16) {
                    arrayList.add(new C5282(EnumC0841.f3295, i5, i6));
                } else {
                    arrayList.add(new C13808(EnumC0841.f3287, i5, i6));
                }
                i = 1;
            }
            for (C23589 c23589 : c1032.mo3565()) {
                int i7 = i5 + i;
                int i8 = i6 + i;
                int i9 = i + 1;
                if (C11250.m27832(c23589.getType())) {
                    i += 2;
                    if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C5282(EnumC0841.f3157, i7, i8));
                    } else {
                        arrayList.add(new C13808(EnumC0841.f3182, i7, i8));
                    }
                } else {
                    if (c23589.getType().length() == 1) {
                        if (i7 >= 16 || i8 >= 16) {
                            arrayList.add(new C5282(EnumC0841.f3051, i7, i8));
                        } else {
                            arrayList.add(new C13808(EnumC0841.f3099, i7, i8));
                        }
                    } else if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C5282(EnumC0841.f3295, i7, i8));
                    } else {
                        arrayList.add(new C13808(EnumC0841.f3287, i7, i8));
                    }
                    i = i9;
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c1109.m3807(i10, (AbstractC7479) arrayList.get(i10));
            }
            C11418 c11418 = new C11418();
            C3438 c3438 = new C3438(new C22706(c11418));
            C1190 c1190 = new C1190(this.f25800, c1032, c1109);
            try {
                c1190.m4015(c3438);
                c1190.m4018();
                c11418.m28185(c11418.length() - 1);
                C6306 c6306 = this.f25801;
                InterfaceC7785 interfaceC7785M30436 = c6306.f19506.m30436();
                C23655 c23655 = this.f25804;
                interfaceC7785M30436.replace(c23655.m52184(), c23655.m52180(), c11418);
                c6306.f19506.mo25919(c23655.m52184() + TextUtils.indexOf((CharSequence) c11418, '\n', TextUtils.indexOf((CharSequence) c11418, '\n') + 1));
                c6306.f19506.m30511();
                c6306.f19506.m30345(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
