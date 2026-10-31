.class public final Ll/ܰᩴܺ;
.super Ljava/lang/Object;
.source "2B8B"


# static fields
.field public static ܳ:I


# instance fields
.field public final ֫:Ll/᩷᩵ܺ;

.field public final ۧ:Ljava/lang/Object;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ll/ܽ᩵ܺ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩷᩵ܺ;Ll/ܽ᩵ܺ;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 372
    :try_start_0
    sget v1, Ll/ܰᩴܺ;->ܳ:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Ll/ܰᩴܺ;->ܳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 384
    iput v1, p0, Ll/ܰᩴܺ;->ᩳ:I

    .line 394
    iput-object p1, p0, Ll/ܰᩴܺ;->֫:Ll/᩷᩵ܺ;

    .line 395
    iput-object p2, p0, Ll/ܰᩴܺ;->ܿ:Ll/ܽ᩵ܺ;

    .line 396
    iput-object p3, p0, Ll/ܰᩴܺ;->ۧ:Ljava/lang/Object;

    .line 397
    iput-object p4, p0, Ll/ܰᩴܺ;->ܽ:Ljava/lang/String;

    return-void

    :catchall_0
    move-exception p1

    .line 372
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܰᩴܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰᩴܺ;->ᩳ:I

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 440
    :cond_0
    instance-of v1, p1, Ll/ܰᩴܺ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 444
    :cond_1
    check-cast p1, Ll/ܰᩴܺ;

    .line 446
    iget-object v1, p0, Ll/ܰᩴܺ;->֫:Ll/᩷᩵ܺ;

    iget-object v3, p1, Ll/ܰᩴܺ;->֫:Ll/᩷᩵ܺ;

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰᩴܺ;->ۧ:Ljava/lang/Object;

    iget-object v3, p1, Ll/ܰᩴܺ;->ۧ:Ljava/lang/Object;

    .line 447
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰᩴܺ;->ܿ:Ll/ܽ᩵ܺ;

    iget-object v3, p1, Ll/ܰᩴܺ;->ܿ:Ll/ܽ᩵ܺ;

    .line 448
    invoke-virtual {v1, v3}, Ll/ܽ᩵ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰᩴܺ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܰᩴܺ;->ܽ:Ljava/lang/String;

    .line 449
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 455
    iget-object v0, p0, Ll/ܰᩴܺ;->֫:Ll/᩷᩵ܺ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 456
    iget-object v1, p0, Ll/ܰᩴܺ;->ۧ:Ljava/lang/Object;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 457
    iget-object v0, p0, Ll/ܰᩴܺ;->ܿ:Ll/ܽ᩵ܺ;

    invoke-virtual {v0}, Ll/ܽ᩵ܺ;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 458
    iget-object v1, p0, Ll/ܰᩴܺ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    iget-object v1, p0, Ll/ܰᩴܺ;->֫:Ll/᩷᩵ܺ;

    if-eqz v1, :cond_0

    .line 423
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 425
    :cond_0
    iget-object v2, p0, Ll/ܰᩴܺ;->ܿ:Ll/ܽ᩵ܺ;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    iget-object v2, p0, Ll/ܰᩴܺ;->ۧ:Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ll/᩷᩵ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, ":"

    .line 427
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, " -> "

    .line 429
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰᩴܺ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
