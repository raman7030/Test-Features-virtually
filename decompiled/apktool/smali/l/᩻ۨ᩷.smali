.class public final synthetic Ll/᩻ۨ᩷;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ll/ۖۛۡ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۨ᩷;->᩸:I

    iput-object p2, p0, Ll/᩻ۨ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩻ۨ᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩻ۨ᩷;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۡ֨᩻;

    .line 12
    invoke-interface {v0, p1}, Ll/ۡ֨᩻;->ۧ(I)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩻ۨ᩷;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/ۧᩳ᩻;

    .line 20
    invoke-virtual {v0, p1}, Ll/᩹ܶۢ;->ܺ(I)V

    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Ll/᩻ۨ᩷;->᩹:Ljava/lang/Object;

    .line 25
    check-cast v0, Ll/ۘ۟ܳ;

    .line 28
    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    .line 31
    :pswitch_2
    iget-object v0, p0, Ll/᩻ۨ᩷;->᩹:Ljava/lang/Object;

    .line 33
    check-cast v0, Ll/ۛۛ᩷;

    int-to-float p1, p1

    const v1, 0x3dcccccd    # 0.1f

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 913
    invoke-interface {v0, p1}, Ll/ۛۛ᩷;->֫(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
