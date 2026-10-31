.class public final synthetic Ll/ۡ᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ᩷ᩳ;->᩸:I

    iput-object p2, p0, Ll/ۡ᩷ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/ۡ᩷ᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۡ᩷ᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۛᩴۡ;

    .line 11
    sget p1, Ll/ۛᩴۡ;->ۘۧ:I

    .line 53
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/᩺ۤܿ;

    sget p1, Ll/ۛܶۢ;->ۡ֫:I

    .line 17
    invoke-virtual {v1}, Ll/᩺ۤܿ;->ᩳ()V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/֫ۧ᩻;

    invoke-static {v1}, Ll/֫ۧ᩻;->֫(Ll/֫ۧ᩻;)V

    return-void

    :pswitch_2
    check-cast v1, Ll/ۤۤᩳ;

    .line 527
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 528
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    .line 529
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v2

    if-le v0, v2, :cond_0

    move v4, v2

    move v2, v0

    move v0, v4

    .line 535
    :cond_0
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-interface {v3, v0, v2, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 536
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void

    .line 0
    :pswitch_3
    check-cast v1, Ll/֫ۢᩳ;

    invoke-static {v1}, Ll/֫ۢᩳ;->ܿ(Ll/֫ۢᩳ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
