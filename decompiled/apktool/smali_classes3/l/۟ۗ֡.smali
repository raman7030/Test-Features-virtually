.class public final Ll/۟ۗ֡;
.super Ljava/lang/Object;
.source "014Q"

# interfaces
.implements Ll/ۗۗ֡;


# instance fields
.field public final synthetic ֫:Ll/ۧ۬֡;

.field public final synthetic ۧ:Ljava/util/HashSet;

.field public final synthetic ܽ:[Z


# direct methods
.method public constructor <init>(Ll/ۧ۬֡;[ZLjava/util/HashSet;)V
    .locals 0

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۗ֡;->֫:Ll/ۧ۬֡;

    iput-object p2, p0, Ll/۟ۗ֡;->ܽ:[Z

    iput-object p3, p0, Ll/۟ۗ֡;->ۧ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 247
    iget-object v0, p0, Ll/۟ۗ֡;->ۧ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 248
    iget-object v0, p0, Ll/۟ۗ֡;->֫:Ll/ۧ۬֡;

    invoke-static {v0}, Ll/ۧ۬֡;->֫(Ll/ۧ۬֡;)I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 249
    iget-object v0, p0, Ll/۟ۗ֡;->ܽ:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p1

    :cond_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 573
    invoke-virtual {p0, p1}, Ll/۟ۗ֡;->ܽ(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 2

    .line 240
    iget-object v0, p0, Ll/۟ۗ֡;->֫:Ll/ۧ۬֡;

    invoke-static {v0}, Ll/ۧ۬֡;->֫(Ll/ۧ۬֡;)I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 241
    iget-object v0, p0, Ll/۟ۗ֡;->ܽ:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    :cond_0
    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 579
    invoke-virtual {p0, p1}, Ll/۟ۗ֡;->֫(I)V

    return-void
.end method
