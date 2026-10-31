.class public final Ll/᩷۬֫;
.super Ljava/lang/Object;
.source "N7T6"


# static fields
.field public static final ܳ:Ll/᩷۬֫;


# instance fields
.field public final ֫:Z

.field public final ۧ:Ll/ۛ۬ܺ;

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 41
    new-instance v0, Ll/ۜ۬֫;

    invoke-direct {v0}, Ll/ۜ۬֫;-><init>()V

    .line 219
    new-instance v1, Ll/᩷۬֫;

    invoke-direct {v1, v0}, Ll/᩷۬֫;-><init>(Ll/ۜ۬֫;)V

    .line 42
    sput-object v1, Ll/᩷۬֫;->ܳ:Ll/᩷۬֫;

    return-void
.end method

.method public constructor <init>(Ll/ۜ۬֫;)V
    .locals 1

    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 284
    invoke-static {p1}, Ll/ۜ۬֫;->ۧ(Ll/ۜ۬֫;)Ll/ۛ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    .line 287
    invoke-static {p1}, Ll/ۜ۬֫;->ᩳ(Ll/ۜ۬֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/᩷۬֫;->ᩳ:Z

    .line 289
    invoke-static {p1}, Ll/ۜ۬֫;->֫(Ll/ۜ۬֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/᩷۬֫;->֫:Z

    .line 290
    invoke-static {p1}, Ll/ۜ۬֫;->ܽ(Ll/ۜ۬֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/᩷۬֫;->ܽ:Z

    .line 291
    invoke-static {p1}, Ll/ۜ۬֫;->ܿ(Ll/ۜ۬֫;)Z

    move-result p1

    iput-boolean p1, p0, Ll/᩷۬֫;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 301
    instance-of v0, p1, Ll/᩷۬֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 304
    :cond_0
    check-cast p1, Ll/᩷۬֫;

    .line 305
    iget-object v0, p0, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    iget-object v2, p1, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    invoke-virtual {v0, v2}, Ll/ۛ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/᩷۬֫;->֫:Z

    iget-boolean v2, p1, Ll/᩷۬֫;->֫:Z

    if-ne v0, v2, :cond_1

    .line 308
    iget-boolean v0, p0, Ll/᩷۬֫;->ᩳ:Z

    iget-boolean v2, p1, Ll/᩷۬֫;->ᩳ:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Ll/᩷۬֫;->ܽ:Z

    iget-boolean v2, p1, Ll/᩷۬֫;->ܽ:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Ll/᩷۬֫;->ܿ:Z

    iget-boolean p1, p1, Ll/᩷۬֫;->ܿ:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 7

    .line 316
    iget-boolean v0, p0, Ll/᩷۬֫;->ᩳ:Z

    .line 320
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩷۬֫;->֫:Z

    .line 321
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Ll/᩷۬֫;->ܽ:Z

    .line 322
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Ll/᩷۬֫;->ܿ:Z

    .line 323
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    aput-object v6, v4, v5

    const/4 v5, 0x2

    aput-object v6, v4, v5

    const/4 v5, 0x3

    aput-object v0, v4, v5

    const/4 v0, 0x4

    aput-object v1, v4, v0

    const/4 v0, 0x5

    aput-object v2, v4, v0

    const/4 v0, 0x6

    aput-object v3, v4, v0

    .line 316
    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
