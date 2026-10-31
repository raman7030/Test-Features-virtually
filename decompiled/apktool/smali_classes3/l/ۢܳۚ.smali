.class public Ll/ۢܳۚ;
.super Ljava/lang/Object;
.source "P2S7"

# interfaces
.implements Ll/ᩳ᩻ۚ;


# instance fields
.field public final ֫:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Ll/ۢܳۚ;->֫:Ll/ܽܳۚ;

    return-void
.end method


# virtual methods
.method public bridge synthetic ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 57
    check-cast p1, Ll/ۤܽۚ;

    invoke-virtual {p0, p1}, Ll/ۢܳۚ;->֫(Ll/ۤܽۚ;)Ll/ۤܽۚ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۤܽۚ;)Ll/ۤܽۚ;
    .locals 1

    .line 68
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-object p1

    .line 80
    :pswitch_0
    new-instance v0, Ll/ᩳܳۚ;

    check-cast p1, Ll/᩹ܽۚ;

    invoke-direct {v0, p0, p1}, Ll/ᩳܳۚ;-><init>(Ll/ۢܳۚ;Ll/᩹ܽۚ;)V

    return-object v0

    .line 78
    :pswitch_1
    new-instance v0, Ll/ܿܳۚ;

    check-cast p1, Ll/᩶ܽۚ;

    invoke-direct {v0, p0, p1}, Ll/ܿܳۚ;-><init>(Ll/ۢܳۚ;Ll/᩶ܽۚ;)V

    return-object v0

    .line 76
    :pswitch_2
    new-instance v0, Ll/ܳܳۚ;

    check-cast p1, Ll/ۛܽۚ;

    invoke-direct {v0, p0, p1}, Ll/ܳܳۚ;-><init>(Ll/ۢܳۚ;Ll/ۛܽۚ;)V

    return-object v0

    .line 74
    :pswitch_3
    new-instance v0, Ll/ۜܳۚ;

    check-cast p1, Ll/֫ᩳۚ;

    invoke-direct {v0, p0, p1}, Ll/ۜܳۚ;-><init>(Ll/ۢܳۚ;Ll/֫ᩳۚ;)V

    return-object v0

    .line 72
    :pswitch_4
    new-instance v0, Ll/᩻ܳۚ;

    check-cast p1, Ll/ۨܽۚ;

    invoke-direct {v0, p0, p1}, Ll/᩻ܳۚ;-><init>(Ll/ۢܳۚ;Ll/ۨܽۚ;)V

    return-object v0

    .line 70
    :pswitch_5
    new-instance v0, Ll/᩷ܳۚ;

    check-cast p1, Ll/ܳᩳۚ;

    invoke-direct {v0, p0, p1}, Ll/᩷ܳۚ;-><init>(Ll/ۢܳۚ;Ll/ܳᩳۚ;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
