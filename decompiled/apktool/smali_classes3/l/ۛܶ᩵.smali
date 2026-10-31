.class public final Ll/ۛܶ᩵;
.super Ljava/lang/Object;
.source "VAZ3"

# interfaces
.implements Ll/ܳ᩸᩵;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ll/ᩳ᩸᩵;

.field public final ᩹:Ll/ܳ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)V
    .locals 1

    const-string v0, "left"

    .line 5
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    .line 10
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p2, p0, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    .line 116
    iput-object p1, p0, Ll/ۛܶ᩵;->᩸:Ll/ᩳ᩸᩵;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 190
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is supported via proxy only"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 5

    .line 181
    invoke-direct {p0}, Ll/ۛܶ᩵;->֫()I

    move-result v0

    .line 182
    new-array v1, v0, [Ll/ܳ᩸᩵;

    .line 183
    new-instance v2, Ll/ܳ᩶᩵;

    .line 40
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 184
    sget-object v3, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    new-instance v4, Ll/۬ܶ᩵;

    invoke-direct {v4, v1, v2}, Ll/۬ܶ᩵;-><init>([Ll/ܳ᩸᩵;Ll/ܳ᩶᩵;)V

    invoke-virtual {p0, v3, v4}, Ll/ۛܶ᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    .line 185
    iget v2, v2, Ll/ܳ᩶᩵;->᩸:I

    if-ne v2, v0, :cond_0

    .line 187
    new-instance v0, Ll/ۤܶ᩵;

    invoke-direct {v0, v1}, Ll/ۤܶ᩵;-><init>([Ll/ܳ᩸᩵;)V

    return-object v0

    .line 185
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final ֫()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    .line 149
    :goto_0
    iget-object v1, v1, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    instance-of v2, v1, Ll/ۛܶ᩵;

    if-eqz v2, :cond_0

    check-cast v1, Ll/ۛܶ᩵;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-eq p0, p1, :cond_3

    .line 171
    instance-of v0, p1, Ll/ۛܶ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ll/ۛܶ᩵;

    invoke-direct {p1}, Ll/ۛܶ᩵;->֫()I

    move-result v0

    invoke-direct {p0}, Ll/ۛܶ᩵;->֫()I

    move-result v2

    if-ne v0, v2, :cond_2

    move-object v0, p0

    .line 160
    :goto_0
    iget-object v2, v0, Ll/ۛܶ᩵;->᩸:Ll/ᩳ᩸᩵;

    .line 155
    invoke-interface {v2}, Ll/ᩳ᩸᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ۛܶ᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v3

    invoke-static {v3, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 161
    :cond_0
    iget-object v0, v0, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    .line 162
    instance-of v2, v0, Ll/ۛܶ᩵;

    if-eqz v2, :cond_1

    .line 163
    check-cast v0, Ll/ۛܶ᩵;

    goto :goto_0

    :cond_1
    const-string v2, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    .line 165
    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ᩳ᩸᩵;

    .line 155
    invoke-interface {v0}, Ll/ᩳ᩸᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۛܶ᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return v1

    :cond_3
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 173
    iget-object v0, p0, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/ۛܶ᩵;->᩸:Ll/ᩳ᩸᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ll/۫ܶ᩵;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Ll/ۛܶ᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    invoke-interface {v0, p1, p2}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/ۛܶ᩵;->᩸:Ll/ᩳ᩸᩵;

    invoke-interface {p2, p1, v0}, Ll/᩵᩹᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge ֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 113
    invoke-static {p0, p1}, Ll/ۧ᩸᩵;->֫(Ll/ܳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 2

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    .line 122
    :goto_0
    iget-object v1, v0, Ll/ۛܶ᩵;->᩸:Ll/ᩳ᩸᩵;

    invoke-interface {v1, p1}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 123
    :cond_0
    iget-object v0, v0, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    .line 124
    instance-of v1, v0, Ll/ۛܶ᩵;

    if-eqz v1, :cond_1

    .line 125
    check-cast v0, Ll/ۛܶ᩵;

    goto :goto_0

    .line 127
    :cond_1
    invoke-interface {v0, p1}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 3

    const-string v0, "key"

    .line 136
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۛܶ᩵;->᩸:Ll/ᩳ᩸᩵;

    invoke-interface {v0, p1}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v1

    iget-object v2, p0, Ll/ۛܶ᩵;->᩹:Ll/ܳ᩸᩵;

    if-eqz v1, :cond_0

    return-object v2

    .line 137
    :cond_0
    invoke-interface {v2, p1}, Ll/ܳ᩸᩵;->ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    if-ne p1, v2, :cond_1

    return-object p0

    .line 140
    :cond_1
    sget-object v1, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    if-ne p1, v1, :cond_2

    return-object v0

    .line 141
    :cond_2
    new-instance v1, Ll/ۛܶ᩵;

    invoke-direct {v1, v0, p1}, Ll/ۛܶ᩵;-><init>(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)V

    return-object v1
.end method
