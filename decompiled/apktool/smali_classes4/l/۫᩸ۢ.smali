.class public final synthetic Ll/۫᩸ۢ;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܶۖ;
.implements Ll/ۖۗ᩻;
.implements Ll/᩷ܿۖ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫᩸ۢ;->᩸:I

    iput-object p2, p0, Ll/۫᩸ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۫᩸ۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/List;

    .line 6
    check-cast p1, Ll/֡᩵֫;

    .line 3222
    invoke-interface {p1, v0}, Ll/֡᩵֫;->֫(Ljava/util/List;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget v0, p0, Ll/۫᩸ۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/۫᩸ۢ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۘ۠ܿ;

    invoke-static {v0, p1}, Ll/ۘ۠ܿ;->֫(Ll/ۘ۠ܿ;Landroid/view/MenuItem;)V

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/۫᩸ۢ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۟᩸ۢ;

    invoke-static {v0, p1}, Ll/۟᩸ۢ;->֫(Ll/۟᩸ۢ;Landroid/view/MenuItem;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(I)B
    .locals 5

    .line 2
    iget-object v0, p0, Ll/۫᩸ۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/ArrayList;

    if-ltz p1, :cond_2

    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۗ᩻;

    .line 53
    invoke-virtual {v3}, Ll/ᩳۗ᩻;->ᩳ()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge p1, v4, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 55
    invoke-virtual {v3, p1}, Ll/ᩳۗ᩻;->ܽ(I)B

    move-result p1

    return p1

    :cond_0
    sub-int/2addr p1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/۫᩸ۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 147
    new-instance v1, Ll/ܰܽۖ;

    .line 42
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 147
    throw v1
.end method
