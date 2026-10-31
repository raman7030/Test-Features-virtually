.class public final Ll/۫ۢ۠;
.super Ljava/lang/Object;
.source "07LE"


# instance fields
.field public ֫:Ljava/util/LinkedHashMap;

.field public ۧ:Ljava/util/LinkedHashSet;

.field public final ܳ:Ll/ۛ᩸֨;

.field public final ܽ:Ll/ۛܶ۠;

.field public final ܿ:Ll/ۗۢ۠;

.field public final ᩳ:Ll/۬ۢ۠;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;Ll/ۛܶ۠;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/۫ۢ۠;->ۧ:Ljava/util/LinkedHashSet;

    .line 97
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۢ۠;->֫:Ljava/util/LinkedHashMap;

    .line 100
    iput-object p1, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    .line 101
    iput-object p2, p0, Ll/۫ۢ۠;->ܽ:Ll/ۛܶ۠;

    .line 102
    new-instance p2, Ll/ۗۢ۠;

    invoke-direct {p2, p0, p1}, Ll/ۗۢ۠;-><init>(Ll/۫ۢ۠;Ll/ۛ᩸֨;)V

    iput-object p2, p0, Ll/۫ۢ۠;->ܿ:Ll/ۗۢ۠;

    .line 103
    new-instance p1, Ll/۬ۢ۠;

    invoke-direct {p1, p0}, Ll/۬ۢ۠;-><init>(Ll/۫ۢ۠;)V

    iput-object p1, p0, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    return-void
.end method

.method public static ֫(Ll/۫ۢ۠;Ll/֡ۢ۠;)I
    .locals 1

    .line 242
    iget-object v0, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-interface {p1, v0}, Ll/֡ۢ۠;->ۧ(Ll/ۛ᩸֨;)Ll/᩵ۢ۠;

    move-result-object p1

    .line 245
    iget-object p0, p0, Ll/۫ۢ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 247
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 248
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/۫ۢ۠;)Ll/ۛܶ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۢ۠;->ܽ:Ll/ۛܶ۠;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۫ۢ۠;)Ll/ۛ᩸֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 2

    .line 166
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    .line 66
    new-instance v0, Ll/֨ۢ۠;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 167
    invoke-virtual {p0, v0}, Ll/۫ۢ۠;->֫(Ll/۠ۢ۠;)I

    move-result p1

    return p1

    .line 168
    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Float;

    .line 73
    new-instance v0, Ll/֨ۢ۠;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 169
    invoke-virtual {p0, v0}, Ll/۫ۢ۠;->֫(Ll/۠ۢ۠;)I

    move-result p1

    return p1

    .line 170
    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Long;

    .line 80
    new-instance v0, Ll/֨ۢ۠;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 171
    invoke-virtual {p0, v0}, Ll/۫ۢ۠;->֫(Ll/۠ۢ۠;)I

    move-result p1

    return p1

    .line 172
    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Double;

    .line 87
    new-instance v0, Ll/֨ۢ۠;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p1}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 173
    invoke-virtual {p0, v0}, Ll/۫ۢ۠;->֫(Ll/۠ۢ۠;)I

    move-result p1

    return p1

    .line 174
    :cond_3
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/String;

    .line 175
    invoke-static {p1}, Ll/ۚۢ۠;->֫(Ljava/lang/String;)Ll/֨ۢ۠;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۫ۢ۠;->֫(Ll/۠ۢ۠;)I

    move-result p1

    return p1

    .line 177
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "unexpected constant: "

    .line 0
    invoke-static {p1, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 177
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ֫(Ll/ۙ֨֨;)I
    .locals 1

    .line 118
    iget-object v0, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    iget-object v0, p0, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    invoke-static {v0, p1}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۛ֡֨;)I
    .locals 3

    .line 238
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    iget-object v2, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, v2}, Ll/ۛ֡֨;->ᩳ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 146
    :goto_0
    invoke-virtual {p0, p1}, Ll/۫ۢ۠;->ۧ(Ll/ۙ֨֨;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۠ۢ۠;)I
    .locals 3

    .line 185
    invoke-interface {p1}, Ll/᩸ۢ۠;->ۘ()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x10

    iget-object v2, p0, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    if-eq v0, v1, :cond_0

    .line 191
    invoke-static {v2, p1}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result p1

    return p1

    .line 189
    :cond_0
    iget-object v0, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    check-cast p1, Ll/ۙ֨֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-static {v2, p1}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result p1

    return p1

    .line 187
    :cond_1
    check-cast p1, Ll/ۙ֨֨;

    invoke-virtual {p0, p1}, Ll/۫ۢ۠;->֫(Ll/ۙ֨֨;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 3

    .line 224
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 227
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩶()V

    .line 228
    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫ۢ۠;->ۧ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 229
    iget-object v1, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/۫ۢ۠;->֫(Ll/ܳ֡֨;)V

    .line 230
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    .line 225
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected intersection type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ۧ(Ll/ۙ֨֨;)I
    .locals 3

    .line 139
    iget-object v0, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 323
    iget-object v0, p0, Ll/۫ۢ۠;->ܿ:Ll/ۗۢ۠;

    iget-object v1, v0, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    const/4 v2, 0x0

    .line 237
    iput v2, v1, Ll/ܶ֨۠;->ۧ:I

    .line 492
    invoke-virtual {v0, p1}, Ll/ۗۢ۠;->ۧ(Ll/ۙ֨֨;)V

    .line 327
    iget-object p1, v0, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    iget-object v0, v0, Ll/ۗۢ۠;->ܽ:Ll/۫ۢ۠;

    invoke-static {v0}, Ll/۫ۢ۠;->֫(Ll/۫ۢ۠;)Ll/ۛܶ۠;

    move-result-object v0

    .line 243
    iget-object v1, p1, Ll/ܶ֨۠;->֫:[B

    iget p1, p1, Ll/ܶ֨۠;->ۧ:I

    .line 422
    iget-object v0, v0, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v0, v2, p1, v1}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    .line 196
    iget-object v0, p0, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    invoke-static {v0, p1}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ۛ֡֨;)I
    .locals 5

    .line 203
    new-instance v0, Ll/ܶۢ۠;

    iget-object v1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 238
    iget-object v2, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    iget-object v4, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    if-ne v2, v3, :cond_0

    invoke-virtual {p1, v4}, Ll/ۛ֡֨;->ᩳ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v4}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 203
    :goto_0
    invoke-direct {v0, v1, p1}, Ll/ܶۢ۠;-><init>(Ll/ۤܶ۠;Ll/ۙ֨֨;)V

    iget-object p1, p0, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    invoke-static {p1, v0}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result p1

    return p1
