.class public final Ll/ۚܳۘ;
.super Ljava/lang/Object;
.source "U1KY"

# interfaces
.implements Ll/֡ܳۘ;


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:Ljava/util/List;

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(IIIIIIIILjava/util/List;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput p1, p0, Ll/ۚܳۘ;->ܳ:I

    .line 60
    iput p2, p0, Ll/ۚܳۘ;->֫:I

    .line 61
    iput p3, p0, Ll/ۚܳۘ;->᩻:I

    .line 62
    iput p4, p0, Ll/ۚܳۘ;->ۧ:I

    .line 63
    iput p5, p0, Ll/ۚܳۘ;->ۜ:I

    .line 64
    iput p6, p0, Ll/ۚܳۘ;->ܽ:I

    .line 65
    iput p7, p0, Ll/ۚܳۘ;->᩷:I

    .line 66
    iput p8, p0, Ll/ۚܳۘ;->ᩳ:I

    sub-int/2addr p6, p5

    sub-int/2addr p8, p7

    if-eqz p9, :cond_1

    .line 104
    invoke-interface {p9}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    if-ne p1, p3, :cond_1

    const/4 p1, 0x0

    .line 109
    invoke-interface {p9, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴܳۘ;

    .line 110
    invoke-interface {p1}, Ll/ᩴܳۘ;->ᩳ()I

    move-result p3

    if-nez p3, :cond_1

    .line 111
    invoke-interface {p1}, Ll/ᩴܳۘ;->ܿ()I

    move-result p3

    if-nez p3, :cond_1

    .line 112
    invoke-interface {p1}, Ll/ᩴܳۘ;->֫()I

    move-result p3

    if-ne p3, p6, :cond_1

    .line 113
    invoke-interface {p1}, Ll/ᩴܳۘ;->᩻()I

    move-result p1

    if-ne p1, p8, :cond_1

    :goto_0
    move-object p9, p2

    .line 68
    :cond_1
    iput-object p9, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    .line 70
    iget p1, p0, Ll/ۚܳۘ;->ܳ:I

    iget p2, p0, Ll/ۚܳۘ;->֫:I

    if-ne p1, p2, :cond_2

    iget p1, p0, Ll/ۚܳۘ;->᩻:I

    iget p2, p0, Ll/ۚܳۘ;->ۧ:I

    if-ne p1, p2, :cond_2

    .line 72
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "LineFragmentImpl should not be empty: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۚܳۘ;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 74
    :cond_2
    iget p1, p0, Ll/ۚܳۘ;->ܳ:I

    iget p2, p0, Ll/ۚܳۘ;->֫:I

    if-gt p1, p2, :cond_4

    iget p1, p0, Ll/ۚܳۘ;->᩻:I

    iget p2, p0, Ll/ۚܳۘ;->ۧ:I

    if-gt p1, p2, :cond_4

    iget p1, p0, Ll/ۚܳۘ;->ۜ:I

    iget p2, p0, Ll/ۚܳۘ;->ܽ:I

    if-gt p1, p2, :cond_4

    iget p1, p0, Ll/ۚܳۘ;->᩷:I

    iget p2, p0, Ll/ۚܳۘ;->ᩳ:I

    if-le p1, p2, :cond_3

    goto :goto_1

    :cond_3
    return-void

    .line 78
    :cond_4
    :goto_1
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "LineFragmentImpl is invalid: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۚܳۘ;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/֡ܳۘ;Ljava/util/List;)V
    .locals 10

    .line 51
    invoke-interface {p1}, Ll/֡ܳۘ;->ۧ()I

    move-result v1

    invoke-interface {p1}, Ll/֡ܳۘ;->ۜ()I

    move-result v2

    invoke-interface {p1}, Ll/֡ܳۘ;->ܽ()I

    move-result v3

    invoke-interface {p1}, Ll/֡ܳۘ;->᩷()I

    move-result v4

    .line 52
    invoke-interface {p1}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v5

    invoke-interface {p1}, Ll/ᩴܳۘ;->֫()I

    move-result v6

    invoke-interface {p1}, Ll/ᩴܳۘ;->ܿ()I

    move-result v7

    invoke-interface {p1}, Ll/ᩴܳۘ;->᩻()I

    move-result v8

    move-object v0, p0

    move-object v9, p2

    .line 51
    invoke-direct/range {v0 .. v9}, Ll/ۚܳۘ;-><init>(IIIIIIIILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 4

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->ܳ:I

    .line 84
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->֫:I

    .line 85
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->᩻:I

    .line 86
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->ۧ:I

    .line 87
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->ۜ:I

    .line 88
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->ܽ:I

    .line 89
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->᩷:I

    .line 90
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۚܳۘ;->ᩳ:I

    .line 91
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 93
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 95
    new-instance v3, Ll/᩵ܳۘ;

    invoke-direct {v3, p1}, Ll/᩵ܳۘ;-><init>(Ll/۬ۜܽ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 97
    :cond_0
    iput-object v1, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    :cond_1
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LineFragmentImpl: Lines ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۚܳۘ;->ܳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚܳۘ;->֫:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") - ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۚܳۘ;->᩻:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۚܳۘ;->ۧ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "); Offsets ["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۚܳۘ;->ۜ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۚܳۘ;->ܽ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚܳۘ;->᩷:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۚܳۘ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "); Inner "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 148
    iget v0, p0, Ll/ۚܳۘ;->ܽ:I

    return v0
.end method

.method public final ֫(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p0}, Ll/ۚܳۘ;->ᩳ()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/ۚܳۘ;->ܿ()I

    move-result p1

    return p1
.end method

.method public final ֫(I)V
    .locals 0

    .line 173
    iput p1, p0, Ll/ۚܳۘ;->᩻:I

    return-void
.end method

.method public final ֫(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 73
    invoke-virtual {p0, p1}, Ll/ۚܳۘ;->ۜ(I)V

    return-void

    .line 75
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚܳۘ;->᩻(I)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    .line 230
    iput-object p1, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 203
    iget v0, p0, Ll/ۚܳۘ;->ܳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 204
    iget v0, p0, Ll/ۚܳۘ;->֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 205
    iget v0, p0, Ll/ۚܳۘ;->᩻:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 206
    iget v0, p0, Ll/ۚܳۘ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 207
    iget v0, p0, Ll/ۚܳۘ;->ۜ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 208
    iget v0, p0, Ll/ۚܳۘ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 209
    iget v0, p0, Ll/ۚܳۘ;->᩷:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 210
    iget v0, p0, Ll/ۚܳۘ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 211
    iget-object v0, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 212
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 213
    iget-object v0, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 214
    iget-object v0, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܳۘ;

    .line 215
    invoke-interface {v1, p1}, Ll/ᩴܳۘ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    .line 91
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ۜ()I
    .locals 1

    .line 128
    iget v0, p0, Ll/ۚܳۘ;->֫:I

    return v0
.end method

.method public final ۜ(I)V
    .locals 0

    .line 168
    iput p1, p0, Ll/ۚܳۘ;->֫:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 123
    iget v0, p0, Ll/ۚܳۘ;->ܳ:I

    return v0
.end method

.method public final ۧ(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 56
    invoke-virtual {p0}, Ll/ۚܳۘ;->ۧ()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/ۚܳۘ;->ܽ()I

    move-result p1

    return p1
.end method

.method public final ۧ(I)V
    .locals 0

    .line 198
    iput p1, p0, Ll/ۚܳۘ;->ᩳ:I

    return-void
.end method

.method public final ۧ(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 52
    invoke-virtual {p0, p1}, Ll/ۚܳۘ;->ܿ(I)V

    return-void

    .line 54
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚܳۘ;->ܳ(I)V

    return-void
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 225
    iget-object v0, p0, Ll/ۚܳۘ;->ܿ:Ljava/util/List;

    return-object v0
.end method

.method public final ܳ(I)V
    .locals 0

    .line 193
    iput p1, p0, Ll/ۚܳۘ;->᩷:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 133
    iget v0, p0, Ll/ۚܳۘ;->᩻:I

    return v0
.end method

.method public final ܽ(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 47
    invoke-virtual {p0}, Ll/ۚܳۘ;->֫()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/ۚܳۘ;->᩻()I

    move-result p1

    return p1
.end method

.method public final ܽ(I)V
    .locals 0

    .line 188
    iput p1, p0, Ll/ۚܳۘ;->ܽ:I

    return-void
.end method

.method public final ܽ(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 163
    iput p1, p0, Ll/ۚܳۘ;->ܳ:I

    return-void

    .line 173
    :cond_0
    iput p1, p0, Ll/ۚܳۘ;->᩻:I

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 153
    iget v0, p0, Ll/ۚܳۘ;->᩷:I

    return v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 183
    iput p1, p0, Ll/ۚܳۘ;->ۜ:I

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 143
    iget v0, p0, Ll/ۚܳۘ;->ۜ:I

    return v0
.end method

.method public final ᩳ(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p0}, Ll/ۚܳۘ;->ۜ()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/ۚܳۘ;->᩷()I

    move-result p1

    return p1
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 163
    iput p1, p0, Ll/ۚܳۘ;->ܳ:I

    return-void
.end method

.method public final ᩳ(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 60
    invoke-virtual {p0, p1}, Ll/ۚܳۘ;->ܽ(I)V

    return-void

    .line 62
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚܳۘ;->ۧ(I)V

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 138
    iget v0, p0, Ll/ۚܳۘ;->ۧ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 158
    iget v0, p0, Ll/ۚܳۘ;->ᩳ:I

    return v0
.end method

.method public final ᩻(I)V
    .locals 0

    .line 178
    iput p1, p0, Ll/ۚܳۘ;->ۧ:I

    return-void
.end method
