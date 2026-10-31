.class public final Ll/ۨܳۘ;
.super Ljava/lang/Object;
.source "N1MQ"


# instance fields
.field public ֫:Ll/ۛܳۘ;

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:Ll/ۛܳۘ;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    iput p1, p0, Ll/ۨܳۘ;->ۧ:I

    .line 270
    iput p1, p0, Ll/ۨܳۘ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۛܳۘ;
    .locals 1

    .line 279
    iget-object v0, p0, Ll/ۨܳۘ;->֫:Ll/ۛܳۘ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 269
    iget v0, p0, Ll/ۨܳۘ;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۨܳۘ;->ۧ:I

    .line 270
    iget v0, p0, Ll/ۨܳۘ;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۨܳۘ;->ܽ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 4

    .line 261
    new-instance v0, Ll/ۛܳۘ;

    iget v1, p0, Ll/ۨܳۘ;->ۧ:I

    iget v2, p0, Ll/ۨܳۘ;->ܽ:I

    invoke-direct {v0, v1, v2, p1, p2}, Ll/ۛܳۘ;-><init>(IIII)V

    .line 262
    iget-object v3, p0, Ll/ۨܳۘ;->ᩳ:Ll/ۛܳۘ;

    if-eqz v3, :cond_0

    iput-object v0, v3, Ll/ۛܳۘ;->ܿ:Ll/ۛܳۘ;

    goto :goto_0

    .line 263
    :cond_0
    iput-object v0, p0, Ll/ۨܳۘ;->֫:Ll/ۛܳۘ;

    .line 264
    :goto_0
    iput-object v0, p0, Ll/ۨܳۘ;->ᩳ:Ll/ۛܳۘ;

    add-int/2addr v1, p1

    .line 269
    iput v1, p0, Ll/ۨܳۘ;->ۧ:I

    add-int/2addr v2, p2

    .line 270
    iput v2, p0, Ll/ۨܳۘ;->ܽ:I

    return-void
.end method
