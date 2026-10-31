.class public final Ll/ܰ۠ܿ;
.super Ll/۬ᩴܺ;
.source "TA2U"


# instance fields
.field public final ֫:J

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZJ)V
    .locals 0

    .line 370
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    iput-boolean p2, p0, Ll/ܰ۠ܿ;->ܿ:Z

    iput-boolean p3, p0, Ll/ܰ۠ܿ;->ᩳ:Z

    iput-boolean p4, p0, Ll/ܰ۠ܿ;->ܽ:Z

    iput-wide p5, p0, Ll/ܰ۠ܿ;->֫:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۠ܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Landroid/content/pm/PackageInfo;)Ll/ܰ۠ܿ;
    .locals 8

    .line 377
    iget-wide v5, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 378
    new-instance v0, Ll/֫ܶܿ;

    .line 356
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 357
    iput-boolean v1, v0, Ll/֫ܶܿ;->ۧ:Z

    .line 358
    iput-boolean v1, v0, Ll/֫ܶܿ;->֫:Z

    .line 359
    iput-boolean v1, v0, Ll/֫ܶܿ;->ܽ:Z

    .line 379
    invoke-static {}, Ll/ۧܶܿ;->֫()Ll/᩺۠ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    :try_start_0
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ll/᩺۠ܿ;->֫(Ljava/lang/String;Ll/֫ܶܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 385
    :goto_0
    iget-boolean v1, v0, Ll/֫ܶܿ;->ܽ:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    const-string v2, "/system"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 386
    :goto_1
    new-instance v7, Ll/ܰ۠ܿ;

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget-boolean v3, v0, Ll/֫ܶܿ;->ۧ:Z

    iget-boolean v4, v0, Ll/֫ܶܿ;->֫:Z

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ܰ۠ܿ;-><init>(Ljava/lang/String;ZZZJ)V

    return-object v7
.end method

.method public static ֫(Ll/ܰ۠ܿ;Landroid/content/pm/PackageInfo;)Z
    .locals 3

    .line 390
    iget-object v0, p0, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    iget-object v1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ܰ۠ܿ;->֫:J

    iget-wide p0, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v2, v0, p0

    if-nez v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 370
    instance-of v0, p1, Ll/ܰ۠ܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܰ۠ܿ;

    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ܿ:Z

    iget-boolean v1, p1, Ll/ܰ۠ܿ;->ܿ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ᩳ:Z

    iget-boolean v1, p1, Ll/ܰ۠ܿ;->ᩳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ܽ:Z

    iget-boolean v1, p1, Ll/ܰ۠ܿ;->ܽ:Z

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/ܰ۠ܿ;->֫:J

    iget-wide v2, p1, Ll/ܰ۠ܿ;->֫:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 0
    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ܿ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ܰ۠ܿ;->ᩳ:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ܰ۠ܿ;->ܽ:Z

    if-eqz v2, :cond_2

    const/16 v1, 0x4cf

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x20

    iget-wide v2, p0, Ll/ܰ۠ܿ;->֫:J

    ushr-long v4, v2, v1

    xor-long v1, v2, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 370
    iget-object v1, p0, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 370
    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ܿ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/ܰ۠ܿ;->ᩳ:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Ll/ܰ۠ܿ;->ܽ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-wide v3, p0, Ll/ܰ۠ܿ;->֫:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Ll/ܰ۠ܿ;->ۧ:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v6, 0x1

    aput-object v0, v4, v6

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v2, v4, v0

    const/4 v0, 0x4

    aput-object v3, v4, v0

    const-string v0, "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v5, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    .line 0
    const-class v3, Ll/ܰ۠ܿ;

    invoke-static {v3, v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 370
    :goto_1
    array-length v2, v0

    if-ge v5, v2, :cond_2

    aget-object v2, v0, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v4, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v6

    if-eq v5, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    .line 370
    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ܽ:Z

    return v0
.end method

.method public final ֫(Z)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 394
    iget-boolean p1, p0, Ll/ܰ۠ܿ;->ᩳ:Z

    return p1

    :cond_0
    iget-boolean p1, p0, Ll/ܰ۠ܿ;->ܽ:Z

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 370
    iget-boolean v0, p0, Ll/ܰ۠ܿ;->ܿ:Z

    return v0
.end method
