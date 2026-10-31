.class public final Ll/֡۠ۧ;
.super Landroid/widget/FrameLayout;
.source "E8GO"


# instance fields
.field public ۗ:F

.field public ۙ:Ljava/util/List;

.field public ۤ:Ll/᩺ۚۧ;

.field public ۫:Ll/ۨۚۧ;

.field public ۬:Landroid/view/View;

.field public ᩶:F

.field public ᩸:Z

.field public ᩹:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 137
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 138
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p2, p0, Ll/֡۠ۧ;->ۙ:Ljava/util/List;

    .line 139
    sget-object p2, Ll/᩺ۚۧ;->᩻:Ll/᩺ۚۧ;

    iput-object p2, p0, Ll/֡۠ۧ;->ۤ:Ll/᩺ۚۧ;

    const p2, 0x3d5a511a    # 0.0533f

    .line 141
    iput p2, p0, Ll/֡۠ۧ;->ۗ:F

    const p2, 0x3da3d70a    # 0.08f

    .line 142
    iput p2, p0, Ll/֡۠ۧ;->᩶:F

    const/4 p2, 0x1

    .line 143
    iput-boolean p2, p0, Ll/֡۠ۧ;->᩹:Z

    .line 144
    iput-boolean p2, p0, Ll/֡۠ۧ;->᩸:Z

    .line 146
    new-instance p2, Ll/ۨۚۧ;

    const/4 v0, 0x0

    .line 46
    invoke-direct {p2, p1, v0}, Ll/ۨۚۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 147
    iput-object p2, p0, Ll/֡۠ۧ;->۫:Ll/ۨۚۧ;

    .line 148
    iput-object p2, p0, Ll/֡۠ۧ;->۬:Landroid/view/View;

    .line 149
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private ܽ()V
    .locals 11

    .line 366
    iget-boolean v0, p0, Ll/֡۠ۧ;->᩹:Z

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Ll/֡۠ۧ;->᩸:Z

    if-eqz v1, :cond_0

    .line 367
    iget-object v0, p0, Ll/֡۠ۧ;->ۙ:Ljava/util/List;

    goto/16 :goto_3

    .line 369
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/֡۠ۧ;->ۙ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 370
    :goto_0
    iget-object v4, p0, Ll/֡۠ۧ;->ۙ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_6

    .line 371
    iget-object v4, p0, Ll/֡۠ۧ;->ۙ:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶֡֫;

    .line 377
    invoke-virtual {v4}, Ll/᩶֡֫;->֫()Ll/᩹֡֫;

    move-result-object v4

    if-nez v0, :cond_4

    .line 62
    invoke-virtual {v4}, Ll/᩹֡֫;->ۧ()V

    .line 63
    invoke-virtual {v4}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v5

    instance-of v5, v5, Landroid/text/Spanned;

    if-eqz v5, :cond_3

    .line 64
    invoke-virtual {v4}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v5

    instance-of v5, v5, Landroid/text/Spannable;

    if-nez v5, :cond_1

    .line 65
    invoke-virtual {v4}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v5}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    .line 68
    :cond_1
    invoke-virtual {v4}, Ll/᩹֡֫;->ܿ()Ljava/lang/CharSequence;

    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    check-cast v5, Landroid/text/Spannable;

    .line 97
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v6

    const-class v7, Ljava/lang/Object;

    invoke-interface {v5, v2, v6, v7}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v6

    .line 98
    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    .line 68
    instance-of v10, v9, Ll/۫֡֫;

    if-nez v10, :cond_2

    .line 100
    invoke-interface {v5, v9}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 70
    :cond_3
    invoke-static {v4}, Ll/ۚ۠ۧ;->֫(Ll/᩹֡֫;)V

    goto :goto_2

    .line 380
    :cond_4
    iget-boolean v5, p0, Ll/֡۠ۧ;->᩸:Z

    if-nez v5, :cond_5

    .line 381
    invoke-static {v4}, Ll/ۚ۠ۧ;->֫(Ll/᩹֡֫;)V

    .line 383
    :cond_5
    :goto_2
    invoke-virtual {v4}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object v4

    .line 371
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    move-object v0, v1

    .line 346
    :goto_3
    iget-object v1, p0, Ll/֡۠ۧ;->ۤ:Ll/᩺ۚۧ;

    iget v2, p0, Ll/֡۠ۧ;->ۗ:F

    iget v3, p0, Ll/֡۠ۧ;->᩶:F

    .line 345
    iget-object v4, p0, Ll/֡۠ۧ;->۫:Ll/ۨۚۧ;

    invoke-virtual {v4, v0, v1, v2, v3}, Ll/ۨۚۧ;->֫(Ljava/util/List;Ll/᩺ۚۧ;FF)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 282
    iput-boolean v0, p0, Ll/֡۠ۧ;->᩸:Z

    .line 283
    invoke-direct {p0}, Ll/֡۠ۧ;->ܽ()V

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 260
    iput p1, p0, Ll/֡۠ۧ;->ۗ:F

    .line 261
    invoke-direct {p0}, Ll/֡۠ۧ;->ܽ()V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 159
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    iput-object p1, p0, Ll/֡۠ۧ;->ۙ:Ljava/util/List;

    .line 160
    invoke-direct {p0}, Ll/֡۠ۧ;->ܽ()V

    return-void
.end method

.method public final ֫(Ll/᩺ۚۧ;)V
    .locals 0

    .line 302
    iput-object p1, p0, Ll/֡۠ۧ;->ۤ:Ll/᩺ۚۧ;

    .line 303
    invoke-direct {p0}, Ll/֡۠ۧ;->ܽ()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const v0, 0x3d3851ec    # 0.045f

    .line 316
    iput v0, p0, Ll/֡۠ۧ;->᩶:F

    .line 317
    invoke-direct {p0}, Ll/֡۠ۧ;->ܽ()V

    return-void
.end method
