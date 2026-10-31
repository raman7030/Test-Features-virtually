.class public final Ll/᩻۠ܽ;
.super Ljava/lang/Object;
.source "06VH"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Z

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IIZLjava/lang/Object;)V
    .locals 0

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput p1, p0, Ll/᩻۠ܽ;->ۧ:I

    .line 251
    iput p2, p0, Ll/᩻۠ܽ;->֫:I

    .line 252
    iput-boolean p3, p0, Ll/᩻۠ܽ;->ܽ:Z

    .line 253
    iput-object p4, p0, Ll/᩻۠ܽ;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public static ֫([ILjava/util/ArrayList;I)Ll/᩻۠ܽ;
    .locals 5

    .line 257
    aget v0, p0, p2

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v1, :cond_1

    .line 259
    new-instance p1, Ll/᩻۠ܽ;

    add-int/lit8 v1, p2, 0x2

    aget v1, p0, v1

    add-int/lit8 p2, p2, 0x3

    aget p0, p0, p2

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {p1, v0, v1, v3, v2}, Ll/᩻۠ܽ;-><init>(IIZLjava/lang/Object;)V

    return-object p1

    :cond_1
    if-eq v0, v3, :cond_3

    const/16 v1, 0x2a

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    return-object v2

    .line 262
    :cond_3
    :goto_1
    new-instance v1, Ll/᩻۠ܽ;

    add-int/lit8 p2, p2, 0x2

    aget p0, p0, p2

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v1, v0, v4, v4, p0}, Ll/᩻۠ܽ;-><init>(IIZLjava/lang/Object;)V

    return-object v1
.end method
