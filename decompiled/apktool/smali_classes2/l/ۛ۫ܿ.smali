.class public final synthetic Ll/ۛ۫ܿ;
.super Ljava/lang/Object;
.source "964K"

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
    iput p1, p0, Ll/ۛ۫ܿ;->᩸:I

    iput-object p2, p0, Ll/ۛ۫ܿ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۛ۫ܿ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۛ۫ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۛ۫ܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/۬᩹֨;

    .line 11
    iget-object v1, p0, Ll/ۛ۫ܿ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/ۖܶ۠;

    .line 1065
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ll/۬᩹֨;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v0

    .line 218
    invoke-virtual {v1}, Ll/ۖܶ۠;->ۧ()I

    move-result v1

    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۛ۫ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۧۚ֫;

    iget-object v1, p0, Ll/ۛ۫ܿ;->᩶:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/ۧۚ֫;->ۧ(Ll/ۧۚ֫;Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/ۛ۫ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/ۛ۫ܿ;->᩶:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 222
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1066
    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
