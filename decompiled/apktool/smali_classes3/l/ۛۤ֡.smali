.class public final Ll/ۛۤ֡;
.super Ll/ۧ۫֡;
.source "H52M"

# interfaces
.implements Ll/ܺܽۚ;


# static fields
.field public static final ۗ:Ll/֨ۗ֡;


# instance fields
.field public final ۙ:Ljava/util/AbstractCollection;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 50
    sget-object v0, Ll/֨ۗ֡;->۟᩻:Ll/֨ۗ֡;

    sput-object v0, Ll/ۛۤ֡;->ۗ:Ll/֨ۗ֡;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 56
    sget-object v0, Ll/ۛۤ֡;->ۗ:Ll/֨ۗ֡;

    invoke-direct {p0, v0}, Ll/ۧ۫֡;-><init>(Ll/֨ۗ֡;)V

    if-nez p1, :cond_0

    .line 58
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۤ֡;->ۙ:Ljava/util/AbstractCollection;

    return-void

    .line 60
    :cond_0
    new-instance v0, Ll/ۤۤ֡;

    invoke-direct {v0, p0}, Ll/ۤۤ֡;-><init>(Ll/ۛۤ֡;)V

    invoke-static {p1, v0}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۤ֡;->ۙ:Ljava/util/AbstractCollection;

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    .line 41
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    iget-object v0, v0, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۛۤ֡;->ۙ:Ljava/util/AbstractCollection;

    return-object v0
.end method

.method public final ۚ()I
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۛۤ֡;->ۙ:Ljava/util/AbstractCollection;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 84
    sget-object v0, Ll/ۛۤ֡;->ۗ:Ll/֨ۗ֡;

    iget-object v0, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    return-object v0
.end method
