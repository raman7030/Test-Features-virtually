package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1188 extends AbstractC1661 {
    public C1188() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916(b.k) && !c2450.m7923();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[LOOP:0: B:22:0x007e->B:24:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        int i;
        int length;
        final AbstractC3163 abstractC3163;
        Map mapM13204;
        final C16004 c16004;
        c2450.m7907(b.k);
        List listM7909 = c2450.m7909();
        if (listM7909.size() == 1) {
            final InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(0);
            String name = interfaceC17889.getName();
            boolean z = interfaceC17889.mo36969() && name.toLowerCase().endsWith(".bak");
            int length2 = interfaceC17889.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length2 == -1) {
                length2 = name.length();
            } else {
                if (name.toLowerCase().endsWith(".rename")) {
                    i = length2;
                    length = name.length();
                }
                abstractC3163 = (AbstractC3163) c2450.m7922().mo6020();
                boolean zMo13919 = abstractC3163.mo13919();
                mapM13204 = C4459.m13204(zMo13919);
                for (InterfaceC17889 interfaceC178810 : c2450.m7915()) {
                    mapM13204.put(interfaceC178810.getName(), Boolean.valueOf(interfaceC178810.isDirectory()));
                }
                c16004 = new C16004(c2450.m7917(), name, zMo13919, mapM13204, interfaceC17889, c2450, abstractC3163);
                c16004.m31258(R.string.MT_Protector);
                c16004.m31250((CharSequence) interfaceC17889.getName());
                c16004.m31279(6);
                c16004.m31244();
                c16004.m31246(i, length);
                if (z) {
                    c16004.m31247(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.ۜܳ᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            new C2600(interfaceC17889, c2450, abstractC3163, c16004).m20274();
                        }
                    }, (ViewOnLongClickListenerC23553) null);
                } else {
                    c16004.m31247(android.R.string.paste, new ViewOnClickListenerC7935(2, c16004), new ViewOnLongClickListenerC23553(c16004));
                }
                c16004.m31266(!z);
                return;
            }
            length = length2;
            i = 0;
            abstractC3163 = (AbstractC3163) c2450.m7922().mo6020();
            boolean zMo139110 = abstractC3163.mo13919();
            mapM13204 = C4459.m13204(zMo139110);
            while (r1.hasNext()) {
                mapM13204.put(interfaceC178810.getName(), Boolean.valueOf(interfaceC178810.isDirectory()));
            }
            c16004 = new C16004(c2450.m7917(), name, zMo139110, mapM13204, interfaceC17889, c2450, abstractC3163);
            c16004.m31258(R.string.MT_Protector);
            c16004.m31250((CharSequence) interfaceC17889.getName());
            c16004.m31279(6);
            c16004.m31244();
            c16004.m31246(i, length);
            if (z) {
                c16004.m31247(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.ۜܳ᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        new C2600(interfaceC17889, c2450, abstractC3163, c16004).m20274();
                    }
                }, (ViewOnLongClickListenerC23553) null);
            } else {
                c16004.m31247(android.R.string.paste, new ViewOnClickListenerC7935(2, c16004), new ViewOnLongClickListenerC23553(c16004));
            }
            c16004.m31266(!z);
            return;
        }
        ArrayList arrayList = new ArrayList(listM7909);
        Main mainM7917 = c2450.m7917();
        new C0482(this, mainM7917, arrayList, c2450, arrayList, mainM7917).m15027();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4008(C1188 c1188, C2450 c2450, ArrayList arrayList) {
        int i = 1;
        String[] strArr = (String[]) C5378.stream(arrayList).map(new C18554(i)).toArray(new C0288(1));
        String[] strArr2 = (String[]) C5378.stream(arrayList).map(new C12247(i)).toArray(new C14911(1));
        int i2 = C15104.f46193;
        C0994 c0994 = new C0994(C5422.class);
        c0994.m3486(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3477("oldNames", strArr);
        c0994.m3477("newNames", strArr2);
        c0994.m3474(MotionUtils.EASING_TYPE_PATH, c2450.m7926());
        c0994.m3469();
    }
}
