.class public final synthetic Ll/ۤ᩸ۡ;
.super Ljava/lang/Object;
.source "Z6W9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۤ᩸ۡ;->᩸:I

    iput-object p2, p0, Ll/ۤ᩸ۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۤ᩸ۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۤ᩸ۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܿۜۧ;

    .line 12
    invoke-interface {v0}, Ll/ܿۜۧ;->ܽ()V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/ۤ᩸ۡ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/ۗ᩸ۡ;

    .line 125
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll/ۗ᩸ۡ;->accept(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
