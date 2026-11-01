package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10374 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C23616 f28713;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C8362 f28714;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C3422 f28715;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C3349 f28716;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ C24850 f28717;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10374(C8362 c8362, ActivityC18686 activityC18686, C3422 c3422, C3349 c3349, C23616 c23616, C24850 c24850) {
        super(activityC18686, -1);
        this.f28714 = c8362;
        this.f28715 = c3422;
        this.f28716 = c3349;
        this.f28713 = c23616;
        this.f28717 = c24850;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        int i;
        try {
            int i2 = Integer.parseInt(m33346());
            if (i2 <= 0) {
                throw new Exception();
            }
            m33348();
            C3422 c3422 = this.f28715;
            int iMo6075 = c3422.mo6075();
            int i3 = i2 + iMo6075;
            EnumC17248 enumC17248 = EnumC17248.STATIC;
            C3349 c3349 = this.f28716;
            int i4 = !enumC17248.m39032(c3349.mo5854()) ? 1 : 0;
            Iterator<E> it = c3349.mo5852().iterator();
            while (it.hasNext()) {
                i4 = C13061.m29894(((C24787) it.next()).getType()) ? i4 + 2 : i4 + 1;
            }
            int i5 = iMo6075 - i4;
            int i6 = i3 - i4;
            c3422.m6073(i3);
            ArrayList arrayList = new ArrayList();
            if (EnumC17248.STATIC.m39032(c3349.mo5854())) {
                i = 0;
            } else {
                if (i5 >= 16 || i6 >= 16) {
                    arrayList.add(new C7388(EnumC3167.f6069, i5, i6));
                } else {
                    arrayList.add(new C15491(EnumC3167.f6061, i5, i6));
                }
                i = 1;
            }
            for (C24787 c24787 : c3349.mo5852()) {
                int i7 = i5 + i;
                int i8 = i6 + i;
                int i9 = i + 1;
                if (C13061.m29894(c24787.getType())) {
                    i += 2;
                    if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C7388(EnumC3167.f5931, i7, i8));
                    } else {
                        arrayList.add(new C15491(EnumC3167.f5956, i7, i8));
                    }
                } else {
                    if (c24787.getType().length() == 1) {
                        if (i7 >= 16 || i8 >= 16) {
                            arrayList.add(new C7388(EnumC3167.f5825, i7, i8));
                        } else {
                            arrayList.add(new C15491(EnumC3167.f5873, i7, i8));
                        }
                    } else if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C7388(EnumC3167.f6069, i7, i8));
                    } else {
                        arrayList.add(new C15491(EnumC3167.f6061, i7, i8));
                    }
                    i = i9;
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c3422.m6064(i10, (AbstractC9476) arrayList.get(i10));
            }
            C13220 c13220 = new C13220();
            C5636 c5636 = new C5636(new C23948(c13220));
            C3499 c3499 = new C3499(this.f28713, c3349, c3422);
            try {
                c3499.m6257(c5636);
                c3499.m6260();
                c13220.m30229(c13220.length() - 1);
                C8362 c8362 = this.f28714;
                InterfaceC9768 interfaceC9768M32500 = c8362.f22377.m32500();
                C24850 c24850 = this.f28717;
                interfaceC9768M32500.replace(c24850.m54587(), c24850.m54583(), c13220);
                c8362.f22377.mo27941(c24850.m54587() + TextUtils.indexOf((CharSequence) c13220, '\n', TextUtils.indexOf((CharSequence) c13220, '\n') + 1));
                c8362.f22377.m32575();
                c8362.f22377.m32409(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
