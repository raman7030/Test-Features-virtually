package com.rosan.dhizuku.api;

import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import com.rosan.dhizuku.shared.DhizukuVariables;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuUserServiceArgs {
    public final Bundle bundle;

    public DhizukuUserServiceArgs(DhizukuUserServiceArgs dhizukuUserServiceArgs) {
        this(dhizukuUserServiceArgs.bundle);
    }

    public DhizukuUserServiceArgs(ComponentName componentName) {
        this.bundle = new Bundle();
        setComponentName(componentName);
    }

    public DhizukuUserServiceArgs(Bundle bundle) {
        this.bundle = bundle;
    }

    public DhizukuUserServiceArgs setComponentName(ComponentName componentName) {
        this.bundle.putParcelable(DhizukuVariables.PARAM_COMPONENT, componentName);
        return this;
    }

    public ComponentName getComponentName() {
        if (Build.VERSION.SDK_INT >= 33) {
            return (ComponentName) this.bundle.getParcelable(DhizukuVariables.PARAM_COMPONENT, ComponentName.class);
        }
        return (ComponentName) this.bundle.getParcelable(DhizukuVariables.PARAM_COMPONENT);
    }

    public Bundle build() {
        Bundle bundle = new Bundle();
        bundle.putAll(this.bundle);
        return bundle;
    }

    public String flattenToShortString() {
        return getComponentName().flattenToShortString();
    }
}
