package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3498 extends AbstractC3947 {
    public C3498() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964(C0168b.f616k) && !c4697.m9971();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[LOOP:0: B:22:0x007e->B:24:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        int i;
        int length;
        final AbstractC5375 abstractC5375;
        Map mapM15085;
        final C17579 c17579;
        c4697.m9955(C0168b.f616k);
        List listM9957 = c4697.m9957();
        if (listM9957.size() == 1) {
            final InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            String name = interfaceC19370.getName();
            boolean z = interfaceC19370.mo39135() && name.toLowerCase().endsWith(".bak");
            int length2 = interfaceC19370.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length2 == -1) {
                length2 = name.length();
            } else {
                if (name.toLowerCase().endsWith(".rename")) {
                    i = length2;
                    length = name.length();
                }
                abstractC5375 = (AbstractC5375) c4697.m9970().mo8217();
                boolean zMo15799 = abstractC5375.mo15799();
                mapM15085 = C6606.m15085(zMo15799);
                for (InterfaceC19370 interfaceC19371 : c4697.m9963()) {
                    mapM15085.put(interfaceC19371.getName(), Boolean.valueOf(interfaceC19371.isDirectory()));
                }
                c17579 = new C17579(c4697.m9965(), name, zMo15799, mapM15085, interfaceC19370, c4697, abstractC5375);
                c17579.m33344(R.string.MT_Protector);
                c17579.m33336((CharSequence) interfaceC19370.getName());
                c17579.m33365(6);
                c17579.m33330();
                c17579.m33332(i, length);
                if (z) {
                    c17579.m33333(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.ۜܳ᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            new C4840(interfaceC19370, c4697, abstractC5375, c17579).m22250();
                        }
                    }, (ViewOnLongClickListenerC24753) null);
                } else {
                    c17579.m33333(android.R.string.paste, new ViewOnClickListenerC9910(2, c17579), new ViewOnLongClickListenerC24753(c17579));
                }
                c17579.m33352(!z);
                return;
            }
            length = length2;
            i = 0;
            abstractC5375 = (AbstractC5375) c4697.m9970().mo8217();
            boolean zMo157910 = abstractC5375.mo15799();
            mapM15085 = C6606.m15085(zMo157910);
            while (r1.hasNext()) {
                mapM15085.put(interfaceC19371.getName(), Boolean.valueOf(interfaceC19371.isDirectory()));
            }
            c17579 = new C17579(c4697.m9965(), name, zMo157910, mapM15085, interfaceC19370, c4697, abstractC5375);
            c17579.m33344(R.string.MT_Protector);
            c17579.m33336((CharSequence) interfaceC19370.getName());
            c17579.m33365(6);
            c17579.m33330();
            c17579.m33332(i, length);
            if (z) {
                c17579.m33333(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.ۜܳ᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        new C4840(interfaceC19370, c4697, abstractC5375, c17579).m22250();
                    }
                }, (ViewOnLongClickListenerC24753) null);
            } else {
                c17579.m33333(android.R.string.paste, new ViewOnClickListenerC9910(2, c17579), new ViewOnLongClickListenerC24753(c17579));
            }
            c17579.m33352(!z);
            return;
        }
        ArrayList arrayList = new ArrayList(listM9957);
        Main mainM9965 = c4697.m9965();
        new C2827(this, mainM9965, arrayList, c4697, arrayList, mainM9965).m16937();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6250(C3498 c3498, C4697 c4697, ArrayList arrayList) {
        int i = 1;
        String[] strArr = (String[]) C7480.stream(arrayList).map(new C20002(i)).toArray(new C2642(1));
        String[] strArr2 = (String[]) C7480.stream(arrayList).map(new C14008(i)).toArray(new C16539(1));
        int i2 = C16723.f49313;
        C3313 c3313 = new C3313(C7522.class);
        c3313.m5789(c4697);
        c3313.m5784(c4697.m9970());
        c3313.m5780("oldNames", strArr);
        c3313.m5780("newNames", strArr2);
        c3313.m5777(MotionUtils.EASING_TYPE_PATH, c4697.m9974());
        c3313.m5772();
    }
}
