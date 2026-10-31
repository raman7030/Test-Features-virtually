.class public final Ll/ᩴ᩷ۚ;
.super Ljava/util/AbstractCollection;
.source "Y5EV"


# instance fields
.field public final synthetic ᩸:Ll/֡᩷ۚ;


# direct methods
.method public constructor <init>(Ll/֡᩷ۚ;)V
    .locals 0

    .line 186
    iput-object p1, p0, Ll/ᩴ᩷ۚ;->᩸:Ll/֡᩷ۚ;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 190
    iget-object v0, p0, Ll/ᩴ᩷ۚ;->᩸:Ll/֡᩷ۚ;

    iget-object v1, v0, Ll/֡᩷ۚ;->ۛ:Ljava/util/SortedSet;

    .line 191
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iget-object v0, v0, Ll/֡᩷ۚ;->۬:Ljava/util/SortedSet;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    .line 192
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v1

    .line 190
    invoke-static {v0, v1}, Ll/ۙ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 2

    .line 197
    iget-object v0, p0, Ll/ᩴ᩷ۚ;->᩸:Ll/֡᩷ۚ;

    iget-object v1, v0, Ll/֡᩷ۚ;->ۛ:Ljava/util/SortedSet;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    iget-object v0, v0, Ll/֡᩷ۚ;->۬:Ljava/util/SortedSet;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
