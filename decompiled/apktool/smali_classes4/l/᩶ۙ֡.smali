.class public final Ll/᩶ۙ֡;
.super Ljava/lang/Object;
.source "N5OE"


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:[[B


# direct methods
.method public constructor <init>(Ll/ۧۗ֡;)V
    .locals 8

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    .line 45
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    .line 46
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    .line 48
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 50
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Ll/᩶ۙ֡;->֫:[Ljava/lang/String;

    .line 51
    new-array v1, v0, [[B

    iput-object v1, p0, Ll/᩶ۙ֡;->ۧ:[[B

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 54
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v3

    .line 57
    :try_start_0
    iget-object v4, p0, Ll/᩶ۙ֡;->֫:[Ljava/lang/String;

    new-instance v5, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۧۗ֡;->ۧ(I)[B

    move-result-object v6

    add-int/lit8 v3, v3, -0x1

    const-string v7, "US-ASCII"

    invoke-direct {v5, v6, v1, v3, v7}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    aput-object v5, v4, v2
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    iget-object v3, p0, Ll/᩶ۙ֡;->ۧ:[[B

    const/16 v4, 0x14

    invoke-virtual {p1, v4}, Ll/ۧۗ֡;->ۧ(I)[B

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 59
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method
