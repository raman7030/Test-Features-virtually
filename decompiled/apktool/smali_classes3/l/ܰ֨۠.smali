.class public final enum Ll/ܰ֨۠;
.super Ljava/lang/Enum;
.source "G3L1"


# static fields
.field public static final enum ۗ:Ll/ܰ֨۠;

.field public static final enum ۙ:Ll/ܰ֨۠;

.field public static final enum ᩶:Ll/ܰ֨۠;

.field public static final synthetic ᩹:[Ll/ܰ֨۠;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 145
    new-instance v0, Ll/ܰ֨۠;

    const/4 v1, 0x0

    const-string v2, "source"

    const-string v3, "SOURCE"

    invoke-direct {v0, v3, v1, v2}, Ll/ܰ֨۠;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܰ֨۠;->ۗ:Ll/ܰ֨۠;

    .line 146
    new-instance v0, Ll/ܰ֨۠;

    const/4 v1, 0x1

    const-string v2, "class"

    const-string v3, "CLASS"

    invoke-direct {v0, v3, v1, v2}, Ll/ܰ֨۠;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܰ֨۠;->᩶:Ll/ܰ֨۠;

    .line 147
    new-instance v0, Ll/ܰ֨۠;

    const/4 v1, 0x2

    const-string v2, "redundant"

    const-string v3, "REDUNDANT"

    invoke-direct {v0, v3, v1, v2}, Ll/ܰ֨۠;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/ܰ֨۠;->ۙ:Ll/ܰ֨۠;

    .line 144
    invoke-static {}, Ll/ܰ֨۠;->֫()[Ll/ܰ֨۠;

    move-result-object v0

    sput-object v0, Ll/ܰ֨۠;->᩹:[Ll/ܰ֨۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 151
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 152
    iput-object p3, p0, Ll/ܰ֨۠;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܰ֨۠;
    .locals 1

    .line 144
    const-class v0, Ll/ܰ֨۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܰ֨۠;

    return-object p0
.end method

.method public static values()[Ll/ܰ֨۠;
    .locals 1

    .line 144
    sget-object v0, Ll/ܰ֨۠;->᩹:[Ll/ܰ֨۠;

    invoke-virtual {v0}, [Ll/ܰ֨۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܰ֨۠;

    return-object v0
.end method

.method public static ֫([Ljava/lang/String;)Ljava/util/EnumSet;
    .locals 7

    .line 162
    const-class v0, Ll/ܰ֨۠;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    .line 163
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v2, "all"

    .line 164
    invoke-interface {p0, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 165
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    .line 167
    :cond_0
    invoke-static {}, Ll/ܰ֨۠;->values()[Ll/ܰ֨۠;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    .line 168
    iget-object v5, v4, Ll/ܰ֨۠;->᩸:Ljava/lang/String;

    invoke-interface {p0, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 169
    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 170
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "-"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v4, Ll/ܰ֨۠;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 171
    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static synthetic ֫()[Ll/ܰ֨۠;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ܰ֨۠;

    .line 144
    sget-object v1, Ll/ܰ֨۠;->ۗ:Ll/ܰ֨۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܰ֨۠;->᩶:Ll/ܰ֨۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܰ֨۠;->ۙ:Ll/ܰ֨۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method
