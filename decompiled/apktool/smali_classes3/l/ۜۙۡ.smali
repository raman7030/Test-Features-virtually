.class public final Ll/ۜۙۡ;
.super Ljava/lang/Object;
.source "F1U0"

# interfaces
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ֫:Ll/ᩳۙۡ;

.field public final ۧ:Ll/ۢۙۡ;


# direct methods
.method public constructor <init>(Ll/ᩳۙۡ;Ll/ܺܰۡ;Ll/ۢۙۡ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ۜۙۡ;->֫:Ll/ᩳۙۡ;

    .line 48
    iput-object p3, p0, Ll/ۜۙۡ;->ۧ:Ll/ۢۙۡ;

    return-void
.end method

.method private ֫(Ll/ۗۗۡ;Ll/۫ۗۡ;Z)V
    .locals 14

    move-object v0, p0

    .line 90
    invoke-virtual/range {p2 .. p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 76
    iget-object v2, v0, Ll/ۜۙۡ;->֫:Ll/ᩳۙۡ;

    sget-object v3, Ll/ۧۙۡ;->ۧ:Ll/ܽۙۡ;

    invoke-virtual {v2, v3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_0

    .line 78
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 79
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    :cond_0
    invoke-static/range {p2 .. p2}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object v2

    .line 113
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 115
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 89
    invoke-static/range {p2 .. p2}, Ll/ܺۙۡ;->ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;

    move-result-object v4

    .line 91
    instance-of v4, v4, Ll/᩷ۙۡ;

    if-eqz v4, :cond_4

    .line 122
    invoke-virtual/range {p2 .. p2}, Ll/ۙۗۡ;->ܽ()Ll/ܽۙۡ;

    move-result-object v4

    .line 123
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Warning: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x2f

    const/16 v8, 0x2e

    .line 85
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    .line 123
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ""

    const/16 v9, 0x20

    if-eqz p3, :cond_1

    .line 125
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, ": field \'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/ܽۙۡ;->֫()Ljava/lang/String;

    move-result-object v4

    .line 677
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 678
    invoke-static {v4}, Ll/᩺ۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 125
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 126
    :cond_1
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, ": method \'"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Ll/ܽۙۡ;->֫()Ljava/lang/String;

    move-result-object v4

    .line 703
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "<init>"

    .line 973
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/16 v13, 0x29

    if-eqz v6, :cond_2

    .line 85
    invoke-virtual {v11, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-virtual {v1, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    .line 118
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 975
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    invoke-virtual {v4, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 331
    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 951
    invoke-static {v7}, Ll/᩺ۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 975
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 704
    :goto_0
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 708
    invoke-static {v4}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v4, "\' can\'t be mapped to \'"

    const-string v6, "\' because it would conflict with "

    .line 0
    invoke-static {v5, v1, v4, v2, v6}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_3

    const-string v1, "field \'"

    goto :goto_2

    :cond_3
    const-string v1, "method \'"

    :goto_2
    const-string v4, "\', which is already being mapped to \'"

    invoke-static {v5, v1, v3, v4, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "\'"

    .line 131
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const/4 v1, 0x0

    .line 85
    invoke-static/range {p2 .. p2}, Ll/ܺۙۡ;->ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;

    move-result-object v2

    invoke-interface {v2, v1}, Ll/ᩴ۬ۡ;->֫(Ljava/lang/Object;)V

    .line 144
    iget-object v1, v0, Ll/ۜۙۡ;->ۧ:Ll/ۢۙۡ;

    move-object v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v3, p1, v1}, Ll/ۙۗۡ;->֫(Ll/᩶ۗۡ;Ll/ۖ۬ۡ;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V
    .locals 1

    .line 63
    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-static {v0}, Ll/᩺ۤۡ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, p2, v0}, Ll/ۜۙۡ;->֫(Ll/ۗۗۡ;Ll/۫ۗۡ;Z)V

    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V
    .locals 1

    const/4 v0, 0x1

    .line 56
    invoke-direct {p0, p1, p2, v0}, Ll/ۜۙۡ;->֫(Ll/ۗۗۡ;Ll/۫ۗۡ;Z)V

    return-void
.end method
