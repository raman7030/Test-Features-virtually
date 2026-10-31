.class public final synthetic Ll/֫᩻ۢ;
.super Ljava/lang/Object;
.source "K14B"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫᩻ۢ;->᩸:I

    iput-object p2, p0, Ll/֫᩻ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/֫᩻ۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֫᩻ۢ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۛۜۢ;

    .line 689
    iget-object v1, v0, Ll/ۛۜۢ;->ۗ:Ll/ܳ᩷ۢ;

    invoke-static {v1}, Ll/ܳ᩷ۢ;->ۧ(Ll/ܳ᩷ۢ;)Ll/ܿ᩷ۢ;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۗ۬ۧ;->getAdapterPosition()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 690
    invoke-static {v1}, Ll/ܳ᩷ۢ;->᩻(Ll/ܳ᩷ۢ;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֫᩻ۢ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺ᩻ۢ;

    .line 175
    new-instance v1, Ll/ܳ᩻ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܳ᩻ۢ;-><init>(I)V

    invoke-virtual {v0, v1}, Ll/ܳۛ᩷;->֫(Ljava/util/function/Consumer;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
