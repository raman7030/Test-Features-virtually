.class public final Ll/ۨܿۘ;
.super Ljava/lang/Object;
.source "E1KW"

# interfaces
.implements Ll/۬ܿۘ;


# instance fields
.field public ֫:Ll/ۛܳۘ;


# direct methods
.method public constructor <init>(Ll/ۛܳۘ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    return-void
.end method


# virtual methods
.method public final next()V
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    iget-object v0, v0, Ll/ۛܳۘ;->ܿ:Ll/ۛܳۘ;

    iput-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    iget v1, v0, Ll/ۛܳۘ;->ᩳ:I

    iget v0, v0, Ll/ۛܳۘ;->ۧ:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final ܽ()I
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    iget v1, v0, Ll/ۛܳۘ;->ܽ:I

    iget v0, v0, Ll/ۛܳۘ;->֫:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final ܿ()I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    iget v0, v0, Ll/ۛܳۘ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۨܿۘ;->֫:Ll/ۛܳۘ;

    iget v0, v0, Ll/ۛܳۘ;->ܽ:I

    return v0
.end method
