.class public abstract Ll/ۨ۬ۖ;
.super Ljava/lang/Object;
.source "U9KG"


# static fields
.field public static ۖ:Ljava/util/HashMap;

.field public static final ۜ:Ll/ۨ۬ۖ;

.field public static final ۡ:Ll/ۨ۬ۖ;

.field public static final ۢ:Ll/ۨ۬ۖ;

.field public static final ܳ:Ll/ۨ۬ۖ;

.field public static final ܺ:Ll/ۨ۬ۖ;

.field public static final ܿ:Ll/ۨ۬ۖ;

.field public static final ᩷:Ll/ۨ۬ۖ;

.field public static final ᩻:Ll/ۨ۬ۖ;


# instance fields
.field public final ֫:Ll/֡۬ۖ;

.field public final ۧ:Ll/᩺۬ۖ;

.field public final ܽ:Ljava/util/Set;

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۨ۬ۖ;->ۖ:Ljava/util/HashMap;

    .line 39
    new-instance v1, Ll/᩸۬ۖ;

    sget-object v2, Ll/᩺۬ۖ;->۬:Ll/᩺۬ۖ;

    sget-object v3, Ll/֡۬ۖ;->ۙ:Ll/֡۬ۖ;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v1, Ll/ۨ۬ۖ;->ܿ:Ll/ۨ۬ۖ;

    .line 50
    new-instance v4, Ll/᩹۬ۖ;

    const/4 v5, 0x2

    invoke-direct {v4, v2, v5, v3}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v4, Ll/ۨ۬ۖ;->᩻:Ll/ۨ۬ۖ;

    .line 61
    new-instance v5, Ll/᩶۬ۖ;

    sget-object v6, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    invoke-static {v3, v6}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v7

    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v2, v8, v3, v7}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;)V

    .line 72
    new-instance v7, Ll/ۙ۬ۖ;

    invoke-static {v3, v6}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v8

    const/4 v9, 0x4

    invoke-direct {v7, v2, v9, v8}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILjava/util/EnumSet;)V

    sput-object v7, Ll/ۨ۬ۖ;->ۢ:Ll/ۨ۬ۖ;

    .line 82
    new-instance v8, Ll/ۗ۬ۖ;

    const/4 v10, 0x5

    invoke-direct {v8, v2, v10, v3}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v8, Ll/ۨ۬ۖ;->ۜ:Ll/ۨ۬ۖ;

    .line 93
    new-instance v11, Ll/۬۬ۖ;

    const/4 v12, 0x6

    invoke-direct {v11, v2, v12, v3}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v11, Ll/ۨ۬ۖ;->᩷:Ll/ۨ۬ۖ;

    const/4 v13, 0x1

    .line 104
    new-instance v14, Ll/۫۬ۖ;

    const/4 v15, 0x2

    const/16 v12, 0xa

    invoke-direct {v14, v2, v12, v3}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v14, Ll/ۨ۬ۖ;->ܳ:Ll/ۨ۬ۖ;

    .line 115
    new-instance v3, Ll/ۤ۬ۖ;

    const/16 v12, 0x11

    invoke-direct {v3, v2, v12, v6}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v3, Ll/ۨ۬ۖ;->ܺ:Ll/ۨ۬ۖ;

    .line 126
    new-instance v12, Ll/ۛ۬ۖ;

    const/16 v16, 0x3

    const/16 v10, 0x10

    invoke-direct {v12, v2, v10, v6}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V

    sput-object v12, Ll/ۨ۬ۖ;->ۡ:Ll/ۨ۬ۖ;

    .line 138
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x5

    .line 142
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    .line 143
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xa

    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x11

    .line 145
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/᩺۬ۖ;ILjava/util/EnumSet;)V
    .locals 2

    .line 155
    sget-object v0, Ll/֡۬ۖ;->ۙ:Ll/֡۬ۖ;

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    :goto_0
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;)V
    .locals 1

    .line 159
    invoke-static {p3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;)V
    .locals 0

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-object p1, p0, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    .line 164
    iput p2, p0, Ll/ۨ۬ۖ;->ᩳ:I

    .line 165
    iput-object p4, p0, Ll/ۨ۬ۖ;->ܽ:Ljava/util/Set;

    .line 166
    iput-object p3, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;)V

    return-void
