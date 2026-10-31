.class public final Ll/᩸ܽۧ;
.super Ljava/lang/Object;
.source "T8N8"

# interfaces
.implements Ll/᩻ܳۧ;


# instance fields
.field public final ֫:Ll/ᩴܶ֫;

.field public final ۧ:Ll/ۗ۠֫;

.field public ܽ:[B


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/ۗ۠֫;)V
    .locals 0

    .line 443
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 444
    invoke-static {}, Ll/ۧۧۧ;->֫()J

    .line 445
    iput-object p2, p0, Ll/᩸ܽۧ;->ۧ:Ll/ۗ۠֫;

    .line 446
    new-instance p2, Ll/ᩴܶ֫;

    invoke-direct {p2, p1}, Ll/ᩴܶ֫;-><init>(Ll/᩸۠֫;)V

    iput-object p2, p0, Ll/᩸ܽۧ;->֫:Ll/ᩴܶ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ܽۧ;)Ll/ᩴܶ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܽۧ;->֫:Ll/ᩴܶ֫;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸ܽۧ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܽۧ;->ܽ:[B

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 457
    iget-object v0, p0, Ll/᩸ܽۧ;->֫:Ll/ᩴܶ֫;

    invoke-virtual {v0}, Ll/ᩴܶ֫;->᩷()V

    .line 460
    :try_start_0
    iget-object v1, p0, Ll/᩸ܽۧ;->ۧ:Ll/ۗ۠֫;

    invoke-virtual {v0, v1}, Ll/ᩴܶ֫;->֫(Ll/ۗ۠֫;)J

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 464
    invoke-virtual {v0}, Ll/ᩴܶ֫;->ܳ()J

    move-result-wide v1

    long-to-int v2, v1

    .line 465
    iget-object v1, p0, Ll/᩸ܽۧ;->ܽ:[B

    if-nez v1, :cond_0

    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 466
    iput-object v1, p0, Ll/᩸ܽۧ;->ܽ:[B

    goto :goto_1

    .line 467
    :cond_0
    array-length v3, v1

    if-ne v2, v3, :cond_1

    .line 468
    array-length v3, v1

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iput-object v1, p0, Ll/᩸ܽۧ;->ܽ:[B

    .line 470
    :cond_1
    :goto_1
    iget-object v1, p0, Ll/᩸ܽۧ;->ܽ:[B

    array-length v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {v0, v1, v2, v3}, Ll/ᩴܶ֫;->read([BII)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 473
    :cond_2
    invoke-static {v0}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 474
    throw v1
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method
