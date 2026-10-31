.class public final synthetic Ll/۟֡ܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:[Z

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>([ZLjava/util/ArrayList;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟֡ܿ;->᩸:[Z

    iput-object p2, p0, Ll/۟֡ܿ;->᩹:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/۟֡ܿ;->᩶:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    const/4 p1, 0x0

    .line 235
    :goto_0
    iget-object v0, p0, Ll/۟֡ܿ;->᩸:[Z

    array-length v1, v0

    if-ge p1, v1, :cond_2

    .line 236
    iget-object v1, p0, Ll/۟֡ܿ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܶۡ;

    invoke-virtual {v1}, Ll/۠ܶۡ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_1

    aget-boolean v1, v0, p1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 237
    :goto_2
    aput-boolean v1, v0, p1

    .line 238
    iget-object v0, p0, Ll/۟֡ܿ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
