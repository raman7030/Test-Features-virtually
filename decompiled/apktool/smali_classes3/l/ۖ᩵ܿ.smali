.class public final synthetic Ll/ۖ᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ۖۗܿ;
.implements Ll/۬֡ܿ;
.implements Ll/ۖۛۡ;
.implements Ll/᩺᩵᩷;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ᩵ܿ;->᩸:I

    iput-object p2, p0, Ll/ۖ᩵ܿ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۖ᩵ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۖ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۛۛ᩷;

    invoke-interface {v0, p1}, Ll/ۛۛ᩷;->֫(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۖ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۧᩳ᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۖ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۟ܳۢ;

    invoke-static {v0, p1}, Ll/۟ܳۢ;->ۧ(Ll/۟ܳۢ;Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۖ᩵ܿ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, [B

    .line 971
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->֫([B)V

    return-void
.end method

.method public ۧ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۖ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۡۖᩳ;

    invoke-static {v0, p1}, Ll/ۡۖᩳ;->֫(Ll/ۡۖᩳ;I)V

    return-void
.end method
