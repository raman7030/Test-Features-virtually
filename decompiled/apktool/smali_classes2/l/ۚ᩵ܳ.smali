.class public final Ll/ۚ᩵ܳ;
.super Ljava/lang/Object;
.source "715M"


# instance fields
.field public final ֡:Landroid/widget/ImageView;

.field public final ֨:Ljava/util/ArrayList;

.field public final ֫:Ll/ۗܺ᩷;

.field public final ۖ:Z

.field public final ۗ:Ll/ۜۡۡ;

.field public final ۘ:Landroid/widget/LinearLayout;

.field public final ۙ:Lcom/google/android/material/tabs/TabLayout;

.field public final ۚ:Landroid/graphics/drawable/Drawable;

.field public ۜ:Landroid/graphics/PorterDuffColorFilter;

.field public final ۠:Ljava/util/ArrayList;

.field public final ۡ:Landroid/widget/LinearLayout;

.field public final ۢ:Ll/ۛᩴܳ;

.field public final ۧ:Ll/ܳ᩷ۡ;

.field public final ܳ:Landroid/widget/ImageView;

.field public ܶ:Z

.field public final ܺ:Landroid/widget/LinearLayout;

.field public final ܽ:Landroid/view/View;

.field public final ܿ:Landroid/view/View;

.field public final ᩳ:Landroid/view/View;

.field public final ᩴ:Landroid/widget/HorizontalScrollView;

.field public final ᩵:Landroid/view/View;

.field public final ᩶:Landroid/view/View;

.field public final ᩷:Ll/ۡۤۡ;

.field public ᩸:Ljava/lang/String;

.field public final ᩹:Ll/᩻ۡۡ;

