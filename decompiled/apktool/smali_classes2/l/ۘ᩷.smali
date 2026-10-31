.class public final synthetic Ll/ۘ᩷;
.super Ljava/lang/Object;
.source "L7M3"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۖ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۖ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩷;->᩸:Ll/ۖ᩷;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 31
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Landroid/widget/ListAdapter;

    .line 184
    instance-of p2, p1, Landroid/widget/HeaderViewListAdapter;

    if-eqz p2, :cond_0

    .line 185
    move-object p2, p1

    check-cast p2, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {p2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object p2

    check-cast p2, Ll/᩹ۜ;

    goto :goto_0

    .line 187
    :cond_0
    move-object p2, p1

    check-cast p2, Ll/᩹ۜ;

    .line 36
    :goto_0
    iget-object p2, p2, Ll/᩹ۜ;->᩸:Ll/ۗۜ;

    .line 37
    invoke-interface {p1, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    const/4 p3, 0x1

    .line 36
    iget-object p4, p0, Ll/ۘ᩷;->᩸:Ll/ۖ᩷;

    invoke-virtual {p2, p1, p4, p3}, Ll/ۗۜ;->performItemAction(Landroid/view/MenuItem;Ll/ܳ᩷;I)Z

    return-void
.end method
