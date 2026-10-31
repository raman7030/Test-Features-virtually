package l;

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
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20592 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f66289;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6480 f66290;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8597 f66291;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC12313 f66293;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f66294 = new ForegroundColorSpan(C21943.f70257);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f66295 = new ForegroundColorSpan(C21943.f70257);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public RelativeSizeSpan[] f66292 = {new RelativeSizeSpan(0.92f), new RelativeSizeSpan(0.84f), new RelativeSizeSpan(0.76f), new RelativeSizeSpan(0.68f), new RelativeSizeSpan(0.6f)};

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20592(ViewOnClickListenerC8597 viewOnClickListenerC8597, ViewOnClickListenerC12313 viewOnClickListenerC12313) {
        this.f66291 = viewOnClickListenerC8597;
        this.f66293 = viewOnClickListenerC12313;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.f66289;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f66289.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeSizeSpan[] relativeSizeSpanArr;
        if (view == null) {
            view = LayoutInflater.from(this.f66293).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        SpannableString spannableString = (SpannableString) this.f66289.get(i);
        RelativeSizeSpan[] relativeSizeSpanArr2 = (RelativeSizeSpan[]) spannableString.getSpans(0, spannableString.length(), RelativeSizeSpan.class);
        if (relativeSizeSpanArr2 != null && relativeSizeSpanArr2.length > 0) {
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr2) {
                spannableString.removeSpan(relativeSizeSpan);
            }
        }
        if (this.f66290.f20009 > 0) {
            int length = spannableString.length();
            int i2 = this.f66290.f20009;
            if (length >= i2) {
                int i3 = 0;
                while (true) {
                    relativeSizeSpanArr = this.f66292;
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
            if (spannableString.length() / 2 < this.f66290.f20009) {
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
        if (this.f66290 == null) {
            this.f66290 = new C6480(this);
        }
        return this.f66290;
    }
}
