.class public final Ll/᩵᩻ܺ;
.super Ll/ۗۜܺ;
.source "M5FW"


# static fields
.field public static final ۤ:Ll/ᩴ᩻ܺ;


# instance fields
.field public final ۗ:Ll/ۛۢܺ;

.field public ۫:Ll/ۧ᩷ܺ;

.field public ۬:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Ll/ᩴ᩻ܺ;

    .line 81
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    sput-object v0, Ll/᩵᩻ܺ;->ۤ:Ll/ᩴ᩻ܺ;

    return-void
.end method

.method public constructor <init>(Ll/֫ۜܺ;Ll/ۛۢܺ;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 122
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p2, :cond_0

    .line 128
    iput-object p2, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    const/4 p2, 0x0

    .line 129
    iput-object p2, p0, Ll/᩵᩻ܺ;->۫:Ll/ۧ᩷ܺ;

    .line 130
    iput-object p2, p0, Ll/᩵᩻ܺ;->۬:[B

    .line 131
    invoke-virtual {p0, p1}, Ll/᩵᩻ܺ;->֫(Ll/֫ۜܺ;)V

    return-void

    .line 125
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "annotation == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩵᩻ܺ;)Ll/ۧ᩷ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵᩻ܺ;->۫:Ll/ۧ᩷ܺ;

    return-object p0
.end method

.method public static ֫([Ll/᩵᩻ܺ;)V
    .locals 1

    .line 108
    sget-object v0, Ll/᩵᩻ܺ;->ۤ:Ll/ᩴ᩻ܺ;

    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    invoke-virtual {v0}, Ll/ۛۢܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗۜܺ;)I
    .locals 1

    .line 155
    check-cast p1, Ll/᩵᩻ܺ;

    .line 157
    iget-object v0, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    iget-object p1, p1, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    invoke-virtual {v0, p1}, Ll/ۛۢܺ;->֫(Ll/ۛۢܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 139
    sget-object v0, Ll/ۘۜܺ;->۬:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 3

    .line 173
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v0

    iget-object v1, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    invoke-virtual {v1}, Ll/ۛۢܺ;->getType()Ll/۫ܺܺ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܽ᩷ܺ;->ۧ(Ll/۫ܺܺ;)Ll/ۧ᩷ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩻ܺ;->۫:Ll/ۧ᩷ܺ;

    .line 174
    invoke-static {p1, v1}, Ll/᩻᩷ܺ;->֫(Ll/֫ۜܺ;Ll/ۛۢܺ;)V

    return-void
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 6

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "    visibility: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    iget-object v1, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    invoke-virtual {v1}, Ll/ۛۢܺ;->getVisibility()Ll/ۨۢܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨۢܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 203
    invoke-virtual {p1, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "    type: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ۛۢܺ;->getType()Ll/۫ܺܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 207
    invoke-virtual {v1}, Ll/ۛۢܺ;->ۚ()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۢܺ;

    .line 208
    invoke-virtual {v1}, Ll/۟ۢܺ;->getName()Ll/۬ܺܺ;

    move-result-object v3

    .line 209
    invoke-virtual {v1}, Ll/۟ۢܺ;->getValue()Ll/ܰۡܺ;

    move-result-object v1

    .line 211
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "    "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-static {v1}, Ll/᩻᩷ܺ;->ۧ(Ll/ܰۡܺ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 211
    invoke-virtual {p1, v2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    invoke-virtual {v0}, Ll/ۛۢܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 7

    .line 221
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    .line 222
    iget-object v1, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    invoke-virtual {v1}, Ll/ۛۢܺ;->getVisibility()Ll/ۨۢܺ;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    .line 225
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " annotation"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v3, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 226
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "  visibility: VISBILITY_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v4, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 229
    :cond_0
    sget-object v5, Ll/ۘ᩻ܺ;->֫:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    if-eq v2, v4, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v5, 0x3

    if-ne v2, v5, :cond_1

    .line 237
    invoke-virtual {p2, v3}, Ll/ᩳᩴܺ;->ᩳ(I)V

    goto :goto_0

    .line 241
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 234
    :cond_2
    invoke-virtual {p2, v4}, Ll/ᩳᩴܺ;->ᩳ(I)V

    goto :goto_0

    .line 231
    :cond_3
    invoke-virtual {p2, v3}, Ll/ᩳᩴܺ;->ᩳ(I)V

    :goto_0
    if-eqz v0, :cond_4

    .line 251
    new-instance v0, Ll/᩻᩷ܺ;

    invoke-direct {v0, p1, p2}, Ll/᩻᩷ܺ;-><init>(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 252
    invoke-virtual {v0, v1, v4}, Ll/᩻᩷ܺ;->֫(Ll/ۛۢܺ;Z)V

    return-void

    .line 254
    :cond_4
    iget-object p1, p0, Ll/᩵᩻ܺ;->۬:[B

    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->֫([B)V

    return-void
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 2

    .line 184
    new-instance p2, Ll/ᩳᩴܺ;

    invoke-direct {p2}, Ll/ᩳᩴܺ;-><init>()V

    .line 185
    new-instance v0, Ll/᩻᩷ܺ;

    invoke-virtual {p1}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ll/᩻᩷ܺ;-><init>(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 187
    iget-object p1, p0, Ll/᩵᩻ܺ;->ۗ:Ll/ۛۢܺ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/᩻᩷ܺ;->֫(Ll/ۛۢܺ;Z)V

    .line 188
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->᩻()[B

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩻ܺ;->۬:[B

    .line 191
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ll/ۗۜܺ;->֫(I)V

    return-void
.end method
