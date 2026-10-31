package l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۖ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6218 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2772 implements InterfaceC4557, InterfaceC22285, InterfaceC13207 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C3330 f8636;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15323 f8639;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 f8640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20765 f8638 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21580 f8637 = null;

    public C2772(ComponentCallbacksC9205 componentCallbacksC9205, C3330 c3330) {
        this.f8640 = componentCallbacksC9205;
        this.f8636 = c3330;
    }

    @Override // l.InterfaceC13207
    public final C3330 getViewModelStore() {
        m8563();
        return this.f8636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8563() {
        if (this.f8638 == null) {
            this.f8638 = new C20765(this);
            C21580 c21580 = new C21580(this);
            this.f8637 = c21580;
            c21580.m48749();
            C20970.m47788((InterfaceC22285) this);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m8568() {
        return this.f8638 != null;
    }

    @Override // l.InterfaceC23586
    public final AbstractC7379 getLifecycle() {
        m8563();
        return this.f8638;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8565(EnumC13728 enumC13728) {
        this.f8638.m47437(enumC13728);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8566(EnumC22901 enumC22901) {
        this.f8638.m47438(enumC22901);
    }

    @Override // l.InterfaceC4557
    public final InterfaceC15323 getDefaultViewModelProviderFactory() {
        Application application;
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f8640;
        InterfaceC15323 defaultViewModelProviderFactory = componentCallbacksC9205.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(componentCallbacksC9205.mDefaultFactory)) {
            this.f8639 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f8639 == null) {
            Context applicationContext = componentCallbacksC9205.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f8639 = new C2625(application, this, componentCallbacksC9205.getArguments());
        }
        return this.f8639;
    }

    @Override // l.InterfaceC4557
    public final AbstractC7563 getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f8640;
        Context applicationContext = componentCallbacksC9205.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C16344 c16344 = new C16344();
        if (application != null) {
            c16344.m20277().put(C8269.f25430, application);
        }
        c16344.m20277().put(C20970.f67747, this);
        c16344.m20277().put(C20970.f67748, this);
        if (componentCallbacksC9205.getArguments() != null) {
            c16344.m20277().put(C20970.f67746, componentCallbacksC9205.getArguments());
        }
        return c16344;
    }

    @Override // l.InterfaceC22285
    public final C15228 getSavedStateRegistry() {
        m8563();
        return this.f8637.m48747();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8564(Bundle bundle) {
        this.f8637.m48748(bundle);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8567(Bundle bundle) {
        this.f8637.m48750(bundle);
    }
}
