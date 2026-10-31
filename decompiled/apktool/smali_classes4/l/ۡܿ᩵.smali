.class public final Ll/ۡܿ᩵;
.super Ll/֨ۧ᩵;
.source "N673"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(ILl/֡ᩳ᩵;)V
    .locals 0

    iput p1, p0, Ll/ۡܿ᩵;->b:I

    invoke-direct {p0, p2}, Ll/֨ۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 3

    iget v0, p0, Ll/ۡܿ᩵;->b:I

    packed-switch v0, :pswitch_data_0

    .line 224
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    int-to-double v1, p1

    invoke-interface {v0, v1, v2}, Ll/֡ᩳ᩵;->accept(D)V

    return-void

    .line 209
    :pswitch_0
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Ll/֡ᩳ᩵;->accept(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
