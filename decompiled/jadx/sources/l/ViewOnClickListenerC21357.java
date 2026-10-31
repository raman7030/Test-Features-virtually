package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21357 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f68801;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f68802;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f68803;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21357(ActivityC22062 activityC22062, View view) {
        super(view);
        this.f68803 = activityC22062;
        this.f68802 = (ImageView) view.findViewById(R.id.icon);
        this.f68801 = (TextView) view.findViewById(R.id.textView);
        C19890.m45744(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m48396() {
        int size;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i = bindingAdapterPosition - 1;
        ActivityC22062 activityC22062 = this.f68803;
        if (activityC22062.f70702.isEmpty()) {
            size = bindingAdapterPosition - 3;
        } else {
            if (i < activityC22062.f70702.size()) {
                return activityC22062.f70702.get(i);
            }
            size = i - (activityC22062.f70702.size() + 1);
        }
        if (size < activityC22062.f70699.size()) {
            return activityC22062.f70699.get(size);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۢۙܽ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objM48396 = m48396();
        boolean z = objM48396 instanceof AbstractC13262;
        ActivityC22062 activityC22062 = this.f68803;
        if (!z) {
            if (objM48396 instanceof AbstractC15440) {
                C3178 c3178 = new C3178(activityC22062, (AbstractC15440) objM48396);
                c3178.m9743((C9363) new InterfaceC13041() { // from class: l.ۢۙܽ
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ActivityC22062 activityC22063 = this.f28436.f68803;
                        activityC22063.f70704 = ((AbstractC15440) obj).getName();
                        ActivityC22062.m49637(activityC22063);
                        C21374.m48457(R.string.MT_Protector);
                    }
                });
                c3178.m9742();
                return;
            }
            return;
        }
        AbstractC13262 abstractC13262 = (AbstractC13262) objM48396;
        RunnableC16203 runnableC16203 = new RunnableC16203(1, activityC22062, abstractC13262);
        if (abstractC13262.mo32195()) {
            C22435.f72683 = true;
            C8863.m22894(new C14300(runnableC16203), abstractC13262, activityC22062);
        } else {
            runnableC16203.run();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object objM48396 = m48396();
        if (objM48396 instanceof AbstractC13262) {
            final AbstractC13262 abstractC13262 = (AbstractC13262) objM48396;
            C21282 c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48306();
            c21282.m48302(new InterfaceC14930() { // from class: l.ۡۙܽ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC21357 viewOnClickListenerC21357 = this.f26423;
                    ActivityC22062 activityC22062 = viewOnClickListenerC21357.f68803;
                    int itemId = menuItem.getItemId();
                    final AbstractC13262 abstractC13263 = abstractC13262;
                    if (itemId == R.string.MT_Protector) {
                        C7951 c7951 = new C7951(viewOnClickListenerC21357, activityC22062, abstractC13263);
                        c7951.m31258(R.string.MT_Protector);
                        c7951.m31250((CharSequence) abstractC13263.mo14006());
                        c7951.m31244();
                        c7951.m31281();
                        c7951.m31266(true);
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C19258 c19258BuildDialog = activityC22062.buildDialog();
                        c19258BuildDialog.m44433(R.string.MT_Protector);
                        c19258BuildDialog.m44424(activityC22062.getString(R.string.MT_Protector, abstractC13263.mo10324()));
                        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۙܽ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ViewOnClickListenerC21357 viewOnClickListenerC21358 = viewOnClickListenerC21357;
                                viewOnClickListenerC21358.getClass();
                                abstractC13263.mo14005();
                                ActivityC22062.m49637(viewOnClickListenerC21358.f68803);
                            }
                        });
                        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c19258BuildDialog.m44438();
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C23196.m51460()) {
                            C21374.m48457(R.string.MT_Protector);
                            new ViewOnClickListenerC0059(activityC22062);
                            return true;
                        }
                        if (!C23196.m51454()) {
                            C21374.m48457(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC22062.m49628(activityC22062, abstractC13263, new Runnable() { // from class: l.ᩴۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i;
                                ViewOnClickListenerC21357 viewOnClickListenerC21358 = viewOnClickListenerC21357;
                                final ActivityC22062 activityC22063 = viewOnClickListenerC21358.f68803;
                                final C0895 c0895 = new C0895(viewOnClickListenerC21358);
                                View viewM10216 = activityC22063.m10216(R.layout.MT_Protector);
                                ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                                final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
                                radioButtonArr[0].setTag(C4925.m14327(R.string.MT_Protector));
                                radioButtonArr[1].setTag(C4925.m14327(R.string.MT_Protector));
                                radioButtonArr[2].setTag(C4925.m14327(R.string.MT_Protector));
                                final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
                                final TextView textView = (TextView) viewM10216.findViewById(R.id.textView2);
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۚۤܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        int length = radioButtonArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            boolean z = true;
                                            if (i2 >= length) {
                                                break;
                                            }
                                            RadioButton radioButton = radioButtonArr2[i2];
                                            if (view2 != radioButton) {
                                                z = false;
                                            }
                                            radioButton.setChecked(z);
                                            i2++;
                                        }
                                        editText.setVisibility(view2 != radioButtonArr2[1] ? 8 : 0);
                                        textView.setText((String) view2.getTag());
                                    }
                                };
                                for (int i2 = 0; i2 < 3; i2++) {
                                    radioButtonArr[i2].setOnClickListener(onClickListener);
                                }
                                C19258 c19258BuildDialog2 = activityC22063.buildDialog();
                                c19258BuildDialog2.m44421(viewM10216);
                                c19258BuildDialog2.m44442(R.string.MT_Protector, null);
                                c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog2.m44438();
                                final AbstractC13262 abstractC13264 = abstractC13263;
                                if (abstractC13264 instanceof C22435) {
                                    i = 0;
                                } else if (abstractC13264 instanceof C20319) {
                                    editText.setHint(R.string.MT_Protector);
                                    i = 1;
                                } else {
                                    if (!(abstractC13264 instanceof C4796) && !(abstractC13264 instanceof C12557)) {
                                        throw new AssertionError();
                                    }
                                    i = 2;
                                }
                                onClickListener.onClick(radioButtonArr[i]);
                                dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨ۤܿ
                                    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) throws Throwable {
                                        byte[] bArrM36506;
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        boolean zIsChecked = radioButtonArr2[0].isChecked();
                                        int i3 = i;
                                        DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                                        AbstractActivityC3346 abstractActivityC3346 = activityC22063;
                                        AbstractC13262 abstractC13265 = abstractC13264;
                                        C0895 c0896 = c0895;
                                        if (zIsChecked) {
                                            if (i3 == 0) {
                                                dialogInterfaceC0206.dismiss();
                                                return;
                                            } else {
                                                new C4589(abstractActivityC3346, abstractC13265, dialogInterfaceC0206, c0896).m20274();
                                                return;
                                            }
                                        }
                                        if (radioButtonArr2[1].isChecked()) {
                                            EditText editText2 = editText;
                                            if (editText2.length() == 0) {
                                                if (i3 == 1) {
                                                    dialogInterfaceC0206.dismiss();
                                                    return;
                                                } else {
                                                    C21374.m48457(R.string.MT_Protector);
                                                    editText2.requestFocus();
                                                    return;
                                                }
                                            }
                                            if (i3 == 1) {
                                                try {
                                                    bArrM36506 = C20319.m46627(abstractC13265).m36506();
                                                    try {
                                                        abstractC13265.mo14005();
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (bArrM36506 != null) {
                                                            try {
                                                                AbstractC15440 abstractC15440M46627 = C20319.m46627(abstractC13265);
                                                                abstractC15440M46627.getClass();
                                                                abstractC15440M46627.m36503(bArrM36506, 0, bArrM36506.length);
                                                            } catch (IOException unused) {
                                                            }
                                                        }
                                                        abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    bArrM36506 = null;
                                                    if (bArrM36506 != null) {
                                                        AbstractC15440 abstractC15440M46628 = C20319.m46627(abstractC13265);
                                                        abstractC15440M46628.getClass();
                                                        abstractC15440M46628.m36503(bArrM36506, 0, bArrM36506.length);
                                                    }
                                                    abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                                                }
                                            } else {
                                                bArrM36506 = null;
                                            }
                                            AbstractC15440 abstractC15440M46629 = C20319.m46628(C8863.m22897(), abstractC13265.mo14006(), abstractC13265.m32197().getEncoded(), abstractC13265.m32193().getEncoded(), editText2.getText().toString());
                                            abstractC13265.mo14000();
                                            if (i3 != 1) {
                                                abstractC13265.mo14005();
                                            }
                                            C15528.m36596();
                                            dialogInterfaceC0206.dismiss();
                                            c0896.accept(abstractC15440M46629);
                                            return;
                                        }
                                        if (i3 == 2) {
                                            dialogInterfaceC0206.dismiss();
                                            return;
                                        }
                                        try {
                                            AbstractC15440 abstractC15440M13999 = C4796.m13999(C8863.m22897(), abstractC13265.mo14006(), abstractC13265.m32197().getEncoded(), abstractC13265.m32193().getEncoded());
                                            abstractC13265.mo14000();
                                            abstractC13265.mo14005();
                                            C15528.m36596();
                                            dialogInterfaceC0206.dismiss();
                                            c0896.accept(abstractC15440M13999);
                                            return;
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                        abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                                    }
                                });
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C23196.m51460()) {
                            C21374.m48457(R.string.MT_Protector);
                            new ViewOnClickListenerC0059(activityC22062);
                            return true;
                        }
                        if (!C23196.m51454()) {
                            C21374.m48457(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC22062.m49628(activityC22062, abstractC13263, new Runnable() { // from class: l.᩵ۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ViewOnClickListenerC21357 viewOnClickListenerC21358 = viewOnClickListenerC21357;
                                C14341 c14341 = new C14341(viewOnClickListenerC21358.f68803, new InterfaceC13041() { // from class: l.ۚۙܽ
                                    @Override // l.InterfaceC13041
                                    public final void accept(Object obj) {
                                        ActivityC22062 activityC22063 = viewOnClickListenerC21358.f68803;
                                        activityC22063.f70695 = ((AbstractC15440) obj).getName();
                                        ActivityC22062.m49637(activityC22063);
                                    }
                                });
                                c14341.m34224(abstractC13263);
                                c14341.m34223();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C23196.m51460()) {
                            C21374.m48457(R.string.MT_Protector);
                            new ViewOnClickListenerC0059(activityC22062);
                            return true;
                        }
                        if (!C23196.m51454()) {
                            C21374.m48457(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC22062.m49628(activityC22062, abstractC13263, new Runnable() { // from class: l.֡ۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC22062 activityC22063 = viewOnClickListenerC21357.f68803;
                                AbstractC13262 abstractC13264 = abstractC13263;
                                activityC22063.f70697 = abstractC13264;
                                C6273 c6273 = activityC22063.f70693;
                                c6273.getClass();
                                C6273.m17282(c6273, R.string.MT_Protector, (String) null, abstractC13264.mo14006() + "_key.zip", new String[]{"zip"}, 16);
                            }
                        });
                    }
                    return true;
                }
            });
            C18342.m42767(view, c21282);
            return true;
        }
        if (!(objM48396 instanceof AbstractC15440)) {
            return false;
        }
        final AbstractC15440 abstractC15440 = (AbstractC15440) objM48396;
        C21282 c21283 = new C21282(view.getContext(), view, 0);
        c21283.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21283.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21283.m48306();
        c21283.m48302(new InterfaceC14930() { // from class: l.ܺۙܽ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC21357 viewOnClickListenerC21357 = this.f48462;
                ActivityC22062 activityC22062 = viewOnClickListenerC21357.f68803;
                int itemId = menuItem.getItemId();
                final AbstractC15440 abstractC15441 = abstractC15440;
                if (itemId == R.string.MT_Protector) {
                    C15005 c15005 = new C15005(viewOnClickListenerC21357, activityC22062, abstractC15441);
                    c15005.m31258(R.string.MT_Protector);
                    c15005.m31250((CharSequence) abstractC15441.m36517());
                    c15005.m31244();
                    c15005.m31281();
                    c15005.m31266(true);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    C19258 c19258BuildDialog = activityC22062.buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44424(activityC22062.getString(R.string.MT_Protector, abstractC15441.getName()));
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖۙܽ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ViewOnClickListenerC21357 viewOnClickListenerC21358 = viewOnClickListenerC21357;
                            viewOnClickListenerC21358.getClass();
                            abstractC15441.mo27929();
                            ActivityC22062.m49637(viewOnClickListenerC21358.f68803);
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44438();
                }
                return true;
            }
        });
        C18342.m42767(view, c21283);
        return true;
    }
}
