.class public final synthetic Ll/ۘۚܳ;
.super Ljava/lang/Object;
.source "X1Y5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۘۚܳ;->᩸:I

    iput-object p1, p0, Ll/ۘۚܳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۘۚܳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۘۚܳ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۘۚܳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۘۚܳ;->ۙ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/ۘۚܳ;->᩶:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/ۘۚܳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 13
    check-cast v3, Ll/۬۬ۧ;

    .line 15
    check-cast v2, Landroid/view/View;

    .line 17
    check-cast v1, Landroid/view/View;

    .line 19
    sget v0, Ll/ۜ᩸᩷;->ۡۧ:I

    const/4 v0, 0x1

    .line 192
    invoke-virtual {v3, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 193
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v3, Ll/֡ۚܳ;

    check-cast v2, Ll/ۖۢܳ;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v3, v2, v1}, Ll/֡ۚܳ;->֫(Ll/֡ۚܳ;Ll/ۖۢܳ;Ljava/util/ArrayList;)V

    return-void

    :cond_0
    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 194
    :goto_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
