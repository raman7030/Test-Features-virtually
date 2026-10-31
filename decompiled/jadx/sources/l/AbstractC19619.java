package l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19619 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f63345 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f63342 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f63340 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f63344 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final transient HashMap f63339 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f63343 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle f63341 = new Bundle();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28542(int i, AbstractC21735 abstractC21735, @SuppressLint({"UnknownNullness"}) Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9741 m45057(String str, InterfaceC23586 interfaceC23586, AbstractC21735 abstractC21735, InterfaceC21030 interfaceC21030) {
        AbstractC7379 lifecycle = interfaceC23586.getLifecycle();
        if (lifecycle.mo19832().m33028(EnumC13728.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC23586 + " is attempting to register while current state is " + lifecycle.mo19832() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m45055(str);
        HashMap map = this.f63340;
        C18913 c18913 = (C18913) map.get(str);
        if (c18913 == null) {
            c18913 = new C18913(lifecycle);
        }
        c18913.m43655(new C9035(this, str, interfaceC21030, abstractC21735));
        map.put(str, c18913);
        return new C16089(this, str, abstractC21735);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9741 m45056(String str, AbstractC21735 abstractC21735, InterfaceC21030 interfaceC21030) {
        m45055(str);
        this.f63339.put(str, new C4096(abstractC21735, interfaceC21030));
        HashMap map = this.f63343;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC21030.mo5550(obj);
        }
        Bundle bundle = this.f63341;
        C6918 c6918 = (C6918) bundle.getParcelable(str);
        if (c6918 != null) {
            bundle.remove(str);
            interfaceC21030.mo5550(abstractC21735.mo2799(c6918.m18709(), c6918.m18710()));
        }
        return new C2685(this, str, abstractC21735);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45060(String str) {
        Integer num;
        if (!this.f63344.contains(str) && (num = (Integer) this.f63342.remove(str)) != null) {
            this.f63345.remove(num);
        }
        this.f63339.remove(str);
        HashMap map = this.f63343;
        if (map.containsKey(str)) {
            C11003.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f63341;
        if (bundle.containsKey(str)) {
            C11003.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f63340;
        C18913 c18913 = (C18913) map2.get(str);
        if (c18913 != null) {
            c18913.m43654();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45062(Bundle bundle) {
        HashMap map = this.f63342;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f63344));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f63341.clone());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45059(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f63344 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f63341;
        bundle3.putAll(bundle2);
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            HashMap map = this.f63342;
            boolean zContainsKey = map.containsKey(str);
            HashMap map2 = this.f63345;
            if (zContainsKey) {
                Integer num = (Integer) map.remove(str);
                if (!bundle3.containsKey(str)) {
                    map2.remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i);
            num2.intValue();
            String str2 = stringArrayList.get(i);
            map2.put(num2, str2);
            map.put(str2, num2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45061(int i, int i2, Intent intent) {
        InterfaceC21030 interfaceC21030;
        String str = (String) this.f63345.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C4096 c4096 = (C4096) this.f63339.get(str);
        if (c4096 != null && (interfaceC21030 = c4096.f13026) != null && this.f63344.contains(str)) {
            interfaceC21030.mo5550(c4096.f13027.mo2799(intent, i2));
            this.f63344.remove(str);
            return true;
        }
        this.f63343.remove(str);
        this.f63341.putParcelable(str, new C6918(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45058(int i, @SuppressLint({"UnknownNullness"}) Object obj) {
        InterfaceC21030 interfaceC21030;
        String str = (String) this.f63345.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        C4096 c4096 = (C4096) this.f63339.get(str);
        if (c4096 == null || (interfaceC21030 = c4096.f13026) == null) {
            this.f63341.remove(str);
            this.f63343.put(str, obj);
        } else if (this.f63344.remove(str)) {
            interfaceC21030.mo5550(obj);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45055(String str) {
        HashMap map = this.f63342;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iMo23494 = AbstractC19700.f63640.mo23494();
        while (true) {
            int i = iMo23494 + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.f63345;
            if (map2.containsKey(numValueOf)) {
                iMo23494 = AbstractC19700.f63640.mo23494();
            } else {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
        }
    }
}
