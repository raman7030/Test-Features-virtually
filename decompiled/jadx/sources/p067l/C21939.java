package p067l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes4.dex */
public final class C21939 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: ۗ */
    public List f68970;

    /* JADX INFO: renamed from: ۙ */
    public C8527 f68971;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ViewOnClickListenerC10539 f68972;

    /* JADX INFO: renamed from: ᩶ */
    public ViewOnClickListenerC14071 f68974;

    /* JADX INFO: renamed from: ᩸ */
    public ForegroundColorSpan f68975 = new ForegroundColorSpan(C23223.f72969);

    /* JADX INFO: renamed from: ᩹ */
    public ForegroundColorSpan f68976 = new ForegroundColorSpan(C23223.f72969);

    /* JADX INFO: renamed from: ۬ */
    public RelativeSizeSpan[] f68973 = {new RelativeSizeSpan(0.92f), new RelativeSizeSpan(0.84f), new RelativeSizeSpan(0.76f), new RelativeSizeSpan(0.68f), new RelativeSizeSpan(0.6f)};

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C21939(ViewOnClickListenerC10539 viewOnClickListenerC10539, ViewOnClickListenerC14071 viewOnClickListenerC14071) {
        this.f68972 = viewOnClickListenerC10539;
        this.f68974 = viewOnClickListenerC14071;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.f68970;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f68970.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeSizeSpan[] relativeSizeSpanArr;
        if (view == null) {
            view = LayoutInflater.from(this.f68974).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        SpannableString spannableString = (SpannableString) this.f68970.get(i);
        RelativeSizeSpan[] relativeSizeSpanArr2 = (RelativeSizeSpan[]) spannableString.getSpans(0, spannableString.length(), RelativeSizeSpan.class);
        if (relativeSizeSpanArr2 != null && relativeSizeSpanArr2.length > 0) {
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr2) {
                spannableString.removeSpan(relativeSizeSpan);
            }
        }
        if (this.f68971.f22884 > 0) {
            int length = spannableString.length();
            int i2 = this.f68971.f22884;
            if (length >= i2) {
                int i3 = 0;
                while (true) {
                    relativeSizeSpanArr = this.f68973;
                    if (i3 >= relativeSizeSpanArr.length - 1 || i2 <= 0) {
                        break;
                    }
                    spannableString.setSpan(relativeSizeSpanArr[i3], Math.max(0, i2 - 5), i2, 33);
                    i2 -= 5;
                    i3++;
                }
                if (i2 > 0) {
                    spannableString.setSpan(relativeSizeSpanArr[relativeSizeSpanArr.length - 1], 0, i2, 33);
                }
            }
            if (spannableString.length() / 2 < this.f68971.f22884) {
                textView.setEllipsize(TextUtils.TruncateAt.START);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setText(spannableString);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f68971 == null) {
            this.f68971 = new C8527(this);
        }
        return this.f68971;
    }
}
