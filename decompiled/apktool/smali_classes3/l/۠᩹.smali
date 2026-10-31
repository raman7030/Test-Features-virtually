.class public final Ll/۠᩹;
.super Ljava/lang/Object;
.source "K22G"


# static fields
.field public static final ֫:Ljava/lang/Class;

.field public static final ۧ:Landroid/os/Handler;

.field public static final ܳ:Ljava/lang/reflect/Method;

.field public static final ܽ:Ljava/lang/reflect/Field;

.field public static final ܿ:Ljava/lang/reflect/Method;

.field public static final ᩳ:Ljava/lang/reflect/Method;

.field public static final ᩻:Ljava/lang/reflect/Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 90
    const-class v0, Landroid/app/Activity;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Ll/۠᩹;->ۧ:Landroid/os/Handler;

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "android.app.ActivityThread"

    .line 377
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v2, v1

    .line 93
    :goto_0
    sput-object v2, Ll/۠᩹;->֫:Ljava/lang/Class;

    const/4 v2, 0x1

    :try_start_1
    const-string v3, "mMainThread"

    .line 357
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 358
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-object v3, v1

    .line 94
    :goto_1
    sput-object v3, Ll/۠᩹;->ܽ:Ljava/lang/reflect/Field;

    :try_start_2
    const-string v3, "mToken"

    .line 367
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 368
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-object v0, v1

    .line 95
    :goto_2
    sput-object v0, Ll/۠᩹;->᩻:Ljava/lang/reflect/Field;

    .line 96
    sget-object v0, Ll/۠᩹;->֫:Ljava/lang/Class;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    .line 301
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v7, Landroid/os/IBinder;

    const-string v8, "performStopActivity"

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    :try_start_3
    new-array v9, v3, [Ljava/lang/Class;

    aput-object v7, v9, v5

    aput-object v6, v9, v2

    .line 305
    const-class v10, Ljava/lang/String;

    aput-object v10, v9, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 307
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    :goto_3
    move-object v0, v1

    .line 96
    :goto_4
    sput-object v0, Ll/۠᩹;->ܿ:Ljava/lang/reflect/Method;

    .line 97
    sget-object v0, Ll/۠᩹;->֫:Ljava/lang/Class;

    if-nez v0, :cond_1

    goto :goto_5

    :cond_1
    :try_start_4
    new-array v9, v4, [Ljava/lang/Class;

    aput-object v7, v9, v5

    aput-object v6, v9, v2

    .line 319
    invoke-virtual {v0, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 321
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_6

    :catchall_4
    :goto_5
    move-object v0, v1

    .line 97
    :goto_6
    sput-object v0, Ll/۠᩹;->ᩳ:Ljava/lang/reflect/Method;

    .line 98
    sget-object v0, Ll/۠᩹;->֫:Ljava/lang/Class;

    .line 329
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    if-eq v8, v9, :cond_2

    const/16 v9, 0x1b

    if-ne v8, v9, :cond_4

    :cond_2
    if-nez v0, :cond_3

    goto :goto_7

    :cond_3
    :try_start_5
    const-string v8, "requestRelaunchActivity"

    const/16 v9, 0x9

    new-array v9, v9, [Ljava/lang/Class;

    aput-object v7, v9, v5

    .line 337
    const-class v5, Ljava/util/List;

    aput-object v5, v9, v2

    aput-object v5, v9, v4

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v9, v3

    const/4 v3, 0x4

    aput-object v6, v9, v3

    const-class v3, Landroid/content/res/Configuration;

    const/4 v4, 0x5

    aput-object v3, v9, v4

    const/4 v4, 0x6

    aput-object v3, v9, v4

    const/4 v3, 0x7

    aput-object v6, v9, v3

    const/16 v3, 0x8

    aput-object v6, v9, v3

    invoke-virtual {v0, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 348
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object v1, v0

    .line 98
    :catchall_5
    :cond_4
    :goto_7
    sput-object v1, Ll/۠᩹;->ܳ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static ֫(Landroid/app/Activity;)Z
    .locals 12

    .line 108
    sget-object v0, Ll/۠᩹;->ۧ:Landroid/os/Handler;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, 0x1

    if-lt v1, v2, :cond_0

    .line 109
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return v3

    :cond_0
    const/16 v2, 0x1b

    const/16 v4, 0x1a

    .line 329
    sget-object v5, Ll/۠᩹;->ܳ:Ljava/lang/reflect/Method;

    const/4 v6, 0x0

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    if-nez v5, :cond_2

    goto/16 :goto_3

    .line 119
    :cond_2
    sget-object v7, Ll/۠᩹;->ᩳ:Ljava/lang/reflect/Method;

    if-nez v7, :cond_3

    sget-object v7, Ll/۠᩹;->ܿ:Ljava/lang/reflect/Method;

    if-nez v7, :cond_3

    goto/16 :goto_3

    .line 123
    :cond_3
    :try_start_0
    sget-object v7, Ll/۠᩹;->᩻:Ljava/lang/reflect/Field;

    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    goto :goto_3

    .line 127
    :cond_4
    sget-object v8, Ll/۠᩹;->ܽ:Ljava/lang/reflect/Field;

    invoke-virtual {v8, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_5

    goto :goto_3

    .line 132
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v9

    .line 133
    new-instance v10, Ll/֨᩹;

    invoke-direct {v10, p0}, Ll/֨᩹;-><init>(Landroid/app/Activity;)V

    .line 134
    invoke-virtual {v9, v10}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 142
    new-instance v11, Ll/᩵᩹;

    invoke-direct {v11, v10, v7}, Ll/᩵᩹;-><init>(Ll/֨᩹;Ljava/lang/Object;)V

    invoke-virtual {v0, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eq v1, v4, :cond_7

    if-ne v1, v2, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    goto :goto_1

    :cond_7
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_8

    .line 152
    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v7, v1, v6

    const/4 v2, 0x0

    aput-object v2, v1, v3

    const/4 v4, 0x2

    aput-object v2, v1, v4

    const/4 v4, 0x3

    aput-object p0, v1, v4

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v4, 0x4

    aput-object p0, v1, v4

    const/4 v4, 0x5

    aput-object v2, v1, v4

    const/4 v4, 0x6

    aput-object v2, v1, v4

    const/4 v2, 0x7

    aput-object p0, v1, v2

    const/16 v2, 0x8

    aput-object p0, v1, v2

    .line 151
    invoke-virtual {v5, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 154
    :cond_8
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    :goto_2
    :try_start_2
    new-instance p0, Ll/֡᩹;

    invoke-direct {p0, v9, v10}, Ll/֡᩹;-><init>(Landroid/app/Application;Ll/֨᩹;)V

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return v3

    :catchall_0
    move-exception p0

    new-instance v1, Ll/֡᩹;

    invoke-direct {v1, v9, v10}, Ll/֡᩹;-><init>(Landroid/app/Application;Ll/֨᩹;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 168
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :goto_3
    return v6
.end method

.method public static ֫(Ljava/lang/Object;ILandroid/app/Activity;)Z
    .locals 1

    .line 256
    :try_start_0
    sget-object v0, Ll/۠᩹;->᩻:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_1

    .line 258
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p0

    if-eq p0, p1, :cond_0

    goto :goto_0

    .line 264
    :cond_0
    sget-object p0, Ll/۠᩹;->ܽ:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 268
    sget-object p1, Ll/۠᩹;->ۧ:Landroid/os/Handler;

    new-instance p2, Ll/ۚ᩹;

    invoke-direct {p2, p0, v0}, Ll/ۚ᩹;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
