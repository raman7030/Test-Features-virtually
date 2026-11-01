package p067l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC8440 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final C6724 f22630 = new C6724();

    /* JADX INFO: renamed from: ۜۧ */
    public List f22631 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܳۧ */
    public C14849 f22632;

    /* JADX INFO: renamed from: ܿۧ */
    public AbstractC17724 f22633;

    /* JADX INFO: renamed from: ᩳۧ */
    public TextView f22634;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C14102 f22635;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TutorialListActivity";
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
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC12721(6, this));
        this.f22633 = C21852.m49285((Context) this, true);
        this.f22635 = (C14102) m12277(R.id.MT_Protector);
        this.f22632 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        this.f22634 = textView;
        textView.setText(R.string.MT_Protector);
        this.f22634.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩻ۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6724 c6724 = ActivityC8440.f22630;
                new C14475(this.f18504, true).m22250();
            }
        });
        this.f22632.setAdapter(new C12464(this));
        new C14475(this, false).m22250();
        this.f22635.m32017(new InterfaceC6726() { // from class: l.ۗ᩻ۡ
            @Override // p067l.InterfaceC6726
            /* JADX INFO: renamed from: ᩳ */
            public final void mo3900() {
                C6724 c6724 = ActivityC8440.f22630;
                new C14475(this.f14119, true).m22250();
            }
        });
        f22630.m15372(this, new InterfaceC21477() { // from class: l.۬᩻ۡ
            @Override // p067l.InterfaceC21477
            /* JADX INFO: renamed from: ֫ */
            public final void mo15100(Object obj) {
                C6724 c6724 = ActivityC8440.f22630;
                new C14475(this.f43237, true).m22250();
            }
        });
    }
}
