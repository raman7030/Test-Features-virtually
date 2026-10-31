.class public final Ll/ۗ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x400

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/high16 v2, 0x10000

    :goto_0
    const v3, 0x10ffff

    if-gt v2, v3, :cond_3

    .line 2589
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v3

    if-ne v3, v2, :cond_0

    .line 2590
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v3

    if-eq v3, v2, :cond_2

    .line 2591
    :cond_0
    array-length v3, v0

    if-ne v1, v3, :cond_1

    mul-int/lit8 v3, v1, 0x2

    .line 2592
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    :cond_1
    add-int/lit8 v3, v1, 0x1

    .line 2594
    aput v2, v0, v1

    move v1, v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2597
    :cond_3
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    sput-object v0, Ll/ۗ֨ܽ;->֫:[I

    return-void
.end method
