package l;

import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16828 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f51656;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f51657;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11813 f51658;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f51659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient int f51660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient WeakReference f51661;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient String f51662;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19883 f51663;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17534 f51664;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m39585(C19883 c19883, C11813 c11813) {
        C11233.m27805(c19883, "typeIcon");
        C11233.m27805(c11813, "icon");
        this.f51663 = c19883;
        this.f51658 = c11813;
        this.f51662 = null;
        this.f51661 = null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39589() {
        this.f51658 = null;
        this.f51660++;
        this.f51662 = null;
        this.f51661 = null;
    }

    public C16828(String str, String str2) {
        C11233.m27805(str, "name");
        C11233.m27805(str2, MotionUtils.EASING_TYPE_PATH);
        this.f51659 = str;
        this.f51657 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39579(AbstractActivityC3346 abstractActivityC3346) {
        C11233.m27805(abstractActivityC3346, "activity");
        C19883 c19883 = this.f51663;
        if (c19883 == null) {
            c19883 = C19883.f64236;
        }
        C17534 c17534 = this.f51664;
        C3535 c3535 = new C3535(abstractActivityC3346);
        c3535.m10732(this.f51659);
        c3535.m10733(new C12002(c19883));
        c3535.m10738(this.f51657);
        c3535.m10730();
        if (c17534 == null) {
            c3535.m10737(c19883 == C19883.f64181 ? "goto" : "locate");
        } else {
            c3535.m10737("open-ns");
            c3535.m10731(c17534.m40974());
            c3535.m10734(c17534.m40975());
        }
        c3535.m10736();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39580(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        C11233.m27805(abstractActivityC3346, "activity");
        C11185 c11185 = new C11185(abstractActivityC3346, this, runnable);
        c11185.m36260(R.string.MT_Protector);
        c11185.m36256(R.string.MT_Protector, this.f51659);
        c11185.m36256(R.string.MT_Protector, this.f51657);
        C17534 c17534 = this.f51664;
        if (c17534 != null) {
            c11185.m36256(R.string.MT_Protector, null);
            TextInputLayout textInputLayoutM36259 = c11185.m36259(2);
            EditText editTextM36254 = c11185.m36254(2);
            editTextM36254.setKeyListener(null);
            AbstractC3577 abstractC3577M31047 = C12749.m31047(c17534.m40974());
            editTextM36254.setText(abstractC3577M31047 != null ? abstractC3577M31047.getName() : null);
            textInputLayoutM36259.setExpandedHintEnabled(false);
            textInputLayoutM36259.setEndIconMode(-1);
            textInputLayoutM36259.setEndIconDrawable(R.drawable.MT_Protector);
            ArrayList arrayList = new ArrayList(C12749.m31046());
            C14759 c14759 = new C14759();
            c14759.f45074 = arrayList.indexOf(abstractC3577M31047);
            final ViewOnClickListenerC22745 viewOnClickListenerC22745 = new ViewOnClickListenerC22745(editTextM36254, abstractActivityC3346, (CharSequence[]) C5378.stream(arrayList).map(new C5812(0, new C10046())).toArray(new C11457(0)), c14759, arrayList, textInputLayoutM36259);
            textInputLayoutM36259.setEndIconOnClickListener(viewOnClickListenerC22745);
            editTextM36254.setOnClickListener(viewOnClickListenerC22745);
            if (c14759.f45074 == -1) {
                editTextM36254.requestFocus();
                textInputLayoutM36259.setError(C4925.m14327(R.string.MT_Protector));
            }
            editTextM36254.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ܰۘܳ
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        viewOnClickListenerC22745.onClick(view);
                    }
                }
            });
            if (c14759.f45074 == -1) {
                c11185.m36262();
                return;
            }
        }
        c11185.m36262();
        C4925.m14316(new RunnableC7412(4, c11185), 200L);
        c11185.m36254(0).selectAll();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39591(String str) {
        C11233.m27805(str, "<set-?>");
        this.f51659 = str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m39592() {
        return this.f51659;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39582(C11813 c11813) {
        this.f51658 = c11813;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11813 m39590() {
        return this.f51658;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39584(C19883 c19883) {
        this.f51663 = c19883;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19883 m39597() {
        return this.f51663;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39576(int i) {
        this.f51660 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m39593() {
        return this.f51660;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39577(String str) {
        this.f51662 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39596() {
        return this.f51662;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39578(WeakReference weakReference) {
        this.f51661 = weakReference;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final WeakReference m39595() {
        return this.f51661;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m39588() {
        return this.f51657;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39594(String str) {
        if (C11233.m27802((Object) this.f51657, (Object) str)) {
            return;
        }
        this.f51657 = str;
        synchronized (this) {
            this.f51663 = null;
            this.f51658 = null;
            this.f51660++;
            this.f51662 = null;
            this.f51661 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39586(boolean z) {
        this.f51656 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39587() {
        return this.f51656;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17534 m39598() {
        return this.f51664;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39583(C17534 c17534) {
        C17534 c17535;
        if (c17534 != null) {
            c17534.getClass();
            ConcurrentMapC10942 concurrentMapC10942 = (ConcurrentMapC10942) C9068.f27497;
            Object objComputeIfAbsent = C17997.computeIfAbsent(concurrentMapC10942, c17534, new C8888(1, new C18240(c17534)));
            C11233.m27803(objComputeIfAbsent, "computeIfAbsent(...)");
            c17535 = (C17534) objComputeIfAbsent;
        } else {
            c17535 = null;
        }
        this.f51664 = c17535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39581(C10130 c10130) {
        c10130.m25439(this.f51659);
        c10130.m25439(this.f51657);
        C17534 c17534 = this.f51664;
        if (c17534 != null) {
            c10130.mo13231(0);
            c10130.m25439(c17534.m40976().toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C16828.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C11233.m27800(obj, "null cannot be cast to non-null type bin.mt.manager.bottom.BookmarksManager.Item");
        C16828 c16828 = (C16828) obj;
        return C11233.m27802((Object) this.f51659, (Object) c16828.f51659) && C11233.m27802((Object) this.f51657, (Object) c16828.f51657) && C11233.m27802(this.f51664, c16828.f51664);
    }

    public final int hashCode() {
        int iM27349 = C11010.m27349(this.f51659.hashCode() * 31, 31, this.f51657);
        C17534 c17534 = this.f51664;
        return iM27349 + (c17534 != null ? c17534.hashCode() : 0);
    }
}
