.class public final Ll/۬ۧܽ;
.super Ljava/lang/Object;
.source "OANW"

# interfaces
.implements Ll/۟֫ܽ;


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public ۧ:Ll/ܰ֫ܽ;

.field public final ܽ:Landroidx/window/sidecar/SidecarInterface;

.field public final ܿ:Ljava/util/LinkedHashMap;

.field public final ᩳ:Ll/۠ۧܽ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 63
    invoke-static {p1}, Ll/ܶۧܽ;->֫(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;

    move-result-object p1

    .line 64
    new-instance v0, Ll/۠ۧܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۠ۧܽ;-><init>(I)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    .line 52
    iput-object v0, p0, Ll/۬ۧܽ;->ᩳ:Ll/۠ۧܽ;

    .line 56
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/۬ۧܽ;->ܿ:Ljava/util/LinkedHashMap;

    .line 59
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/۬ۧܽ;->֫:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final synthetic ֫(Ll/۬ۧܽ;)Ll/ܰ֫ܽ;
    .locals 0

    .line 49
    iget-object p0, p0, Ll/۬ۧܽ;->ۧ:Ll/ܰ֫ܽ;

    return-object p0
.end method

.method public static final synthetic ۧ(Ll/۬ۧܽ;)Ll/۠ۧܽ;
    .locals 0

    .line 49
    iget-object p0, p0, Ll/۬ۧܽ;->ᩳ:Ll/۠ۧܽ;

    return-object p0
.end method

.method public static final synthetic ܽ(Ll/۬ۧܽ;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 49
    iget-object p0, p0, Ll/۬ۧܽ;->ܿ:Ljava/util/LinkedHashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫()Landroidx/window/sidecar/SidecarInterface;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    return-object v0
.end method

.method public final ֫(Landroid/app/Activity;)V
    .locals 1

    .line 475
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    :goto_1
    if-eqz v0, :cond_2

    .line 90
    invoke-virtual {p0, v0, p1}, Ll/۬ۧܽ;->֫(Landroid/os/IBinder;Landroid/app/Activity;)V

    return-void

    .line 92
    :cond_2
    new-instance v0, Ll/᩶ۧܽ;

    invoke-direct {v0, p0, p1}, Ll/᩶ۧܽ;-><init>(Ll/۬ۧܽ;Landroid/app/Activity;)V

    .line 93
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public final ֫(Landroid/os/IBinder;Landroid/app/Activity;)V
    .locals 2

    .line 104
    iget-object v0, p0, Ll/۬ۧܽ;->ܿ:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1, p1}, Landroidx/window/sidecar/SidecarInterface;->onWindowLayoutChangeListenerAdded(Landroid/os/IBinder;)V

    .line 108
    :goto_0
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 109
    iget-object p1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/window/sidecar/SidecarInterface;->onDeviceStateListenersChanged(Z)V

    .line 111
    :cond_2
    :goto_1
    iget-object p1, p0, Ll/۬ۧܽ;->ۧ:Ll/ܰ֫ܽ;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p2}, Ll/۬ۧܽ;->ܽ(Landroid/app/Activity;)Ll/ܿܽܽ;

    move-result-object v0

    check-cast p1, Ll/᩸ۧܽ;

    invoke-virtual {p1, p2, v0}, Ll/᩸ۧܽ;->֫(Landroid/app/Activity;Ll/ܿܽܽ;)V

    .line 118
    :goto_2
    iget-object p1, p0, Ll/۬ۧܽ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    .line 121
    new-instance v0, Ll/ۗۧܽ;

    invoke-direct {v0, p0, p2}, Ll/ۗۧܽ;-><init>(Ll/۬ۧܽ;Landroid/app/Activity;)V

    .line 133
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    invoke-virtual {p2, v0}, Landroid/app/Activity;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    :cond_4
    return-void
.end method

