package l;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4706 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public CheckBox f14936;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CheckBox f14937;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public CheckBox f14938;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f14939;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16971 f14940;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f14941;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4706(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, final AbstractActivityC3346 abstractActivityC3347, C16971 c16971) {
        super(abstractActivityC3346, -1);
        this.f14939 = viewOnClickListenerC7528;
        this.f14941 = abstractActivityC3347;
        this.f14940 = c16971;
        FrameLayout frameLayoutM31286 = m31286();
        frameLayoutM31286.setVisibility(0);
        LayoutInflater.from(abstractActivityC3347).inflate(R.layout.MT_Protector, frameLayoutM31286);
        CheckBox checkBox = (CheckBox) frameLayoutM31286.findViewById(R.id.MT_Protector);
        this.f14936 = checkBox;
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("dex_plus_rename_not_exists", true));
        CheckBox checkBox2 = (CheckBox) frameLayoutM31286.findViewById(R.id.checkBox2);
        this.f14937 = checkBox2;
        checkBox2.setChecked(!c16971.m39805().matches("[a-zA-Z]{1,5}"));
        CheckBox checkBox3 = (CheckBox) frameLayoutM31286.findViewById(R.id.MT_Protector);
        this.f14938 = checkBox3;
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("dprs", true));
        frameLayoutM31286.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC21640(0, abstractActivityC3347));
        frameLayoutM31286.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abstractActivityC3347.m10217(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        });
        if (c16971.m39807()) {
            checkBox.setVisibility(8);
            frameLayoutM31286.findViewById(R.id.MT_Protector).setVisibility(8);
            String str = c16971.m39805() + "$";
            Iterator it = viewOnClickListenerC7528.f23168.m30063().iterator();
            while (it.hasNext()) {
                if (((C18011) it.next()).f56169.startsWith(str)) {
                    return;
                }
            }
            this.f14938.setVisibility(8);
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
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (!C9679.m24615((CharSequence) strM31260)) {
            strM31260 = C9679.m24610(C9679.m24618(strM31260));
        }
        if (strM31260.isEmpty()) {
            m31262();
            return;
        }
        C16971 c16971 = this.f14940;
        boolean zM39807 = c16971.m39807();
        CheckBox checkBox = this.f14937;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f14939;
        if (zM39807) {
            if (viewOnClickListenerC7528.f23168.m30058(strM31260)) {
                m31251(viewOnClickListenerC7528.getString(R.string.MT_Protector, strM31260));
                return;
            }
            String strM39805 = c16971.m39805();
            HashMap map = new HashMap();
            map.put(strM39805, strM31260);
            CheckBox checkBox2 = this.f14938;
            if (checkBox2.getVisibility() == 0) {
                if (checkBox2.isChecked()) {
                    String strM37867 = C16014.m37867(strM39805, "$");
                    Iterator it = viewOnClickListenerC7528.f23168.m30063().iterator();
                    while (it.hasNext()) {
                        String str = ((C18011) it.next()).f56169;
                        if (str.startsWith(strM37867)) {
                            StringBuilder sbM19190 = C7166.m19190(strM31260, "$");
                            sbM19190.append(str.substring(strM37867.length()));
                            map.put(str, sbM19190.toString());
                        }
                    }
                }
                ApplicationC20075.f65008.edit().putBoolean("dprs", checkBox2.isChecked()).apply();
            }
            Set setSingleton = Collections.singleton(strM31260);
            boolean zIsChecked = checkBox.isChecked();
            m31262();
            new C20229(this, map, null, zIsChecked, setSingleton).m20274();
            return;
        }
        String str2 = c16971.m39805() + "/";
        String strConcat = strM31260.concat("/");
        HashMap map2 = new HashMap();
        Iterator it2 = viewOnClickListenerC7528.f23168.m30063().iterator();
        while (it2.hasNext()) {
            String str3 = ((C18011) it2.next()).f56169;
            if (str3.startsWith(str2)) {
                StringBuilder sbM15339 = C5368.m15339(strConcat);
                sbM15339.append(str3.substring(str2.length()));
                String string = sbM15339.toString();
                if (viewOnClickListenerC7528.f23168.m30058(string)) {
                    m31251(viewOnClickListenerC7528.getString(R.string.MT_Protector, string));
                    return;
                }
                map2.put(str3, string);
            }
        }
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        CheckBox checkBox3 = this.f14936;
        interfaceC13049Edit.putBoolean("dex_plus_rename_not_exists", checkBox3.isChecked()).apply();
        if (!checkBox3.isChecked()) {
            Set setSingleton2 = Collections.singleton(strConcat);
            boolean zIsChecked2 = checkBox.isChecked();
            m31262();
            new C20229(this, map2, null, zIsChecked2, setSingleton2).m20274();
            return;
        }
        Set setSingleton3 = Collections.singleton(strConcat);
        C10220 c10220 = new C10220(str2, strConcat);
        boolean zIsChecked3 = checkBox.isChecked();
        m31262();
        new C20229(this, map2, c10220, zIsChecked3, setSingleton3).m20274();
    }
}
