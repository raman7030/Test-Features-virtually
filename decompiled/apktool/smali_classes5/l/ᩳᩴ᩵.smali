.class public abstract Ll/ᩳᩴ᩵;
.super Ll/ۨۖ᩵;
.source "J9XX"

# interfaces
.implements Ljava/util/Enumeration;


# instance fields
.field public ֡֫:I

.field public ֨֫:I

.field public ֫ۧ:I

.field public ۗ֫:Ljava/lang/String;

.field public ۙ֫:I

.field public ۚ֫:I

.field public ۛ֫:I

.field public ۟֫:B

.field public ۠֫:I

.field public ۤ֫:I

.field public ۧۧ:I

.field public ۨ֫:I

.field public ۫֫:I

.field public ۬֫:I

.field public ܰ֫:I

.field public ܶ֫:Z

.field public ܽۧ:I

.field public ᩳۧ:[B

.field public ᩶֫:I

.field public ᩸֫:Z

.field public ᩹֫:I

.field public ᩺֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;BB)V
    .locals 1

    .line 137
    invoke-direct {p0, p1, p2}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;B)V

    const/4 p2, 0x0

    .line 45
    iput p2, p0, Ll/ᩳᩴ᩵;->۬֫:I

    .line 46
    iput p2, p0, Ll/ᩳᩴ᩵;->۫֫:I

    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Ll/ᩳᩴ᩵;->ܶ֫:Z

    .line 48
    iput-boolean v0, p0, Ll/ᩳᩴ᩵;->᩸֫:Z

    .line 127
    iput p2, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    .line 128
    iput v0, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    const-string p2, ""

    .line 130
    iput-object p2, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    .line 138
    iput-byte p3, p0, Ll/ᩳᩴ᩵;->۟֫:B

    .line 139
    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ܽ֫()I

    move-result p1

    add-int/lit16 p1, p1, -0x200

    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    const/16 p1, 0x400

    .line 140
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/16 p1, 0x3d

    .line 141
    iput p1, p0, Ll/ᩳᩴ᩵;->᩺֫:I

    return-void
.end method


# virtual methods
.method public final hasMoreElements()Z
    .locals 1

    .line 210
    iget-boolean v0, p0, Ll/ᩳᩴ᩵;->ܶ֫:Z

    return v0
.end method

.method public final bridge synthetic nextElement()Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->nextElement()V

    return-object p0
.end method

