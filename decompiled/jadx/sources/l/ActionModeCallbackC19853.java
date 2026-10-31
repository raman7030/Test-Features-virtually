package l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes4.dex */
public final class ActionModeCallbackC19853 implements ActionMode.Callback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActionMode.Callback f64121;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64122;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f64123;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f64124 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Method f64125;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Class f64126;

    public ActionModeCallbackC19853(ActionMode.Callback callback, TextView textView) {
        this.f64121 = callback;
        this.f64123 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f64121.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f64121.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f64121.onDestroyActionMode(actionMode);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActionMode.Callback m45657() {
        return this.f64121;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        String str;
        TextView textView = this.f64123;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z = this.f64124;
        Class<?> cls = Integer.TYPE;
        if (!z) {
            this.f64124 = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f64126 = cls2;
                this.f64125 = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f64122 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f64126 = null;
                this.f64125 = null;
                this.f64122 = false;
            }
        }
        try {
            if (this.f64122 && this.f64126.isInstance(menu)) {
                declaredMethod = this.f64125;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", cls);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f64121.onPrepareActionMode(actionMode, menu);
    }
}
