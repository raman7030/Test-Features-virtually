package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes3.dex */
public final class C16055 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f46474;

    /* JADX INFO: renamed from: ۜ */
    public final ProgressBar f46475;

    /* JADX INFO: renamed from: ۧ */
    public final C1715 f46476;

    /* JADX INFO: renamed from: ܽ */
    public DialogInterfaceC2564 f46478;

    /* JADX INFO: renamed from: ܿ */
    public final C1146 f46479;

    /* JADX INFO: renamed from: ᩷ */
    public View f46481;

    /* JADX INFO: renamed from: ᩻ */
    public final C1146 f46482;

    /* JADX INFO: renamed from: ᩳ */
    public final C21111 f46480 = new C21111();

    /* JADX INFO: renamed from: ܳ */
    public int f46477 = R.string.MT_Protector;

    public C16055(Main main) {
        this.f46474 = main;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        C1715 c1715 = (C1715) viewM12252.findViewById(R.id.MT_Protector);
        this.f46476 = c1715;
        this.f46475 = (ProgressBar) c1715.findViewById(R.id.MT_Protector);
        this.f46479 = (C1146) c1715.findViewById(R.id.MT_Protector);
        this.f46482 = (C1146) c1715.findViewById(R.id.MT_Protector);
        this.f46481 = c1715.findViewById(R.id.MT_Protector);
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        this.f46478 = c20671BuildDialog.m46709();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m36553() {
        this.f46475.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36552() {
        this.f46475.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9154 m36544(int i) {
        Object obj = this.f46480.get(i);
        if (obj instanceof C9154) {
            return (C9154) obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36540(InterfaceC1489 interfaceC1489) {
        Object obj = this.f46480.get(R.string.MT_Protector);
        if (obj instanceof C9154) {
            interfaceC1489.accept((C9154) obj);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36550(InterfaceC1489 interfaceC1489) {
        Object obj = this.f46480.get(R.string.MT_Protector);
        if (obj instanceof C19409) {
            interfaceC1489.accept((C19409) obj);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36546(InterfaceC1489 interfaceC1489) {
        Object obj = this.f46480.get(R.string.MT_Protector);
        if (obj instanceof C12704) {
            interfaceC1489.accept((C12704) obj);
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
    /* JADX INFO: renamed from: ֫ */
    public final C9154 m36529(int i, InterfaceC3986 interfaceC3986) {
        C21111 c21111 = this.f46480;
        if (c21111.mo4793(i)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f46474;
        TextView textView = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        int i2 = this.f46477;
        this.f46477 = i2 + 1;
        textView.setId(i2);
        int i3 = this.f46477;
        this.f46477 = i3 + 1;
        textView2.setId(i3);
        textView.setText(i);
        C1680 c1680 = new C1680(-2);
        c1680.f55069 = textView2.getId();
        c1680.f55125 = 0;
        C1715 c1715 = this.f46476;
        c1715.addView(textView, c1680);
        C1680 c1681 = new C1680(0);
        c1681.setMarginStart(C13076.m29939(8.0f));
        ((ViewGroup.MarginLayoutParams) c1681).topMargin = C13076.m29939(this.f46481.getId() == R.id.MT_Protector ? 0 : 1);
        c1681.f55075 = 0;
        c1681.f55123 = R.id.MT_Protector;
        c1681.f55119 = this.f46481.getId();
        c1715.addView(textView2, c1681);
        this.f46479.m22205(textView);
        C9154 c9154 = new C9154(textView, textView2);
        c21111.mo4686(i, c9154);
        this.f46481 = textView2;
        if (interfaceC3986 != null) {
            interfaceC3986.mo7947(textView2);
        }
        return c9154;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19409 m36533(InterfaceC18738 interfaceC18738) {
        C21111 c21111 = this.f46480;
        if (c21111.mo4793(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f46474;
        TextView textView = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC5549.m12252(R.layout.MT_Protector);
        int i = this.f46477;
        this.f46477 = i + 1;
        textView.setId(i);
        int i2 = this.f46477;
        this.f46477 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f46477;
        this.f46477 = i3 + 1;
        button.setId(i3);
        textView.setText(R.string.MT_Protector);
        C1680 c1680 = new C1680(-2);
        c1680.f55069 = textView2.getId();
        c1680.f55125 = 0;
        C1715 c1715 = this.f46476;
        c1715.addView(textView, c1680);
        C1680 c1681 = new C1680(-2);
        c1681.setMarginStart(C13076.m29939(8.0f));
        c1681.f55123 = R.id.MT_Protector;
        c1681.f55078 = button.getId();
        c1681.f55094 = button.getId();
        c1715.addView(textView2, c1681);
        C1680 c1682 = new C1680(-2);
        c1682.setMarginStart(C13076.m29939(4.0f));
        ((ViewGroup.MarginLayoutParams) c1682).topMargin = C13076.m29939(this.f46481.getId() == R.id.MT_Protector ? 0 : 1);
        c1682.f55123 = R.id.MT_Protector;
        c1682.f55119 = this.f46481.getId();
        c1715.addView(button, c1682);
        this.f46479.m22205(textView);
        this.f46482.m22205(textView2);
        C19409 c19409 = new C19409(textView, textView2, button);
        c21111.mo4686(R.string.MT_Protector, c19409);
        this.f46481 = button;
        interfaceC18738.mo9170(textView2, button);
        return c19409;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12704 m36532(InterfaceC18067 interfaceC18067) {
        C21111 c21111 = this.f46480;
        if (c21111.mo4793(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f46474;
        TextView textView = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView3 = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView4 = (TextView) abstractActivityC5549.m12252(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC5549.m12252(R.layout.MT_Protector);
        int i = this.f46477;
        this.f46477 = i + 1;
        textView.setId(i);
        int i2 = this.f46477;
        this.f46477 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f46477;
        this.f46477 = i3 + 1;
        textView3.setId(i3);
        int i4 = this.f46477;
        this.f46477 = i4 + 1;
        textView4.setId(i4);
        int i5 = this.f46477;
        this.f46477 = i5 + 1;
        button.setId(i5);
        textView.setText(R.string.MT_Protector);
        C1680 c1680 = new C1680(-2);
        c1680.f55069 = textView3.getId();
        c1680.f55125 = 0;
        C1715 c1715 = this.f46476;
        c1715.addView(textView, c1680);
        C1680 c1681 = new C1680(-2);
        c1681.setMarginStart(C13076.m29939(8.0f));
        ((ViewGroup.MarginLayoutParams) c1681).topMargin = C13076.m29939(this.f46481.getId() == R.id.MT_Protector ? 0 : 1);
        c1681.f55123 = R.id.MT_Protector;
        c1681.f55119 = this.f46481.getId();
        c1715.addView(textView3, c1681);
        textView2.setText(R.string.MT_Protector);
        C1680 c1682 = new C1680(-2);
        c1682.f55069 = textView4.getId();
        c1682.f55125 = 0;
        c1715.addView(textView2, c1682);
        C1680 c1683 = new C1680(-2);
        c1683.setMarginStart(C13076.m29939(8.0f));
        ((ViewGroup.MarginLayoutParams) c1683).topMargin = C13076.m29939(1.0f);
        c1683.f55123 = R.id.MT_Protector;
        c1683.f55119 = textView3.getId();
        c1715.addView(textView4, c1683);
        C1680 c1684 = new C1680(-2);
        c1684.setMarginStart(C13076.m29939(4.0f));
        c1684.f55123 = R.id.MT_Protector;
        c1684.f55078 = textView3.getId();
        c1684.f55094 = textView4.getId();
        c1715.addView(button, c1684);
        C1146 c1146 = this.f46479;
        c1146.m22205(textView);
        c1146.m22205(textView2);
        C1146 c1147 = this.f46482;
        c1147.m22205(textView3);
        c1147.m22205(textView4);
        C12704 c12704 = new C12704(textView, textView3, textView2, textView4, button);
        c21111.mo4686(R.string.MT_Protector, c12704);
        this.f46481 = textView4;
        interfaceC18067.mo14537(textView3, textView4, button);
        return c12704;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m36554() {
        this.f46478.m3847(-1, this.f46474.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36551() {
        this.f46478.m3847(-2, this.f46474.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m36547() {
        this.f46478.m3847(-3, this.f46474.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m36542() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f46478;
        dialogInterfaceC2564.m3862();
        C10884.m25071(dialogInterfaceC2564);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36534() {
        this.f46478.dismiss();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36536(DialogInterface.OnDismissListener onDismissListener) {
        this.f46478.m3849(onDismissListener);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Button m36543() {
        return this.f46478.m3859();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Button m36548() {
        return this.f46478.m3861();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9154 m36528(int i, String str) {
        return m36529(i, new C4407(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36539(List list) {
        m36529(R.string.MT_Protector, new C24868(list));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36538(String str, ViewOnLongClickListenerC11837 viewOnLongClickListenerC11837) {
        m36529(R.string.MT_Protector, new C13178(str, viewOnLongClickListenerC11837));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36537(String str, View.OnLongClickListener onLongClickListener) {
        m36529(R.string.MT_Protector, new C7149(str, onLongClickListener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnLongClickListener, l.ۤ֨ܳ] */
    /* JADX INFO: renamed from: ֫ */
    public final void m36541(final C17278 c17278) {
        ?? r0 = new View.OnLongClickListener() { // from class: l.ۤ֨ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C7050.m16205(R.string.MT_Protector, c17278.getPath());
                return true;
            }
        };
        m36538(C8597.m20011(500, c17278.getName()), (ViewOnLongClickListenerC11837) r0);
        m36537(C8597.m20011(500, c17278.getParent()), (View.OnLongClickListener) r0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36535(final int i) {
        m36529(R.string.MT_Protector, new InterfaceC3986() { // from class: l.᩺֨ܳ
            @Override // p067l.InterfaceC3986
            /* JADX INFO: renamed from: ֫ */
            public final void mo7947(TextView textView) {
                textView.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9154 m36549(long j) {
        return m36529(R.string.MT_Protector, new C7813(0, j));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9154 m36530(long j) {
        return m36529(R.string.MT_Protector, new C15856(j));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9154 m36545(long j) {
        return m36528(R.string.MT_Protector, C18794.m42827(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9154 m36531(String str, View.OnClickListener onClickListener) {
        return m36529(R.string.MT_Protector, new C10712(1, onClickListener, str));
    }
}