.end method

.method public final ܽ(Ll/ۛ֡֨;)I
    .locals 5

    .line 154
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    iget-object v2, p0, Ll/۫ۢ۠;->ܿ:Ll/ۗۢ۠;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    if-ne v0, v1, :cond_2

    .line 155
    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 323
    iget-object v0, v2, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    .line 237
    iput v3, v0, Ll/ܶ֨۠;->ۧ:I

    .line 498
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 499
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 500
    invoke-virtual {v2, v0}, Ll/ۖ᩸֨;->֫(Ll/ۖܶ۠;)V

    .line 502
    :cond_0
    iget-object v0, p0, Ll/۫ۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۗۢ۠;->ۧ(Ll/ۙ֨֨;)V

    .line 503
    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    .line 504
    invoke-virtual {v2, v0}, Ll/ۗۢ۠;->ۧ(Ll/ۙ֨֨;)V

    goto :goto_0

    .line 327
    :cond_1
    iget-object p1, v2, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    iget-object v0, v2, Ll/ۗۢ۠;->ܽ:Ll/۫ۢ۠;

    invoke-static {v0}, Ll/۫ۢ۠;->֫(Ll/۫ۢ۠;)Ll/ۛܶ۠;

    move-result-object v0

    .line 243
    iget-object v1, p1, Ll/ܶ֨۠;->֫:[B

    iget p1, p1, Ll/ܶ֨۠;->ۧ:I

    .line 422
    iget-object v0, v0, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v0, v3, p1, v1}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    .line 196
    :goto_1
    invoke-static {v4, p1}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result p1

    return p1

    .line 157
    :cond_2
    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 323
    iget-object v0, v2, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    .line 237
    iput v3, v0, Ll/ܶ֨۠;->ۧ:I

    .line 492
    invoke-virtual {v2, p1}, Ll/ۗۢ۠;->ۧ(Ll/ۙ֨֨;)V

    .line 327
    iget-object p1, v2, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    iget-object v0, v2, Ll/ۗۢ۠;->ܽ:Ll/۫ۢ۠;

    invoke-static {v0}, Ll/۫ۢ۠;->֫(Ll/۫ۢ۠;)Ll/ۛܶ۠;

    move-result-object v0

    .line 243
    iget-object v1, p1, Ll/ܶ֨۠;->֫:[B

    iget p1, p1, Ll/ܶ֨۠;->ۧ:I

    .line 422
    iget-object v0, v0, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v0, v3, p1, v1}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    goto :goto_1
.end method