.field public final ᩻:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۛᩴܳ;Z)V
    .locals 11

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    .line 98
    invoke-static {}, Ll/ۡۤۡ;->ܿ()Ll/ۡۤۡ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ᩵ܳ;->᩷:Ll/ۡۤۡ;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚ᩵ܳ;->֨:Ljava/util/ArrayList;

    const-string v0, ""

    .line 108
    iput-object v0, p0, Ll/ۚ᩵ܳ;->᩸:Ljava/lang/String;

    .line 162
    iput-object p1, p0, Ll/ۚ᩵ܳ;->֫:Ll/ۗܺ᩷;

    .line 163
    iput-object p2, p0, Ll/ۚ᩵ܳ;->ۢ:Ll/ۛᩴܳ;

    .line 164
    iput-boolean p3, p0, Ll/ۚ᩵ܳ;->ۖ:Z

    const p2, 0x7f0a0091

    .line 165
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ܳ᩷ۡ;

    iput-object p2, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    const v0, 0x7f0a05a0

    .line 166
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    const v1, 0x7f0a0685

    .line 167
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۜۡۡ;

    iput-object v1, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    const v2, 0x7f0a03ae

    .line 168
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ᩵ܳ;->᩵:Landroid/view/View;

    const v3, 0x7f0a03af

    .line 169
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Ll/ۚ᩵ܳ;->֡:Landroid/widget/ImageView;

    const v4, 0x7f0a015c

    .line 170
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p0, Ll/ۚ᩵ܳ;->ܿ:Landroid/view/View;

    const v5, 0x7f0a015d

    .line 171
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, p0, Ll/ۚ᩵ܳ;->ܳ:Landroid/widget/ImageView;

    const v6, 0x7f0a04e6

    .line 172
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/᩻ۡۡ;

    iput-object v6, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    const v7, 0x7f0a0092

    .line 173
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iput-object v7, p0, Ll/ۚ᩵ܳ;->ܽ:Landroid/view/View;

    const v7, 0x7f0a0093

    .line 174
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    iput-object v7, p0, Ll/ۚ᩵ܳ;->ᩳ:Landroid/view/View;

    const v7, 0x7f0a0324

    .line 175
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/HorizontalScrollView;

    iput-object v7, p0, Ll/ۚ᩵ܳ;->ᩴ:Landroid/widget/HorizontalScrollView;

    const v8, 0x7f0a0321

    .line 176
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/LinearLayout;

    iput-object v8, p0, Ll/ۚ᩵ܳ;->ۡ:Landroid/widget/LinearLayout;

    const v8, 0x7f0a0322

    .line 177
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/LinearLayout;

    iput-object v8, p0, Ll/ۚ᩵ܳ;->ۘ:Landroid/widget/LinearLayout;

    const v8, 0x7f0a0323

    .line 178
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/LinearLayout;

    iput-object v8, p0, Ll/ۚ᩵ܳ;->ܺ:Landroid/widget/LinearLayout;

    const v8, 0x7f0a059f

    .line 179
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    iput-object v8, p0, Ll/ۚ᩵ܳ;->᩶:Landroid/view/View;

    .line 180
    new-instance v9, Ll/ܺᩴܳ;

    invoke-direct {v9, p0}, Ll/ܺᩴܳ;-><init>(Ll/ۚ᩵ܳ;)V

    invoke-virtual {p2, v9}, Ll/ܳ᩷ۡ;->֫(Ll/᩻᩷ۡ;)V

    .line 186
    invoke-virtual {p2}, Ll/ܳ᩷ۡ;->ܳ()F

    move-result v9

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-nez v9, :cond_0

    const/4 v9, 0x4

    .line 187
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const v9, 0x7f080220

    .line 191
    invoke-static {p1, v9}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {v9}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v9

    iput-object v9, p0, Ll/ۚ᩵ܳ;->ۚ:Landroid/graphics/drawable/Drawable;

    const/16 v10, 0x99

    .line 192
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 193
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const v3, 0x7f0801dd

    .line 196
    invoke-static {p1, v3}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Ll/ۚ᩵ܳ;->᩻:Landroid/graphics/drawable/Drawable;

    .line 197
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 198
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 351
    new-instance v3, Ll/᩶ᩴܳ;

    invoke-direct {v3, p0}, Ll/᩶ᩴܳ;-><init>(Ll/ۚ᩵ܳ;)V

    invoke-virtual {v6, v3}, Ll/᩻ۡۡ;->֫(Ll/ܿۡۡ;)V

    const/4 v3, 0x0

    .line 368
    invoke-direct {p0, v3}, Ll/ۚ᩵ܳ;->֫(Z)V

    .line 201
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    const/16 v5, 0x8

    if-eqz p3, :cond_1

    const/4 v9, 0x0

    goto :goto_0

    :cond_1
    const/16 v9, 0x8

    .line 202
    :goto_0
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    if-eqz p3, :cond_2

    .line 204
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    const/4 p3, 0x1

    .line 205
    invoke-virtual {v6, p3}, Ll/᩻ۡۡ;->֫(Z)V

    goto :goto_1

    .line 207
    :cond_2
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 208
    invoke-virtual {v6, v3}, Ll/᩻ۡۡ;->֫(Z)V

    .line 210
    :goto_1
    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    .line 211
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 212
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 545
    sget-object p3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "bottom_content_view_ratio_int"

    const/16 v4, 0x32

    invoke-interface {p3, v3, v4}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result p3

    int-to-float p3, p3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr p3, v3

    invoke-virtual {p2, p3}, Ll/ܳ᩷ۡ;->֫(F)V

    .line 546
    new-instance p3, Ll/֨ᩴܳ;

    const/4 v3, 0x0

    invoke-direct {p3, v3, p0, p2}, Ll/֨ᩴܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 641
    new-instance p3, Ll/۠ᩴܳ;

    invoke-direct {p3, p0}, Ll/۠ᩴܳ;-><init>(Ll/ۚ᩵ܳ;)V

    .line 721
    new-instance v2, Ll/ܶᩴܳ;

    invoke-direct {v2, p0, p3}, Ll/ܶᩴܳ;-><init>(Ll/ۚ᩵ܳ;Ll/۠ᩴܳ;)V

    invoke-virtual {p2, v2}, Ll/ܳ᩷ۡ;->֫(Ll/ܶᩴܳ;)V

    .line 216
    new-instance p2, Ll/᩹ᩴܳ;

    invoke-direct {p2, p0}, Ll/᩹ᩴܳ;-><init>(Ll/ۚ᩵ܳ;)V

    invoke-virtual {v1, p2}, Ll/֡ܰۧ;->֫(Ll/ۨ᩺ۧ;)V

    .line 250
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Ll/֡ܰۧ;)V

    .line 252
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ܳ()V

    .line 253
    new-instance p2, Ll/֡ᩴܳ;

    invoke-direct {p2, p0}, Ll/֡ᩴܳ;-><init>(Ll/ۚ᩵ܳ;)V

    invoke-static {p1, p2}, Ll/ۡᩴܳ;->֫(Ll/ۗܺ᩷;Ll/֨ۡ֫;)V

    .line 254
    sget-object p2, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    new-instance p3, Ll/ܿۘᩳ;

    const/4 v0, 0x1

    invoke-direct {p3, v0, p0}, Ll/ܿۘᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1, p3}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 262
    new-instance p2, Ll/ܳۘᩳ;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p0}, Ll/ܳۘᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, p2}, Ll/۫᩻᩻;->֫(Ll/ۗܺ᩷;Ll/֨ۡ֫;)V

    .line 271
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    new-instance p2, Ll/ۚᩴܳ;

    invoke-direct {p2, p0}, Ll/ۚᩴܳ;-><init>(Ll/ۚ᩵ܳ;)V

    invoke-virtual {p1, p2}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 277
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ܿ()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۘܳ;Lbin/mt/plus/Main;)V
    .locals 2

    .line 113
    new-instance v0, Ll/ۘᩴܳ;

    invoke-direct {v0, p1, p2}, Ll/ۘᩴܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1}, Ll/ۚ᩵ܳ;-><init>(Ll/ۗܺ᩷;Ll/ۛᩴܳ;Z)V

    .line 131
    new-instance v0, Ll/ܺ᩷ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ܺ᩷ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢۘܳ;->֫(Ljava/lang/Runnable;)V

    .line 137
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    new-instance v1, Ll/ᩴᩴܳ;

    invoke-direct {v1, p1, p2}, Ll/ᩴᩴܳ;-><init>(Ll/ۢۘܳ;Lbin/mt/plus/Main;)V

    invoke-virtual {v0, v1}, Ll/ܳ᩷ۡ;->֫(Ll/᩻᩷ۡ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩵֡᩷;Ll/᩷᩵᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 154
    invoke-direct {p0, p1, p2, v0}, Ll/ۚ᩵ܳ;-><init>(Ll/ۗܺ᩷;Ll/ۛᩴܳ;Z)V

    return-void
.end method

.method public static bridge synthetic ֡(Ll/ۚ᩵ܳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ֨(Ll/ۚ᩵ܳ;)Ll/᩻ۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۚ᩵ܳ;Ll/۠ᩴܳ;Ljava/lang/Boolean;)Ll/۠۠᩵;
    .locals 3

    .line 722
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p0, 0x0

    .line 723
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result p2

    if-ge p0, p2, :cond_2

    .line 724
    invoke-virtual {v0, p0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 726
    iget-object p2, p2, Lcom/google/android/material/tabs/TabLayout$Tab;->view:Lcom/google/android/material/tabs/TabLayout$TabView;

    const v1, 0x7f0a05a0

    .line 727
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 728
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 732
    :cond_1
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ᩳ()V

    .line 733
    iget-object p0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ᩴܳ;

    .line 734
    invoke-static {p1}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡ᩵ܳ;->֫()V

    goto :goto_1

    .line 737
    :cond_2
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۚ᩵ܳ;)V
    .locals 2

    .line 263
    iget-object p0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ᩴܳ;

    .line 264
    invoke-virtual {v0}, Ll/᩺ᩴܳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 265
    invoke-static {v0}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۡ᩵ܳ;->ܽ()V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۚ᩵ܳ;F)V
    .locals 1

    .line 181
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 182
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 183
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۚ᩵ܳ;I)V
    .locals 1

    .line 706
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    invoke-static {p1}, Ll/ۡᩴܳ;->֫(I)V

    if-eqz p1, :cond_0

    .line 707
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v0

    if-ne v0, p1, :cond_0

    add-int/lit8 p1, p1, -0x1

    .line 708
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۚ᩵ܳ;ILl/ۜᩴܳ;Landroid/view/MenuItem;)V
    .locals 4

    .line 660
    iget-object v0, p0, Ll/ۚ᩵ܳ;->֫:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p3

    const/4 v2, 0x1

    if-eq p3, v2, :cond_4

    const/4 v3, 0x2

    if-eq p3, v3, :cond_2

    const/4 v1, 0x3

    if-eq p3, v1, :cond_1

    const/4 v1, 0x4

    if-eq p3, v1, :cond_0

    goto/16 :goto_0

    .line 703
    :cond_0
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p3

    const v1, 0x7f1205ca

    invoke-virtual {p3, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 704
    invoke-virtual {p2}, Ll/ۜᩴܳ;->ܿ()Ljava/lang/String;

    move-result-object p2

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const p2, 0x7f120236

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/ۖᩴܳ;

    invoke-direct {p2, p0, p1}, Ll/ۖᩴܳ;-><init>(Ll/ۚ᩵ܳ;I)V

    const p0, 0x7f12070a

    .line 705
    invoke-virtual {p3, p0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 711
    invoke-virtual {p3, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 712
    invoke-virtual {p3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 678
    :cond_1
    new-instance p0, Ll/۬ᩴܳ;

    invoke-direct {p0, v0, p2, p1}, Ll/۬ᩴܳ;-><init>(Ll/ۗܺ᩷;Ll/ۜᩴܳ;I)V

    const p1, 0x7f1205f9

    .line 695
    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->ۡ(I)V

    .line 696
    invoke-virtual {p2}, Ll/ۜᩴܳ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 697
    invoke-virtual {p0}, Ll/۬ۗܿ;->֫()V

    const/4 p1, 0x6

    .line 698
    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 699
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p0, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_2
    add-int/lit8 p0, p1, 0x1

    .line 670
    invoke-static {p1, p0}, Ll/ۡᩴܳ;->֫(II)V

    .line 671
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result p2

    if-ne p2, p1, :cond_3

    .line 672
    invoke-virtual {v1, p0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void

    .line 673
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result p2

    if-ne p2, p0, :cond_6

    .line 674
    invoke-virtual {v1, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void

    :cond_4
    add-int/lit8 p0, p1, -0x1

    .line 662
    invoke-static {p1, p0}, Ll/ۡᩴܳ;->֫(II)V

    .line 663
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result p2

    if-ne p2, p1, :cond_5

    .line 664
    invoke-virtual {v1, p0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void

    .line 665
    :cond_5
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result p2

    if-ne p2, p0, :cond_6

    .line 666
    invoke-virtual {v1, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۚ᩵ܳ;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    .line 376
    :cond_0
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 379
    :cond_1
    iput-object p1, p0, Ll/ۚ᩵ܳ;->᩸:Ljava/lang/String;

    .line 380
    iget-object p0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ᩴܳ;

    .line 381
    invoke-static {p1}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۡ᩵ܳ;->ۧ()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ۚ᩵ܳ;Ll/ܳ᩷ۡ;Landroid/view/MenuItem;)V
    .locals 6

    .line 567
    iget-object v0, p0, Ll/ۚ᩵ܳ;->֫:Ll/ۗܺ᩷;

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f1203d7

    if-ne v1, v2, :cond_0

    .line 569
    new-instance p1, Ll/֨۫᩷;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0}, Ll/֨۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const v2, 0x7f120181

    if-ne v1, v2, :cond_1

    .line 571
    invoke-static {}, Ll/ۡᩴܳ;->ۜ()V

    return-void

    :cond_1
    const v2, 0x7f1202f7

    const/4 v3, 0x1

    if-ne v1, v2, :cond_2

    .line 573
    invoke-interface {p2}, Landroid/view/MenuItem;->isChecked()Z

    move-result p0

    xor-int/2addr p0, v3

    invoke-interface {p2, p0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 574
    invoke-interface {p2}, Landroid/view/MenuItem;->isChecked()Z

    move-result p0

    sget-object p1, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    .line 224
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p2, "eph"

    .line 0
    invoke-static {p1, p2, p0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void

    :cond_2
    const p2, 0x7f12011f

    const/4 v2, -0x1

    if-ne v1, p2, :cond_3

    .line 576
    iget-object p1, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    invoke-virtual {p0}, Ll/֡ܰۧ;->ܽ()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ᩴܳ;

    invoke-static {p0}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۡ᩵ܳ;->֫(I)V

    return-void

    :cond_3
    const p0, 0x7f120033

    if-ne v1, p0, :cond_4

    .line 578
    new-instance p2, Ll/ܺۡ;

    const/4 v1, 0x0

    .line 41
    invoke-direct {p2, v0, v1}, Ll/ܺۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 579
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    add-int/2addr v4, v3

    .line 580
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    .line 579
    invoke-virtual {p2, v2, v4, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    const/16 v2, 0x64

    .line 581
    invoke-virtual {p2, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 582
    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ᩳ()F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float v2, v2, v3

    float-to-int v2, v2

    invoke-virtual {p2, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 583
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " ("

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 584
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 0
    invoke-static {p0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 584
    invoke-virtual {p2}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "%)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 585
    invoke-virtual {v0, p2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v2, 0x7f120189

    .line 586
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 587
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 588
    new-instance v1, Ll/ۙᩴܳ;

    invoke-direct {v1, v0, p0, p1}, Ll/ۙᩴܳ;-><init>(Ll/֡ۚۢ;Ljava/lang/String;Ll/ܳ᩷ۡ;)V

    invoke-virtual {p2, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void

    :cond_4
    const p0, 0x7f12002c

    if-ne v1, p0, :cond_5

    .line 611
    new-instance p1, Ll/ۗᩴܳ;

    .line 40
    invoke-direct {p1, v0, v2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 628
    invoke-virtual {p1, p0}, Ll/۬ۗܿ;->ۡ(I)V

    invoke-virtual {p1}, Ll/۬ۗܿ;->֫()V

    const/4 p0, 0x6

    .line 629
    invoke-virtual {p1, p0}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 205
    invoke-virtual {p1, v3}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_5
    const p0, 0x7f12018c

    if-ne v1, p0, :cond_6

    .line 632
    check-cast v0, Lbin/mt/plus/Main;

    const-string p0, "cloudBackup"

    invoke-virtual {v0, p0}, Lbin/mt/plus/Main;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_6
    const p0, 0x7f1205ac

    if-ne v1, p0, :cond_7

    .line 634
    invoke-static {}, Ll/᩻᩹ۡ;->֫()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {v0, p0, p1}, Ll/ۧۖ᩷;->֫(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_7
    return-void
.end method

.method public static ֫(Ll/ۚ᩵ܳ;Ll/ܳ᩷ۡ;Landroid/view/View;)V
    .locals 7

    .line 547
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p2, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 548
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    .line 549
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p2

    const v1, 0x7f1203d7

    const v3, 0x7f0a02fd

    .line 550
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v4, 0x7f0801f9

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v1, 0x7f12002c

    .line 551
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v4, 0x7f0801ce

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v1, 0x7f120033

    .line 552
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v4, 0x7f080251

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 553
    invoke-static {}, Ll/ۢۤۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f1205ac

    const-string v4, "\u624b\u52bf\u8bf4\u660e"

    .line 554
    invoke-interface {p2, v3, v1, v2, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v1

    const v3, 0x7f080204

    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 556
    :cond_0
    iget-object v1, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v1

    invoke-static {v1}, Ll/ۡᩴܳ;->ۧ(I)Ll/ۜᩴܳ;

    move-result-object v1

    .line 557
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v1

    const v3, 0x7f0a02fe

    if-eqz v1, :cond_1

    const v1, 0x7f1202f7

    .line 558
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v4, 0x7f08021d

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v1

    const/4 v4, 0x1

    .line 559
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v1

    .line 229
    sget-object v5, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v6, "eph"

    invoke-interface {v5, v6, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 559
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f120181

    .line 560
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0801dc

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    goto :goto_0

    :cond_1
    const v1, 0x7f12011f

    .line 562
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v4, 0x7f0801ee

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v1, 0x7f12018c

    .line 563
    invoke-interface {p2, v3, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x7f0801df

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 565
    :goto_0
    invoke-static {p2}, Ll/᩹ۛ;->֫(Landroid/view/Menu;)V

    .line 566
    new-instance p2, Ll/ۖۡܳ;

    invoke-direct {p2, p0, p1}, Ll/ۖۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 638
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۚ᩵ܳ;Ll/᩺ۢ֫;)V
    .locals 1

    .line 272
    sget-object v0, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    if-ne p1, v0, :cond_0

    .line 273
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    invoke-virtual {p0}, Ll/֡ܰۧ;->ܽ()I

    move-result p0

    const-string v0, "bottom_selected_tab_index"

    invoke-interface {p1, p0, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۚ᩵ܳ;Z)V
    .locals 3

    .line 519
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ܺ:Landroid/widget/LinearLayout;

    iget-object v1, p0, Ll/ۚ᩵ܳ;->ۘ:Landroid/widget/LinearLayout;

    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۡ:Landroid/widget/LinearLayout;

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    .line 520
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p1

    cmpl-float p1, p1, v2

    if-eqz p1, :cond_2

    :cond_0
    const/4 p1, 0x1

    .line 521
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 522
    invoke-virtual {v1, p1}, Landroid/view/View;->setClickable(Z)V

    .line 523
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 524
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 525
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 526
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 529
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p1

    cmpl-float p1, p1, v2

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 530
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 531
    invoke-virtual {v1, p1}, Landroid/view/View;->setClickable(Z)V

    .line 532
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    const/high16 p1, 0x3f000000    # 0.5f

    .line 533
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 534
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 535
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method private ֫(Z)V
    .locals 5

    .line 389
    iget-boolean v0, p0, Ll/ۚ᩵ܳ;->ܶ:Z

    if-eq v0, p1, :cond_3

    .line 390
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    if-eqz p1, :cond_1

    .line 440
    iget-object v1, p0, Ll/ۚ᩵ܳ;->ܽ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    if-gtz v2, :cond_0

    .line 442
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    :cond_0
    if-lez v2, :cond_2

    .line 445
    invoke-virtual {v0, v2}, Ll/ܳ᩷ۡ;->֫(I)V

    goto :goto_0

    .line 460
    :cond_1
    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->ۧ()V

    .line 395
    :cond_2
    :goto_0
    iput-boolean p1, p0, Ll/ۚ᩵ܳ;->ܶ:Z

    .line 406
    :cond_3
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܽ᩸;

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz p1, :cond_4

    .line 409
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 410
    iput v2, v1, Ll/ܽ᩸;->᩹֫:I

    .line 411
    iput v3, v1, Ll/ܽ᩸;->᩸֫:I

    .line 412
    iput v2, v1, Ll/ܽ᩸;->ۘ:I

    .line 413
    iput v3, v1, Ll/ܽ᩸;->ᩴ:I

    goto :goto_1

    :cond_4
    const/4 v4, -0x2

    .line 415
    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 416
    iput v3, v1, Ll/ܽ᩸;->᩹֫:I

    const v4, 0x7f0a05a0

    .line 417
    iput v4, v1, Ll/ܽ᩸;->᩸֫:I

    .line 418
    iput v3, v1, Ll/ܽ᩸;->ۘ:I

    const v3, 0x7f0a03ae

    .line 419
    iput v3, v1, Ll/ܽ᩸;->ᩴ:I

    .line 421
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p1, :cond_5

    const/4 v0, 0x4

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    .line 398
    :goto_2
    iget-object v1, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0x8

    if-eqz p1, :cond_6

    goto :goto_4

    .line 787
    :cond_6
    iget-boolean p1, p0, Ll/ۚ᩵ܳ;->ۖ:Z

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const/16 v2, 0x8

    :goto_3
    move v0, v2

    .line 399
    :goto_4
    iget-object p1, p0, Ll/ۚ᩵ܳ;->᩵:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static ֫(Ll/ۚ᩵ܳ;Landroid/view/View;)Z
    .locals 9

    .line 787
    iget-boolean v0, p0, Ll/ۚ᩵ܳ;->ۖ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 645
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    const v0, 0x7f0a05a0

    .line 646
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 647
    new-instance v3, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 68
    invoke-direct {v3, v4, p1, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 648
    invoke-virtual {v3}, Ll/᩸ۖ;->ᩳ()V

    .line 649
    invoke-virtual {v3}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 650
    invoke-static {v0}, Ll/ۡᩴܳ;->ۧ(I)Ll/ۜᩴܳ;

    move-result-object v4

    if-lez v0, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 652
    :goto_0
    invoke-static {}, Ll/ۡᩴܳ;->ۘ()I

    move-result v6

    sub-int/2addr v6, v2

    if-ge v0, v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 653
    :goto_1
    invoke-virtual {v4}, Ll/ۜᩴܳ;->᩻()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v4}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v7

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    const v8, 0x7f120644

    .line 654
    invoke-interface {p1, v1, v2, v1, v8}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v8

    invoke-interface {v8, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    const v8, 0x7f0801d7

    invoke-interface {v5, v8}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x2

    const v8, 0x7f120645

    .line 655
    invoke-interface {p1, v1, v5, v1, v8}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f0801fd

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x3

    const v6, 0x7f1205f9

    .line 656
    invoke-interface {p1, v1, v5, v1, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f080231

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x4

    const v6, 0x7f1205ca

    .line 657
    invoke-interface {p1, v1, v5, v1, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801e6

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 659
    new-instance p1, Ll/᩸ᩴܳ;

    invoke-direct {p1, p0, v0, v4}, Ll/᩸ᩴܳ;-><init>(Ll/ۚ᩵ܳ;ILl/ۜᩴܳ;)V

    invoke-virtual {v3, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 717
    invoke-virtual {v3}, Ll/᩸ۖ;->ܿ()V

    return v2
.end method

.method public static ֫(Ll/ܽ᩷ܳ;Ll/ۗ᩻᩻;)Z
    .locals 1

    .line 145
    instance-of v0, p0, Ll/ۚۡ᩻;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۚۡ᩻;

    .line 146
    invoke-virtual {p0}, Ll/ۚۡ᩻;->ܳ֫()I

    move-result p0

    iget p1, p1, Ll/ۗ᩻᩻;->᩶:I

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۖ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ܺ:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static ۗ(Ll/ۚ᩵ܳ;)I
    .locals 0

    .line 787
    iget-boolean p0, p0, Ll/ۚ᩵ܳ;->ۖ:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/16 p0, 0x8

    return p0
.end method

.method public static bridge synthetic ۘ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۘ:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static ۙ(Ll/ۚ᩵ܳ;)Z
    .locals 0

    .line 787
    iget-boolean p0, p0, Ll/ۚ᩵ܳ;->ۖ:Z

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/ۚ᩵ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩸:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/ۚ᩵ܳ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ܿ:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ۠(Ll/ۚ᩵ܳ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩶:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۚ᩵ܳ;)Ll/ۛᩴܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۢ:Ll/ۛᩴܳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۚ᩵ܳ;)Ll/ۡۤۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩷:Ll/ۡۤۡ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۚ᩵ܳ;)V
    .locals 1

    .line 569
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ll/᩻ۡۡ;->ۧ(Z)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۚ᩵ܳ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۚ᩵ܳ;->֫(Z)V

    return-void
.end method

.method public static ۬(Ll/ۚ᩵ܳ;)Z
    .locals 0

    .line 474
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    invoke-virtual {p0}, Ll/᩻ۡۡ;->ܿ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۚ᩵ܳ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method private ܳ()V
    .locals 5

    .line 285
    iget-object v0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    .line 286
    invoke-static {}, Ll/ۡᩴܳ;->ۘ()I

    move-result v2

    .line 287
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v2, v3, :cond_0

    .line 288
    new-instance v3, Ll/᩺ᩴܳ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, p0, v4}, Ll/᩺ᩴܳ;-><init>(Ll/ۚ᩵ܳ;I)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 290
    :cond_0
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    const/4 v3, 0x1

    .line 0
    invoke-static {v0, v3}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_1

    .line 333
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 334
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ᩴܳ;

    .line 335
    invoke-virtual {v4}, Ll/᩺ᩴܳ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 344
    :cond_2
    iget-object v3, p0, Ll/ۚ᩵ܳ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 322
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 323
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 294
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ᩴܳ;

    .line 295
    invoke-static {v3}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۡ᩵ܳ;->ܽ()V

    goto :goto_3

    .line 297
    :cond_4
    iget-object v2, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    if-nez v4, :cond_6

    .line 298
    invoke-virtual {v2}, Ll/֡ܰۧ;->ۧ()Ll/ۨ᩺ۧ;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 300
    invoke-virtual {v3}, Ll/ۨ᩺ۧ;->ܽ()V

    .line 302
    :cond_5
    iget-object v3, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    invoke-virtual {v3}, Ll/ܳ᩷ۡ;->ܿ()Ll/ܺ᩹᩵;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 304
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v3, Ll/ܶᩴܳ;

    invoke-virtual {v3, v4}, Ll/ܶᩴܳ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    if-eqz v1, :cond_7

    .line 308
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "bottom_selected_tab_index"

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 309
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 310
    invoke-virtual {v2, v1}, Ll/֡ܰۧ;->ᩳ(I)V

    :cond_7
    return-void
.end method

.method public static bridge synthetic ܶ(Ll/ۚ᩵ܳ;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۡ:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ۚ᩵ܳ;)V
    .locals 1

    .line 132
    invoke-static {}, Ll/ۡᩴܳ;->᩵()V

    .line 133
    iget-object p0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ᩴܳ;

    .line 134
    invoke-static {v0}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ܿ()V
    .locals 6

    .line 122
    iget-object v0, p0, Ll/ۚ᩵ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x7f060058

    invoke-static {v1, v3, v2}, Ll/ۙۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result v1

    .line 743
    invoke-static {v1}, Ll/ܰ᩸᩷;->֫(I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ᩵ܳ;->ۜ:Landroid/graphics/PorterDuffColorFilter;

    .line 744
    iget-object v2, p0, Ll/ۚ᩵ܳ;->ۚ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 745
    sget v1, Ll/᩹֡᩷;->ܳ֫:I

    invoke-static {v1}, Ll/ܰ᩸᩷;->֫(I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    iget-object v2, p0, Ll/ۚ᩵ܳ;->᩻:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 746
    iget-object v1, p0, Ll/ۚ᩵ܳ;->ᩳ:Landroid/view/View;

    sget v2, Ll/᩹֡᩷;->ܳ:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    const v1, 0x7f0800a4

    .line 747
    invoke-static {v0, v1}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 749
    sget v2, Ll/᩹֡᩷;->ۖ:I

    invoke-static {v2}, Ll/ܰ᩸᩷;->֫(I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 750
    iget-object v2, p0, Ll/ۚ᩵ܳ;->ܽ:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 751
    iget-object v1, p0, Ll/ۚ᩵ܳ;->֡:Landroid/widget/ImageView;

    invoke-static {v0}, Ll/᩶ۖ᩷;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 752
    iget-object v1, p0, Ll/ۚ᩵ܳ;->ܳ:Landroid/widget/ImageView;

    invoke-static {v0}, Ll/᩶ۖ᩷;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 753
    invoke-static {v0}, Ll/᩶ۖ᩷;->֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Ll/ۚ᩵ܳ;->ۡ:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 754
    invoke-static {v0}, Ll/᩶ۖ᩷;->֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v3, p0, Ll/ۚ᩵ܳ;->ۘ:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 755
    invoke-static {v0}, Ll/᩶ۖ᩷;->֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Ll/ۚ᩵ܳ;->ܺ:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    .line 757
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f0801e3

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 758
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f0801e5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 759
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v4, 0x7f0801e6

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v0, 0x1

    .line 761
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    sget-object v4, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 762
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    sget-object v3, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 763
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 765
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩶:Landroid/view/View;

    sget v1, Ll/᩹֡᩷;->ܳ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 766
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    invoke-virtual {v0}, Ll/᩻ۡۡ;->֫()V

    return-void
.end method

.method public static synthetic ܿ(Ll/ۚ᩵ܳ;)V
    .locals 0

    .line 253
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ܳ()V

    return-void
.end method

.method private ᩳ()V
    .locals 2

    .line 428
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    :cond_0
    const/4 v1, 0x0

    .line 242
    invoke-virtual {v0, v1}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    .line 430
    invoke-virtual {v0}, Ll/᩻ۡۡ;->ۧ()V

    .line 453
    :cond_1
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->֫()V

    return-void
.end method

.method public static synthetic ᩳ(Ll/ۚ᩵ܳ;)V
    .locals 2

    .line 255
    iget-object p0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ᩴܳ;

    .line 256
    invoke-virtual {v0}, Ll/᩺ᩴܳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 257
    invoke-static {v0}, Ll/᩺ᩴܳ;->ۧ(Ll/᩺ᩴܳ;)Ll/ۡ᩵ܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۡ᩵ܳ;->ܽ()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۚ᩵ܳ;)Landroid/widget/HorizontalScrollView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ᩴ:Landroid/widget/HorizontalScrollView;

    return-object p0
.end method

.method public static bridge synthetic ᩵(Ll/ۚ᩵ܳ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->᩵:Landroid/view/View;

    return-object p0
.end method

.method public static ᩶(Ll/ۚ᩵ܳ;)Ll/֡᩵ܳ;
    .locals 7

    .line 488
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩵:Landroid/view/View;

    iget-object v1, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    iget-object v2, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    .line 787
    iget-boolean p0, p0, Ll/ۚ᩵ܳ;->ۖ:Z

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p0, :cond_1

    .line 481
    invoke-virtual {v1}, Ll/᩻ۡۡ;->ܳ()Z

    move-result p0

    if-nez p0, :cond_0

    .line 490
    new-instance p0, Ll/֡᩵ܳ;

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/view/View;

    aput-object v2, v6, v5

    aput-object v1, v6, v4

    aput-object v0, v6, v3

    invoke-direct {p0, v6}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    return-object p0

    .line 492
    :cond_0
    new-instance p0, Ll/֡᩵ܳ;

    new-array v1, v3, [Landroid/view/View;

    aput-object v2, v1, v5

    aput-object v0, v1, v4

    invoke-direct {p0, v1}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    return-object p0

    .line 481
    :cond_1
    invoke-virtual {v1}, Ll/᩻ۡۡ;->ܳ()Z

    move-result p0

    if-nez p0, :cond_2

    .line 495
    new-instance p0, Ll/֡᩵ܳ;

    new-array v0, v3, [Landroid/view/View;

    aput-object v2, v0, v5

    aput-object v1, v0, v4

    invoke-direct {p0, v0}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    return-object p0

    .line 497
    :cond_2
    new-instance p0, Ll/֡᩵ܳ;

    new-array v0, v4, [Landroid/view/View;

    aput-object v2, v0, v5

    invoke-direct {p0, v0}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۚ᩵ܳ;)Landroid/graphics/PorterDuffColorFilter;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۜ:Landroid/graphics/PorterDuffColorFilter;

    return-object p0
.end method

.method public static bridge synthetic ᩸(Ll/ۚ᩵ܳ;)Ll/ۜۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    return-object p0
.end method

.method public static bridge synthetic ᩹(Ll/ۚ᩵ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ᩳ()V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ۚ᩵ܳ;)Ll/ܳ᩷ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 541
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ۗ:Ll/ۜۡۡ;

    invoke-virtual {v0}, Ll/֡ܰۧ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 515
    iget-object v0, p0, Ll/ۚ᩵ܳ;->᩹:Ll/᩻ۡۡ;

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/᩻ۡۡ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 507
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ᩳ()V

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()V
    .locals 3

    .line 770
    invoke-direct {p0}, Ll/ۚ᩵ܳ;->ܿ()V

    .line 771
    new-instance v0, Lcom/google/android/material/tabs/TabLayout;

    iget-object v1, p0, Ll/ۚ᩵ܳ;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Lcom/google/android/material/tabs/TabLayout;-><init>(Landroid/content/Context;)V

    .line 772
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabRippleColor()Landroid/content/res/ColorStateList;

    move-result-object v1

    iget-object v2, p0, Ll/ۚ᩵ܳ;->ۙ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/tabs/TabLayout;->setTabRippleColor(Landroid/content/res/ColorStateList;)V

    .line 773
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabTextColors()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/material/tabs/TabLayout;->setTabTextColors(Landroid/content/res/ColorStateList;)V

    .line 774
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabSelectedIndicator()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 775
    iget-object v0, p0, Ll/ۚ᩵ܳ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ᩴܳ;

    .line 776
    invoke-static {v1}, Ll/᩺ᩴܳ;->ܳ(Ll/᩺ᩴܳ;)V

    goto :goto_0

    .line 778
    :cond_0
    iget-object v0, p0, Ll/ۚ᩵ܳ;->ۧ:Ll/ܳ᩷ۡ;

    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    .line 779
    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->ܿ()Ll/ܺ᩹᩵;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 781
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v0, Ll/ܶᩴܳ;

    invoke-virtual {v0, v1}, Ll/ܶᩴܳ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
