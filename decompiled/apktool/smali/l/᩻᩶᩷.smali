.class public final Ll/᩻᩶᩷;
.super Ll/᩶ۗۧ;
.source "V933"


# instance fields
.field public final ֫:Ll/ᩳ᩶᩷;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ᩳ᩶᩷;)V
    .locals 4

    .line 201
    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻᩶᩷;->ۧ:Ljava/util/ArrayList;

    .line 202
    iput-object p1, p0, Ll/᩻᩶᩷;->֫:Ll/ᩳ᩶᩷;

    .line 203
    invoke-static {}, Ll/᩹ۖܳ;->values()[Ll/᩹ۖܳ;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 204
    iget-boolean v3, v2, Ll/᩹ۖܳ;->᩸:Z

    if-nez v3, :cond_0

    .line 205
    iget-object v3, p0, Ll/᩻᩶᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻᩶᩷;)Ll/۬ۤ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻᩶᩷;->֫:Ll/ᩳ᩶᩷;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩻᩶᩷;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻᩶᩷;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 223
    iget-object v0, p0, Ll/᩻᩶᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 1

    .line 197
    check-cast p1, Ll/ۜ᩶᩷;

    .line 218
    invoke-static {p1}, Ll/ۜ᩶᩷;->֫(Ll/ۜ᩶᩷;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Ll/᩻᩶᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩹ۖܳ;

    iget p2, p2, Ll/᩹ۖܳ;->᩶:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 0

    .line 213
    new-instance p2, Ll/ۜ᩶᩷;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۜ᩶᩷;-><init>(Landroid/content/Context;)V

    return-object p2
.end method