.method public final ֫(Ll/۫ۧܽ;)V
    .locals 3

    .line 68
    new-instance v0, Ll/᩸ۧܽ;

    invoke-direct {v0, p1}, Ll/᩸ۧܽ;-><init>(Ll/۫ۧܽ;)V

    iput-object v0, p0, Ll/۬ۧܽ;->ۧ:Ll/ܰ֫ܽ;

    .line 69
    iget-object p1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez p1, :cond_0

    return-void

    .line 70
    :cond_0
    new-instance v0, Ll/᩹ۧܽ;

    .line 72
    new-instance v1, Ll/ۙۧܽ;

    invoke-direct {v1, p0}, Ll/ۙۧܽ;-><init>(Ll/۬ۧܽ;)V

    check-cast v1, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    .line 70
    iget-object v2, p0, Ll/۬ۧܽ;->ᩳ:Ll/۠ۧܽ;

    invoke-direct {v0, v2, v1}, Ll/᩹ۧܽ;-><init>(Ll/۠ۧܽ;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V

    check-cast v0, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    .line 69
    invoke-interface {p1, v0}, Landroidx/window/sidecar/SidecarInterface;->setSidecarCallback(Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V

    return-void
.end method

.method public final ۧ(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    :goto_1
    if-nez v0, :cond_2

    goto :goto_4

    .line 140
    :cond_2
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v1, v0}, Landroidx/window/sidecar/SidecarInterface;->onWindowLayoutChangeListenerRemoved(Landroid/os/IBinder;)V

    .line 150
    :goto_2
    iget-object v1, p0, Ll/۬ۧܽ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ComponentCallbacks;

    .line 151
    invoke-virtual {p1, v2}, Landroid/app/Activity;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 152
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    iget-object p1, p0, Ll/۬ۧܽ;->ܿ:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    .line 143
    :goto_3
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_6

    .line 145
    iget-object p1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p1, v2}, Landroidx/window/sidecar/SidecarInterface;->onDeviceStateListenersChanged(Z)V

    :cond_6
    :goto_4
    return-void
.end method

.method public final ۧ()Z
    .locals 9

    const/4 v0, 0x0

    .line 159
    :try_start_0
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    move-object v1, v3

    goto :goto_1

    :cond_1
    const-string v4, "setSidecarCallback"

    new-array v5, v2, [Ljava/lang/Class;

    .line 161
    const-class v6, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    aput-object v6, v5, v0

    .line 159
    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    :goto_1
    if-nez v1, :cond_2

    move-object v1, v3

    goto :goto_2

    .line 163
    :cond_2
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    .line 164
    :goto_2
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_15

    .line 173
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {v1}, Landroidx/window/sidecar/SidecarInterface;->getDeviceState()Landroidx/window/sidecar/SidecarDeviceState;

    .line 176
    :goto_3
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {v1, v2}, Landroidx/window/sidecar/SidecarInterface;->onDeviceStateListenersChanged(Z)V

    .line 179
    :goto_4
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v5, Landroid/os/IBinder;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_6

    :goto_5
    move-object v1, v3

    goto :goto_6

    :cond_6
    const-string v6, "getWindowLayoutInfo"

    new-array v7, v2, [Ljava/lang/Class;

    aput-object v5, v7, v0

    .line 180
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    :goto_6
    if-nez v1, :cond_7

    move-object v1, v3

    goto :goto_7

    .line 181
    :cond_7
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    .line 182
    :goto_7
    const-class v6, Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    invoke-static {v1, v6}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 189
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_9

    :goto_8
    move-object v1, v3

    goto :goto_9

    :cond_9
    const-string v6, "onWindowLayoutChangeListenerAdded"

    new-array v7, v2, [Ljava/lang/Class;

    aput-object v5, v7, v0

    .line 190
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    :goto_9
    if-nez v1, :cond_a

    move-object v1, v3

    goto :goto_a

    .line 192
    :cond_a
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    .line 193
    :goto_a
    invoke-static {v1, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 201
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_c

    :goto_b
    move-object v1, v3

    goto :goto_c

    :cond_c
    const-string v6, "onWindowLayoutChangeListenerRemoved"

    new-array v7, v2, [Ljava/lang/Class;

    aput-object v5, v7, v0

    .line 202
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    :goto_c
    if-nez v1, :cond_d

    move-object v1, v3

    goto :goto_d

    .line 204
    :cond_d
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    .line 205
    :goto_d
    invoke-static {v1, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    .line 213
    new-instance v1, Landroidx/window/sidecar/SidecarDeviceState;

    invoke-direct {v1}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v4, 0x3

    .line 218
    :try_start_2
    iput v4, v1, Landroidx/window/sidecar/SidecarDeviceState;->posture:I
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_e

    .line 220
    :catch_0
    :try_start_3
    const-class v5, Landroidx/window/sidecar/SidecarDeviceState;

    const-string v6, "setPosture"

    new-array v7, v2, [Ljava/lang/Class;

    .line 230
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v0

    .line 228
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 232
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v6, v7, v0

    invoke-virtual {v5, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-class v5, Landroidx/window/sidecar/SidecarDeviceState;

    const-string v6, "getPosture"

    .line 233
    invoke-virtual {v5, v6, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 234
    invoke-virtual {v5, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_11

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_10

    .line 241
    :goto_e
    new-instance v1, Landroidx/window/sidecar/SidecarDisplayFeature;

    invoke-direct {v1}, Landroidx/window/sidecar/SidecarDisplayFeature;-><init>()V

    .line 244
    invoke-virtual {v1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    move-result-object v4

    const-string v5, "displayFeature.rect"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    invoke-virtual {v1, v4}, Landroidx/window/sidecar/SidecarDisplayFeature;->setRect(Landroid/graphics/Rect;)V

    .line 249
    invoke-virtual {v1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 250
    invoke-virtual {v1, v2}, Landroidx/window/sidecar/SidecarDisplayFeature;->setType(I)V

    .line 253
    new-instance v4, Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    invoke-direct {v4}, Landroidx/window/sidecar/SidecarWindowLayoutInfo;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 258
    :try_start_4
    iget-object v0, v4, Landroidx/window/sidecar/SidecarWindowLayoutInfo;->displayFeatures:Ljava/util/List;
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_f

    .line 269
    :catch_1
    :try_start_5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v1, Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    const-string v6, "setDisplayFeatures"

    new-array v7, v2, [Ljava/lang/Class;

    .line 272
    const-class v8, Ljava/util/List;

    aput-object v8, v7, v0

    .line 271
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v5, v2, v0

    .line 274
    invoke-virtual {v1, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    const-string v2, "getDisplayFeatures"

    .line 275
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 280
    invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_f

    check-cast v1, Ljava/util/List;

    .line 169
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    :goto_f
    const/4 v0, 0x1

    goto :goto_10

    .line 282
    :cond_e
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid display feature getter/setter"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 280
    :cond_f
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 236
    :cond_10
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid device posture getter/setter"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 234
    :cond_11
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 206
    :cond_12
    new-instance v2, Ljava/lang/NoSuchMethodException;

    const-string v3, "Illegal return type for \'onWindowLayoutChangeListenerRemoved\': "

    .line 207
    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 206
    invoke-direct {v2, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 194
    :cond_13
    new-instance v2, Ljava/lang/NoSuchMethodException;

    const-string v3, "Illegal return type for \'onWindowLayoutChangeListenerAdded\': "

    .line 195
    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 194
    invoke-direct {v2, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 183
    :cond_14
    new-instance v2, Ljava/lang/NoSuchMethodException;

    const-string v3, "Illegal return type for \'getWindowLayoutInfo\': "

    .line 184
    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 183
    invoke-direct {v2, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 165
    :cond_15
    new-instance v2, Ljava/lang/NoSuchMethodException;

    const-string v3, "Illegal return type for \'setSidecarCallback\': "

    .line 166
    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 165
    invoke-direct {v2, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    :goto_10
    return v0
.end method

.method public final ܽ(Landroid/app/Activity;)Ll/ܿܽܽ;
    .locals 2

    .line 475
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    iget-object p1, p1, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    :goto_1
    if-nez p1, :cond_2

    .line 79
    new-instance p1, Ll/ܿܽܽ;

    sget-object v0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    invoke-direct {p1, v0}, Ll/ܿܽܽ;-><init>(Ljava/util/List;)V

    return-object p1

    .line 80
    :cond_2
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_3

    move-object p1, v0

    goto :goto_2

    :cond_3
    invoke-interface {v1, p1}, Landroidx/window/sidecar/SidecarInterface;->getWindowLayoutInfo(Landroid/os/IBinder;)Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    move-result-object p1

    .line 83
    :goto_2
    iget-object v1, p0, Ll/۬ۧܽ;->ܽ:Landroidx/window/sidecar/SidecarInterface;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v1}, Landroidx/window/sidecar/SidecarInterface;->getDeviceState()Landroidx/window/sidecar/SidecarDeviceState;

    move-result-object v0

    :goto_3
    if-nez v0, :cond_5

    new-instance v0, Landroidx/window/sidecar/SidecarDeviceState;

    invoke-direct {v0}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    .line 81
    :cond_5
    iget-object v1, p0, Ll/۬ۧܽ;->ᩳ:Ll/۠ۧܽ;

    invoke-virtual {v1, p1, v0}, Ll/۠ۧܽ;->֫(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Ll/ܿܽܽ;

    move-result-object p1

    return-object p1
.end method
