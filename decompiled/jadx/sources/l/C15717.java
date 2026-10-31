package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15717 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14401 f48469;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16560 f48470;

    public C15717(C16560 c16560) {
        this.f48470 = c16560;
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        c14401.m34413();
        this.f48469 = c14401;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37057(C12645 c12645) {
        C3545 c3545M30924 = c12645.m30924();
        C14401 c14401 = this.f48469;
        c14401.m34407(c12645);
        c14401.m34401(R.string.MT_Protector);
        c14401.m34415(c12645.getSize()).m19153(8);
        if (c3545M30924.m10790()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("0 → ");
            spannableStringBuilder.append((CharSequence) c3545M30924.m10779().getName());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " (").append((CharSequence) C4925.m14327(R.string.MT_Protector)).append((CharSequence) MotionUtils.EASING_TYPE_FORMAT_END);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, spannableStringBuilder.length(), 17);
            c14401.m34395(R.string.MT_Protector, new C6546(spannableStringBuilder, c3545M30924));
        } else {
            c14401.m34396(c3545M30924.m10793());
        }
        c14401.m34411(c12645.getTime()).m19153(8);
        int i = 1;
        c14401.m34394(R.string.MT_Protector, String.format("%08X", Long.valueOf(c3545M30924.m10791() & 4294967295L))).m19153(8);
        C7140 c7140M34395 = c14401.m34395(R.string.arsc_entry_id, (InterfaceC1702) null);
        c7140M34395.m19153(8);
        c7140M34395.m32521();
        c14401.m34417();
        c14401.m34408();
        Button buttonM34409 = c14401.m34409();
        C16560 c16560 = this.f48470;
        C6058.m16907(buttonM34409, c16560, c12645);
        m37054(Collections.singletonList(c12645));
        C10738 c10738 = (C10738) c16560.m39044();
        if (c10738.m26936()) {
            C1802.f6208.submit(new RunnableC0107(c10738, c12645, c7140M34395, i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37058(final C12645 c12645) {
        C14401 c14401 = this.f48469;
        c14401.m34407(c12645);
        c14401.m34401(R.string.MT_Protector);
        c14401.m34415(c12645.getSize()).m19153(8);
        c14401.m34396(c12645.m30924().m10793());
        c14401.m34411(c12645.getTime()).m19153(8);
        c14401.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.ۧۙ᩻
            @Override // l.InterfaceC1702
            /* JADX INFO: renamed from: ֫ */
            public final void mo5714(final TextView textView) {
                final C15717 c15717 = this.f32432;
                C14401 c14402 = c15717.f48469;
                final C12645 c12646 = c12645;
                c14402.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.ܽۙ᩻
                    @Override // l.InterfaceC1702
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo5714(TextView textView2) {
                        C11277.m27883(textView, textView2, c15717.f48470.m39044().mo6020(), Collections.singletonList(c12646));
                    }
                });
            }
        }).m19153(8);
        c14401.m34408();
        m37054(Collections.singletonList(c12645));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37056(final List list) {
        C14401 c14401 = this.f48469;
        c14401.m34405(list);
        c14401.m34403(this.f48470.m39058(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long size = 0;
        long jM10793 = 0;
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            size += interfaceC17889.getSize();
            C12645 c12645 = (C12645) interfaceC17889;
            if (!c12645.m30924().m10790()) {
                jM10793 += c12645.m30924().m10793();
            }
        }
        c14401.m34415(size).m19153(8);
        c14401.m34396(jM10793);
        c14401.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.᩻ۙ᩻
            @Override // l.InterfaceC1702
            /* JADX INFO: renamed from: ֫ */
            public final void mo5714(final TextView textView) {
                final C15717 c15717 = this.f75335;
                C14401 c14402 = c15717.f48469;
                final List list2 = list;
                c14402.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.ۡۙ᩻
                    @Override // l.InterfaceC1702
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo5714(TextView textView2) {
                        C11277.m27883(textView, textView2, c15717.f48470.m39044().mo6020(), list2);
                    }
                });
            }
        }).m19153(8);
        c14401.m34408();
        m37054((List) C5378.stream(list).map(new C18554(2)).collect(C22976.toList()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37054(final List list) {
        InterfaceC13041 interfaceC13041 = new InterfaceC13041() { // from class: l.᩷ۙ᩻
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C7140 c7140 = (C7140) obj;
                ViewOnClickListenerC14813.m35217(c7140.m19154());
                TextView textViewM19154 = c7140.m19154();
                final C15717 c15717 = this.f66432;
                final List list2 = list;
                textViewM19154.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۙ᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C15717.m37055(c15717, list2);
                    }
                });
            }
        };
        C14401 c14401 = this.f48469;
        c14401.m34406(interfaceC13041);
        c14401.m34414().setOnClickListener(new View.OnClickListener() { // from class: l.ۢۙ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21282 c21282 = new C21282(view.getContext(), view, 0);
                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C15717 c15717 = this.f28446;
                final List list2 = list;
                c21282.m48302(new InterfaceC14930() { // from class: l.ᩳۙ᩻
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C15717.m37051(c15717, list2);
                        return true;
                    }
                });
                c21282.m48305();
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37051(C15717 c15717, List list) {
        new C1607(c15717.f48470, list).m5473(new RunnableC14306(c15717));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37055(C15717 c15717, List list) {
        new C1607(c15717.f48470, list).m5473(new RunnableC14306(c15717));
    }
}
