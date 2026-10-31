.class public final Ll/۫᩶;
.super Ljava/lang/Object;
.source "G3SY"


# static fields
.field public static final ܳ:Ljava/lang/Object;

.field public static ܽ:Ljava/util/HashSet;

.field public static final ܿ:Ljava/lang/Object;

.field public static ᩳ:Ljava/lang/String;

.field public static ᩻:Ll/ۗ᩶;


# instance fields
.field public final ֫:Landroid/content/Context;

.field public final ۧ:Landroid/app/NotificationManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 119
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۫᩶;->ܿ:Ljava/lang/Object;

    .line 123
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Ll/۫᩶;->ܽ:Ljava/util/HashSet;

    .line 128
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۫᩶;->ܳ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    iput-object p1, p0, Ll/۫᩶;->֫:Landroid/content/Context;

    const-string v0, "notification"

    .line 222
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Ll/۫᩶;->ۧ:Landroid/app/NotificationManager;

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ll/۫᩶;
    .locals 1

    .line 217
    new-instance v0, Ll/۫᩶;

    invoke-direct {v0, p0}, Ll/۫᩶;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static ۧ(Landroid/content/Context;)Ljava/util/Set;
    .locals 6

    .line 789
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "enabled_notification_listeners"

    .line 788
    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 791
    sget-object v0, Ll/۫᩶;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p0, :cond_2

    .line 793
    :try_start_0
    sget-object v1, Ll/۫᩶;->ᩳ:Ljava/lang/String;

    .line 794
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ":"

    const/4 v2, -0x1

    .line 795
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    .line 796
    new-instance v2, Ljava/util/HashSet;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 797
    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 798
    invoke-static {v5}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 800
    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 803
    :cond_1
    sput-object v2, Ll/۫᩶;->ܽ:Ljava/util/HashSet;

    .line 804
    sput-object p0, Ll/۫᩶;->ᩳ:Ljava/lang/String;

    .line 806
    :cond_2
    sget-object p0, Ll/۫᩶;->ܽ:Ljava/util/HashSet;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 807
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫(Landroid/app/Notification;)V
    .locals 6

    .line 284
    iget-object v1, p0, Ll/۫᩶;->ۧ:Landroid/app/NotificationManager;

    .line 8959
    iget-object v0, p1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const/16 v2, 0x3ee

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    const-string v4, "android.support.useSideChannel"

    .line 850
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    new-instance v4, Ll/᩹᩶;

    iget-object v0, p0, Ll/۫᩶;->֫:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, p1}, Ll/᩹᩶;-><init>(Ljava/lang/String;Landroid/app/Notification;)V

    .line 873
    sget-object p1, Ll/۫᩶;->ܳ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 874
    :try_start_0
    sget-object p1, Ll/۫᩶;->᩻:Ll/ۗ᩶;

    if-nez p1, :cond_0

    .line 875
    new-instance p1, Ll/ۗ᩶;

    iget-object v5, p0, Ll/۫᩶;->֫:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {p1, v5}, Ll/ۗ᩶;-><init>(Landroid/content/Context;)V

    sput-object p1, Ll/۫᩶;->᩻:Ll/ۗ᩶;

    .line 877
    :cond_0
    sget-object p1, Ll/۫᩶;->᩻:Ll/ۗ᩶;

    invoke-virtual {p1, v4}, Ll/ۗ᩶;->֫(Ll/᩹᩶;)V

    .line 878
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    invoke-virtual {v1, v3, v2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void

    :catchall_0
    move-exception p1

    .line 878
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 290
    :cond_1
    invoke-virtual {v1, v3, v2, p1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public final ֫()Z
    .locals 11

    .line 368
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 369
    iget-object v0, p0, Ll/۫᩶;->ۧ:Landroid/app/NotificationManager;

    invoke-static {v0}, Ll/᩸᩶;->֫(Landroid/app/NotificationManager;)Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "appops"

    .line 372
    iget-object v1, p0, Ll/۫᩶;->֫:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppOpsManager;

    .line 373
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 374
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 375
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->uid:I

    const/4 v3, 0x1

    .line 377
    :try_start_0
    const-class v4, Landroid/app/AppOpsManager;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "checkOpNoThrow"

    const/4 v6, 0x3

    new-array v7, v6, [Ljava/lang/Class;

    .line 378
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v9, 0x0

    aput-object v8, v7, v9

    aput-object v8, v7, v3

    const-class v8, Ljava/lang/String;

    const/4 v10, 0x2

    aput-object v8, v7, v10

    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v7, "OP_POST_NOTIFICATION"

    .line 380
    invoke-virtual {v4, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 381
    const-class v7, Ljava/lang/Integer;

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 382
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v9

    aput-object v2, v6, v3

    aput-object v1, v6, v10

    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    return v3

    :cond_1
    return v9

    :catch_0
    return v3
.end method

.method public final ۧ()V
    .locals 3

    const/4 v0, 0x0

    .line 249
    iget-object v1, p0, Ll/۫᩶;->ۧ:Landroid/app/NotificationManager;

    const/16 v2, 0x3ee

    invoke-virtual {v1, v0, v2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void
.end method
