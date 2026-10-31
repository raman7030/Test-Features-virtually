.class public final synthetic Ll/᩶ܰۜ;
.super Ljava/lang/Object;
.source "I6M7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶ܰۜ;->᩸:I

    iput-object p2, p0, Ll/᩶ܰۜ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩶ܰۜ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget v0, p0, Ll/᩶ܰۜ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/᩶ܰۜ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܳۨۜ;

    iget-object v1, p0, Ll/᩶ܰۜ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/۠ܰۜ;

    invoke-static {v0, v1}, Ll/ܳۨۜ;->֫(Ll/ܳۨۜ;Ll/۠ܰۜ;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/᩶ܰۜ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۤܰۜ;

    iget-object v1, p0, Ll/᩶ܰۜ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/᩹ۛۜ;

    invoke-static {v0, v1}, Ll/ۤܰۜ;->ۧ(Ll/ۤܰۜ;Ll/᩹ۛۜ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
