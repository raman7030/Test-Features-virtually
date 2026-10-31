.class public final synthetic Ll/۟ۛۡ;
.super Ljava/lang/Object;
.source "PB32"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟ۛۡ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/۟ۛۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    return-void

    .line 451
    :pswitch_0
    new-instance v0, Ll/ܺ֨ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺ֨ܿ;-><init>(I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 0
    :pswitch_1
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    return-void

    :pswitch_2
    invoke-static {}, Ll/֫ۨۡ;->֫()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
