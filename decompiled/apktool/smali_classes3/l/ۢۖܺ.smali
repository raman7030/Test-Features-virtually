.class public final Ll/ۢۖܺ;
.super Ljava/lang/Object;
.source "MBI9"


# instance fields
.field public final ֫:[Ll/᩷ۖܺ;

.field public final ۧ:Ll/᩷ۘܺ;

.field public final ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 4

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Ll/ۢۖܺ;->ۧ:Ll/᩷ۘܺ;

    .line 67
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۖܺ;->ܽ:Ljava/util/ArrayList;

    .line 69
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 70
    new-array v0, p1, [Ll/᩷ۖܺ;

    iput-object v0, p0, Ll/ۢۖܺ;->֫:[Ll/᩷ۖܺ;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 73
    iget-object v1, p0, Ll/ۢۖܺ;->֫:[Ll/᩷ۖܺ;

    new-instance v2, Ll/᩷ۖܺ;

    .line 47
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, -0x1

    .line 57
    iput v3, v2, Ll/᩷ۖܺ;->ۧ:I

    .line 73
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()[Ll/᩷ۖܺ;
    .locals 11

    .line 83
    iget-object v0, p0, Ll/ۢۖܺ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 93
    iget-object v2, p0, Ll/ۢۖܺ;->ۧ:Ll/᩷ۘܺ;

    iget-object v3, p0, Ll/ۢۖܺ;->֫:[Ll/᩷ۖܺ;

    invoke-static {v2, v3}, Ll/ۖۖܺ;->֫(Ll/᩷ۘܺ;[Ll/᩷ۖܺ;)V

    .line 155
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, -0x1

    if-ge v5, v2, :cond_1

    .line 158
    aget-object v7, v3, v5

    .line 160
    iget v7, v7, Ll/᩷ۖܺ;->ۧ:I

    if-ne v7, v6, :cond_0

    goto :goto_1

    .line 162
    :cond_0
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽۘܺ;

    .line 163
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽۘܺ;

    invoke-virtual {v6, v7}, Ll/ܽۘܺ;->֫(Ll/ܽۘܺ;)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_2
    if-ge v2, v1, :cond_3

    .line 110
    aget-object v5, v3, v2

    const/16 v7, 0xc00

    if-gt v1, v7, :cond_2

    .line 68
    new-instance v7, Ll/᩺ۘܺ;

    invoke-direct {v7, v1}, Ll/᩺ۘܺ;-><init>(I)V

    goto :goto_3

    .line 69
    :cond_2
    new-instance v7, Ll/ۘᩴܺ;

    invoke-direct {v7}, Ll/ۘᩴܺ;-><init>()V

    .line 111
    :goto_3
    iput-object v7, v5, Ll/᩷ۖܺ;->֫:Ll/ۢᩴܺ;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 173
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_8

    .line 176
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۘܺ;

    .line 177
    aget-object v7, v3, v2

    .line 178
    invoke-virtual {v5}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object v5

    .line 180
    invoke-virtual {v5}, Ljava/util/BitSet;->cardinality()I

    move-result v8

    const/4 v9, 0x1

    if-le v8, v9, :cond_7

    .line 181
    invoke-virtual {v5, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v8

    :goto_5
    if-ltz v8, :cond_7

    move v9, v8

    .line 185
    :goto_6
    iget v10, v7, Ll/᩷ۖܺ;->ۧ:I

    if-eq v9, v10, :cond_6

    if-ne v9, v6, :cond_4

    goto :goto_7

    .line 193
    :cond_4
    aget-object v9, v3, v9

    .line 195
    iget-object v10, v9, Ll/᩷ۖܺ;->֫:Ll/ۢᩴܺ;

    invoke-interface {v10, v2}, Ll/ۢᩴܺ;->֫(I)Z

    move-result v10

    if-eqz v10, :cond_5

    goto :goto_7

    .line 200
    :cond_5
    iget-object v10, v9, Ll/᩷ۖܺ;->֫:Ll/ۢᩴܺ;

    invoke-interface {v10, v2}, Ll/ۢᩴܺ;->add(I)V

    .line 201
    iget v9, v9, Ll/᩷ۖܺ;->ۧ:I

    goto :goto_6

    :cond_6
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 182
    invoke-virtual {v5, v8}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v8

    goto :goto_5

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    return-object v3
.end method
