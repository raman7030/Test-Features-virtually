package p067l;

import android.os.Bundle;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1E0 */
/* JADX INFO: loaded from: classes5.dex */
public class C18229 extends AbstractC16003 {

    /* JADX INFO: renamed from: ۗ */
    public C10748 f54405;

    /* JADX INFO: renamed from: ۙ */
    public boolean f54406;

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo16322() {
        return false;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֫ */
    public final void mo36362(byte[] bArr) {
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۜ */
    public final String mo16323() {
        return null;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo36368() {
        return false;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܳ */
    public final int mo16324() {
        return R.drawable.MT_Protector;
    }

    public C18229() {
        super(R.layout.MT_Protector);
        this.f54405 = C10748.m24758();
        this.f54406 = true;
        m36367("000000-0000-0000-0000-000000000002");
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        view.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC10850(2, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41459(C18229 c18229) {
        if (c18229.f54405.m24761()) {
            c18229.m36360(new C24780(2));
        }
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܺ */
    public final String mo16325() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩷ */
    public final String mo16326() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onResume() {
        View view;
        super.onResume();
        m36360(new C4148());
        if (this.f54406 && this.f54405.m24761() && (view = getView()) != null) {
            view.post(new RunnableC14306(1, this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41460(C18229 c18229, ActivityC18686 activityC18686) {
        if (c18229.f54406 && activityC18686.m42595()) {
            c18229.f54406 = false;
        }
    }
}
