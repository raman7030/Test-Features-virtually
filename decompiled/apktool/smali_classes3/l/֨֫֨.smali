.class public final Ll/֨֫֨;
.super Ll/ۢ֫֨;
.source "C5BI"


# instance fields
.field public ۜۧ:I


# direct methods
.method private ֫(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/String;
    .locals 4

    .line 212
    iget v0, p0, Ll/֨֫֨;->ۜۧ:I

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 213
    :goto_0
    iget-boolean v1, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v1, :cond_2

    .line 214
    iget-boolean v1, p0, Ll/ۢܽ֨;->ܺ֫:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 215
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p2, v0, v2

    const-string p2, "#%d"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :cond_1
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    aput-object p2, v1, v3

    const-string p2, "#%d /* %s */"

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :cond_2
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 220
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ۧ()V
    .locals 5

    .line 227
    invoke-virtual {p0}, Ll/ۨܽ֨;->֨()Ll/ۛܽ֨;

    move-result-object v0

    .line 228
    sget-object v1, Ll/ۛܽ֨;->᩶:Ll/ۛܽ֨;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۨܽ֨;->۠()Ljava/lang/String;

    move-result-object v1

    const-string v4, "%s }"

    .line 0
    invoke-static {v0, v1, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-virtual {p0}, Ll/֨֫֨;->᩹()Ljava/lang/String;

    move-result-object v1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    invoke-virtual {p0, v0, v3}, Ll/ۢܽ֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 230
    :cond_0
    sget-object v1, Ll/ۛܽ֨;->۬:Ll/ۛܽ֨;

    if-ne v0, v1, :cond_1

    .line 231
    invoke-virtual {p0}, Ll/֨֫֨;->᩹()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, " %s }"

    invoke-virtual {p0, v0, v1}, Ll/ۢܽ֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 233
    :cond_1
    invoke-virtual {p0}, Ll/֨֫֨;->᩹()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 4

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    sget-object v1, Ll/᩷֫֨;->֫:[I

    iget-object v2, p0, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    const-string v3, ""

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 204
    :pswitch_0
    invoke-virtual {v2}, Ll/۟۫ۚ;->֫()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll/֡֫֨;

    invoke-direct {v2, p0}, Ll/֡֫֨;-><init>(Ll/֨֫֨;)V

    invoke-direct {p0, v1, v2}, Ll/֨֫֨;->֫(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 201
    :pswitch_1
    invoke-virtual {v2}, Ll/۟۫ۚ;->֫()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll/᩵֫֨;

    invoke-direct {v2, p0}, Ll/᩵֫֨;-><init>(Ll/֨֫֨;)V

    invoke-direct {p0, v1, v2}, Ll/֨֫֨;->֫(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 198
    :pswitch_2
    new-instance v1, Ll/ᩴܿ֨;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ll/ᩴܿ֨;-><init>(Ll/ۨܽ֨;I)V

    invoke-direct {p0, v3, v1}, Ll/֨֫֨;->֫(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 195
    :pswitch_3
    invoke-virtual {v2}, Ll/۟۫ۚ;->֫()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll/ᩴ֫֨;

    invoke-direct {v2, p0}, Ll/ᩴ֫֨;-><init>(Ll/֨֫֨;)V

    invoke-direct {p0, v1, v2}, Ll/֨֫֨;->֫(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 192
    :pswitch_4
    new-instance v1, Ll/ۘ֫֨;

    invoke-direct {v1, p0}, Ll/ۘ֫֨;-><init>(Ll/֨֫֨;)V

    invoke-direct {p0, v3, v1}, Ll/֨֫֨;->֫(Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
