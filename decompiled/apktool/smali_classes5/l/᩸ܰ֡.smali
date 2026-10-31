.class public final Ll/᩸ܰ֡;
.super Ll/ۖ۬֡;
.source "04J6"


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩸ܰ֡;->᩸:Ll/۬ۛ֡;

    .line 51
    iput p2, p0, Ll/᩸ܰ֡;->᩹:I

    const/16 v0, 0x8

    .line 361
    invoke-virtual {p1, v0}, Ll/۬ۛ֡;->ᩳ(I)Ll/֨ܰ֡;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 362
    invoke-virtual {p1}, Ll/֨ܰ֡;->֫()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 365
    invoke-virtual {p1}, Ll/֨ܰ֡;->ۧ()I

    move-result p1

    mul-int/lit8 p2, p2, 0x8

    add-int/2addr p2, p1

    .line 52
    iput p2, p0, Ll/᩸ܰ֡;->᩶:I

    return-void

    .line 363
    :cond_0
    new-instance p1, Ll/ۙۛ֡;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x0

    const-string v1, "Method handle index out of bounds: %d"

    .line 46
    invoke-direct {p1, p2, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    throw p1
.end method


# virtual methods
.method public final ֫ۧ()I
    .locals 2

    .line 57
    iget-object v0, p0, Ll/᩸ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/᩸ܰ֡;->᩶:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method

.method public final ܿ()V
    .locals 4

    const-string v0, "methodhandle@"

    .line 83
    iget v1, p0, Ll/᩸ܰ֡;->᩹:I

    if-ltz v1, :cond_1

    iget-object v2, p0, Ll/᩸ܰ֡;->᩸:Ll/۬ۛ֡;

    const/16 v3, 0x8

    .line 401
    invoke-virtual {v2, v3}, Ll/۬ۛ֡;->ᩳ(I)Ll/֨ܰ֡;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 405
    :cond_0
    invoke-virtual {v2}, Ll/֨ܰ֡;->֫()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 88
    :try_start_0
    invoke-virtual {p0}, Ll/᩸ܰ֡;->᩻ۧ()Ll/۠ܽۚ;
    :try_end_0
    .catch Ll/ܶ᩵ۚ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 90
    new-instance v3, Ll/֨ܽۚ;

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-direct {v3, v0, v2}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 84
    :cond_1
    new-instance v2, Ll/֨ܽۚ;

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-direct {v2, v0}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ᩻ۧ()Ll/۠ܽۚ;
    .locals 4

    .line 63
    iget-object v0, p0, Ll/᩸ܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩸ܰ֡;->᩶:I

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    .line 64
    invoke-virtual {p0}, Ll/᩸ܰ֡;->֫ۧ()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 77
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-virtual {p0}, Ll/᩸ܰ֡;->֫ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x0

    const-string v3, "Invalid method handle type: %d"

    .line 46
    invoke-direct {v0, v1, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    throw v0

    .line 75
    :pswitch_0
    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ܳ(I)Ll/ۗܰ֡;

    move-result-object v0

    return-object v0

    .line 69
    :pswitch_1
    new-instance v2, Ll/ܶܰ֡;

    invoke-direct {v2, v0, v1}, Ll/ܶܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
