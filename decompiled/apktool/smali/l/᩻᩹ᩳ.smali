.class public final Ll/᩻᩹ᩳ;
.super Ll/᩶᩹ᩳ;
.source "V6VE"


# instance fields
.field public final ܳ:[Ll/᩶᩹ᩳ;


# direct methods
.method public constructor <init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    aget-object v0, p2, v0

    iget v0, v0, Ll/᩶᩹ᩳ;->֫:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0, p1}, Ll/᩶᩹ᩳ;-><init>(ILjava/lang/Object;)V

    .line 9
    iput-object p2, p0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 10
    invoke-virtual {p0}, Ll/᩻᩹ᩳ;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 10

    const-wide/16 v0, -0x1

    .line 14
    iput-wide v0, p0, Ll/᩶᩹ᩳ;->ܿ:J

    .line 17
    iget-object v0, p0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-wide v4, v2

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v1, :cond_0

    aget-object v7, v0, v6

    .line 18
    iget v8, v7, Ll/᩶᩹ᩳ;->ۧ:I

    int-to-long v8, v8

    add-long/2addr v2, v8

    .line 19
    iget v7, v7, Ll/᩶᩹ᩳ;->ܽ:I

    int-to-long v7, v7

    add-long/2addr v4, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x7fffffff

    cmp-long v6, v2, v0

    if-gtz v6, :cond_1

    long-to-int v0, v2

    .line 24
    iput v0, p0, Ll/᩶᩹ᩳ;->ۧ:I

    long-to-int v0, v4

    .line 25
    iput v0, p0, Ll/᩶᩹ᩳ;->ܽ:I

    return-void

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Text exceeds UTF-16 coordinate limit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
