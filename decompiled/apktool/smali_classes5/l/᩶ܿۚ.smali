.class public final Ll/᩶ܿۚ;
.super Ljava/lang/Object;
.source "N98Q"

# interfaces
.implements Ll/ܽܶܺ;


# instance fields
.field public final synthetic ᩸:Ll/ۙܿۚ;


# direct methods
.method public constructor <init>(Ll/ۙܿۚ;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܿۚ;->᩸:Ll/ۙܿۚ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 104
    check-cast p1, Ll/ۤܽۚ;

    .line 108
    iget-object v0, p0, Ll/᩶ܿۚ;->᩸:Ll/ۙܿۚ;

    iget-object v0, v0, Ll/ۙܿۚ;->᩹:Ll/ۗܿۚ;

    iget-object v0, v0, Ll/ۗܿۚ;->֫:Ll/ܽܳۚ;

    .line 235
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    const/16 v2, 0x10

    if-eq v1, v2, :cond_0

    const/16 v2, 0x11

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    .line 293
    new-instance v0, Ll/ܶ᩵ۚ;

    .line 294
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Unsupported encoded value type: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    throw v0

    .line 284
    :pswitch_0
    new-instance v1, Ll/ۢ᩻ۚ;

    invoke-direct {v1, v0, p1}, Ll/ۢ᩻ۚ;-><init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V

    return-object v1

    .line 275
    :pswitch_1
    new-instance v1, Ll/᩷᩻ۚ;

    invoke-direct {v1, v0, p1}, Ll/᩷᩻ۚ;-><init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V

    return-object v1

    .line 266
    :pswitch_2
    new-instance v1, Ll/ۜ᩻ۚ;

    invoke-direct {v1, v0, p1}, Ll/ۜ᩻ۚ;-><init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V

    return-object v1

    .line 255
    :pswitch_3
    new-instance v1, Ll/ܶ᩻ۚ;

    invoke-direct {v1, v0, p1}, Ll/ܶ᩻ۚ;-><init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V

    return-object v1

    .line 244
    :pswitch_4
    new-instance v1, Ll/۠᩻ۚ;

    invoke-direct {v1, v0, p1}, Ll/۠᩻ۚ;-><init>(Ll/ܽܳۚ;Ll/ۤܽۚ;)V

    return-object v1

    :cond_0
    :pswitch_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
