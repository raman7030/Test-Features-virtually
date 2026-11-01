package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩻ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes.dex */
public final class C24677 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC23336 f78067;

    /* JADX INFO: renamed from: ۧ */
    public Set f78068 = Collections.newSetFromMap(new WeakHashMap());

    public C24677(ActivityC23336 activityC23336) {
        this.f78067 = activityC23336;
    }

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int iMax = Math.max(1, this.f78067.f73419.size());
        return (i2 >= iMax && i2 - iMax == 0) ? 1 : 2;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC23336 activityC23336 = this.f78067;
        if (i == 0 || i == 1) {
            return new ViewOnClickListenerC21996(activityC23336, LayoutInflater.from(activityC23336).inflate(R.layout.MT_Protector, viewGroup, false), i == 0);
        }
        ViewOnClickListenerC22666 viewOnClickListenerC22666 = new ViewOnClickListenerC22666(activityC23336, LayoutInflater.from(activityC23336).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f78068.add(viewOnClickListenerC22666.f71495);
        return viewOnClickListenerC22666;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        int size;
        if (abstractC5462 instanceof ViewOnClickListenerC22666) {
            ViewOnClickListenerC22666 viewOnClickListenerC22666 = (ViewOnClickListenerC22666) abstractC5462;
            int i2 = i - 1;
            ActivityC23336 activityC23336 = this.f78067;
            if (activityC23336.f73419.isEmpty()) {
                if (i2 == 0) {
                    viewOnClickListenerC22666.f71496.setImageDrawable(activityC23336.f73413);
                    viewOnClickListenerC22666.f71495.setText(R.string.MT_Protector);
                    viewOnClickListenerC22666.f71495.setTextColor(C23223.f72984);
                    viewOnClickListenerC22666.itemView.setClickable(false);
                    viewOnClickListenerC22666.itemView.setLongClickable(false);
                    return;
                }
                size = i - 3;
            } else {
                if (i2 < activityC23336.f73419.size()) {
                    AbstractC14973 abstractC14973 = (AbstractC14973) activityC23336.f73419.get(i2);
                    viewOnClickListenerC22666.f71496.setImageDrawable(activityC23336.f73413);
                    viewOnClickListenerC22666.f71495.setText(abstractC14973.mo12362());
                    if (activityC23336.f73421 != null && abstractC14973.mo15884().equals(activityC23336.f73421)) {
                        viewOnClickListenerC22666.f71495.setTextColor(C23223.f73002);
                        activityC23336.f73421 = null;
                    } else {
                        viewOnClickListenerC22666.f71495.setTextColor(C23223.f72986);
                    }
                    viewOnClickListenerC22666.itemView.setClickable(true);
                    viewOnClickListenerC22666.itemView.setLongClickable(true);
                    return;
                }
                size = i2 - (activityC23336.f73419.size() + 1);
            }
            if (activityC23336.f73416.isEmpty()) {
                if (size == 0) {
                    viewOnClickListenerC22666.f71496.setImageDrawable(activityC23336.f73420);
                    viewOnClickListenerC22666.f71495.setText(R.string.MT_Protector);
                    viewOnClickListenerC22666.f71495.setTextColor(C23223.f72984);
                    viewOnClickListenerC22666.itemView.setClickable(false);
                    viewOnClickListenerC22666.itemView.setLongClickable(false);
                    return;
                }
                return;
            }
            if (size < activityC23336.f73416.size()) {
                AbstractC17043 abstractC17043 = (AbstractC17043) activityC23336.f73416.get(size);
                viewOnClickListenerC22666.f71496.setImageDrawable(activityC23336.f73420);
                viewOnClickListenerC22666.f71495.setText(abstractC17043.getName());
                if (activityC23336.f73412 != null && abstractC17043.getName().equals(activityC23336.f73412)) {
                    viewOnClickListenerC22666.f71495.setTextColor(C23223.f73002);
                    activityC23336.f73412 = null;
                } else {
                    viewOnClickListenerC22666.f71495.setTextColor(C23223.f72986);
                }
                viewOnClickListenerC22666.itemView.setClickable(true);
                viewOnClickListenerC22666.itemView.setLongClickable(true);
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        ActivityC23336 activityC23336 = this.f78067;
        return Math.max(1, activityC23336.f73416.size()) + Math.max(1, activityC23336.f73419.size()) + 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54329() {
        for (TextView textView : this.f78068) {
            if (textView.getCurrentTextColor() == C23223.f73002) {
                textView.setTextColor(C23223.f72986);
            }
        }
    }
}
