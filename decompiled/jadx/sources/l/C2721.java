package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.translation.TranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2721 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0603 f8491;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f8492;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f8493;

    public C2721(C0603 c0603, ArrayList arrayList, ArrayList arrayList2) {
        this.f8491 = c0603;
        this.f8492 = arrayList;
        this.f8493 = arrayList2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20268(this.f8491.f2339, R.string.MT_Protector, 200);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        Iterator it = C13265.m32202().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f8493;
            if (zHasNext) {
                C16709 c16709 = (C16709) it.next();
                ArrayList arrayList2 = this.f8492;
                arrayList2.clear();
                c16709.m39318(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it2.next()).newInstance();
                        translationEngine.init(c16709.m39304());
                        arrayList.add(new C2015(c16709, translationEngine));
                    } catch (Throwable th) {
                        c16709.m39290(th);
                    }
                }
            } else {
                arrayList.add(new C13575());
                return;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f8493;
        C0603 c0603 = this.f8491;
        c0603.f2340 = arrayList;
        c0603.f2344 = C13265.m32218();
        Set<C3426> set = c0603.f2345;
        C11233.m27803(set, "access$getTranslatorBinders$p(...)");
        for (C3426 c3426 : set) {
            C2072 c2072M10424 = c3426 != null ? c3426.m10424() : null;
            C11233.m27799(c2072M10424);
            c2072M10424.m6822();
            c2072M10424.m6819();
            c2072M10424.m6821(c0603.f2340);
            c2072M10424.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f8491.f2339.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C0603 c0603 = this.f8491;
        c0603.f2342 = false;
        Runnable runnable = c0603.f2343;
        if (runnable != null) {
            ((RunnableC19719) runnable).run();
            c0603.f2343 = null;
        }
    }
}
