.class public abstract Ll/ۛۜܺ;
.super Ljava/lang/Object;
.source "V4OW"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/֫ۜܺ;

.field public ܽ:I

.field public ܿ:Z

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/֫ۜܺ;I)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    if-lez p3, :cond_0

    add-int/lit8 v0, p3, -0x1

    and-int/2addr v0, p3

    if-nez v0, :cond_0

    .line 86
    iput-object p1, p0, Ll/ۛۜܺ;->ᩳ:Ljava/lang/String;

    .line 87
    iput-object p2, p0, Ll/ۛۜܺ;->ۧ:Ll/֫ۜܺ;

    .line 88
    iput p3, p0, Ll/ۛۜܺ;->֫:I

    const/4 p1, -0x1

    .line 89
    iput p1, p0, Ll/ۛۜܺ;->ܽ:I

    const/4 p1, 0x0

    .line 90
    iput-boolean p1, p0, Ll/ۛۜܺ;->ܿ:Z

    return-void

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid alignment"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 81
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "file == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 108
    iget v0, p0, Ll/ۛۜܺ;->֫:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    if-ltz p1, :cond_1

    .line 195
    iget v0, p0, Ll/ۛۜܺ;->ܽ:I

    if-ltz v0, :cond_0

    add-int/2addr v0, p1

    return v0

    .line 196
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "fileOffset not yet set"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 192
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "relative < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ֫(Ll/ۖۜܺ;)I
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 4

    .line 157
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 274
    iget v0, p0, Ll/ۛۜܺ;->֫:I

    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->֫(I)V

    .line 160
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v0

    .line 162
    iget v1, p0, Ll/ۛۜܺ;->ܽ:I

    if-gez v1, :cond_0

    .line 163
    iput v0, p0, Ll/ۛۜܺ;->ܽ:I

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_3

    .line 170
    :goto_0
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\n"

    const/4 v2, 0x0

    .line 171
    iget-object v3, p0, Ll/ۛۜܺ;->ᩳ:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    .line 174
    invoke-virtual {p1, v2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 178
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Ll/ۛۜܺ;->ۧ(Ll/ᩳᩴܺ;)V

    return-void

    .line 165
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "alignment mismatch: for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but expected "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۛۜܺ;->ܽ:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()V
    .locals 2

    .line 263
    iget-boolean v0, p0, Ll/ۛۜܺ;->ܿ:Z

    if-nez v0, :cond_0

    return-void

    .line 264
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "already prepared"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)I
    .locals 1

    if-ltz p1, :cond_1

    .line 139
    iget v0, p0, Ll/ۛۜܺ;->ܽ:I

    if-gez v0, :cond_0

    .line 143
    iget v0, p0, Ll/ۛۜܺ;->֫:I

    add-int/lit8 v0, v0, -0x1

    add-int/2addr p1, v0

    not-int v0, v0

    and-int/2addr p1, v0

    .line 146
    iput p1, p0, Ll/ۛۜܺ;->ܽ:I

    return p1

    .line 140
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "fileOffset already set"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 136
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "fileOffset < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/֫ۜܺ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۛۜܺ;->ۧ:Ll/֫ۜܺ;

    return-object v0
.end method

.method public abstract ۧ(Ll/ᩳᩴܺ;)V
.end method

.method public abstract ܳ()V
.end method

.method public final ܽ()I
    .locals 2

    .line 118
    iget v0, p0, Ll/ۛۜܺ;->ܽ:I

    if-ltz v0, :cond_0

    return v0

    .line 119
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "fileOffset not set"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()V
    .locals 1

    .line 223
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 224
    invoke-virtual {p0}, Ll/ۛۜܺ;->ܳ()V

    const/4 v0, 0x1

    .line 225
    iput-boolean v0, p0, Ll/ۛۜܺ;->ܿ:Z

    return-void
.end method

.method public abstract ᩳ()Ljava/util/Collection;
.end method

.method public abstract ᩷()I
.end method

.method public final ᩻()V
    .locals 2

    .line 253
    iget-boolean v0, p0, Ll/ۛۜܺ;->ܿ:Z

    if-eqz v0, :cond_0

    return-void

    .line 254
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not prepared"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
