.class public abstract Ll/۬ܿ;
.super Ljava/lang/Object;
.source "Y4G0"


# static fields
.field public static ۗ:I

.field public static final ۙ:Ljava/lang/Object;

.field public static ۛ:Ll/ۙܿ;

.field public static ۤ:Ll/ۘ۫;

.field public static ۨ:Ll/ۘ۫;

.field public static ۫:Z

.field public static ۬:Ljava/lang/Boolean;

.field public static final ᩶:Ljava/lang/Object;

.field public static final synthetic ᩸:I

.field public static final ᩹:Ll/ᩴ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 118
    new-instance v0, Ll/ۙܿ;

    new-instance v1, Ll/ۗܿ;

    .line 168
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-direct {v0, v1}, Ll/ۙܿ;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Ll/۬ܿ;->ۛ:Ll/ۙܿ;

    const/16 v0, -0x64

    .line 243
    sput v0, Ll/۬ܿ;->ۗ:I

    const/4 v0, 0x0

    .line 245
    sput-object v0, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    .line 246
    sput-object v0, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    .line 247
    sput-object v0, Ll/۬ܿ;->۬:Ljava/lang/Boolean;

    const/4 v0, 0x0

    .line 248
    sput-boolean v0, Ll/۬ܿ;->۫:Z

    .line 255
    new-instance v0, Ll/ᩴ᩵;

    invoke-direct {v0}, Ll/ᩴ᩵;-><init>()V

    sput-object v0, Ll/۬ܿ;->᩹:Ll/ᩴ᩵;

    .line 257
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۬ܿ;->᩶:Ljava/lang/Object;

    .line 258
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۬ܿ;->ۙ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֡()Ljava/lang/Object;
    .locals 2

    .line 896
    sget-object v0, Ll/۬ܿ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {v0}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 897
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿ;

    if-eqz v1, :cond_0

    .line 899
    invoke-virtual {v1}, Ll/۬ܿ;->ܽ()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "locale"

    .line 901
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ֨()Ll/ۘ۫;
    .locals 1

    .line 865
    sget-object v0, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    return-object v0
.end method

