.class public final synthetic Ll/ۧ᩶ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧ᩶ۜ;->᩸:I

    iput-object p2, p0, Ll/ۧ᩶ۜ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧ᩶ۜ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۧ᩶ۜ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ܺ۠ۜ;

    .line 11
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    if-eqz v1, :cond_0

    .line 1854
    invoke-virtual {v1}, Ll/ܺ۠ۜ;->close()V

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v1, Ll/ۧ᩵֫;

    .line 890
    iget-object v0, v1, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ll/᩷᩶ۜ;->֫(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
