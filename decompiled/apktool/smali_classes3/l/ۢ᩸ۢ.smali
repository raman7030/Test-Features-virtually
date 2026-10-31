.class public final Ll/ۢ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"


# instance fields
.field public final ֫:J

.field public ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 317
    iput-boolean v0, p0, Ll/ۢ᩸ۢ;->ۧ:Z

    .line 320
    sget-boolean v0, Ll/֫᩸ۢ;->ۧ:Z

    :try_start_0
    const-string v0, "bin.mt.termex"

    .line 66
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    .line 321
    iget-wide v0, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    :goto_1
    iput-wide v0, p0, Ll/ۢ᩸ۢ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 5

    .line 325
    sget-boolean v0, Ll/֫᩸ۢ;->ۧ:Z

    :try_start_0
    const-string v0, "bin.mt.termex"

    .line 66
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    .line 326
    iget-wide v0, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iget-wide v2, p0, Ll/ۢ᩸ۢ;->֫:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
