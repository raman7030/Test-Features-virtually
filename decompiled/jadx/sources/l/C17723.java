package l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes5.dex */
public final class C17723 extends C20065 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f54215;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17723(Context context, List list, AtomicBoolean atomicBoolean) {
        super(context, list);
        this.f54215 = atomicBoolean;
    }

    @Override // l.C20065
    /* JADX INFO: renamed from: ֫ */
    public final void mo7683(TextView textView, boolean z) {
        textView.setTextColor(this.f54215.get() ? C21943.f70284 : C21943.f70304);
    }
}
