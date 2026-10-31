.class public final Ll/ۡܶܽ;
.super Ll/۟ܶۡ;
.source "4646"


# instance fields
.field public final synthetic ܳ:Ll/۠ܶܽ;


# direct methods
.method public constructor <init>(Ll/۠ܶܽ;)V
    .locals 0

    .line 76
    iput-object p1, p0, Ll/ۡܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 106
    iget-object v0, p0, Ll/ۡܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ܽ(Ll/۠ܶܽ;)Landroid/widget/ListView;

    move-result-object v1

    new-instance v2, Ll/۫᩵ۘ;

    new-instance v3, Ll/ۚܶܽ;

    invoke-direct {v3, v0}, Ll/ۚܶܽ;-><init>(Ll/۠ܶܽ;)V

    invoke-direct {v2, v3}, Ll/۫᩵ۘ;-><init>(Landroid/widget/BaseAdapter;)V

    invoke-static {v0, v2}, Ll/۠ܶܽ;->֫(Ll/۠ܶܽ;Ll/۫᩵ۘ;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 107
    invoke-static {v0}, Ll/۠ܶܽ;->ܽ(Ll/۠ܶܽ;)Landroid/widget/ListView;

    move-result-object v1

    new-instance v2, Ll/ۢܶܽ;

    invoke-direct {v2, p0}, Ll/ۢܶܽ;-><init>(Ll/ۡܶܽ;)V

    invoke-virtual {v1, v2}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 118
    invoke-static {v0}, Ll/۠ܶܽ;->ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;

    move-result-object v1

    invoke-static {v0}, Ll/۠ܶܽ;->ܽ(Ll/۠ܶܽ;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۙ᩵ۘ;->֫(Landroid/widget/AbsListView;)V

    .line 119
    invoke-static {v0}, Ll/۠ܶܽ;->ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/ۗ᩵ۘ;->֫(Z)V

    .line 120
    invoke-static {v0}, Ll/۠ܶܽ;->ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩵ۘ;->ᩳ()V

    .line 121
    invoke-static {v0}, Ll/۠ܶܽ;->ܽ(Ll/۠ܶܽ;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ۡܶܽ;->ܳ:Ll/۠ܶܽ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 80
    iget-object v0, p0, Ll/ۡܶܽ;->ܳ:Ll/۠ܶܽ;

    const v1, 0x7f1203b0

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 85
    iget-object v0, p0, Ll/ۡܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    sget v2, Ll/ܿ֡ܿ;->֫:I

    .line 153
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 85
    iput-object v2, v1, Ll/֨ܶܽ;->۬:Ll/ܶ᩵ܿ;

    .line 86
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget-object v2, v2, Ll/֨ܶܽ;->۬:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/֨ܶܽ;->۫:Ljava/lang/String;

    .line 87
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget-object v2, v2, Ll/֨ܶܽ;->۬:Ll/ܶ᩵ܿ;

    invoke-static {v2}, Ll/ܶۨۡ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶۨۡ;

    move-result-object v2

    iput-object v2, v1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    .line 88
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget-object v2, v2, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v2, v2, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v2}, Ll/۬ܿܽ;->size()I

    move-result v2

    new-array v2, v2, [I

    iput-object v2, v1, Ll/֨ܶܽ;->ۤ:[I

    .line 89
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/֨ܶܽ;->᩺:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 131
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
