.class public final Ll/ۧ۟ܿ;
.super Ll/۟ܶۡ;
.source "V717"


# instance fields
.field public final synthetic ۜ:Ll/ܳܰܿ;

.field public final synthetic ܳ:Landroid/content/Context;

.field public final synthetic ᩷:Ll/ܽ۟ܿ;

.field public final synthetic ᩻:Ll/ۜܰܿ;


# direct methods
.method public constructor <init>(Ll/ܽ۟ܿ;Ll/ۜܰܿ;Landroid/content/Context;Ll/ܳܰܿ;)V
    .locals 0

    .line 36
    iput-object p1, p0, Ll/ۧ۟ܿ;->᩷:Ll/ܽ۟ܿ;

    iput-object p2, p0, Ll/ۧ۟ܿ;->᩻:Ll/ۜܰܿ;

    iput-object p3, p0, Ll/ۧ۟ܿ;->ܳ:Landroid/content/Context;

    iput-object p4, p0, Ll/ۧ۟ܿ;->ۜ:Ll/ܳܰܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۧ۟ܿ;Ll/ܳܰܿ;)V
    .locals 1

    .line 42
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v0, Ll/֫۟ܿ;

    invoke-direct {v0, p1}, Ll/֫۟ܿ;-><init>(Ll/ܳܰܿ;)V

    invoke-virtual {p0, v0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۧ۟ܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۧ۟ܿ;->ۜ()Z

    move-result p0

    return p0
.end method

.method private ۜ()Z
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۧ۟ܿ;->ۜ:Ll/ܳܰܿ;

    invoke-virtual {v0}, Ll/ܳܰܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Ll/ۧ۟ܿ;->᩻:Ll/ۜܰܿ;

    .line 50
    invoke-static {v0}, Ll/ᩳ۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 64
    invoke-direct {p0}, Ll/ۧ۟ܿ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۧ۟ܿ;->᩷:Ll/ܽ۟ܿ;

    invoke-static {v0}, Ll/ܽ۟ܿ;->ۧ(Ll/ܽ۟ܿ;)Ll/ۢܽܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۧ۟ܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-static {v0}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object v2

    invoke-static {v0}, Ll/ܽ۟ܿ;->ۧ(Ll/ܽ۟ܿ;)Ll/ۢܽܳ;

    move-result-object v3

    .line 65
    invoke-virtual {v1, v2, v3}, Ll/ۧܰܿ;->֫(Ll/ܰ᩺ܿ;Ll/ۢܽܳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 67
    invoke-static {v0, v1}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;Ll/ۢܽܳ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 4

    .line 73
    iget-object v0, p0, Ll/ۧ۟ܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    instance-of v2, p1, Ll/᩻ܽܳ;

    if-nez v2, :cond_6

    invoke-direct {p0}, Ll/ۧ۟ܿ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    instance-of v2, p1, Ll/᩹֫ܳ;

    iget-object v3, p0, Ll/ۧ۟ܿ;->᩷:Ll/ܽ۟ܿ;

    if-eqz v2, :cond_2

    .line 77
    invoke-static {v0}, Ll/ᩳ۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v3}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v3}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object p1

    .line 79
    invoke-virtual {v1, p1}, Ll/ۧܰܿ;->֫(Ll/ܰ᩺ܿ;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_1
    const p1, 0x7f120431

    .line 80
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 84
    :cond_2
    invoke-static {v3}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v3}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Ll/ۧܰܿ;->֫(Ll/ܰ᩺ܿ;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 86
    :cond_3
    invoke-static {v0}, Ll/ᩳ۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 89
    :cond_4
    instance-of v1, p1, Ljava/io/IOException;

    if-eqz v1, :cond_5

    .line 90
    check-cast p1, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    .line 92
    :cond_5
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to copy hex range"

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 39
    iget-object v0, p0, Ll/ۧ۟ܿ;->᩻:Ll/ۜܰܿ;

    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۘ()Ll/ܰ᩺ܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ۟ܿ;->᩷:Ll/ܽ۟ܿ;

    invoke-static {v1, v0}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;Ll/ܰ᩺ܿ;)V

    .line 40
    iget-object v0, p0, Ll/ۧ۟ܿ;->ܳ:Landroid/content/Context;

    instance-of v1, v0, Ll/ۗܺ᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۗܺ᩷;

    .line 41
    new-instance v1, Ll/ܰܰܿ;

    iget-object v2, p0, Ll/ۧ۟ܿ;->ۜ:Ll/ܳܰܿ;

    invoke-direct {v1, p0, v2}, Ll/ܰܰܿ;-><init>(Ll/ۧ۟ܿ;Ll/ܳܰܿ;)V

    const v2, 0x7f120200

    const/16 v3, 0xc8

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 55
    iget-object v0, p0, Ll/ۧ۟ܿ;->᩷:Ll/ܽ۟ܿ;

    invoke-static {v0}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 57
    iget-object v1, p0, Ll/ۧ۟ܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-static {v0}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;)Ll/ܰ᩺ܿ;

    move-result-object v2

    iget-object v3, p0, Ll/ۧ۟ܿ;->ܳ:Landroid/content/Context;

    .line 58
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    new-instance v4, Ll/۟ܰܿ;

    invoke-direct {v4, p0}, Ll/۟ܰܿ;-><init>(Ll/ۧ۟ܿ;)V

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    invoke-static {v2}, Ll/ܰ᩺ܿ;->ᩳ(Ll/ܰ᩺ܿ;)Ll/ۧܰܿ;

    move-result-object v5

    if-ne v5, v1, :cond_0

    .line 373
    invoke-virtual {v2}, Ll/ܰ᩺ܿ;->֫()V

    .line 375
    :try_start_0
    invoke-static {v2}, Ll/ܰ᩺ܿ;->᩻(Ll/ܰ᩺ܿ;)Ll/ܽܽܳ;

    move-result-object v1

    invoke-static {v2}, Ll/ܰ᩺ܿ;->ܳ(Ll/ܰ᩺ܿ;)I

    move-result v5

    .line 376
    invoke-virtual {v2}, Ll/ܰ᩺ܿ;->length()I

    move-result v6

    .line 375
    invoke-virtual {v1, v5, v6, v3, v4}, Ll/ܽܽܳ;->֫(IILjava/io/File;Ll/۟ܰܿ;)Ll/ۢܽܳ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    invoke-virtual {v2}, Ll/ܰ᩺ܿ;->ܽ()V

    .line 57
    invoke-static {v0, v1}, Ll/ܽ۟ܿ;->֫(Ll/ܽ۟ܿ;Ll/ۢܽܳ;)V

    return-void

    :catchall_0
    move-exception v0

    .line 379
    invoke-virtual {v2}, Ll/ܰ᩺ܿ;->ܽ()V

    .line 380
    throw v0

    .line 371
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Copy request belongs to another HexData"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۧ۟ܿ;->᩷:Ll/ܽ۟ܿ;

    invoke-virtual {v0}, Ll/ܽ۟ܿ;->֫()V

    .line 100
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 101
    iget-object v0, p0, Ll/ۧ۟ܿ;->ۜ:Ll/ܳܰܿ;

    invoke-virtual {v0}, Ll/ܳܰܿ;->close()V

    return-void
.end method
