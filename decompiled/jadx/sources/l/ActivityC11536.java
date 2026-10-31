package l;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11536 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final C4583 f34441 = new C4583();

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C12346 f34442;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public List f34443 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16157 f34444;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public TextView f34445;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C13132 f34446;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TutorialOrderListActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC22302(2, this));
        InterfaceC9103 interfaceC9103M38086 = AbstractC16157.m38086(this);
        interfaceC9103M38086.mo8505(new C3069(this).m46968());
        this.f34444 = interfaceC9103M38086.build();
        this.f34442 = (C12346) m10241(R.id.MT_Protector);
        this.f34446 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        this.f34445 = textView;
        textView.setText(R.string.MT_Protector);
        this.f34445.setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۜۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4583 c4583 = ActivityC11536.f34441;
                new C10125(this.f71817, true).m20274();
            }
        });
        this.f34446.setAdapter(new C5891(this));
        new C10125(this, false).m20274();
        this.f34442.m29957(new InterfaceC4585() { // from class: l.᩶ۜۡ
            @Override // l.InterfaceC4585
            /* JADX INFO: renamed from: ᩳ */
            public final void mo1502() {
                C4583 c4583 = ActivityC11536.f34441;
                new C10125(this.f64789, true).m20274();
            }
        });
        f34441.m13483(this, new InterfaceC20106() { // from class: l.ۙۜۡ
            @Override // l.InterfaceC20106
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo13218(Object obj) {
                C4583 c4583 = ActivityC11536.f34441;
                new C10125(this.f14259, true).m20274();
            }
        });
    }
}
