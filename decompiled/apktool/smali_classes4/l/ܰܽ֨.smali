.class public final synthetic Ll/ܰܽ֨;
.super Ljava/lang/Object;
.source "I7DX"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۨܽ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܽ֨;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ܰܽ֨;->᩸:I

    iput-object p1, p0, Ll/ܰܽ֨;->᩹:Ll/ۨܽ֨;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 12

    .line 2
    iget v0, p0, Ll/ܰܽ֨;->᩸:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 7
    iget-object v4, p0, Ll/ܰܽ֨;->᩹:Ll/ۨܽ֨;

    packed-switch v0, :pswitch_data_0

    .line 12
    check-cast v4, Ll/۬ܿ֨;

    .line 331
    iget v0, v4, Ll/۬ܿ֨;->֡ۧ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v4, v4, Ll/۬ܿ֨;->ۖۧ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    aput-object v4, v3, v1

    const-string v0, " chop_frame=%d offset=%d"

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    check-cast v4, Ll/ܿᩳ֨;

    .line 127
    iget v0, v4, Ll/ۨܽ֨;->ۙ֫:I

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 129
    iget v5, v4, Ll/ۨܽ֨;->ۙ֫:I

    sget-object v6, Ll/᩶۬ۚ;->ۛ:Ll/᩶۬ۚ;

    invoke-static {v5, v6}, Ll/ۛ۬ۚ;->ۧ(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "<none>"

    goto :goto_0

    .line 130
    :cond_0
    iget v5, v4, Ll/ۨܽ֨;->ۙ֫:I

    invoke-static {v5, v6}, Ll/ۛ۬ۚ;->ۧ(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    :goto_0
    iget v6, v4, Ll/ܿᩳ֨;->ۖۧ:I

    .line 131
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, v4, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v7, Ll/᩷ۧ֨;

    iget-object v7, v7, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v8, v4, Ll/ܿᩳ֨;->ۖۧ:I

    new-instance v9, Ll/ۖۘܽ;

    const/16 v10, 0x8

    invoke-direct {v9, v10}, Ll/ۖۘܽ;-><init>(I)V

    invoke-virtual {v7, v8, v9}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v7

    iget v8, v4, Ll/ܿᩳ֨;->᩷ۧ:I

    .line 132
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v4, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v9, Ll/᩷ۧ֨;

    iget-object v9, v9, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v4, v4, Ll/ܿᩳ֨;->᩷ۧ:I

    new-instance v11, Ll/ۖۘܽ;

    invoke-direct {v11, v10}, Ll/ۖۘܽ;-><init>(I)V

    invoke-virtual {v9, v4, v11}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x6

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v0, v9, v2

    aput-object v5, v9, v1

    aput-object v6, v9, v3

    const/4 v0, 0x3

    aput-object v7, v9, v0

    const/4 v0, 0x4

    aput-object v8, v9, v0

    const/4 v0, 0x5

    aput-object v4, v9, v0

    const-string v0, "MethodData: {modifiers[%d]}:%s name[%d]=%s signature[%d]=%s"

    .line 19
    invoke-static {v0, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
