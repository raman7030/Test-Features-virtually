.class public final Ll/ܰۡۚ;
.super Ljava/lang/Object;
.source "151T"


# static fields
.field public static final ֫:Ll/ܽܶܺ;

.field public static final ۧ:Ll/ᩴܶܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 56
    new-instance v0, Ll/ۤۡۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰۡۚ;->ۧ:Ll/ᩴܶܺ;

    .line 63
    new-instance v0, Ll/ۛۡۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰۡۚ;->֫:Ll/ܽܶܺ;

    return-void
.end method

.method public static bridge synthetic ֫()Ll/ܽܶܺ;
    .locals 1

    .line 0
    sget-object v0, Ll/ܰۡۚ;->֫:Ll/ܽܶܺ;

    return-object v0
.end method

.method public static ֫(Ll/᩻۫ܺ;)Ll/᩶ܽۚ;
    .locals 6

    .line 58
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 59
    sget-object v5, Ll/ܰۡۚ;->ۧ:Ll/ᩴܶܺ;

    check-cast v5, Ll/ۤۡۚ;

    invoke-virtual {v5, v4}, Ll/ۤۡۚ;->apply(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v3, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-le v3, v2, :cond_2

    .line 79
    new-instance v0, Ll/᩺ۡۚ;

    invoke-direct {v0, p0, v3}, Ll/᩺ۡۚ;-><init>(Ljava/util/SortedSet;I)V

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method
