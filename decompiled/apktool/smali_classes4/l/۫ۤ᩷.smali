.class public final synthetic Ll/۫ۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;


# direct methods
.method public static bridge synthetic ֫(Landroid/graphics/Insets;)I
    .locals 0

    .line 0
    iget p0, p0, Landroid/graphics/Insets;->right:I

    return p0
.end method

.method public static ֫(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 3
    invoke-virtual {p1, p4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 1010
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 395
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
