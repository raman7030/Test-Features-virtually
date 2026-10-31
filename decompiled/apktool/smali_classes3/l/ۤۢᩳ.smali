.class public final Ll/ۤۢᩳ;
.super Ljava/lang/Object;
.source "D1X2"


# instance fields
.field public final ֫:Landroid/content/res/Configuration;

.field public final ۧ:Landroid/util/DisplayMetrics;

.field public final ܽ:Landroid/content/pm/PackageInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageInfo;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iput-object p1, p0, Ll/ۤۢᩳ;->ܽ:Landroid/content/pm/PackageInfo;

    .line 146
    iput-object p2, p0, Ll/ۤۢᩳ;->ۧ:Landroid/util/DisplayMetrics;

    .line 147
    iput-object p3, p0, Ll/ۤۢᩳ;->֫:Landroid/content/res/Configuration;

    return-void
.end method

.method public static ֫(Ll/ۤۢᩳ;)Landroid/content/res/Configuration;
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    new-instance v0, Landroid/content/res/Configuration;

    iget-object p0, p0, Ll/ۤۢᩳ;->֫:Landroid/content/res/Configuration;

    invoke-direct {v0, p0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    return-object v0
.end method

.method public static ֫(Landroid/content/Context;Ljava/io/File;)Ll/ۤۢᩳ;
    .locals 3

    .line 130
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x108f

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 131
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v1, :cond_0

    .line 134
    new-instance p1, Landroid/util/DisplayMetrics;

    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/util/DisplayMetrics;->setTo(Landroid/util/DisplayMetrics;)V

    .line 136
    new-instance v1, Ll/ۤۢᩳ;

    invoke-static {v0}, Ll/ۛۢᩳ;->֫(Landroid/content/pm/PackageInfo;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    new-instance v2, Landroid/content/res/Configuration;

    .line 137
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-direct {v2, p0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-direct {v1, v0, p1, v2}, Ll/ۤۢᩳ;-><init>(Landroid/content/pm/PackageInfo;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    return-object v1

    .line 132
    :cond_0
    new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ۤۢᩳ;)Landroid/util/DisplayMetrics;
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 162
    iget-object p0, p0, Ll/ۤۢᩳ;->ۧ:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, p0}, Landroid/util/DisplayMetrics;->setTo(Landroid/util/DisplayMetrics;)V

    return-object v0
.end method

.method public static ܽ(Ll/ۤۢᩳ;)Landroid/content/pm/PackageInfo;
    .locals 0

    .line 154
    iget-object p0, p0, Ll/ۤۢᩳ;->ܽ:Landroid/content/pm/PackageInfo;

    invoke-static {p0}, Ll/ۛۢᩳ;->֫(Landroid/content/pm/PackageInfo;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0
.end method