.end method

.method public static ֫(Ll/᩺۬ۖ;I)Ll/ۨ۬ۖ;
    .locals 7

    .line 206
    sget-object v0, Ll/ܶ۬ۖ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x2

    sget-object v3, Ll/ۨ۬ۖ;->ۖ:Ljava/util/HashMap;

    const/4 v4, 0x1

    if-eq v0, v4, :cond_1

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    const/4 v5, 0x4

    if-ne v0, v5, :cond_3

    .line 217
    :cond_0
    new-instance v0, Ll/۠۬ۖ;

    sget-object v1, Ll/֡۬ۖ;->ۙ:Ll/֡۬ۖ;

    sget-object v2, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Ll/ۨ۬ۖ;-><init>(Ll/᩺۬ۖ;ILjava/util/EnumSet;)V

    return-object v0

    .line 208
    :cond_1
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۨ۬ۖ;

    .line 209
    iget v6, v5, Ll/ۨ۬ۖ;->ᩳ:I

    if-ne v6, p1, :cond_2

    iget-object v6, v5, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    if-ne p0, v6, :cond_2

    return-object v5

    .line 231
    :cond_3
    new-instance v0, Ll/ۖ۬ۖ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p0, v1, v5

    aput-object p1, v1, v4

    aput-object v3, v1, v2

    const-string p0, "Unknown ASN.1 tag \'%s:%s\' found (%s)"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 231
    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 261
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 262
    :cond_1
    check-cast p1, Ll/ۨ۬ۖ;

    .line 235
    iget v2, p0, Ll/ۨ۬ۖ;->ᩳ:I

    iget v3, p1, Ll/ۨ۬ۖ;->ᩳ:I

    if-ne v2, v3, :cond_2

    .line 263
    iget-object v2, p0, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    iget-object v3, p1, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    iget-object p1, p1, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 235
    iget v0, p0, Ll/ۨ۬ۖ;->ᩳ:I

    .line 270
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const/4 v0, 0x2

    iget-object v2, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    aput-object v2, v1, v0

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ASN1Tag["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    iget-object v1, p0, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨ۬ۖ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    .line 279
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֡۬ۖ;
    .locals 1

    .line 247
    iget-object v0, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    return-object v0
.end method

.method public abstract ֫(Ll/ܰۛۡ;)Ll/ۘ۬ۖ;
.end method

.method public final ֫(Ll/֡۬ۖ;)Ll/ۨ۬ۖ;
    .locals 7

    .line 178
    iget-object v0, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 181
    :cond_0
    iget-object v0, p0, Ll/ۨ۬ۖ;->ܽ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    new-instance v0, Ll/֨۬ۖ;

    iget v4, p0, Ll/ۨ۬ۖ;->ᩳ:I

    iget-object v6, p0, Ll/ۨ۬ۖ;->ܽ:Ljava/util/Set;

    iget-object v3, p0, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    move-object v1, v0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Ll/֨۬ۖ;-><init>(Ll/ۨ۬ۖ;Ll/᩺۬ۖ;ILl/֡۬ۖ;Ljava/util/Set;)V

    return-object v0

    .line 182
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "The ASN.1 tag %s does not support encoding as %s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ֫(Ll/۠᩵ۚ;)Ll/ᩴ۬ۖ;
.end method

.method public final ۧ()Ll/᩺۬ۖ;
    .locals 1

    .line 239
    iget-object v0, p0, Ll/ۨ۬ۖ;->ۧ:Ll/᩺۬ۖ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 235
    iget v0, p0, Ll/ۨ۬ۖ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 251
    iget-object v0, p0, Ll/ۨ۬ۖ;->֫:Ll/֡۬ۖ;

    sget-object v1, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
