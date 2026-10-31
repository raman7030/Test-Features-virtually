.class public final synthetic Ll/᩹ۙ᩻;
.super Ljava/lang/Object;
.source "Z202"

# interfaces
.implements Ll/ۢ᩻ܳ;


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹ۙ᩻;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()Ll/֫ۜܳ;
    .locals 3

    .line 2
    iget v0, p0, Ll/᩹ۙ᩻;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 7
    new-instance v0, Ll/ۙܳ᩻;

    const v1, 0x7f120613

    const v2, 0x7f0801e3

    .line 29
    invoke-direct {v0, v1, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 30
    invoke-virtual {v0}, Ll/֫ۜܳ;->֫()V

    return-object v0

    .line 87
    :pswitch_0
    new-instance v0, Ll/ۨ᩺ܳ;

    const-string v1, "zip"

    invoke-direct {v0, v1}, Ll/ۨ᩺ܳ;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
