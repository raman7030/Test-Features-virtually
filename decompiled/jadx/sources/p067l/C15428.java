package p067l;

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
public final class C15428 extends PackageManager {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f44097;

    /* JADX INFO: renamed from: ۜ */
    public final Resources f44098;

    /* JADX INFO: renamed from: ۧ */
    public final ApplicationInfo f44099;

    /* JADX INFO: renamed from: ܳ */
    public final LinkedHashMap f44100;

    /* JADX INFO: renamed from: ܽ */
    public final Drawable f44101;

    /* JADX INFO: renamed from: ܿ */
    public final String f44102;

    /* JADX INFO: renamed from: ᩳ */
    public final PackageInfo f44103;

    /* JADX INFO: renamed from: ᩷ */
    public final LinkedHashMap f44104;

    /* JADX INFO: renamed from: ᩻ */
    public final LinkedHashMap f44105;

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

    public C15428(PackageInfo packageInfo, ApplicationInfo applicationInfo, Resources resources, String str) {
        Drawable colorDrawable;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m35159(packageInfo.activities);
        packageInfo2.receivers = m35159(packageInfo.receivers);
        packageInfo2.services = m35161(packageInfo.services);
        packageInfo2.providers = m35160(packageInfo.providers);
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
        m35156(packageInfo, packageInfo2);
        this.f44103 = packageInfo2;
        this.f44099 = new ApplicationInfo(applicationInfo);
        this.f44098 = resources;
        this.f44102 = str;
        try {
            Drawable drawable = Resources.getSystem().getDrawable(R.drawable.sym_def_app_icon, null);
            if (drawable != null) {
                colorDrawable = drawable.mutate();
            } else {
                colorDrawable = new ColorDrawable(0);
            }
        } catch (Throwable unused) {
        }
        this.f44101 = colorDrawable;
        PackageInfo packageInfo3 = this.f44103;
        packageInfo3.packageName = str;
        packageInfo3.applicationInfo = this.f44099;
        this.f44097 = m35163(packageInfo3.activities);
        this.f44105 = m35163(this.f44103.receivers);
        ServiceInfo[] serviceInfoArr = this.f44103.services;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo != null && serviceInfo.packageName != null && serviceInfo.name != null) {
                    ServiceInfo serviceInfo2 = new ServiceInfo(serviceInfo);
                    linkedHashMap.put(new ComponentName(serviceInfo2.packageName, serviceInfo2.name), serviceInfo2);
                }
            }
        }
        this.f44104 = linkedHashMap;
        ProviderInfo[] providerInfoArr = this.f44103.providers;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (providerInfo != null && providerInfo.packageName != null && providerInfo.name != null) {
                    ProviderInfo providerInfo2 = new ProviderInfo(providerInfo);
                    linkedHashMap2.put(new ComponentName(providerInfo2.packageName, providerInfo2.name), providerInfo2);
                }
            }
        }
        this.f44100 = linkedHashMap2;
        m35157(this.f44097);
        m35157(this.f44105);
        m35157(this.f44104);
        m35157(linkedHashMap2);
        this.f44103.activities = m35159((ActivityInfo[]) this.f44097.values().toArray(new ActivityInfo[0]));
        this.f44103.receivers = m35159((ActivityInfo[]) this.f44105.values().toArray(new ActivityInfo[0]));
        this.f44103.services = m35161((ServiceInfo[]) this.f44104.values().toArray(new ServiceInfo[0]));
        this.f44103.providers = m35160((ProviderInfo[]) linkedHashMap2.values().toArray(new ProviderInfo[0]));
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        m35164(str);
        return m35154(i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        m35164(versionedPackage == null ? null : versionedPackage.getPackageName());
        return m35154(i);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
        m35164(str);
        return new int[]{Process.myUid()};
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str, int i) throws PackageManager.NameNotFoundException {
        m35164(str);
        return new int[]{Process.myUid()};
    }

    @Override // android.content.pm.PackageManager
    public final int getPackageUid(String str, int i) throws PackageManager.NameNotFoundException {
        m35164(str);
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
        m35164(str);
        return new ApplicationInfo(this.f44099);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return new ActivityInfo(m35153(componentName));
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = componentName == null ? null : (ActivityInfo) this.f44105.get(componentName);
        if (activityInfo != null) {
            return new ActivityInfo(activityInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo = componentName == null ? null : (ServiceInfo) this.f44104.get(componentName);
        if (serviceInfo != null) {
            return new ServiceInfo(serviceInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo = componentName == null ? null : (ProviderInfo) this.f44100.get(componentName);
        if (providerInfo != null) {
            return new ProviderInfo(providerInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledPackages(int i) {
        return Collections.singletonList(m35154(i));
    }

    @Override // android.content.pm.PackageManager
    public final List getPackagesHoldingPermissions(String[] strArr, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        throw m35155("addPermission");
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        throw m35155("addPermissionAsync");
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        throw m35155("removePermission");
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        return (i == Process.myUid() && i2 == Process.myUid()) ? 0 : -3;
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        if (i == Process.myUid()) {
            return new String[]{this.f44102};
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        if (i == Process.myUid()) {
            return this.f44102;
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledApplications(int i) {
        return Collections.singletonList(new ApplicationInfo(this.f44099));
    }

    @Override // android.content.pm.PackageManager
    public final void clearInstantAppCookie() {
        throw m35155("clearInstantAppCookie");
    }

    @Override // android.content.pm.PackageManager
    public final void updateInstantAppCookie(byte[] bArr) {
        throw m35155("updateInstantAppCookie");
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
        ActivityInfo activityInfoM35153 = m35153(componentName);
        int i = activityInfoM35153.icon;
        int i2 = activityInfoM35153.applicationInfo.icon;
        if (i == 0) {
            i = i2;
        }
        Drawable drawableM35162 = m35162(i);
        return drawableM35162 != null ? drawableM35162 : getDefaultActivityIcon();
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
        ActivityInfo activityInfoM35153 = m35153(componentName);
        int i = activityInfoM35153.banner;
        int i2 = activityInfoM35153.applicationInfo.banner;
        if (i == 0) {
            i = i2;
        }
        return m35162(i);
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
        Drawable.ConstantState constantState = this.f44101.getConstantState();
        return constantState != null ? constantState.newDrawable().mutate() : new ColorDrawable(0);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        if (!m35158(applicationInfo)) {
            return null;
        }
        Drawable drawableM35162 = m35162(applicationInfo.icon);
        return drawableM35162 != null ? drawableM35162 : getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
        m35164(str);
        return getApplicationIcon(this.f44099);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        if (m35158(applicationInfo)) {
            return m35162(applicationInfo.banner);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
        m35164(str);
        return getApplicationBanner(this.f44099);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM35153 = m35153(componentName);
        int i = activityInfoM35153.logo;
        int i2 = activityInfoM35153.applicationInfo.logo;
        if (i == 0) {
            i = i2;
        }
        return m35162(i);
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
        if (m35158(applicationInfo)) {
            return m35162(applicationInfo.logo);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
        m35164(str);
        return getApplicationLogo(this.f44099);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        CharSequence text = null;
        if (!m35158(applicationInfo)) {
            return null;
        }
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence;
        }
        int i = applicationInfo.labelRes;
        if (i != 0) {
            try {
                text = this.f44098.getText(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return text != null ? text : applicationInfo.packageName;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
        m35153(componentName);
        return this.f44098;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
        if (!m35158(applicationInfo)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this.f44098;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
        m35164(str);
        return this.f44098;
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        throw m35155("verifyPendingInstall");
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        throw m35155("extendVerificationTimeout");
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        throw m35155("setInstallerPackageName");
    }

    @Override // android.content.pm.PackageManager
    public final void addPackageToPreferred(String str) {
        throw m35155("addPackageToPreferred");
    }

    @Override // android.content.pm.PackageManager
    public final void removePackageFromPreferred(String str) {
        throw m35155("removePackageFromPreferred");
    }

    @Override // android.content.pm.PackageManager
    public final List getPreferredPackages(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        throw m35155("addPreferredActivity");
    }

    @Override // android.content.pm.PackageManager
    public final void clearPackagePreferredActivities(String str) {
        throw m35155("clearPackagePreferredActivities");
    }

    @Override // android.content.pm.PackageManager
    public final int getPreferredActivities(List list, List list2, String str) {
        list.clear();
        list2.clear();
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        throw m35155("setComponentEnabledSetting");
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        throw m35155("setApplicationEnabledSetting");
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationCategoryHint(String str, int i) {
        throw m35155("setApplicationCategoryHint");
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        throw m35155("getPackageInstaller");
    }

    /* JADX INFO: renamed from: ۧ */
    private void m35164(String str) throws PackageManager.NameNotFoundException {
        if (!this.f44102.equals(str)) {
            throw new PackageManager.NameNotFoundException(str);
        }
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        String str3 = this.f44102;
        return (str3.equals(str) && str3.equals(str2)) ? 0 : -3;
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        return this.f44102.equals(str) ? 0 : 2;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        if (this.f44102.equals(str) || m35158(applicationInfo)) {
            return m35162(i);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        if ((this.f44102.equals(str) || m35158(applicationInfo)) && i != 0) {
            try {
                return this.f44098.getText(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        if ((!this.f44102.equals(str) && !m35158(applicationInfo)) || i == 0) {
            return null;
        }
        try {
            return this.f44098.getXml(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m35158(ApplicationInfo applicationInfo) {
        if (applicationInfo != null) {
            return this.f44102.equals(applicationInfo.packageName);
        }
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        if (componentName != null) {
            return (this.f44097.containsKey(componentName) || this.f44105.containsKey(componentName) || this.f44104.containsKey(componentName) || this.f44100.containsKey(componentName)) ? 0 : 2;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ֫ */
    private ActivityInfo m35153(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = componentName == null ? null : (ActivityInfo) this.f44097.get(componentName);
        if (activityInfo == null) {
            throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
        }
        return activityInfo;
    }

    /* JADX INFO: renamed from: ۧ */
    public static LinkedHashMap m35163(ActivityInfo[] activityInfoArr) {
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

    /* JADX INFO: renamed from: ֫ */
    private void m35157(LinkedHashMap linkedHashMap) {
        for (ComponentInfo componentInfo : linkedHashMap.values()) {
            componentInfo.applicationInfo = this.f44099;
            String str = this.f44102;
            componentInfo.packageName = str;
            if (componentInfo.processName == null) {
                componentInfo.processName = str;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private PackageInfo m35154(int i) {
        PackageInfo packageInfo = new PackageInfo();
        PackageInfo packageInfo2 = this.f44103;
        packageInfo.packageName = packageInfo2.packageName;
        packageInfo.applicationInfo = new ApplicationInfo(this.f44099);
        packageInfo.firstInstallTime = packageInfo2.firstInstallTime;
        packageInfo.lastUpdateTime = packageInfo2.lastUpdateTime;
        packageInfo.sharedUserId = packageInfo2.sharedUserId;
        packageInfo.sharedUserLabel = packageInfo2.sharedUserLabel;
        packageInfo.versionCode = packageInfo2.versionCode;
        packageInfo.versionName = packageInfo2.versionName;
        packageInfo.gids = new int[]{Process.myUid()};
        Signature[] signatureArr = packageInfo2.signatures;
        packageInfo.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        m35156(packageInfo2, packageInfo);
        if ((i & 4096) != 0) {
            PermissionInfo[] permissionInfoArr = packageInfo2.permissions;
            packageInfo.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
            String[] strArr = packageInfo2.requestedPermissions;
            packageInfo.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
            int[] iArr = packageInfo2.requestedPermissionsFlags;
            packageInfo.requestedPermissionsFlags = iArr != null ? (int[]) iArr.clone() : null;
        }
        if ((i & 1) != 0) {
            packageInfo.activities = m35159(packageInfo2.activities);
        }
        if ((i & 2) != 0) {
            packageInfo.receivers = m35159(packageInfo2.receivers);
        }
        if ((i & 4) != 0) {
            packageInfo.services = m35161(packageInfo2.services);
        }
        if ((i & 8) != 0) {
            packageInfo.providers = m35160(packageInfo2.providers);
        }
        return packageInfo;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35156(PackageInfo packageInfo, PackageInfo packageInfo2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static ActivityInfo[] m35159(ActivityInfo[] activityInfoArr) {
        if (activityInfoArr == null) {
            return null;
        }
        ActivityInfo[] activityInfoArr2 = new ActivityInfo[activityInfoArr.length];
        for (int i = 0; i < activityInfoArr.length; i++) {
            activityInfoArr2[i] = activityInfoArr[i] == null ? null : new ActivityInfo(activityInfoArr[i]);
        }
        return activityInfoArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ServiceInfo[] m35161(ServiceInfo[] serviceInfoArr) {
        if (serviceInfoArr == null) {
            return null;
        }
        ServiceInfo[] serviceInfoArr2 = new ServiceInfo[serviceInfoArr.length];
        for (int i = 0; i < serviceInfoArr.length; i++) {
            serviceInfoArr2[i] = serviceInfoArr[i] == null ? null : new ServiceInfo(serviceInfoArr[i]);
        }
        return serviceInfoArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ProviderInfo[] m35160(ProviderInfo[] providerInfoArr) {
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

    /* JADX INFO: renamed from: ۧ */
    private Drawable m35162(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return this.f44098.getDrawable(i, null);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static SecurityException m35155(String str) {
        return new SecurityException("Decryptor PackageManager denied: ".concat(str));
    }
}
