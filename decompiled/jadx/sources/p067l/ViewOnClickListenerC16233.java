package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16233 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ */
    public TextView f47775;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C24951 f47776;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f47777;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f47778;

    /* JADX INFO: renamed from: ᩹ */
    public Drawable f47779;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16233(C24951 c24951, View view) {
        super(view);
        this.f47776 = c24951;
        C21272.m48052(view);
        int i = C19801.f60217;
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f47775 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f47777 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f47778 = imageView;
        Drawable drawableM5548 = C0886.m5548(c24951.f79669, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        this.f47779 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C24951 c24951 = this.f47776;
        BitSet bitSet = c24951.f79672;
        ActivityC2822 activityC2822 = c24951.f79669;
        if (activityC2822.f4847) {
            boolean z = bitSet.get(bindingAdapterPosition);
            bitSet.set(bindingAdapterPosition, !z);
            if (!z) {
                c24951.f79670++;
            } else {
                c24951.f79670--;
            }
            c24951.f79674 = -1;
            this.itemView.setBackgroundColor(!z ? C23223.f72997 : 0);
            activityC2822.m4486(c24951.f79670 > 0);
            if (!z) {
                int bindingAdapterPosition2 = getBindingAdapterPosition();
                int iAbs = Math.abs(bindingAdapterPosition2 - c24951.f79668);
                c24951.f79668 = bindingAdapterPosition2;
                if (iAbs == 1) {
                    c24951.f79673++;
                } else {
                    c24951.f79673 = 1;
                }
                if (c24951.f79673 == 5) {
                    C22682.m50799(R.string.MT_Protector);
                    c24951.f79673 = 0;
                    return;
                }
                return;
            }
            c24951.f79668 = -2;
            return;
        }
        activityC2822.m4481((C16903) ((ArrayList) c24951.m54834()).get(bindingAdapterPosition), R.string.MT_Protector, false, new InterfaceC1489() { // from class: l.ۧܳܿ
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                C24951 c24952 = this.f36237.f47776;
                ArrayList arrayList = (ArrayList) c24952.m54834();
                int i = bindingAdapterPosition;
                arrayList.set(i, (C16903) obj);
                c24952.f79667.notifyItemChanged(i);
                C10199.m23791();
            }
        });
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C24951 c24951 = this.f47776;
        BitSet bitSet = c24951.f79672;
        ActivityC2822 activityC2822 = c24951.f79669;
        if (!activityC2822.f4847) {
            C1898 c1898 = new C1898(activityC2822, view, 0);
            c1898.m50640();
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50636(new InterfaceC1583() { // from class: l.֫ܳܿ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC16233 viewOnClickListenerC16233 = this.f9181;
                    C24951 c24952 = viewOnClickListenerC16233.f47776;
                    ActivityC2822 activityC2823 = c24952.f79669;
                    int itemId = menuItem.getItemId();
                    if (itemId == R.string.MT_Protector) {
                        viewOnClickListenerC16233.onClick(view);
                        return true;
                    }
                    final int i = bindingAdapterPosition;
                    if (itemId == R.string.MT_Protector) {
                        final C24951 c24953 = (C24951) activityC2823.f4838.get(activityC2823.f4840.m4415());
                        final List listM17411 = c24953.m54835().m17411();
                        activityC2823.m4481(new C16903(), R.string.MT_Protector, true, new InterfaceC1489() { // from class: l.ܽܳܿ
                            @Override // p067l.InterfaceC1489
                            public final void accept(Object obj) {
                                int i2 = i + 1;
                                listM17411.add(i2, (C16903) obj);
                                C24951 c24954 = c24953;
                                c24954.f79667.notifyItemInserted(i2);
                                c24954.f79675.smoothScrollToPosition(i2);
                                C10199.m23791();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C20671 c20671BuildDialog = activityC2823.buildDialog();
                        c20671BuildDialog.m46727(R.string.MT_Protector);
                        c20671BuildDialog.m46718(activityC2823.getString(R.string.MT_Protector, viewOnClickListenerC16233.f47775.getText()));
                        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳܳܿ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                C24951 c24954 = viewOnClickListenerC16233.f47776;
                                ArrayList arrayList = (ArrayList) c24954.m54834();
                                int i3 = i;
                                arrayList.remove(i3);
                                c24954.f79667.notifyItemRemoved(i3);
                                C10199.m23791();
                            }
                        });
                        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c20671BuildDialog.m46732();
                        return true;
                    }
                    if (itemId != R.string.MT_Protector) {
                        if (itemId == R.string.MT_Protector) {
                            ActivityC2822.m4484(activityC2823, i);
                        }
                        return true;
                    }
                    final C24951 c24954 = (C24951) activityC2823.f4838.get(activityC2823.f4840.m4415());
                    final List listM17412 = c24954.m54835().m17411();
                    activityC2823.m4481(C16903.m38462(((C16903) ((ArrayList) c24952.m54834()).get(i)).m38466()), R.string.MT_Protector, true, new InterfaceC1489() { // from class: l.ܿܳܿ
                        @Override // p067l.InterfaceC1489
                        public final void accept(Object obj) {
                            int i2 = i + 1;
                            listM17412.add(i2, (C16903) obj);
                            C24951 c24955 = c24954;
                            c24955.f79667.notifyItemInserted(i2);
                            c24955.f79675.smoothScrollToPosition(i2);
                            C10199.m23791();
                        }
                    });
                    return true;
                }
            });
            C19801.m45029(view, c1898);
            return true;
        }
        int i = c24951.f79674;
        if (i == -1) {
            c24951.f79674 = bindingAdapterPosition;
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c24951.f79670++;
                this.itemView.setBackgroundColor(C23223.f72997);
                activityC2822.m4486(c24951.f79670 > 0);
            }
            return true;
        }
        c24951.f79674 = -1;
        if (i <= bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (bindingAdapterPosition <= i) {
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c24951.f79670++;
            }
            bindingAdapterPosition++;
        }
        c24951.f79667.notifyDataSetChanged();
        activityC2822.m4486(c24951.f79670 > 0);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f47778.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f47776.f79676.m7555(this);
        return false;
    }
}
