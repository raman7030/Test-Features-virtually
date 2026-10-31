.class public abstract Ll/ܳۙۚ;
.super Ljava/lang/Object;
.source "X5Z7"


# direct methods
.method public static ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 211
    instance-of v0, p0, Ll/ۨ᩶ۚ;

    if-eqz v0, :cond_0

    .line 212
    check-cast p0, Ll/ۨ᩶ۚ;

    invoke-static {p0}, Ll/ܳۙۚ;->֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;

    move-result-object p0

    return-object p0

    .line 214
    :cond_0
    instance-of v0, p0, Ll/֡᩶ۚ;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 215
    check-cast p0, Ll/֡᩶ۚ;

    .line 216
    invoke-virtual {p0}, Ll/֡᩶ۚ;->ᩳ()I

    move-result v0

    const/4 v2, 0x4

    if-gt v0, v2, :cond_1

    const/4 v1, 0x1

    .line 218
    :cond_1
    new-instance v0, Ll/֡᩶ۚ;

    .line 219
    invoke-virtual {p0}, Ll/֡᩶ۚ;->ᩳ()I

    move-result v3

    .line 220
    invoke-virtual {p0}, Ll/֡᩶ۚ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܳۙۚ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v1, :cond_2

    .line 222
    invoke-virtual {p0}, Ll/֡᩶ۚ;->ۧ()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 223
    :cond_2
    invoke-virtual {p0}, Ll/֡᩶ۚ;->ۧ()Ljava/lang/String;

    move-result-object v2

    :goto_0
    move-object v5, v2

    .line 224
    invoke-virtual {p0}, Ll/֡᩶ۚ;->֫()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_3

    invoke-static {v2}, Ll/ܳۙۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    invoke-static {v2}, Ll/ܳۙۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    move-object v6, v1

    .line 225
    invoke-virtual {p0}, Ll/֡᩶ۚ;->ܿ()Z

    move-result v7

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 227
    :cond_4
    instance-of v0, p0, Ll/᩷᩶ۚ;

    if-eqz v0, :cond_6

    .line 228
    check-cast p0, Ll/᩷᩶ۚ;

    .line 229
    invoke-virtual {p0}, Ll/᩷᩶ۚ;->ܿ()Ljava/lang/String;

    move-result-object v0

    .line 230
    invoke-virtual {p0}, Ll/᩷᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 231
    invoke-virtual {p0}, Ll/᩷᩶ۚ;->֫()Ll/֡᩶ۚ;

    move-result-object v3

    .line 232
    invoke-virtual {p0}, Ll/᩷᩶ۚ;->ۧ()I

    move-result v4

    .line 233
    new-array v5, v4, [Ljava/lang/Object;

    .line 234
    new-array v6, v4, [Ljava/lang/Object;

    :goto_2
    if-ge v1, v4, :cond_5

    .line 236
    invoke-virtual {p0, v1}, Ll/᩷᩶ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v5, v1

    .line 237
    invoke-static {v7}, Ll/ܳۙۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 245
    :cond_5
    new-instance p0, Ll/᩷᩶ۚ;

    .line 247
    invoke-static {v2}, Ll/ܳۙۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 248
    invoke-static {v3}, Ll/ܳۙۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡᩶ۚ;

    invoke-direct {p0, v0, v1, v2, v6}, Ll/᩷᩶ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֡᩶ۚ;[Ljava/lang/Object;)V

    :cond_6
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 104
    invoke-static {p0}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۙۚ;->֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;
    .locals 3

    .line 118
    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->ܿ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 130
    :pswitch_0
    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۙۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨ᩶ۚ;->ᩳ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    return-object p0

    .line 127
    :pswitch_1
    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 128
    invoke-static {v0}, Ll/ۨ᩶ۚ;->ܿ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    goto :goto_1

    .line 120
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 121
    :goto_0
    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->ۧ()I

    move-result v2

    if-ge v1, v2, :cond_0

    const/16 v2, 0x5b

    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->ܽ()Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۙۚ;->֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    :cond_1
    :goto_1
    return-object p0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫([Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 161
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 162
    aget-object v2, p0, v1

    .line 163
    invoke-static {v2}, Ll/ܳۙۚ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    if-nez v0, :cond_0

    .line 166
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 168
    :cond_0
    aput-object v2, v0, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "()V"

    .line 183
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 187
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-static {p0}, Ll/ۨ᩶ۚ;->ۧ(Ljava/lang/String;)[Ll/ۨ᩶ۚ;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 189
    invoke-static {v4}, Ll/ܳۙۚ;->֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 191
    :cond_1
    invoke-static {p0}, Ll/ۨ᩶ۚ;->ܳ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    .line 192
    sget-object v1, Ll/ۨ᩶ۚ;->ۖ:Ll/ۨ᩶ۚ;

    if-ne p0, v1, :cond_2

    const-string p0, ")V"

    .line 193
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const/16 v1, 0x29

    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ܳۙۚ;->֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 148
    :cond_0
    invoke-static {p0}, Ll/ۨ᩶ۚ;->ܿ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۙۚ;->֫(Ll/ۨ᩶ۚ;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 267
    :cond_0
    new-instance v0, Ll/ۜۙۚ;

    invoke-direct {v0, p1}, Ll/ۜۙۚ;-><init>(Ljava/lang/String;)V

    .line 268
    new-instance p1, Ll/ۢۙۚ;

    invoke-direct {p1}, Ll/ۢۙۚ;-><init>()V

    .line 300
    new-instance v1, Ll/᩻ۙۚ;

    invoke-direct {v1, p1, p0}, Ll/᩻ۙۚ;-><init>(Ll/ۢۙۚ;Ll/ܳۙۚ;)V

    if-eqz p2, :cond_1

    .line 271
    invoke-virtual {v0, v1}, Ll/ۜۙۚ;->ۧ(Ll/᩷ۙۚ;)V

    goto :goto_0

    .line 273
    :cond_1
    invoke-virtual {v0, v1}, Ll/ۜۙۚ;->֫(Ll/᩷ۙۚ;)V

    .line 275
    :goto_0
    invoke-virtual {p1}, Ll/ۢۙۚ;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
