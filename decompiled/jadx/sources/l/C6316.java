package l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C6316 extends BaseAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f19563 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19564;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C6316(String str) {
        this.f19561 = str;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f19563.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView c14615 = (TextView) view;
        if (c14615 == null) {
            c14615 = new C14615(viewGroup.getContext());
            c14615.setTextSize(15.0f);
            c14615.setTextColor(C21943.f70275);
            int i2 = this.f19564;
            int i3 = this.f19562;
            c14615.setPadding(i2, i3, i2, i3);
            c14615.setLineSpacing(0.0f, 1.05f);
        }
        C10925 c10925 = (C10925) this.f19563.get(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c10925.m27244()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f19561).append((CharSequence) "://").append((CharSequence) c10925.m27243()).append((CharSequence) ":").append((CharSequence) String.valueOf(c10925.m27245()));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, length2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C11266.m27880(12.0f)), length, length2, 33);
        c14615.setText(spannableStringBuilder);
        return c14615;
    }
}
