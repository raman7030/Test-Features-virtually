package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6841 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public CheckBox f17766;

    /* JADX INFO: renamed from: ۟ */
    public CheckBox f17767;

    /* JADX INFO: renamed from: ۧ֫ */
    public CheckBox f17768;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ ViewOnClickListenerC9523 f17769;

    /* JADX INFO: renamed from: ܿ֫ */
    public final /* synthetic */ C18498 f17770;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ AbstractActivityC5549 f17771;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6841(ViewOnClickListenerC9523 viewOnClickListenerC9523, AbstractActivityC5549 abstractActivityC5549, final AbstractActivityC5549 abstractActivityC55410, C18498 c18498) {
        super(abstractActivityC5549, -1);
        this.f17769 = viewOnClickListenerC9523;
        this.f17771 = abstractActivityC55410;
        this.f17770 = c18498;
        FrameLayout frameLayoutM33372 = m33372();
        frameLayoutM33372.setVisibility(0);
        LayoutInflater.from(abstractActivityC55410).inflate(R.layout.MT_Protector, frameLayoutM33372);
        CheckBox checkBox = (CheckBox) frameLayoutM33372.findViewById(R.id.MT_Protector);
        this.f17766 = checkBox;
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("dex_plus_rename_not_exists", true));
        CheckBox checkBox2 = (CheckBox) frameLayoutM33372.findViewById(R.id.checkBox2);
        this.f17767 = checkBox2;
        checkBox2.setChecked(!c18498.m42048().matches("[a-zA-Z]{1,5}"));
        CheckBox checkBox3 = (CheckBox) frameLayoutM33372.findViewById(R.id.MT_Protector);
        this.f17768 = checkBox3;
        checkBox3.setChecked(ApplicationC21448.f67649.getBoolean("dprs", true));
        frameLayoutM33372.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC22935(0, abstractActivityC55410));
        frameLayoutM33372.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abstractActivityC55410.m12253(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        });
        if (c18498.m42050()) {
            checkBox.setVisibility(8);
            frameLayoutM33372.findViewById(R.id.MT_Protector).setVisibility(8);
            String str = c18498.m42048() + "$";
            Iterator it = viewOnClickListenerC9523.f26081.m32124().iterator();
            while (it.hasNext()) {
                if (((C19486) it.next()).f59366.startsWith(str)) {
                    return;
                }
            }
            this.f17768.setVisibility(8);
            return;
        }
        checkBox3.setVisibility(8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (!C11567.m26629((CharSequence) strM33346)) {
            strM33346 = C11567.m26624(C11567.m26632(strM33346));
        }
        if (strM33346.isEmpty()) {
            m33348();
            return;
        }
        C18498 c18498 = this.f17770;
        boolean zM42050 = c18498.m42050();
        CheckBox checkBox = this.f17767;
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f17769;
        if (zM42050) {
            if (viewOnClickListenerC9523.f26081.m32119(strM33346)) {
                m33337(viewOnClickListenerC9523.getString(R.string.MT_Protector, strM33346));
                return;
            }
            String strM42048 = c18498.m42048();
            HashMap map = new HashMap();
            map.put(strM42048, strM33346);
            CheckBox checkBox2 = this.f17768;
            if (checkBox2.getVisibility() == 0) {
                if (checkBox2.isChecked()) {
                    String strM40053 = C17588.m40053(strM42048, "$");
                    Iterator it = viewOnClickListenerC9523.f26081.m32124().iterator();
                    while (it.hasNext()) {
                        String str = ((C19486) it.next()).f59366;
                        if (str.startsWith(strM40053)) {
                            StringBuilder sbM21133 = C9179.m21133(strM33346, "$");
                            sbM21133.append(str.substring(strM40053.length()));
                            map.put(str, sbM21133.toString());
                        }
                    }
                }
                ApplicationC21448.f67649.edit().putBoolean("dprs", checkBox2.isChecked()).apply();
            }
            Set setSingleton = Collections.singleton(strM33346);
            boolean zIsChecked = checkBox.isChecked();
            m33348();
            new C21594(this, map, null, zIsChecked, setSingleton).m22250();
            return;
        }
        String str2 = c18498.m42048() + "/";
        String strConcat = strM33346.concat("/");
        HashMap map2 = new HashMap();
        Iterator it2 = viewOnClickListenerC9523.f26081.m32124().iterator();
        while (it2.hasNext()) {
            String str3 = ((C19486) it2.next()).f59366;
            if (str3.startsWith(str2)) {
                StringBuilder sbM17248 = C7470.m17248(strConcat);
                sbM17248.append(str3.substring(str2.length()));
                String string = sbM17248.toString();
                if (viewOnClickListenerC9523.f26081.m32119(string)) {
                    m33337(viewOnClickListenerC9523.getString(R.string.MT_Protector, string));
                    return;
                }
                map2.put(str3, string);
            }
        }
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        CheckBox checkBox3 = this.f17766;
        interfaceC14770Edit.putBoolean("dex_plus_rename_not_exists", checkBox3.isChecked()).apply();
        if (!checkBox3.isChecked()) {
            Set setSingleton2 = Collections.singleton(strConcat);
            boolean zIsChecked2 = checkBox.isChecked();
            m33348();
            new C21594(this, map2, null, zIsChecked2, setSingleton2).m22250();
            return;
        }
        Set setSingleton3 = Collections.singleton(strConcat);
        C1349 c1349 = new C1349(str2, strConcat);
        boolean zIsChecked3 = checkBox.isChecked();
        m33348();
        new C21594(this, map2, c1349, zIsChecked3, setSingleton3).m22250();
    }
}
