.class public final synthetic Ll/ۧ֡ܿ;
.super Ljava/lang/Object;
.source "D18B"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧ֡ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ᩻()Z
    .locals 1

    .line 2
    iget v0, p0, Ll/ۧ֡ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 205
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    return v0

    .line 0
    :pswitch_0
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
