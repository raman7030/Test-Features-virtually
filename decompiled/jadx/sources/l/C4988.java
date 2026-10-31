package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4988 extends AbstractC3577 {
    @Override // l.AbstractC3577
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final String mo6365() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6372() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    public final String getName() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ */
    public final String mo6370() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ */
    public final String mo6371() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4988 m14473(final AbstractActivityC3346 abstractActivityC3346, TextView textView, AbstractC3577 abstractC3577) {
        final C4988 c4988 = new C4988(-1);
        c4988.m10945(abstractC3577);
        textView.setText(abstractActivityC3346.getString(R.string.MT_Protector) + " >>");
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
                final AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                View viewM10216 = abstractActivityC3347.m10216(R.layout.MT_Protector);
                final C0754 c0754 = new C0754(viewM10216.findViewById(R.id.MT_Protector));
                final C0754 c0755 = new C0754(viewM10216.findViewById(R.id.MT_Protector));
                final C0754 c0756 = new C0754(viewM10216.findViewById(R.id.MT_Protector));
                final C0754 c0757 = new C0754(viewM10216.findViewById(R.id.MT_Protector));
                final C0754 c0758 = new C0754(viewM10216.findViewById(R.id.MT_Protector));
                final C4988 c4989 = this.f17554;
                boolean z = c4989.f11357;
                C2978 c2978 = c0754.f2811;
                c2978.setChecked(z);
                c0755.f2811.setChecked(c4989.f11353);
                c0756.f2811.setChecked(c4989.f11352);
                c0757.f2809.setText(abstractActivityC3347.getString(R.string.MT_Protector, c4989.f11348));
                c0758.f2809.setText(abstractActivityC3347.getString(R.string.MT_Protector, Integer.valueOf(c4989.f11351)));
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.֨᩻᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        boolean z3 = !z2;
                        c0755.m2892(z3);
                        c0756.m2892(z3);
                        c0757.m2892(z3);
                        c0758.m2892(z3);
                    }
                };
                c2978.setOnCheckedChangeListener(onCheckedChangeListener);
                onCheckedChangeListener.onCheckedChanged(c2978, c2978.isChecked());
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۠᩻᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C0754 c0759 = c0757;
                        CharSequence text = c0759.f2810.getText();
                        Object obj = c0759.f2807;
                        String str = obj == null ? c4989.f11348 : (String) obj;
                        final AbstractActivityC3346 abstractActivityC3348 = abstractActivityC3347;
                        C21362.m48400(abstractActivityC3348, text, str, new InterfaceC13041() { // from class: l.᩹᩻᩻
                            @Override // l.InterfaceC13041
                            public final void accept(Object obj2) {
                                String str2 = (String) obj2;
                                C0754 c07510 = c0759;
                                c07510.f2807 = str2;
                                c07510.f2809.setText(abstractActivityC3348.getString(R.string.MT_Protector, str2));
                            }
                        });
                    }
                };
                ViewGroup viewGroup = c0757.f2808;
                viewGroup.setOnClickListener(onClickListener);
                if (!c0757.f2810.isEnabled()) {
                    viewGroup.setClickable(false);
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.ܶ᩻᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C0754 c0759 = c0758;
                        CharSequence text = c0759.f2810.getText();
                        Object obj = c0759.f2807;
                        int iIntValue = obj == null ? c4989.f11351 : ((Integer) obj).intValue();
                        final AbstractActivityC3346 abstractActivityC3348 = abstractActivityC3347;
                        C6791.m18436(abstractActivityC3348, text, iIntValue, new InterfaceC5982() { // from class: l.᩶᩻᩻
                            @Override // java.util.function.Consumer
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                mo16796((Integer) obj2);
                            }

                            @Override // l.InterfaceC5982
                            /* JADX INFO: renamed from: ܽ */
                            public final /* synthetic */ void mo16796(Integer num) {
                                C10216.m25642((InterfaceC5982) this, num);
                            }

                            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                                return C10216.m25641((InterfaceC5982) this, intConsumer);
                            }

                            public final Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.IntConsumer
                            public final void accept(int i) {
                                Integer numValueOf = Integer.valueOf(i);
                                C0754 c07510 = c0759;
                                c07510.f2807 = numValueOf;
                                c07510.f2809.setText(abstractActivityC3348.getString(R.string.MT_Protector, Integer.valueOf(i)));
                            }
                        });
                    }
                };
                ViewGroup viewGroup2 = c0758.f2808;
                viewGroup2.setOnClickListener(onClickListener2);
                if (!c0758.f2810.isEnabled()) {
                    viewGroup2.setClickable(false);
                }
                C19258 c19258BuildDialog = abstractActivityC3347.buildDialog();
                c19258BuildDialog.m44421(viewM10216);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸᩻᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C4988 c49810 = c4989;
                        c49810.getClass();
                        c49810.f11357 = c0754.f2811.isChecked();
                        c49810.f11353 = c0755.f2811.isChecked();
                        c49810.f11352 = c0756.f2811.isChecked();
                        Object obj = c0757.f2807;
                        if (obj != null) {
                            String str = (String) obj;
                            c49810.f11348 = str;
                            c49810.f11347 = AbstractC3577.m10932(str);
                        }
                        Object obj2 = c0758.f2807;
                        if (obj2 != null) {
                            c49810.f11351 = ((Integer) obj2).intValue();
                        }
                    }
                });
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438();
            }
        });
        return c4988;
    }
}
