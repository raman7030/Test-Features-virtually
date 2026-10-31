.class public final Ll/֫ۧ᩻;
.super Ljava/lang/Object;
.source "65FC"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public final ܳ:Ljava/util/List;

.field public final ܽ:Ll/ܳ۠ܳ;

.field public ܿ:Ll/ۢۧ᩻;

.field public ᩳ:[Landroid/widget/TextView;

.field public ᩻:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Ll/֫ۧ᩻;->ۧ:Z

    .line 37
    iput-boolean v0, p0, Ll/֫ۧ᩻;->֫:Z

    .line 40
    iput-object p1, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    .line 41
    iput-object p2, p0, Ll/֫ۧ᩻;->ܳ:Ljava/util/List;

    .line 42
    new-instance p2, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 43
    invoke-virtual {p2}, Ll/ܳ۠ܳ;->᩻()V

    .line 44
    invoke-virtual {p2}, Ll/ܳ۠ܳ;->ܳ()V

    iput-object p2, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    return-void
.end method

.method public static ֫(Ll/֫ۧ᩻;)V
    .locals 3

    .line 292
    new-instance v0, Ll/᩻֫᩻;

    iget-object v1, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/֫ۧ᩻;->ܳ:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/᩻֫᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v1, Ll/֨۠ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩻֫᩻;->֫(Ll/֨۠ᩳ;)V

    return-void
.end method

.method public static ֫(Ll/֫ۧ᩻;Landroid/view/MenuItem;)V
    .locals 4

    .line 2
    iget-object v0, p0, Ll/֫ۧ᩻;->ܳ:Ljava/util/List;

    .line 4
    iget-object v1, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    .line 274
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    const v3, 0x7f1205eb

    if-ne v2, v3, :cond_0

    .line 292
    new-instance p1, Ll/᩻֫᩻;

    invoke-direct {p1, v1, v0}, Ll/᩻֫᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v0, Ll/֨۠ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩻֫᩻;->֫(Ll/֨۠ᩳ;)V

    goto :goto_0

    .line 276
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v2, 0x7f1205ea

    if-ne p1, v2, :cond_1

    .line 297
    new-instance p1, Ll/ܶ֫᩻;

    invoke-direct {p1, v1, v0}, Ll/ܶ֫᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v0, Ll/֨۠ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ܶ֫᩻;->֫(Ll/֨۠ᩳ;)V

    goto :goto_0

    .line 302
    :cond_1
    new-instance p1, Ll/ۡ֫᩻;

    invoke-direct {p1, v1, v0}, Ll/ۡ֫᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v0, Ll/֨۠ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۡ֫᩻;->֫(Ll/֨۠ᩳ;)V

    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/֫ۧ᩻;Ll/۟֨ܳ;)V
    .locals 2

    .line 310
    invoke-virtual {p1}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object p1

    iget-object p0, p0, Ll/֫ۧ᩻;->ܿ:Ll/ۢۧ᩻;

    invoke-virtual {p0}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ֫(Ll/֫ۧ᩻;ZLandroid/view/View;)V
    .locals 3

    .line 264
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p2, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 265
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p2

    .line 266
    iget-boolean v1, p0, Ll/֫ۧ᩻;->ۧ:Z

    if-eqz v1, :cond_0

    const v1, 0x7f1205eb

    .line 267
    invoke-interface {p2, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_0
    if-eqz p1, :cond_1

    .line 269
    iget-boolean p1, p0, Ll/֫ۧ᩻;->֫:Z

    if-eqz p1, :cond_1

    const p1, 0x7f1205ea

    .line 270
    invoke-interface {p2, v2, p1, v2, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const p1, 0x7f1205e9

    .line 271
    invoke-interface {p2, v2, p1, v2, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 273
    :cond_1
    new-instance p1, Ll/᩸᩸ۜ;

    invoke-direct {p1, p0}, Ll/᩸᩸ۜ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 283
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method private ֫(Z)V
    .locals 2

    .line 240
    iget-boolean v0, p0, Ll/֫ۧ᩻;->ۧ:Z

    iget-object v1, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    if-eqz v0, :cond_0

    .line 241
    new-instance v0, Ll/᩸֫᩻;

    invoke-direct {v0, p0}, Ll/᩸֫᩻;-><init>(Ll/֫ۧ᩻;)V

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(Ll/۬ۤ;)V

    .line 246
    :cond_0
    iget-boolean v0, p0, Ll/֫ۧ᩻;->֫:Z

    if-eqz v0, :cond_1

    .line 247
    new-instance v0, Ll/᩹֫᩻;

    invoke-direct {v0, p0}, Ll/᩹֫᩻;-><init>(Ll/֫ۧ᩻;)V

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->ܽ(Ll/۬ۤ;)V

    .line 253
    new-instance v0, Ll/᩶֫᩻;

    invoke-direct {v0, p0}, Ll/᩶֫᩻;-><init>(Ll/֫ۧ᩻;)V

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->ۧ(Ll/۬ۤ;)V

    .line 262
    :cond_1
    iget-boolean v0, p0, Ll/֫ۧ᩻;->ۧ:Z

    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    iget-boolean v0, p0, Ll/֫ۧ᩻;->֫:Z

    if-eqz v0, :cond_2

    goto :goto_0

    .line 286
    :cond_2
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܽ()Landroid/widget/Button;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 263
    :cond_3
    :goto_0
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܽ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۙ֫᩻;

    invoke-direct {v1, p0, p1}, Ll/ۙ֫᩻;-><init>(Ll/֫ۧ᩻;Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ۧ(Ll/֫ۧ᩻;)V
    .locals 2

    .line 307
    iget-object v0, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    iget-object v1, p0, Ll/֫ۧ᩻;->ܿ:Ll/ۢۧ᩻;

    if-eqz v1, :cond_1

    .line 308
    iget-boolean v1, p0, Ll/֫ۧ᩻;->ۧ:Z

    if-eqz v1, :cond_0

    .line 309
    new-instance v1, Ll/۫֫᩻;

    invoke-direct {v1, p0}, Ll/۫֫᩻;-><init>(Ll/֫ۧ᩻;)V

    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(Ll/۬ۤ;)V

    .line 313
    :cond_0
    iget-boolean v1, p0, Ll/֫ۧ᩻;->֫:Z

    if-eqz v1, :cond_1

    .line 314
    iget-object p0, p0, Ll/֫ۧ᩻;->ܿ:Ll/ۢۧ᩻;

    invoke-virtual {p0}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object p0

    .line 315
    new-instance v1, Ll/ۤ֫᩻;

    invoke-direct {v1, p0}, Ll/ۤ֫᩻;-><init>(Ll/ܽۜܳ;)V

    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->ܽ(Ll/۬ۤ;)V

    .line 318
    new-instance v1, Ll/ۛ֫᩻;

    invoke-direct {v1, p0}, Ll/ۛ֫᩻;-><init>(Ll/ܽۜܳ;)V

    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->ۧ(Ll/۬ۤ;)V

    :cond_1
    const/16 p0, 0x3e8

    .line 324
    invoke-static {p0}, Ll/۫ۢܳ;->ܽ(I)V

    .line 325
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public static ܽ(Ll/֫ۧ᩻;)V
    .locals 3

    .line 302
    new-instance v0, Ll/ۡ֫᩻;

    iget-object v1, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/֫ۧ᩻;->ܳ:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/ۡ֫᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v1, Ll/֨۠ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۡ֫᩻;->֫(Ll/֨۠ᩳ;)V

    return-void
.end method

.method public static ܿ(Ll/֫ۧ᩻;)V
    .locals 6

    .line 349
    iget-object v0, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    iget-object v1, p0, Ll/֫ۧ᩻;->ܿ:Ll/ۢۧ᩻;

    invoke-virtual {v1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 183
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_2

    :cond_0
    const-string v4, "/"

    .line 186
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    .line 188
    :cond_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_7

    .line 191
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    const-string v5, "."

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, ".."

    .line 193
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 194
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    const-string v5, "./"

    .line 196
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x2

    .line 197
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    const-string v5, "../"

    .line 198
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x3

    .line 199
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 200
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    goto :goto_0

    .line 202
    :cond_5
    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 192
    :cond_6
    :goto_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 205
    :cond_7
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    :goto_2
    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 214
    invoke-static {v2, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    :goto_3
    if-nez v3, :cond_9

    return-void

    .line 353
    :cond_9
    iget-object p0, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {p0}, Ll/ܳ۠ܳ;->֫()V

    .line 354
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    const/4 v1, 0x1

    if-eqz p0, :cond_a

    .line 355
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 357
    :cond_a
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 359
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 360
    invoke-virtual {v0, p0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 362
    :cond_b
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method

.method public static ᩳ(Ll/֫ۧ᩻;)V
    .locals 3

    .line 297
    new-instance v0, Ll/ܶ֫᩻;

    iget-object v1, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/֫ۧ᩻;->ܳ:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/ܶ֫᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v1, Ll/֨۠ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/֨۠ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ܶ֫᩻;->֫(Ll/֨۠ᩳ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 48
    iget-object v0, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ᩳ()V

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 7

    .line 336
    iget-object v0, p0, Ll/֫ۧ᩻;->ᩳ:[Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const v0, 0x7f1207be

    .line 338
    iget-object v4, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {v4, v0}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    const v5, 0x7f1207b1

    .line 339
    invoke-virtual {v4, v5}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f1207b2

    .line 340
    invoke-virtual {v4, v6}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v4

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/widget/TextView;

    aput-object v0, v6, v3

    aput-object v5, v6, v2

    aput-object v4, v6, v1

    iput-object v6, p0, Ll/֫ۧ᩻;->ᩳ:[Landroid/widget/TextView;

    .line 343
    :cond_0
    iget-object v0, p0, Ll/֫ۧ᩻;->ᩳ:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-static {v0, p3, p4}, Ll/ܺ۫ܳ;->ۧ(Landroid/widget/TextView;J)V

    .line 344
    iget-object p3, p0, Ll/֫ۧ᩻;->ᩳ:[Landroid/widget/TextView;

    aget-object p3, p3, v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    iget-object p1, p0, Ll/֫ۧ᩻;->ᩳ:[Landroid/widget/TextView;

    aget-object p1, p1, v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 329
    iget-object v0, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 220
    iget-object v0, p0, Ll/֫ۧ᩻;->ܳ:Ljava/util/List;

    iget-object v1, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 221
    invoke-virtual {v1, p1, v0}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    const-wide/16 v2, 0x0

    .line 222
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 223
    new-instance v0, Ll/ۗۧᩳ;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Ll/ۗۧᩳ;-><init>(I)V

    const v2, 0x7f1207b1

    invoke-virtual {v1, v2, v0}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object v0

    const/16 v2, 0x8

    .line 225
    invoke-virtual {v0, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 226
    new-instance v0, Ll/ᩳ᩷ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const v2, 0x7f1207b2

    invoke-virtual {v1, v2, v0}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 229
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->᩷()V

    .line 230
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 231
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 232
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 0
    instance-of p1, p1, Ll/۬ܶܿ;

    if-nez p1, :cond_0

    .line 233
    iput-boolean v0, p0, Ll/֫ۧ᩻;->֫:Z

    .line 234
    iput-boolean v0, p0, Ll/֫ۧ᩻;->ۧ:Z

    :cond_0
    const/4 p1, 0x1

    .line 236
    invoke-direct {p0, p1}, Ll/֫ۧ᩻;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/ᩳۜܳ;)V
    .locals 10

    .line 55
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_a

    instance-of v0, p1, Ll/ۢۧ᩻;

    if-eqz v0, :cond_a

    check-cast p1, Ll/ۢۧ᩻;

    .line 58
    iput-object p1, p0, Ll/֫ۧ᩻;->ܿ:Ll/ۢۧ᩻;

    .line 59
    invoke-virtual {p1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 60
    iget-object v1, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {v1, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    .line 61
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f12051a

    goto :goto_0

    :cond_0
    const v2, 0x7f120393

    :goto_0
    invoke-virtual {v1, v2}, Ll/ܳ۠ܳ;->֫(I)V

    .line 62
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    .line 63
    invoke-virtual {p1}, Ll/ܺۘܳ;->ܳۧ()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-eqz v8, :cond_1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    .line 65
    new-instance v6, Ll/ۛ֨ܳ;

    const/4 v7, 0x1

    invoke-direct {v6, v7, v2, v3}, Ll/ۛ֨ܳ;-><init>(IJ)V

    const v2, 0x7f1207b5

    invoke-virtual {v1, v2, v6}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object v2

    const/16 v3, 0x8

    .line 67
    invoke-virtual {v2, v3}, Ll/۟֨ܳ;->֫(I)V

    .line 68
    new-instance v2, Ll/۬֫᩻;

    invoke-direct {v2, v4, v5}, Ll/۬֫᩻;-><init>(J)V

    const v4, 0x7f1207ad

    invoke-virtual {v1, v4, v2}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 71
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    move-result-object v2

    invoke-virtual {v2, v3}, Ll/۟֨ܳ;->֫(I)V

    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 74
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 76
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    invoke-virtual {p1}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v3

    invoke-static {v3}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_4

    .line 79
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 81
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    goto :goto_3

    .line 85
    :cond_2
    :try_start_0
    instance-of v3, v0, Ll/ۨᩴܿ;

    if-eqz v3, :cond_3

    move-object v3, v0

    check-cast v3, Ll/ۨᩴܿ;

    .line 86
    invoke-virtual {v3}, Ll/ۨᩴܿ;->᩶ۧ()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {p1}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 90
    :goto_2
    invoke-static {v3}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v3

    .line 91
    new-instance v6, Ll/ܽۜܳ;

    invoke-direct {v6, v3}, Ll/ܽۜܳ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {p1, v6}, Ll/ۢۧ᩻;->֫(Ll/ܽۜܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    goto :goto_4

    .line 95
    :catch_0
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    :goto_3
    const/4 v3, 0x0

    .line 98
    :goto_4
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v6

    iput-boolean v6, p0, Ll/֫ۧ᩻;->ۧ:Z

    goto :goto_5

    :cond_4
    const/4 v3, 0x1

    :goto_5
    const/4 v6, 0x6

    if-eqz v3, :cond_5

    .line 101
    invoke-virtual {p1}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v3

    .line 102
    new-instance v7, Ll/ۨ֫᩻;

    invoke-direct {v7, v3, v2}, Ll/ۨ֫᩻;-><init>(Ll/ܽۜܳ;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v7}, Ll/ܳ۠ܳ;->֫(Ll/ܿ۠ܳ;)Ll/ᩳ۠ܳ;

    move-result-object v7

    .line 105
    invoke-virtual {v7, v6}, Ll/ᩳ۠ܳ;->֫(I)V

    .line 106
    new-instance v7, Ll/᩺֫᩻;

    invoke-direct {v7, v3, v2}, Ll/᩺֫᩻;-><init>(Ll/ܽۜܳ;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v7}, Ll/ܳ۠ܳ;->֫(Ll/ܽ۠ܳ;)Ll/ۧ۠ܳ;

    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ll/ۧ۠ܳ;->ᩳ()V

    .line 112
    :cond_5
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v3

    const/4 v7, 0x4

    if-eqz v3, :cond_6

    .line 113
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v3

    new-instance v8, Ll/ۘۢ᩷;

    const/4 v9, 0x2

    invoke-direct {v8, v9, p0}, Ll/ۘۢ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3, v8}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnClickListener;)Ll/۟֨ܳ;

    move-result-object v3

    invoke-virtual {v3, v6}, Ll/۟֨ܳ;->֫(I)V

    .line 114
    iput-boolean v5, p0, Ll/֫ۧ᩻;->ۧ:Z

    .line 115
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    .line 116
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    .line 117
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_6

    .line 120
    :cond_6
    invoke-virtual {p1}, Ll/ۢۧ᩻;->ۜ()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 121
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܿ()V

    .line 122
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    .line 123
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object v1

    iget-object v3, p0, Ll/֫ۧ᩻;->᩻:Ll/ܽۢܳ;

    invoke-static {v1, v3, p1}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    goto :goto_7

    .line 125
    :cond_7
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    .line 127
    :goto_7
    iget-boolean p1, p0, Ll/֫ۧ᩻;->֫:Z

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 128
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 129
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    .line 131
    :cond_8
    invoke-direct {p0, v4}, Ll/֫ۧ᩻;->֫(Z)V

    goto :goto_9

    .line 133
    :cond_9
    invoke-direct {p0, v5}, Ll/֫ۧ᩻;->֫(Z)V

    :goto_9
    return-void

    .line 56
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)V
    .locals 9

    .line 139
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_9

    instance-of v0, p1, Ll/ۢۧ᩻;

    if-eqz v0, :cond_9

    check-cast p1, Ll/ۢۧ᩻;

    .line 142
    iput-object p1, p0, Ll/֫ۧ᩻;->ܿ:Ll/ۢۧ᩻;

    .line 143
    invoke-virtual {p1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 144
    iget-object v1, p0, Ll/֫ۧ᩻;->ܽ:Ll/ܳ۠ܳ;

    invoke-virtual {v1, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    .line 145
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f12051a

    goto :goto_0

    :cond_0
    const v2, 0x7f1203fb

    :goto_0
    invoke-virtual {v1, v2}, Ll/ܳ۠ܳ;->֫(I)V

    const-wide/16 v2, 0x0

    .line 146
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 147
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 149
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    invoke-virtual {p1}, Ll/ۢۧ᩻;->ܿ()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    .line 153
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    .line 154
    iput-boolean v5, p0, Ll/֫ۧ᩻;->ۧ:Z

    const/4 v3, 0x0

    goto :goto_4

    .line 155
    :cond_1
    invoke-virtual {p1}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v3

    invoke-static {v3}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 156
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 158
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    goto :goto_2

    .line 162
    :cond_2
    :try_start_0
    instance-of v3, v0, Ll/ۨᩴܿ;

    if-eqz v3, :cond_3

    move-object v3, v0

    check-cast v3, Ll/ۨᩴܿ;

    .line 163
    invoke-virtual {v3}, Ll/ۨᩴܿ;->᩶ۧ()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 165
    :cond_3
    invoke-virtual {p1}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 167
    :goto_1
    invoke-static {v3}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v3

    .line 168
    new-instance v6, Ll/ܽۜܳ;

    invoke-direct {v6, v3}, Ll/ܽۜܳ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {p1, v6}, Ll/ۢۧ᩻;->֫(Ll/ܽۜܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    goto :goto_3

    .line 172
    :catch_0
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    :goto_2
    const/4 v3, 0x0

    .line 175
    :goto_3
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v6

    iput-boolean v6, p0, Ll/֫ۧ᩻;->ۧ:Z

    goto :goto_4

    :cond_4
    const/4 v3, 0x1

    :goto_4
    const/4 v6, 0x6

    if-eqz v3, :cond_5

    .line 178
    invoke-virtual {p1}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v3

    .line 179
    new-instance v7, Ll/ܰ֫᩻;

    invoke-direct {v7, v3, v2}, Ll/ܰ֫᩻;-><init>(Ll/ܽۜܳ;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v7}, Ll/ܳ۠ܳ;->֫(Ll/ܿ۠ܳ;)Ll/ᩳ۠ܳ;

    move-result-object v7

    .line 182
    invoke-virtual {v7, v6}, Ll/ᩳ۠ܳ;->֫(I)V

    .line 183
    new-instance v7, Ll/۟֫᩻;

    invoke-direct {v7, v3, v2}, Ll/۟֫᩻;-><init>(Ll/ܽۜܳ;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v7}, Ll/ܳ۠ܳ;->֫(Ll/ܽ۠ܳ;)Ll/ۧ۠ܳ;

    move-result-object v3

    .line 187
    invoke-virtual {v3}, Ll/ۧ۠ܳ;->ᩳ()V

    .line 190
    :cond_5
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v3

    const/4 v7, 0x4

    if-eqz v3, :cond_6

    .line 191
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ll/ۘۢ᩷;

    const/4 v8, 0x2

    invoke-direct {v3, v8, p0}, Ll/ۘۢ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, p1, v3}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnClickListener;)Ll/۟֨ܳ;

    move-result-object p1

    invoke-virtual {p1, v6}, Ll/۟֨ܳ;->֫(I)V

    .line 192
    iput-boolean v5, p0, Ll/֫ۧ᩻;->ۧ:Z

    .line 193
    iput-boolean v5, p0, Ll/֫ۧ᩻;->֫:Z

    .line 194
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 195
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 199
    :cond_6
    new-instance p1, Ll/ۧ۬֫;

    const/4 v3, 0x4

    invoke-direct {p1, v3}, Ll/ۧ۬֫;-><init>(I)V

    const v3, 0x7f1207b1

    invoke-virtual {v1, v3, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    const/16 v3, 0x8

    .line 201
    invoke-virtual {p1, v3}, Ll/۟֨ܳ;->֫(I)V

    .line 202
    new-instance p1, Ll/۫᩷ᩳ;

    const/4 v3, 0x3

    invoke-direct {p1, v3}, Ll/۫᩷ᩳ;-><init>(I)V

    const v3, 0x7f1207b2

    invoke-virtual {v1, v3, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 206
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->᩷()V

    .line 207
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    .line 208
    iget-boolean p1, p0, Ll/֫ۧ᩻;->֫:Z

    if-eqz p1, :cond_8

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 209
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 210
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_6

    .line 212
    :cond_7
    invoke-direct {p0, v4}, Ll/֫ۧ᩻;->֫(Z)V

    goto :goto_7

    .line 214
    :cond_8
    invoke-direct {p0, v5}, Ll/֫ۧ᩻;->֫(Z)V

    :goto_7
    return-void

    .line 140
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
