.class public final Ll/ܶܺۢ;
.super Ljava/lang/Object;
.source "H76N"


# static fields
.field public static final ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const-string v7, "finiArray"

    const-string v8, "relocations"

    const-string v0, "neededLibraries"

    const-string v1, "sections"

    const-string v2, "segments"

    const-string v3, "imports"

    const-string v4, "symbols"

    const-string v5, "entries"

    const-string v6, "initArray"

    .line 17
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܶܺۢ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v1, v2, :cond_1

    .line 36
    sget-object v2, Ll/ܶܺۢ;->֫:[Ljava/lang/String;

    aget-object v2, v2, v1

    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_1

    .line 51
    invoke-static {p0}, Ll/ܶܺۢ;->֫(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid itemKind"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "itemKind is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
