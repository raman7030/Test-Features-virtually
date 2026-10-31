.class public final Ll/ۧ֫ܳ;
.super Ll/۟ܶۡ;
.source "J57U"


# instance fields
.field public final synthetic ۖ:J

.field public ۘ:Ll/ܽܽܳ;

.field public final synthetic ۜ:Ll/᩵֫ܳ;

.field public final synthetic ۡ:Ll/ᩳܽܳ;

.field public final synthetic ۢ:[B

.field public ܳ:I

.field public final synthetic ܺ:Ll/ۜܰܿ;

.field public final synthetic ᩷:Ll/ᩴ֫ܳ;

.field public ᩻:Ll/ܺܽܳ;


# direct methods
.method public constructor <init>(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;Ll/ᩳܽܳ;[BJLl/ۜܰܿ;)V
    .locals 0

    .line 207
    iput-object p1, p0, Ll/ۧ֫ܳ;->ۜ:Ll/᩵֫ܳ;

    iput-object p2, p0, Ll/ۧ֫ܳ;->᩷:Ll/ᩴ֫ܳ;

    iput-object p3, p0, Ll/ۧ֫ܳ;->ۡ:Ll/ᩳܽܳ;

    iput-object p4, p0, Ll/ۧ֫ܳ;->ۢ:[B

    iput-wide p5, p0, Ll/ۧ֫ܳ;->ۖ:J

    iput-object p7, p0, Ll/ۧ֫ܳ;->ܺ:Ll/ۜܰܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۧ֫ܳ;)V
    .locals 1

    .line 217
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۧ(Ll/ۧ֫ܳ;)Z
    .locals 1

    .line 222
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    .line 223
    iget-object p0, p0, Ll/ۧ֫ܳ;->᩷:Ll/ᩴ֫ܳ;

    invoke-virtual {p0}, Ll/ᩴ֫ܳ;->᩻()Z

    move-result p0

    if-nez p0, :cond_1

    if-eqz v0, :cond_0

    .line 224
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 9

    .line 239
    iget-object v0, p0, Ll/ۧ֫ܳ;->ۡ:Ll/ᩳܽܳ;

    iget-object v1, p0, Ll/ۧ֫ܳ;->᩻:Ll/ܺܽܳ;

    iget-object v2, p0, Ll/ۧ֫ܳ;->ۜ:Ll/᩵֫ܳ;

    invoke-static {v2, v0, v1}, Ll/᩵֫ܳ;->֫(Ll/᩵֫ܳ;Ll/ᩳܽܳ;Ll/ܺܽܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 222
    :cond_0
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    .line 223
    iget-object v1, p0, Ll/ۧ֫ܳ;->᩷:Ll/ᩴ֫ܳ;

    invoke-virtual {v1}, Ll/ᩴ֫ܳ;->᩻()Z

    move-result v1

    if-nez v1, :cond_4

    if-eqz v0, :cond_1

    .line 224
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 245
    :cond_1
    iget v0, p0, Ll/ۧ֫ܳ;->ܳ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const v0, 0x7f120228

    .line 246
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 248
    :cond_2
    iget-object v1, p0, Ll/ۧ֫ܳ;->ۢ:[B

    array-length v1, v1

    iget-object v3, p0, Ll/ۧ֫ܳ;->᩻:Ll/ܺܽܳ;

    invoke-virtual {v3}, Ll/ܺܽܳ;->length()I

    move-result v3

    int-to-long v4, v0

    int-to-long v6, v1

    add-long/2addr v4, v6

    if-ltz v0, :cond_3

    if-lez v1, :cond_3

    int-to-long v0, v3

    cmp-long v3, v4, v0

    if-gtz v3, :cond_3

    long-to-int v0, v4

    add-int/lit8 v0, v0, -0x1

    .line 249
    new-instance v1, Ll/᩷֫ܳ;

    iget-object v3, p0, Ll/ۧ֫ܳ;->᩻:Ll/ܺܽܳ;

    invoke-virtual {v3}, Ll/ܺܽܳ;->֫()J

    move-result-wide v5

    iget v7, p0, Ll/ۧ֫ܳ;->ܳ:I

    iget-object v4, p0, Ll/ۧ֫ܳ;->ۡ:Ll/ᩳܽܳ;

    move-object v3, v1

    move v8, v0

    invoke-direct/range {v3 .. v8}, Ll/᩷֫ܳ;-><init>(Ll/ᩳܽܳ;JII)V

    invoke-static {v2, v1}, Ll/᩵֫ܳ;->֫(Ll/᩵֫ܳ;Ll/᩷֫ܳ;)V

    .line 250
    iget-object v1, p0, Ll/ۧ֫ܳ;->ܺ:Ll/ۜܰܿ;

    iget v2, p0, Ll/ۧ֫ܳ;->ܳ:I

    invoke-virtual {v1, v2, v0}, Ll/ۜܰܿ;->֫(II)V

    return-void

    .line 816
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Search result exceeds snapshot length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 256
    instance-of v0, p1, Ll/᩻ܽܳ;

    if-nez v0, :cond_0

    .line 257
    iget-object v0, p0, Ll/ۧ֫ܳ;->ܺ:Ll/ۜܰܿ;

    iget-object v1, p0, Ll/ۧ֫ܳ;->ۡ:Ll/ᩳܽܳ;

    iget-object v2, p0, Ll/ۧ֫ܳ;->ۜ:Ll/᩵֫ܳ;

    invoke-static {v2, v0, v1, p1}, Ll/᩵֫ܳ;->֫(Ll/᩵֫ܳ;Ll/ۜܰܿ;Ll/ᩳܽܳ;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 214
    iget-object v0, p0, Ll/ۧ֫ܳ;->᩷:Ll/ᩴ֫ܳ;

    iget-object v1, p0, Ll/ۧ֫ܳ;->ۜ:Ll/᩵֫ܳ;

    invoke-static {v1, v0}, Ll/᩵֫ܳ;->֫(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;)V

    .line 215
    iget-object v0, p0, Ll/ۧ֫ܳ;->ۡ:Ll/ᩳܽܳ;

    invoke-virtual {v0}, Ll/ᩳܽܳ;->᩹()Ll/ܽܽܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ֫ܳ;->ۘ:Ll/ܽܽܳ;

    .line 216
    invoke-static {v1}, Ll/᩵֫ܳ;->֫(Ll/᩵֫ܳ;)Ll/ۚܰܿ;

    move-result-object v0

    new-instance v1, Ll/۟۟ܿ;

    invoke-direct {v1, p0}, Ll/۟۟ܿ;-><init>(Ll/ۧ֫ܳ;)V

    const v2, 0x7f12090c

    const/16 v3, 0xc8

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 230
    :try_start_0
    iget-object v0, p0, Ll/ۧ֫ܳ;->ۘ:Ll/ܽܽܳ;

    new-instance v1, Ll/֫֫ܳ;

    invoke-direct {v1, p0}, Ll/֫֫ܳ;-><init>(Ll/ۧ֫ܳ;)V

    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->֫(Ll/ܿۖ᩷;)Ll/ܺܽܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ֫ܳ;->᩻:Ll/ܺܽܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    iget-object v0, p0, Ll/ۧ֫ܳ;->ۘ:Ll/ܽܽܳ;

    invoke-static {v0}, Ll/᩵֫ܳ;->֫(Ll/ܽܽܳ;)V

    .line 234
    iget-object v0, p0, Ll/ۧ֫ܳ;->᩻:Ll/ܺܽܳ;

    new-instance v1, Ll/֫֫ܳ;

    invoke-direct {v1, p0}, Ll/֫֫ܳ;-><init>(Ll/ۧ֫ܳ;)V

    .line 796
    iget-object v2, p0, Ll/ۧ֫ܳ;->ۢ:[B

    if-eqz v2, :cond_2

    array-length v3, v2

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    .line 799
    iget-wide v4, p0, Ll/ۧ֫ܳ;->ۖ:J

    invoke-static {v4, v5, v3}, Ll/᩵֫ܳ;->֫(JZ)I

    move-result v3

    int-to-long v3, v3

    .line 800
    array-length v5, v2

    int-to-long v5, v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    const-wide/16 v5, 0x0

    const/4 v7, -0x1

    cmp-long v8, v3, v5

    if-gez v8, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 801
    invoke-static {v3, v4, v5}, Ll/᩵֫ܳ;->֫(JZ)I

    move-result v3

    .line 802
    :goto_0
    invoke-static {v1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object v1

    .line 803
    invoke-virtual {v0, v2, v3, v1}, Ll/ܺܽܳ;->ۧ([BILl/ܿۖ᩷;)I

    move-result v3

    if-ne v3, v7, :cond_1

    .line 804
    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-nez v4, :cond_1

    .line 88
    invoke-virtual {v0}, Ll/ܺܽܳ;->length()I

    move-result v3

    invoke-virtual {v0, v2, v3, v1}, Ll/ܺܽܳ;->ۧ([BILl/ܿۖ᩷;)I

    move-result v3

    .line 234
    :cond_1
    iput v3, p0, Ll/ۧ֫ܳ;->ܳ:I

    return-void

    .line 797
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Search pattern must not be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 232
    iget-object v1, p0, Ll/ۧ֫ܳ;->ۘ:Ll/ܽܽܳ;

    invoke-static {v1}, Ll/᩵֫ܳ;->֫(Ll/ܽܽܳ;)V

    .line 233
    throw v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 263
    iget-object v0, p0, Ll/ۧ֫ܳ;->ۘ:Ll/ܽܽܳ;

    invoke-static {v0}, Ll/᩵֫ܳ;->֫(Ll/ܽܽܳ;)V

    .line 264
    iget-object v0, p0, Ll/ۧ֫ܳ;->᩻:Ll/ܺܽܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 773
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/ܺܽܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    :catch_0
    :goto_0
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 266
    iget-object v0, p0, Ll/ۧ֫ܳ;->᩷:Ll/ᩴ֫ܳ;

    iget-object v1, p0, Ll/ۧ֫ܳ;->ۜ:Ll/᩵֫ܳ;

    invoke-static {v1, v0}, Ll/᩵֫ܳ;->ۧ(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;)V

    return-void
.end method
