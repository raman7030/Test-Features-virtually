package l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۚۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5180 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC11507 f16211;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16212;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC9741 f16213;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f16214;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23315 f16215;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC4971 f16216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6382 f16217;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10616 f16218;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C17174 f16220;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC9741 f16221;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f16222;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f16223;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Runnable f16224;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC9205 f16225;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f16226;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f16227;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC9205 f16228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12027 f16229;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14142 f16230;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f16232;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16233;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22113 f16234;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f16237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC15553 f16238;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16239;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16241;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20494 f16242;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayDeque f16243;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11815 f16244;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f16245;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f16246;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC9741 f16248;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16249;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16219 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11530 f16235 = new C11530();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LayoutInflaterFactory2C13437 f16210 = new LayoutInflaterFactory2C13437(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC0525 f16247 = new C10825(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16236 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f16240 = C20195.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f16231 = C20195.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [l.᩺᩻֫] */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ܰ᩻֫] */
    public AbstractC5180() {
        C20195.synchronizedMap(new HashMap());
        this.f16218 = new C10616(this);
        this.f16246 = new CopyOnWriteArrayList();
        int i = 0;
        this.f16217 = new C6382(i, this);
        this.f16229 = new C12027(i, this);
        this.f16215 = new InterfaceC13041() { // from class: l.᩺᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                AbstractC5180.m14844(this.f74942, (C16858) obj);
            }
        };
        this.f16230 = new InterfaceC13041() { // from class: l.ܰ᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                AbstractC5180.m14843(this.f42686, (C7686) obj);
            }
        };
        this.f16211 = new C16468(this);
        this.f16249 = -1;
        this.f16242 = new C17880(this);
        this.f16220 = new C17174();
        this.f16243 = new ArrayDeque();
        this.f16224 = new RunnableC14351(this);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m14853(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14841(AbstractC5180 abstractC5180, Configuration configuration) {
        if (abstractC5180.m14849()) {
            abstractC5180.m14880(false, configuration);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14842(AbstractC5180 abstractC5180, Integer num) {
        if (abstractC5180.m14849() && num.intValue() == 80) {
            abstractC5180.m14879(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14844(AbstractC5180 abstractC5180, C16858 c16858) {
        if (abstractC5180.m14849()) {
            abstractC5180.m14881(c16858.m39629(), false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14843(AbstractC5180 abstractC5180, C7686 c7686) {
        if (abstractC5180.m14849()) {
            abstractC5180.m14904(c7686.m20571(), false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14839(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C0654());
        AbstractC4971 abstractC4971 = this.f16216;
        try {
            if (abstractC4971 != null) {
                abstractC4971.mo14429(printWriter, new String[0]);
            } else {
                m14867(EnumC0121.f1143, (FileDescriptor) null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC16882 m14900() {
        return new C18105(this);
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m14846() {
        synchronized (this.f16219) {
            if (!this.f16219.isEmpty()) {
                this.f16247.m2240(true);
            } else {
                this.f16247.m2240(m14925() > 0 && m14856(this.f16225));
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m14856(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205 == null) {
            return true;
        }
        AbstractC5180 abstractC5180 = componentCallbacksC9205.mFragmentManager;
        return componentCallbacksC9205.equals(abstractC5180.f16228) && m14856(abstractC5180.f16225);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14888() {
        m14907(true);
        if (this.f16247.m2242()) {
            m14898();
        } else {
            this.f16244.m28892();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14898() {
        return m14845(-1, 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14901(int i) {
        m14902(i, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14902(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Bad id: "));
        }
        m14877(new C0240(this, i), z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14918(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Bad id: "));
        }
        m14845(i, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m14845(int i, int i2) {
        m14907(false);
        m14852(true);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16228;
        if (componentCallbacksC9205 != null && i < 0 && componentCallbacksC9205.getChildFragmentManager().m14898()) {
            return true;
        }
        boolean zM14884 = m14884(this.f16233, this.f16239, i, i2);
        if (zM14884) {
            this.f16223 = true;
            try {
                m14840(this.f16233, this.f16239);
                m14857();
            } catch (Throwable th) {
                m14857();
                throw th;
            }
        }
        m14846();
        boolean z = this.f16214;
        C11530 c11530 = this.f16235;
        if (z) {
            this.f16214 = false;
            Iterator it = c11530.m28387().iterator();
            while (it.hasNext()) {
                m14869((C5885) it.next());
            }
        }
        c11530.m28376();
        return zM14884;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m14925() {
        ArrayList arrayList = this.f16212;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8708 m14924() {
        return (InterfaceC8708) this.f16212.get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14875(C11973 c11973) {
        if (this.f16226 == null) {
            this.f16226 = new ArrayList();
        }
        this.f16226.add(c11973);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14878(C21905 c21905) {
        View view;
        for (C5885 c5885 : this.f16235.m28387()) {
            ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
            if (componentCallbacksC9205M16488.mContainerId == c21905.getId() && (view = componentCallbacksC9205M16488.mView) != null && view.getParent() == null) {
                componentCallbacksC9205M16488.mContainer = c21905;
                c5885.m16475();
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m14859() {
        return this.f16235.m28397();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3330 m14931(ComponentCallbacksC9205 componentCallbacksC9205) {
        return this.f16234.m49702(componentCallbacksC9205);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14903(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f16234.m49693(componentCallbacksC9205);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m14895(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f16234.m49699(componentCallbacksC9205);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m14886() {
        return this.f16245;
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(128, "FragmentManager{");
        sbM32307.append(Integer.toHexString(System.identityHashCode(this)));
        sbM32307.append(" in ");
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 != null) {
            sbM32307.append(componentCallbacksC9205.getClass().getSimpleName());
            sbM32307.append("{");
            sbM32307.append(Integer.toHexString(System.identityHashCode(this.f16225)));
            sbM32307.append(l.d);
        } else {
            AbstractC4971 abstractC4971 = this.f16216;
            if (abstractC4971 != null) {
                sbM32307.append(abstractC4971.getClass().getSimpleName());
                sbM32307.append("{");
                sbM32307.append(Integer.toHexString(System.identityHashCode(this.f16216)));
                sbM32307.append(l.d);
            } else {
                sbM32307.append("null");
            }
        }
        sbM32307.append("}}");
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14867(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM37867 = C16014.m37867(str, ASN1Dump.TAB);
        this.f16235.m28378(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f16232;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) this.f16232.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC9205.toString());
            }
        }
        ArrayList arrayList2 = this.f16212;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C18105 c18105 = (C18105) this.f16212.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c18105.toString());
                c18105.m42226(strM37867, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f16236.get());
        synchronized (this.f16219) {
            int size3 = this.f16219.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC19292 interfaceC19292 = (InterfaceC19292) this.f16219.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(interfaceC19292);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16216);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16238);
        if (this.f16225 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16225);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16249);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f16227);
        printWriter.print(" mStopped=");
        printWriter.print(this.f16237);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f16245);
        if (this.f16222) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f16222);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14869(C5885 c5885) {
        ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
        if (componentCallbacksC9205M16488.mDeferStart) {
            if (this.f16223) {
                this.f16214 = true;
            } else {
                componentCallbacksC9205M16488.mDeferStart = false;
                c5885.m16481();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14873(ComponentCallbacksC9205 componentCallbacksC9205, boolean z) {
        ViewGroup viewGroupM14848 = m14848(componentCallbacksC9205);
        if (viewGroupM14848 == null || !(viewGroupM14848 instanceof C21905)) {
            return;
        }
        ((C21905) viewGroupM14848).m49304(!z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14864(int i, boolean z) {
        AbstractC4971 abstractC4971;
        if (this.f16216 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f16249) {
            this.f16249 = i;
            C11530 c11530 = this.f16235;
            c11530.m28402();
            Iterator it = c11530.m28387().iterator();
            while (it.hasNext()) {
                m14869((C5885) it.next());
            }
            if (this.f16222 && (abstractC4971 = this.f16216) != null && this.f16249 == 7) {
                abstractC4971.mo14436();
                this.f16222 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5885 m14922(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mWho;
        C11530 c11530 = this.f16235;
        C5885 c5885M28398 = c11530.m28398(str);
        if (c5885M28398 != null) {
            return c5885M28398;
        }
        C5885 c5885 = new C5885(this.f16218, c11530, componentCallbacksC9205);
        c5885.m16477(this.f16216.m14435().getClassLoader());
        c5885.m16476(this.f16249);
        return c5885;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5885 m14861(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mPreviousWho;
        if (str != null) {
            C23232.m51538(componentCallbacksC9205, str);
        }
        if (m14853(2)) {
            componentCallbacksC9205.toString();
        }
        C5885 c5885M14922 = m14922(componentCallbacksC9205);
        componentCallbacksC9205.mFragmentManager = this;
        C11530 c11530 = this.f16235;
        c11530.m28380(c5885M14922);
        if (!componentCallbacksC9205.mDetached) {
            c11530.m28381(componentCallbacksC9205);
            componentCallbacksC9205.mRemoving = false;
            if (componentCallbacksC9205.mView == null) {
                componentCallbacksC9205.mHiddenChanged = false;
            }
            if (m14855(componentCallbacksC9205)) {
                this.f16222 = true;
            }
        }
        return c5885M14922;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m14897(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        boolean zIsInBackStack = componentCallbacksC9205.isInBackStack();
        if (componentCallbacksC9205.mDetached && zIsInBackStack) {
            return;
        }
        this.f16235.m28396(componentCallbacksC9205);
        if (m14855(componentCallbacksC9205)) {
            this.f16222 = true;
        }
        componentCallbacksC9205.mRemoving = true;
        m14837(componentCallbacksC9205);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14892(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        if (componentCallbacksC9205.mHidden) {
            return;
        }
        componentCallbacksC9205.mHidden = true;
        componentCallbacksC9205.mHiddenChanged = true ^ componentCallbacksC9205.mHiddenChanged;
        m14837(componentCallbacksC9205);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14921(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        if (componentCallbacksC9205.mDetached) {
            return;
        }
        componentCallbacksC9205.mDetached = true;
        if (componentCallbacksC9205.mAdded) {
            if (m14853(2)) {
                componentCallbacksC9205.toString();
            }
            this.f16235.m28396(componentCallbacksC9205);
            if (m14855(componentCallbacksC9205)) {
                this.f16222 = true;
            }
            m14837(componentCallbacksC9205);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14919(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        if (componentCallbacksC9205.mDetached) {
            componentCallbacksC9205.mDetached = false;
            if (componentCallbacksC9205.mAdded) {
                return;
            }
            this.f16235.m28381(componentCallbacksC9205);
            if (m14853(2)) {
                componentCallbacksC9205.toString();
            }
            if (m14855(componentCallbacksC9205)) {
                this.f16222 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14862(int i) {
        return this.f16235.m28388(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14899(String str) {
        return this.f16235.m28395(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14916(String str) {
        return this.f16235.m28400(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14863(String str) {
        return this.f16235.m28389(str);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m14910() {
        return this.f16227 || this.f16237;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14877(InterfaceC19292 interfaceC19292, boolean z) {
        if (!z) {
            if (this.f16216 != null) {
                if (m14910()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (this.f16245) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f16219) {
            if (this.f16216 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f16219.add(interfaceC19292);
                m14908();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14908() {
        synchronized (this.f16219) {
            if (this.f16219.size() == 1) {
                this.f16216.m14434().removeCallbacks(this.f16224);
                this.f16216.m14434().post(this.f16224);
                m14846();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14860() {
        return this.f16236.getAndIncrement();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m14852(boolean z) {
        if (this.f16223) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f16216 == null) {
            if (this.f16245) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() == this.f16216.m14434().getLooper()) {
            if (!z && m14910()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.f16233 == null) {
                this.f16233 = new ArrayList();
                this.f16239 = new ArrayList();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14876(C18105 c18105, boolean z) {
        if (z && (this.f16216 == null || this.f16245)) {
            return;
        }
        m14852(z);
        c18105.mo1499(this.f16233, this.f16239);
        this.f16223 = true;
        try {
            m14840(this.f16233, this.f16239);
            m14857();
            m14846();
            boolean z2 = this.f16214;
            C11530 c11530 = this.f16235;
            if (z2) {
                this.f16214 = false;
                Iterator it = c11530.m28387().iterator();
                while (it.hasNext()) {
                    m14869((C5885) it.next());
                }
            }
            c11530.m28376();
        } catch (Throwable th) {
            m14857();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m14857() {
        this.f16223 = false;
        this.f16239.clear();
        this.f16233.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14907(boolean z) {
        boolean z2;
        m14852(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f16233;
            ArrayList arrayList2 = this.f16239;
            synchronized (this.f16219) {
                if (this.f16219.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f16219.size();
                        boolean zMo1499 = false;
                        for (int i = 0; i < size; i++) {
                            zMo1499 |= ((InterfaceC19292) this.f16219.get(i)).mo1499(arrayList, arrayList2);
                        }
                        this.f16219.clear();
                        this.f16216.m14434().removeCallbacks(this.f16224);
                        z2 = zMo1499;
                    } catch (Throwable th) {
                        this.f16219.clear();
                        this.f16216.m14434().removeCallbacks(this.f16224);
                        throw th;
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f16223 = true;
            try {
                m14840(this.f16233, this.f16239);
                m14857();
            } catch (Throwable th2) {
                m14857();
                throw th2;
            }
        }
        m14846();
        if (this.f16214) {
            this.f16214 = false;
            Iterator it = this.f16235.m28387().iterator();
            while (it.hasNext()) {
                m14869((C5885) it.next());
            }
        }
        this.f16235.m28376();
        return z3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14840(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C18105) arrayList.get(i)).f51801) {
                if (i2 != i) {
                    m14850(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C18105) arrayList.get(i2)).f51801) {
                        i2++;
                    }
                }
                m14850(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m14850(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14850(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C18105 c18105;
        C11530 c11530;
        ComponentCallbacksC9205 componentCallbacksC9205;
        C11530 c11531;
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList;
        boolean z = ((C18105) arrayList3.get(i)).f51801;
        ArrayList arrayList4 = this.f16241;
        if (arrayList4 == null) {
            this.f16241 = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f16241;
        C11530 c11532 = this.f16235;
        arrayList5.addAll(c11532.m28397());
        ComponentCallbacksC9205 componentCallbacksC9206 = this.f16228;
        boolean z2 = false;
        int i5 = i;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                C18105 c18106 = (C18105) arrayList3.get(i5);
                if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                    ArrayList arrayList6 = this.f16241;
                    ArrayList arrayList7 = c18106.f51805;
                    int i7 = 0;
                    while (i7 < arrayList7.size()) {
                        C11239 c11239 = (C11239) arrayList7.get(i7);
                        int i8 = c11239.f33695;
                        if (i8 == i6) {
                            c11531 = c11532;
                            i3 = 1;
                            arrayList6.add(c11239.f33700);
                        } else if (i8 != 2) {
                            if (i8 == 3 || i8 == 6) {
                                arrayList6.remove(c11239.f33700);
                                ComponentCallbacksC9205 componentCallbacksC9207 = c11239.f33700;
                                if (componentCallbacksC9207 == componentCallbacksC9206) {
                                    arrayList7.add(i7, new C11239(componentCallbacksC9207, 9));
                                    i7++;
                                    i3 = 1;
                                    componentCallbacksC9206 = null;
                                }
                                c11531 = c11532;
                            } else if (i8 == 7) {
                                c11531 = c11532;
                                i3 = 1;
                                arrayList6.add(c11239.f33700);
                            } else if (i8 == 8) {
                                arrayList7.add(i7, new C11239(9, componentCallbacksC9206, 0));
                                c11239.f33698 = true;
                                i7++;
                                componentCallbacksC9206 = c11239.f33700;
                            }
                            i3 = 1;
                            c11531 = c11532;
                        } else {
                            ComponentCallbacksC9205 componentCallbacksC9208 = c11239.f33700;
                            int i9 = componentCallbacksC9208.mContainerId;
                            int size = arrayList6.size() - 1;
                            boolean z3 = false;
                            while (size >= 0) {
                                C11530 c11533 = c11532;
                                ComponentCallbacksC9205 componentCallbacksC9209 = (ComponentCallbacksC9205) arrayList6.get(size);
                                if (componentCallbacksC9209.mContainerId != i9) {
                                    i9 = i9;
                                } else if (componentCallbacksC9209 == componentCallbacksC9208) {
                                    i9 = i9;
                                    z3 = true;
                                } else {
                                    if (componentCallbacksC9209 == componentCallbacksC9206) {
                                        i4 = 0;
                                        arrayList7.add(i7, new C11239(9, componentCallbacksC9209, 0));
                                        i7++;
                                        componentCallbacksC9206 = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C11239 c112310 = new C11239(3, componentCallbacksC9209, i4);
                                    c112310.f33699 = c11239.f33699;
                                    c112310.f33696 = c11239.f33696;
                                    c112310.f33701 = c11239.f33701;
                                    c112310.f33702 = c11239.f33702;
                                    arrayList7.add(i7, c112310);
                                    arrayList6.remove(componentCallbacksC9209);
                                    i7++;
                                    componentCallbacksC9206 = componentCallbacksC9206;
                                }
                                size--;
                                i9 = i9;
                                c11532 = c11533;
                            }
                            c11531 = c11532;
                            if (z3) {
                                arrayList7.remove(i7);
                                i7--;
                            } else {
                                c11239.f33695 = 1;
                                c11239.f33698 = true;
                                arrayList6.add(componentCallbacksC9208);
                            }
                            i3 = 1;
                        }
                        i7 += i3;
                        i6 = 1;
                        c11532 = c11531;
                    }
                    c11530 = c11532;
                } else {
                    c11530 = c11532;
                    int i10 = 1;
                    ArrayList arrayList8 = this.f16241;
                    ArrayList arrayList9 = c18106.f51805;
                    int size2 = arrayList9.size() - 1;
                    while (size2 >= 0) {
                        C11239 c112311 = (C11239) arrayList9.get(size2);
                        int i11 = c112311.f33695;
                        if (i11 == i10) {
                            arrayList8.remove(c112311.f33700);
                        } else if (i11 != 3) {
                            switch (i11) {
                                case 6:
                                    arrayList8.add(c112311.f33700);
                                    break;
                                case 7:
                                    arrayList8.remove(c112311.f33700);
                                    break;
                                case 8:
                                    componentCallbacksC9205 = null;
                                    componentCallbacksC9206 = componentCallbacksC9205;
                                    break;
                                case 9:
                                    componentCallbacksC9205 = c112311.f33700;
                                    componentCallbacksC9206 = componentCallbacksC9205;
                                    break;
                                case 10:
                                    c112311.f33697 = c112311.f33703;
                                    break;
                            }
                        } else {
                            arrayList8.add(c112311.f33700);
                        }
                        size2--;
                        i10 = 1;
                    }
                }
                z2 = z2 || c18106.f51800;
                i5++;
                arrayList3 = arrayList;
                c11532 = c11530;
            } else {
                C11530 c11534 = c11532;
                this.f16241.clear();
                if (!z && this.f16249 >= 1) {
                    for (int i12 = i; i12 < i2; i12++) {
                        Iterator it = ((C18105) arrayList.get(i12)).f51805.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC9205 componentCallbacksC92010 = ((C11239) it.next()).f33700;
                            if (componentCallbacksC92010 != null && componentCallbacksC92010.mFragmentManager != null) {
                                c11534.m28380(m14922(componentCallbacksC92010));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i2; i13++) {
                    C18105 c18107 = (C18105) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        c18107.m42225(-1);
                        AbstractC5180 abstractC5180 = c18107.f56359;
                        ArrayList arrayList10 = c18107.f51805;
                        boolean z4 = true;
                        for (int size3 = arrayList10.size() - 1; size3 >= 0; size3--) {
                            C11239 c112312 = (C11239) arrayList10.get(size3);
                            ComponentCallbacksC9205 componentCallbacksC92011 = c112312.f33700;
                            if (componentCallbacksC92011 != null) {
                                componentCallbacksC92011.mBeingSaved = false;
                                componentCallbacksC92011.setPopDirection(z4);
                                int i14 = c18107.f51813;
                                int i15 = o.a.r;
                                if (i14 != 4097) {
                                    if (i14 != 8194) {
                                        i15 = o.a.d;
                                        if (i14 != 8197) {
                                            i15 = i14 != 4099 ? i14 != 4100 ? 0 : o.a.u : o.a.c;
                                        }
                                    } else {
                                        i15 = o.a.a;
                                    }
                                }
                                componentCallbacksC92011.setNextTransition(i15);
                                componentCallbacksC92011.setSharedElementNames(c18107.f51812, c18107.f51802);
                            }
                            switch (c112312.f33695) {
                                case 1:
                                    componentCallbacksC92011.setAnimations(c112312.f33699, c112312.f33701, c112312.f33696, c112312.f33702);
                                    z4 = true;
                                    abstractC5180.m14873(componentCallbacksC92011, true);
                                    abstractC5180.m14897(componentCallbacksC92011);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c112312.f33695);
                                case 3:
                                    componentCallbacksC92011.setAnimations(c112312.f33699, c112312.f33701, c112312.f33696, c112312.f33702);
                                    abstractC5180.m14861(componentCallbacksC92011);
                                    z4 = true;
                                    break;
                                case 4:
                                    componentCallbacksC92011.setAnimations(c112312.f33699, c112312.f33701, c112312.f33696, c112312.f33702);
                                    abstractC5180.getClass();
                                    if (m14853(2)) {
                                        C11003.toString(componentCallbacksC92011);
                                    }
                                    if (componentCallbacksC92011.mHidden) {
                                        componentCallbacksC92011.mHidden = false;
                                        componentCallbacksC92011.mHiddenChanged = !componentCallbacksC92011.mHiddenChanged;
                                    }
                                    z4 = true;
                                    break;
                                case 5:
                                    componentCallbacksC92011.setAnimations(c112312.f33699, c112312.f33701, c112312.f33696, c112312.f33702);
                                    abstractC5180.m14873(componentCallbacksC92011, true);
                                    abstractC5180.m14892(componentCallbacksC92011);
                                    z4 = true;
                                    break;
                                case 6:
                                    componentCallbacksC92011.setAnimations(c112312.f33699, c112312.f33701, c112312.f33696, c112312.f33702);
                                    abstractC5180.m14919(componentCallbacksC92011);
                                    z4 = true;
                                    break;
                                case 7:
                                    componentCallbacksC92011.setAnimations(c112312.f33699, c112312.f33701, c112312.f33696, c112312.f33702);
                                    abstractC5180.m14873(componentCallbacksC92011, true);
                                    abstractC5180.m14921(componentCallbacksC92011);
                                    z4 = true;
                                    break;
                                case 8:
                                    abstractC5180.m14915(null);
                                    z4 = true;
                                    break;
                                case 9:
                                    abstractC5180.m14915(componentCallbacksC92011);
                                    z4 = true;
                                    break;
                                case 10:
                                    abstractC5180.m14872(componentCallbacksC92011, c112312.f33703);
                                    z4 = true;
                                    break;
                            }
                        }
                    } else {
                        c18107.m42225(1);
                        AbstractC5180 abstractC5181 = c18107.f56359;
                        ArrayList arrayList11 = c18107.f51805;
                        int size4 = arrayList11.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            C11239 c112313 = (C11239) arrayList11.get(i16);
                            ComponentCallbacksC9205 componentCallbacksC92012 = c112313.f33700;
                            if (componentCallbacksC92012 != null) {
                                componentCallbacksC92012.mBeingSaved = false;
                                componentCallbacksC92012.setPopDirection(false);
                                componentCallbacksC92012.setNextTransition(c18107.f51813);
                                componentCallbacksC92012.setSharedElementNames(c18107.f51802, c18107.f51812);
                            }
                            switch (c112313.f33695) {
                                case 1:
                                    c18105 = c18107;
                                    componentCallbacksC92012.setAnimations(c112313.f33699, c112313.f33701, c112313.f33696, c112313.f33702);
                                    abstractC5181.m14873(componentCallbacksC92012, false);
                                    abstractC5181.m14861(componentCallbacksC92012);
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c112313.f33695);
                                case 3:
                                    c18105 = c18107;
                                    componentCallbacksC92012.setAnimations(c112313.f33699, c112313.f33701, c112313.f33696, c112313.f33702);
                                    abstractC5181.m14897(componentCallbacksC92012);
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 4:
                                    c18105 = c18107;
                                    componentCallbacksC92012.setAnimations(c112313.f33699, c112313.f33701, c112313.f33696, c112313.f33702);
                                    abstractC5181.m14892(componentCallbacksC92012);
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 5:
                                    c18105 = c18107;
                                    componentCallbacksC92012.setAnimations(c112313.f33699, c112313.f33701, c112313.f33696, c112313.f33702);
                                    abstractC5181.m14873(componentCallbacksC92012, false);
                                    if (m14853(2)) {
                                        C11003.toString(componentCallbacksC92012);
                                    }
                                    if (componentCallbacksC92012.mHidden) {
                                        componentCallbacksC92012.mHidden = false;
                                        componentCallbacksC92012.mHiddenChanged = !componentCallbacksC92012.mHiddenChanged;
                                    }
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 6:
                                    c18105 = c18107;
                                    componentCallbacksC92012.setAnimations(c112313.f33699, c112313.f33701, c112313.f33696, c112313.f33702);
                                    abstractC5181.m14921(componentCallbacksC92012);
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 7:
                                    c18105 = c18107;
                                    componentCallbacksC92012.setAnimations(c112313.f33699, c112313.f33701, c112313.f33696, c112313.f33702);
                                    abstractC5181.m14873(componentCallbacksC92012, false);
                                    abstractC5181.m14919(componentCallbacksC92012);
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 8:
                                    abstractC5181.m14915(componentCallbacksC92012);
                                    c18105 = c18107;
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 9:
                                    abstractC5181.m14915(null);
                                    c18105 = c18107;
                                    i16++;
                                    c18107 = c18105;
                                    break;
                                case 10:
                                    abstractC5181.m14872(componentCallbacksC92012, c112313.f33697);
                                    c18105 = c18107;
                                    i16++;
                                    c18107 = c18105;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C18105 c18108 = (C18105) arrayList.get(i17);
                    if (zBooleanValue) {
                        int size5 = c18108.f51805.size();
                        while (true) {
                            size5--;
                            if (size5 >= 0) {
                                ComponentCallbacksC9205 componentCallbacksC92013 = ((C11239) c18108.f51805.get(size5)).f33700;
                                if (componentCallbacksC92013 != null) {
                                    m14922(componentCallbacksC92013).m16481();
                                }
                            }
                        }
                    } else {
                        Iterator it2 = c18108.f51805.iterator();
                        while (it2.hasNext()) {
                            ComponentCallbacksC9205 componentCallbacksC92014 = ((C11239) it2.next()).f33700;
                            if (componentCallbacksC92014 != null) {
                                m14922(componentCallbacksC92014).m16481();
                            }
                        }
                    }
                }
                m14864(this.f16249, true);
                HashSet<AbstractC3477> hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C18105) arrayList.get(i18)).f51805.iterator();
                    while (it3.hasNext()) {
                        ComponentCallbacksC9205 componentCallbacksC92015 = ((C11239) it3.next()).f33700;
                        if (componentCallbacksC92015 != null && (viewGroup = componentCallbacksC92015.mContainer) != null) {
                            hashSet.add(AbstractC3477.m10636(viewGroup, m14926()));
                        }
                    }
                }
                for (AbstractC3477 abstractC3477 : hashSet) {
                    abstractC3477.f10997 = zBooleanValue;
                    abstractC3477.m10649();
                    abstractC3477.m10640();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C18105 c18109 = (C18105) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c18109.f56360 >= 0) {
                        c18109.f56360 = -1;
                    }
                    c18109.getClass();
                }
                if (!z2 || this.f16226 == null) {
                    return;
                }
                for (int i20 = 0; i20 < this.f16226.size(); i20++) {
                    ((InterfaceC18586) this.f16226.get(i20)).mo29246();
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m14837(ComponentCallbacksC9205 componentCallbacksC9205) {
        ViewGroup viewGroupM14848 = m14848(componentCallbacksC9205);
        if (viewGroupM14848 == null || componentCallbacksC9205.getEnterAnim() + componentCallbacksC9205.getExitAnim() + componentCallbacksC9205.getPopEnterAnim() + componentCallbacksC9205.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupM14848.getTag(R.id.MT_Protector) == null) {
            viewGroupM14848.setTag(R.id.MT_Protector, componentCallbacksC9205);
        }
        ((ComponentCallbacksC9205) viewGroupM14848.getTag(R.id.MT_Protector)).setPopDirection(componentCallbacksC9205.getPopDirection());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private ViewGroup m14848(ComponentCallbacksC9205 componentCallbacksC9205) {
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC9205.mContainerId <= 0 || !this.f16238.mo7107()) {
            return null;
        }
        View viewMo7106 = this.f16238.mo7106(componentCallbacksC9205.mContainerId);
        if (viewMo7106 instanceof ViewGroup) {
            return (ViewGroup) viewMo7106;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private HashSet m14851() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f16235.m28387().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C5885) it.next()).m16488().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC3477.m10636(viewGroup, m14926()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14884(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f16212;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f16212.size() - 1;
            } else {
                int size2 = this.f16212.size() - 1;
                while (size2 >= 0) {
                    C18105 c18105 = (C18105) this.f16212.get(size2);
                    if (i >= 0 && i == c18105.f56360) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C18105 c18106 = (C18105) this.f16212.get(size - 1);
                        if (i < 0 || i != c18106.f56360) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f16212.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f16212.size() - 1; size3 >= size; size3--) {
            arrayList.add((C18105) this.f16212.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Bundle m14890() {
        int i;
        C14576[] c14576Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m14851().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC3477 abstractC3477 = (AbstractC3477) it.next();
            if (abstractC3477.f10996) {
                m14853(2);
                abstractC3477.f10996 = false;
                abstractC3477.m10640();
            }
        }
        Iterator it2 = m14851().iterator();
        while (it2.hasNext()) {
            ((AbstractC3477) it2.next()).m10644();
        }
        m14907(true);
        this.f16227 = true;
        this.f16234.m49694(true);
        C11530 c11530 = this.f16235;
        ArrayList arrayListM28401 = c11530.m28401();
        ArrayList<C12940> arrayListM28399 = c11530.m28399();
        if (arrayListM28399.isEmpty()) {
            m14853(2);
            return bundle;
        }
        ArrayList arrayListM28385 = c11530.m28385();
        ArrayList arrayList = this.f16212;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            c14576Arr = null;
        } else {
            c14576Arr = new C14576[size];
            for (i = 0; i < size; i++) {
                c14576Arr[i] = new C14576((C18105) this.f16212.get(i));
                if (m14853(2)) {
                    C11003.toString(this.f16212.get(i));
                }
            }
        }
        C15056 c15056 = new C15056();
        c15056.f45952 = arrayListM28401;
        c15056.f45953 = arrayListM28385;
        c15056.f45951 = c14576Arr;
        c15056.f45947 = this.f16236.get();
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16228;
        if (componentCallbacksC9205 != null) {
            c15056.f45948 = componentCallbacksC9205.mWho;
        }
        ArrayList arrayList2 = c15056.f45946;
        Map map = this.f16240;
        arrayList2.addAll(map.keySet());
        c15056.f45950.addAll(map.values());
        c15056.f45949 = new ArrayList(this.f16243);
        bundle.putParcelable("state", c15056);
        Map map2 = this.f16231;
        for (String str : map2.keySet()) {
            bundle.putBundle(C20094.m46315("result_", str), (Bundle) map2.get(str));
        }
        for (C12940 c12940 : arrayListM28399) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", c12940);
            bundle.putBundle("fragment_" + c12940.f38811, bundle2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14865(Parcelable parcelable) {
        C10616 c10616;
        int i;
        C5885 c5885;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f16216.m14435().getClassLoader());
                this.f16231.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f16216.m14435().getClassLoader());
                arrayList.add((C12940) bundle.getParcelable("state"));
            }
        }
        C11530 c11530 = this.f16235;
        c11530.m28390(arrayList);
        C15056 c15056 = (C15056) bundle3.getParcelable("state");
        if (c15056 == null) {
            return;
        }
        c11530.m28384();
        Iterator it = c15056.f45952.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10616 = this.f16218;
            i = 2;
            if (!zHasNext) {
                break;
            }
            C12940 c12940M28375 = c11530.m28375((String) it.next(), null);
            if (c12940M28375 != null) {
                ComponentCallbacksC9205 componentCallbacksC9205M49695 = this.f16234.m49695(c12940M28375.f38811);
                if (componentCallbacksC9205M49695 != null) {
                    if (m14853(2)) {
                        componentCallbacksC9205M49695.toString();
                    }
                    c5885 = new C5885(c10616, c11530, componentCallbacksC9205M49695, c12940M28375);
                } else {
                    c5885 = new C5885(this.f16218, this.f16235, this.f16216.m14435().getClassLoader(), m14889(), c12940M28375);
                }
                ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
                componentCallbacksC9205M16488.mFragmentManager = this;
                if (m14853(2)) {
                    componentCallbacksC9205M16488.toString();
                }
                c5885.m16477(this.f16216.m14435().getClassLoader());
                c11530.m28380(c5885);
                c5885.m16476(this.f16249);
            }
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16234.m49701()) {
            if (!c11530.m28383(componentCallbacksC9205.mWho)) {
                if (m14853(2)) {
                    componentCallbacksC9205.toString();
                    C11003.toString(c15056.f45952);
                }
                this.f16234.m49699(componentCallbacksC9205);
                componentCallbacksC9205.mFragmentManager = this;
                C5885 c5886 = new C5885(c10616, c11530, componentCallbacksC9205);
                c5886.m16476(1);
                c5886.m16481();
                componentCallbacksC9205.mRemoving = true;
                c5886.m16481();
            }
        }
        c11530.m28379(c15056.f45953);
        if (c15056.f45951 != null) {
            this.f16212 = new ArrayList(c15056.f45951.length);
            int i2 = 0;
            while (true) {
                C14576[] c14576Arr = c15056.f45951;
                if (i2 >= c14576Arr.length) {
                    break;
                }
                C14576 c14576 = c14576Arr[i2];
                ArrayList arrayList2 = c14576.f44627;
                C18105 c18105 = new C18105(this);
                int[] iArr = c14576.f44625;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iArr.length) {
                    C11239 c11239 = new C11239();
                    int i5 = i3 + 1;
                    c11239.f33695 = iArr[i3];
                    if (m14853(i)) {
                        C11003.toString(c18105);
                        int i6 = iArr[i5];
                    }
                    c11239.f33703 = EnumC13728.values()[c14576.f44622[i4]];
                    c11239.f33697 = EnumC13728.values()[c14576.f44620[i4]];
                    int i7 = i3 + 2;
                    c11239.f33698 = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c11239.f33699 = i8;
                    int i9 = iArr[i3 + 3];
                    c11239.f33701 = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c11239.f33696 = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c11239.f33702 = i12;
                    c18105.f51815 = i8;
                    c18105.f51803 = i9;
                    c18105.f51804 = i11;
                    c18105.f51808 = i12;
                    c18105.m39683(c11239);
                    i4++;
                    i = 2;
                }
                c18105.f51813 = c14576.f44619;
                c18105.f51814 = c14576.f44624;
                c18105.f51800 = true;
                c18105.f51810 = c14576.f44629;
                c18105.f51807 = c14576.f44621;
                c18105.f51809 = c14576.f44630;
                c18105.f51811 = c14576.f44631;
                c18105.f51802 = c14576.f44628;
                c18105.f51812 = c14576.f44623;
                c18105.f51801 = c14576.f44632;
                c18105.f56360 = c14576.f44626;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    String str3 = (String) arrayList2.get(i13);
                    if (str3 != null) {
                        ((C11239) c18105.f51805.get(i13)).f33700 = c11530.m28389(str3);
                    }
                }
                c18105.m42225(1);
                if (m14853(2)) {
                    c18105.toString();
                    PrintWriter printWriter = new PrintWriter(new C0654());
                    c18105.m42226(EnumC0121.f1143, printWriter, false);
                    printWriter.close();
                }
                this.f16212.add(c18105);
                i2++;
                i = 2;
            }
        } else {
            this.f16212 = null;
        }
        this.f16236.set(c15056.f45947);
        String str4 = c15056.f45948;
        if (str4 != null) {
            ComponentCallbacksC9205 componentCallbacksC9205M28389 = c11530.m28389(str4);
            this.f16228 = componentCallbacksC9205M28389;
            m14847(componentCallbacksC9205M28389);
        }
        ArrayList arrayList3 = c15056.f45946;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.f16240.put((String) arrayList3.get(i14), (C6816) c15056.f45950.get(i14));
            }
        }
        this.f16243 = new ArrayDeque(c15056.f45949);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC4971 m14893() {
        return this.f16216;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14930() {
        return this.f16225;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC15553 m14858() {
        return this.f16238;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14868(AbstractC4971 abstractC4971, AbstractC15553 abstractC15553, ComponentCallbacksC9205 componentCallbacksC9205) {
        Object c6591;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String strM23341;
        Bundle bundleM36036;
        InterfaceC23103 interfaceC23103;
        InterfaceC23586 interfaceC23586;
        if (this.f16216 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f16216 = abstractC4971;
        this.f16238 = abstractC15553;
        this.f16225 = componentCallbacksC9205;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16246;
        if (componentCallbacksC9205 == null) {
            if (abstractC4971 instanceof InterfaceC19997) {
                c6591 = (InterfaceC19997) abstractC4971;
            }
            if (this.f16225 != null) {
                m14846();
            }
            if (abstractC4971 instanceof InterfaceC23103) {
                interfaceC23103 = (InterfaceC23103) abstractC4971;
                C11815 onBackPressedDispatcher = interfaceC23103.getOnBackPressedDispatcher();
                this.f16244 = onBackPressedDispatcher;
                if (componentCallbacksC9205 != null) {
                    interfaceC23586 = interfaceC23103;
                    interfaceC23586 = componentCallbacksC9205;
                }
                interfaceC23586 = interfaceC23103;
                onBackPressedDispatcher.m28894(interfaceC23586, this.f16247);
            }
            if (componentCallbacksC9205 != null) {
                this.f16234 = componentCallbacksC9205.mFragmentManager.f16234.m49698(componentCallbacksC9205);
            } else if (abstractC4971 instanceof InterfaceC13207) {
                this.f16234 = C22113.m49690(((InterfaceC13207) abstractC4971).getViewModelStore());
            } else {
                this.f16234 = new C22113(false);
            }
            this.f16234.m49694(m14910());
            this.f16235.m28382(this.f16234);
            obj = this.f16216;
            if ((obj instanceof InterfaceC22285) && componentCallbacksC9205 == null) {
                C15228 savedStateRegistry = ((InterfaceC22285) obj).getSavedStateRegistry();
                savedStateRegistry.m36039("android:support:fragments", new InterfaceC8174() { // from class: l.۟᩻֫
                    @Override // l.InterfaceC8174
                    /* JADX INFO: renamed from: ֫ */
                    public final Bundle mo1940() {
                        return this.f24087.m14890();
                    }
                });
                bundleM36036 = savedStateRegistry.m36036("android:support:fragments");
                if (bundleM36036 != null) {
                    m14865(bundleM36036);
                }
            }
            obj2 = this.f16216;
            if (obj2 instanceof InterfaceC0567) {
                AbstractC19619 abstractC19619Mo2322 = ((InterfaceC0567) obj2).mo2322();
                if (componentCallbacksC9205 != null) {
                    strM23341 = C9045.m23341(new StringBuilder(), componentCallbacksC9205.mWho, ":");
                } else {
                    strM23341 = "";
                }
                String strM46315 = C20094.m46315("FragmentManager:", strM23341);
                this.f16221 = abstractC19619Mo2322.m45056(C16014.m37867(strM46315, "StartActivityForResult"), new C20324(), new C20703(this));
                this.f16213 = abstractC19619Mo2322.m45056(C16014.m37867(strM46315, "StartIntentSenderForResult"), new C15762(), new C9414(this));
                this.f16248 = abstractC19619Mo2322.m45056(C16014.m37867(strM46315, "RequestPermissions"), new C22440(), new C1652(this));
            }
            obj3 = this.f16216;
            if (obj3 instanceof InterfaceC2999) {
                ((InterfaceC2999) obj3).mo9143(this.f16217);
            }
            obj4 = this.f16216;
            if (obj4 instanceof InterfaceC12876) {
                ((InterfaceC12876) obj4).mo31308(this.f16229);
            }
            obj5 = this.f16216;
            if (obj5 instanceof InterfaceC10509) {
                ((InterfaceC10509) obj5).mo26415(this.f16215);
            }
            obj6 = this.f16216;
            if (obj6 instanceof InterfaceC6275) {
                ((InterfaceC6275) obj6).mo17288(this.f16230);
            }
            obj7 = this.f16216;
            if ((obj7 instanceof InterfaceC19974) || componentCallbacksC9205 != null) {
            }
            ((InterfaceC19974) obj7).addMenuProvider(this.f16211);
            return;
        }
        c6591 = new C6591(componentCallbacksC9205);
        copyOnWriteArrayList.add(c6591);
        if (this.f16225 != null) {
            m14846();
        }
        if (abstractC4971 instanceof InterfaceC23103) {
            interfaceC23103 = (InterfaceC23103) abstractC4971;
            C11815 onBackPressedDispatcher2 = interfaceC23103.getOnBackPressedDispatcher();
            this.f16244 = onBackPressedDispatcher2;
            if (componentCallbacksC9205 != null) {
                interfaceC23586 = interfaceC23103;
                interfaceC23586 = componentCallbacksC9205;
            }
            interfaceC23586 = interfaceC23103;
            onBackPressedDispatcher2.m28894(interfaceC23586, this.f16247);
        }
        if (componentCallbacksC9205 != null) {
            this.f16234 = componentCallbacksC9205.mFragmentManager.f16234.m49698(componentCallbacksC9205);
        } else if (abstractC4971 instanceof InterfaceC13207) {
            this.f16234 = C22113.m49690(((InterfaceC13207) abstractC4971).getViewModelStore());
        } else {
            this.f16234 = new C22113(false);
        }
        this.f16234.m49694(m14910());
        this.f16235.m28382(this.f16234);
        obj = this.f16216;
        if (obj instanceof InterfaceC22285) {
            C15228 savedStateRegistry2 = ((InterfaceC22285) obj).getSavedStateRegistry();
            savedStateRegistry2.m36039("android:support:fragments", new InterfaceC8174() { // from class: l.۟᩻֫
                @Override // l.InterfaceC8174
                /* JADX INFO: renamed from: ֫ */
                public final Bundle mo1940() {
                    return this.f24087.m14890();
                }
            });
            bundleM36036 = savedStateRegistry2.m36036("android:support:fragments");
            if (bundleM36036 != null) {
                m14865(bundleM36036);
            }
        }
        obj2 = this.f16216;
        if (obj2 instanceof InterfaceC0567) {
            AbstractC19619 abstractC19619Mo2323 = ((InterfaceC0567) obj2).mo2322();
            if (componentCallbacksC9205 != null) {
                strM23341 = C9045.m23341(new StringBuilder(), componentCallbacksC9205.mWho, ":");
            } else {
                strM23341 = "";
            }
            String strM46316 = C20094.m46315("FragmentManager:", strM23341);
            this.f16221 = abstractC19619Mo2323.m45056(C16014.m37867(strM46316, "StartActivityForResult"), new C20324(), new C20703(this));
            this.f16213 = abstractC19619Mo2323.m45056(C16014.m37867(strM46316, "StartIntentSenderForResult"), new C15762(), new C9414(this));
            this.f16248 = abstractC19619Mo2323.m45056(C16014.m37867(strM46316, "RequestPermissions"), new C22440(), new C1652(this));
        }
        obj3 = this.f16216;
        if (obj3 instanceof InterfaceC2999) {
            ((InterfaceC2999) obj3).mo9143(this.f16217);
        }
        obj4 = this.f16216;
        if (obj4 instanceof InterfaceC12876) {
            ((InterfaceC12876) obj4).mo31308(this.f16229);
        }
        obj5 = this.f16216;
        if (obj5 instanceof InterfaceC10509) {
            ((InterfaceC10509) obj5).mo26415(this.f16215);
        }
        obj6 = this.f16216;
        if (obj6 instanceof InterfaceC6275) {
            ((InterfaceC6275) obj6).mo17288(this.f16230);
        }
        obj7 = this.f16216;
        if (obj7 instanceof InterfaceC19974) {
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m14909() {
        if (this.f16216 == null) {
            return;
        }
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14870(ComponentCallbacksC9205 componentCallbacksC9205, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f16221 != null) {
            this.f16243.addLast(new C3769(componentCallbacksC9205.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f16221.mo8405(intent);
            return;
        }
        this.f16216.m14427(intent, i, bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14871(ComponentCallbacksC9205 componentCallbacksC9205, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f16213 != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m14853(2)) {
                    bundle.toString();
                    intent2.toString();
                    C11003.toString(componentCallbacksC9205);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C5507 c5507 = new C5507(intentSender);
            c5507.m15642(intent2);
            c5507.m15641(i3, i2);
            C8329 c8329M15640 = c5507.m15640();
            this.f16243.addLast(new C3769(componentCallbacksC9205.mWho, i));
            if (m14853(2)) {
                componentCallbacksC9205.toString();
            }
            this.f16213.mo8405(c8329M15640);
            return;
        }
        this.f16216.m14428(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14874(ComponentCallbacksC9205 componentCallbacksC9205, String[] strArr, int i) {
        if (this.f16248 != null) {
            this.f16243.addLast(new C3769(componentCallbacksC9205.mWho, i));
            this.f16248.mo8405(strArr);
            return;
        }
        this.f16216.getClass();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14923() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(0);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14920() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(1);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m14887() {
        m14854(2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14917() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(4);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m14914() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(5);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m14894() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(7);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14927() {
        m14854(5);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14885() {
        this.f16237 = true;
        this.f16234.m49694(true);
        m14854(4);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m14932() {
        m14854(1);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14911() {
        boolean zIsChangingConfigurations = true;
        this.f16245 = true;
        m14907(true);
        Iterator it = m14851().iterator();
        while (it.hasNext()) {
            ((AbstractC3477) it.next()).m10644();
        }
        AbstractC4971 abstractC4971 = this.f16216;
        boolean z = abstractC4971 instanceof InterfaceC13207;
        C11530 c11530 = this.f16235;
        if (z) {
            zIsChangingConfigurations = c11530.m28393().m49700();
        } else if (C12354.m29972(abstractC4971.m14435())) {
            zIsChangingConfigurations = true ^ ((Activity) this.f16216.m14435()).isChangingConfigurations();
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f16240.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C6816) it2.next()).f21141.iterator();
                while (it3.hasNext()) {
                    c11530.m28393().m49692((String) it3.next());
                }
            }
        }
        m14854(-1);
        Object obj = this.f16216;
        if (obj instanceof InterfaceC12876) {
            ((InterfaceC12876) obj).mo31307(this.f16229);
        }
        Object obj2 = this.f16216;
        if (obj2 instanceof InterfaceC2999) {
            ((InterfaceC2999) obj2).mo9144(this.f16217);
        }
        Object obj3 = this.f16216;
        if (obj3 instanceof InterfaceC10509) {
            ((InterfaceC10509) obj3).mo26414(this.f16215);
        }
        Object obj4 = this.f16216;
        if (obj4 instanceof InterfaceC6275) {
            ((InterfaceC6275) obj4).mo17287(this.f16230);
        }
        Object obj5 = this.f16216;
        if (obj5 instanceof InterfaceC19974) {
            ((InterfaceC19974) obj5).removeMenuProvider(this.f16211);
        }
        this.f16216 = null;
        this.f16238 = null;
        this.f16225 = null;
        if (this.f16244 != null) {
            this.f16247.m2243();
            this.f16244 = null;
        }
        AbstractC9741 abstractC9741 = this.f16221;
        if (abstractC9741 != null) {
            abstractC9741.mo8404();
            this.f16213.mo8404();
            this.f16248.mo8404();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m14854(int i) {
        try {
            this.f16223 = true;
            this.f16235.m28377(i);
            m14864(i, false);
            Iterator it = m14851().iterator();
            while (it.hasNext()) {
                ((AbstractC3477) it.next()).m10644();
            }
            this.f16223 = false;
            m14907(true);
        } catch (Throwable th) {
            this.f16223 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14881(boolean z, boolean z2) {
        if (z2 && (this.f16216 instanceof InterfaceC10509)) {
            m14839(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performMultiWindowModeChanged(z);
                if (z2) {
                    componentCallbacksC9205.mChildFragmentManager.m14881(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14904(boolean z, boolean z2) {
        if (z2 && (this.f16216 instanceof InterfaceC6275)) {
            m14839(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performPictureInPictureModeChanged(z);
                if (z2) {
                    componentCallbacksC9205.mChildFragmentManager.m14904(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14880(boolean z, Configuration configuration) {
        if (z && (this.f16216 instanceof InterfaceC2999)) {
            m14839(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performConfigurationChanged(configuration);
                if (z) {
                    componentCallbacksC9205.mChildFragmentManager.m14880(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14879(boolean z) {
        if (z && (this.f16216 instanceof InterfaceC12876)) {
            m14839(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performLowMemory();
                if (z) {
                    componentCallbacksC9205.mChildFragmentManager.m14879(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14882(Menu menu, MenuInflater menuInflater) {
        if (this.f16249 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.isMenuVisible() && componentCallbacksC9205.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC9205);
                z = true;
            }
        }
        if (this.f16232 != null) {
            for (int i = 0; i < this.f16232.size(); i++) {
                ComponentCallbacksC9205 componentCallbacksC9206 = (ComponentCallbacksC9205) this.f16232.get(i);
                if (arrayList == null || !arrayList.contains(componentCallbacksC9206)) {
                    componentCallbacksC9206.onDestroyOptionsMenu();
                }
            }
        }
        this.f16232 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14905(Menu menu) {
        boolean z = false;
        if (this.f16249 < 1) {
            return false;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.isMenuVisible() && componentCallbacksC9205.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14906(MenuItem menuItem) {
        if (this.f16249 < 1) {
            return false;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14883(MenuItem menuItem) {
        if (this.f16249 < 1) {
            return false;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14866(Menu menu) {
        if (this.f16249 < 1) {
            return;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m14915(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205 != null) {
            if (!componentCallbacksC9205.equals(this.f16235.m28389(componentCallbacksC9205.mWho)) || (componentCallbacksC9205.mHost != null && componentCallbacksC9205.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC9205 + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC9205 componentCallbacksC9206 = this.f16228;
        this.f16228 = componentCallbacksC9205;
        m14847(componentCallbacksC9206);
        m14847(this.f16228);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m14847(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205 != null) {
            if (componentCallbacksC9205.equals(this.f16235.m28389(componentCallbacksC9205.mWho))) {
                componentCallbacksC9205.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m14896() {
        m14846();
        m14847(this.f16228);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14872(ComponentCallbacksC9205 componentCallbacksC9205, EnumC13728 enumC13728) {
        if (!componentCallbacksC9205.equals(this.f16235.m28389(componentCallbacksC9205.mWho)) || (componentCallbacksC9205.mHost != null && componentCallbacksC9205.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC9205 + " is not an active fragment of FragmentManager " + this);
        }
        componentCallbacksC9205.mMaxState = enumC13728;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20494 m14889() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 != null) {
            return componentCallbacksC9205.mFragmentManager.m14889();
        }
        return this.f16242;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13354 m14926() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 != null) {
            return componentCallbacksC9205.mFragmentManager.m14926();
        }
        return this.f16220;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10616 m14929() {
        return this.f16218;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14912(ComponentCallbacksC9205 componentCallbacksC9205) {
        Iterator it = this.f16246.iterator();
        while (it.hasNext()) {
            ((InterfaceC19997) it.next()).mo18099(componentCallbacksC9205);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14891() {
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28394()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.onHiddenChanged(componentCallbacksC9205.isHidden());
                componentCallbacksC9205.mChildFragmentManager.m14891();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m14855(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205.mHasMenu && componentCallbacksC9205.mMenuVisible) {
            return true;
        }
        boolean zM14855 = false;
        for (ComponentCallbacksC9205 componentCallbacksC9206 : componentCallbacksC9205.mChildFragmentManager.f16235.m28394()) {
            if (componentCallbacksC9206 != null) {
                zM14855 = m14855(componentCallbacksC9206);
            }
            if (zM14855) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14928(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205.mAdded && m14855(componentCallbacksC9205)) {
            this.f16222 = true;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private boolean m14849() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 == null) {
            return true;
        }
        return componentCallbacksC9205.isAdded() && this.f16225.getParentFragmentManager().m14849();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater.Factory2 m14913() {
        return this.f16210;
    }
}
