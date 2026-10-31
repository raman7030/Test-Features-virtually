.class public final synthetic Ll/۟۠ۜ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/ܺܶۜ;Ll/۬۬ܿ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Exception;)V
    .locals 0

    const/4 p4, 0x0

    .line 0
    iput p4, p0, Ll/۟۠ۜ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۠ۜ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/۟۠ۜ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/۟۠ۜ;->ۙ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/۟۠ۜ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۠ۜ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/۟۠ۜ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/۟۠ۜ;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget v0, p0, Ll/۟۠ۜ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/۟۠ۜ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩺ۗۜ;

    iget-object v1, p0, Ll/۟۠ۜ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ۨۗۜ;

    iget-object v2, p0, Ll/۟۠ۜ;->ۙ:Ljava/lang/Object;

    check-cast v2, Ll/ۛۗۜ;

    invoke-static {v0, v1, v2}, Ll/᩺ۗۜ;->֫(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/۟۠ۜ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺܶۜ;

    iget-object v1, p0, Ll/۟۠ۜ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/۬۬ܿ;

    iget-object v2, p0, Ll/۟۠ۜ;->ۙ:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v0, v1, v2}, Ll/ܺܶۜ;->֫(Ll/ܺܶۜ;Ll/۬۬ܿ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
