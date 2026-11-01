package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC22666 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public TextView f71495;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f71496;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ActivityC23336 f71497;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22666(ActivityC23336 activityC23336, View view) {
        super(view);
        this.f71497 = activityC23336;
        this.f71496 = (ImageView) view.findViewById(R.id.icon);
        this.f71495 = (TextView) view.findViewById(R.id.textView);
        C21272.m48055(view);
        int i = C19801.f60217;
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m50731() {
        int size;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i = bindingAdapterPosition - 1;
        ActivityC23336 activityC23336 = this.f71497;
        if (activityC23336.f73419.isEmpty()) {
            size = bindingAdapterPosition - 3;
        } else {
            if (i < activityC23336.f73419.size()) {
                return activityC23336.f73419.get(i);
            }
            size = i - (activityC23336.f73419.size() + 1);
        }
        if (size < activityC23336.f73416.size()) {
            return activityC23336.f73416.get(size);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۢۙܽ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objM50731 = m50731();
        boolean z = objM50731 instanceof AbstractC14973;
        ActivityC23336 activityC23336 = this.f71497;
        if (!z) {
            if (objM50731 instanceof AbstractC17043) {
                C5389 c5389 = new C5389(activityC23336, (AbstractC17043) objM50731);
                c5389.m11787((C11267) new InterfaceC1489() { // from class: l.ۢۙܽ
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        ActivityC23336 activityC23337 = this.f31385.f71497;
                        activityC23337.f73421 = ((AbstractC17043) obj).getName();
                        ActivityC23336.m51973(activityC23337);
                        C22682.m50793(R.string.MT_Protector);
                    }
                });
                c5389.m11786();
                return;
            }
            return;
        }
        AbstractC14973 abstractC14973 = (AbstractC14973) objM50731;
        RunnableC17768 runnableC17768 = new RunnableC17768(1, activityC23336, abstractC14973);
        if (abstractC14973.mo34294()) {
            C23691.f75409 = true;
            C10792.m24865(new C15959(runnableC17768), abstractC14973, activityC23336);
        } else {
            runnableC17768.run();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object objM50731 = m50731();
        if (objM50731 instanceof AbstractC14973) {
            final AbstractC14973 abstractC14973 = (AbstractC14973) objM50731;
            C1898 c1898 = new C1898(view.getContext(), view, 0);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50640();
            c1898.m50636(new InterfaceC1583() { // from class: l.ۡۙܽ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC22666 viewOnClickListenerC22666 = this.f29341;
                    ActivityC23336 activityC23336 = viewOnClickListenerC22666.f71497;
                    int itemId = menuItem.getItemId();
                    final AbstractC14973 abstractC14974 = abstractC14973;
                    if (itemId == R.string.MT_Protector) {
                        C9925 c9925 = new C9925(viewOnClickListenerC22666, activityC23336, abstractC14974);
                        c9925.m33344(R.string.MT_Protector);
                        c9925.m33336((CharSequence) abstractC14974.mo15886());
                        c9925.m33330();
                        c9925.m33367();
                        c9925.m33352(true);
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C20671 c20671BuildDialog = activityC23336.buildDialog();
                        c20671BuildDialog.m46727(R.string.MT_Protector);
                        c20671BuildDialog.m46718(activityC23336.getString(R.string.MT_Protector, abstractC14974.mo12362()));
                        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۙܽ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ViewOnClickListenerC22666 viewOnClickListenerC22667 = viewOnClickListenerC22666;
                                viewOnClickListenerC22667.getClass();
                                abstractC14974.mo15885();
                                ActivityC23336.m51973(viewOnClickListenerC22667.f71497);
                            }
                        });
                        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c20671BuildDialog.m46732();
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C24414.m53856()) {
                            C22682.m50793(R.string.MT_Protector);
                            new ViewOnClickListenerC2424(activityC23336);
                            return true;
                        }
                        if (!C24414.m53850()) {
                            C22682.m50793(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC23336.m51964(activityC23336, abstractC14974, new Runnable() { // from class: l.ᩴۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i;
                                ViewOnClickListenerC22666 viewOnClickListenerC22667 = viewOnClickListenerC22666;
                                final ActivityC23336 activityC23337 = viewOnClickListenerC22667.f71497;
                                final C3219 c3219 = new C3219(viewOnClickListenerC22667);
                                View viewM12252 = activityC23337.m12252(R.layout.MT_Protector);
                                ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                                final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
                                radioButtonArr[0].setTag(C7050.m16224(R.string.MT_Protector));
                                radioButtonArr[1].setTag(C7050.m16224(R.string.MT_Protector));
                                radioButtonArr[2].setTag(C7050.m16224(R.string.MT_Protector));
                                final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
                                final TextView textView = (TextView) viewM12252.findViewById(R.id.textView2);
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
                                C20671 c20671BuildDialog2 = activityC23337.buildDialog();
                                c20671BuildDialog2.m46715(viewM12252);
                                c20671BuildDialog2.m46736(R.string.MT_Protector, null);
                                c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog2.m46732();
                                final AbstractC14973 abstractC14975 = abstractC14974;
                                if (abstractC14975 instanceof C23691) {
                                    i = 0;
                                } else if (abstractC14975 instanceof C21680) {
                                    editText.setHint(R.string.MT_Protector);
                                    i = 1;
                                } else {
                                    if (!(abstractC14975 instanceof C6927) && !(abstractC14975 instanceof C14303)) {
                                        throw new AssertionError();
                                    }
                                    i = 2;
                                }
                                onClickListener.onClick(radioButtonArr[i]);
                                dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֨ۤܿ
                                    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) throws Throwable {
                                        byte[] bArrM38664;
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        boolean zIsChecked = radioButtonArr2[0].isChecked();
                                        int i3 = i;
                                        DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                                        AbstractActivityC5549 abstractActivityC5549 = activityC23337;
                                        AbstractC14973 abstractC14976 = abstractC14975;
                                        C3219 c32110 = c3219;
                                        if (zIsChecked) {
                                            if (i3 == 0) {
                                                dialogInterfaceC2564.dismiss();
                                                return;
                                            } else {
                                                new C6730(abstractActivityC5549, abstractC14976, dialogInterfaceC2564, c32110).m22250();
                                                return;
                                            }
                                        }
                                        if (radioButtonArr2[1].isChecked()) {
                                            EditText editText2 = editText;
                                            if (editText2.length() == 0) {
                                                if (i3 == 1) {
                                                    dialogInterfaceC2564.dismiss();
                                                    return;
                                                } else {
                                                    C22682.m50793(R.string.MT_Protector);
                                                    editText2.requestFocus();
                                                    return;
                                                }
                                            }
                                            if (i3 == 1) {
                                                try {
                                                    bArrM38664 = C21680.m48950(abstractC14976).m38664();
                                                    try {
                                                        abstractC14976.mo15885();
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (bArrM38664 != null) {
                                                            try {
                                                                AbstractC17043 abstractC17043M48950 = C21680.m48950(abstractC14976);
                                                                abstractC17043M48950.getClass();
                                                                abstractC17043M48950.m38661(bArrM38664, 0, bArrM38664.length);
                                                            } catch (IOException unused) {
                                                            }
                                                        }
                                                        abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    bArrM38664 = null;
                                                    if (bArrM38664 != null) {
                                                        AbstractC17043 abstractC17043M48951 = C21680.m48950(abstractC14976);
                                                        abstractC17043M48951.getClass();
                                                        abstractC17043M48951.m38661(bArrM38664, 0, bArrM38664.length);
                                                    }
                                                    abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                                                }
                                            } else {
                                                bArrM38664 = null;
                                            }
                                            AbstractC17043 abstractC17043M48952 = C21680.m48951(C10792.m24868(), abstractC14976.mo15886(), abstractC14976.m34296().getEncoded(), abstractC14976.m34292().getEncoded(), editText2.getText().toString());
                                            abstractC14976.mo15880();
                                            if (i3 != 1) {
                                                abstractC14976.mo15885();
                                            }
                                            C17127.m38756();
                                            dialogInterfaceC2564.dismiss();
                                            c32110.accept(abstractC17043M48952);
                                            return;
                                        }
                                        if (i3 == 2) {
                                            dialogInterfaceC2564.dismiss();
                                            return;
                                        }
                                        try {
                                            AbstractC17043 abstractC17043M15879 = C6927.m15879(C10792.m24868(), abstractC14976.mo15886(), abstractC14976.m34296().getEncoded(), abstractC14976.m34292().getEncoded());
                                            abstractC14976.mo15880();
                                            abstractC14976.mo15885();
                                            C17127.m38756();
                                            dialogInterfaceC2564.dismiss();
                                            c32110.accept(abstractC17043M15879);
                                            return;
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                        abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                                    }
                                });
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C24414.m53856()) {
                            C22682.m50793(R.string.MT_Protector);
                            new ViewOnClickListenerC2424(activityC23336);
                            return true;
                        }
                        if (!C24414.m53850()) {
                            C22682.m50793(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC23336.m51964(activityC23336, abstractC14974, new Runnable() { // from class: l.᩵ۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ViewOnClickListenerC22666 viewOnClickListenerC22667 = viewOnClickListenerC22666;
                                C15998 c15998 = new C15998(viewOnClickListenerC22667.f71497, new InterfaceC1489() { // from class: l.ۚۙܽ
                                    @Override // p067l.InterfaceC1489
                                    public final void accept(Object obj) {
                                        ActivityC23336 activityC23337 = viewOnClickListenerC22667.f71497;
                                        activityC23337.f73412 = ((AbstractC17043) obj).getName();
                                        ActivityC23336.m51973(activityC23337);
                                    }
                                });
                                c15998.m36357(abstractC14974);
                                c15998.m36356();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C24414.m53856()) {
                            C22682.m50793(R.string.MT_Protector);
                            new ViewOnClickListenerC2424(activityC23336);
                            return true;
                        }
                        if (!C24414.m53850()) {
                            C22682.m50793(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC23336.m51964(activityC23336, abstractC14974, new Runnable() { // from class: l.֡ۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC23336 activityC23337 = viewOnClickListenerC22666.f71497;
                                AbstractC14973 abstractC14975 = abstractC14974;
                                activityC23337.f73414 = abstractC14975;
                                C8331 c8331 = activityC23337.f73410;
                                c8331.getClass();
                                C8331.m19220(c8331, R.string.MT_Protector, (String) null, abstractC14975.mo15886() + "_key.zip", new String[]{"zip"}, 16);
                            }
                        });
                    }
                    return true;
                }
            });
            C19801.m45029(view, c1898);
            return true;
        }
        if (!(objM50731 instanceof AbstractC17043)) {
            return false;
        }
        final AbstractC17043 abstractC17043 = (AbstractC17043) objM50731;
        C1898 c1899 = new C1898(view.getContext(), view, 0);
        c1899.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1899.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1899.m50640();
        c1899.m50636(new InterfaceC1583() { // from class: l.ܺۙܽ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC22666 viewOnClickListenerC22666 = this.f51600;
                ActivityC23336 activityC23336 = viewOnClickListenerC22666.f71497;
                int itemId = menuItem.getItemId();
                final AbstractC17043 abstractC17044 = abstractC17043;
                if (itemId == R.string.MT_Protector) {
                    C16629 c16629 = new C16629(viewOnClickListenerC22666, activityC23336, abstractC17044);
                    c16629.m33344(R.string.MT_Protector);
                    c16629.m33336((CharSequence) abstractC17044.m38675());
                    c16629.m33330();
                    c16629.m33367();
                    c16629.m33352(true);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    C20671 c20671BuildDialog = activityC23336.buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46718(activityC23336.getString(R.string.MT_Protector, abstractC17044.getName()));
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖۙܽ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ViewOnClickListenerC22666 viewOnClickListenerC22667 = viewOnClickListenerC22666;
                            viewOnClickListenerC22667.getClass();
                            abstractC17044.mo29990();
                            ActivityC23336.m51973(viewOnClickListenerC22667.f71497);
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46732();
                }
                return true;
            }
        });
        C19801.m45029(view, c1899);
        return true;
    }
}
