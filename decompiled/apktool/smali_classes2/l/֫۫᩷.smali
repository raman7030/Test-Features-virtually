.class public final Ll/֫۫᩷;
.super Ljava/lang/Object;
.source "81ID"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ll/֡ۚۢ;

.field public final ᩶:Ll/᩶۬᩷;

.field public final ᩸:Ll/ܿۛ᩷;

.field public ᩹:Landroid/widget/BaseAdapter;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ll/᩶۬᩷;)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    .line 38
    iput-object p2, p0, Ll/֫۫᩷;->᩶:Ll/᩶۬᩷;

    .line 39
    invoke-virtual {p2}, Ll/᩶۬᩷;->֫()Ljava/util/ArrayList;

    move-result-object p2

    iput-object p2, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    .line 40
    new-instance p2, Ll/ۨ۬᩷;

    invoke-direct {p2, p0, p1}, Ll/ۨ۬᩷;-><init>(Ll/֫۫᩷;Ll/ܿۛ᩷;)V

    iput-object p2, p0, Ll/֫۫᩷;->᩹:Landroid/widget/BaseAdapter;

    const v0, 0x7f0d00cc

    .line 71
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a02e0

    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    .line 73
    invoke-virtual {v1, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 74
    invoke-virtual {v1, p0}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 75
    invoke-static {v1}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 76
    invoke-virtual {v1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const p2, 0x7f0a0631

    .line 77
    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const v1, 0x7f120265

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(I)V

    .line 78
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    invoke-direct {p2, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 79
    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 80
    invoke-virtual {p2, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/۫۬᩷;

    invoke-direct {v0, p0, p1}, Ll/۫۬᩷;-><init>(Ll/֫۫᩷;Ll/ܿۛ᩷;)V

    const p1, 0x7f120266

    .line 81
    invoke-virtual {p2, p1, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 84
    invoke-virtual {p2}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/֫۫᩷;->ۙ:Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/֫۫᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 89
    invoke-direct {p0, v0}, Ll/֫۫᩷;->֫(Z)V

    return-void
.end method

.method public static ֫(Ll/֫۫᩷;Landroid/widget/AdapterView;Landroid/view/View;IJLandroid/view/MenuItem;)V
    .locals 2

    .line 160
    iget-object v0, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    invoke-interface {p6}, Landroid/view/MenuItem;->getItemId()I

    move-result p6

    const v1, 0x7f12026b

    if-ne p6, v1, :cond_0

    .line 162
    invoke-virtual/range {p0 .. p5}, Ll/֫۫᩷;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void

    :cond_0
    const/4 p1, 0x1

    const p2, 0x7f12026a

    if-ne p6, p2, :cond_1

    .line 165
    iget-object p4, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹۬᩷;

    .line 195
    new-instance p4, Ll/۟۬᩷;

    invoke-direct {p4, p0, v0, p3}, Ll/۟۬᩷;-><init>(Ll/֫۫᩷;Ll/ۗܺ᩷;Ll/᩹۬᩷;)V

    .line 211
    invoke-virtual {p4, p2}, Ll/۬ۗܿ;->ۡ(I)V

    iget-object p0, p3, Ll/᩹۬᩷;->᩹:Ljava/lang/String;

    .line 212
    invoke-virtual {p4, p0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {p4}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p4, p1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_1
    const p2, 0x7f120268

    if-ne p6, p2, :cond_2

    .line 168
    iget-object p4, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹۬᩷;

    .line 178
    sget p4, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p4, Ll/᩵ۚۢ;

    invoke-direct {p4, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 179
    invoke-virtual {p4, p2}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object p2, p3, Ll/᩹۬᩷;->᩹:Ljava/lang/String;

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p2, p1, p5

    const p2, 0x7f120870

    .line 180
    invoke-virtual {v0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p1, Ll/ۤ۬᩷;

    invoke-direct {p1, p0, p3}, Ll/ۤ۬᩷;-><init>(Ll/֫۫᩷;Ll/᩹۬᩷;)V

    const p0, 0x7f12070a

    .line 181
    invoke-virtual {p4, p0, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 189
    invoke-virtual {p4, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 190
    invoke-virtual {p4}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_2
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫۫᩷;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic ֫(Ll/֫۫᩷;Ll/᩹۬᩷;)V
    .locals 1

    .line 182
    iget-object v0, p1, Ll/᩹۬᩷;->᩸:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 183
    iget-object v0, p1, Ll/᩹۬᩷;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 184
    iget-object v0, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 185
    iget-object p1, p0, Ll/֫۫᩷;->᩹:Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 186
    iget-object p1, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 187
    iget-object p0, p0, Ll/֫۫᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    :cond_0
    return-void
.end method

.method private ֫(Z)V
    .locals 3

    .line 97
    new-instance v0, Ll/ܰ۬᩷;

    iget-object v1, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v0, p0, v1, p1}, Ll/ܰ۬᩷;-><init>(Ll/֫۫᩷;Ll/ۗܺ᩷;Z)V

    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "dex_backup_name"

    const-string v2, "backup"

    .line 146
    invoke-interface {p1, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f120266

    .line 147
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ۡ(I)V

    const/4 p1, 0x6

    .line 148
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    const p1, 0x7f120267

    .line 149
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ۜ(I)V

    .line 150
    invoke-virtual {v0}, Ll/۬ۗܿ;->᩵()V

    const/4 p1, 0x1

    .line 205
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ۧ(Ll/֫۫᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 82
    invoke-direct {p0, v0}, Ll/֫۫᩷;->֫(Z)V

    return-void
.end method

.method public static ۧ(Ll/֫۫᩷;Ll/᩹۬᩷;)V
    .locals 2

    .line 225
    iget-object v0, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    :try_start_0
    iget-object v1, p0, Ll/֫۫᩷;->᩶:Ll/᩶۬᩷;

    iget-object p1, p1, Ll/᩹۬᩷;->᩸:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, p1}, Ll/᩶۬᩷;->֫(Ll/ܶ᩵ܿ;)V

    .line 226
    iget-object p0, p0, Ll/֫۫᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    const/4 p0, 0x1

    .line 227
    invoke-virtual {v0, p0}, Ll/ܿۛ᩷;->ۧ(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const/4 p1, 0x0

    .line 546
    invoke-virtual {v0, p0, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/֫۫᩷;)Ll/֡ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۫᩷;->ۙ:Ll/֡ۚۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֫۫᩷;)Ll/ܿۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/֫۫᩷;)Ll/᩶۬᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۫᩷;->᩶:Ll/᩶۬᩷;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֫۫᩷;)Landroid/widget/BaseAdapter;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۫᩷;->᩹:Landroid/widget/BaseAdapter;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/֫۫᩷;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .line 219
    iget-object p1, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹۬᩷;

    .line 220
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    iget-object p3, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    invoke-direct {p2, p3}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p4, 0x7f12026b

    .line 221
    invoke-virtual {p2, p4}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object p4, p1, Ll/᩹۬᩷;->᩹:Ljava/lang/String;

    const/4 p5, 0x1

    new-array p5, p5, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p4, p5, v0

    const p4, 0x7f12026c

    .line 222
    invoke-virtual {p3, p4, p5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p3, Ll/۬۬᩷;

    invoke-direct {p3, p0, p1}, Ll/۬۬᩷;-><init>(Ll/֫۫᩷;Ll/᩹۬᩷;)V

    const p1, 0x7f12070a

    .line 223
    invoke-virtual {p2, p1, p3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p3, 0x0

    .line 231
    invoke-virtual {p2, p1, p3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 232
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 9

    .line 155
    new-instance v0, Ll/᩸ۖ;

    .line 68
    iget-object v1, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 156
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v3, 0x7f12026b

    invoke-interface {v1, v2, v3, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 157
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v3, 0x7f120268

    invoke-interface {v1, v2, v3, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 158
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v3, 0x7f12026a

    invoke-interface {v1, v2, v3, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 159
    new-instance v8, Ll/ۗ۬᩷;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Ll/ۗ۬᩷;-><init>(Ll/֫۫᩷;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    invoke-virtual {v0, v8}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 173
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫()V
    .locals 2

    .line 88
    iget-object v0, p0, Ll/֫۫᩷;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    new-instance v0, Ll/ۙ۬᩷;

    invoke-direct {v0, p0}, Ll/ۙ۬᩷;-><init>(Ll/֫۫᩷;)V

    iget-object v1, p0, Ll/֫۫᩷;->᩸:Ll/ܿۛ᩷;

    invoke-virtual {v1, v0}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/Runnable;)V

    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Ll/֫۫᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 92
    invoke-static {v0}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void
.end method
