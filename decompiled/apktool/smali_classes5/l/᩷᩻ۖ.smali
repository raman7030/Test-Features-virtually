.class public Ll/᩷᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 86
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 6

    .line 89
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 90
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 92
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v1

    const/4 v2, 0x0

    .line 93
    :goto_0
    sget-object v3, Ll/ܳۜۖ;->ۗ:Ll/ܳۜۖ;

    if-eq v1, v3, :cond_5

    .line 95
    sget-object v3, Ll/ۘ᩻ۖ;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v5, 0x2

    if-eq v3, v5, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    .line 112
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܶ()Z

    move-result v4

    goto :goto_1

    .line 115
    :cond_0
    new-instance v0, Ll/ܳᩳۖ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid bitset value type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; at path "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 116
    throw v0

    .line 98
    :cond_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩹()I

    move-result v1

    if-nez v1, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    if-ne v1, v4, :cond_4

    :goto_1
    if-eqz v4, :cond_3

    .line 119
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 122
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v1

    goto :goto_0

    .line 104
    :cond_4
    new-instance v0, Ll/ܳᩳۖ;

    const-string v2, "Invalid bitset value "

    const-string v3, ", expected 0 or 1; at path "

    .line 0
    invoke-static {v1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 108
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 108
    throw v0

    .line 124
    :cond_5
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 4

    .line 86
    check-cast p2, Ljava/util/BitSet;

    .line 130
    invoke-virtual {p1}, Ll/᩻ۜۖ;->֫()V

    .line 131
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 132
    invoke-virtual {p2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    int-to-long v2, v2

    .line 133
    invoke-virtual {p1, v2, v3}, Ll/᩻ۜۖ;->ۧ(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 135
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ᩳ()V

    return-void
.end method
