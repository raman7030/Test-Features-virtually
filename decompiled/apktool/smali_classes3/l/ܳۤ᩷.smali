.class public final synthetic Ll/ܳۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:[Z


# direct methods
.method public synthetic constructor <init>([ZLjava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ܳۤ᩷;->᩸:I

    iput-object p1, p0, Ll/ܳۤ᩷;->᩹:[Z

    iput-object p2, p0, Ll/ܳۤ᩷;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ܳۤ᩷;->᩸:I

    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, Ll/ܳۤ᩷;->᩶:Ljava/lang/Object;

    .line 7
    iget-object v2, p0, Ll/ܳۤ᩷;->᩹:[Z

    packed-switch p1, :pswitch_data_0

    .line 12
    check-cast v1, Ll/᩶᩸ۡ;

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast v1, Landroid/widget/ListView;

    sget p1, Ll/ܿۛ᩷;->ۛۧ:I

    .line 1521
    :goto_0
    array-length p1, v2

    if-ge v0, p1, :cond_0

    .line 1522
    aget-boolean p1, v2, v0

    xor-int/lit8 p1, p1, 0x1

    aput-boolean p1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1524
    :cond_0
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    check-cast p1, Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 322
    :goto_1
    array-length p1, v2

    if-ge v0, p1, :cond_1

    .line 323
    aget-boolean p1, v2, v0

    xor-int/lit8 p1, p1, 0x1

    aput-boolean p1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 325
    :cond_1
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
