.class public final Ll/ᩴۨ᩷;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ll/֨᩺᩷;


# instance fields
.field public final synthetic ֫:Ll/᩵ۨ᩷;

.field public final ۧ:Ll/֡᩺᩷;


# direct methods
.method public constructor <init>(Ll/᩵ۨ᩷;Ll/֡᩺᩷;)V
    .locals 0

    .line 376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۨ᩷;->֫:Ll/᩵ۨ᩷;

    .line 377
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ᩴۨ᩷;->ۧ:Ll/֡᩺᩷;

    return-void
.end method


# virtual methods
.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 382
    iget-object v0, p0, Ll/ᩴۨ᩷;->ۧ:Ll/֡᩺᩷;

    iget-object v0, v0, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 389
    :try_start_0
    iget-object v0, p0, Ll/ᩴۨ᩷;->ۧ:Ll/֡᩺᩷;

    invoke-static {v0}, Ll/᩵ۨ᩷;->֫(Ll/֡᩺᩷;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 432
    iget-object v0, p0, Ll/ᩴۨ᩷;->֫:Ll/᩵ۨ᩷;

    :try_start_0
    iget-object v1, p0, Ll/ᩴۨ᩷;->ۧ:Ll/֡᩺᩷;

    invoke-virtual {v0, v1, p1}, Ll/᩵ۨ᩷;->֫(Ll/֡᩺᩷;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 434
    invoke-static {v0}, Ll/᩵ۨ᩷;->֫(Ll/᩵ۨ᩷;)Ll/ۚۡ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ()Ll/᩵ۘܽ;
    .locals 4

    .line 408
    iget-object v0, p0, Ll/ᩴۨ᩷;->ۧ:Ll/֡᩺᩷;

    iget-object v1, v0, Ll/֡᩺᩷;->ۤ:Ll/ۧ۫᩷;

    if-eqz v1, :cond_1

    .line 410
    iget-object v0, p0, Ll/ᩴۨ᩷;->֫:Ll/᩵ۨ᩷;

    invoke-static {v0, v1}, Ll/᩵ۨ᩷;->֫(Ll/᩵ۨ᩷;Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object v0

    .line 411
    invoke-static {v1, v0}, Ll/᩵ۨ᩷;->֫(Ll/ۧ۫᩷;Ll/ۧ۫᩷;)Ll/᩵ۘܽ;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 415
    :cond_0
    invoke-static {v0}, Ll/᩵ۨ᩷;->֫(Ll/ۧ۫᩷;)Ll/᩵ۘܽ;

    move-result-object v0

    return-object v0

    .line 50
    :cond_1
    new-instance v1, Ll/ۨۜܽ;

    iget-object v2, v0, Ll/֡᩺᩷;->᩹:Ll/ۧ۫᩷;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ۨۜܽ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 51
    :try_start_0
    iget v2, v0, Ll/֡᩺᩷;->᩸:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ll/ۨۜܽ;->seek(J)V

    .line 52
    iget-boolean v0, v0, Ll/֡᩺᩷;->ۙ:Z

    if-eqz v0, :cond_2

    .line 53
    invoke-virtual {v1}, Ll/ۨۜܽ;->ۜۧ()[B

    move-result-object v0

    .line 195
    array-length v2, v0

    invoke-static {v0, v2}, Ll/ۘۤۡ;->ۧ([BI)[B

    move-result-object v0

    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v1}, Ll/ۨۜܽ;->ۜۧ()[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :goto_0
    invoke-virtual {v1}, Ll/ۨۜܽ;->close()V

    .line 102
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    invoke-static {v1}, Ll/᩵ۘܽ;->֫(Ll/۬ۜܽ;)Ll/᩵ۘܽ;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    invoke-virtual {v1}, Ll/ۨۜܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method
