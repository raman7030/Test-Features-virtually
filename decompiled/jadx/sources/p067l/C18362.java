package p067l;

import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18362 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f54836;

    /* JADX INFO: renamed from: ۜ */
    public String f54837;

    /* JADX INFO: renamed from: ۧ */
    public C13596 f54838;

    /* JADX INFO: renamed from: ܳ */
    public String f54839;

    /* JADX INFO: renamed from: ܽ */
    public transient int f54840;

    /* JADX INFO: renamed from: ܿ */
    public transient WeakReference f54841;

    /* JADX INFO: renamed from: ᩳ */
    public transient String f54842;

    /* JADX INFO: renamed from: ᩷ */
    public C21265 f54843;

    /* JADX INFO: renamed from: ᩻ */
    public C19033 f54844;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m41821(C21265 c21265, C13596 c13596) {
        C13045.m29867(c21265, "typeIcon");
        C13045.m29867(c13596, "icon");
        this.f54843 = c21265;
        this.f54838 = c13596;
        this.f54842 = null;
        this.f54841 = null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final synchronized void m41825() {
        this.f54838 = null;
        this.f54840++;
        this.f54842 = null;
        this.f54841 = null;
    }

    public C18362(String str, String str2) {
        C13045.m29867(str, "name");
        C13045.m29867(str2, MotionUtils.EASING_TYPE_PATH);
        this.f54839 = str;
        this.f54837 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41815(AbstractActivityC5549 abstractActivityC5549) {
        C13045.m29867(abstractActivityC5549, "activity");
        C21265 c21265 = this.f54843;
        if (c21265 == null) {
            c21265 = C21265.f66872;
        }
        C19033 c19033 = this.f54844;
        C5729 c5729 = new C5729(abstractActivityC5549);
        c5729.m12729(this.f54839);
        c5729.m12730(new C13776(c21265));
        c5729.m12735(this.f54837);
        c5729.m12727();
        if (c19033 == null) {
            c5729.m12734(c21265 == C21265.f66817 ? "goto" : "locate");
        } else {
            c5729.m12734("open-ns");
            c5729.m12728(c19033.m43234());
            c5729.m12731(c19033.m43235());
        }
        c5729.m12733();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41816(AbstractActivityC5549 abstractActivityC5549, Runnable runnable) {
        C13045.m29867(abstractActivityC5549, "activity");
        C12999 c12999 = new C12999(abstractActivityC5549, this, runnable);
        c12999.m38421(R.string.MT_Protector);
        c12999.m38417(R.string.MT_Protector, this.f54839);
        c12999.m38417(R.string.MT_Protector, this.f54837);
        C19033 c19033 = this.f54844;
        if (c19033 != null) {
            c12999.m38417(R.string.MT_Protector, null);
            TextInputLayout textInputLayoutM38420 = c12999.m38420(2);
            EditText editTextM38415 = c12999.m38415(2);
            editTextM38415.setKeyListener(null);
            AbstractC5769 abstractC5769M33131 = C14486.m33131(c19033.m43234());
            editTextM38415.setText(abstractC5769M33131 != null ? abstractC5769M33131.getName() : null);
            textInputLayoutM38420.setExpandedHintEnabled(false);
            textInputLayoutM38420.setEndIconMode(-1);
            textInputLayoutM38420.setEndIconDrawable(R.drawable.MT_Protector);
            ArrayList arrayList = new ArrayList(C14486.m33130());
            C16396 c16396 = new C16396();
            c16396.f48188 = arrayList.indexOf(abstractC5769M33131);
            final ViewOnClickListenerC23985 viewOnClickListenerC23985 = new ViewOnClickListenerC23985(editTextM38415, abstractActivityC5549, (CharSequence[]) C7480.stream(arrayList).map(new C7892(0, new C11916())).toArray(new C13257(0)), c16396, arrayList, textInputLayoutM38420);
            textInputLayoutM38420.setEndIconOnClickListener(viewOnClickListenerC23985);
            editTextM38415.setOnClickListener(viewOnClickListenerC23985);
            if (c16396.f48188 == -1) {
                editTextM38415.requestFocus();
                textInputLayoutM38420.setError(C7050.m16224(R.string.MT_Protector));
            }
            editTextM38415.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ܰۘܳ
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        viewOnClickListenerC23985.onClick(view);
                    }
                }
            });
            if (c16396.f48188 == -1) {
                c12999.m38423();
                return;
            }
        }
        c12999.m38423();
        C7050.m16213(new RunnableC9413(4, c12999), 200L);
        c12999.m38415(0).selectAll();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41827(String str) {
        C13045.m29867(str, "<set-?>");
        this.f54839 = str;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m41828() {
        return this.f54839;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41818(C13596 c13596) {
        this.f54838 = c13596;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13596 m41826() {
        return this.f54838;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41820(C21265 c21265) {
        this.f54843 = c21265;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C21265 m41833() {
        return this.f54843;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41812(int i) {
        this.f54840 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m41829() {
        return this.f54840;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41813(String str) {
        this.f54842 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m41832() {
        return this.f54842;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41814(WeakReference weakReference) {
        this.f54841 = weakReference;
    }

    /* JADX INFO: renamed from: ܿ */
    public final WeakReference m41831() {
        return this.f54841;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m41824() {
        return this.f54837;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41830(String str) {
        if (C13045.m29864((Object) this.f54837, (Object) str)) {
            return;
        }
        this.f54837 = str;
        synchronized (this) {
            this.f54843 = null;
            this.f54838 = null;
            this.f54840++;
            this.f54842 = null;
            this.f54841 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41822(boolean z) {
        this.f54836 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41823() {
        return this.f54836;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C19033 m41834() {
        return this.f54844;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41819(C19033 c19033) {
        C19033 c19034;
        if (c19033 != null) {
            c19033.getClass();
            ConcurrentMapC12768 concurrentMapC12768 = (ConcurrentMapC12768) C10987.f30434;
            Object objComputeIfAbsent = C19473.computeIfAbsent(concurrentMapC12768, c19033, new C10816(1, new C19704(c19033)));
            C13045.m29865(objComputeIfAbsent, "computeIfAbsent(...)");
            c19034 = (C19033) objComputeIfAbsent;
        } else {
            c19034 = null;
        }
        this.f54844 = c19034;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41817(C11996 c11996) {
        c11996.m27459(this.f54839);
        c11996.m27459(this.f54837);
        C19033 c19033 = this.f54844;
        if (c19033 != null) {
            c11996.mo15113(0);
            c11996.m27459(c19033.m43236().toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18362.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13045.m29862(obj, "null cannot be cast to non-null type bin.mt.manager.bottom.BookmarksManager.Item");
        C18362 c18362 = (C18362) obj;
        return C13045.m29864((Object) this.f54839, (Object) c18362.f54839) && C13045.m29864((Object) this.f54837, (Object) c18362.f54837) && C13045.m29864(this.f54844, c18362.f54844);
    }

    public final int hashCode() {
        int iM29411 = C12832.m29411(this.f54839.hashCode() * 31, 31, this.f54837);
        C19033 c19033 = this.f54844;
        return iM29411 + (c19033 != null ? c19033.hashCode() : 0);
    }
}
