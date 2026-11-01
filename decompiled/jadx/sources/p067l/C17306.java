package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17306 {

    /* JADX INFO: renamed from: ֫ */
    public final C16055 f51609;

    /* JADX INFO: renamed from: ۧ */
    public final C18107 f51610;

    public C17306(C18107 c18107) {
        this.f51610 = c18107;
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        c16055.m36547();
        this.f51609 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39226(C14387 c14387) {
        C5738 c5738M33002 = c14387.m33002();
        C16055 c16055 = this.f51609;
        c16055.m36541(c14387);
        c16055.m36535(R.string.MT_Protector);
        c16055.m36549(c14387.getSize()).m21096(8);
        if (c5738M33002.m12771()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("0 → ");
            spannableStringBuilder.append((CharSequence) c5738M33002.m12760().getName());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " (").append((CharSequence) C7050.m16224(R.string.MT_Protector)).append((CharSequence) MotionUtils.EASING_TYPE_FORMAT_END);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length, spannableStringBuilder.length(), 17);
            c16055.m36529(R.string.MT_Protector, new C8590(spannableStringBuilder, c5738M33002));
        } else {
            c16055.m36530(c5738M33002.m12774());
        }
        c16055.m36545(c14387.getTime()).m21096(8);
        int i = 1;
        c16055.m36528(R.string.MT_Protector, String.format("%08X", Long.valueOf(c5738M33002.m12772() & 4294967295L))).m21096(8);
        C9154 c9154M36529 = c16055.m36529(R.string.arsc_entry_id, (InterfaceC3986) null);
        c9154M36529.m21096(8);
        c9154M36529.m34623();
        c16055.m36551();
        c16055.m36542();
        Button buttonM36543 = c16055.m36543();
        C18107 c18107 = this.f51610;
        C8126.m18836(buttonM36543, c18107, c14387);
        m39223(Collections.singletonList(c14387));
        C12574 c12574 = (C12574) c18107.m41270();
        if (c12574.m28980()) {
            C4081.f8987.submit(new RunnableC2470(c12574, c14387, c9154M36529, i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39227(final C14387 c14387) {
        C16055 c16055 = this.f51609;
        c16055.m36541(c14387);
        c16055.m36535(R.string.MT_Protector);
        c16055.m36549(c14387.getSize()).m21096(8);
        c16055.m36530(c14387.m33002().m12774());
        c16055.m36545(c14387.getTime()).m21096(8);
        c16055.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.ۧۙ᩻
            @Override // p067l.InterfaceC3986
            /* JADX INFO: renamed from: ֫ */
            public final void mo7947(final TextView textView) {
                final C17306 c17306 = this.f35408;
                C16055 c16056 = c17306.f51609;
                final C14387 c14388 = c14387;
                c16056.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.ܽۙ᩻
                    @Override // p067l.InterfaceC3986
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo7947(TextView textView2) {
                        C13087.m29944(textView, textView2, c17306.f51610.m41270().mo8217(), Collections.singletonList(c14388));
                    }
                });
            }
        }).m21096(8);
        c16055.m36542();
        m39223(Collections.singletonList(c14387));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39225(final List list) {
        C16055 c16055 = this.f51609;
        c16055.m36539(list);
        c16055.m36537(this.f51610.m41284(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long size = 0;
        long jM12774 = 0;
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            size += interfaceC19370.getSize();
            C14387 c14387 = (C14387) interfaceC19370;
            if (!c14387.m33002().m12771()) {
                jM12774 += c14387.m33002().m12774();
            }
        }
        c16055.m36549(size).m21096(8);
        c16055.m36530(jM12774);
        c16055.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.᩻ۙ᩻
            @Override // p067l.InterfaceC3986
            /* JADX INFO: renamed from: ֫ */
            public final void mo7947(final TextView textView) {
                final C17306 c17306 = this.f78083;
                C16055 c16056 = c17306.f51609;
                final List list2 = list;
                c16056.m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.ۡۙ᩻
                    @Override // p067l.InterfaceC3986
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo7947(TextView textView2) {
                        C13087.m29944(textView, textView2, c17306.f51610.m41270().mo8217(), list2);
                    }
                });
            }
        }).m21096(8);
        c16055.m36542();
        m39223((List) C7480.stream(list).map(new C20002(2)).collect(C24205.toList()));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m39223(final List list) {
        InterfaceC1489 interfaceC1489 = new InterfaceC1489() { // from class: l.᩷ۙ᩻
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                C9154 c9154 = (C9154) obj;
                ViewOnClickListenerC16447.m37365(c9154.m21097());
                TextView textViewM21097 = c9154.m21097();
                final C17306 c17306 = this.f69114;
                final List list2 = list;
                textViewM21097.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۙ᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C17306.m39224(c17306, list2);
                    }
                });
            }
        };
        C16055 c16055 = this.f51609;
        c16055.m36540(interfaceC1489);
        c16055.m36548().setOnClickListener(new View.OnClickListener() { // from class: l.ۢۙ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1898 c1898 = new C1898(view.getContext(), view, 0);
                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C17306 c17306 = this.f31395;
                final List list2 = list;
                c1898.m50636(new InterfaceC1583() { // from class: l.ᩳۙ᩻
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C17306.m39220(c17306, list2);
                        return true;
                    }
                });
                c1898.m50639();
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39220(C17306 c17306, List list) {
        new C3896(c17306.f51610, list).m7703(new RunnableC15965(c17306));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39224(C17306 c17306, List list) {
        new C3896(c17306.f51610, list).m7703(new RunnableC15965(c17306));
    }
}
