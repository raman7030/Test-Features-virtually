.class public final Ll/ۜ᩷֨;
.super Ll/ᩳ᩷֨;
.source "M1T7"


# instance fields
.field public final ܽ:[Ll/᩻᩷֨;

.field public final synthetic ᩳ:Ll/᩷᩷֨;


# direct methods
.method public constructor <init>(Ll/᩷᩷֨;II)V
    .locals 0

    .line 132
    iput-object p1, p0, Ll/ۜ᩷֨;->ᩳ:Ll/᩷᩷֨;

    .line 133
    invoke-direct {p0, p2, p3}, Ll/ᩳ᩷֨;-><init>(II)V

    const/4 p1, 0x1

    add-int/2addr p2, p3

    shl-int/2addr p1, p2

    .line 135
    new-array p1, p1, [Ll/᩻᩷֨;

    iput-object p1, p0, Ll/ۜ᩷֨;->ܽ:[Ll/᩻᩷֨;

    const/4 p1, 0x0

    .line 136
    :goto_0
    iget-object p2, p0, Ll/ۜ᩷֨;->ܽ:[Ll/᩻᩷֨;

    array-length p3, p2

    if-ge p1, p3, :cond_0

    .line 137
    new-instance p3, Ll/᩻᩷֨;

    invoke-direct {p3, p0}, Ll/᩻᩷֨;-><init>(Ll/ۜ᩷֨;)V

    aput-object p3, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 10

    .line 146
    iget-object v0, p0, Ll/ۜ᩷֨;->ᩳ:Ll/᩷᩷֨;

    invoke-static {v0}, Ll/᩷᩷֨;->֫(Ll/᩷᩷֨;)Ll/᩺ۜ֨;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/᩺ۜ֨;->֫(I)I

    move-result v1

    invoke-static {v0}, Ll/᩷᩷֨;->֫(Ll/᩷᩷֨;)Ll/᩺ۜ֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۜ֨;->֫()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ll/ᩳ᩷֨;->֫(II)I

    move-result v0

    .line 147
    iget-object v1, p0, Ll/ۜ᩷֨;->ܽ:[Ll/᩻᩷֨;

    aget-object v0, v1, v0

    .line 153
    iget-object v1, v0, Ll/ܽ᩷֨;->֫:[S

    .line 155
    iget-object v0, v0, Ll/᩻᩷֨;->ۧ:Ll/ۜ᩷֨;

    iget-object v0, v0, Ll/ۜ᩷֨;->ᩳ:Ll/᩷᩷֨;

    iget-object v3, v0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    invoke-virtual {v3}, Ll/֡᩷֨;->ۧ()Z

    move-result v3

    const/16 v4, 0x100

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    :cond_0
    shl-int/lit8 v2, v5, 0x1

    .line 157
    invoke-static {v0}, Ll/᩷᩷֨;->ۧ(Ll/᩷᩷֨;)Ll/ۚ᩷֨;

    move-result-object v3

    invoke-virtual {v3, v1, v5}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v3

    or-int v5, v2, v3

    if-lt v5, v4, :cond_0

    goto :goto_0

    .line 161
    :cond_1
    invoke-static {v0}, Ll/᩷᩷֨;->֫(Ll/᩷᩷֨;)Ll/᩺ۜ֨;

    move-result-object v3

    iget-object v6, v0, Ll/ܿ᩷֨;->ۡ:[I

    aget v2, v6, v2

    invoke-virtual {v3, v2}, Ll/᩺ۜ֨;->֫(I)I

    move-result v2

    const/16 v3, 0x100

    const/4 v6, 0x1

    :cond_2
    shl-int/2addr v2, v5

    and-int v7, v2, v3

    .line 169
    invoke-static {v0}, Ll/᩷᩷֨;->ۧ(Ll/᩷᩷֨;)Ll/ۚ᩷֨;

    move-result-object v8

    add-int v9, v3, v7

    add-int/2addr v9, v6

    invoke-virtual {v8, v1, v9}, Ll/ۚ᩷֨;->֫([SI)I

    move-result v8

    shl-int/2addr v6, v5

    or-int/2addr v6, v8

    rsub-int/lit8 v8, v8, 0x0

    not-int v7, v7

    xor-int/2addr v7, v8

    and-int/2addr v3, v7

    if-lt v6, v4, :cond_2

    move v5, v6

    .line 175
    :goto_0
    invoke-static {v0}, Ll/᩷᩷֨;->֫(Ll/᩷᩷֨;)Ll/᩺ۜ֨;

    move-result-object v1

    int-to-byte v2, v5

    invoke-virtual {v1, v2}, Ll/᩺ۜ֨;->֫(B)V

    .line 176
    iget-object v0, v0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    invoke-virtual {v0}, Ll/֡᩷֨;->ᩳ()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    const/4 v0, 0x0

    .line 141
    :goto_0
    iget-object v1, p0, Ll/ۜ᩷֨;->ܽ:[Ll/᩻᩷֨;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 142
    aget-object v1, v1, v0

    .line 107
    iget-object v1, v1, Ll/ܽ᩷֨;->֫:[S

    invoke-static {v1}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
