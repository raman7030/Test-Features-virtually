.class public final Ll/ܶۤۡ;
.super Ll/᩵֡ᩴ;
.source "TATF"


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 290
    invoke-direct {p0, p1, v0}, Ll/᩵֡ᩴ;-><init>([Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/۠ۤۡ;Ll/۠ۤۡ;)V
    .locals 7

    .line 295
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 296
    iget v0, p0, Ll/᩵֡ᩴ;->᩹:I

    .line 297
    iget-object v1, p0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    add-int/lit8 v2, v0, 0x2

    .line 298
    array-length v3, v1

    if-le v2, v3, :cond_3

    .line 204
    array-length v3, v1

    if-le v2, v3, :cond_2

    .line 205
    array-length v3, v1

    int-to-long v3, v3

    array-length v5, v1

    shr-int/lit8 v5, v5, 0x1

    int-to-long v5, v5

    add-long/2addr v3, v5

    const-wide/32 v5, 0x7ffffff7

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    int-to-long v5, v2

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 115
    const-class v5, [Ljava/lang/Object;

    if-ne v3, v5, :cond_1

    if-nez v4, :cond_0

    sget-object v3, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-array v3, v4, [Ljava/lang/Object;

    goto :goto_0

    .line 116
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Object;

    :goto_0
    const/4 v4, 0x0

    .line 207
    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v3

    .line 299
    :cond_2
    iput-object v1, p0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    :cond_3
    add-int/lit8 v3, p1, 0x2

    sub-int/2addr v0, p1

    .line 301
    invoke-static {v1, p1, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 302
    aput-object p2, v1, p1

    add-int/lit8 p1, p1, 0x1

    .line 303
    aput-object p3, v1, p1

    .line 304
    iput v2, p0, Ll/᩵֡ᩴ;->᩹:I

    return-void
.end method
