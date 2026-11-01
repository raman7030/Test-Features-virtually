package p067l;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC13332 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final C6724 f37438 = new C6724();

    /* JADX INFO: renamed from: ۜۧ */
    public C14102 f37439;

    /* JADX INFO: renamed from: ܳۧ */
    public List f37440 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܿۧ */
    public AbstractC17724 f37441;

    /* JADX INFO: renamed from: ᩳۧ */
    public TextView f37442;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C14849 f37443;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TutorialOrderListActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC23564(2, this));
        InterfaceC11020 interfaceC11020M40278 = AbstractC17724.m40278(this);
        interfaceC11020M40278.mo10552(new C5285(this).m49291());
        this.f37441 = interfaceC11020M40278.build();
        this.f37439 = (C14102) m12277(R.id.MT_Protector);
        this.f37443 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        this.f37442 = textView;
        textView.setText(R.string.MT_Protector);
        this.f37442.setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۜۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6724 c6724 = ActivityC13332.f37438;
                new C11991(this.f74539, true).m22250();
            }
        });
        this.f37443.setAdapter(new C7967(this));
        new C11991(this, false).m22250();
        this.f37439.m32017(new InterfaceC6726() { // from class: l.᩶ۜۡ
            @Override // p067l.InterfaceC6726
            /* JADX INFO: renamed from: ᩳ */
            public final void mo3900() {
                C6724 c6724 = ActivityC13332.f37438;
                new C11991(this.f67431, true).m22250();
            }
        });
        f37438.m15372(this, new InterfaceC21477() { // from class: l.ۙۜۡ
            @Override // p067l.InterfaceC21477
            /* JADX INFO: renamed from: ֫ */
            public final void mo15100(Object obj) {
                C6724 c6724 = ActivityC13332.f37438;
                new C11991(this.f17086, true).m22250();
            }
        });
    }
}
