.class public final synthetic Ll/ۨ᩶ܿ;
.super Ljava/lang/Object;
.source "A9CL"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨ᩶ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    iget v0, p0, Ll/ۨ᩶ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/֡᩺֫;

    .line 9
    check-cast p2, Ll/֡᩺֫;

    .line 627
    iget-object p1, p1, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    iget-object p2, p2, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 0
    :pswitch_0
    check-cast p1, Landroid/view/MenuItem;

    check-cast p2, Landroid/view/MenuItem;

    .line 35
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x1020041

    if-ne v0, v1, :cond_0

    .line 36
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    if-ne p1, v1, :cond_5

    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    move-object v0, p1

    check-cast v0, Ll/ܰ۬;

    invoke-interface {v0}, Ll/ܰ۬;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast p2, Ll/ܰ۬;

    invoke-interface {p2}, Ll/ܰ۬;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    move-object v1, p2

    check-cast v1, Ll/ܰ۬;

    invoke-interface {v1}, Ll/ܰ۬;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 17
    :cond_3
    invoke-interface {v0}, Ll/ܰ۬;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ll/ܰ۬;->ܽ()Z

    move-result p1

    xor-int/2addr v2, p1

    goto :goto_1

    :cond_4
    invoke-interface {v1}, Ll/ܰ۬;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v2, -0x1

    goto :goto_1

    .line 57
    :cond_6
    invoke-interface {p1}, Landroid/view/MenuItem;->getOrder()I

    move-result p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getOrder()I

    move-result p2

    sub-int v2, p1, p2

    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
