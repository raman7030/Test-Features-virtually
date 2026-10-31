.class public final Ll/ۖ᩶᩷;
.super Ll/᩶ۗۧ;
.source "892H"


# instance fields
.field public ֫:Ll/ۗܺ᩷;

.field public ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 7

    .line 59
    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ۖ᩶᩷;->֫:Ll/ۗܺ᩷;

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    .line 63
    invoke-static {p1}, Ll/ܽۗ;->֫(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۙ;

    .line 64
    invoke-virtual {v2}, Ll/۟ۙ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lbin/mt/plus/ShortcutActivity;->ۧ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 66
    iget-object v4, p0, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    new-instance v5, Ll/ۘ᩶᩷;

    invoke-virtual {v2}, Ll/۟ۙ;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ll/۟ۙ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-direct {v5, v6, v2, v3}, Ll/ۘ᩶᩷;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v2}, Ll/۟ۙ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 72
    invoke-static {p1, v0}, Ll/ܽۗ;->֫(Ll/ۗܺ᩷;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖ᩶᩷;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖ᩶᩷;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 55
    check-cast p1, Ll/ܺ᩶᩷;

    .line 85
    iget-object v0, p0, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ᩶᩷;

    .line 86
    invoke-static {p1}, Ll/ܺ᩶᩷;->֫(Ll/ܺ᩶᩷;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۘ᩶᩷;->֫()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 87
    invoke-static {p1}, Ll/ܺ᩶᩷;->ۧ(Ll/ܺ᩶᩷;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۘ᩶᩷;->ᩳ()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    const p2, 0x7f0d016b

    const/4 v0, 0x0

    .line 0
    invoke-static {p1, p2, p1, v0}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 80
    new-instance p2, Ll/ܺ᩶᩷;

    invoke-direct {p2, p0, p1}, Ll/ܺ᩶᩷;-><init>(Ll/ۖ᩶᩷;Landroid/view/View;)V

    return-object p2
.end method
