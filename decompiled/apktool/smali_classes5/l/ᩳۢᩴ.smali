.class public final Ll/ᩳۢᩴ;
.super Ll/ܽۢᩴ;
.source "25I"


# instance fields
.field public final synthetic ۬:Ll/ܿۢᩴ;


# direct methods
.method public constructor <init>(Ll/ܿۢᩴ;)V
    .locals 1

    .line 1243
    iput-object p1, p0, Ll/ᩳۢᩴ;->۬:Ll/ܿۢᩴ;

    iget-object v0, p1, Ll/ܿۢᩴ;->᩶:Ll/ܳۢᩴ;

    invoke-direct {p0, v0}, Ll/ܽۢᩴ;-><init>(Ll/ܳۢᩴ;)V

    .line 1244
    invoke-virtual {p1}, Ll/ܿۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 1270
    iget-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܽ()Ll/ۧۢᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 1271
    iget-object v1, p0, Ll/ᩳۢᩴ;->۬:Ll/ܿۢᩴ;

    iget-boolean v2, v1, Ll/ܿۢᩴ;->ۗ:Z

    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    iget v1, v1, Ll/ܿۢᩴ;->ۙ:I

    .line 216
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x0

    .line 1271
    iput-object v0, p0, Ll/ܽۢᩴ;->᩶:Ll/ۧۢᩴ;

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 1264
    iget-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    invoke-virtual {v0}, Ll/ۧۢᩴ;->ܿ()Ll/ۧۢᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 1265
    iget-object v1, p0, Ll/ᩳۢᩴ;->۬:Ll/ܿۢᩴ;

    iget-boolean v2, v1, Ll/ܿۢᩴ;->᩸:Z

    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget v0, v0, Ll/ۧۢᩴ;->᩹:I

    iget v1, v1, Ll/ܿۢᩴ;->᩹:I

    .line 216
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 1265
    iput-object v0, p0, Ll/ܽۢᩴ;->ۙ:Ll/ۧۢᩴ;

    :cond_0
    return-void
.end method
