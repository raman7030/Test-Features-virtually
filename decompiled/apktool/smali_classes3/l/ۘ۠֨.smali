.class public final synthetic Ll/ۘ۠֨;
.super Ljava/lang/Object;
.source "X43L"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘ۠֨;->᩸:I

    iput-object p2, p0, Ll/ۘ۠֨;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۘ۠֨;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 2
    iget v0, p0, Ll/ۘ۠֨;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۘ۠֨;->᩶:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/ۘ۠֨;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 11
    check-cast v2, Ll/᩶ۘ֨;

    .line 13
    check-cast v1, Ll/ܳ֡֨;

    .line 391
    iget-object v0, v2, Ll/᩶ۘ֨;->᩷:Ll/ۛ۠۠;

    iget-object v1, v1, Ll/ܳ֡֨;->᩺:Ll/ۤܶ۠;

    sget-object v2, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6637
    new-instance v2, Ll/ۨ۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "compiler"

    const-string v4, "class.file.not.found"

    invoke-direct {v2, v1, v4, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-virtual {v0, v2}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    check-cast v2, Ll/ۛ᩸֨;

    check-cast v1, Ll/ۜۛ֨;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3736
    new-instance v0, Ll/ۚܶ֨;

    invoke-direct {v0, v2, v1}, Ll/ۚܶ֨;-><init>(Ll/ۛ᩸֨;Ll/ۜۛ֨;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
