package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U7J7 */
/* JADX INFO: loaded from: classes5.dex */
public class C20641 extends C1908 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public C4547 f63764;

    public C20641(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setKeyListener(null);
    }

    public C20641(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setKeyListener(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46660(C4547 c4547) {
        this.f63764 = c4547;
        if (c4547 == null) {
            setText((CharSequence) null);
        } else {
            setText(c4547.f14164);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4547 m46659() {
        return this.f63764;
    }

    @Override // android.widget.AutoCompleteTextView
    public final CharSequence convertSelectionToString(Object obj) {
        return (CharSequence) obj;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
        if (charSequence instanceof C5888) {
            super.replaceText(charSequence);
            this.f63764 = ((C5888) charSequence).f14483;
        } else if (charSequence instanceof C19970) {
            super.replaceText("");
            this.f63764 = null;
        } else {
            getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC21312.class));
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        List listM33132 = C14486.m33132();
        ArrayList arrayList = new ArrayList(listM33132.size() + 2);
        C19970 c19970 = new C19970(C7050.m16224(R.string.MT_Protector));
        c19970.setSpan(new ForegroundColorSpan(C23223.f72980), 0, c19970.length(), 17);
        arrayList.add(c19970);
        Iterator it = listM33132.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5888((C4547) it.next()));
        }
        SpannableString spannableString = new SpannableString(C7050.m16224(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C23223.f72969), 0, spannableString.length(), 17);
        arrayList.add(spannableString);
        setAdapter(new C21438(getContext(), arrayList));
        super.showDropDown();
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        C4547 c4547;
        if (enumC24133 != EnumC24133.ON_RESUME || (c4547 = this.f63764) == null) {
            return;
        }
        m46660(C14486.m33134(c4547.f14161));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        m46658().getLifecycle().mo21806(this);
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        m46658().getLifecycle().mo21807(this);
    }

    /* JADX INFO: renamed from: ۧ */
    private InterfaceC24784 m46658() {
        for (Object context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof InterfaceC24784) {
                return (InterfaceC24784) context;
            }
        }
        throw new IllegalStateException("View is not attached to a LifecycleOwner");
    }
}
