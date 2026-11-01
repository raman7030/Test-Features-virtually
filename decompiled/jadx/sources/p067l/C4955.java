package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final class C4955 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C2942 f11286;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ArrayList f11287;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ArrayList f11288;

    public C4955(C2942 c2942, ArrayList arrayList, ArrayList arrayList2) {
        this.f11286 = c2942;
        this.f11287 = arrayList;
        this.f11288 = arrayList2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22244(this.f11286.f5113, R.string.MT_Protector, 200);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        Iterator it = C14976.m34301().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f11288;
            if (zHasNext) {
                C18249 c18249 = (C18249) it.next();
                ArrayList arrayList2 = this.f11287;
                arrayList2.clear();
                c18249.m41554(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it2.next()).newInstance();
                        translationEngine.init(c18249.m41540());
                        arrayList.add(new C4284(c18249, translationEngine));
                    } catch (Throwable th) {
                        c18249.m41526(th);
                    }
                }
            } else {
                arrayList.add(new C15270());
                return;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ArrayList arrayList = this.f11288;
        C2942 c2942 = this.f11286;
        c2942.f5114 = arrayList;
        c2942.f5118 = C14976.m34317();
        Set<C5625> set = c2942.f5119;
        C13045.m29865(set, "access$getTranslatorBinders$p(...)");
        for (C5625 c5625 : set) {
            C4338 c4338M12463 = c5625 != null ? c5625.m12463() : null;
            C13045.m29861(c4338M12463);
            c4338M12463.m8948();
            c4338M12463.m8945();
            c4338M12463.m8947(c2942.f5114);
            c4338M12463.notifyDataSetChanged();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f11286.f5113.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C2942 c2942 = this.f11286;
        c2942.f5116 = false;
        Runnable runnable = c2942.f5117;
        if (runnable != null) {
            ((RunnableC21110) runnable).run();
            c2942.f5117 = null;
        }
    }
}
