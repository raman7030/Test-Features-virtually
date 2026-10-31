.class public final Ll/ۙ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# static fields
.field public static final ֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 2611
    sget-object v0, Ll/ۗ֨ܽ;->֫:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget v4, v0, v3

    .line 2612
    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v4

    const/high16 v5, 0x10000

    if-lt v4, v5, :cond_1

    .line 2613
    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v4

    if-ge v4, v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v2, 0x1

    .line 2618
    :cond_2
    sput-boolean v2, Ll/ۙ֨ܽ;->֫:Z

    return-void
.end method
