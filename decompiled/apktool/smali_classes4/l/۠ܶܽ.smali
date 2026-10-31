.class public Ll/۠ܶܽ;
.super Ll/ۗܺ᩷;
.source "4646"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field public static final synthetic ᩻ۧ:I


# instance fields
.field public ܳۧ:Ll/֨ܶܽ;

.field public ܿۧ:Landroid/widget/ListView;

.field public ᩳۧ:Ll/۫᩵ۘ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/۠ܶܽ;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ll/۠ܶܽ;->ۨ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ܶܽ;Ll/۫᩵ۘ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۠ܶܽ;->ᩳۧ:Ll/۫᩵ۘ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ܶܽ;->ᩳۧ:Ll/۫᩵ۘ;

    return-object p0
.end method

.method private ۨ()V
    .locals 3

    .line 320
    iget-object v0, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-boolean v0, v0, Ll/֨ܶܽ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 321
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v1, 0x7f120b7b

    .line 321
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f1208cd

    .line 322
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/᩻ܶܽ;

    invoke-direct {v1, p0}, Ll/᩻ܶܽ;-><init>(Ll/۠ܶܽ;)V

    const v2, 0x7f1208c6

    .line 323
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۜܶܽ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۜܶܽ;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f120319

    .line 324
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 325
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 327
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/۠ܶܽ;)Landroid/widget/ListView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ܶܽ;->ܿۧ:Landroid/widget/ListView;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/۠ܶܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۠ܶܽ;->ۨ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 50
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 51
    new-instance p1, Ll/ۙܺ֫;

    invoke-direct {p1, p0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v0, Ll/֨ܶܽ;

    invoke-virtual {p1, v0}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/֨ܶܽ;

    iput-object p1, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    .line 52
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object p1

    new-instance v0, Ll/᩷ܶܽ;

    invoke-direct {v0, p0}, Ll/᩷ܶܽ;-><init>(Ll/۠ܶܽ;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {p1, v0}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    .line 59
    invoke-virtual {p0}, Ll/ۗܺ᩷;->֡()V

    const p1, 0x7f0d0034

    .line 60
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120a00

    .line 61
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 62
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const p1, 0x102000a

    .line 63
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Ll/۠ܶܽ;->ܿۧ:Landroid/widget/ListView;

    const/4 v0, 0x1

    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setFastScrollEnabled(Z)V

    .line 65
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 68
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 69
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v1, Ll/ᩴܺ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ll/ᩴܺ᩷;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {p1, v1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ll/ۗܺ᩷;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 75
    :cond_0
    iget-object p1, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-boolean p1, p1, Ll/֨ܶܽ;->᩺:Z

    if-nez p1, :cond_1

    .line 76
    new-instance p1, Ll/ۡܶܽ;

    invoke-direct {p1, p0}, Ll/ۡܶܽ;-><init>(Ll/۠ܶܽ;)V

    .line 133
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 135
    :cond_1
    iget-object p1, p0, Ll/۠ܶܽ;->ܿۧ:Landroid/widget/ListView;

    new-instance v1, Ll/۫᩵ۘ;

    new-instance v2, Ll/ۚܶܽ;

    invoke-direct {v2, p0}, Ll/ۚܶܽ;-><init>(Ll/۠ܶܽ;)V

    invoke-direct {v1, v2}, Ll/۫᩵ۘ;-><init>(Landroid/widget/BaseAdapter;)V

    iput-object v1, p0, Ll/۠ܶܽ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p1, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 136
    iget-object p1, p0, Ll/۠ܶܽ;->ܿۧ:Landroid/widget/ListView;

    new-instance v1, Ll/ܺܶܽ;

    invoke-direct {v1, p0}, Ll/ܺܶܽ;-><init>(Ll/۠ܶܽ;)V

    invoke-virtual {p1, v1}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 147
    iget-object p1, p0, Ll/۠ܶܽ;->ᩳۧ:Ll/۫᩵ۘ;

    iget-object v1, p0, Ll/۠ܶܽ;->ܿۧ:Landroid/widget/ListView;

    invoke-virtual {p1, v1}, Ll/ۙ᩵ۘ;->֫(Landroid/widget/AbsListView;)V

    .line 148
    iget-object p1, p0, Ll/۠ܶܽ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p1, v0}, Ll/ۗ᩵ۘ;->֫(Z)V

    .line 149
    iget-object p1, p0, Ll/۠ܶܽ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p1}, Ll/ۗ᩵ۘ;->ᩳ()V

    .line 150
    iget-object p1, p0, Ll/۠ܶܽ;->ܿۧ:Landroid/widget/ListView;

    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 156
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0004

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 332
    new-instance p1, Ll/֡ܶܽ;

    invoke-direct {p1, p0, p0}, Ll/֡ܶܽ;-><init>(Ll/۠ܶܽ;Ll/۠ܶܽ;)V

    const p2, 0x7f1202dd

    .line 340
    invoke-virtual {p1, p2}, Ll/۬ۗܿ;->ۡ(I)V

    .line 341
    invoke-virtual {p1}, Ll/۬ۗܿ;->ܺ()V

    iget-object p2, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-object p4, p2, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object p4, p4, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    .line 343
    iget-boolean p5, p2, Ll/֨ܶܽ;->ۨ:Z

    if-eqz p5, :cond_0

    iget-object p5, p2, Ll/֨ܶܽ;->ۤ:[I

    aget p3, p5, p3

    :cond_0
    iput p3, p2, Ll/֨ܶܽ;->۟:I

    .line 342
    invoke-virtual {p4, p3}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 p2, 0x1

    .line 205
    invoke-virtual {p1, p2}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 162
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a0375

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    .line 280
    new-instance p1, Ll/᩵ܶܽ;

    invoke-direct {p1, p0, v1}, Ll/᩵ܶܽ;-><init>(Ll/۠ܶܽ;Z)V

    .line 311
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return v2

    :cond_0
    const v0, 0x7f0a033c

    if-ne p1, v0, :cond_1

    .line 167
    invoke-direct {p0}, Ll/۠ܶܽ;->ۨ()V

    return v2

    :cond_1
    const v0, 0x7f0a0341

    if-ne p1, v0, :cond_2

    .line 170
    new-instance p1, Ll/ۖܶܽ;

    iget-object v0, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-boolean v0, v0, Ll/֨ܶܽ;->ۨ:Z

    invoke-direct {p1, p0, p0, v0}, Ll/ۖܶܽ;-><init>(Ll/۠ܶܽ;Ll/۠ܶܽ;Z)V

    .line 192
    invoke-virtual {p1}, Ll/ܿ۬ܿ;->ۧ()V

    return v2

    :cond_2
    const v0, 0x7f0a0372

    if-ne p1, v0, :cond_3

    .line 195
    new-instance p1, Ll/ۘܶܽ;

    invoke-direct {p1, p0, p0}, Ll/ۘܶܽ;-><init>(Ll/۠ܶܽ;Ll/۠ܶܽ;)V

    return v2

    :cond_3
    const v0, 0x7f0a0386

    if-ne p1, v0, :cond_8

    .line 226
    iget-object p1, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-object p1, p1, Ll/֨ܶܽ;->ܰ:Ljava/lang/String;

    if-nez p1, :cond_4

    .line 227
    new-instance p1, Ll/ᩴܶܽ;

    invoke-direct {p1, p0}, Ll/ᩴܶܽ;-><init>(Ll/۠ܶܽ;)V

    .line 263
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return v2

    :cond_4
    const-string v0, "Error"

    .line 264
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 265
    iget-object p1, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-object p1, p1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    invoke-virtual {p1}, Ll/ܶۨۡ;->ܽ()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f120757

    .line 266
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const v0, 0x7f120756

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    .line 269
    :cond_5
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return v2

    .line 516
    :cond_6
    :goto_0
    invoke-virtual {p0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return v2

    .line 272
    :cond_7
    iget-object p1, p0, Ll/۠ܶܽ;->ܳۧ:Ll/֨ܶܽ;

    iget-object v0, p1, Ll/֨ܶܽ;->ܰ:Ljava/lang/String;

    iget-object p1, p1, Ll/֨ܶܽ;->۫:Ljava/lang/String;

    const/4 v1, 0x0

    .line 323
    invoke-static {p0, v0, p1, v1, v1}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_8
    return v1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "AXmlStringsEditor"

    return-object v0
.end method

.method public final ᩴ()V
    .locals 0

    .line 316
    invoke-direct {p0}, Ll/۠ܶܽ;->ۨ()V

    return-void
.end method
