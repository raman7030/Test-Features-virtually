.class public final Ll/֡᩷᩻;
.super Ljava/lang/Object;
.source "BAH0"


# instance fields
.field public ֫:Z

.field public final ۜ:Ll/ۗۢ᩻;

.field public ۧ:Z

.field public ܳ:Ll/ܿۜ᩻;

.field public ܽ:Z

.field public ܿ:[Landroid/widget/TextView;

.field public final ᩳ:Ll/ܳ۠ܳ;

.field public ᩷:Ll/ܽۢܳ;

.field public final ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    .line 37
    iput-object p1, p0, Ll/֡᩷᩻;->᩷:Ll/ܽۢܳ;

    .line 38
    iput-object p2, p0, Ll/֡᩷᩻;->᩻:Ljava/util/List;

    .line 40
    invoke-virtual {p1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p2

    check-cast p2, Ll/ۗۢ᩻;

    iput-object p2, p0, Ll/֡᩷᩻;->ۜ:Ll/ۗۢ᩻;

    .line 41
    invoke-virtual {p2}, Ll/ۗۢ᩻;->᩹()Z

    move-result v0

    iput-boolean v0, p0, Ll/֡᩷᩻;->ۧ:Z

    .line 42
    invoke-virtual {p2}, Ll/ۗۢ᩻;->᩶()Z

    move-result v0

    iput-boolean v0, p0, Ll/֡᩷᩻;->֫:Z

    .line 43
    invoke-virtual {p2}, Ll/ۗۢ᩻;->ۗ()Z

    move-result p2

    iput-boolean p2, p0, Ll/֡᩷᩻;->ܽ:Z

    .line 45
    new-instance p2, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 46
    invoke-virtual {p2}, Ll/ܳ۠ܳ;->᩻()V

    .line 47
    invoke-virtual {p2}, Ll/ܳ۠ܳ;->ܳ()V

    iput-object p2, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    return-void
.end method

.method public static ֫(Ll/֡᩷᩻;)V
    .locals 3

    .line 239
    new-instance v0, Ll/۠ۜ᩻;

    iget-object v1, p0, Ll/֡᩷᩻;->᩷:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/֡᩷᩻;->᩻:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/۠ۜ᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v1, Ll/᩷᩷᩻;

    invoke-direct {v1, p0}, Ll/᩷᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v0, v1}, Ll/۠ۜ᩻;->֫(Ll/᩷᩷᩻;)V

    return-void
.end method

.method public static ֫(Ll/֡᩷᩻;Landroid/view/MenuItem;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/֡᩷᩻;->᩻:Ljava/util/List;

    .line 4
    iget-object v1, p0, Ll/֡᩷᩻;->᩷:Ll/ܽۢܳ;

    .line 218
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v2, 0x7f1205eb

    if-ne p1, v2, :cond_0

    .line 239
    new-instance p1, Ll/۠ۜ᩻;

    invoke-direct {p1, v1, v0}, Ll/۠ۜ᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v0, Ll/᩷᩷᩻;

    invoke-direct {v0, p0}, Ll/᩷᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {p1, v0}, Ll/۠ۜ᩻;->֫(Ll/᩷᩷᩻;)V

    goto :goto_0

    :cond_0
    const v2, 0x7f1205ea

    if-ne p1, v2, :cond_1

    .line 244
    new-instance p1, Ll/ۧ᩷᩻;

    invoke-direct {p1, v1, v0}, Ll/ۧ᩷᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v0, Ll/᩷᩷᩻;

    invoke-direct {v0, p0}, Ll/᩷᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {p1, v0}, Ll/ۧ᩷᩻;->֫(Ll/᩷᩷᩻;)V

    goto :goto_0

    :cond_1
    const v2, 0x7f1205e9

    if-ne p1, v2, :cond_2

    .line 249
    new-instance p1, Ll/ۗۜ᩻;

    invoke-direct {p1, v1, v0}, Ll/ۗۜ᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v0, Ll/᩷᩷᩻;

    invoke-direct {v0, p0}, Ll/᩷᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {p1, v0}, Ll/ۗۜ᩻;->֫(Ll/᩷᩷᩻;)V

    :goto_0
    return-void

    .line 226
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method public static synthetic ֫(Ll/֡᩷᩻;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    invoke-static {p3, p1}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 87
    invoke-static {p4, p2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 88
    iget-boolean p0, p0, Ll/֡᩷᩻;->֫:Z

    if-nez p0, :cond_0

    const/4 p0, 0x4

    .line 89
    invoke-virtual {p5, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/֡᩷᩻;Ll/۟֨ܳ;)V
    .locals 2

    .line 257
    invoke-virtual {p1}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object p1

    iget-object p0, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    invoke-virtual {p0}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֡᩷᩻;Ll/ܽۜܳ;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    invoke-virtual {p1}, Ll/ܽۜܳ;->ܿ()Landroid/text/SpannableString;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-boolean p0, p0, Ll/֡᩷᩻;->ۧ:Z

    if-nez p0, :cond_0

    const/4 p0, 0x4

    .line 131
    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֡᩷᩻;ZLandroid/view/View;)V
    .locals 3

    .line 206
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p2, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 207
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p2

    .line 208
    iget-boolean v1, p0, Ll/֡᩷᩻;->ܽ:Z

    if-eqz v1, :cond_0

    const v1, 0x7f1205eb

    .line 209
    invoke-interface {p2, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_0
    if-eqz p1, :cond_1

    .line 211
    iget-boolean v1, p0, Ll/֡᩷᩻;->ۧ:Z

    if-eqz v1, :cond_1

    const v1, 0x7f1205ea

    .line 212
    invoke-interface {p2, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_1
    if-eqz p1, :cond_2

    .line 214
    iget-boolean p1, p0, Ll/֡᩷᩻;->֫:Z

    if-eqz p1, :cond_2

    const p1, 0x7f1205e9

    .line 215
    invoke-interface {p2, v2, p1, v2, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 217
    :cond_2
    new-instance p1, Ll/᩻᩷᩻;

    invoke-direct {p1, p0}, Ll/᩻᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 230
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static ۧ(Ll/֡᩷᩻;)V
    .locals 4

    .line 254
    iget-object v0, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    iget-object v1, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    if-eqz v1, :cond_2

    .line 255
    iget-boolean v1, p0, Ll/֡᩷᩻;->ܽ:Z

    if-eqz v1, :cond_0

    .line 256
    new-instance v1, Ll/ۢ᩷᩻;

    invoke-direct {v1, p0}, Ll/ۢ᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(Ll/۬ۤ;)V

    .line 260
    :cond_0
    iget-boolean v1, p0, Ll/֡᩷᩻;->ۧ:Z

    if-eqz v1, :cond_1

    .line 261
    iget-object v1, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    invoke-virtual {v1}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 263
    new-instance v2, Ll/ۛ᩻֫;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/ۛ᩻֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ܳ۠ܳ;->ܽ(Ll/۬ۤ;)V

    .line 268
    :cond_1
    iget-boolean v1, p0, Ll/֡᩷᩻;->֫:Z

    if-eqz v1, :cond_2

    .line 269
    iget-object v1, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    invoke-virtual {v1}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 271
    new-instance v2, Ll/ۨ᩻֫;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/ۨ᩻֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ܳ۠ܳ;->ۧ(Ll/۬ۤ;)V

    :cond_2
    const/16 v0, 0x3e8

    .line 278
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(I)V

    .line 279
    iget-object p0, p0, Ll/֡᩷᩻;->ۜ:Ll/ۗۢ᩻;

    invoke-virtual {p0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/֡᩷᩻;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    invoke-static {p3, p1}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 139
    invoke-static {p4, p2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 140
    iget-boolean p0, p0, Ll/֡᩷᩻;->֫:Z

    if-nez p0, :cond_0

    const/4 p0, 0x4

    .line 141
    invoke-virtual {p5, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ۧ(Ll/֡᩷᩻;Ll/ܽۜܳ;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    invoke-virtual {p1}, Ll/ܽۜܳ;->ܿ()Landroid/text/SpannableString;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    iget-boolean p0, p0, Ll/֡᩷᩻;->ۧ:Z

    if-nez p0, :cond_0

    const/4 p0, 0x4

    .line 79
    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static ܽ(Ll/֡᩷᩻;)V
    .locals 3

    .line 249
    new-instance v0, Ll/ۗۜ᩻;

    iget-object v1, p0, Ll/֡᩷᩻;->᩷:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/֡᩷᩻;->᩻:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/ۗۜ᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v1, Ll/᩷᩷᩻;

    invoke-direct {v1, p0}, Ll/᩷᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v0, v1}, Ll/ۗۜ᩻;->֫(Ll/᩷᩷᩻;)V

    return-void
.end method

.method public static ᩳ(Ll/֡᩷᩻;)V
    .locals 3

    .line 244
    new-instance v0, Ll/ۧ᩷᩻;

    iget-object v1, p0, Ll/֡᩷᩻;->᩷:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/֡᩷᩻;->᩻:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/ۧ᩷᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance v1, Ll/᩷᩷᩻;

    invoke-direct {v1, p0}, Ll/᩷᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v0, v1}, Ll/ۧ᩷᩻;->֫(Ll/᩷᩷᩻;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 51
    iget-object v0, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ᩳ()V

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 7

    .line 290
    iget-object v0, p0, Ll/֡᩷᩻;->ܿ:[Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const v0, 0x7f1207be

    .line 292
    iget-object v4, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    invoke-virtual {v4, v0}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    const v5, 0x7f1207b1

    .line 293
    invoke-virtual {v4, v5}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f1207b2

    .line 294
    invoke-virtual {v4, v6}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v4

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/widget/TextView;

    aput-object v0, v6, v3

    aput-object v5, v6, v2

    aput-object v4, v6, v1

    iput-object v6, p0, Ll/֡᩷᩻;->ܿ:[Landroid/widget/TextView;

    .line 297
    :cond_0
    iget-object v0, p0, Ll/֡᩷᩻;->ܿ:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-static {v0, p3, p4}, Ll/ܺ۫ܳ;->ۧ(Landroid/widget/TextView;J)V

    .line 298
    iget-object p3, p0, Ll/֡᩷᩻;->ܿ:[Landroid/widget/TextView;

    aget-object p3, p3, v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    iget-object p1, p0, Ll/֡᩷᩻;->ܿ:[Landroid/widget/TextView;

    aget-object p1, p1, v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 283
    iget-object v0, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 165
    iget-object v0, p0, Ll/֡᩷᩻;->᩻:Ljava/util/List;

    iget-object v1, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 166
    invoke-virtual {v1, p1, v0}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    const-wide/16 v2, 0x0

    .line 167
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 168
    new-instance p1, Ll/ᩴۛ֫;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, Ll/ᩴۛ֫;-><init>(I)V

    const v0, 0x7f1207b1

    invoke-virtual {v1, v0, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    const/16 v0, 0x8

    .line 170
    invoke-virtual {p1, v0}, Ll/۟֨ܳ;->֫(I)V

    .line 171
    new-instance p1, Ll/᩵ۡ᩷;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f1207b2

    invoke-virtual {v1, v0, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 174
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->᩷()V

    .line 175
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    const/4 p1, 0x1

    .line 176
    invoke-virtual {p0, p1}, Ll/֡᩷᩻;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/ᩳۜܳ;)V
    .locals 6

    .line 58
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_7

    instance-of v0, p1, Ll/ܿۜ᩻;

    if-eqz v0, :cond_7

    check-cast p1, Ll/ܿۜ᩻;

    .line 61
    iput-object p1, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    .line 63
    iget-object v0, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    .line 64
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f12051a

    goto :goto_0

    :cond_0
    const v1, 0x7f120393

    :goto_0
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    .line 65
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 66
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    .line 67
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 69
    :cond_1
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 70
    iput-boolean v2, p0, Ll/֡᩷᩻;->ۧ:Z

    .line 71
    iput-boolean v2, p0, Ll/֡᩷᩻;->֫:Z

    .line 72
    iput-boolean v2, p0, Ll/֡᩷᩻;->ܽ:Z

    .line 74
    :cond_2
    invoke-virtual {p1}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 76
    new-instance v3, Ll/ۡ᩷᩻;

    invoke-direct {v3, p0, v1}, Ll/ۡ᩷᩻;-><init>(Ll/֡᩷᩻;Ll/ܽۜܳ;)V

    invoke-virtual {v0, v3}, Ll/ܳ۠ܳ;->֫(Ll/ܿ۠ܳ;)Ll/ᩳ۠ܳ;

    move-result-object v3

    const/16 v4, 0x8

    .line 81
    invoke-virtual {v3, v4}, Ll/ᩳ۠ܳ;->֫(I)V

    .line 82
    invoke-virtual {v1}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-virtual {v1}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 84
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 85
    :cond_3
    new-instance v4, Ll/ܺ᩷᩻;

    invoke-direct {v4, p0, v3, v1}, Ll/ܺ᩷᩻;-><init>(Ll/֡᩷᩻;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ll/ܳ۠ܳ;->֫(Ll/ܽ۠ܳ;)Ll/ۧ۠ܳ;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ll/ۧ۠ܳ;->ᩳ()V

    goto :goto_1

    .line 94
    :cond_4
    iput-boolean v2, p0, Ll/֡᩷᩻;->ۧ:Z

    .line 95
    iput-boolean v2, p0, Ll/֡᩷᩻;->֫:Z

    .line 97
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 98
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnClickListener;)Ll/۟֨ܳ;

    move-result-object p1

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Ll/۟֨ܳ;->֫(I)V

    .line 100
    :cond_6
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ܿ()V

    .line 101
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    .line 102
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Ll/֡᩷᩻;->᩷:Ll/ܽۢܳ;

    iget-object v1, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    invoke-static {p1, v0, v1}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    .line 103
    invoke-virtual {p0, v2}, Ll/֡᩷᩻;->֫(Z)V

    return-void

    .line 59
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 2

    .line 180
    iget-boolean v0, p0, Ll/֡᩷᩻;->ܽ:Z

    iget-object v1, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    if-eqz v0, :cond_0

    .line 181
    new-instance v0, Ll/ᩴ᩷᩻;

    invoke-direct {v0, p0}, Ll/ᩴ᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(Ll/۬ۤ;)V

    .line 186
    :cond_0
    iget-boolean v0, p0, Ll/֡᩷᩻;->ۧ:Z

    if-eqz v0, :cond_1

    .line 187
    new-instance v0, Ll/᩵᩷᩻;

    invoke-direct {v0, p0}, Ll/᩵᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->ܽ(Ll/۬ۤ;)V

    .line 194
    :cond_1
    iget-boolean v0, p0, Ll/֡᩷᩻;->֫:Z

    if-eqz v0, :cond_2

    .line 195
    new-instance v0, Ll/ܽ᩷᩻;

    invoke-direct {v0, p0}, Ll/ܽ᩷᩻;-><init>(Ll/֡᩷᩻;)V

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->ۧ(Ll/۬ۤ;)V

    .line 204
    :cond_2
    iget-boolean v0, p0, Ll/֡᩷᩻;->ܽ:Z

    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    iget-boolean v0, p0, Ll/֡᩷᩻;->ۧ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/֡᩷᩻;->֫:Z

    if-eqz v0, :cond_3

    goto :goto_0

    .line 233
    :cond_3
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܽ()Landroid/widget/Button;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 205
    :cond_4
    :goto_0
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܽ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ᩳ᩷᩻;

    invoke-direct {v1, p0, p1}, Ll/ᩳ᩷᩻;-><init>(Ll/֡᩷᩻;Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ۧ(Ll/ᩳۜܳ;)V
    .locals 6

    .line 110
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_7

    instance-of v0, p1, Ll/ܿۜ᩻;

    if-eqz v0, :cond_7

    check-cast p1, Ll/ܿۜ᩻;

    .line 113
    iput-object p1, p0, Ll/֡᩷᩻;->ܳ:Ll/ܿۜ᩻;

    .line 115
    iget-object v0, p0, Ll/֡᩷᩻;->ᩳ:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    .line 116
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f12051a

    goto :goto_0

    :cond_0
    const v1, 0x7f1203fb

    :goto_0
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    const-wide/16 v1, 0x0

    .line 117
    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 118
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    .line 119
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 121
    :cond_1
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 122
    iput-boolean v2, p0, Ll/֡᩷᩻;->ۧ:Z

    .line 123
    iput-boolean v2, p0, Ll/֡᩷᩻;->֫:Z

    .line 124
    iput-boolean v2, p0, Ll/֡᩷᩻;->ܽ:Z

    .line 126
    :cond_2
    invoke-virtual {p1}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    const/16 v3, 0x8

    if-eqz v1, :cond_4

    .line 128
    new-instance v4, Ll/ۖ᩷᩻;

    invoke-direct {v4, p0, v1}, Ll/ۖ᩷᩻;-><init>(Ll/֡᩷᩻;Ll/ܽۜܳ;)V

    invoke-virtual {v0, v4}, Ll/ܳ۠ܳ;->֫(Ll/ܿ۠ܳ;)Ll/ᩳ۠ܳ;

    move-result-object v4

    .line 133
    invoke-virtual {v4, v3}, Ll/ᩳ۠ܳ;->֫(I)V

    .line 134
    invoke-virtual {v1}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v4

    .line 135
    invoke-virtual {v1}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 136
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 137
    :cond_3
    new-instance v5, Ll/ۘ᩷᩻;

    invoke-direct {v5, p0, v4, v1}, Ll/ۘ᩷᩻;-><init>(Ll/֡᩷᩻;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ll/ܳ۠ܳ;->֫(Ll/ܽ۠ܳ;)Ll/ۧ۠ܳ;

    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ll/ۧ۠ܳ;->ᩳ()V

    goto :goto_1

    .line 146
    :cond_4
    iput-boolean v2, p0, Ll/֡᩷᩻;->ۧ:Z

    .line 147
    iput-boolean v2, p0, Ll/֡᩷᩻;->֫:Z

    .line 149
    :cond_5
    :goto_1
    new-instance v1, Ll/ᩴ᩸ܿ;

    const/4 v4, 0x4

    invoke-direct {v1, v4}, Ll/ᩴ᩸ܿ;-><init>(I)V

    const v4, 0x7f1207b1

    invoke-virtual {v0, v4, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object v1

    .line 151
    invoke-virtual {v1, v3}, Ll/۟֨ܳ;->֫(I)V

    .line 152
    new-instance v1, Ll/ܰۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const v3, 0x7f1207b2

    invoke-virtual {v0, v3, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 155
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 156
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnClickListener;)Ll/۟֨ܳ;

    move-result-object p1

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Ll/۟֨ܳ;->֫(I)V

    .line 158
    :cond_6
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->᩷()V

    .line 159
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    .line 160
    invoke-virtual {p0, v2}, Ll/֡᩷᩻;->֫(Z)V

    return-void

    .line 111
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
