.class public final Ll/֨۠۠;
.super Ljava/lang/Object;
.source "G7KW"


# static fields
.field public static final ܿ:Ljava/lang/Object;


# instance fields
.field public ֫:[I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֨۠۠;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v1, v0, [Ljava/lang/Object;

    .line 51
    iput-object v1, p0, Ll/֨۠۠;->ᩳ:[Ljava/lang/Object;

    new-array v0, v0, [I

    .line 52
    iput-object v0, p0, Ll/֨۠۠;->֫:[I

    const/16 v0, 0x3f

    .line 53
    iput v0, p0, Ll/֨۠۠;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 5

    .line 78
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    ushr-int/lit8 v1, v0, 0xf

    xor-int/2addr v1, v0

    shl-int/lit8 v2, v0, 0x6

    xor-int/2addr v0, v2

    or-int/lit8 v0, v0, 0x1

    .line 94
    iget v2, p0, Ll/֨۠۠;->ۧ:I

    and-int/2addr v1, v2

    const/4 v2, -0x1

    .line 95
    :goto_0
    iget-object v3, p0, Ll/֨۠۠;->ᩳ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    if-ne v3, p1, :cond_0

    goto :goto_1

    :cond_0
    if-nez v3, :cond_2

    if-ltz v2, :cond_1

    return v2

    :cond_1
    :goto_1
    return v1

    .line 100
    :cond_2
    sget-object v4, Ll/֨۠۠;->ܿ:Ljava/lang/Object;

    if-ne v3, v4, :cond_3

    if-gez v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v1, v0

    .line 94
    iget v3, p0, Ll/֨۠۠;->ۧ:I

    and-int/2addr v1, v3

    goto :goto_0
.end method

.method public final ֫(Ll/ۚۚ۠;)I
    .locals 2

    .line 113
    invoke-virtual {p0, p1}, Ll/֨۠۠;->֫(Ljava/lang/Object;)I

    move-result p1

    .line 114
    iget-object v0, p0, Ll/֨۠۠;->ᩳ:[Ljava/lang/Object;

    aget-object v0, v0, p1

    if-eqz v0, :cond_1

    .line 115
    sget-object v1, Ll/֨۠۠;->ܿ:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/֨۠۠;->֫:[I

    aget p1, v0, p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 4

    .line 127
    invoke-virtual {p0, p2}, Ll/֨۠۠;->֫(Ljava/lang/Object;)I

    move-result v0

    .line 128
    iget-object v1, p0, Ll/֨۠۠;->ᩳ:[Ljava/lang/Object;

    aget-object v2, v1, v0

    .line 129
    sget-object v3, Ll/֨۠۠;->ܿ:Ljava/lang/Object;

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 138
    :cond_0
    iget-object p2, p0, Ll/֨۠۠;->֫:[I

    aget v1, p2, v0

    .line 139
    aput p1, p2, v0

    return-void

    .line 130
    :cond_1
    :goto_0
    aput-object p2, v1, v0

    .line 131
    iget-object p2, p0, Ll/֨۠۠;->֫:[I

    aput p1, p2, v0

    if-eq v2, v3, :cond_2

    .line 133
    iget p1, p0, Ll/֨۠۠;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨۠۠;->ܽ:I

    .line 134
    :cond_2
    iget p1, p0, Ll/֨۠۠;->ܽ:I

    mul-int/lit8 p1, p1, 0x3

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    if-lt p1, v0, :cond_4

    .line 168
    array-length p1, v1

    shl-int/lit8 p1, p1, 0x1

    .line 169
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Ll/֨۠۠;->ᩳ:[Ljava/lang/Object;

    .line 170
    new-array v0, p1, [I

    iput-object v0, p0, Ll/֨۠۠;->֫:[I

    add-int/lit8 p1, p1, -0x1

    .line 171
    iput p1, p0, Ll/֨۠۠;->ۧ:I

    const/4 p1, 0x0

    .line 172
    iput p1, p0, Ll/֨۠۠;->ܽ:I

    .line 174
    array-length p1, p2

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_4

    .line 175
    aget-object v0, v1, p1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_3

    .line 177
    aget v2, p2, p1

    invoke-virtual {p0, v2, v0}, Ll/֨۠۠;->֫(ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)I
    .locals 3

    .line 152
    invoke-virtual {p0, p1}, Ll/֨۠۠;->֫(Ljava/lang/Object;)I

    move-result p1

    .line 153
    iget-object v0, p0, Ll/֨۠۠;->ᩳ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    if-eqz v1, :cond_1

    .line 154
    sget-object v2, Ll/֨۠۠;->ܿ:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 156
    :cond_0
    aput-object v2, v0, p1

    .line 157
    iget-object v0, p0, Ll/֨۠۠;->֫:[I

    aget p1, v0, p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method
