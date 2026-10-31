.class public final Ll/᩹ۙܿ;
.super Ljava/lang/Object;
.source "L9CC"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Landroid/graphics/drawable/Drawable;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1740
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1741
    iput p1, p0, Ll/᩹ۙܿ;->ۧ:I

    .line 1742
    iput p2, p0, Ll/᩹ۙܿ;->֫:I

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1743
    :cond_0
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/᩹ۙܿ;->ᩳ:Ljava/lang/String;

    .line 1744
    iput-object p4, p0, Ll/᩹ۙܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static ֫(Landroid/view/MenuItem;)Ll/᩹ۙܿ;
    .locals 4

    .line 1751
    new-instance v0, Ll/᩹ۙܿ;

    .line 1752
    invoke-interface {p0}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 1753
    invoke-interface {p0}, Landroid/view/MenuItem;->getGroupId()I

    move-result v2

    .line 1754
    invoke-interface {p0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v3

    .line 1755
    invoke-interface {p0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Ll/᩹ۙܿ;-><init>(IILjava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1774
    :cond_0
    instance-of v1, p1, Ll/᩹ۙܿ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 1777
    :cond_1
    check-cast p1, Ll/᩹ۙܿ;

    .line 1778
    iget v1, p0, Ll/᩹ۙܿ;->ۧ:I

    iget v3, p1, Ll/᩹ۙܿ;->ۧ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/᩹ۙܿ;->֫:I

    iget v3, p1, Ll/᩹ۙܿ;->֫:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/᩹ۙܿ;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/᩹ۙܿ;->ᩳ:Ljava/lang/String;

    .line 1780
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩹ۙܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    iget-object p1, p1, Ll/᩹ۙܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    .line 1783
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1763
    iget v0, p0, Ll/᩹ۙܿ;->ۧ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/᩹ۙܿ;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    iget-object v1, p0, Ll/᩹ۙܿ;->ᩳ:Ljava/lang/String;

    aput-object v1, v2, v0

    const/4 v0, 0x3

    iget-object v1, p0, Ll/᩹ۙܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
