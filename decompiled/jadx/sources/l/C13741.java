package l;

import android.R;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.ComponentInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21X6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13741 extends PackageManager {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f41019;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Resources f41020;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ApplicationInfo f41021;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f41022;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Drawable f41023;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f41024;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f41025;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f41026;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f41027;

    @Override // android.content.pm.PackageManager
    public final boolean canRequestPackageInstalls() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final int checkPermission(String str, String str2) {
        return -1;
    }

    @Override // android.content.pm.PackageManager
    public final ChangedPackages getChangedPackages(int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final String getInstallerPackageName(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final byte[] getInstantAppCookie() {
        return new byte[0];
    }

    @Override // android.content.pm.PackageManager
    public final int getInstantAppCookieMaxBytes() {
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLaunchIntentForPackage(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final FeatureInfo[] getSystemAvailableFeatures() {
        return new FeatureInfo[0];
    }

    @Override // android.content.pm.PackageManager
    public final String[] getSystemSharedLibraryNames() {
        return new String[0];
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return drawable;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return drawable;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return charSequence;
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str, int i) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp(String str) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isPermissionRevokedByPolicy(String str, String str2) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isSafeMode() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveService(Intent intent, int i) {
        return null;
    }

    public C13741(PackageInfo packageInfo, ApplicationInfo applicationInfo, Resources resources, String str) {
        Drawable colorDrawable;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m33045(packageInfo.activities);
        packageInfo2.receivers = m33045(packageInfo.receivers);
        packageInfo2.services = m33047(packageInfo.services);
        packageInfo2.providers = m33046(packageInfo.providers);
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        packageInfo2.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
        String[] strArr = packageInfo.requestedPermissions;
        packageInfo2.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
        int[] iArr = packageInfo.requestedPermissionsFlags;
        packageInfo2.requestedPermissionsFlags = iArr == null ? null : (int[]) iArr.clone();
        int[] iArr2 = packageInfo.gids;
        packageInfo2.gids = iArr2 == null ? null : (int[]) iArr2.clone();
        Signature[] signatureArr = packageInfo.signatures;
        packageInfo2.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.versionCode = packageInfo.versionCode;
        packageInfo2.versionName = packageInfo.versionName;
        m33042(packageInfo, packageInfo2);
        this.f41025 = packageInfo2;
        this.f41021 = new ApplicationInfo(applicationInfo);
        this.f41020 = resources;
        this.f41024 = str;
        try {
            Drawable drawable = Resources.getSystem().getDrawable(R.drawable.sym_def_app_icon, null);
            if (drawable != null) {
                colorDrawable = drawable.mutate();
            } else {
                colorDrawable = new ColorDrawable(0);
            }
        } catch (Throwable unused) {
        }
        this.f41023 = colorDrawable;
        PackageInfo packageInfo3 = this.f41025;
        packageInfo3.packageName = str;
        packageInfo3.applicationInfo = this.f41021;
        this.f41019 = m33049(packageInfo3.activities);
        this.f41027 = m33049(this.f41025.receivers);
        ServiceInfo[] serviceInfoArr = this.f41025.services;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo != null && serviceInfo.packageName != null && serviceInfo.name != null) {
                    ServiceInfo serviceInfo2 = new ServiceInfo(serviceInfo);
                    linkedHashMap.put(new ComponentName(serviceInfo2.packageName, serviceInfo2.name), serviceInfo2);
                }
            }
        }
        this.f41026 = linkedHashMap;
        ProviderInfo[] providerInfoArr = this.f41025.providers;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (providerInfo != null && providerInfo.packageName != null && providerInfo.name != null) {
                    ProviderInfo providerInfo2 = new ProviderInfo(providerInfo);
                    linkedHashMap2.put(new ComponentName(providerInfo2.packageName, providerInfo2.name), providerInfo2);
                }
            }
        }
        this.f41022 = linkedHashMap2;
        m33043(this.f41019);
        m33043(this.f41027);
        m33043(this.f41026);
        m33043(linkedHashMap2);
        this.f41025.activities = m33045((ActivityInfo[]) this.f41019.values().toArray(new ActivityInfo[0]));
        this.f41025.receivers = m33045((ActivityInfo[]) this.f41027.values().toArray(new ActivityInfo[0]));
        this.f41025.services = m33047((ServiceInfo[]) this.f41026.values().toArray(new ServiceInfo[0]));
        this.f41025.providers = m33046((ProviderInfo[]) linkedHashMap2.values().toArray(new ProviderInfo[0]));
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        m33050(str);
        return m33040(i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        m33050(versionedPackage == null ? null : versionedPackage.getPackageName());
        return m33040(i);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
        m33050(str);
        return new int[]{Process.myUid()};
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str, int i) throws PackageManager.NameNotFoundException {
        m33050(str);
        return new int[]{Process.myUid()};
    }

    @Override // android.content.pm.PackageManager
    public final int getPackageUid(String str, int i) throws PackageManager.NameNotFoundException {
        m33050(str);
        return Process.myUid();
    }

    @Override // android.content.pm.PackageManager
    public final PermissionInfo getPermissionInfo(String str, int i) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException(str);
    }

    @Override // android.content.pm.PackageManager
    public final List queryPermissionsByGroup(String str, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException(str);
    }

    @Override // android.content.pm.PackageManager
    public final List getAllPermissionGroups(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
        m33050(str);
        return new ApplicationInfo(this.f41021);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return new ActivityInfo(m33039(componentName));
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = componentName == null ? null : (ActivityInfo) this.f41027.get(componentName);
        if (activityInfo != null) {
            return new ActivityInfo(activityInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo = componentName == null ? null : (ServiceInfo) this.f41026.get(componentName);
        if (serviceInfo != null) {
            return new ServiceInfo(serviceInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo = componentName == null ? null : (ProviderInfo) this.f41022.get(componentName);
        if (providerInfo != null) {
            return new ProviderInfo(providerInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledPackages(int i) {
        return Collections.singletonList(m33040(i));
    }

    @Override // android.content.pm.PackageManager
    public final List getPackagesHoldingPermissions(String[] strArr, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        throw m33041("addPermission");
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        throw m33041("addPermissionAsync");
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        throw m33041("removePermission");
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        return (i == Process.myUid() && i2 == Process.myUid()) ? 0 : -3;
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        if (i == Process.myUid()) {
            return new String[]{this.f41024};
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        if (i == Process.myUid()) {
            return this.f41024;
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledApplications(int i) {
        return Collections.singletonList(new ApplicationInfo(this.f41021));
    }

    @Override // android.content.pm.PackageManager
    public final void clearInstantAppCookie() {
        throw m33041("clearInstantAppCookie");
    }

    @Override // android.content.pm.PackageManager
    public final void updateInstantAppCookie(byte[] bArr) {
        throw m33041("updateInstantAppCookie");
    }

    @Override // android.content.pm.PackageManager
    public final List getSharedLibraries(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivities(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryBroadcastReceivers(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentServices(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentContentProviders(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryContentProviders(String str, int i, int i2) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException(componentName == null ? null : componentName.flattenToShortString());
    }

    @Override // android.content.pm.PackageManager
    public final List queryInstrumentation(String str, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM33039 = m33039(componentName);
        int i = activityInfoM33039.icon;
        int i2 = activityInfoM33039.applicationInfo.icon;
        if (i == 0) {
            i = i2;
        }
        Drawable drawableM33048 = m33048(i);
        return drawableM33048 != null ? drawableM33048 : getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            throw new PackageManager.NameNotFoundException(String.valueOf(intent));
        }
        return getActivityIcon(component);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM33039 = m33039(componentName);
        int i = activityInfoM33039.banner;
        int i2 = activityInfoM33039.applicationInfo.banner;
        if (i == 0) {
            i = i2;
        }
        return m33048(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            throw new PackageManager.NameNotFoundException(String.valueOf(intent));
        }
        return getActivityBanner(component);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDefaultActivityIcon() {
        Drawable.ConstantState constantState = this.f41023.getConstantState();
        return constantState != null ? constantState.newDrawable().mutate() : new ColorDrawable(0);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        if (!m33044(applicationInfo)) {
            return null;
        }
        Drawable drawableM33048 = m33048(applicationInfo.icon);
        return drawableM33048 != null ? drawableM33048 : getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
        m33050(str);
        return getApplicationIcon(this.f41021);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        if (m33044(applicationInfo)) {
            return m33048(applicationInfo.banner);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
        m33050(str);
        return getApplicationBanner(this.f41021);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM33039 = m33039(componentName);
        int i = activityInfoM33039.logo;
        int i2 = activityInfoM33039.applicationInfo.logo;
        if (i == 0) {
            i = i2;
        }
        return m33048(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            throw new PackageManager.NameNotFoundException(String.valueOf(intent));
        }
        return getActivityLogo(component);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        if (m33044(applicationInfo)) {
            return m33048(applicationInfo.logo);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
        m33050(str);
        return getApplicationLogo(this.f41021);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        CharSequence text = null;
        if (!m33044(applicationInfo)) {
            return null;
        }
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence;
        }
        int i = applicationInfo.labelRes;
        if (i != 0) {
            try {
                text = this.f41020.getText(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return text != null ? text : applicationInfo.packageName;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
        m33039(componentName);
        return this.f41020;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
        if (!m33044(applicationInfo)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this.f41020;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
        m33050(str);
        return this.f41020;
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        throw m33041("verifyPendingInstall");
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        throw m33041("extendVerificationTimeout");
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        throw m33041("setInstallerPackageName");
    }

    @Override // android.content.pm.PackageManager
    public final void addPackageToPreferred(String str) {
        throw m33041("addPackageToPreferred");
    }

    @Override // android.content.pm.PackageManager
    public final void removePackageFromPreferred(String str) {
        throw m33041("removePackageFromPreferred");
    }

    @Override // android.content.pm.PackageManager
    public final List getPreferredPackages(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        throw m33041("addPreferredActivity");
    }

    @Override // android.content.pm.PackageManager
    public final void clearPackagePreferredActivities(String str) {
        throw m33041("clearPackagePreferredActivities");
    }

    @Override // android.content.pm.PackageManager
    public final int getPreferredActivities(List list, List list2, String str) {
        list.clear();
        list2.clear();
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        throw m33041("setComponentEnabledSetting");
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        throw m33041("setApplicationEnabledSetting");
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationCategoryHint(String str, int i) {
        throw m33041("setApplicationCategoryHint");
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        throw m33041("getPackageInstaller");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m33050(String str) throws PackageManager.NameNotFoundException {
        if (!this.f41024.equals(str)) {
            throw new PackageManager.NameNotFoundException(str);
        }
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        String str3 = this.f41024;
        return (str3.equals(str) && str3.equals(str2)) ? 0 : -3;
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        return this.f41024.equals(str) ? 0 : 2;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        if (this.f41024.equals(str) || m33044(applicationInfo)) {
            return m33048(i);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        if ((this.f41024.equals(str) || m33044(applicationInfo)) && i != 0) {
            try {
                return this.f41020.getText(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        if ((!this.f41024.equals(str) && !m33044(applicationInfo)) || i == 0) {
            return null;
        }
        try {
            return this.f41020.getXml(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33044(ApplicationInfo applicationInfo) {
        if (applicationInfo != null) {
            return this.f41024.equals(applicationInfo.packageName);
        }
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        if (componentName != null) {
            return (this.f41019.containsKey(componentName) || this.f41027.containsKey(componentName) || this.f41026.containsKey(componentName) || this.f41022.containsKey(componentName)) ? 0 : 2;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ActivityInfo m33039(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = componentName == null ? null : (ActivityInfo) this.f41019.get(componentName);
        if (activityInfo == null) {
            throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
        }
        return activityInfo;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m33049(ActivityInfo[] activityInfoArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo != null && activityInfo.packageName != null && activityInfo.name != null) {
                    ActivityInfo activityInfo2 = new ActivityInfo(activityInfo);
                    linkedHashMap.put(new ComponentName(activityInfo2.packageName, activityInfo2.name), activityInfo2);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33043(LinkedHashMap linkedHashMap) {
        for (ComponentInfo componentInfo : linkedHashMap.values()) {
            componentInfo.applicationInfo = this.f41021;
            String str = this.f41024;
            componentInfo.packageName = str;
            if (componentInfo.processName == null) {
                componentInfo.processName = str;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private PackageInfo m33040(int i) {
        PackageInfo packageInfo = new PackageInfo();
        PackageInfo packageInfo2 = this.f41025;
        packageInfo.packageName = packageInfo2.packageName;
        packageInfo.applicationInfo = new ApplicationInfo(this.f41021);
        packageInfo.firstInstallTime = packageInfo2.firstInstallTime;
        packageInfo.lastUpdateTime = packageInfo2.lastUpdateTime;
        packageInfo.sharedUserId = packageInfo2.sharedUserId;
        packageInfo.sharedUserLabel = packageInfo2.sharedUserLabel;
        packageInfo.versionCode = packageInfo2.versionCode;
        packageInfo.versionName = packageInfo2.versionName;
        packageInfo.gids = new int[]{Process.myUid()};
        Signature[] signatureArr = packageInfo2.signatures;
        packageInfo.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        m33042(packageInfo2, packageInfo);
        if ((i & 4096) != 0) {
            PermissionInfo[] permissionInfoArr = packageInfo2.permissions;
            packageInfo.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
            String[] strArr = packageInfo2.requestedPermissions;
            packageInfo.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
            int[] iArr = packageInfo2.requestedPermissionsFlags;
            packageInfo.requestedPermissionsFlags = iArr != null ? (int[]) iArr.clone() : null;
        }
        if ((i & 1) != 0) {
            packageInfo.activities = m33045(packageInfo2.activities);
        }
        if ((i & 2) != 0) {
            packageInfo.receivers = m33045(packageInfo2.receivers);
        }
        if ((i & 4) != 0) {
            packageInfo.services = m33047(packageInfo2.services);
        }
        if ((i & 8) != 0) {
            packageInfo.providers = m33046(packageInfo2.providers);
        }
        return packageInfo;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33042(PackageInfo packageInfo, PackageInfo packageInfo2) {
        long jLongValue;
        try {
            Field field = PackageInfo.class.getField("signingInfo");
            field.set(packageInfo2, field.get(packageInfo));
        } catch (Throwable unused) {
        }
        try {
            Field field2 = PackageInfo.class.getField("baseRevisionCode");
            field2.setInt(packageInfo2, field2.getInt(packageInfo));
        } catch (Throwable unused2) {
        }
        try {
            jLongValue = ((Number) PackageInfo.class.getMethod("getLongVersionCode", null).invoke(packageInfo, null)).longValue();
        } catch (Throwable unused3) {
            jLongValue = packageInfo.versionCode;
        }
        try {
            PackageInfo.class.getMethod("setLongVersionCode", Long.TYPE).invoke(packageInfo2, Long.valueOf(jLongValue));
        } catch (Throwable unused4) {
            packageInfo2.versionCode = (int) jLongValue;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActivityInfo[] m33045(ActivityInfo[] activityInfoArr) {
        if (activityInfoArr == null) {
            return null;
        }
        ActivityInfo[] activityInfoArr2 = new ActivityInfo[activityInfoArr.length];
        for (int i = 0; i < activityInfoArr.length; i++) {
            activityInfoArr2[i] = activityInfoArr[i] == null ? null : new ActivityInfo(activityInfoArr[i]);
        }
        return activityInfoArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ServiceInfo[] m33047(ServiceInfo[] serviceInfoArr) {
        if (serviceInfoArr == null) {
            return null;
        }
        ServiceInfo[] serviceInfoArr2 = new ServiceInfo[serviceInfoArr.length];
        for (int i = 0; i < serviceInfoArr.length; i++) {
            serviceInfoArr2[i] = serviceInfoArr[i] == null ? null : new ServiceInfo(serviceInfoArr[i]);
        }
        return serviceInfoArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ProviderInfo[] m33046(ProviderInfo[] providerInfoArr) {
        if (providerInfoArr == null) {
            return null;
        }
        ProviderInfo[] providerInfoArr2 = new ProviderInfo[providerInfoArr.length];
        for (int i = 0; i < providerInfoArr.length; i++) {
            providerInfoArr2[i] = providerInfoArr[i] == null ? null : new ProviderInfo(providerInfoArr[i]);
        }
        return providerInfoArr2;
    }

    @Override // android.content.pm.PackageManager
    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.content.pm.PackageManager
    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Drawable m33048(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return this.f41020.getDrawable(i, null);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SecurityException m33041(String str) {
        return new SecurityException("Decryptor PackageManager denied: ".concat(str));
    }
}
