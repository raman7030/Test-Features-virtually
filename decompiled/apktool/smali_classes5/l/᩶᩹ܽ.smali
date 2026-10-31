.class public final Ll/᩶᩹ܽ;
.super Ll/۟ܶۡ;
.source "P676"


# instance fields
.field public final synthetic ܳ:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;)V
    .locals 0

    .line 181
    iput-object p1, p0, Ll/᩶᩹ܽ;->ܳ:Ll/᩷᩶ܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 204
    iget-object v0, p0, Ll/᩶᩹ܽ;->ܳ:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܿ(Ll/᩷᩶ܽ;)Landroid/widget/ListView;

    move-result-object v1

    new-instance v2, Ll/۫᩵ۘ;

    new-instance v3, Ll/۟᩹ܽ;

    invoke-direct {v3, v0}, Ll/۟᩹ܽ;-><init>(Ll/᩷᩶ܽ;)V

    invoke-direct {v2, v3}, Ll/۫᩵ۘ;-><init>(Landroid/widget/BaseAdapter;)V

    invoke-static {v0, v2}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;Ll/۫᩵ۘ;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 205
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܿ(Ll/᩷᩶ܽ;)Landroid/widget/ListView;

    move-result-object v1

    new-instance v2, Ll/᩹᩹ܽ;

    invoke-direct {v2, p0}, Ll/᩹᩹ܽ;-><init>(Ll/᩶᩹ܽ;)V

    invoke-virtual {v1, v2}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 216
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object v1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܿ(Ll/᩷᩶ܽ;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۙ᩵ۘ;->֫(Landroid/widget/AbsListView;)V

    .line 217
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/ۗ᩵ۘ;->֫(Z)V

    .line 218
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩵ۘ;->ᩳ()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 223
    iget-object v0, p0, Ll/᩶᩹ܽ;->ܳ:Ll/᩷᩶ܽ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 185
    iget-object v0, p0, Ll/᩶᩹ܽ;->ܳ:Ll/᩷᩶ܽ;

    const v1, 0x7f1203b0

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 8

    .line 190
    iget-object v0, p0, Ll/᩶᩹ܽ;->ܳ:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    sget v2, Ll/ܿ֡ܿ;->֫:I

    .line 153
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 190
    iput-object v2, v1, Ll/ᩳ᩶ܽ;->ۨ:Ll/ܶ᩵ܿ;

    .line 191
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    new-instance v2, Ll/ۗ᩶֡;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v3

    iget-object v3, v3, Ll/ᩳ᩶ܽ;->ۨ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ۗ᩶֡;-><init>(Ljava/io/InputStream;)V

    iput-object v2, v1, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    .line 192
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    iget-object v1, v1, Ll/ۗ᩶֡;->ܳ:Ll/֡ۙ֡;

    invoke-virtual {v1}, Ll/ۤۙ֡;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩸֡;

    .line 193
    invoke-virtual {v2}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v4

    .line 0
    invoke-static {v3, v3, v4}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 195
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 197
    :cond_0
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    new-instance v2, Ll/ܳ᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    .line 1527
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1525
    new-instance v5, Ll/᩻᩶ܽ;

    const-string v6, ""

    const/4 v7, 0x0

    invoke-direct {v5, v0, v6, v6, v7}, Ll/᩻᩶ܽ;-><init>(Ll/᩷᩶ܽ;Ljava/lang/String;Ljava/lang/String;Ll/᩻᩶ܽ;)V

    iput-object v5, v2, Ll/ܳ᩶ܽ;->֫:Ll/᩻᩶ܽ;

    .line 1528
    invoke-virtual {v2, v4}, Ll/ܳ᩶ܽ;->֫(Ljava/util/Set;)V

    .line 197
    iput-object v2, v1, Ll/ᩳ᩶ܽ;->ܺ֫:Ll/ܳ᩶ܽ;

    .line 198
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۜ(Ll/᩷᩶ܽ;)V

    .line 199
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iput-boolean v3, v0, Ll/ᩳ᩶ܽ;->ܽ֫:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 228
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
