package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes3.dex */
public final class C14401 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f43381;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f43382;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17606 f43383;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f43385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6128 f43386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f43388;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6128 f43389;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19720 f43387 = new C19720();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f43384 = R.string.MT_Protector;

    public C14401(Main main) {
        this.f43381 = main;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        C17606 c17606 = (C17606) viewM10216.findViewById(R.id.MT_Protector);
        this.f43383 = c17606;
        this.f43382 = (ProgressBar) c17606.findViewById(R.id.MT_Protector);
        this.f43386 = (C6128) c17606.findViewById(R.id.MT_Protector);
        this.f43389 = (C6128) c17606.findViewById(R.id.MT_Protector);
        this.f43388 = c17606.findViewById(R.id.MT_Protector);
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        this.f43385 = c19258BuildDialog.m44415();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34419() {
        this.f43382.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34418() {
        this.f43382.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7140 m34410(int i) {
        Object obj = this.f43387.get(i);
        if (obj instanceof C7140) {
            return (C7140) obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34406(InterfaceC13041 interfaceC13041) {
        Object obj = this.f43387.get(R.string.MT_Protector);
        if (obj instanceof C7140) {
            interfaceC13041.accept((C7140) obj);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34416(InterfaceC13041 interfaceC13041) {
        Object obj = this.f43387.get(R.string.MT_Protector);
        if (obj instanceof C17930) {
            interfaceC13041.accept((C17930) obj);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34412(InterfaceC13041 interfaceC13041) {
        Object obj = this.f43387.get(R.string.MT_Protector);
        if (obj instanceof C10875) {
            interfaceC13041.accept((C10875) obj);
        }
    }

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34395(int i, InterfaceC1702 interfaceC1702) {
        C19720 c19720 = this.f43387;
        if (c19720.mo2422(i)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f43381;
        TextView textView = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        int i2 = this.f43384;
        this.f43384 = i2 + 1;
        textView.setId(i2);
        int i3 = this.f43384;
        this.f43384 = i3 + 1;
        textView2.setId(i3);
        textView.setText(i);
        C16900 c16900 = new C16900(-2);
        c16900.f51889 = textView2.getId();
        c16900.f51945 = 0;
        C17606 c17606 = this.f43383;
        c17606.addView(textView, c16900);
        C16900 c16901 = new C16900(0);
        c16901.setMarginStart(C11266.m27878(8.0f));
        ((ViewGroup.MarginLayoutParams) c16901).topMargin = C11266.m27878(this.f43388.getId() == R.id.MT_Protector ? 0 : 1);
        c16901.f51895 = 0;
        c16901.f51943 = R.id.MT_Protector;
        c16901.f51939 = this.f43388.getId();
        c17606.addView(textView2, c16901);
        this.f43386.m20229(textView);
        C7140 c7140 = new C7140(textView, textView2);
        c19720.mo2318(i, c7140);
        this.f43388 = textView2;
        if (interfaceC1702 != null) {
            interfaceC1702.mo5714(textView2);
        }
        return c7140;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17930 m34399(InterfaceC17224 interfaceC17224) {
        C19720 c19720 = this.f43387;
        if (c19720.mo2422(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f43381;
        TextView textView = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC3346.m10216(R.layout.MT_Protector);
        int i = this.f43384;
        this.f43384 = i + 1;
        textView.setId(i);
        int i2 = this.f43384;
        this.f43384 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f43384;
        this.f43384 = i3 + 1;
        button.setId(i3);
        textView.setText(R.string.MT_Protector);
        C16900 c16900 = new C16900(-2);
        c16900.f51889 = textView2.getId();
        c16900.f51945 = 0;
        C17606 c17606 = this.f43383;
        c17606.addView(textView, c16900);
        C16900 c16901 = new C16900(-2);
        c16901.setMarginStart(C11266.m27878(8.0f));
        c16901.f51943 = R.id.MT_Protector;
        c16901.f51898 = button.getId();
        c16901.f51914 = button.getId();
        c17606.addView(textView2, c16901);
        C16900 c16902 = new C16900(-2);
        c16902.setMarginStart(C11266.m27878(4.0f));
        ((ViewGroup.MarginLayoutParams) c16902).topMargin = C11266.m27878(this.f43388.getId() == R.id.MT_Protector ? 0 : 1);
        c16902.f51943 = R.id.MT_Protector;
        c16902.f51939 = this.f43388.getId();
        c17606.addView(button, c16902);
        this.f43386.m20229(textView);
        this.f43389.m20229(textView2);
        C17930 c17930 = new C17930(textView, textView2, button);
        c19720.mo2318(R.string.MT_Protector, c17930);
        this.f43388 = button;
        interfaceC17224.mo7075(textView2, button);
        return c17930;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10875 m34398(InterfaceC16518 interfaceC16518) {
        C19720 c19720 = this.f43387;
        if (c19720.mo2422(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f43381;
        TextView textView = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView3 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView4 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC3346.m10216(R.layout.MT_Protector);
        int i = this.f43384;
        this.f43384 = i + 1;
        textView.setId(i);
        int i2 = this.f43384;
        this.f43384 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f43384;
        this.f43384 = i3 + 1;
        textView3.setId(i3);
        int i4 = this.f43384;
        this.f43384 = i4 + 1;
        textView4.setId(i4);
        int i5 = this.f43384;
        this.f43384 = i5 + 1;
        button.setId(i5);
        textView.setText(R.string.MT_Protector);
        C16900 c16900 = new C16900(-2);
        c16900.f51889 = textView3.getId();
        c16900.f51945 = 0;
        C17606 c17606 = this.f43383;
        c17606.addView(textView, c16900);
        C16900 c16901 = new C16900(-2);
        c16901.setMarginStart(C11266.m27878(8.0f));
        ((ViewGroup.MarginLayoutParams) c16901).topMargin = C11266.m27878(this.f43388.getId() == R.id.MT_Protector ? 0 : 1);
        c16901.f51943 = R.id.MT_Protector;
        c16901.f51939 = this.f43388.getId();
        c17606.addView(textView3, c16901);
        textView2.setText(R.string.MT_Protector);
        C16900 c16902 = new C16900(-2);
        c16902.f51889 = textView4.getId();
        c16902.f51945 = 0;
        c17606.addView(textView2, c16902);
        C16900 c16903 = new C16900(-2);
        c16903.setMarginStart(C11266.m27878(8.0f));
        ((ViewGroup.MarginLayoutParams) c16903).topMargin = C11266.m27878(1.0f);
        c16903.f51943 = R.id.MT_Protector;
        c16903.f51939 = textView3.getId();
        c17606.addView(textView4, c16903);
        C16900 c16904 = new C16900(-2);
        c16904.setMarginStart(C11266.m27878(4.0f));
        c16904.f51943 = R.id.MT_Protector;
        c16904.f51898 = textView3.getId();
        c16904.f51914 = textView4.getId();
        c17606.addView(button, c16904);
        C6128 c6128 = this.f43386;
        c6128.m20229(textView);
        c6128.m20229(textView2);
        C6128 c6129 = this.f43389;
        c6129.m20229(textView3);
        c6129.m20229(textView4);
        C10875 c10875 = new C10875(textView, textView3, textView2, textView4, button);
        c19720.mo2318(R.string.MT_Protector, c10875);
        this.f43388 = textView4;
        interfaceC16518.mo12661(textView3, textView4, button);
        return c10875;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34420() {
        this.f43385.m1434(-1, this.f43381.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34417() {
        this.f43385.m1434(-2, this.f43381.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34413() {
        this.f43385.m1434(-3, this.f43381.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34408() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f43385;
        dialogInterfaceC0206.m1449();
        C8960.m23097(dialogInterfaceC0206);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34400() {
        this.f43385.dismiss();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34402(DialogInterface.OnDismissListener onDismissListener) {
        this.f43385.m1436(onDismissListener);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Button m34409() {
        return this.f43385.m1446();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Button m34414() {
        return this.f43385.m1448();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34394(int i, String str) {
        return m34395(i, new C2144(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34405(List list) {
        m34395(R.string.MT_Protector, new C23674(list));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34404(String str, ViewOnLongClickListenerC9963 viewOnLongClickListenerC9963) {
        m34395(R.string.MT_Protector, new C11374(str, viewOnLongClickListenerC9963));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34403(String str, View.OnLongClickListener onLongClickListener) {
        m34395(R.string.MT_Protector, new C5030(str, onLongClickListener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnLongClickListener, l.ۤ֨ܳ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34407(final C15688 c15688) {
        ?? r0 = new View.OnLongClickListener() { // from class: l.ۤ֨ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C4925.m14308(R.string.MT_Protector, c15688.getPath());
                return true;
            }
        };
        m34404(C6554.m18061(500, c15688.getName()), (ViewOnLongClickListenerC9963) r0);
        m34403(C6554.m18061(500, c15688.getParent()), (View.OnLongClickListener) r0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34401(final int i) {
        m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.᩺֨ܳ
            @Override // l.InterfaceC1702
            /* JADX INFO: renamed from: ֫ */
            public final void mo5714(TextView textView) {
                textView.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7140 m34415(long j) {
        return m34395(R.string.MT_Protector, new C5729(0, j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34396(long j) {
        return m34395(R.string.MT_Protector, new C14192(j));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7140 m34411(long j) {
        return m34394(R.string.MT_Protector, C17283.m40576(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34397(String str, View.OnClickListener onClickListener) {
        return m34395(R.string.MT_Protector, new C8779(1, onClickListener, str));
    }
}
