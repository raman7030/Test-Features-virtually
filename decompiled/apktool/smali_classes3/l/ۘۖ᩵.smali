.class public final Ll/ۘۖ᩵;
.super Ljava/lang/Object;
.source "ZA06"

# interfaces
.implements Ll/۠ۡ᩵;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۛ:Ljava/lang/String;

.field public ۤ:I

.field public ۨ:I

.field public ۫:I

.field public ۬:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:[Ljava/lang/String;

.field public ᩺:I


# direct methods
.method public static ۧ(II[B)Ljava/lang/String;
    .locals 1

    .line 209
    rem-int/lit8 v0, p0, 0x2

    if-eqz v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    .line 212
    :cond_0
    invoke-static {p0, p1, p2}, Ll/ۤ֨᩵;->ۧ(II[B)I

    move-result p1

    invoke-static {p0, p1, p2}, Ll/ۤ֨᩵;->ܽ(II[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 218
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Referral[version="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۘۖ᩵;->᩺:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۘۖ᩵;->ۤ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",serverType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۘۖ᩵;->۫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",flags="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۘۖ᩵;->ۗ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",proximity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۘۖ᩵;->ۙ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",ttl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۘۖ᩵;->ۨ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",path="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۘۖ᩵;->۬:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",altPath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۘۖ᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",node="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۘۖ᩵;->᩶:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 218
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 5

    .line 142
    invoke-static {p1, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘۖ᩵;->᩺:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 144
    :cond_0
    new-instance p1, Ll/۬ۡ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Version "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Ll/ۘۖ᩵;->᩺:I

    const-string v0, " referral not supported. Please report this to jcifs at samba dot org."

    .line 0
    invoke-static {p3, v0, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 144
    throw p1

    :cond_1
    :goto_0
    add-int/lit8 v0, p1, 0x2

    .line 147
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘۖ᩵;->ۤ:I

    add-int/lit8 v0, p1, 0x4

    .line 149
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘۖ᩵;->۫:I

    add-int/lit8 v0, p1, 0x6

    .line 151
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘۖ᩵;->ۗ:I

    add-int/lit8 v0, p1, 0x8

    .line 153
    iget v3, p0, Ll/ۘۖ᩵;->᩺:I

    if-ne v3, v2, :cond_7

    .line 154
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘۖ᩵;->ۙ:I

    add-int/lit8 v0, p1, 0xa

    .line 156
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘۖ᩵;->ۨ:I

    add-int/lit8 v0, p1, 0xc

    .line 159
    iget v1, p0, Ll/ۘۖ᩵;->ۗ:I

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    .line 160
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    add-int/lit8 v1, p1, 0xe

    .line 162
    invoke-static {v1, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v1

    add-int/lit8 v2, p1, 0x10

    .line 164
    invoke-static {v2, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v2

    if-lez v0, :cond_2

    add-int/2addr v0, p1

    .line 168
    invoke-static {v0, p2, p3}, Ll/ۘۖ᩵;->ۧ(II[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۖ᩵;->۬:Ljava/lang/String;

    :cond_2
    if-lez v2, :cond_3

    add-int/2addr v2, p1

    .line 171
    invoke-static {v2, p2, p3}, Ll/ۘۖ᩵;->ۧ(II[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۖ᩵;->᩶:Ljava/lang/String;

    :cond_3
    if-lez v1, :cond_8

    add-int/2addr p1, v1

    .line 174
    invoke-static {p1, p2, p3}, Ll/ۘۖ᩵;->ۧ(II[B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۖ᩵;->᩸:Ljava/lang/String;

    goto :goto_2

    .line 177
    :cond_4
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    add-int/lit8 v1, p1, 0xe

    .line 179
    invoke-static {v1, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v1

    add-int/lit8 v2, p1, 0x10

    .line 181
    invoke-static {v2, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v2

    if-lez v0, :cond_5

    add-int/2addr v0, p1

    .line 185
    invoke-static {v0, p2, p3}, Ll/ۘۖ᩵;->ۧ(II[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۖ᩵;->ۛ:Ljava/lang/String;

    :cond_5
    if-lez v2, :cond_8

    .line 189
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_6

    add-int v4, p1, v2

    .line 191
    invoke-static {v4, p2, p3}, Ll/ۘۖ᩵;->ۧ(II[B)Ljava/lang/String;

    move-result-object v4

    .line 192
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x2

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 195
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ۘۖ᩵;->᩹:[Ljava/lang/String;

    goto :goto_2

    :cond_7
    if-ne v3, v1, :cond_8

    .line 200
    invoke-static {v0, p2, p3}, Ll/ۘۖ᩵;->ۧ(II[B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۖ᩵;->᩶:Ljava/lang/String;

    .line 203
    :cond_8
    :goto_2
    iget p1, p0, Ll/ۘۖ᩵;->ۤ:I

    return p1
.end method
