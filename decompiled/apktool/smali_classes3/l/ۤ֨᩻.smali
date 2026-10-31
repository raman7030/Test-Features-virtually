.class public final Ll/ۤ֨᩻;
.super Ljava/lang/Object;
.source "673L"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public final ۧ:Ll/֡ۚۢ;

.field public final ܳ:Ll/ۤۤᩳ;

.field public final ܽ:Ll/᩶ۗᩳ;

.field public final ܿ:Ll/ۚۖۡ;

.field public final ᩳ:Ll/ۤۤᩳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/᩶ۗᩳ;)V
    .locals 5

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Ll/ۤ֨᩻;->֫:Ll/ۗܺ᩷;

    .line 77
    iput-object p2, p0, Ll/ۤ֨᩻;->ܽ:Ll/᩶ۗᩳ;

    const p2, 0x7f0d00eb

    .line 78
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p2

    .line 79
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 80
    invoke-virtual {v0, p2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Z)V

    const v1, 0x7f12070a

    const/4 v2, 0x0

    .line 82
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    .line 83
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 84
    invoke-virtual {v0}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ֨᩻;->ۧ:Ll/֡ۚۢ;

    .line 86
    new-instance v1, Ll/ۙ֨᩻;

    invoke-direct {v1, p0}, Ll/ۙ֨᩻;-><init>(Ll/ۤ֨᩻;)V

    invoke-virtual {v0, v1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    const v0, 0x7f0a017d

    .line 94
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۚۖۡ;

    iput-object v0, p0, Ll/ۤ֨᩻;->ܿ:Ll/ۚۖۡ;

    const-string v1, "rpur"

    .line 248
    invoke-virtual {v0, v1, v2}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۢ()V

    const/16 v1, 0x11

    .line 98
    invoke-virtual {v0, v1}, Ll/ۚۖۡ;->֫(I)V

    .line 99
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    const/4 v1, 0x6

    .line 100
    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩸(I)V

    const/4 v2, 0x2

    .line 101
    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->᩵(I)V

    .line 102
    new-instance v2, Ll/ۗ֨᩻;

    invoke-direct {v2, p0}, Ll/ۗ֨᩻;-><init>(Ll/ۤ֨᩻;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const v0, 0x7f0a04aa

    .line 113
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۤۤᩳ;

    iput-object v0, p0, Ll/ۤ֨᩻;->ܳ:Ll/ۤۤᩳ;

    const/4 v2, 0x5

    .line 114
    invoke-virtual {v0, v2}, Ll/ۤۤᩳ;->᩸(I)V

    .line 147
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "rpua"

    const-string v4, "MT-RemotePayload/1"

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 149
    invoke-static {v2}, Ll/᩺ۚ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v4, v2

    .line 115
    :cond_0
    invoke-virtual {v0, v4}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a04a6

    .line 117
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۤۤᩳ;

    iput-object v0, p0, Ll/ۤ֨᩻;->ᩳ:Ll/ۤۤᩳ;

    .line 118
    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩸(I)V

    .line 155
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "rpdt"

    const/4 v3, 0x4

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_1

    const/16 v2, 0x10

    if-gt v1, v2, :cond_1

    move v3, v1

    .line 119
    :cond_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 120
    new-instance v1, Ll/۬֨᩻;

    invoke-direct {v1, p0}, Ll/۬֨᩻;-><init>(Ll/ۤ֨᩻;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const v0, 0x7f0a0257

    .line 130
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance v0, Ll/ۧۡۡ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۤ֨᩻;)V
    .locals 0

    .line 141
    invoke-direct {p0}, Ll/ۤ֨᩻;->ۧ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۤ֨᩻;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x42

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 105
    :cond_1
    :goto_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    .line 106
    invoke-direct {p0}, Ll/ۤ֨᩻;->ۧ()V

    :cond_2
    return p2
.end method

.method private ۧ()V
    .locals 11

    .line 163
    iget-object v0, p0, Ll/ۤ֨᩻;->֫:Ll/ۗܺ᩷;

    const/16 v1, 0x10

    .line 210
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 163
    iget-object v3, p0, Ll/ۤ֨᩻;->ᩳ:Ll/ۤۤᩳ;

    iget-object v4, p0, Ll/ۤ֨᩻;->ܿ:Ll/ۚۖۡ;

    invoke-virtual {v4}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 904
    :try_start_0
    invoke-static {v5}, Ll/ۨܰ᩵;->ܽ(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v6, 0x0

    :goto_0
    if-eqz v6, :cond_4

    .line 217
    invoke-virtual {v6}, Ll/ۨܰ᩵;->ᩴ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 218
    invoke-virtual {v6}, Ll/ۨܰ᩵;->ۜ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 219
    invoke-virtual {v6}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    .line 170
    iget-object v6, p0, Ll/ۤ֨᩻;->ܳ:Ll/ۤۤᩳ;

    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 171
    invoke-static {v7}, Ll/᩺ۚ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 172
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    const v0, 0x7f120857

    .line 173
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void

    :cond_0
    const/4 v6, 0x0

    const/4 v8, 0x1

    const v9, 0x7f120855

    .line 180
    :try_start_1
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 179
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-lt v10, v8, :cond_3

    if-le v10, v1, :cond_1

    goto :goto_1

    .line 192
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x7d0

    if-gt v0, v1, :cond_2

    .line 193
    invoke-virtual {v4, v5}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 194
    invoke-virtual {v4}, Ll/ۚۖۡ;->ܳ()V

    .line 196
    :cond_2
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "rpua"

    .line 197
    invoke-interface {v0, v1, v7}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "rpdt"

    .line 198
    invoke-interface {v0, v10, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 199
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 200
    iget-object v0, p0, Ll/ۤ֨᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 201
    iget-object v0, p0, Ll/ۤ֨᩻;->ܽ:Ll/᩶ۗᩳ;

    iget-object v0, v0, Ll/᩶ۗᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢܳ;

    .line 38
    new-instance v1, Ll/᩺֨᩻;

    invoke-direct {v1}, Ll/᩺֨᩻;-><init>()V

    .line 39
    new-instance v2, Ll/᩶֨᩻;

    invoke-direct {v2, v5, v7, v10, v1}, Ll/᩶֨᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ILl/᩺֨᩻;)V

    invoke-virtual {v0, v2}, Ll/ܽۢܳ;->֫(Ll/ᩳ᩷ܳ;)V

    return-void

    .line 206
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 207
    invoke-virtual {v3}, Ll/ۤۤᩳ;->ۖᩳ()V

    new-array v1, v8, [Ljava/lang/Object;

    aput-object v2, v1, v6

    .line 208
    invoke-virtual {v0, v9, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    .line 206
    :catch_1
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 207
    invoke-virtual {v3}, Ll/ۤۤᩳ;->ۖᩳ()V

    new-array v1, v8, [Ljava/lang/Object;

    aput-object v2, v1, v6

    .line 208
    invoke-virtual {v0, v9, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    .line 165
    :cond_4
    invoke-virtual {v4}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const v0, 0x7f120856

    .line 166
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۤ֨᩻;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x42

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 123
    :cond_1
    :goto_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    .line 124
    invoke-direct {p0}, Ll/ۤ֨᩻;->ۧ()V

    :cond_2
    return p2
.end method

.method public static synthetic ܽ(Ll/ۤ֨᩻;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 87
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 88
    iget-object p0, p0, Ll/ۤ֨᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 139
    iget-object v0, p0, Ll/ۤ֨᩻;->ܿ:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->᩷()V

    .line 140
    iget-object v1, p0, Ll/ۤ֨᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->᩷()V

    .line 141
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/۫֨᩻;

    invoke-direct {v2, p0}, Ll/۫֨᩻;-><init>(Ll/ۤ֨᩻;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method