.method public final nextElement()V
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/ᩳᩴ᩵;->᩸֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 217
    iput-boolean v1, p0, Ll/ᩳᩴ᩵;->᩸֫:Z

    .line 222
    iget v0, p0, Ll/ᩳᩴ᩵;->᩺֫:I

    .line 225
    iget v2, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    const/4 v3, 0x2

    invoke-static {v2, v3, v0, v3}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v0

    .line 226
    iput v0, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    .line 228
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v0

    const/16 v2, 0x25

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 229
    iget v0, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    iget-object v2, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Ll/ۨۖ᩵;->֫(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v2, v0

    iput v2, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    .line 232
    :cond_0
    iget v0, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    .line 291
    rem-int/lit8 v2, v0, 0x4

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    rsub-int/lit8 v2, v2, 0x4

    .line 232
    :goto_0
    iput v2, p0, Ll/ᩳᩴ᩵;->۬֫:I

    add-int/2addr v0, v2

    .line 233
    iput v0, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    .line 235
    iget-object v0, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    invoke-virtual {p0, v0}, Ll/ᩳᩴ᩵;->ܽ([B)I

    move-result v0

    iput v0, p0, Ll/ᩳᩴ᩵;->ܽۧ:I

    .line 236
    iput v0, p0, Ll/ᩳᩴ᩵;->֡֫:I

    .line 238
    iget v2, p0, Ll/ᩳᩴ᩵;->᩹֫:I

    iget v3, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    sub-int/2addr v2, v3

    .line 239
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    sub-int/2addr v2, v0

    .line 242
    iget v3, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    add-int/2addr v3, v0

    iput v3, p0, Ll/ᩳᩴ᩵;->۠֫:I

    .line 291
    rem-int/lit8 v0, v3, 0x4

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    rsub-int/lit8 v0, v0, 0x4

    .line 243
    :goto_1
    iput v0, p0, Ll/ᩳᩴ᩵;->۫֫:I

    add-int/2addr v3, v0

    .line 244
    iput v3, p0, Ll/ᩳᩴ᩵;->۠֫:I

    .line 246
    iget-object v0, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    iget v3, p0, Ll/ᩳᩴ᩵;->֡֫:I

    invoke-virtual {p0, v3, v0}, Ll/ᩳᩴ᩵;->ۜ(I[B)I

    move-result v0

    iput v0, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    .line 248
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    goto :goto_4

    .line 250
    :cond_3
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v0

    const/16 v2, -0x60

    if-eq v0, v2, :cond_4

    const/16 v0, 0x26

    .line 251
    invoke-virtual {p0, v0}, Ll/ۨۖ᩵;->ܿ(I)V

    goto :goto_2

    :cond_4
    const/16 v0, -0x5f

    .line 253
    invoke-virtual {p0, v0}, Ll/ۨۖ᩵;->ܿ(I)V

    :goto_2
    const/16 v0, 0x33

    .line 257
    iput v0, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    .line 258
    iget v2, p0, Ll/ᩳᩴ᩵;->ܽۧ:I

    iget v3, p0, Ll/ᩳᩴ᩵;->ۛ֫:I

    sub-int v4, v2, v3

    if-lez v4, :cond_5

    const/4 v4, 0x1

    .line 259
    iput v4, p0, Ll/ᩳᩴ᩵;->۬֫:I

    add-int/2addr v0, v4

    .line 260
    iput v0, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    .line 264
    :cond_5
    iget v0, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    add-int/2addr v3, v0

    iput v3, p0, Ll/ᩳᩴ᩵;->ۛ֫:I

    .line 266
    iget v0, p0, Ll/ᩳᩴ᩵;->᩹֫:I

    iget v4, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    sub-int/2addr v0, v4

    iget v4, p0, Ll/ᩳᩴ᩵;->۬֫:I

    sub-int/2addr v0, v4

    sub-int/2addr v2, v3

    .line 267
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    sub-int/2addr v0, v2

    .line 270
    iget v3, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ᩳᩴ᩵;->۠֫:I

    .line 291
    rem-int/lit8 v2, v3, 0x4

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    rsub-int/lit8 v2, v2, 0x4

    .line 271
    :goto_3
    iput v2, p0, Ll/ᩳᩴ᩵;->۫֫:I

    add-int/2addr v3, v2

    .line 272
    iput v3, p0, Ll/ᩳᩴ᩵;->۠֫:I

    .line 274
    iget v3, p0, Ll/ᩳᩴ᩵;->֨֫:I

    iget v4, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    add-int/2addr v3, v4

    iput v3, p0, Ll/ᩳᩴ᩵;->֨֫:I

    sub-int/2addr v0, v2

    .line 277
    iget v2, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    sub-int/2addr v2, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    .line 279
    :goto_4
    iget v0, p0, Ll/ᩳᩴ᩵;->ۛ֫:I

    iget v2, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    add-int/2addr v0, v2

    iget v2, p0, Ll/ᩳᩴ᩵;->ܽۧ:I

    if-lt v0, v2, :cond_7

    iget v0, p0, Ll/ᩳᩴ᩵;->֨֫:I

    iget v2, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    add-int/2addr v0, v2

    iget v2, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    if-lt v0, v2, :cond_7

    .line 281
    iput-boolean v1, p0, Ll/ᩳᩴ᩵;->ܶ֫:Z

    :cond_7
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 198
    invoke-super {p0}, Ll/ۨۖ᩵;->reset()V

    const/4 v0, 0x1

    .line 199
    iput-boolean v0, p0, Ll/ᩳᩴ᩵;->ܶ֫:Z

    iput-boolean v0, p0, Ll/ᩳᩴ᩵;->᩸֫:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 412
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 413
    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",totalParameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ܽۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",totalDataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",maxParameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",maxDataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",maxSetupCount=0,flags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 415
    invoke-static {v2, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",timeout="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ۛ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->۠֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->֨֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",setupCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",pad="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->۬֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",pad1="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ᩳᩴ᩵;->۫֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۖ֫()V
    .locals 1

    const/16 v0, 0x400

    .line 158
    iput v0, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method

.method public abstract ۜ(I[B)I
.end method

.method public final ۡ֫()B
    .locals 1

    .line 184
    iget-byte v0, p0, Ll/ᩳᩴ᩵;->۟֫:B

    return v0
.end method

.method public final ۢ(I)V
    .locals 0

    .line 150
    iput p1, p0, Ll/ᩳᩴ᩵;->᩹֫:I

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(B)V
    .locals 0

    const/16 p1, -0x29

    .line 192
    iput-byte p1, p0, Ll/ᩳᩴ᩵;->۟֫:B

    return-void
.end method

.method public final ۧ([B)V
    .locals 0

    .line 166
    iput-object p1, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    return-void
.end method

.method public final ܺ֫()[B
    .locals 2

    .line 174
    iget-object v0, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    const/4 v1, 0x0

    .line 175
    iput-object v1, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    return-object v0
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract ܽ([B)I
.end method

.method public final ܿ(I[B)I
    .locals 6

    .line 359
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v0

    const/16 v1, 0x25

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 360
    iget-object v0, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    invoke-virtual {p0, v0, p1, p2}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;I[B)I

    move-result v0

    add-int/2addr v0, p1

    goto :goto_0

    :cond_0
    move v0, p1

    .line 363
    :goto_0
    iget v1, p0, Ll/ᩳᩴ᩵;->۬֫:I

    add-int/2addr v0, v1

    .line 365
    iget v1, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    if-lez v1, :cond_1

    .line 366
    iget-object v2, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    iget v3, p0, Ll/ۨۖ᩵;->۟:I

    iget v4, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    add-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v2, v4, p2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 367
    iget v1, p0, Ll/ۨۖ᩵;->۟:I

    iget v2, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/ᩳᩴ᩵;->۫֫:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 370
    :cond_1
    iget v1, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    if-lez v1, :cond_2

    .line 371
    iget-object v2, p0, Ll/ᩳᩴ᩵;->ᩳۧ:[B

    iget v3, p0, Ll/ᩳᩴ᩵;->֡֫:I

    iget v4, p0, Ll/ۨۖ᩵;->۟:I

    iget v5, p0, Ll/ᩳᩴ᩵;->۠֫:I

    add-int/2addr v4, v5

    invoke-static {v2, v3, p2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 372
    iget p2, p0, Ll/ᩳᩴ᩵;->֡֫:I

    iget v1, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    add-int/2addr p2, v1

    iput p2, p0, Ll/ᩳᩴ᩵;->֡֫:I

    .line 373
    iget p2, p0, Ll/ۨۖ᩵;->۟:I

    iget v2, p0, Ll/ᩳᩴ᩵;->۠֫:I

    add-int/2addr p2, v2

    add-int/2addr p2, v1

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_2
    sub-int/2addr v0, p1

    return v0
.end method

.method public abstract ᩷(I[B)I
.end method

.method public final ᩻(I[B)I
    .locals 6

    .line 311
    iget v0, p0, Ll/ᩳᩴ᩵;->ܽۧ:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 313
    iget v1, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x4

    .line 315
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x26

    if-eq v1, v3, :cond_0

    .line 316
    iget v1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    int-to-long v4, v1

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x6

    .line 318
    iget v1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    int-to-long v4, v1

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x8

    add-int/lit8 v1, p1, 0x9

    .line 320
    aput-byte v2, p2, v0

    add-int/lit8 v0, p1, 0xa

    .line 321
    aput-byte v2, p2, v1

    int-to-long v4, v2

    .line 322
    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0xc

    .line 324
    iget v1, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    int-to-long v4, v1

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x10

    add-int/lit8 v1, p1, 0x11

    .line 326
    aput-byte v2, p2, v0

    add-int/lit8 v0, p1, 0x12

    .line 327
    aput-byte v2, p2, v1

    .line 329
    :cond_0
    iget v1, p0, Ll/ᩳᩴ᩵;->ۤ֫:I

    int-to-long v4, v1

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x2

    .line 332
    iget v4, p0, Ll/ᩳᩴ᩵;->ۨ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x4

    .line 334
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v4

    if-ne v4, v3, :cond_1

    .line 335
    iget v4, p0, Ll/ᩳᩴ᩵;->ۛ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v0, 0x6

    .line 338
    :cond_1
    iget v0, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    int-to-long v4, v0

    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, v1, 0x2

    .line 340
    iget v4, p0, Ll/ᩳᩴ᩵;->ۚ֫:I

    if-nez v4, :cond_2

    const/4 v4, 0x0

    goto :goto_0

    :cond_2
    iget v4, p0, Ll/ᩳᩴ᩵;->۠֫:I

    :goto_0
    int-to-long v4, v4

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, v1, 0x4

    .line 342
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v4

    if-ne v4, v3, :cond_3

    .line 343
    iget v2, p0, Ll/ᩳᩴ᩵;->֨֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, v1, 0x6

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v1, 0x5

    .line 346
    iget v4, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    int-to-byte v4, v4

    aput-byte v4, p2, v0

    add-int/lit8 v1, v1, 0x6

    .line 347
    aput-byte v2, p2, v3

    .line 348
    invoke-virtual {p0, v1, p2}, Ll/ᩳᩴ᩵;->᩷(I[B)I

    move-result p2

    add-int/2addr v1, p2

    :goto_1
    sub-int/2addr v1, p1

    return v1
.end method
