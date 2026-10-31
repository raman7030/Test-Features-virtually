.class public final Ll/ܿۜۚ;
.super Ljava/lang/Object;
.source "Y4M0"


# static fields
.field public static ֫:Ll/ᩴܶܺ;

.field public static ۧ:Ll/ᩴܶܺ;

.field public static ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 47
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v0}, Ll/ܺۗ֡;->getValue()I

    move-result v0

    sget-object v1, Ll/ܺۗ֡;->ܽ֫:Ll/ܺۗ֡;

    invoke-virtual {v1}, Ll/ܺۗ֡;->getValue()I

    move-result v1

    or-int/2addr v0, v1

    sget-object v1, Ll/ܺۗ֡;->ۨ:Ll/ܺۗ֡;

    .line 48
    invoke-virtual {v1}, Ll/ܺۗ֡;->getValue()I

    move-result v1

    or-int/2addr v0, v1

    sput v0, Ll/ܿۜۚ;->ܽ:I

    .line 50
    new-instance v0, Ll/ܽۜۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿۜۚ;->֫:Ll/ᩴܶܺ;

    .line 57
    new-instance v0, Ll/ᩳۜۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿۜۚ;->ۧ:Ll/ᩴܶܺ;

    return-void
.end method

.method public static ֫(Ljava/util/List;Z)I
    .locals 4

    .line 96
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 97
    invoke-interface {v2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x4a

    if-eq v2, v3, :cond_1

    const/16 v3, 0x44

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    add-int/lit8 v1, v1, 0x1

    :cond_3
    return v1
.end method

.method public static ֫(Ll/ᩴ֫ۚ;)Z
    .locals 1

    .line 68
    invoke-interface {p0}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result p0

    sget v0, Ll/ܿۜۚ;->ܽ:I

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
