.class public final Ll/᩻ۙ᩵;
.super Ll/ۜۙ᩵;
.source "T9NL"

# interfaces
.implements Ljava/util/Iterator;
.implements Ll/ۨܶ᩵;


# instance fields
.field public ۙ:I

.field public ᩶:Ljava/lang/Object;

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Ll/ۨܶ᩵;


# direct methods
.method private final ֫()Ljava/lang/RuntimeException;
    .locals 3

    .line 155
    iget v0, p0, Ll/᩻ۙ᩵;->ۙ:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 158
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected state of the iterator: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/᩻ۙ᩵;->ۙ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 157
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Iterator has failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 156
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final getContext()Ll/ܳ᩸᩵;
    .locals 1

    .line 188
    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 4

    .line 112
    :goto_0
    iget v0, p0, Ll/᩻ۙ᩵;->ۙ:I

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 123
    :cond_0
    invoke-direct {p0}, Ll/᩻ۙ᩵;->֫()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    return v3

    .line 115
    :cond_2
    iget-object v0, p0, Ll/᩻ۙ᩵;->᩸:Ljava/util/Iterator;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    iput v2, p0, Ll/᩻ۙ᩵;->ۙ:I

    return v3

    .line 119
    :cond_3
    iput-object v1, p0, Ll/᩻ۙ᩵;->᩸:Ljava/util/Iterator;

    :cond_4
    const/4 v0, 0x5

    .line 126
    iput v0, p0, Ll/᩻ۙ᩵;->ۙ:I

    .line 127
    iget-object v0, p0, Ll/᩻ۙ᩵;->᩹:Ll/ۨܶ᩵;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 128
    iput-object v1, p0, Ll/᩻ۙ᩵;->᩹:Ll/ۨܶ᩵;

    .line 129
    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-interface {v0, v1}, Ll/ۨܶ᩵;->֫(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 134
    iget v0, p0, Ll/᩻ۙ᩵;->ۙ:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 141
    iput v0, p0, Ll/᩻ۙ᩵;->ۙ:I

    .line 143
    iget-object v0, p0, Ll/᩻ۙ᩵;->᩶:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 144
    iput-object v1, p0, Ll/᩻ۙ᩵;->᩶:Ljava/lang/Object;

    return-object v0

    .line 147
    :cond_0
    invoke-direct {p0}, Ll/᩻ۙ᩵;->֫()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 137
    :cond_1
    iput v1, p0, Ll/᩻ۙ᩵;->ۙ:I

    .line 138
    iget-object v0, p0, Ll/᩻ۙ᩵;->᩸:Ljava/util/Iterator;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 152
    :cond_2
    invoke-virtual {p0}, Ll/᩻ۙ᩵;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ll/᩻ۙ᩵;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/Iterator;Ll/ۨܶ᩵;)Ljava/lang/Object;
    .locals 1

    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1

    .line 173
    :cond_0
    iput-object p1, p0, Ll/᩻ۙ᩵;->᩸:Ljava/util/Iterator;

    const/4 p1, 0x2

    .line 174
    iput p1, p0, Ll/᩻ۙ᩵;->ۙ:I

    .line 176
    iput-object p2, p0, Ll/᩻ۙ᩵;->᩹:Ll/ۨܶ᩵;

    .line 57
    sget-object p1, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۜ᩸᩵;
    .locals 0

    .line 163
    iput-object p1, p0, Ll/᩻ۙ᩵;->᩶:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 164
    iput p1, p0, Ll/᩻ۙ᩵;->ۙ:I

    .line 166
    iput-object p2, p0, Ll/᩻ۙ᩵;->᩹:Ll/ۨܶ᩵;

    .line 57
    sget-object p1, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 183
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 184
    iput p1, p0, Ll/᩻ۙ᩵;->ۙ:I

    return-void
.end method

.method public final ֫(Ll/ۨܶ᩵;)V
    .locals 0

    .line 108
    iput-object p1, p0, Ll/᩻ۙ᩵;->᩹:Ll/ۨܶ᩵;

    return-void
.end method
