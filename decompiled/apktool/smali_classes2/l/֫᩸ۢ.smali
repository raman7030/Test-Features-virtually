.class public final Ll/֫᩸ۢ;
.super Ljava/lang/Object;
.source "19BY"


# static fields
.field public static final ֫:Ljava/io/File;

.field public static final ۧ:Z

.field public static ܽ:Ll/۟ܶۢ;

.field public static ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {}, Ll/ۙ᩸᩷;->֫()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/֫᩸ۢ;->ۧ:Z

    .line 23
    new-instance v0, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ۜ()Ljava/io/File;

    move-result-object v1

    const-string v2, "term/bin"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Ll/֫᩸ۢ;->֫:Ljava/io/File;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/io/File;
    .locals 1

    .line 0
    sget-object v0, Ll/֫᩸ۢ;->֫:Ljava/io/File;

    return-object v0
.end method

.method public static ۧ()Ll/۟ܶۢ;
    .locals 7

    .line 28
    sget-object v0, Ll/֫᩸ۢ;->ܽ:Ll/۟ܶۢ;

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {v0}, Ll/۟ܶۢ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 32
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sget-wide v2, Ll/֫᩸ۢ;->ᩳ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-gez v5, :cond_1

    goto :goto_2

    .line 36
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Ll/֫᩸ۢ;->ᩳ:J

    .line 37
    sget-boolean v0, Ll/֫᩸ۢ;->ۧ:Z

    if-eqz v0, :cond_2

    :try_start_0
    const-string v0, "bin.mt.termex"

    .line 66
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_3

    .line 41
    new-instance v1, Ll/۟ܶۢ;

    iget v2, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iget-object v3, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget-object v5, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    new-instance v6, Ljava/io/File;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v5, v6}, Ll/۟ܶۢ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    goto :goto_1

    .line 45
    :cond_2
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "term/version"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 46
    sget-object v1, Ll/֫᩸ۢ;->֫:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 48
    :try_start_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 50
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    .line 51
    new-instance v3, Ll/۟ܶۢ;

    invoke-direct {v3, v2, v0, v4, v1}, Ll/۟ܶۢ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v3

    goto :goto_1

    :catch_1
    :cond_3
    move-object v1, v4

    :goto_1
    if-eqz v1, :cond_4

    .line 56
    invoke-virtual {v1}, Ll/۟ܶۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 57
    sput-object v1, Ll/֫᩸ۢ;->ܽ:Ll/۟ܶۢ;

    return-object v1

    :cond_4
    :goto_2
    return-object v4
.end method

.method public static ܽ()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 73
    sput-wide v0, Ll/֫᩸ۢ;->ᩳ:J

    const/4 v0, 0x0

    .line 74
    sput-object v0, Ll/֫᩸ۢ;->ܽ:Ll/۟ܶۢ;

    return-void
.end method
