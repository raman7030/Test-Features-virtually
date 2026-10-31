.class public final Ll/ۛ᩹᩵;
.super Ljava/lang/Object;
.source "NALW"

# interfaces
.implements Ll/ۤ᩶᩵;
.implements Ll/۫᩹᩵;


# instance fields
.field public final ֫:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x17

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    .line 106
    const-class v2, Ll/֫᩹᩵;

    aput-object v2, v0, v1

    const-class v2, Ll/ܺ᩹᩵;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const-class v2, Ll/᩵᩹᩵;

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const-class v2, Ll/֡᩹᩵;

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const-class v2, Ll/ۚ᩹᩵;

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const-class v2, Ll/֨᩹᩵;

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const-class v2, Ll/۠᩹᩵;

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const-class v2, Ll/ܶ᩹᩵;

    const/4 v3, 0x7

    aput-object v2, v0, v3

    const-class v2, Ll/᩸᩹᩵;

    const/16 v3, 0x8

    aput-object v2, v0, v3

    const-class v2, Ll/᩹᩹᩵;

    const/16 v3, 0x9

    aput-object v2, v0, v3

    const-class v2, Ll/ۧ᩹᩵;

    const/16 v3, 0xa

    aput-object v2, v0, v3

    const-class v2, Ll/ܽ᩹᩵;

    const/16 v3, 0xb

    aput-object v2, v0, v3

    const-class v2, Ll/ᩳ᩹᩵;

    const/16 v3, 0xc

    aput-object v2, v0, v3

    const-class v2, Ll/ܿ᩹᩵;

    const/16 v3, 0xd

    aput-object v2, v0, v3

    const-class v2, Ll/ܳ᩹᩵;

    const/16 v3, 0xe

    aput-object v2, v0, v3

    const-class v2, Ll/᩻᩹᩵;

    const/16 v3, 0xf

    aput-object v2, v0, v3

    const-class v2, Ll/ۜ᩹᩵;

    const/16 v3, 0x10

    aput-object v2, v0, v3

    const-class v2, Ll/᩷᩹᩵;

    const/16 v3, 0x11

    aput-object v2, v0, v3

    const-class v2, Ll/ۢ᩹᩵;

    const/16 v3, 0x12

    aput-object v2, v0, v3

    const-class v2, Ll/ۡ᩹᩵;

    const/16 v3, 0x13

    aput-object v2, v0, v3

    const-class v2, Ll/ۖ᩹᩵;

    const/16 v3, 0x14

    aput-object v2, v0, v3

    const-class v2, Ll/ۘ᩹᩵;

    const/16 v3, 0x15

    aput-object v2, v0, v3

    const-class v2, Ll/ᩴ᩹᩵;

    const/16 v3, 0x16

    aput-object v2, v0, v3

    .line 101
    invoke-static {v0}, Ll/֫ܶ᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1596
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1630
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v1, 0x1

    if-ltz v1, :cond_0

    .line 1631
    check-cast v3, Ljava/lang/Class;

    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 44
    new-instance v5, Ll/ܺ۠᩵;

    invoke-direct {v5, v3, v1}, Ll/ܺ۠᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1631
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v4

    goto :goto_0

    .line 483
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Index overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_1
    invoke-static {v2}, Ll/֡ܶ᩵;->֫(Ljava/util/ArrayList;)Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "jClass"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩹᩵;->֫:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 91
    instance-of v0, p1, Ll/ۛ᩹᩵;

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll/ۧᩳܽ;->֫(Ll/ۤ᩶᩵;)Ljava/lang/Class;

    move-result-object v0

    check-cast p1, Ll/ۤ᩶᩵;

    invoke-static {p1}, Ll/ۧᩳܽ;->֫(Ll/ۤ᩶᩵;)Ljava/lang/Class;

    move-result-object p1

    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 94
    invoke-static {p0}, Ll/ۧᩳܽ;->֫(Ll/ۤ᩶᩵;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    iget-object v1, p0, Ll/ۛ᩹᩵;->֫:Ljava/lang/Class;

    .line 97
    invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Kotlin reflection is not available)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Class;
    .locals 1

    .line 10
    iget-object v0, p0, Ll/ۛ᩹᩵;->֫:Ljava/lang/Class;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Ll/ۛ᩹᩵;->֫:Ljava/lang/Class;

    .line 12
    invoke-static {v0}, Ll/ۤ᩹᩵;->֫(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
