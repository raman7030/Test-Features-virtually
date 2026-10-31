.class public final Ll/۬ۡܺ;
.super Ljava/lang/Object;
.source "6B9F"


# instance fields
.field public final ֫:Ll/ܿۡܺ;

.field public ۧ:Ll/᩷ᩴܺ;

.field public final ܽ:I

.field public ᩳ:[Ll/᩷ᩴܺ;


# direct methods
.method public constructor <init>(Ll/ܿۡܺ;I)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-ltz p2, :cond_0

    .line 63
    iput-object p1, p0, Ll/۬ۡܺ;->֫:Ll/ܿۡܺ;

    .line 64
    iput p2, p0, Ll/۬ۡܺ;->ܽ:I

    const/4 p1, 0x0

    .line 66
    iput-object p1, p0, Ll/۬ۡܺ;->ᩳ:[Ll/᩷ᩴܺ;

    .line 67
    iput-object p1, p0, Ll/۬ۡܺ;->ۧ:Ll/᩷ᩴܺ;

    return-void

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "firstLabel < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "blocks == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ܿۡܺ;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/۬ۡܺ;->֫:Ll/ܿۡܺ;

    return-object v0
.end method

.method public final ֫(I)Ll/᩷ᩴܺ;
    .locals 14

    .line 97
    iget-object v0, p0, Ll/۬ۡܺ;->ۧ:Ll/᩷ᩴܺ;

    if-nez v0, :cond_7

    .line 155
    iget-object v0, p0, Ll/۬ۡܺ;->֫:Ll/ܿۡܺ;

    invoke-virtual {v0}, Ll/ܺᩴܺ;->֨()I

    move-result v1

    .line 156
    new-array v2, v1, [Ll/᩷ᩴܺ;

    .line 157
    new-instance v3, Ll/᩷ᩴܺ;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Ll/᩷ᩴܺ;-><init>(I)V

    .line 158
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_3

    .line 165
    invoke-virtual {v0, v7}, Ll/ܿᩴܺ;->get(I)Ll/ܽۡܺ;

    move-result-object v8

    .line 166
    invoke-virtual {v8}, Ll/ܽۡܺ;->֫()I

    move-result v9

    .line 167
    invoke-virtual {v8}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v8

    .line 168
    invoke-virtual {v8}, Ll/᩷ᩴܺ;->size()I

    move-result v10

    if-nez v10, :cond_0

    .line 171
    invoke-virtual {v3, v9}, Ll/᩷ᩴܺ;->add(I)V

    goto :goto_2

    :cond_0
    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_2

    .line 174
    invoke-virtual {v8, v11}, Ll/᩷ᩴܺ;->get(I)I

    move-result v12

    .line 175
    aget-object v13, v2, v12

    if-nez v13, :cond_1

    .line 177
    new-instance v13, Ll/᩷ᩴܺ;

    invoke-direct {v13, v4}, Ll/᩷ᩴܺ;-><init>(I)V

    .line 178
    aput-object v13, v2, v12

    .line 180
    :cond_1
    invoke-virtual {v13, v9}, Ll/᩷ᩴܺ;->add(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    :goto_3
    if-ge v6, v1, :cond_5

    .line 187
    aget-object v0, v2, v6

    if-eqz v0, :cond_4

    .line 189
    invoke-virtual {v0}, Ll/᩷ᩴܺ;->۠()V

    .line 190
    invoke-virtual {v0}, Ll/ᩴᩴܺ;->ܺ()V

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 194
    :cond_5
    invoke-virtual {v3}, Ll/᩷ᩴܺ;->۠()V

    .line 195
    invoke-virtual {v3}, Ll/ᩴᩴܺ;->ܺ()V

    .line 203
    iget v0, p0, Ll/۬ۡܺ;->ܽ:I

    aget-object v1, v2, v0

    if-nez v1, :cond_6

    .line 204
    sget-object v1, Ll/᩷ᩴܺ;->ۗ:Ll/᩷ᩴܺ;

    aput-object v1, v2, v0

    .line 207
    :cond_6
    iput-object v2, p0, Ll/۬ۡܺ;->ᩳ:[Ll/᩷ᩴܺ;

    .line 208
    iput-object v3, p0, Ll/۬ۡܺ;->ۧ:Ll/᩷ᩴܺ;

    .line 101
    :cond_7
    iget-object v0, p0, Ll/۬ۡܺ;->ᩳ:[Ll/᩷ᩴܺ;

    aget-object v0, v0, p1

    if-eqz v0, :cond_8

    return-object v0

    .line 104
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "no such block: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()I
    .locals 1

    .line 86
    iget v0, p0, Ll/۬ۡܺ;->ܽ:I

    return v0
.end method
