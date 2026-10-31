.class public final Ll/᩸۟ܿ;
.super Ll/۟ܶۡ;
.source "X4M8"


# instance fields
.field public final synthetic ۜ:Ll/ۜܰܿ;

.field public final synthetic ۡ:Ljava/lang/CharSequence;

.field public final synthetic ۢ:Ll/۫۟ܿ;

.field public final synthetic ܳ:Ll/᩹۟ܿ;

.field public final synthetic ܺ:I

.field public final synthetic ᩷:Ll/۬۟ܿ;

.field public final synthetic ᩻:Ll/ܽܰܿ;


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;Ll/᩹۟ܿ;Ll/۬۟ܿ;Ll/ܽܰܿ;Ll/۫۟ܿ;Ljava/lang/CharSequence;I)V
    .locals 0

    .line 76
    iput-object p1, p0, Ll/᩸۟ܿ;->ۜ:Ll/ۜܰܿ;

    iput-object p2, p0, Ll/᩸۟ܿ;->ܳ:Ll/᩹۟ܿ;

    iput-object p3, p0, Ll/᩸۟ܿ;->᩷:Ll/۬۟ܿ;

    iput-object p4, p0, Ll/᩸۟ܿ;->᩻:Ll/ܽܰܿ;

    iput-object p5, p0, Ll/᩸۟ܿ;->ۢ:Ll/۫۟ܿ;

    iput-object p6, p0, Ll/᩸۟ܿ;->ۡ:Ljava/lang/CharSequence;

    iput p7, p0, Ll/᩸۟ܿ;->ܺ:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸۟ܿ;Ll/᩹۟ܿ;)V
    .locals 1

    .line 82
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v0, Ll/֡۟ܿ;

    invoke-direct {v0, p1}, Ll/֡۟ܿ;-><init>(Ll/᩹۟ܿ;)V

    invoke-virtual {p0, v0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸۟ܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸۟ܿ;->ۜ()Z

    move-result p0

    return p0
.end method

.method private ۜ()Z
    .locals 2

    .line 88
    iget-object v0, p0, Ll/᩸۟ܿ;->ܳ:Ll/᩹۟ܿ;

    invoke-virtual {v0}, Ll/᩹۟ܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Ll/᩸۟ܿ;->᩷:Ll/۬۟ܿ;

    iget-object v1, p0, Ll/᩸۟ܿ;->ۜ:Ll/ۜܰܿ;

    .line 90
    invoke-virtual {v0, v1}, Ll/۬۟ܿ;->֫(Ll/ۜܰܿ;)Z

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
    .locals 1

    .line 110
    iget-object v0, p0, Ll/᩸۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-virtual {v0}, Ll/ܽܰܿ;->ܳ()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 115
    instance-of v0, p1, Ll/᩻ܽܳ;

    if-nez v0, :cond_4

    .line 290
    iget-object v0, p0, Ll/᩸۟ܿ;->ۜ:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v1

    .line 252
    iget-object v2, p0, Ll/᩸۟ܿ;->᩷:Ll/۬۟ܿ;

    iget-object v2, v2, Ll/۬۟ܿ;->֫:Ll/ᩳܽܳ;

    if-ne v1, v2, :cond_4

    .line 197
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 199
    instance-of v2, v1, Ll/ۗܺ᩷;

    if-eqz v2, :cond_1

    .line 198
    check-cast v1, Ll/ۗܺ᩷;

    .line 199
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 120
    :cond_1
    :goto_0
    instance-of v1, p1, Ll/۟֫ܳ;

    if-eqz v1, :cond_2

    const p1, 0x7f12030d

    .line 121
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 122
    :cond_2
    instance-of v1, p1, Ljava/io/IOException;

    if-eqz v1, :cond_3

    .line 123
    check-cast p1, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    .line 125
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to paste external hex text"

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    :cond_4
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 79
    iget-object v0, p0, Ll/᩸۟ܿ;->ۜ:Ll/ۜܰܿ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 80
    instance-of v1, v0, Ll/ۗܺ᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۗܺ᩷;

    .line 81
    new-instance v1, Ll/ܶ۟ܿ;

    iget-object v2, p0, Ll/᩸۟ܿ;->ܳ:Ll/᩹۟ܿ;

    invoke-direct {v1, p0, v2}, Ll/ܶ۟ܿ;-><init>(Ll/᩸۟ܿ;Ll/᩹۟ܿ;)V

    const v2, 0x7f1207a7

    const/16 v3, 0xc8

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 95
    iget-object v0, p0, Ll/᩸۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-virtual {v0}, Ll/ܽܰܿ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 99
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/᩸۟ܿ;->ۜ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 100
    iget-object v1, p0, Ll/᩸۟ܿ;->ۢ:Ll/۫۟ܿ;

    iget-object v2, p0, Ll/᩸۟ܿ;->ۜ:Ll/ۜܰܿ;

    iget-object v3, p0, Ll/᩸۟ܿ;->᩷:Ll/۬۟ܿ;

    iget-object v4, p0, Ll/᩸۟ܿ;->ۡ:Ljava/lang/CharSequence;

    iget v5, p0, Ll/᩸۟ܿ;->ܺ:I

    new-instance v6, Ll/۠۟ܿ;

    invoke-direct {v6, p0}, Ll/۠۟ܿ;-><init>(Ll/᩸۟ܿ;)V

    invoke-static {v2, v3, v4, v5, v6}, Ll/ۛ۟ܿ;->֫(Ll/ۜܰܿ;Ll/۬۟ܿ;Ljava/lang/CharSequence;ILl/۠۟ܿ;)Ll/ۗ۟ܿ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/۫۟ܿ;->֫(Ll/۫۟ܿ;Ll/ۗ۟ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    :cond_1
    invoke-virtual {v0}, Ll/ܽܰܿ;->ᩳ()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ܽܰܿ;->ᩳ()V

    .line 105
    throw v1
.end method

.method public final ᩳ()V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩸۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-virtual {v0}, Ll/ܽܰܿ;->ᩳ()V

    .line 133
    invoke-virtual {v0}, Ll/ܽܰܿ;->ܳ()V

    .line 134
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 135
    invoke-virtual {v0}, Ll/ܽܰܿ;->close()V

    return-void
.end method
