.class public final Ll/۟᩶ܿ;
.super Ljava/lang/Object;
.source "A9CL"


# static fields
.field public static ᩷:Ll/۬ۙܿ;


# instance fields
.field public ֫:I

.field public ۜ:[I

.field public ۧ:Landroid/graphics/Rect;

.field public ܳ:Ll/ܰ᩶ܿ;

.field public ܽ:Ll/ۗۙܿ;

.field public final ܿ:Ll/ۨ᩶ܿ;

.field public ᩳ:Ll/ۗۜ;

.field public ᩻:Landroid/view/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 24
    invoke-static {}, Ll/۬ۙܿ;->values()[Ll/۬ۙܿ;

    move-result-object v0

    sget-object v1, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    sget-object v2, Ll/۬ۙܿ;->۬:Ll/۬ۙܿ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const-string v3, "fmst"

    invoke-interface {v1, v3, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    aget-object v0, v0, v1

    sput-object v0, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xdac

    .line 29
    iput v0, p0, Ll/۟᩶ܿ;->֫:I

    .line 30
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۟᩶ܿ;->ۧ:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 31
    iput-object v0, p0, Ll/۟᩶ܿ;->ۜ:[I

    .line 33
    new-instance v0, Ll/ۨ᩶ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۨ᩶ܿ;-><init>(I)V

    iput-object v0, p0, Ll/۟᩶ܿ;->ܿ:Ll/ۨ᩶ܿ;

    .line 61
    iput-object p1, p0, Ll/۟᩶ܿ;->᩻:Landroid/view/View;

    .line 62
    new-instance v0, Ll/ۗۜ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۗۜ;->setDefaultShowAsAction(I)Ll/ۗۜ;

    move-result-object v0

    iput-object v0, p0, Ll/۟᩶ܿ;->ᩳ:Ll/ۗۜ;

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 97
    new-instance v1, Ll/ۗۙܿ;

    invoke-direct {v1, v0, p1}, Ll/ۗۙܿ;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 63
    iput-object v1, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    .line 64
    sget-object p1, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    sget-object v0, Ll/۬ۙܿ;->۫:Ll/۬ۙܿ;

    if-ne p1, v0, :cond_0

    .line 65
    invoke-virtual {v1, v0, v0}, Ll/ۗۙܿ;->֫(Ll/۬ۙܿ;Ll/۬ۙܿ;)V

    return-void

    .line 67
    :cond_0
    sget-object p1, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    sget-object v0, Ll/۬ۙܿ;->ۗ:Ll/۬ۙܿ;

    invoke-virtual {v1, p1, v0}, Ll/ۗۙܿ;->֫(Ll/۬ۙܿ;Ll/۬ۙܿ;)V

    return-void
.end method

.method public static ֫(Landroid/view/Menu;)Ljava/util/ArrayList;
    .locals 4

    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-eqz p0, :cond_2

    .line 171
    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 172
    invoke-interface {p0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 173
    invoke-interface {v2}, Landroid/view/MenuItem;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 174
    invoke-interface {v2}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 176
    invoke-static {v3}, Ll/۟᩶ܿ;->֫(Landroid/view/Menu;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 178
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic ֫(Ll/۟᩶ܿ;Landroid/view/MenuItem;)V
    .locals 1

    .line 157
    iget-object v0, p0, Ll/۟᩶ܿ;->ܳ:Ll/ܰ᩶ܿ;

    if-eqz v0, :cond_0

    .line 159
    invoke-interface {v0, p1}, Ll/ܰ᩶ܿ;->onMenuItemClick(Landroid/view/MenuItem;)V

    .line 161
    :cond_0
    iget-object p0, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    invoke-virtual {p0}, Ll/ۗۙܿ;->֫()V

    return-void
.end method

.method public static ֫(Ll/۬ۙܿ;)V
    .locals 2

    .line 107
    sput-object p0, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    .line 108
    sget-object v0, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "fmst"

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    invoke-interface {v0, p0, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ܿ()Ll/۬ۙܿ;
    .locals 1

    .line 112
    sget-object v0, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܺ᩻ܿ;I)Ll/۫᩶ܿ;
    .locals 3

    .line 124
    new-instance v0, Ll/۫᩶ܿ;

    iget-object v1, p0, Ll/۟᩶ܿ;->ᩳ:Ll/ۗۜ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, p2, p1}, Ll/ۗۜ;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۫᩶ܿ;-><init>(Landroid/view/MenuItem;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 190
    iget-object v0, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    invoke-virtual {v0}, Ll/ۗۙܿ;->֫()V

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 144
    iget-object v0, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    invoke-virtual {v0, p1}, Ll/ۗۙܿ;->֫(F)V

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 116
    new-instance v0, Ll/۫᩶ܿ;

    iget-object v1, p0, Ll/۟᩶ܿ;->ᩳ:Ll/ۗۜ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1, v2, p1}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۫᩶ܿ;-><init>(Landroid/view/MenuItem;)V

    return-void
.end method

.method public final ֫(II)V
    .locals 3

    .line 148
    iget-object v0, p0, Ll/۟᩶ܿ;->ᩳ:Ll/ۗۜ;

    invoke-static {v0}, Ll/۟᩶ܿ;->֫(Landroid/view/Menu;)Ljava/util/ArrayList;

    move-result-object v0

    .line 149
    iget-object v1, p0, Ll/۟᩶ܿ;->ܿ:Ll/ۨ᩶ܿ;

    invoke-static {v0, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 150
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 153
    :cond_0
    iget-object v1, p0, Ll/۟᩶ܿ;->ۧ:Landroid/graphics/Rect;

    invoke-virtual {v1, p1, p2, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 154
    iget-object p1, p0, Ll/۟᩶ܿ;->᩻:Landroid/view/View;

    iget-object p2, p0, Ll/۟᩶ܿ;->ۜ:[I

    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p1, 0x0

    .line 155
    aget p1, p2, p1

    const/4 v2, 0x1

    aget p2, p2, v2

    invoke-virtual {v1, p1, p2}, Landroid/graphics/Rect;->offset(II)V

    .line 156
    new-instance p1, Ll/ۤ᩶ܿ;

    invoke-direct {p1, p0}, Ll/ۤ᩶ܿ;-><init>(Ll/۟᩶ܿ;)V

    iget-object p2, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    invoke-virtual {p2, v0, p1, v1}, Ll/ۗۙܿ;->֫(Ljava/util/ArrayList;Ll/ۤ᩶ܿ;Landroid/graphics/Rect;)V

    .line 164
    iget p1, p0, Ll/۟᩶ܿ;->֫:I

    if-lez p1, :cond_1

    int-to-long v0, p1

    .line 165
    invoke-virtual {p2, v0, v1}, Ll/ۗۙܿ;->֫(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۛۤᩳ;)V
    .locals 2

    .line 77
    iget-object v0, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 78
    invoke-virtual {v0, p1}, Ll/ۗۙܿ;->֫(Ll/ۛ᩶ܿ;)V

    return-void

    .line 80
    :cond_0
    new-instance v1, Ll/ۛ᩶ܿ;

    invoke-direct {v1, p0, p1}, Ll/ۛ᩶ܿ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗۙܿ;->֫(Ll/ۛ᩶ܿ;)V

    return-void
.end method

.method public final ֫(Ll/ܰ᩶ܿ;)V
    .locals 0

    .line 86
    iput-object p1, p0, Ll/۟᩶ܿ;->ܳ:Ll/ܰ᩶ܿ;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 140
    iget-object v0, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    invoke-virtual {v0}, Ll/ۗۙܿ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 72
    iput p1, p0, Ll/۟᩶ܿ;->֫:I

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 136
    iget-object v0, p0, Ll/۟᩶ܿ;->ᩳ:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 91
    iget-object v0, p0, Ll/۟᩶ܿ;->ᩳ:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->clear()V

    .line 92
    iget-object v0, p0, Ll/۟᩶ܿ;->ܽ:Ll/ۗۙܿ;

    invoke-virtual {v0}, Ll/ۗۙܿ;->֫()V

    .line 93
    invoke-virtual {v0}, Ll/ۗۙܿ;->ܽ()V

    .line 94
    sget-object v1, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    sget-object v2, Ll/۬ۙܿ;->۫:Ll/۬ۙܿ;

    if-ne v1, v2, :cond_0

    .line 95
    invoke-virtual {v0, v2, v2}, Ll/ۗۙܿ;->֫(Ll/۬ۙܿ;Ll/۬ۙܿ;)V

    goto :goto_0

    .line 97
    :cond_0
    sget-object v1, Ll/۟᩶ܿ;->᩷:Ll/۬ۙܿ;

    sget-object v2, Ll/۬ۙܿ;->ۗ:Ll/۬ۙܿ;

    invoke-virtual {v0, v1, v2}, Ll/ۗۙܿ;->֫(Ll/۬ۙܿ;Ll/۬ۙܿ;)V

    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 99
    invoke-virtual {p0, v0}, Ll/۟᩶ܿ;->֫(F)V

    return-void
.end method
