.class public final synthetic Ll/᩹ܶۡ;
.super Ljava/lang/Object;
.source "E9SU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹ܶۡ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩹ܶۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 20
    sget-object v0, Ll/۟ۚۡ;->ܿ:Ll/ۚۡ֫;

    new-instance v1, Ll/᩺ۜۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/֡ۡ֫;->֫(Ll/֨ۡ֫;)V

    return-void

    .line 0
    :pswitch_0
    invoke-static {}, Ll/ۙܶۡ;->֫()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
