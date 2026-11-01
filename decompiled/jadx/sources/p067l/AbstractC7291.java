package p067l;

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
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0719o;
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
public abstract class AbstractC7291 {

    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC1413 f19052;

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f19053;

    /* JADX INFO: renamed from: ֫֫ */
    public AbstractC1325 f19054;

    /* JADX INFO: renamed from: ۖ */
    public boolean f19055;

    /* JADX INFO: renamed from: ۗ */
    public final C24527 f19056;

    /* JADX INFO: renamed from: ۘ */
    public AbstractC7093 f19057;

    /* JADX INFO: renamed from: ۙ */
    public final C8434 f19058;

    /* JADX INFO: renamed from: ۚ */
    public final C12458 f19059;

    /* JADX INFO: renamed from: ۜ */
    public C18690 f19061;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC1325 f19062;

    /* JADX INFO: renamed from: ۠ */
    public boolean f19063;

    /* JADX INFO: renamed from: ۡ */
    public boolean f19064;

    /* JADX INFO: renamed from: ۢ */
    public Runnable f19065;

    /* JADX INFO: renamed from: ۤ */
    public ComponentCallbacksC11117 f19066;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f19067;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f19068;

    /* JADX INFO: renamed from: ۨ */
    public ComponentCallbacksC11117 f19069;

    /* JADX INFO: renamed from: ۫ */
    public final C13799 f19070;

    /* JADX INFO: renamed from: ۬ */
    public final C15809 f19071;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f19073;

    /* JADX INFO: renamed from: ܳ֫ */
    public ArrayList f19074;

    /* JADX INFO: renamed from: ܶ */
    public C23384 f19075;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f19078;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC17150 f19079;

    /* JADX INFO: renamed from: ܿ֫ */
    public ArrayList f19080;

    /* JADX INFO: renamed from: ᩳ֫ */
    public ArrayList f19082;

    /* JADX INFO: renamed from: ᩴ */
    public C21846 f19083;

    /* JADX INFO: renamed from: ᩵ */
    public ArrayDeque f19084;

    /* JADX INFO: renamed from: ᩶ */
    public C1428 f19085;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f19086;

    /* JADX INFO: renamed from: ᩸ */
    public final CopyOnWriteArrayList f19087;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC1325 f19089;

    /* JADX INFO: renamed from: ᩻ */
    public int f19090;

    /* JADX INFO: renamed from: ۛ */
    public final ArrayList f19060 = new ArrayList();

    /* JADX INFO: renamed from: ܺ */
    public final C13326 f19076 = new C13326();

    /* JADX INFO: renamed from: ֡ */
    public final LayoutInflaterFactory2C15139 f19051 = new LayoutInflaterFactory2C15139(this);

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC0868 f19088 = new C12656(this);

