.class public final Ll/ܽ᩺᩻;
.super Ljava/lang/Object;
.source "R78M"


# instance fields
.field public final ֫:Ll/ۘܺܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance v0, Ll/ۘܺܽ;

    invoke-direct {v0}, Ll/ۘܺܽ;-><init>()V

    iput-object v0, p0, Ll/ܽ᩺᩻;->֫:Ll/ۘܺܽ;

    return-void
.end method

.method private ֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;
    .locals 1

    .line 251
    iget-boolean p1, p1, Ll/᩻ۜۜ;->ܳ:Z

    if-eqz p1, :cond_0

    .line 252
    invoke-virtual {p2}, Ll/֫ܿۜ;->ᩳ()V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 255
    :goto_0
    new-instance p1, Ll/ۧ᩺᩻;

    .line 262
    iget-object v0, p0, Ll/ܽ᩺᩻;->֫:Ll/ۘܺܽ;

    invoke-virtual {v0}, Ll/ۘܺܽ;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 255
    invoke-direct {p1, v0, p2}, Ll/ۧ᩺᩻;-><init>(Ljava/lang/String;Ll/֫ܿۜ;)V

    return-object p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 262
    iget-object v0, p0, Ll/ܽ᩺᩻;->֫:Ll/ۘܺܽ;

    invoke-virtual {v0}, Ll/ۘܺܽ;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۜ;Ll/ۧܿۜ;)Ll/ۧ᩺᩻;
    .locals 4

    .line 184
    iget-object v0, p1, Ll/᩻ۜۜ;->᩷:Ll/ܽܿۜ;

    iget-object v1, v0, Ll/ܽܿۜ;->ܽ:Ljava/lang/String;

    const-string v2, "exact"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "dexClassName"

    iget-object v3, p0, Ll/ܽ᩺᩻;->֫:Ll/ۘܺܽ;

    if-eqz v1, :cond_6

    .line 185
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۢ()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "dexClassSimpleName"

    invoke-virtual {p2, v0, v1}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 187
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 189
    :cond_0
    invoke-virtual {v3}, Ll/ۘܺܽ;->᩷()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v1}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 192
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 194
    :cond_1
    invoke-virtual {v3}, Ll/ۘܺܽ;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 196
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 198
    :cond_2
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۜ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 200
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 202
    :cond_3
    invoke-virtual {v3}, Ll/ۘܺܽ;->᩻()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 204
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 206
    :cond_4
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۡ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object p2

    if-nez p2, :cond_5

    goto/16 :goto_0

    .line 207
    :cond_5
    invoke-direct {p0, p1, p2}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 270
    :cond_6
    iget-boolean v0, v0, Ll/ܽܿۜ;->ۧ:Z

    if-eqz v0, :cond_b

    .line 210
    invoke-virtual {v3}, Ll/ۘܺܽ;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 212
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 214
    :cond_7
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۜ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 216
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 218
    :cond_8
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۡ()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 220
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 222
    :cond_9
    invoke-virtual {v3}, Ll/ۘܺܽ;->᩻()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0, v2}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object p2

    if-nez p2, :cond_a

    goto :goto_0

    .line 223
    :cond_a
    invoke-direct {p0, p1, p2}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 225
    :cond_b
    invoke-virtual {v3}, Ll/ۘܺܽ;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    .line 226
    invoke-virtual {v3}, Ll/ۘܺܽ;->ܳ()I

    move-result v1

    invoke-virtual {v3}, Ll/ۘܺܽ;->ܿ()I

    move-result v2

    .line 225
    invoke-virtual {p2, v1, v2, v0}, Ll/ۧܿۜ;->֫(IILjava/lang/CharSequence;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 228
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 230
    :cond_c
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۜ()Ljava/lang/CharSequence;

    move-result-object v0

    .line 231
    invoke-virtual {v3}, Ll/ۘܺܽ;->ᩳ()I

    move-result v1

    invoke-virtual {v3}, Ll/ۘܺܽ;->ܽ()I

    move-result v2

    .line 230
    invoke-virtual {p2, v1, v2, v0}, Ll/ۧܿۜ;->֫(IILjava/lang/CharSequence;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 233
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 235
    :cond_d
    invoke-virtual {v3}, Ll/ۘܺܽ;->ۡ()Ljava/lang/CharSequence;

    move-result-object v0

    .line 236
    invoke-virtual {v3}, Ll/ۘܺܽ;->ᩳ()I

    move-result v1

    invoke-virtual {v3}, Ll/ۘܺܽ;->ܽ()I

    move-result v2

    .line 235
    invoke-virtual {p2, v1, v2, v0}, Ll/ۧܿۜ;->֫(IILjava/lang/CharSequence;)Ll/֫ܿۜ;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 238
    invoke-direct {p0, p1, v0}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1

    .line 240
    :cond_e
    invoke-virtual {v3}, Ll/ۘܺܽ;->᩻()Ljava/lang/CharSequence;

    move-result-object v0

    .line 241
    invoke-virtual {v3}, Ll/ۘܺܽ;->ᩳ()I

    move-result v1

    invoke-virtual {v3}, Ll/ۘܺܽ;->ܽ()I

    move-result v2

    .line 240
    invoke-virtual {p2, v1, v2, v0}, Ll/ۧܿۜ;->֫(IILjava/lang/CharSequence;)Ll/֫ܿۜ;

    move-result-object p2

    if-nez p2, :cond_f

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 242
    :cond_f
    invoke-direct {p0, p1, p2}, Ll/ܽ᩺᩻;->֫(Ll/᩻ۜۜ;Ll/֫ܿۜ;)Ll/ۧ᩺᩻;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 43
    iget-object v0, p0, Ll/ܽ᩺᩻;->֫:Ll/ۘܺܽ;

    if-eqz p1, :cond_0

    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x4c

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, p1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_0

    .line 45
    invoke-virtual {v0, p1}, Ll/ۘܺܽ;->ܿ(Ljava/lang/String;)Z

    return-void

    .line 47
    :cond_0
    invoke-virtual {v0, p1}, Ll/ۘܺܽ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܳۜۜ;)Z
    .locals 2

    .line 667
    iget-object v0, p1, Ll/ܳۜۜ;->֫:Ljava/lang/String;

    const-string v1, "none"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    iget-object p1, p1, Ll/ܳۜۜ;->ۧ:Ljava/lang/String;

    const-string v1, "descriptorExact"

    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Ll/ܽ᩺᩻;->֫:Ll/ۘܺܽ;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_3

    .line 166
    invoke-virtual {v1, p1}, Ll/ۘܺܽ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_4

    .line 168
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 171
    :cond_2
    invoke-virtual {v1, p1}, Ll/ۘܺܽ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 172
    invoke-virtual {v1, p1}, Ll/ۘܺܽ;->ܳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 173
    invoke-virtual {v1, p1}, Ll/ۘܺܽ;->ܽ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
