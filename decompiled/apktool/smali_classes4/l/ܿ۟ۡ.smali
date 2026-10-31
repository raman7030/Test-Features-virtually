.class public final Ll/ܿ۟ۡ;
.super Ljava/lang/Object;
.source "OAR3"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ܿ۟ۡ;

.field public ܽ:I

.field public ᩳ:Ll/ܿ۟ۡ;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Ll/ܿ۟ۡ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 411
    iput v0, p0, Ll/ܿ۟ۡ;->ܽ:I

    .line 416
    iput p1, p0, Ll/ܿ۟ۡ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܿ۟ۡ;
    .locals 2

    .line 426
    iget-object v0, p0, Ll/ܿ۟ۡ;->ۧ:Ll/ܿ۟ۡ;

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܿ۟ۡ;->ܽ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 427
    new-instance v0, Ll/ܿ۟ۡ;

    iget v1, p0, Ll/ܿ۟ۡ;->֫:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ll/ܿ۟ۡ;-><init>(I)V

    iput-object v0, p0, Ll/ܿ۟ۡ;->ۧ:Ll/ܿ۟ۡ;

    .line 429
    :cond_0
    iget-object v0, p0, Ll/ܿ۟ۡ;->ۧ:Ll/ܿ۟ۡ;

    return-object v0
.end method

.method public final ۧ()Ll/ܿ۟ۡ;
    .locals 2

    .line 433
    iget-object v0, p0, Ll/ܿ۟ۡ;->ᩳ:Ll/ܿ۟ۡ;

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܿ۟ۡ;->ܽ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 434
    new-instance v0, Ll/ܿ۟ۡ;

    iget v1, p0, Ll/ܿ۟ۡ;->֫:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ll/ܿ۟ۡ;-><init>(I)V

    iput-object v0, p0, Ll/ܿ۟ۡ;->ᩳ:Ll/ܿ۟ۡ;

    .line 436
    :cond_0
    iget-object v0, p0, Ll/ܿ۟ۡ;->ᩳ:Ll/ܿ۟ۡ;

    return-object v0
.end method
