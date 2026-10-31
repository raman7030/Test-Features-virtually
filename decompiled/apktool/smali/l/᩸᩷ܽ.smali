.class public final Ll/᩸᩷ܽ;
.super Ljava/lang/Object;
.source "T57T"


# instance fields
.field public final ֫:[B

.field public final ۧ:[B

.field public final ܽ:[I

.field public final ܿ:[Ljava/lang/String;

.field public final ᩳ:[I


# direct methods
.method public constructor <init>(Ll/᩹᩷ܽ;)V
    .locals 7

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 48
    iput-object v1, p0, Ll/᩸᩷ܽ;->ۧ:[B

    .line 49
    invoke-static {p1}, Ll/᩹᩷ܽ;->ᩳ(Ll/᩹᩷ܽ;)Ll/ۡܺܽ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡܺܽ;->֫()[B

    move-result-object v2

    iput-object v2, p0, Ll/᩸᩷ܽ;->֫:[B

    new-array v2, v0, [I

    .line 50
    iput-object v2, p0, Ll/᩸᩷ܽ;->ᩳ:[I

    new-array v2, v0, [I

    .line 51
    iput-object v2, p0, Ll/᩸᩷ܽ;->ܽ:[I

    .line 52
    invoke-static {p1}, Ll/᩹᩷ܽ;->ܿ(Ll/᩹᩷ܽ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    iput-object v2, p0, Ll/᩸᩷ܽ;->ܿ:[Ljava/lang/String;

    .line 53
    invoke-static {p1}, Ll/᩹᩷ܽ;->֫(Ll/᩹᩷ܽ;)[B

    move-result-object v2

    invoke-static {v2, v0, v1, v0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    invoke-static {p1}, Ll/᩹᩷ܽ;->ܽ(Ll/᩹᩷ܽ;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩷ܽ;

    .line 55
    iget-object v3, p0, Ll/᩸᩷ܽ;->ᩳ:[I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aput v0, v3, v0

    .line 56
    iget-object v2, p0, Ll/᩸᩷ܽ;->ܽ:[I

    aput v0, v2, v0

    goto :goto_0

    .line 58
    :cond_0
    invoke-static {p1}, Ll/᩹᩷ܽ;->ܿ(Ll/᩹᩷ܽ;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Ll/᩸᩷ܽ;->ܿ:[Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 59
    invoke-static {p1}, Ll/᩹᩷ܽ;->ۧ(Ll/᩹᩷ܽ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 60
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 82
    iget-object v4, p0, Ll/᩸᩷ܽ;->֫:[B

    add-int/lit8 v5, v3, 0x1

    aget-byte v5, v4, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    aget-byte v3, v4, v3

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v3, v5

    int-to-short v3, v3

    .line 61
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {p1}, Ll/᩹᩷ܽ;->ܽ(Ll/᩹᩷ܽ;)Ljava/util/HashMap;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩷ܽ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    iget-object v3, p0, Ll/᩸᩷ܽ;->֫:[B

    add-int/lit8 v4, v2, 0x1

    int-to-byte v5, v0

    aput-byte v5, v3, v2

    add-int/lit8 v6, v2, 0x2

    .line 76
    aput-byte v5, v3, v4

    add-int/lit8 v2, v2, 0x3

    .line 77
    aput-byte v5, v3, v6

    .line 78
    aput-byte v5, v3, v2

    goto :goto_1

    :cond_1
    return-void
.end method

.method public constructor <init>([B[B[I[I[Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ll/᩸᩷ܽ;->ۧ:[B

    .line 68
    iput-object p2, p0, Ll/᩸᩷ܽ;->֫:[B

    .line 69
    iput-object p3, p0, Ll/᩸᩷ܽ;->ᩳ:[I

    .line 70
    iput-object p4, p0, Ll/᩸᩷ܽ;->ܽ:[I

    .line 71
    iput-object p5, p0, Ll/᩸᩷ܽ;->ܿ:[Ljava/lang/String;

    return-void
.end method
