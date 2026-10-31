package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1E0 */
/* JADX INFO: loaded from: classes5.dex */
public class C16688 extends AbstractC14346 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8817 f51220;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51221;

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo14418() {
        return false;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫ */
    public final void mo34229(byte[] bArr) {
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۜ */
    public final String mo14419() {
        return null;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo34235() {
        return false;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܳ */
    public final int mo14420() {
        return R.drawable.MT_Protector;
    }

    public C16688() {
        super(R.layout.MT_Protector);
        this.f51220 = C8817.m22788();
        this.f51221 = true;
        m34234("000000-0000-0000-0000-000000000002");
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        view.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC8924(2, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39224(C16688 c16688) {
        if (c16688.f51220.m22791()) {
            c16688.m34227(new C23581(2));
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܺ */
    public final String mo14421() {
        return C4925.m14327(R.string.MT_Protector);
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩷ */
    public final String mo14422() {
        return C4925.m14327(R.string.MT_Protector);
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onResume() {
        View view;
        super.onResume();
        m34227(new C1872());
        if (this.f51221 && this.f51220.m22791() && (view = getView()) != null) {
            view.post(new RunnableC12560(1, this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39225(C16688 c16688, ActivityC17169 activityC17169) {
        if (c16688.f51221 && activityC17169.m40350()) {
            c16688.f51221 = false;
        }
    }
}