.method public static ֫(Ll/ۘ۫;)V
    .locals 2

    .line 784
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 787
    invoke-static {}, Ll/۬ܿ;->֡()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 790
    invoke-virtual {p0}, Ll/ۘ۫;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ܿ;->֫(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object p0

    .line 789
    invoke-static {v0, p0}, Ll/᩹ܿ;->֫(Ljava/lang/Object;Landroid/os/LocaleList;)V

    return-void

    .line 797
    :cond_0
    sget-object v0, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    invoke-virtual {p0, v0}, Ll/ۘ۫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 798
    sget-object v0, Ll/۬ܿ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 799
    :try_start_0
    sput-object p0, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    .line 1141
    sget-object p0, Ll/۬ܿ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {p0}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 1142
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿ;

    if-eqz v1, :cond_1

    .line 1147
    invoke-virtual {v1}, Ll/۬ܿ;->֫()V

    goto :goto_0

    .line 801
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    return-void
.end method

.method public static ֫(Ll/۬ܿ;)V
    .locals 3

    .line 1049
    sget-object v0, Ll/۬ܿ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 1052
    :try_start_0
    invoke-static {p0}, Ll/۬ܿ;->ܽ(Ll/۬ܿ;)V

    .line 1054
    sget-object v1, Ll/۬ܿ;->᩹:Ll/ᩴ᩵;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    .line 1055
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۚ()Ll/ۘ۫;
    .locals 1

    .line 855
    sget-object v0, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    return-object v0
.end method

.method public static ۧ(Landroid/content/Context;)V
    .locals 4

    .line 1074
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    .line 1075
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 1078
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v1

    if-eq v1, v2, :cond_1

    .line 1083
    invoke-static {}, Ll/۬ܿ;->ᩴ()Ll/ۘ۫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘ۫;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1089
    invoke-static {p0}, Ll/ܶ᩹;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "locale"

    .line 1093
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1097
    invoke-static {v1}, Ll/᩸ܿ;->֫(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    .line 1095
    invoke-static {v3, v1}, Ll/᩹ܿ;->֫(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 1106
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v0, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 972
    :cond_1
    sput-boolean v2, Ll/۬ܿ;->۫:Z

    return-void
.end method

.method public static ۧ(Ll/۬ܿ;)V
    .locals 1

    .line 1059
    sget-object v0, Ll/۬ܿ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 1061
    :try_start_0
    invoke-static {p0}, Ll/۬ܿ;->ܽ(Ll/۬ܿ;)V

    .line 1062
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܳ(I)V
    .locals 2

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    goto :goto_1

    .line 705
    :cond_0
    sget v0, Ll/۬ܿ;->ۗ:I

    if-eq v0, p0, :cond_3

    .line 706
    sput p0, Ll/۬ܿ;->ۗ:I

    .line 1127
    sget-object p0, Ll/۬ܿ;->᩶:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 1128
    :try_start_0
    sget-object p0, Ll/۬ܿ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {p0}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 1129
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿ;

    if-eqz v1, :cond_1

    .line 1134
    invoke-virtual {v1}, Ll/۬ܿ;->ۧ()Z

    goto :goto_0

    .line 1137
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ܽ(Ll/۬ܿ;)V
    .locals 3

    .line 1113
    sget-object v0, Ll/۬ܿ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 1114
    :try_start_0
    sget-object v1, Ll/۬ܿ;->᩹:Ll/ᩴ᩵;

    invoke-virtual {v1}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1115
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ܿ;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    .line 1120
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1123
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܽ(Landroid/content/Context;)Z
    .locals 4

    .line 912
    sget-object v0, Ll/۬ܿ;->۬:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 914
    :try_start_0
    sget v0, Ll/᩶ܳ;->᩸:I

    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 64
    invoke-static {}, Ll/᩹ܳ;->֫()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    goto :goto_0

    :cond_0
    const/16 v0, 0x280

    .line 69
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    const-class v3, Ll/᩶ܳ;

    invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    .line 916
    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v0, "autoStoreLocales"

    .line 917
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Ll/۬ܿ;->۬:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 923
    :catch_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Ll/۬ܿ;->۬:Ljava/lang/Boolean;

    .line 926
    :cond_1
    :goto_1
    sget-object p0, Ll/۬ܿ;->۬:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static ᩳ(Landroid/content/Context;)V
    .locals 3

    .line 964
    invoke-static {p0}, Ll/۬ܿ;->ܽ(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 966
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_2

    .line 967
    sget-boolean v0, Ll/۬ܿ;->۫:Z

    if-nez v0, :cond_1

    .line 970
    sget-object v0, Ll/۬ܿ;->ۛ:Ll/ۙܿ;

    new-instance v1, Ll/᩵᩺ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۙܿ;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void

    .line 976
    :cond_2
    sget-object v0, Ll/۬ܿ;->ۙ:Ljava/lang/Object;

    monitor-enter v0

    .line 977
    :try_start_0
    sget-object v1, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    if-nez v1, :cond_5

    .line 978
    sget-object v1, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    if-nez v1, :cond_3

    .line 981
    invoke-static {p0}, Ll/ܶ᩹;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 980
    invoke-static {p0}, Ll/ۘ۫;->֫(Ljava/lang/String;)Ll/ۘ۫;

    move-result-object p0

    sput-object p0, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    .line 983
    :cond_3
    sget-object p0, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    invoke-virtual {p0}, Ll/ۘ۫;->֫()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 987
    monitor-exit v0

    return-void

    .line 989
    :cond_4
    sget-object p0, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    sput-object p0, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    goto :goto_1

    .line 990
    :cond_5
    sget-object v2, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    invoke-virtual {v1, v2}, Ll/ۘ۫;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 993
    sget-object v1, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    sput-object v1, Ll/۬ܿ;->ۨ:Ll/ۘ۫;

    .line 995
    invoke-virtual {v1}, Ll/ۘ۫;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 994
    invoke-static {p0, v1}, Ll/ܶ᩹;->֫(Landroid/content/Context;Ljava/lang/String;)V

    .line 997
    :cond_6
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ᩴ()Ll/ۘ۫;
    .locals 2

    .line 821
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 823
    invoke-static {}, Ll/۬ܿ;->֡()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 825
    invoke-static {v0}, Ll/᩹ܿ;->֫(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ۫;->֫(Landroid/os/LocaleList;)Ll/ۘ۫;

    move-result-object v0

    return-object v0

    .line 829
    :cond_0
    sget-object v0, Ll/۬ܿ;->ۤ:Ll/ۘ۫;

    if-eqz v0, :cond_1

    return-object v0

    .line 835
    :cond_1
    invoke-static {}, Ll/ۘ۫;->ܿ()Ll/ۘ۫;

    move-result-object v0

    return-object v0
.end method

.method public static ᩵()I
    .locals 1

    .line 845
    sget v0, Ll/۬ܿ;->ۗ:I

    return v0
.end method


# virtual methods
.method public ֫(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    return-object p1
.end method

.method public abstract ֫(I)Landroid/view/View;
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public abstract ֫(Landroid/content/res/Configuration;)V
.end method

.method public abstract ֫(Landroid/view/View;)V
.end method

.method public abstract ֫(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract ֫(Ljava/lang/CharSequence;)V
.end method

.method public abstract ֫(Ll/ۢᩴ;)V
.end method

.method public abstract ۖ()V
.end method

.method public abstract ۘ()V
.end method

.method public abstract ۜ()V
.end method

.method public abstract ۡ()V
.end method

.method public abstract ۢ()V
.end method

.method public abstract ۧ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract ۧ()Z
.end method

.method public abstract ۧ(I)Z
.end method

.method public abstract ܳ()Ll/ۤᩳ;
.end method

.method public abstract ܺ()V
.end method

.method public ܽ()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ܽ(I)V
.end method

.method public abstract ܿ()Landroid/view/MenuInflater;
.end method

.method public ܿ(I)V
    .locals 0

    return-void
.end method

.method public ᩳ()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public abstract ᩳ(I)V
.end method

.method public abstract ᩷()V
.end method

.method public abstract ᩻()V
.end method
