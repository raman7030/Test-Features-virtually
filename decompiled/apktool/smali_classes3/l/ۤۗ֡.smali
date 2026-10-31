.class public final Ll/ۤۗ֡;
.super Ljava/lang/Object;
.source "99SU"

# interfaces
.implements Ll/ۗۗ֡;


# instance fields
.field public final synthetic ֫:Ll/᩺ۗ֡;

.field public final synthetic ۧ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ll/᩺ۗ֡;Ljava/util/HashSet;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۗ֡;->֫:Ll/᩺ۗ֡;

    iput-object p2, p0, Ll/ۤۗ֡;->ۧ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 83
    iget-object v0, p0, Ll/ۤۗ֡;->֫:Ll/᩺ۗ֡;

    iget-object v1, v0, Ll/᩺ۗ֡;->ۖ:Ljava/util/TreeSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v1, p0, Ll/ۤۗ֡;->ۧ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 85
    iget-object v0, v0, Ll/᩺ۗ֡;->ܺ:Ljava/util/TreeSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 573
    invoke-virtual {p0, p1}, Ll/ۤۗ֡;->ܽ(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 3

    .line 76
    iget-object v0, p0, Ll/ۤۗ֡;->ۧ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    iget-object v0, p0, Ll/ۤۗ֡;->֫:Ll/᩺ۗ֡;

    iget-object v1, v0, Ll/᩺ۗ֡;->ۖ:Ljava/util/TreeSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    iget-object v0, v0, Ll/᩺ۗ֡;->ۜ:Ljava/util/TreeSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 579
    invoke-virtual {p0, p1}, Ll/ۤۗ֡;->֫(I)V

    return-void
.end method
