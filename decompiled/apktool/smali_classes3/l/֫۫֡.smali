.class public abstract Ll/֫۫֡;
.super Ll/۟۬֡;
.source "W5CU"

# interfaces
.implements Ll/۟֫ۚ;


# instance fields
.field public final ᩶:Ll/ܿ۫֡;


# direct methods
.method public constructor <init>(Ll/֨ۗ֡;Ll/ܿ۫֡;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 47
    iput-object p2, p0, Ll/֫۫֡;->᩶:Ll/ܿ۫֡;

    return-void
.end method


# virtual methods
.method public final ۖ()I
    .locals 6

    .line 69
    iget-object v0, p0, Ll/֫۫֡;->᩶:Ll/ܿ۫֡;

    .line 46
    invoke-virtual {v0}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v0

    .line 80
    iget v0, v0, Ll/ܺ۫֡;->֫:I

    .line 69
    invoke-virtual {p0}, Ll/۟۬֡;->ۤ()Ll/ܺ۫֡;

    move-result-object v1

    .line 80
    iget v1, v1, Ll/ܺ۫֡;->֫:I

    sub-int/2addr v0, v1

    .line 53
    invoke-virtual {p0}, Ll/۟۬֡;->ۚ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1

    const/16 v1, -0x80

    if-lt v0, v1, :cond_0

    const/16 v1, 0x7f

    if-gt v0, v1, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    new-instance v1, Ll/ܶ᩵ۚ;

    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v2

    const-string v0, "Invalid instruction offset: %d. Offset must be in [-128, 127]"

    .line 46
    invoke-direct {v1, v3, v0, v4}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    throw v1

    .line 58
    :cond_1
    invoke-virtual {p0}, Ll/۟۬֡;->ۚ()I

    move-result v1

    const/4 v5, 0x2

    if-ne v1, v5, :cond_3

    const/16 v1, -0x8000

    if-lt v0, v1, :cond_2

    const/16 v1, 0x7fff

    if-gt v0, v1, :cond_2

    goto :goto_0

    .line 60
    :cond_2
    new-instance v1, Ll/ܶ᩵ۚ;

    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v2

    const-string v0, "Invalid instruction offset: %d. Offset must be in [-32768, 32767]"

    .line 46
    invoke-direct {v1, v3, v0, v4}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    throw v1

    :cond_3
    :goto_0
    return v0
.end method

.method public final ۛ()Ll/ܿ۫֡;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֫۫֡;->᩶:Ll/ܿ۫֡;

    return-object v0
.end method
