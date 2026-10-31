.class public final synthetic Ll/ۧᩳۢ;
.super Ljava/lang/Object;
.source "4BN4"

# interfaces
.implements Ll/۟֫ۢ;


# instance fields
.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧᩳۢ;->᩸:Ljava/lang/String;

    iput-object p2, p0, Ll/ۧᩳۢ;->᩹:Ljava/util/HashMap;

    iput-object p3, p0, Ll/ۧᩳۢ;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰ֫ۢ;)V
    .locals 6

    .line 112
    check-cast p1, Ll/۬ۧۢ;

    invoke-virtual {p1}, Ll/۬ۧۢ;->ۧ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۧᩳۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x24

    .line 113
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 114
    iget-object v3, p0, Ll/ۧᩳۢ;->᩹:Ljava/util/HashMap;

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    .line 115
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const/4 v5, 0x0

    .line 117
    invoke-virtual {p1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v2, v2, 0x1

    .line 118
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 119
    iget-object v2, p0, Ll/ۧᩳۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v2, v4, :cond_1

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
