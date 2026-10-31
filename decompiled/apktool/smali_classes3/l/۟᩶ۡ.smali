.class public final Ll/۟᩶ۡ;
.super Ll/ۖ᩹ۢ;
.source "91US"

# interfaces
.implements Ll/ۡ۬ۡ;
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ۧ:Ll/ۛۡᩴ;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/᩹ۗۡ;)V
    .locals 2

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 17
    new-instance v0, Ll/ۛۡᩴ;

    invoke-direct {v0}, Ll/ۛۡᩴ;-><init>()V

    iput-object v0, p0, Ll/۟᩶ۡ;->ۧ:Ll/ۛۡᩴ;

    .line 18
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/۟᩶ۡ;->ܽ:Ljava/util/HashMap;

    .line 21
    new-instance v1, Ll/ܰ᩶ۡ;

    invoke-direct {v1, p0}, Ll/ܰ᩶ۡ;-><init>(Ll/۟᩶ۡ;)V

    invoke-virtual {p1, v1}, Ll/᩹ۗۡ;->֫(Ll/ۡ۬ۡ;)V

    .line 22
    invoke-virtual {p1}, Ll/᩹ۗۡ;->֫()Ll/ۨۡᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۛۡᩴ;->֫(Ll/֨ۢᩴ;)Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟᩶ۡ;)Ll/ۨۡᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩶ۡ;->ۧ:Ll/ۛۡᩴ;

    return-object p0
.end method

.method public static ܽ(Ll/ۗۗۡ;)Ljava/lang/String;
    .locals 1

    .line 117
    invoke-virtual {p0}, Ll/᩶ۗۡ;->֫()Ljava/lang/Object;

    move-result-object p0

    .line 118
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 119
    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 5

    .line 27
    invoke-static {p1}, Ll/۟᩶ۡ;->ܽ(Ll/ۗۗۡ;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 30
    invoke-virtual {p1}, Ll/ۗۗۡ;->᩷()Ll/ۗۗۡ;

    move-result-object v0

    const/4 v1, -0x1

    .line 31
    iget-object v2, p0, Ll/۟᩶ۡ;->ۧ:Ll/ۛۡᩴ;

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {p0, v0}, Ll/۟᩶ۡ;->֫(Ll/ۗۗۡ;)V

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/᩶ۗۡ;->֫()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "$"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x24

    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    if-eq v4, v1, :cond_0

    add-int/lit8 v4, v4, 0x1

    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "[0-9]+"

    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    .line 38
    invoke-virtual {v2, v3}, Ll/ۛۡᩴ;->contains(I)Z

    move-result v4

    if-nez v4, :cond_3

    .line 39
    invoke-virtual {v2, v3}, Ll/ۛۡᩴ;->add(I)Z

    .line 113
    invoke-virtual {p1, v1}, Ll/᩶ۗۡ;->֫(Ljava/lang/Object;)V

    return-void

    .line 45
    :cond_1
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x2f

    .line 80
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ne v3, v1, :cond_2

    const-string v0, ""

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    add-int/lit8 v3, v3, 0x1

    .line 81
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 87
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/۟᩶ۡ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ۙۡ;

    if-nez v3, :cond_4

    .line 91
    invoke-static {}, Ll/֨ۙۡ;->ᩳ()Ll/֨ۙۡ;

    move-result-object v3

    .line 93
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    :cond_4
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 104
    invoke-virtual {v3}, Ll/֨ۙۡ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    invoke-virtual {v2, v4}, Ll/ۛۡᩴ;->contains(I)Z

    move-result v4

    if-nez v4, :cond_4

    .line 107
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ۛۡᩴ;->add(I)Z

    .line 113
    invoke-virtual {p1, v1}, Ll/᩶ۗۡ;->֫(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method
