.class public final Ll/ܽܶ᩷;
.super Ll/۟ܶۡ;
.source "09LR"


# instance fields
.field public final synthetic ۜ:Ll/ܺܶ᩷;

.field public ܳ:Z

.field public ᩷:Ll/ܶ᩵ܿ;

.field public ᩻:Ll/ۢ֫᩷;


# direct methods
.method public constructor <init>(Ll/ܺܶ᩷;)V
    .locals 0

    .line 182
    iput-object p1, p0, Ll/ܽܶ᩷;->ۜ:Ll/ܺܶ᩷;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x0

    .line 185
    iput-boolean p1, p0, Ll/ܽܶ᩷;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 211
    iget-boolean v0, p0, Ll/ܽܶ᩷;->ܳ:Z

    iget-object v1, p0, Ll/ܽܶ᩷;->ۜ:Ll/ܺܶ᩷;

    if-nez v0, :cond_0

    .line 212
    invoke-static {v1}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object v0

    iget-object v2, p0, Ll/ܽܶ᩷;->᩻:Ll/ۢ֫᩷;

    invoke-virtual {v0, v2}, Ll/ܰ۟ۜ;->֫(Ll/ۢ֫᩷;)V

    .line 213
    iget-object v0, p0, Ll/ܽܶ᩷;->᩻:Ll/ۢ֫᩷;

    invoke-static {v1, v0}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;Ll/ۢ֫᩷;)V

    .line 214
    iget-object v0, p0, Ll/ܽܶ᩷;->᩷:Ll/ܶ᩵ܿ;

    invoke-static {v1, v0}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;Ll/ܶ᩵ܿ;)V

    return-void

    .line 217
    :cond_0
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120491

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f120204

    .line 218
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/ܿ᩹᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ܿ᩹᩷;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f12070a

    .line 219
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۧܶ᩷;

    invoke-direct {v1, p0}, Ll/ۧܶ᩷;-><init>(Ll/ܽܶ᩷;)V

    const v2, 0x7f12015e

    .line 234
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v1, 0x0

    .line 235
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Z)V

    .line 236
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 242
    iget-object v0, p0, Ll/ܽܶ᩷;->ۜ:Ll/ܺܶ᩷;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 189
    iget-object v0, p0, Ll/ܽܶ᩷;->ۜ:Ll/ܺܶ᩷;

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 194
    iget-object v0, p0, Ll/ܽܶ᩷;->ۜ:Ll/ܺܶ᩷;

    invoke-static {v0}, Ll/ܺܶ᩷;->ܽ(Ll/ܺܶ᩷;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    const-wide/32 v4, 0x1400000

    cmp-long v6, v2, v4

    if-gtz v6, :cond_3

    .line 17
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v1

    const/4 v2, 0x0

    .line 19
    :try_start_0
    new-instance v3, Ll/ۢ֫᩷;

    invoke-direct {v3, v1}, Ll/ۢ֫᩷;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 22
    array-length v4, v1

    invoke-static {v1, v2, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 26
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 27
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x64

    invoke-virtual {v1, v4, v5, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 28
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 29
    new-instance v3, Ll/ۢ֫᩷;

    invoke-direct {v3, v1}, Ll/ۢ֫᩷;-><init>([B)V

    .line 194
    :goto_0
    iput-object v3, p0, Ll/ܽܶ᩷;->᩻:Ll/ۢ֫᩷;

    .line 195
    invoke-virtual {v3}, Ll/ۢ֫᩷;->ܳ()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 197
    invoke-static {v0, v3}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;Z)V

    goto :goto_1

    .line 198
    :cond_0
    invoke-static {v0}, Ll/ܺܶ᩷;->ᩳ(Ll/ܺܶ᩷;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v4, ".9.png"

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܽܶ᩷;->᩻:Ll/ۢ֫᩷;

    invoke-virtual {v1}, Ll/ۢ֫᩷;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 200
    invoke-static {v0, v2}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;Z)V

    goto :goto_1

    .line 202
    :cond_1
    invoke-static {v0, v2}, Ll/ܺܶ᩷;->֫(Ll/ܺܶ᩷;Z)V

    .line 203
    iput-boolean v3, p0, Ll/ܽܶ᩷;->ܳ:Z

    .line 205
    :goto_1
    sget-object v0, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܶ᩷;->᩷:Ll/ܶ᩵ܿ;

    .line 206
    iget-object v1, p0, Ll/ܽܶ᩷;->᩻:Ll/ۢ֫᩷;

    invoke-virtual {v1}, Ll/ۢ֫᩷;->ۧ()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫([B)V

    return-void

    .line 24
    :cond_2
    throw v3

    .line 15
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "File too large"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()V
    .locals 0

    .line 247
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
