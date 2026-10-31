.class public final synthetic Ll/ۙ֨ܳ;
.super Ljava/lang/Object;
.source "E4GI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(ILjava/io/Serializable;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙ֨ܳ;->᩸:I

    iput-object p2, p0, Ll/ۙ֨ܳ;->᩹:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget p1, p0, Ll/ۙ֨ܳ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ۙ֨ܳ;->᩹:Ljava/io/Serializable;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, [I

    .line 11
    sget p1, Ll/֡ܳܿ;->֨ۧ:I

    const/4 p1, 0x0

    .line 158
    aput p2, v0, p1

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 313
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
