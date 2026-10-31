.class public final Ll/ܰܰᩴ;
.super Ll/۠֫᩵;
.source "N673"


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֫᩵;ILjava/util/function/Function;I)V
    .locals 0

    iput p4, p0, Ll/ܰܰᩴ;->s:I

    iput-object p3, p0, Ll/ܰܰᩴ;->t:Ljava/util/function/Function;

    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    iget p1, p0, Ll/ܰܰᩴ;->s:I

    packed-switch p1, :pswitch_data_0

    .line 260
    new-instance p1, Ll/᩶ۧ᩵;

    invoke-direct {p1, p0, p2}, Ll/᩶ۧ᩵;-><init>(Ll/ܰܰᩴ;Ll/֡ᩳ᩵;)V

    return-object p1

    .line 192
    :pswitch_0
    new-instance p1, Ll/֫ܽ᩵;

    const/4 v0, 0x3

    invoke-direct {p1, p0, p2, v0}, Ll/֫ܽ᩵;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
