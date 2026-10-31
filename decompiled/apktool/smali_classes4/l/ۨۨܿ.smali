.class public final Ll/ۨۨܿ;
.super Ll/۟ܶۡ;
.source "964V"


# instance fields
.field public final synthetic ۖ:I

.field public ۘ:Ll/ܽܽܳ;

.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public final synthetic ۡ:Ll/ܳܰܿ;

.field public final synthetic ۢ:Ll/ۜܰܿ;

.field public ܳ:Ll/ۢܽܳ;

.field public final synthetic ܺ:Ll/ᩳ᩺ܿ;

.field public final synthetic ᩷:Landroid/content/Context;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;Ll/ܳܰܿ;Ll/ۜܰܿ;ILandroid/content/Context;)V
    .locals 0

    .line 71
    iput-object p1, p0, Ll/ۨۨܿ;->ܺ:Ll/ᩳ᩺ܿ;

    iput-object p2, p0, Ll/ۨۨܿ;->ۜ:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۨۨܿ;->ۡ:Ll/ܳܰܿ;

    iput-object p4, p0, Ll/ۨۨܿ;->ۢ:Ll/ۜܰܿ;

    iput p5, p0, Ll/ۨۨܿ;->ۖ:I

    iput-object p6, p0, Ll/ۨۨܿ;->᩷:Landroid/content/Context;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨۨܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۨۨܿ;->ۜ()Z

    move-result p0

    return p0
.end method

