package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC14588 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f44667;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23761 f44668;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f44669;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f44670;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f44671;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC14588(C23761 c23761, View view) {
        super(view);
        this.f44668 = c23761;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f44667 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f44669 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f44670 = imageView;
        Drawable drawableM3234 = C0881.m3234(c23761.f76917, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        this.f44671 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C23761 c23761 = this.f44668;
        BitSet bitSet = c23761.f76920;
        ActivityC0477 activityC0477 = c23761.f76917;
        if (activityC0477.f2073) {
            boolean z = bitSet.get(bindingAdapterPosition);
            bitSet.set(bindingAdapterPosition, !z);
            if (!z) {
                c23761.f76918++;
            } else {
                c23761.f76918--;
            }
            c23761.f76922 = -1;
            this.itemView.setBackgroundColor(!z ? C21943.f70286 : 0);
            activityC0477.m2105(c23761.f76918 > 0);
            if (!z) {
                int bindingAdapterPosition2 = getBindingAdapterPosition();
                int iAbs = Math.abs(bindingAdapterPosition2 - c23761.f76916);
                c23761.f76916 = bindingAdapterPosition2;
                if (iAbs == 1) {
                    c23761.f76921++;
                } else {
                    c23761.f76921 = 1;
                }
                if (c23761.f76921 == 5) {
                    C21374.m48463(R.string.MT_Protector);
                    c23761.f76921 = 0;
                    return;
                }
                return;
            }
            c23761.f76916 = -2;
            return;
        }
        activityC0477.m2100((C15293) ((ArrayList) c23761.m52425()).get(bindingAdapterPosition), R.string.MT_Protector, false, new InterfaceC13041() { // from class: l.ۧܳܿ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C23761 c23762 = this.f33236.f44668;
                ArrayList arrayList = (ArrayList) c23762.m52425();
                int i = bindingAdapterPosition;
                arrayList.set(i, (C15293) obj);
                c23762.f76915.notifyItemChanged(i);
                C8239.m21822();
            }
        });
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C23761 c23761 = this.f44668;
        BitSet bitSet = c23761.f76920;
        ActivityC0477 activityC0477 = c23761.f76917;
        if (!activityC0477.f2073) {
            C21282 c21282 = new C21282(activityC0477, view, 0);
            c21282.m48306();
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48302(new InterfaceC14930() { // from class: l.֫ܳܿ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC14588 viewOnClickListenerC14588 = this.f6399;
                    C23761 c23762 = viewOnClickListenerC14588.f44668;
                    ActivityC0477 activityC0478 = c23762.f76917;
                    int itemId = menuItem.getItemId();
                    if (itemId == R.string.MT_Protector) {
                        viewOnClickListenerC14588.onClick(view);
                        return true;
                    }
                    final int i = bindingAdapterPosition;
                    if (itemId == R.string.MT_Protector) {
                        final C23761 c23763 = (C23761) activityC0478.f2064.get(activityC0478.f2066.m2038());
                        final List listM15500 = c23763.m52426().m15500();
                        activityC0478.m2100(new C15293(), R.string.MT_Protector, true, new InterfaceC13041() { // from class: l.ܽܳܿ
                            @Override // l.InterfaceC13041
                            public final void accept(Object obj) {
                                int i2 = i + 1;
                                listM15500.add(i2, (C15293) obj);
                                C23761 c23764 = c23763;
                                c23764.f76915.notifyItemInserted(i2);
                                c23764.f76923.smoothScrollToPosition(i2);
                                C8239.m21822();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C19258 c19258BuildDialog = activityC0478.buildDialog();
                        c19258BuildDialog.m44433(R.string.MT_Protector);
                        c19258BuildDialog.m44424(activityC0478.getString(R.string.MT_Protector, viewOnClickListenerC14588.f44667.getText()));
                        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳܳܿ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                C23761 c23764 = viewOnClickListenerC14588.f44668;
                                ArrayList arrayList = (ArrayList) c23764.m52425();
                                int i3 = i;
                                arrayList.remove(i3);
                                c23764.f76915.notifyItemRemoved(i3);
                                C8239.m21822();
                            }
                        });
                        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c19258BuildDialog.m44438();
                        return true;
                    }
                    if (itemId != R.string.MT_Protector) {
                        if (itemId == R.string.MT_Protector) {
                            ActivityC0477.m2103(activityC0478, i);
                        }
                        return true;
                    }
                    final C23761 c23764 = (C23761) activityC0478.f2064.get(activityC0478.f2066.m2038());
                    final List listM15501 = c23764.m52426().m15500();
                    activityC0478.m2100(C15293.m36301(((C15293) ((ArrayList) c23762.m52425()).get(i)).m36305()), R.string.MT_Protector, true, new InterfaceC13041() { // from class: l.ܿܳܿ
                        @Override // l.InterfaceC13041
                        public final void accept(Object obj) {
                            int i2 = i + 1;
                            listM15501.add(i2, (C15293) obj);
                            C23761 c23765 = c23764;
                            c23765.f76915.notifyItemInserted(i2);
                            c23765.f76923.smoothScrollToPosition(i2);
                            C8239.m21822();
                        }
                    });
                    return true;
                }
            });
            C18342.m42767(view, c21282);
            return true;
        }
        int i = c23761.f76922;
        if (i == -1) {
            c23761.f76922 = bindingAdapterPosition;
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c23761.f76918++;
                this.itemView.setBackgroundColor(C21943.f70286);
                activityC0477.m2105(c23761.f76918 > 0);
            }
            return true;
        }
        c23761.f76922 = -1;
        if (i <= bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (bindingAdapterPosition <= i) {
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c23761.f76918++;
            }
            bindingAdapterPosition++;
        }
        c23761.f76915.notifyDataSetChanged();
        activityC0477.m2105(c23761.f76918 > 0);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f44670.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f44668.f76924.m5326(this);
        return false;
    }
}
