.class public final Ll/ۤ۠ܺ;
.super Ll/ۗ۠ܺ;
.source "532I"


# static fields
.field public static final ᩹:Ll/ۨ۠ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1116
    new-instance v0, Ll/ۤ۠ܺ;

    const-string v1, "CharMatcher.none()"

    .line 1119
    invoke-direct {v0, v1}, Ll/ۗ۠ܺ;-><init>(Ljava/lang/String;)V

    .line 1116
    sput-object v0, Ll/ۤ۠ܺ;->᩹:Ll/ۨ۠ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/CharSequence;)I
    .locals 0

    .line 1135
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    .line 1136
    invoke-static {p1, p2}, Ll/ۘܶܺ;->ۧ(II)V

    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)I
    .locals 0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()Ll/ۨ۠ܺ;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(C)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/CharSequence;)I
    .locals 0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, -0x1

    return p1
.end method

.method public final ܽ(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1148
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    return p1
.end method
