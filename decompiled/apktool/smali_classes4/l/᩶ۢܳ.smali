.class public final Ll/᩶ۢܳ;
.super Landroid/widget/BaseAdapter;
.source "I29D"


# instance fields
.field public final synthetic ᩸:Ll/۫ۢܳ;


# direct methods
.method public constructor <init>(Ll/۫ۢܳ;)V
    .locals 0

    .line 174
    iput-object p1, p0, Ll/᩶ۢܳ;->᩸:Ll/۫ۢܳ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getCount()I
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩶ۢܳ;->᩸:Ll/۫ۢܳ;

    invoke-static {v0}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/᩶ۢܳ;->᩸:Ll/۫ۢܳ;

    invoke-static {v0, p1, p2, p3}, Ll/۫ۢܳ;->֫(Ll/۫ۢܳ;ILandroid/view/View;Landroid/view/ViewGroup;)Ll/ܿۜܳ;

    move-result-object p1

    return-object p1
.end method

.method public final isEnabled(I)Z
    .locals 2

    const/4 v0, 0x1

    .line 204
    :try_start_0
    iget-object v1, p0, Ll/᩶ۢܳ;->᩸:Ll/۫ۢܳ;

    invoke-static {v1}, Ll/۫ۢܳ;->ܿ(Ll/۫ۢܳ;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ܽۢܳ;->֫(I)Ll/ᩳۜܳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v0

    return p1

    :catch_0
    return v0
.end method