.method private ۜ()Z
    .locals 2

    .line 89
    iget-object v0, p0, Ll/ۨۨܿ;->ۡ:Ll/ܳܰܿ;

    invoke-virtual {v0}, Ll/ܳܰܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll/ۨۨܿ;->ۜ:Ll/ۗܺ᩷;

    if-eqz v0, :cond_1

    .line 91
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, Ll/ۨۨܿ;->ܺ:Ll/ᩳ᩺ܿ;

    iget-object v1, p0, Ll/ۨۨܿ;->ۢ:Ll/ۜܰܿ;

    .line 92
    invoke-virtual {v0, v1}, Ll/ᩳ᩺ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static ۧ(Ll/ۨۨܿ;)V
    .locals 1

    .line 82
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 111
    invoke-direct {p0}, Ll/ۨۨܿ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۨۨܿ;->ܺ:Ll/ᩳ᩺ܿ;

    iget-object v1, p0, Ll/ۨۨܿ;->ۜ:Ll/ۗܺ᩷;

    iget-object v2, p0, Ll/ۨۨܿ;->ۢ:Ll/ۜܰܿ;

    invoke-static {v2, v0, v1}, Ll/ۢ᩺ܿ;->֫(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, p0, Ll/ۨۨܿ;->᩷:Landroid/content/Context;

    const-string v1, "clipboard"

    .line 115
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 117
    iget-object v1, p0, Ll/ۨۨܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f120a61

    .line 118
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 5

    .line 123
    invoke-direct {p0}, Ll/ۨۨܿ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_3

    instance-of v0, p1, Ll/ܽ᩺ܿ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 126
    :cond_0
    instance-of v0, p1, Ll/ܿ᩺ܿ;

    const v1, 0x7f1201ff

    iget-object v2, p0, Ll/ۨۨܿ;->ۜ:Ll/ۗܺ᩷;

    iget-object v3, p0, Ll/ۨۨܿ;->ܺ:Ll/ᩳ᩺ܿ;

    iget-object v4, p0, Ll/ۨۨܿ;->ۢ:Ll/ۜܰܿ;

    if-eqz v0, :cond_1

    .line 127
    invoke-static {v4, v3, v2}, Ll/ۢ᩺ܿ;->֫(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 128
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 130
    :cond_1
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_2

    .line 131
    invoke-static {v4, v3, v2}, Ll/ۢ᩺ܿ;->֫(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    check-cast p1, Ljava/io/IOException;

    invoke-virtual {v4, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    .line 135
    :cond_2
    invoke-static {v4, v3, v2}, Ll/ۢ᩺ܿ;->֫(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;Ll/ۗܺ᩷;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 136
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_3
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 79
    iget-object v0, p0, Ll/ۨۨܿ;->ܺ:Ll/ᩳ᩺ܿ;

    iget-object v0, v0, Ll/ᩳ᩺ܿ;->ۧ:Ll/ᩳܽܳ;

    invoke-virtual {v0}, Ll/ᩳܽܳ;->᩹()Ll/ܽܽܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۨܿ;->ۘ:Ll/ܽܽܳ;

    .line 80
    iget-object v0, p0, Ll/ۨۨܿ;->ۜ:Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    .line 81
    new-instance v1, Ll/ۛۨܿ;

    invoke-direct {v1, p0}, Ll/ۛۨܿ;-><init>(Ll/ۨۨܿ;)V

    const v2, 0x7f120200

    const/16 v3, 0xc8

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 98
    iget v0, p0, Ll/ۨۨܿ;->ۖ:I

    iget-object v1, p0, Ll/ۨۨܿ;->ܺ:Ll/ᩳ᩺ܿ;

    :try_start_0
    iget-object v2, p0, Ll/ۨۨܿ;->ۘ:Ll/ܽܽܳ;

    iget v3, v1, Ll/ᩳ᩺ܿ;->ܳ:I

    iget v4, v1, Ll/ᩳ᩺ܿ;->ܿ:I

    new-instance v5, Ll/ۤۨܿ;

    invoke-direct {v5, p0}, Ll/ۤۨܿ;-><init>(Ll/ۨۨܿ;)V

    invoke-virtual {v2, v3, v4, v5}, Ll/ܽܽܳ;->֫(IILl/ۤۨܿ;)Ll/ۢܽܳ;

    move-result-object v2

    iput-object v2, p0, Ll/ۨۨܿ;->ܳ:Ll/ۢܽܳ;

    .line 100
    iget v1, v1, Ll/ᩳ᩺ܿ;->֫:I

    new-instance v3, Ll/ۤۨܿ;

    invoke-direct {v3, p0}, Ll/ۤۨܿ;-><init>(Ll/ۨۨܿ;)V

    invoke-static {v2, v1, v0, v3}, Ll/ۢ᩺ܿ;->֫(Ll/ۢܽܳ;IILl/ۤۨܿ;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۨۨܿ;->᩻:Ljava/lang/String;

    .line 101
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/high16 v2, 0x80000

    if-le v1, v2, :cond_1

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Ll/ܿ᩺ܿ;

    .line 505
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 102
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۨۨܿ;->ۘ:Ll/ܽܽܳ;

    if-eqz v0, :cond_2

    .line 161
    invoke-virtual {v0}, Ll/ܽܽܳ;->close()V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 105
    iget-object v1, p0, Ll/ۨۨܿ;->ۘ:Ll/ܽܽܳ;

    if-eqz v1, :cond_3

    .line 161
    invoke-virtual {v1}, Ll/ܽܽܳ;->close()V

    .line 106
    :cond_3
    throw v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۨۨܿ;->ۘ:Ll/ܽܽܳ;

    if-eqz v0, :cond_0

    .line 161
    invoke-virtual {v0}, Ll/ܽܽܳ;->close()V

    .line 144
    :cond_0
    iget-object v0, p0, Ll/ۨۨܿ;->ܳ:Ll/ۢܽܳ;

    if-eqz v0, :cond_1

    .line 146
    :try_start_0
    invoke-virtual {v0}, Ll/ۢܽܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    :catch_0
    :cond_1
    iget-object v0, p0, Ll/ۨۨܿ;->ۡ:Ll/ܳܰܿ;

    invoke-virtual {v0}, Ll/ܳܰܿ;->close()V

    .line 153
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
