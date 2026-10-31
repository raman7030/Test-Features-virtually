.class public final Ll/ۢܿ᩵;
.super Ll/ܿ֫᩵;
.source "N673"


# instance fields
.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Ll/۫᩺ᩴ;II)V
    .locals 0

    iput p3, p0, Ll/ۢܿ᩵;->s:I

    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    iget p1, p0, Ll/ۢܿ᩵;->s:I

    packed-switch p1, :pswitch_data_0

    return-object p2

    .line 206
    :pswitch_0
    new-instance p1, Ll/ۡܿ᩵;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, Ll/ۡܿ᩵;-><init>(ILl/֡ᩳ᩵;)V

    return-object p1

    .line 249
    :pswitch_1
    new-instance p1, Ll/۟ܽ᩵;

    const/4 v0, 0x3

    invoke-direct {p1, p0, p2, v0}, Ll/۟ܽ᩵;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
