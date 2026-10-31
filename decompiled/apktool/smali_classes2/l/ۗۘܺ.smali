.class public abstract Ll/ۗۘܺ;
.super Ljava/lang/Object;
.source "PBEP"


# instance fields
.field public final ֫:Ll/᩹ۘܺ;

.field public final ۧ:Ll/᩷ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;Ll/᩹ۘܺ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ۗۘܺ;->ۧ:Ll/᩷ۘܺ;

    .line 59
    iput-object p2, p0, Ll/ۗۘܺ;->֫:Ll/᩹ۘܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
    .locals 8

    .line 141
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    .line 143
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_3

    .line 150
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_2

    .line 165
    iget-object v3, p0, Ll/ۗۘܺ;->ۧ:Ll/᩷ۘܺ;

    invoke-virtual {v3}, Ll/᩷ۘܺ;->ܺ()I

    move-result v4

    .line 166
    invoke-virtual {p2}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v5

    .line 165
    invoke-static {v4, v5}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v4

    .line 168
    new-instance v5, Ll/֨ۡܺ;

    .line 169
    invoke-virtual {v4}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v6

    invoke-static {v6}, Ll/۫ۡܺ;->ۧ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v6

    sget-object v7, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    .line 171
    invoke-static {p2}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object p2

    invoke-direct {v5, v6, v7, v4, p2}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    .line 168
    invoke-static {v5, v0}, Ll/ܳۘܺ;->֫(Ll/֨ۡܺ;Ll/ܽۘܺ;)Ll/۫ۖܺ;

    move-result-object p2

    .line 173
    invoke-virtual {v1, v2, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 175
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p2

    .line 182
    invoke-virtual {v0}, Ll/ܽۘܺ;->ᩳ()Ll/ۢᩴܺ;

    move-result-object v0

    .line 183
    invoke-interface {v0}, Ll/ۢᩴܺ;->iterator()Ll/ۜᩴܺ;

    move-result-object v0

    .line 185
    :goto_0
    invoke-interface {v0}, Ll/ۜᩴܺ;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ۗۘܺ;->֫:Ll/᩹ۘܺ;

    if-eqz v1, :cond_0

    .line 186
    invoke-interface {v0}, Ll/ۜᩴܺ;->next()I

    move-result v1

    invoke-virtual {v2, p2, v1}, Ll/᩹ۘܺ;->֫(II)V

    goto :goto_0

    .line 190
    :cond_0
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object p1

    .line 191
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    .line 194
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    invoke-virtual {v2, p2, v5}, Ll/᩹ۘܺ;->֫(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 197
    :cond_1
    invoke-virtual {v3}, Ll/᩷ۘܺ;->ۖ()V

    return-object v4

    .line 156
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Adding move here not supported:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-interface {p1}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 146
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "specified insn is not in this block"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
