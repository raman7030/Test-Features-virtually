package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7110 extends AbstractC5769 {
    @Override // p067l.AbstractC5769
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7110 m16377(final AbstractActivityC5549 abstractActivityC5549, TextView textView, AbstractC5769 abstractC5769) {
        final C7110 c7110 = new C7110(-1);
        c7110.m12922(abstractC5769);
        textView.setText(abstractActivityC5549.getString(R.string.MT_Protector) + " >>");
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩻᩻
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                View viewM12252 = abstractActivityC55410.m12252(R.layout.MT_Protector);
                final C3086 c3086 = new C3086(viewM12252.findViewById(R.id.MT_Protector));
                final C3086 c3087 = new C3086(viewM12252.findViewById(R.id.MT_Protector));
                final C3086 c3088 = new C3086(viewM12252.findViewById(R.id.MT_Protector));
                final C3086 c3089 = new C3086(viewM12252.findViewById(R.id.MT_Protector));
                final C3086 c30810 = new C3086(viewM12252.findViewById(R.id.MT_Protector));
                final C7110 c7111 = this.f20401;
                boolean z = c7111.f14162;
                C0990 c0990 = c3086.f5583;
                c0990.setChecked(z);
                c3087.f5583.setChecked(c7111.f14158);
                c3088.f5583.setChecked(c7111.f14157);
                c3089.f5581.setText(abstractActivityC55410.getString(R.string.MT_Protector, c7111.f14153));
                c30810.f5581.setText(abstractActivityC55410.getString(R.string.MT_Protector, Integer.valueOf(c7111.f14156)));
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.֨᩻᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        boolean z3 = !z2;
                        c3087.m5221(z3);
                        c3088.m5221(z3);
                        c3089.m5221(z3);
                        c30810.m5221(z3);
                    }
                };
                c0990.setOnCheckedChangeListener(onCheckedChangeListener);
                onCheckedChangeListener.onCheckedChanged(c0990, c0990.isChecked());
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۠᩻᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C3086 c30811 = c3089;
                        CharSequence text = c30811.f5582.getText();
                        Object obj = c30811.f5579;
                        String str = obj == null ? c7111.f14153 : (String) obj;
                        final AbstractActivityC5549 abstractActivityC55411 = abstractActivityC55410;
                        C22671.m50736(abstractActivityC55411, text, str, new InterfaceC1489() { // from class: l.᩹᩻᩻
                            @Override // p067l.InterfaceC1489
                            public final void accept(Object obj2) {
                                String str2 = (String) obj2;
                                C3086 c30812 = c30811;
                                c30812.f5579 = str2;
                                c30812.f5581.setText(abstractActivityC55411.getString(R.string.MT_Protector, str2));
                            }
                        });
                    }
                };
                ViewGroup viewGroup = c3089.f5580;
                viewGroup.setOnClickListener(onClickListener);
                if (!c3089.f5582.isEnabled()) {
                    viewGroup.setClickable(false);
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.ܶ᩻᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C3086 c30811 = c30810;
                        CharSequence text = c30811.f5582.getText();
                        Object obj = c30811.f5579;
                        int iIntValue = obj == null ? c7111.f14156 : ((Integer) obj).intValue();
                        final AbstractActivityC5549 abstractActivityC55411 = abstractActivityC55410;
                        C8823.m20385(abstractActivityC55411, text, iIntValue, new InterfaceC8054() { // from class: l.᩶᩻᩻
                            @Override // java.util.function.Consumer
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                mo18722((Integer) obj2);
                            }

                            @Override // p067l.InterfaceC8054
                            /* JADX INFO: renamed from: ܽ */
                            public final /* synthetic */ void mo18722(Integer num) {
                                C12078.m27664((InterfaceC8054) this, num);
                            }

                            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                                return C12078.m27663((InterfaceC8054) this, intConsumer);
                            }

                            public final Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.IntConsumer
                            public final void accept(int i) {
                                Integer numValueOf = Integer.valueOf(i);
                                C3086 c30812 = c30811;
                                c30812.f5579 = numValueOf;
                                c30812.f5581.setText(abstractActivityC55411.getString(R.string.MT_Protector, Integer.valueOf(i)));
                            }
                        });
                    }
                };
                ViewGroup viewGroup2 = c30810.f5580;
                viewGroup2.setOnClickListener(onClickListener2);
                if (!c30810.f5582.isEnabled()) {
                    viewGroup2.setClickable(false);
                }
                C20671 c20671BuildDialog = abstractActivityC55410.buildDialog();
                c20671BuildDialog.m46715(viewM12252);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸᩻᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C7110 c7112 = c7111;
                        c7112.getClass();
                        c7112.f14162 = c3086.f5583.isChecked();
                        c7112.f14158 = c3087.f5583.isChecked();
                        c7112.f14157 = c3088.f5583.isChecked();
                        Object obj = c3089.f5579;
                        if (obj != null) {
                            String str = (String) obj;
                            c7112.f14153 = str;
                            c7112.f14152 = AbstractC5769.m12909(str);
                        }
                        Object obj2 = c30810.f5579;
                        if (obj2 != null) {
                            c7112.f14156 = ((Integer) obj2).intValue();
                        }
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
            }
        });
        return c7110;
    }
}
