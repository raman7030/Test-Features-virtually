package p067l;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB2A */
/* JADX INFO: loaded from: classes3.dex */
public final class C15650 implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicInteger f44769 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩹ */
    public final Object f44770;

    public C15650(Object obj) {
        this.f44770 = obj;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f44770).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f44770).onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f44770).afterTextChanged(editable);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f44769.get() <= 0 || !(obj instanceof AbstractC23698)) {
            ((SpanWatcher) this.f44770).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f44769.get() <= 0 || !(obj instanceof AbstractC23698)) {
            ((SpanWatcher) this.f44770).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c A[PHI: r10
      0x001c: PHI (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:8:0x0011, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f44769.get() <= 0 || !(obj instanceof AbstractC23698)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i5 = i;
                i6 = i3;
            } else {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                } else {
                    i5 = i;
                    i6 = i3;
                }
            }
            ((SpanWatcher) this.f44770).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35545() {
        this.f44769.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35546() {
        this.f44769.decrementAndGet();
    }
}