    /* JADX INFO: renamed from: ܽ */
    public final AtomicInteger f19077 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ */
    public final Map f19081 = C21562.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ܰ */
    public final Map f19072 = C21562.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [l.᩺᩻֫] */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ܰ᩻֫] */
    public AbstractC7291() {
        C21562.synchronizedMap(new HashMap());
        this.f19059 = new C12458(this);
        this.f19087 = new CopyOnWriteArrayList();
        int i = 0;
        this.f19058 = new C8434(i, this);
        this.f19070 = new C13799(i, this);
        this.f19056 = new InterfaceC1489() { // from class: l.᩺᩻֫
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                AbstractC7291.m16754(this.f77689, (C1678) obj);
            }
        };
        this.f19071 = new InterfaceC1489() { // from class: l.ܰ᩻֫
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                AbstractC7291.m16753(this.f45775, (C1223) obj);
            }
        };
        this.f19052 = new C18019(this);
        this.f19090 = -1;
        this.f19083 = new C19361(this);
        this.f19061 = new C18690();
        this.f19084 = new ArrayDeque();
        this.f19065 = new RunnableC16007(this);
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m16763(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16751(AbstractC7291 abstractC7291, Configuration configuration) {
        if (abstractC7291.m16759()) {
            abstractC7291.m16790(false, configuration);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16752(AbstractC7291 abstractC7291, Integer num) {
        if (abstractC7291.m16759() && num.intValue() == 80) {
            abstractC7291.m16789(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16754(AbstractC7291 abstractC7291, C1678 c1678) {
        if (abstractC7291.m16759()) {
            abstractC7291.m16791(c1678.m41865(), false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16753(AbstractC7291 abstractC7291, C1223 c1223) {
        if (abstractC7291.m16759()) {
            abstractC7291.m16814(c1223.m22551(), false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16749(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C2990());
        AbstractC7093 abstractC7093 = this.f19057;
        try {
            if (abstractC7093 != null) {
                abstractC7093.mo16333(printWriter, new String[0]);
            } else {
                m16777(EnumC2483.f3919, (FileDescriptor) null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18413 m16810() {
        return new C19575(this);
    }

    /* JADX INFO: renamed from: ֫֫ */
    private void m16756() {
        synchronized (this.f19060) {
            if (!this.f19060.isEmpty()) {
                this.f19088.m4607(true);
            } else {
                this.f19088.m4607(m16835() > 0 && m16766(this.f19066));
            }
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public static boolean m16766(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (componentCallbacksC11117 == null) {
            return true;
        }
        AbstractC7291 abstractC7291 = componentCallbacksC11117.mFragmentManager;
        return componentCallbacksC11117.equals(abstractC7291.f19069) && m16766(abstractC7291.f19066);
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m16798() {
        m16817(true);
        if (this.f19088.m4609()) {
            m16808();
        } else {
            this.f19085.m30941();
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m16808() {
        return m16755(-1, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16811(int i) {
        m16812(i, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16812(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "Bad id: "));
        }
        m16787(new C2596(this, i), z);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16828(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "Bad id: "));
        }
        m16755(i, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16755(int i, int i2) {
        m16817(false);
        m16762(true);
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f19069;
        if (componentCallbacksC11117 != null && i < 0 && componentCallbacksC11117.getChildFragmentManager().m16808()) {
            return true;
        }
        boolean zM16794 = m16794(this.f19074, this.f19080, i, i2);
        if (zM16794) {
            this.f19064 = true;
            try {
                m16750(this.f19074, this.f19080);
                m16767();
            } catch (Throwable th) {
                m16767();
                throw th;
            }
        }
        m16756();
        boolean z = this.f19055;
        C13326 c13326 = this.f19076;
        if (z) {
            this.f19055 = false;
            Iterator it = c13326.m30433().iterator();
            while (it.hasNext()) {
                m16779((C7961) it.next());
            }
        }
        c13326.m30422();
        return zM16794;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m16835() {
        ArrayList arrayList = this.f19053;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC10644 m16834() {
        return (InterfaceC10644) this.f19053.get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16785(C13748 c13748) {
        if (this.f19067 == null) {
            this.f19067 = new ArrayList();
        }
        this.f19067.add(c13748);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16788(C23187 c23187) {
        View view;
        for (C7961 c7961 : this.f19076.m30433()) {
            ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
            if (componentCallbacksC11117M18414.mContainerId == c23187.getId() && (view = componentCallbacksC11117M18414.mView) != null && view.getParent() == null) {
                componentCallbacksC11117M18414.mContainer = c23187;
                c7961.m18401();
            }
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final List m16769() {
        return this.f19076.m30443();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C5533 m16841(ComponentCallbacksC11117 componentCallbacksC11117) {
        return this.f19075.m52040(componentCallbacksC11117);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16813(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f19075.m52031(componentCallbacksC11117);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m16805(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f19075.m52037(componentCallbacksC11117);
    }

    /* JADX INFO: renamed from: ۗ */
    public final boolean m16796() {
        return this.f19086;
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(128, "FragmentManager{");
        sbM34407.append(Integer.toHexString(System.identityHashCode(this)));
        sbM34407.append(" in ");
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f19066;
        if (componentCallbacksC11117 != null) {
            sbM34407.append(componentCallbacksC11117.getClass().getSimpleName());
            sbM34407.append("{");
            sbM34407.append(Integer.toHexString(System.identityHashCode(this.f19066)));
            sbM34407.append(C0249l.f1198d);
        } else {
            AbstractC7093 abstractC7093 = this.f19057;
            if (abstractC7093 != null) {
                sbM34407.append(abstractC7093.getClass().getSimpleName());
                sbM34407.append("{");
                sbM34407.append(Integer.toHexString(System.identityHashCode(this.f19057)));
                sbM34407.append(C0249l.f1198d);
            } else {
                sbM34407.append("null");
            }
        }
        sbM34407.append("}}");
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16777(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM40053 = C17588.m40053(str, ASN1Dump.TAB);
        this.f19076.m30424(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f19073;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) this.f19073.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC11117.toString());
            }
        }
        ArrayList arrayList2 = this.f19053;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C19575 c19575 = (C19575) this.f19053.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c19575.toString());
                c19575.m44485(strM40053, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f19077.get());
        synchronized (this.f19060) {
            int size3 = this.f19060.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC20703 interfaceC20703 = (InterfaceC20703) this.f19060.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(interfaceC20703);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f19057);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f19079);
        if (this.f19066 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f19066);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f19090);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f19068);
        printWriter.print(" mStopped=");
        printWriter.print(this.f19078);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f19086);
        if (this.f19063) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f19063);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16779(C7961 c7961) {
        ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
        if (componentCallbacksC11117M18414.mDeferStart) {
            if (this.f19064) {
                this.f19055 = true;
            } else {
                componentCallbacksC11117M18414.mDeferStart = false;
                c7961.m18407();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16783(ComponentCallbacksC11117 componentCallbacksC11117, boolean z) {
        ViewGroup viewGroupM16758 = m16758(componentCallbacksC11117);
        if (viewGroupM16758 == null || !(viewGroupM16758 instanceof C23187)) {
            return;
        }
        ((C23187) viewGroupM16758).m51657(!z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16774(int i, boolean z) {
        AbstractC7093 abstractC7093;
        if (this.f19057 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f19090) {
            this.f19090 = i;
            C13326 c13326 = this.f19076;
            c13326.m30448();
            Iterator it = c13326.m30433().iterator();
            while (it.hasNext()) {
                m16779((C7961) it.next());
            }
            if (this.f19063 && (abstractC7093 = this.f19057) != null && this.f19090 == 7) {
                abstractC7093.mo16340();
                this.f19063 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C7961 m16832(ComponentCallbacksC11117 componentCallbacksC11117) {
        String str = componentCallbacksC11117.mWho;
        C13326 c13326 = this.f19076;
        C7961 c7961M30444 = c13326.m30444(str);
        if (c7961M30444 != null) {
            return c7961M30444;
        }
        C7961 c7961 = new C7961(this.f19059, c13326, componentCallbacksC11117);
        c7961.m18403(this.f19057.m16339().getClassLoader());
        c7961.m18402(this.f19090);
        return c7961;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7961 m16771(ComponentCallbacksC11117 componentCallbacksC11117) {
        String str = componentCallbacksC11117.mPreviousWho;
        if (str != null) {
            C24448.m53935(componentCallbacksC11117, str);
        }
        if (m16763(2)) {
            componentCallbacksC11117.toString();
        }
        C7961 c7961M16832 = m16832(componentCallbacksC11117);
        componentCallbacksC11117.mFragmentManager = this;
        C13326 c13326 = this.f19076;
        c13326.m30426(c7961M16832);
        if (!componentCallbacksC11117.mDetached) {
            c13326.m30427(componentCallbacksC11117);
            componentCallbacksC11117.mRemoving = false;
            if (componentCallbacksC11117.mView == null) {
                componentCallbacksC11117.mHiddenChanged = false;
            }
            if (m16765(componentCallbacksC11117)) {
                this.f19063 = true;
            }
        }
        return c7961M16832;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m16807(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (m16763(2)) {
            C12826.toString(componentCallbacksC11117);
        }
        boolean zIsInBackStack = componentCallbacksC11117.isInBackStack();
        if (componentCallbacksC11117.mDetached && zIsInBackStack) {
            return;
        }
        this.f19076.m30442(componentCallbacksC11117);
        if (m16765(componentCallbacksC11117)) {
            this.f19063 = true;
        }
        componentCallbacksC11117.mRemoving = true;
        m16747(componentCallbacksC11117);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m16802(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (m16763(2)) {
            C12826.toString(componentCallbacksC11117);
        }
        if (componentCallbacksC11117.mHidden) {
            return;
        }
        componentCallbacksC11117.mHidden = true;
        componentCallbacksC11117.mHiddenChanged = true ^ componentCallbacksC11117.mHiddenChanged;
        m16747(componentCallbacksC11117);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m16831(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (m16763(2)) {
            C12826.toString(componentCallbacksC11117);
        }
        if (componentCallbacksC11117.mDetached) {
            return;
        }
        componentCallbacksC11117.mDetached = true;
        if (componentCallbacksC11117.mAdded) {
            if (m16763(2)) {
                componentCallbacksC11117.toString();
            }
            this.f19076.m30442(componentCallbacksC11117);
            if (m16765(componentCallbacksC11117)) {
                this.f19063 = true;
            }
            m16747(componentCallbacksC11117);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16829(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (m16763(2)) {
            C12826.toString(componentCallbacksC11117);
        }
        if (componentCallbacksC11117.mDetached) {
            componentCallbacksC11117.mDetached = false;
            if (componentCallbacksC11117.mAdded) {
                return;
            }
            this.f19076.m30427(componentCallbacksC11117);
            if (m16763(2)) {
                componentCallbacksC11117.toString();
            }
            if (m16765(componentCallbacksC11117)) {
                this.f19063 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ComponentCallbacksC11117 m16772(int i) {
        return this.f19076.m30434(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 m16809(String str) {
        return this.f19076.m30441(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final ComponentCallbacksC11117 m16826(String str) {
        return this.f19076.m30446(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ComponentCallbacksC11117 m16773(String str) {
        return this.f19076.m30435(str);
    }

    /* JADX INFO: renamed from: ۬ */
    public final boolean m16820() {
        return this.f19068 || this.f19078;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16787(InterfaceC20703 interfaceC20703, boolean z) {
        if (!z) {
            if (this.f19057 != null) {
                if (m16820()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (this.f19086) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f19060) {
            if (this.f19057 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f19060.add(interfaceC20703);
                m16818();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m16818() {
        synchronized (this.f19060) {
            if (this.f19060.size() == 1) {
                this.f19057.m16338().removeCallbacks(this.f19065);
                this.f19057.m16338().post(this.f19065);
                m16756();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16770() {
        return this.f19077.getAndIncrement();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m16762(boolean z) {
        if (this.f19064) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f19057 == null) {
            if (this.f19086) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() == this.f19057.m16338().getLooper()) {
            if (!z && m16820()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.f19074 == null) {
                this.f19074 = new ArrayList();
                this.f19080 = new ArrayList();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16786(C19575 c19575, boolean z) {
        if (z && (this.f19057 == null || this.f19086)) {
            return;
        }
        m16762(z);
        c19575.mo3897(this.f19074, this.f19080);
        this.f19064 = true;
        try {
            m16750(this.f19074, this.f19080);
            m16767();
            m16756();
            boolean z2 = this.f19055;
            C13326 c13326 = this.f19076;
            if (z2) {
                this.f19055 = false;
                Iterator it = c13326.m30433().iterator();
                while (it.hasNext()) {
                    m16779((C7961) it.next());
                }
            }
            c13326.m30422();
        } catch (Throwable th) {
            m16767();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    private void m16767() {
        this.f19064 = false;
        this.f19080.clear();
        this.f19074.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16817(boolean z) {
        boolean z2;
        m16762(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f19074;
            ArrayList arrayList2 = this.f19080;
            synchronized (this.f19060) {
                if (this.f19060.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f19060.size();
                        boolean zMo3897 = false;
                        for (int i = 0; i < size; i++) {
                            zMo3897 |= ((InterfaceC20703) this.f19060.get(i)).mo3897(arrayList, arrayList2);
                        }
                        this.f19060.clear();
                        this.f19057.m16338().removeCallbacks(this.f19065);
                        z2 = zMo3897;
                    } catch (Throwable th) {
                        this.f19060.clear();
                        this.f19057.m16338().removeCallbacks(this.f19065);
                        throw th;
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f19064 = true;
            try {
                m16750(this.f19074, this.f19080);
                m16767();
            } catch (Throwable th2) {
                m16767();
                throw th2;
            }
        }
        m16756();
        if (this.f19055) {
            this.f19055 = false;
            Iterator it = this.f19076.m30433().iterator();
            while (it.hasNext()) {
                m16779((C7961) it.next());
            }
        }
        this.f19076.m30422();
        return z3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16750(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((C19575) arrayList.get(i)).f54982) {
                if (i2 != i) {
                    m16760(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C19575) arrayList.get(i2)).f54982) {
                        i2++;
                    }
                }
                m16760(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m16760(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX INFO: renamed from: ۧ */
    private void m16760(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C19575 c19575;
        C13326 c13326;
        ComponentCallbacksC11117 componentCallbacksC11117;
        C13326 c13327;
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList;
        boolean z = ((C19575) arrayList3.get(i)).f54982;
        ArrayList arrayList4 = this.f19082;
        if (arrayList4 == null) {
            this.f19082 = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f19082;
        C13326 c13328 = this.f19076;
        arrayList5.addAll(c13328.m30443());
        ComponentCallbacksC11117 componentCallbacksC11118 = this.f19069;
        boolean z2 = false;
        int i5 = i;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                C19575 c19576 = (C19575) arrayList3.get(i5);
                if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                    ArrayList arrayList6 = this.f19082;
                    ArrayList arrayList7 = c19576.f54986;
                    int i7 = 0;
                    while (i7 < arrayList7.size()) {
                        C13050 c13050 = (C13050) arrayList7.get(i7);
                        int i8 = c13050.f36695;
                        if (i8 == i6) {
                            c13327 = c13328;
                            i3 = 1;
                            arrayList6.add(c13050.f36700);
                        } else if (i8 != 2) {
                            if (i8 == 3 || i8 == 6) {
                                arrayList6.remove(c13050.f36700);
                                ComponentCallbacksC11117 componentCallbacksC11119 = c13050.f36700;
                                if (componentCallbacksC11119 == componentCallbacksC11118) {
                                    arrayList7.add(i7, new C13050(componentCallbacksC11119, 9));
                                    i7++;
                                    i3 = 1;
                                    componentCallbacksC11118 = null;
                                }
                                c13327 = c13328;
                            } else if (i8 == 7) {
                                c13327 = c13328;
                                i3 = 1;
                                arrayList6.add(c13050.f36700);
                            } else if (i8 == 8) {
                                arrayList7.add(i7, new C13050(9, componentCallbacksC11118, 0));
                                c13050.f36698 = true;
                                i7++;
                                componentCallbacksC11118 = c13050.f36700;
                            }
                            i3 = 1;
                            c13327 = c13328;
                        } else {
                            ComponentCallbacksC11117 componentCallbacksC111110 = c13050.f36700;
                            int i9 = componentCallbacksC111110.mContainerId;
                            int size = arrayList6.size() - 1;
                            boolean z3 = false;
                            while (size >= 0) {
                                C13326 c13329 = c13328;
                                ComponentCallbacksC11117 componentCallbacksC111111 = (ComponentCallbacksC11117) arrayList6.get(size);
                                if (componentCallbacksC111111.mContainerId != i9) {
                                    i9 = i9;
                                } else if (componentCallbacksC111111 == componentCallbacksC111110) {
                                    i9 = i9;
                                    z3 = true;
                                } else {
                                    if (componentCallbacksC111111 == componentCallbacksC11118) {
                                        i4 = 0;
                                        arrayList7.add(i7, new C13050(9, componentCallbacksC111111, 0));
                                        i7++;
                                        componentCallbacksC11118 = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C13050 c13051 = new C13050(3, componentCallbacksC111111, i4);
                                    c13051.f36699 = c13050.f36699;
                                    c13051.f36696 = c13050.f36696;
                                    c13051.f36701 = c13050.f36701;
                                    c13051.f36702 = c13050.f36702;
                                    arrayList7.add(i7, c13051);
                                    arrayList6.remove(componentCallbacksC111111);
                                    i7++;
                                    componentCallbacksC11118 = componentCallbacksC11118;
                                }
                                size--;
                                i9 = i9;
                                c13328 = c13329;
                            }
                            c13327 = c13328;
                            if (z3) {
                                arrayList7.remove(i7);
                                i7--;
                            } else {
                                c13050.f36695 = 1;
                                c13050.f36698 = true;
                                arrayList6.add(componentCallbacksC111110);
                            }
                            i3 = 1;
                        }
                        i7 += i3;
                        i6 = 1;
                        c13328 = c13327;
                    }
                    c13326 = c13328;
                } else {
                    c13326 = c13328;
                    int i10 = 1;
                    ArrayList arrayList8 = this.f19082;
                    ArrayList arrayList9 = c19576.f54986;
                    int size2 = arrayList9.size() - 1;
                    while (size2 >= 0) {
                        C13050 c13052 = (C13050) arrayList9.get(size2);
                        int i11 = c13052.f36695;
                        if (i11 == i10) {
                            arrayList8.remove(c13052.f36700);
                        } else if (i11 != 3) {
                            switch (i11) {
                                case 6:
                                    arrayList8.add(c13052.f36700);
                                    break;
                                case 7:
                                    arrayList8.remove(c13052.f36700);
                                    break;
                                case 8:
                                    componentCallbacksC11117 = null;
                                    componentCallbacksC11118 = componentCallbacksC11117;
                                    break;
                                case 9:
                                    componentCallbacksC11117 = c13052.f36700;
                                    componentCallbacksC11118 = componentCallbacksC11117;
                                    break;
                                case 10:
                                    c13052.f36697 = c13052.f36703;
                                    break;
                            }
                        } else {
                            arrayList8.add(c13052.f36700);
                        }
                        size2--;
                        i10 = 1;
                    }
                }
                z2 = z2 || c19576.f54981;
                i5++;
                arrayList3 = arrayList;
                c13328 = c13326;
            } else {
                C13326 c133210 = c13328;
                this.f19082.clear();
                if (!z && this.f19090 >= 1) {
                    for (int i12 = i; i12 < i2; i12++) {
                        Iterator it = ((C19575) arrayList.get(i12)).f54986.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC11117 componentCallbacksC111112 = ((C13050) it.next()).f36700;
                            if (componentCallbacksC111112 != null && componentCallbacksC111112.mFragmentManager != null) {
                                c133210.m30426(m16832(componentCallbacksC111112));
                            }
                        }
                    }
                }
                for (int i13 = i; i13 < i2; i13++) {
                    C19575 c19577 = (C19575) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                        c19577.m44484(-1);
                        AbstractC7291 abstractC7291 = c19577.f59572;
                        ArrayList arrayList10 = c19577.f54986;
                        boolean z4 = true;
                        for (int size3 = arrayList10.size() - 1; size3 >= 0; size3--) {
                            C13050 c13053 = (C13050) arrayList10.get(size3);
                            ComponentCallbacksC11117 componentCallbacksC111113 = c13053.f36700;
                            if (componentCallbacksC111113 != null) {
                                componentCallbacksC111113.mBeingSaved = false;
                                componentCallbacksC111113.setPopDirection(z4);
                                int i14 = c19577.f54994;
                                int i15 = C0719o.a.f2912r;
                                if (i14 != 4097) {
                                    if (i14 != 8194) {
                                        i15 = C0719o.a.f2898d;
                                        if (i14 != 8197) {
                                            i15 = i14 != 4099 ? i14 != 4100 ? 0 : C0719o.a.f2915u : C0719o.a.f2897c;
                                        }
                                    } else {
                                        i15 = C0719o.a.f2895a;
                                    }
                                }
                                componentCallbacksC111113.setNextTransition(i15);
                                componentCallbacksC111113.setSharedElementNames(c19577.f54993, c19577.f54983);
                            }
                            switch (c13053.f36695) {
                                case 1:
                                    componentCallbacksC111113.setAnimations(c13053.f36699, c13053.f36701, c13053.f36696, c13053.f36702);
                                    z4 = true;
                                    abstractC7291.m16783(componentCallbacksC111113, true);
                                    abstractC7291.m16807(componentCallbacksC111113);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c13053.f36695);
                                case 3:
                                    componentCallbacksC111113.setAnimations(c13053.f36699, c13053.f36701, c13053.f36696, c13053.f36702);
                                    abstractC7291.m16771(componentCallbacksC111113);
                                    z4 = true;
                                    break;
                                case 4:
                                    componentCallbacksC111113.setAnimations(c13053.f36699, c13053.f36701, c13053.f36696, c13053.f36702);
                                    abstractC7291.getClass();
                                    if (m16763(2)) {
                                        C12826.toString(componentCallbacksC111113);
                                    }
                                    if (componentCallbacksC111113.mHidden) {
                                        componentCallbacksC111113.mHidden = false;
                                        componentCallbacksC111113.mHiddenChanged = !componentCallbacksC111113.mHiddenChanged;
                                    }
                                    z4 = true;
                                    break;
                                case 5:
                                    componentCallbacksC111113.setAnimations(c13053.f36699, c13053.f36701, c13053.f36696, c13053.f36702);
                                    abstractC7291.m16783(componentCallbacksC111113, true);
                                    abstractC7291.m16802(componentCallbacksC111113);
                                    z4 = true;
                                    break;
                                case 6:
                                    componentCallbacksC111113.setAnimations(c13053.f36699, c13053.f36701, c13053.f36696, c13053.f36702);
                                    abstractC7291.m16829(componentCallbacksC111113);
                                    z4 = true;
                                    break;
                                case 7:
                                    componentCallbacksC111113.setAnimations(c13053.f36699, c13053.f36701, c13053.f36696, c13053.f36702);
                                    abstractC7291.m16783(componentCallbacksC111113, true);
                                    abstractC7291.m16831(componentCallbacksC111113);
                                    z4 = true;
                                    break;
                                case 8:
                                    abstractC7291.m16825(null);
                                    z4 = true;
                                    break;
                                case 9:
                                    abstractC7291.m16825(componentCallbacksC111113);
                                    z4 = true;
                                    break;
                                case 10:
                                    abstractC7291.m16782(componentCallbacksC111113, c13053.f36703);
                                    z4 = true;
                                    break;
                            }
                        }
                    } else {
                        c19577.m44484(1);
                        AbstractC7291 abstractC7292 = c19577.f59572;
                        ArrayList arrayList11 = c19577.f54986;
                        int size4 = arrayList11.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            C13050 c13054 = (C13050) arrayList11.get(i16);
                            ComponentCallbacksC11117 componentCallbacksC111114 = c13054.f36700;
                            if (componentCallbacksC111114 != null) {
                                componentCallbacksC111114.mBeingSaved = false;
                                componentCallbacksC111114.setPopDirection(false);
                                componentCallbacksC111114.setNextTransition(c19577.f54994);
                                componentCallbacksC111114.setSharedElementNames(c19577.f54983, c19577.f54993);
                            }
                            switch (c13054.f36695) {
                                case 1:
                                    c19575 = c19577;
                                    componentCallbacksC111114.setAnimations(c13054.f36699, c13054.f36701, c13054.f36696, c13054.f36702);
                                    abstractC7292.m16783(componentCallbacksC111114, false);
                                    abstractC7292.m16771(componentCallbacksC111114);
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c13054.f36695);
                                case 3:
                                    c19575 = c19577;
                                    componentCallbacksC111114.setAnimations(c13054.f36699, c13054.f36701, c13054.f36696, c13054.f36702);
                                    abstractC7292.m16807(componentCallbacksC111114);
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 4:
                                    c19575 = c19577;
                                    componentCallbacksC111114.setAnimations(c13054.f36699, c13054.f36701, c13054.f36696, c13054.f36702);
                                    abstractC7292.m16802(componentCallbacksC111114);
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 5:
                                    c19575 = c19577;
                                    componentCallbacksC111114.setAnimations(c13054.f36699, c13054.f36701, c13054.f36696, c13054.f36702);
                                    abstractC7292.m16783(componentCallbacksC111114, false);
                                    if (m16763(2)) {
                                        C12826.toString(componentCallbacksC111114);
                                    }
                                    if (componentCallbacksC111114.mHidden) {
                                        componentCallbacksC111114.mHidden = false;
                                        componentCallbacksC111114.mHiddenChanged = !componentCallbacksC111114.mHiddenChanged;
                                    }
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 6:
                                    c19575 = c19577;
                                    componentCallbacksC111114.setAnimations(c13054.f36699, c13054.f36701, c13054.f36696, c13054.f36702);
                                    abstractC7292.m16831(componentCallbacksC111114);
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 7:
                                    c19575 = c19577;
                                    componentCallbacksC111114.setAnimations(c13054.f36699, c13054.f36701, c13054.f36696, c13054.f36702);
                                    abstractC7292.m16783(componentCallbacksC111114, false);
                                    abstractC7292.m16829(componentCallbacksC111114);
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 8:
                                    abstractC7292.m16825(componentCallbacksC111114);
                                    c19575 = c19577;
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 9:
                                    abstractC7292.m16825(null);
                                    c19575 = c19577;
                                    i16++;
                                    c19577 = c19575;
                                    break;
                                case 10:
                                    abstractC7292.m16782(componentCallbacksC111114, c13054.f36697);
                                    c19575 = c19577;
                                    i16++;
                                    c19577 = c19575;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C19575 c19578 = (C19575) arrayList.get(i17);
                    if (zBooleanValue) {
                        int size5 = c19578.f54986.size();
                        while (true) {
                            size5--;
                            if (size5 >= 0) {
                                ComponentCallbacksC11117 componentCallbacksC111115 = ((C13050) c19578.f54986.get(size5)).f36700;
                                if (componentCallbacksC111115 != null) {
                                    m16832(componentCallbacksC111115).m18407();
                                }
                            }
                        }
                    } else {
                        Iterator it2 = c19578.f54986.iterator();
                        while (it2.hasNext()) {
                            ComponentCallbacksC11117 componentCallbacksC111116 = ((C13050) it2.next()).f36700;
                            if (componentCallbacksC111116 != null) {
                                m16832(componentCallbacksC111116).m18407();
                            }
                        }
                    }
                }
                m16774(this.f19090, true);
                HashSet<AbstractC5673> hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C19575) arrayList.get(i18)).f54986.iterator();
                    while (it3.hasNext()) {
                        ComponentCallbacksC11117 componentCallbacksC111117 = ((C13050) it3.next()).f36700;
                        if (componentCallbacksC111117 != null && (viewGroup = componentCallbacksC111117.mContainer) != null) {
                            hashSet.add(AbstractC5673.m12631(viewGroup, m16836()));
                        }
                    }
                }
                for (AbstractC5673 abstractC5673 : hashSet) {
                    abstractC5673.f13802 = zBooleanValue;
                    abstractC5673.m12644();
                    abstractC5673.m12635();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C19575 c19579 = (C19575) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c19579.f59573 >= 0) {
                        c19579.f59573 = -1;
                    }
                    c19579.getClass();
                }
                if (!z2 || this.f19067 == null) {
                    return;
                }
                for (int i20 = 0; i20 < this.f19067.size(); i20++) {
                    ((InterfaceC20032) this.f19067.get(i20)).mo31300();
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private void m16747(ComponentCallbacksC11117 componentCallbacksC11117) {
        ViewGroup viewGroupM16758 = m16758(componentCallbacksC11117);
        if (viewGroupM16758 == null || componentCallbacksC11117.getEnterAnim() + componentCallbacksC11117.getExitAnim() + componentCallbacksC11117.getPopEnterAnim() + componentCallbacksC11117.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupM16758.getTag(R.id.MT_Protector) == null) {
            viewGroupM16758.setTag(R.id.MT_Protector, componentCallbacksC11117);
        }
        ((ComponentCallbacksC11117) viewGroupM16758.getTag(R.id.MT_Protector)).setPopDirection(componentCallbacksC11117.getPopDirection());
    }

    /* JADX INFO: renamed from: ۘ */
    private ViewGroup m16758(ComponentCallbacksC11117 componentCallbacksC11117) {
        ViewGroup viewGroup = componentCallbacksC11117.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC11117.mContainerId <= 0 || !this.f19079.mo9202()) {
            return null;
        }
        View viewMo9201 = this.f19079.mo9201(componentCallbacksC11117.mContainerId);
        if (viewMo9201 instanceof ViewGroup) {
            return (ViewGroup) viewMo9201;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ */
    private HashSet m16761() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f19076.m30433().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C7961) it.next()).m18414().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC5673.m12631(viewGroup, m16836()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16794(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f19053;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f19053.size() - 1;
            } else {
                int size2 = this.f19053.size() - 1;
                while (size2 >= 0) {
                    C19575 c19575 = (C19575) this.f19053.get(size2);
                    if (i >= 0 && i == c19575.f59573) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C19575 c19576 = (C19575) this.f19053.get(size - 1);
                        if (i < 0 || i != c19576.f59573) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f19053.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f19053.size() - 1; size3 >= size; size3--) {
            arrayList.add((C19575) this.f19053.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۛ */
    public final Bundle m16800() {
        int i;
        C16221[] c16221Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m16761().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC5673 abstractC5673 = (AbstractC5673) it.next();
            if (abstractC5673.f13801) {
                m16763(2);
                abstractC5673.f13801 = false;
                abstractC5673.m12635();
            }
        }
        Iterator it2 = m16761().iterator();
        while (it2.hasNext()) {
            ((AbstractC5673) it2.next()).m12639();
        }
        m16817(true);
        this.f19068 = true;
        this.f19075.m52032(true);
        C13326 c13326 = this.f19076;
        ArrayList arrayListM30447 = c13326.m30447();
        ArrayList<C14666> arrayListM30445 = c13326.m30445();
        if (arrayListM30445.isEmpty()) {
            m16763(2);
            return bundle;
        }
        ArrayList arrayListM30431 = c13326.m30431();
        ArrayList arrayList = this.f19053;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            c16221Arr = null;
        } else {
            c16221Arr = new C16221[size];
            for (i = 0; i < size; i++) {
                c16221Arr[i] = new C16221((C19575) this.f19053.get(i));
                if (m16763(2)) {
                    C12826.toString(this.f19053.get(i));
                }
            }
        }
        C16677 c16677 = new C16677();
        c16677.f49070 = arrayListM30447;
        c16677.f49071 = arrayListM30431;
        c16677.f49069 = c16221Arr;
        c16677.f49065 = this.f19077.get();
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f19069;
        if (componentCallbacksC11117 != null) {
            c16677.f49066 = componentCallbacksC11117.mWho;
        }
        ArrayList arrayList2 = c16677.f49064;
        Map map = this.f19081;
        arrayList2.addAll(map.keySet());
        c16677.f49068.addAll(map.values());
        c16677.f49067 = new ArrayList(this.f19084);
        bundle.putParcelable("state", c16677);
        Map map2 = this.f19072;
        for (String str : map2.keySet()) {
            bundle.putBundle(C21466.m48631("result_", str), (Bundle) map2.get(str));
        }
        for (C14666 c14666 : arrayListM30445) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", c14666);
            bundle.putBundle("fragment_" + c14666.f41855, bundle2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16775(Parcelable parcelable) {
        C12458 c12458;
        int i;
        C7961 c7961;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f19057.m16339().getClassLoader());
                this.f19072.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f19057.m16339().getClassLoader());
                arrayList.add((C14666) bundle.getParcelable("state"));
            }
        }
        C13326 c13326 = this.f19076;
        c13326.m30436(arrayList);
        C16677 c16677 = (C16677) bundle3.getParcelable("state");
        if (c16677 == null) {
            return;
        }
        c13326.m30430();
        Iterator it = c16677.f49070.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c12458 = this.f19059;
            i = 2;
            if (!zHasNext) {
                break;
            }
            C14666 c14666M30421 = c13326.m30421((String) it.next(), null);
            if (c14666M30421 != null) {
                ComponentCallbacksC11117 componentCallbacksC11117M52033 = this.f19075.m52033(c14666M30421.f41855);
                if (componentCallbacksC11117M52033 != null) {
                    if (m16763(2)) {
                        componentCallbacksC11117M52033.toString();
                    }
                    c7961 = new C7961(c12458, c13326, componentCallbacksC11117M52033, c14666M30421);
                } else {
                    c7961 = new C7961(this.f19059, this.f19076, this.f19057.m16339().getClassLoader(), m16799(), c14666M30421);
                }
                ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
                componentCallbacksC11117M18414.mFragmentManager = this;
                if (m16763(2)) {
                    componentCallbacksC11117M18414.toString();
                }
                c7961.m18403(this.f19057.m16339().getClassLoader());
                c13326.m30426(c7961);
                c7961.m18402(this.f19090);
            }
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19075.m52039()) {
            if (!c13326.m30429(componentCallbacksC11117.mWho)) {
                if (m16763(2)) {
                    componentCallbacksC11117.toString();
                    C12826.toString(c16677.f49070);
                }
                this.f19075.m52037(componentCallbacksC11117);
                componentCallbacksC11117.mFragmentManager = this;
                C7961 c7962 = new C7961(c12458, c13326, componentCallbacksC11117);
                c7962.m18402(1);
                c7962.m18407();
                componentCallbacksC11117.mRemoving = true;
                c7962.m18407();
            }
        }
        c13326.m30425(c16677.f49071);
        if (c16677.f49069 != null) {
            this.f19053 = new ArrayList(c16677.f49069.length);
            int i2 = 0;
            while (true) {
                C16221[] c16221Arr = c16677.f49069;
                if (i2 >= c16221Arr.length) {
                    break;
                }
                C16221 c16221 = c16221Arr[i2];
                ArrayList arrayList2 = c16221.f47735;
                C19575 c19575 = new C19575(this);
                int[] iArr = c16221.f47733;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iArr.length) {
                    C13050 c13050 = new C13050();
                    int i5 = i3 + 1;
                    c13050.f36695 = iArr[i3];
                    if (m16763(i)) {
                        C12826.toString(c19575);
                        int i6 = iArr[i5];
                    }
                    c13050.f36703 = EnumC15415.values()[c16221.f47730[i4]];
                    c13050.f36697 = EnumC15415.values()[c16221.f47728[i4]];
                    int i7 = i3 + 2;
                    c13050.f36698 = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c13050.f36699 = i8;
                    int i9 = iArr[i3 + 3];
                    c13050.f36701 = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c13050.f36696 = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c13050.f36702 = i12;
                    c19575.f54996 = i8;
                    c19575.f54984 = i9;
                    c19575.f54985 = i11;
                    c19575.f54989 = i12;
                    c19575.m41924(c13050);
                    i4++;
                    i = 2;
                }
                c19575.f54994 = c16221.f47727;
                c19575.f54995 = c16221.f47732;
                c19575.f54981 = true;
                c19575.f54991 = c16221.f47737;
                c19575.f54988 = c16221.f47729;
                c19575.f54990 = c16221.f47738;
                c19575.f54992 = c16221.f47739;
                c19575.f54983 = c16221.f47736;
                c19575.f54993 = c16221.f47731;
                c19575.f54982 = c16221.f47740;
                c19575.f59573 = c16221.f47734;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    String str3 = (String) arrayList2.get(i13);
                    if (str3 != null) {
                        ((C13050) c19575.f54986.get(i13)).f36700 = c13326.m30435(str3);
                    }
                }
                c19575.m44484(1);
                if (m16763(2)) {
                    c19575.toString();
                    PrintWriter printWriter = new PrintWriter(new C2990());
                    c19575.m44485(EnumC2483.f3919, printWriter, false);
                    printWriter.close();
                }
                this.f19053.add(c19575);
                i2++;
                i = 2;
            }
        } else {
            this.f19053 = null;
        }
        this.f19077.set(c16677.f49065);
        String str4 = c16677.f49066;
        if (str4 != null) {
            ComponentCallbacksC11117 componentCallbacksC11117M30435 = c13326.m30435(str4);
            this.f19069 = componentCallbacksC11117M30435;
            m16757(componentCallbacksC11117M30435);
        }
        ArrayList arrayList3 = c16677.f49064;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.f19081.put((String) arrayList3.get(i14), (C8846) c16677.f49068.get(i14));
            }
        }
        this.f19084 = new ArrayDeque(c16677.f49067);
    }

    /* JADX INFO: renamed from: ۠ */
    public final AbstractC7093 m16803() {
        return this.f19057;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final ComponentCallbacksC11117 m16840() {
        return this.f19066;
    }

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC17150 m16768() {
        return this.f19079;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m16778(AbstractC7093 abstractC7093, AbstractC17150 abstractC17150, ComponentCallbacksC11117 componentCallbacksC11117) {
        Object c8632;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String strM25286;
        Bundle bundleM38197;
        InterfaceC1988 interfaceC1988;
        InterfaceC24784 interfaceC24784;
        if (this.f19057 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f19057 = abstractC7093;
        this.f19079 = abstractC17150;
        this.f19066 = componentCallbacksC11117;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19087;
        if (componentCallbacksC11117 == null) {
            if (abstractC7093 instanceof InterfaceC21373) {
                c8632 = (InterfaceC21373) abstractC7093;
            }
            if (this.f19066 != null) {
                m16756();
            }
            if (abstractC7093 instanceof InterfaceC1988) {
                interfaceC1988 = (InterfaceC1988) abstractC7093;
                C1428 onBackPressedDispatcher = interfaceC1988.getOnBackPressedDispatcher();
                this.f19085 = onBackPressedDispatcher;
                if (componentCallbacksC11117 != null) {
                    interfaceC24784 = interfaceC1988;
                    interfaceC24784 = componentCallbacksC11117;
                }
                interfaceC24784 = interfaceC1988;
                onBackPressedDispatcher.m30943(interfaceC24784, this.f19088);
            }
            if (componentCallbacksC11117 != null) {
                this.f19075 = componentCallbacksC11117.mFragmentManager.f19075.m52036(componentCallbacksC11117);
            } else if (abstractC7093 instanceof InterfaceC14920) {
                this.f19075 = C23384.m52028(((InterfaceC14920) abstractC7093).getViewModelStore());
            } else {
                this.f19075 = new C23384(false);
            }
            this.f19075.m52032(m16820());
            this.f19076.m30428(this.f19075);
            obj = this.f19057;
            if ((obj instanceof InterfaceC23548) && componentCallbacksC11117 == null) {
                C16841 savedStateRegistry = ((InterfaceC23548) obj).getSavedStateRegistry();
                savedStateRegistry.m38200("android:support:fragments", new InterfaceC10137() { // from class: l.۟᩻֫
                    @Override // p067l.InterfaceC10137
                    /* JADX INFO: renamed from: ֫ */
                    public final Bundle mo4332() {
                        return this.f27004.m16800();
                    }
                });
                bundleM38197 = savedStateRegistry.m38197("android:support:fragments");
                if (bundleM38197 != null) {
                    m16775(bundleM38197);
                }
            }
            obj2 = this.f19057;
            if (obj2 instanceof InterfaceC0870) {
                AbstractC1815 abstractC1815Mo4693 = ((InterfaceC0870) obj2).mo4693();
                if (componentCallbacksC11117 != null) {
                    strM25286 = C10965.m25286(new StringBuilder(), componentCallbacksC11117.mWho, ":");
                } else {
                    strM25286 = "";
                }
                String strM48631 = C21466.m48631("FragmentManager:", strM25286);
                this.f19062 = abstractC1815Mo4693.m47352(C17588.m40053(strM48631, "StartActivityForResult"), new C1850(), new C22044(this));
                this.f19054 = abstractC1815Mo4693.m47352(C17588.m40053(strM48631, "StartIntentSenderForResult"), new C17348(), new C11315(this));
                this.f19089 = abstractC1815Mo4693.m47352(C17588.m40053(strM48631, "RequestPermissions"), new C1955(), new C3938(this));
            }
            obj3 = this.f19057;
            if (obj3 instanceof InterfaceC0991) {
                ((InterfaceC0991) obj3).mo11194(this.f19058);
            }
            obj4 = this.f19057;
            if (obj4 instanceof InterfaceC1481) {
                ((InterfaceC1481) obj4).mo33394(this.f19070);
            }
            obj5 = this.f19057;
            if (obj5 instanceof InterfaceC1363) {
                ((InterfaceC1363) obj5).mo28448(this.f19056);
            }
            obj6 = this.f19057;
            if (obj6 instanceof InterfaceC1153) {
                ((InterfaceC1153) obj6).mo19226(this.f19071);
            }
            obj7 = this.f19057;
            if ((obj7 instanceof InterfaceC1833) || componentCallbacksC11117 != null) {
            }
            ((InterfaceC1833) obj7).addMenuProvider(this.f19052);
            return;
        }
        c8632 = new C8632(componentCallbacksC11117);
        copyOnWriteArrayList.add(c8632);
        if (this.f19066 != null) {
            m16756();
        }
        if (abstractC7093 instanceof InterfaceC1988) {
            interfaceC1988 = (InterfaceC1988) abstractC7093;
            C1428 onBackPressedDispatcher2 = interfaceC1988.getOnBackPressedDispatcher();
            this.f19085 = onBackPressedDispatcher2;
            if (componentCallbacksC11117 != null) {
                interfaceC24784 = interfaceC1988;
                interfaceC24784 = componentCallbacksC11117;
            }
            interfaceC24784 = interfaceC1988;
            onBackPressedDispatcher2.m30943(interfaceC24784, this.f19088);
        }
        if (componentCallbacksC11117 != null) {
            this.f19075 = componentCallbacksC11117.mFragmentManager.f19075.m52036(componentCallbacksC11117);
        } else if (abstractC7093 instanceof InterfaceC14920) {
            this.f19075 = C23384.m52028(((InterfaceC14920) abstractC7093).getViewModelStore());
        } else {
            this.f19075 = new C23384(false);
        }
        this.f19075.m52032(m16820());
        this.f19076.m30428(this.f19075);
        obj = this.f19057;
        if (obj instanceof InterfaceC23548) {
            C16841 savedStateRegistry2 = ((InterfaceC23548) obj).getSavedStateRegistry();
            savedStateRegistry2.m38200("android:support:fragments", new InterfaceC10137() { // from class: l.۟᩻֫
                @Override // p067l.InterfaceC10137
                /* JADX INFO: renamed from: ֫ */
                public final Bundle mo4332() {
                    return this.f27004.m16800();
                }
            });
            bundleM38197 = savedStateRegistry2.m38197("android:support:fragments");
            if (bundleM38197 != null) {
                m16775(bundleM38197);
            }
        }
        obj2 = this.f19057;
        if (obj2 instanceof InterfaceC0870) {
            AbstractC1815 abstractC1815Mo4694 = ((InterfaceC0870) obj2).mo4693();
            if (componentCallbacksC11117 != null) {
                strM25286 = C10965.m25286(new StringBuilder(), componentCallbacksC11117.mWho, ":");
            } else {
                strM25286 = "";
            }
            String strM48632 = C21466.m48631("FragmentManager:", strM25286);
            this.f19062 = abstractC1815Mo4694.m47352(C17588.m40053(strM48632, "StartActivityForResult"), new C1850(), new C22044(this));
            this.f19054 = abstractC1815Mo4694.m47352(C17588.m40053(strM48632, "StartIntentSenderForResult"), new C17348(), new C11315(this));
            this.f19089 = abstractC1815Mo4694.m47352(C17588.m40053(strM48632, "RequestPermissions"), new C1955(), new C3938(this));
        }
        obj3 = this.f19057;
        if (obj3 instanceof InterfaceC0991) {
            ((InterfaceC0991) obj3).mo11194(this.f19058);
        }
        obj4 = this.f19057;
        if (obj4 instanceof InterfaceC1481) {
            ((InterfaceC1481) obj4).mo33394(this.f19070);
        }
        obj5 = this.f19057;
        if (obj5 instanceof InterfaceC1363) {
            ((InterfaceC1363) obj5).mo28448(this.f19056);
        }
        obj6 = this.f19057;
        if (obj6 instanceof InterfaceC1153) {
            ((InterfaceC1153) obj6).mo19226(this.f19071);
        }
        obj7 = this.f19057;
        if (obj7 instanceof InterfaceC1833) {
        }
    }

    /* JADX INFO: renamed from: ۫ */
    public final void m16819() {
        if (this.f19057 == null) {
            return;
        }
        this.f19068 = false;
        this.f19078 = false;
        this.f19075.m52032(false);
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16780(ComponentCallbacksC11117 componentCallbacksC11117, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f19062 != null) {
            this.f19084.addLast(new C5950(componentCallbacksC11117.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f19062.mo10451(intent);
            return;
        }
        this.f19057.m16331(intent, i, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16781(ComponentCallbacksC11117 componentCallbacksC11117, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f19054 != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m16763(2)) {
                    bundle.toString();
                    intent2.toString();
                    C12826.toString(componentCallbacksC11117);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C1115 c1115 = new C1115(intentSender);
            c1115.m17557(intent2);
            c1115.m17556(i3, i2);
            C1255 c1255M17555 = c1115.m17555();
            this.f19084.addLast(new C5950(componentCallbacksC11117.mWho, i));
            if (m16763(2)) {
                componentCallbacksC11117.toString();
            }
            this.f19054.mo10451(c1255M17555);
            return;
        }
        this.f19057.m16332(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16784(ComponentCallbacksC11117 componentCallbacksC11117, String[] strArr, int i) {
        if (this.f19089 != null) {
            this.f19084.addLast(new C5950(componentCallbacksC11117.mWho, i));
            this.f19089.mo10451(strArr);
            return;
        }
        this.f19057.getClass();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m16833() {
        this.f19068 = false;
        this.f19078 = false;
        this.f19075.m52032(false);
        m16764(0);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m16830() {
        this.f19068 = false;
        this.f19078 = false;
        this.f19075.m52032(false);
        m16764(1);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m16797() {
        m16764(2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16827() {
        this.f19068 = false;
        this.f19078 = false;
        this.f19075.m52032(false);
        m16764(4);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m16824() {
        this.f19068 = false;
        this.f19078 = false;
        this.f19075.m52032(false);
        m16764(5);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m16804() {
        this.f19068 = false;
        this.f19078 = false;
        this.f19075.m52032(false);
        m16764(7);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m16837() {
        m16764(5);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m16795() {
        this.f19078 = true;
        this.f19075.m52032(true);
        m16764(4);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m16842() {
        m16764(1);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m16821() {
        boolean zIsChangingConfigurations = true;
        this.f19086 = true;
        m16817(true);
        Iterator it = m16761().iterator();
        while (it.hasNext()) {
            ((AbstractC5673) it.next()).m12639();
        }
        AbstractC7093 abstractC7093 = this.f19057;
        boolean z = abstractC7093 instanceof InterfaceC14920;
        C13326 c13326 = this.f19076;
        if (z) {
            zIsChangingConfigurations = c13326.m30439().m52038();
        } else if (C14110.m32033(abstractC7093.m16339())) {
            zIsChangingConfigurations = true ^ ((Activity) this.f19057.m16339()).isChangingConfigurations();
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f19081.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C8846) it2.next()).f24018.iterator();
                while (it3.hasNext()) {
                    c13326.m30439().m52030((String) it3.next());
                }
            }
        }
        m16764(-1);
        Object obj = this.f19057;
        if (obj instanceof InterfaceC1481) {
            ((InterfaceC1481) obj).mo33393(this.f19070);
        }
        Object obj2 = this.f19057;
        if (obj2 instanceof InterfaceC0991) {
            ((InterfaceC0991) obj2).mo11195(this.f19058);
        }
        Object obj3 = this.f19057;
        if (obj3 instanceof InterfaceC1363) {
            ((InterfaceC1363) obj3).mo28447(this.f19056);
        }
        Object obj4 = this.f19057;
        if (obj4 instanceof InterfaceC1153) {
            ((InterfaceC1153) obj4).mo19225(this.f19071);
        }
        Object obj5 = this.f19057;
        if (obj5 instanceof InterfaceC1833) {
            ((InterfaceC1833) obj5).removeMenuProvider(this.f19052);
        }
        this.f19057 = null;
        this.f19079 = null;
        this.f19066 = null;
        if (this.f19085 != null) {
            this.f19088.m4610();
            this.f19085 = null;
        }
        AbstractC1325 abstractC1325 = this.f19062;
        if (abstractC1325 != null) {
            abstractC1325.mo10450();
            this.f19054.mo10450();
            this.f19089.mo10450();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m16764(int i) {
        try {
            this.f19064 = true;
            this.f19076.m30423(i);
            m16774(i, false);
            Iterator it = m16761().iterator();
            while (it.hasNext()) {
                ((AbstractC5673) it.next()).m12639();
            }
            this.f19064 = false;
            m16817(true);
        } catch (Throwable th) {
            this.f19064 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16791(boolean z, boolean z2) {
        if (z2 && (this.f19057 instanceof InterfaceC1363)) {
            m16749(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.performMultiWindowModeChanged(z);
                if (z2) {
                    componentCallbacksC11117.mChildFragmentManager.m16791(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16814(boolean z, boolean z2) {
        if (z2 && (this.f19057 instanceof InterfaceC1153)) {
            m16749(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.performPictureInPictureModeChanged(z);
                if (z2) {
                    componentCallbacksC11117.mChildFragmentManager.m16814(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16790(boolean z, Configuration configuration) {
        if (z && (this.f19057 instanceof InterfaceC0991)) {
            m16749(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.performConfigurationChanged(configuration);
                if (z) {
                    componentCallbacksC11117.mChildFragmentManager.m16790(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16789(boolean z) {
        if (z && (this.f19057 instanceof InterfaceC1481)) {
            m16749(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.performLowMemory();
                if (z) {
                    componentCallbacksC11117.mChildFragmentManager.m16789(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16792(Menu menu, MenuInflater menuInflater) {
        if (this.f19090 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null && componentCallbacksC11117.isMenuVisible() && componentCallbacksC11117.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC11117);
                z = true;
            }
        }
        if (this.f19073 != null) {
            for (int i = 0; i < this.f19073.size(); i++) {
                ComponentCallbacksC11117 componentCallbacksC11118 = (ComponentCallbacksC11117) this.f19073.get(i);
                if (arrayList == null || !arrayList.contains(componentCallbacksC11118)) {
                    componentCallbacksC11118.onDestroyOptionsMenu();
                }
            }
        }
        this.f19073 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16815(Menu menu) {
        boolean z = false;
        if (this.f19090 < 1) {
            return false;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null && componentCallbacksC11117.isMenuVisible() && componentCallbacksC11117.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16816(MenuItem menuItem) {
        if (this.f19090 < 1) {
            return false;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null && componentCallbacksC11117.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16793(MenuItem menuItem) {
        if (this.f19090 < 1) {
            return false;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null && componentCallbacksC11117.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16776(Menu menu) {
        if (this.f19090 < 1) {
            return;
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30443()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m16825(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (componentCallbacksC11117 != null) {
            if (!componentCallbacksC11117.equals(this.f19076.m30435(componentCallbacksC11117.mWho)) || (componentCallbacksC11117.mHost != null && componentCallbacksC11117.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC11117 + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC11117 componentCallbacksC11118 = this.f19069;
        this.f19069 = componentCallbacksC11117;
        m16757(componentCallbacksC11118);
        m16757(this.f19069);
    }

    /* JADX INFO: renamed from: ۖ */
    private void m16757(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (componentCallbacksC11117 != null) {
            if (componentCallbacksC11117.equals(this.f19076.m30435(componentCallbacksC11117.mWho))) {
                componentCallbacksC11117.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m16806() {
        m16756();
        m16757(this.f19069);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16782(ComponentCallbacksC11117 componentCallbacksC11117, EnumC15415 enumC15415) {
        if (!componentCallbacksC11117.equals(this.f19076.m30435(componentCallbacksC11117.mWho)) || (componentCallbacksC11117.mHost != null && componentCallbacksC11117.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC11117 + " is not an active fragment of FragmentManager " + this);
        }
        componentCallbacksC11117.mMaxState = enumC15415;
    }

    /* JADX INFO: renamed from: ۚ */
    public final C21846 m16799() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f19066;
        if (componentCallbacksC11117 != null) {
            return componentCallbacksC11117.mFragmentManager.m16799();
        }
        return this.f19083;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC15060 m16836() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f19066;
        if (componentCallbacksC11117 != null) {
            return componentCallbacksC11117.mFragmentManager.m16836();
        }
        return this.f19061;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final C12458 m16839() {
        return this.f19059;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m16822(ComponentCallbacksC11117 componentCallbacksC11117) {
        Iterator it = this.f19087.iterator();
        while (it.hasNext()) {
            ((InterfaceC21373) it.next()).mo20051(componentCallbacksC11117);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m16801() {
        for (ComponentCallbacksC11117 componentCallbacksC11117 : this.f19076.m30440()) {
            if (componentCallbacksC11117 != null) {
                componentCallbacksC11117.onHiddenChanged(componentCallbacksC11117.isHidden());
                componentCallbacksC11117.mChildFragmentManager.m16801();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m16765(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (componentCallbacksC11117.mHasMenu && componentCallbacksC11117.mMenuVisible) {
            return true;
        }
        boolean zM16765 = false;
        for (ComponentCallbacksC11117 componentCallbacksC11118 : componentCallbacksC11117.mChildFragmentManager.f19076.m30440()) {
            if (componentCallbacksC11118 != null) {
                zM16765 = m16765(componentCallbacksC11118);
            }
            if (zM16765) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m16838(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (componentCallbacksC11117.mAdded && m16765(componentCallbacksC11117)) {
            this.f19063 = true;
        }
    }

    /* JADX INFO: renamed from: ۟ */
    private boolean m16759() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f19066;
        if (componentCallbacksC11117 == null) {
            return true;
        }
        return componentCallbacksC11117.isAdded() && this.f19066.getParentFragmentManager().m16759();
    }

    /* JADX INFO: renamed from: ܶ */
    public final LayoutInflater.Factory2 m16823() {
        return this.f19051;
    }
}
