package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I69B */
/* JADX INFO: loaded from: classes5.dex */
public class C19603 extends C20945 {

    /* JADX INFO: renamed from: ܳۧ */
    public final AdapterView.OnItemSelectedListener f59628;

    /* JADX INFO: renamed from: ܿۧ */
    public final ArrayAdapter f59629;

    /* JADX INFO: renamed from: ᩻ۧ */
    public Spinner f59630;

    public C19603(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19603(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f59628 = new C18261(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f59629 = arrayAdapter;
        arrayAdapter.clear();
        if (m47258() != null) {
            for (CharSequence charSequence : m47258()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // p067l.AbstractC12898, p067l.C4360
    /* JADX INFO: renamed from: ۛ */
    public final void mo9034() {
        this.f59630.performClick();
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۬ */
    public final void mo9048() {
        super.mo9048();
        ArrayAdapter arrayAdapter = this.f59629;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        int length;
        Spinner spinner = (Spinner) c22486.itemView.findViewById(R.id.spinner);
        this.f59630 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f59629);
        this.f59630.setOnItemSelectedListener(this.f59628);
        Spinner spinner2 = this.f59630;
        String value = getValue();
        CharSequence[] charSequenceArrM47253 = m47253();
        if (value != null && charSequenceArrM47253 != null) {
            length = charSequenceArrM47253.length;
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (!TextUtils.equals(charSequenceArrM47253[length].toString(), value));
        } else {
            length = -1;
            break;
        }
        spinner2.setSelection(length);
        super.mo5137(c22486);
    }
}
