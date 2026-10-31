.class public final synthetic Ll/ۨ᩻֫;
.super Ljava/lang/Object;
.source "O5NM"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨ᩻֫;->֫:I

    iput-object p2, p0, Ll/ۨ᩻֫;->ۧ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ۨ᩻֫;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۨ᩻֫;->ۧ:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩸ۙ᩷;

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 14
    invoke-static {v0, p1}, Ll/᩸ۙ᩷;->֫(Ll/᩸ۙ᩷;Ljava/lang/String;)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/ۨ᩻֫;->ۧ:Ljava/lang/Object;

    .line 19
    check-cast v0, Ll/ܽۜܳ;

    .line 21
    check-cast p1, Ll/ۧ۠ܳ;

    .line 272
    invoke-virtual {p1}, Ll/ۧ۠ܳ;->ܳ()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    invoke-virtual {p1}, Ll/ۧ۠ܳ;->ܿ()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۨ᩻֫;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۚۜ֫;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Ll/ۚۜ֫;->֫(Ll/ۚۜ֫;Ljava/lang/Integer;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
