.class public final Ll/۫ۤ֡;
.super Ll/ۧ۫֡;
.source "E4Y9"

# interfaces
.implements Ll/ۡܽۚ;


# static fields
.field public static final ۗ:Ll/֨ۗ֡;


# instance fields
.field public final ۙ:Ljava/util/AbstractCollection;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 49
    sget-object v0, Ll/֨ۗ֡;->᩶ܳ:Ll/֨ۗ֡;

    sput-object v0, Ll/۫ۤ֡;->ۗ:Ll/֨ۗ֡;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 4

    .line 56
    sget-object v0, Ll/۫ۤ֡;->ۗ:Ll/֨ۗ֡;

    invoke-direct {p0, v0}, Ll/ۧ۫֡;-><init>(Ll/֨ۗ֡;)V

    if-nez p1, :cond_0

    .line 58
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۤ֡;->ۙ:Ljava/util/AbstractCollection;

    return-void

    .line 87
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    iput-object v0, p0, Ll/۫ۤ֡;->ۙ:Ljava/util/AbstractCollection;

    .line 62
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۫֡;

    .line 63
    iget-object v1, p0, Ll/۫ۤ֡;->ۙ:Ljava/util/AbstractCollection;

    new-instance v2, Ll/ۨۤ֡;

    add-int/lit8 v3, p2, 0x1

    invoke-direct {v2, p0, p2, v0}, Ll/ۨۤ֡;-><init>(Ll/ۧ۫֡;ILl/ܿ۫֡;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move p2, v3

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    iget-object v0, v0, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/۫ۤ֡;->ۙ:Ljava/util/AbstractCollection;

    return-object v0
.end method

.method public final ۚ()I
    .locals 1

    .line 76
    iget-object v0, p0, Ll/۫ۤ֡;->ۙ:Ljava/util/AbstractCollection;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 81
    sget-object v0, Ll/۫ۤ֡;->ۗ:Ll/֨ۗ֡;

    iget-object v0, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    return-object v0
.end method
