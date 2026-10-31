package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩻ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes.dex */
public final class C23473 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f75320;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f75321 = Collections.newSetFromMap(new WeakHashMap());

    public C23473(ActivityC22062 activityC22062) {
        this.f75320 = activityC22062;
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iMax = Math.max(1, this.f75320.f70702.size());
        return (i2 >= iMax && i2 - iMax == 0) ? 1 : 2;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC22062 activityC22062 = this.f75320;
        if (i == 0 || i == 1) {
            return new ViewOnClickListenerC20652(activityC22062, LayoutInflater.from(activityC22062).inflate(R.layout.MT_Protector, viewGroup, false), i == 0);
        }
        ViewOnClickListenerC21357 viewOnClickListenerC21357 = new ViewOnClickListenerC21357(activityC22062, LayoutInflater.from(activityC22062).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f75321.add(viewOnClickListenerC21357.f68801);
        return viewOnClickListenerC21357;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int size;
        if (abstractC3255 instanceof ViewOnClickListenerC21357) {
            ViewOnClickListenerC21357 viewOnClickListenerC21357 = (ViewOnClickListenerC21357) abstractC3255;
            int i2 = i - 1;
            ActivityC22062 activityC22062 = this.f75320;
            if (activityC22062.f70702.isEmpty()) {
                if (i2 == 0) {
                    viewOnClickListenerC21357.f68802.setImageDrawable(activityC22062.f70696);
                    viewOnClickListenerC21357.f68801.setText(R.string.MT_Protector);
                    viewOnClickListenerC21357.f68801.setTextColor(C21943.f70273);
                    viewOnClickListenerC21357.itemView.setClickable(false);
                    viewOnClickListenerC21357.itemView.setLongClickable(false);
                    return;
                }
                size = i - 3;
            } else {
                if (i2 < activityC22062.f70702.size()) {
                    AbstractC13262 abstractC13262 = (AbstractC13262) activityC22062.f70702.get(i2);
                    viewOnClickListenerC21357.f68802.setImageDrawable(activityC22062.f70696);
                    viewOnClickListenerC21357.f68801.setText(abstractC13262.mo10324());
                    if (activityC22062.f70704 != null && abstractC13262.mo14004().equals(activityC22062.f70704)) {
                        viewOnClickListenerC21357.f68801.setTextColor(C21943.f70291);
                        activityC22062.f70704 = null;
                    } else {
                        viewOnClickListenerC21357.f68801.setTextColor(C21943.f70275);
                    }
                    viewOnClickListenerC21357.itemView.setClickable(true);
                    viewOnClickListenerC21357.itemView.setLongClickable(true);
                    return;
                }
                size = i2 - (activityC22062.f70702.size() + 1);
            }
            if (activityC22062.f70699.isEmpty()) {
                if (size == 0) {
                    viewOnClickListenerC21357.f68802.setImageDrawable(activityC22062.f70703);
                    viewOnClickListenerC21357.f68801.setText(R.string.MT_Protector);
                    viewOnClickListenerC21357.f68801.setTextColor(C21943.f70273);
                    viewOnClickListenerC21357.itemView.setClickable(false);
                    viewOnClickListenerC21357.itemView.setLongClickable(false);
                    return;
                }
                return;
            }
            if (size < activityC22062.f70699.size()) {
                AbstractC15440 abstractC15440 = (AbstractC15440) activityC22062.f70699.get(size);
                viewOnClickListenerC21357.f68802.setImageDrawable(activityC22062.f70703);
                viewOnClickListenerC21357.f68801.setText(abstractC15440.getName());
                if (activityC22062.f70695 != null && abstractC15440.getName().equals(activityC22062.f70695)) {
                    viewOnClickListenerC21357.f68801.setTextColor(C21943.f70291);
                    activityC22062.f70695 = null;
                } else {
                    viewOnClickListenerC21357.f68801.setTextColor(C21943.f70275);
                }
                viewOnClickListenerC21357.itemView.setClickable(true);
                viewOnClickListenerC21357.itemView.setLongClickable(true);
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ActivityC22062 activityC22062 = this.f75320;
        return Math.max(1, activityC22062.f70699.size()) + Math.max(1, activityC22062.f70702.size()) + 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51927() {
        for (TextView textView : this.f75321) {
            if (textView.getCurrentTextColor() == C21943.f70291) {
                textView.setTextColor(C21943.f70275);
            }
        }
    }
}
