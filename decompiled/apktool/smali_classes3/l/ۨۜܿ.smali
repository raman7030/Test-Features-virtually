.class public final synthetic Ll/ۨۜܿ;
.super Ljava/lang/Object;
.source "B4S2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۨۜܿ;->᩸:I

    iput-object p3, p0, Ll/ۨۜܿ;->᩹:Ljava/lang/Object;

    iput p1, p0, Ll/ۨۜܿ;->᩶:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget v0, p0, Ll/ۨۜܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۨۜܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺܶۜ;

    iget v1, p0, Ll/ۨۜܿ;->᩶:I

    invoke-static {v0, v1}, Ll/ܺܶۜ;->֫(Ll/ܺܶۜ;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۨۜܿ;->᩹:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    iget v1, p0, Ll/ۨۜܿ;->᩶:I

    invoke-static {v0, v1}, Ll/ۜ᩷ܿ;->֫([Ljava/lang/String;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
