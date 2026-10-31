.class public final Ll/᩵֨ۖ;
.super Ljava/util/AbstractList;
.source "S9OW"

# interfaces
.implements Ll/ۘ᩵ۖ;
.implements Ljava/util/RandomAccess;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ᩸:Ll/ۖ᩵ۖ;


# direct methods
.method public constructor <init>(Ll/ۖ᩵ۖ;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 32
    iput-object p1, p0, Ll/᩵֨ۖ;->᩸:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩵֨ۖ;)Ll/ۘ᩵ۖ;
    .locals 0

    .line 26
    iget-object p0, p0, Ll/᩵֨ۖ;->᩸:Ll/ۖ᩵ۖ;

    return-object p0
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/᩵֨ۖ;->᩸:Ll/ۖ᩵ۖ;

    .line 38
    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->get(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 144
    new-instance v0, Ll/ᩴ֨ۖ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 145
    invoke-static {p0}, Ll/᩵֨ۖ;->֫(Ll/᩵֨ۖ;)Ll/ۘ᩵ۖ;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractList;

    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, v0, Ll/ᩴ֨ۖ;->᩸:Ljava/util/Iterator;

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    .line 92
    new-instance v0, Ll/ۘ֨ۖ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 93
    invoke-static {p0}, Ll/᩵֨ۖ;->֫(Ll/᩵֨ۖ;)Ll/ۘ᩵ۖ;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractList;

    invoke-virtual {v1, p1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, v0, Ll/ۘ֨ۖ;->᩸:Ljava/util/ListIterator;

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩵֨ۖ;->᩸:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/ۖ᩵ۖ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۛۜۖ;)V
    .locals 0

    .line 57
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۟ۧ()Ll/ۘ᩵ۖ;
    .locals 0

    return-object p0
.end method

.method public final ܰ()Ljava/util/List;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/᩵֨ۖ;->᩸:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/ۖ᩵ۖ;->ܰ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵(I)Ljava/lang/Object;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩵֨ۖ;->᩸:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
