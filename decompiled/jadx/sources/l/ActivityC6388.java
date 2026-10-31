package l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6388 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final C4583 f19757 = new C4583();

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public List f19758 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C13132 f19759;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16157 f19760;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public TextView f19761;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C12346 f19762;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TutorialListActivity";
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
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC10893(6, this));
        this.f19760 = C20500.m46962((Context) this, true);
        this.f19762 = (C12346) m10241(R.id.MT_Protector);
        this.f19759 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        this.f19761 = textView;
        textView.setText(R.string.MT_Protector);
        this.f19761.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩻ۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4583 c4583 = ActivityC6388.f19757;
                new C12738(this.f15670, true).m20274();
            }
        });
        this.f19759.setAdapter(new C10622(this));
        new C12738(this, false).m20274();
        this.f19762.m29957(new InterfaceC4585() { // from class: l.ۗ᩻ۡ
            @Override // l.InterfaceC4585
            /* JADX INFO: renamed from: ᩳ */
            public final void mo1502() {
                C4583 c4583 = ActivityC6388.f19757;
                new C12738(this.f11313, true).m20274();
            }
        });
        f19757.m13483(this, new InterfaceC20106() { // from class: l.۬᩻ۡ
            @Override // l.InterfaceC20106
            /* JADX INFO: renamed from: ֫ */
            public final void mo13218(Object obj) {
                C4583 c4583 = ActivityC6388.f19757;
                new C12738(this.f40166, true).m20274();
            }
        });
    }
}
