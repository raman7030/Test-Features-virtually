.class public final Ll/ܰۢᩳ;
.super Landroid/content/pm/PackageManager;
.source "21X6"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۜ:Landroid/content/res/Resources;

.field public final ۧ:Landroid/content/pm/ApplicationInfo;

.field public final ܳ:Ljava/util/LinkedHashMap;

.field public final ܽ:Landroid/graphics/drawable/Drawable;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Landroid/content/pm/PackageInfo;

.field public final ᩷:Ljava/util/LinkedHashMap;

.field public final ᩻:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Landroid/content/res/Resources;Ljava/lang/String;)V
    .locals 5

    .line 59
    invoke-direct {p0}, Landroid/content/pm/PackageManager;-><init>()V

    .line 782
    new-instance v0, Landroid/content/pm/PackageInfo;

    invoke-direct {v0}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 783
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 784
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/content/pm/ApplicationInfo;

    iget-object v3, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-direct {v1, v3}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    :goto_0
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 785
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    invoke-static {v1}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object v1

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 786
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    invoke-static {v1}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object v1

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 787
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    invoke-static {v1}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ServiceInfo;)[Landroid/content/pm/ServiceInfo;

    move-result-object v1

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 788
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    invoke-static {v1}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ProviderInfo;)[Landroid/content/pm/ProviderInfo;

    move-result-object v1

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 789
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, [Landroid/content/pm/PermissionInfo;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/pm/PermissionInfo;

    :goto_1
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 790
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-nez v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    :goto_2
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 791
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-nez v1, :cond_3

    move-object v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    :goto_3
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 792
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->gids:[I

    if-nez v1, :cond_4

    move-object v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    :goto_4
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->gids:[I

    .line 793
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-nez v1, :cond_5

    move-object v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, [Landroid/content/pm/Signature;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/pm/Signature;

    :goto_5
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 794
    iget-wide v3, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v3, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 795
    iget-wide v3, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iput-wide v3, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 796
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    .line 797
    iget v1, p1, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    .line 798
    iget v1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 799
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 800
    invoke-static {p1, v0}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/PackageInfo;Landroid/content/pm/PackageInfo;)V

    .line 60
    iput-object v0, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    .line 61
    new-instance p1, Landroid/content/pm/ApplicationInfo;

    invoke-direct {p1, p2}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    iput-object p1, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    .line 62
    iput-object p3, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    .line 63
    iput-object p4, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 810
    :try_start_0
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x1080093

    invoke-virtual {p2, p3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 812
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    .line 816
    :catchall_0
    :cond_6
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p2, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 64
    :goto_6
    iput-object p2, p0, Ll/ܰۢᩳ;->ܽ:Landroid/graphics/drawable/Drawable;

    .line 65
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iput-object p4, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 66
    iget-object p3, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iput-object p3, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 67
    iget-object p2, p2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    invoke-static {p2}, Ll/ܰۢᩳ;->ۧ([Landroid/content/pm/ActivityInfo;)Ljava/util/LinkedHashMap;

    move-result-object p2

    iput-object p2, p0, Ll/ܰۢᩳ;->֫:Ljava/util/LinkedHashMap;

    .line 68
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 725
    invoke-static {p2}, Ll/ܰۢᩳ;->ۧ([Landroid/content/pm/ActivityInfo;)Ljava/util/LinkedHashMap;

    move-result-object p2

    .line 68
    iput-object p2, p0, Ll/ܰۢᩳ;->᩻:Ljava/util/LinkedHashMap;

    .line 69
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 732
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    if-nez p2, :cond_7

    goto :goto_9

    .line 736
    :cond_7
    array-length p4, p2

    const/4 v0, 0x0

    :goto_7
    if-ge v0, p4, :cond_a

    aget-object v1, p2, v0

    if-eqz v1, :cond_9

    .line 737
    iget-object v2, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    if-eqz v2, :cond_9

    iget-object v2, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-nez v2, :cond_8

    goto :goto_8

    .line 740
    :cond_8
    new-instance v2, Landroid/content/pm/ServiceInfo;

    invoke-direct {v2, v1}, Landroid/content/pm/ServiceInfo;-><init>(Landroid/content/pm/ServiceInfo;)V

    .line 741
    new-instance v1, Landroid/content/ComponentName;

    iget-object v3, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v4, v2, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 69
    :cond_a
    :goto_9
    iput-object p3, p0, Ll/ܰۢᩳ;->᩷:Ljava/util/LinkedHashMap;

    .line 70
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 750
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    if-nez p2, :cond_b

    goto :goto_c

    .line 754
    :cond_b
    array-length p4, p2

    const/4 v0, 0x0

    :goto_a
    if-ge v0, p4, :cond_e

    aget-object v1, p2, v0

    if-eqz v1, :cond_d

    .line 755
    iget-object v2, v1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    if-eqz v2, :cond_d

    iget-object v2, v1, Landroid/content/pm/ProviderInfo;->name:Ljava/lang/String;

    if-nez v2, :cond_c

    goto :goto_b

    .line 758
    :cond_c
    new-instance v2, Landroid/content/pm/ProviderInfo;

    invoke-direct {v2, v1}, Landroid/content/pm/ProviderInfo;-><init>(Landroid/content/pm/ProviderInfo;)V

    .line 759
    new-instance v1, Landroid/content/ComponentName;

    iget-object v3, v2, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    iget-object v4, v2, Landroid/content/pm/ProviderInfo;->name:Ljava/lang/String;

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    :goto_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    .line 70
    :cond_e
    :goto_c
    iput-object p3, p0, Ll/ܰۢᩳ;->ܳ:Ljava/util/LinkedHashMap;

    .line 71
    iget-object p2, p0, Ll/ܰۢᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-direct {p0, p2}, Ll/ܰۢᩳ;->֫(Ljava/util/LinkedHashMap;)V

    .line 72
    iget-object p2, p0, Ll/ܰۢᩳ;->᩻:Ljava/util/LinkedHashMap;

    invoke-direct {p0, p2}, Ll/ܰۢᩳ;->֫(Ljava/util/LinkedHashMap;)V

    .line 73
    iget-object p2, p0, Ll/ܰۢᩳ;->᩷:Ljava/util/LinkedHashMap;

    invoke-direct {p0, p2}, Ll/ܰۢᩳ;->֫(Ljava/util/LinkedHashMap;)V

    .line 74
    invoke-direct {p0, p3}, Ll/ܰۢᩳ;->֫(Ljava/util/LinkedHashMap;)V

    .line 75
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object p4, p0, Ll/ܰۢᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p4

    new-array v0, p1, [Landroid/content/pm/ActivityInfo;

    invoke-interface {p4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Landroid/content/pm/ActivityInfo;

    invoke-static {p4}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object p4

    iput-object p4, p2, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 76
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object p4, p0, Ll/ܰۢᩳ;->᩻:Ljava/util/LinkedHashMap;

    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p4

    new-array v0, p1, [Landroid/content/pm/ActivityInfo;

    invoke-interface {p4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Landroid/content/pm/ActivityInfo;

    invoke-static {p4}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object p4

    iput-object p4, p2, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 77
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object p4, p0, Ll/ܰۢᩳ;->᩷:Ljava/util/LinkedHashMap;

    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p4

    new-array v0, p1, [Landroid/content/pm/ServiceInfo;

    invoke-interface {p4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Landroid/content/pm/ServiceInfo;

    invoke-static {p4}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ServiceInfo;)[Landroid/content/pm/ServiceInfo;

    move-result-object p4

    iput-object p4, p2, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 78
    iget-object p2, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    invoke-virtual {p3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p3

    new-array p1, p1, [Landroid/content/pm/ProviderInfo;

    invoke-interface {p3, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/pm/ProviderInfo;

    invoke-static {p1}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ProviderInfo;)[Landroid/content/pm/ProviderInfo;

    move-result-object p1

    iput-object p1, p2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    return-void
.end method

.method private ֫(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 663
    :cond_0
    iget-object v1, p0, Ll/ܰۢᩳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ActivityInfo;

    :goto_0
    if-nez v1, :cond_2

    .line 665
    new-instance v1, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v1, v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-object v1
.end method

.method private ֫(I)Landroid/content/pm/PackageInfo;
    .locals 4

    .line 823
    new-instance v0, Landroid/content/pm/PackageInfo;

    invoke-direct {v0}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 824
    iget-object v1, p0, Ll/ܰۢᩳ;->ᩳ:Landroid/content/pm/PackageInfo;

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 825
    new-instance v2, Landroid/content/pm/ApplicationInfo;

    iget-object v3, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-direct {v2, v3}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 826
    iget-wide v2, v1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v2, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 827
    iget-wide v2, v1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iput-wide v2, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 828
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    .line 829
    iget v2, v1, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    iput v2, v0, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    .line 830
    iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v2, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 831
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 832
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    filled-new-array {v2}, [I

    move-result-object v2

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->gids:[I

    .line 833
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, [Landroid/content/pm/Signature;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/content/pm/Signature;

    :goto_0
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 834
    invoke-static {v1, v0}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/PackageInfo;Landroid/content/pm/PackageInfo;)V

    and-int/lit16 v2, p1, 0x1000

    if-eqz v2, :cond_4

    .line 836
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, [Landroid/content/pm/PermissionInfo;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/content/pm/PermissionInfo;

    :goto_1
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 837
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    :goto_2
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 838
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, [I->clone()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, [I

    :goto_3
    iput-object v3, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    :cond_4
    and-int/lit8 v2, p1, 0x1

    if-eqz v2, :cond_5

    .line 841
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    invoke-static {v2}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object v2

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    :cond_5
    and-int/lit8 v2, p1, 0x2

    if-eqz v2, :cond_6

    .line 844
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    invoke-static {v2}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object v2

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    :cond_6
    and-int/lit8 v2, p1, 0x4

    if-eqz v2, :cond_7

    .line 847
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    invoke-static {v2}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ServiceInfo;)[Landroid/content/pm/ServiceInfo;

    move-result-object v2

    iput-object v2, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    :cond_7
    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_8

    .line 850
    iget-object p1, v1, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    invoke-static {p1}, Ll/ܰۢᩳ;->֫([Landroid/content/pm/ProviderInfo;)[Landroid/content/pm/ProviderInfo;

    move-result-object p1

    iput-object p1, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    :cond_8
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/SecurityException;
    .locals 2

    .line 1020
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Decryptor PackageManager denied: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Landroid/content/pm/PackageInfo;Landroid/content/pm/PackageInfo;)V
    .locals 7

    .line 860
    const-class v0, Landroid/content/pm/PackageInfo;

    const-string v1, "signingInfo"

    .line 895
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 896
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const-string v1, "baseRevisionCode"

    .line 906
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 907
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :try_start_2
    const-string v1, "getLongVersionCode"

    const/4 v2, 0x0

    .line 871
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .line 873
    :catchall_2
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v1, p0

    :goto_0
    :try_start_3
    const-string p0, "setLongVersionCode"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    .line 883
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0, p0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v6

    invoke-virtual {p0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1

    :catchall_3
    long-to-int p0, v1

    .line 885
    iput p0, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    :goto_1
    return-void
.end method

.method private ֫(Ljava/util/LinkedHashMap;)V
    .locals 3

    .line 768
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ComponentInfo;

    .line 769
    iget-object v1, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iput-object v1, v0, Landroid/content/pm/ComponentInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 770
    iget-object v1, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    .line 771
    iget-object v2, v0, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 772
    iput-object v1, v0, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Landroid/content/pm/ApplicationInfo;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 636
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 919
    :cond_0
    array-length v1, p0

    new-array v1, v1, [Landroid/content/pm/ActivityInfo;

    const/4 v2, 0x0

    .line 920
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 921
    aget-object v3, p0, v2

    if-nez v3, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    new-instance v3, Landroid/content/pm/ActivityInfo;

    aget-object v4, p0, v2

    invoke-direct {v3, v4}, Landroid/content/pm/ActivityInfo;-><init>(Landroid/content/pm/ActivityInfo;)V

    :goto_1
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static ֫([Landroid/content/pm/ProviderInfo;)[Landroid/content/pm/ProviderInfo;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 947
    :cond_0
    array-length v1, p0

    new-array v1, v1, [Landroid/content/pm/ProviderInfo;

    const/4 v2, 0x0

    .line 948
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 949
    aget-object v3, p0, v2

    if-nez v3, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    new-instance v3, Landroid/content/pm/ProviderInfo;

    aget-object v4, p0, v2

    invoke-direct {v3, v4}, Landroid/content/pm/ProviderInfo;-><init>(Landroid/content/pm/ProviderInfo;)V

    :goto_1
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static ֫([Landroid/content/pm/ServiceInfo;)[Landroid/content/pm/ServiceInfo;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 933
    :cond_0
    array-length v1, p0

    new-array v1, v1, [Landroid/content/pm/ServiceInfo;

    const/4 v2, 0x0

    .line 934
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 935
    aget-object v3, p0, v2

    if-nez v3, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    new-instance v3, Landroid/content/pm/ServiceInfo;

    aget-object v4, p0, v2

    invoke-direct {v3, v4}, Landroid/content/pm/ServiceInfo;-><init>(Landroid/content/pm/ServiceInfo;)V

    :goto_1
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private ۧ(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 973
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v0
.end method

.method public static ۧ([Landroid/content/pm/ActivityInfo;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 707
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    if-nez p0, :cond_0

    goto :goto_2

    .line 711
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p0, v2

    if-eqz v3, :cond_2

    .line 712
    iget-object v4, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    if-eqz v4, :cond_2

    iget-object v4, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    if-nez v4, :cond_1

    goto :goto_1

    .line 715
    :cond_1
    new-instance v4, Landroid/content/pm/ActivityInfo;

    invoke-direct {v4, v3}, Landroid/content/pm/ActivityInfo;-><init>(Landroid/content/pm/ActivityInfo;)V

    .line 716
    new-instance v3, Landroid/content/ComponentName;

    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v6, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-object v0
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 655
    :cond_0
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {v0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final addPackageToPreferred(Ljava/lang/String;)V
    .locals 0

    const-string p1, "addPackageToPreferred"

    .line 552
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final addPermission(Landroid/content/pm/PermissionInfo;)Z
    .locals 0

    const-string p1, "addPermission"

    .line 206
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final addPermissionAsync(Landroid/content/pm/PermissionInfo;)Z
    .locals 0

    const-string p1, "addPermissionAsync"

    .line 211
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final addPreferredActivity(Landroid/content/IntentFilter;I[Landroid/content/ComponentName;Landroid/content/ComponentName;)V
    .locals 0

    const-string p1, "addPreferredActivity"

    .line 567
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final canRequestPackageInstalls()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final canonicalToCurrentPackageNames([Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 961
    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    return-object p1
.end method

.method public final checkPermission(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkSignatures(II)I
    .locals 1

    .line 226
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result p1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x3

    return p1
.end method

.method public final checkSignatures(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x3

    return p1
.end method

.method public final clearInstantAppCookie()V
    .locals 1

    const-string v0, "clearInstantAppCookie"

    .line 274
    invoke-static {v0}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object v0

    throw v0
.end method

.method public final clearPackagePreferredActivities(Ljava/lang/String;)V
    .locals 0

    const-string p1, "clearPackagePreferredActivities"

    .line 572
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final currentToCanonicalPackageNames([Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 961
    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    return-object p1
.end method

.method public final extendVerificationTimeout(IIJ)V
    .locals 0

    const-string p1, "extendVerificationTimeout"

    .line 537
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final getActivityBanner(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 398
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    .line 399
    iget v0, p1, Landroid/content/pm/ActivityInfo;->banner:I

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->banner:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    invoke-direct {p0, v0}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getActivityBanner(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 405
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 409
    invoke-virtual {p0, v0}, Ll/ܰۢᩳ;->getActivityBanner(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 407
    :cond_1
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 381
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    .line 382
    iget v0, p1, Landroid/content/pm/ActivityInfo;->icon:I

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    invoke-direct {p0, v0}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    .line 383
    :cond_1
    invoke-virtual {p0}, Ll/ܰۢᩳ;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getActivityIcon(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 388
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 392
    invoke-virtual {p0, v0}, Ll/ܰۢᩳ;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 390
    :cond_1
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    .locals 0

    .line 164
    new-instance p2, Landroid/content/pm/ActivityInfo;

    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/content/pm/ActivityInfo;-><init>(Landroid/content/pm/ActivityInfo;)V

    return-object p2
.end method

.method public final getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 448
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    .line 449
    iget v0, p1, Landroid/content/pm/ActivityInfo;->logo:I

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->logo:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    invoke-direct {p0, v0}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getActivityLogo(Landroid/content/Intent;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 454
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 458
    invoke-virtual {p0, v0}, Ll/ܰۢᩳ;->getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 456
    :cond_1
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getAllPermissionGroups(I)Ljava/util/List;
    .locals 0

    .line 153
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final getApplicationBanner(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 436
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->banner:I

    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getApplicationBanner(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 442
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 443
    iget-object p1, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0, p1}, Ll/ܰۢᩳ;->getApplicationBanner(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getApplicationEnabledSetting(Ljava/lang/String;)I
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

.method public final getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 420
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 423
    :cond_0
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    .line 424
    :cond_1
    invoke-virtual {p0}, Ll/ܰۢᩳ;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 429
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 430
    iget-object p1, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0, p1}, Ll/ܰۢᩳ;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    .locals 0

    .line 158
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 159
    new-instance p1, Landroid/content/pm/ApplicationInfo;

    iget-object p2, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-direct {p1, p2}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    return-object p1
.end method

.method public final getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    .locals 3

    .line 499
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 502
    :cond_0
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    return-object v0

    .line 505
    :cond_1
    iget v0, p1, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-nez v0, :cond_2

    goto :goto_0

    .line 988
    :cond_2
    :try_start_0
    iget-object v2, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v1, :cond_3

    return-object v1

    .line 506
    :cond_3
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    return-object p1
.end method

.method public final getApplicationLogo(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 463
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->logo:I

    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getApplicationLogo(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 468
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 469
    iget-object p1, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0, p1}, Ll/ܰۢᩳ;->getApplicationLogo(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getChangedPackages(I)Landroid/content/pm/ChangedPackages;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getComponentEnabledSetting(Landroid/content/ComponentName;)I
    .locals 1

    if-eqz p1, :cond_1

    .line 643
    iget-object v0, p0, Ll/ܰۢᩳ;->֫:Ljava/util/LinkedHashMap;

    .line 644
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰۢᩳ;->᩻:Ljava/util/LinkedHashMap;

    .line 645
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰۢᩳ;->᩷:Ljava/util/LinkedHashMap;

    .line 646
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰۢᩳ;->ܳ:Ljava/util/LinkedHashMap;

    .line 647
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x2

    return p1
.end method

.method public final getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 414
    iget-object v0, p0, Ll/ܰۢᩳ;->ܽ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 415
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method

.method public final getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 376
    invoke-direct {p0, p3}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    invoke-direct {p0, p2}, Ll/ܰۢᩳ;->ۧ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final getInstalledApplications(I)Ljava/util/List;
    .locals 1

    .line 243
    new-instance p1, Landroid/content/pm/ApplicationInfo;

    iget-object v0, p0, Ll/ܰۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-direct {p1, v0}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getInstalledPackages(I)Ljava/util/List;
    .locals 0

    .line 184
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getInstantAppCookie()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public final getInstantAppCookieMaxBytes()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getInstrumentationInfo(Landroid/content/ComponentName;I)Landroid/content/pm/InstrumentationInfo;
    .locals 0

    .line 366
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getLeanbackLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getNameForUid(I)Ljava/lang/String;
    .locals 1

    .line 238
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getPackageGids(Ljava/lang/String;)[I
    .locals 0

    .line 118
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 119
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result p1

    filled-new-array {p1}, [I

    move-result-object p1

    return-object p1
.end method

.method public final getPackageGids(Ljava/lang/String;I)[I
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 126
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result p1

    filled-new-array {p1}, [I

    move-result-object p1

    return-object p1
.end method

.method public final getPackageInfo(Landroid/content/pm/VersionedPackage;I)Landroid/content/pm/PackageInfo;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p1}, Landroid/content/pm/VersionedPackage;->getPackageName()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 91
    invoke-direct {p0, p2}, Ll/ܰۢᩳ;->֫(I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method

.method public final getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 84
    invoke-direct {p0, p2}, Ll/ܰۢᩳ;->֫(I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method

.method public final getPackageInstaller()Landroid/content/pm/PackageInstaller;
    .locals 1

    const-string v0, "getPackageInstaller"

    .line 616
    invoke-static {v0}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object v0

    throw v0
.end method

.method public final getPackageUid(Ljava/lang/String;I)I
    .locals 0

    .line 132
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 133
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result p1

    return p1
.end method

.method public final getPackagesForUid(I)[Ljava/lang/String;
    .locals 2

    .line 232
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    aput-object v1, p1, v0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getPackagesHoldingPermissions([Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    .line 190
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final getPermissionGroupInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionGroupInfo;
    .locals 0

    .line 148
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;
    .locals 0

    .line 138
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final getPreferredActivities(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)I
    .locals 0

    .line 577
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 578
    invoke-interface {p2}, Ljava/util/List;->clear()V

    const/4 p1, 0x0

    return p1
.end method

.method public final getPreferredPackages(I)Ljava/util/List;
    .locals 0

    .line 562
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final getProviderInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
    .locals 2

    .line 179
    new-instance p2, Landroid/content/pm/ProviderInfo;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 696
    :cond_0
    iget-object v1, p0, Ll/ܰۢᩳ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ProviderInfo;

    :goto_0
    if-nez v1, :cond_2

    .line 698
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p2, v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 179
    :cond_2
    invoke-direct {p2, v1}, Landroid/content/pm/ProviderInfo;-><init>(Landroid/content/pm/ProviderInfo;)V

    return-object p2
.end method

.method public final getReceiverInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    .locals 2

    .line 169
    new-instance p2, Landroid/content/pm/ActivityInfo;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 674
    :cond_0
    iget-object v1, p0, Ll/ܰۢᩳ;->᩻:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ActivityInfo;

    :goto_0
    if-nez v1, :cond_2

    .line 676
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p2, v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 169
    :cond_2
    invoke-direct {p2, v1}, Landroid/content/pm/ActivityInfo;-><init>(Landroid/content/pm/ActivityInfo;)V

    return-object p2
.end method

.method public final getResourcesForActivity(Landroid/content/ComponentName;)Landroid/content/res/Resources;
    .locals 0

    .line 511
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    .line 512
    iget-object p1, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    return-object p1
.end method

.method public final getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;
    .locals 1

    .line 517
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 518
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    :goto_0
    invoke-direct {v0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 520
    :cond_1
    iget-object p1, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    return-object p1
.end method

.method public final getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
    .locals 0

    .line 525
    invoke-direct {p0, p1}, Ll/ܰۢᩳ;->ۧ(Ljava/lang/String;)V

    .line 526
    iget-object p1, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    return-object p1
.end method

.method public final getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
    .locals 2

    .line 174
    new-instance p2, Landroid/content/pm/ServiceInfo;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 685
    :cond_0
    iget-object v1, p0, Ll/ܰۢᩳ;->᩷:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ServiceInfo;

    :goto_0
    if-nez v1, :cond_2

    .line 687
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p2, v0}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 174
    :cond_2
    invoke-direct {p2, v1}, Landroid/content/pm/ServiceInfo;-><init>(Landroid/content/pm/ServiceInfo;)V

    return-object p2
.end method

.method public final getSharedLibraries(I)Ljava/util/List;
    .locals 0

    .line 292
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/content/pm/FeatureInfo;

    return-object v0
.end method

.method public final getSystemSharedLibraryNames()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final getText(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 489
    invoke-direct {p0, p3}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    goto :goto_1

    .line 988
    :cond_2
    :try_start_0
    iget-object p1, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :goto_1
    return-object v0
.end method

.method public final getUserBadgedDrawableForDensity(Landroid/graphics/drawable/Drawable;Landroid/os/UserHandle;Landroid/graphics/Rect;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    return-object p1
.end method

.method public final getUserBadgedIcon(Landroid/graphics/drawable/Drawable;Landroid/os/UserHandle;)Landroid/graphics/drawable/Drawable;
    .locals 0

    return-object p1
.end method

.method public final getUserBadgedLabel(Ljava/lang/CharSequence;Landroid/os/UserHandle;)Ljava/lang/CharSequence;
    .locals 0

    return-object p1
.end method

.method public final getXml(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/content/res/XmlResourceParser;
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܰۢᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 494
    invoke-direct {p0, p3}, Ll/ܰۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    goto :goto_1

    .line 1003
    :cond_2
    :try_start_0
    iget-object p1, p0, Ll/ܰۢᩳ;->ۜ:Landroid/content/res/Resources;

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    return-object v0
.end method

.method public final hasSystemFeature(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final hasSystemFeature(Ljava/lang/String;I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final isInstantApp()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInstantApp(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final isPermissionRevokedByPolicy(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final isSafeMode()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;
    .locals 0

    .line 335
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryContentProviders(Ljava/lang/String;II)Ljava/util/List;
    .locals 0

    .line 361
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryInstrumentation(Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    .line 371
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
    .locals 0

    .line 325
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
    .locals 0

    .line 330
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;
    .locals 0

    .line 351
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
    .locals 0

    .line 345
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final queryPermissionsByGroup(Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    .line 143
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final removePackageFromPreferred(Ljava/lang/String;)V
    .locals 0

    const-string p1, "removePackageFromPreferred"

    .line 557
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final removePermission(Ljava/lang/String;)V
    .locals 0

    const-string p1, "removePermission"

    .line 216
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final setApplicationCategoryHint(Ljava/lang/String;I)V
    .locals 0

    const-string p1, "setApplicationCategoryHint"

    .line 610
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final setApplicationEnabledSetting(Ljava/lang/String;II)V
    .locals 0

    const-string p1, "setApplicationEnabledSetting"

    .line 594
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final setComponentEnabledSetting(Landroid/content/ComponentName;II)V
    .locals 0

    const-string p1, "setComponentEnabledSetting"

    .line 584
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final setInstallerPackageName(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p1, "setInstallerPackageName"

    .line 542
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final updateInstantAppCookie([B)V
    .locals 0

    const-string p1, "updateInstantAppCookie"

    .line 280
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final verifyPendingInstall(II)V
    .locals 0

    const-string p1, "verifyPendingInstall"

    .line 531
    invoke-static {p1}, Ll/ܰۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method
