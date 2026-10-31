.class public final Ll/᩸ܿ᩵;
.super Ll/ܿ֫᩵;
.source "N673"


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/۫᩺ᩴ;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Ll/᩸ܿ᩵;->s:I

    iput-object p3, p0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method

.method public constructor <init>(Ll/᩵֫᩵;Ljava/util/function/LongConsumer;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ll/᩸ܿ᩵;->s:I

    .line 362
    iput-object p2, p0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 91
    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    iget p1, p0, Ll/᩸ܿ᩵;->s:I

    packed-switch p1, :pswitch_data_0

    .line 226
    new-instance p1, Ll/֫ܽ᩵;

    const/4 v0, 0x5

    invoke-direct {p1, p0, p2, v0}, Ll/֫ܽ᩵;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    .line 394
    :pswitch_0
    new-instance p1, Ll/ۡܰᩴ;

    invoke-direct {p1, p0, p2}, Ll/ۡܰᩴ;-><init>(Ll/᩸ܿ᩵;Ll/֡ᩳ᩵;)V

    return-object p1

    .line 365
    :pswitch_1
    new-instance p1, Ll/ۚܰᩴ;

    const/4 v0, 0x5

    invoke-direct {p1, p0, p2, v0}, Ll/ۚܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    .line 342
    :pswitch_2
    new-instance p1, Ll/ۚܰᩴ;

    const/4 v0, 0x4

    invoke-direct {p1, p0, p2, v0}, Ll/ۚܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    .line 282
    :pswitch_3
    new-instance p1, Ll/ܳ۟ᩴ;

    invoke-direct {p1, p0, p2}, Ll/ܳ۟ᩴ;-><init>(Ll/᩸ܿ᩵;Ll/֡ᩳ᩵;)V

    return-object p1

    .line 225
    :pswitch_4
    new-instance p1, Ll/ۚܰᩴ;

    const/4 v0, 0x1

    invoke-direct {p1, p0, p2, v0}, Ll/ۚܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    .line 266
    :pswitch_5
    new-instance p1, Ll/᩹ᩳ᩵;

    const/4 v0, 0x3

    invoke-direct {p1, p0, p2, v0}, Ll/᩹ᩳ᩵;-><init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
