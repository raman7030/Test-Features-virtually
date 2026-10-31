.class public Ll/᩹ܳ֡;
.super Ljava/lang/Object;
.source "7ARK"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ܽۜ֡;

.field public ܽ:I

.field public final ܿ:Ll/᩺ܳ֡;

.field public final ᩳ:Ll/ۚۜ֡;


# direct methods
.method public constructor <init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    iput-object p2, p0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    .line 123
    iget p2, p1, Ll/᩹ܳ֡;->֫:I

    iput p2, p0, Ll/᩹ܳ֡;->֫:I

    .line 124
    iput-object p3, p0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 125
    iput-object p4, p0, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    .line 126
    iget p1, p1, Ll/᩹ܳ֡;->ܽ:I

    iput p1, p0, Ll/᩹ܳ֡;->ܽ:I

    return-void
.end method

.method public constructor <init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;)V
    .locals 1

    .line 82
    sget-object v0, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩹ܳ֡;-><init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;Ll/ۚۜ֡;)V

    return-void
.end method

.method public constructor <init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;Ll/ۚۜ֡;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    .line 91
    iput p2, p0, Ll/᩹ܳ֡;->֫:I

    .line 92
    iput-object p3, p0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 93
    iput-object p4, p0, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 157
    instance-of v0, p1, Ll/᩹ܳ֡;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 161
    :cond_0
    check-cast p1, Ll/᩹ܳ֡;

    invoke-virtual {p0, p1}, Ll/᩹ܳ֡;->֫(Ll/᩹ܳ֡;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 182
    iget-object v0, p0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v0, v0, Ll/᩺ܳ֡;->ܿ:I

    const/4 v1, 0x7

    invoke-static {v1, v0}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 183
    iget v1, p0, Ll/᩹ܳ֡;->֫:I

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 184
    iget-object v1, p0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    .line 185
    iget-object v1, p0, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x4

    .line 186
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget-object v1, p0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    iget v2, p0, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    iget-object v2, p0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    if-eqz v2, :cond_0

    const-string v2, ",["

    .line 208
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    iget-object v2, p0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    .line 210
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    :cond_0
    iget-object v2, p0, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    if-eqz v2, :cond_1

    sget-object v3, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-eq v2, v3, :cond_1

    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    :cond_1
    iget v1, p0, Ll/᩹ܳ֡;->ܽ:I

    const v2, -0x40000001    # -1.9999999f

    and-int/2addr v1, v2

    if-lez v1, :cond_2

    const-string v1, ",up="

    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    iget v1, p0, Ll/᩹ܳ֡;->ܽ:I

    and-int/2addr v1, v2

    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x29

    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 220
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/᩹ܳ֡;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    goto :goto_3

    .line 172
    :cond_1
    iget-object v2, p0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v2, v2, Ll/᩺ܳ֡;->ܿ:I

    iget-object v3, p1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v3, v3, Ll/᩺ܳ֡;->ܿ:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Ll/᩹ܳ֡;->֫:I

    iget v3, p1, Ll/᩹ܳ֡;->֫:I

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v3, p1, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 174
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    iget-object v3, p1, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    .line 175
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 139
    iget v2, p0, Ll/᩹ܳ֡;->ܽ:I

    const/high16 v3, 0x40000000    # 2.0f

    and-int/2addr v2, v3

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    iget p1, p1, Ll/᩹ܳ֡;->ܽ:I

    and-int/2addr p1, v3

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    if-ne v2, p1, :cond_4

    :goto_2
    return v0

    :cond_4
    :goto_3
    return v1
.end method
