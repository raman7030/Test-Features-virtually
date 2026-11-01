package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8WQ */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC22720 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩳۧ */
    public static final /* synthetic */ int f71666 = 0;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TutorialMarkdownActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC20197(3, this));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("title");
        byte[] byteArrayExtra = intent.getByteArrayExtra("markdown");
        if (stringExtra == null || byteArrayExtra == null) {
            finish();
            return;
        }
        try {
            String strM13637 = C6054.m13637(byteArrayExtra);
            setTitle(stringExtra);
            C21852.m49285((Context) this, false).mo40282((TextView) m12277(R.id.textView), strM13637);
        } catch (RuntimeException unused) {
            finish();
        }
    }
}
