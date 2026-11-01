package p067l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes5.dex */
public final class C19212 extends C21438 {

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ AtomicBoolean f57406;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19212(Context context, List list, AtomicBoolean atomicBoolean) {
        super(context, list);
        this.f57406 = atomicBoolean;
    }

    @Override // p067l.C21438
    /* JADX INFO: renamed from: ֫ */
    public final void mo9744(TextView textView, boolean z) {
        textView.setTextColor(this.f57406.get() ? C23223.f72995 : C23223.f73015);
    }
}
