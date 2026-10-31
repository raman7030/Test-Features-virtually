.class public final Ll/ۜܰ;
.super Ll/ۖܰ;
.source "M4Z7"


# static fields
.field public static ۜ:Z

.field public static ܳ:Z

.field public static ܿ:Ljava/lang/reflect/Constructor;

.field public static ᩻:Ljava/lang/reflect/Field;


# instance fields
.field public ܽ:Landroid/view/WindowInsets;

.field public ᩳ:Ll/ۧ۬;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1720
    invoke-direct {p0}, Ll/ۖܰ;-><init>()V

    .line 1721
    invoke-static {}, Ll/ۜܰ;->ܽ()Landroid/view/WindowInsets;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܰ;->ܽ:Landroid/view/WindowInsets;

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;)V
    .locals 0

    .line 1725
    invoke-direct {p0, p1}, Ll/ۖܰ;-><init>(Ll/᩸ܰ;)V

    .line 1726
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Ll/ۜܰ;->ܽ:Landroid/view/WindowInsets;

    return-void
.end method

.method public static ܽ()Landroid/view/WindowInsets;
    .locals 6

    .line 1761
    sget-boolean v0, Ll/ۜܰ;->ۜ:Z

    const/4 v1, 0x1

    const-class v2, Landroid/view/WindowInsets;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "CONSUMED"

    .line 1763
    invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ۜܰ;->᩻:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1767
    :catch_0
    sput-boolean v1, Ll/ۜܰ;->ۜ:Z

    .line 1769
    :cond_0
    sget-object v0, Ll/ۜܰ;->᩻:Ljava/lang/reflect/Field;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 1771
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;

    if-eqz v0, :cond_1

    .line 1773
    new-instance v4, Landroid/view/WindowInsets;

    invoke-direct {v4, v0}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v4

    :catch_1
    nop

    .line 1782
    :cond_1
    sget-boolean v0, Ll/ۜܰ;->ܳ:Z

    const/4 v4, 0x0

    if-nez v0, :cond_2

    :try_start_2
    new-array v0, v1, [Ljava/lang/Class;

    .line 1784
    const-class v5, Landroid/graphics/Rect;

    aput-object v5, v0, v4

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    sput-object v0, Ll/ۜܰ;->ܿ:Ljava/lang/reflect/Constructor;
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1788
    :catch_2
    sput-boolean v1, Ll/ۜܰ;->ܳ:Z

    .line 1790
    :cond_2
    sget-object v0, Ll/ۜܰ;->ܿ:Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_3

    .line 1792
    :try_start_3
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowInsets;
    :try_end_3
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    :catch_3
    :cond_3
    return-object v3
.end method


# virtual methods
.method public ۧ()Ll/᩸ܰ;
    .locals 2

    .line 1745
    invoke-virtual {p0}, Ll/ۖܰ;->֫()V

    .line 1746
    iget-object v0, p0, Ll/ۜܰ;->ܽ:Landroid/view/WindowInsets;

    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v0}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    .line 1748
    iget-object v1, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    invoke-virtual {v0, v1}, Ll/᩸ܰ;->֫([Ll/ۧ۬;)V

    .line 1749
    iget-object v1, p0, Ll/ۜܰ;->ᩳ:Ll/ۧ۬;

    invoke-virtual {v0, v1}, Ll/᩸ܰ;->֫(Ll/ۧ۬;)V

    return-object v0
.end method

.method public ۧ(Ll/ۧ۬;)V
    .locals 0

    .line 1739
    iput-object p1, p0, Ll/ۜܰ;->ᩳ:Ll/ۧ۬;

    return-void
.end method

.method public ᩳ(Ll/ۧ۬;)V
    .locals 4

    .line 1731
    iget-object v0, p0, Ll/ۜܰ;->ܽ:Landroid/view/WindowInsets;

    if-eqz v0, :cond_0

    .line 1732
    iget v1, p1, Ll/ۧ۬;->ۧ:I

    iget v2, p1, Ll/ۧ۬;->ᩳ:I

    iget v3, p1, Ll/ۧ۬;->ܽ:I

    iget p1, p1, Ll/ۧ۬;->֫:I

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    iput-object p1, p0, Ll/ۜܰ;->ܽ:Landroid/view/WindowInsets;

    :cond_0
    return-void
.end method
