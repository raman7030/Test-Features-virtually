.class public final Ll/ۙᩳۚ;
.super Ll/ۖ۬֡;
.source "M62C"

# interfaces
.implements Ll/۫ᩳۚ;


# instance fields
.field public final ᩸:Ll/۫ᩳۚ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(ILl/۫ᩳۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput p1, p0, Ll/ۙᩳۚ;->᩹:I

    .line 51
    iput-object p2, p0, Ll/ۙᩳۚ;->᩸:Ll/۫ᩳۚ;

    return-void
.end method

.method public static ۧ(Ll/᩵ܽۚ;)Ll/ۙᩳۚ;
    .locals 3

    .line 61
    instance-of v0, p0, Ll/ۙᩳۚ;

    if-eqz v0, :cond_0

    .line 62
    check-cast p0, Ll/ۙᩳۚ;

    return-object p0

    .line 64
    :cond_0
    invoke-interface {p0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 84
    new-instance p0, Ll/ܶ᩵ۚ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x0

    const-string v2, "Invalid method handle type: %d"

    .line 46
    invoke-direct {p0, v0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    throw p0

    .line 81
    :pswitch_0
    invoke-interface {p0}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p0

    check-cast p0, Ll/ۚܽۚ;

    .line 80
    invoke-static {p0}, Ll/۬ᩳۚ;->ۧ(Ll/ۚܽۚ;)Ll/۬ᩳۚ;

    move-result-object p0

    goto :goto_0

    .line 73
    :pswitch_1
    invoke-interface {p0}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p0

    check-cast p0, Ll/ᩴܽۚ;

    .line 72
    invoke-static {p0}, Ll/᩶ᩳۚ;->ۧ(Ll/ᩴܽۚ;)Ll/᩶ᩳۚ;

    move-result-object p0

    .line 86
    :goto_0
    new-instance v1, Ll/ۙᩳۚ;

    invoke-direct {v1, v0, p0}, Ll/ۙᩳۚ;-><init>(ILl/۫ᩳۚ;)V

    return-object v1

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


# virtual methods
.method public final ֫ۧ()I
    .locals 1

    .line 91
    iget v0, p0, Ll/ۙᩳۚ;->᩹:I

    return v0
.end method

.method public final ᩻ۧ()Ll/۠ܽۚ;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۙᩳۚ;->᩸:Ll/۫ᩳۚ;

    return-object v0
.end method
