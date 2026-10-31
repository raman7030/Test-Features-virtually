.class public final Ll/ۗ᩶;
.super Ljava/lang/Object;
.source "G3SY"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Landroid/content/ServiceConnection;


# static fields
.field public static ۛ֨ۘ:I


# instance fields
.field public final ۙ:Ljava/util/HashMap;

.field public final ᩶:Landroid/os/Handler;

.field public ᩸:Ljava/util/Set;

.field public final ᩹:Landroid/content/Context;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 898
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 894
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۗ᩶;->ۙ:Ljava/util/HashMap;

    .line 896
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۗ᩶;->᩸:Ljava/util/Set;

    .line 899
    iput-object p1, p0, Ll/ۗ᩶;->᩹:Landroid/content/Context;

    .line 900
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "NotificationManagerCompat"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 901
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 902
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Ll/ۗ᩶;->᩶:Landroid/os/Handler;

    return-void
.end method

.method public static ֨֫ۜ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0
.end method

.method private ֫(Ll/ۙ᩶;)V
    .locals 7

    .line 1095
    iget-object v0, p1, Ll/ۙ᩶;->ܿ:Ljava/util/ArrayDeque;

    iget-object v1, p1, Ll/ۙ᩶;->ۧ:Landroid/content/ComponentName;

    const-string v2, "NotifManCompat"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1096
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1097
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 1099
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_4

    .line 1040
    :cond_1
    iget-boolean v4, p1, Ll/ۙ᩶;->֫:Z

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    .line 1043
    :cond_2
    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v4

    const/16 v5, 0x21

    .line 1044
    iget-object v6, p0, Ll/ۗ᩶;->᩹:Landroid/content/Context;

    invoke-virtual {v6, v4, p0, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v4

    iput-boolean v4, p1, Ll/ۙ᩶;->֫:Z

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    .line 1047
    iput v4, p1, Ll/ۙ᩶;->ܽ:I

    goto :goto_0

    .line 1049
    :cond_3
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1050
    invoke-virtual {v6, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 1052
    :goto_0
    iget-boolean v4, p1, Ll/ۙ᩶;->֫:Z

    :goto_1
    if-eqz v4, :cond_9

    .line 1102
    iget-object v4, p1, Ll/ۙ᩶;->ᩳ:Ll/ܽ;

    if-nez v4, :cond_4

    goto :goto_5

    .line 1109
    :cond_4
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬᩶;

    if-nez v4, :cond_5

    goto :goto_3

    .line 1114
    :cond_5
    :try_start_0
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 1115
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1117
    :cond_6
    iget-object v5, p1, Ll/ۙ᩶;->ᩳ:Ll/ܽ;

    invoke-interface {v4, v5}, Ll/۬᩶;->֫(Ll/ܽ;)V

    .line 1118
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1125
    :catch_0
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_3

    .line 1120
    :catch_1
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1121
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1129
    :cond_7
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1131
    invoke-direct {p0, p1}, Ll/ۗ᩶;->ۧ(Ll/ۙ᩶;)V

    :cond_8
    :goto_4
    return-void

    .line 1104
    :cond_9
    :goto_5
    invoke-direct {p0, p1}, Ll/ۗ᩶;->ۧ(Ll/ۙ᩶;)V

    return-void
.end method

.method public static ۗܳ֡(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܿ᩻᩷;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/ܿ᩻᩷;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ۘ۟᩻(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۘ᩷۟(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۘ᩺۫(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ۡۤۡ;

    invoke-virtual {p0}, Ll/ۡۤۡ;->ܽ()Z

    move-result p0

    return p0
.end method

.method public static ۙ۟ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۗۛ᩻;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۠ۛۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۗܺ᩷;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p0, p1, p2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ۤ᩷᩸(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ll/ۙ᩶;)V
    .locals 6

    .line 1072
    iget-object v0, p1, Ll/ۙ᩶;->ۧ:Landroid/content/ComponentName;

    iget-object v1, p1, Ll/ۙ᩶;->ܿ:Ljava/util/ArrayDeque;

    iget-object v2, p0, Ll/ۗ᩶;->᩶:Landroid/os/Handler;

    const/4 v3, 0x3

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-void

    .line 1075
    :cond_0
    iget v4, p1, Ll/ۙ᩶;->ܽ:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p1, Ll/ۙ᩶;->ܽ:I

    const/4 p1, 0x6

    if-le v5, p1, :cond_1

    .line 1077
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1079
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    return-void

    :cond_1
    const/4 p1, 0x1

    shl-int/2addr p1, v4

    mul-int/lit16 p1, p1, 0x3e8

    const-string v1, "NotifManCompat"

    .line 1083
    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1086
    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    int-to-long v3, p1

    .line 1087
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public static ۨ۟ۜ()I
    .locals 1

    const v0, 0x36d2f2a1

    return v0
.end method

.method public static ۬᩶᩹(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Ll/ۘۨ֡;

    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p0

    return p0
.end method

.method public static ܰۖ۬(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Landroid/content/Context;

    check-cast p2, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܳܽ۟(Ljava/lang/Object;)Ll/ܶ᩵ܿ;
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-static {p0}, Ll/ܺ۟᩻;->ܳ(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩶ܶۡ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩷ᩴ۬(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    return p0
.end method

.method public static ᩻ۘ᩻(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۬ܺ᩷;

    check-cast p1, Landroid/content/Intent;

    invoke-interface {p0, p1}, Ll/۬ܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static ᩻ܿۜ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/concurrent/locks/Lock;

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 13

    .line 915
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۗ᩶;->᩹:Landroid/content/Context;

    const/4 v3, 0x3

    const/4 v4, 0x0

    iget-object v5, p0, Ll/ۗ᩶;->ۙ:Ljava/util/HashMap;

    const/4 v6, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v6, :cond_3

    const/4 v7, 0x2

    if-eq v0, v7, :cond_1

    if-eq v0, v3, :cond_0

    return v4

    .line 927
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/ComponentName;

    .line 958
    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶;

    if-eqz p1, :cond_10

    .line 960
    invoke-direct {p0, p1}, Ll/ۗ᩶;->֫(Ll/ۙ᩶;)V

    return v6

    .line 924
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/ComponentName;

    .line 951
    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ᩶;

    if-eqz p1, :cond_10

    .line 1059
    iget-boolean v0, p1, Ll/ۙ᩶;->֫:Z

    if-eqz v0, :cond_2

    .line 1060
    invoke-virtual {v2, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 1061
    iput-boolean v4, p1, Ll/ۙ᩶;->֫:Z

    .line 1063
    :cond_2
    iput-object v1, p1, Ll/ۙ᩶;->ᩳ:Ll/ܽ;

    return v6

    .line 920
    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll/᩶᩶;

    .line 921
    iget-object v0, p1, Ll/᩶᩶;->֫:Landroid/content/ComponentName;

    iget-object p1, p1, Ll/᩶᩶;->ۧ:Landroid/os/IBinder;

    .line 942
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ᩶;

    if-eqz v0, :cond_10

    .line 944
    invoke-static {p1}, Ll/ۧ;->֫(Landroid/os/IBinder;)Ll/ܽ;

    move-result-object p1

    iput-object p1, v0, Ll/ۙ᩶;->ᩳ:Ll/ܽ;

    .line 945
    iput v4, v0, Ll/ۙ᩶;->ܽ:I

    .line 946
    invoke-direct {p0, v0}, Ll/ۗ᩶;->֫(Ll/ۙ᩶;)V

    return v6

    .line 917
    :cond_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll/۬᩶;

    .line 988
    invoke-static {v2}, Ll/۫᩶;->ۧ(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v0

    .line 989
    iget-object v7, p0, Ll/ۗ᩶;->᩸:Ljava/util/Set;

    invoke-interface {v0, v7}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto/16 :goto_3

    .line 993
    :cond_5
    iput-object v0, p0, Ll/ۗ᩶;->᩸:Ljava/util/Set;

    .line 994
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    const-string v9, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

    .line 995
    invoke-virtual {v8, v9}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v8

    .line 994
    invoke-virtual {v7, v8, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v7

    .line 996
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 997
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/pm/ResolveInfo;

    .line 998
    iget-object v10, v9, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v10, v10, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    move-object v11, v0

    check-cast v11, Ljava/util/HashSet;

    invoke-virtual {v11, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_0

    .line 1001
    :cond_6
    new-instance v10, Landroid/content/ComponentName;

    iget-object v11, v9, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v12, v11, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v11, v11, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v10, v12, v11}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1003
    iget-object v9, v9, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v9, v9, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    if-eqz v9, :cond_7

    .line 1004
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_0

    .line 1008
    :cond_7
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1011
    :cond_8
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v9, "NotifManCompat"

    if-eqz v7, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/ComponentName;

    .line 1012
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    .line 1013
    invoke-static {v9, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 1014
    invoke-static {v7}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1016
    :cond_a
    new-instance v9, Ll/ۙ᩶;

    invoke-direct {v9, v7}, Ll/ۙ᩶;-><init>(Landroid/content/ComponentName;)V

    invoke-virtual {v5, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1021
    :cond_b
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1022
    :cond_c
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    .line 1023
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 1024
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 1025
    invoke-static {v9, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 1026
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1028
    :cond_d
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ᩶;

    .line 1059
    iget-boolean v10, v7, Ll/ۙ᩶;->֫:Z

    if-eqz v10, :cond_e

    .line 1060
    invoke-virtual {v2, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 1061
    iput-boolean v4, v7, Ll/ۙ᩶;->֫:Z

    .line 1063
    :cond_e
    iput-object v1, v7, Ll/ۙ᩶;->ᩳ:Ll/ܽ;

    .line 1029
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    .line 935
    :cond_f
    :goto_3
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩶;

    .line 936
    iget-object v2, v1, Ll/ۙ᩶;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v2, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 937
    invoke-direct {p0, v1}, Ll/ۗ᩶;->֫(Ll/ۙ᩶;)V

    goto :goto_4

    :cond_10
    return v6
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    const-string v0, "NotifManCompat"

    const/4 v1, 0x3

    .line 966
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 967
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 969
    :cond_0
    new-instance v0, Ll/᩶᩶;

    invoke-direct {v0, p1, p2}, Ll/᩶᩶;-><init>(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    iget-object p1, p0, Ll/ۗ᩶;->᩶:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 971
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "NotifManCompat"

    const/4 v1, 0x3

    .line 976
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 977
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 979
    :cond_0
    iget-object v0, p0, Ll/ۗ᩶;->᩶:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final ֫(Ll/᩹᩶;)V
    .locals 2

    .line 910
    iget-object v0, p0, Ll/ۗ᩶;->᩶:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
