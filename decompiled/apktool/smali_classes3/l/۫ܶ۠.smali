.class public abstract Ll/۫ܶ۠;
.super Ljava/lang/Object;
.source "V42A"


# instance fields
.field public final ֫:Ll/ۛܶ۠;


# direct methods
.method public constructor <init>(Ll/ۛܶ۠;)V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    iput-object p1, p0, Ll/۫ܶ۠;->֫:Ll/ۛܶ۠;

    return-void
.end method

.method public static ֫(I[BI[BI)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_0

    add-int v2, p0, v1

    .line 261
    aget-byte v2, p1, v2

    add-int v3, p2, v1

    aget-byte v3, p3, v3

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ne v1, p4, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method public static ۧ(II[B)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    shl-int/lit8 v2, v1, 0x5

    sub-int/2addr v2, v1

    add-int/lit8 v1, p0, 0x1

    .line 251
    aget-byte p0, p2, p0

    add-int/2addr p0, v2

    add-int/lit8 v0, v0, 0x1

    move v3, v1

    move v1, p0

    move p0, v3

    goto :goto_0

    :cond_0
    return v1
.end method


# virtual methods
.method public abstract ֫(II[B)Ll/ۤܶ۠;
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۤܶ۠;
    .locals 1

    .line 224
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    .line 225
    array-length v0, p1

    invoke-virtual {p0, p1, v0}, Ll/۫ܶ۠;->֫([CI)Ll/ۤܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫([CI)Ll/ۤܶ۠;
.end method

.method public abstract ֫()V
.end method
