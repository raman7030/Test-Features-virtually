package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U7J7 */
/* JADX INFO: loaded from: classes5.dex */
public class C19226 extends C21488 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2292 f60533;

    public C19226(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setKeyListener(null);
    }

    public C19226(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setKeyListener(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44366(C2292 c2292) {
        this.f60533 = c2292;
        if (c2292 == null) {
            setText((CharSequence) null);
        } else {
            setText(c2292.f11359);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2292 m44365() {
        return this.f60533;
    }

    @Override // android.widget.AutoCompleteTextView
    public final CharSequence convertSelectionToString(Object obj) {
        return (CharSequence) obj;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
        if (charSequence instanceof C3703) {
            super.replaceText(charSequence);
            this.f60533 = ((C3703) charSequence).f11682;
        } else if (charSequence instanceof C18520) {
            super.replaceText("");
            this.f60533 = null;
        } else {
            getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC19932.class));
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        List listM31048 = C12749.m31048();
        ArrayList arrayList = new ArrayList(listM31048.size() + 2);
        C18520 c18520 = new C18520(C4925.m14327(R.string.MT_Protector));
        c18520.setSpan(new ForegroundColorSpan(C21943.f70269), 0, c18520.length(), 17);
        arrayList.add(c18520);
        Iterator it = listM31048.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3703((C2292) it.next()));
        }
        SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70257), 0, spannableString.length(), 17);
        arrayList.add(spannableString);
        setAdapter(new C20065(getContext(), arrayList));
        super.showDropDown();
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        C2292 c2292;
        if (enumC22901 != EnumC22901.ON_RESUME || (c2292 = this.f60533) == null) {
            return;
        }
        m44366(C12749.m31050(c2292.f11356));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        m44364().getLifecycle().mo19833(this);
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        m44364().getLifecycle().mo19834(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC23586 m44364() {
        for (Object context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof InterfaceC23586) {
                return (InterfaceC23586) context;
            }
        }
        throw new IllegalStateException("View is not attached to a LifecycleOwner");
    }
}
