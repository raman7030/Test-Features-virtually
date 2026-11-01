package p067l;

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
public final class C8372 extends BaseAdapter {

    /* JADX INFO: renamed from: ۙ */
    public final String f22432;

    /* JADX INFO: renamed from: ᩶ */
    public int f22433;

    /* JADX INFO: renamed from: ᩸ */
    public List f22434 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩹ */
    public int f22435;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C8372(String str) {
        this.f22432 = str;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f22434.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView c1567 = (TextView) view;
        if (c1567 == null) {
            c1567 = new C1567(viewGroup.getContext());
            c1567.setTextSize(15.0f);
            c1567.setTextColor(C23223.f72986);
            int i2 = this.f22435;
            int i3 = this.f22433;
            c1567.setPadding(i2, i3, i2, i3);
            c1567.setLineSpacing(0.0f, 1.05f);
        }
        C12752 c12752 = (C12752) this.f22434.get(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) c12752.m29288()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f22432).append((CharSequence) "://").append((CharSequence) c12752.m29287()).append((CharSequence) ":").append((CharSequence) String.valueOf(c12752.m29289()));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length, length2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C13076.m29941(12.0f)), length, length2, 33);
        c1567.setText(spannableStringBuilder);
        return c1567;
    }
}
